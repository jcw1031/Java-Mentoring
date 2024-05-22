package com.woopaca.javamentoring.beak.problem2;

//Item의 자식 클래스
public class Newspaper extends Item {
    private String local;

    public Newspaper(String title, String author, String publicationDate, String local) {
        super(title, author, publicationDate);
        this.local = local;
    }


    @Override
    public void display() {
        super.display();
        System.out.print(", 지역: " + local);
    }
}