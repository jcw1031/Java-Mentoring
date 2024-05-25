package com.woopaca.javamentoring.week3.problem3.level2;

public class NaverPayProcessor2 extends PaymentProcessor {

    public NaverPayProcessor2() {
        super("네이버페이");
    }

    @Override
    public void pay(int paymentAmount) {
        System.out.printf("네이버페이로 %,d원을 결제합니다.\n", paymentAmount);
        updatePaymentMetadata(paymentAmount);
    }

}
