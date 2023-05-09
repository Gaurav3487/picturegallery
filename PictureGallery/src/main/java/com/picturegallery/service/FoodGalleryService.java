package com.picturegallery.service;

import java.util.List;
import java.util.Optional;

import com.picturegallery.model.Food;

public interface FoodGalleryService {
	
	public Food addFoodImage(Food food);
	
	public void deleteFoodImage(Integer id);
	
	public List<Food> getFoodList();
	
	public Optional<Food> getFoodImageById(Integer id);
	
	public Food updateFoodImageById(Food food);

}
