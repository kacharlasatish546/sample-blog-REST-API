package com.javatraining.springbootblogrestapi.service;

import com.javatraining.springbootblogrestapi.payload.PostDto;
import com.javatraining.springbootblogrestapi.payload.PostResponse;

public interface PostService {

    PostDto createPost(PostDto postDto);

    PostResponse getAllPosts(int pageNo, int pageSize, String sortBy, String sortDir);

    PostDto getPostById(long id);

    PostDto updatePost(long id, PostDto postDto);

    void deletePostById(long id);

}
