package com.marcogerstmann.mealy.spaceshipservice;

import com.marcogerstmann.mealy.common.base.BaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Entity;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.UUID;

@Data
@Entity
@EqualsAndHashCode(callSuper = true)
public class SpaceshipService extends BaseEntity {

    @NotNull
    @NotBlank
    String name;

    @NotNull
    private UUID orbId;

}
