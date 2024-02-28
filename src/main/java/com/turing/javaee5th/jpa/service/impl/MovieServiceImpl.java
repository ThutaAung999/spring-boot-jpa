package com.turing.javaee5th.jpa.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.turing.javaee5th.jpa.dao.MovieRepository;
import com.turing.javaee5th.jpa.model.dto.MovieDto;
import com.turing.javaee5th.jpa.model.entity.Movie;
import com.turing.javaee5th.jpa.service.MovieService;

@Service
public class MovieServiceImpl implements MovieService {

	
	@Autowired
	MovieRepository movieRepository;
	
	ModelMapper modelMapper;
	
	@Override
	public List<MovieDto> getAllMovie() {
	
		 List<Movie> movies=this.movieRepository.findAll();
		 
		 List<MovieDto> moviesDto=new ArrayList<>();
		 
		 for(Movie movie:movies) {
			 MovieDto movieDto= modelMapper.map(movie, MovieDto.class);
			 moviesDto.add(movieDto);
		 }
		 
		 return moviesDto;
	}

}
