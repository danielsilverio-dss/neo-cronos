package br.com.silentlight.cronos.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import br.com.silentlight.cronos.entity.Chapter;
import br.com.silentlight.cronos.service.ChapterService;

@RestController
@RequestMapping("/api/chapter")
public class ChapterController {
	
	@Autowired
	private ChapterService service;
	
	@GetMapping
	public ModelAndView findAll(){
		ModelAndView mv = new ModelAndView("views/chapters");
		mv.addObject("chapters", service.findAll());
		mv.addObject("chapter", new Chapter());
		return mv;
	}
	
	@GetMapping("/{number}")
	public Chapter findByNumero(@PathVariable(name="number") long number){
		return service.findOne(number);
	}
	
	@PostMapping
	public ModelAndView save(Chapter chapter){
		service.save(chapter);
		return findAll();
	}

}
