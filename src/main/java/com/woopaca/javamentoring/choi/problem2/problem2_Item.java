package com.woopaca.javamentoring.choi.problem2;

public class problem2_Item {
    private String title;
    private String author;
    private String publicationDate;

    public problem2_Item(String title, String author, String publicationDate) {
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
        System.out.print("제목: " + title + ", 저자: " + author + ", 출판 날짜: " + publicationDate);
    }
}