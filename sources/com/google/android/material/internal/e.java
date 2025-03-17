package com.google.android.material.internal;

import I2.C4626o0;
import La.C9138a;
import android.annotation.TargetApi;
import android.content.Context;
import android.os.Build;
import android.view.Window;
import x2.C6244c;

public class e {
    public static void a(Window window, boolean z10, Integer num, Integer num2) {
        boolean z11 = false;
        boolean z12 = num == null || num.intValue() == 0;
        if (num2 == null || num2.intValue() == 0) {
            z11 = true;
        }
        if (z12 || z11) {
            int b10 = C9138a.b(window.getContext(), 16842801, -16777216);
            if (z12) {
                num = Integer.valueOf(b10);
            }
            if (z11) {
                num2 = Integer.valueOf(b10);
            }
        }
        C4626o0.b(window, !z10);
        int c10 = c(window.getContext(), z10);
        int b11 = b(window.getContext(), z10);
        window.setStatusBarColor(c10);
        window.setNavigationBarColor(b11);
        f(window, d(c10, C9138a.h(num.intValue())));
        e(window, d(b11, C9138a.h(num2.intValue())));
    }

    @TargetApi(21)
    private static int b(Context context, boolean z10) {
        if (z10 && Build.VERSION.SDK_INT < 27) {
            return C6244c.p(C9138a.b(context, 16843858, -16777216), 128);
        }
        if (z10) {
            return 0;
        }
        return C9138a.b(context, 16843858, -16777216);
    }

    @TargetApi(21)
    private static int c(Context context, boolean z10) {
        if (z10) {
            return 0;
        }
        return C9138a.b(context, 16843857, -16777216);
    }

    private static boolean d(int i10, boolean z10) {
        return C9138a.h(i10) || (i10 == 0 && z10);
    }

    public static void e(Window window, boolean z10) {
        C4626o0.a(window, window.getDecorView()).c(z10);
    }

    public static void f(Window window, boolean z10) {
        C4626o0.a(window, window.getDecorView()).d(z10);
    }
}
