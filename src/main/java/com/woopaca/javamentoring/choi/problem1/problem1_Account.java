package com.woopaca.javamentoring.choi.problem1;

public class problem1_Account {
    private int balance;
    private int bankno = 1;

    public problem1_Account(int balance) {
        this.balance = balance;
        bankno++;
    }

    public void deposit(int amount) {
        if (amount < 0) {
            System.out.println("입금 금액이 0보다 작을 순 없습니다.");
        } else {
            balance = balance + amount;
            System.out.printf("입금된 금액 : %d원, 새로운 잔액: %d원\n", amount, balance);
        }
    }

    public void withdraw(int amount) {
        if (amount < 0) {
            System.out.println("출금 금액이 0보다 작을 순 없습니다.");
        } else if (amount > balance) {
            System.out.println("거래 실패");
        } else {
            balance = balance - amount;
            System.out.printf("출금된 금액 : %d원, 남은 잔액: %d원\n", amount, balance);
        }
    }

    public int getBalance() {
        return balance;
    }

}