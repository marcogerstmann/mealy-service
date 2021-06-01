package com.marcogerstmann.mealy.grocerylistitem;

import com.marcogerstmann.mealy.common.annotations.GroupedApiResponses;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import java.util.List;
import javax.annotation.Nonnull;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/grocery_list_item")
@Tag(name = "Grocery List Items", description = "A travel grocery list item is a single item of a grocery list")
public class GroceryListItemController {

    private final GroceryListItemService groceryListItemService;

    public GroceryListItemController(GroceryListItemService groceryListItemService) {
        this.groceryListItemService = groceryListItemService;
    }

    @Nonnull
    @GetMapping
    @Operation(summary = "Get all grocery list items", description = "A list of all travel grocery list items")
    @GroupedApiResponses
    protected ResponseEntity<List<GroceryListItemDto>> index() {
        return ResponseEntity.ok(groceryListItemService.findAll());
    }
}
