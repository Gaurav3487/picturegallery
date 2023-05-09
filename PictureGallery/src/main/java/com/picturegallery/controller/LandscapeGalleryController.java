package com.picturegallery.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.picturegallery.model.Landscapes;
import com.picturegallery.service.LandscapesGalleryService;

@RestController
@RequestMapping("/landscapegallery")
public class LandscapeGalleryController {

	@Autowired
	private LandscapesGalleryService landscapeGalleryService;
	
	@PostMapping("/addlandscapes")
	public ResponseEntity<Landscapes> addLandscape(@RequestBody Landscapes landscapes){
	    Landscapes addlandscape  =	landscapeGalleryService.addLandscapes(landscapes);
		return ResponseEntity.ok().body(addlandscape);
	}
	
	@GetMapping("/getlandscapelist")
	public ResponseEntity<List<Landscapes>> getLandscapelist(){
	List<Landscapes> landscapelist	=landscapeGalleryService.getLandscapesList();
		return ResponseEntity.ok().body(landscapelist);
	}
	
	@GetMapping ("getlandscape/{id}")
	public ResponseEntity<Optional<Landscapes>> getLandscapeById(@PathVariable("id") Integer id){
	Optional<Landscapes> landscape	=landscapeGalleryService.getLandscapeById(id);
		return ResponseEntity.ok().body(landscape);
	}
	
	@DeleteMapping("/deletelandscape")
	public void deleteLandscapeById(@PathVariable("id") Integer id) {
		landscapeGalleryService.deleteLandscape(id);
		
	}
	
	@PutMapping("/updatelandscape")
	public ResponseEntity<Landscapes> updateLandscape(@RequestBody Landscapes landscapes){
	Landscapes updatelandscape=	landscapeGalleryService.updateLandscapeById(landscapes);
		return ResponseEntity.ok().body(updatelandscape);
	}
}
