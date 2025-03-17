package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.y  reason: case insensitive filesystem */
final class C7722y implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ String f50477a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ long f50478b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ C7555a f50479c;

    C7722y(C7555a aVar, String str, long j10) {
        this.f50477a = str;
        this.f50478b = j10;
        this.f50479c = aVar;
    }

    public final void run() {
        C7555a.B(this.f50479c, this.f50477a, this.f50478b);
    }
}
