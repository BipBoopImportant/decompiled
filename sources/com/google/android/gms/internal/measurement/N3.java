package com.google.android.gms.internal.measurement;

import jb.l;

public final class N3 {

    /* renamed from: a  reason: collision with root package name */
    private final boolean f48761a;

    public N3(Q3 q32) {
        l.k(q32, "BuildInfo must be non-null");
        this.f48761a = !q32.zza();
    }

    public final boolean a(String str) {
        l.k(str, "flagName must not be null");
        if (!this.f48761a) {
            return true;
        }
        return P3.f48781a.get().d(str);
    }
}
