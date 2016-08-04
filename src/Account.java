/**
 * Title: Account.java
 * Abstract: Bank Application. (Homework 4)
 * Author: Arash Aria
 * ID: 4210
 * Date: 06/12/16
 */
public class Account {
	
	private int accNum;
	private int accType; 
	private Customer accountHolder;
	private double balance;
	
	public Account(int accNum, int accType, double balance, Customer accHolder) {
		
		this.setAccNum(accNum);
		this.setAccType(accType);
		this.setBalance(balance);
		this.setAccountholder(accHolder);
	}
	
	public Customer getAccountholder() {
		return accountHolder;
	}
	
	public void setAccountholder(Customer accountholder) {
		this.accountHolder = accountholder;
	}
	
	public int getAccType() {
		return accType;
	}
	
	public void setAccType(int accType) {
		this.accType = accType;
	}
	
	public int getAccNum() {
		return accNum;
	}
	
	public void setAccNum(int accNum) {
		this.accNum = accNum;
	}
	
	public String toString() {
		return "Account [accNum=" + accNum + ", accType=" + accType
				+ ", accountholder=" + accountHolder + "]";
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

}
