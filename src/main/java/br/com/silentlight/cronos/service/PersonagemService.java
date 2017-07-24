package br.com.silentlight.cronos.service;

import java.util.List;

import org.springframework.stereotype.Service;

import br.com.silentlight.cronos.entity.Personagem;

@Service
public interface PersonagemService {
	
	public void save(Personagem personagem);
	public List<Personagem> findAll();
	public Personagem findOne(long id);

}
