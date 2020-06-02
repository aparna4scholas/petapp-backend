package com.petapp.controller;

import java.util.HashMap;
import java.util.Map;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.petapp.exception.ResourceNotFoundException;
import com.petapp.model.PetAdopt;
import com.petapp.repository.PetAdoptRepository;

@RestController
@RequestMapping("/petadopt_api/v1")
public class PetAdoptController {
	
	@Autowired
	PetAdoptRepository petAdoptRepository;
	
	
	@PostMapping("/adopt")
	  public PetAdopt addPetAdopt(@Valid @RequestBody PetAdopt petAdopt) {
	  	
	  return petAdoptRepository.save(petAdopt);
	  
	}

	
	@DeleteMapping("/{id}")
	  public Map<String, Boolean> deleteetAdopt(@PathVariable(value = "id") Long id)
				      throws ResourceNotFoundException {
		PetAdopt petAdopt = petAdoptRepository.findById(id)
				    		  .orElseThrow(()-> new ResourceNotFoundException(" Record not found for this city :: " + id));
	  
		petAdoptRepository.delete(petAdopt);
				      Map<String, Boolean> response = new HashMap<>();
				      
				      response.put("deleted city record", Boolean.TRUE);
				      
				      return response;
	  
	  }
}
