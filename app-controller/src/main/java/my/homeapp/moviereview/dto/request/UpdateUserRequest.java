package my.homeapp.moviereview.dto.request;

import lombok.Data;
import my.homeapp.moviereview.dto.Dto;

@Data
public class UpdateUserRequest implements Dto {
    private String name;

    private String email;
}
