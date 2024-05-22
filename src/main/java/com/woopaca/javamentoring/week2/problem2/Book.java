package com.woopaca.javamentoring.week2.problem2;

public class Book extends Item {

    private String genre;

    public Book(String title, String author, String publicationDate, String genre) {
        super(title, author, publicationDate);
        this.genre = genre;
    }

    @Override
    public void display() {
        super.display();
        System.out.printf(", 장르: %s\n", genre);
    }
}
