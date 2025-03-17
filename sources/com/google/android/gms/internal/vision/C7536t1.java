package com.google.android.gms.internal.vision;

/* renamed from: com.google.android.gms.internal.vision.t1  reason: case insensitive filesystem */
final class C7536t1 implements B1 {

    /* renamed from: a  reason: collision with root package name */
    private B1[] f49399a;

    C7536t1(B1... b1Arr) {
        this.f49399a = b1Arr;
    }

    public final boolean zza(Class<?> cls) {
        for (B1 zza : this.f49399a) {
            if (zza.zza(cls)) {
                return true;
            }
        }
        return false;
    }

    public final C7551y1 zzb(Class<?> cls) {
        for (B1 b12 : this.f49399a) {
            if (b12.zza(cls)) {
                return b12.zzb(cls);
            }
        }
        String name = cls.getName();
        throw new UnsupportedOperationException(name.length() != 0 ? "No factory is available for message type: ".concat(name) : new String("No factory is available for message type: "));
    }
}
