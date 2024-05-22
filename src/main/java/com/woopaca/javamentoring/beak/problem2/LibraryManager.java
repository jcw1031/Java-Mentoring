package com.woopaca.javamentoring.beak.problem2;

import java.util.Scanner;

//사용자의 전체적인 입, 출력을 제어하는 클래스
public class LibraryManager {

    public LibraryManager() {
        run();
    }

    private Item[] library = new Item[100];
    private int itemCount = 0;
    private Scanner sc = new Scanner(System.in);

    public void run() {
        // 도서관 관리 출력 구현
        Scanner stdin = new Scanner(System.in);
        while (true) {
            System.out.println("1. 책 추가  |  2. 잡지 추가  |  3. 신문 추가  |  4. 모든 항목 보기  |  5. 프로그램 종료");
            System.out.print("옵션을 선택하세요: ");
            int option = stdin.nextInt();
            switch (option) {
                case 1:
                    System.out.println("제목, 저자, 출판 날짜, 장르: ");
                    String title1 = sc.next();
                    String author1 = sc.next();
                    String date1 = sc.next();
                    String genre = sc.next();
                    Book Book = new Book(title1, author1, date1, genre);
                    library[itemCount] = Book;
                    itemCount++;
                    break;
                case 2:
                    System.out.println("제목, 저자, 출판 날짜, 발행 주기 입력: ");
                    String title2 = sc.next();
                    String author2 = sc.next();
                    String date2 = sc.next();
                    String cycle = sc.next();
                    Magazine magazine = new Magazine(title2, author2, date2, cycle);
                    library[itemCount] = magazine;
                    itemCount++;
                    break;
                case 3:
                    System.out.println("제목, 저자, 출판 날짜, 지역 입력: ");
                    String title3 = sc.next();
                    String author3 = sc.next();
                    String date3 = sc.next();
                    String local = sc.next();
                    Newspaper newspaper = new Newspaper(title3, author3, date3, local);
                    library[itemCount] = newspaper;
                    itemCount++;
                    break;
                case 4:
                    // TODO 모든 항목 정보 출력
                    System.out.println();
                    break;
                case 5:
                    System.out.println("프로그램을 종료합니다.");
            }
        }
    }

}
