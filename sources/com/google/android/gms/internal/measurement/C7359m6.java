package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.m6  reason: case insensitive filesystem */
public enum C7359m6 {
    DOUBLE(C7384p6.DOUBLE, 1),
    FLOAT(C7384p6.FLOAT, 5),
    INT64(r5, 0),
    UINT64(r5, 0),
    INT32(r11, 0),
    FIXED64(r5, 1),
    FIXED32(r11, 5),
    BOOL(C7384p6.BOOLEAN, 0),
    STRING(C7384p6.STRING, (C7384p6) null),
    GROUP(r19, (C7384p6) null),
    MESSAGE(r19, (C7384p6) null),
    BYTES(C7384p6.BYTE_STRING, (C7384p6) null),
    UINT32(r11, 0),
    ENUM(C7384p6.ENUM, 0),
    SFIXED32(r11, 5),
    SFIXED64(r5, 1),
    SINT32(r11, 0),
    SINT64(r5, 0);
    
    private final C7384p6 zzt;
    private final int zzu;

    public final C7384p6 a() {
        return this.zzt;
    }

    private C7359m6(C7384p6 p6Var, int i10) {
        this.zzt = p6Var;
        this.zzu = i10;
    }
}
