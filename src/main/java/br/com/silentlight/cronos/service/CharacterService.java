package br.com.silentlight.cronos.service;

import java.util.List;

import org.springframework.stereotype.Service;

import br.com.silentlight.cronos.entity.Character;

@Service
public interface CharacterService {
	
	public void save(Character character);
	public List<Character> findAll();
	public Character findOne(long id);

}
