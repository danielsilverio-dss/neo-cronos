package br.com.silentlight.cronos.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.silentlight.cronos.entity.Personagem;
import br.com.silentlight.cronos.service.PersonagemService;

@RestController
@RequestMapping("/api/personagem")
public class PersonagemController {
	
	@Autowired
	private PersonagemService service;
	
	@PostMapping
	public void save(Personagem personagem){
		service.save(personagem);
	}
	
	@GetMapping
	public List<Personagem> findAll(){
		return service.findAll();
	}
	
	@GetMapping("/{id}")
	public Personagem findOne(@PathVariable(name="id") int id){
		return service.findOne(id);
	}

}
