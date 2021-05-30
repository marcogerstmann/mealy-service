package com.marcogerstmann.mealy.hotelroom;

import com.marcogerstmann.mealy.common.base.AbstractConverter;
import org.dozer.DozerBeanMapper;
import org.springframework.stereotype.Component;

@Component
public class HotelRoomConverter extends AbstractConverter<HotelRoom, HotelRoomVo> {

    public HotelRoomConverter(DozerBeanMapper mapper) {
        super(mapper, HotelRoom.class, HotelRoomVo.class);
    }

}
