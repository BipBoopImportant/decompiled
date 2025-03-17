package I2;

import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.view.InputDevice;
import android.view.ViewConfiguration;
import java.util.Objects;

/* renamed from: I2.e0  reason: case insensitive filesystem */
public final class C4606e0 {

    /* renamed from: I2.e0$a */
    static class a {
        static float a(ViewConfiguration viewConfiguration) {
            return viewConfiguration.getScaledHorizontalScrollFactor();
        }

        static float b(ViewConfiguration viewConfiguration) {
            return viewConfiguration.getScaledVerticalScrollFactor();
        }
    }

    /* renamed from: I2.e0$b */
    static class b {
        static boolean a(ViewConfiguration viewConfiguration) {
            return viewConfiguration.shouldShowMenuShortcutsWhenKeyboardPresent();
        }
    }

    /* renamed from: I2.e0$c */
    static class c {
        static int a(ViewConfiguration viewConfiguration, int i10, int i11, int i12) {
            return viewConfiguration.getScaledMaximumFlingVelocity(i10, i11, i12);
        }

        static int b(ViewConfiguration viewConfiguration, int i10, int i11, int i12) {
            return viewConfiguration.getScaledMinimumFlingVelocity(i10, i11, i12);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0005, code lost:
        r1 = r1.getDimensionPixelSize(r2);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static int a(android.content.res.Resources r1, int r2, H2.l<java.lang.Integer> r3, int r4) {
        /*
            r0 = -1
            if (r2 == r0) goto L_0x000e
            if (r2 == 0) goto L_0x000d
            int r1 = r1.getDimensionPixelSize(r2)
            if (r1 >= 0) goto L_0x000c
            goto L_0x000d
        L_0x000c:
            r4 = r1
        L_0x000d:
            return r4
        L_0x000e:
            java.lang.Object r1 = r3.get()
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: I2.C4606e0.a(android.content.res.Resources, int, H2.l, int):int");
    }

    private static int b(Resources resources, String str, String str2) {
        return resources.getIdentifier(str, str2, "android");
    }

    private static int c(Resources resources, int i10, int i11) {
        if (i10 == 4194304 && i11 == 26) {
            return b(resources, "config_viewMaxRotaryEncoderFlingVelocity", "dimen");
        }
        return -1;
    }

    private static int d(Resources resources, int i10, int i11) {
        if (i10 == 4194304 && i11 == 26) {
            return b(resources, "config_viewMinRotaryEncoderFlingVelocity", "dimen");
        }
        return -1;
    }

    public static float e(ViewConfiguration viewConfiguration, Context context) {
        return a.a(viewConfiguration);
    }

    public static int f(Context context, ViewConfiguration viewConfiguration, int i10, int i11, int i12) {
        if (Build.VERSION.SDK_INT >= 34) {
            return c.a(viewConfiguration, i10, i11, i12);
        }
        if (!i(i10, i11, i12)) {
            return Integer.MIN_VALUE;
        }
        Resources resources = context.getResources();
        int c10 = c(resources, i12, i11);
        Objects.requireNonNull(viewConfiguration);
        return a(resources, c10, new C4602c0(viewConfiguration), Integer.MIN_VALUE);
    }

    public static int g(Context context, ViewConfiguration viewConfiguration, int i10, int i11, int i12) {
        if (Build.VERSION.SDK_INT >= 34) {
            return c.b(viewConfiguration, i10, i11, i12);
        }
        if (!i(i10, i11, i12)) {
            return Integer.MAX_VALUE;
        }
        Resources resources = context.getResources();
        int d10 = d(resources, i12, i11);
        Objects.requireNonNull(viewConfiguration);
        return a(resources, d10, new C4604d0(viewConfiguration), Integer.MAX_VALUE);
    }

    public static float h(ViewConfiguration viewConfiguration, Context context) {
        return a.b(viewConfiguration);
    }

    private static boolean i(int i10, int i11, int i12) {
        InputDevice device = InputDevice.getDevice(i10);
        return (device == null || device.getMotionRange(i11, i12) == null) ? false : true;
    }

    public static boolean j(ViewConfiguration viewConfiguration, Context context) {
        if (Build.VERSION.SDK_INT >= 28) {
            return b.a(viewConfiguration);
        }
        Resources resources = context.getResources();
        int b10 = b(resources, "config_showMenuShortcutsWhenKeyboardPresent", "bool");
        return b10 != 0 && resources.getBoolean(b10);
    }
}
