package zf;

import U0.C4889m;
import U0.C4895p;
import U0.M0;
import XH.C16807N;
import c1.c;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import nI.C17631a;
import nI.q;
import u0.C5968C;
import u0.C5972G;
import u0.C5979c;
import u0.C5991o;
import u0.C5993q;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a/\u0010\u0005\u001a\u00020\u0002*\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a+\u0010\u0007\u001a\u00020\u00022\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\u0003¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lu0/C;", "Lkotlin/Function0;", "LXH/N;", "onSignupClicked", "onLoginClicked", "j", "(Lu0/C;LnI/a;LnI/a;)V", "e", "(LnI/a;LnI/a;LU0/m;I)V", "browse-implementation_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class r0 {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class a implements q<C5991o, C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C17631a<C16807N> f78333a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ C17631a<C16807N> f78334b;

        a(C17631a<C16807N> aVar, C17631a<C16807N> aVar2) {
            this.f78333a = aVar;
            this.f78334b = aVar2;
        }

        public final void a(C5991o oVar, C4889m mVar, int i10) {
            C17542s.j(oVar, "$this$item");
            if ((i10 & 17) != 16 || !mVar.l()) {
                if (C4895p.J()) {
                    C4895p.S(-1871155285, i10, -1, "com.ingka.ikea.app.browseandsearch.browseV2.compose.loginPromotion.<anonymous> (LoginPromotionComposables.kt:39)");
                }
                r0.e(this.f78333a, this.f78334b, mVar, 0);
                if (C4895p.J()) {
                    C4895p.R();
                    return;
                }
                return;
            }
            mVar.L();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            a((C5991o) obj, (C4889m) obj2, ((Number) obj3).intValue());
            return C16807N.f139792a;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v4, resolved type: nI.a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v6, resolved type: nI.a} */
    /* access modifiers changed from: private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void e(nI.C17631a<XH.C16807N> r38, nI.C17631a<XH.C16807N> r39, U0.C4889m r40, int r41) {
        /*
            r0 = r38
            r1 = r39
            r2 = r41
            r3 = 411691754(0x1889eaea, float:3.5650873E-24)
            r4 = r40
            U0.m r14 = r4.k(r3)
            r15 = 6
            r4 = r2 & 6
            if (r4 != 0) goto L_0x001f
            boolean r4 = r14.F(r0)
            if (r4 == 0) goto L_0x001c
            r4 = 4
            goto L_0x001d
        L_0x001c:
            r4 = 2
        L_0x001d:
            r4 = r4 | r2
            goto L_0x0020
        L_0x001f:
            r4 = r2
        L_0x0020:
            r5 = r2 & 48
            if (r5 != 0) goto L_0x0030
            boolean r5 = r14.F(r1)
            if (r5 == 0) goto L_0x002d
            r5 = 32
            goto L_0x002f
        L_0x002d:
            r5 = 16
        L_0x002f:
            r4 = r4 | r5
        L_0x0030:
            r9 = r4
            r4 = r9 & 19
            r5 = 18
            if (r4 != r5) goto L_0x0044
            boolean r4 = r14.l()
            if (r4 != 0) goto L_0x003e
            goto L_0x0044
        L_0x003e:
            r14.L()
            r3 = r14
            goto L_0x02e6
        L_0x0044:
            boolean r4 = U0.C4895p.J()
            if (r4 == 0) goto L_0x0050
            r4 = -1
            java.lang.String r5 = "com.ingka.ikea.app.browseandsearch.browseV2.compose.Promo (LoginPromotionComposables.kt:50)"
            U0.C4895p.S(r3, r9, r4, r5)
        L_0x0050:
            androidx.compose.ui.d$a r3 = androidx.compose.ui.d.f18749a
            tK.v r10 = tK.C18030v.f147664a
            int r7 = tK.C18030v.f147665b
            tK.h r4 = r10.a(r14, r7)
            long r17 = r4.l0()
            r20 = 2
            r21 = 0
            r19 = 0
            r16 = r3
            androidx.compose.ui.d r4 = androidx.compose.foundation.b.d(r16, r17, r19, r20, r21)
            r5 = 40
            float r5 = (float) r5
            float r5 = c2.h.B(r5)
            r6 = 0
            r8 = 0
            r15 = 1
            androidx.compose.ui.d r4 = androidx.compose.foundation.layout.D.k(r4, r8, r5, r15, r6)
            androidx.compose.foundation.layout.d r8 = androidx.compose.foundation.layout.C5073d.f18068a
            androidx.compose.foundation.layout.d$m r5 = r8.g()
            i1.c$a r30 = i1.C5437c.f24302a
            i1.c$b r6 = r30.k()
            r15 = 0
            E1.I r5 = androidx.compose.foundation.layout.C5080k.a(r5, r6, r14, r15)
            int r6 = U0.C4883j.a(r14, r15)
            U0.y r11 = r14.s()
            androidx.compose.ui.d r4 = androidx.compose.ui.c.e(r14, r4)
            G1.g$a r31 = G1.C4504g.f6515W
            nI.a r12 = r31.a()
            U0.f r19 = r14.m()
            if (r19 != 0) goto L_0x00a4
            U0.C4883j.c()
        L_0x00a4:
            r14.I()
            boolean r19 = r14.i()
            if (r19 == 0) goto L_0x00b1
            r14.p(r12)
            goto L_0x00b4
        L_0x00b1:
            r14.t()
        L_0x00b4:
            U0.m r12 = U0.F1.a(r14)
            nI.p r13 = r31.c()
            U0.F1.c(r12, r5, r13)
            nI.p r5 = r31.e()
            U0.F1.c(r12, r11, r5)
            nI.p r5 = r31.b()
            boolean r11 = r12.i()
            if (r11 != 0) goto L_0x00de
            java.lang.Object r11 = r12.D()
            java.lang.Integer r13 = java.lang.Integer.valueOf(r6)
            boolean r11 = kotlin.jvm.internal.C17542s.e(r11, r13)
            if (r11 != 0) goto L_0x00ec
        L_0x00de:
            java.lang.Integer r11 = java.lang.Integer.valueOf(r6)
            r12.u(r11)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r12.w(r6, r5)
        L_0x00ec:
            nI.p r5 = r31.d()
            U0.F1.c(r12, r4, r5)
            s0.h r4 = s0.C5862h.f28810a
            int r4 = wf.C10366b.f77643d
            java.lang.String r4 = J1.j.b(r4, r14, r15)
            TC.b$b$a r5 = TC.C13679b.C2857b.a.f116683a
            androidx.compose.ui.d r6 = TC.e.i(r3)
            r28 = 0
            r29 = 262136(0x3fff8, float:3.67331E-40)
            r11 = 0
            r13 = r7
            r32 = r8
            r7 = r11
            r33 = r9
            r34 = r10
            r9 = r11
            r11 = 0
            r12 = 32
            r17 = 0
            r12 = r17
            r35 = r13
            r13 = r17
            r17 = 0
            r40 = r14
            r36 = 1
            r14 = r17
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r24 = 0
            r25 = 0
            r27 = 48
            r26 = r40
            SC.C13607l.j(r4, r5, r6, r7, r9, r11, r12, r13, r14, r16, r17, r18, r19, r21, r22, r23, r24, r25, r26, r27, r28, r29)
            int r4 = wf.C10366b.f77644e
            r14 = r40
            r15 = 0
            java.lang.String r4 = J1.j.b(r4, r14, r15)
            TC.b$a$b r5 = TC.C13679b.a.C2856b.f116680a
            r6 = r34
            r7 = r35
            tK.h r6 = r6.a(r14, r7)
            long r7 = r6.H0()
            androidx.compose.ui.d r16 = TC.e.i(r3)
            r6 = 12
            float r6 = (float) r6
            float r18 = c2.h.B(r6)
            r21 = 13
            r22 = 0
            r17 = 0
            r19 = 0
            r20 = 0
            androidx.compose.ui.d r6 = androidx.compose.foundation.layout.D.m(r16, r17, r18, r19, r20, r21, r22)
            r29 = 262128(0x3fff0, float:3.6732E-40)
            r9 = 0
            r12 = 0
            r13 = 0
            r16 = 0
            r14 = r16
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r21 = 0
            r22 = 0
            SC.C13607l.j(r4, r5, r6, r7, r9, r11, r12, r13, r14, r16, r17, r18, r19, r21, r22, r23, r24, r25, r26, r27, r28, r29)
            r4 = 8
            float r4 = (float) r4
            float r4 = c2.h.B(r4)
            r5 = r32
            androidx.compose.foundation.layout.d$f r4 = r5.n(r4)
            r5 = 16
            float r5 = (float) r5
            float r17 = c2.h.B(r5)
            float r19 = c2.h.B(r5)
            r5 = 24
            float r5 = (float) r5
            float r18 = c2.h.B(r5)
            r21 = 8
            r22 = 0
            r20 = 0
            r16 = r3
            androidx.compose.ui.d r5 = androidx.compose.foundation.layout.D.m(r16, r17, r18, r19, r20, r21, r22)
            i1.c$c r6 = r30.l()
            r15 = r40
            r7 = 6
            E1.I r4 = androidx.compose.foundation.layout.G.b(r4, r6, r15, r7)
            r14 = 0
            int r6 = U0.C4883j.a(r15, r14)
            U0.y r7 = r15.s()
            androidx.compose.ui.d r5 = androidx.compose.ui.c.e(r15, r5)
            nI.a r8 = r31.a()
            U0.f r9 = r15.m()
            if (r9 != 0) goto L_0x01d7
            U0.C4883j.c()
        L_0x01d7:
            r15.I()
            boolean r9 = r15.i()
            if (r9 == 0) goto L_0x01e4
            r15.p(r8)
            goto L_0x01e7
        L_0x01e4:
            r15.t()
        L_0x01e7:
            U0.m r8 = U0.F1.a(r15)
            nI.p r9 = r31.c()
            U0.F1.c(r8, r4, r9)
            nI.p r4 = r31.e()
            U0.F1.c(r8, r7, r4)
            nI.p r4 = r31.b()
            boolean r7 = r8.i()
            if (r7 != 0) goto L_0x0211
            java.lang.Object r7 = r8.D()
            java.lang.Integer r9 = java.lang.Integer.valueOf(r6)
            boolean r7 = kotlin.jvm.internal.C17542s.e(r7, r9)
            if (r7 != 0) goto L_0x021f
        L_0x0211:
            java.lang.Integer r7 = java.lang.Integer.valueOf(r6)
            r8.u(r7)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r8.w(r6, r4)
        L_0x021f:
            nI.p r4 = r31.d()
            U0.F1.c(r8, r5, r4)
            s0.N r22 = s0.C5843N.f28726a
            int r4 = Oo.b.f84417K
            java.lang.String r4 = J1.j.b(r4, r15, r14)
            SC.N r7 = SC.N.Secondary
            r20 = 2
            r21 = 0
            r18 = 1065353216(0x3f800000, float:1.0)
            r19 = 0
            r16 = r22
            r17 = r3
            androidx.compose.ui.d r5 = s0.C5842M.e(r16, r17, r18, r19, r20, r21)
            r6 = -429555923(0xffffffffe6657f2d, float:-2.7094198E23)
            r15.W(r6)
            r6 = r33 & 14
            r8 = 4
            if (r6 != r8) goto L_0x024e
            r6 = r36
            goto L_0x024f
        L_0x024e:
            r6 = r14
        L_0x024f:
            java.lang.Object r8 = r15.D()
            if (r6 != 0) goto L_0x025d
            U0.m$a r6 = U0.C4889m.f14007a
            java.lang.Object r6 = r6.a()
            if (r8 != r6) goto L_0x0265
        L_0x025d:
            zf.o0 r8 = new zf.o0
            r8.<init>(r0)
            r15.u(r8)
        L_0x0265:
            r13 = r8
            nI.a r13 = (nI.C17631a) r13
            r15.P()
            r16 = 3072(0xc00, float:4.305E-42)
            r17 = 500(0x1f4, float:7.0E-43)
            r6 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r14 = r15
            r37 = r15
            r15 = r16
            r16 = r17
            SC.L.b(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            int r4 = Oo.b.f84824w4
            r15 = r37
            r5 = 0
            java.lang.String r4 = J1.j.b(r4, r15, r5)
            r20 = 2
            r21 = 0
            r18 = 1065353216(0x3f800000, float:1.0)
            r19 = 0
            r16 = r22
            r17 = r3
            androidx.compose.ui.d r3 = s0.C5842M.e(r16, r17, r18, r19, r20, r21)
            r6 = -429549556(0xffffffffe665980c, float:-2.7105667E23)
            r15.W(r6)
            r6 = r33 & 112(0x70, float:1.57E-43)
            r7 = 32
            if (r6 != r7) goto L_0x02a6
            r5 = r36
        L_0x02a6:
            java.lang.Object r6 = r15.D()
            if (r5 != 0) goto L_0x02b4
            U0.m$a r5 = U0.C4889m.f14007a
            java.lang.Object r5 = r5.a()
            if (r6 != r5) goto L_0x02bc
        L_0x02b4:
            zf.p0 r6 = new zf.p0
            r6.<init>(r1)
            r15.u(r6)
        L_0x02bc:
            r13 = r6
            nI.a r13 = (nI.C17631a) r13
            r15.P()
            r16 = 0
            r17 = 508(0x1fc, float:7.12E-43)
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r5 = r3
            r14 = r15
            r3 = r15
            r15 = r16
            r16 = r17
            SC.L.b(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            r3.x()
            r3.x()
            boolean r4 = U0.C4895p.J()
            if (r4 == 0) goto L_0x02e6
            U0.C4895p.R()
        L_0x02e6:
            U0.Y0 r3 = r3.n()
            if (r3 == 0) goto L_0x02f4
            zf.q0 r4 = new zf.q0
            r4.<init>(r0, r1, r2)
            r3.a(r4)
        L_0x02f4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: zf.r0.e(nI.a, nI.a, U0.m, int):void");
    }

    /* access modifiers changed from: private */
    public static final C16807N f(C17631a aVar) {
        aVar.invoke();
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N g(C17631a aVar) {
        aVar.invoke();
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N h(C17631a aVar, C17631a aVar2, int i10, C4889m mVar, int i11) {
        e(aVar, aVar2, mVar, M0.a(i10 | 1));
        return C16807N.f139792a;
    }

    public static final void j(C5968C c10, C17631a<C16807N> aVar, C17631a<C16807N> aVar2) {
        C17542s.j(c10, "<this>");
        C17542s.j(aVar, "onSignupClicked");
        C17542s.j(aVar2, "onLoginClicked");
        c10.d("LoginPromotion", new n0(), "LoginPromotion", c.c(-1871155285, true, new a(aVar, aVar2)));
    }

    /* access modifiers changed from: private */
    public static final C5979c k(C5993q qVar) {
        C17542s.j(qVar, "$this$item");
        return C5979c.a(C5972G.a(qVar.a()));
    }
}
