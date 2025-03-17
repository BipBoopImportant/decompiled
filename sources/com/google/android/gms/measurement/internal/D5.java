package com.google.android.gms.measurement.internal;

import java.util.List;
import java.util.Map;

final class D5 implements C7642m2 {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ String f49578a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ List f49579b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ C7728y5 f49580c;

    D5(C7728y5 y5Var, String str, List list) {
        this.f49578a = str;
        this.f49579b = list;
        this.f49580c = y5Var;
    }

    public final void a(String str, int i10, Throwable th2, byte[] bArr, Map<String, List<String>> map) {
        this.f49580c.P(true, i10, th2, bArr, this.f49578a, this.f49579b);
    }
}
