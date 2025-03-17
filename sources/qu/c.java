package Qu;

import Pu.g;
import U0.C4889m;
import U0.M0;
import XH.C16807N;
import androidx.compose.ui.d;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a!\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002H\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"LPu/g$c;", "state", "Landroidx/compose/ui/d;", "modifier", "LXH/N;", "b", "(LPu/g$c;Landroidx/compose/ui/d;LU0/m;II)V", "instorepurchasestatus-implementation_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class c {
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0056  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x005d  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x026a  */
    /* JADX WARNING: Removed duplicated region for block: B:52:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void b(Pu.g.c r59, androidx.compose.ui.d r60, U0.C4889m r61, int r62, int r63) {
        /*
            r0 = r59
            r1 = r62
            r2 = r63
            r3 = 2
            r4 = 6
            java.lang.String r5 = "state"
            kotlin.jvm.internal.C17542s.j(r0, r5)
            r5 = -506518886(0xffffffffe1cf229a, float:-4.7762117E20)
            r6 = r61
            U0.m r15 = r6.k(r5)
            r14 = 1
            r6 = r2 & 1
            if (r6 == 0) goto L_0x001e
            r6 = r1 | 6
            goto L_0x002e
        L_0x001e:
            r6 = r1 & 6
            if (r6 != 0) goto L_0x002d
            boolean r6 = r15.F(r0)
            if (r6 == 0) goto L_0x002a
            r6 = 4
            goto L_0x002b
        L_0x002a:
            r6 = r3
        L_0x002b:
            r6 = r6 | r1
            goto L_0x002e
        L_0x002d:
            r6 = r1
        L_0x002e:
            r3 = r3 & r2
            r7 = 32
            if (r3 == 0) goto L_0x0038
            r6 = r6 | 48
        L_0x0035:
            r8 = r60
            goto L_0x0049
        L_0x0038:
            r8 = r1 & 48
            if (r8 != 0) goto L_0x0035
            r8 = r60
            boolean r9 = r15.V(r8)
            if (r9 == 0) goto L_0x0046
            r9 = r7
            goto L_0x0048
        L_0x0046:
            r9 = 16
        L_0x0048:
            r6 = r6 | r9
        L_0x0049:
            r9 = r6 & 19
            r10 = 18
            if (r9 != r10) goto L_0x005d
            boolean r9 = r15.l()
            if (r9 != 0) goto L_0x0056
            goto L_0x005d
        L_0x0056:
            r15.L()
            r3 = r8
            r14 = r15
            goto L_0x0264
        L_0x005d:
            if (r3 == 0) goto L_0x0062
            androidx.compose.ui.d$a r3 = androidx.compose.ui.d.f18749a
            goto L_0x0063
        L_0x0062:
            r3 = r8
        L_0x0063:
            boolean r8 = U0.C4895p.J()
            if (r8 == 0) goto L_0x006f
            r8 = -1
            java.lang.String r9 = "com.ingka.ikea.instorepurchasestatus.impl.presentation.ui.compose.InStorePurchaseContent (InStorePurchaseContent.kt:32)"
            U0.C4895p.S(r5, r6, r8, r9)
        L_0x006f:
            r5 = 0
            r13 = 0
            androidx.compose.ui.d r6 = androidx.compose.foundation.layout.J.f(r3, r5, r14, r13)
            androidx.compose.ui.d r6 = TC.e.i(r6)
            androidx.compose.foundation.layout.d r8 = androidx.compose.foundation.layout.C5073d.f18068a
            androidx.compose.foundation.layout.d$m r8 = r8.g()
            i1.c$a r9 = i1.C5437c.f24302a
            i1.c$b r9 = r9.k()
            r10 = 0
            E1.I r8 = androidx.compose.foundation.layout.C5080k.a(r8, r9, r15, r10)
            int r9 = U0.C4883j.a(r15, r10)
            U0.y r10 = r15.s()
            androidx.compose.ui.d r6 = androidx.compose.ui.c.e(r15, r6)
            G1.g$a r11 = G1.C4504g.f6515W
            nI.a r12 = r11.a()
            U0.f r16 = r15.m()
            if (r16 != 0) goto L_0x00a5
            U0.C4883j.c()
        L_0x00a5:
            r15.I()
            boolean r16 = r15.i()
            if (r16 == 0) goto L_0x00b2
            r15.p(r12)
            goto L_0x00b5
        L_0x00b2:
            r15.t()
        L_0x00b5:
            U0.m r12 = U0.F1.a(r15)
            nI.p r13 = r11.c()
            U0.F1.c(r12, r8, r13)
            nI.p r8 = r11.e()
            U0.F1.c(r12, r10, r8)
            nI.p r8 = r11.b()
            boolean r10 = r12.i()
            if (r10 != 0) goto L_0x00df
            java.lang.Object r10 = r12.D()
            java.lang.Integer r13 = java.lang.Integer.valueOf(r9)
            boolean r10 = kotlin.jvm.internal.C17542s.e(r10, r13)
            if (r10 != 0) goto L_0x00ed
        L_0x00df:
            java.lang.Integer r10 = java.lang.Integer.valueOf(r9)
            r12.u(r10)
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            r12.w(r9, r8)
        L_0x00ed:
            nI.p r8 = r11.d()
            U0.F1.c(r12, r6, r8)
            s0.h r6 = s0.C5862h.f28810a
            androidx.compose.ui.d$a r13 = androidx.compose.ui.d.f18749a
            float r11 = (float) r7
            float r6 = c2.h.B(r11)
            androidx.compose.ui.d r6 = androidx.compose.foundation.layout.J.i(r13, r6)
            s0.C5844O.a(r6, r15, r4)
            int r6 = Mu.a.f83743b
            IC.e r6 = IC.C13026h.a(r6)
            TC.b$b$a r7 = TC.C13679b.C2857b.a.f116683a
            r33 = r7
            r8 = 8
            float r8 = (float) r8
            float r20 = c2.h.B(r8)
            r21 = 7
            r22 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r16 = r13
            androidx.compose.ui.d r8 = androidx.compose.foundation.layout.D.m(r16, r17, r18, r19, r20, r21, r22)
            int r12 = IC.C13023e.f110931a
            r9 = r12 | 432(0x1b0, float:6.05E-43)
            r29 = r9
            r30 = 0
            r31 = 262136(0x3fff8, float:3.67331E-40)
            r9 = 0
            r16 = 0
            r58 = r11
            r5 = r12
            r11 = r16
            r16 = 0
            r4 = r13
            r13 = r16
            r14 = r16
            r60 = r15
            r15 = r16
            r16 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r23 = 0
            r24 = 0
            r25 = 0
            r26 = 0
            r27 = 0
            r28 = r60
            SC.C13607l.i(r6, r7, r8, r9, r11, r13, r14, r15, r16, r18, r19, r20, r21, r23, r24, r25, r26, r27, r28, r29, r30, r31)
            int r6 = Mu.a.f83742a
            IC.e r6 = IC.C13026h.a(r6)
            TC.b$a$b r7 = TC.C13679b.a.C2856b.f116680a
            r29 = r5 | 48
            r31 = 262140(0x3fffc, float:3.67336E-40)
            r8 = 0
            r11 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            SC.C13607l.i(r6, r7, r8, r9, r11, r13, r14, r15, r16, r18, r19, r20, r21, r23, r24, r25, r26, r27, r28, r29, r30, r31)
            float r6 = c2.h.B(r58)
            androidx.compose.ui.d r6 = androidx.compose.foundation.layout.J.i(r4, r6)
            r14 = r60
            r7 = 6
            s0.C5844O.a(r6, r14, r7)
            Pu.g$c$b r6 = r59.d()
            java.lang.String r8 = r59.c()
            Pu.g$c$a r9 = r59.b()
            r59.f()
            int r10 = r5 << 6
            r7 = r5 | r10
            int r10 = r5 << 9
            r12 = r7 | r10
            r13 = 16
            r10 = 0
            r11 = 0
            r7 = r8
            r8 = r9
            r9 = r10
            r10 = r11
            r11 = r14
            Qu.r.n(r6, r7, r8, r9, r10, r11, r12, r13)
            float r6 = c2.h.B(r58)
            androidx.compose.ui.d r6 = androidx.compose.foundation.layout.J.i(r4, r6)
            r7 = 6
            s0.C5844O.a(r6, r14, r7)
            int r6 = Mu.a.f83745d
            IC.e r32 = IC.C13026h.a(r6)
            r55 = r5 | 48
            r56 = 0
            r57 = 262140(0x3fffc, float:3.67336E-40)
            r34 = 0
            r35 = 0
            r37 = 0
            r39 = 0
            r40 = 0
            r41 = 0
            r42 = 0
            r44 = 0
            r45 = 0
            r46 = 0
            r47 = 0
            r49 = 0
            r50 = 0
            r51 = 0
            r52 = 0
            r53 = 0
            r54 = r14
            SC.C13607l.i(r32, r33, r34, r35, r37, r39, r40, r41, r42, r44, r45, r46, r47, r49, r50, r51, r52, r53, r54, r55, r56, r57)
            float r6 = c2.h.B(r58)
            androidx.compose.ui.d r6 = androidx.compose.foundation.layout.J.i(r4, r6)
            r7 = 6
            s0.C5844O.a(r6, r14, r7)
            int r6 = Oo.b.f84393H5
            IC.e r6 = IC.C13026h.a(r6)
            java.lang.String r6 = r6.a(r14, r5)
            RC.n$a r7 = new RC.n$a
            Pu.g$c$c r8 = r59.e()
            qx.c r8 = r8.b()
            Pu.g$c$c r9 = r59.e()
            kp.d r9 = r9.a()
            r7.<init>(r8, r9)
            int r15 = RC.n.a.f115374d
            int r12 = r15 << 3
            r13 = 28
            r8 = 0
            r9 = 0
            r10 = 0
            RC.v.n(r6, r7, r8, r9, r10, r11, r12, r13)
            r6 = 24
            float r6 = (float) r6
            float r6 = c2.h.B(r6)
            r7 = 1
            r8 = 0
            r9 = 0
            androidx.compose.ui.d r6 = androidx.compose.foundation.layout.D.k(r4, r8, r6, r7, r9)
            r11 = 6
            r12 = 6
            r7 = 0
            r8 = 0
            r10 = r14
            SC.C13643u0.c(r6, r7, r8, r10, r11, r12)
            int r4 = Mu.a.f83746e
            IC.e r4 = IC.C13026h.a(r4)
            java.lang.String r6 = r4.a(r14, r5)
            RC.n$a r7 = new RC.n$a
            Pu.g$c$c r4 = r59.e()
            qx.c r4 = r4.c()
            Pu.g$c$c r5 = r59.e()
            kp.d r5 = r5.a()
            r7.<init>(r4, r5)
            int r12 = r15 << 3
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = r14
            RC.v.n(r6, r7, r8, r9, r10, r11, r12, r13)
            r14.x()
            boolean r4 = U0.C4895p.J()
            if (r4 == 0) goto L_0x0264
            U0.C4895p.R()
        L_0x0264:
            U0.Y0 r4 = r14.n()
            if (r4 == 0) goto L_0x0272
            Qu.b r5 = new Qu.b
            r5.<init>(r0, r3, r1, r2)
            r4.a(r5)
        L_0x0272:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: Qu.c.b(Pu.g$c, androidx.compose.ui.d, U0.m, int, int):void");
    }

    /* access modifiers changed from: private */
    public static final C16807N c(g.c cVar, d dVar, int i10, int i11, C4889m mVar, int i12) {
        b(cVar, dVar, mVar, M0.a(i10 | 1), i11);
        return C16807N.f139792a;
    }
}
