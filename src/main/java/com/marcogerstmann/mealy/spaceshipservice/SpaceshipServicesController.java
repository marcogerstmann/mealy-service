package com.marcogerstmann.mealy.spaceshipservice;

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
@RequestMapping("/api/v1/spaceship_services")
@Tag(name = "Spaceship Services")
public class SpaceshipServicesController {

    private final SpaceshipServiceService spaceshipServiceService;

    public SpaceshipServicesController(SpaceshipServiceService spaceshipServiceService) {
        this.spaceshipServiceService = spaceshipServiceService;
    }

    @Nonnull
    @GetMapping
    protected ResponseEntity<List<SpaceshipServiceVo>> index() {
        return ResponseEntity.ok(spaceshipServiceService.findAll());
    }

    @Nonnull
    @GetMapping("{id}")
    protected ResponseEntity<SpaceshipServiceVo> get(@PathVariable UUID id) {
        return spaceshipServiceService.findById(id)
                .map(ResponseEntity::ok)
                .orElseThrow(() -> new StiNotFoundException(StiEntity.SPACESHIP_SERVICE, id));
    }

}
