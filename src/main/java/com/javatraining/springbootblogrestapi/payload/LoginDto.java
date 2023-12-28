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
        description = "LoginDto Model Information"
)
public class LoginDto {

    @Schema(
            description = "Login Username Or Email"
    )
    private String usernameOrEmail;
    @Schema(
            description = "Blog Login Password"
    )
    private String password;



}
