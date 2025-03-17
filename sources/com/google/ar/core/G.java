package com.google.ar.core;

import com.google.ar.core.ArCoreApk;

final class G implements F {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ J f67669a;

    G(J j10) {
        this.f67669a = j10;
    }

    public final void a(ArCoreApk.Availability availability) {
        synchronized (this.f67669a) {
            this.f67669a.f(availability);
            this.f67669a.g();
        }
    }
}
