package com.google.android.gms.measurement.internal;

import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.gms.measurement.internal.y3  reason: case insensitive filesystem */
public final /* synthetic */ class C7726y3 implements C7588e4 {

    /* renamed from: a  reason: collision with root package name */
    private /* synthetic */ C7691t3 f50484a;

    /* renamed from: b  reason: collision with root package name */
    private /* synthetic */ AtomicReference f50485b;

    /* renamed from: c  reason: collision with root package name */
    private /* synthetic */ C7693t5 f50486c;

    public /* synthetic */ C7726y3(C7691t3 t3Var, AtomicReference atomicReference, C7693t5 t5Var) {
        this.f50484a = t3Var;
        this.f50485b = atomicReference;
        this.f50486c = t5Var;
    }

    public final void a(String str, int i10, Throwable th2, byte[] bArr, Map map) {
        C7691t3.Z(this.f50484a, this.f50485b, this.f50486c, str, i10, th2, bArr, map);
    }
}
