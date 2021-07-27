package my.homeapp.moviereview.converter;

import my.homeapp.moviereview.dto.request.CreateUserRequest;
import my.homeapp.moviereview.dto.request.UpdateUserRequest;
import my.homeapp.moviereview.dto.response.UserResponse;
import my.homeapp.moviereview.model.User;

/**
 * The Class User convertor
 */
public class UserConverter implements Converter<CreateUserRequest, UpdateUserRequest, UserResponse, User> {

    @Override
    public User convertCreateRequestDtoToModel(CreateUserRequest dto) {
        return null;
    }

    @Override
    public User convertUpdateRequestDtoToModel(UpdateUserRequest dto) {
        return null;
    }

    @Override
    public UserResponse convertModelToResponseDto(User model) {
        return null;
    }
}
