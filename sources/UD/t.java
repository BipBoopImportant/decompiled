package UD;

import IC.C13019a;
import U0.C4889m;
import U0.M0;
import XH.C16807N;
import androidx.compose.ui.d;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a)\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"", "userName", "LIC/a;", "greeting", "Landroidx/compose/ui/d;", "modifier", "LXH/N;", "b", "(Ljava/lang/String;LIC/a;Landroidx/compose/ui/d;LU0/m;II)V", "welcome-implementation_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class t {
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0073  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x007a  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x01db  */
    /* JADX WARNING: Removed duplicated region for block: B:63:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void b(java.lang.String r43, IC.C13019a r44, androidx.compose.ui.d r45, U0.C4889m r46, int r47, int r48) {
        /*
            r0 = r43
            r15 = r44
            r14 = r47
            r1 = 2
            r2 = 4
            r12 = 6
            java.lang.String r3 = "userName"
            kotlin.jvm.internal.C17542s.j(r0, r3)
            java.lang.String r3 = "greeting"
            kotlin.jvm.internal.C17542s.j(r15, r3)
            r3 = 1911343411(0x71ecc933, float:2.3450143E30)
            r4 = r46
            U0.m r10 = r4.k(r3)
            r4 = 1
            r5 = r48 & 1
            if (r5 == 0) goto L_0x0024
            r5 = r14 | 6
            goto L_0x0034
        L_0x0024:
            r5 = r14 & 6
            if (r5 != 0) goto L_0x0033
            boolean r5 = r10.V(r0)
            if (r5 == 0) goto L_0x0030
            r5 = r2
            goto L_0x0031
        L_0x0030:
            r5 = r1
        L_0x0031:
            r5 = r5 | r14
            goto L_0x0034
        L_0x0033:
            r5 = r14
        L_0x0034:
            r1 = r48 & 2
            if (r1 == 0) goto L_0x003b
            r5 = r5 | 48
            goto L_0x004b
        L_0x003b:
            r1 = r14 & 48
            if (r1 != 0) goto L_0x004b
            boolean r1 = r10.V(r15)
            if (r1 == 0) goto L_0x0048
            r1 = 32
            goto L_0x004a
        L_0x0048:
            r1 = 16
        L_0x004a:
            r5 = r5 | r1
        L_0x004b:
            r1 = r48 & 4
            if (r1 == 0) goto L_0x0054
            r5 = r5 | 384(0x180, float:5.38E-43)
        L_0x0051:
            r2 = r45
            goto L_0x0066
        L_0x0054:
            r2 = r14 & 384(0x180, float:5.38E-43)
            if (r2 != 0) goto L_0x0051
            r2 = r45
            boolean r6 = r10.V(r2)
            if (r6 == 0) goto L_0x0063
            r6 = 256(0x100, float:3.59E-43)
            goto L_0x0065
        L_0x0063:
            r6 = 128(0x80, float:1.794E-43)
        L_0x0065:
            r5 = r5 | r6
        L_0x0066:
            r6 = r5 & 147(0x93, float:2.06E-43)
            r7 = 146(0x92, float:2.05E-43)
            if (r6 != r7) goto L_0x007a
            boolean r6 = r10.l()
            if (r6 != 0) goto L_0x0073
            goto L_0x007a
        L_0x0073:
            r10.L()
            r3 = r2
            r1 = r10
            goto L_0x01d5
        L_0x007a:
            if (r1 == 0) goto L_0x0080
            androidx.compose.ui.d$a r1 = androidx.compose.ui.d.f18749a
            r11 = r1
            goto L_0x0081
        L_0x0080:
            r11 = r2
        L_0x0081:
            boolean r1 = U0.C4895p.J()
            if (r1 == 0) goto L_0x008d
            r1 = -1
            java.lang.String r2 = "com.ingka.ikea.welcome.impl.presentation.promo.compose.UserInformation (UserInformation.kt:26)"
            U0.C4895p.S(r3, r5, r1, r2)
        L_0x008d:
            r1 = 0
            r2 = 0
            androidx.compose.ui.d r1 = androidx.compose.foundation.layout.J.h(r11, r1, r4, r2)
            java.lang.String r2 = "USER_GREETING_CONTAINER"
            androidx.compose.ui.d r1 = androidx.compose.ui.platform.C5116k1.a(r1, r2)
            i1.c$a r2 = i1.C5437c.f24302a
            i1.c$b r2 = r2.g()
            androidx.compose.foundation.layout.d r3 = androidx.compose.foundation.layout.C5073d.f18068a
            androidx.compose.foundation.layout.d$f r3 = r3.b()
            r4 = 54
            E1.I r2 = androidx.compose.foundation.layout.C5080k.a(r3, r2, r10, r4)
            r3 = 0
            int r3 = U0.C4883j.a(r10, r3)
            U0.y r4 = r10.s()
            androidx.compose.ui.d r1 = androidx.compose.ui.c.e(r10, r1)
            G1.g$a r6 = G1.C4504g.f6515W
            nI.a r7 = r6.a()
            U0.f r8 = r10.m()
            if (r8 != 0) goto L_0x00c7
            U0.C4883j.c()
        L_0x00c7:
            r10.I()
            boolean r8 = r10.i()
            if (r8 == 0) goto L_0x00d4
            r10.p(r7)
            goto L_0x00d7
        L_0x00d4:
            r10.t()
        L_0x00d7:
            U0.m r7 = U0.F1.a(r10)
            nI.p r8 = r6.c()
            U0.F1.c(r7, r2, r8)
            nI.p r2 = r6.e()
            U0.F1.c(r7, r4, r2)
            nI.p r2 = r6.b()
            boolean r4 = r7.i()
            if (r4 != 0) goto L_0x0101
            java.lang.Object r4 = r7.D()
            java.lang.Integer r8 = java.lang.Integer.valueOf(r3)
            boolean r4 = kotlin.jvm.internal.C17542s.e(r4, r8)
            if (r4 != 0) goto L_0x010f
        L_0x0101:
            java.lang.Integer r4 = java.lang.Integer.valueOf(r3)
            r7.u(r4)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r7.w(r3, r2)
        L_0x010f:
            nI.p r2 = r6.d()
            U0.F1.c(r7, r1, r2)
            s0.h r1 = s0.C5862h.f28810a
            IC.e r1 = r44.b()
            int r2 = IC.C13023e.f110931a
            java.lang.String r16 = r1.a(r10, r2)
            tK.v r1 = tK.C18030v.f147664a
            int r3 = tK.C18030v.f147665b
            tK.h r2 = r1.a(r10, r3)
            long r19 = r2.F0()
            TC.b$b$c r17 = TC.C13679b.C2857b.c.f116685a
            Y1.j$a r6 = Y1.j.f14783b
            int r2 = r6.a()
            Y1.j r29 = Y1.j.h(r2)
            r40 = 0
            r41 = 261108(0x3fbf4, float:3.6589E-40)
            r18 = 0
            r21 = 0
            r23 = 0
            r24 = 0
            r25 = 0
            r26 = 0
            r28 = 0
            r30 = 0
            r31 = 0
            r33 = 0
            r34 = 0
            r35 = 0
            r36 = 0
            r37 = 0
            r39 = 48
            r38 = r10
            SC.C13607l.j(r16, r17, r18, r19, r21, r23, r24, r25, r26, r28, r29, r30, r31, r33, r34, r35, r36, r37, r38, r39, r40, r41)
            androidx.compose.ui.d$a r9 = androidx.compose.ui.d.f18749a
            java.lang.String r2 = "USER_NAME_LABEL"
            androidx.compose.ui.d r2 = androidx.compose.ui.platform.C5116k1.a(r9, r2)
            tK.h r1 = r1.a(r10, r3)
            long r3 = r1.F0()
            TC.b$b$d r1 = TC.C13679b.C2857b.d.f116686a
            int r6 = r6.a()
            Y1.j r13 = Y1.j.h(r6)
            r5 = r5 & 14
            r5 = r5 | 432(0x1b0, float:6.05E-43)
            r23 = r5
            r24 = 0
            r25 = 261104(0x3fbf0, float:3.65885E-40)
            r5 = 0
            r7 = 0
            r8 = 0
            r16 = 0
            r42 = r9
            r9 = r16
            r16 = 0
            r45 = r10
            r26 = r11
            r10 = r16
            r16 = 0
            r12 = r16
            r14 = r16
            r16 = 0
            r15 = r16
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r0 = r43
            r22 = r45
            SC.C13607l.j(r0, r1, r2, r3, r5, r7, r8, r9, r10, r12, r13, r14, r15, r17, r18, r19, r20, r21, r22, r23, r24, r25)
            r0 = 72
            float r0 = (float) r0
            float r0 = c2.h.B(r0)
            r1 = r42
            androidx.compose.ui.d r0 = androidx.compose.foundation.layout.J.i(r1, r0)
            r1 = r45
            r2 = 6
            s0.C5844O.a(r0, r1, r2)
            r1.x()
            boolean r0 = U0.C4895p.J()
            if (r0 == 0) goto L_0x01d3
            U0.C4895p.R()
        L_0x01d3:
            r3 = r26
        L_0x01d5:
            U0.Y0 r6 = r1.n()
            if (r6 == 0) goto L_0x01ec
            UD.s r7 = new UD.s
            r0 = r7
            r1 = r43
            r2 = r44
            r4 = r47
            r5 = r48
            r0.<init>(r1, r2, r3, r4, r5)
            r6.a(r7)
        L_0x01ec:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: UD.t.b(java.lang.String, IC.a, androidx.compose.ui.d, U0.m, int, int):void");
    }

    /* access modifiers changed from: private */
    public static final C16807N c(String str, C13019a aVar, d dVar, int i10, int i11, C4889m mVar, int i12) {
        b(str, aVar, dVar, mVar, M0.a(i10 | 1), i11);
        return C16807N.f139792a;
    }
}
