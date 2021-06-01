package com.marcogerstmann.mealy.grocerylistitem;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface GroceryListItemRepository extends JpaRepository<GroceryListItem, UUID> {
}
