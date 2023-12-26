package com.javatraining.springbootblogrestapi.payload;


import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class CommentDto {

    private long id;
    @NotEmpty(message = "Name should not be empty")
    @Size(min = 4, message = "Name should have at least 4 chars")
    private String name;
    @NotEmpty(message = "Email should not be empty")
    @Email()
    private String email;
    @NotEmpty(message = "Body should not be empty")
    @Size(min = 10, message = "Name should have at least 10 chars")
    private String body;

}
