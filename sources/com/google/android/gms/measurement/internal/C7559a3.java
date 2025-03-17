package com.google.android.gms.measurement.internal;

import java.util.List;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.gms.measurement.internal.a3  reason: case insensitive filesystem */
final class C7559a3 implements Callable<List<R5>> {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ String f50037a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ String f50038b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ String f50039c;

    /* renamed from: d  reason: collision with root package name */
    private final /* synthetic */ S2 f50040d;

    C7559a3(S2 s22, String str, String str2, String str3) {
        this.f50037a = str;
        this.f50038b = str2;
        this.f50039c = str3;
        this.f50040d = s22;
    }

    public final /* synthetic */ Object call() {
        this.f50040d.f49947a.K0();
        return this.f50040d.f49947a.u0().K0(this.f50037a, this.f50038b, this.f50039c);
    }
}
