package br.com.silentlight.cronos.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.silentlight.cronos.entity.Chapter;
import br.com.silentlight.cronos.service.ChapterService;

@RestController
@RequestMapping("/api/chapter")
public class ChapterController {
	
	@Autowired
	private ChapterService service;
	
	@GetMapping(produces="application/json")
	//@RequestMapping(method = RequestMethod.GET, produces="application/json")
	@CrossOrigin(origins="*")
	public List<Chapter> findAll(){
		return service.findAll();
	}
	
	@GetMapping("/{number}")
	@CrossOrigin(origins="*")
	public Chapter findByNumero(@PathVariable(name="number") long number){
		return service.findOne(number);
	}
	
	@PostMapping
	@CrossOrigin(origins="*")
	public void save(Chapter chapter){
		service.save(chapter);
	}

}
