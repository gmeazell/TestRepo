package com.gmeazell.model;

import junit.framework.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestBankAccount {

@Test
public void testDebitWithSufficientFunds() {
	BankAccount acct = new BankAccount(10);
	double amount = acct.debit(5);
	Assert.assertEquals(5.0,amount);
}

@Test
public void testDebitWithInSufficientFunds() {
	BankAccount acct = new BankAccount(10);
	double amount = acct.debit(11);
	Assert.assertEquals(10.0,amount);

}


}
