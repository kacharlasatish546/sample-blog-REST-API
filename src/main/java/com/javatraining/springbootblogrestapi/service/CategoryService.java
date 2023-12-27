package com.javatraining.springbootblogrestapi.service;

import com.javatraining.springbootblogrestapi.payload.CategoryDto;

import java.util.List;

public interface CategoryService {

   CategoryDto addCategory(CategoryDto categoryDto);
   CategoryDto findCategory(Long categoryId);
   List<CategoryDto> findCategories();
   CategoryDto updateCategory(Long categoryId, CategoryDto categoryDto);
   void removeCategory(Long categoryId);

}
