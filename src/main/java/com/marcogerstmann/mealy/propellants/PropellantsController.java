package com.marcogerstmann.mealy.propellants;

import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Nonnull;
import java.util.List;

@RestController
@RequestMapping("/api/v1/propellants")
@Tag(name = "Propellants", description = "Provided by API from Propellant Markt Inc.")
public class PropellantsController {

    private final PropellantService propellantService;

    public PropellantsController(PropellantService propellantService) {
        this.propellantService = propellantService;
    }

    @Nonnull
    @GetMapping
    protected ResponseEntity<List<PropellantListItemVo>> index() {
        return ResponseEntity.ok(propellantService.findAll());
    }

    @Nonnull
    @GetMapping("{id}")
    protected ResponseEntity<PropellantVo> get(@PathVariable Integer id) {
        return ResponseEntity.ok(propellantService.findById(id));
    }

}
