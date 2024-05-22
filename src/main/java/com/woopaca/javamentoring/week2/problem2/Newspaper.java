package com.woopaca.javamentoring.week2.problem2;

public class Newspaper extends Item {

    private String region;

    public Newspaper(String title, String author, String publicationDate, String region) {
        super(title, author, publicationDate);
        this.region = region;
    }

    @Override
    public void display() {
        super.display();
        System.out.printf(", 지역: %s\n", region);
    }
}
