package my.homeapp.moviereview.controller;

import my.homeapp.moviereview.dto.request.CreateUserRequest;
import my.homeapp.moviereview.dto.response.UserResponse;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.constraints.NotNull;

@RestController
@RequestMapping("/moviereview/users")
public class UserController {
    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<UserResponse> create(@NotNull @RequestBody CreateUserRequest createUserRequest)
    {
        return null;
    }
}
