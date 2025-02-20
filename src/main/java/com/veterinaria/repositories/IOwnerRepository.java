package com.veterinaria.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.veterinaria.models.Owner;

public interface IOwnerRepository extends JpaRepository<Owner, Long>{

}
