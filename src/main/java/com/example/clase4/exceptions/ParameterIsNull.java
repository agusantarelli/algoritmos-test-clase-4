package com.example.clase4.exceptions;

public class ParameterIsNull extends RuntimeException {

    public ParameterIsNull(String message) {
        super(buildMessage(message));
    }

    private static String buildMessage(String message) {
        return message;
    }

}