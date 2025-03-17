package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.l5  reason: case insensitive filesystem */
final class C7349l5 implements C7414t5 {

    /* renamed from: a  reason: collision with root package name */
    private C7414t5[] f48998a;

    C7349l5(C7414t5... t5VarArr) {
        this.f48998a = t5VarArr;
    }

    public final C7391q5 zza(Class<?> cls) {
        for (C7414t5 t5Var : this.f48998a) {
            if (t5Var.zzb(cls)) {
                return t5Var.zza(cls);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: " + cls.getName());
    }

    public final boolean zzb(Class<?> cls) {
        for (C7414t5 zzb : this.f48998a) {
            if (zzb.zzb(cls)) {
                return true;
            }
        }
        return false;
    }
}
