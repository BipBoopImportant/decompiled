package fx;

import A0.g;
import KJ.C15987c;
import L1.v;
import L1.x;
import N1.P;
import N1.S;
import N1.V;
import N1.Y;
import QJ.Q;
import S1.C4820m;
import U0.A1;
import U0.C4889m;
import U0.C4892n0;
import U0.C4895p;
import U0.C4899r0;
import U0.M0;
import XH.C16807N;
import XH.y;
import Y1.t;
import YH.C16877v;
import c2.h;
import dI.C17164e;
import eI.C17187b;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17542s;
import m0.C5548j;
import m0.M;
import m0.y0;
import m1.e;
import nI.C17642l;
import nI.p;
import nI.q;
import nI.r;
import o1.C5668h;
import o1.C5673m;
import p1.C5747v0;
import p1.C5749w0;
import p1.V0;
import r1.f;
import s0.C5842M;
import s0.C5857c;
import s0.C5859e;

@Metadata(d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u001au\u0010\u0011\u001a\u00020\u00102\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\n2\b\b\u0002\u0010\u000e\u001a\u00020\n2\b\b\u0002\u0010\u000f\u001a\u00020\nH\u0007¢\u0006\u0004\b\u0011\u0010\u0012\u001a[\u0010\u0019\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\u00072\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u0018\u0010\u0018\u001a\u0014\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00100\u0016H\u0003¢\u0006\u0004\b\u0019\u0010\u001a\u001a3\u0010 \u001a\u00020\u0010*\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u00132\u0006\u0010\u001d\u001a\u00020\n2\u0006\u0010\u001e\u001a\u00020\u00132\u0006\u0010\u001f\u001a\u00020\u0013H\u0002¢\u0006\u0004\b \u0010!\u001aQ\u0010-\u001a\u00020\u0010*\u00020\u001b2\u0006\u0010#\u001a\u00020\"2\u0006\u0010%\u001a\u00020$2\u0006\u0010'\u001a\u00020&2\u0006\u0010(\u001a\u00020\u00072\b\b\u0002\u0010*\u001a\u00020)2\u0012\u0010,\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00100+H\u0002¢\u0006\u0004\b-\u0010.\u001aA\u00102\u001a\u00020\u00102\u0006\u0010/\u001a\u00020\u00132\u0006\u0010\f\u001a\u00020\n2\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u00100\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u00101\u001a\u0004\u0018\u00010\nH\u0003¢\u0006\u0004\b2\u00103\u001a?\u00106\u001a\u00020\u0010*\u0002042\u0006\u0010/\u001a\u00020\u00132\u0006\u0010\f\u001a\u00020\n2\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u0010\b\u0002\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u000105H\u0003¢\u0006\u0004\b6\u00107\"\u001a\u0010;\u001a\b\u0012\u0004\u0012\u00020\u0013088\u0002X\u0004¢\u0006\u0006\n\u0004\b9\u0010:¨\u0006?²\u0006\u000e\u0010\u0015\u001a\u00020\u00078\n@\nX\u0002²\u0006\u000e\u0010'\u001a\u0004\u0018\u00010<8\nX\u0002²\u0006\u000e\u0010=\u001a\u00020\u00138\n@\nX\u0002²\u0006\f\u0010>\u001a\u00020\u00138\nX\u0002"}, d2 = {"LKJ/c;", "Lfx/m;", "barData", "Lfx/a;", "xAxisData", "Landroidx/compose/ui/d;", "modifier", "Lc2/h;", "barsSpacedBy", "barMaxWidth", "Lp1/v0;", "axisColor", "barColor", "dashedLinesColor", "barColorHighlightBackground", "barColorHighlightForeground", "LXH/N;", "f", "(LKJ/c;Lfx/a;Landroidx/compose/ui/d;FFJJJJJLU0/m;II)V", "", "strokeWidthPx", "bottomPadding", "Lkotlin/Function2;", "Ls0/M;", "content", "k", "(FJJFFLandroidx/compose/ui/d;LnI/r;LU0/m;II)V", "Lr1/f;", "xOffset", "color", "strokeWidth", "height", "x", "(Lr1/f;FJFF)V", "LN1/S;", "textMeasurer", "LN1/Y;", "textStyle", "", "label", "indicatorHeight", "", "isLast", "Lkotlin/Function1;", "dpOffBottom", "y", "(Lr1/f;LN1/S;LN1/Y;Ljava/lang/String;FZLnI/l;)V", "barHeightFraction", "foregroundBarHeightFraction", "foregroundBarColor", "e", "(FJLandroidx/compose/ui/d;Ljava/lang/Float;Lp1/v0;LU0/m;II)V", "Ls0/c;", "Lkotlin/Function0;", "m", "(Ls0/c;FJLandroidx/compose/ui/d;LnI/p;LU0/m;II)V", "Lm0/y0;", "a", "Lm0/y0;", "coloredBarAnimationSpec", "Lfx/B;", "targetFraction", "animatedFraction", "populartimes-implementation_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* renamed from: fx.g  reason: case insensitive filesystem */
public final class C14464g {

    /* renamed from: a  reason: collision with root package name */
    private static final y0<Float> f127063a = C5548j.j(800, 0, M.d(), 2, (Object) null);

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: fx.g$a */
    static final class a implements p<C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Float f127064a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ C5747v0 f127065b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C5857c f127066c;

        a(Float f10, C5747v0 v0Var, C5857c cVar) {
            this.f127064a = f10;
            this.f127065b = v0Var;
            this.f127066c = cVar;
        }

        public final void a(C4889m mVar, int i10) {
            if ((i10 & 3) != 2 || !mVar.l()) {
                if (C4895p.J()) {
                    C4895p.S(-1491381358, i10, -1, "com.ingka.ikea.populartimes.impl.ui.Bar.<anonymous>.<anonymous> (BarChart.kt:415)");
                }
                Float f10 = this.f127064a;
                if (!(f10 == null || this.f127065b == null)) {
                    float f11 = (float) 4;
                    C14464g.m(this.f127066c, f10.floatValue(), this.f127065b.y(), e.a(androidx.compose.ui.d.f18749a, g.g(h.B(f11), h.B(f11), 0.0f, 0.0f, 12, (Object) null)), (p<? super C4889m, ? super Integer, C16807N>) null, mVar, 0, 8);
                }
                if (C4895p.J()) {
                    C4895p.R();
                    return;
                }
                return;
            }
            mVar.L();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((C4889m) obj, ((Number) obj2).intValue());
            return C16807N.f139792a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: fx.g$b */
    static final class b implements r<C5842M, h, C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ float f127067a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ C15987c<C14470m> f127068b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ float f127069c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ long f127070d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ long f127071e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ long f127072f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ long f127073g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ float f127074h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ float f127075i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ C14458a f127076j;

        /* renamed from: k  reason: collision with root package name */
        final /* synthetic */ C4899r0<h> f127077k;

        b(float f10, C15987c<C14470m> cVar, float f11, long j10, long j11, long j12, long j13, float f12, float f13, C14458a aVar, C4899r0<h> r0Var) {
            this.f127067a = f10;
            this.f127068b = cVar;
            this.f127069c = f11;
            this.f127070d = j10;
            this.f127071e = j11;
            this.f127072f = j12;
            this.f127073g = j13;
            this.f127074h = f12;
            this.f127075i = f13;
            this.f127076j = aVar;
            this.f127077k = r0Var;
        }

        /* access modifiers changed from: private */
        public static final C16807N h(A1 a12, long j10, float f10, float f11, S s10, Y y10, C14458a aVar, C4899r0 r0Var, f fVar) {
            C17542s.j(fVar, "$this$drawBehind");
            C14455B k10 = k(a12);
            if (k10 != null) {
                C14464g.x(fVar, k10.b() ? C5673m.l(fVar.b()) : 0.0f, j10, f10, f11);
                C14464g.y(fVar, s10, y10, k10.a(), aVar.a(), k10.b(), new C14468k(r0Var));
            }
            return C16807N.f139792a;
        }

        /* access modifiers changed from: private */
        public static final C16807N i(C4899r0 r0Var, h hVar) {
            C14464g.h(r0Var, hVar.G());
            return C16807N.f139792a;
        }

        /* access modifiers changed from: private */
        public static final C14455B j(int i10, C14458a aVar, C15987c cVar) {
            Integer num;
            boolean z10 = false;
            if (i10 % aVar.b() == 0) {
                num = Integer.valueOf(i10);
            } else {
                if (i10 == C16877v.p(cVar)) {
                    int i11 = i10 + 1;
                    if (i11 % aVar.b() == 0) {
                        num = Integer.valueOf(i11);
                        z10 = true;
                    }
                }
                num = null;
            }
            if (num == null) {
                return null;
            }
            return new C14455B(aVar.c().invoke(Integer.valueOf(num.intValue())), z10);
        }

        private static final C14455B k(A1<C14455B> a12) {
            return a12.getValue();
        }

        /* access modifiers changed from: private */
        public static final C16807N m(C14470m mVar, x xVar) {
            C17542s.j(xVar, "$this$clearAndSetSemantics");
            String c10 = mVar.c();
            if (c10 != null) {
                v.d0(xVar, c10);
            }
            v.r0(xVar, "BarTag");
            return C16807N.f139792a;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v4, resolved type: U0.A1} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v13, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v18, resolved type: fx.j} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r43v1, resolved type: fx.j} */
        /* JADX WARNING: type inference failed for: r5v14 */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void f(s0.C5842M r54, float r55, U0.C4889m r56, int r57) {
            /*
                r53 = this;
                r0 = r53
                r1 = r54
                r2 = r55
                r10 = r56
                java.lang.String r3 = "$this$ChartSurface"
                kotlin.jvm.internal.C17542s.j(r1, r3)
                r3 = r57 & 6
                if (r3 != 0) goto L_0x001d
                boolean r3 = r10.V(r1)
                if (r3 == 0) goto L_0x0019
                r3 = 4
                goto L_0x001a
            L_0x0019:
                r3 = 2
            L_0x001a:
                r3 = r57 | r3
                goto L_0x001f
            L_0x001d:
                r3 = r57
            L_0x001f:
                r4 = r57 & 48
                if (r4 != 0) goto L_0x002f
                boolean r4 = r10.c(r2)
                if (r4 == 0) goto L_0x002c
                r4 = 32
                goto L_0x002e
            L_0x002c:
                r4 = 16
            L_0x002e:
                r3 = r3 | r4
            L_0x002f:
                r4 = r3 & 147(0x93, float:2.06E-43)
                r5 = 146(0x92, float:2.05E-43)
                if (r4 != r5) goto L_0x0041
                boolean r4 = r56.l()
                if (r4 != 0) goto L_0x003c
                goto L_0x0041
            L_0x003c:
                r56.L()
                goto L_0x0249
            L_0x0041:
                boolean r4 = U0.C4895p.J()
                r5 = -1
                if (r4 == 0) goto L_0x0050
                r4 = 792552369(0x2f3d63b1, float:1.7224867E-10)
                java.lang.String r6 = "com.ingka.ikea.populartimes.impl.ui.BarChart.<anonymous> (BarChart.kt:156)"
                U0.C4895p.S(r4, r3, r5, r6)
            L_0x0050:
                TC.b$a$c r3 = TC.C13679b.a.c.f116681a
                r4 = 6
                N1.Y r11 = r3.a(r10, r4)
                tK.v r3 = tK.C18030v.f147664a
                int r4 = tK.C18030v.f147665b
                tK.h r3 = r3.a(r10, r4)
                long r12 = r3.G0()
                r41 = 16777214(0xfffffe, float:2.3509884E-38)
                r42 = 0
                r14 = 0
                r16 = 0
                r17 = 0
                r18 = 0
                r19 = 0
                r20 = 0
                r21 = 0
                r23 = 0
                r24 = 0
                r25 = 0
                r26 = 0
                r28 = 0
                r29 = 0
                r30 = 0
                r31 = 0
                r32 = 0
                r33 = 0
                r35 = 0
                r36 = 0
                r37 = 0
                r38 = 0
                r39 = 0
                r40 = 0
                N1.Y r11 = N1.Y.c(r11, r12, r14, r16, r17, r18, r19, r20, r21, r23, r24, r25, r26, r28, r29, r30, r31, r32, r33, r35, r36, r37, r38, r39, r40, r41, r42)
                r7 = 0
                r3 = 1
                N1.S r12 = N1.T.a(r7, r10, r7, r3)
                float r3 = r0.f127067a
                KJ.c<fx.m> r4 = r0.f127068b
                int r4 = r4.size()
                float r4 = (float) r4
                float r3 = r3 * r4
                float r3 = c2.h.B(r3)
                float r4 = r0.f127069c
                KJ.c<fx.m> r6 = r0.f127068b
                int r6 = r6.size()
                int r6 = r6 + r5
                float r5 = (float) r6
                float r4 = r4 * r5
                float r4 = c2.h.B(r4)
                float r3 = r3 + r4
                float r3 = c2.h.B(r3)
                int r2 = c2.h.v(r3, r2)
                if (r2 <= 0) goto L_0x00d7
                androidx.compose.ui.d$a r2 = androidx.compose.ui.d.f18749a
                r5 = 2
                r6 = 0
                r3 = 1065353216(0x3f800000, float:1.0)
                r4 = 0
                r1 = r54
                androidx.compose.ui.d r1 = s0.C5842M.e(r1, r2, r3, r4, r5, r6)
            L_0x00d5:
                r13 = r1
                goto L_0x00e0
            L_0x00d7:
                androidx.compose.ui.d$a r1 = androidx.compose.ui.d.f18749a
                float r2 = r0.f127067a
                androidx.compose.ui.d r1 = androidx.compose.foundation.layout.J.y(r1, r2)
                goto L_0x00d5
            L_0x00e0:
                KJ.c<fx.m> r14 = r0.f127068b
                long r8 = r0.f127070d
                long r5 = r0.f127071e
                long r2 = r0.f127072f
                r15 = r8
                long r8 = r0.f127073g
                float r4 = r0.f127074h
                float r1 = r0.f127075i
                r54 = r15
                fx.a r15 = r0.f127076j
                U0.r0<c2.h> r7 = r0.f127077k
                java.util.Iterator r16 = r14.iterator()
                r0 = 0
            L_0x00fa:
                boolean r17 = r16.hasNext()
                if (r17 == 0) goto L_0x0240
                java.lang.Object r17 = r16.next()
                int r18 = r0 + 1
                if (r0 >= 0) goto L_0x010b
                YH.C16877v.x()
            L_0x010b:
                r19 = r5
                r5 = r17
                fx.m r5 = (fx.C14470m) r5
                float r6 = r5.d()
                r17 = r7
                r7 = 100
                float r7 = (float) r7
                float r6 = r6 / r7
                boolean r21 = r5.e()
                if (r21 == 0) goto L_0x0124
                r21 = r54
                goto L_0x0126
            L_0x0124:
                r21 = r19
            L_0x0126:
                boolean r23 = r5.e()
                if (r23 == 0) goto L_0x014f
                java.lang.Float r23 = r5.f()
                if (r23 == 0) goto L_0x0147
                float r23 = r23.floatValue()
                float r23 = r23 / r7
                java.lang.Float r7 = java.lang.Float.valueOf(r23)
                r57 = r6
                p1.v0 r6 = p1.C5747v0.k(r2)
                XH.v r6 = XH.C16796C.a(r7, r6)
                goto L_0x0156
            L_0x0147:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.String r1 = "Required value was null."
                r0.<init>(r1)
                throw r0
            L_0x014f:
                r57 = r6
                r6 = 0
                XH.v r6 = XH.C16796C.a(r6, r6)
            L_0x0156:
                java.lang.Object r7 = r6.a()
                java.lang.Float r7 = (java.lang.Float) r7
                java.lang.Object r6 = r6.b()
                p1.v0 r6 = (p1.C5747v0) r6
                r23 = r2
                int r2 = r14.size()
                r3 = -756608593(0xffffffffd2e711af, float:-4.96217063E11)
                r10.W(r3)
                boolean r2 = r10.d(r2)
                java.lang.Object r3 = r56.D()
                if (r2 != 0) goto L_0x0180
                U0.m$a r2 = U0.C4889m.f14007a
                java.lang.Object r2 = r2.a()
                if (r3 != r2) goto L_0x018c
            L_0x0180:
                fx.h r2 = new fx.h
                r2.<init>(r0, r15, r14)
                U0.A1 r3 = U0.p1.e(r2)
                r10.u(r3)
            L_0x018c:
                r0 = r3
                U0.A1 r0 = (U0.A1) r0
                r56.P()
                r2 = -756567124(0xffffffffd2e7b3ac, float:-4.9757592E11)
                r10.W(r2)
                boolean r2 = r10.V(r5)
                java.lang.Object r3 = r56.D()
                if (r2 != 0) goto L_0x01aa
                U0.m$a r2 = U0.C4889m.f14007a
                java.lang.Object r2 = r2.a()
                if (r3 != r2) goto L_0x01b2
            L_0x01aa:
                fx.i r3 = new fx.i
                r3.<init>(r5)
                r10.u(r3)
            L_0x01b2:
                nI.l r3 = (nI.C17642l) r3
                r56.P()
                androidx.compose.ui.d r2 = L1.o.a(r13, r3)
                r3 = -756559037(0xffffffffd2e7d343, float:-4.97840914E11)
                r10.W(r3)
                boolean r3 = r10.V(r0)
                boolean r5 = r10.e(r8)
                r3 = r3 | r5
                boolean r5 = r10.c(r4)
                r3 = r3 | r5
                boolean r5 = r10.c(r1)
                r3 = r3 | r5
                boolean r5 = r10.V(r12)
                r3 = r3 | r5
                boolean r5 = r10.V(r11)
                r3 = r3 | r5
                boolean r5 = r10.V(r15)
                r3 = r3 | r5
                java.lang.Object r5 = r56.D()
                if (r3 != 0) goto L_0x01f1
                U0.m$a r3 = U0.C4889m.f14007a
                java.lang.Object r3 = r3.a()
                if (r5 != r3) goto L_0x020b
            L_0x01f1:
                fx.j r5 = new fx.j
                r43 = r5
                r44 = r0
                r45 = r8
                r47 = r4
                r48 = r1
                r49 = r12
                r50 = r11
                r51 = r15
                r52 = r17
                r43.<init>(r44, r45, r47, r48, r49, r50, r51, r52)
                r10.u(r5)
            L_0x020b:
                nI.l r5 = (nI.C17642l) r5
                r56.P()
                androidx.compose.ui.d r0 = androidx.compose.ui.draw.b.b(r2, r5)
                r25 = 0
                r26 = 0
                r27 = r1
                r1 = r57
                r2 = r21
                r21 = r4
                r4 = r0
                r5 = r7
                r0 = r17
                r7 = r56
                r28 = r54
                r30 = r8
                r8 = r25
                r9 = r26
                fx.C14464g.e(r1, r2, r4, r5, r6, r7, r8, r9)
                r7 = r0
                r0 = r18
                r5 = r19
                r4 = r21
                r2 = r23
                r1 = r27
                r8 = r30
                goto L_0x00fa
            L_0x0240:
                boolean r0 = U0.C4895p.J()
                if (r0 == 0) goto L_0x0249
                U0.C4895p.R()
            L_0x0249:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: fx.C14464g.b.f(s0.M, float, U0.m, int):void");
        }

        public /* bridge */ /* synthetic */ Object l(Object obj, Object obj2, Object obj3, Object obj4) {
            f((C5842M) obj, ((h) obj2).G(), (C4889m) obj3, ((Number) obj4).intValue());
            return C16807N.f139792a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: fx.g$c */
    static final class c implements q<C5859e, C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ float f127078a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ float f127079b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ long f127080c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ long f127081d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ float f127082e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ r<C5842M, h, C4889m, Integer, C16807N> f127083f;

        c(float f10, float f11, long j10, long j11, float f12, r<? super C5842M, ? super h, ? super C4889m, ? super Integer, C16807N> rVar) {
            this.f127078a = f10;
            this.f127079b = f11;
            this.f127080c = j10;
            this.f127081d = j11;
            this.f127082e = f12;
            this.f127083f = rVar;
        }

        /* access modifiers changed from: private */
        public static final C16807N c(float f10, long j10, long j11, f fVar) {
            C17542s.j(fVar, "$this$drawBehind");
            float i10 = C5673m.i(fVar.b()) + (f10 / ((float) 2));
            f.u0(fVar, j10, C5668h.a(0.0f, i10), C5668h.a(C5673m.l(fVar.b()), i10), f10, 0, (V0) null, 0.0f, (C5749w0) null, 0, 496, (Object) null);
            float i11 = C5673m.i(fVar.b()) / ((float) 3);
            int i12 = 0;
            for (int i13 = 3; i12 < i13; i13 = i13) {
                float f11 = ((float) i12) * i11;
                f.u0(fVar, j11, C5668h.a(0.0f, f11), C5668h.a(C5673m.l(fVar.b()), f11), f10, 0, V0.f27254a.a(new float[]{10.0f, 10.0f}, 0.0f), 0.0f, (C5749w0) null, 0, 464, (Object) null);
                i12++;
            }
            return C16807N.f139792a;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:18:0x0074, code lost:
            if (r1 == U0.C4889m.f14007a.a()) goto L_0x0076;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void b(s0.C5859e r11, U0.C4889m r12, int r13) {
            /*
                r10 = this;
                java.lang.String r0 = "$this$BoxWithConstraints"
                kotlin.jvm.internal.C17542s.j(r11, r0)
                r0 = r13 & 6
                if (r0 != 0) goto L_0x0013
                boolean r0 = r12.V(r11)
                if (r0 == 0) goto L_0x0011
                r0 = 4
                goto L_0x0012
            L_0x0011:
                r0 = 2
            L_0x0012:
                r13 = r13 | r0
            L_0x0013:
                r0 = r13 & 19
                r1 = 18
                if (r0 != r1) goto L_0x0025
                boolean r0 = r12.l()
                if (r0 != 0) goto L_0x0020
                goto L_0x0025
            L_0x0020:
                r12.L()
                goto L_0x012b
            L_0x0025:
                boolean r0 = U0.C4895p.J()
                if (r0 == 0) goto L_0x0034
                r0 = -1
                java.lang.String r1 = "com.ingka.ikea.populartimes.impl.ui.ChartSurface.<anonymous> (BarChart.kt:259)"
                r2 = 1231263418(0x496396ba, float:932203.6)
                U0.C4895p.S(r2, r13, r0, r1)
            L_0x0034:
                androidx.compose.ui.d$a r13 = androidx.compose.ui.d.f18749a
                r0 = 1
                r1 = 0
                r2 = 0
                androidx.compose.ui.d r3 = androidx.compose.foundation.layout.J.f(r13, r2, r0, r1)
                float r7 = r10.f127078a
                r8 = 7
                r9 = 0
                r4 = 0
                r5 = 0
                r6 = 0
                androidx.compose.ui.d r13 = androidx.compose.foundation.layout.D.m(r3, r4, r5, r6, r7, r8, r9)
                r0 = 454534419(0x1b17a513, float:1.2543766E-22)
                r12.W(r0)
                float r0 = r10.f127079b
                boolean r0 = r12.c(r0)
                long r1 = r10.f127080c
                boolean r1 = r12.e(r1)
                r0 = r0 | r1
                long r1 = r10.f127081d
                boolean r1 = r12.e(r1)
                r0 = r0 | r1
                float r2 = r10.f127079b
                long r3 = r10.f127080c
                long r5 = r10.f127081d
                java.lang.Object r1 = r12.D()
                if (r0 != 0) goto L_0x0076
                U0.m$a r0 = U0.C4889m.f14007a
                java.lang.Object r0 = r0.a()
                if (r1 != r0) goto L_0x007f
            L_0x0076:
                fx.l r0 = new fx.l
                r1 = r0
                r1.<init>(r2, r3, r5)
                r12.u(r0)
            L_0x007f:
                nI.l r1 = (nI.C17642l) r1
                r12.P()
                androidx.compose.ui.d r13 = androidx.compose.ui.draw.b.b(r13, r1)
                i1.c$a r0 = i1.C5437c.f24302a
                i1.c$c r1 = r0.a()
                androidx.compose.foundation.layout.d r2 = androidx.compose.foundation.layout.C5073d.f18068a
                float r3 = r10.f127082e
                i1.c$b r0 = r0.g()
                androidx.compose.foundation.layout.d$e r0 = r2.o(r3, r0)
                nI.r<s0.M, c2.h, U0.m, java.lang.Integer, XH.N> r2 = r10.f127083f
                r3 = 48
                E1.I r0 = androidx.compose.foundation.layout.G.b(r0, r1, r12, r3)
                r1 = 0
                int r1 = U0.C4883j.a(r12, r1)
                U0.y r3 = r12.s()
                androidx.compose.ui.d r13 = androidx.compose.ui.c.e(r12, r13)
                G1.g$a r4 = G1.C4504g.f6515W
                nI.a r5 = r4.a()
                U0.f r6 = r12.m()
                if (r6 != 0) goto L_0x00be
                U0.C4883j.c()
            L_0x00be:
                r12.I()
                boolean r6 = r12.i()
                if (r6 == 0) goto L_0x00cb
                r12.p(r5)
                goto L_0x00ce
            L_0x00cb:
                r12.t()
            L_0x00ce:
                U0.m r5 = U0.F1.a(r12)
                nI.p r6 = r4.c()
                U0.F1.c(r5, r0, r6)
                nI.p r0 = r4.e()
                U0.F1.c(r5, r3, r0)
                nI.p r0 = r4.b()
                boolean r3 = r5.i()
                if (r3 != 0) goto L_0x00f8
                java.lang.Object r3 = r5.D()
                java.lang.Integer r6 = java.lang.Integer.valueOf(r1)
                boolean r3 = kotlin.jvm.internal.C17542s.e(r3, r6)
                if (r3 != 0) goto L_0x0106
            L_0x00f8:
                java.lang.Integer r3 = java.lang.Integer.valueOf(r1)
                r5.u(r3)
                java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
                r5.w(r1, r0)
            L_0x0106:
                nI.p r0 = r4.d()
                U0.F1.c(r5, r13, r0)
                s0.N r13 = s0.C5843N.f28726a
                float r11 = r11.c()
                c2.h r11 = c2.h.m(r11)
                r0 = 6
                java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
                r2.l(r13, r11, r12, r0)
                r12.x()
                boolean r11 = U0.C4895p.J()
                if (r11 == 0) goto L_0x012b
                U0.C4895p.R()
            L_0x012b:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: fx.C14464g.c.b(s0.e, U0.m, int):void");
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            b((C5859e) obj, (C4889m) obj2, ((Number) obj3).intValue());
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.populartimes.impl.ui.BarChartKt$ColoredBar$1$1", f = "BarChart.kt", l = {}, m = "invokeSuspend")
    /* renamed from: fx.g$d */
    static final class d extends l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f127084c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ float f127085d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ C4892n0 f127086e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(float f10, C4892n0 n0Var, C17164e<? super d> eVar) {
            super(2, eVar);
            this.f127085d = f10;
            this.f127086e = n0Var;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new d(this.f127085d, this.f127086e, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((d) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            C17187b.f();
            if (this.f127084c == 0) {
                y.b(obj);
                C14464g.o(this.f127086e, this.f127085d);
                return C16807N.f139792a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0048  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x004d  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0063  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0068  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x007e  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0083  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x00a2  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x00a8  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x017a  */
    /* JADX WARNING: Removed duplicated region for block: B:93:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void e(float r18, long r19, androidx.compose.ui.d r21, java.lang.Float r22, p1.C5747v0 r23, U0.C4889m r24, int r25, int r26) {
        /*
            r7 = r25
            r0 = -1616052167(0xffffffff9fad0039, float:-7.326872E-20)
            r1 = r24
            U0.m r1 = r1.k(r0)
            r2 = r26 & 1
            if (r2 == 0) goto L_0x0015
            r2 = r7 | 6
            r3 = r2
            r2 = r18
            goto L_0x0029
        L_0x0015:
            r2 = r7 & 6
            if (r2 != 0) goto L_0x0026
            r2 = r18
            boolean r3 = r1.c(r2)
            if (r3 == 0) goto L_0x0023
            r3 = 4
            goto L_0x0024
        L_0x0023:
            r3 = 2
        L_0x0024:
            r3 = r3 | r7
            goto L_0x0029
        L_0x0026:
            r2 = r18
            r3 = r7
        L_0x0029:
            r4 = r26 & 2
            if (r4 == 0) goto L_0x0032
            r3 = r3 | 48
        L_0x002f:
            r4 = r19
            goto L_0x0044
        L_0x0032:
            r4 = r7 & 48
            if (r4 != 0) goto L_0x002f
            r4 = r19
            boolean r6 = r1.e(r4)
            if (r6 == 0) goto L_0x0041
            r6 = 32
            goto L_0x0043
        L_0x0041:
            r6 = 16
        L_0x0043:
            r3 = r3 | r6
        L_0x0044:
            r6 = r26 & 4
            if (r6 == 0) goto L_0x004d
            r3 = r3 | 384(0x180, float:5.38E-43)
        L_0x004a:
            r8 = r21
            goto L_0x005f
        L_0x004d:
            r8 = r7 & 384(0x180, float:5.38E-43)
            if (r8 != 0) goto L_0x004a
            r8 = r21
            boolean r9 = r1.V(r8)
            if (r9 == 0) goto L_0x005c
            r9 = 256(0x100, float:3.59E-43)
            goto L_0x005e
        L_0x005c:
            r9 = 128(0x80, float:1.794E-43)
        L_0x005e:
            r3 = r3 | r9
        L_0x005f:
            r9 = r26 & 8
            if (r9 == 0) goto L_0x0068
            r3 = r3 | 3072(0xc00, float:4.305E-42)
        L_0x0065:
            r10 = r22
            goto L_0x007a
        L_0x0068:
            r10 = r7 & 3072(0xc00, float:4.305E-42)
            if (r10 != 0) goto L_0x0065
            r10 = r22
            boolean r11 = r1.V(r10)
            if (r11 == 0) goto L_0x0077
            r11 = 2048(0x800, float:2.87E-42)
            goto L_0x0079
        L_0x0077:
            r11 = 1024(0x400, float:1.435E-42)
        L_0x0079:
            r3 = r3 | r11
        L_0x007a:
            r11 = r26 & 16
            if (r11 == 0) goto L_0x0083
            r3 = r3 | 24576(0x6000, float:3.4438E-41)
        L_0x0080:
            r12 = r23
            goto L_0x0095
        L_0x0083:
            r12 = r7 & 24576(0x6000, float:3.4438E-41)
            if (r12 != 0) goto L_0x0080
            r12 = r23
            boolean r13 = r1.V(r12)
            if (r13 == 0) goto L_0x0092
            r13 = 16384(0x4000, float:2.2959E-41)
            goto L_0x0094
        L_0x0092:
            r13 = 8192(0x2000, float:1.14794E-41)
        L_0x0094:
            r3 = r3 | r13
        L_0x0095:
            r13 = r3 & 9363(0x2493, float:1.312E-41)
            r14 = 9362(0x2492, float:1.3119E-41)
            if (r13 != r14) goto L_0x00a8
            boolean r13 = r1.l()
            if (r13 != 0) goto L_0x00a2
            goto L_0x00a8
        L_0x00a2:
            r1.L()
            r6 = r12
            goto L_0x0174
        L_0x00a8:
            if (r6 == 0) goto L_0x00ad
            androidx.compose.ui.d$a r6 = androidx.compose.ui.d.f18749a
            goto L_0x00ae
        L_0x00ad:
            r6 = r8
        L_0x00ae:
            r8 = 0
            if (r9 == 0) goto L_0x00b3
            r15 = r8
            goto L_0x00b4
        L_0x00b3:
            r15 = r10
        L_0x00b4:
            if (r11 == 0) goto L_0x00b8
            r14 = r8
            goto L_0x00b9
        L_0x00b8:
            r14 = r12
        L_0x00b9:
            boolean r8 = U0.C4895p.J()
            if (r8 == 0) goto L_0x00c5
            r8 = -1
            java.lang.String r9 = "com.ingka.ikea.populartimes.impl.ui.Bar (BarChart.kt:409)"
            U0.C4895p.S(r0, r3, r8, r9)
        L_0x00c5:
            i1.c$a r0 = i1.C5437c.f24302a
            i1.c r0 = r0.o()
            r8 = 0
            E1.I r0 = androidx.compose.foundation.layout.C5077h.h(r0, r8)
            int r8 = U0.C4883j.a(r1, r8)
            U0.y r9 = r1.s()
            androidx.compose.ui.d r10 = androidx.compose.ui.c.e(r1, r6)
            G1.g$a r11 = G1.C4504g.f6515W
            nI.a r12 = r11.a()
            U0.f r13 = r1.m()
            if (r13 != 0) goto L_0x00eb
            U0.C4883j.c()
        L_0x00eb:
            r1.I()
            boolean r13 = r1.i()
            if (r13 == 0) goto L_0x00f8
            r1.p(r12)
            goto L_0x00fb
        L_0x00f8:
            r1.t()
        L_0x00fb:
            U0.m r12 = U0.F1.a(r1)
            nI.p r13 = r11.c()
            U0.F1.c(r12, r0, r13)
            nI.p r0 = r11.e()
            U0.F1.c(r12, r9, r0)
            nI.p r0 = r11.b()
            boolean r9 = r12.i()
            if (r9 != 0) goto L_0x0125
            java.lang.Object r9 = r12.D()
            java.lang.Integer r13 = java.lang.Integer.valueOf(r8)
            boolean r9 = kotlin.jvm.internal.C17542s.e(r9, r13)
            if (r9 != 0) goto L_0x0133
        L_0x0125:
            java.lang.Integer r9 = java.lang.Integer.valueOf(r8)
            r12.u(r9)
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            r12.w(r8, r0)
        L_0x0133:
            nI.p r0 = r11.d()
            U0.F1.c(r12, r10, r0)
            androidx.compose.foundation.layout.j r8 = androidx.compose.foundation.layout.C5079j.f18125a
            fx.g$a r0 = new fx.g$a
            r0.<init>(r15, r14, r8)
            r9 = 54
            r10 = -1491381358(0xffffffffa71b5392, float:-2.1555875E-15)
            r11 = 1
            c1.a r13 = c1.c.e(r10, r11, r0, r1, r9)
            int r0 = r3 << 3
            r3 = r0 & 112(0x70, float:1.57E-43)
            r9 = 24582(0x6006, float:3.4447E-41)
            r3 = r3 | r9
            r0 = r0 & 896(0x380, float:1.256E-42)
            r0 = r0 | r3
            r16 = 4
            r12 = 0
            r9 = r18
            r10 = r19
            r3 = r14
            r14 = r1
            r17 = r15
            r15 = r0
            m(r8, r9, r10, r12, r13, r14, r15, r16)
            r1.x()
            boolean r0 = U0.C4895p.J()
            if (r0 == 0) goto L_0x0170
            U0.C4895p.R()
        L_0x0170:
            r8 = r6
            r10 = r17
            r6 = r3
        L_0x0174:
            U0.Y0 r9 = r1.n()
            if (r9 == 0) goto L_0x018d
            fx.e r11 = new fx.e
            r0 = r11
            r1 = r18
            r2 = r19
            r4 = r8
            r5 = r10
            r7 = r25
            r8 = r26
            r0.<init>(r1, r2, r4, r5, r6, r7, r8)
            r9.a(r11)
        L_0x018d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: fx.C14464g.e(float, long, androidx.compose.ui.d, java.lang.Float, p1.v0, U0.m, int, int):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:104:0x0129  */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x013c  */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x014f  */
    /* JADX WARNING: Removed duplicated region for block: B:171:0x02f2  */
    /* JADX WARNING: Removed duplicated region for block: B:173:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0068  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x006d  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0083  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0088  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x009f  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x00b6  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00bf  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x00d5  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x00df  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x00f3  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x00fa  */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x010e  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x0115  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void f(KJ.C15987c<fx.C14470m> r39, fx.C14458a r40, androidx.compose.ui.d r41, float r42, float r43, long r44, long r46, long r48, long r50, long r52, U0.C4889m r54, int r55, int r56) {
        /*
            r15 = r39
            r14 = r40
            r13 = r55
            r12 = r56
            java.lang.String r0 = "barData"
            kotlin.jvm.internal.C17542s.j(r15, r0)
            java.lang.String r0 = "xAxisData"
            kotlin.jvm.internal.C17542s.j(r14, r0)
            r0 = 854226863(0x32ea77af, float:2.7295611E-8)
            r1 = r54
            U0.m r10 = r1.k(r0)
            r1 = r12 & 1
            if (r1 == 0) goto L_0x0022
            r1 = r13 | 6
            goto L_0x0032
        L_0x0022:
            r1 = r13 & 6
            if (r1 != 0) goto L_0x0031
            boolean r1 = r10.V(r15)
            if (r1 == 0) goto L_0x002e
            r1 = 4
            goto L_0x002f
        L_0x002e:
            r1 = 2
        L_0x002f:
            r1 = r1 | r13
            goto L_0x0032
        L_0x0031:
            r1 = r13
        L_0x0032:
            r3 = r12 & 2
            if (r3 == 0) goto L_0x0039
            r1 = r1 | 48
            goto L_0x0049
        L_0x0039:
            r3 = r13 & 48
            if (r3 != 0) goto L_0x0049
            boolean r3 = r10.V(r14)
            if (r3 == 0) goto L_0x0046
            r3 = 32
            goto L_0x0048
        L_0x0046:
            r3 = 16
        L_0x0048:
            r1 = r1 | r3
        L_0x0049:
            r3 = r12 & 4
            if (r3 == 0) goto L_0x0052
            r1 = r1 | 384(0x180, float:5.38E-43)
        L_0x004f:
            r4 = r41
            goto L_0x0064
        L_0x0052:
            r4 = r13 & 384(0x180, float:5.38E-43)
            if (r4 != 0) goto L_0x004f
            r4 = r41
            boolean r5 = r10.V(r4)
            if (r5 == 0) goto L_0x0061
            r5 = 256(0x100, float:3.59E-43)
            goto L_0x0063
        L_0x0061:
            r5 = 128(0x80, float:1.794E-43)
        L_0x0063:
            r1 = r1 | r5
        L_0x0064:
            r5 = r12 & 8
            if (r5 == 0) goto L_0x006d
            r1 = r1 | 3072(0xc00, float:4.305E-42)
        L_0x006a:
            r6 = r42
            goto L_0x007f
        L_0x006d:
            r6 = r13 & 3072(0xc00, float:4.305E-42)
            if (r6 != 0) goto L_0x006a
            r6 = r42
            boolean r7 = r10.c(r6)
            if (r7 == 0) goto L_0x007c
            r7 = 2048(0x800, float:2.87E-42)
            goto L_0x007e
        L_0x007c:
            r7 = 1024(0x400, float:1.435E-42)
        L_0x007e:
            r1 = r1 | r7
        L_0x007f:
            r7 = r12 & 16
            if (r7 == 0) goto L_0x0088
            r1 = r1 | 24576(0x6000, float:3.4438E-41)
        L_0x0085:
            r8 = r43
            goto L_0x009a
        L_0x0088:
            r8 = r13 & 24576(0x6000, float:3.4438E-41)
            if (r8 != 0) goto L_0x0085
            r8 = r43
            boolean r9 = r10.c(r8)
            if (r9 == 0) goto L_0x0097
            r9 = 16384(0x4000, float:2.2959E-41)
            goto L_0x0099
        L_0x0097:
            r9 = 8192(0x2000, float:1.14794E-41)
        L_0x0099:
            r1 = r1 | r9
        L_0x009a:
            r9 = 196608(0x30000, float:2.75506E-40)
            r9 = r9 & r13
            if (r9 != 0) goto L_0x00b6
            r9 = r12 & 32
            if (r9 != 0) goto L_0x00af
            r9 = r3
            r2 = r44
            boolean r11 = r10.e(r2)
            if (r11 == 0) goto L_0x00b2
            r11 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00b4
        L_0x00af:
            r9 = r3
            r2 = r44
        L_0x00b2:
            r11 = 65536(0x10000, float:9.18355E-41)
        L_0x00b4:
            r1 = r1 | r11
            goto L_0x00b9
        L_0x00b6:
            r9 = r3
            r2 = r44
        L_0x00b9:
            r16 = 1572864(0x180000, float:2.204052E-39)
            r11 = r13 & r16
            if (r11 != 0) goto L_0x00d5
            r11 = r12 & 64
            r17 = r1
            r0 = r46
            if (r11 != 0) goto L_0x00d0
            boolean r18 = r10.e(r0)
            if (r18 == 0) goto L_0x00d0
            r18 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00d2
        L_0x00d0:
            r18 = 524288(0x80000, float:7.34684E-40)
        L_0x00d2:
            r17 = r17 | r18
            goto L_0x00d9
        L_0x00d5:
            r17 = r1
            r0 = r46
        L_0x00d9:
            r18 = 12582912(0xc00000, float:1.7632415E-38)
            r18 = r13 & r18
            if (r18 != 0) goto L_0x00f3
            r11 = r12 & 128(0x80, float:1.794E-43)
            r0 = r48
            if (r11 != 0) goto L_0x00ee
            boolean r11 = r10.e(r0)
            if (r11 == 0) goto L_0x00ee
            r11 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x00f0
        L_0x00ee:
            r11 = 4194304(0x400000, float:5.877472E-39)
        L_0x00f0:
            r17 = r17 | r11
            goto L_0x00f5
        L_0x00f3:
            r0 = r48
        L_0x00f5:
            r11 = 100663296(0x6000000, float:2.4074124E-35)
            r11 = r11 & r13
            if (r11 != 0) goto L_0x010e
            r11 = r12 & 256(0x100, float:3.59E-43)
            r0 = r50
            if (r11 != 0) goto L_0x0109
            boolean r11 = r10.e(r0)
            if (r11 == 0) goto L_0x0109
            r11 = 67108864(0x4000000, float:1.5046328E-36)
            goto L_0x010b
        L_0x0109:
            r11 = 33554432(0x2000000, float:9.403955E-38)
        L_0x010b:
            r17 = r17 | r11
            goto L_0x0110
        L_0x010e:
            r0 = r50
        L_0x0110:
            r11 = 805306368(0x30000000, float:4.656613E-10)
            r11 = r11 & r13
            if (r11 != 0) goto L_0x0129
            r11 = r12 & 512(0x200, float:7.175E-43)
            r0 = r52
            if (r11 != 0) goto L_0x0124
            boolean r11 = r10.e(r0)
            if (r11 == 0) goto L_0x0124
            r11 = 536870912(0x20000000, float:1.0842022E-19)
            goto L_0x0126
        L_0x0124:
            r11 = 268435456(0x10000000, float:2.5243549E-29)
        L_0x0126:
            r17 = r17 | r11
            goto L_0x012b
        L_0x0129:
            r0 = r52
        L_0x012b:
            r11 = 306783379(0x12492493, float:6.34695E-28)
            r11 = r17 & r11
            r0 = 306783378(0x12492492, float:6.3469493E-28)
            if (r11 != r0) goto L_0x014f
            boolean r0 = r10.l()
            if (r0 != 0) goto L_0x013c
            goto L_0x014f
        L_0x013c:
            r10.L()
            r12 = r50
            r14 = r52
            r17 = r4
            r4 = r6
            r5 = r8
            r8 = r46
            r6 = r2
            r3 = r10
            r10 = r48
            goto L_0x02ec
        L_0x014f:
            r10.G()
            r0 = r13 & 1
            r1 = -1879048193(0xffffffff8fffffff, float:-2.5243547E-29)
            r11 = -234881025(0xfffffffff1ffffff, float:-2.535301E30)
            r19 = -29360129(0xfffffffffe3fffff, float:-6.380294E37)
            r20 = -3670017(0xffffffffffc7ffff, float:NaN)
            r21 = -458753(0xfffffffffff8ffff, float:NaN)
            if (r0 == 0) goto L_0x01a1
            boolean r0 = r10.O()
            if (r0 == 0) goto L_0x016c
            goto L_0x01a1
        L_0x016c:
            r10.L()
            r0 = r12 & 32
            if (r0 == 0) goto L_0x0175
            r17 = r17 & r21
        L_0x0175:
            r0 = r12 & 64
            if (r0 == 0) goto L_0x017b
            r17 = r17 & r20
        L_0x017b:
            r0 = r12 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x0181
            r17 = r17 & r19
        L_0x0181:
            r0 = r12 & 256(0x100, float:3.59E-43)
            if (r0 == 0) goto L_0x0187
            r17 = r17 & r11
        L_0x0187:
            r0 = r12 & 512(0x200, float:7.175E-43)
            if (r0 == 0) goto L_0x018d
            r17 = r17 & r1
        L_0x018d:
            r23 = r46
            r25 = r48
            r27 = r50
            r29 = r52
            r21 = r2
            r19 = r6
            r20 = r8
            r11 = r17
            r17 = r4
            goto L_0x021b
        L_0x01a1:
            if (r9 == 0) goto L_0x01a6
            androidx.compose.ui.d$a r0 = androidx.compose.ui.d.f18749a
            goto L_0x01a7
        L_0x01a6:
            r0 = r4
        L_0x01a7:
            if (r5 == 0) goto L_0x01b0
            fx.b r4 = fx.C14459b.f127006a
            float r4 = r4.g()
            goto L_0x01b1
        L_0x01b0:
            r4 = r6
        L_0x01b1:
            if (r7 == 0) goto L_0x01ba
            fx.b r5 = fx.C14459b.f127006a
            float r5 = r5.e()
            goto L_0x01bb
        L_0x01ba:
            r5 = r8
        L_0x01bb:
            r6 = r12 & 32
            r7 = 6
            if (r6 == 0) goto L_0x01c8
            fx.b r2 = fx.C14459b.f127006a
            long r2 = r2.a(r10, r7)
            r17 = r17 & r21
        L_0x01c8:
            r6 = r12 & 64
            if (r6 == 0) goto L_0x01d5
            fx.b r6 = fx.C14459b.f127006a
            long r8 = r6.b(r10, r7)
            r17 = r17 & r20
            goto L_0x01d7
        L_0x01d5:
            r8 = r46
        L_0x01d7:
            r6 = r12 & 128(0x80, float:1.794E-43)
            if (r6 == 0) goto L_0x01e4
            fx.b r6 = fx.C14459b.f127006a
            long r20 = r6.k(r10, r7)
            r17 = r17 & r19
            goto L_0x01e6
        L_0x01e4:
            r20 = r48
        L_0x01e6:
            r6 = r12 & 256(0x100, float:3.59E-43)
            if (r6 == 0) goto L_0x01f5
            fx.b r6 = fx.C14459b.f127006a
            long r22 = r6.c(r10, r7)
            r6 = r17 & r11
            r17 = r6
            goto L_0x01f7
        L_0x01f5:
            r22 = r50
        L_0x01f7:
            r6 = r12 & 512(0x200, float:7.175E-43)
            if (r6 == 0) goto L_0x0216
            fx.b r6 = fx.C14459b.f127006a
            long r6 = r6.d(r10, r7)
            r17 = r17 & r1
            r19 = r4
            r29 = r6
        L_0x0207:
            r11 = r17
            r25 = r20
            r27 = r22
            r17 = r0
            r21 = r2
            r20 = r5
            r23 = r8
            goto L_0x021b
        L_0x0216:
            r29 = r52
            r19 = r4
            goto L_0x0207
        L_0x021b:
            r10.y()
            boolean r0 = U0.C4895p.J()
            if (r0 == 0) goto L_0x022d
            r0 = -1
            java.lang.String r1 = "com.ingka.ikea.populartimes.impl.ui.BarChart (BarChart.kt:138)"
            r2 = 854226863(0x32ea77af, float:2.7295611E-8)
            U0.C4895p.S(r2, r11, r0, r1)
        L_0x022d:
            U0.I0 r0 = androidx.compose.ui.platform.C5100f0.e()
            java.lang.Object r0 = r10.Q(r0)
            c2.d r0 = (c2.d) r0
            float r1 = r40.d()
            float r18 = r0.H1(r1)
            float r1 = r40.a()
            float r31 = r0.H1(r1)
            r0 = 295735116(0x11a08f4c, float:2.5331862E-28)
            r10.W(r0)
            java.lang.Object r0 = r10.D()
            U0.m$a r1 = U0.C4889m.f14007a
            java.lang.Object r1 = r1.a()
            if (r0 != r1) goto L_0x026c
            r0 = 0
            float r0 = (float) r0
            float r0 = c2.h.B(r0)
            c2.h r0 = c2.h.m(r0)
            r1 = 0
            r2 = 2
            U0.r0 r0 = U0.u1.e(r0, r1, r2, r1)
            r10.u(r0)
        L_0x026c:
            r32 = r0
            U0.r0 r32 = (U0.C4899r0) r32
            r10.P()
            float r33 = g(r32)
            fx.g$b r8 = new fx.g$b
            r0 = r8
            r1 = r20
            r2 = r39
            r3 = r19
            r4 = r27
            r6 = r23
            r34 = r8
            r8 = r29
            r35 = r10
            r36 = r11
            r10 = r21
            r12 = r18
            r13 = r31
            r14 = r40
            r15 = r32
            r0.<init>(r1, r2, r3, r4, r6, r8, r10, r12, r13, r14, r15)
            r0 = 54
            r1 = 792552369(0x2f3d63b1, float:1.7224867E-10)
            r2 = 1
            r4 = r34
            r3 = r35
            c1.a r0 = c1.c.e(r1, r2, r4, r3, r0)
            r1 = r36
            int r2 = r1 >> 12
            r2 = r2 & 112(0x70, float:1.57E-43)
            r2 = r2 | r16
            int r4 = r1 >> 15
            r4 = r4 & 896(0x380, float:1.256E-42)
            r2 = r2 | r4
            r4 = r1 & 7168(0x1c00, float:1.0045E-41)
            r2 = r2 | r4
            int r1 = r1 << 9
            r4 = 458752(0x70000, float:6.42848E-40)
            r1 = r1 & r4
            r1 = r1 | r2
            r2 = 0
            r41 = r18
            r42 = r21
            r44 = r25
            r46 = r19
            r47 = r33
            r48 = r17
            r49 = r0
            r50 = r3
            r51 = r1
            r52 = r2
            k(r41, r42, r44, r46, r47, r48, r49, r50, r51, r52)
            boolean r0 = U0.C4895p.J()
            if (r0 == 0) goto L_0x02de
            U0.C4895p.R()
        L_0x02de:
            r4 = r19
            r5 = r20
            r6 = r21
            r8 = r23
            r10 = r25
            r12 = r27
            r14 = r29
        L_0x02ec:
            U0.Y0 r3 = r3.n()
            if (r3 == 0) goto L_0x030d
            fx.c r2 = new fx.c
            r0 = r2
            r1 = r39
            r37 = r2
            r2 = r40
            r38 = r3
            r3 = r17
            r16 = r55
            r17 = r56
            r0.<init>(r1, r2, r3, r4, r5, r6, r8, r10, r12, r14, r16, r17)
            r1 = r37
            r0 = r38
            r0.a(r1)
        L_0x030d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: fx.C14464g.f(KJ.c, fx.a, androidx.compose.ui.d, float, float, long, long, long, long, long, U0.m, int, int):void");
    }

    private static final float g(C4899r0<h> r0Var) {
        return r0Var.getValue().G();
    }

    /* access modifiers changed from: private */
    public static final void h(C4899r0<h> r0Var, float f10) {
        r0Var.setValue(h.m(f10));
    }

    /* access modifiers changed from: private */
    public static final C16807N i(C15987c cVar, C14458a aVar, androidx.compose.ui.d dVar, float f10, float f11, long j10, long j11, long j12, long j13, long j14, int i10, int i11, C4889m mVar, int i12) {
        f(cVar, aVar, dVar, f10, f11, j10, j11, j12, j13, j14, mVar, M0.a(i10 | 1), i11);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N j(float f10, long j10, androidx.compose.ui.d dVar, Float f11, C5747v0 v0Var, int i10, int i11, C4889m mVar, int i12) {
        e(f10, j10, dVar, f11, v0Var, mVar, M0.a(i10 | 1), i11);
        return C16807N.f139792a;
    }

    /* JADX WARNING: Removed duplicated region for block: B:54:0x0098  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x009c  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x00b3  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x00b7  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x00d9  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x00df  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x0133  */
    /* JADX WARNING: Removed duplicated region for block: B:91:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static final void k(float r21, long r22, long r24, float r26, float r27, androidx.compose.ui.d r28, nI.r<? super s0.C5842M, ? super c2.h, ? super U0.C4889m, ? super java.lang.Integer, XH.C16807N> r29, U0.C4889m r30, int r31, int r32) {
        /*
            r10 = r31
            r0 = -144649500(0xfffffffff760d2e4, float:-4.5599682E33)
            r1 = r30
            U0.m r8 = r1.k(r0)
            r1 = r32 & 1
            if (r1 == 0) goto L_0x0014
            r1 = r10 | 6
            r9 = r21
            goto L_0x0026
        L_0x0014:
            r1 = r10 & 6
            r9 = r21
            if (r1 != 0) goto L_0x0025
            boolean r1 = r8.c(r9)
            if (r1 == 0) goto L_0x0022
            r1 = 4
            goto L_0x0023
        L_0x0022:
            r1 = 2
        L_0x0023:
            r1 = r1 | r10
            goto L_0x0026
        L_0x0025:
            r1 = r10
        L_0x0026:
            r2 = r32 & 2
            if (r2 == 0) goto L_0x002f
            r1 = r1 | 48
            r6 = r22
            goto L_0x0041
        L_0x002f:
            r2 = r10 & 48
            r6 = r22
            if (r2 != 0) goto L_0x0041
            boolean r2 = r8.e(r6)
            if (r2 == 0) goto L_0x003e
            r2 = 32
            goto L_0x0040
        L_0x003e:
            r2 = 16
        L_0x0040:
            r1 = r1 | r2
        L_0x0041:
            r2 = r32 & 4
            if (r2 == 0) goto L_0x004a
            r1 = r1 | 384(0x180, float:5.38E-43)
            r4 = r24
            goto L_0x005c
        L_0x004a:
            r2 = r10 & 384(0x180, float:5.38E-43)
            r4 = r24
            if (r2 != 0) goto L_0x005c
            boolean r2 = r8.e(r4)
            if (r2 == 0) goto L_0x0059
            r2 = 256(0x100, float:3.59E-43)
            goto L_0x005b
        L_0x0059:
            r2 = 128(0x80, float:1.794E-43)
        L_0x005b:
            r1 = r1 | r2
        L_0x005c:
            r2 = r32 & 8
            if (r2 == 0) goto L_0x0065
            r1 = r1 | 3072(0xc00, float:4.305E-42)
            r3 = r26
            goto L_0x0077
        L_0x0065:
            r2 = r10 & 3072(0xc00, float:4.305E-42)
            r3 = r26
            if (r2 != 0) goto L_0x0077
            boolean r2 = r8.c(r3)
            if (r2 == 0) goto L_0x0074
            r2 = 2048(0x800, float:2.87E-42)
            goto L_0x0076
        L_0x0074:
            r2 = 1024(0x400, float:1.435E-42)
        L_0x0076:
            r1 = r1 | r2
        L_0x0077:
            r2 = r32 & 16
            if (r2 == 0) goto L_0x0080
            r1 = r1 | 24576(0x6000, float:3.4438E-41)
        L_0x007d:
            r2 = r27
            goto L_0x0092
        L_0x0080:
            r2 = r10 & 24576(0x6000, float:3.4438E-41)
            if (r2 != 0) goto L_0x007d
            r2 = r27
            boolean r11 = r8.c(r2)
            if (r11 == 0) goto L_0x008f
            r11 = 16384(0x4000, float:2.2959E-41)
            goto L_0x0091
        L_0x008f:
            r11 = 8192(0x2000, float:1.14794E-41)
        L_0x0091:
            r1 = r1 | r11
        L_0x0092:
            r11 = r32 & 32
            r12 = 196608(0x30000, float:2.75506E-40)
            if (r11 == 0) goto L_0x009c
            r1 = r1 | r12
        L_0x0099:
            r12 = r28
            goto L_0x00ad
        L_0x009c:
            r12 = r12 & r10
            if (r12 != 0) goto L_0x0099
            r12 = r28
            boolean r13 = r8.V(r12)
            if (r13 == 0) goto L_0x00aa
            r13 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00ac
        L_0x00aa:
            r13 = 65536(0x10000, float:9.18355E-41)
        L_0x00ac:
            r1 = r1 | r13
        L_0x00ad:
            r13 = r32 & 64
            r14 = 1572864(0x180000, float:2.204052E-39)
            if (r13 == 0) goto L_0x00b7
            r1 = r1 | r14
            r14 = r29
            goto L_0x00c9
        L_0x00b7:
            r13 = r10 & r14
            r14 = r29
            if (r13 != 0) goto L_0x00c9
            boolean r13 = r8.F(r14)
            if (r13 == 0) goto L_0x00c6
            r13 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00c8
        L_0x00c6:
            r13 = 524288(0x80000, float:7.34684E-40)
        L_0x00c8:
            r1 = r1 | r13
        L_0x00c9:
            r13 = 599187(0x92493, float:8.3964E-40)
            r13 = r13 & r1
            r15 = 599186(0x92492, float:8.39638E-40)
            if (r13 != r15) goto L_0x00df
            boolean r13 = r8.l()
            if (r13 != 0) goto L_0x00d9
            goto L_0x00df
        L_0x00d9:
            r8.L()
            r20 = r12
            goto L_0x012d
        L_0x00df:
            if (r11 == 0) goto L_0x00e5
            androidx.compose.ui.d$a r11 = androidx.compose.ui.d.f18749a
            r15 = r11
            goto L_0x00e6
        L_0x00e5:
            r15 = r12
        L_0x00e6:
            boolean r11 = U0.C4895p.J()
            if (r11 == 0) goto L_0x00f2
            r11 = -1
            java.lang.String r12 = "com.ingka.ikea.populartimes.impl.ui.ChartSurface (BarChart.kt:257)"
            U0.C4895p.S(r0, r1, r11, r12)
        L_0x00f2:
            r0 = 0
            r1 = 0
            r13 = 1
            androidx.compose.ui.d r1 = androidx.compose.foundation.layout.J.h(r15, r0, r13, r1)
            fx.g$c r0 = new fx.g$c
            r11 = r0
            r12 = r27
            r2 = r13
            r13 = r21
            r20 = r15
            r14 = r22
            r16 = r24
            r18 = r26
            r19 = r29
            r11.<init>(r12, r13, r14, r16, r18, r19)
            r11 = 54
            r12 = 1231263418(0x496396ba, float:932203.6)
            c1.a r0 = c1.c.e(r12, r2, r0, r8, r11)
            r11 = 3072(0xc00, float:4.305E-42)
            r12 = 6
            r2 = 0
            r13 = 0
            r3 = r13
            r4 = r0
            r5 = r8
            r6 = r11
            r7 = r12
            s0.C5858d.a(r1, r2, r3, r4, r5, r6, r7)
            boolean r0 = U0.C4895p.J()
            if (r0 == 0) goto L_0x012d
            U0.C4895p.R()
        L_0x012d:
            U0.Y0 r12 = r8.n()
            if (r12 == 0) goto L_0x014e
            fx.d r13 = new fx.d
            r0 = r13
            r1 = r21
            r2 = r22
            r4 = r24
            r6 = r26
            r7 = r27
            r8 = r20
            r9 = r29
            r10 = r31
            r11 = r32
            r0.<init>(r1, r2, r4, r6, r7, r8, r9, r10, r11)
            r12.a(r13)
        L_0x014e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: fx.C14464g.k(float, long, long, float, float, androidx.compose.ui.d, nI.r, U0.m, int, int):void");
    }

    /* access modifiers changed from: private */
    public static final C16807N l(float f10, long j10, long j11, float f11, float f12, androidx.compose.ui.d dVar, r rVar, int i10, int i11, C4889m mVar, int i12) {
        k(f10, j10, j11, f11, f12, dVar, rVar, mVar, M0.a(i10 | 1), i11);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x007a  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x007f  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x009e  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x00a5  */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x0185  */
    /* JADX WARNING: Removed duplicated region for block: B:95:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m(s0.C5857c r19, float r20, long r21, androidx.compose.ui.d r23, nI.p<? super U0.C4889m, ? super java.lang.Integer, XH.C16807N> r24, U0.C4889m r25, int r26, int r27) {
        /*
            r1 = r19
            r2 = r20
            r7 = r26
            r0 = 1845962094(0x6e07256e, float:1.0456432E28)
            r3 = r25
            U0.m r3 = r3.k(r0)
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r27 & r4
            if (r4 == 0) goto L_0x0018
            r4 = r7 | 6
            goto L_0x0028
        L_0x0018:
            r4 = r7 & 6
            if (r4 != 0) goto L_0x0027
            boolean r4 = r3.V(r1)
            if (r4 == 0) goto L_0x0024
            r4 = 4
            goto L_0x0025
        L_0x0024:
            r4 = 2
        L_0x0025:
            r4 = r4 | r7
            goto L_0x0028
        L_0x0027:
            r4 = r7
        L_0x0028:
            r5 = r27 & 1
            r6 = 32
            if (r5 == 0) goto L_0x0031
            r4 = r4 | 48
            goto L_0x0040
        L_0x0031:
            r5 = r7 & 48
            if (r5 != 0) goto L_0x0040
            boolean r5 = r3.c(r2)
            if (r5 == 0) goto L_0x003d
            r5 = r6
            goto L_0x003f
        L_0x003d:
            r5 = 16
        L_0x003f:
            r4 = r4 | r5
        L_0x0040:
            r5 = r27 & 2
            if (r5 == 0) goto L_0x0049
            r4 = r4 | 384(0x180, float:5.38E-43)
            r14 = r21
            goto L_0x005b
        L_0x0049:
            r5 = r7 & 384(0x180, float:5.38E-43)
            r14 = r21
            if (r5 != 0) goto L_0x005b
            boolean r5 = r3.e(r14)
            if (r5 == 0) goto L_0x0058
            r5 = 256(0x100, float:3.59E-43)
            goto L_0x005a
        L_0x0058:
            r5 = 128(0x80, float:1.794E-43)
        L_0x005a:
            r4 = r4 | r5
        L_0x005b:
            r5 = r27 & 4
            if (r5 == 0) goto L_0x0064
            r4 = r4 | 3072(0xc00, float:4.305E-42)
        L_0x0061:
            r8 = r23
            goto L_0x0076
        L_0x0064:
            r8 = r7 & 3072(0xc00, float:4.305E-42)
            if (r8 != 0) goto L_0x0061
            r8 = r23
            boolean r9 = r3.V(r8)
            if (r9 == 0) goto L_0x0073
            r9 = 2048(0x800, float:2.87E-42)
            goto L_0x0075
        L_0x0073:
            r9 = 1024(0x400, float:1.435E-42)
        L_0x0075:
            r4 = r4 | r9
        L_0x0076:
            r9 = r27 & 8
            if (r9 == 0) goto L_0x007f
            r4 = r4 | 24576(0x6000, float:3.4438E-41)
        L_0x007c:
            r10 = r24
            goto L_0x0091
        L_0x007f:
            r10 = r7 & 24576(0x6000, float:3.4438E-41)
            if (r10 != 0) goto L_0x007c
            r10 = r24
            boolean r11 = r3.F(r10)
            if (r11 == 0) goto L_0x008e
            r11 = 16384(0x4000, float:2.2959E-41)
            goto L_0x0090
        L_0x008e:
            r11 = 8192(0x2000, float:1.14794E-41)
        L_0x0090:
            r4 = r4 | r11
        L_0x0091:
            r11 = r4 & 9363(0x2493, float:1.312E-41)
            r12 = 9362(0x2492, float:1.3119E-41)
            if (r11 != r12) goto L_0x00a5
            boolean r11 = r3.l()
            if (r11 != 0) goto L_0x009e
            goto L_0x00a5
        L_0x009e:
            r3.L()
            r5 = r8
        L_0x00a2:
            r6 = r10
            goto L_0x017f
        L_0x00a5:
            if (r5 == 0) goto L_0x00aa
            androidx.compose.ui.d$a r5 = androidx.compose.ui.d.f18749a
            goto L_0x00ab
        L_0x00aa:
            r5 = r8
        L_0x00ab:
            r13 = 0
            if (r9 == 0) goto L_0x00b0
            r12 = r13
            goto L_0x00b1
        L_0x00b0:
            r12 = r10
        L_0x00b1:
            boolean r8 = U0.C4895p.J()
            if (r8 == 0) goto L_0x00bd
            r8 = -1
            java.lang.String r9 = "com.ingka.ikea.populartimes.impl.ui.ColoredBar (BarChart.kt:440)"
            U0.C4895p.S(r0, r4, r8, r9)
        L_0x00bd:
            U0.I0 r0 = androidx.compose.ui.platform.C5135u0.a()
            java.lang.Object r0 = r3.Q(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            r11 = 0
            if (r0 == 0) goto L_0x00d0
            r0 = r2
            goto L_0x00d1
        L_0x00d0:
            r0 = r11
        L_0x00d1:
            r8 = -693765748(0xffffffffd6a5f98c, float:-9.1245607E13)
            r3.W(r8)
            java.lang.Object r8 = r3.D()
            U0.m$a r9 = U0.C4889m.f14007a
            java.lang.Object r10 = r9.a()
            if (r8 != r10) goto L_0x00ea
            U0.n0 r8 = U0.D0.a(r0)
            r3.u(r8)
        L_0x00ea:
            U0.n0 r8 = (U0.C4892n0) r8
            r3.P()
            java.lang.Float r0 = java.lang.Float.valueOf(r20)
            r10 = -693762594(0xffffffffd6a605de, float:-9.1272065E13)
            r3.W(r10)
            r10 = r4 & 112(0x70, float:1.57E-43)
            r15 = 0
            r14 = 1
            if (r10 != r6) goto L_0x0101
            r6 = r14
            goto L_0x0102
        L_0x0101:
            r6 = r15
        L_0x0102:
            java.lang.Object r10 = r3.D()
            if (r6 != 0) goto L_0x010e
            java.lang.Object r6 = r9.a()
            if (r10 != r6) goto L_0x0116
        L_0x010e:
            fx.g$d r10 = new fx.g$d
            r10.<init>(r2, r8, r13)
            r3.u(r10)
        L_0x0116:
            nI.p r10 = (nI.p) r10
            r3.P()
            int r6 = r4 >> 3
            r6 = r6 & 14
            U0.P.g(r0, r10, r3, r6)
            float r8 = n(r8)
            m0.y0<java.lang.Float> r9 = f127063a
            r0 = 3120(0xc30, float:4.372E-42)
            r6 = 20
            r10 = 0
            java.lang.String r16 = "ColoredBarAnimation"
            r17 = 0
            r11 = r16
            r18 = r12
            r12 = r17
            r13 = r3
            r14 = r0
            r0 = r15
            r15 = r6
            U0.A1 r6 = m0.C5534c.d(r8, r9, r10, r11, r12, r13, r14, r15)
            r8 = 0
            r9 = 0
            r10 = 1
            androidx.compose.ui.d r8 = androidx.compose.foundation.layout.J.h(r5, r9, r10, r8)
            float r6 = p(r6)
            androidx.compose.ui.d r8 = androidx.compose.foundation.layout.J.c(r8, r6)
            r12 = 2
            r13 = 0
            r11 = 0
            r9 = r21
            androidx.compose.ui.d r6 = androidx.compose.foundation.b.d(r8, r9, r11, r12, r13)
            i1.c$a r8 = i1.C5437c.f24302a
            i1.c r8 = r8.b()
            androidx.compose.ui.d r6 = r1.a(r6, r8)
            s0.C5844O.a(r6, r3, r0)
            r10 = r18
            if (r10 != 0) goto L_0x0169
            goto L_0x0174
        L_0x0169:
            int r0 = r4 >> 12
            r0 = r0 & 14
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r10.invoke(r3, r0)
        L_0x0174:
            boolean r0 = U0.C4895p.J()
            if (r0 == 0) goto L_0x00a2
            U0.C4895p.R()
            goto L_0x00a2
        L_0x017f:
            U0.Y0 r9 = r3.n()
            if (r9 == 0) goto L_0x0198
            fx.f r10 = new fx.f
            r0 = r10
            r1 = r19
            r2 = r20
            r3 = r21
            r7 = r26
            r8 = r27
            r0.<init>(r1, r2, r3, r5, r6, r7, r8)
            r9.a(r10)
        L_0x0198:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: fx.C14464g.m(s0.c, float, long, androidx.compose.ui.d, nI.p, U0.m, int, int):void");
    }

    private static final float n(C4892n0 n0Var) {
        return n0Var.a();
    }

    /* access modifiers changed from: private */
    public static final void o(C4892n0 n0Var, float f10) {
        n0Var.n(f10);
    }

    private static final float p(A1<Float> a12) {
        return a12.getValue().floatValue();
    }

    /* access modifiers changed from: private */
    public static final C16807N q(C5857c cVar, float f10, long j10, androidx.compose.ui.d dVar, p pVar, int i10, int i11, C4889m mVar, int i12) {
        m(cVar, f10, j10, dVar, pVar, mVar, M0.a(i10 | 1), i11);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final void x(f fVar, float f10, long j10, float f11, float f12) {
        float f13 = f10;
        f.u0(fVar, j10, C5668h.a(f13, C5673m.i(fVar.b()) + f11), C5668h.a(f13, C5673m.i(fVar.b()) + f12 + f11), f11, 0, (V0) null, 0.0f, (C5749w0) null, 0, 496, (Object) null);
    }

    /* access modifiers changed from: private */
    public static final void y(f fVar, S s10, Y y10, String str, float f10, boolean z10, C17642l<? super h, C16807N> lVar) {
        float f11;
        float f12;
        f fVar2 = fVar;
        t.a aVar = t.f14827a;
        P b10 = S.b(s10, str, y10, aVar.c(), false, 0, 0, (c2.t) null, (c2.d) null, (C4820m.b) null, false, 1008, (Object) null);
        float h10 = ((float) c2.r.h(b10.B())) / ((float) 2);
        float l10 = z10 ? C5673m.l(fVar.b()) - h10 : -h10;
        float f13 = (float) 1;
        float H12 = fVar2.H1(h.B(f10 + h.B(f13))) + C5673m.i(fVar.b());
        lVar.invoke(h.m(fVar2.x1(fVar2.H1(h.B(f10 + h.B(f13))) + ((float) c2.r.g(b10.B())))));
        fVar.I1().c().d(l10, H12);
        try {
            float f14 = H12;
            f11 = l10;
            try {
                V.c(fVar, s10, str, 0, y10, aVar.c(), false, 0, 0, 0, 452, (Object) null);
                fVar.I1().c().d(-f11, -f14);
            } catch (Throwable th2) {
                th = th2;
                f12 = f14;
                fVar.I1().c().d(-f11, -f12);
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            f12 = H12;
            f11 = l10;
            fVar.I1().c().d(-f11, -f12);
            throw th;
        }
    }
}
