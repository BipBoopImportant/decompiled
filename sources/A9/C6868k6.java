package a9;

import a9.I3;
import kotlin.jvm.internal.C17542s;

/* renamed from: a9.k6  reason: case insensitive filesystem */
public final class C6868k6 {

    /* renamed from: a  reason: collision with root package name */
    public final X5 f42662a;

    /* renamed from: b  reason: collision with root package name */
    public final C6855j1 f42663b;

    /* renamed from: c  reason: collision with root package name */
    public final C6873l3 f42664c;

    /* renamed from: d  reason: collision with root package name */
    public final N2 f42665d;

    /* renamed from: e  reason: collision with root package name */
    public final I3.a f42666e;

    /* renamed from: f  reason: collision with root package name */
    public final S2 f42667f;

    /* renamed from: g  reason: collision with root package name */
    public final C6809d3 f42668g;

    /* renamed from: h  reason: collision with root package name */
    public final C5 f42669h;

    /* renamed from: i  reason: collision with root package name */
    public final C6804c6 f42670i;

    public C6868k6() {
        X5 x52 = new X5();
        C6855j1 j1Var = new C6855j1();
        C6873l3 l3Var = new C6873l3();
        N2 n22 = new N2(0);
        I3.a aVar = new I3.a();
        S2 s22 = new S2();
        C6809d3 d3Var = new C6809d3();
        C5 c52 = new C5();
        C6804c6 c6Var = new C6804c6();
        C17542s.j(x52, "recyclableBitmapScale");
        C17542s.j(j1Var, "perceptualHashGenerator");
        C17542s.j(l3Var, "bitmapHashCache");
        C17542s.j(n22, "bitmapChangeDetector");
        C17542s.j(aVar, "bitmapPixelFactory");
        C17542s.j(s22, "bitmapColorAnalyzer");
        C17542s.j(d3Var, "bitmapCompressor");
        C17542s.j(c52, "viewMasker");
        C17542s.j(c6Var, "reduceBorderBetweenViews");
        this.f42662a = x52;
        this.f42663b = j1Var;
        this.f42664c = l3Var;
        this.f42665d = n22;
        this.f42666e = aVar;
        this.f42667f = s22;
        this.f42668g = d3Var;
        this.f42669h = c52;
        this.f42670i = c6Var;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:99:0x03cd, code lost:
        if (r6 > 16) goto L_0x03cf;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(z8.C9036b r35, a9.C6824f2.c r36) {
        /*
            r34 = this;
            r1 = r34
            r2 = r35
            r0 = r36
            boolean r3 = r35.D()
            r4 = 0
            r5 = 0
            if (r3 == 0) goto L_0x0019
            r2.J(r5)
            r2.f0(r4)
            r2.Q(r4)
            goto L_0x0499
        L_0x0019:
            r36.getClass()
            java.lang.String r3 = "view"
            kotlin.jvm.internal.C17542s.j(r2, r3)
            int r3 = r35.p()
            float r3 = (float) r3
            float r6 = r0.f42553c
            float r3 = r3 / r6
            int r3 = pI.C17752b.e(r3)
            int r6 = r35.q()
            float r6 = (float) r6
            float r7 = r0.f42553c
            float r6 = r6 / r7
            int r6 = pI.C17752b.e(r6)
            int r7 = r35.w()
            float r7 = (float) r7
            float r8 = r0.f42553c
            float r7 = r7 / r8
            int r7 = pI.C17752b.e(r7)
            int r8 = r35.l()
            float r8 = (float) r8
            float r9 = r0.f42553c
            float r8 = r8 / r9
            int r8 = pI.C17752b.e(r8)
            a9.w0 r9 = r0.f42552b
            a9.w0 r10 = r0.f42551a
            android.graphics.Bitmap r10 = r10.f42915c
            r9.getClass()
            java.lang.String r11 = "bitmapSource"
            kotlin.jvm.internal.C17542s.j(r10, r11)
            r9.a(r7, r8)
            android.graphics.Rect r12 = r9.f42918f
            int r13 = r3 + r7
            int r14 = r6 + r8
            r12.set(r3, r6, r13, r14)
            android.graphics.Rect r12 = r9.f42919g
            r12.set(r5, r5, r7, r8)
            android.graphics.Canvas r7 = r9.f42914b
            android.graphics.Rect r8 = r9.f42918f
            android.graphics.Rect r12 = r9.f42919g
            android.graphics.Paint r9 = r9.f42916d
            r7.drawBitmap(r10, r8, r12, r9)
            a9.w0 r7 = r0.f42551a
            android.graphics.Canvas r15 = r7.f42914b
            float r3 = (float) r3
            float r6 = (float) r6
            float r8 = (float) r13
            float r9 = (float) r14
            android.graphics.Paint r7 = r7.f42917e
            r16 = r3
            r17 = r6
            r18 = r8
            r19 = r9
            r20 = r7
            r15.drawRect(r16, r17, r18, r19, r20)
            a9.w0 r0 = r0.f42552b
            android.graphics.Bitmap r0 = r0.f42915c
            java.lang.CharSequence r3 = r35.s()
            r6 = 3
            r7 = 1
            if (r3 == 0) goto L_0x00a6
            int r3 = r3.length()
            if (r3 > r6) goto L_0x00a6
            r3 = r7
            goto L_0x00a7
        L_0x00a6:
            r3 = r5
        L_0x00a7:
            if (r3 == 0) goto L_0x00ab
            r10 = 4
            goto L_0x00ad
        L_0x00ab:
            r10 = 8
        L_0x00ad:
            if (r3 == 0) goto L_0x00b1
            r3 = 4
            goto L_0x00b3
        L_0x00b1:
            r3 = 8
        L_0x00b3:
            a9.X5 r12 = r1.f42662a
            int r13 = r0.getWidth()
            int r10 = java.lang.Math.min(r10, r13)
            int r13 = r0.getHeight()
            int r3 = java.lang.Math.min(r3, r13)
            r12.getClass()
            kotlin.jvm.internal.C17542s.j(r0, r11)
            int r13 = r0.getWidth()
            int r14 = r0.getHeight()
            r12.f42395c = r5
            java.lang.String r15 = "paint"
            if (r13 > r10) goto L_0x012f
            if (r14 <= r3) goto L_0x00dc
            goto L_0x012f
        L_0x00dc:
            java.util.ArrayList r13 = r12.f42394b
            int r13 = r13.size()
            if (r13 <= 0) goto L_0x00f0
            java.util.ArrayList r13 = r12.f42394b
            java.lang.Object r13 = r13.get(r5)
            a9.w0 r13 = (a9.C6957w0) r13
            r13.a(r10, r3)
            goto L_0x00fa
        L_0x00f0:
            a9.F0 r13 = r12.f42393a
            r13.getClass()
            a9.w0 r13 = new a9.w0
            r13.<init>(r10, r3)
        L_0x00fa:
            kotlin.jvm.internal.C17542s.j(r0, r11)
            android.graphics.Paint r14 = r13.f42916d
            kotlin.jvm.internal.C17542s.j(r0, r11)
            kotlin.jvm.internal.C17542s.j(r14, r15)
            r13.a(r10, r3)
            android.graphics.Rect r15 = r13.f42919g
            r15.set(r5, r5, r10, r3)
            android.graphics.Canvas r3 = r13.f42914b
            android.graphics.Rect r10 = r13.f42919g
            r3.drawBitmap(r0, r4, r10, r14)
            java.util.ArrayList r3 = r12.f42394b
            int r3 = r3.size()
            int r10 = r12.f42395c
            if (r3 <= r10) goto L_0x0124
            java.util.ArrayList r3 = r12.f42394b
            r3.set(r10, r13)
            goto L_0x0129
        L_0x0124:
            java.util.ArrayList r3 = r12.f42394b
            r3.add(r13)
        L_0x0129:
            int r3 = r12.f42395c
            int r3 = r3 + r7
            r12.f42395c = r3
            goto L_0x013a
        L_0x012f:
            if (r13 != r10) goto L_0x0133
            if (r14 == r3) goto L_0x013a
        L_0x0133:
            r7 = r2
            r20 = r6
            r2 = 8
            goto L_0x049a
        L_0x013a:
            a9.I3$a r3 = r1.f42666e
            a9.X5 r10 = r1.f42662a
            java.util.ArrayList r12 = r10.f42394b
            int r10 = r10.f42395c
            int r10 = r10 - r7
            java.lang.Object r10 = r12.get(r10)
            a9.w0 r10 = (a9.C6957w0) r10
            android.graphics.Bitmap r12 = r10.f42915c
            a9.S2 r10 = r1.f42667f
            r3.getClass()
            java.lang.String r3 = "bitmap"
            kotlin.jvm.internal.C17542s.j(r12, r3)
            java.lang.String r13 = "bitmapColorAnalyzer"
            kotlin.jvm.internal.C17542s.j(r10, r13)
            int r18 = r12.getWidth()
            int r19 = r12.getHeight()
            int r15 = r18 * r19
            int[] r14 = new int[r15]
            r16 = 0
            r17 = 0
            r20 = 0
            r13 = r14
            r8 = r14
            r14 = r20
            r6 = r15
            r15 = r18
            r12.getPixels(r13, r14, r15, r16, r17, r18, r19)
            r10.getClass()
            java.lang.String r12 = "pixels"
            kotlin.jvm.internal.C17542s.j(r8, r12)
            android.util.SparseIntArray r12 = r10.f42274a
            r12.clear()
            r12 = 0
            r4 = r5
            r13 = r4
            r14 = r13
            r15 = r14
            r16 = r15
            r17 = r16
        L_0x018c:
            r19 = 1065353216(0x3f800000, float:1.0)
            r5 = 255(0xff, float:3.57E-43)
            if (r13 >= r6) goto L_0x01c8
            r9 = r8[r13]
            int r7 = r9 >>> 24
            r21 = r3
            int r3 = r9 >> 16
            r3 = r3 & r5
            int r2 = r9 >> 8
            r2 = r2 & r5
            r5 = r9 & 255(0xff, float:3.57E-43)
            int r3 = r3 * r7
            int r17 = r3 + r17
            int r2 = r2 * r7
            int r16 = r2 + r16
            int r5 = r5 * r7
            int r15 = r15 + r5
            int r14 = r14 + r7
            int r4 = r4 + r7
            if (r7 != 0) goto L_0x01ae
            float r12 = r12 + r19
        L_0x01ae:
            r2 = 255(0xff, float:3.57E-43)
            if (r7 != r2) goto L_0x01be
            android.util.SparseIntArray r2 = r10.f42274a
            int r3 = r2.get(r9)
            r5 = 1
            int r3 = r3 + r5
            r2.put(r9, r3)
            goto L_0x01bf
        L_0x01be:
            r5 = 1
        L_0x01bf:
            int r13 = r13 + 1
            r2 = r35
            r7 = r5
            r3 = r21
            r5 = 0
            goto L_0x018c
        L_0x01c8:
            r21 = r3
            r5 = r7
            int r2 = java.lang.Math.max(r4, r5)
            int r3 = java.lang.Math.max(r6, r5)
            int r17 = r17 / r2
            int r16 = r16 / r2
            int r15 = r15 / r2
            int r14 = r14 / r3
            int r2 = r14 << 24
            r4 = 16
            int r5 = r17 << 16
            r2 = r2 | r5
            r5 = 8
            int r7 = r16 << 8
            r2 = r2 | r7
            r2 = r2 | r15
            float r3 = (float) r3
            float r12 = r12 / r3
            r10.f42275b = r12
            a9.I3 r3 = new a9.I3
            android.util.SparseIntArray r5 = r10.f42274a
            int r5 = r5.size()
            float r7 = r10.f42275b
            r3.<init>(r8, r2, r5, r7)
            a9.c6 r5 = r1.f42670i
            r5.getClass()
            java.lang.String r7 = "viewBitmap"
            kotlin.jvm.internal.C17542s.j(r0, r7)
            java.lang.String r9 = "bitmapPixel"
            kotlin.jvm.internal.C17542s.j(r3, r9)
            r10 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r12 = r2 | r10
            int r13 = r2 >> 24
            r14 = 255(0xff, float:3.57E-43)
            r13 = r13 & r14
            if (r13 == 0) goto L_0x023f
            if (r13 == r14) goto L_0x023f
            a9.w0 r14 = r5.f42486a
            int r15 = r0.getWidth()
            int r10 = r0.getHeight()
            r14.getClass()
            kotlin.jvm.internal.C17542s.j(r0, r11)
            r14.a(r15, r10)
            android.graphics.Bitmap r11 = r14.f42915c
            r11.eraseColor(r12)
            android.graphics.Rect r11 = r14.f42919g
            r12 = 0
            r11.set(r12, r12, r15, r10)
            android.graphics.Canvas r10 = r14.f42914b
            android.graphics.Rect r11 = r14.f42919g
            android.graphics.Paint r12 = r14.f42916d
            r14 = 0
            r10.drawBitmap(r0, r14, r11, r12)
            a9.w0 r0 = r5.f42486a
            android.graphics.Bitmap r0 = r0.f42915c
        L_0x023f:
            a9.C5 r5 = r1.f42669h
            a9.X5 r10 = r1.f42662a
            r5.getClass()
            kotlin.jvm.internal.C17542s.j(r0, r7)
            java.lang.String r5 = "viewLight"
            r7 = r35
            kotlin.jvm.internal.C17542s.j(r7, r5)
            java.lang.String r11 = "recyclableBitmapScale"
            kotlin.jvm.internal.C17542s.j(r10, r11)
            boolean r11 = r35.C()
            if (r11 == 0) goto L_0x0276
            java.lang.CharSequence r0 = r35.s()
            if (r0 != 0) goto L_0x0263
            r0 = 4
            goto L_0x0264
        L_0x0263:
            r0 = 2
        L_0x0264:
            int r11 = r10.f42395c
            r14 = 1
            int r11 = r11 - r14
            int r0 = java.lang.Math.min(r0, r11)
            java.util.ArrayList r10 = r10.f42394b
            java.lang.Object r0 = r10.get(r0)
            a9.w0 r0 = (a9.C6957w0) r0
            android.graphics.Bitmap r0 = r0.f42915c
        L_0x0276:
            a9.j1 r10 = r1.f42663b
            r10.getClass()
            kotlin.jvm.internal.C17542s.j(r3, r9)
            int r10 = r2 >> 16
            r11 = 255(0xff, float:3.57E-43)
            r10 = r10 & r11
            int r14 = r2 >> 8
            r14 = r14 & r11
            int r10 = r10 + r14
            r2 = r2 & r11
            int r10 = r10 + r2
            r2 = 3
            int r10 = r10 / r2
            r2 = 0
            r28 = 0
            r30 = 0
        L_0x0290:
            r32 = 1
            if (r2 >= r6) goto L_0x02ce
            r12 = r8[r2]
            int r14 = r12 >> 16
            r14 = r14 & r11
            int r15 = r12 >> 8
            r15 = r15 & r11
            int r14 = r14 + r15
            r15 = r12 & 255(0xff, float:3.57E-43)
            int r14 = r14 + r15
            r20 = 3
            int r14 = r14 / 3
            int r12 = r12 >> 24
            r12 = r12 & r11
            if (r12 <= r13) goto L_0x02b0
            long r11 = r32 << r2
            long r11 = XH.C16801H.b(r11)
            goto L_0x02b2
        L_0x02b0:
            r11 = 0
        L_0x02b2:
            long r28 = r28 + r11
            long r28 = XH.C16801H.b(r28)
            if (r14 <= r10) goto L_0x02c1
            long r11 = r32 << r2
            long r11 = XH.C16801H.b(r11)
            goto L_0x02c3
        L_0x02c1:
            r11 = 0
        L_0x02c3:
            long r30 = r30 + r11
            long r30 = XH.C16801H.b(r30)
            int r2 = r2 + 1
            r11 = 255(0xff, float:3.57E-43)
            goto L_0x0290
        L_0x02ce:
            a9.b1 r2 = new a9.b1
            int r6 = r3.f42066a
            r22 = r2
            r23 = r28
            r25 = r30
            r27 = r6
            r22.<init>(r23, r25, r27)
            a9.e3 r8 = new a9.e3
            r8.<init>(r2, r7, r0)
            java.lang.String r2 = r8.f42527g
            r7.f0(r2)
            a9.N2 r2 = r1.f42665d
            r2.getClass()
            kotlin.jvm.internal.C17542s.j(r7, r5)
            java.lang.String r10 = "currentBitmapHash"
            kotlin.jvm.internal.C17542s.j(r8, r10)
            j0.y<a9.e3> r10 = r2.f42161a
            long r11 = r35.r()
            java.lang.Object r10 = r10.d(r11)
            a9.e3 r10 = (a9.C6817e3) r10
            if (r10 == 0) goto L_0x03d8
            java.lang.String r11 = "otherBitmapHash"
            kotlin.jvm.internal.C17542s.j(r8, r11)
            boolean r11 = r8.f42524d
            boolean r12 = r10.f42524d
            if (r11 == r12) goto L_0x030f
            r11 = 0
            goto L_0x0310
        L_0x030f:
            r11 = 1
        L_0x0310:
            int r12 = r10.f42522b
            int r13 = r8.f42522b
            if (r12 != r13) goto L_0x031c
            int r12 = r10.f42523c
            int r13 = r8.f42523c
            if (r12 == r13) goto L_0x031d
        L_0x031c:
            r11 = 0
        L_0x031d:
            a9.b1 r12 = r10.f42521a
            int r12 = r12.f42461c
            int r13 = r12 >> 24
            r14 = 255(0xff, float:3.57E-43)
            r13 = r13 & r14
            int r15 = r6 >> 24
            r15 = r15 & r14
            int r13 = r13 - r15
            int r13 = java.lang.Math.abs(r13)
            r15 = 8
            if (r13 > r15) goto L_0x0357
            int r13 = r12 >> 16
            r13 = r13 & r14
            int r4 = r6 >> 16
            r4 = r4 & r14
            int r13 = r13 - r4
            int r4 = java.lang.Math.abs(r13)
            if (r4 > r15) goto L_0x0357
            int r4 = r12 >> 8
            r4 = r4 & r14
            int r13 = r6 >> 8
            r13 = r13 & r14
            int r4 = r4 - r13
            int r4 = java.lang.Math.abs(r4)
            if (r4 > r15) goto L_0x0357
            r4 = r12 & 255(0xff, float:3.57E-43)
            r6 = r6 & r14
            int r4 = r4 - r6
            int r4 = java.lang.Math.abs(r4)
            if (r4 > r15) goto L_0x0357
            goto L_0x0358
        L_0x0357:
            r11 = 0
        L_0x0358:
            java.lang.String r4 = r10.f42526f
            java.lang.String r6 = r8.f42526f
            boolean r4 = kotlin.jvm.internal.C17542s.e(r4, r6)
            if (r4 == 0) goto L_0x036c
            java.lang.String r4 = r10.f42525e
            java.lang.String r6 = r8.f42525e
            boolean r4 = kotlin.jvm.internal.C17542s.e(r4, r6)
            if (r4 != 0) goto L_0x036d
        L_0x036c:
            r11 = 0
        L_0x036d:
            a9.b1 r4 = r10.f42521a
            long r12 = r4.f42459a
            r4 = 0
            r6 = 0
        L_0x0373:
            r14 = 64
            if (r4 >= r14) goto L_0x039a
            long r14 = r12 >>> r4
            long r14 = XH.C16801H.b(r14)
            long r14 = r14 & r32
            long r14 = XH.C16801H.b(r14)
            long r22 = r28 >>> r4
            long r22 = XH.C16801H.b(r22)
            long r22 = r22 & r32
            long r22 = XH.C16801H.b(r22)
            long r14 = r14 ^ r22
            long r14 = XH.C16801H.b(r14)
            int r14 = (int) r14
            int r6 = r6 + r14
            int r4 = r4 + 1
            goto L_0x0373
        L_0x039a:
            r4 = 16
            if (r6 > r4) goto L_0x03cf
            a9.b1 r4 = r10.f42521a
            long r12 = r4.f42460b
            r4 = 0
            r6 = 0
        L_0x03a4:
            if (r4 >= r14) goto L_0x03cb
            long r22 = r12 >>> r4
            long r22 = XH.C16801H.b(r22)
            long r22 = r22 & r32
            long r22 = XH.C16801H.b(r22)
            long r24 = r30 >>> r4
            long r24 = XH.C16801H.b(r24)
            long r24 = r24 & r32
            long r24 = XH.C16801H.b(r24)
            long r22 = r22 ^ r24
            long r14 = XH.C16801H.b(r22)
            int r14 = (int) r14
            int r6 = r6 + r14
            int r4 = r4 + 1
            r14 = 64
            goto L_0x03a4
        L_0x03cb:
            r4 = 16
            if (r6 <= r4) goto L_0x03d0
        L_0x03cf:
            r11 = 0
        L_0x03d0:
            if (r11 == 0) goto L_0x03d4
            r8 = r10
            goto L_0x03d8
        L_0x03d4:
            r4 = 1
            r7.K(r4)
        L_0x03d8:
            java.lang.String r4 = r8.f42527g
            r7.f0(r4)
            long r10 = r35.r()
            java.lang.String r4 = "bitmapHash"
            kotlin.jvm.internal.C17542s.j(r8, r4)
            j0.y<a9.e3> r2 = r2.f42162b
            r2.k(r10, r8)
            kotlin.jvm.internal.C17542s.j(r7, r5)
            kotlin.jvm.internal.C17542s.j(r3, r9)
            float r2 = r35.j()
            float r2 = r19 - r2
            float r6 = r3.f42068c
            float r6 = r19 - r6
            float r6 = r6 * r2
            r7.g0(r6)
            int r2 = r3.f42067b
            r6 = 1
            if (r2 != r6) goto L_0x0415
            int r0 = r3.f42066a
            r2 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r0 = r0 | r2
            r7.J(r0)
            r2 = 0
            r7.f0(r2)
            r7.Q(r2)
            goto L_0x0499
        L_0x0415:
            r2 = 0
            int r3 = r3.f42066a
            int r3 = r3 >> 24
            r6 = 255(0xff, float:3.57E-43)
            r3 = r3 & r6
            if (r3 != 0) goto L_0x042b
            r3 = 0
            r7.J(r3)
            r7.f0(r2)
            r7.Q(r2)
            goto L_0x0499
        L_0x042b:
            java.lang.String r3 = r35.u()
            if (r3 == 0) goto L_0x0499
            a9.l3 r6 = r1.f42664c
            r6.getClass()
            kotlin.jvm.internal.C17542s.j(r3, r4)
            a9.l3$a r6 = r6.f42681a
            java.lang.Object r6 = r6.d(r3)
            if (r6 == 0) goto L_0x0445
            r7.Q(r2)
            goto L_0x0499
        L_0x0445:
            a9.d3 r2 = r1.f42668g
            r2.getClass()
            kotlin.jvm.internal.C17542s.j(r7, r5)
            r5 = r21
            kotlin.jvm.internal.C17542s.j(r0, r5)
            java.io.ByteArrayOutputStream r5 = new java.io.ByteArrayOutputStream
            r5.<init>()
            float r6 = r35.v()
            int r6 = (r6 > r19 ? 1 : (r6 == r19 ? 0 : -1))
            if (r6 != 0) goto L_0x0462
            r17 = 1
            goto L_0x0464
        L_0x0462:
            r17 = 2
        L_0x0464:
            int r6 = a9.b7.a(r17)
            if (r6 == 0) goto L_0x0473
            r8 = 1
            if (r6 == r8) goto L_0x046e
            goto L_0x0476
        L_0x046e:
            r6 = 0
        L_0x046f:
            a9.C6809d3.a(r0, r6, r5)
            goto L_0x0476
        L_0x0473:
            r6 = 10
            goto L_0x046f
        L_0x0476:
            r5.flush()     // Catch:{ IOException -> 0x047e }
            byte[] r0 = r5.toByteArray()     // Catch:{ IOException -> 0x047e }
            goto L_0x0487
        L_0x047e:
            r0 = move-exception
            D8.c r2 = r2.f42507a
            java.lang.String r5 = "Cannot encode bitmap"
            a9.H1.a(r2, r5, r0)
            r0 = 0
        L_0x0487:
            r7.Q(r0)
            a9.l3 r0 = r1.f42664c
            r0.getClass()
            kotlin.jvm.internal.C17542s.j(r3, r4)
            a9.l3$a r0 = r0.f42681a
            java.lang.Boolean r2 = java.lang.Boolean.TRUE
            r0.f(r3, r2)
        L_0x0499:
            return
        L_0x049a:
            int r13 = r13 / 2
            int r13 = java.lang.Math.max(r13, r10)
            int r14 = r14 / 2
            int r14 = java.lang.Math.max(r14, r3)
            int r4 = r12.f42395c
            java.util.ArrayList r5 = r12.f42394b
            int r5 = r5.size()
            if (r5 <= r4) goto L_0x04bc
            java.util.ArrayList r5 = r12.f42394b
            java.lang.Object r4 = r5.get(r4)
            a9.w0 r4 = (a9.C6957w0) r4
            r4.a(r13, r14)
            goto L_0x04c6
        L_0x04bc:
            a9.F0 r4 = r12.f42393a
            r4.getClass()
            a9.w0 r4 = new a9.w0
            r4.<init>(r13, r14)
        L_0x04c6:
            int r5 = r12.f42395c
            if (r5 != 0) goto L_0x04cc
            r5 = r0
            goto L_0x04d8
        L_0x04cc:
            java.util.ArrayList r6 = r12.f42394b
            int r5 = r5 + -1
            java.lang.Object r5 = r6.get(r5)
            a9.w0 r5 = (a9.C6957w0) r5
            android.graphics.Bitmap r5 = r5.f42915c
        L_0x04d8:
            android.graphics.Paint r6 = r12.f42396d
            kotlin.jvm.internal.C17542s.j(r5, r11)
            kotlin.jvm.internal.C17542s.j(r6, r15)
            r4.a(r13, r14)
            android.graphics.Rect r8 = r4.f42919g
            r9 = 0
            r8.set(r9, r9, r13, r14)
            android.graphics.Canvas r8 = r4.f42914b
            android.graphics.Rect r2 = r4.f42919g
            r9 = 0
            r8.drawBitmap(r5, r9, r2, r6)
            java.util.ArrayList r2 = r12.f42394b
            int r2 = r2.size()
            int r5 = r12.f42395c
            if (r2 <= r5) goto L_0x0501
            java.util.ArrayList r2 = r12.f42394b
            r2.set(r5, r4)
            goto L_0x0506
        L_0x0501:
            java.util.ArrayList r2 = r12.f42394b
            r2.add(r4)
        L_0x0506:
            int r2 = r12.f42395c
            r4 = 1
            int r2 = r2 + r4
            r12.f42395c = r2
            r2 = r7
            r6 = r20
            r5 = 0
            r7 = r4
            r4 = r9
            goto L_0x012f
        */
        throw new UnsupportedOperationException("Method not decompiled: a9.C6868k6.a(z8.b, a9.f2$c):void");
    }
}
