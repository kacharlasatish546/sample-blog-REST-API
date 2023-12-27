package com.javatraining.springbootblogrestapi.payload;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.Data;

import java.util.Set;

@Data
public class PostDto {

    private long id;

    @NotEmpty(message = "Title should not be empty")
    @Size(min = 2, message = "Post Title should have at least 2 chars")
    private String title;

    @NotEmpty(message = "Description should not be empty")
    @Size(min = 10, message = "Post Title should have at least 10 chars")
    private String description;

    @NotEmpty(message = "Title should not be empty")
    private String content;
    private Set<CommentDto> comments;
    private Long categoryId;

}
