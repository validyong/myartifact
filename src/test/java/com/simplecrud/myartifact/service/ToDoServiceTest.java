package com.simplecrud.myartifact.service;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import com.simplecrud.myartifact.mysteriousbean.ToDo;
import com.simplecrud.myartifact.repository.ToDoRepository;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class ToDoServiceTest {
    @Autowired // not @MockBean
    private ToDoRepository toDoRepository;

    @Test
    void getAllToDos() {
        ToDo todoSample = new ToDo("Todo Sample 1",true);
        toDoRepository.save(todoSample);
        ToDoService toDoService = new ToDoService(toDoRepository);
    
        ToDo firstResult = toDoService.findAll().get(0);
    
        assertEquals(todoSample.getText(), firstResult.getText());
        assertEquals(todoSample.isCompleted(), firstResult.isCompleted());
        assertEquals(todoSample.getId(), firstResult.getId());
    
    }

}
