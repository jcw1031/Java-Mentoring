package com.woopaca.javamentoring.choi.problem2;

public class problem2_Magazine extends problem2_Item {
    private String month;

    public problem2_Magazine(String title, String author, String publicationDate, String month) {
        super(title, author, publicationDate);
        this.month = month;
    }

    @Override
    public void display() {
        super.display();
        System.out.println(", 발행 주기: " + month);
    }

}