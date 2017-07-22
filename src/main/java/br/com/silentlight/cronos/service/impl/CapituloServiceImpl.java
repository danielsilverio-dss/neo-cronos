package br.com.silentlight.cronos.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.google.common.collect.Lists;

import br.com.silentlight.cronos.entity.Capitulo;
import br.com.silentlight.cronos.repository.CapituloRepository;
import br.com.silentlight.cronos.service.CapituloService;

@Component
public class CapituloServiceImpl implements CapituloService{

	@Autowired
	private CapituloRepository repository;
	
	@Override
	public void save(Capitulo capitulo) {
		repository.save(capitulo);
	}

	@Override
	public List<Capitulo> findAll() {
		return Lists.newArrayList(repository.findAll());
	}

	@Override
	public Capitulo findOne(long numero) {
		return repository.findOne(numero);
	}
	
	

}
