package com.javatraining.springbootblogrestapi.payload;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Schema(
        description = "PostResponse Model Information"
)
public class PostResponse {

    @Schema(
            description = "Blog Post Response Content"
    )
    private List<PostDto> content;
    @Schema(
            description = "Blog Post Response Page Number"
    )
    private int pageNo;
    @Schema(
            description = "Blog Post Response Page Size"
    )
    private int pageSize;
    @Schema(
            description = "Blog Post Response Total Elements"
    )
    private long totalElements;
    @Schema(
            description = "Blog Post Response Total Pages"
    )
    private int totalPages;
    @Schema(
            description = "Blog Post Response Last Page"
    )
    private boolean last;

}
