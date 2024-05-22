package com.woopaca.javamentoring.choi.problem1;

public class problem1_Customer {
	private String name;
	private problem1_Account account;
	
	public problem1_Customer(String name, problem1_Account account) {
		this.name = name;
		this.account=account;
	}
	
	public void depositPrint(int amount) {
		System.out.printf("%s님이 %d원을 입금합니다.\n", name, amount);
		account.deposit(amount);
	}
	public void withdrawPrint(int amount) {
		System.out.printf("%s님이 %d원을 출금합니다.\n", name, amount);
		account.withdraw(amount);
	}
	public void displayBalance() {
		System.out.printf("%s님의 현재 잔액: %d원\n",name, account.getBalance());
	}

}