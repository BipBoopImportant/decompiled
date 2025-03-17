package com.google.android.gms.measurement.internal;

import java.util.List;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.gms.measurement.internal.b3  reason: case insensitive filesystem */
final class C7566b3 implements Callable<List<R5>> {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ String f50076a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ String f50077b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ String f50078c;

    /* renamed from: d  reason: collision with root package name */
    private final /* synthetic */ S2 f50079d;

    C7566b3(S2 s22, String str, String str2, String str3) {
        this.f50076a = str;
        this.f50077b = str2;
        this.f50078c = str3;
        this.f50079d = s22;
    }

    public final /* synthetic */ Object call() {
        this.f50079d.f49947a.K0();
        return this.f50079d.f49947a.u0().K0(this.f50076a, this.f50077b, this.f50078c);
    }
}
