package com.javatraining.springbootblogrestapi.repository;

import com.javatraining.springbootblogrestapi.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
