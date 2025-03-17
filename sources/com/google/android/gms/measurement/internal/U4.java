package com.google.android.gms.measurement.internal;

import android.content.ComponentName;

final class U4 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ ComponentName f49969a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ S4 f49970b;

    U4(S4 s42, ComponentName componentName) {
        this.f49969a = componentName;
        this.f49970b = s42;
    }

    public final void run() {
        C7685s4.K(this.f49970b.f49954c, this.f49969a);
    }
}
