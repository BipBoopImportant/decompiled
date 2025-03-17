package G6;

import H6.c;
import android.graphics.Color;
import android.graphics.PointF;
import java.util.ArrayList;
import java.util.List;

class s {

    /* renamed from: a  reason: collision with root package name */
    private static final c.a f36213a = c.a.a("x", "y");

    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f36214a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                H6.c$b[] r0 = H6.c.b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f36214a = r0
                H6.c$b r1 = H6.c.b.NUMBER     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f36214a     // Catch:{ NoSuchFieldError -> 0x001d }
                H6.c$b r1 = H6.c.b.BEGIN_ARRAY     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f36214a     // Catch:{ NoSuchFieldError -> 0x0028 }
                H6.c$b r1 = H6.c.b.BEGIN_OBJECT     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: G6.s.a.<clinit>():void");
        }
    }

    private static PointF a(c cVar, float f10) {
        cVar.d();
        float d22 = (float) cVar.d2();
        float d23 = (float) cVar.d2();
        while (cVar.i() != c.b.END_ARRAY) {
            cVar.a0();
        }
        cVar.f();
        return new PointF(d22 * f10, d23 * f10);
    }

    private static PointF b(c cVar, float f10) {
        float d22 = (float) cVar.d2();
        float d23 = (float) cVar.d2();
        while (cVar.hasNext()) {
            cVar.a0();
        }
        return new PointF(d22 * f10, d23 * f10);
    }

    private static PointF c(c cVar, float f10) {
        cVar.e();
        float f11 = 0.0f;
        float f12 = 0.0f;
        while (cVar.hasNext()) {
            int n10 = cVar.n(f36213a);
            if (n10 == 0) {
                f11 = g(cVar);
            } else if (n10 != 1) {
                cVar.o();
                cVar.a0();
            } else {
                f12 = g(cVar);
            }
        }
        cVar.g();
        return new PointF(f11 * f10, f12 * f10);
    }

    static int d(c cVar) {
        cVar.d();
        int d22 = (int) (cVar.d2() * 255.0d);
        int d23 = (int) (cVar.d2() * 255.0d);
        int d24 = (int) (cVar.d2() * 255.0d);
        while (cVar.hasNext()) {
            cVar.a0();
        }
        cVar.f();
        return Color.argb(255, d22, d23, d24);
    }

    static PointF e(c cVar, float f10) {
        int i10 = a.f36214a[cVar.i().ordinal()];
        if (i10 == 1) {
            return b(cVar, f10);
        }
        if (i10 == 2) {
            return a(cVar, f10);
        }
        if (i10 == 3) {
            return c(cVar, f10);
        }
        throw new IllegalArgumentException("Unknown point starts with " + cVar.i());
    }

    static List<PointF> f(c cVar, float f10) {
        ArrayList arrayList = new ArrayList();
        cVar.d();
        while (cVar.i() == c.b.BEGIN_ARRAY) {
            cVar.d();
            arrayList.add(e(cVar, f10));
            cVar.f();
        }
        cVar.f();
        return arrayList;
    }

    static float g(c cVar) {
        c.b i10 = cVar.i();
        int i11 = a.f36214a[i10.ordinal()];
        if (i11 == 1) {
            return (float) cVar.d2();
        }
        if (i11 == 2) {
            cVar.d();
            float d22 = (float) cVar.d2();
            while (cVar.hasNext()) {
                cVar.a0();
            }
            cVar.f();
            return d22;
        }
        throw new IllegalArgumentException("Unknown value for token of type " + i10);
    }
}
