package com.woopaca.javamentoring.choi.problem2;

public class problem2_Book extends problem2_Item {
    private String genre;

    public problem2_Book(String title, String author, String publicationDate, String genre) {
        super(title, author, publicationDate);
        this.genre = genre;
    }

    @Override
    public void display() {
        super.display();
        System.out.println(", 장르: " + genre);
    }

}