package com.nho.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nho.model.TodoDTO;
import com.nho.model.TodoEntity;
import com.nho.repository.TodoRepository;
import com.nho.service.Mapper;

@RestController
@CrossOrigin
@RequestMapping("/todoList")
public class TodoController extends AbstractCrudController<TodoEntity, TodoDTO> {

	public TodoController(TodoRepository repository, Mapper<TodoEntity, TodoDTO> mapper) {
		super(repository, mapper);
	}

}