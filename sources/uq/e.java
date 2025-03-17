package Uq;

import IC.C13023e;
import U0.C4889m;
import U0.M0;
import XH.C16807N;
import androidx.compose.ui.d;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a)\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0003H\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"LIC/e;", "title", "description", "Landroidx/compose/ui/d;", "modifier", "LXH/N;", "b", "(LIC/e;LIC/e;Landroidx/compose/ui/d;LU0/m;II)V", "familyrewards-implementation_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class e {
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0086  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x008d  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x0192  */
    /* JADX WARNING: Removed duplicated region for block: B:70:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void b(IC.C13023e r33, IC.C13023e r34, androidx.compose.ui.d r35, U0.C4889m r36, int r37, int r38) {
        /*
            r1 = r33
            r2 = r34
            r4 = r37
            r0 = 2
            r3 = 6
            java.lang.String r5 = "title"
            kotlin.jvm.internal.C17542s.j(r1, r5)
            java.lang.String r5 = "description"
            kotlin.jvm.internal.C17542s.j(r2, r5)
            r5 = 1175684064(0x461383e0, float:9440.969)
            r6 = r36
            U0.m r15 = r6.k(r5)
            r6 = r38 & 1
            r7 = 4
            if (r6 == 0) goto L_0x0023
            r6 = r4 | 6
            goto L_0x003c
        L_0x0023:
            r6 = r4 & 6
            if (r6 != 0) goto L_0x003b
            r6 = r4 & 8
            if (r6 != 0) goto L_0x0030
            boolean r6 = r15.V(r1)
            goto L_0x0034
        L_0x0030:
            boolean r6 = r15.F(r1)
        L_0x0034:
            if (r6 == 0) goto L_0x0038
            r6 = r7
            goto L_0x0039
        L_0x0038:
            r6 = r0
        L_0x0039:
            r6 = r6 | r4
            goto L_0x003c
        L_0x003b:
            r6 = r4
        L_0x003c:
            r0 = r38 & 2
            if (r0 == 0) goto L_0x0043
            r6 = r6 | 48
            goto L_0x005c
        L_0x0043:
            r0 = r4 & 48
            if (r0 != 0) goto L_0x005c
            r0 = r4 & 64
            if (r0 != 0) goto L_0x0050
            boolean r0 = r15.V(r2)
            goto L_0x0054
        L_0x0050:
            boolean r0 = r15.F(r2)
        L_0x0054:
            if (r0 == 0) goto L_0x0059
            r0 = 32
            goto L_0x005b
        L_0x0059:
            r0 = 16
        L_0x005b:
            r6 = r6 | r0
        L_0x005c:
            r0 = r38 & 4
            if (r0 == 0) goto L_0x0066
            r6 = r6 | 384(0x180, float:5.38E-43)
        L_0x0062:
            r8 = r35
        L_0x0064:
            r14 = r6
            goto L_0x0079
        L_0x0066:
            r8 = r4 & 384(0x180, float:5.38E-43)
            if (r8 != 0) goto L_0x0062
            r8 = r35
            boolean r9 = r15.V(r8)
            if (r9 == 0) goto L_0x0075
            r9 = 256(0x100, float:3.59E-43)
            goto L_0x0077
        L_0x0075:
            r9 = 128(0x80, float:1.794E-43)
        L_0x0077:
            r6 = r6 | r9
            goto L_0x0064
        L_0x0079:
            r6 = r14 & 147(0x93, float:2.06E-43)
            r9 = 146(0x92, float:2.05E-43)
            if (r6 != r9) goto L_0x008d
            boolean r6 = r15.l()
            if (r6 != 0) goto L_0x0086
            goto L_0x008d
        L_0x0086:
            r15.L()
            r3 = r8
            r5 = r15
            goto L_0x018c
        L_0x008d:
            if (r0 == 0) goto L_0x0092
            androidx.compose.ui.d$a r0 = androidx.compose.ui.d.f18749a
            goto L_0x0093
        L_0x0092:
            r0 = r8
        L_0x0093:
            boolean r6 = U0.C4895p.J()
            if (r6 == 0) goto L_0x009f
            r6 = -1
            java.lang.String r8 = "com.ingka.ikea.familyrewards.implementation.compose.bottomsheet.TitleAndDescription (TitleAndDescription.kt:22)"
            U0.C4895p.S(r5, r14, r6, r8)
        L_0x009f:
            androidx.compose.foundation.layout.d r5 = androidx.compose.foundation.layout.C5073d.f18068a
            float r6 = (float) r7
            float r6 = c2.h.B(r6)
            androidx.compose.foundation.layout.d$f r5 = r5.n(r6)
            i1.c$a r6 = i1.C5437c.f24302a
            i1.c$b r6 = r6.k()
            E1.I r3 = androidx.compose.foundation.layout.C5080k.a(r5, r6, r15, r3)
            r5 = 0
            int r5 = U0.C4883j.a(r15, r5)
            U0.y r6 = r15.s()
            androidx.compose.ui.d r7 = androidx.compose.ui.c.e(r15, r0)
            G1.g$a r8 = G1.C4504g.f6515W
            nI.a r9 = r8.a()
            U0.f r10 = r15.m()
            if (r10 != 0) goto L_0x00d0
            U0.C4883j.c()
        L_0x00d0:
            r15.I()
            boolean r10 = r15.i()
            if (r10 == 0) goto L_0x00dd
            r15.p(r9)
            goto L_0x00e0
        L_0x00dd:
            r15.t()
        L_0x00e0:
            U0.m r9 = U0.F1.a(r15)
            nI.p r10 = r8.c()
            U0.F1.c(r9, r3, r10)
            nI.p r3 = r8.e()
            U0.F1.c(r9, r6, r3)
            nI.p r3 = r8.b()
            boolean r6 = r9.i()
            if (r6 != 0) goto L_0x010a
            java.lang.Object r6 = r9.D()
            java.lang.Integer r10 = java.lang.Integer.valueOf(r5)
            boolean r6 = kotlin.jvm.internal.C17542s.e(r6, r10)
            if (r6 != 0) goto L_0x0118
        L_0x010a:
            java.lang.Integer r6 = java.lang.Integer.valueOf(r5)
            r9.u(r6)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r9.w(r5, r3)
        L_0x0118:
            nI.p r3 = r8.d()
            U0.F1.c(r9, r7, r3)
            s0.h r3 = s0.C5862h.f28810a
            int r3 = IC.C13023e.f110931a
            r5 = r14 & 14
            r5 = r5 | r3
            java.lang.String r6 = r1.a(r15, r5)
            TC.b$b$a r7 = TC.C13679b.C2857b.a.f116683a
            androidx.compose.ui.d$a r5 = androidx.compose.ui.d.f18749a
            java.lang.String r8 = "TestTag-Title"
            androidx.compose.ui.d r8 = androidx.compose.ui.platform.C5116k1.a(r5, r8)
            r30 = 0
            r31 = 262136(0x3fff8, float:3.67331E-40)
            r9 = 0
            r11 = 0
            r13 = 0
            r16 = 0
            r32 = r14
            r14 = r16
            r35 = r15
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
            r29 = 432(0x1b0, float:6.05E-43)
            r28 = r35
            SC.C13607l.j(r6, r7, r8, r9, r11, r13, r14, r15, r16, r18, r19, r20, r21, r23, r24, r25, r26, r27, r28, r29, r30, r31)
            int r6 = r32 >> 3
            r6 = r6 & 14
            r3 = r3 | r6
            r15 = r35
            java.lang.String r6 = r2.a(r15, r3)
            TC.b$a$b r7 = TC.C13679b.a.C2856b.f116680a
            java.lang.String r3 = "TestTag-Description"
            androidx.compose.ui.d r8 = androidx.compose.ui.platform.C5116k1.a(r5, r3)
            r14 = 0
            r3 = 0
            r5 = r15
            r15 = r3
            r28 = r5
            SC.C13607l.j(r6, r7, r8, r9, r11, r13, r14, r15, r16, r18, r19, r20, r21, r23, r24, r25, r26, r27, r28, r29, r30, r31)
            r5.x()
            boolean r3 = U0.C4895p.J()
            if (r3 == 0) goto L_0x018b
            U0.C4895p.R()
        L_0x018b:
            r3 = r0
        L_0x018c:
            U0.Y0 r6 = r5.n()
            if (r6 == 0) goto L_0x01a3
            Uq.d r7 = new Uq.d
            r0 = r7
            r1 = r33
            r2 = r34
            r4 = r37
            r5 = r38
            r0.<init>(r1, r2, r3, r4, r5)
            r6.a(r7)
        L_0x01a3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: Uq.e.b(IC.e, IC.e, androidx.compose.ui.d, U0.m, int, int):void");
    }

    /* access modifiers changed from: private */
    public static final C16807N c(C13023e eVar, C13023e eVar2, d dVar, int i10, int i11, C4889m mVar, int i12) {
        b(eVar, eVar2, dVar, mVar, M0.a(i10 | 1), i11);
        return C16807N.f139792a;
    }
}
