package com.turing.javaee5th.jpa.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.turing.javaee5th.jpa.model.entity.Movie;

public interface MovieRepository extends JpaRepository<Movie, Long> {

}
