package com.google.android.gms.measurement.internal;

import java.util.List;
import java.util.Map;

final class C5 implements C7642m2 {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ String f49563a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ M5 f49564b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ C7728y5 f49565c;

    C5(C7728y5 y5Var, String str, M5 m52) {
        this.f49563a = str;
        this.f49564b = m52;
        this.f49565c = y5Var;
    }

    public final void a(String str, int i10, Throwable th2, byte[] bArr, Map<String, List<String>> map) {
        this.f49565c.D(this.f49563a, i10, th2, bArr, this.f49564b);
    }
}
