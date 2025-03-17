package com.google.android.gms.internal.measurement;

public final class Q6 implements R6 {

    /* renamed from: a  reason: collision with root package name */
    private static final B3<Boolean> f48794a;

    /* renamed from: b  reason: collision with root package name */
    private static final B3<Boolean> f48795b;

    /* renamed from: c  reason: collision with root package name */
    private static final B3<Boolean> f48796c;

    static {
        K3 e10 = new K3(C7452y3.a("com.google.android.gms.measurement")).f().e();
        e10.d("measurement.service.audience.fix_skip_audience_with_failed_filters", true);
        f48794a = e10.d("measurement.audience.refresh_event_count_filters_timestamp", false);
        f48795b = e10.d("measurement.audience.use_bundle_end_timestamp_for_non_sequence_property_filters", false);
        f48796c = e10.d("measurement.audience.use_bundle_timestamp_for_event_count_filters", false);
    }

    public final boolean zza() {
        return true;
    }

    public final boolean zzb() {
        return f48794a.e().booleanValue();
    }

    public final boolean zzc() {
        return f48795b.e().booleanValue();
    }

    public final boolean zzd() {
        return f48796c.e().booleanValue();
    }
}
