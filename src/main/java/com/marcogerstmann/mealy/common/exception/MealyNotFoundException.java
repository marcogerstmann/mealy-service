package com.marcogerstmann.mealy.common.exception;

import com.marcogerstmann.mealy.common.enums.MealyEntity;
import lombok.Getter;

import java.util.UUID;

@Getter
public class MealyNotFoundException extends RuntimeException {

    private static final long serialVersionUID = 4699636364667560957L;

    private final MealyEntity notFoundEntity;
    private final UUID notFoundId;

    public MealyNotFoundException(MealyEntity notFoundEntity, UUID notFoundId) {
        super(String.format("Entity %s with id %s not found", notFoundEntity, notFoundId));
        this.notFoundEntity = notFoundEntity;
        this.notFoundId = notFoundId;
    }
}
