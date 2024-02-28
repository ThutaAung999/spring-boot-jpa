package com.turing.javaee5th.jpa.model.entity;

import java.io.Serializable;
import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Movie implements Serializable{
	
	private static final long serialVersionUID = 1L;

	
	@Id
	private Long id;

	@Column
	private String title;

	@Column
	private Integer year;

	@Column
	private String genre;

	@Column
	Date  createdAt;
	
	@Column
	Date updatedAt;
}
