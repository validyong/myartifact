package com.simplecrud.myartifact.controller;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

import com.simplecrud.myartifact.mybean.Book;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class BookControllerTest {
    @Autowired
    BookController bookController;

    @Test
    public void testGetAllBooks() {

        List list = new ArrayList<>();
        List<Book> books = bookController.getAllBooks();
        for (int i = 0; i< books.size(); i++) {
            System.out.println(books.get(i).getBookName());
        }
        assertEquals(bookController.getAllBooks(), list);
    }
}
