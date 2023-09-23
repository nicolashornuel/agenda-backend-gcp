package com.nho.repository;

import org.springframework.stereotype.Repository;

import com.google.cloud.spring.data.firestore.FirestoreReactiveRepository;
import com.nho.model.TodoEntity;

@Repository
public interface TodoRepository extends FirestoreReactiveRepository<TodoEntity> {

}
