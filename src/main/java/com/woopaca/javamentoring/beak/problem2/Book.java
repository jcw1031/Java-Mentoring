package com.woopaca.javamentoring.beak.problem2;

// Item의 자식 클래스
public class Book extends Item {
    private String genre;

    public Book(String title, String author, String publicationDate, String genre) {
        super(title, author, publicationDate);
        this.genre = genre;
    }

    @Override
    public void display() {
        super.display();
        System.out.print(", 장르: " + genre);
    }
}

