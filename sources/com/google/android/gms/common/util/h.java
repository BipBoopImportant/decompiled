package com.google.android.gms.common.util;

import android.os.SystemClock;

public class h implements e {

    /* renamed from: a  reason: collision with root package name */
    private static final h f48072a = new h();

    private h() {
    }

    public static e d() {
        return f48072a;
    }

    public final long a() {
        return System.currentTimeMillis();
    }

    public final long b() {
        return System.nanoTime();
    }

    public final long c() {
        return SystemClock.elapsedRealtime();
    }
}
