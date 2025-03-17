package com.google.ar.core.exceptions;

public class FatalException extends RuntimeException {
    public FatalException() {
    }

    public FatalException(String str) {
        super(str);
    }

    public FatalException(String str, Throwable th2) {
        super(str, th2);
    }
}
