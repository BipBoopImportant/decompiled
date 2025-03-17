package com.google.android.gms.internal.measurement;

public final class p7 implements q7 {

    /* renamed from: a  reason: collision with root package name */
    private static final B3<Boolean> f49040a;

    static {
        K3 e10 = new K3(C7452y3.a("com.google.android.gms.measurement")).f().e();
        e10.d("measurement.collection.enable_session_stitching_token.client.dev", true);
        e10.d("measurement.collection.enable_session_stitching_token.first_open_fix", true);
        f49040a = e10.d("measurement.session_stitching_token_enabled", false);
        e10.d("measurement.link_sst_to_sid", true);
    }

    public final boolean zza() {
        return true;
    }

    public final boolean zzb() {
        return f49040a.e().booleanValue();
    }
}
