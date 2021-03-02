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
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "http://192.168.0.58:4200")
@RestController
@RequestMapping("api")
public class BookController {
    @Autowired
    BookService bookService;

    @GetMapping("/books")
    public List<Book> getAllBooks() {
        System.out.println("getAllBooks()");
        return bookService.getAllBooks();
    }

    @GetMapping("/books/{isbn}")
    public ResponseEntity <Book> getBookByIsbn(@PathVariable String isbn) {
        return bookService.getBookByIsbn(isbn);
    }

    @PostMapping("/books")
    public ResponseEntity <Book> createBook(@RequestBody Book bookDetails) {
        System.out.println("post: ");
        return bookService.createBook(bookDetails);
    }

    @PutMapping("/books/{isbn}")
    public ResponseEntity <Book> updateBook(@PathVariable("isbn") String isbn, @RequestBody Book bookDetails) {
        System.out.println("update: " + isbn);
        System.out.println(bookDetails.getBookName());
        return bookService.updateBook(isbn, bookDetails);
    }

    @DeleteMapping("/books/{isbn}")
    public ResponseEntity < Map <String, Boolean>> deleteBook(@PathVariable("isbn") String isbn) {
        System.out.println("delete: " + isbn);
        return bookService.deleteBook(isbn);
    }

    
}
