package br.com.silentlight.cronos.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.google.common.collect.Lists;

import br.com.silentlight.cronos.entity.Chapter;
import br.com.silentlight.cronos.repository.ChapterRepository;
import br.com.silentlight.cronos.service.ChapterService;

@Component
public class ChapterServiceImpl implements ChapterService{

	@Autowired
	private ChapterRepository repository;
	
	@Override
	public void save(Chapter chapter) {
		repository.save(chapter);
	}

	@Override
	public List<Chapter> findAll() {
		return Lists.newArrayList(repository.findAll());
	}

	@Override
	public Chapter findOne(long number) {
		return repository.findOne(number);
	}
	
	

}
