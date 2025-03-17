package com.optimizely.ab.config.audience.match;

public class UnexpectedValueTypeException extends Exception {
    private static String message = "has an unsupported condition value. You may need to upgrade to a newer release of the Optimizely SDK.";

    public UnexpectedValueTypeException() {
        super(message);
    }
}
