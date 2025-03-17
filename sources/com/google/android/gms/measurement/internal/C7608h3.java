package com.google.android.gms.measurement.internal;

import java.util.concurrent.Callable;
import sa.C8750c;

/* renamed from: com.google.android.gms.measurement.internal.h3  reason: case insensitive filesystem */
final class C7608h3 implements Callable<C8750c> {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ E5 f50166a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ S2 f50167b;

    C7608h3(S2 s22, E5 e52) {
        this.f50166a = e52;
        this.f50167b = s22;
    }

    public final /* synthetic */ Object call() {
        this.f50167b.f49947a.K0();
        return new C8750c(this.f50167b.f49947a.c(this.f50166a.f49596a));
    }
}
