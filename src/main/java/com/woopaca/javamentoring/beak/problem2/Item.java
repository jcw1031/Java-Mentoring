package com.woopaca.javamentoring.beak.problem2;

//책, 잡지, 신문의 부모 클래스
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
        System.out.println("제목: " + title + ", 저자: " + author + ", 출판 날짜: " + publicationDate);
    }
}
