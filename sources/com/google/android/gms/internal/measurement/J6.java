package com.google.android.gms.internal.measurement;

public final class J6 implements F6 {

    /* renamed from: a  reason: collision with root package name */
    private static final B3<Boolean> f48698a;

    static {
        K3 e10 = new K3(C7452y3.a("com.google.android.gms.measurement")).f().e();
        e10.d("measurement.set_default_event_parameters_with_backfill.client.dev", false);
        e10.d("measurement.defensively_copy_bundles_validate_default_params", true);
        e10.d("measurement.set_default_event_parameters_with_backfill.service", true);
        f48698a = e10.d("measurement.set_default_event_parameters.fix_deferred_analytics_collection", false);
        e10.b("measurement.id.set_default_event_parameters.fix_deferred_analytics_collection", 0);
        e10.d("measurement.set_default_event_parameters.fix_subsequent_launches", true);
    }

    public final boolean zza() {
        return f48698a.e().booleanValue();
    }
}
