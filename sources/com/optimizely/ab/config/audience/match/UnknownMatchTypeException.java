package com.optimizely.ab.config.audience.match;

public class UnknownMatchTypeException extends Exception {
    private static String message = "uses an unknown match type. You may need to upgrade to a newer release of the Optimizely SDK.";

    public UnknownMatchTypeException() {
        super(message);
    }
}
