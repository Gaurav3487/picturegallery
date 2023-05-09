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

import com.picturegallery.model.Category;
import com.picturegallery.service.CategoryService;

@RestController
@RequestMapping("unsplash")
public class CategoryController {
	
	@Autowired
	private CategoryService categoryService;
	
	
	@PostMapping("/addcategory")
	public ResponseEntity<Category> saveCategory(@RequestBody Category category){
	Category saveCategory =categoryService.saveCategory(category);	
		return ResponseEntity.ok().body(saveCategory);
	}

	
	@DeleteMapping("/deletecategory")
	public void deleteCategory(@PathVariable("id") Integer id){
		categoryService.deleteCategory(id);
	}
	
	@GetMapping("/getcategory/{id}")
	public ResponseEntity<Optional<Category>> getCategoryById(@PathVariable("id") Integer id){
		Optional<Category> categorybyid =categoryService.getCategoryById(id);
		return ResponseEntity.ok().body(categorybyid);
	}
	
	@GetMapping("/getcategorylist")
	public ResponseEntity<List<Category>> getCategorylist(){
		List<Category> categorylist= categoryService.getCategoryList();
		return ResponseEntity.ok().body(categorylist);
	}
	
	@PutMapping("/updatecategory")
	public ResponseEntity<Category> updateCategory(@RequestBody Category category){
	Category updatecategory	=categoryService.updateCategoyById(category);
		return ResponseEntity.ok().body(updatecategory);
	}
}
