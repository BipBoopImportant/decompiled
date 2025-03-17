package androidx.appcompat.widget;

import android.graphics.Insets;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import y2.C6260a;

public class y {

    /* renamed from: a  reason: collision with root package name */
    private static final int[] f16574a = {16842912};

    /* renamed from: b  reason: collision with root package name */
    private static final int[] f16575b = new int[0];

    /* renamed from: c  reason: collision with root package name */
    public static final Rect f16576c = new Rect();

    static class a {

        /* renamed from: a  reason: collision with root package name */
        private static final boolean f16577a;

        /* renamed from: b  reason: collision with root package name */
        private static final Method f16578b;

        /* renamed from: c  reason: collision with root package name */
        private static final Field f16579c;

        /* renamed from: d  reason: collision with root package name */
        private static final Field f16580d;

        /* renamed from: e  reason: collision with root package name */
        private static final Field f16581e;

        /* renamed from: f  reason: collision with root package name */
        private static final Field f16582f;

        /* JADX WARNING: Removed duplicated region for block: B:43:0x004a  */
        /* JADX WARNING: Removed duplicated region for block: B:44:0x0057  */
        static {
            /*
                r0 = 1
                r1 = 0
                r2 = 0
                java.lang.String r3 = "android.graphics.Insets"
                java.lang.Class r3 = java.lang.Class.forName(r3)     // Catch:{ NoSuchMethodException -> 0x0043, ClassNotFoundException -> 0x0040, NoSuchFieldException -> 0x003d }
                java.lang.Class<android.graphics.drawable.Drawable> r4 = android.graphics.drawable.Drawable.class
                java.lang.String r5 = "getOpticalInsets"
                java.lang.reflect.Method r4 = r4.getMethod(r5, r1)     // Catch:{ NoSuchMethodException -> 0x0043, ClassNotFoundException -> 0x0040, NoSuchFieldException -> 0x003d }
                java.lang.String r5 = "left"
                java.lang.reflect.Field r5 = r3.getField(r5)     // Catch:{ NoSuchMethodException -> 0x003a, ClassNotFoundException -> 0x0037, NoSuchFieldException -> 0x0034 }
                java.lang.String r6 = "top"
                java.lang.reflect.Field r6 = r3.getField(r6)     // Catch:{ NoSuchMethodException -> 0x0032, ClassNotFoundException -> 0x0030, NoSuchFieldException -> 0x002d }
                java.lang.String r7 = "right"
                java.lang.reflect.Field r7 = r3.getField(r7)     // Catch:{ ClassNotFoundException | NoSuchFieldException | NoSuchMethodException -> 0x002b }
                java.lang.String r8 = "bottom"
                java.lang.reflect.Field r3 = r3.getField(r8)     // Catch:{ ClassNotFoundException | NoSuchFieldException | NoSuchMethodException -> 0x0046 }
                r8 = r0
                goto L_0x0048
            L_0x002b:
                r7 = r1
                goto L_0x0046
            L_0x002d:
                r6 = r1
            L_0x002e:
                r7 = r6
                goto L_0x0046
            L_0x0030:
                r6 = r1
                goto L_0x002e
            L_0x0032:
                r6 = r1
                goto L_0x002e
            L_0x0034:
                r5 = r1
            L_0x0035:
                r6 = r5
                goto L_0x002e
            L_0x0037:
                r5 = r1
            L_0x0038:
                r6 = r5
                goto L_0x002e
            L_0x003a:
                r5 = r1
            L_0x003b:
                r6 = r5
                goto L_0x002e
            L_0x003d:
                r4 = r1
                r5 = r4
                goto L_0x0035
            L_0x0040:
                r4 = r1
                r5 = r4
                goto L_0x0038
            L_0x0043:
                r4 = r1
                r5 = r4
                goto L_0x003b
            L_0x0046:
                r3 = r1
                r8 = r2
            L_0x0048:
                if (r8 == 0) goto L_0x0057
                f16578b = r4
                f16579c = r5
                f16580d = r6
                f16581e = r7
                f16582f = r3
                f16577a = r0
                goto L_0x0063
            L_0x0057:
                f16578b = r1
                f16579c = r1
                f16580d = r1
                f16581e = r1
                f16582f = r1
                f16577a = r2
            L_0x0063:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.y.a.<clinit>():void");
        }

        static Rect a(Drawable drawable) {
            if (Build.VERSION.SDK_INT < 29 && f16577a) {
                try {
                    Object invoke = f16578b.invoke(drawable, (Object[]) null);
                    if (invoke != null) {
                        return new Rect(f16579c.getInt(invoke), f16580d.getInt(invoke), f16581e.getInt(invoke), f16582f.getInt(invoke));
                    }
                } catch (IllegalAccessException | InvocationTargetException unused) {
                }
            }
            return y.f16576c;
        }
    }

    static class b {
        static Insets a(Drawable drawable) {
            return drawable.getOpticalInsets();
        }
    }

    @Deprecated
    public static boolean a(Drawable drawable) {
        return true;
    }

    static void b(Drawable drawable) {
        String name = drawable.getClass().getName();
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 29 && i10 < 31 && "android.graphics.drawable.ColorStateListDrawable".equals(name)) {
            c(drawable);
        }
    }

    private static void c(Drawable drawable) {
        int[] state = drawable.getState();
        if (state == null || state.length == 0) {
            drawable.setState(f16574a);
        } else {
            drawable.setState(f16575b);
        }
        drawable.setState(state);
    }

    public static Rect d(Drawable drawable) {
        if (Build.VERSION.SDK_INT < 29) {
            return a.a(C6260a.q(drawable));
        }
        Insets a10 = b.a(drawable);
        return new Rect(a10.left, a10.top, a10.right, a10.bottom);
    }

    public static PorterDuff.Mode e(int i10, PorterDuff.Mode mode) {
        if (i10 == 3) {
            return PorterDuff.Mode.SRC_OVER;
        }
        if (i10 == 5) {
            return PorterDuff.Mode.SRC_IN;
        }
        if (i10 == 9) {
            return PorterDuff.Mode.SRC_ATOP;
        }
        switch (i10) {
            case 14:
                return PorterDuff.Mode.MULTIPLY;
            case 15:
                return PorterDuff.Mode.SCREEN;
            case 16:
                return PorterDuff.Mode.ADD;
            default:
                return mode;
        }
    }
}
