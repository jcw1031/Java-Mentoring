package com.woopaca.javamentoring.week3.problem3.level2;

import com.woopaca.javamentoring.week3.problem3.view.InputView;

/**
 * 결제 시스템
 */
public class PaymentSystem2 {

    public static void main(String[] args) {
        int paymentAmount = InputView.inputPaymentAmount(); // 결제 금액
        int paymentMethod = InputView.inputPaymentMethod(); // 결제 방식 (1-신용카드, 2-카카오페이, 3-네이버페이)

        // TODO LEVEL1과 동일한 기능을 하도록 코드를 작성해 봅시다!
        //  추상 클래스를 도입했으니 코드 중복을 줄이고 조금은 더 유연한 구조로 작성할 수 있겠죠 ㅎㅎ
        Payment2 payment = determinePaymentMethod(paymentMethod);
        payment.pay(paymentAmount);
        payment.printReceipt();
    }

    private static Payment2 determinePaymentMethod(int paymentMethod) {
        switch (paymentMethod) {
            case 1: {
                return new CreditCard2();
            }
            case 2: {
                return new KakaoPay2();
            }
            case 3: {
                return new NaverPay2();
            }
        }
        return null;

        /* JAVA 12 이상을 사용한다면 아래와 같이 작성할 수 있습니다.

            return switch (paymentMethod) {
                case 1 -> new CreditCard2();
                case 2 -> new KakaoPay2();
                case 3 -> new NaverPay2();
                default -> null;
            };

         */
    }

}
