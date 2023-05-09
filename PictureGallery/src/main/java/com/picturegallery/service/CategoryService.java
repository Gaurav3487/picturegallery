package com.picturegallery.service;

import java.util.List;
import java.util.Optional;

import com.picturegallery.model.Category;

public interface CategoryService {
	
	public Category saveCategory(Category category);
	
	public void deleteCategory(Integer id);
	
	public List<Category> getCategoryList();
	
	public Optional<Category> getCategoryById(Integer id);
	
	public Category updateCategoyById(Category category);

}
