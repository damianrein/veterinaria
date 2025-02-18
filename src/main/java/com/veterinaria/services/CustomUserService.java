package com.veterinaria.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.veterinaria.models.CustomUser;
import com.veterinaria.repositories.ICustomUserRepository;

@Service
public class CustomUserService {

	private final ICustomUserRepository repo;

	public CustomUserService(@Autowired ICustomUserRepository repo) {
		this.repo = repo;
	}
	
	public void createUser(CustomUser user) {
		repo.save(user);
	}
}
