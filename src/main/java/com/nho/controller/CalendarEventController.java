package com.nho.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nho.model.CalendarEventEntity;
import com.nho.repository.CalendarEventRepository;
import com.nho.service.Mapper;

@RestController
@CrossOrigin
@RequestMapping("/calendarEvent")
public class CalendarEventController
		extends AbstractCrudController<CalendarEventEntity, CalendarEventEntity> {

	public CalendarEventController(CalendarEventRepository repository,
			Mapper<CalendarEventEntity, CalendarEventEntity> mapper) {
		super(repository, mapper);
	}

}