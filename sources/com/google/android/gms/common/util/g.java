package com.google.android.gms.common.util;

import K9.C6620s;
import android.content.Context;
import android.util.Log;

public final class g {

    /* renamed from: a  reason: collision with root package name */
    private static final String[] f48071a = {"android.", "com.android.", "dalvik.", "java.", "javax."};

    public static boolean a(Context context, Throwable th2) {
        try {
            C6620s.l(context);
            C6620s.l(th2);
            return false;
        } catch (Exception e10) {
            Log.e("CrashUtils", "Error adding exception to DropBox!", e10);
            return false;
        }
    }
}
