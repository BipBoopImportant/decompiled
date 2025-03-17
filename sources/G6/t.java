package G6;

import H6.c;
import I6.i;
import I6.j;
import K2.a;
import android.graphics.PointF;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import j0.c0;
import java.lang.ref.WeakReference;
import w6.C8923e;
import w6.C8927i;

class t {

    /* renamed from: a  reason: collision with root package name */
    private static final Interpolator f36215a = new LinearInterpolator();

    /* renamed from: b  reason: collision with root package name */
    private static c0<WeakReference<Interpolator>> f36216b;

    /* renamed from: c  reason: collision with root package name */
    static c.a f36217c = c.a.a("t", "s", "e", "o", "i", "h", "to", "ti");

    /* renamed from: d  reason: collision with root package name */
    static c.a f36218d = c.a.a("x", "y");

    t() {
    }

    private static WeakReference<Interpolator> a(int i10) {
        WeakReference<Interpolator> e10;
        synchronized (t.class) {
            e10 = g().e(i10);
        }
        return e10;
    }

    private static Interpolator b(PointF pointF, PointF pointF2) {
        Interpolator a10;
        pointF.x = i.b(pointF.x, -1.0f, 1.0f);
        pointF.y = i.b(pointF.y, -100.0f, 100.0f);
        pointF2.x = i.b(pointF2.x, -1.0f, 1.0f);
        float b10 = i.b(pointF2.y, -100.0f, 100.0f);
        pointF2.y = b10;
        int i10 = j.i(pointF.x, pointF.y, pointF2.x, b10);
        Interpolator interpolator = null;
        WeakReference<Interpolator> a11 = C8923e.e() ? null : a(i10);
        if (a11 != null) {
            interpolator = a11.get();
        }
        if (a11 == null || interpolator == null) {
            try {
                a10 = a.a(pointF.x, pointF.y, pointF2.x, pointF2.y);
            } catch (IllegalArgumentException e10) {
                a10 = "The Path cannot loop back on itself.".equals(e10.getMessage()) ? a.a(Math.min(pointF.x, 1.0f), pointF.y, Math.max(pointF2.x, 0.0f), pointF2.y) : new LinearInterpolator();
            }
            interpolator = a10;
            if (!C8923e.e()) {
                try {
                    h(i10, new WeakReference(interpolator));
                } catch (ArrayIndexOutOfBoundsException unused) {
                }
            }
        }
        return interpolator;
    }

    static <T> J6.a<T> c(c cVar, C8927i iVar, float f10, N<T> n10, boolean z10, boolean z11) {
        return (!z10 || !z11) ? z10 ? d(iVar, cVar, f10, n10) : f(cVar, f10, n10) : e(iVar, cVar, f10, n10);
    }

