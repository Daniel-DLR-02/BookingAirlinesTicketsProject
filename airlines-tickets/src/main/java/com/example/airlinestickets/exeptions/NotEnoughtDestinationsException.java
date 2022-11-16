package com.example.airlinestickets.exeptions;

public class NotEnoughtDestinationsException extends RuntimeException{
    public NotEnoughtDestinationsException(String message) {
        super(message);
    }
}
