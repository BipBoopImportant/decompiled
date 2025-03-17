package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.w6  reason: case insensitive filesystem */
public final class C7439w6 implements C7415t6 {

    /* renamed from: a  reason: collision with root package name */
    private static final B3<Boolean> f49133a;

    static {
        K3 e10 = new K3(C7452y3.a("com.google.android.gms.measurement")).f().e();
        f49133a = e10.d("measurement.service.ad_impression.convert_value_to_double", true);
        e10.d("measurement.client.ad_impression", true);
        e10.d("measurement.service.separate_public_internal_event_blacklisting", true);
        e10.d("measurement.service.ad_impression", true);
    }

    public final boolean zza() {
        return f49133a.e().booleanValue();
    }
}
