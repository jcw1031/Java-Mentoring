package com.woopaca.javamentoring.choi.problem1;

import java.util.Scanner;

public class problem1_Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("동장 잔고 : ");
		int balance = sc.nextInt();
		
		problem1_Account Account = new problem1_Account(balance);
		problem1_Customer customer = new problem1_Customer("이재완", Account);
		customer.displayBalance();
		System.out.println();
		
		customer.depositPrint(500);
		System.out.println();
		customer.withdrawPrint(200);
		System.out.println();
		customer.displayBalance();
		System.out.println();
		
		customer.withdrawPrint(2000);
	}

}