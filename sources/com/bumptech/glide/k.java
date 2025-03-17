package com.bumptech.glide;

import E7.j;
import U7.b;
import U7.d;
import U7.e;
import U7.f;
import U7.g;
import V7.i;
import Y7.l;
import android.annotation.SuppressLint;
import android.content.Context;
import android.widget.ImageView;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Executor;

public class k<TranscodeType> extends U7.a<k<TranscodeType>> implements Cloneable {

    /* renamed from: O  reason: collision with root package name */
    protected static final g f46525O = ((g) ((g) ((g) new g().e(j.f35109c)).e0(g.LOW)).m0(true));

    /* renamed from: A  reason: collision with root package name */
    private final Context f46526A;

    /* renamed from: B  reason: collision with root package name */
    private final l f46527B;

    /* renamed from: C  reason: collision with root package name */
    private final Class<TranscodeType> f46528C;

    /* renamed from: D  reason: collision with root package name */
    private final b f46529D;

    /* renamed from: E  reason: collision with root package name */
    private final d f46530E;

    /* renamed from: F  reason: collision with root package name */
    private m<?, ? super TranscodeType> f46531F;

    /* renamed from: G  reason: collision with root package name */
    private Object f46532G;

    /* renamed from: H  reason: collision with root package name */
    private List<f<TranscodeType>> f46533H;

    /* renamed from: I  reason: collision with root package name */
    private k<TranscodeType> f46534I;

    /* renamed from: J  reason: collision with root package name */
    private k<TranscodeType> f46535J;

    /* renamed from: K  reason: collision with root package name */
    private Float f46536K;

    /* renamed from: L  reason: collision with root package name */
    private boolean f46537L = true;

    /* renamed from: M  reason: collision with root package name */
    private boolean f46538M;

    /* renamed from: N  reason: collision with root package name */
    private boolean f46539N;

    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f46540a;

        /* renamed from: b  reason: collision with root package name */
        static final /* synthetic */ int[] f46541b;

