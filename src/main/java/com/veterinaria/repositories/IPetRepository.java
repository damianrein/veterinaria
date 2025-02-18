package com.veterinaria.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.veterinaria.models.Pet;

public interface IPetRepository extends JpaRepository<Pet, Long>{

}
