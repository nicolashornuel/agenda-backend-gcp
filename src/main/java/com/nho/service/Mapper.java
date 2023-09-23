package com.nho.service;

public interface Mapper<E, D> {

	D toDto(E e);

	E toEntity(D d);

}
