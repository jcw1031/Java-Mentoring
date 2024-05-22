package com.woopaca.javamentoring.week2.problem2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LibraryManager {

    private final Scanner scanner = new Scanner(System.in);
    private final List<Item> items = new ArrayList<>();

    public LibraryManager() {
        // 필드 초기화
        // 객체 초기화
        run();
    }

    public void run() {
        int input;

        do {
            System.out.println("1. 책 추가 | 2. 잡지 추가 | 3. 신문 추가 | 4. 모든 항목 | 5. 프로그램 종료");
            System.out.print("옵션을 선택하세요: ");
            input = scanner.nextInt();

            switch (input) {
                case 1: {
                    System.out.print("제목, 저자, 출판 날짜, 장르: ");
                    Book book = new Book(scanner.next(), scanner.next(), scanner.next(), scanner.next());
                    items.add(book);
                    break;
                }
                case 2: {
                    System.out.print("제목, 저자, 출판 날짜, 발행 주기: ");
                    Magazine magazine = new Magazine(scanner.next(), scanner.next(), scanner.next(), scanner.next());
                    items.add(magazine);
                    break;
                }
                case 3: {
                    System.out.print("제목, 저자, 출판 날짜, 지역: ");
                    Newspaper newspaper = new Newspaper(scanner.next(), scanner.next(), scanner.next(), scanner.next());
                    items.add(newspaper);
                    break;
                }
                case 4: {
                    for (Item item : items) {
                        item.display();
                    }
                }
            }
        } while (input != 5);

        System.out.println("프로그램을 종료합니다.");
        scanner.close();
    }
}
