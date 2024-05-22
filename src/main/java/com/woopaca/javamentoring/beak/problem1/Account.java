package com.woopaca.javamentoring.beak.problem1;

public class Account {
    private int balance; //계좌 잔액

    // 생성자: 계좌 번호와 초기 잔액을 설정함.
    // balance 매개변수
    public Account(int balance) {
        this.balance = balance;
    }

    // 입금 메소드
    // 조건 : 입금 금액이 0보다 커야됨.
    public void deposit(int amount) {
        if (amount > 0) {
            balance = balance + amount; // 500 + 1000 = 1500
        }
    }

    // 출금 메소드
    // 조건1 : 출금할 금액이 0원 이상,
    // 잔돈이 입금할 돈보다 크거나 같으면 출금이 가능
    // 조건2 : 출금할 금액이 충분하지 않다면 '거래실패' 메시지가 떠야됨.
    public void withdraw(int amount) {
        if (balance < amount) {
            System.out.println("거래 실패");
            return;
        }
        if (amount > 0) {
            balance = balance - amount;
        }
    }

    // 잔액 조회 메소드
    public int getBalance() {
        return balance;
    }
}
