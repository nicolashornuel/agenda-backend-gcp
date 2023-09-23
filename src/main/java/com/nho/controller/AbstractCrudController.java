package com.nho.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.google.cloud.spring.data.firestore.FirestoreReactiveRepository;
import com.nho.service.Mapper;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public abstract class AbstractCrudController<T, R> {

	private final FirestoreReactiveRepository<T> repository;

	private final Mapper<T, R> mapper;

	public AbstractCrudController(FirestoreReactiveRepository<T> repository, Mapper<T, R> mapper) {
		this.repository = repository;
		this.mapper = mapper;
	}

	@GetMapping("/getList")
	public Flux<R> getList() {
		return this.repository.findAll().map(mapper::toDto);
	}

	@PostMapping("/create")
	public Mono<R> create(@RequestBody T t) {
		return this.repository.save(t).map(mapper::toDto);
	}

	@DeleteMapping("/delete/{id}")
	public Mono<Boolean> deleteById(@PathVariable String id) {
		return this.repository.deleteById(id).thenReturn(true);
	}

	@PutMapping("/update")
	public Mono<T> update(@RequestBody T t) {
		return this.repository.save(t).thenReturn(t);
	}
}
