package com.marcogerstmann.mealy.grocerylistitem;

import com.marcogerstmann.mealy.common.base.AbstractConverter;
import org.dozer.DozerBeanMapper;
import org.springframework.stereotype.Component;

@Component
public class GroceryListItemConverter extends AbstractConverter<GroceryListItem, GroceryListItemDto> {

    public GroceryListItemConverter(DozerBeanMapper mapper) {
        super(mapper, GroceryListItem.class, GroceryListItemDto.class);
    }

}
