package com.google.gson;

import java.lang.reflect.Field;
import java.util.Objects;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    private final Field f68908a;

    public b(Field field) {
        Objects.requireNonNull(field);
        this.f68908a = field;
    }

    public String toString() {
        return this.f68908a.toString();
    }
}
