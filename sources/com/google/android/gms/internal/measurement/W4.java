package com.google.android.gms.internal.measurement;

public enum W4 {
    VOID(Void.class, Void.class, (Class<?>) null),
    INT(r0, Integer.class, 0),
    LONG(Long.TYPE, Long.class, 0L),
    FLOAT(Float.TYPE, Float.class, Float.valueOf(0.0f)),
    DOUBLE(Double.TYPE, Double.class, Double.valueOf(0.0d)),
    BOOLEAN(Boolean.TYPE, Boolean.class, Boolean.FALSE),
    STRING(String.class, String.class, ""),
    BYTE_STRING(C7276d4.class, C7276d4.class, C7276d4.f48892b),
    ENUM(r0, Integer.class, (Class<?>) null),
    MESSAGE(Object.class, Object.class, (Class<?>) null);
    
    private final Class<?> zzl;

    private W4(Class<?> cls, Class<?> cls2, Object obj) {
        this.zzl = cls2;
    }

    public final Class<?> a() {
        return this.zzl;
    }
}
