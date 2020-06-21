package com.openwebinars.movieadvisor.service;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.openwebinars.movieadvisor.dao.FilmDao;
import com.openwebinars.movieadvisor.model.Film;

@Service
public class FilmService {
	
	@Autowired
	FilmDao dao;
	
	@Autowired
	FilmQueryService queryService;
	
	public Collection<String> findAllGenres(){
		List<String> result= null;
		
		result = dao.findAll()
				.stream()
				.map(f -> f.getGenres())
				.flatMap(lista -> lista.stream())
				.distinct()
				.sorted()
				.collect(Collectors.toList());
		
		return result;
	}
	
	public Collection<Film> findAll(){
		return dao.findAll();
	}
	
	public Collection<Film> findByAnyGenre(String... genre){
		return queryService.anyGenre(genre).exec();
	}
	
	public Collection<Film> findAllGenres(String... genre){
		return queryService.allGenres(genre).exec();
	}
	
	public Collection<Film> findByYear(String year){
		return queryService.year(year).exec();
	}
	
	public Collection<Film> findBetweenYears(String from, String to){
		return queryService.betweenYears(from, to).exec();
	}
	
	public Collection<Film> findByTitle(String title){
		return queryService.titleContains(title).exec();
	}
	
}
