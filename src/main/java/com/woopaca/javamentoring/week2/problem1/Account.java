package com.woopaca.javamentoring.week2.problem1;

public class Account {

    private int balance;

    public Account(int balance) {
        this.balance = balance;
    }

    /**
     * 입금
     *
     * @param amount 입금 금액 - 0 이상
     */
    public void deposit(int amount) {
        balance += amount;
        System.out.printf("입금된 금액: %d원, 새로운 잔액: %d원\n", amount, balance);
    }

    /**
     * 출금
     *
     * @param amount 출금 금액 - 0 이상(잔액이 부족하다면 '출금 실패' 메시지)
     */
    public void withdraw(int amount) {
        if (balance < amount) {
            System.out.println("거래 실패");
            return;
        }

        balance -= amount;
        System.out.printf("입금된 금액: %d원, 남은 잔액: %d원\n", amount, balance);
    }

    /**
     * 잔액 조회
     *
     * @return 잔액
     */
    public int getBalance() {
        return balance;
    }
}
