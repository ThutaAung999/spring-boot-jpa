package com.turing.javaee5th.jpa.model.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import lombok.Data;

@Data
@Entity

public class Movie extends  BaseEntity{
	
	private static final long serialVersionUID = 1L;
	
	@Column
	private String title;

	@Column
	private Integer year;

	@Column
	private String genre;

	
}
