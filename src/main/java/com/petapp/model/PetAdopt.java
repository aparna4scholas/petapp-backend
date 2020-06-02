package com.petapp.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "petadopt") 
public class PetAdopt {
	
	@Id
	@Column(name = "id")
	private Long id;
	
	@Column(name = "adoptedpets")
	private String adoptedpets;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getAdoptedpets() {
		return adoptedpets;
	}

	public void setAdoptedpets(String adoptedpets) {
		this.adoptedpets = adoptedpets;
	}
	
	

}
