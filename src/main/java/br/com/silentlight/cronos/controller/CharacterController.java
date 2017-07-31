package br.com.silentlight.cronos.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.silentlight.cronos.entity.Character;
import br.com.silentlight.cronos.service.CharacterService;

@RestController
@RequestMapping("/api/character")
public class CharacterController {
	
	@Autowired
	private CharacterService service;
	
	@PostMapping
	public void save(Character character){
		service.save(character);
	}
	
	@GetMapping
	public List<Character> findAll(){
		return service.findAll();
	}
	
	@GetMapping("/{id}")
	public Character findOne(@PathVariable(name="id") int id){
		return service.findOne(id);
	}

}
