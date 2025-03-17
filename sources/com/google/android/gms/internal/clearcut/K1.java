package com.google.android.gms.internal.clearcut;

public enum K1 {
    DOUBLE(P1.DOUBLE, 1),
    FLOAT(P1.FLOAT, 5),
    INT64(r5, 0),
    UINT64(r5, 0),
    INT32(r11, 0),
    FIXED64(r5, 1),
    FIXED32(r11, 5),
    BOOL(P1.BOOLEAN, 0),
    STRING(P1.STRING, 2),
    GROUP(r13, 3),
    MESSAGE(r13, 2),
    BYTES(P1.BYTE_STRING, 2),
    UINT32(r11, 0),
    ENUM(P1.ENUM, 0),
    SFIXED32(r11, 5),
    SFIXED64(r5, 1),
    SINT32(r11, 0),
    SINT64(r5, 0);
    
    private final P1 zzqu;
    private final int zzqv;

    private K1(P1 p12, int i10) {
        this.zzqu = p12;
        this.zzqv = i10;
    }

    public final P1 a() {
        return this.zzqu;
    }
}
