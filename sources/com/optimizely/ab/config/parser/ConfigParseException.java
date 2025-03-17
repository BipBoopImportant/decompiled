package com.optimizely.ab.config.parser;

public final class ConfigParseException extends Exception {
    public ConfigParseException(String str) {
        super(str);
    }

    public ConfigParseException(String str, Throwable th2) {
        super(str, th2);
    }
}
