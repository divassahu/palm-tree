package com.masai;

/*
 
 * Assignment: Create a simple bank account management system


Create a class "Account" that has the following properties: account number, account holder name, balance

The class should have the following methods:

deposit(amount) - to add money to the account

withdraw(amount) - to withdraw money from the account

checkBalance() - to check the current balance of the account

Create another class "Bank" that has a list of accounts and the following methods:

addAccount(Account account) - to add a new account to the bank

removeAccount(accountNumber) - to remove an existing account from the bank

getAccount(accountNumber) - to get an account by account number

getTotalBalance() - to get the total balance of all accounts in the bank

You can add additional methods and properties to the classes as per your requirement.

You can also add more functionality to this system like adding the interest rate calculation, adding the account type (checking or saving), providing the transaction history of the account, etc.

 */

public class Account {
	
	private Integer accountNumber;
	
	private String accountHolderName;
	
	private double balance;

	public Account(Integer accountNumber, String accountHolderName, double balance) {
		super();
		this.accountNumber = accountNumber;
		this.accountHolderName = accountHolderName;
		this.balance = balance;
	}
	
	public void depositeAmount(double amount) {
		this.balance += amount;
	}
	
	public void withdwrawAmount(double amount) {
		if(this.balance < amount) {
			System.out.println("Insufficient balance");
		}
		else {
			this.balance -= amount;
			System.out.println("amount deducted");
		}
	}
	
	public double checkBalance() {
	
		return this.balance;
	}
	

	public Integer getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(Integer accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getAccountHolderName() {
		return accountHolderName;
	}

	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	

}
