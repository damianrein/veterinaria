package com.veterinaria.models;

import java.util.Set;

import jakarta.persistence.OneToMany;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public class Owner {

	private Long id;
	@NotBlank
	private String name;
	@NotBlank
	private String lastname;
	@Email
	@NotBlank
	private String email;
	@NotBlank
	private String phone;
	@Size(max = 8, min = 7)
	@NotBlank
	private Integer dni;
	@OneToMany
	private Set<Pet> pets;
	
	public Owner() {}
	
	public Owner(Long id, String name, String lastname, String phone, Integer dni, Set<Pet> pets) {
		this.id = id;
		this.name = name;
		this.lastname = lastname;
		this.phone = phone;
		this.dni = dni;
		this.pets = pets;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public Integer getDni() {
		return dni;
	}
	public void setDni(Integer dni) {
		this.dni = dni;
	}
	public Set<Pet> getPets() {
		return pets;
	}
	public void addPet(Pet pet) {
		this.pets.add(pet);
	}
	public void removePet(Pet pet) {
		this.pets.remove(pet);
	}
	public void setPets(Set<Pet> pets) {
		this.pets = pets;
	}
	public Long getId() {
		return id;
	}
}
