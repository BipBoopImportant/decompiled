package com.google.android.gms.measurement.internal;

import java.util.concurrent.Callable;

/* renamed from: com.google.android.gms.measurement.internal.i3  reason: case insensitive filesystem */
final class C7615i3 implements Callable<byte[]> {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ J f50185a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ String f50186b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ S2 f50187c;

    C7615i3(S2 s22, J j10, String str) {
        this.f50185a = j10;
        this.f50186b = str;
        this.f50187c = s22;
    }

    public final /* synthetic */ Object call() {
        this.f50187c.f49947a.K0();
        return this.f50187c.f49947a.E0().w(this.f50185a, this.f50186b);
    }
}
