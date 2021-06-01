package com.marcogerstmann.mealy.grocerylistitem;

import com.marcogerstmann.mealy.common.base.BaseDto;
import java.util.UUID;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@EqualsAndHashCode(callSuper = true)
@AllArgsConstructor
@NoArgsConstructor
@Builder(toBuilder = true)
public class GroceryListItemDto extends BaseDto {

    private transient UUID id;

    @NotNull
    @NotBlank
    private String text;

}
