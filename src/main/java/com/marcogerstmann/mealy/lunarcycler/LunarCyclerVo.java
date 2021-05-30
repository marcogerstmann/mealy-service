package com.marcogerstmann.mealy.lunarcycler;

import com.marcogerstmann.mealy.common.base.BaseVo;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Data
@EqualsAndHashCode(callSuper = true)
public class LunarCyclerVo extends BaseVo {

    @NotBlank
    @NotNull
    private String name;

}
