package com.veterinaria.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.veterinaria.models.CustomUser;

public interface ICustomUserRepository extends JpaRepository<CustomUser, Long>{

}
