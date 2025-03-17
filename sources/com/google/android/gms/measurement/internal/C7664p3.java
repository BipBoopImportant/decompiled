package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.p3  reason: case insensitive filesystem */
abstract class C7664p3 extends C7643m3 {

    /* renamed from: b  reason: collision with root package name */
    private boolean f50281b;

    C7664p3(P2 p22) {
        super(p22);
        this.f50228a.m();
    }

    /* access modifiers changed from: protected */
    public void l() {
    }

    /* access modifiers changed from: protected */
    public final void m() {
        if (!p()) {
            throw new IllegalStateException("Not initialized");
        }
    }

    public final void n() {
        if (this.f50281b) {
            throw new IllegalStateException("Can't initialize twice");
        } else if (!r()) {
            this.f50228a.l();
            this.f50281b = true;
        }
    }

    public final void o() {
        if (!this.f50281b) {
            l();
            this.f50228a.l();
            this.f50281b = true;
            return;
        }
        throw new IllegalStateException("Can't initialize twice");
    }

    /* access modifiers changed from: package-private */
    public final boolean p() {
        return this.f50281b;
    }

    /* access modifiers changed from: protected */
    public abstract boolean r();
}
