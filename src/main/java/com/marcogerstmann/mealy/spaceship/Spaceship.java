package com.marcogerstmann.mealy.spaceship;

import com.marcogerstmann.mealy.common.base.BaseEntity;
import com.marcogerstmann.mealy.spaceship.spaceshipbooster.SpaceshipBooster;
import com.marcogerstmann.mealy.spaceshipservice.SpaceshipService;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;
import javax.validation.constraints.PositiveOrZero;

@Data
@Entity
@EqualsAndHashCode(callSuper = true)
public class Spaceship extends BaseEntity {

    @NotNull
    @NotBlank
    private String name;

    @NotNull
    @PositiveOrZero
    private Integer seats;

    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "booster_id")
    private SpaceshipBooster booster;

    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "service_id")
    private SpaceshipService service;

    @NotNull
    @Positive
    private Integer weightKg;

    @NotNull
    @Positive
    private Integer maxCapacityKg;

    @NotNull
    private Integer propellantId;

    @NotNull
    @Positive
    private Integer propellantMarkup;

}
