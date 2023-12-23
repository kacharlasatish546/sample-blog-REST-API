package com.javatraining.springbootblogrestapi.repository;

import com.javatraining.springbootblogrestapi.entity.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post, Long> {


}
