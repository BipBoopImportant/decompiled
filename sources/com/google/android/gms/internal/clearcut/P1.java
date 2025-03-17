package com.google.android.gms.internal.clearcut;

public enum P1 {
    INT(0),
    LONG(0L),
    FLOAT(Float.valueOf(0.0f)),
    DOUBLE(Double.valueOf(0.0d)),
    BOOLEAN(Boolean.FALSE),
    STRING(""),
    BYTE_STRING(A.f48133b),
    ENUM((String) null),
    MESSAGE((String) null);
    
    private final Object zzlj;

    private P1(Object obj) {
        this.zzlj = obj;
    }
}
