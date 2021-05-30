package com.marcogerstmann.mealy.spaceship;

import com.marcogerstmann.mealy.common.base.AbstractConverter;
import org.dozer.DozerBeanMapper;
import org.springframework.stereotype.Component;

@Component
public class SpaceshipConverter extends AbstractConverter<Spaceship, SpaceshipVo> {

    public SpaceshipConverter(DozerBeanMapper mapper) {
        super(mapper, Spaceship.class, SpaceshipVo.class);
    }

}
