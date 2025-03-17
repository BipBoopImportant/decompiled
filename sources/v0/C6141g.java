package v0;

import XH.C16807N;
import c2.d;
import c2.h;
import dI.C17164e;
import eI.C17187b;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17544u;
import kotlin.jvm.internal.K;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.M;
import kotlin.jvm.internal.O;
import m0.C5544h;
import m0.C5550k;
import m0.C5554m;
import nI.C17642l;
import nI.p;
import p0.C5678A;
import pI.C17752b;
import tI.C17978n;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u001a\u001b\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a4\u0010\u000b\u001a\u00020\n*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\u00012\u0006\u0010\t\u001a\u00020\bH@¢\u0006\u0004\b\u000b\u0010\f\"\u0014\u0010\u0010\u001a\u00020\r8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f\"\u0014\u0010\u0012\u001a\u00020\r8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u000f\"\u0014\u0010\u0014\u001a\u00020\r8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u000f¨\u0006\u0015"}, d2 = {"Lv0/h;", "", "index", "", "e", "(Lv0/h;I)Z", "scrollOffset", "numOfItemsForTeleport", "Lc2/d;", "density", "LXH/N;", "d", "(Lv0/h;IIILc2/d;LdI/e;)Ljava/lang/Object;", "Lc2/h;", "a", "F", "TargetDistance", "b", "BoundDistance", "c", "MinimumDistance", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* renamed from: v0.g  reason: case insensitive filesystem */
public final class C6141g {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public static final float f30863a = h.B((float) 2500);
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public static final float f30864b = h.B((float) 1500);
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public static final float f30865c = h.B((float) 50);

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lp0/A;", "LXH/N;", "<anonymous>", "(Lp0/A;)V"}, k = 3, mv = {1, 8, 0})
    @f(c = "androidx.compose.foundation.lazy.layout.LazyAnimateScrollKt$animateScrollToItem$2", f = "LazyAnimateScroll.kt", l = {174, 272}, m = "invokeSuspend")
    /* renamed from: v0.g$a */
    static final class a extends l implements p<C5678A, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        Object f30866c;

        /* renamed from: d  reason: collision with root package name */
        Object f30867d;

        /* renamed from: e  reason: collision with root package name */
        Object f30868e;

        /* renamed from: f  reason: collision with root package name */
        float f30869f;

        /* renamed from: g  reason: collision with root package name */
        float f30870g;

        /* renamed from: h  reason: collision with root package name */
        float f30871h;

        /* renamed from: i  reason: collision with root package name */
        int f30872i;

        /* renamed from: j  reason: collision with root package name */
        int f30873j;

        /* renamed from: k  reason: collision with root package name */
        private /* synthetic */ Object f30874k;

        /* renamed from: l  reason: collision with root package name */
        final /* synthetic */ int f30875l;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ d f30876m;

        /* renamed from: n  reason: collision with root package name */
        final /* synthetic */ C6142h f30877n;

        /* renamed from: o  reason: collision with root package name */
        final /* synthetic */ int f30878o;

        /* renamed from: p  reason: collision with root package name */
        final /* synthetic */ int f30879p;

        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lm0/h;", "", "Lm0/m;", "LXH/N;", "a", "(Lm0/h;)V"}, k = 3, mv = {1, 8, 0})
        /* renamed from: v0.g$a$a  reason: collision with other inner class name */
        static final class C0476a extends C17544u implements C17642l<C5544h<Float, C5554m>, C16807N> {

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ C6142h f30880c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ int f30881d;

            /* renamed from: e  reason: collision with root package name */
            final /* synthetic */ float f30882e;

            /* renamed from: f  reason: collision with root package name */
            final /* synthetic */ L f30883f;

            /* renamed from: g  reason: collision with root package name */
            final /* synthetic */ C5678A f30884g;

            /* renamed from: h  reason: collision with root package name */
            final /* synthetic */ K f30885h;

            /* renamed from: i  reason: collision with root package name */
            final /* synthetic */ boolean f30886i;

            /* renamed from: j  reason: collision with root package name */
            final /* synthetic */ float f30887j;

            /* renamed from: k  reason: collision with root package name */
            final /* synthetic */ M f30888k;

            /* renamed from: l  reason: collision with root package name */
            final /* synthetic */ int f30889l;

            /* renamed from: m  reason: collision with root package name */
            final /* synthetic */ int f30890m;

            /* renamed from: n  reason: collision with root package name */
            final /* synthetic */ O<C5550k<Float, C5554m>> f30891n;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C0476a(C6142h hVar, int i10, float f10, L l10, C5678A a10, K k10, boolean z10, float f11, M m10, int i11, int i12, O<C5550k<Float, C5554m>> o10) {
                super(1);
                this.f30880c = hVar;
                this.f30881d = i10;
                this.f30882e = f10;
                this.f30883f = l10;
                this.f30884g = a10;
                this.f30885h = k10;
                this.f30886i = z10;
                this.f30887j = f11;
                this.f30888k = m10;
                this.f30889l = i11;
                this.f30890m = i12;
                this.f30891n = o10;
            }

            public final void a(C5544h<Float, C5554m> hVar) {
                int i10;
                int i11;
                int i12;
                if (!C6141g.e(this.f30880c, this.f30881d)) {
                    float h10 = (this.f30882e > 0.0f ? C17978n.h(hVar.e().floatValue(), this.f30882e) : C17978n.d(hVar.e().floatValue(), this.f30882e)) - this.f30883f.f144345a;
                    float a10 = this.f30884g.a(h10);
                    if (!C6141g.e(this.f30880c, this.f30881d) && !a.k(this.f30886i, this.f30880c, this.f30881d, this.f30890m)) {
                        if (h10 == a10) {
                            this.f30883f.f144345a += h10;
                            if (this.f30886i) {
                                if (hVar.e().floatValue() > this.f30887j) {
                                    hVar.a();
                                }
                            } else if (hVar.e().floatValue() < (-this.f30887j)) {
                                hVar.a();
                            }
                            if (this.f30886i) {
                                if (this.f30888k.f144346a >= 2 && this.f30881d - this.f30880c.b() > (i12 = this.f30889l)) {
                                    this.f30880c.e(this.f30884g, this.f30881d - i12, 0);
                                }
                            } else if (this.f30888k.f144346a >= 2 && this.f30880c.g() - (i10 = this.f30881d) > (i11 = this.f30889l)) {
                                this.f30880c.e(this.f30884g, i10 + i11, 0);
                            }
                        } else {
                            hVar.a();
                            this.f30885h.f144344a = false;
                            return;
                        }
                    }
                }
                if (a.k(this.f30886i, this.f30880c, this.f30881d, this.f30890m)) {
                    this.f30880c.e(this.f30884g, this.f30881d, this.f30890m);
                    this.f30885h.f144344a = false;
                    hVar.a();
                } else if (C6141g.e(this.f30880c, this.f30881d)) {
                    throw new C6140f(C17752b.e(this.f30880c.c(this.f30881d)), (C5550k) this.f30891n.f144348a);
                }
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a((C5544h) obj);
                return C16807N.f139792a;
            }
        }

        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lm0/h;", "", "Lm0/m;", "LXH/N;", "a", "(Lm0/h;)V"}, k = 3, mv = {1, 8, 0})
        /* renamed from: v0.g$a$b */
        static final class b extends C17544u implements C17642l<C5544h<Float, C5554m>, C16807N> {

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ float f30892c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ L f30893d;

            /* renamed from: e  reason: collision with root package name */
            final /* synthetic */ C5678A f30894e;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            b(float f10, L l10, C5678A a10) {
                super(1);
                this.f30892c = f10;
                this.f30893d = l10;
                this.f30894e = a10;
            }

            public final void a(C5544h<Float, C5554m> hVar) {
                float f10 = this.f30892c;
                float f11 = 0.0f;
                if (f10 > 0.0f) {
                    f11 = C17978n.h(hVar.e().floatValue(), this.f30892c);
                } else if (f10 < 0.0f) {
                    f11 = C17978n.d(hVar.e().floatValue(), this.f30892c);
                }
                float f12 = f11 - this.f30893d.f144345a;
                if (!(f12 == this.f30894e.a(f12) && f11 == hVar.e().floatValue())) {
                    hVar.a();
                }
                this.f30893d.f144345a += f12;
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a((C5544h) obj);
                return C16807N.f139792a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(int i10, d dVar, C6142h hVar, int i11, int i12, C17164e<? super a> eVar) {
            super(2, eVar);
            this.f30875l = i10;
            this.f30876m = dVar;
            this.f30877n = hVar;
            this.f30878o = i11;
            this.f30879p = i12;
        }

        /* access modifiers changed from: private */
        public static final boolean k(boolean z10, C6142h hVar, int i10, int i11) {
            if (z10) {
                if (hVar.g() <= i10 && (hVar.g() != i10 || hVar.f() <= i11)) {
                    return false;
                }
            } else if (hVar.g() >= i10 && (hVar.g() != i10 || hVar.f() >= i11)) {
                return false;
            }
            return true;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            a aVar = new a(this.f30875l, this.f30876m, this.f30877n, this.f30878o, this.f30879p, eVar);
            aVar.f30874k = obj;
            return aVar;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v16, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v30, resolved type: p0.A} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* JADX WARNING: Removed duplicated region for block: B:36:0x00ea A[SYNTHETIC, Splitter:B:36:0x00ea] */
        /* JADX WARNING: Removed duplicated region for block: B:43:0x00fe  */
        /* JADX WARNING: Removed duplicated region for block: B:49:0x013e A[Catch:{ f -> 0x01bb }] */
        /* JADX WARNING: Removed duplicated region for block: B:50:0x0140 A[Catch:{ f -> 0x01bb }] */
        /* JADX WARNING: Removed duplicated region for block: B:53:0x0149 A[Catch:{ f -> 0x01bb }] */
        /* JADX WARNING: Removed duplicated region for block: B:54:0x014c A[Catch:{ f -> 0x01bb }] */
        /* JADX WARNING: Removed duplicated region for block: B:65:0x019a  */
        /* JADX WARNING: Removed duplicated region for block: B:88:0x0214  */
        /* JADX WARNING: Removed duplicated region for block: B:89:0x0217  */
        /* JADX WARNING: Removed duplicated region for block: B:92:0x023a A[RETURN] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r35) {
            /*
                r34 = this;
                r9 = r34
                java.lang.Object r10 = eI.C17187b.f()
                int r0 = r9.f30873j
                r11 = 2
                r12 = 0
                r14 = 1
                if (r0 == 0) goto L_0x0052
                if (r0 == r14) goto L_0x0022
                if (r0 != r11) goto L_0x001a
                java.lang.Object r0 = r9.f30874k
                p0.A r0 = (p0.C5678A) r0
                XH.y.b(r35)
                goto L_0x023b
            L_0x001a:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
                r0.<init>(r1)
                throw r0
            L_0x0022:
                int r0 = r9.f30872i
                float r1 = r9.f30871h
                float r2 = r9.f30870g
                float r3 = r9.f30869f
                java.lang.Object r4 = r9.f30868e
                kotlin.jvm.internal.M r4 = (kotlin.jvm.internal.M) r4
                java.lang.Object r5 = r9.f30867d
                kotlin.jvm.internal.O r5 = (kotlin.jvm.internal.O) r5
                java.lang.Object r6 = r9.f30866c
                kotlin.jvm.internal.K r6 = (kotlin.jvm.internal.K) r6
                java.lang.Object r7 = r9.f30874k
                p0.A r7 = (p0.C5678A) r7
                XH.y.b(r35)     // Catch:{ f -> 0x004c }
                r15 = r1
                r8 = r2
                r12 = r10
                r32 = r7
                r7 = r3
                r3 = r32
                r33 = r6
                r6 = r4
                r4 = r33
                goto L_0x01a2
            L_0x004c:
                r0 = move-exception
                r1 = r0
                r0 = r7
            L_0x004f:
                r12 = r10
                goto L_0x01e0
            L_0x0052:
                XH.y.b(r35)
                java.lang.Object r0 = r9.f30874k
                r1 = r0
                p0.A r1 = (p0.C5678A) r1
                int r0 = r9.f30875l
                float r2 = (float) r0
                int r2 = (r2 > r12 ? 1 : (r2 == r12 ? 0 : -1))
                if (r2 < 0) goto L_0x0063
                r2 = r14
                goto L_0x0064
            L_0x0063:
                r2 = 0
            L_0x0064:
                if (r2 == 0) goto L_0x0247
                c2.d r0 = r9.f30876m     // Catch:{ f -> 0x01bf }
                float r2 = v0.C6141g.f30863a     // Catch:{ f -> 0x01bf }
                float r0 = r0.H1(r2)     // Catch:{ f -> 0x01bf }
                c2.d r2 = r9.f30876m     // Catch:{ f -> 0x01bf }
                float r3 = v0.C6141g.f30864b     // Catch:{ f -> 0x01bf }
                float r2 = r2.H1(r3)     // Catch:{ f -> 0x01bf }
                c2.d r3 = r9.f30876m     // Catch:{ f -> 0x01bf }
                float r4 = v0.C6141g.f30865c     // Catch:{ f -> 0x01bf }
                float r3 = r3.H1(r4)     // Catch:{ f -> 0x01bf }
                kotlin.jvm.internal.K r4 = new kotlin.jvm.internal.K     // Catch:{ f -> 0x01bf }
                r4.<init>()     // Catch:{ f -> 0x01bf }
                r4.f144344a = r14     // Catch:{ f -> 0x01bf }
                kotlin.jvm.internal.O r5 = new kotlin.jvm.internal.O     // Catch:{ f -> 0x01bf }
                r5.<init>()     // Catch:{ f -> 0x01bf }
                r22 = 30
                r23 = 0
                r15 = 0
                r16 = 0
                r17 = 0
                r19 = 0
                r21 = 0
                m0.k r6 = m0.C5552l.c(r15, r16, r17, r19, r21, r22, r23)     // Catch:{ f -> 0x01bf }
                r5.f144348a = r6     // Catch:{ f -> 0x01bf }
                v0.h r6 = r9.f30877n     // Catch:{ f -> 0x01bf }
                int r7 = r9.f30875l     // Catch:{ f -> 0x01bf }
                boolean r6 = v0.C6141g.e(r6, r7)     // Catch:{ f -> 0x01bf }
                if (r6 != 0) goto L_0x01c7
                int r6 = r9.f30875l     // Catch:{ f -> 0x01bf }
                v0.h r7 = r9.f30877n     // Catch:{ f -> 0x01bf }
                int r7 = r7.g()     // Catch:{ f -> 0x01bf }
                if (r6 <= r7) goto L_0x00b9
                r6 = r14
                goto L_0x00ba
            L_0x00b9:
                r6 = 0
            L_0x00ba:
                kotlin.jvm.internal.M r7 = new kotlin.jvm.internal.M     // Catch:{ f -> 0x01bf }
                r7.<init>()     // Catch:{ f -> 0x01bf }
                r7.f144346a = r14     // Catch:{ f -> 0x01bf }
                r8 = r2
                r15 = r3
                r3 = r1
                r32 = r7
                r7 = r0
                r0 = r6
                r6 = r32
            L_0x00ca:
                boolean r1 = r4.f144344a     // Catch:{ f -> 0x01bb }
                if (r1 == 0) goto L_0x0244
                v0.h r1 = r9.f30877n     // Catch:{ f -> 0x01bb }
                int r1 = r1.a()     // Catch:{ f -> 0x01bb }
                if (r1 <= 0) goto L_0x0244
                v0.h r1 = r9.f30877n     // Catch:{ f -> 0x01bb }
                int r2 = r9.f30875l     // Catch:{ f -> 0x01bb }
                float r1 = r1.c(r2)     // Catch:{ f -> 0x01bb }
                int r2 = r9.f30878o     // Catch:{ f -> 0x01bb }
                float r2 = (float) r2     // Catch:{ f -> 0x01bb }
                float r1 = r1 + r2
                float r2 = java.lang.Math.abs(r1)     // Catch:{ f -> 0x01bb }
                int r2 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
                if (r2 >= 0) goto L_0x00fe
                float r1 = java.lang.Math.abs(r1)     // Catch:{ f -> 0x00f9 }
                float r1 = java.lang.Math.max(r1, r15)     // Catch:{ f -> 0x00f9 }
                if (r0 == 0) goto L_0x00f7
            L_0x00f4:
                r19 = r1
                goto L_0x0105
            L_0x00f7:
                float r1 = -r1
                goto L_0x00f4
            L_0x00f9:
                r0 = move-exception
                r1 = r0
                r0 = r3
                goto L_0x004f
            L_0x00fe:
                if (r0 == 0) goto L_0x0103
                r19 = r7
                goto L_0x0105
            L_0x0103:
                float r1 = -r7
                goto L_0x00f4
            L_0x0105:
                T r1 = r5.f144348a     // Catch:{ f -> 0x01bb }
                r20 = r1
                m0.k r20 = (m0.C5550k) r20     // Catch:{ f -> 0x01bb }
                r28 = 30
                r29 = 0
                r21 = 0
                r22 = 0
                r23 = 0
                r25 = 0
                r27 = 0
                m0.k r1 = m0.C5552l.g(r20, r21, r22, r23, r25, r27, r28, r29)     // Catch:{ f -> 0x01bb }
                r5.f144348a = r1     // Catch:{ f -> 0x01bb }
                kotlin.jvm.internal.L r20 = new kotlin.jvm.internal.L     // Catch:{ f -> 0x01bb }
                r20.<init>()     // Catch:{ f -> 0x01bb }
                T r1 = r5.f144348a     // Catch:{ f -> 0x01bb }
                m0.k r1 = (m0.C5550k) r1     // Catch:{ f -> 0x01bb }
                java.lang.Float r2 = kotlin.coroutines.jvm.internal.b.d(r19)     // Catch:{ f -> 0x01bb }
                T r13 = r5.f144348a     // Catch:{ f -> 0x01bb }
                m0.k r13 = (m0.C5550k) r13     // Catch:{ f -> 0x01bb }
                java.lang.Object r13 = r13.p()     // Catch:{ f -> 0x01bb }
                java.lang.Number r13 = (java.lang.Number) r13     // Catch:{ f -> 0x01bb }
                float r13 = r13.floatValue()     // Catch:{ f -> 0x01bb }
                int r13 = (r13 > r12 ? 1 : (r13 == r12 ? 0 : -1))
                if (r13 != 0) goto L_0x0140
                r13 = 0
                goto L_0x0141
            L_0x0140:
                r13 = r14
            L_0x0141:
                v0.g$a$a r30 = new v0.g$a$a     // Catch:{ f -> 0x01bb }
                v0.h r11 = r9.f30877n     // Catch:{ f -> 0x01bb }
                int r12 = r9.f30875l     // Catch:{ f -> 0x01bb }
                if (r0 == 0) goto L_0x014c
                r23 = r14
                goto L_0x014e
            L_0x014c:
                r23 = 0
            L_0x014e:
                int r14 = r9.f30879p     // Catch:{ f -> 0x01bb }
                r31 = r10
                int r10 = r9.f30878o     // Catch:{ f -> 0x01b8 }
                r16 = r30
                r17 = r11
                r18 = r12
                r21 = r3
                r22 = r4
                r24 = r8
                r25 = r6
                r26 = r14
                r27 = r10
                r28 = r5
                r16.<init>(r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28)     // Catch:{ f -> 0x01b8 }
                r9.f30874k = r3     // Catch:{ f -> 0x01b8 }
                r9.f30866c = r4     // Catch:{ f -> 0x01b8 }
                r9.f30867d = r5     // Catch:{ f -> 0x01b8 }
                r9.f30868e = r6     // Catch:{ f -> 0x01b8 }
                r9.f30869f = r7     // Catch:{ f -> 0x01b8 }
                r9.f30870g = r8     // Catch:{ f -> 0x01b8 }
                r9.f30871h = r15     // Catch:{ f -> 0x01b8 }
                r9.f30872i = r0     // Catch:{ f -> 0x01b8 }
                r10 = 1
                r9.f30873j = r10     // Catch:{ f -> 0x01b8 }
                r10 = 0
                r11 = 2
                r12 = 0
                r14 = r3
                r3 = r10
                r10 = r4
                r4 = r13
                r13 = r5
                r5 = r30
                r16 = r6
                r6 = r34
                r17 = r7
                r7 = r11
                r11 = r8
                r8 = r12
                java.lang.Object r1 = m0.t0.j(r1, r2, r3, r4, r5, r6, r7, r8)     // Catch:{ f -> 0x01b2 }
                r12 = r31
                if (r1 != r12) goto L_0x019a
                return r12
            L_0x019a:
                r4 = r10
                r8 = r11
                r5 = r13
                r3 = r14
                r6 = r16
                r7 = r17
            L_0x01a2:
                int r1 = r6.f144346a     // Catch:{ f -> 0x01ae }
                r2 = 1
                int r1 = r1 + r2
                r6.f144346a = r1     // Catch:{ f -> 0x01ae }
                r10 = r12
                r11 = 2
                r12 = 0
                r14 = 1
                goto L_0x00ca
            L_0x01ae:
                r0 = move-exception
                r1 = r0
                r0 = r3
                goto L_0x01e0
            L_0x01b2:
                r0 = move-exception
            L_0x01b3:
                r12 = r31
            L_0x01b5:
                r1 = r0
                r0 = r14
                goto L_0x01e0
            L_0x01b8:
                r0 = move-exception
                r14 = r3
                goto L_0x01b3
            L_0x01bb:
                r0 = move-exception
                r14 = r3
                r12 = r10
                goto L_0x01b5
            L_0x01bf:
                r0 = move-exception
                r12 = r10
            L_0x01c1:
                r32 = r1
                r1 = r0
                r0 = r32
                goto L_0x01e0
            L_0x01c7:
                r12 = r10
                v0.h r0 = r9.f30877n     // Catch:{ f -> 0x01de }
                int r2 = r9.f30875l     // Catch:{ f -> 0x01de }
                float r0 = r0.c(r2)     // Catch:{ f -> 0x01de }
                int r0 = pI.C17752b.e(r0)     // Catch:{ f -> 0x01de }
                v0.f r2 = new v0.f     // Catch:{ f -> 0x01de }
                T r3 = r5.f144348a     // Catch:{ f -> 0x01de }
                m0.k r3 = (m0.C5550k) r3     // Catch:{ f -> 0x01de }
                r2.<init>(r0, r3)     // Catch:{ f -> 0x01de }
                throw r2     // Catch:{ f -> 0x01de }
            L_0x01de:
                r0 = move-exception
                goto L_0x01c1
            L_0x01e0:
                m0.k r13 = r1.b()
                r21 = 30
                r22 = 0
                r14 = 0
                r15 = 0
                r16 = 0
                r18 = 0
                r20 = 0
                m0.k r2 = m0.C5552l.g(r13, r14, r15, r16, r18, r20, r21, r22)
                int r1 = r1.a()
                int r3 = r9.f30878o
                int r1 = r1 + r3
                float r1 = (float) r1
                kotlin.jvm.internal.L r3 = new kotlin.jvm.internal.L
                r3.<init>()
                java.lang.Float r4 = kotlin.coroutines.jvm.internal.b.d(r1)
                java.lang.Object r5 = r2.p()
                java.lang.Number r5 = (java.lang.Number) r5
                float r5 = r5.floatValue()
                r6 = 0
                int r5 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
                if (r5 != 0) goto L_0x0217
                r5 = 1
                r13 = 1
                goto L_0x0219
            L_0x0217:
                r5 = 1
                r13 = 0
            L_0x0219:
                r5 = r5 ^ r13
                v0.g$a$b r6 = new v0.g$a$b
                r6.<init>(r1, r3, r0)
                r9.f30874k = r0
                r1 = 0
                r9.f30866c = r1
                r9.f30867d = r1
                r9.f30868e = r1
                r1 = 2
                r9.f30873j = r1
                r3 = 0
                r7 = 2
                r8 = 0
                r1 = r2
                r2 = r4
                r4 = r5
                r5 = r6
                r6 = r34
                java.lang.Object r1 = m0.t0.j(r1, r2, r3, r4, r5, r6, r7, r8)
                if (r1 != r12) goto L_0x023b
                return r12
            L_0x023b:
                v0.h r1 = r9.f30877n
                int r2 = r9.f30875l
                int r3 = r9.f30878o
                r1.e(r0, r2, r3)
            L_0x0244:
                XH.N r0 = XH.C16807N.f139792a
                return r0
            L_0x0247:
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "Index should be non-negative ("
                r1.append(r2)
                r1.append(r0)
                r0 = 41
                r1.append(r0)
                java.lang.String r0 = r1.toString()
                java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
                java.lang.String r0 = r0.toString()
                r1.<init>(r0)
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: v0.C6141g.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        /* renamed from: j */
        public final Object invoke(C5678A a10, C17164e<? super C16807N> eVar) {
            return ((a) create(a10, eVar)).invokeSuspend(C16807N.f139792a);
        }
    }

    public static final Object d(C6142h hVar, int i10, int i11, int i12, d dVar, C17164e<? super C16807N> eVar) {
        Object d10 = hVar.d(new a(i10, dVar, hVar, i11, i12, (C17164e<? super a>) null), eVar);
        return d10 == C17187b.f() ? d10 : C16807N.f139792a;
    }

    public static final boolean e(C6142h hVar, int i10) {
        return i10 <= hVar.b() && hVar.g() <= i10;
    }
}
