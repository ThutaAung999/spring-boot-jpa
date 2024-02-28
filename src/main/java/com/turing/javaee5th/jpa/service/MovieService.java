package com.turing.javaee5th.jpa.service;

import java.util.List;

import com.turing.javaee5th.jpa.model.dto.MovieDto;

public interface MovieService {
	List<MovieDto> getAllMovie();
}
