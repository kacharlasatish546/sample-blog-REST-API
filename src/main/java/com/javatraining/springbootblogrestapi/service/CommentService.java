package com.javatraining.springbootblogrestapi.service;

import com.javatraining.springbootblogrestapi.payload.CommentDto;

import java.util.List;

public interface CommentService {

    CommentDto createComment(long postId, CommentDto commentDto);

    List<CommentDto> getAllCommentsByPostId(long postId);

    CommentDto getCommentByCommentId(long postId, long commentId);

    CommentDto updateCommentByCommentId(long postId, long commentId, CommentDto commentDto);

    void deleteCommentByCommentId(long postId, long commentId);

}
