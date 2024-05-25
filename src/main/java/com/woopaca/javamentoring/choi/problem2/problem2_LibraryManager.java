package com.woopaca.javamentoring.choi.problem2;

import java.util.ArrayList;
import java.util.Scanner;

public class problem2_LibraryManager {

    public problem2_LibraryManager() {
        run();
    }

    private Scanner sc = new Scanner(System.in);

    public void run() {
        ArrayList<problem2_Item> library = new ArrayList<>();
        aa:
        do {
            System.out.println("1. 책 추가 | 2. 잡지 추가 | 3. 신문 추가 | 4. 모든 항목 보기 | 5. 프로그램 종료");
            System.out.print("옵션을 선택하세요 : ");
            int menu = sc.nextInt();
            switch (menu) {
                case 1:
                    System.out.print("제목, 저자, 출판 날짜, 장르: ");
                    String title = sc.next();
                    String author = sc.next();
                    String publicationDate = sc.next();
                    String genre = sc.next();
                    library.add(new problem2_Book(title, author, publicationDate, genre));
                    System.out.println();
                    break;
                case 2:
                    System.out.print("제목, 저자, 출판 날짜, 발행 주기: ");
                    title = sc.next();
                    author = sc.next();
                    publicationDate = sc.next();
                    String month = sc.next();
                    library.add(new problem2_Magazine(title, author, publicationDate, month));
                    System.out.println();
                    break;
                case 3:
                    System.out.print("제목, 저자, 출판 날짜, 발행 주기: ");
                    title = sc.next();
                    author = sc.next();
                    publicationDate = sc.next();
                    String local = sc.next();
                    library.add(new problem2_Newspaper(title, author, publicationDate, local));
                    System.out.println();
                    break;
                case 4:
                    for (problem2_Item list : library) {
                        list.display();
                    }
                    System.out.println();
                    break;
                case 5:
                    System.out.println("프로그램을 종료합니다.");
                    break aa;
            }
        } while (true);
    }
}
