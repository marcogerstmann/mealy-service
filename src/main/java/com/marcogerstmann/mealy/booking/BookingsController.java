package com.marcogerstmann.mealy.booking;

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
@RequestMapping("/api/v1/bookings")
@Tag(name = "Bookings")
public class BookingsController {

    private final BookingService bookingService;

    public BookingsController(BookingService bookingService) {
        this.bookingService = bookingService;
    }

    @Nonnull
    @GetMapping
    protected ResponseEntity<List<BookingVo>> index() {
        return ResponseEntity.ok(bookingService.findAll());
    }

    @Nonnull
    @GetMapping("{id}")
    protected ResponseEntity<BookingVo> get(@PathVariable UUID id) {
        return bookingService.findById(id)
                .map(ResponseEntity::ok)
                .orElseThrow(() -> new StiNotFoundException(StiEntity.BOOKING, id));
    }

}