        /* JADX WARNING: Can't wrap try/catch for region: R(27:0|(2:1|2)|3|(2:5|6)|7|9|10|11|(2:13|14)|15|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|34) */
        /* JADX WARNING: Can't wrap try/catch for region: R(29:0|1|2|3|(2:5|6)|7|9|10|11|13|14|15|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|34) */
        /* JADX WARNING: Can't wrap try/catch for region: R(30:0|1|2|3|5|6|7|9|10|11|13|14|15|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|34) */
        /* JADX WARNING: Code restructure failed: missing block: B:35:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x0044 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x004e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x0058 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x0062 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x006d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x0078 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:31:0x0083 */
        static {
            /*
                com.bumptech.glide.g[] r0 = com.bumptech.glide.g.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f46541b = r0
                r1 = 1
                com.bumptech.glide.g r2 = com.bumptech.glide.g.LOW     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                r0 = 2
                int[] r2 = f46541b     // Catch:{ NoSuchFieldError -> 0x001d }
                com.bumptech.glide.g r3 = com.bumptech.glide.g.NORMAL     // Catch:{ NoSuchFieldError -> 0x001d }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                r2 = 3
                int[] r3 = f46541b     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.bumptech.glide.g r4 = com.bumptech.glide.g.HIGH     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r3[r4] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                r3 = 4
                int[] r4 = f46541b     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.bumptech.glide.g r5 = com.bumptech.glide.g.IMMEDIATE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r4[r5] = r3     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                android.widget.ImageView$ScaleType[] r4 = android.widget.ImageView.ScaleType.values()
                int r4 = r4.length
                int[] r4 = new int[r4]
                f46540a = r4
                android.widget.ImageView$ScaleType r5 = android.widget.ImageView.ScaleType.CENTER_CROP     // Catch:{ NoSuchFieldError -> 0x0044 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0044 }
                r4[r5] = r1     // Catch:{ NoSuchFieldError -> 0x0044 }
            L_0x0044:
                int[] r1 = f46540a     // Catch:{ NoSuchFieldError -> 0x004e }
                android.widget.ImageView$ScaleType r4 = android.widget.ImageView.ScaleType.CENTER_INSIDE     // Catch:{ NoSuchFieldError -> 0x004e }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x004e }
                r1[r4] = r0     // Catch:{ NoSuchFieldError -> 0x004e }
            L_0x004e:
                int[] r0 = f46540a     // Catch:{ NoSuchFieldError -> 0x0058 }
                android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.FIT_CENTER     // Catch:{ NoSuchFieldError -> 0x0058 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0058 }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0058 }
            L_0x0058:
                int[] r0 = f46540a     // Catch:{ NoSuchFieldError -> 0x0062 }
                android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.FIT_START     // Catch:{ NoSuchFieldError -> 0x0062 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0062 }
                r0[r1] = r3     // Catch:{ NoSuchFieldError -> 0x0062 }
            L_0x0062:
                int[] r0 = f46540a     // Catch:{ NoSuchFieldError -> 0x006d }
                android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.FIT_END     // Catch:{ NoSuchFieldError -> 0x006d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006d }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x006d }
            L_0x006d:
                int[] r0 = f46540a     // Catch:{ NoSuchFieldError -> 0x0078 }
                android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.FIT_XY     // Catch:{ NoSuchFieldError -> 0x0078 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0078 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0078 }
            L_0x0078:
                int[] r0 = f46540a     // Catch:{ NoSuchFieldError -> 0x0083 }
                android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.CENTER     // Catch:{ NoSuchFieldError -> 0x0083 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0083 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0083 }
            L_0x0083:
                int[] r0 = f46540a     // Catch:{ NoSuchFieldError -> 0x008f }
                android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.MATRIX     // Catch:{ NoSuchFieldError -> 0x008f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x008f }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x008f }
            L_0x008f:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.k.a.<clinit>():void");
        }
    }

    @SuppressLint({"CheckResult"})
    protected k(b bVar, l lVar, Class<TranscodeType> cls, Context context) {
        this.f46529D = bVar;
        this.f46527B = lVar;
        this.f46528C = cls;
        this.f46526A = context;
        this.f46531F = lVar.t(cls);
        this.f46530E = bVar.i();
        D0(lVar.r());
        a(lVar.s());
    }

    /* JADX WARNING: type inference failed for: r27v0, types: [U7.a, U7.a<?>] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private U7.d A0(java.lang.Object r19, V7.i<TranscodeType> r20, U7.f<TranscodeType> r21, U7.e r22, com.bumptech.glide.m<?, ? super TranscodeType> r23, com.bumptech.glide.g r24, int r25, int r26, U7.a<?> r27, java.util.concurrent.Executor r28) {
        /*
            r18 = this;
            r11 = r18
            r12 = r19
            r5 = r22
            r13 = r24
            com.bumptech.glide.k<TranscodeType> r0 = r11.f46534I
            if (r0 == 0) goto L_0x0095
            boolean r1 = r11.f46539N
            if (r1 != 0) goto L_0x008d
            com.bumptech.glide.m<?, ? super TranscodeType> r1 = r0.f46531F
            boolean r2 = r0.f46537L
            if (r2 == 0) goto L_0x0019
            r14 = r23
            goto L_0x001a
        L_0x0019:
            r14 = r1
        L_0x001a:
            boolean r0 = r0.N()
            if (r0 == 0) goto L_0x0028
            com.bumptech.glide.k<TranscodeType> r0 = r11.f46534I
            com.bumptech.glide.g r0 = r0.z()
        L_0x0026:
            r15 = r0
            goto L_0x002d
        L_0x0028:
            com.bumptech.glide.g r0 = r11.C0(r13)
            goto L_0x0026
        L_0x002d:
            com.bumptech.glide.k<TranscodeType> r0 = r11.f46534I
            int r0 = r0.v()
            com.bumptech.glide.k<TranscodeType> r1 = r11.f46534I
            int r1 = r1.u()
            boolean r2 = Y7.l.u(r25, r26)
            if (r2 == 0) goto L_0x004f
            com.bumptech.glide.k<TranscodeType> r2 = r11.f46534I
            boolean r2 = r2.V()
            if (r2 != 0) goto L_0x004f
            int r0 = r27.v()
            int r1 = r27.u()
        L_0x004f:
            r16 = r0
            r17 = r1
            U7.j r10 = new U7.j
            r10.<init>(r12, r5)
            r0 = r18
            r1 = r19
            r2 = r20
            r3 = r21
            r4 = r27
            r5 = r10
            r6 = r23
            r7 = r24
            r8 = r25
            r9 = r26
            r13 = r10
            r10 = r28
            U7.d r10 = r0.P0(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            r0 = 1
            r11.f46539N = r0
            com.bumptech.glide.k<TranscodeType> r9 = r11.f46534I
            r0 = r9
            r4 = r13
            r5 = r14
            r6 = r15
            r7 = r16
            r8 = r17
            r12 = r10
            r10 = r28
            U7.d r0 = r0.z0(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            r1 = 0
            r11.f46539N = r1
            r13.o(r12, r0)
            return r13
        L_0x008d:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "You cannot use a request as both the main request and a thumbnail, consider using clone() on the request(s) passed to thumbnail()"
            r0.<init>(r1)
            throw r0
        L_0x0095:
            java.lang.Float r0 = r11.f46536K
            if (r0 == 0) goto L_0x00d5
            U7.j r14 = new U7.j
            r14.<init>(r12, r5)
            r0 = r18
            r1 = r19
            r2 = r20
            r3 = r21
            r4 = r27
            r5 = r14
            r6 = r23
            r7 = r24
            r8 = r25
            r9 = r26
            r10 = r28
            U7.d r15 = r0.P0(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            U7.a r0 = r27.clone()
            java.lang.Float r1 = r11.f46536K
            float r1 = r1.floatValue()
            U7.a r4 = r0.l0(r1)
            com.bumptech.glide.g r7 = r11.C0(r13)
            r0 = r18
            r1 = r19
            U7.d r0 = r0.P0(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            r14.o(r15, r0)
            return r14
        L_0x00d5:
            r0 = r18
            r1 = r19
            r2 = r20
            r3 = r21
            r4 = r27
            r5 = r22
            r6 = r23
            r7 = r24
            r8 = r25
            r9 = r26
            r10 = r28
            U7.d r0 = r0.P0(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.k.A0(java.lang.Object, V7.i, U7.f, U7.e, com.bumptech.glide.m, com.bumptech.glide.g, int, int, U7.a, java.util.concurrent.Executor):U7.d");
    }

    private g C0(g gVar) {
        int i10 = a.f46541b[gVar.ordinal()];
        if (i10 == 1) {
            return g.NORMAL;
        }
        if (i10 == 2) {
            return g.HIGH;
        }
        if (i10 == 3 || i10 == 4) {
            return g.IMMEDIATE;
        }
        throw new IllegalArgumentException("unknown priority: " + z());
    }

    @SuppressLint({"CheckResult"})
    private void D0(List<f<Object>> list) {
        for (f<Object> v02 : list) {
            v0(v02);
        }
    }

    private <Y extends i<TranscodeType>> Y G0(Y y10, f<TranscodeType> fVar, U7.a<?> aVar, Executor executor) {
        Y7.k.d(y10);
        if (this.f46538M) {
            d y02 = y0(y10, fVar, aVar, executor);
            d b10 = y10.b();
            if (!y02.i(b10) || J0(aVar, b10)) {
                this.f46527B.o(y10);
                y10.i(y02);
                this.f46527B.B(y10, y02);
                return y10;
            }
            if (!((d) Y7.k.d(b10)).isRunning()) {
                b10.j();
            }
            return y10;
        }
        throw new IllegalArgumentException("You must call #load() before calling #into()");
    }

    private boolean J0(U7.a<?> aVar, d dVar) {
        return !aVar.M() && dVar.h();
    }

    private k<TranscodeType> O0(Object obj) {
        if (K()) {
            return clone().O0(obj);
        }
        this.f46532G = obj;
        this.f46538M = true;
        return (k) i0();
    }

    private d P0(Object obj, i<TranscodeType> iVar, f<TranscodeType> fVar, U7.a<?> aVar, e eVar, m<?, ? super TranscodeType> mVar, g gVar, int i10, int i11, Executor executor) {
        Context context = this.f46526A;
        d dVar = this.f46530E;
        return U7.i.z(context, dVar, obj, this.f46532G, this.f46528C, aVar, i10, i11, gVar, iVar, fVar, this.f46533H, eVar, dVar.f(), mVar.c(), executor);
    }

    private k<TranscodeType> x0(k<TranscodeType> kVar) {
        return (k) ((k) kVar.n0(this.f46526A.getTheme())).k0(X7.a.c(this.f46526A));
    }

    private d y0(i<TranscodeType> iVar, f<TranscodeType> fVar, U7.a<?> aVar, Executor executor) {
        return z0(new Object(), iVar, fVar, (e) null, this.f46531F, aVar.z(), aVar.v(), aVar.u(), aVar, executor);
    }

    private d z0(Object obj, i<TranscodeType> iVar, f<TranscodeType> fVar, e eVar, m<?, ? super TranscodeType> mVar, g gVar, int i10, int i11, U7.a<?> aVar, Executor executor) {
        b bVar;
        b bVar2;
        if (this.f46535J != null) {
            bVar2 = new b(obj, eVar);
            bVar = bVar2;
        } else {
            Object obj2 = obj;
            bVar = null;
            bVar2 = eVar;
        }
        d A02 = A0(obj, iVar, fVar, bVar2, mVar, gVar, i10, i11, aVar, executor);
        if (bVar == null) {
            return A02;
        }
        int v10 = this.f46535J.v();
        int u10 = this.f46535J.u();
        if (l.u(i10, i11) && !this.f46535J.V()) {
            v10 = aVar.v();
            u10 = aVar.u();
        }
        k<TranscodeType> kVar = this.f46535J;
        b bVar3 = bVar;
        bVar3.p(A02, kVar.z0(obj, iVar, fVar, bVar3, kVar.f46531F, kVar.z(), v10, u10, this.f46535J, executor));
        return bVar3;
    }

    /* renamed from: B0 */
    public k<TranscodeType> clone() {
        k<TranscodeType> kVar = (k) super.clone();
        kVar.f46531F = kVar.f46531F.clone();
        if (kVar.f46533H != null) {
            kVar.f46533H = new ArrayList(kVar.f46533H);
        }
        k<TranscodeType> kVar2 = kVar.f46534I;
        if (kVar2 != null) {
            kVar.f46534I = kVar2.clone();
        }
        k<TranscodeType> kVar3 = kVar.f46535J;
        if (kVar3 != null) {
            kVar.f46535J = kVar3.clone();
        }
        return kVar;
    }

    public <Y extends i<TranscodeType>> Y F0(Y y10) {
        return H0(y10, (f) null, Y7.e.b());
    }

    /* access modifiers changed from: package-private */
    public <Y extends i<TranscodeType>> Y H0(Y y10, f<TranscodeType> fVar, Executor executor) {
        return G0(y10, fVar, this, executor);
    }

    public V7.j<ImageView, TranscodeType> I0(ImageView imageView) {
        U7.a aVar;
        l.a();
        Y7.k.d(imageView);
        if (!T() && R() && imageView.getScaleType() != null) {
            switch (a.f46540a[imageView.getScaleType().ordinal()]) {
                case 1:
                    aVar = clone().X();
                    break;
                case 2:
                    aVar = clone().Y();
                    break;
                case 3:
                case 4:
                case 5:
                    aVar = clone().Z();
                    break;
                case 6:
                    aVar = clone().Y();
                    break;
            }
        }
        aVar = this;
        return (V7.j) G0(this.f46530E.a(imageView, this.f46528C), (f) null, aVar, Y7.e.b());
    }

    public k<TranscodeType> K0(Integer num) {
        return x0(O0(num));
    }

    public k<TranscodeType> L0(Object obj) {
        return O0(obj);
    }

    public k<TranscodeType> M0(String str) {
        return O0(str);
    }

    public k<TranscodeType> Q0(m<?, ? super TranscodeType> mVar) {
        if (K()) {
            return clone().Q0(mVar);
        }
        this.f46531F = (m) Y7.k.d(mVar);
        this.f46537L = false;
        return (k) i0();
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return super.equals(kVar) && Objects.equals(this.f46528C, kVar.f46528C) && this.f46531F.equals(kVar.f46531F) && Objects.equals(this.f46532G, kVar.f46532G) && Objects.equals(this.f46533H, kVar.f46533H) && Objects.equals(this.f46534I, kVar.f46534I) && Objects.equals(this.f46535J, kVar.f46535J) && Objects.equals(this.f46536K, kVar.f46536K) && this.f46537L == kVar.f46537L && this.f46538M == kVar.f46538M;
    }

    public int hashCode() {
        return l.q(this.f46538M, l.q(this.f46537L, l.p(this.f46536K, l.p(this.f46535J, l.p(this.f46534I, l.p(this.f46533H, l.p(this.f46532G, l.p(this.f46531F, l.p(this.f46528C, super.hashCode())))))))));
    }

    public k<TranscodeType> v0(f<TranscodeType> fVar) {
        if (K()) {
            return clone().v0(fVar);
        }
        if (fVar != null) {
            if (this.f46533H == null) {
                this.f46533H = new ArrayList();
            }
            this.f46533H.add(fVar);
        }
        return (k) i0();
    }

    /* renamed from: w0 */
    public k<TranscodeType> a(U7.a<?> aVar) {
        Y7.k.d(aVar);
        return (k) super.a(aVar);
    }
}
