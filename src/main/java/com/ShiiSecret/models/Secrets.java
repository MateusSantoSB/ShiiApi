package com.ShiiSecret.models;

import java.time.LocalDate;
import java.time.LocalTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="secrets")
public class Secrets {

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String secret;
	
	@Column(name="nickname")
	private String user;
	
	@Column(name="datepost")
	private LocalDate datePost;
	
	@Column(name="timepost")
	private LocalTime timePost;
	
	
	
	public Secrets() {
		
	}
	
	

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getSecret() {
		return secret;
	}

	public void setSecret(String secret) {
		this.secret = secret;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public LocalDate getDatePost() {
		return datePost;
	}

	public void setDatePost(LocalDate datePost) {
		this.datePost = datePost;
	}

	public LocalTime getTimePost() {
		return timePost;
	}

	public void setTimePost(LocalTime timePost) {
		this.timePost = timePost;
	}
	
	
	
	
	
	
	
}
