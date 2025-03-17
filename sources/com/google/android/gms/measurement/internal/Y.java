package com.google.android.gms.measurement.internal;

final class Y implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ String f49996a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ long f49997b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ C7555a f49998c;

    Y(C7555a aVar, String str, long j10) {
        this.f49996a = str;
        this.f49997b = j10;
        this.f49998c = aVar;
    }

    public final void run() {
        C7555a.x(this.f49998c, this.f49996a, this.f49997b);
    }
}
