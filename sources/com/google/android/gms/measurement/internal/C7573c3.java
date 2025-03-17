package com.google.android.gms.measurement.internal;

import java.util.List;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.gms.measurement.internal.c3  reason: case insensitive filesystem */
final class C7573c3 implements Callable<List<C7597g>> {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ String f50089a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ String f50090b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ String f50091c;

    /* renamed from: d  reason: collision with root package name */
    private final /* synthetic */ S2 f50092d;

    C7573c3(S2 s22, String str, String str2, String str3) {
        this.f50089a = str;
        this.f50090b = str2;
        this.f50091c = str3;
        this.f50092d = s22;
    }

    public final /* synthetic */ Object call() {
        this.f50092d.f49947a.K0();
        return this.f50092d.f49947a.u0().S(this.f50089a, this.f50090b, this.f50091c);
    }
}
