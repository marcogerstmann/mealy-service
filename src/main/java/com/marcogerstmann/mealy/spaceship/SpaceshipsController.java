package com.marcogerstmann.mealy.spaceship;

import com.marcogerstmann.mealy.common.enums.StiEntity;
import com.marcogerstmann.mealy.common.exception.StiNotFoundException;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Nonnull;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/v1/spaceships")
@Tag(name = "Spaceships")
public class SpaceshipsController {

    private final SpaceshipService spaceshipService;

    public SpaceshipsController(SpaceshipService spaceshipService) {
        this.spaceshipService = spaceshipService;
    }

    @Nonnull
    @GetMapping
    protected ResponseEntity<List<SpaceshipVo>> index() {
        return ResponseEntity.ok(spaceshipService.findAll());
    }

    @Nonnull
    @GetMapping("{id}")
    protected ResponseEntity<SpaceshipVo> get(@PathVariable UUID id) {
        return spaceshipService.findById(id)
                .map(ResponseEntity::ok)
                .orElseThrow(() -> new StiNotFoundException(StiEntity.SPACESHIP, id));
    }

}
