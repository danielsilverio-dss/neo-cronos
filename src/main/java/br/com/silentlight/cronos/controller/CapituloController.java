package br.com.silentlight.cronos.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
	public List<Capitulo> findAll(){
		return service.findAll();
	}
	
	@GetMapping("/{numero}")
	public Capitulo findByNumero(@PathVariable(name="numero") long numero){
		return service.findOne(numero);
	}
	
	@PostMapping
	public void save(Capitulo capitulo){
		service.save(capitulo);
	}

}
