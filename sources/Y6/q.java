package y6;

import B6.a;
import D6.n;
import E6.b;
import android.graphics.PointF;
import com.airbnb.lottie.o;
import java.util.ArrayList;
import java.util.List;
import z6.C9019a;

public class q implements s, C9019a.b {

    /* renamed from: a  reason: collision with root package name */
    private final o f57962a;

    /* renamed from: b  reason: collision with root package name */
    private final String f57963b;

    /* renamed from: c  reason: collision with root package name */
    private final C9019a<Float, Float> f57964c;

    /* renamed from: d  reason: collision with root package name */
    private D6.o f57965d;

    public q(o oVar, b bVar, n nVar) {
        this.f57962a = oVar;
        this.f57963b = nVar.c();
        C9019a<Float, Float> h10 = nVar.b().h();
        this.f57964c = h10;
        bVar.i(h10);
        h10.a(this);
    }

    private static int c(int i10, int i11) {
        int i12 = i10 / i11;
        return ((i10 ^ i11) >= 0 || i11 * i12 == i10) ? i12 : i12 - 1;
    }

    private static int f(int i10, int i11) {
        return i10 - (c(i10, i11) * i11);
    }

    private D6.o i(D6.o oVar) {
        List<a> a10 = oVar.a();
        boolean d10 = oVar.d();
        int size = a10.size() - 1;
        int i10 = 0;
        while (size >= 0) {
            a aVar = a10.get(size);
            a aVar2 = a10.get(f(size - 1, a10.size()));
            PointF c10 = (size != 0 || d10) ? aVar2.c() : oVar.b();
            i10 = (!((size != 0 || d10) ? aVar2.b() : c10).equals(c10) || !aVar.a().equals(c10) || (!oVar.d() && (size == 0 || size == a10.size() - 1))) ? i10 + 1 : i10 + 2;
            size--;
        }
        D6.o oVar2 = this.f57965d;
        if (oVar2 == null || oVar2.a().size() != i10) {
            ArrayList arrayList = new ArrayList(i10);
            for (int i11 = 0; i11 < i10; i11++) {
                arrayList.add(new a());
            }
            this.f57965d = new D6.o(new PointF(0.0f, 0.0f), false, arrayList);
        }
        this.f57965d.e(d10);
        return this.f57965d;
    }

    public void a() {
        this.f57962a.invalidateSelf();
    }

