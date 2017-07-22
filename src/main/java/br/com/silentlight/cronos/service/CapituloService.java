package br.com.silentlight.cronos.service;

import java.util.List;

import org.springframework.stereotype.Service;

import br.com.silentlight.cronos.entity.Capitulo;

@Service
public interface CapituloService {
	
	public void save(Capitulo capitulo);
	public List<Capitulo> findAll();
	public Capitulo findOne(long numero);

}
