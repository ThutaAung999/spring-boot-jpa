package com.turing.javaee5th.jpa.controller.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.turing.javaee5th.jpa.dao.MovieRepository;
import com.turing.javaee5th.jpa.model.dto.MovieDto;
import com.turing.javaee5th.jpa.service.MovieService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RequestMapping("/api/movies")
@RestController
public class MovieApiController {

	@Autowired
	MovieService movieService;
	
	@Autowired
	MovieRepository movieRepository;
	
	
	
	@GetMapping
	List<MovieDto> getAllMovies()
	{
		return this.movieService.getAllMovie();
	}
}
