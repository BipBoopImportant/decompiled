package com.google.android.gms.measurement.internal;

final class W2 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ String f49978a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ String f49979b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ String f49980c;

    /* renamed from: d  reason: collision with root package name */
    private final /* synthetic */ long f49981d;

    /* renamed from: e  reason: collision with root package name */
    private final /* synthetic */ S2 f49982e;

    W2(S2 s22, String str, String str2, String str3, long j10) {
        this.f49978a = str;
        this.f49979b = str2;
        this.f49980c = str3;
        this.f49981d = j10;
        this.f49982e = s22;
    }

    public final void run() {
        String str = this.f49978a;
        if (str == null) {
            this.f49982e.f49947a.K(this.f49979b, (C7630k4) null);
            return;
        }
        this.f49982e.f49947a.K(this.f49979b, new C7630k4(this.f49980c, str, this.f49981d));
    }
}
