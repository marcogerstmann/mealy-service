package com.marcogerstmann.mealy.orb;

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
@RequestMapping("/api/v1/orbs")
@Tag(name = "Orbs")
public class OrbsController {

    private final OrbService orbService;

    public OrbsController(OrbService orbService) {
        this.orbService = orbService;
    }

    @Nonnull
    @GetMapping
    protected ResponseEntity<List<OrbVo>> index() {
        return ResponseEntity.ok(orbService.findAll());
    }

    @Nonnull
    @GetMapping("{id}")
    protected ResponseEntity<OrbVo> get(@PathVariable UUID id) {
        return orbService.findById(id)
                .map(ResponseEntity::ok)
                .orElseThrow(() -> new StiNotFoundException(StiEntity.ORB, id));
    }

}
