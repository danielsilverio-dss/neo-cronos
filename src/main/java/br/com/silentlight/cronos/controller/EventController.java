package br.com.silentlight.cronos.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.silentlight.cronos.entity.Event;
import br.com.silentlight.cronos.service.EventService;

@RestController
@RequestMapping("/api/event")
public class EventController {
	
	@Autowired
	private EventService service;
	
	@PostMapping
	public void save(Event event){
		service.save(event);
	}
	
	@GetMapping
	public List<Event> findAll(){
		return service.findAll();
	}
	
	@GetMapping("/{id}")
	public Event findOne(@PathVariable(name="id") long id){
		return service.findOne(id);
	}

}
