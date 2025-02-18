package com.veterinaria.models;

import java.util.List;

import com.veterinaria.enums.PetType;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;

@Entity
public class Pet {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@NotBlank
	private String name;
	@NotBlank
	private Float weight;
	@NotBlank
	@Enumerated(EnumType.STRING)
	private PetType type;
	
	private List<Vaccine> history;
	
	public Pet() {}
	
	public Pet(Long id, @NotBlank String name, @NotBlank Float weight, @NotBlank PetType type, List<Vaccine> history) {
		this.id = id;
		this.name = name;
		this.weight = weight;
		this.type = type;
		this.history = history;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Float getWeight() {
		return weight;
	}
	public void setWeight(Float weight) {
		this.weight = weight;
	}
	public PetType getType() {
		return type;
	}
	public void setType(PetType type) {
		this.type = type;
	}
	public List<Vaccine> getHistory() {
		return history;
	}
	public void setHistory(List<Vaccine> history) {
		this.history = history;
	}
	public void addVaccine(Vaccine v) {
		this.history.add(v);
	}
	public void removeVaccine(Vaccine v) {
		this.history.remove(v);
	}
	public Long getId() {
		return id;
	}
}
