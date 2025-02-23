package com.giomuathu.AquariumWarehousingSupportSystem.exception;

public class MissingFieldException extends RuntimeException{
    public MissingFieldException(String errorMessage) {
        super(errorMessage);
    }
}
