package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.g5  reason: case insensitive filesystem */
final class C7304g5 implements M5 {

    /* renamed from: b  reason: collision with root package name */
    private static final C7414t5 f48927b = new C7331j5();

    /* renamed from: a  reason: collision with root package name */
    private final C7414t5 f48928a;

    public C7304g5() {
        this(new C7349l5(J4.a(), f48927b));
    }

    public final <T> K5<T> zza(Class<T> cls) {
        L5.o(cls);
        C7391q5 zza = this.f48928a.zza(cls);
        if (zza.zzc()) {
            return C7454y5.f(L5.f(), B4.a(), zza.zza());
        }
        return C7438w5.j(cls, zza, B5.a(), C7277d5.a(), L5.f(), C7322i5.f48949a[zza.zzb().ordinal()] != 1 ? B4.a() : null, C7398r5.a());
    }

    private C7304g5(C7414t5 t5Var) {
        this.f48928a = (C7414t5) O4.f(t5Var, "messageInfoFactory");
    }
}
