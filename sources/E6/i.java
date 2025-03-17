package E6;

import C6.k;
import D6.q;
import I6.j;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import android.graphics.Typeface;
import j0.C5468y;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import w6.C8927i;
import w6.z;
import y6.C8987d;
import z6.C9019a;
import z6.o;

public class i extends b {

    /* renamed from: D  reason: collision with root package name */
    private final StringBuilder f34989D = new StringBuilder(2);

    /* renamed from: E  reason: collision with root package name */
    private final RectF f34990E = new RectF();

    /* renamed from: F  reason: collision with root package name */
    private final Matrix f34991F = new Matrix();

    /* renamed from: G  reason: collision with root package name */
    private final Paint f34992G = new a(1);

    /* renamed from: H  reason: collision with root package name */
    private final Paint f34993H = new b(1);

    /* renamed from: I  reason: collision with root package name */
    private final Map<B6.d, List<C8987d>> f34994I = new HashMap();

    /* renamed from: J  reason: collision with root package name */
    private final C5468y<String> f34995J = new C5468y<>();

    /* renamed from: K  reason: collision with root package name */
    private final List<d> f34996K = new ArrayList();

    /* renamed from: L  reason: collision with root package name */
    private final o f34997L;

    /* renamed from: M  reason: collision with root package name */
    private final com.airbnb.lottie.o f34998M;

    /* renamed from: N  reason: collision with root package name */
    private final C8927i f34999N;

    /* renamed from: O  reason: collision with root package name */
    private C9019a<Integer, Integer> f35000O;

    /* renamed from: P  reason: collision with root package name */
    private C9019a<Integer, Integer> f35001P;

    /* renamed from: Q  reason: collision with root package name */
    private C9019a<Integer, Integer> f35002Q;

    /* renamed from: R  reason: collision with root package name */
    private C9019a<Integer, Integer> f35003R;

    /* renamed from: S  reason: collision with root package name */
    private C9019a<Float, Float> f35004S;

    /* renamed from: T  reason: collision with root package name */
    private C9019a<Float, Float> f35005T;

    /* renamed from: U  reason: collision with root package name */
    private C9019a<Float, Float> f35006U;

    /* renamed from: V  reason: collision with root package name */
    private C9019a<Float, Float> f35007V;

    /* renamed from: W  reason: collision with root package name */
    private C9019a<Float, Float> f35008W;

    /* renamed from: X  reason: collision with root package name */
    private C9019a<Typeface, Typeface> f35009X;

    class a extends Paint {
        a(int i10) {
            super(i10);
            setStyle(Paint.Style.FILL);
        }
    }

    class b extends Paint {
        b(int i10) {
            super(i10);
            setStyle(Paint.Style.STROKE);
        }
    }

