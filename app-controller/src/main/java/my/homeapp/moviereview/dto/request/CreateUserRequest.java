package my.homeapp.moviereview.dto.request;

import lombok.Data;
import my.homeapp.moviereview.dto.Dto;

/**
 * The CreateUserRequest
 */
@Data
public class CreateUserRequest implements Dto {
    private String name;

    private String email;
}
