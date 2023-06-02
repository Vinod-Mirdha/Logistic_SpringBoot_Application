package com.springrest.springrest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springrest.springrest.entities.Loads;
import com.springrest.springrest.services.LoadService;

@RestController
public class MyController {
	
	@Autowired
	private LoadService LoadService;
	
	@GetMapping("/home")
	public String home() {
		return "This is Home ";
	}
	
	//Get the Loads
	@GetMapping("/loads")
	public List<Loads> getLoads(){
		
		return this.LoadService.getLoads();
		
	}
	
	@GetMapping("/loads/{LoadId}")
	public Loads getLoad(@PathVariable String LoadId) {
		
		return this.LoadService.getLoad(Long.parseLong(LoadId));
	
	}
	
	@PutMapping("/loads")
	public Loads updateLoad(@RequestBody Loads Load) {
		
		return this.LoadService.updateLoad(Load);
		
	}
	
	@DeleteMapping("/loads/{LoadId}")
	public ResponseEntity<HttpStatus> deleteLoad(@PathVariable String LoadId) {
		try {
			this.LoadService.deleteLoad(Long.parseLong(LoadId));
			return new ResponseEntity<>(HttpStatus.OK);
		}catch(Exception e) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	
	}
	
	@PostMapping("/loads")
	public Loads addLoad(@RequestBody Loads Load) {
		
		return this.LoadService.addLoad(Load);
		
	}
	
	

}
