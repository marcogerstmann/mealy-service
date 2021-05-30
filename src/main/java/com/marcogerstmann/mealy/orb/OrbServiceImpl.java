package com.marcogerstmann.mealy.orb;

import com.marcogerstmann.mealy.common.base.BaseServiceImpl;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional
public class OrbServiceImpl extends BaseServiceImpl<Orb, OrbVo> implements OrbService {

    public OrbServiceImpl(OrbRepository repository, OrbConverter converter) {
        super(repository, converter);
    }

}
