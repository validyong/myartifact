package com.simplecrud.myartifact.repository;

import com.simplecrud.myartifact.mybean.Book;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends JpaRepository<Book, String> {

}
