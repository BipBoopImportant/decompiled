package org.maplibre.android.utils;

import AL.C15447a;
import android.content.Context;
import android.os.Looper;

public class g {

    /* renamed from: a  reason: collision with root package name */
    private static Boolean f146105a;

    public static void a(String str) {
        Boolean bool = f146105a;
        if (bool == null) {
            throw new IllegalStateException("ThreadUtils isn't correctly initialised");
        } else if (bool.booleanValue() && Looper.myLooper() != Looper.getMainLooper()) {
            throw new C15447a(String.format("%s interactions should happen on the UI thread.", new Object[]{str}));
        }
    }

    public static g b(Context context) {
        f146105a = Boolean.valueOf((context.getApplicationInfo().flags & 2) != 0);
        return null;
    }
}
