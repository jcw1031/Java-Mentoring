package com.woopaca.javamentoring.beak.problem2;

//Item의 자식 클래스
public class Magazine extends Item {
    private String cycle;

    public Magazine(String title, String author, String publicationDate, String cycle) {
        super(title, author, publicationDate);
        this.cycle = cycle;
    }


    @Override
    public void display() {
        super.display();
        System.out.print(", 발행 주기: " + cycle);
    }
}

