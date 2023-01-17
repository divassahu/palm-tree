package com.masai;

import java.util.ArrayList;
import java.util.List;

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

public class Bank {

	List<Account> accList=new ArrayList<>();
	
	public void addAccount(Account acc) {
		accList.add(acc);
		System.out.println("New Account added with name "+acc.getAccountHolderName());
	}
	
	public void removeAccount(Integer accNumber) {
		for(Account acc:accList) {
			if(acc.getAccountNumber().equals(accNumber)) {
				accList.remove(acc);
			}
			else {
				System.out.println("Account Not found with "+accNumber);
			}
		}
	}
}
