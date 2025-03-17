package x2;

import H2.d;
import android.graphics.BlendMode;
import android.graphics.Paint;
import android.graphics.Rect;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    private static final ThreadLocal<d<Rect, Rect>> f31840a = new ThreadLocal<>();

    static class a {
        static boolean a(Paint paint, String str) {
            return paint.hasGlyph(str);
        }
    }

    static class b {
        static void a(Paint paint, Object obj) {
            paint.setBlendMode((BlendMode) obj);
        }
    }

    public static boolean a(Paint paint, String str) {
        return a.a(paint, str);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: android.graphics.PorterDuffXfermode} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v1, resolved type: android.graphics.PorterDuffXfermode} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v3, resolved type: android.graphics.PorterDuffXfermode} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v4, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v5, resolved type: android.graphics.PorterDuffXfermode} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v6, resolved type: android.graphics.PorterDuffXfermode} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean b(android.graphics.Paint r4, x2.C6242a r5) {
        /*
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 29
            r2 = 1
            r3 = 0
            if (r0 < r1) goto L_0x0012
            if (r5 == 0) goto L_0x000e
            java.lang.Object r3 = x2.C6243b.C0492b.a(r5)
        L_0x000e:
            x2.e.b.a(r4, r3)
            return r2
        L_0x0012:
            if (r5 == 0) goto L_0x0027
            android.graphics.PorterDuff$Mode r5 = x2.C6243b.a(r5)
            if (r5 == 0) goto L_0x001f
            android.graphics.PorterDuffXfermode r3 = new android.graphics.PorterDuffXfermode
            r3.<init>(r5)
        L_0x001f:
            r4.setXfermode(r3)
            if (r5 == 0) goto L_0x0025
            goto L_0x0026
        L_0x0025:
            r2 = 0
        L_0x0026:
            return r2
        L_0x0027:
            r4.setXfermode(r3)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: x2.e.b(android.graphics.Paint, x2.a):boolean");
    }
}
