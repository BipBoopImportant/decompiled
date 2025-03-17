package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.l3  reason: case insensitive filesystem */
final class C7636l3 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ P5 f50219a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ E5 f50220b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ S2 f50221c;

    C7636l3(S2 s22, P5 p52, E5 e52) {
        this.f50219a = p52;
        this.f50220b = e52;
        this.f50221c = s22;
    }

    public final void run() {
        this.f50221c.f49947a.K0();
        if (this.f50219a.x() == null) {
            this.f50221c.f49947a.L(this.f50219a.f49912b, this.f50220b);
        } else {
            this.f50221c.f49947a.B(this.f50219a, this.f50220b);
        }
    }
}
