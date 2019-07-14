package com.bankaccount;

public class BankAccountTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAccount jen = new BankAccount();
		BankAccount ram = new BankAccount();
		BankAccount sadiq = new BankAccount();
		
		jen.depositChecking(70.00);
		jen.depositSavings(100.00);
		ram.depositSavings(100.00);
		sadiq.depositChecking(200.00);
		jen.withdrawalChecking(80.00);
		ram.withdrawalSavings(50.00);
		sadiq.withdrawalChecking(100.00);
		jen.myBalance();
		ram.myBalance();
		sadiq.myBalance();
	}

}
