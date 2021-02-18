package com.simplecrud.myartifact.repository;

import com.simplecrud.myartifact.mysteriousbean.ToDo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ToDoRepository extends JpaRepository<ToDo, Long> {
    
}
