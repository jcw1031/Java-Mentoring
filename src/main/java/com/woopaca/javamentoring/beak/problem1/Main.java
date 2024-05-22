package com.woopaca.javamentoring.beak.problem1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 통장 잔고 입력
        System.out.print("통장 잔고 : ");
        int balance = sc.nextInt();

        // Account, Customer 객체 생성
        Account Account = new Account(balance);
        Customer customer = new Customer("이재완", Account);
        customer.displayBalance();
        System.out.println();

        // 입금과 출금
        customer.depositPrint(500);
        System.out.println();
        customer.withdrawPrint(200);
        System.out.println();
        customer.displayBalance();
        System.out.println();

        customer.withdrawPrint(20000); // 실패하는 예시
    }
}
