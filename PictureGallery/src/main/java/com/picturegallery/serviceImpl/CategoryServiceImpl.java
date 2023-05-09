package com.picturegallery.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.picturegallery.model.Category;
import com.picturegallery.repository.CategoryRepository;
import com.picturegallery.service.CategoryService;

@Service
public class CategoryServiceImpl implements CategoryService {

	@Autowired
	private CategoryRepository categoryRepository;
	@Override
	public Category saveCategory(Category category) {
	Category addcategory	=categoryRepository.save(category);
		return addcategory;
	}
	@Override
	public void deleteCategory(Integer id) {
		categoryRepository.deleteById(id);
		
	}
	@Override
	public List<Category> getCategoryList() {
		List<Category> categorylist=categoryRepository.findAll();
		return categorylist;
	}
	@Override
	public Optional<Category> getCategoryById(Integer id) {
	 Optional<Category> category1= categoryRepository.findById(id);
		return category1;
	}
	@Override
	public Category updateCategoyById(Category category) {
		
		return categoryRepository.save(category);
	}

	
}
