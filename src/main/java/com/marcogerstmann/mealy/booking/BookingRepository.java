package com.marcogerstmann.mealy.booking;

import org.springframework.data.jpa.repository.JpaRepository;

import java.sql.Date;
import java.util.List;
import java.util.UUID;

public interface BookingRepository extends JpaRepository<Booking, UUID> {

    List<Booking> findByDepartureDateBetween(Date from, Date to);

}
