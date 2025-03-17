package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.c7  reason: case insensitive filesystem */
public final class C7270c7 implements C7279d7 {

    /* renamed from: a  reason: collision with root package name */
    private static final B3<Boolean> f48878a;

    /* renamed from: b  reason: collision with root package name */
    private static final B3<Long> f48879b;

    /* renamed from: c  reason: collision with root package name */
    private static final B3<Double> f48880c;

    /* renamed from: d  reason: collision with root package name */
    private static final B3<Long> f48881d;

    /* renamed from: e  reason: collision with root package name */
    private static final B3<Long> f48882e;

    /* renamed from: f  reason: collision with root package name */
    private static final B3<String> f48883f;

    static {
        K3 e10 = new K3(C7452y3.a("com.google.android.gms.measurement")).f().e();
        f48878a = e10.d("measurement.test.boolean_flag", false);
        f48879b = e10.b("measurement.test.cached_long_flag", -1);
        f48880c = e10.a("measurement.test.double_flag", -3.0d);
        f48881d = e10.b("measurement.test.int_flag", -2);
        f48882e = e10.b("measurement.test.long_flag", -1);
        f48883f = e10.c("measurement.test.string_flag", "---");
    }

    public final String h() {
        return f48883f.e();
    }

    public final boolean i() {
        return f48878a.e().booleanValue();
    }

    public final double zza() {
        return f48880c.e().doubleValue();
    }

    public final long zzb() {
        return f48879b.e().longValue();
    }

    public final long zzc() {
        return f48881d.e().longValue();
    }

    public final long zzd() {
        return f48882e.e().longValue();
    }
}