    static /* synthetic */ class c {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f35012a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                B6.b$a[] r0 = B6.b.a.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f35012a = r0
                B6.b$a r1 = B6.b.a.LEFT_ALIGN     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f35012a     // Catch:{ NoSuchFieldError -> 0x001d }
                B6.b$a r1 = B6.b.a.RIGHT_ALIGN     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f35012a     // Catch:{ NoSuchFieldError -> 0x0028 }
                B6.b$a r1 = B6.b.a.CENTER     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: E6.i.c.<clinit>():void");
        }
    }

    i(com.airbnb.lottie.o oVar, e eVar) {
        super(oVar, eVar);
        C6.b bVar;
        C6.b bVar2;
        C6.a aVar;
        C6.a aVar2;
        this.f34998M = oVar;
        this.f34999N = eVar.c();
        o a10 = eVar.t().h();
        this.f34997L = a10;
        a10.a(this);
        i(a10);
        k u10 = eVar.u();
        if (!(u10 == null || (aVar2 = u10.f33733a) == null)) {
            C9019a<Integer, Integer> h10 = aVar2.h();
            this.f35000O = h10;
            h10.a(this);
            i(this.f35000O);
        }
        if (!(u10 == null || (aVar = u10.f33734b) == null)) {
            C9019a<Integer, Integer> h11 = aVar.h();
            this.f35002Q = h11;
            h11.a(this);
            i(this.f35002Q);
        }
        if (!(u10 == null || (bVar2 = u10.f33735c) == null)) {
            C9019a<Float, Float> h12 = bVar2.h();
            this.f35004S = h12;
            h12.a(this);
            i(this.f35004S);
        }
        if (u10 != null && (bVar = u10.f33736d) != null) {
            C9019a<Float, Float> h13 = bVar.h();
            this.f35006U = h13;
            h13.a(this);
            i(this.f35006U);
        }
    }

    private String Q(String str, int i10) {
        int codePointAt = str.codePointAt(i10);
        int charCount = Character.charCount(codePointAt) + i10;
        while (charCount < str.length()) {
            int codePointAt2 = str.codePointAt(charCount);
            if (!e0(codePointAt2)) {
                break;
            }
            charCount += Character.charCount(codePointAt2);
            codePointAt = (codePointAt * 31) + codePointAt2;
        }
        long j10 = (long) codePointAt;
        if (this.f34995J.c(j10)) {
            return this.f34995J.d(j10);
        }
        this.f34989D.setLength(0);
        while (i10 < charCount) {
            int codePointAt3 = str.codePointAt(i10);
            this.f34989D.appendCodePoint(codePointAt3);
            i10 += Character.charCount(codePointAt3);
        }
        String sb2 = this.f34989D.toString();
        this.f34995J.k(j10, sb2);
        return sb2;
    }

    private void R(B6.b bVar, int i10) {
        C9019a<Integer, Integer> aVar = this.f35001P;
        if (aVar != null) {
            this.f34992G.setColor(aVar.h().intValue());
        } else {
            C9019a<Integer, Integer> aVar2 = this.f35000O;
            if (aVar2 != null) {
                this.f34992G.setColor(aVar2.h().intValue());
            } else {
                this.f34992G.setColor(bVar.f33216h);
            }
        }
        C9019a<Integer, Integer> aVar3 = this.f35003R;
        if (aVar3 != null) {
            this.f34993H.setColor(aVar3.h().intValue());
        } else {
            C9019a<Integer, Integer> aVar4 = this.f35002Q;
            if (aVar4 != null) {
                this.f34993H.setColor(aVar4.h().intValue());
            } else {
                this.f34993H.setColor(bVar.f33217i);
            }
        }
        int intValue = ((((this.f34936x.h() == null ? 100 : this.f34936x.h().h().intValue()) * 255) / 100) * i10) / 255;
        this.f34992G.setAlpha(intValue);
        this.f34993H.setAlpha(intValue);
        C9019a<Float, Float> aVar5 = this.f35005T;
        if (aVar5 != null) {
            this.f34993H.setStrokeWidth(aVar5.h().floatValue());
            return;
        }
        C9019a<Float, Float> aVar6 = this.f35004S;
        if (aVar6 != null) {
            this.f34993H.setStrokeWidth(aVar6.h().floatValue());
        } else {
            this.f34993H.setStrokeWidth(bVar.f33218j * j.e());
        }
    }

    private void S(String str, Paint paint, Canvas canvas) {
        if (paint.getColor() != 0) {
            if (paint.getStyle() != Paint.Style.STROKE || paint.getStrokeWidth() != 0.0f) {
                canvas.drawText(str, 0, str.length(), 0.0f, 0.0f, paint);
            }
        }
    }

    private void T(B6.d dVar, float f10, B6.b bVar, Canvas canvas) {
        List<C8987d> b02 = b0(dVar);
        for (int i10 = 0; i10 < b02.size(); i10++) {
            Path m10 = b02.get(i10).m();
            m10.computeBounds(this.f34990E, false);
            this.f34991F.reset();
            this.f34991F.preTranslate(0.0f, (-bVar.f33215g) * j.e());
            this.f34991F.preScale(f10, f10);
            m10.transform(this.f34991F);
            if (bVar.f33219k) {
                W(m10, this.f34992G, canvas);
                W(m10, this.f34993H, canvas);
            } else {
                W(m10, this.f34993H, canvas);
                W(m10, this.f34992G, canvas);
            }
        }
    }

    private void U(String str, B6.b bVar, Canvas canvas) {
        if (bVar.f33219k) {
            S(str, this.f34992G, canvas);
            S(str, this.f34993H, canvas);
            return;
        }
        S(str, this.f34993H, canvas);
        S(str, this.f34992G, canvas);
    }

    private void V(String str, B6.b bVar, Canvas canvas, float f10) {
        int i10 = 0;
        while (i10 < str.length()) {
            String Q10 = Q(str, i10);
            i10 += Q10.length();
            U(Q10, bVar, canvas);
            canvas.translate(this.f34992G.measureText(Q10) + f10, 0.0f);
        }
    }

    private void W(Path path, Paint paint, Canvas canvas) {
        if (paint.getColor() != 0) {
            if (paint.getStyle() != Paint.Style.STROKE || paint.getStrokeWidth() != 0.0f) {
                canvas.drawPath(path, paint);
            }
        }
    }

    private void X(String str, B6.b bVar, B6.c cVar, Canvas canvas, float f10, float f11, float f12) {
        for (int i10 = 0; i10 < str.length(); i10++) {
            B6.d e10 = this.f34999N.c().e(B6.d.c(str.charAt(i10), cVar.a(), cVar.c()));
            if (e10 != null) {
                T(e10, f11, bVar, canvas);
                canvas.translate((((float) e10.b()) * f11 * j.e()) + f12, 0.0f);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0089  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void Y(B6.b r19, B6.c r20, android.graphics.Canvas r21) {
        /*
            r18 = this;
            r7 = r18
            r8 = r19
            r9 = r20
            r10 = r21
            android.graphics.Typeface r0 = r7.d0(r9)
            if (r0 != 0) goto L_0x000f
            return
        L_0x000f:
            java.lang.String r1 = r8.f33209a
            com.airbnb.lottie.o r2 = r7.f34998M
            r2.X()
            android.graphics.Paint r2 = r7.f34992G
            r2.setTypeface(r0)
            z6.a<java.lang.Float, java.lang.Float> r0 = r7.f35008W
            if (r0 == 0) goto L_0x002a
            java.lang.Object r0 = r0.h()
            java.lang.Float r0 = (java.lang.Float) r0
            float r0 = r0.floatValue()
            goto L_0x002c
        L_0x002a:
            float r0 = r8.f33211c
        L_0x002c:
            android.graphics.Paint r2 = r7.f34992G
            float r3 = I6.j.e()
            float r3 = r3 * r0
            r2.setTextSize(r3)
            android.graphics.Paint r2 = r7.f34993H
            android.graphics.Paint r3 = r7.f34992G
            android.graphics.Typeface r3 = r3.getTypeface()
            r2.setTypeface(r3)
            android.graphics.Paint r2 = r7.f34993H
            android.graphics.Paint r3 = r7.f34992G
            float r3 = r3.getTextSize()
            r2.setTextSize(r3)
            int r2 = r8.f33213e
            float r2 = (float) r2
            r3 = 1092616192(0x41200000, float:10.0)
            float r2 = r2 / r3
            z6.a<java.lang.Float, java.lang.Float> r3 = r7.f35007V
            if (r3 == 0) goto L_0x0062
            java.lang.Object r3 = r3.h()
            java.lang.Float r3 = (java.lang.Float) r3
            float r3 = r3.floatValue()
        L_0x0060:
            float r2 = r2 + r3
            goto L_0x0071
        L_0x0062:
            z6.a<java.lang.Float, java.lang.Float> r3 = r7.f35006U
            if (r3 == 0) goto L_0x0071
            java.lang.Object r3 = r3.h()
            java.lang.Float r3 = (java.lang.Float) r3
            float r3 = r3.floatValue()
            goto L_0x0060
        L_0x0071:
            float r3 = I6.j.e()
            float r2 = r2 * r3
            float r2 = r2 * r0
            r0 = 1120403456(0x42c80000, float:100.0)
            float r11 = r2 / r0
            java.util.List r12 = r7.c0(r1)
            int r13 = r12.size()
            r14 = 0
            r0 = -1
            r15 = r0
            r6 = r14
        L_0x0087:
            if (r6 >= r13) goto L_0x00d3
            java.lang.Object r0 = r12.get(r6)
            r1 = r0
            java.lang.String r1 = (java.lang.String) r1
            android.graphics.PointF r0 = r8.f33221m
            if (r0 != 0) goto L_0x0097
            r0 = 0
        L_0x0095:
            r2 = r0
            goto L_0x009a
        L_0x0097:
            float r0 = r0.x
            goto L_0x0095
        L_0x009a:
            r4 = 0
            r16 = 0
            r0 = r18
            r3 = r20
            r5 = r11
            r17 = r6
            r6 = r16
            java.util.List r0 = r0.g0(r1, r2, r3, r4, r5, r6)
            r1 = r14
        L_0x00ab:
            int r2 = r0.size()
            if (r1 >= r2) goto L_0x00d0
            java.lang.Object r2 = r0.get(r1)
            E6.i$d r2 = (E6.i.d) r2
            int r15 = r15 + 1
            r21.save()
            float r3 = r2.f35014b
            r7.f0(r10, r8, r15, r3)
            java.lang.String r2 = r2.f35013a
            r7.V(r2, r8, r10, r11)
            r21.restore()
            int r1 = r1 + 1
            goto L_0x00ab
        L_0x00d0:
            int r6 = r17 + 1
            goto L_0x0087
        L_0x00d3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: E6.i.Y(B6.b, B6.c, android.graphics.Canvas):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0053  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void Z(B6.b r21, android.graphics.Matrix r22, B6.c r23, android.graphics.Canvas r24) {
        /*
            r20 = this;
            r8 = r20
            r9 = r21
            z6.a<java.lang.Float, java.lang.Float> r0 = r8.f35008W
            if (r0 == 0) goto L_0x0013
            java.lang.Object r0 = r0.h()
            java.lang.Float r0 = (java.lang.Float) r0
            float r0 = r0.floatValue()
            goto L_0x0015
        L_0x0013:
            float r0 = r9.f33211c
        L_0x0015:
            r1 = 1120403456(0x42c80000, float:100.0)
            float r10 = r0 / r1
            float r11 = I6.j.g(r22)
            java.lang.String r0 = r9.f33209a
            java.util.List r12 = r8.c0(r0)
            int r13 = r12.size()
            int r0 = r9.f33213e
            float r0 = (float) r0
            r1 = 1092616192(0x41200000, float:10.0)
            float r0 = r0 / r1
            z6.a<java.lang.Float, java.lang.Float> r1 = r8.f35007V
            if (r1 == 0) goto L_0x003e
            java.lang.Object r1 = r1.h()
            java.lang.Float r1 = (java.lang.Float) r1
            float r1 = r1.floatValue()
        L_0x003b:
            float r0 = r0 + r1
        L_0x003c:
            r14 = r0
            goto L_0x004d
        L_0x003e:
            z6.a<java.lang.Float, java.lang.Float> r1 = r8.f35006U
            if (r1 == 0) goto L_0x003c
            java.lang.Object r1 = r1.h()
            java.lang.Float r1 = (java.lang.Float) r1
            float r1 = r1.floatValue()
            goto L_0x003b
        L_0x004d:
            r15 = 0
            r0 = -1
            r7 = r0
            r6 = r15
        L_0x0051:
            if (r6 >= r13) goto L_0x00b2
            java.lang.Object r0 = r12.get(r6)
            r1 = r0
            java.lang.String r1 = (java.lang.String) r1
            android.graphics.PointF r0 = r9.f33221m
            if (r0 != 0) goto L_0x0061
            r0 = 0
        L_0x005f:
            r2 = r0
            goto L_0x0064
        L_0x0061:
            float r0 = r0.x
            goto L_0x005f
        L_0x0064:
            r16 = 1
            r0 = r20
            r3 = r23
            r4 = r10
            r5 = r14
            r17 = r6
            r6 = r16
            java.util.List r6 = r0.g0(r1, r2, r3, r4, r5, r6)
            r5 = r15
        L_0x0075:
            int r0 = r6.size()
            if (r5 >= r0) goto L_0x00af
            java.lang.Object r0 = r6.get(r5)
            E6.i$d r0 = (E6.i.d) r0
            int r7 = r7 + 1
            r24.save()
            float r1 = r0.f35014b
            r4 = r24
            r8.f0(r4, r9, r7, r1)
            java.lang.String r1 = r0.f35013a
            r0 = r20
            r2 = r21
            r3 = r23
            r16 = r5
            r5 = r11
            r18 = r6
            r6 = r10
            r19 = r7
            r7 = r14
            r0.X(r1, r2, r3, r4, r5, r6, r7)
            r24.restore()
            int r5 = r16 + 1
            r6 = r18
            r7 = r19
            goto L_0x0075
        L_0x00af:
            int r6 = r17 + 1
            goto L_0x0051
        L_0x00b2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: E6.i.Z(B6.b, android.graphics.Matrix, B6.c, android.graphics.Canvas):void");
    }

    private d a0(int i10) {
        for (int size = this.f34996K.size(); size < i10; size++) {
            this.f34996K.add(new d((a) null));
        }
        return this.f34996K.get(i10 - 1);
    }

    private List<C8987d> b0(B6.d dVar) {
        if (this.f34994I.containsKey(dVar)) {
            return this.f34994I.get(dVar);
        }
        List<q> a10 = dVar.a();
        int size = a10.size();
        ArrayList arrayList = new ArrayList(size);
        for (int i10 = 0; i10 < size; i10++) {
            arrayList.add(new C8987d(this.f34998M, this, a10.get(i10), this.f34999N));
        }
        this.f34994I.put(dVar, arrayList);
        return arrayList;
    }

    private List<String> c0(String str) {
        return Arrays.asList(str.replaceAll("\r\n", "\r").replaceAll("\u0003", "\r").replaceAll("\n", "\r").split("\r"));
    }

    private Typeface d0(B6.c cVar) {
        Typeface h10;
        C9019a<Typeface, Typeface> aVar = this.f35009X;
        if (aVar != null && (h10 = aVar.h()) != null) {
            return h10;
        }
        Typeface Y10 = this.f34998M.Y(cVar);
        return Y10 != null ? Y10 : cVar.d();
    }

    private boolean e0(int i10) {
        return Character.getType(i10) == 16 || Character.getType(i10) == 27 || Character.getType(i10) == 6 || Character.getType(i10) == 28 || Character.getType(i10) == 8 || Character.getType(i10) == 19;
    }

    private void f0(Canvas canvas, B6.b bVar, int i10, float f10) {
        PointF pointF = bVar.f33220l;
        PointF pointF2 = bVar.f33221m;
        float e10 = j.e();
        float f11 = 0.0f;
        float f12 = (((float) i10) * bVar.f33214f * e10) + (pointF == null ? 0.0f : (bVar.f33214f * e10) + pointF.y);
        float f13 = pointF == null ? 0.0f : pointF.x;
        if (pointF2 != null) {
            f11 = pointF2.x;
        }
        int i11 = c.f35012a[bVar.f33212d.ordinal()];
        if (i11 == 1) {
            canvas.translate(f13, f12);
        } else if (i11 == 2) {
            canvas.translate((f13 + f11) - f10, f12);
        } else if (i11 == 3) {
            canvas.translate((f13 + (f11 / 2.0f)) - (f10 / 2.0f), f12);
        }
    }

    private List<d> g0(String str, float f10, B6.c cVar, float f11, float f12, boolean z10) {
        float measureText;
        String str2 = str;
        int i10 = 0;
        int i11 = 0;
        boolean z11 = false;
        int i12 = 0;
        float f13 = 0.0f;
        float f14 = 0.0f;
        float f15 = 0.0f;
        for (int i13 = 0; i13 < str.length(); i13++) {
            char charAt = str2.charAt(i13);
            if (z10) {
                B6.d e10 = this.f34999N.c().e(B6.d.c(charAt, cVar.a(), cVar.c()));
                if (e10 == null) {
                } else {
                    measureText = ((float) e10.b()) * f11 * j.e();
                }
            } else {
                measureText = this.f34992G.measureText(str2.substring(i13, i13 + 1));
            }
            float f16 = measureText + f12;
            if (charAt == ' ') {
                z11 = true;
                f15 = f16;
            } else if (z11) {
                z11 = false;
                i12 = i13;
                f14 = f16;
            } else {
                f14 += f16;
            }
            f13 += f16;
            if (f10 > 0.0f && f13 >= f10 && charAt != ' ') {
                i10++;
                d a02 = a0(i10);
                if (i12 == i11) {
                    String substring = str2.substring(i11, i13);
                    String trim = substring.trim();
                    a02.c(trim, (f13 - f16) - (((float) (trim.length() - substring.length())) * f15));
                    i11 = i13;
                    i12 = i11;
                    f13 = f16;
                    f14 = f13;
                } else {
                    String substring2 = str2.substring(i11, i12 - 1);
                    String trim2 = substring2.trim();
                    a02.c(trim2, ((f13 - f14) - (((float) (substring2.length() - trim2.length())) * f15)) - f15);
                    f13 = f14;
                    i11 = i12;
                }
            }
        }
        if (f13 > 0.0f) {
            i10++;
            a0(i10).c(str2.substring(i11), f13);
        }
        return this.f34996K.subList(0, i10);
    }

    public void e(RectF rectF, Matrix matrix, boolean z10) {
        super.e(rectF, matrix, z10);
        rectF.set(0.0f, 0.0f, (float) this.f34999N.b().width(), (float) this.f34999N.b().height());
    }

    public <T> void h(T t10, J6.c<T> cVar) {
        super.h(t10, cVar);
        if (t10 == z.f57307a) {
            C9019a<Integer, Integer> aVar = this.f35001P;
            if (aVar != null) {
                I(aVar);
            }
            if (cVar == null) {
                this.f35001P = null;
                return;
            }
            z6.q qVar = new z6.q(cVar);
            this.f35001P = qVar;
            qVar.a(this);
            i(this.f35001P);
        } else if (t10 == z.f57308b) {
            C9019a<Integer, Integer> aVar2 = this.f35003R;
            if (aVar2 != null) {
                I(aVar2);
            }
            if (cVar == null) {
                this.f35003R = null;
                return;
            }
            z6.q qVar2 = new z6.q(cVar);
            this.f35003R = qVar2;
            qVar2.a(this);
            i(this.f35003R);
        } else if (t10 == z.f57325s) {
            C9019a<Float, Float> aVar3 = this.f35005T;
            if (aVar3 != null) {
                I(aVar3);
            }
            if (cVar == null) {
                this.f35005T = null;
                return;
            }
            z6.q qVar3 = new z6.q(cVar);
            this.f35005T = qVar3;
            qVar3.a(this);
            i(this.f35005T);
        } else if (t10 == z.f57326t) {
            C9019a<Float, Float> aVar4 = this.f35007V;
            if (aVar4 != null) {
                I(aVar4);
            }
            if (cVar == null) {
                this.f35007V = null;
                return;
            }
            z6.q qVar4 = new z6.q(cVar);
            this.f35007V = qVar4;
            qVar4.a(this);
            i(this.f35007V);
        } else if (t10 == z.f57297F) {
            C9019a<Float, Float> aVar5 = this.f35008W;
            if (aVar5 != null) {
                I(aVar5);
            }
            if (cVar == null) {
                this.f35008W = null;
                return;
            }
            z6.q qVar5 = new z6.q(cVar);
            this.f35008W = qVar5;
            qVar5.a(this);
            i(this.f35008W);
        } else if (t10 == z.f57304M) {
            C9019a<Typeface, Typeface> aVar6 = this.f35009X;
            if (aVar6 != null) {
                I(aVar6);
            }
            if (cVar == null) {
                this.f35009X = null;
                return;
            }
            z6.q qVar6 = new z6.q(cVar);
            this.f35009X = qVar6;
            qVar6.a(this);
            i(this.f35009X);
        } else if (t10 == z.f57306O) {
            this.f34997L.q(cVar);
        }
    }

    /* access modifiers changed from: package-private */
    public void u(Canvas canvas, Matrix matrix, int i10) {
        B6.b bVar = (B6.b) this.f34997L.h();
        B6.c cVar = this.f34999N.g().get(bVar.f33210b);
        if (cVar != null) {
            canvas.save();
            canvas.concat(matrix);
            R(bVar, i10);
            if (this.f34998M.f1()) {
                Z(bVar, matrix, cVar, canvas);
            } else {
                Y(bVar, cVar, canvas);
            }
            canvas.restore();
        }
    }

    private static class d {
        /* access modifiers changed from: private */

        /* renamed from: a  reason: collision with root package name */
        public String f35013a;
        /* access modifiers changed from: private */

        /* renamed from: b  reason: collision with root package name */
        public float f35014b;

        private d() {
            this.f35013a = "";
            this.f35014b = 0.0f;
        }

        /* access modifiers changed from: package-private */
        public void c(String str, float f10) {
            this.f35013a = str;
            this.f35014b = f10;
        }

        /* synthetic */ d(a aVar) {
            this();
        }
    }
}
