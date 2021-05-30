package com.marcogerstmann.mealy.lunarcycler;

import com.marcogerstmann.mealy.common.base.BaseServiceImpl;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional
public class LunarCyclerServiceImpl extends BaseServiceImpl<LunarCycler, LunarCyclerVo> implements LunarCyclerService {

    public LunarCyclerServiceImpl(LunarCyclerRepository repository, LunarCyclerConverter converter) {
        super(repository, converter);
    }

}
