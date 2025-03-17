package com.google.android.gms.measurement.internal;

import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import sa.C8758k;

/* renamed from: com.google.android.gms.measurement.internal.x4  reason: case insensitive filesystem */
final class C7720x4 extends C8758k {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ AtomicReference f50475a;

    C7720x4(C7685s4 s4Var, AtomicReference atomicReference) {
        this.f50475a = atomicReference;
    }

    public final void r2(List<C7645m5> list) {
        synchronized (this.f50475a) {
            this.f50475a.set(list);
            this.f50475a.notifyAll();
        }
    }
}
