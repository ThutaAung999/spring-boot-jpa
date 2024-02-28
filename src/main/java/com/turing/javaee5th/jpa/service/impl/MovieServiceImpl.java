package com.turing.javaee5th.jpa.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.turing.javaee5th.jpa.dao.MovieRepository;
import com.turing.javaee5th.jpa.model.dto.MovieDto;
import com.turing.javaee5th.jpa.model.entity.Movie;
import com.turing.javaee5th.jpa.service.MovieService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class MovieServiceImpl implements MovieService {

	@Autowired
	MovieRepository movieRepository;

	ModelMapper modelMapper = new ModelMapper();

	@Override
	public List<MovieDto> getAllMovie() {

		List<Movie> movies = this.movieRepository.findAll();

		List<MovieDto> moviesDto = new ArrayList<>();

		for (Movie movie : movies) {
			MovieDto movieDto = modelMapper.map(movie, MovieDto.class);
			moviesDto.add(movieDto);
		}

		return moviesDto;
	}

	@Override
	public Optional<MovieDto> getMovieById(Long id) {

		Optional<Movie> result = this.movieRepository.findById(id);
		if (result.isPresent()) {
			Movie movie = result.get();
			log.info("Movieclass " + movie.getClass());
			MovieDto movieDto = this.modelMapper.map(movie, MovieDto.class);

			return Optional.of(movieDto);
		}

		else {
			return Optional.empty();
		}
	}

	@Override
	public MovieDto saveMovie(MovieDto movieDto) {
		
		Movie movie = modelMapper.map(movieDto, Movie.class);		
		
		movie = this.movieRepository.save(movie);
		
		movieDto = modelMapper.map(movie, MovieDto.class);
		return movieDto;
	}

	@Override
	public MovieDto updateMovie(MovieDto movieDto) {
	
		Movie movie = modelMapper.map(movieDto, Movie.class);
		
		movie = this.movieRepository.save(movie);
		
		movieDto = modelMapper.map(movie, MovieDto.class);
		return movieDto;
	}

	@Override
	public void deleteById(Long id) {
		this.movieRepository.deleteById(id);		
	}
}
