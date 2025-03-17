package com.google.android.gms.measurement.internal;

import K9.C6620s;
import sa.C8755h;

/* renamed from: com.google.android.gms.measurement.internal.y4  reason: case insensitive filesystem */
final class C7727y4 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ E5 f50487a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ boolean f50488b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ P5 f50489c;

    /* renamed from: d  reason: collision with root package name */
    private final /* synthetic */ C7685s4 f50490d;

    C7727y4(C7685s4 s4Var, E5 e52, boolean z10, P5 p52) {
        this.f50487a = e52;
        this.f50488b = z10;
        this.f50489c = p52;
        this.f50490d = s4Var;
    }

    public final void run() {
        C8755h A10 = this.f50490d.f50393d;
        if (A10 == null) {
            this.f50490d.f().E().a("Discarding data. Failed to set user property");
            return;
        }
        C6620s.l(this.f50487a);
        this.f50490d.X(A10, this.f50488b ? null : this.f50489c, this.f50487a);
        this.f50490d.o0();
    }
}
