package com.oppwa.mobile.connect.provider.parser;

@FunctionalInterface
public interface ResponseParser<T> {
    T parse(String str);
}
