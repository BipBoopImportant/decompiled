package com.google.android.gms.internal.measurement;

import java.util.concurrent.Callable;

final class P0 implements K0 {
    P0() {
    }

    public final <V> Callable<V> a(Callable<V> callable) {
        return callable;
    }

    public final Runnable b(Runnable runnable) {
        return runnable;
    }
}
