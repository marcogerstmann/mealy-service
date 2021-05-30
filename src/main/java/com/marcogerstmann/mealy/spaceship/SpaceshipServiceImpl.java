package com.marcogerstmann.mealy.spaceship;

import com.marcogerstmann.mealy.common.base.BaseServiceImpl;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional
public class SpaceshipServiceImpl extends BaseServiceImpl<Spaceship, SpaceshipVo> implements SpaceshipService {

    public SpaceshipServiceImpl(SpaceshipRepository repository, SpaceshipConverter converter) {
        super(repository, converter);
    }

}
