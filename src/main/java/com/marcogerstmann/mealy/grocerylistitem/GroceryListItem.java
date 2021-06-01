package com.marcogerstmann.mealy.grocerylistitem;

import com.marcogerstmann.mealy.common.base.BaseEntity;
import javax.persistence.Entity;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@Entity
@EqualsAndHashCode(callSuper = true)
public class GroceryListItem extends BaseEntity {

    @NotNull
    @NotBlank
    private String text;

}
