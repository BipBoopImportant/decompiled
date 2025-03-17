package com.google.android.gms.measurement.internal;

import K9.C6620s;
import com.google.android.gms.common.util.e;

/* renamed from: com.google.android.gms.measurement.internal.n5  reason: case insensitive filesystem */
final class C7652n5 {

    /* renamed from: a  reason: collision with root package name */
    private final e f50250a;

    /* renamed from: b  reason: collision with root package name */
    private long f50251b;

    public C7652n5(e eVar) {
        C6620s.l(eVar);
        this.f50250a = eVar;
    }

    public final void a() {
        this.f50251b = 0;
    }

    public final boolean b(long j10) {
        return this.f50251b == 0 || this.f50250a.c() - this.f50251b >= 3600000;
    }

    public final void c() {
        this.f50251b = this.f50250a.c();
    }
}
