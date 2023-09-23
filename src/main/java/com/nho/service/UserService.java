package com.nho.service;

import org.springframework.stereotype.Service;

import com.nho.model.UserEntity;

@Service
public class UserService implements Mapper<UserEntity, UserEntity> {

	@Override
	public UserEntity toDto(UserEntity e) {
		return e;
	}

	@Override
	public UserEntity toEntity(UserEntity d) {
		return d;
	}

}
