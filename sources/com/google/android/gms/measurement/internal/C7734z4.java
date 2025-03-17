package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;
import sa.C8759l;

/* renamed from: com.google.android.gms.measurement.internal.z4  reason: case insensitive filesystem */
final class C7734z4 extends C8759l {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ AtomicReference f50545a;

    C7734z4(C7685s4 s4Var, AtomicReference atomicReference) {
        this.f50545a = atomicReference;
    }

    public final void G1(C7707v5 v5Var) {
        synchronized (this.f50545a) {
            this.f50545a.set(v5Var);
            this.f50545a.notifyAll();
        }
    }
}
