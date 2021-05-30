package com.marcogerstmann.mealy.spaceshipservice;

import com.marcogerstmann.mealy.common.base.AbstractConverter;
import org.dozer.DozerBeanMapper;
import org.springframework.stereotype.Component;

@Component
public class SpaceshipServiceConverter extends AbstractConverter<SpaceshipService, SpaceshipServiceVo> {

    public SpaceshipServiceConverter(DozerBeanMapper mapper) {
        super(mapper, SpaceshipService.class, SpaceshipServiceVo.class);
    }

}
