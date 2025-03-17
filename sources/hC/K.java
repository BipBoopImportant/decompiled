package HC;

import KJ.C15987c;
import U0.C4889m;
import U0.C4899r0;
import U0.M0;
import XH.C16807N;
import c1.c;
import c2.d;
import c2.h;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import lp.C11559a;
import nI.C17642l;
import nI.r;
import t0.C5938c;
import t0.x;

@Metadata(d1 = {"\u0000*\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\u001aE\u0010\n\u001a\u00020\u00062\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0002\u0010\t\u001a\u00020\bH\u0007¢\u0006\u0004\b\n\u0010\u000b\u001a!\u0010\r\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\bH\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u0011²\u0006\u000e\u0010\u0010\u001a\u00020\u000f8\n@\nX\u0002"}, d2 = {"", "title", "LKJ/c;", "Llp/a;", "stories", "Lkotlin/Function1;", "LXH/N;", "onStoryClicked", "Landroidx/compose/ui/d;", "modifier", "g", "(Ljava/lang/String;LKJ/c;LnI/l;Landroidx/compose/ui/d;LU0/m;II)V", "story", "e", "(Llp/a;Landroidx/compose/ui/d;LU0/m;II)V", "Lc2/h;", "minHeight", "commercial_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class K {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class a implements r<C5938c, Integer, C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C15987c<C11559a> f110560a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ d f110561b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C17642l<String, C16807N> f110562c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C4899r0<h> f110563d;

        a(C15987c<C11559a> cVar, d dVar, C17642l<? super String, C16807N> lVar, C4899r0<h> r0Var) {
            this.f110560a = cVar;
            this.f110561b = dVar;
            this.f110562c = lVar;
            this.f110563d = r0Var;
        }

        /* access modifiers changed from: private */
        public static final C16807N e(d dVar, C4899r0 r0Var, c2.r rVar) {
            float H10 = dVar.H(c2.r.g(rVar.k()));
            if (h.v(H10, K.i(r0Var)) > 0) {
                K.j(r0Var, H10);
            }
            return C16807N.f139792a;
        }

        /* access modifiers changed from: private */
        public static final C16807N f(C17642l lVar, C11559a aVar) {
            lVar.invoke(aVar.b());
            return C16807N.f139792a;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v0, resolved type: nI.a} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void c(t0.C5938c r11, int r12, U0.C4889m r13, int r14) {
            /*
                r10 = this;
                java.lang.String r0 = "$this$items"
                kotlin.jvm.internal.C17542s.j(r11, r0)
                r11 = r14 & 48
                if (r11 != 0) goto L_0x0015
                boolean r11 = r13.d(r12)
                if (r11 == 0) goto L_0x0012
                r11 = 32
                goto L_0x0014
            L_0x0012:
                r11 = 16
            L_0x0014:
                r14 = r14 | r11
            L_0x0015:
                r11 = r14 & 145(0x91, float:2.03E-43)
                r0 = 144(0x90, float:2.02E-43)
                if (r11 != r0) goto L_0x0027
                boolean r11 = r13.l()
                if (r11 != 0) goto L_0x0022
                goto L_0x0027
            L_0x0022:
                r13.L()
                goto L_0x00cc
            L_0x0027:
                boolean r11 = U0.C4895p.J()
                if (r11 == 0) goto L_0x0036
                r11 = -1
                java.lang.String r0 = "com.ingka.ikea.ui.commercial.StoryCarousel.<anonymous>.<anonymous>.<anonymous>.<anonymous> (StoryCarousel.kt:101)"
                r1 = -932822924(0xffffffffc8664074, float:-235777.81)
                U0.C4895p.S(r1, r14, r11, r0)
            L_0x0036:
                KJ.c<lp.a> r11 = r10.f110560a
                java.lang.Object r11 = r11.get(r12)
                lp.a r11 = (lp.C11559a) r11
                androidx.compose.ui.d$a r12 = androidx.compose.ui.d.f18749a
                r14 = 300(0x12c, float:4.2E-43)
                float r14 = (float) r14
                float r14 = c2.h.B(r14)
                androidx.compose.ui.d r12 = androidx.compose.foundation.layout.J.y(r12, r14)
                U0.r0<c2.h> r14 = r10.f110563d
                float r14 = HC.K.i(r14)
                r0 = 1
                r1 = 0
                r2 = 0
                androidx.compose.ui.d r12 = androidx.compose.foundation.layout.J.b(r12, r2, r14, r0, r1)
                r14 = 282240367(0x10d2a56f, float:8.3085286E-29)
                r13.W(r14)
                c2.d r14 = r10.f110561b
                boolean r14 = r13.V(r14)
                c2.d r0 = r10.f110561b
                U0.r0<c2.h> r1 = r10.f110563d
                java.lang.Object r2 = r13.D()
                if (r14 != 0) goto L_0x0076
                U0.m$a r14 = U0.C4889m.f14007a
                java.lang.Object r14 = r14.a()
                if (r2 != r14) goto L_0x007e
            L_0x0076:
                HC.I r2 = new HC.I
                r2.<init>(r0, r1)
                r13.u(r2)
            L_0x007e:
                nI.l r2 = (nI.C17642l) r2
                r13.P()
                androidx.compose.ui.d r3 = androidx.compose.ui.layout.g.a(r12, r2)
                r12 = 282250322(0x10d2cc52, float:8.31452E-29)
                r13.W(r12)
                nI.l<java.lang.String, XH.N> r12 = r10.f110562c
                boolean r12 = r13.V(r12)
                boolean r14 = r13.F(r11)
                r12 = r12 | r14
                nI.l<java.lang.String, XH.N> r14 = r10.f110562c
                java.lang.Object r0 = r13.D()
                if (r12 != 0) goto L_0x00a8
                U0.m$a r12 = U0.C4889m.f14007a
                java.lang.Object r12 = r12.a()
                if (r0 != r12) goto L_0x00b0
            L_0x00a8:
                HC.J r0 = new HC.J
                r0.<init>(r14, r11)
                r13.u(r0)
            L_0x00b0:
                r7 = r0
                nI.a r7 = (nI.C17631a) r7
                r13.P()
                r8 = 7
                r9 = 0
                r4 = 0
                r5 = 0
                r6 = 0
                androidx.compose.ui.d r12 = androidx.compose.foundation.d.d(r3, r4, r5, r6, r7, r8, r9)
                r14 = 0
                HC.K.e(r11, r12, r13, r14, r14)
                boolean r11 = U0.C4895p.J()
                if (r11 == 0) goto L_0x00cc
                U0.C4895p.R()
            L_0x00cc:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: HC.K.a.c(t0.c, int, U0.m, int):void");
        }

        public /* bridge */ /* synthetic */ Object l(Object obj, Object obj2, Object obj3, Object obj4) {
            c((C5938c) obj, ((Number) obj2).intValue(), (C4889m) obj3, ((Number) obj4).intValue());
            return C16807N.f139792a;
        }
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x0370  */
    /* JADX WARNING: Removed duplicated region for block: B:116:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0051  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0057  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void e(lp.C11559a r32, androidx.compose.ui.d r33, U0.C4889m r34, int r35, int r36) {
        /*
            r0 = r32
            r1 = r35
            r2 = r36
            r3 = 6
            r4 = -1021505969(0xffffffffc31d0e4f, float:-157.0559)
            r5 = r34
            U0.m r15 = r5.k(r4)
            r14 = 1
            r5 = r2 & 1
            r6 = 2
            if (r5 == 0) goto L_0x0019
            r5 = r1 | 6
            goto L_0x0029
        L_0x0019:
            r5 = r1 & 6
            if (r5 != 0) goto L_0x0028
            boolean r5 = r15.F(r0)
            if (r5 == 0) goto L_0x0025
            r5 = 4
            goto L_0x0026
        L_0x0025:
            r5 = r6
        L_0x0026:
            r5 = r5 | r1
            goto L_0x0029
        L_0x0028:
            r5 = r1
        L_0x0029:
            r7 = r2 & 2
            if (r7 == 0) goto L_0x0032
            r5 = r5 | 48
        L_0x002f:
            r8 = r33
            goto L_0x0044
        L_0x0032:
            r8 = r1 & 48
            if (r8 != 0) goto L_0x002f
            r8 = r33
            boolean r9 = r15.V(r8)
            if (r9 == 0) goto L_0x0041
            r9 = 32
            goto L_0x0043
        L_0x0041:
            r9 = 16
        L_0x0043:
            r5 = r5 | r9
        L_0x0044:
            r9 = r5 & 19
            r10 = 18
            if (r9 != r10) goto L_0x0057
            boolean r9 = r15.l()
            if (r9 != 0) goto L_0x0051
            goto L_0x0057
        L_0x0051:
            r15.L()
            r13 = r15
            goto L_0x036a
        L_0x0057:
            if (r7 == 0) goto L_0x005d
            androidx.compose.ui.d$a r7 = androidx.compose.ui.d.f18749a
            r13 = r7
            goto L_0x005e
        L_0x005d:
            r13 = r8
        L_0x005e:
            boolean r7 = U0.C4895p.J()
            if (r7 == 0) goto L_0x006a
            r7 = -1
            java.lang.String r8 = "com.ingka.ikea.ui.commercial.StoryCard (StoryCarousel.kt:127)"
            U0.C4895p.S(r4, r5, r7, r8)
        L_0x006a:
            tK.v r4 = tK.C18030v.f147664a
            int r5 = tK.C18030v.f147665b
            tK.h r4 = r4.a(r15, r5)
            long r4 = r4.l0()
            float r3 = (float) r3
            float r3 = c2.h.B(r3)
            A0.f r3 = A0.g.e(r3)
            androidx.compose.ui.d r3 = androidx.compose.foundation.b.c(r13, r4, r3)
            androidx.compose.foundation.layout.d r4 = androidx.compose.foundation.layout.C5073d.f18068a
            androidx.compose.foundation.layout.d$m r4 = r4.g()
            i1.c$a r5 = i1.C5437c.f24302a
            i1.c$b r5 = r5.k()
            r12 = 0
            E1.I r4 = androidx.compose.foundation.layout.C5080k.a(r4, r5, r15, r12)
            int r5 = U0.C4883j.a(r15, r12)
            U0.y r7 = r15.s()
            androidx.compose.ui.d r3 = androidx.compose.ui.c.e(r15, r3)
            G1.g$a r8 = G1.C4504g.f6515W
            nI.a r9 = r8.a()
            U0.f r10 = r15.m()
            if (r10 != 0) goto L_0x00af
            U0.C4883j.c()
        L_0x00af:
            r15.I()
            boolean r10 = r15.i()
            if (r10 == 0) goto L_0x00bc
            r15.p(r9)
            goto L_0x00bf
        L_0x00bc:
            r15.t()
        L_0x00bf:
            U0.m r9 = U0.F1.a(r15)
            nI.p r10 = r8.c()
            U0.F1.c(r9, r4, r10)
            nI.p r4 = r8.e()
            U0.F1.c(r9, r7, r4)
            nI.p r4 = r8.b()
            boolean r7 = r9.i()
            if (r7 != 0) goto L_0x00e9
            java.lang.Object r7 = r9.D()
            java.lang.Integer r10 = java.lang.Integer.valueOf(r5)
            boolean r7 = kotlin.jvm.internal.C17542s.e(r7, r10)
            if (r7 != 0) goto L_0x00f7
        L_0x00e9:
            java.lang.Integer r7 = java.lang.Integer.valueOf(r5)
            r9.u(r7)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r9.w(r5, r4)
        L_0x00f7:
            nI.p r4 = r8.d()
            U0.F1.c(r9, r3, r4)
            s0.h r3 = s0.C5862h.f28810a
            androidx.compose.ui.d$a r4 = androidx.compose.ui.d.f18749a
            r5 = 1061158912(0x3f400000, float:0.75)
            r11 = 0
            androidx.compose.ui.d r7 = androidx.compose.foundation.layout.C5074e.b(r4, r5, r12, r6, r11)
            com.ingka.ikea.core.model.Media r4 = r32.a()
            r5 = 928262532(0x37542984, float:1.2645851E-5)
            r15.W(r5)
            if (r4 != 0) goto L_0x011d
            r3 = r12
            r31 = r13
            r4 = r14
            r33 = r15
            goto L_0x0267
        L_0x011d:
            boolean r5 = r4 instanceof com.ingka.ikea.core.model.Media.Image
            if (r5 != 0) goto L_0x015f
            boolean r5 = r4 instanceof com.ingka.ikea.core.model.Media.InfoImage
            if (r5 == 0) goto L_0x0126
            goto L_0x015f
        L_0x0126:
            boolean r3 = r4 instanceof com.ingka.ikea.core.model.Media.Video
            if (r3 == 0) goto L_0x0150
            r3 = -1524979155(0xffffffffa51aaa2d, float:-1.3415029E-16)
            r15.W(r3)
            com.ingka.ikea.core.model.Media$Video r4 = (com.ingka.ikea.core.model.Media.Video) r4
            java.lang.String r5 = r4.getUrl()
            java.lang.String r6 = r4.A0()
            r10 = 384(0x180, float:5.38E-43)
            r3 = 8
            r8 = 0
            r9 = r15
            r4 = r11
            r11 = r3
            ZC.C13902y.q(r5, r6, r7, r8, r9, r10, r11)
            r15.P()
            r3 = r12
            r31 = r13
            r4 = r14
            r33 = r15
            goto L_0x0265
        L_0x0150:
            r0 = 1059169086(0x3f21a33e, float:0.6313971)
            r15.W(r0)
            r15.P()
            XH.t r0 = new XH.t
            r0.<init>()
            throw r0
        L_0x015f:
            r5 = -1525407451(0xffffffffa5142125, float:-1.2848184E-16)
            r15.W(r5)
            boolean r5 = r4 instanceof com.ingka.ikea.core.model.Media.InfoImage
            if (r5 == 0) goto L_0x0235
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.String r8 = "InfoImage not supported in StoryCard"
            r5.<init>(r8)
            qv.e r8 = qv.e.ERROR
            qv.d r9 = qv.d.f102012a
            java.util.List r9 = r9.a()
            java.lang.Iterable r9 = (java.lang.Iterable) r9
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
            java.util.Iterator r9 = r9.iterator()
        L_0x0183:
            boolean r16 = r9.hasNext()
            r12 = 0
            if (r16 == 0) goto L_0x019e
            java.lang.Object r14 = r9.next()
            r6 = r14
            qv.b r6 = (qv.C11819b) r6
            boolean r6 = r6.b(r8, r12)
            if (r6 == 0) goto L_0x019a
            r10.add(r14)
        L_0x019a:
            r6 = 2
            r12 = 0
            r14 = 1
            goto L_0x0183
        L_0x019e:
            java.util.Iterator r6 = r10.iterator()
            r9 = r11
            r10 = r9
        L_0x01a4:
            boolean r14 = r6.hasNext()
            if (r14 == 0) goto L_0x01ba
            java.lang.Object r14 = r6.next()
            r16 = r14
            qv.b r16 = (qv.C11819b) r16
            if (r9 != 0) goto L_0x01c3
            java.lang.String r9 = qv.C11818a.a(r11, r5)
            if (r9 != 0) goto L_0x01bf
        L_0x01ba:
            r24 = r13
            r13 = 1
            goto L_0x0238
        L_0x01bf:
            java.lang.String r9 = qv.C11820c.a(r9)
        L_0x01c3:
            if (r10 != 0) goto L_0x021a
            java.lang.Class r10 = r3.getClass()
            java.lang.String r10 = r10.getName()
            kotlin.jvm.internal.C17542s.g(r10)
            r14 = 36
            r12 = 2
            java.lang.String r14 = HJ.C15854t.s1(r10, r14, r11, r12, r11)
            r22 = r3
            r3 = 46
            java.lang.String r3 = HJ.C15854t.o1(r14, r3, r11, r12, r11)
            int r14 = r3.length()
            if (r14 != 0) goto L_0x01e6
            goto L_0x01ec
        L_0x01e6:
            java.lang.String r10 = "Kt"
            java.lang.String r10 = HJ.C15854t.P0(r3, r10)
        L_0x01ec:
            java.lang.Thread r3 = java.lang.Thread.currentThread()
            java.lang.String r3 = r3.getName()
            java.lang.String r14 = "main"
            r24 = r13
            r13 = 1
            boolean r3 = HJ.C15854t.b0(r3, r14, r13)
            if (r3 == 0) goto L_0x0202
            java.lang.String r3 = "m"
            goto L_0x0204
        L_0x0202:
            java.lang.String r3 = "b"
        L_0x0204:
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            r14.append(r3)
            java.lang.String r3 = "|"
            r14.append(r3)
            r14.append(r10)
            java.lang.String r3 = r14.toString()
            r10 = r3
            goto L_0x0220
        L_0x021a:
            r22 = r3
            r24 = r13
            r12 = 2
            r13 = 1
        L_0x0220:
            r17 = r8
            r18 = r10
            r3 = 0
            r19 = r3
            r20 = r5
            r21 = r9
            r16.a(r17, r18, r19, r20, r21)
            r12 = r3
            r3 = r22
            r13 = r24
            goto L_0x01a4
        L_0x0235:
            r24 = r13
            r13 = r14
        L_0x0238:
            java.lang.String r5 = r4.getUrl()
            r19 = 0
            r20 = 4088(0xff8, float:5.729E-42)
            r6 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r3 = 0
            r12 = 0
            r4 = 0
            r14 = 0
            r16 = 0
            r17 = 0
            r18 = 432(0x1b0, float:6.05E-43)
            r11 = r3
            r3 = 0
            r21 = r13
            r31 = r24
            r13 = r4
            r4 = r21
            r33 = r15
            r15 = r16
            r16 = r17
            r17 = r33
            LC.h.c(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            r33.P()
        L_0x0265:
            XH.N r5 = XH.C16807N.f139792a
        L_0x0267:
            r33.P()
            androidx.compose.ui.d$a r15 = androidx.compose.ui.d.f18749a
            r5 = 0
            r6 = 0
            androidx.compose.ui.d r4 = androidx.compose.foundation.layout.J.h(r15, r5, r4, r6)
            r5 = 8
            float r5 = (float) r5
            float r6 = c2.h.B(r5)
            androidx.compose.ui.d r4 = androidx.compose.foundation.layout.D.i(r4, r6)
            androidx.compose.foundation.layout.d r6 = androidx.compose.foundation.layout.C5073d.f18068a
            float r5 = c2.h.B(r5)
            androidx.compose.foundation.layout.d$f r5 = r6.n(r5)
            i1.c$a r6 = i1.C5437c.f24302a
            i1.c$c r6 = r6.i()
            r7 = 54
            r14 = r33
            E1.I r5 = androidx.compose.foundation.layout.G.b(r5, r6, r14, r7)
            int r6 = U0.C4883j.a(r14, r3)
            U0.y r7 = r14.s()
            androidx.compose.ui.d r4 = androidx.compose.ui.c.e(r14, r4)
            G1.g$a r8 = G1.C4504g.f6515W
            nI.a r9 = r8.a()
            U0.f r10 = r14.m()
            if (r10 != 0) goto L_0x02b0
            U0.C4883j.c()
        L_0x02b0:
            r14.I()
            boolean r10 = r14.i()
            if (r10 == 0) goto L_0x02bd
            r14.p(r9)
            goto L_0x02c0
        L_0x02bd:
            r14.t()
        L_0x02c0:
            U0.m r9 = U0.F1.a(r14)
            nI.p r10 = r8.c()
            U0.F1.c(r9, r5, r10)
            nI.p r5 = r8.e()
            U0.F1.c(r9, r7, r5)
            nI.p r5 = r8.b()
            boolean r7 = r9.i()
            if (r7 != 0) goto L_0x02ea
            java.lang.Object r7 = r9.D()
            java.lang.Integer r10 = java.lang.Integer.valueOf(r6)
            boolean r7 = kotlin.jvm.internal.C17542s.e(r7, r10)
            if (r7 != 0) goto L_0x02f8
        L_0x02ea:
            java.lang.Integer r7 = java.lang.Integer.valueOf(r6)
            r9.u(r7)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r9.w(r6, r5)
        L_0x02f8:
            nI.p r5 = r8.d()
            U0.F1.c(r9, r4, r5)
            s0.N r7 = s0.C5843N.f28726a
            java.lang.String r5 = r32.c()
            TC.b$b$b r6 = TC.C13679b.C2857b.C2858b.f116684a
            r11 = 2
            r12 = 0
            r9 = 1065353216(0x3f800000, float:1.0)
            r10 = 0
            r8 = r15
            androidx.compose.ui.d r7 = s0.C5842M.e(r7, r8, r9, r10, r11, r12)
            r29 = 0
            r30 = 262136(0x3fff8, float:3.67331E-40)
            r8 = 0
            r10 = 0
            r13 = 0
            r4 = 0
            r33 = r14
            r14 = r4
            r16 = 0
            r4 = r15
            r15 = r16
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r22 = 0
            r23 = 0
            r24 = 0
            r25 = 0
            r26 = 0
            r28 = 48
            r27 = r33
            SC.C13607l.j(r5, r6, r7, r8, r10, r12, r13, r14, r15, r17, r18, r19, r20, r22, r23, r24, r25, r26, r27, r28, r29, r30)
            int r5 = uK.C18146a.f148109K
            r13 = r33
            t1.c r5 = J1.e.c(r5, r13, r3)
            r3 = 24
            float r3 = (float) r3
            float r3 = c2.h.B(r3)
            androidx.compose.ui.d r7 = androidx.compose.foundation.layout.J.t(r4, r3)
            r11 = 432(0x1b0, float:6.05E-43)
            r12 = 8
            r6 = 0
            r10 = r13
            O0.V.a(r5, r6, r7, r8, r10, r11, r12)
            r13.x()
            r13.x()
            boolean r3 = U0.C4895p.J()
            if (r3 == 0) goto L_0x0368
            U0.C4895p.R()
        L_0x0368:
            r8 = r31
        L_0x036a:
            U0.Y0 r3 = r13.n()
            if (r3 == 0) goto L_0x0378
            HC.H r4 = new HC.H
            r4.<init>(r0, r8, r1, r2)
            r3.a(r4)
        L_0x0378:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: HC.K.e(lp.a, androidx.compose.ui.d, U0.m, int, int):void");
    }

    /* access modifiers changed from: private */
    public static final C16807N f(C11559a aVar, androidx.compose.ui.d dVar, int i10, int i11, C4889m mVar, int i12) {
        e(aVar, dVar, mVar, M0.a(i10 | 1), i11);
        return C16807N.f139792a;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v2, resolved type: nI.l} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r20v1, resolved type: nI.a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v11, resolved type: androidx.compose.ui.d$a} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:102:0x0301  */
    /* JADX WARNING: Removed duplicated region for block: B:104:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x008e  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0095  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void g(java.lang.String r29, KJ.C15987c<lp.C11559a> r30, nI.C17642l<? super java.lang.String, XH.C16807N> r31, androidx.compose.ui.d r32, U0.C4889m r33, int r34, int r35) {
        /*
            r0 = r29
            r15 = r30
            r14 = r31
            r13 = r34
            r1 = 4
            r2 = 6
            java.lang.String r3 = "stories"
            kotlin.jvm.internal.C17542s.j(r15, r3)
            java.lang.String r3 = "onStoryClicked"
            kotlin.jvm.internal.C17542s.j(r14, r3)
            r3 = 714309614(0x2a937fee, float:2.6201215E-13)
            r4 = r33
            U0.m r12 = r4.k(r3)
            r10 = 1
            r4 = r35 & 1
            r11 = 2
            if (r4 == 0) goto L_0x0026
            r4 = r13 | 6
            goto L_0x0036
        L_0x0026:
            r4 = r13 & 6
            if (r4 != 0) goto L_0x0035
            boolean r4 = r12.V(r0)
            if (r4 == 0) goto L_0x0032
            r4 = r1
            goto L_0x0033
        L_0x0032:
            r4 = r11
        L_0x0033:
            r4 = r4 | r13
            goto L_0x0036
        L_0x0035:
            r4 = r13
        L_0x0036:
            r5 = r35 & 2
            if (r5 == 0) goto L_0x003d
            r4 = r4 | 48
            goto L_0x004d
        L_0x003d:
            r5 = r13 & 48
            if (r5 != 0) goto L_0x004d
            boolean r5 = r12.F(r15)
            if (r5 == 0) goto L_0x004a
            r5 = 32
            goto L_0x004c
        L_0x004a:
            r5 = 16
        L_0x004c:
            r4 = r4 | r5
        L_0x004d:
            r1 = r35 & 4
            if (r1 == 0) goto L_0x0054
            r4 = r4 | 384(0x180, float:5.38E-43)
            goto L_0x0064
        L_0x0054:
            r1 = r13 & 384(0x180, float:5.38E-43)
            if (r1 != 0) goto L_0x0064
            boolean r1 = r12.F(r14)
            if (r1 == 0) goto L_0x0061
            r1 = 256(0x100, float:3.59E-43)
            goto L_0x0063
        L_0x0061:
            r1 = 128(0x80, float:1.794E-43)
        L_0x0063:
            r4 = r4 | r1
        L_0x0064:
            r1 = r35 & 8
            if (r1 == 0) goto L_0x006e
            r4 = r4 | 3072(0xc00, float:4.305E-42)
        L_0x006a:
            r5 = r32
        L_0x006c:
            r8 = r4
            goto L_0x0081
        L_0x006e:
            r5 = r13 & 3072(0xc00, float:4.305E-42)
            if (r5 != 0) goto L_0x006a
            r5 = r32
            boolean r6 = r12.V(r5)
            if (r6 == 0) goto L_0x007d
            r6 = 2048(0x800, float:2.87E-42)
            goto L_0x007f
        L_0x007d:
            r6 = 1024(0x400, float:1.435E-42)
        L_0x007f:
            r4 = r4 | r6
            goto L_0x006c
        L_0x0081:
            r4 = r8 & 1171(0x493, float:1.641E-42)
            r6 = 1170(0x492, float:1.64E-42)
            if (r4 != r6) goto L_0x0095
            boolean r4 = r12.l()
            if (r4 != 0) goto L_0x008e
            goto L_0x0095
        L_0x008e:
            r12.L()
            r4 = r5
            r0 = r12
            goto L_0x02fb
        L_0x0095:
            if (r1 == 0) goto L_0x009b
            androidx.compose.ui.d$a r1 = androidx.compose.ui.d.f18749a
            r7 = r1
            goto L_0x009c
        L_0x009b:
            r7 = r5
        L_0x009c:
            boolean r1 = U0.C4895p.J()
            if (r1 == 0) goto L_0x00a8
            r1 = -1
            java.lang.String r4 = "com.ingka.ikea.ui.commercial.StoryCarousel (StoryCarousel.kt:61)"
            U0.C4895p.S(r3, r8, r1, r4)
        L_0x00a8:
            androidx.compose.foundation.layout.d r5 = androidx.compose.foundation.layout.C5073d.f18068a
            androidx.compose.foundation.layout.d$m r1 = r5.g()
            i1.c$a r3 = i1.C5437c.f24302a
            i1.c$b r3 = r3.k()
            r6 = 0
            E1.I r1 = androidx.compose.foundation.layout.C5080k.a(r1, r3, r12, r6)
            int r3 = U0.C4883j.a(r12, r6)
            U0.y r4 = r12.s()
            androidx.compose.ui.d r6 = androidx.compose.ui.c.e(r12, r7)
            G1.g$a r16 = G1.C4504g.f6515W
            nI.a r9 = r16.a()
            U0.f r17 = r12.m()
            if (r17 != 0) goto L_0x00d4
            U0.C4883j.c()
        L_0x00d4:
            r12.I()
            boolean r17 = r12.i()
            if (r17 == 0) goto L_0x00e1
            r12.p(r9)
            goto L_0x00e4
        L_0x00e1:
            r12.t()
        L_0x00e4:
            U0.m r9 = U0.F1.a(r12)
            nI.p r10 = r16.c()
            U0.F1.c(r9, r1, r10)
            nI.p r1 = r16.e()
            U0.F1.c(r9, r4, r1)
            nI.p r1 = r16.b()
            boolean r4 = r9.i()
            if (r4 != 0) goto L_0x010e
            java.lang.Object r4 = r9.D()
            java.lang.Integer r10 = java.lang.Integer.valueOf(r3)
            boolean r4 = kotlin.jvm.internal.C17542s.e(r4, r10)
            if (r4 != 0) goto L_0x011c
        L_0x010e:
            java.lang.Integer r4 = java.lang.Integer.valueOf(r3)
            r9.u(r4)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r9.w(r3, r1)
        L_0x011c:
            nI.p r1 = r16.d()
            U0.F1.c(r9, r6, r1)
            s0.h r1 = s0.C5862h.f28810a
            r10 = 40
            r9 = 24
            if (r0 != 0) goto L_0x014b
            r1 = 2021802436(0x788241c4, float:2.113539E34)
            r12.W(r1)
            androidx.compose.ui.d$a r1 = androidx.compose.ui.d.f18749a
            float r3 = (float) r9
            float r3 = c2.h.B(r3)
            androidx.compose.ui.d r1 = androidx.compose.foundation.layout.J.i(r1, r3)
            s0.C5844O.a(r1, r12, r2)
            r12.P()
            r26 = r5
            r27 = r7
            r28 = r8
            r32 = r12
            goto L_0x01ab
        L_0x014b:
            r1 = 2021878510(0x78836aee, float:2.132374E34)
            r12.W(r1)
            TC.b$b$b r1 = TC.C13679b.C2857b.C2858b.f116684a
            androidx.compose.ui.d$a r2 = androidx.compose.ui.d.f18749a
            androidx.compose.ui.d r18 = TC.e.i(r2)
            float r2 = (float) r10
            float r20 = c2.h.B(r2)
            r23 = 13
            r24 = 0
            r19 = 0
            r21 = 0
            r22 = 0
            androidx.compose.ui.d r2 = androidx.compose.foundation.layout.D.m(r18, r19, r20, r21, r22, r23, r24)
            r3 = r8 & 14
            r23 = r3 | 48
            r24 = 0
            r25 = 262136(0x3fff8, float:3.67331E-40)
            r3 = 0
            r18 = 0
            r26 = r5
            r5 = r18
            r16 = 0
            r27 = r7
            r7 = r16
            r28 = r8
            r8 = r16
            r9 = r16
            r10 = r18
            r32 = r12
            r12 = r16
            r13 = r16
            r14 = r16
            r16 = 0
            r15 = r16
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r0 = r29
            r22 = r32
            SC.C13607l.j(r0, r1, r2, r3, r5, r7, r8, r9, r10, r12, r13, r14, r15, r17, r18, r19, r20, r21, r22, r23, r24, r25)
            r32.P()
        L_0x01ab:
            int r0 = r30.size()
            r1 = 0
            r2 = 0
            r3 = 1
            if (r0 != r3) goto L_0x0233
            r0 = 2022160982(0x7887ba56, float:2.2023107E34)
            r15 = r32
            r15.W(r0)
            java.lang.Object r0 = YH.C16877v.w0(r30)
            lp.a r0 = (lp.C11559a) r0
            androidx.compose.ui.d$a r4 = androidx.compose.ui.d.f18749a
            androidx.compose.ui.d r1 = androidx.compose.foundation.layout.J.h(r4, r1, r3, r2)
            androidx.compose.ui.d r4 = TC.e.i(r1)
            r5 = 24
            float r1 = (float) r5
            float r6 = c2.h.B(r1)
            r7 = 40
            float r1 = (float) r7
            float r8 = c2.h.B(r1)
            r9 = 5
            r10 = 0
            r5 = 0
            r7 = 0
            androidx.compose.ui.d r16 = androidx.compose.foundation.layout.D.m(r4, r5, r6, r7, r8, r9, r10)
            r1 = 757976997(0x2d2dcfa5, float:9.880018E-12)
            r15.W(r1)
            r4 = r28
            r1 = r4 & 896(0x380, float:1.256E-42)
            r6 = 256(0x100, float:3.59E-43)
            if (r1 != r6) goto L_0x01f2
            r10 = r3
            goto L_0x01f3
        L_0x01f2:
            r10 = 0
        L_0x01f3:
            boolean r1 = r15.F(r0)
            r1 = r1 | r10
            java.lang.Object r2 = r15.D()
            if (r1 != 0) goto L_0x020a
            U0.m$a r1 = U0.C4889m.f14007a
            java.lang.Object r1 = r1.a()
            if (r2 != r1) goto L_0x0207
            goto L_0x020a
        L_0x0207:
            r14 = r31
            goto L_0x0214
        L_0x020a:
            HC.E r2 = new HC.E
            r14 = r31
            r2.<init>(r14, r0)
            r15.u(r2)
        L_0x0214:
            r20 = r2
            nI.a r20 = (nI.C17631a) r20
            r15.P()
            r21 = 7
            r22 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            androidx.compose.ui.d r1 = androidx.compose.foundation.d.d(r16, r17, r18, r19, r20, r21, r22)
            r8 = 0
            e(r0, r1, r15, r8, r8)
            r15.P()
            r0 = r15
            goto L_0x02ed
        L_0x0233:
            r14 = r31
            r15 = r32
            r4 = r28
            r5 = 24
            r6 = 256(0x100, float:3.59E-43)
            r7 = 40
            r8 = 0
            r0 = 2022588782(0x788e416e, float:2.3082288E34)
            r15.W(r0)
            U0.I0 r0 = androidx.compose.ui.platform.C5100f0.e()
            java.lang.Object r0 = r15.Q(r0)
            c2.d r0 = (c2.d) r0
            r9 = 757982750(0x2d2de61e, float:9.885008E-12)
            r15.W(r9)
            java.lang.Object r9 = r15.D()
            U0.m$a r10 = U0.C4889m.f14007a
            java.lang.Object r11 = r10.a()
            if (r9 != r11) goto L_0x0274
            float r9 = (float) r8
            float r9 = c2.h.B(r9)
            c2.h r9 = c2.h.m(r9)
            r11 = 2
            U0.r0 r9 = U0.u1.e(r9, r2, r11, r2)
            r15.u(r9)
            goto L_0x0275
        L_0x0274:
            r11 = 2
        L_0x0275:
            U0.r0 r9 = (U0.C4899r0) r9
            r15.P()
            float r5 = (float) r5
            float r12 = c2.h.B(r5)
            s0.E r1 = androidx.compose.foundation.layout.D.c(r12, r1, r11, r2)
            float r2 = c2.h.B(r5)
            r11 = r26
            androidx.compose.foundation.layout.d$f r2 = r11.n(r2)
            androidx.compose.ui.d$a r16 = androidx.compose.ui.d.f18749a
            float r18 = c2.h.B(r5)
            float r5 = (float) r7
            float r20 = c2.h.B(r5)
            r21 = 5
            r22 = 0
            r17 = 0
            r19 = 0
            androidx.compose.ui.d r5 = androidx.compose.foundation.layout.D.m(r16, r17, r18, r19, r20, r21, r22)
            r7 = 757992579(0x2d2e0c83, float:9.893533E-12)
            r15.W(r7)
            r13 = r30
            boolean r7 = r15.F(r13)
            boolean r11 = r15.V(r0)
            r7 = r7 | r11
            r4 = r4 & 896(0x380, float:1.256E-42)
            if (r4 != r6) goto L_0x02ba
            goto L_0x02bb
        L_0x02ba:
            r3 = r8
        L_0x02bb:
            r3 = r3 | r7
            java.lang.Object r4 = r15.D()
            if (r3 != 0) goto L_0x02c8
            java.lang.Object r3 = r10.a()
            if (r4 != r3) goto L_0x02d0
        L_0x02c8:
            HC.F r4 = new HC.F
            r4.<init>(r13, r0, r14, r9)
            r15.u(r4)
        L_0x02d0:
            r12 = r4
            nI.l r12 = (nI.C17642l) r12
            r15.P()
            r0 = 24966(0x6186, float:3.4985E-41)
            r3 = 234(0xea, float:3.28E-43)
            r6 = 0
            r7 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r4 = r5
            r5 = r6
            r6 = r1
            r8 = r2
            r13 = r15
            r14 = r0
            r0 = r15
            r15 = r3
            t0.C5937b.b(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            r0.P()
        L_0x02ed:
            r0.x()
            boolean r1 = U0.C4895p.J()
            if (r1 == 0) goto L_0x02f9
            U0.C4895p.R()
        L_0x02f9:
            r4 = r27
        L_0x02fb:
            U0.Y0 r7 = r0.n()
            if (r7 == 0) goto L_0x0314
            HC.G r8 = new HC.G
            r0 = r8
            r1 = r29
            r2 = r30
            r3 = r31
            r5 = r34
            r6 = r35
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r7.a(r8)
        L_0x0314:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: HC.K.g(java.lang.String, KJ.c, nI.l, androidx.compose.ui.d, U0.m, int, int):void");
    }

    /* access modifiers changed from: private */
    public static final C16807N h(C17642l lVar, C11559a aVar) {
        lVar.invoke(aVar.b());
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final float i(C4899r0<h> r0Var) {
        return r0Var.getValue().G();
    }

    /* access modifiers changed from: private */
    public static final void j(C4899r0<h> r0Var, float f10) {
        r0Var.setValue(h.m(f10));
    }

    /* access modifiers changed from: private */
    public static final C16807N k(C15987c cVar, d dVar, C17642l lVar, C4899r0 r0Var, x xVar) {
        C17542s.j(xVar, "$this$LazyRow");
        x.a(xVar, cVar.size(), (C17642l) null, (C17642l) null, c.c(-932822924, true, new a(cVar, dVar, lVar, r0Var)), 6, (Object) null);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N l(String str, C15987c cVar, C17642l lVar, androidx.compose.ui.d dVar, int i10, int i11, C4889m mVar, int i12) {
        g(str, cVar, lVar, dVar, mVar, M0.a(i10 | 1), i11);
        return C16807N.f139792a;
    }
}
