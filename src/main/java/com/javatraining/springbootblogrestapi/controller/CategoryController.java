package com.javatraining.springbootblogrestapi.controller;

import com.javatraining.springbootblogrestapi.payload.CategoryDto;
import com.javatraining.springbootblogrestapi.service.CategoryService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/categories")
public class CategoryController {

    private CategoryService categoryService;

    public CategoryController(CategoryService categoryService) {
        this.categoryService = categoryService;
    }

    @PostMapping
    @PreAuthorize("hasRole('ADMIN')")
    public ResponseEntity<CategoryDto> addCategory(@RequestBody CategoryDto categoryDto) {
        CategoryDto savedCategory = categoryService.addCategory(categoryDto);
        return new ResponseEntity<>(savedCategory, HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public ResponseEntity<CategoryDto> findCategory(@PathVariable("id") Long categoryId) {
        return ResponseEntity.ok(categoryService.findCategory(categoryId));
    }

    @GetMapping
    public ResponseEntity<List<CategoryDto>> findCategories() {
        return ResponseEntity.ok(categoryService.findCategories());
    }

    @PreAuthorize("hasRole('ADMIN')")
    @PutMapping("{id}")
    public ResponseEntity<CategoryDto> updateCategory(@PathVariable("id") Long categoryId, @RequestBody CategoryDto categoryDto) {
        return ResponseEntity.ok(categoryService.updateCategory(categoryId, categoryDto));
    }

    @PreAuthorize("hasRole('ADMIN')")
    @DeleteMapping("{id}")
    public ResponseEntity<String> updateCategory(@PathVariable("id") Long categoryId) {
        categoryService.removeCategory(categoryId);
        return ResponseEntity.ok("Category with Id: " + categoryId + " deleted successfully!");
    }

}
