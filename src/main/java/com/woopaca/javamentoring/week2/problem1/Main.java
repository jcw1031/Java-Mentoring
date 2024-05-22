package com.woopaca.javamentoring.week2.problem1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("통장 잔고: ");
        int balance = scanner.nextInt();

        Account account = new Account(balance);
        Customer customer = new Customer("지찬우", account);
        customer.displayBalance();
        System.out.println();

        customer.printDeposit(500);
        System.out.println();
        customer.printWithdraw(200);
        System.out.println();
        customer.displayBalance();
        System.out.println();

        customer.printWithdraw(2_000);
    }
}
