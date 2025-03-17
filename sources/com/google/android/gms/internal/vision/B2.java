package com.google.android.gms.internal.vision;

public enum B2 {
    DOUBLE(E2.DOUBLE, 1),
    FLOAT(E2.FLOAT, 5),
    INT64(r5, 0),
    UINT64(r5, 0),
    INT32(r11, 0),
    FIXED64(r5, 1),
    FIXED32(r11, 5),
    BOOL(E2.BOOLEAN, 0),
    GROUP(r13, 3),
    MESSAGE(r13, 2),
    BYTES(E2.BYTE_STRING, 2),
    UINT32(r11, 0),
    ENUM(E2.ENUM, 0),
    SFIXED32(r11, 5),
    SFIXED64(r5, 1),
    SINT32(r11, 0),
    SINT64(r5, 0);
    
    private final E2 zzs;
    private final int zzt;

    private B2(E2 e22, int i10) {
        this.zzs = e22;
        this.zzt = i10;
    }

    public final E2 a() {
        return this.zzs;
    }
}
