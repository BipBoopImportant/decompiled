package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.x5  reason: case insensitive filesystem */
abstract class C7721x5 extends C7673q5 {

    /* renamed from: c  reason: collision with root package name */
    private boolean f50476c;

    C7721x5(C7728y5 y5Var) {
        super(y5Var);
        this.f50303b.N0();
    }

    /* access modifiers changed from: protected */
    public final void s() {
        if (!u()) {
            throw new IllegalStateException("Not initialized");
        }
    }

    public final void t() {
        if (!this.f50476c) {
            v();
            this.f50303b.M0();
            this.f50476c = true;
            return;
        }
        throw new IllegalStateException("Can't initialize twice");
    }

    /* access modifiers changed from: package-private */
    public final boolean u() {
        return this.f50476c;
    }

    /* access modifiers changed from: protected */
    public abstract boolean v();
}
