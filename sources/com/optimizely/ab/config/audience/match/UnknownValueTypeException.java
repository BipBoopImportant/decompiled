package com.optimizely.ab.config.audience.match;

public class UnknownValueTypeException extends Exception {
    private static String message = "has an unsupported attribute value.";

    public UnknownValueTypeException() {
        super(message);
    }
}
