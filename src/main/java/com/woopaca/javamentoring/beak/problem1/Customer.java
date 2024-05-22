package com.woopaca.javamentoring.beak.problem1;

public class Customer {
    private String name; // 고객 이름
    private Account account; // 고객의 계좌 객체

    // 고객 생성자
    // name 과 account 매개변수
    public Customer(String name, Account account) {
        this.name = name;
        this.account = account;
    }

    // 계좌 입금 출력 메소드
    public void depositPrint(int amount) {
        System.out.println(name + "님이 " + amount + "원을 입금합니다.");
        account.deposit(amount);
        System.out.println("입금된 금액: " + amount + "원 , 새로운 잔액: " + account.getBalance() + "원");

        int[] arr = new int[10];
    }

    // 계좌 출금 출력 메소드
    public void withdrawPrint(int amount) {
        System.out.println(name + "님이 " + amount + "원을 출급합니다.");
        account.withdraw(amount);
        System.out.println("출금된 금액: " + amount + "원 , 남은잔액: " + account.getBalance() + "원");
    }


    // 계좌 잔액 조회 메소드
    // 고객 이름과 현재 잔액을 표시함.
    public void displayBalance() {
        System.out.println(name + "님의 현재 잔액: " + account.getBalance());
    }

}
