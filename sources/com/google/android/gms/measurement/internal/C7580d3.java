package com.google.android.gms.measurement.internal;

import java.util.List;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.gms.measurement.internal.d3  reason: case insensitive filesystem */
final class C7580d3 implements Callable<List<C7597g>> {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ String f50103a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ String f50104b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ String f50105c;

    /* renamed from: d  reason: collision with root package name */
    private final /* synthetic */ S2 f50106d;

    C7580d3(S2 s22, String str, String str2, String str3) {
        this.f50103a = str;
        this.f50104b = str2;
        this.f50105c = str3;
        this.f50106d = s22;
    }

    public final /* synthetic */ Object call() {
        this.f50106d.f49947a.K0();
        return this.f50106d.f49947a.u0().S(this.f50103a, this.f50104b, this.f50105c);
    }
}
