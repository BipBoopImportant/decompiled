package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.i7  reason: case insensitive filesystem */
public final class C7324i7 implements C7288e7 {

    /* renamed from: a  reason: collision with root package name */
    private static final B3<Boolean> f48950a;

    /* renamed from: b  reason: collision with root package name */
    private static final B3<Boolean> f48951b;

    /* renamed from: c  reason: collision with root package name */
    private static final B3<Boolean> f48952c;

    /* renamed from: d  reason: collision with root package name */
    private static final B3<Boolean> f48953d;

    /* renamed from: e  reason: collision with root package name */
    private static final B3<Boolean> f48954e;

    /* renamed from: f  reason: collision with root package name */
    private static final B3<Boolean> f48955f;

    /* renamed from: g  reason: collision with root package name */
    private static final B3<Boolean> f48956g;

    /* renamed from: h  reason: collision with root package name */
    private static final B3<Boolean> f48957h;

    /* renamed from: i  reason: collision with root package name */
    private static final B3<Boolean> f48958i;

    /* renamed from: j  reason: collision with root package name */
    private static final B3<Boolean> f48959j;

    static {
        K3 e10 = new K3(C7452y3.a("com.google.android.gms.measurement")).f().e();
        f48950a = e10.d("measurement.rb.attribution.ad_campaign_info", true);
        e10.d("measurement.rb.attribution.client.bundle_on_backgrounded", true);
        e10.d("measurement.rb.attribution.service.bundle_on_backgrounded", true);
        f48951b = e10.d("measurement.rb.attribution.client2", true);
        e10.d("measurement.rb.attribution.dma_fix", true);
        f48952c = e10.d("measurement.rb.attribution.followup1.service", false);
        f48953d = e10.d("measurement.rb.attribution.client.get_trigger_uris_async", false);
        f48954e = e10.d("measurement.rb.attribution.service.trigger_uris_high_priority", true);
        e10.d("measurement.rb.attribution.index_out_of_bounds_fix", true);
        f48955f = e10.d("measurement.rb.attribution.service.enable_max_trigger_uris_queried_at_once", true);
        f48956g = e10.d("measurement.rb.attribution.retry_disposition", false);
        f48957h = e10.d("measurement.rb.attribution.service", true);
        f48958i = e10.d("measurement.rb.attribution.enable_trigger_redaction", true);
        f48959j = e10.d("measurement.rb.attribution.uuid_generation", true);
        e10.b("measurement.id.rb.attribution.retry_disposition", 0);
        e10.b("measurement.id.rb.attribution.client.get_trigger_uris_async", 0);
        e10.d("measurement.rb.attribution.improved_retry", true);
    }

    public final boolean a() {
        return f48959j.e().booleanValue();
    }

    public final boolean b() {
        return f48957h.e().booleanValue();
    }

    public final boolean e() {
        return f48955f.e().booleanValue();
    }

    public final boolean f() {
        return f48958i.e().booleanValue();
    }

    public final boolean h() {
        return f48953d.e().booleanValue();
    }

    public final boolean i() {
        return f48954e.e().booleanValue();
    }

    public final boolean zza() {
        return true;
    }

    public final boolean zzb() {
        return f48950a.e().booleanValue();
    }

    public final boolean zzc() {
        return f48951b.e().booleanValue();
    }

    public final boolean zzd() {
        return f48952c.e().booleanValue();
    }

    public final boolean zzh() {
        return f48956g.e().booleanValue();
    }
}
