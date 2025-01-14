package com.ShiiSecret.controller.dto;

import org.mapstruct.Mapper;

import com.ShiiSecret.models.Secrets;

@Mapper(componentModel = "spring")
public interface SecretMapper {

	
	Secrets toEntity(SecretsDTO dto);
	
	SecretsDTO toDTO(Secrets secrets);
	
	
}