    public void b(List<C8986c> list, List<C8986c> list2) {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x009c, code lost:
        if (r7 != (r0.size() - 1)) goto L_0x009f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public D6.o d(D6.o r19) {
        /*
            r18 = this;
            java.util.List r0 = r19.a()
            int r1 = r0.size()
            r2 = 2
            if (r1 > r2) goto L_0x000c
            return r19
        L_0x000c:
            r1 = r18
            z6.a<java.lang.Float, java.lang.Float> r2 = r1.f57964c
            java.lang.Object r2 = r2.h()
            java.lang.Float r2 = (java.lang.Float) r2
            float r2 = r2.floatValue()
            r3 = 0
            int r3 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r3 != 0) goto L_0x0020
            return r19
        L_0x0020:
            D6.o r3 = r18.i(r19)
            android.graphics.PointF r4 = r19.b()
            float r4 = r4.x
            android.graphics.PointF r5 = r19.b()
            float r5 = r5.y
            r3.f(r4, r5)
            java.util.List r4 = r3.a()
            boolean r5 = r19.d()
            r7 = 0
            r8 = 0
        L_0x003d:
            int r9 = r0.size()
            if (r7 >= r9) goto L_0x0195
            java.lang.Object r9 = r0.get(r7)
            B6.a r9 = (B6.a) r9
            int r10 = r7 + -1
            int r11 = r0.size()
            int r10 = f(r10, r11)
            java.lang.Object r10 = r0.get(r10)
            B6.a r10 = (B6.a) r10
            int r11 = r7 + -2
            int r12 = r0.size()
            int r11 = f(r11, r12)
            java.lang.Object r11 = r0.get(r11)
            B6.a r11 = (B6.a) r11
            if (r7 != 0) goto L_0x0072
            if (r5 != 0) goto L_0x0072
            android.graphics.PointF r12 = r19.b()
            goto L_0x0076
        L_0x0072:
            android.graphics.PointF r12 = r10.c()
        L_0x0076:
            if (r7 != 0) goto L_0x007c
            if (r5 != 0) goto L_0x007c
            r13 = r12
            goto L_0x0080
        L_0x007c:
            android.graphics.PointF r13 = r10.b()
        L_0x0080:
            android.graphics.PointF r14 = r9.a()
            android.graphics.PointF r11 = r11.c()
            android.graphics.PointF r15 = r9.c()
            boolean r16 = r19.d()
            if (r16 != 0) goto L_0x009f
            r16 = 1
            if (r7 == 0) goto L_0x00a1
            int r17 = r0.size()
            int r6 = r17 + -1
            if (r7 != r6) goto L_0x009f
            goto L_0x00a1
        L_0x009f:
            r16 = 0
        L_0x00a1:
            boolean r6 = r13.equals(r12)
            if (r6 == 0) goto L_0x0146
            boolean r6 = r14.equals(r12)
            if (r6 == 0) goto L_0x0146
            if (r16 != 0) goto L_0x0146
            float r6 = r12.x
            float r9 = r11.x
            float r9 = r6 - r9
            float r10 = r12.y
            float r13 = r11.y
            float r13 = r10 - r13
            float r14 = r15.x
            float r14 = r14 - r6
            float r6 = r15.y
            float r6 = r6 - r10
            double r9 = (double) r9
            r16 = r0
            double r0 = (double) r13
            double r0 = java.lang.Math.hypot(r9, r0)
            float r0 = (float) r0
            double r9 = (double) r14
            double r13 = (double) r6
            double r9 = java.lang.Math.hypot(r9, r13)
            float r1 = (float) r9
            float r0 = r2 / r0
            r6 = 1056964608(0x3f000000, float:0.5)
            float r0 = java.lang.Math.min(r0, r6)
            float r1 = r2 / r1
            float r1 = java.lang.Math.min(r1, r6)
            float r6 = r12.x
            float r9 = r11.x
            float r9 = r9 - r6
            float r9 = r9 * r0
            float r9 = r9 + r6
            float r10 = r12.y
            float r11 = r11.y
            float r11 = r11 - r10
            float r11 = r11 * r0
            float r11 = r11 + r10
            float r0 = r15.x
            float r0 = r0 - r6
            float r0 = r0 * r1
            float r0 = r0 + r6
            float r12 = r15.y
            float r12 = r12 - r10
            float r12 = r12 * r1
            float r12 = r12 + r10
            float r1 = r9 - r6
            r13 = 1057835346(0x3f0d4952, float:0.5519)
            float r1 = r1 * r13
            float r1 = r9 - r1
            float r14 = r11 - r10
            float r14 = r14 * r13
            float r14 = r11 - r14
            float r6 = r0 - r6
            float r6 = r6 * r13
            float r6 = r0 - r6
            float r10 = r12 - r10
            float r10 = r10 * r13
            float r10 = r12 - r10
            int r13 = r8 + -1
            int r15 = r4.size()
            int r13 = f(r13, r15)
            java.lang.Object r13 = r4.get(r13)
            B6.a r13 = (B6.a) r13
            java.lang.Object r15 = r4.get(r8)
            B6.a r15 = (B6.a) r15
            r13.e(r9, r11)
            r13.f(r9, r11)
            if (r7 != 0) goto L_0x012f
            r3.f(r9, r11)
        L_0x012f:
            r15.d(r1, r14)
            int r1 = r8 + 1
            java.lang.Object r1 = r4.get(r1)
            B6.a r1 = (B6.a) r1
            r15.e(r6, r10)
            r15.f(r0, r12)
            r1.d(r0, r12)
            int r8 = r8 + 2
            goto L_0x018d
        L_0x0146:
            r16 = r0
            int r0 = r8 + -1
            int r1 = r4.size()
            int r0 = f(r0, r1)
            java.lang.Object r0 = r4.get(r0)
            B6.a r0 = (B6.a) r0
            java.lang.Object r1 = r4.get(r8)
            B6.a r1 = (B6.a) r1
            android.graphics.PointF r6 = r10.b()
            float r6 = r6.x
            android.graphics.PointF r11 = r10.b()
            float r11 = r11.y
            r0.e(r6, r11)
            android.graphics.PointF r6 = r10.c()
            float r6 = r6.x
            android.graphics.PointF r10 = r10.c()
            float r10 = r10.y
            r0.f(r6, r10)
            android.graphics.PointF r0 = r9.a()
            float r0 = r0.x
            android.graphics.PointF r6 = r9.a()
            float r6 = r6.y
            r1.d(r0, r6)
            int r8 = r8 + 1
        L_0x018d:
            int r7 = r7 + 1
            r1 = r18
            r0 = r16
            goto L_0x003d
        L_0x0195:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: y6.q.d(D6.o):D6.o");
    }

    public C9019a<Float, Float> h() {
        return this.f57964c;
    }
}
