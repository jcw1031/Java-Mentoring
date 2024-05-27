package com.woopaca.javamentoring.week3.problem3.level3;

import com.woopaca.javamentoring.week3.problem3.view.InputView;

/**
 * 결제 시스템
 */
public class PaymentSystem3 {

    public static void main(String[] args) {
        int paymentAmount = InputView.inputPaymentAmount(); // 결제 금액
        int paymentMethod = InputView.inputPaymentMethod(); // 결제 방식 (1-신용카드, 2-카카오페이, 3-네이버페이)

        Payment3 payment = determinePaymentMethod(paymentMethod);
        if (payment instanceof Discountable) {
            paymentAmount = ((Discountable) payment).discount(paymentAmount);
        }
        /* Java 14 이상을 사용한다면 아래와 같이 작성할 수 있습니다.

        Payment3 payment = determinePaymentMethod(paymentMethod);
        if (payment instanceof Discountable discountablePayment) {
            paymentAmount = discountablePayment.discount(paymentAmount);
        }

         */

        payment.pay(paymentAmount);
        payment.printReceipt();
    }

    private static Payment3 determinePaymentMethod(int paymentMethod) {
        switch (paymentMethod) {
            case 1: {
                return new CreditCard3();
            }
            case 2: {
                return new KakaoPay3();
            }
            case 3: {
                return new NaverPay3();
            }
        }
        return null;
    }

}
