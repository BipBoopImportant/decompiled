package com.google.android.gms.measurement.internal;

abstract class B1 extends Z1 {

    /* renamed from: b  reason: collision with root package name */
    private boolean f49534b;

    B1(P2 p22) {
        super(p22);
        this.f50228a.m();
    }

    /* access modifiers changed from: package-private */
    public final boolean u() {
        return this.f49534b;
    }

    /* access modifiers changed from: protected */
    public abstract boolean v();

    /* access modifiers changed from: protected */
    public final void w() {
        if (!u()) {
            throw new IllegalStateException("Not initialized");
        }
    }

    public final void x() {
        if (this.f49534b) {
            throw new IllegalStateException("Can't initialize twice");
        } else if (!v()) {
            this.f50228a.l();
            this.f49534b = true;
        }
    }

    public final void y() {
        if (!this.f49534b) {
            z();
            this.f50228a.l();
            this.f49534b = true;
            return;
        }
        throw new IllegalStateException("Can't initialize twice");
    }

    /* access modifiers changed from: protected */
    public void z() {
    }
}
