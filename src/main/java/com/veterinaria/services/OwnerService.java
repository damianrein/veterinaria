package com.veterinaria.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.veterinaria.dtos.OwnerWithPet;
import com.veterinaria.models.Owner;
import com.veterinaria.repositories.IOwnerRepository;

@Service
public class OwnerService {

	private final IOwnerRepository repo;

	public OwnerService(@Autowired IOwnerRepository repo) {
		this.repo = repo;
	}
	
	public void ownerWithPets(OwnerWithPet owner) {
		Owner o = new Owner();
		o.setName(owner.name());
		o.setLastname(owner.lastname());
		o.setPhone(owner.email());
		o.setDni(owner.dni());
		o.setPets(owner.mapToPet(owner.pets()));
		repo.save(o);
	}
	
	
}
