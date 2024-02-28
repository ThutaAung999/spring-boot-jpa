package com.turing.javaee5th.jpa.model.entity;

import java.io.Serializable;
import java.sql.Date;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Movie implements Serializable{
	
	private static final long serialVersionUID = 1L;

	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	private Long id;

	@Column
	private String title;

	@Column
	private Integer year;

	@Column
	private String genre;

	@Column
	@CreationTimestamp
	Date  createdAt;
	
	@Column
	@UpdateTimestamp
	Date updatedAt;
}
