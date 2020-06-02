package com.petapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.petapp.model.PetAdopt;

public interface PetAdoptRepository extends JpaRepository<PetAdopt, Long>{

}
