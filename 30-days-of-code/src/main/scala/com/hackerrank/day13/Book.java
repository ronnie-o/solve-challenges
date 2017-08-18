package com.hackerrank.day13;

/**
 * Created by ronnie on 2017. 8. 18.
 */
abstract class Book {
    String title;
    String author;

    Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    abstract void display();
}
