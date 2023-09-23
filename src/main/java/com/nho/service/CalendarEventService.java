package com.nho.service;

import org.springframework.stereotype.Service;

import com.nho.model.CalendarEventEntity;

@Service
public class CalendarEventService implements Mapper<CalendarEventEntity, CalendarEventEntity> {

	@Override
	public CalendarEventEntity toDto(CalendarEventEntity e) {
		return e;
	}

	@Override
	public CalendarEventEntity toEntity(CalendarEventEntity d) {
		return d;
	}

}
