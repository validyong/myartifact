package com.simplecrud.myartifact.service;

import java.util.List;

import com.simplecrud.myartifact.mybean.Book;
import com.simplecrud.myartifact.repository.BookRepository;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class BookServiceTest {
    @Autowired
    private BookRepository bookRepository;

    @Test
    void getAllBooks() {
        Book bookSample = new Book();
        bookSample.setIsbn("123456");
        bookSample.setBookName("sample book");
        bookSample.setCompany("sample com.");
        bookSample.setPrice(555);
        bookSample.setGenreCode(5);

        BookService bookService = new BookService(bookRepository);

        List<Book> books = bookService.getAllBooks();

        for (int i =0; i< books.size(); i++) {
            System.out.println(books.get(i).getBookName());
        }
    }
}
