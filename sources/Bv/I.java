package Bv;

import IC.C13023e;
import U0.C4889m;
import U0.M0;
import XH.C16807N;
import androidx.compose.ui.d;
import kotlin.Metadata;
import nI.C17631a;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a?\u0010\b\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00002\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005H\u0001¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"LIC/e;", "text", "Landroidx/compose/ui/d;", "modifier", "subtext", "Lkotlin/Function0;", "LXH/N;", "onClick", "b", "(LIC/e;Landroidx/compose/ui/d;LIC/e;LnI/a;LU0/m;II)V", "membership-implementation_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class I {
    /* JADX WARNING: Removed duplicated region for block: B:134:0x0468  */
    /* JADX WARNING: Removed duplicated region for block: B:136:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x005b  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x005e  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x007b  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0080  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00a0  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00a8  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void b(IC.C13023e r41, androidx.compose.ui.d r42, IC.C13023e r43, nI.C17631a<XH.C16807N> r44, U0.C4889m r45, int r46, int r47) {
        /*
            r1 = r41
            r0 = r43
            r5 = r46
            r2 = 48
            r3 = 8
            r4 = 6
            java.lang.String r6 = "text"
            kotlin.jvm.internal.C17542s.j(r1, r6)
            r6 = 449393651(0x1ac933f3, float:8.321558E-23)
            r7 = r45
            U0.m r15 = r7.k(r6)
            r14 = 1
            r7 = r47 & 1
            r12 = 4
            r13 = 2
            if (r7 == 0) goto L_0x0023
            r7 = r5 | 6
            goto L_0x003c
        L_0x0023:
            r7 = r5 & 6
            if (r7 != 0) goto L_0x003b
            r7 = r5 & 8
            if (r7 != 0) goto L_0x0030
            boolean r7 = r15.V(r1)
            goto L_0x0034
        L_0x0030:
            boolean r7 = r15.F(r1)
        L_0x0034:
            if (r7 == 0) goto L_0x0038
            r7 = r12
            goto L_0x0039
        L_0x0038:
            r7 = r13
        L_0x0039:
            r7 = r7 | r5
            goto L_0x003c
        L_0x003b:
            r7 = r5
        L_0x003c:
            r8 = r47 & 2
            r9 = 16
            if (r8 == 0) goto L_0x0046
            r7 = r7 | r2
        L_0x0043:
            r10 = r42
            goto L_0x0057
        L_0x0046:
            r10 = r5 & 48
            if (r10 != 0) goto L_0x0043
            r10 = r42
            boolean r11 = r15.V(r10)
            if (r11 == 0) goto L_0x0055
            r11 = 32
            goto L_0x0056
        L_0x0055:
            r11 = r9
        L_0x0056:
            r7 = r7 | r11
        L_0x0057:
            r11 = r47 & 4
            if (r11 == 0) goto L_0x005e
            r7 = r7 | 384(0x180, float:5.38E-43)
            goto L_0x0077
        L_0x005e:
            r12 = r5 & 384(0x180, float:5.38E-43)
            if (r12 != 0) goto L_0x0077
            r12 = r5 & 512(0x200, float:7.175E-43)
            if (r12 != 0) goto L_0x006b
            boolean r12 = r15.V(r0)
            goto L_0x006f
        L_0x006b:
            boolean r12 = r15.F(r0)
        L_0x006f:
            if (r12 == 0) goto L_0x0074
            r12 = 256(0x100, float:3.59E-43)
            goto L_0x0076
        L_0x0074:
            r12 = 128(0x80, float:1.794E-43)
        L_0x0076:
            r7 = r7 | r12
        L_0x0077:
            r12 = r47 & 8
            if (r12 == 0) goto L_0x0080
            r7 = r7 | 3072(0xc00, float:4.305E-42)
        L_0x007d:
            r3 = r44
            goto L_0x0093
        L_0x0080:
            r3 = r5 & 3072(0xc00, float:4.305E-42)
            if (r3 != 0) goto L_0x007d
            r3 = r44
            boolean r16 = r15.F(r3)
            if (r16 == 0) goto L_0x008f
            r16 = 2048(0x800, float:2.87E-42)
            goto L_0x0091
        L_0x008f:
            r16 = 1024(0x400, float:1.435E-42)
        L_0x0091:
            r7 = r7 | r16
        L_0x0093:
            r14 = r7 & 1171(0x493, float:1.641E-42)
            r13 = 1170(0x492, float:1.64E-42)
            if (r14 != r13) goto L_0x00a8
            boolean r13 = r15.l()
            if (r13 != 0) goto L_0x00a0
            goto L_0x00a8
        L_0x00a0:
            r15.L()
            r4 = r3
            r2 = r15
        L_0x00a5:
            r3 = r0
            goto L_0x0462
        L_0x00a8:
            if (r8 == 0) goto L_0x00ae
            androidx.compose.ui.d$a r8 = androidx.compose.ui.d.f18749a
            r14 = r8
            goto L_0x00af
        L_0x00ae:
            r14 = r10
        L_0x00af:
            if (r11 == 0) goto L_0x00b2
            r0 = 0
        L_0x00b2:
            if (r12 == 0) goto L_0x00b5
            r3 = 0
        L_0x00b5:
            boolean r8 = U0.C4895p.J()
            if (r8 == 0) goto L_0x00c1
            r8 = -1
            java.lang.String r10 = "com.ingka.ikea.membership.impl.compose.common.SectionHeader (SectionHeader.kt:41)"
            U0.C4895p.S(r6, r7, r8, r10)
        L_0x00c1:
            if (r3 != 0) goto L_0x00c6
            androidx.compose.ui.d$a r6 = androidx.compose.ui.d.f18749a
            goto L_0x00d8
        L_0x00c6:
            androidx.compose.ui.d$a r18 = androidx.compose.ui.d.f18749a
            r23 = 7
            r24 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = r3
            androidx.compose.ui.d r6 = androidx.compose.foundation.d.d(r18, r19, r20, r21, r22, r23, r24)
        L_0x00d8:
            androidx.compose.ui.d r6 = r14.s(r6)
            androidx.compose.foundation.layout.d r8 = androidx.compose.foundation.layout.C5073d.f18068a
            androidx.compose.foundation.layout.d$m r10 = r8.g()
            i1.c$a r33 = i1.C5437c.f24302a
            i1.c$b r11 = r33.k()
            r12 = 0
            E1.I r10 = androidx.compose.foundation.layout.C5080k.a(r10, r11, r15, r12)
            int r11 = U0.C4883j.a(r15, r12)
            U0.y r13 = r15.s()
            androidx.compose.ui.d r6 = androidx.compose.ui.c.e(r15, r6)
            G1.g$a r34 = G1.C4504g.f6515W
            nI.a r12 = r34.a()
            U0.f r18 = r15.m()
            if (r18 != 0) goto L_0x0108
            U0.C4883j.c()
        L_0x0108:
            r15.I()
            boolean r18 = r15.i()
            if (r18 == 0) goto L_0x0115
            r15.p(r12)
            goto L_0x0118
        L_0x0115:
            r15.t()
        L_0x0118:
            U0.m r12 = U0.F1.a(r15)
            nI.p r2 = r34.c()
            U0.F1.c(r12, r10, r2)
            nI.p r2 = r34.e()
            U0.F1.c(r12, r13, r2)
            nI.p r2 = r34.b()
            boolean r10 = r12.i()
            if (r10 != 0) goto L_0x0142
            java.lang.Object r10 = r12.D()
            java.lang.Integer r13 = java.lang.Integer.valueOf(r11)
            boolean r10 = kotlin.jvm.internal.C17542s.e(r10, r13)
            if (r10 != 0) goto L_0x0150
        L_0x0142:
            java.lang.Integer r10 = java.lang.Integer.valueOf(r11)
            r12.u(r10)
            java.lang.Integer r10 = java.lang.Integer.valueOf(r11)
            r12.w(r10, r2)
        L_0x0150:
            nI.p r2 = r34.d()
            U0.F1.c(r12, r6, r2)
            s0.h r2 = s0.C5862h.f28810a
            androidx.compose.ui.d$a r2 = androidx.compose.ui.d.f18749a
            float r6 = (float) r9
            float r9 = c2.h.B(r6)
            androidx.compose.ui.d r9 = androidx.compose.foundation.layout.J.i(r2, r9)
            s0.C5844O.a(r9, r15, r4)
            i1.c$c r9 = r33.i()
            androidx.compose.foundation.layout.d$e r8 = r8.f()
            r10 = 48
            E1.I r8 = androidx.compose.foundation.layout.G.b(r8, r9, r15, r10)
            r9 = 0
            int r10 = U0.C4883j.a(r15, r9)
            U0.y r9 = r15.s()
            androidx.compose.ui.d r11 = androidx.compose.ui.c.e(r15, r2)
            nI.a r12 = r34.a()
            U0.f r13 = r15.m()
            if (r13 != 0) goto L_0x018f
            U0.C4883j.c()
        L_0x018f:
            r15.I()
            boolean r13 = r15.i()
            if (r13 == 0) goto L_0x019c
            r15.p(r12)
            goto L_0x019f
        L_0x019c:
            r15.t()
        L_0x019f:
            U0.m r12 = U0.F1.a(r15)
            nI.p r13 = r34.c()
            U0.F1.c(r12, r8, r13)
            nI.p r8 = r34.e()
            U0.F1.c(r12, r9, r8)
            nI.p r8 = r34.b()
            boolean r9 = r12.i()
            if (r9 != 0) goto L_0x01c9
            java.lang.Object r9 = r12.D()
            java.lang.Integer r13 = java.lang.Integer.valueOf(r10)
            boolean r9 = kotlin.jvm.internal.C17542s.e(r9, r13)
            if (r9 != 0) goto L_0x01d7
        L_0x01c9:
            java.lang.Integer r9 = java.lang.Integer.valueOf(r10)
            r12.u(r9)
            java.lang.Integer r9 = java.lang.Integer.valueOf(r10)
            r12.w(r9, r8)
        L_0x01d7:
            nI.p r8 = r34.d()
            U0.F1.c(r12, r11, r8)
            s0.N r18 = s0.C5843N.f28726a
            r8 = 24
            float r12 = (float) r8
            float r8 = c2.h.B(r12)
            androidx.compose.ui.d r8 = androidx.compose.foundation.layout.J.y(r2, r8)
            s0.C5844O.a(r8, r15, r4)
            r22 = 2
            r23 = 0
            r20 = 1065353216(0x3f800000, float:1.0)
            r21 = 0
            r19 = r2
            androidx.compose.ui.d r8 = s0.C5842M.e(r18, r19, r20, r21, r22, r23)
            r9 = 40
            float r13 = (float) r9
            float r9 = c2.h.B(r13)
            r10 = 0
            r4 = 0
            r11 = 2
            androidx.compose.ui.d r8 = androidx.compose.foundation.layout.J.k(r8, r9, r10, r11, r4)
            i1.c r4 = r33.o()
            r9 = 0
            E1.I r4 = androidx.compose.foundation.layout.C5077h.h(r4, r9)
            int r17 = U0.C4883j.a(r15, r9)
            U0.y r9 = r15.s()
            androidx.compose.ui.d r8 = androidx.compose.ui.c.e(r15, r8)
            nI.a r10 = r34.a()
            U0.f r18 = r15.m()
            if (r18 != 0) goto L_0x022c
            U0.C4883j.c()
        L_0x022c:
            r15.I()
            boolean r18 = r15.i()
            if (r18 == 0) goto L_0x0239
            r15.p(r10)
            goto L_0x023c
        L_0x0239:
            r15.t()
        L_0x023c:
            U0.m r10 = U0.F1.a(r15)
            nI.p r11 = r34.c()
            U0.F1.c(r10, r4, r11)
            nI.p r4 = r34.e()
            U0.F1.c(r10, r9, r4)
            nI.p r4 = r34.b()
            boolean r9 = r10.i()
            if (r9 != 0) goto L_0x0266
            java.lang.Object r9 = r10.D()
            java.lang.Integer r11 = java.lang.Integer.valueOf(r17)
            boolean r9 = kotlin.jvm.internal.C17542s.e(r9, r11)
            if (r9 != 0) goto L_0x0274
        L_0x0266:
            java.lang.Integer r9 = java.lang.Integer.valueOf(r17)
            r10.u(r9)
            java.lang.Integer r9 = java.lang.Integer.valueOf(r17)
            r10.w(r9, r4)
        L_0x0274:
            nI.p r4 = r34.d()
            U0.F1.c(r10, r8, r4)
            androidx.compose.foundation.layout.j r4 = androidx.compose.foundation.layout.C5079j.f18125a
            int r35 = IC.C13023e.f110931a
            r8 = r7 & 14
            r8 = r35 | r8
            java.lang.String r8 = r1.a(r15, r8)
            r36 = r7
            r7 = r8
            TC.b$b$e r8 = TC.C13679b.C2857b.e.f116687a
            tK.v r9 = tK.C18030v.f147664a
            int r10 = tK.C18030v.f147665b
            tK.h r11 = r9.a(r15, r10)
            long r19 = r11.G0()
            r37 = r10
            r18 = r15
            r15 = 0
            r17 = 2
            r10 = r19
            r19 = r12
            r1 = 0
            r12 = 1
            androidx.compose.ui.d r5 = androidx.compose.foundation.layout.J.h(r2, r15, r12, r1)
            i1.c r1 = r33.h()
            androidx.compose.ui.d r1 = r4.a(r5, r1)
            r5 = r9
            r9 = r1
            r31 = 0
            r32 = 262128(0x3fff0, float:3.6732E-40)
            r20 = 0
            r16 = r12
            r39 = r13
            r38 = r19
            r1 = 0
            r12 = r20
            r17 = 0
            r40 = r14
            r14 = r17
            r16 = 0
            r43 = r18
            r15 = r16
            r17 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r24 = 0
            r25 = 0
            r26 = 0
            r27 = 0
            r28 = 0
            r30 = 48
            r29 = r43
            SC.C13607l.j(r7, r8, r9, r10, r12, r14, r15, r16, r17, r19, r20, r21, r22, r24, r25, r26, r27, r28, r29, r30, r31, r32)
            r43.x()
            if (r3 == 0) goto L_0x0349
            r7 = -193420126(0xfffffffff478a4a2, float:-7.8798143E31)
            r15 = r43
            r15.W(r7)
            r7 = 8
            float r7 = (float) r7
            float r8 = c2.h.B(r7)
            androidx.compose.ui.d r8 = androidx.compose.foundation.layout.J.y(r2, r8)
            r9 = 6
            s0.C5844O.a(r8, r15, r9)
            int r8 = uK.C18146a.f148109K
            t1.c r8 = J1.e.c(r8, r15, r1)
            tK.h r9 = SC.C13575d.a(r15, r1)
            long r10 = r9.G0()
            r9 = 4
            float r9 = (float) r9
            float r9 = c2.h.B(r9)
            androidx.compose.ui.d r9 = androidx.compose.foundation.layout.D.i(r2, r9)
            float r12 = c2.h.B(r39)
            androidx.compose.ui.d r9 = androidx.compose.foundation.layout.J.t(r9, r12)
            float r7 = c2.h.B(r7)
            androidx.compose.ui.d r9 = androidx.compose.foundation.layout.D.i(r9, r7)
            r13 = 432(0x1b0, float:6.05E-43)
            r14 = 0
            java.lang.String r12 = ""
            r7 = r8
            r8 = r12
            r12 = r15
            O0.V.a(r7, r8, r9, r10, r12, r13, r14)
            float r6 = c2.h.B(r6)
            androidx.compose.ui.d r6 = androidx.compose.foundation.layout.J.y(r2, r6)
            r7 = 6
            s0.C5844O.a(r6, r15, r7)
            r15.P()
            goto L_0x0360
        L_0x0349:
            r15 = r43
            r7 = 6
            r6 = -192931442(0xfffffffff480198e, float:-8.119291E31)
            r15.W(r6)
            float r6 = c2.h.B(r38)
            androidx.compose.ui.d r6 = androidx.compose.foundation.layout.J.y(r2, r6)
            s0.C5844O.a(r6, r15, r7)
            r15.P()
        L_0x0360:
            r15.x()
            r6 = 1417583991(0x547e9d77, float:4.37425406E12)
            r15.W(r6)
            if (r0 != 0) goto L_0x036d
            r13 = 0
            goto L_0x0377
        L_0x036d:
            int r6 = r36 >> 6
            r6 = r6 & 14
            r6 = r35 | r6
            java.lang.String r13 = r0.a(r15, r6)
        L_0x0377:
            r15.P()
            r6 = 1417585021(0x547ea17d, float:4.37452407E12)
            r15.W(r6)
            if (r13 == 0) goto L_0x044d
            float r6 = c2.h.B(r38)
            r7 = 2
            r8 = 0
            r9 = 0
            androidx.compose.ui.d r6 = androidx.compose.foundation.layout.D.k(r2, r6, r9, r7, r8)
            i1.c r7 = r33.o()
            E1.I r7 = androidx.compose.foundation.layout.C5077h.h(r7, r1)
            int r1 = U0.C4883j.a(r15, r1)
            U0.y r8 = r15.s()
            androidx.compose.ui.d r6 = androidx.compose.ui.c.e(r15, r6)
            nI.a r10 = r34.a()
            U0.f r11 = r15.m()
            if (r11 != 0) goto L_0x03ae
            U0.C4883j.c()
        L_0x03ae:
            r15.I()
            boolean r11 = r15.i()
            if (r11 == 0) goto L_0x03bb
            r15.p(r10)
            goto L_0x03be
        L_0x03bb:
            r15.t()
        L_0x03be:
            U0.m r10 = U0.F1.a(r15)
            nI.p r11 = r34.c()
            U0.F1.c(r10, r7, r11)
            nI.p r7 = r34.e()
            U0.F1.c(r10, r8, r7)
            nI.p r7 = r34.b()
            boolean r8 = r10.i()
            if (r8 != 0) goto L_0x03e8
            java.lang.Object r8 = r10.D()
            java.lang.Integer r11 = java.lang.Integer.valueOf(r1)
            boolean r8 = kotlin.jvm.internal.C17542s.e(r8, r11)
            if (r8 != 0) goto L_0x03f6
        L_0x03e8:
            java.lang.Integer r8 = java.lang.Integer.valueOf(r1)
            r10.u(r8)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r10.w(r1, r7)
        L_0x03f6:
            nI.p r1 = r34.d()
            U0.F1.c(r10, r6, r1)
            TC.b$a$a r8 = TC.C13679b.a.C2855a.f116679a
            r1 = r37
            tK.h r1 = r5.a(r15, r1)
            long r10 = r1.G0()
            r1 = 1
            r5 = 0
            androidx.compose.ui.d r1 = androidx.compose.foundation.layout.J.h(r2, r9, r1, r5)
            i1.c r2 = r33.h()
            androidx.compose.ui.d r9 = r4.a(r1, r2)
            r1 = 48
            r1 = r35 | 48
            r2 = 6
            int r2 = r36 >> 6
            r2 = r2 & 14
            r30 = r1 | r2
            r31 = 0
            r32 = 262128(0x3fff0, float:3.6732E-40)
            r12 = 0
            r14 = 0
            r1 = 0
            r2 = r15
            r15 = r1
            r16 = 0
            r17 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r24 = 0
            r25 = 0
            r26 = 0
            r27 = 0
            r28 = 0
            r7 = r0
            r29 = r2
            SC.C13607l.i(r7, r8, r9, r10, r12, r14, r15, r16, r17, r19, r20, r21, r22, r24, r25, r26, r27, r28, r29, r30, r31, r32)
            r2.x()
            goto L_0x044e
        L_0x044d:
            r2 = r15
        L_0x044e:
            r2.P()
            r2.x()
            boolean r1 = U0.C4895p.J()
            if (r1 == 0) goto L_0x045d
            U0.C4895p.R()
        L_0x045d:
            r4 = r3
            r10 = r40
            goto L_0x00a5
        L_0x0462:
            U0.Y0 r7 = r2.n()
            if (r7 == 0) goto L_0x0478
            Bv.H r8 = new Bv.H
            r0 = r8
            r1 = r41
            r2 = r10
            r5 = r46
            r6 = r47
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r7.a(r8)
        L_0x0478:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: Bv.I.b(IC.e, androidx.compose.ui.d, IC.e, nI.a, U0.m, int, int):void");
    }

    /* access modifiers changed from: private */
    public static final C16807N c(C13023e eVar, d dVar, C13023e eVar2, C17631a aVar, int i10, int i11, C4889m mVar, int i12) {
        b(eVar, dVar, eVar2, aVar, mVar, M0.a(i10 | 1), i11);
        return C16807N.f139792a;
    }
}
