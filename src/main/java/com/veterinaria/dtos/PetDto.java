package com.veterinaria.dtos;

import java.util.Set;
import java.util.stream.Collectors;

import com.veterinaria.enums.PetType;
import com.veterinaria.models.Pet;

import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.validation.constraints.NotBlank;

public record PetDto(String name, @NotBlank Float weight, @NotBlank @Enumerated(EnumType.STRING) PetType type) {
	
	public Pet mapToPet(PetDto dto) {
		Pet p = new Pet();
		p.setName(name);
		p.setWeight(weight);
		p.setType(type);
		return p;
	}
	
	public Set<Pet> mapToPet(Set<PetDto> pets){
		return pets.stream()
				.map(p->p.mapToPet(p))
				.collect(Collectors.toSet());
	}
}
