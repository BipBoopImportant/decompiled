package vm;

import QJ.C16310i;
import QJ.M;
import QJ.Q;
import U0.C4899r0;
import U0.C4910x;
import U0.I0;
import U0.o1;
import XH.C16807N;
import XH.y;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import dI.C17164e;
import eI.C17187b;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import nI.p;
import vm.C12190a;

@Metadata(d1 = {"\u0000D\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\u001aa\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\b2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\rH\u0007¢\u0006\u0004\b\u0010\u0010\u0011\"#\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00130\u00128\u0006¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u0012\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u001d²\u0006\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u001b8\n@\nX\u0002"}, d2 = {"", "content", "Lvm/a$a;", "format", "Lc2/h;", "width", "height", "margin", "", "trimBoundaries", "useHighLevelErrorCorrection", "", "rotationInDegrees", "LQJ/M;", "dispatcher", "Lt1/a;", "e", "(Ljava/lang/String;Lvm/a$a;FFFZZFLQJ/M;LU0/m;II)Lt1/a;", "LU0/I0;", "Lvm/a;", "a", "LU0/I0;", "d", "()LU0/I0;", "getLocalBarcode$annotations", "()V", "LocalBarcode", "Landroid/graphics/Bitmap;", "bitmap", "barcode_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* renamed from: vm.c  reason: case insensitive filesystem */
public final class C12192c {

    /* renamed from: a  reason: collision with root package name */
    private static final I0<C12190a> f105190a = C4910x.d((o1) null, new C12191b(), 1, (Object) null);

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @f(c = "com.ingka.ikea.barcode.BarcodeComposeKt$rememberBarcodeBitmapPainter$1$1", f = "BarcodeCompose.kt", l = {69}, m = "invokeSuspend")
    /* renamed from: vm.c$a */
    static final class a extends l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        Object f105191c;

        /* renamed from: d  reason: collision with root package name */
        int f105192d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ M f105193e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ C12190a f105194f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ String f105195g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ C12190a.C2496a f105196h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ int f105197i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ int f105198j;

        /* renamed from: k  reason: collision with root package name */
        final /* synthetic */ boolean f105199k;

        /* renamed from: l  reason: collision with root package name */
        final /* synthetic */ int f105200l;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ boolean f105201m;

        /* renamed from: n  reason: collision with root package name */
        final /* synthetic */ float f105202n;

        /* renamed from: o  reason: collision with root package name */
        final /* synthetic */ C4899r0<Bitmap> f105203o;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "Landroid/graphics/Bitmap;", "<anonymous>", "(LQJ/Q;)Landroid/graphics/Bitmap;"}, k = 3, mv = {2, 1, 0})
        @f(c = "com.ingka.ikea.barcode.BarcodeComposeKt$rememberBarcodeBitmapPainter$1$1$1", f = "BarcodeCompose.kt", l = {}, m = "invokeSuspend")
        /* renamed from: vm.c$a$a  reason: collision with other inner class name */
        static final class C2497a extends l implements p<Q, C17164e<? super Bitmap>, Object> {

            /* renamed from: c  reason: collision with root package name */
            int f105204c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ C12190a f105205d;

            /* renamed from: e  reason: collision with root package name */
            final /* synthetic */ String f105206e;

            /* renamed from: f  reason: collision with root package name */
            final /* synthetic */ C12190a.C2496a f105207f;

            /* renamed from: g  reason: collision with root package name */
            final /* synthetic */ int f105208g;

            /* renamed from: h  reason: collision with root package name */
            final /* synthetic */ int f105209h;

            /* renamed from: i  reason: collision with root package name */
            final /* synthetic */ boolean f105210i;

            /* renamed from: j  reason: collision with root package name */
            final /* synthetic */ int f105211j;

            /* renamed from: k  reason: collision with root package name */
            final /* synthetic */ boolean f105212k;

            /* renamed from: l  reason: collision with root package name */
            final /* synthetic */ float f105213l;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C2497a(C12190a aVar, String str, C12190a.C2496a aVar2, int i10, int i11, boolean z10, int i12, boolean z11, float f10, C17164e<? super C2497a> eVar) {
                super(2, eVar);
                this.f105205d = aVar;
                this.f105206e = str;
                this.f105207f = aVar2;
                this.f105208g = i10;
                this.f105209h = i11;
                this.f105210i = z10;
                this.f105211j = i12;
                this.f105212k = z11;
                this.f105213l = f10;
            }

            public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
                return new C2497a(this.f105205d, this.f105206e, this.f105207f, this.f105208g, this.f105209h, this.f105210i, this.f105211j, this.f105212k, this.f105213l, eVar);
            }

            public final Object invoke(Q q10, C17164e<? super Bitmap> eVar) {
                return ((C2497a) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
            }

            public final Object invokeSuspend(Object obj) {
                C17187b.f();
                if (this.f105204c == 0) {
                    y.b(obj);
                    Bitmap a10 = this.f105205d.a(this.f105206e, this.f105207f, this.f105208g, this.f105209h, this.f105210i, this.f105211j, this.f105212k);
                    if (a10 == null || this.f105213l == 0.0f) {
                        return a10;
                    }
                    Matrix matrix = new Matrix();
                    matrix.postRotate(this.f105213l);
                    return Bitmap.createBitmap(a10, 0, 0, a10.getWidth(), a10.getHeight(), matrix, true);
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(M m10, C12190a aVar, String str, C12190a.C2496a aVar2, int i10, int i11, boolean z10, int i12, boolean z11, float f10, C4899r0<Bitmap> r0Var, C17164e<? super a> eVar) {
            super(2, eVar);
            this.f105193e = m10;
            this.f105194f = aVar;
            this.f105195g = str;
            this.f105196h = aVar2;
            this.f105197i = i10;
            this.f105198j = i11;
            this.f105199k = z10;
            this.f105200l = i12;
            this.f105201m = z11;
            this.f105202n = f10;
            this.f105203o = r0Var;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new a(this.f105193e, this.f105194f, this.f105195g, this.f105196h, this.f105197i, this.f105198j, this.f105199k, this.f105200l, this.f105201m, this.f105202n, this.f105203o, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((a) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object obj2;
            C4899r0<Bitmap> r0Var;
            Object f10 = C17187b.f();
            int i10 = this.f105192d;
            if (i10 == 0) {
                y.b(obj);
                C4899r0<Bitmap> r0Var2 = this.f105203o;
                M m10 = this.f105193e;
                C2497a aVar = r5;
                C2497a aVar2 = new C2497a(this.f105194f, this.f105195g, this.f105196h, this.f105197i, this.f105198j, this.f105199k, this.f105200l, this.f105201m, this.f105202n, (C17164e<? super C2497a>) null);
                this.f105191c = r0Var2;
                this.f105192d = 1;
                obj2 = C16310i.g(m10, aVar, this);
                if (obj2 == f10) {
                    return f10;
                }
                r0Var = r0Var2;
            } else if (i10 == 1) {
                r0Var = (C4899r0) this.f105191c;
                y.b(obj);
                obj2 = obj;
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C12192c.g(r0Var, (Bitmap) obj2);
            return C16807N.f139792a;
        }
    }

    /* access modifiers changed from: private */
    public static final C12190a b() {
        return new C12194e();
    }

    public static final I0<C12190a> d() {
        return f105190a;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v4, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v13, resolved type: t1.a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r20v2, resolved type: t1.a} */
    /* JADX WARNING: type inference failed for: r1v5 */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x01c7, code lost:
        if (r1 == r25.a()) goto L_0x01c9;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final t1.C5940a e(java.lang.String r20, vm.C12190a.C2496a r21, float r22, float r23, float r24, boolean r25, boolean r26, float r27, QJ.M r28, U0.C4889m r29, int r30, int r31) {
        /*
            r3 = r20
            r4 = r21
            r13 = r29
            r0 = r30
            r1 = r31
            java.lang.String r2 = "content"
            kotlin.jvm.internal.C17542s.j(r3, r2)
            java.lang.String r2 = "format"
            kotlin.jvm.internal.C17542s.j(r4, r2)
            r2 = -1115731367(0xffffffffbd7f4a59, float:-0.062326763)
            r13.W(r2)
            r5 = r1 & 16
            r14 = 0
            if (r5 == 0) goto L_0x0025
            float r5 = (float) r14
            float r5 = c2.h.B(r5)
            goto L_0x0027
        L_0x0025:
            r5 = r24
        L_0x0027:
            r6 = r1 & 32
            if (r6 == 0) goto L_0x002d
            r8 = 1
            goto L_0x002f
        L_0x002d:
            r8 = r25
        L_0x002f:
            r6 = r1 & 64
            if (r6 == 0) goto L_0x0035
            r9 = r14
            goto L_0x0037
        L_0x0035:
            r9 = r26
        L_0x0037:
            r6 = r1 & 128(0x80, float:1.794E-43)
            if (r6 == 0) goto L_0x003e
            r6 = 0
            r10 = r6
            goto L_0x0040
        L_0x003e:
            r10 = r27
        L_0x0040:
            r1 = r1 & 256(0x100, float:3.59E-43)
            if (r1 == 0) goto L_0x0049
            QJ.M r1 = QJ.C16311i0.b()
            goto L_0x004b
        L_0x0049:
            r1 = r28
        L_0x004b:
            boolean r6 = U0.C4895p.J()
            if (r6 == 0) goto L_0x0057
            r6 = -1
            java.lang.String r11 = "com.ingka.ikea.barcode.rememberBarcodeBitmapPainter (BarcodeCompose.kt:52)"
            U0.C4895p.S(r2, r0, r6, r11)
        L_0x0057:
            U0.I0 r2 = androidx.compose.ui.platform.C5100f0.e()
            java.lang.Object r2 = r13.Q(r2)
            c2.d r2 = (c2.d) r2
            r6 = -357128360(0xffffffffeab6a758, float:-1.1040738E26)
            r13.W(r6)
            U0.I0 r6 = androidx.compose.ui.platform.C5135u0.a()
            java.lang.Object r6 = r13.Q(r6)
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            r11 = 2
            if (r6 == 0) goto L_0x0088
            float r6 = (float) r11
            float r6 = c2.h.B(r6)
            float r6 = r2.H1(r6)
            vm.f r12 = new vm.f
            r12.<init>(r6)
            r6 = r12
            goto L_0x0090
        L_0x0088:
            U0.I0<vm.a> r6 = f105190a
            java.lang.Object r6 = r13.Q(r6)
            vm.a r6 = (vm.C12190a) r6
        L_0x0090:
            r29.P()
            r12 = -357123090(0xffffffffeab6bbee, float:-1.1045599E26)
            r13.W(r12)
            java.lang.Object r12 = r29.D()
            U0.m$a r15 = U0.C4889m.f14007a
            java.lang.Object r7 = r15.a()
            if (r12 != r7) goto L_0x00ad
            r7 = 0
            U0.r0 r12 = U0.u1.e(r7, r7, r11, r7)
            r13.u(r12)
        L_0x00ad:
            r16 = r12
            U0.r0 r16 = (U0.C4899r0) r16
            r29.P()
            r7 = r22
            int r12 = r2.K0(r7)
            r11 = r23
            int r14 = r2.K0(r11)
            int r2 = r2.K0(r5)
            c2.h r7 = c2.h.m(r22)
            c2.h r11 = c2.h.m(r23)
            c2.h r5 = c2.h.m(r5)
            java.lang.Object[] r11 = new java.lang.Object[]{r3, r7, r11, r5}
            r5 = -357113859(0xffffffffeab6dffd, float:-1.1054113E26)
            r13.W(r5)
            boolean r5 = r13.F(r1)
            boolean r7 = r13.F(r6)
            r5 = r5 | r7
            r7 = r0 & 14
            r7 = r7 ^ 6
            r22 = r11
            r11 = 4
            if (r7 <= r11) goto L_0x00f2
            boolean r7 = r13.V(r3)
            if (r7 != 0) goto L_0x00f6
        L_0x00f2:
            r7 = r0 & 6
            if (r7 != r11) goto L_0x00f8
        L_0x00f6:
            r7 = 1
            goto L_0x00f9
        L_0x00f8:
            r7 = 0
        L_0x00f9:
            r5 = r5 | r7
            r7 = r0 & 112(0x70, float:1.57E-43)
            r7 = r7 ^ 48
            r11 = 32
            if (r7 <= r11) goto L_0x0108
            boolean r7 = r13.V(r4)
            if (r7 != 0) goto L_0x010c
        L_0x0108:
            r7 = r0 & 48
            if (r7 != r11) goto L_0x010e
        L_0x010c:
            r7 = 1
            goto L_0x010f
        L_0x010e:
            r7 = 0
        L_0x010f:
            r5 = r5 | r7
            boolean r7 = r13.d(r12)
            r5 = r5 | r7
            boolean r7 = r13.d(r14)
            r5 = r5 | r7
            r7 = 458752(0x70000, float:6.42848E-40)
            r7 = r7 & r0
            r11 = 196608(0x30000, float:2.75506E-40)
            r7 = r7 ^ r11
            r11 = 131072(0x20000, float:1.83671E-40)
            if (r7 <= r11) goto L_0x012a
            boolean r7 = r13.b(r8)
            if (r7 != 0) goto L_0x012f
        L_0x012a:
            r7 = 196608(0x30000, float:2.75506E-40)
            r7 = r7 & r0
            if (r7 != r11) goto L_0x0131
        L_0x012f:
            r7 = 1
            goto L_0x0132
        L_0x0131:
            r7 = 0
        L_0x0132:
            r5 = r5 | r7
            boolean r7 = r13.d(r2)
            r5 = r5 | r7
            r7 = 3670016(0x380000, float:5.142788E-39)
            r7 = r7 & r0
            r11 = 1572864(0x180000, float:2.204052E-39)
            r7 = r7 ^ r11
            r11 = 1048576(0x100000, float:1.469368E-39)
            if (r7 <= r11) goto L_0x0148
            boolean r7 = r13.b(r9)
            if (r7 != 0) goto L_0x014d
        L_0x0148:
            r7 = 1572864(0x180000, float:2.204052E-39)
            r7 = r7 & r0
            if (r7 != r11) goto L_0x014f
        L_0x014d:
            r7 = 1
            goto L_0x0150
        L_0x014f:
            r7 = 0
        L_0x0150:
            r5 = r5 | r7
            r7 = 29360128(0x1c00000, float:7.052966E-38)
            r7 = r7 & r0
            r11 = 12582912(0xc00000, float:1.7632415E-38)
            r7 = r7 ^ r11
            r11 = 8388608(0x800000, float:1.17549435E-38)
            if (r7 <= r11) goto L_0x0161
            boolean r7 = r13.c(r10)
            if (r7 != 0) goto L_0x0166
        L_0x0161:
            r7 = 12582912(0xc00000, float:1.7632415E-38)
            r0 = r0 & r7
            if (r0 != r11) goto L_0x0168
        L_0x0166:
            r7 = 1
            goto L_0x0169
        L_0x0168:
            r7 = 0
        L_0x0169:
            r0 = r5 | r7
            java.lang.Object r5 = r29.D()
            if (r0 != 0) goto L_0x0181
            java.lang.Object r0 = r15.a()
            if (r5 != r0) goto L_0x0178
            goto L_0x0181
        L_0x0178:
            r19 = r12
            r24 = r14
            r25 = r15
            r14 = r22
            goto L_0x01a6
        L_0x0181:
            vm.c$a r11 = new vm.c$a
            r17 = 0
            r0 = r11
            r18 = r2
            r2 = r6
            r3 = r20
            r4 = r21
            r5 = r12
            r6 = r14
            r7 = r8
            r8 = r18
            r24 = r14
            r25 = r15
            r14 = r22
            r15 = r11
            r11 = r16
            r19 = r12
            r12 = r17
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            r13.u(r15)
            r5 = r15
        L_0x01a6:
            nI.p r5 = (nI.p) r5
            r29.P()
            r0 = 0
            U0.P.h(r14, r5, r13, r0)
            android.graphics.Bitmap r0 = f(r16)
            r1 = -357085617(0xffffffffeab74e4f, float:-1.1080161E26)
            r13.W(r1)
            boolean r0 = r13.V(r0)
            java.lang.Object r1 = r29.D()
            if (r0 != 0) goto L_0x01c9
            java.lang.Object r0 = r25.a()
            if (r1 != r0) goto L_0x0200
        L_0x01c9:
            android.graphics.Bitmap r0 = f(r16)
            if (r0 != 0) goto L_0x01e2
            android.graphics.Bitmap$Config r0 = android.graphics.Bitmap.Config.ARGB_8888
            r2 = r24
            r1 = r19
            android.graphics.Bitmap r0 = android.graphics.Bitmap.createBitmap(r1, r2, r0)
            r1 = 0
            r0.eraseColor(r1)
            java.lang.String r1 = "apply(...)"
            kotlin.jvm.internal.C17542s.i(r0, r1)
        L_0x01e2:
            t1.a r1 = new t1.a
            p1.J0 r0 = p1.O.c(r0)
            r2 = 6
            r3 = 0
            r4 = 0
            r6 = 0
            r20 = r1
            r21 = r0
            r22 = r4
            r24 = r6
            r26 = r2
            r27 = r3
            r20.<init>(r21, r22, r24, r26, r27)
            r13.u(r1)
        L_0x0200:
            t1.a r1 = (t1.C5940a) r1
            r29.P()
            boolean r0 = U0.C4895p.J()
            if (r0 == 0) goto L_0x020e
            U0.C4895p.R()
        L_0x020e:
            r29.P()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: vm.C12192c.e(java.lang.String, vm.a$a, float, float, float, boolean, boolean, float, QJ.M, U0.m, int, int):t1.a");
    }

    private static final Bitmap f(C4899r0<Bitmap> r0Var) {
        return r0Var.getValue();
    }

    /* access modifiers changed from: private */
    public static final void g(C4899r0<Bitmap> r0Var, Bitmap bitmap) {
        r0Var.setValue(bitmap);
    }
}
