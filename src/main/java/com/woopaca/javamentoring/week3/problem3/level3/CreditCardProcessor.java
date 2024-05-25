package com.woopaca.javamentoring.week3.problem3.level3;

public class CreditCardProcessor extends PaymentProcessor {

    public CreditCardProcessor() {
        super("신용카드");
    }

    @Override
    public void pay(int paymentAmount) {
        System.out.printf("신용카드로 %,d원을 결제합니다.\n", paymentAmount);
        updatePaymentMetadata(paymentAmount);
    }
}
