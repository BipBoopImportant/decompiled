package com.google.android.gms.internal.measurement;

public final class W6 implements X6 {

    /* renamed from: a  reason: collision with root package name */
    private static final B3<Boolean> f48823a;

    static {
        K3 e10 = new K3(C7452y3.a("com.google.android.gms.measurement")).f().e();
        e10.d("measurement.gmscore_feature_tracking", true);
        f48823a = e10.d("measurement.gmscore_client_telemetry", false);
    }

    public final boolean zza() {
        return f48823a.e().booleanValue();
    }
}
