package com.simplecrud.myartifact.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import com.simplecrud.myartifact.mybean.Book;
import com.simplecrud.myartifact.repository.BookRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

@Service
public class BookService {
    @Autowired
    BookRepository bookRepository;

    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public List<Book> getAllBooks() {
        List<Book> books = bookRepository.findAll();

        return books;
    }

    public ResponseEntity <Book> getBookByIsbn(@PathVariable String isbn) {
        Book book = bookRepository.findById(isbn).orElseThrow();

        return ResponseEntity.ok(book);
    }

    public ResponseEntity <Book> updateBook(@PathVariable String isbn, @RequestBody Book bookDetails) {
        Book book = bookRepository.findById(isbn).orElseThrow();

        book.setBookName(bookDetails.getBookName());
        book.setCompany(bookDetails.getCompany());
        book.setPrice(bookDetails.getPrice());
        book.setGenreCode(bookDetails.getGenreCode());

        Book updatedBook = bookRepository.save(book);
        return ResponseEntity.ok(updatedBook);
    }

    public ResponseEntity < Map <String, Boolean>> deleteBook(@PathVariable String isbn) {
        Book book = bookRepository.findById(isbn).orElseThrow();

        bookRepository.delete(book);
        Map < String, Boolean> response = new HashMap<>();
        response.put("deleted", Boolean.TRUE);
        return ResponseEntity.ok(response);
    }
}
