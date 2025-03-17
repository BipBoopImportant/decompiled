package com.optimizely.ab;

public class c extends RuntimeException {
    public c() {
    }

    public c(Exception exc) {
        super(exc);
    }

    public c(String str) {
        super(str);
    }

    public c(String str, Throwable th2) {
        super(str, th2);
    }
}
