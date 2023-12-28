package com.javatraining.springbootblogrestapi.payload;


import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
@Schema(
        description = "CommentDto Model Information"
)
public class CommentDto {

    private Long id;
    @NotEmpty(message = "Name should not be empty")
    @Size(min = 4, message = "Name should have at least 4 chars")
    @Schema(
            description = "Blog Comment Name"
    )
    private String name;
    @NotEmpty(message = "Email should not be empty")
    @Email()
    @Schema(
            description = "Blog Comment Email"
    )
    private String email;
    @NotEmpty(message = "Body should not be empty")
    @Size(min = 10, message = "Name should have at least 10 chars")
    @Schema(
            description = "Blog Comment Body"
    )
    private String body;

}
