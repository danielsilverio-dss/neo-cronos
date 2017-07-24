package br.com.silentlight.cronos.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.google.common.collect.Lists;

import br.com.silentlight.cronos.entity.Evento;
import br.com.silentlight.cronos.repository.EventoRepository;
import br.com.silentlight.cronos.service.EventoService;

@Component
public class EventoServiceImpl implements EventoService{

	@Autowired
	private EventoRepository repository;
	
	@Override
	public void save(Evento evento) {
		repository.save(evento);		
	}

	@Override
	public List<Evento> findAll() {
		return Lists.newArrayList(repository.findAll());
	}

	@Override
	public Evento findOne(long id) {
		return repository.findOne(id);
	}

}
