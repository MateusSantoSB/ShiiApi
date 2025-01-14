package com.ShiiSecret.service;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.ShiiSecret.models.Secrets;
import com.ShiiSecret.repository.SecretRepository;

@Service
public class SecretService {

	private final SecretRepository repository;
	
	
	public SecretService(SecretRepository repository) {
		this.repository=repository;
	}
	
	
	
	public void saveSecret(Secrets secrets) {
		secrets.setDatePost(LocalDate.now());
		
		LocalTime timeNew=LocalTime.now();
				
		LocalTime time=timeNew.truncatedTo(ChronoUnit.SECONDS);
		
		secrets.setTimePost(time);
		repository.save(secrets);
	}
	
	
	public Secrets searchRandomSecret() {
		return repository.findRandomSecret();
	}
	
	
	public Optional<Secrets> find(Long id) {
		
	return repository.findById(id);
		
		
	}
	
	
	
	
	
}
