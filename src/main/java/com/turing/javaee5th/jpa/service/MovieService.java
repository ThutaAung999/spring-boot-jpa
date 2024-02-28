package com.turing.javaee5th.jpa.service;

import java.util.List;
import java.util.Optional;

import com.turing.javaee5th.jpa.model.dto.MovieDto;

public interface MovieService {
	List<MovieDto> getAllMovie();
	Optional<MovieDto> getMovieById(Long id);
	MovieDto saveMovie(MovieDto movieDto);
	MovieDto updateMovie(MovieDto movieDto);
	void deleteById(Long id);
}
