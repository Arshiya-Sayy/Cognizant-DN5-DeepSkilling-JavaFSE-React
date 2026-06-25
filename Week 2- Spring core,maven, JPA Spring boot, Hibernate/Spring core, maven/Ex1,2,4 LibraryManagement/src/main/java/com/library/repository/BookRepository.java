package com.library.repository;

public class BookRepository {

    public void save(String bookName) {
        System.out.println("BookRepository: Saving book - " + bookName);
    }

    public String findById(int id) {
        System.out.println("BookRepository: Finding book with ID - " + id);
        return "Book_" + id;
    }
}