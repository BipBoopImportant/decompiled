package com.google.android.gms.common.util;

import G9.e;
import S9.c;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.pm.PackageManager;
import android.util.Log;

public final class q {
    public static boolean a(Context context, int i10) {
        if (!b(context, i10, "com.google.android.gms")) {
            return false;
        }
        try {
            return e.a(context).b(context.getPackageManager().getPackageInfo("com.google.android.gms", 64));
        } catch (PackageManager.NameNotFoundException unused) {
            if (!Log.isLoggable("UidVerifier", 3)) {
                return false;
            }
            Log.d("UidVerifier", "Package manager can't find google play services package, defaulting to false");
            return false;
        }
    }

    @TargetApi(19)
    public static boolean b(Context context, int i10, String str) {
        return c.a(context).g(i10, str);
    }
}
