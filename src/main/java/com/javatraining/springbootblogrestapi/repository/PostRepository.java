package com.javatraining.springbootblogrestapi.repository;

import com.javatraining.springbootblogrestapi.entity.Post;
import com.javatraining.springbootblogrestapi.payload.PostDto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.w3c.dom.stylesheets.LinkStyle;

import java.util.List;

public interface PostRepository extends JpaRepository<Post, Long> {

    List<Post> findByCategoryId(Long categoryId);

//    @Query("SELECT p FROM Post p WHERE " +
//            "p.title LIKE CONCAT('%',:query,'%') " +
//            "or p.description LIKE CONCAT('%',:query,'%')")
//    List<Post> searchPosts(String query);

    @Query(value = "SELECT * from posts p where " +
            "p.title LIKE CONCAT('%',:query,'%') " +
            "or p.description LIKE CONCAT('%',:query,'%')", nativeQuery = true)
    List<Post> searchPosts(String query);

}
