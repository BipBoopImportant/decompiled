package com.google.android.gms.internal.measurement;

public final class P6 implements M6 {

    /* renamed from: a  reason: collision with root package name */
    private static final B3<Boolean> f48783a;

    /* renamed from: b  reason: collision with root package name */
    private static final B3<Boolean> f48784b;

    static {
        K3 e10 = new K3(C7452y3.a("com.google.android.gms.measurement")).f().e();
        e10.d("measurement.collection.event_safelist", true);
        f48783a = e10.d("measurement.service.store_null_safelist", true);
        f48784b = e10.d("measurement.service.store_safelist", true);
    }

    public final boolean zza() {
        return true;
    }

    public final boolean zzb() {
        return f48783a.e().booleanValue();
    }

    public final boolean zzc() {
        return f48784b.e().booleanValue();
    }
}
