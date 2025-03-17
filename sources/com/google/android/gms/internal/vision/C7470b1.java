package com.google.android.gms.internal.vision;

/* renamed from: com.google.android.gms.internal.vision.b1  reason: case insensitive filesystem */
public enum C7470b1 {
    VOID(Void.class, Void.class, (Class<?>) null),
    INT(r0, Integer.class, 0),
    LONG(Long.TYPE, Long.class, 0L),
    FLOAT(Float.TYPE, Float.class, Float.valueOf(0.0f)),
    DOUBLE(Double.TYPE, Double.class, Double.valueOf(0.0d)),
    BOOLEAN(Boolean.TYPE, Boolean.class, Boolean.FALSE),
    STRING(String.class, String.class, ""),
    BYTE_STRING(C7497i0.class, C7497i0.class, C7497i0.f49335b),
    ENUM(r0, Integer.class, (Class<?>) null),
    MESSAGE(Object.class, Object.class, (Class<?>) null);
    
    private final Class<?> zzk;
    private final Class<?> zzl;
    private final Object zzm;

    private C7470b1(Class<?> cls, Class<?> cls2, Object obj) {
        this.zzk = cls;
        this.zzl = cls2;
        this.zzm = obj;
    }

    public final Class<?> a() {
        return this.zzl;
    }
}
