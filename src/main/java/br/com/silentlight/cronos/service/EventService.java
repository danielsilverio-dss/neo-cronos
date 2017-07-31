package br.com.silentlight.cronos.service;

import java.util.List;

import org.springframework.stereotype.Service;

import br.com.silentlight.cronos.entity.Event;

@Service
public interface EventService {
	
	public void save(Event event);
	public List<Event> findAll();
	public Event findOne(long id);

}
