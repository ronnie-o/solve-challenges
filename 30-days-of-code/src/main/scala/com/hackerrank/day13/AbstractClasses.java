package com.hackerrank.day13;

import java.util.Scanner;

/**
 * Created by ronnie on 2017. 8. 18.
 */
// Day 13: Abstract Classes
public class AbstractClasses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String title = scanner.nextLine();
        String author = scanner.nextLine();
        int price = scanner.nextInt();
        scanner.close();

        Book book = new MyBook(title, author, price);
        book.display();
    }
}
