package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.os.Looper;

/* renamed from: com.google.android.gms.measurement.internal.f  reason: case insensitive filesystem */
public final class C7590f {
    C7590f(Context context) {
    }

    public static boolean a() {
        return Looper.myLooper() == Looper.getMainLooper();
    }
}
