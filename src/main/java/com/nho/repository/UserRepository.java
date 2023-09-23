package com.nho.repository;

import org.springframework.stereotype.Repository;

import com.google.cloud.spring.data.firestore.FirestoreReactiveRepository;
import com.nho.model.UserEntity;

import reactor.core.publisher.Mono;

@Repository
public interface UserRepository extends FirestoreReactiveRepository<UserEntity> {

	Mono<UserEntity> findByUid(String uid);

}
