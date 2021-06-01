package com.marcogerstmann.mealy.grocerylistitem;

import com.marcogerstmann.mealy.common.base.BaseServiceImpl;
import javax.transaction.Transactional;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class GroceryListItemServiceImpl extends BaseServiceImpl<GroceryListItem, GroceryListItemDto> implements GroceryListItemService {

    public GroceryListItemServiceImpl(GroceryListItemRepository repository,
        GroceryListItemConverter converter) {
        super(repository, converter);
    }
}
