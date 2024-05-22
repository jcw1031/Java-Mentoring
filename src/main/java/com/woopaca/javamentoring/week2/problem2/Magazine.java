package com.woopaca.javamentoring.week2.problem2;

public class Magazine extends Item {

    private String publicationPeriod;

    public Magazine(String title, String author, String publicationDate, String publicationPeriod) {
        super(title, author, publicationDate);
        this.publicationPeriod = publicationPeriod;
    }

    @Override
    public void display() {
        super.display();
        System.out.printf(", 발행 주기: %s\n", publicationPeriod);
    }
}
