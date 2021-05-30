package com.marcogerstmann.mealy.spaceship.spaceshipbooster;

import com.marcogerstmann.mealy.common.base.BaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Entity;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Data
@Entity
@EqualsAndHashCode(callSuper = true)
public class SpaceshipBooster extends BaseEntity {

    @NotNull
    @NotBlank
    private String name;

}
