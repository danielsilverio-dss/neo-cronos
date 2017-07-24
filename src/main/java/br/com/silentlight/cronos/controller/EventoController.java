package br.com.silentlight.cronos.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.silentlight.cronos.entity.Evento;
import br.com.silentlight.cronos.service.EventoService;

@RestController
@RequestMapping("/evento")
public class EventoController {
	
	@Autowired
	private EventoService service;
	
	@PostMapping
	public void save(Evento evento){
		service.save(evento);
	}
	
	@GetMapping
	public List<Evento> findAll(){
		return service.findAll();
	}
	
	@GetMapping("/{id}")
	public Evento findOne(@PathVariable(name="id") long id){
		return service.findOne(id);
	}

}
