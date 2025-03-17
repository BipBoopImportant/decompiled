package com.google.android.gms.internal.clearcut;

final class D0 implements L0 {

    /* renamed from: a  reason: collision with root package name */
    private L0[] f48189a;

    D0(L0... l0Arr) {
        this.f48189a = l0Arr;
    }

    public final boolean zza(Class<?> cls) {
        for (L0 zza : this.f48189a) {
            if (zza.zza(cls)) {
                return true;
            }
        }
        return false;
    }

    public final K0 zzb(Class<?> cls) {
        for (L0 l02 : this.f48189a) {
            if (l02.zza(cls)) {
                return l02.zzb(cls);
            }
        }
        String name = cls.getName();
        throw new UnsupportedOperationException(name.length() != 0 ? "No factory is available for message type: ".concat(name) : new String("No factory is available for message type: "));
    }
}
