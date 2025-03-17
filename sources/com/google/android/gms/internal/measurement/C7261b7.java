package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.b7  reason: case insensitive filesystem */
public final class C7261b7 implements Y6 {

    /* renamed from: a  reason: collision with root package name */
    private static final B3<Boolean> f48867a;

    static {
        K3 e10 = new K3(C7452y3.a("com.google.android.gms.measurement")).f().e();
        e10.d("measurement.sdk.collection.enable_extend_user_property_size", true);
        e10.d("measurement.sdk.collection.last_deep_link_referrer2", true);
        f48867a = e10.d("measurement.sdk.collection.last_deep_link_referrer_campaign2", false);
        e10.b("measurement.id.sdk.collection.last_deep_link_referrer2", 0);
    }

    public final boolean zza() {
        return f48867a.e().booleanValue();
    }
}
