package br.com.silentlight.cronos.service;

import java.util.List;

import org.springframework.stereotype.Service;

import br.com.silentlight.cronos.entity.Chapter;

@Service
public interface ChapterService {
	
	public void save(Chapter chapter);
	public List<Chapter> findAll();
	public Chapter findOne(long numero);

}
