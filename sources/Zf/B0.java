package zf;

import KJ.C15987c;
import U0.C4889m;
import U0.C4895p;
import U0.C4899r0;
import U0.M0;
import XH.C16807N;
import c1.c;
import com.ingka.ikea.app.browseandsearch.browseV2.b;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import nI.C17631a;
import nI.C17642l;
import nI.q;
import nI.r;
import t0.C5938c;
import t0.x;
import u0.C5968C;
import u0.C5972G;
import u0.C5979c;
import u0.C5991o;
import u0.C5993q;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\u001aC\u0010\n\u001a\u00020\u0005*\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00050\u0007H\u0000¢\u0006\u0004\b\n\u0010\u000b\u001a+\u0010\r\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u00022\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00050\u0007H\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u0011²\u0006\u000e\u0010\u0010\u001a\u00020\u000f8\n@\nX\u0002"}, d2 = {"Lu0/C;", "LKJ/c;", "Lcom/ingka/ikea/app/browseandsearch/browseV2/b$b;", "recentProducts", "Lkotlin/Function0;", "LXH/N;", "onClearAllClicked", "Lkotlin/Function1;", "", "onProductClicked", "h", "(Lu0/C;LKJ/c;LnI/a;LnI/l;)V", "product", "d", "(Lcom/ingka/ikea/app/browseandsearch/browseV2/b$b;LnI/l;LU0/m;I)V", "", "openDialog", "browse-implementation_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class B0 {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class a implements q<C5991o, C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C15987c<b.C1213b> f78126a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ C17642l<String, C16807N> f78127b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C17631a<C16807N> f78128c;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: zf.B0$a$a  reason: collision with other inner class name */
        static final class C1447a implements r<C5938c, Integer, C4889m, Integer, C16807N> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ C15987c<b.C1213b> f78129a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ C17642l<String, C16807N> f78130b;

            C1447a(C15987c<b.C1213b> cVar, C17642l<? super String, C16807N> lVar) {
                this.f78129a = cVar;
                this.f78130b = lVar;
            }

            public final void a(C5938c cVar, int i10, C4889m mVar, int i11) {
                C17542s.j(cVar, "$this$items");
                if ((i11 & 48) == 0) {
                    i11 |= mVar.d(i10) ? 32 : 16;
                }
                if ((i11 & 145) != 144 || !mVar.l()) {
                    if (C4895p.J()) {
                        C4895p.S(1499573053, i11, -1, "com.ingka.ikea.app.browseandsearch.browseV2.compose.recentlyViewedProducts.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (RecentlyViewedComposables.kt:130)");
                    }
                    B0.d(this.f78129a.get(i10), this.f78130b, mVar, 0);
                    if (C4895p.J()) {
                        C4895p.R();
                        return;
                    }
                    return;
                }
                mVar.L();
            }

            public /* bridge */ /* synthetic */ Object l(Object obj, Object obj2, Object obj3, Object obj4) {
                a((C5938c) obj, ((Number) obj2).intValue(), (C4889m) obj3, ((Number) obj4).intValue());
                return C16807N.f139792a;
            }
        }

        a(C15987c<b.C1213b> cVar, C17642l<? super String, C16807N> lVar, C17631a<C16807N> aVar) {
            this.f78126a = cVar;
            this.f78127b = lVar;
            this.f78128c = aVar;
        }

        private static final boolean j(C4899r0<Boolean> r0Var) {
            return r0Var.getValue().booleanValue();
        }

        /* access modifiers changed from: private */
        public static final C16807N k(C4899r0 r0Var) {
            m(r0Var, false);
            return C16807N.f139792a;
        }

        private static final void m(C4899r0<Boolean> r0Var, boolean z10) {
            r0Var.setValue(Boolean.valueOf(z10));
        }

        /* access modifiers changed from: private */
        public static final C16807N n(C4899r0 r0Var) {
            m(r0Var, true);
            return C16807N.f139792a;
        }

        /* access modifiers changed from: private */
        public static final C16807N p(C17631a aVar, C4899r0 r0Var) {
            m(r0Var, false);
            aVar.invoke();
            return C16807N.f139792a;
        }

        /* access modifiers changed from: private */
        public static final C16807N q(C4899r0 r0Var) {
            m(r0Var, false);
            return C16807N.f139792a;
        }

        /* access modifiers changed from: private */
        public static final C16807N s(C15987c cVar, C17642l lVar, x xVar) {
            C17542s.j(xVar, "$this$LazyRow");
            x.a(xVar, cVar.size(), new A0(cVar), (C17642l) null, c.c(1499573053, true, new C1447a(cVar, lVar)), 4, (Object) null);
            return C16807N.f139792a;
        }

        /* access modifiers changed from: private */
        public static final Object t(C15987c cVar, int i10) {
            return ((b.C1213b) cVar.get(i10)).b();
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v3, resolved type: nI.l} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void i(u0.C5991o r38, U0.C4889m r39, int r40) {
            /*
                r37 = this;
                r0 = r37
                r15 = r39
                r1 = r40
                java.lang.String r2 = "$this$item"
                r3 = r38
                kotlin.jvm.internal.C17542s.j(r3, r2)
                r2 = r1 & 17
                r14 = 16
                if (r2 != r14) goto L_0x001f
                boolean r2 = r39.l()
                if (r2 != 0) goto L_0x001a
                goto L_0x001f
            L_0x001a:
                r39.L()
                goto L_0x0353
            L_0x001f:
                boolean r2 = U0.C4895p.J()
                if (r2 == 0) goto L_0x002e
                r2 = -1
                java.lang.String r3 = "com.ingka.ikea.app.browseandsearch.browseV2.compose.recentlyViewedProducts.<anonymous> (RecentlyViewedComposables.kt:65)"
                r4 = -840243886(0xffffffffcdeae552, float:-4.9261216E8)
                U0.C4895p.S(r4, r1, r2, r3)
            L_0x002e:
                KJ.c<com.ingka.ikea.app.browseandsearch.browseV2.b$b> r13 = r0.f78126a
                nI.l<java.lang.String, XH.N> r11 = r0.f78127b
                nI.a<XH.N> r12 = r0.f78128c
                androidx.compose.ui.d$a r10 = androidx.compose.ui.d.f18749a
                androidx.compose.foundation.layout.d r9 = androidx.compose.foundation.layout.C5073d.f18068a
                androidx.compose.foundation.layout.d$m r1 = r9.g()
                i1.c$a r2 = i1.C5437c.f24302a
                i1.c$b r3 = r2.k()
                r8 = 0
                E1.I r1 = androidx.compose.foundation.layout.C5080k.a(r1, r3, r15, r8)
                int r3 = U0.C4883j.a(r15, r8)
                U0.y r4 = r39.s()
                androidx.compose.ui.d r5 = androidx.compose.ui.c.e(r15, r10)
                G1.g$a r6 = G1.C4504g.f6515W
                nI.a r7 = r6.a()
                U0.f r16 = r39.m()
                if (r16 != 0) goto L_0x0062
                U0.C4883j.c()
            L_0x0062:
                r39.I()
                boolean r16 = r39.i()
                if (r16 == 0) goto L_0x006f
                r15.p(r7)
                goto L_0x0072
            L_0x006f:
                r39.t()
            L_0x0072:
                U0.m r7 = U0.F1.a(r39)
                nI.p r14 = r6.c()
                U0.F1.c(r7, r1, r14)
                nI.p r1 = r6.e()
                U0.F1.c(r7, r4, r1)
                nI.p r1 = r6.b()
                boolean r4 = r7.i()
                if (r4 != 0) goto L_0x009c
                java.lang.Object r4 = r7.D()
                java.lang.Integer r14 = java.lang.Integer.valueOf(r3)
                boolean r4 = kotlin.jvm.internal.C17542s.e(r4, r14)
                if (r4 != 0) goto L_0x00aa
            L_0x009c:
                java.lang.Integer r4 = java.lang.Integer.valueOf(r3)
                r7.u(r4)
                java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
                r7.w(r3, r1)
            L_0x00aa:
                nI.p r1 = r6.d()
                U0.F1.c(r7, r5, r1)
                s0.h r1 = s0.C5862h.f28810a
                androidx.compose.ui.d r1 = TC.e.i(r10)
                r3 = 24
                float r3 = (float) r3
                float r3 = c2.h.B(r3)
                r4 = 1
                r14 = 0
                r7 = 0
                androidx.compose.ui.d r1 = androidx.compose.foundation.layout.D.k(r1, r14, r3, r4, r7)
                r3 = 8
                float r5 = (float) r3
                float r3 = c2.h.B(r5)
                androidx.compose.foundation.layout.d$f r3 = r9.n(r3)
                i1.c$c r2 = r2.l()
                r4 = 6
                E1.I r2 = androidx.compose.foundation.layout.G.b(r3, r2, r15, r4)
                int r3 = U0.C4883j.a(r15, r8)
                U0.y r4 = r39.s()
                androidx.compose.ui.d r1 = androidx.compose.ui.c.e(r15, r1)
                nI.a r7 = r6.a()
                U0.f r17 = r39.m()
                if (r17 != 0) goto L_0x00f2
                U0.C4883j.c()
            L_0x00f2:
                r39.I()
                boolean r17 = r39.i()
                if (r17 == 0) goto L_0x00ff
                r15.p(r7)
                goto L_0x0102
            L_0x00ff:
                r39.t()
            L_0x0102:
                U0.m r7 = U0.F1.a(r39)
                nI.p r14 = r6.c()
                U0.F1.c(r7, r2, r14)
                nI.p r2 = r6.e()
                U0.F1.c(r7, r4, r2)
                nI.p r2 = r6.b()
                boolean r4 = r7.i()
                if (r4 != 0) goto L_0x012c
                java.lang.Object r4 = r7.D()
                java.lang.Integer r14 = java.lang.Integer.valueOf(r3)
                boolean r4 = kotlin.jvm.internal.C17542s.e(r4, r14)
                if (r4 != 0) goto L_0x013a
            L_0x012c:
                java.lang.Integer r4 = java.lang.Integer.valueOf(r3)
                r7.u(r4)
                java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
                r7.w(r3, r2)
            L_0x013a:
                nI.p r2 = r6.d()
                U0.F1.c(r7, r1, r2)
                s0.N r27 = s0.C5843N.f28726a
                int r1 = Oo.b.f84618d7
                java.lang.String r1 = J1.j.b(r1, r15, r8)
                TC.b$b$f r2 = TC.C13679b.C2857b.f.f116688a
                r7 = 2
                r14 = 0
                r6 = 1077936128(0x40400000, float:3.0)
                r18 = 0
                r3 = r27
                r28 = 6
                r4 = r10
                r29 = r5
                r5 = r6
                r6 = r18
                r8 = r14
                androidx.compose.ui.d r3 = s0.C5842M.e(r3, r4, r5, r6, r7, r8)
                r25 = 0
                r26 = 262136(0x3fff8, float:3.67331E-40)
                r4 = 0
                r6 = 0
                r8 = 0
                r31 = r9
                r9 = r14
                r32 = r10
                r10 = r14
                r18 = 0
                r14 = r11
                r33 = r12
                r11 = r18
                r16 = 0
                r34 = r13
                r13 = r16
                r35 = r14
                r14 = r16
                r15 = r16
                r16 = 0
                r18 = 0
                r19 = 0
                r20 = 0
                r21 = 0
                r22 = 0
                r24 = 48
                r23 = r39
                SC.C13607l.j(r1, r2, r3, r4, r6, r8, r9, r10, r11, r13, r14, r15, r16, r18, r19, r20, r21, r22, r23, r24, r25, r26)
                r1 = 1183007296(0x46834240, float:16801.125)
                r15 = r39
                r15.W(r1)
                java.lang.Object r1 = r39.D()
                U0.m$a r36 = U0.C4889m.f14007a
                java.lang.Object r2 = r36.a()
                r13 = 2
                if (r1 != r2) goto L_0x01b6
                java.lang.Boolean r1 = java.lang.Boolean.FALSE
                r11 = 0
                U0.r0 r1 = U0.u1.e(r1, r11, r13, r11)
                r15.u(r1)
                goto L_0x01b7
            L_0x01b6:
                r11 = 0
            L_0x01b7:
                r12 = r1
                U0.r0 r12 = (U0.C4899r0) r12
                r39.P()
                int r1 = wf.C10366b.f77648i
                r10 = 0
                java.lang.String r23 = J1.j.b(r1, r15, r10)
                TC.b$a$b r30 = TC.C13679b.a.C2856b.f116680a
                r5 = 2
                r6 = 0
                r3 = 1065353216(0x3f800000, float:1.0)
                r4 = 0
                r1 = r27
                r2 = r32
                androidx.compose.ui.d r16 = s0.C5842M.e(r1, r2, r3, r4, r5, r6)
                r1 = 1183016519(0x46836647, float:16819.139)
                r15.W(r1)
                java.lang.Object r1 = r39.D()
                java.lang.Object r2 = r36.a()
                if (r1 != r2) goto L_0x01eb
                zf.v0 r1 = new zf.v0
                r1.<init>(r12)
                r15.u(r1)
            L_0x01eb:
                r20 = r1
                nI.a r20 = (nI.C17631a) r20
                r39.P()
                r21 = 7
                r22 = 0
                r17 = 0
                r18 = 0
                r19 = 0
                androidx.compose.ui.d r3 = androidx.compose.foundation.d.d(r16, r17, r18, r19, r20, r21, r22)
                Y1.j$a r1 = Y1.j.f14783b
                int r1 = r1.b()
                Y1.j r14 = Y1.j.h(r1)
                r25 = 0
                r26 = 261112(0x3fbf8, float:3.65896E-40)
                r4 = 0
                r6 = 0
                r8 = 0
                r9 = 0
                r1 = 0
                r2 = r10
                r10 = r1
                r16 = 0
                r1 = r11
                r38 = r12
                r11 = r16
                r16 = 0
                r13 = r16
                r15 = r16
                r16 = 0
                r18 = 0
                r19 = 0
                r20 = 0
                r21 = 0
                r24 = 48
                r1 = r23
                r2 = r30
                r23 = r39
                SC.C13607l.j(r1, r2, r3, r4, r6, r8, r9, r10, r11, r13, r14, r15, r16, r18, r19, r20, r21, r22, r23, r24, r25, r26)
                r1 = 1183022740(0x46837e94, float:16831.29)
                r13 = r39
                r13.W(r1)
                boolean r1 = j(r38)
                if (r1 == 0) goto L_0x02ed
                int r1 = wf.C10366b.f77650k
                r2 = 0
                java.lang.String r1 = J1.j.b(r1, r13, r2)
                int r3 = Oo.b.f84616d5
                java.lang.String r3 = J1.j.b(r3, r13, r2)
                r4 = 1183031460(0x4683a0a4, float:16848.32)
                r13.W(r4)
                r4 = r33
                boolean r5 = r13.V(r4)
                java.lang.Object r6 = r39.D()
                if (r5 != 0) goto L_0x0271
                java.lang.Object r5 = r36.a()
                if (r6 != r5) goto L_0x026e
                goto L_0x0271
            L_0x026e:
                r5 = r38
                goto L_0x027b
            L_0x0271:
                zf.w0 r6 = new zf.w0
                r5 = r38
                r6.<init>(r4, r5)
                r13.u(r6)
            L_0x027b:
                nI.a r6 = (nI.C17631a) r6
                r39.P()
                SC.W1 r4 = new SC.W1
                r4.<init>(r3, r6)
                int r3 = Oo.b.f84518U0
                java.lang.String r2 = J1.j.b(r3, r13, r2)
                r3 = 1183041840(0x4683c930, float:16868.594)
                r13.W(r3)
                java.lang.Object r3 = r39.D()
                java.lang.Object r6 = r36.a()
                if (r3 != r6) goto L_0x02a3
                zf.x0 r3 = new zf.x0
                r3.<init>(r5)
                r13.u(r3)
            L_0x02a3:
                nI.a r3 = (nI.C17631a) r3
                r39.P()
                SC.W1 r6 = new SC.W1
                r6.<init>(r2, r3)
                r2 = 1183058504(0x46840a48, float:16901.14)
                r13.W(r2)
                java.lang.Object r2 = r39.D()
                java.lang.Object r3 = r36.a()
                if (r2 != r3) goto L_0x02c5
                zf.y0 r2 = new zf.y0
                r2.<init>(r5)
                r13.u(r2)
            L_0x02c5:
                r5 = r2
                nI.a r5 = (nI.C17631a) r5
                r39.P()
                zf.Y r2 = zf.Y.f78234a
                nI.p r8 = r2.a()
                int r2 = SC.W1.f116045c
                int r3 = r2 << 3
                r7 = 12585984(0xc00c00, float:1.763672E-38)
                r3 = r3 | r7
                int r2 = r2 << 6
                r10 = r3 | r2
                r11 = 112(0x70, float:1.57E-43)
                r7 = 0
                r9 = 0
                r12 = 0
                r2 = r4
                r3 = r6
                r4 = r5
                r5 = r7
                r6 = r9
                r7 = r12
                r9 = r39
                SC.Z1.c(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            L_0x02ed:
                r39.P()
                r39.x()
                float r1 = c2.h.B(r29)
                r2 = r31
                androidx.compose.foundation.layout.d$f r5 = r2.n(r1)
                r1 = 16
                float r1 = (float) r1
                float r1 = c2.h.B(r1)
                r2 = 0
                r3 = 0
                r4 = 2
                s0.E r3 = androidx.compose.foundation.layout.D.c(r1, r2, r4, r3)
                r1 = -1640639047(0xffffffff9e35d5b9, float:-9.626257E-21)
                r13.W(r1)
                r1 = r34
                boolean r2 = r13.V(r1)
                r4 = r35
                boolean r6 = r13.V(r4)
                r2 = r2 | r6
                java.lang.Object r6 = r39.D()
                if (r2 != 0) goto L_0x032a
                java.lang.Object r2 = r36.a()
                if (r6 != r2) goto L_0x0332
            L_0x032a:
                zf.z0 r6 = new zf.z0
                r6.<init>(r1, r4)
                r13.u(r6)
            L_0x0332:
                r9 = r6
                nI.l r9 = (nI.C17642l) r9
                r39.P()
                r11 = 24960(0x6180, float:3.4976E-41)
                r12 = 235(0xeb, float:3.3E-43)
                r1 = 0
                r2 = 0
                r4 = 0
                r6 = 0
                r7 = 0
                r8 = 0
                r10 = r39
                t0.C5937b.b(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
                r39.x()
                boolean r1 = U0.C4895p.J()
                if (r1 == 0) goto L_0x0353
                U0.C4895p.R()
            L_0x0353:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: zf.B0.a.i(u0.o, U0.m, int):void");
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            i((C5991o) obj, (C4889m) obj2, ((Number) obj3).intValue());
            return C16807N.f139792a;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r28v0, resolved type: nI.a} */
    /* access modifiers changed from: private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void d(com.ingka.ikea.app.browseandsearch.browseV2.b.C1213b r31, nI.C17642l<? super java.lang.String, XH.C16807N> r32, U0.C4889m r33, int r34) {
        /*
            r0 = r31
            r1 = r32
            r2 = r34
            r3 = 1209624001(0x481965c1, float:157079.02)
            r4 = r33
            U0.m r15 = r4.k(r3)
            r4 = r2 & 6
            r5 = 4
            if (r4 != 0) goto L_0x001f
            boolean r4 = r15.V(r0)
            if (r4 == 0) goto L_0x001c
            r4 = r5
            goto L_0x001d
        L_0x001c:
            r4 = 2
        L_0x001d:
            r4 = r4 | r2
            goto L_0x0020
        L_0x001f:
            r4 = r2
        L_0x0020:
            r6 = r2 & 48
            r7 = 32
            if (r6 != 0) goto L_0x0031
            boolean r6 = r15.F(r1)
            if (r6 == 0) goto L_0x002e
            r6 = r7
            goto L_0x0030
        L_0x002e:
            r6 = 16
        L_0x0030:
            r4 = r4 | r6
        L_0x0031:
            r6 = r4 & 19
            r8 = 18
            if (r6 != r8) goto L_0x0044
            boolean r6 = r15.l()
            if (r6 != 0) goto L_0x003e
            goto L_0x0044
        L_0x003e:
            r15.L()
            r3 = r15
            goto L_0x0214
        L_0x0044:
            boolean r6 = U0.C4895p.J()
            if (r6 == 0) goto L_0x0050
            r6 = -1
            java.lang.String r8 = "com.ingka.ikea.app.browseandsearch.browseV2.compose.RecentProduct (RecentlyViewedComposables.kt:144)"
            U0.C4895p.S(r3, r4, r6, r8)
        L_0x0050:
            androidx.compose.ui.d$a r3 = androidx.compose.ui.d.f18749a
            r6 = 72
            float r6 = (float) r6
            float r6 = c2.h.B(r6)
            androidx.compose.ui.d r6 = androidx.compose.foundation.layout.J.t(r3, r6)
            r8 = 1
            float r9 = (float) r8
            float r9 = c2.h.B(r9)
            tK.v r10 = tK.C18030v.f147664a
            int r11 = tK.C18030v.f147665b
            tK.h r12 = r10.a(r15, r11)
            long r12 = r12.g0()
            A0.f r14 = A0.g.h()
            androidx.compose.ui.d r6 = n0.C5599e.g(r6, r9, r12, r14)
            A0.f r9 = A0.g.h()
            androidx.compose.ui.d r16 = m1.e.a(r6, r9)
            tK.h r6 = r10.a(r15, r11)
            long r17 = r6.F0()
            r20 = 2
            r21 = 0
            r19 = 0
            androidx.compose.ui.d r22 = androidx.compose.foundation.b.d(r16, r17, r19, r20, r21)
            r6 = -519717526(0xffffffffe105bd6a, float:-1.541916E20)
            r15.W(r6)
            java.lang.Object r6 = r15.D()
            U0.m$a r9 = U0.C4889m.f14007a
            java.lang.Object r12 = r9.a()
            if (r6 != r12) goto L_0x00aa
            r0.m r6 = r0.l.a()
            r15.u(r6)
        L_0x00aa:
            r23 = r6
            r0.m r23 = (r0.m) r23
            r15.P()
            tK.h r6 = r10.a(r15, r11)
            long r18 = r6.x0()
            r20 = 3
            r21 = 0
            r16 = 0
            r17 = 0
            n0.I r24 = O0.C4756u0.c(r16, r17, r18, r20, r21)
            r6 = -519719897(0xffffffffe105b427, float:-1.541499E20)
            r15.W(r6)
            r6 = r4 & 112(0x70, float:1.57E-43)
            r10 = 0
            if (r6 != r7) goto L_0x00d2
            r6 = r8
            goto L_0x00d3
        L_0x00d2:
            r6 = r10
        L_0x00d3:
            r4 = r4 & 14
            if (r4 != r5) goto L_0x00d9
            r4 = r8
            goto L_0x00da
        L_0x00d9:
            r4 = r10
        L_0x00da:
            r4 = r4 | r6
            java.lang.Object r5 = r15.D()
            if (r4 != 0) goto L_0x00e7
            java.lang.Object r4 = r9.a()
            if (r5 != r4) goto L_0x00ef
        L_0x00e7:
            zf.t0 r5 = new zf.t0
            r5.<init>(r1, r0)
            r15.u(r5)
        L_0x00ef:
            r28 = r5
            nI.a r28 = (nI.C17631a) r28
            r15.P()
            r29 = 28
            r30 = 0
            r25 = 0
            r26 = 0
            r27 = 0
            androidx.compose.ui.d r4 = androidx.compose.foundation.d.b(r22, r23, r24, r25, r26, r27, r28, r29, r30)
            java.lang.String r5 = "RECENT_PRODUCT"
            androidx.compose.ui.d r4 = androidx.compose.ui.platform.C5116k1.a(r4, r5)
            i1.c$a r5 = i1.C5437c.f24302a
            i1.c r6 = r5.o()
            E1.I r6 = androidx.compose.foundation.layout.C5077h.h(r6, r10)
            int r7 = U0.C4883j.a(r15, r10)
            U0.y r9 = r15.s()
            androidx.compose.ui.d r4 = androidx.compose.ui.c.e(r15, r4)
            G1.g$a r11 = G1.C4504g.f6515W
            nI.a r12 = r11.a()
            U0.f r13 = r15.m()
            if (r13 != 0) goto L_0x012f
            U0.C4883j.c()
        L_0x012f:
            r15.I()
            boolean r13 = r15.i()
            if (r13 == 0) goto L_0x013c
            r15.p(r12)
            goto L_0x013f
        L_0x013c:
            r15.t()
        L_0x013f:
            U0.m r12 = U0.F1.a(r15)
            nI.p r13 = r11.c()
            U0.F1.c(r12, r6, r13)
            nI.p r6 = r11.e()
            U0.F1.c(r12, r9, r6)
            nI.p r6 = r11.b()
            boolean r9 = r12.i()
            if (r9 != 0) goto L_0x0169
            java.lang.Object r9 = r12.D()
            java.lang.Integer r13 = java.lang.Integer.valueOf(r7)
            boolean r9 = kotlin.jvm.internal.C17542s.e(r9, r13)
            if (r9 != 0) goto L_0x0177
        L_0x0169:
            java.lang.Integer r9 = java.lang.Integer.valueOf(r7)
            r12.u(r9)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r12.w(r7, r6)
        L_0x0177:
            nI.p r6 = r11.d()
            U0.F1.c(r12, r4, r6)
            androidx.compose.foundation.layout.j r4 = androidx.compose.foundation.layout.C5079j.f18125a
            java.lang.String r6 = r31.c()
            int r6 = r6.length()
            if (r6 != 0) goto L_0x019a
            r6 = 943467952(0x383c2db0, float:4.4865243E-5)
            r15.W(r6)
            int r6 = Oo.b.f84337C
            java.lang.String r6 = J1.j.b(r6, r15, r10)
            r15.P()
            goto L_0x01c9
        L_0x019a:
            r6 = 943558255(0x383d8e6f, float:4.5193763E-5)
            r15.W(r6)
            int r6 = Oo.b.f84347D
            java.lang.String r6 = J1.j.b(r6, r15, r10)
            java.lang.String r7 = r31.c()
            java.util.Locale r9 = java.util.Locale.ROOT
            java.lang.String r7 = r7.toLowerCase(r9)
            java.lang.String r9 = "toLowerCase(...)"
            kotlin.jvm.internal.C17542s.i(r7, r9)
            java.lang.Object[] r7 = new java.lang.Object[]{r7}
            java.lang.Object[] r7 = java.util.Arrays.copyOf(r7, r8)
            java.lang.String r6 = java.lang.String.format(r6, r7)
            java.lang.String r7 = "format(...)"
            kotlin.jvm.internal.C17542s.i(r6, r7)
            r15.P()
        L_0x01c9:
            java.lang.String r7 = r31.a()
            LC.b$a r8 = LC.C13178b.a.f111818a
            r9 = 40
            float r9 = (float) r9
            float r9 = c2.h.B(r9)
            androidx.compose.ui.d r3 = androidx.compose.foundation.layout.J.t(r3, r9)
            i1.c r5 = r5.e()
            androidx.compose.ui.d r3 = r4.a(r3, r5)
            int r4 = LC.C13178b.a.f111819b
            int r17 = r4 << 9
            r18 = 0
            r19 = 4080(0xff0, float:5.717E-42)
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r16 = 0
            r20 = 0
            r4 = r7
            r5 = r6
            r6 = r3
            r7 = r8
            r8 = r9
            r9 = r10
            r10 = r11
            r11 = r12
            r12 = r13
            r13 = r14
            r14 = r16
            r3 = r15
            r15 = r20
            r16 = r3
            LC.h.c(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            r3.x()
            boolean r4 = U0.C4895p.J()
            if (r4 == 0) goto L_0x0214
            U0.C4895p.R()
        L_0x0214:
            U0.Y0 r3 = r3.n()
            if (r3 == 0) goto L_0x0222
            zf.u0 r4 = new zf.u0
            r4.<init>(r0, r1, r2)
            r3.a(r4)
        L_0x0222:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: zf.B0.d(com.ingka.ikea.app.browseandsearch.browseV2.b$b, nI.l, U0.m, int):void");
    }

    /* access modifiers changed from: private */
    public static final C16807N e(C17642l lVar, b.C1213b bVar) {
        lVar.invoke(bVar.b());
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N f(b.C1213b bVar, C17642l lVar, int i10, C4889m mVar, int i11) {
        d(bVar, lVar, mVar, M0.a(i10 | 1));
        return C16807N.f139792a;
    }

    public static final void h(C5968C c10, C15987c<b.C1213b> cVar, C17631a<C16807N> aVar, C17642l<? super String, C16807N> lVar) {
        C17542s.j(c10, "<this>");
        C17542s.j(cVar, "recentProducts");
        C17542s.j(aVar, "onClearAllClicked");
        C17542s.j(lVar, "onProductClicked");
        c10.d("RecentlyViewed", new s0(), "RecentlyViewed", c.c(-840243886, true, new a(cVar, lVar, aVar)));
    }

    /* access modifiers changed from: private */
    public static final C5979c i(C5993q qVar) {
        C17542s.j(qVar, "$this$item");
        return C5979c.a(C5972G.a(qVar.a()));
    }
}
