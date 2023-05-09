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

import com.picturegallery.model.Food;
import com.picturegallery.service.FoodGalleryService;

@RestController
@RequestMapping("/foodgallery")
public class FoodGalleryController {

	@Autowired
	private FoodGalleryService foodGalleryService;
	
	@PostMapping("/addfoodimage")
	public ResponseEntity<Food> addFoodImage(@RequestBody Food food){
	Food addfood	=foodGalleryService.addFoodImage(food);
		return ResponseEntity.ok().body(addfood);
	}
	
	@GetMapping("/getfoodlist")
	public ResponseEntity<List<Food>> getFoodList(){
	List<Food> foodlist=	foodGalleryService.getFoodList();
		return ResponseEntity.ok().body(foodlist);
	}
	
	@GetMapping("/getfood/{id}")
	public ResponseEntity<Optional<Food>> getFoodById(@PathVariable("id") Integer id){
		Optional<Food> food=foodGalleryService.getFoodImageById(id);
		return ResponseEntity.ok().body(food);
	}
	
	@DeleteMapping("/deletefood/{id}")
	public void deleteFoodById(@PathVariable("id") Integer id) {
		foodGalleryService.deleteFoodImage(id);
		
	}
	
	@PutMapping("/updatefood")
	public ResponseEntity<Food> updateFoodGallery(@RequestBody Food food){
		Food updatefood= foodGalleryService.updateFoodImageById(food);
		return ResponseEntity.ok().body(updatefood);
	}
	
}
