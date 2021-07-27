package my.homeapp.moviereview.dto.response;

import my.homeapp.moviereview.dto.Dto;

import java.time.LocalDateTime;

/**
 * The Class CreateUserResponse
 */
public class UserResponse implements Dto {
    private long id;

    private String name;

    private String email;

    private LocalDateTime createDate;
}
