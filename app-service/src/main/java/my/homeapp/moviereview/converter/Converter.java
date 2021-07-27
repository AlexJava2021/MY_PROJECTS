package my.homeapp.moviereview.converter;

import my.homeapp.moviereview.model.BaseModel;

/**
 * The Interface Converter
 *
 * @param <T>
 * @param <S>
 */
public interface Converter<T extends BaseModel, S extends BaseEntity> {
    S convertDtoToModel(T model);

    T convertModelToDto(S entity);
}
