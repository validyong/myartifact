package com.simplecrud.myartifact.controller;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

import com.simplecrud.myartifact.mybean.Book;
import com.simplecrud.myartifact.repository.BookRepository;
import com.simplecrud.myartifact.service.BookService;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class BookControllerTest {
    @Autowired
    BookRepository bookRepository;
    @Autowired
    BookController bookController;
    @Autowired
    BookService bookService;

    @Test
    public void testGetAllBooks() {

        List list = new ArrayList<>();
        List<Book> serviceBooks = bookService.getAllBooks();
        for (int i = 0; i< serviceBooks.size(); i++) {
            System.out.println(serviceBooks.get(i).getBookName());
        }
        assertEquals(bookController.getAllBooks(), list);
    }
}
