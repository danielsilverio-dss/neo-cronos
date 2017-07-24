package br.com.silentlight.cronos.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.google.common.collect.Lists;

import br.com.silentlight.cronos.entity.Personagem;
import br.com.silentlight.cronos.repository.PersonagemRepository;
import br.com.silentlight.cronos.service.PersonagemService;

@Component
public class PersonagemServiceImpl implements PersonagemService{

	@Autowired
	private PersonagemRepository repository;
	
	@Override
	public void save(Personagem personagem) {
		repository.save(personagem);
	}

	@Override
	public List<Personagem> findAll() {
		return Lists.newArrayList(repository.findAll());
	}

	@Override
	public Personagem findOne(long id) {
		return repository.findOne(id);
	}

}
