package com.simplecrud.myartifact.mybean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="isbn")
    private String isbn;
    @Column(name="book_name")
    private String bookName;
    @Column(name="company")
    private String company;
    @Column(name="price")
    private int price;
    @Column(name="genre_code")
    private int genreCode;

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getGenreCode() {
        return genreCode;
    }

    public void setGenreCode(int genreCode) {
        this.genreCode = genreCode;
    }
}
