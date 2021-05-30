package com.marcogerstmann.mealy.booking;

import com.marcogerstmann.mealy.common.base.AbstractConverter;
import org.dozer.DozerBeanMapper;
import org.springframework.stereotype.Component;

@Component
public class BookingConverter extends AbstractConverter<Booking, BookingVo> {

    public BookingConverter(DozerBeanMapper mapper) {
        super(mapper, Booking.class, BookingVo.class);
    }

}
