package com.squareup.picasso;

import WK.C16772g;
import WK.N;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Rect;
import android.net.NetworkInfo;
import com.squareup.picasso.r;
import com.squareup.picasso.t;
import com.squareup.picasso.y;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.squareup.picasso.c  reason: case insensitive filesystem */
class C14192c implements Runnable {

    /* renamed from: t  reason: collision with root package name */
    private static final Object f122521t = new Object();

    /* renamed from: u  reason: collision with root package name */
    private static final ThreadLocal<StringBuilder> f122522u = new a();

    /* renamed from: v  reason: collision with root package name */
    private static final AtomicInteger f122523v = new AtomicInteger();

    /* renamed from: w  reason: collision with root package name */
    private static final y f122524w = new b();

    /* renamed from: a  reason: collision with root package name */
    final int f122525a = f122523v.incrementAndGet();

    /* renamed from: b  reason: collision with root package name */
    final t f122526b;

    /* renamed from: c  reason: collision with root package name */
    final i f122527c;

    /* renamed from: d  reason: collision with root package name */
    final C14193d f122528d;

    /* renamed from: e  reason: collision with root package name */
    final A f122529e;

    /* renamed from: f  reason: collision with root package name */
    final String f122530f;

    /* renamed from: g  reason: collision with root package name */
    final w f122531g;

    /* renamed from: h  reason: collision with root package name */
    final int f122532h;

    /* renamed from: i  reason: collision with root package name */
    int f122533i;

    /* renamed from: j  reason: collision with root package name */
    final y f122534j;

    /* renamed from: k  reason: collision with root package name */
    C14190a f122535k;

    /* renamed from: l  reason: collision with root package name */
    List<C14190a> f122536l;

    /* renamed from: m  reason: collision with root package name */
    Bitmap f122537m;

    /* renamed from: n  reason: collision with root package name */
    Future<?> f122538n;

    /* renamed from: o  reason: collision with root package name */
    t.e f122539o;

    /* renamed from: p  reason: collision with root package name */
    Exception f122540p;

    /* renamed from: q  reason: collision with root package name */
    int f122541q;

    /* renamed from: r  reason: collision with root package name */
    int f122542r;

    /* renamed from: s  reason: collision with root package name */
    t.f f122543s;

    /* renamed from: com.squareup.picasso.c$a */
    static class a extends ThreadLocal<StringBuilder> {
        a() {
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public StringBuilder initialValue() {
            return new StringBuilder("Picasso-");
        }
    }

    /* renamed from: com.squareup.picasso.c$b */
    static class b extends y {
        b() {
        }

        public boolean c(w wVar) {
            return true;
        }

        public y.a f(w wVar, int i10) {
            throw new IllegalStateException("Unrecognized type of request: " + wVar);
        }
    }

    /* renamed from: com.squareup.picasso.c$c  reason: collision with other inner class name */
    static class C3021c implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ E f122544a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ RuntimeException f122545b;

        C3021c(E e10, RuntimeException runtimeException) {
            this.f122544a = e10;
            this.f122545b = runtimeException;
        }

        public void run() {
            throw new RuntimeException("Transformation " + this.f122544a.a() + " crashed with exception.", this.f122545b);
        }
    }

    /* renamed from: com.squareup.picasso.c$d */
    static class d implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ StringBuilder f122546a;

        d(StringBuilder sb2) {
            this.f122546a = sb2;
        }

