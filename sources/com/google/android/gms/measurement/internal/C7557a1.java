package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.a1  reason: case insensitive filesystem */
final class C7557a1 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ long f50035a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ C7555a f50036b;

    C7557a1(C7555a aVar, long j10) {
        this.f50035a = j10;
        this.f50036b = aVar;
    }

    public final void run() {
        this.f50036b.A(this.f50035a);
    }
}
