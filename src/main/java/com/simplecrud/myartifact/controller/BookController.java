package com.simplecrud.myartifact.controller;

import java.util.List;
import java.util.Map;

import com.simplecrud.myartifact.mybean.Book;
import com.simplecrud.myartifact.service.BookService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
public class BookController {
    @Autowired
    BookService bookService;

    @GetMapping("/book")
    public List<Book> getAllBooks() {
        return bookService.getAllBooks();
    }

    @GetMapping("/book/{isbn}")
    public ResponseEntity <Book> getBookByIsbn(@PathVariable String isbn) {
        return bookService.getBookByIsbn(isbn);
    }

    @PutMapping("/book/{idbn}")
    public ResponseEntity <Book> updateBook(@PathVariable String isbn, @RequestBody Book bookDetails) {
        return bookService.updateBook(isbn, bookDetails);
    }

    @DeleteMapping("/book/{isbn}")
    public ResponseEntity < Map <String, Boolean>> deleteBook(@PathVariable String isbn) {
        return bookService.deleteBook(isbn);
    }

    
}
