package com.google.firebase.messaging;

import K4.m;
import android.content.Context;
import android.content.SharedPreferences;
import com.google.android.gms.common.util.l;

final class Q {
    private static SharedPreferences b(Context context) {
        Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            context = applicationContext;
        }
        return context.getSharedPreferences("com.google.firebase.messaging", 0);
    }

    static boolean c(Context context) {
        return b(context).getBoolean("proxy_notification_initialized", false);
    }

    static boolean d(SharedPreferences sharedPreferences, boolean z10) {
        return sharedPreferences.contains("proxy_retention") && sharedPreferences.getBoolean("proxy_retention", false) == z10;
    }

    static void f(Context context, boolean z10) {
        SharedPreferences.Editor edit = b(context).edit();
        edit.putBoolean("proxy_notification_initialized", z10);
        edit.apply();
    }

    static void g(Context context, D d10, boolean z10) {
        if (l.g() && !d(b(context), z10)) {
            d10.l(z10).f(new m(), new P(context, z10));
        }
    }

    /* access modifiers changed from: package-private */
    public static void h(Context context, boolean z10) {
        SharedPreferences.Editor edit = b(context).edit();
        edit.putBoolean("proxy_retention", z10);
        edit.apply();
    }
}
