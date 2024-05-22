package com.woopaca.javamentoring.week2.problem1;

public class Customer {

    private String name;
    private Account account;

    public Customer(String name, Account account) {
        this.name = name;
        this.account = account;
    }

    /**
     * 계좌 입금 출력
     *
     * @param amount 입금 금액
     */
    public void printDeposit(int amount) {
        System.out.printf("%s님이 %d원을 입금합니다.\n", name, amount);
        account.deposit(amount);
    }

    /**
     * 계좌 출금 출력
     *
     * @param amount 출금 금액
     */
    public void printWithdraw(int amount) {
        System.out.printf("%s님이 %d원을 출금합니다.\n", name, amount);
        account.withdraw(amount);
    }

    /**
     * 계좌 잔액 조회<br>
     * 고객 이름과 현재 잔액을 출력
     */
    public void displayBalance() {
        System.out.printf("%s님의 현재 잔액: %,d원\n", name, account.getBalance());
    }
}
