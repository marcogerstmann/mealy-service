package com.marcogerstmann.mealy.lunarcycler;

import com.marcogerstmann.mealy.common.base.BaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Entity;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Data
@Entity
@EqualsAndHashCode(callSuper = true)
public class LunarCycler extends BaseEntity {

    @NotNull
    @NotBlank
    private String name;

}
