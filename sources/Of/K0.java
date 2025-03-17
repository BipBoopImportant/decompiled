package Of;

import IC.C13023e;
import U0.C4889m;
import U0.M0;
import XH.C16807N;
import androidx.compose.ui.d;
import kotlin.Metadata;
import nI.C17631a;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a=\u0010\b\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0006H\u0001¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"LIC/e;", "message", "Lkotlin/Function0;", "LXH/N;", "onClick", "onDismiss", "Landroidx/compose/ui/d;", "modifier", "b", "(LIC/e;LnI/a;LnI/a;Landroidx/compose/ui/d;LU0/m;II)V", "cart-implementation_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class K0 {
    /* JADX WARNING: Removed duplicated region for block: B:101:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x009f  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00a4  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x0325  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void b(IC.C13023e r35, nI.C17631a<XH.C16807N> r36, nI.C17631a<XH.C16807N> r37, androidx.compose.ui.d r38, U0.C4889m r39, int r40, int r41) {
        /*
            r1 = r35
            r0 = r36
            r15 = r37
            r3 = r40
            r2 = 2
            r4 = 4
            r5 = 48
            r6 = 8
            r7 = 6
            java.lang.String r8 = "message"
            kotlin.jvm.internal.C17542s.j(r1, r8)
            java.lang.String r8 = "onClick"
            kotlin.jvm.internal.C17542s.j(r0, r8)
            java.lang.String r8 = "onDismiss"
            kotlin.jvm.internal.C17542s.j(r15, r8)
            r8 = 891121138(0x351d6df2, float:5.864705E-7)
            r9 = r39
            U0.m r14 = r9.k(r8)
            r9 = 1
            r10 = r41 & 1
            if (r10 == 0) goto L_0x002f
            r10 = r3 | 6
            goto L_0x0048
        L_0x002f:
            r10 = r3 & 6
            if (r10 != 0) goto L_0x0047
            r10 = r3 & 8
            if (r10 != 0) goto L_0x003c
            boolean r10 = r14.V(r1)
            goto L_0x0040
        L_0x003c:
            boolean r10 = r14.F(r1)
        L_0x0040:
            if (r10 == 0) goto L_0x0044
            r10 = r4
            goto L_0x0045
        L_0x0044:
            r10 = r2
        L_0x0045:
            r10 = r10 | r3
            goto L_0x0048
        L_0x0047:
            r10 = r3
        L_0x0048:
            r2 = r41 & 2
            if (r2 == 0) goto L_0x004e
            r10 = r10 | r5
            goto L_0x005e
        L_0x004e:
            r2 = r3 & 48
            if (r2 != 0) goto L_0x005e
            boolean r2 = r14.F(r0)
            if (r2 == 0) goto L_0x005b
            r2 = 32
            goto L_0x005d
        L_0x005b:
            r2 = 16
        L_0x005d:
            r10 = r10 | r2
        L_0x005e:
            r2 = r41 & 4
            if (r2 == 0) goto L_0x0065
            r10 = r10 | 384(0x180, float:5.38E-43)
            goto L_0x0075
        L_0x0065:
            r2 = r3 & 384(0x180, float:5.38E-43)
            if (r2 != 0) goto L_0x0075
            boolean r2 = r14.F(r15)
            if (r2 == 0) goto L_0x0072
            r2 = 256(0x100, float:3.59E-43)
            goto L_0x0074
        L_0x0072:
            r2 = 128(0x80, float:1.794E-43)
        L_0x0074:
            r10 = r10 | r2
        L_0x0075:
            r2 = r41 & 8
            if (r2 == 0) goto L_0x007f
            r10 = r10 | 3072(0xc00, float:4.305E-42)
        L_0x007b:
            r4 = r38
        L_0x007d:
            r13 = r10
            goto L_0x0092
        L_0x007f:
            r4 = r3 & 3072(0xc00, float:4.305E-42)
            if (r4 != 0) goto L_0x007b
            r4 = r38
            boolean r12 = r14.V(r4)
            if (r12 == 0) goto L_0x008e
            r12 = 2048(0x800, float:2.87E-42)
            goto L_0x0090
        L_0x008e:
            r12 = 1024(0x400, float:1.435E-42)
        L_0x0090:
            r10 = r10 | r12
            goto L_0x007d
        L_0x0092:
            r10 = r13 & 1171(0x493, float:1.641E-42)
            r12 = 1170(0x492, float:1.64E-42)
            if (r10 != r12) goto L_0x00a4
            boolean r10 = r14.l()
            if (r10 != 0) goto L_0x009f
            goto L_0x00a4
        L_0x009f:
            r14.L()
            goto L_0x031f
        L_0x00a4:
            if (r2 == 0) goto L_0x00aa
            androidx.compose.ui.d$a r2 = androidx.compose.ui.d.f18749a
            r12 = r2
            goto L_0x00ab
        L_0x00aa:
            r12 = r4
        L_0x00ab:
            boolean r2 = U0.C4895p.J()
            if (r2 == 0) goto L_0x00b7
            r2 = -1
            java.lang.String r4 = "com.ingka.ikea.app.cart.compose.CheckoutSurveyMessage (CheckoutSurveyMessage.kt:42)"
            U0.C4895p.S(r8, r13, r2, r4)
        L_0x00b7:
            r2 = 0
            r4 = 0
            androidx.compose.ui.d r2 = androidx.compose.foundation.layout.J.h(r12, r2, r9, r4)
            java.lang.String r4 = "CheckoutSurveyMessageTestTags_CONTAINER"
            androidx.compose.ui.d r2 = androidx.compose.ui.platform.C5116k1.a(r2, r4)
            tK.v r4 = tK.C18030v.f147664a
            int r8 = tK.C18030v.f147665b
            tK.h r9 = r4.a(r14, r8)
            long r9 = r9.l0()
            float r6 = (float) r6
            float r16 = c2.h.B(r6)
            A0.f r7 = A0.g.e(r16)
            androidx.compose.ui.d r2 = androidx.compose.foundation.b.c(r2, r9, r7)
            i1.c$a r24 = i1.C5437c.f24302a
            i1.c r7 = r24.o()
            r10 = 0
            E1.I r7 = androidx.compose.foundation.layout.C5077h.h(r7, r10)
            int r9 = U0.C4883j.a(r14, r10)
            U0.y r11 = r14.s()
            androidx.compose.ui.d r2 = androidx.compose.ui.c.e(r14, r2)
            G1.g$a r16 = G1.C4504g.f6515W
            nI.a r10 = r16.a()
            U0.f r18 = r14.m()
            if (r18 != 0) goto L_0x0102
            U0.C4883j.c()
        L_0x0102:
            r14.I()
            boolean r18 = r14.i()
            if (r18 == 0) goto L_0x010f
            r14.p(r10)
            goto L_0x0112
        L_0x010f:
            r14.t()
        L_0x0112:
            U0.m r10 = U0.F1.a(r14)
            nI.p r5 = r16.c()
            U0.F1.c(r10, r7, r5)
            nI.p r5 = r16.e()
            U0.F1.c(r10, r11, r5)
            nI.p r5 = r16.b()
            boolean r7 = r10.i()
            if (r7 != 0) goto L_0x013c
            java.lang.Object r7 = r10.D()
            java.lang.Integer r11 = java.lang.Integer.valueOf(r9)
            boolean r7 = kotlin.jvm.internal.C17542s.e(r7, r11)
            if (r7 != 0) goto L_0x014a
        L_0x013c:
            java.lang.Integer r7 = java.lang.Integer.valueOf(r9)
            r10.u(r7)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r9)
            r10.w(r7, r5)
        L_0x014a:
            nI.p r5 = r16.d()
            U0.F1.c(r10, r2, r5)
            androidx.compose.foundation.layout.j r11 = androidx.compose.foundation.layout.C5079j.f18125a
            i1.c$b r2 = r24.g()
            androidx.compose.ui.d$a r10 = androidx.compose.ui.d.f18749a
            androidx.compose.foundation.layout.d r5 = androidx.compose.foundation.layout.C5073d.f18068a
            androidx.compose.foundation.layout.d$m r7 = r5.g()
            r9 = 48
            E1.I r2 = androidx.compose.foundation.layout.C5080k.a(r7, r2, r14, r9)
            r7 = 0
            int r9 = U0.C4883j.a(r14, r7)
            U0.y r7 = r14.s()
            androidx.compose.ui.d r0 = androidx.compose.ui.c.e(r14, r10)
            nI.a r3 = r16.a()
            U0.f r18 = r14.m()
            if (r18 != 0) goto L_0x017f
            U0.C4883j.c()
        L_0x017f:
            r14.I()
            boolean r18 = r14.i()
            if (r18 == 0) goto L_0x018c
            r14.p(r3)
            goto L_0x018f
        L_0x018c:
            r14.t()
        L_0x018f:
            U0.m r3 = U0.F1.a(r14)
            r32 = r11
            nI.p r11 = r16.c()
            U0.F1.c(r3, r2, r11)
            nI.p r2 = r16.e()
            U0.F1.c(r3, r7, r2)
            nI.p r2 = r16.b()
            boolean r7 = r3.i()
            if (r7 != 0) goto L_0x01bb
            java.lang.Object r7 = r3.D()
            java.lang.Integer r11 = java.lang.Integer.valueOf(r9)
            boolean r7 = kotlin.jvm.internal.C17542s.e(r7, r11)
            if (r7 != 0) goto L_0x01c9
        L_0x01bb:
            java.lang.Integer r7 = java.lang.Integer.valueOf(r9)
            r3.u(r7)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r9)
            r3.w(r7, r2)
        L_0x01c9:
            nI.p r2 = r16.d()
            U0.F1.c(r3, r0, r2)
            s0.h r0 = s0.C5862h.f28810a
            r0 = 16
            float r0 = (float) r0
            float r27 = c2.h.B(r0)
            r30 = 13
            r31 = 0
            r26 = 0
            r28 = 0
            r29 = 0
            r25 = r10
            androidx.compose.ui.d r0 = androidx.compose.foundation.layout.D.m(r25, r26, r27, r28, r29, r30, r31)
            float r2 = c2.h.B(r6)
            androidx.compose.foundation.layout.d$f r2 = r5.n(r2)
            i1.c$c r3 = r24.l()
            r5 = 6
            E1.I r2 = androidx.compose.foundation.layout.G.b(r2, r3, r14, r5)
            r3 = 0
            int r5 = U0.C4883j.a(r14, r3)
            U0.y r3 = r14.s()
            androidx.compose.ui.d r0 = androidx.compose.ui.c.e(r14, r0)
            nI.a r6 = r16.a()
            U0.f r7 = r14.m()
            if (r7 != 0) goto L_0x0214
            U0.C4883j.c()
        L_0x0214:
            r14.I()
            boolean r7 = r14.i()
            if (r7 == 0) goto L_0x0221
            r14.p(r6)
            goto L_0x0224
        L_0x0221:
            r14.t()
        L_0x0224:
            U0.m r6 = U0.F1.a(r14)
            nI.p r7 = r16.c()
            U0.F1.c(r6, r2, r7)
            nI.p r2 = r16.e()
            U0.F1.c(r6, r3, r2)
            nI.p r2 = r16.b()
            boolean r3 = r6.i()
            if (r3 != 0) goto L_0x024e
            java.lang.Object r3 = r6.D()
            java.lang.Integer r7 = java.lang.Integer.valueOf(r5)
            boolean r3 = kotlin.jvm.internal.C17542s.e(r3, r7)
            if (r3 != 0) goto L_0x025c
        L_0x024e:
            java.lang.Integer r3 = java.lang.Integer.valueOf(r5)
            r6.u(r3)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r5)
            r6.w(r3, r2)
        L_0x025c:
            nI.p r2 = r16.d()
            U0.F1.c(r6, r0, r2)
            s0.N r0 = s0.C5843N.f28726a
            int r0 = uK.C18146a.f148017Dc
            r2 = 0
            t1.c r16 = J1.e.c(r0, r14, r2)
            tK.h r0 = r4.a(r14, r8)
            long r19 = r0.G0()
            r22 = 48
            r23 = 4
            r17 = 0
            r18 = 0
            r21 = r14
            O0.V.a(r16, r17, r18, r19, r21, r22, r23)
            int r0 = uK.C18146a.f148047Fc
            r3 = 0
            t1.c r16 = J1.e.c(r0, r14, r3)
            tK.h r0 = r4.a(r14, r8)
            long r19 = r0.G0()
            O0.V.a(r16, r17, r18, r19, r21, r22, r23)
            r14.x()
            SC.b1$d r7 = SC.C13569b1.d.f116148b
            int r0 = IC.C13023e.f110931a
            r2 = r13 & 14
            r0 = r0 | r2
            java.lang.String r2 = r1.a(r14, r0)
            r0 = r13 & 112(0x70, float:1.57E-43)
            int r4 = SC.C13569b1.d.f116149c
            int r4 = r4 << 15
            r16 = r0 | r4
            r17 = 0
            r18 = 8156(0x1fdc, float:1.1429E-41)
            r4 = 0
            r5 = 0
            r6 = 0
            r8 = 0
            r9 = 0
            r0 = 0
            r11 = r10
            r10 = r0
            r0 = 0
            r34 = r11
            r33 = r32
            r11 = r0
            r0 = 0
            r19 = r12
            r12 = r0
            r20 = r13
            r13 = r0
            r0 = 0
            r38 = r14
            r14 = r0
            r0 = r3
            r3 = r36
            r15 = r38
            SC.C13585f1.c(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            r38.x()
            int r2 = uK.C18146a.f148142M2
            int r3 = Oo.b.f84665i
            r14 = r38
            java.lang.String r3 = J1.j.b(r3, r14, r0)
            i1.c r0 = r24.n()
            r4 = r33
            r5 = r34
            androidx.compose.ui.d r6 = r4.a(r5, r0)
            r0 = 20
            float r0 = (float) r0
            float r9 = c2.h.B(r0)
            r11 = 11
            r12 = 0
            r7 = 0
            r8 = 0
            r10 = 0
            androidx.compose.ui.d r4 = androidx.compose.foundation.layout.D.m(r6, r7, r8, r9, r10, r11, r12)
            SC.H0 r6 = SC.H0.Tertiary
            SC.G0 r7 = SC.G0.XSmall
            int r0 = r20 << 18
            r5 = 234881024(0xe000000, float:1.5777218E-30)
            r0 = r0 & r5
            r5 = 221184(0x36000, float:3.09945E-40)
            r12 = r0 | r5
            r13 = 200(0xc8, float:2.8E-43)
            r5 = 0
            r8 = 0
            r9 = 0
            r10 = r37
            r11 = r14
            SC.F0.b(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            r14.x()
            boolean r0 = U0.C4895p.J()
            if (r0 == 0) goto L_0x031d
            U0.C4895p.R()
        L_0x031d:
            r4 = r19
        L_0x031f:
            U0.Y0 r7 = r14.n()
            if (r7 == 0) goto L_0x0338
            Of.J0 r8 = new Of.J0
            r0 = r8
            r1 = r35
            r2 = r36
            r3 = r37
            r5 = r40
            r6 = r41
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r7.a(r8)
        L_0x0338:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: Of.K0.b(IC.e, nI.a, nI.a, androidx.compose.ui.d, U0.m, int, int):void");
    }

    /* access modifiers changed from: private */
    public static final C16807N c(C13023e eVar, C17631a aVar, C17631a aVar2, d dVar, int i10, int i11, C4889m mVar, int i12) {
        b(eVar, aVar, aVar2, dVar, mVar, M0.a(i10 | 1), i11);
        return C16807N.f139792a;
    }
}
