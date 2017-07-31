package br.com.silentlight.cronos.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.google.common.collect.Lists;

import br.com.silentlight.cronos.entity.Event;
import br.com.silentlight.cronos.repository.EventRepository;
import br.com.silentlight.cronos.service.EventService;

@Component
public class EventServiceImpl implements EventService{

	@Autowired
	private EventRepository repository;
	
	@Override
	public void save(Event event) {
		repository.save(event);		
	}

	@Override
	public List<Event> findAll() {
		return Lists.newArrayList(repository.findAll());
	}

	@Override
	public Event findOne(long id) {
		return repository.findOne(id);
	}

}
