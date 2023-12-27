package com.javatraining.springbootblogrestapi.repository;

import com.javatraining.springbootblogrestapi.entity.Post;
import com.javatraining.springbootblogrestapi.payload.PostDto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.w3c.dom.stylesheets.LinkStyle;

import java.util.List;

public interface PostRepository extends JpaRepository<Post, Long> {

    List<Post> findByCategoryId(Long categoryId);

}
