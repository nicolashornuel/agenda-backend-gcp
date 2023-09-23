package com.nho.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nho.model.UserEntity;
import com.nho.repository.UserRepository;
import com.nho.service.Mapper;

import reactor.core.publisher.Mono;

@RestController
@CrossOrigin
@RequestMapping("/user")
public class UserController extends AbstractCrudController<UserEntity, UserEntity> {

	private final UserRepository repository;
	private final Mapper<UserEntity, UserEntity> mapper;

	public UserController(UserRepository repository, Mapper<UserEntity, UserEntity> mapper) {
		super(repository, mapper);
		this.repository = repository;
		this.mapper = mapper;
	}

	@GetMapping("/findOne/{uid}")
	public Mono<UserEntity> findOne(@PathVariable String uid) {
		return this.repository.findByUid(uid).map(mapper::toDto);
	}

}
