package br.com.silentlight.cronos.service;

import java.util.List;

import org.springframework.stereotype.Service;

import br.com.silentlight.cronos.entity.Evento;

@Service
public interface EventoService {
	
	public void save(Evento evento);
	public List<Evento> findAll();
	public Evento findOne(long id);

}
