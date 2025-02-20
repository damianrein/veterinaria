package com.veterinaria.dtos;

import java.util.Set;
import java.util.stream.Collectors;

import com.veterinaria.models.Pet;

public record OwnerWithPet(String name, String lastname, String email, String phone, Integer dni,Set<PetDto> pets) {

	public Pet mapToPet(PetDto dto) {
		Pet p = new Pet();
		p.setName(dto.name());
		p.setWeight(dto.weight());
		p.setType(dto.type());
		return p;
	}
	
	public Set<Pet> mapToPet(Set<PetDto> pets){
		return pets.stream()
				.map(p->p.mapToPet(p))
				.collect(Collectors.toSet());
	}
}
