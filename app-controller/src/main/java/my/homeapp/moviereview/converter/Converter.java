package my.homeapp.moviereview.converter;

import my.homeapp.moviereview.dto.Dto;
import my.homeapp.moviereview.model.BaseModel;

/**
 * Base converter
 *
 * @param <C>
 * @param <U>
 * @param <R>
 * @param <M>
 */
public interface Converter<C extends Dto, U extends Dto, R extends Dto, M extends BaseModel> {
     M  convertCreateRequestDtoToModel(C dto);

     M  convertUpdateRequestDtoToModel(U dto);

     R convertModelToResponseDto(M model);
}
