package com.optimizely.ab.config.parser;

public final class JsonParseException extends Exception {
    public JsonParseException(String str) {
        super(str);
    }

    public JsonParseException(String str, Throwable th2) {
        super(str, th2);
    }
}
