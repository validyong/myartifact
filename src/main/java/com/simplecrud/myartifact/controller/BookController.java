package com.simplecrud.myartifact.controller;

import java.util.List;

import com.simplecrud.myartifact.mybean.Book;
import com.simplecrud.myartifact.repository.BookRepository;
import com.simplecrud.myartifact.service.BookService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookController {
    @Autowired
    BookService bookService;


    @GetMapping("/book")
    public List<Book> getAllBooks() {
        List<Book> books = bookService.getAllBooks();
        return books;
    } 

    
}
