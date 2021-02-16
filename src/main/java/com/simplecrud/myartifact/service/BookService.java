package com.simplecrud.myartifact.service;

import java.util.List;
import java.util.Optional;

import com.simplecrud.myartifact.mybean.Book;
import com.simplecrud.myartifact.repository.BookRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookService {
    @Autowired
    BookRepository bookRepository;
    public List<Book> getAllBooks() {
        List<Book> books = bookRepository.findAll();

        return books;
    }

    public Book getBookById(String isbn) {
        Optional<Book> book = bookRepository.findById(isbn);

        return book.get();
    }
}
