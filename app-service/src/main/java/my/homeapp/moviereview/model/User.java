package my.homeapp.moviereview.model;

import java.time.LocalDateTime;

/**
 * The Class User
 */
@Data
public class User extends BaseModel {
    private String name;
    private String email;
    private LocalDateTime createDate;
}
