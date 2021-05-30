package com.marcogerstmann.mealy.lunarcycler;

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
@RequestMapping("/api/v1/lunar_cycler")
@Tag(name = "Lunar Cyclers")
public class LunarCyclersController {

    private final LunarCyclerService lunarCyclerService;

    public LunarCyclersController(LunarCyclerService lunarCyclerService) {
        this.lunarCyclerService = lunarCyclerService;
    }

    @Nonnull
    @GetMapping
    protected ResponseEntity<List<LunarCyclerVo>> index() {
        return ResponseEntity.ok(lunarCyclerService.findAll());
    }

    @Nonnull
    @GetMapping("{id}")
    protected ResponseEntity<LunarCyclerVo> get(@PathVariable UUID id) {
        return lunarCyclerService.findById(id)
                .map(ResponseEntity::ok)
                .orElseThrow(() -> new StiNotFoundException(StiEntity.LUNAR_CYCLER, id));
    }

}
