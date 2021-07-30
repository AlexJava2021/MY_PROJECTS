package my.homeapp.moviereview.entity;

import lombok.Data;

import javax.persistence.Entity;
import java.time.LocalDateTime;

/**
 * The Class UserEntity
 */
@Entity
@Data
public class UserEntity extends BaseEntity {
    private String name;
    private String email;
    private LocalDateTime createDate;
}
