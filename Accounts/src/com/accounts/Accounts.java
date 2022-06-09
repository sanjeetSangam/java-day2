package com.accounts;

public class Accounts {

	private int balance = 0;

	public void credit(int amount) {

		if (amount >= 0) {
			this.balance += amount;
		} else {
			System.out.println("Please give valid input");
		}

	}

//	public void setBalance(int balance) {
//		this.balance = balance;
//	}

	public void debit(int amount) {
		if (amount >= 0) {
			this.balance -= amount;
		} else {
			System.out.println("Please give valid input");
		}
	}

	public int getBalance() {
		return this.balance;
	}

}
