package com.google.android.gms.internal.measurement;

public final class K6 implements L6 {

    /* renamed from: a  reason: collision with root package name */
    private static final B3<Boolean> f48715a;

    /* renamed from: b  reason: collision with root package name */
    private static final B3<Boolean> f48716b;

    static {
        K3 e10 = new K3(C7452y3.a("com.google.android.gms.measurement")).f().e();
        f48715a = e10.d("measurement.set_default_event_parameters_propagate_clear.client.dev", false);
        f48716b = e10.d("measurement.set_default_event_parameters_propagate_clear.service", false);
        e10.b("measurement.id.set_default_event_parameters_propagate_clear.experiment_id", 0);
    }

    public final boolean zza() {
        return f48715a.e().booleanValue();
    }

    public final boolean zzb() {
        return f48716b.e().booleanValue();
    }
}
