package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.j3  reason: case insensitive filesystem */
final class C7622j3 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ J f50196a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ String f50197b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ S2 f50198c;

    C7622j3(S2 s22, J j10, String str) {
        this.f50196a = j10;
        this.f50197b = str;
        this.f50198c = s22;
    }

    public final void run() {
        this.f50198c.f49947a.K0();
        this.f50198c.f49947a.w(this.f50196a, this.f50197b);
    }
}
