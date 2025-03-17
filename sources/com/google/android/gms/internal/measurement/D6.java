package com.google.android.gms.internal.measurement;

public final class D6 implements E6 {

    /* renamed from: a  reason: collision with root package name */
    private static final B3<Long> f48642a;

    static {
        K3 e10 = new K3(C7452y3.a("com.google.android.gms.measurement")).f().e();
        e10.d("measurement.client.consent_state_v1", true);
        e10.d("measurement.client.3p_consent_state_v1", true);
        e10.d("measurement.service.consent_state_v1_W36", true);
        f48642a = e10.b("measurement.service.storage_consent_support_version", 203600);
    }

    public final long zza() {
        return f48642a.e().longValue();
    }
}
