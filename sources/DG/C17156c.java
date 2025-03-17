package dG;

import U0.C4889m;
import U0.M0;
import XH.C16807N;
import kotlin.Metadata;
import nI.C17631a;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u001d\u0010\u0003\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lkotlin/Function0;", "LXH/N;", "onTouch", "c", "(LnI/a;LU0/m;I)V", "v1_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* renamed from: dG.c  reason: case insensitive filesystem */
public final class C17156c {
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r20v0, resolved type: nI.a} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void c(nI.C17631a<XH.C16807N> r33, U0.C4889m r34, int r35) {
        /*
            r0 = r33
            r1 = r35
            r2 = 3
            java.lang.String r3 = "onTouch"
            kotlin.jvm.internal.C17542s.j(r0, r3)
            r3 = 339932303(0x1442f48f, float:9.842728E-27)
            r4 = r34
            U0.m r15 = r4.k(r3)
            r4 = r1 & 6
            r5 = 2
            r6 = 4
            if (r4 != 0) goto L_0x0024
            boolean r4 = r15.F(r0)
            if (r4 == 0) goto L_0x0021
            r4 = r6
            goto L_0x0022
        L_0x0021:
            r4 = r5
        L_0x0022:
            r4 = r4 | r1
            goto L_0x0025
        L_0x0024:
            r4 = r1
        L_0x0025:
            r7 = r4 & 3
            if (r7 != r5) goto L_0x0036
            boolean r5 = r15.l()
            if (r5 != 0) goto L_0x0030
            goto L_0x0036
        L_0x0030:
            r15.L()
            r14 = r15
            goto L_0x039b
        L_0x0036:
            boolean r5 = U0.C4895p.J()
            if (r5 == 0) goto L_0x0042
            r5 = -1
            java.lang.String r7 = "com.sugarcube.decorate.v1.internal.v1.tooltip.poi.OrbitTooltipContent (OrbitTooltipContent.kt:44)"
            U0.C4895p.S(r3, r4, r5, r7)
        L_0x0042:
            androidx.compose.ui.d$a r3 = androidx.compose.ui.d.f18749a
            r5 = 0
            r7 = 1
            r8 = 0
            androidx.compose.ui.d r16 = androidx.compose.foundation.layout.J.f(r3, r5, r7, r8)
            r5 = 1679513213(0x641b567d, float:1.146191E22)
            r15.W(r5)
            r4 = r4 & 14
            r14 = 0
            if (r4 != r6) goto L_0x0058
            r4 = r7
            goto L_0x0059
        L_0x0058:
            r4 = r14
        L_0x0059:
            java.lang.Object r5 = r15.D()
            if (r4 != 0) goto L_0x0067
            U0.m$a r4 = U0.C4889m.f14007a
            java.lang.Object r4 = r4.a()
            if (r5 != r4) goto L_0x006f
        L_0x0067:
            dG.a r5 = new dG.a
            r5.<init>(r0)
            r15.u(r5)
        L_0x006f:
            r20 = r5
            nI.a r20 = (nI.C17631a) r20
            r15.P()
            r21 = 7
            r22 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            androidx.compose.ui.d r4 = androidx.compose.foundation.d.d(r16, r17, r18, r19, r20, r21, r22)
            i1.c$a r5 = i1.C5437c.f24302a
            i1.c$b r6 = r5.g()
            androidx.compose.foundation.layout.d r9 = androidx.compose.foundation.layout.C5073d.f18068a
            androidx.compose.foundation.layout.d$m r10 = r9.g()
            r11 = 54
            E1.I r6 = androidx.compose.foundation.layout.C5080k.a(r10, r6, r15, r11)
            int r10 = U0.C4883j.a(r15, r14)
            U0.y r11 = r15.s()
            androidx.compose.ui.d r4 = androidx.compose.ui.c.e(r15, r4)
            G1.g$a r12 = G1.C4504g.f6515W
            nI.a r13 = r12.a()
            U0.f r16 = r15.m()
            if (r16 != 0) goto L_0x00b1
            U0.C4883j.c()
        L_0x00b1:
            r15.I()
            boolean r16 = r15.i()
            if (r16 == 0) goto L_0x00be
            r15.p(r13)
            goto L_0x00c1
        L_0x00be:
            r15.t()
        L_0x00c1:
            U0.m r13 = U0.F1.a(r15)
            nI.p r7 = r12.c()
            U0.F1.c(r13, r6, r7)
            nI.p r6 = r12.e()
            U0.F1.c(r13, r11, r6)
            nI.p r6 = r12.b()
            boolean r7 = r13.i()
            if (r7 != 0) goto L_0x00eb
            java.lang.Object r7 = r13.D()
            java.lang.Integer r11 = java.lang.Integer.valueOf(r10)
            boolean r7 = kotlin.jvm.internal.C17542s.e(r7, r11)
            if (r7 != 0) goto L_0x00f9
        L_0x00eb:
            java.lang.Integer r7 = java.lang.Integer.valueOf(r10)
            r13.u(r7)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r10)
            r13.w(r7, r6)
        L_0x00f9:
            nI.p r6 = r12.d()
            U0.F1.c(r13, r4, r6)
            s0.h r29 = s0.C5862h.f28810a
            androidx.compose.ui.d r16 = androidx.compose.foundation.layout.J.G(r3, r8, r14, r2, r8)
            r2 = 48
            float r4 = (float) r2
            float r18 = c2.h.B(r4)
            r21 = 13
            r22 = 0
            r17 = 0
            r19 = 0
            r20 = 0
            androidx.compose.ui.d r4 = androidx.compose.foundation.layout.D.m(r16, r17, r18, r19, r20, r21, r22)
            i1.c r6 = r5.o()
            E1.I r6 = androidx.compose.foundation.layout.C5077h.h(r6, r14)
            int r7 = U0.C4883j.a(r15, r14)
            U0.y r8 = r15.s()
            androidx.compose.ui.d r4 = androidx.compose.ui.c.e(r15, r4)
            nI.a r10 = r12.a()
            U0.f r11 = r15.m()
            if (r11 != 0) goto L_0x013c
            U0.C4883j.c()
        L_0x013c:
            r15.I()
            boolean r11 = r15.i()
            if (r11 == 0) goto L_0x0149
            r15.p(r10)
            goto L_0x014c
        L_0x0149:
            r15.t()
        L_0x014c:
            U0.m r10 = U0.F1.a(r15)
            nI.p r11 = r12.c()
            U0.F1.c(r10, r6, r11)
            nI.p r6 = r12.e()
            U0.F1.c(r10, r8, r6)
            nI.p r6 = r12.b()
            boolean r8 = r10.i()
            if (r8 != 0) goto L_0x0176
            java.lang.Object r8 = r10.D()
            java.lang.Integer r11 = java.lang.Integer.valueOf(r7)
            boolean r8 = kotlin.jvm.internal.C17542s.e(r8, r11)
            if (r8 != 0) goto L_0x0184
        L_0x0176:
            java.lang.Integer r8 = java.lang.Integer.valueOf(r7)
            r10.u(r8)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r10.w(r7, r6)
        L_0x0184:
            nI.p r6 = r12.d()
            U0.F1.c(r10, r4, r6)
            androidx.compose.foundation.layout.j r4 = androidx.compose.foundation.layout.C5079j.f18125a
            androidx.compose.foundation.layout.d$m r4 = r9.g()
            i1.c$b r6 = r5.k()
            E1.I r4 = androidx.compose.foundation.layout.C5080k.a(r4, r6, r15, r14)
            int r6 = U0.C4883j.a(r15, r14)
            U0.y r7 = r15.s()
            androidx.compose.ui.d r8 = androidx.compose.ui.c.e(r15, r3)
            nI.a r10 = r12.a()
            U0.f r11 = r15.m()
            if (r11 != 0) goto L_0x01b2
            U0.C4883j.c()
        L_0x01b2:
            r15.I()
            boolean r11 = r15.i()
            if (r11 == 0) goto L_0x01bf
            r15.p(r10)
            goto L_0x01c2
        L_0x01bf:
            r15.t()
        L_0x01c2:
            U0.m r10 = U0.F1.a(r15)
            nI.p r11 = r12.c()
            U0.F1.c(r10, r4, r11)
            nI.p r4 = r12.e()
            U0.F1.c(r10, r7, r4)
            nI.p r4 = r12.b()
            boolean r7 = r10.i()
            if (r7 != 0) goto L_0x01ec
            java.lang.Object r7 = r10.D()
            java.lang.Integer r11 = java.lang.Integer.valueOf(r6)
            boolean r7 = kotlin.jvm.internal.C17542s.e(r7, r11)
            if (r7 != 0) goto L_0x01fa
        L_0x01ec:
            java.lang.Integer r7 = java.lang.Integer.valueOf(r6)
            r10.u(r7)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r10.w(r6, r4)
        L_0x01fa:
            nI.p r4 = r12.d()
            U0.F1.c(r10, r8, r4)
            i1.c$c r4 = r5.i()
            androidx.compose.foundation.layout.d$e r5 = r9.f()
            E1.I r2 = androidx.compose.foundation.layout.G.b(r5, r4, r15, r2)
            int r4 = U0.C4883j.a(r15, r14)
            U0.y r5 = r15.s()
            androidx.compose.ui.d r6 = androidx.compose.ui.c.e(r15, r3)
            nI.a r7 = r12.a()
            U0.f r8 = r15.m()
            if (r8 != 0) goto L_0x0226
            U0.C4883j.c()
        L_0x0226:
            r15.I()
            boolean r8 = r15.i()
            if (r8 == 0) goto L_0x0233
            r15.p(r7)
            goto L_0x0236
        L_0x0233:
            r15.t()
        L_0x0236:
            U0.m r7 = U0.F1.a(r15)
            nI.p r8 = r12.c()
            U0.F1.c(r7, r2, r8)
            nI.p r2 = r12.e()
            U0.F1.c(r7, r5, r2)
            nI.p r2 = r12.b()
            boolean r5 = r7.i()
            if (r5 != 0) goto L_0x0260
            java.lang.Object r5 = r7.D()
            java.lang.Integer r8 = java.lang.Integer.valueOf(r4)
            boolean r5 = kotlin.jvm.internal.C17542s.e(r5, r8)
            if (r5 != 0) goto L_0x026e
        L_0x0260:
            java.lang.Integer r5 = java.lang.Integer.valueOf(r4)
            r7.u(r5)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r7.w(r4, r2)
        L_0x026e:
            nI.p r2 = r12.d()
            U0.F1.c(r7, r6, r2)
            s0.N r2 = s0.C5843N.f28726a
            r2 = 1
            float r2 = (float) r2
            float r2 = c2.h.B(r2)
            androidx.compose.ui.d r2 = androidx.compose.foundation.layout.D.i(r3, r2)
            r4 = 24
            float r4 = (float) r4
            float r5 = c2.h.B(r4)
            androidx.compose.ui.d r2 = androidx.compose.foundation.layout.J.y(r2, r5)
            float r4 = c2.h.B(r4)
            androidx.compose.ui.d r6 = androidx.compose.foundation.layout.J.i(r2, r4)
            int r2 = com.sugarcube.common.R.drawable.sc_clean_sparkles
            t1.c r4 = J1.e.c(r2, r15, r14)
            int r2 = OE.n.f113439q3
            java.lang.String r5 = J1.j.b(r2, r15, r14)
            E1.k$a r2 = E1.C4478k.f5915a
            E1.n r8 = r2.g()
            r12 = 24960(0x6180, float:3.4976E-41)
            r13 = 104(0x68, float:1.46E-43)
            r7 = 0
            r9 = 0
            r10 = 0
            r11 = r15
            n0.C5583F.a(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            java.lang.String r4 = "title"
            androidx.compose.ui.d r5 = androidx.compose.ui.platform.C5116k1.a(r3, r4)
            int r4 = OE.n.f113439q3
            java.lang.String r4 = J1.j.b(r4, r15, r14)
            p1.v0$a r30 = p1.C5747v0.f27350b
            long r6 = r30.j()
            tK.v r13 = tK.C18030v.f147664a
            int r12 = tK.C18030v.f147665b
            tK.w r8 = r13.b(r15, r12)
            tK.r r8 = r8.c()
            N1.Y r24 = r8.e()
            r27 = 0
            r28 = 65528(0xfff8, float:9.1824E-41)
            r8 = 0
            r11 = 0
            r16 = 0
            r31 = r12
            r12 = r16
            r16 = 0
            r32 = r13
            r13 = r16
            r16 = 0
            r34 = r15
            r15 = r16
            r17 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r26 = 432(0x1b0, float:6.05E-43)
            r25 = r34
            I0.b1.b(r4, r5, r6, r8, r10, r11, r12, r13, r15, r16, r17, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28)
            r34.x()
            java.lang.String r4 = "subtitle"
            androidx.compose.ui.d r5 = androidx.compose.ui.platform.C5116k1.a(r3, r4)
            int r4 = OE.n.f113383i3
            r15 = r34
            r13 = 0
            java.lang.String r4 = J1.j.b(r4, r15, r13)
            long r6 = r30.j()
            r9 = r31
            r8 = r32
            tK.w r8 = r8.b(r15, r9)
            tK.c r8 = r8.a()
            N1.Y r24 = r8.b()
            r8 = 0
            r12 = 0
            r16 = 0
            r13 = r16
            r16 = 0
            r15 = r16
            r17 = 0
            I0.b1.b(r4, r5, r6, r8, r10, r11, r12, r13, r15, r16, r17, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28)
            r34.x()
            r34.x()
            r4 = 130(0x82, float:1.82E-43)
            float r4 = (float) r4
            float r4 = c2.h.B(r4)
            androidx.compose.ui.d r17 = androidx.compose.foundation.layout.J.i(r3, r4)
            r20 = 2
            r21 = 0
            r18 = 1065353216(0x3f800000, float:1.0)
            r16 = r29
            androidx.compose.ui.d r4 = s0.C5861g.c(r16, r17, r18, r19, r20, r21)
            r14 = r34
            r5 = 0
            s0.C5844O.a(r4, r14, r5)
            r4 = 136(0x88, float:1.9E-43)
            float r4 = (float) r4
            float r4 = c2.h.B(r4)
            androidx.compose.ui.d r3 = androidx.compose.foundation.layout.J.y(r3, r4)
            r4 = 237(0xed, float:3.32E-43)
            float r4 = (float) r4
            float r4 = c2.h.B(r4)
            androidx.compose.ui.d r3 = androidx.compose.foundation.layout.J.i(r3, r4)
            java.lang.String r4 = "bottom_image"
            androidx.compose.ui.d r6 = androidx.compose.ui.platform.C5116k1.a(r3, r4)
            int r3 = OE.C13316h.f112825G
            t1.c r4 = J1.e.c(r3, r14, r5)
            int r3 = OE.n.f113383i3
            java.lang.String r5 = J1.j.b(r3, r14, r5)
            E1.k r8 = r2.e()
            r12 = 24960(0x6180, float:3.4976E-41)
            r13 = 104(0x68, float:1.46E-43)
            r7 = 0
            r9 = 0
            r11 = r14
            n0.C5583F.a(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            r14.x()
            boolean r2 = U0.C4895p.J()
            if (r2 == 0) goto L_0x039b
            U0.C4895p.R()
        L_0x039b:
            U0.Y0 r2 = r14.n()
            if (r2 == 0) goto L_0x03a9
            dG.b r3 = new dG.b
            r3.<init>(r0, r1)
            r2.a(r3)
        L_0x03a9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: dG.C17156c.c(nI.a, U0.m, int):void");
    }

    /* access modifiers changed from: private */
    public static final C16807N d(C17631a aVar) {
        aVar.invoke();
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N e(C17631a aVar, int i10, C4889m mVar, int i11) {
        c(aVar, mVar, M0.a(i10 | 1));
        return C16807N.f139792a;
    }
}
