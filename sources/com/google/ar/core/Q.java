package com.google.ar.core;

import com.google.ar.core.ArCoreApk;
import java.util.concurrent.atomic.AtomicReference;

final class Q implements F {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ AtomicReference f67700a;

    Q(AtomicReference atomicReference) {
        this.f67700a = atomicReference;
    }

    public final void a(ArCoreApk.Availability availability) {
        this.f67700a.set(availability);
    }
}
