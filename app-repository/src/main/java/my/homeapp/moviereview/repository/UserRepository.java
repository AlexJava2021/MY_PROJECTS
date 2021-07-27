package my.homeapp.moviereview.repository;

import my.homeapp.moviereview.entity.UserEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * The Class UserRepository
 */
@Repository
public interface UserRepository extends CrudRepository<UserEntity, Long> {
    List<UserEntity> findUserByName(String name);

    UserEntity findUserByEmail(String email);
}