    private static <T> J6.a<T> d(C8927i iVar, c cVar, float f10, N<T> n10) {
        Interpolator interpolator;
        T t10;
        cVar.e();
        PointF pointF = null;
        T t11 = null;
        T t12 = null;
        PointF pointF2 = null;
        PointF pointF3 = null;
        float f11 = 0.0f;
        boolean z10 = false;
        PointF pointF4 = null;
        while (cVar.hasNext()) {
            switch (cVar.n(f36217c)) {
                case 0:
                    f11 = (float) cVar.d2();
                    break;
                case 1:
                    t12 = n10.a(cVar, f10);
                    break;
                case 2:
                    t11 = n10.a(cVar, f10);
                    break;
                case 3:
                    pointF = s.e(cVar, 1.0f);
                    break;
                case 4:
                    pointF4 = s.e(cVar, 1.0f);
                    break;
                case 5:
                    if (cVar.G0() != 1) {
                        z10 = false;
                        break;
                    } else {
                        z10 = true;
                        break;
                    }
                case 6:
                    pointF2 = s.e(cVar, f10);
                    break;
                case 7:
                    pointF3 = s.e(cVar, f10);
                    break;
                default:
                    cVar.a0();
                    break;
            }
        }
        cVar.g();
        if (z10) {
            interpolator = f36215a;
            t10 = t12;
        } else {
            interpolator = (pointF == null || pointF4 == null) ? f36215a : b(pointF, pointF4);
            t10 = t11;
        }
        J6.a aVar = new J6.a(iVar, t12, t10, interpolator, f11, (Float) null);
        aVar.f37364o = pointF2;
        aVar.f37365p = pointF3;
        return aVar;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00e0, code lost:
        r14 = r3;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static <T> J6.a<T> e(w6.C8927i r21, H6.c r22, float r23, G6.N<T> r24) {
        /*
            r0 = r22
            r1 = r23
            r2 = r24
            r22.e()
            r3 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
        L_0x0016:
            boolean r17 = r22.hasNext()
            if (r17 == 0) goto L_0x01a5
            H6.c$a r4 = f36217c
            int r4 = r0.n(r4)
            r5 = 1
            switch(r4) {
                case 0: goto L_0x019a;
                case 1: goto L_0x018f;
                case 2: goto L_0x0184;
                case 3: goto L_0x00ef;
                case 4: goto L_0x003e;
                case 5: goto L_0x0034;
                case 6: goto L_0x002f;
                case 7: goto L_0x002a;
                default: goto L_0x0026;
            }
        L_0x0026:
            r22.a0()
            goto L_0x0016
        L_0x002a:
            android.graphics.PointF r3 = G6.s.e(r22, r23)
            goto L_0x0016
        L_0x002f:
            android.graphics.PointF r15 = G6.s.e(r22, r23)
            goto L_0x0016
        L_0x0034:
            int r4 = r22.G0()
            if (r4 != r5) goto L_0x003c
            r6 = r5
            goto L_0x0016
        L_0x003c:
            r6 = 0
            goto L_0x0016
        L_0x003e:
            H6.c$b r4 = r22.i()
            H6.c$b r5 = H6.c.b.BEGIN_OBJECT
            if (r4 != r5) goto L_0x00e5
            r22.e()
            r4 = 0
            r5 = 0
            r12 = 0
            r13 = 0
        L_0x004d:
            boolean r18 = r22.hasNext()
            if (r18 == 0) goto L_0x00cc
            r18 = r15
            H6.c$a r15 = f36218d
            int r15 = r0.n(r15)
            if (r15 == 0) goto L_0x009f
            r19 = r3
            r3 = 1
            if (r15 == r3) goto L_0x006a
            r22.a0()
        L_0x0065:
            r15 = r18
            r3 = r19
            goto L_0x004d
        L_0x006a:
            H6.c$b r3 = r22.i()
            H6.c$b r5 = H6.c.b.NUMBER
            if (r3 != r5) goto L_0x007b
            r3 = r14
            double r13 = r22.d2()
            float r13 = (float) r13
            r14 = r3
            r5 = r13
            goto L_0x0065
        L_0x007b:
            r3 = r14
            r22.d()
            double r13 = r22.d2()
            float r13 = (float) r13
            H6.c$b r14 = r22.i()
            if (r14 != r5) goto L_0x0090
            double r14 = r22.d2()
            float r5 = (float) r14
            goto L_0x0091
        L_0x0090:
            r5 = r13
        L_0x0091:
            r22.f()
            r14 = r3
            r15 = r18
            r3 = r19
            r20 = r13
            r13 = r5
            r5 = r20
            goto L_0x004d
        L_0x009f:
            r19 = r3
            r3 = r14
            H6.c$b r4 = r22.i()
            H6.c$b r12 = H6.c.b.NUMBER
            if (r4 != r12) goto L_0x00b2
            double r14 = r22.d2()
            float r12 = (float) r14
            r14 = r3
            r4 = r12
            goto L_0x0065
        L_0x00b2:
            r22.d()
            double r14 = r22.d2()
            float r4 = (float) r14
            H6.c$b r14 = r22.i()
            if (r14 != r12) goto L_0x00c6
            double r14 = r22.d2()
            float r12 = (float) r14
            goto L_0x00c7
        L_0x00c6:
            r12 = r4
        L_0x00c7:
            r22.f()
            r14 = r3
            goto L_0x0065
        L_0x00cc:
            r19 = r3
            r3 = r14
            r18 = r15
            android.graphics.PointF r14 = new android.graphics.PointF
            r14.<init>(r4, r5)
            android.graphics.PointF r4 = new android.graphics.PointF
            r4.<init>(r12, r13)
            r22.g()
            r13 = r4
            r12 = r14
        L_0x00e0:
            r14 = r3
        L_0x00e1:
            r3 = r19
            goto L_0x0016
        L_0x00e5:
            r19 = r3
            r3 = r14
            r18 = r15
            android.graphics.PointF r8 = G6.s.e(r22, r23)
            goto L_0x00e1
        L_0x00ef:
            r19 = r3
            r3 = r14
            r18 = r15
            H6.c$b r4 = r22.i()
            H6.c$b r5 = H6.c.b.BEGIN_OBJECT
            if (r4 != r5) goto L_0x017b
            r22.e()
            r4 = 0
            r5 = 0
            r9 = 0
            r11 = 0
        L_0x0103:
            boolean r14 = r22.hasNext()
            if (r14 == 0) goto L_0x0168
            H6.c$a r14 = f36218d
            int r14 = r0.n(r14)
            if (r14 == 0) goto L_0x0140
            r15 = 1
            if (r14 == r15) goto L_0x0118
            r22.a0()
            goto L_0x0103
        L_0x0118:
            H6.c$b r5 = r22.i()
            H6.c$b r11 = H6.c.b.NUMBER
            if (r5 != r11) goto L_0x0127
            double r14 = r22.d2()
            float r11 = (float) r14
            r5 = r11
            goto L_0x0103
        L_0x0127:
            r22.d()
            double r14 = r22.d2()
            float r5 = (float) r14
            H6.c$b r14 = r22.i()
            if (r14 != r11) goto L_0x013b
            double r14 = r22.d2()
            float r11 = (float) r14
            goto L_0x013c
        L_0x013b:
            r11 = r5
        L_0x013c:
            r22.f()
            goto L_0x0103
        L_0x0140:
            H6.c$b r4 = r22.i()
            H6.c$b r9 = H6.c.b.NUMBER
            if (r4 != r9) goto L_0x014f
            double r14 = r22.d2()
            float r9 = (float) r14
            r4 = r9
            goto L_0x0103
        L_0x014f:
            r22.d()
            double r14 = r22.d2()
            float r4 = (float) r14
            H6.c$b r14 = r22.i()
            if (r14 != r9) goto L_0x0163
            double r14 = r22.d2()
            float r9 = (float) r14
            goto L_0x0164
        L_0x0163:
            r9 = r4
        L_0x0164:
            r22.f()
            goto L_0x0103
        L_0x0168:
            android.graphics.PointF r14 = new android.graphics.PointF
            r14.<init>(r4, r5)
            android.graphics.PointF r4 = new android.graphics.PointF
            r4.<init>(r9, r11)
            r22.g()
            r11 = r4
            r9 = r14
            r15 = r18
            goto L_0x00e0
        L_0x017b:
            android.graphics.PointF r7 = G6.s.e(r22, r23)
            r14 = r3
            r15 = r18
            goto L_0x00e1
        L_0x0184:
            r19 = r3
            r3 = r14
            r18 = r15
            java.lang.Object r16 = r2.a(r0, r1)
            goto L_0x00e1
        L_0x018f:
            r19 = r3
            r3 = r14
            r18 = r15
            java.lang.Object r10 = r2.a(r0, r1)
            goto L_0x00e1
        L_0x019a:
            r19 = r3
            r18 = r15
            double r3 = r22.d2()
            float r14 = (float) r3
            goto L_0x00e1
        L_0x01a5:
            r19 = r3
            r3 = r14
            r18 = r15
            r22.g()
            if (r6 == 0) goto L_0x01b5
            android.view.animation.Interpolator r0 = f36215a
            r11 = r10
        L_0x01b2:
            r12 = 0
            r13 = 0
            goto L_0x01d9
        L_0x01b5:
            if (r7 == 0) goto L_0x01c0
            if (r8 == 0) goto L_0x01c0
            android.view.animation.Interpolator r0 = b(r7, r8)
        L_0x01bd:
            r11 = r16
            goto L_0x01b2
        L_0x01c0:
            if (r9 == 0) goto L_0x01d6
            if (r11 == 0) goto L_0x01d6
            if (r12 == 0) goto L_0x01d6
            if (r13 == 0) goto L_0x01d6
            android.view.animation.Interpolator r0 = b(r9, r12)
            android.view.animation.Interpolator r1 = b(r11, r13)
            r12 = r0
            r13 = r1
            r11 = r16
            r0 = 0
            goto L_0x01d9
        L_0x01d6:
            android.view.animation.Interpolator r0 = f36215a
            goto L_0x01bd
        L_0x01d9:
            if (r12 == 0) goto L_0x01ea
            if (r13 == 0) goto L_0x01ea
            J6.a r0 = new J6.a
            r15 = 0
            r8 = r0
            r9 = r21
            r14 = r3
            r1 = r18
            r8.<init>(r9, r10, r11, r12, r13, r14, r15)
            goto L_0x01f8
        L_0x01ea:
            r1 = r18
            J6.a r2 = new J6.a
            r14 = 0
            r8 = r2
            r9 = r21
            r12 = r0
            r13 = r3
            r8.<init>(r9, r10, r11, r12, r13, r14)
            r0 = r2
        L_0x01f8:
            r0.f37364o = r1
            r3 = r19
            r0.f37365p = r3
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: G6.t.e(w6.i, H6.c, float, G6.N):J6.a");
    }

    private static <T> J6.a<T> f(c cVar, float f10, N<T> n10) {
        return new J6.a<>(n10.a(cVar, f10));
    }

    private static c0<WeakReference<Interpolator>> g() {
        if (f36216b == null) {
            f36216b = new c0<>();
        }
        return f36216b;
    }

    private static void h(int i10, WeakReference<Interpolator> weakReference) {
        synchronized (t.class) {
            f36216b.l(i10, weakReference);
        }
    }
}
