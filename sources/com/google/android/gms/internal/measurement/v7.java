package com.google.android.gms.internal.measurement;

public final class v7 implements w7 {

    /* renamed from: a  reason: collision with root package name */
    private static final B3<Boolean> f49100a;

    /* renamed from: b  reason: collision with root package name */
    private static final B3<Boolean> f49101b;

    /* renamed from: c  reason: collision with root package name */
    private static final B3<Boolean> f49102c;

    /* renamed from: d  reason: collision with root package name */
    private static final B3<Boolean> f49103d;

    /* renamed from: e  reason: collision with root package name */
    private static final B3<Boolean> f49104e;

    /* renamed from: f  reason: collision with root package name */
    private static final B3<Boolean> f49105f;

    /* renamed from: g  reason: collision with root package name */
    private static final B3<Boolean> f49106g;

    static {
        K3 e10 = new K3(C7452y3.a("com.google.android.gms.measurement")).f().e();
        f49100a = e10.d("measurement.sgtm.client.scion_upload_action.dev", false);
        f49101b = e10.d("measurement.sgtm.client.upload_on_backgrounded.dev", false);
        f49102c = e10.d("measurement.sgtm.google_signal.enable", false);
        f49103d = e10.d("measurement.sgtm.no_proxy.client.dev", false);
        f49104e = e10.d("measurement.sgtm.no_proxy.service", false);
        e10.d("measurement.sgtm.preview_mode_enabled", true);
        e10.d("measurement.sgtm.rollout_percentage_fix", true);
        e10.d("measurement.sgtm.service", true);
        f49105f = e10.d("measurement.sgtm.service.batching_on_backgrounded", false);
        f49106g = e10.d("measurement.sgtm.upload_queue", false);
        e10.b("measurement.id.sgtm", 0);
    }

    public final boolean e() {
        return f49106g.e().booleanValue();
    }

    public final boolean h() {
        return f49104e.e().booleanValue();
    }

    public final boolean i() {
        return f49105f.e().booleanValue();
    }

    public final boolean zza() {
        return f49100a.e().booleanValue();
    }

    public final boolean zzb() {
        return f49101b.e().booleanValue();
    }

    public final boolean zzc() {
        return f49102c.e().booleanValue();
    }

    public final boolean zzd() {
        return f49103d.e().booleanValue();
    }
}
