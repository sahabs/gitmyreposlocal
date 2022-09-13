package com.saha.maven;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestBankAccount {

	@Test
	public void testDebitWithSufficientFunds() {
		BankAccount acct = new BankAccount(10);
		double amt = acct.debit(5);
		assertEquals(5.0, amt, 0.0001);
	}
	
	@Test
	public void testDebitWithInSufficientFunds() {
		BankAccount acct = new BankAccount(10);
		double amt = acct.debit(11);
		assertEquals(10.0, amt, 0.0001);
	}

}
