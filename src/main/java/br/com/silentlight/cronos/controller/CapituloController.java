package br.com.silentlight.cronos.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.web.WebMvcProperties.View;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import br.com.silentlight.cronos.entity.Capitulo;
import br.com.silentlight.cronos.service.CapituloService;

@RestController
@RequestMapping("/capitulo")
public class CapituloController {
	
	@Autowired
	private CapituloService service;
	
	@GetMapping("/teste/{numero}")
	public String testeNumero(@PathVariable(name="numero") long numero){
		return "String="+numero;
	}
	
	@GetMapping
	public ModelAndView findAll(){
		ModelAndView mv = new ModelAndView("views/capitulos");
		mv.addObject("capitulos", service.findAll());
		mv.addObject("capitulo", new Capitulo());
		return mv;
		/*
		List<String> teste = new ArrayList<>();
		teste.add("aaa");
		teste.add("bbb");
		
		mv.addObject("capitulos", teste);
		
		return mv;
		*/
	}
	
	@GetMapping("/{numero}")
	public Capitulo findByNumero(@PathVariable(name="numero") long numero){
		return service.findOne(numero);
	}
	
	@PostMapping
	public ModelAndView save(Capitulo capitulo){
		service.save(capitulo);
		return findAll();
	}

}
