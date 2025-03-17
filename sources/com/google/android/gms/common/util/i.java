package com.google.android.gms.common.util;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import com.google.android.apps.common.proguard.SideEffectFree;
import com.google.android.gms.common.d;

public final class i {

    /* renamed from: a  reason: collision with root package name */
    private static Boolean f48073a;

    /* renamed from: b  reason: collision with root package name */
    private static Boolean f48074b;

    /* renamed from: c  reason: collision with root package name */
    private static Boolean f48075c;

    /* renamed from: d  reason: collision with root package name */
    private static Boolean f48076d;

    public static boolean a(Context context) {
        PackageManager packageManager = context.getPackageManager();
        if (f48076d == null) {
            boolean z10 = false;
            if (l.e() && packageManager.hasSystemFeature("android.hardware.type.automotive")) {
                z10 = true;
            }
            f48076d = Boolean.valueOf(z10);
        }
        return f48076d.booleanValue();
    }

    public static boolean b() {
        int i10 = d.f48050a;
        return "user".equals(Build.TYPE);
    }

    @SideEffectFree
    @TargetApi(20)
    public static boolean c(Context context) {
        return g(context.getPackageManager());
    }

    @TargetApi(26)
    public static boolean d(Context context) {
        if (c(context) && !l.d()) {
            return true;
        }
        if (e(context)) {
            return !l.e() || l.h();
        }
        return false;
    }

    @TargetApi(21)
    public static boolean e(Context context) {
        if (f48074b == null) {
            f48074b = Boolean.valueOf(context.getPackageManager().hasSystemFeature("cn.google"));
        }
        return f48074b.booleanValue();
    }

    public static boolean f(Context context) {
        if (f48075c == null) {
            boolean z10 = true;
            if (!context.getPackageManager().hasSystemFeature("android.hardware.type.iot") && !context.getPackageManager().hasSystemFeature("android.hardware.type.embedded")) {
                z10 = false;
            }
            f48075c = Boolean.valueOf(z10);
        }
        return f48075c.booleanValue();
    }

    @SideEffectFree
    @TargetApi(20)
    public static boolean g(PackageManager packageManager) {
        if (f48073a == null) {
            f48073a = Boolean.valueOf(packageManager.hasSystemFeature("android.hardware.type.watch"));
        }
        return f48073a.booleanValue();
    }
}
