package com.bankaccount;
import java.util.Random;

public class BankAccount {

	//attributes
	private String accountNumber;
	private Double checkingBalance;
	private Double savingsBalance;
	public static int accountsCreated = 0;
	public static Double totalInAccount = 0.0;
	
	public BankAccount() {
		this.checkingBalance = 0.0;
		this.savingsBalance = 0.0;
		this.accountNumber = this.newAccountNumber();
		accountsCreated++;
		System.out.println("New account created: " + accountNumber);
	
	}

	/**
	 * @return the checkingBalance
	 */
	public Double getCheckingBalance() {
		return checkingBalance;
	}

	/**
	 * @param checkingBalance the checkingBalance to set
	 */
	public void setCheckingBalance(Double checkingBalance) {
		this.checkingBalance = checkingBalance;
	}

	/**
	 * @return the savingsBalance
	 */
	public Double getSavingsBalance() {
		return savingsBalance;
	}

	/**
	 * @param savingsBalance the savingsBalance to set
	 */
	public void setSavingsBalance(Double savingsBalance) {
		this.savingsBalance = savingsBalance;
	}


	//Methods
	private String newAccountNumber() {
		String numbers = "0123456789";
		String newAccountNumber = "";
		
		Random rand = new Random();
		for(int i =0; i < 5; i++) {
			int num = numbers.charAt(rand.nextInt(10));
			newAccountNumber += num;
		}
		accountNumber = newAccountNumber;
		return newAccountNumber;
		}
	
	public void depositChecking(double checkingBalance) {
		setCheckingBalance(checkingBalance);
		totalInAccount += checkingBalance;
		System.out.println("Checking account balance for " + accountNumber + ": $" + this.checkingBalance);
	}
	
	public void depositSavings(double savingsBalance) {
		setSavingsBalance(savingsBalance);
		totalInAccount += savingsBalance;
		System.out.println("Savings account balance for " + accountNumber + ": $" + this.savingsBalance);

	}
	
	public void withdrawalChecking (double withdrawalAmount) {
		if(getCheckingBalance() < withdrawalAmount) {
			System.out.println("Insufficient Funds for Checking!");
		}
		else {
			setCheckingBalance(getCheckingBalance() - withdrawalAmount);
			totalInAccount -= withdrawalAmount;
		}
	}
	
	public void withdrawalSavings(double withdrawalAmount) {
		if(getSavingsBalance() < withdrawalAmount) {
			System.out.println("Insufficient Funds for Savings!");
		}
		else {
			setSavingsBalance(getSavingsBalance() - withdrawalAmount);
			totalInAccount -= withdrawalAmount;
		}
	}
	
	public Double myBalance() {
		double totalBalance = checkingBalance + savingsBalance;
		System.out.println("Total for both accounts:" +" $"+ totalBalance);
		return totalBalance;
	}

}