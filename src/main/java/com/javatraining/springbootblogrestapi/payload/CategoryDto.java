package com.javatraining.springbootblogrestapi.payload;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Schema(
        description = "CategoryDto Model Information"
)
public class CategoryDto {

    private Long id;
    @Schema(
            description = "Blog Category Name"
    )
    private String name;
    @Schema(
            description = "Blog Category Description"
    )
    private String description;

}
