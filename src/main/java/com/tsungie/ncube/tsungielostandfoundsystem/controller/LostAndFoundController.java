package com.tsungie.ncube.tsungielostandfoundsystem.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.tsungie.ncube.tsungielostandfoundsystem.model.LostAndFound;
import com.tsungie.ncube.tsungielostandfoundsystem.repository.LostAndFoundRepository;

import java.awt.PageAttributes.MediaType;
import java.util.List;

public class LostAndFoundController {
	
	 @Autowired
	 LostAndFoundRepository lostAndFoundRepository;

	 @GetMapping("/items")
	  public ResponseEntity<List<LostAndFound>> getAllItems(@RequestParam(required = false) String title) {
		return null;
	    
	  }

	 @GetMapping("/items/{id}")
	  public ResponseEntity<LostAndFound> getItemsById(@PathVariable("id") long id) {
		return null;
	    
	  }
	 
	 @PostMapping("/items")
	  public ResponseEntity<LostAndFound> createItem(@RequestBody LostAndFound lostAndFound) {
		 return null;
	   	  }
	 
		

	  @PutMapping("/items/{id}")
	  public ResponseEntity<LostAndFound> updateList(@PathVariable("id") long id, @RequestBody LostAndFound lostAndFound) {
		return null;
	  
	  }
	  
	  @DeleteMapping("/items/{id}")
	  public ResponseEntity<HttpStatus> deleteTutorial(@PathVariable("id") long id) {
		return null;
	    
	  }
	
	  
	  @RequestMapping(path = "/{reservationId}",method = RequestMethod.DELETE)
	  public ResponseEntity<Void> deleteAllItems(
	  		@PathVariable
	  		long itemId){
	  	return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	  }
	  
	  @GetMapping("/items/province")
	  public ResponseEntity<List<LostAndFound>> findByProvince() {
		return null;
	    
	  }
}

