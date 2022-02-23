package com.epam.esm.dto.request;

import com.epam.esm.dto.CreateDTO;
import com.epam.esm.dto.PatchDTO;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;
import javax.validation.constraints.PositiveOrZero;
import javax.validation.constraints.Size;
import java.io.Serializable;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class TagDto implements Serializable {
    @PositiveOrZero(message = "ID should be positive number",groups = {CreateDTO.class, PatchDTO.class})
    private long id;
    @NotBlank(message = "tag name not blank constraints")
    @Size(min = 2,max = 10,message = "tag name length constraints = [2,10]",groups = {CreateDTO.class,PatchDTO.class})
    private String name;
}
