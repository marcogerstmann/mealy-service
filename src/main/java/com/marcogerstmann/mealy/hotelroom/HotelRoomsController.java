package com.marcogerstmann.mealy.hotelroom;

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
@RequestMapping("/api/v1/hotel_rooms")
@Tag(name = "Hotel Rooms")
public class HotelRoomsController {

    private final HotelRoomService hotelRoomService;

    public HotelRoomsController(HotelRoomService hotelRoomService) {
        this.hotelRoomService = hotelRoomService;
    }

    @Nonnull
    @GetMapping
    protected ResponseEntity<List<HotelRoomVo>> index() {
        return ResponseEntity.ok(hotelRoomService.findAll());
    }

    @Nonnull
    @GetMapping("{id}")
    protected ResponseEntity<HotelRoomVo> get(@PathVariable UUID id) {
        return hotelRoomService.findById(id)
                .map(ResponseEntity::ok)
                .orElseThrow(() -> new StiNotFoundException(StiEntity.HOTEL_ROOM, id));
    }

}
