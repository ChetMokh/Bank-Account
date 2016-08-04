/**
 * Title: Bank.java
 * Abstract: Bank Application. (Homework 4)
 * Author: Arash Aria
 * ID: 4210
 * Date: 06/12/16
 */
import java.util.ArrayList;


public class Bank {

	private String name;
	private ArrayList<Account> accounts = new ArrayList<Account>();
	
	public Bank(String input)
	{
		this.name = input;
	}
	
	public boolean openAccount(String name, String  addr, int ssn, int accNum, int accType, double balance)
	{
		for (int i = 0; i < accounts.size(); i++)
		{
			if (accounts.get(i).getAccountholder().getSsn() == ssn
					|| accounts.size() > 5 || accounts.get(i).getAccNum() == accNum)
			{
				return false;
			}
		}
		accounts.add(new Account(accNum, accType, balance, new Customer(name, ssn, addr)));
		return true;
	}
	
	public boolean closeAccount(int accNum)
	{
		for (int i = 0; i < accounts.size(); i++)
		{
			if (accounts.get(i).getAccNum() == accNum)
			{
				accounts.remove(i);
				return true;
			}
		}
		return false;
	}
	
	public boolean updateAddress(String  addr, int accNum)
	{
		for (int i = 0; i < accounts.size(); i++)
		{
			if (accounts.get(i).getAccNum() == accNum)
			{
				accounts.get(i).getAccountholder().setAddress(addr);
				return true;
			}
		}
		return false;
	}
	
	public void bankInfo() 
	{
		System.out.println("Bank Name: " + getName());
		System.out.println("Number of Accounts: " + accounts.size());

		for (int i = 0; i < accounts.size(); i++)
		{
			System.out.println("\t" + accounts.get(i).getAccNum()+ ":  $" + accounts.get(i).getBalance()
					+ "  -  " + accounts.get(i).getAccountholder().getName() + ":  " + accounts.get(i).getAccountholder().getSsn());
		}
		
		System.out.println("Bank Total Balance: $" + getTotal());
		
	}

	public double getTotal() {
		double totalBal = 0.0;
		for (int i = 0; i < accounts.size(); i++)
		{
			totalBal += accounts.get(i).getBalance();
		}
		return totalBal;
	}

	public ArrayList<Account> getAccounts() {
		return accounts;
	}

	public void setAccounts(ArrayList<Account> accounts) {
		this.accounts = accounts;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean accountInfo(int accNum) {
		
		for (int i = 0; i < accounts.size(); i++)
		{
			if (accounts.get(i).getAccNum() == accNum)
			{
				System.out.println("Account Info:");
				System.out.println("\t\tAccount Number: " + accounts.get(i).getAccNum());
				if (accounts.get(i).getAccType() == 1)
				{	
					System.out.println("\t\tChecking Account");
				}
				System.out.println("\t\tBalance: $" + accounts.get(i).getBalance());
				System.out.println("Account Info:");
				System.out.println("\t\t" + accounts.get(i).getAccountholder().getName());
				System.out.println("\t\t" + accounts.get(i).getAccountholder().getAddress());
				System.out.println("\t\tSSN: " + accounts.get(i).getAccountholder().getSsn());
				return true;
			}
			
		}
		return false;
		
	}
}
