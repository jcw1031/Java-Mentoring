package com.woopaca.javamentoring.week2.problem2;

public class Item {

    private String title;
    private String author;
    private String publicationDate;

    public Item(String title, String author, String publicationDate) {
        this.title = title;
        this.author = author;
        this.publicationDate = publicationDate;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getPublicationDate() {
        return publicationDate;
    }

    public void display() {
        System.out.printf("제목: %s, 저자: %s, 출판 날짜: %s", title, author, publicationDate);
    }
}
