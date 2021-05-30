package com.marcogerstmann.mealy.lunarcycler;

import com.marcogerstmann.mealy.common.base.AbstractConverter;
import org.dozer.DozerBeanMapper;
import org.springframework.stereotype.Component;

@Component
public class LunarCyclerConverter extends AbstractConverter<LunarCycler, LunarCyclerVo> {

    public LunarCyclerConverter(DozerBeanMapper mapper) {
        super(mapper, LunarCycler.class, LunarCyclerVo.class);
    }

}
