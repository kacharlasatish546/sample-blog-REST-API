package com.javatraining.springbootblogrestapi.payload;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.Data;

import java.util.Set;

@Data
@Schema(
        description = "PostDto Model Information"
)
public class PostDto {

    private long id;

    @Schema(
            description = "Blog Post Title"
    )
    @NotEmpty(message = "Title should not be empty")
    @Size(min = 2, message = "Post Title should have at least 2 chars")
    private String title;

    @Schema(
            description = "Blog Post scription"
    )
    @NotEmpty(message = "Description should not be empty")
    @Size(min = 10, message = "Post Title should have at least 10 chars")
    private String description;

    @Schema(
            description = "Blog Post Content"
    )
    @NotEmpty(message = "Title should not be empty")
    private String content;
    @Schema(
            description = "Blog Post Comments"
    )
    private Set<CommentDto> comments;
    @Schema(
            description = "Blog Post Category Id"
    )
    private Long categoryId;

}
