package com.google.android.libraries.places.internal;

public enum zzajn {
    DOUBLE(zzajo.DOUBLE, 1),
    FLOAT(zzajo.FLOAT, 5),
    INT64(r12, 0),
    UINT64(r12, 0),
    INT32(r9, 0),
    FIXED64(r12, 1),
    FIXED32(r9, 5),
    BOOL(zzajo.BOOLEAN, 0),
    STRING(zzajo.STRING, 2),
    GROUP(r13, 3),
    MESSAGE(r13, 2),
    BYTES(zzajo.BYTE_STRING, 2),
    UINT32(r15, 0),
    ENUM(zzajo.ENUM, 0),
    SFIXED32(r15, 5),
    SFIXED64(r1, 1),
    SINT32(r3, 0),
    SINT64(r1, 0);
    
    private final zzajo zzt;

    private zzajn(zzajo zzajo, int i10) {
        this.zzt = zzajo;
    }

    public final zzajo zza() {
        return this.zzt;
    }
}
