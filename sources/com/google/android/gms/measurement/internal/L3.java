package com.google.android.gms.measurement.internal;

final class L3 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ String f49813a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ String f49814b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ Object f49815c;

    /* renamed from: d  reason: collision with root package name */
    private final /* synthetic */ long f49816d;

    /* renamed from: e  reason: collision with root package name */
    private final /* synthetic */ C7691t3 f49817e;

    L3(C7691t3 t3Var, String str, String str2, Object obj, long j10) {
        this.f49813a = str;
        this.f49814b = str2;
        this.f49815c = obj;
        this.f49816d = j10;
        this.f49817e = t3Var;
    }

    public final void run() {
        this.f49817e.l0(this.f49813a, this.f49814b, this.f49815c, this.f49816d);
    }
}
