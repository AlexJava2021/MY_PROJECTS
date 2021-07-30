package my.homeapp.moviereview.converter;

import my.homeapp.moviereview.entity.UserEntity;
import my.homeapp.moviereview.model.User;

/**
 * The Class UserConverter
 */
public class UserConverter implements Converter<User, UserEntity> {
    @Override
    public UserEntity convertDtoToModel(User model) {
        return null;
    }

    @Override
    public User convertModelToDto(UserEntity entity) {
        return null;
    }
}
