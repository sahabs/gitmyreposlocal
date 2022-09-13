package com.saha.maven;

public class BankAccount {
	double balance;

	public BankAccount(double balance) {
		this.balance = balance;
	}
	
	public double debit(double amount) {
		if (balance < amount) {
			amount = balance;
		}
		
		balance -= amount;
		return amount;
	}

}
