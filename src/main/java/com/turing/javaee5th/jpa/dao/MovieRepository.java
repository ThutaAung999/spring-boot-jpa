package com.turing.javaee5th.jpa.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.turing.javaee5th.jpa.model.entity.Movie;

public interface MovieRepository extends JpaRepository<Movie, Long> {

	List<Movie> findByYear(Integer year);
	List<Movie> findByTitle(String title);

}