        public void run() {
            throw new NullPointerException(this.f122546a.toString());
        }
    }

    /* renamed from: com.squareup.picasso.c$e */
    static class e implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ E f122547a;

        e(E e10) {
            this.f122547a = e10;
        }

        public void run() {
            throw new IllegalStateException("Transformation " + this.f122547a.a() + " returned input Bitmap but recycled it.");
        }
    }

    /* renamed from: com.squareup.picasso.c$f */
    static class f implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ E f122548a;

        f(E e10) {
            this.f122548a = e10;
        }

        public void run() {
            throw new IllegalStateException("Transformation " + this.f122548a.a() + " mutated input Bitmap but failed to recycle the original.");
        }
    }

    C14192c(t tVar, i iVar, C14193d dVar, A a10, C14190a aVar, y yVar) {
        this.f122526b = tVar;
        this.f122527c = iVar;
        this.f122528d = dVar;
        this.f122529e = a10;
        this.f122535k = aVar;
        this.f122530f = aVar.d();
        this.f122531g = aVar.i();
        this.f122543s = aVar.h();
        this.f122532h = aVar.e();
        this.f122533i = aVar.f();
        this.f122534j = yVar;
        this.f122542r = yVar.e();
    }

    static Bitmap a(List<E> list, Bitmap bitmap) {
        int size = list.size();
        int i10 = 0;
        while (i10 < size) {
            E e10 = list.get(i10);
            try {
                Bitmap b10 = e10.b(bitmap);
                if (b10 == null) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("Transformation ");
                    sb2.append(e10.a());
                    sb2.append(" returned null after ");
                    sb2.append(i10);
                    sb2.append(" previous transformation(s).\n\nTransformation list:\n");
                    for (E a10 : list) {
                        sb2.append(a10.a());
                        sb2.append(10);
                    }
                    t.f122595o.post(new d(sb2));
                    return null;
                } else if (b10 == bitmap && bitmap.isRecycled()) {
                    t.f122595o.post(new e(e10));
                    return null;
                } else if (b10 == bitmap || bitmap.isRecycled()) {
                    i10++;
                    bitmap = b10;
                } else {
                    t.f122595o.post(new f(e10));
                    return null;
                }
            } catch (RuntimeException e11) {
                t.f122595o.post(new C3021c(e10, e11));
                return null;
            }
        }
        return bitmap;
    }

    private t.f d() {
        t.f fVar = t.f.LOW;
        List<C14190a> list = this.f122536l;
        boolean z10 = list != null && !list.isEmpty();
        C14190a aVar = this.f122535k;
        if (aVar == null && !z10) {
            return fVar;
        }
        if (aVar != null) {
            fVar = aVar.h();
        }
        if (z10) {
            int size = this.f122536l.size();
            for (int i10 = 0; i10 < size; i10++) {
                t.f h10 = this.f122536l.get(i10).h();
                if (h10.ordinal() > fVar.ordinal()) {
                    fVar = h10;
                }
            }
        }
        return fVar;
    }

    static Bitmap e(N n10, w wVar) {
        C16772g d10 = WK.y.d(n10);
        boolean r10 = F.r(d10);
        boolean z10 = wVar.f122652r;
        BitmapFactory.Options d11 = y.d(wVar);
        boolean g10 = y.g(d11);
        if (!r10) {
            InputStream q32 = d10.q3();
            if (g10) {
                n nVar = new n(q32);
                nVar.c(false);
                long e10 = nVar.e(1024);
                BitmapFactory.decodeStream(nVar, (Rect) null, d11);
                y.b(wVar.f122642h, wVar.f122643i, d11, wVar);
                nVar.d(e10);
                nVar.c(true);
                q32 = nVar;
            }
            Bitmap decodeStream = BitmapFactory.decodeStream(q32, (Rect) null, d11);
            if (decodeStream != null) {
                return decodeStream;
            }
            throw new IOException("Failed to decode stream.");
        }
        byte[] R12 = d10.R1();
        if (g10) {
            BitmapFactory.decodeByteArray(R12, 0, R12.length, d11);
            y.b(wVar.f122642h, wVar.f122643i, d11, wVar);
        }
        return BitmapFactory.decodeByteArray(R12, 0, R12.length, d11);
    }

    static C14192c g(t tVar, i iVar, C14193d dVar, A a10, C14190a aVar) {
        w i10 = aVar.i();
        List<y> i11 = tVar.i();
        int size = i11.size();
        for (int i12 = 0; i12 < size; i12++) {
            y yVar = i11.get(i12);
            if (yVar.c(i10)) {
                return new C14192c(tVar, iVar, dVar, a10, aVar, yVar);
            }
        }
        return new C14192c(tVar, iVar, dVar, a10, aVar, f122524w);
    }

    static int l(int i10) {
        switch (i10) {
            case 3:
            case 4:
                return 180;
            case 5:
            case 6:
                return 90;
            case 7:
            case 8:
                return 270;
            default:
                return 0;
        }
    }

    static int m(int i10) {
        return (i10 == 2 || i10 == 7 || i10 == 4 || i10 == 5) ? -1 : 1;
    }

    private static boolean v(boolean z10, int i10, int i11, int i12, int i13) {
        return !z10 || (i12 != 0 && i10 > i12) || (i13 != 0 && i11 > i13);
    }

    /* JADX WARNING: Removed duplicated region for block: B:90:0x0250  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x0254  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static android.graphics.Bitmap y(com.squareup.picasso.w r26, android.graphics.Bitmap r27, int r28) {
        /*
            r0 = r26
            int r1 = r27.getWidth()
            int r2 = r27.getHeight()
            boolean r3 = r0.f122647m
            android.graphics.Matrix r9 = new android.graphics.Matrix
            r9.<init>()
            boolean r4 = r26.e()
            if (r4 != 0) goto L_0x001f
            if (r28 == 0) goto L_0x001a
            goto L_0x001f
        L_0x001a:
            r3 = r1
            r5 = r2
            r0 = r9
            goto L_0x0240
        L_0x001f:
            int r4 = r0.f122642h
            int r6 = r0.f122643i
            float r7 = r0.f122648n
            r8 = 0
            int r8 = (r7 > r8 ? 1 : (r7 == r8 ? 0 : -1))
            if (r8 == 0) goto L_0x0130
            double r10 = (double) r7
            double r12 = java.lang.Math.toRadians(r10)
            double r12 = java.lang.Math.cos(r12)
            double r10 = java.lang.Math.toRadians(r10)
            double r10 = java.lang.Math.sin(r10)
            boolean r4 = r0.f122651q
            if (r4 == 0) goto L_0x00c9
            float r4 = r0.f122649o
            float r6 = r0.f122650p
            r9.setRotate(r7, r4, r6)
            float r4 = r0.f122649o
            double r6 = (double) r4
            r14 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            double r14 = r14 - r12
            double r6 = r6 * r14
            float r8 = r0.f122650p
            r16 = r2
            r17 = r3
            double r2 = (double) r8
            double r2 = r2 * r10
            double r6 = r6 + r2
            double r2 = (double) r8
            double r2 = r2 * r14
            double r14 = (double) r4
            double r14 = r14 * r10
            double r2 = r2 - r14
            int r4 = r0.f122642h
            double r14 = (double) r4
            double r14 = r14 * r12
            double r14 = r14 + r6
            r18 = r6
            double r5 = (double) r4
            double r5 = r5 * r10
            double r5 = r5 + r2
            r20 = r9
            double r8 = (double) r4
            double r8 = r8 * r12
            double r7 = r18 + r8
            int r9 = r0.f122643i
            r22 = r1
            double r0 = (double) r9
            double r0 = r0 * r10
            double r7 = r7 - r0
            double r0 = (double) r4
            double r0 = r0 * r10
            double r0 = r0 + r2
            r23 = r5
            double r4 = (double) r9
            double r4 = r4 * r12
            double r0 = r0 + r4
            double r4 = (double) r9
            double r4 = r4 * r10
            double r4 = r18 - r4
            double r9 = (double) r9
            double r9 = r9 * r12
            double r9 = r9 + r2
            r11 = r18
            r18 = r9
            double r9 = java.lang.Math.max(r11, r14)
            double r9 = java.lang.Math.max(r7, r9)
            double r9 = java.lang.Math.max(r4, r9)
            double r11 = java.lang.Math.min(r11, r14)
            double r6 = java.lang.Math.min(r7, r11)
            double r4 = java.lang.Math.min(r4, r6)
            r6 = r23
            double r11 = java.lang.Math.max(r2, r6)
            double r11 = java.lang.Math.max(r0, r11)
            r13 = r18
            double r11 = java.lang.Math.max(r13, r11)
            double r2 = java.lang.Math.min(r2, r6)
            double r0 = java.lang.Math.min(r0, r2)
            double r0 = java.lang.Math.min(r13, r0)
            double r9 = r9 - r4
            double r2 = java.lang.Math.floor(r9)
            int r4 = (int) r2
            double r11 = r11 - r0
            double r0 = java.lang.Math.floor(r11)
            int r6 = (int) r0
            r0 = r20
            goto L_0x0137
        L_0x00c9:
            r22 = r1
            r16 = r2
            r17 = r3
            r0 = r9
            r0.setRotate(r7)
            r1 = r26
            int r2 = r1.f122642h
            double r3 = (double) r2
            double r3 = r3 * r12
            double r5 = (double) r2
            double r5 = r5 * r10
            double r7 = (double) r2
            double r7 = r7 * r12
            int r9 = r1.f122643i
            double r14 = (double) r9
            double r14 = r14 * r10
            double r7 = r7 - r14
            double r14 = (double) r2
            double r14 = r14 * r10
            double r1 = (double) r9
            double r1 = r1 * r12
            double r14 = r14 + r1
            double r1 = (double) r9
            double r1 = r1 * r10
            double r1 = -r1
            double r9 = (double) r9
            double r9 = r9 * r12
            r11 = 0
            r18 = r9
            double r9 = java.lang.Math.max(r11, r3)
            double r9 = java.lang.Math.max(r7, r9)
            double r9 = java.lang.Math.max(r1, r9)
            double r3 = java.lang.Math.min(r11, r3)
            double r3 = java.lang.Math.min(r7, r3)
            double r1 = java.lang.Math.min(r1, r3)
            double r3 = java.lang.Math.max(r11, r5)
            double r3 = java.lang.Math.max(r14, r3)
            r7 = r18
            double r3 = java.lang.Math.max(r7, r3)
            double r5 = java.lang.Math.min(r11, r5)
            double r5 = java.lang.Math.min(r14, r5)
            double r5 = java.lang.Math.min(r7, r5)
            double r9 = r9 - r1
            double r1 = java.lang.Math.floor(r9)
            int r1 = (int) r1
            double r3 = r3 - r5
            double r2 = java.lang.Math.floor(r3)
            int r6 = (int) r2
            r4 = r1
            goto L_0x0137
        L_0x0130:
            r22 = r1
            r16 = r2
            r17 = r3
            r0 = r9
        L_0x0137:
            if (r28 == 0) goto L_0x015d
            int r1 = l(r28)
            int r2 = m(r28)
            if (r1 == 0) goto L_0x0154
            float r3 = (float) r1
            r0.preRotate(r3)
            r3 = 90
            if (r1 == r3) goto L_0x014f
            r3 = 270(0x10e, float:3.78E-43)
            if (r1 != r3) goto L_0x0154
        L_0x014f:
            r25 = r6
            r6 = r4
            r4 = r25
        L_0x0154:
            r1 = 1
            if (r2 == r1) goto L_0x015d
            float r1 = (float) r2
            r2 = 1065353216(0x3f800000, float:1.0)
            r0.postScale(r1, r2)
        L_0x015d:
            r1 = r26
            boolean r2 = r1.f122644j
            if (r2 == 0) goto L_0x01f1
            if (r4 == 0) goto L_0x016d
            float r2 = (float) r4
            r3 = r22
            float r5 = (float) r3
            float r2 = r2 / r5
            r5 = r16
            goto L_0x0174
        L_0x016d:
            r3 = r22
            float r2 = (float) r6
            r5 = r16
            float r7 = (float) r5
            float r2 = r2 / r7
        L_0x0174:
            if (r6 == 0) goto L_0x017a
            float r7 = (float) r6
            float r8 = (float) r5
        L_0x0178:
            float r7 = r7 / r8
            goto L_0x017d
        L_0x017a:
            float r7 = (float) r4
            float r8 = (float) r3
            goto L_0x0178
        L_0x017d:
            int r8 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            if (r8 <= 0) goto L_0x01ab
            float r8 = (float) r5
            float r7 = r7 / r2
            float r8 = r8 * r7
            double r7 = (double) r8
            double r7 = java.lang.Math.ceil(r7)
            int r7 = (int) r7
            int r1 = r1.f122645k
            r8 = r1 & 48
            r9 = 48
            if (r8 != r9) goto L_0x0194
            r1 = 0
            goto L_0x01a0
        L_0x0194:
            r8 = 80
            r1 = r1 & r8
            if (r1 != r8) goto L_0x019c
            int r1 = r5 - r7
            goto L_0x01a0
        L_0x019c:
            int r1 = r5 - r7
            int r1 = r1 / 2
        L_0x01a0:
            float r8 = (float) r6
            float r9 = (float) r7
            float r8 = r8 / r9
            r9 = r7
            r10 = r17
            r21 = 0
            r7 = r1
            r1 = r3
            goto L_0x01e2
        L_0x01ab:
            int r8 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            if (r8 >= 0) goto L_0x01d9
            float r8 = (float) r3
            float r2 = r2 / r7
            float r8 = r8 * r2
            double r8 = (double) r8
            double r8 = java.lang.Math.ceil(r8)
            int r2 = (int) r8
            int r1 = r1.f122645k
            r8 = r1 & 3
            r9 = 3
            if (r8 != r9) goto L_0x01c1
            r1 = 0
            goto L_0x01cc
        L_0x01c1:
            r8 = 5
            r1 = r1 & r8
            if (r1 != r8) goto L_0x01c8
            int r1 = r3 - r2
            goto L_0x01cc
        L_0x01c8:
            int r1 = r3 - r2
            int r1 = r1 / 2
        L_0x01cc:
            float r8 = (float) r4
            float r9 = (float) r2
            float r8 = r8 / r9
            r21 = r1
            r1 = r2
            r9 = r5
            r2 = r8
            r10 = r17
            r8 = r7
            r7 = 0
            goto L_0x01e2
        L_0x01d9:
            r1 = r3
            r9 = r5
            r2 = r7
            r8 = r2
            r10 = r17
            r7 = 0
            r21 = 0
        L_0x01e2:
            boolean r3 = v(r10, r3, r5, r4, r6)
            if (r3 == 0) goto L_0x01eb
            r0.preScale(r2, r8)
        L_0x01eb:
            r6 = r7
            r8 = r9
            r5 = r21
            r7 = r1
            goto L_0x0244
        L_0x01f1:
            r5 = r16
            r10 = r17
            r3 = r22
            boolean r1 = r1.f122646l
            if (r1 == 0) goto L_0x021d
            if (r4 == 0) goto L_0x0201
            float r1 = (float) r4
            float r2 = (float) r3
        L_0x01ff:
            float r1 = r1 / r2
            goto L_0x0204
        L_0x0201:
            float r1 = (float) r6
            float r2 = (float) r5
            goto L_0x01ff
        L_0x0204:
            if (r6 == 0) goto L_0x020a
            float r2 = (float) r6
            float r7 = (float) r5
        L_0x0208:
            float r2 = r2 / r7
            goto L_0x020d
        L_0x020a:
            float r2 = (float) r4
            float r7 = (float) r3
            goto L_0x0208
        L_0x020d:
            int r7 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r7 >= 0) goto L_0x0212
            goto L_0x0213
        L_0x0212:
            r1 = r2
        L_0x0213:
            boolean r2 = v(r10, r3, r5, r4, r6)
            if (r2 == 0) goto L_0x0240
            r0.preScale(r1, r1)
            goto L_0x0240
        L_0x021d:
            if (r4 != 0) goto L_0x0221
            if (r6 == 0) goto L_0x0240
        L_0x0221:
            if (r4 != r3) goto L_0x0225
            if (r6 == r5) goto L_0x0240
        L_0x0225:
            if (r4 == 0) goto L_0x022b
            float r1 = (float) r4
            float r2 = (float) r3
        L_0x0229:
            float r1 = r1 / r2
            goto L_0x022e
        L_0x022b:
            float r1 = (float) r6
            float r2 = (float) r5
            goto L_0x0229
        L_0x022e:
            if (r6 == 0) goto L_0x0234
            float r2 = (float) r6
            float r7 = (float) r5
        L_0x0232:
            float r2 = r2 / r7
            goto L_0x0237
        L_0x0234:
            float r2 = (float) r4
            float r7 = (float) r3
            goto L_0x0232
        L_0x0237:
            boolean r4 = v(r10, r3, r5, r4, r6)
            if (r4 == 0) goto L_0x0240
            r0.preScale(r1, r2)
        L_0x0240:
            r7 = r3
            r8 = r5
            r5 = 0
            r6 = 0
        L_0x0244:
            r10 = 1
            r4 = r27
            r9 = r0
            android.graphics.Bitmap r0 = android.graphics.Bitmap.createBitmap(r4, r5, r6, r7, r8, r9, r10)
            r1 = r27
            if (r0 == r1) goto L_0x0254
            r27.recycle()
            goto L_0x0255
        L_0x0254:
            r0 = r1
        L_0x0255:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.squareup.picasso.C14192c.y(com.squareup.picasso.w, android.graphics.Bitmap, int):android.graphics.Bitmap");
    }

    static void z(w wVar) {
        String a10 = wVar.a();
        StringBuilder sb2 = f122522u.get();
        sb2.ensureCapacity(a10.length() + 8);
        sb2.replace(8, sb2.length(), a10);
        Thread.currentThread().setName(sb2.toString());
    }

    /* access modifiers changed from: package-private */
    public void b(C14190a aVar) {
        boolean z10 = this.f122526b.f122609m;
        w wVar = aVar.f122505b;
        if (this.f122535k == null) {
            this.f122535k = aVar;
            if (z10) {
                List<C14190a> list = this.f122536l;
                if (list == null || list.isEmpty()) {
                    F.t("Hunter", "joined", wVar.d(), "to empty hunter");
                } else {
                    F.t("Hunter", "joined", wVar.d(), F.k(this, "to "));
                }
            }
        } else {
            if (this.f122536l == null) {
                this.f122536l = new ArrayList(3);
            }
            this.f122536l.add(aVar);
            if (z10) {
                F.t("Hunter", "joined", wVar.d(), F.k(this, "to "));
            }
            t.f h10 = aVar.h();
            if (h10.ordinal() > this.f122543s.ordinal()) {
                this.f122543s = h10;
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000f, code lost:
        r0 = r2.f122538n;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean c() {
        /*
            r2 = this;
            com.squareup.picasso.a r0 = r2.f122535k
            r1 = 0
            if (r0 != 0) goto L_0x001a
            java.util.List<com.squareup.picasso.a> r0 = r2.f122536l
            if (r0 == 0) goto L_0x000f
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x001a
        L_0x000f:
            java.util.concurrent.Future<?> r0 = r2.f122538n
            if (r0 == 0) goto L_0x001a
            boolean r0 = r0.cancel(r1)
            if (r0 == 0) goto L_0x001a
            r1 = 1
        L_0x001a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.squareup.picasso.C14192c.c():boolean");
    }

    /* access modifiers changed from: package-private */
    public void f(C14190a aVar) {
        boolean z10;
        if (this.f122535k == aVar) {
            this.f122535k = null;
            z10 = true;
        } else {
            List<C14190a> list = this.f122536l;
            z10 = list != null ? list.remove(aVar) : false;
        }
        if (z10 && aVar.h() == this.f122543s) {
            this.f122543s = d();
        }
        if (this.f122526b.f122609m) {
            F.t("Hunter", "removed", aVar.f122505b.d(), F.k(this, "from "));
        }
    }

    /* access modifiers changed from: package-private */
    public C14190a h() {
        return this.f122535k;
    }

    /* access modifiers changed from: package-private */
    public List<C14190a> i() {
        return this.f122536l;
    }

    /* access modifiers changed from: package-private */
    public w j() {
        return this.f122531g;
    }

    /* access modifiers changed from: package-private */
    public Exception k() {
        return this.f122540p;
    }

    /* access modifiers changed from: package-private */
    public String n() {
        return this.f122530f;
    }

    /* access modifiers changed from: package-private */
    public t.e o() {
        return this.f122539o;
    }

    /* access modifiers changed from: package-private */
    public int p() {
        return this.f122532h;
    }

    /* access modifiers changed from: package-private */
    public t q() {
        return this.f122526b;
    }

    /* access modifiers changed from: package-private */
    public t.f r() {
        return this.f122543s;
    }

    public void run() {
        try {
            z(this.f122531g);
            if (this.f122526b.f122609m) {
                F.s("Hunter", "executing", F.j(this));
            }
            Bitmap t10 = t();
            this.f122537m = t10;
            if (t10 == null) {
                this.f122527c.e(this);
            } else {
                this.f122527c.d(this);
            }
        } catch (r.b e10) {
            if (!q.a(e10.f122591b) || e10.f122590a != 504) {
                this.f122540p = e10;
            }
            this.f122527c.e(this);
        } catch (IOException e11) {
            this.f122540p = e11;
            this.f122527c.g(this);
        } catch (OutOfMemoryError e12) {
            StringWriter stringWriter = new StringWriter();
            this.f122529e.a().a(new PrintWriter(stringWriter));
            this.f122540p = new RuntimeException(stringWriter.toString(), e12);
            this.f122527c.e(this);
        } catch (Exception e13) {
            this.f122540p = e13;
            this.f122527c.e(this);
        } catch (Throwable th2) {
            Thread.currentThread().setName("Picasso-Idle");
            throw th2;
        }
        Thread.currentThread().setName("Picasso-Idle");
    }

    /* access modifiers changed from: package-private */
    public Bitmap s() {
        return this.f122537m;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00ca A[Catch:{ all -> 0x00a5 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.graphics.Bitmap t() {
        /*
            r6 = this;
            int r0 = r6.f122532h
            boolean r0 = com.squareup.picasso.p.a(r0)
            if (r0 == 0) goto L_0x0031
            com.squareup.picasso.d r0 = r6.f122528d
            java.lang.String r1 = r6.f122530f
            android.graphics.Bitmap r0 = r0.get(r1)
            if (r0 == 0) goto L_0x0032
            com.squareup.picasso.A r1 = r6.f122529e
            r1.d()
            com.squareup.picasso.t$e r1 = com.squareup.picasso.t.e.MEMORY
            r6.f122539o = r1
            com.squareup.picasso.t r1 = r6.f122526b
            boolean r1 = r1.f122609m
            if (r1 == 0) goto L_0x0030
            java.lang.String r1 = "Hunter"
            java.lang.String r2 = "decoded"
            com.squareup.picasso.w r3 = r6.f122531g
            java.lang.String r3 = r3.d()
            java.lang.String r4 = "from cache"
            com.squareup.picasso.F.t(r1, r2, r3, r4)
        L_0x0030:
            return r0
        L_0x0031:
            r0 = 0
        L_0x0032:
            int r1 = r6.f122542r
            if (r1 != 0) goto L_0x003b
            com.squareup.picasso.q r1 = com.squareup.picasso.q.OFFLINE
            int r1 = r1.index
            goto L_0x003d
        L_0x003b:
            int r1 = r6.f122533i
        L_0x003d:
            r6.f122533i = r1
            com.squareup.picasso.y r2 = r6.f122534j
            com.squareup.picasso.w r3 = r6.f122531g
            com.squareup.picasso.y$a r1 = r2.f(r3, r1)
            if (r1 == 0) goto L_0x006f
            com.squareup.picasso.t$e r0 = r1.c()
            r6.f122539o = r0
            int r0 = r1.b()
            r6.f122541q = r0
            android.graphics.Bitmap r0 = r1.a()
            if (r0 != 0) goto L_0x006f
            WK.N r0 = r1.d()
            com.squareup.picasso.w r1 = r6.f122531g     // Catch:{ all -> 0x006a }
            android.graphics.Bitmap r1 = e(r0, r1)     // Catch:{ all -> 0x006a }
            r0.close()     // Catch:{ IOException -> 0x0068 }
        L_0x0068:
            r0 = r1
            goto L_0x006f
        L_0x006a:
            r1 = move-exception
            r0.close()     // Catch:{ IOException -> 0x006e }
        L_0x006e:
            throw r1
        L_0x006f:
            if (r0 == 0) goto L_0x00f2
            com.squareup.picasso.t r1 = r6.f122526b
            boolean r1 = r1.f122609m
            if (r1 == 0) goto L_0x0084
            java.lang.String r1 = "Hunter"
            java.lang.String r2 = "decoded"
            com.squareup.picasso.w r3 = r6.f122531g
            java.lang.String r3 = r3.d()
            com.squareup.picasso.F.s(r1, r2, r3)
        L_0x0084:
            com.squareup.picasso.A r1 = r6.f122529e
            r1.b(r0)
            com.squareup.picasso.w r1 = r6.f122531g
            boolean r1 = r1.f()
            if (r1 != 0) goto L_0x0095
            int r1 = r6.f122541q
            if (r1 == 0) goto L_0x00f2
        L_0x0095:
            java.lang.Object r1 = f122521t
            monitor-enter(r1)
            com.squareup.picasso.w r2 = r6.f122531g     // Catch:{ all -> 0x00a5 }
            boolean r2 = r2.e()     // Catch:{ all -> 0x00a5 }
            if (r2 != 0) goto L_0x00a7
            int r2 = r6.f122541q     // Catch:{ all -> 0x00a5 }
            if (r2 == 0) goto L_0x00c2
            goto L_0x00a7
        L_0x00a5:
            r0 = move-exception
            goto L_0x00f0
        L_0x00a7:
            com.squareup.picasso.w r2 = r6.f122531g     // Catch:{ all -> 0x00a5 }
            int r3 = r6.f122541q     // Catch:{ all -> 0x00a5 }
            android.graphics.Bitmap r0 = y(r2, r0, r3)     // Catch:{ all -> 0x00a5 }
            com.squareup.picasso.t r2 = r6.f122526b     // Catch:{ all -> 0x00a5 }
            boolean r2 = r2.f122609m     // Catch:{ all -> 0x00a5 }
            if (r2 == 0) goto L_0x00c2
            java.lang.String r2 = "Hunter"
            java.lang.String r3 = "transformed"
            com.squareup.picasso.w r4 = r6.f122531g     // Catch:{ all -> 0x00a5 }
            java.lang.String r4 = r4.d()     // Catch:{ all -> 0x00a5 }
            com.squareup.picasso.F.s(r2, r3, r4)     // Catch:{ all -> 0x00a5 }
        L_0x00c2:
            com.squareup.picasso.w r2 = r6.f122531g     // Catch:{ all -> 0x00a5 }
            boolean r2 = r2.b()     // Catch:{ all -> 0x00a5 }
            if (r2 == 0) goto L_0x00e7
            com.squareup.picasso.w r2 = r6.f122531g     // Catch:{ all -> 0x00a5 }
            java.util.List<com.squareup.picasso.E> r2 = r2.f122641g     // Catch:{ all -> 0x00a5 }
            android.graphics.Bitmap r0 = a(r2, r0)     // Catch:{ all -> 0x00a5 }
            com.squareup.picasso.t r2 = r6.f122526b     // Catch:{ all -> 0x00a5 }
            boolean r2 = r2.f122609m     // Catch:{ all -> 0x00a5 }
            if (r2 == 0) goto L_0x00e7
            java.lang.String r2 = "Hunter"
            java.lang.String r3 = "transformed"
            com.squareup.picasso.w r4 = r6.f122531g     // Catch:{ all -> 0x00a5 }
            java.lang.String r4 = r4.d()     // Catch:{ all -> 0x00a5 }
            java.lang.String r5 = "from custom transformations"
            com.squareup.picasso.F.t(r2, r3, r4, r5)     // Catch:{ all -> 0x00a5 }
        L_0x00e7:
            monitor-exit(r1)     // Catch:{ all -> 0x00a5 }
            if (r0 == 0) goto L_0x00f2
            com.squareup.picasso.A r1 = r6.f122529e
            r1.c(r0)
            goto L_0x00f2
        L_0x00f0:
            monitor-exit(r1)     // Catch:{ all -> 0x00a5 }
            throw r0
        L_0x00f2:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.squareup.picasso.C14192c.t():android.graphics.Bitmap");
    }

    /* access modifiers changed from: package-private */
    public boolean u() {
        Future<?> future = this.f122538n;
        return future != null && future.isCancelled();
    }

    /* access modifiers changed from: package-private */
    public boolean w(boolean z10, NetworkInfo networkInfo) {
        int i10 = this.f122542r;
        if (i10 <= 0) {
            return false;
        }
        this.f122542r = i10 - 1;
        return this.f122534j.h(z10, networkInfo);
    }

    /* access modifiers changed from: package-private */
    public boolean x() {
        return this.f122534j.i();
    }
}
