package com.google.gson;

public class l extends RuntimeException {
    public l(String str) {
        super(str);
    }

    public l(String str, Throwable th2) {
        super(str, th2);
    }

    public l(Throwable th2) {
        super(th2);
    }
}
