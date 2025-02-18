package com.veterinaria.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.veterinaria.models.Pet;
import com.veterinaria.repositories.IPetRepository;

@Service
public class PetService {

	private final IPetRepository repo;

	public PetService(@Autowired IPetRepository repo) {
		this.repo = repo;
	}
	
	public List<Pet> getAllPets(){
		return repo.findAll();
	}
}
