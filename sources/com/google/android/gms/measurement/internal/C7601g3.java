package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.g3  reason: case insensitive filesystem */
final class C7601g3 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ J f50145a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ E5 f50146b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ S2 f50147c;

    C7601g3(S2 s22, J j10, E5 e52) {
        this.f50145a = j10;
        this.f50146b = e52;
        this.f50147c = s22;
    }

    public final void run() {
        this.f50147c.V3(this.f50147c.R3(this.f50145a, this.f50146b), this.f50146b);
    }
}
