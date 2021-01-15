package com.simplecrud.myartifact.service;

import java.util.List;

import com.simplecrud.myartifact.mysteriousbean.ToDo;
import com.simplecrud.myartifact.repository.ToDoRepository;

import org.springframework.stereotype.Service;

@Service
public class ToDoService {

	private ToDoRepository toDoRepository;

	public ToDoService(ToDoRepository toDoRepository) {
		this.toDoRepository = toDoRepository;
	}

	public List<ToDo> findAll() {
		return toDoRepository.findAll();
	}

	public ToDo save(ToDo toDo) {
		return toDoRepository.save(toDo);
	}
}
