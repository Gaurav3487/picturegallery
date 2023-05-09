package com.picturegallery.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.picturegallery.model.Food;
import com.picturegallery.repository.FoodGalleryRepository;
import com.picturegallery.service.FoodGalleryService;

@Service
public class FoodGalleryServiceImpl implements FoodGalleryService {

	@Autowired
	private FoodGalleryRepository foodGalleryRepository;
	
	@Override
	public Food addFoodImage(Food food) {
	Food savefood	=foodGalleryRepository.save(food);
		return savefood;
	}

	@Override
	public void deleteFoodImage(Integer id) {
		foodGalleryRepository.deleteById(id);
		
	}

	@Override
	public List<Food> getFoodList() {
	  List<Food> foodlist =foodGalleryRepository.findAll();
		return foodlist;
	}

	@Override
	public Optional<Food> getFoodImageById(Integer id) {
		Optional<Food> foodbyid=foodGalleryRepository.findById(id);
		return foodbyid;
	}

	@Override
	public Food updateFoodImageById(Food food) {
		
		return foodGalleryRepository.save(food);
	}

}
