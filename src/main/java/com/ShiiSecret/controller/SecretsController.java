package com.ShiiSecret.controller;

import java.net.URI;
import java.util.Optional;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.ShiiSecret.controller.dto.SecretMapper;
import com.ShiiSecret.controller.dto.SecretsDTO;
import com.ShiiSecret.models.Secrets;
import com.ShiiSecret.service.SecretService;



@RestController
@RequestMapping("/shii")
public class SecretsController {

	
	private final SecretService service; 
	
	private final SecretMapper mapper;
	
	
	public SecretsController(SecretService service,SecretMapper mapper) {
		this.service=service;
		this.mapper=mapper;
		
	}
	
	@PostMapping("/secret")
	public ResponseEntity<Void> saveSecret(@RequestBody SecretsDTO dto){
		Secrets secret=mapper.toEntity(dto);
		
		service.saveSecret(secret);
		
		URI loc=ServletUriComponentsBuilder
				.fromCurrentRequest()
				.path("/"+secret.getId())
				.build()
				.toUri();
		return ResponseEntity.created(loc).build();
	}

	
	
	
	
	
	@GetMapping("/secret")
	public ResponseEntity<SecretsDTO> randomSecret(){
		
		
		var secret=service.searchRandomSecret();
		SecretsDTO dto=mapper.toDTO(secret);
		
		return ResponseEntity.ok(dto);
	}
	
	
	@GetMapping("/secret/{id}")
	public ResponseEntity<SecretsDTO> searchId(@PathVariable Long id){
		Optional<Secrets> secrets=service.find(id);
			Secrets obj=secrets.get();
			SecretsDTO dto=mapper.toDTO(obj);
			return ResponseEntity.ok(dto);
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
