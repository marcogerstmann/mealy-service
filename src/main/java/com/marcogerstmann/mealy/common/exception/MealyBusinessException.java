package com.marcogerstmann.mealy.common.exception;

public class MealyBusinessException extends RuntimeException {

    private static final long serialVersionUID = -7176692269740261456L;

    public MealyBusinessException(String message) {
        super(message);
    }
}
