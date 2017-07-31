package br.com.silentlight.cronos.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.google.common.collect.Lists;

import br.com.silentlight.cronos.entity.Character;
import br.com.silentlight.cronos.repository.CharacterRepository;
import br.com.silentlight.cronos.service.CharacterService;

@Component
public class CharacterServiceImpl implements CharacterService{

	@Autowired
	private CharacterRepository repository;
	
	@Override
	public void save(Character character) {
		repository.save(character);
	}

	@Override
	public List<Character> findAll() {
		return Lists.newArrayList(repository.findAll());
	}

	@Override
	public Character findOne(long id) {
		return repository.findOne(id);
	}

}
