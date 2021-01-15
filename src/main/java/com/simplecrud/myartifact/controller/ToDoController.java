package com.simplecrud.myartifact.controller;

import java.util.List;

import com.simplecrud.myartifact.mysteriousbean.ToDo;
import com.simplecrud.myartifact.service.ToDoService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ToDoController {
    // DI
    @Autowired
    private ToDoService toDoService;

    @GetMapping("/todos")
    ResponseEntity<List<ToDo>> getAllToDos() {
        // ResponseEntity<>() <- causes an error
        // fixed findAll() return type
        return new ResponseEntity<>(toDoService.findAll(), HttpStatus.OK);

    }

}