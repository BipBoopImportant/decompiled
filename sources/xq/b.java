package Xq;

import IC.C13023e;
import U0.C4889m;
import U0.M0;
import XH.C16807N;
import androidx.compose.ui.d;
import kotlin.Metadata;
import nI.C17631a;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a7\u0010\t\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0001¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"", "progress", "LIC/e;", "keysNeeded", "Landroidx/compose/ui/d;", "modifier", "Lkotlin/Function0;", "LXH/N;", "onClick", "b", "(FLIC/e;Landroidx/compose/ui/d;LnI/a;LU0/m;II)V", "familyrewards-implementation_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class b {
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0074  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0078  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x0096  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x009e  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x01f4  */
    /* JADX WARNING: Removed duplicated region for block: B:76:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void b(float r34, IC.C13023e r35, androidx.compose.ui.d r36, nI.C17631a<XH.C16807N> r37, U0.C4889m r38, int r39, int r40) {
        /*
            r1 = r34
            r2 = r35
            r0 = r37
            r15 = r39
            r3 = 4
            java.lang.String r4 = "keysNeeded"
            kotlin.jvm.internal.C17542s.j(r2, r4)
            java.lang.String r4 = "onClick"
            kotlin.jvm.internal.C17542s.j(r0, r4)
            r4 = -2119794788(0xffffffff81a67f9c, float:-6.116188E-38)
            r5 = r38
            U0.m r14 = r5.k(r4)
            r13 = 1
            r5 = r40 & 1
            r12 = 2
            if (r5 == 0) goto L_0x0025
            r5 = r15 | 6
            goto L_0x0035
        L_0x0025:
            r5 = r15 & 6
            if (r5 != 0) goto L_0x0034
            boolean r5 = r14.c(r1)
            if (r5 == 0) goto L_0x0031
            r5 = r3
            goto L_0x0032
        L_0x0031:
            r5 = r12
        L_0x0032:
            r5 = r5 | r15
            goto L_0x0035
        L_0x0034:
            r5 = r15
        L_0x0035:
            r6 = r40 & 2
            if (r6 == 0) goto L_0x003c
            r5 = r5 | 48
            goto L_0x0055
        L_0x003c:
            r6 = r15 & 48
            if (r6 != 0) goto L_0x0055
            r6 = r15 & 64
            if (r6 != 0) goto L_0x0049
            boolean r6 = r14.V(r2)
            goto L_0x004d
        L_0x0049:
            boolean r6 = r14.F(r2)
        L_0x004d:
            if (r6 == 0) goto L_0x0052
            r6 = 32
            goto L_0x0054
        L_0x0052:
            r6 = 16
        L_0x0054:
            r5 = r5 | r6
        L_0x0055:
            r3 = r40 & 4
            if (r3 == 0) goto L_0x005e
            r5 = r5 | 384(0x180, float:5.38E-43)
        L_0x005b:
            r6 = r36
            goto L_0x0070
        L_0x005e:
            r6 = r15 & 384(0x180, float:5.38E-43)
            if (r6 != 0) goto L_0x005b
            r6 = r36
            boolean r7 = r14.V(r6)
            if (r7 == 0) goto L_0x006d
            r7 = 256(0x100, float:3.59E-43)
            goto L_0x006f
        L_0x006d:
            r7 = 128(0x80, float:1.794E-43)
        L_0x006f:
            r5 = r5 | r7
        L_0x0070:
            r7 = r40 & 8
            if (r7 == 0) goto L_0x0078
            r5 = r5 | 3072(0xc00, float:4.305E-42)
        L_0x0076:
            r11 = r5
            goto L_0x0089
        L_0x0078:
            r7 = r15 & 3072(0xc00, float:4.305E-42)
            if (r7 != 0) goto L_0x0076
            boolean r7 = r14.F(r0)
            if (r7 == 0) goto L_0x0085
            r7 = 2048(0x800, float:2.87E-42)
            goto L_0x0087
        L_0x0085:
            r7 = 1024(0x400, float:1.435E-42)
        L_0x0087:
            r5 = r5 | r7
            goto L_0x0076
        L_0x0089:
            r5 = r11 & 1171(0x493, float:1.641E-42)
            r7 = 1170(0x492, float:1.64E-42)
            if (r5 != r7) goto L_0x009e
            boolean r5 = r14.l()
            if (r5 != 0) goto L_0x0096
            goto L_0x009e
        L_0x0096:
            r14.L()
            r31 = r6
            r3 = r14
            goto L_0x01ee
        L_0x009e:
            if (r3 == 0) goto L_0x00a4
            androidx.compose.ui.d$a r3 = androidx.compose.ui.d.f18749a
            r10 = r3
            goto L_0x00a5
        L_0x00a4:
            r10 = r6
        L_0x00a5:
            boolean r3 = U0.C4895p.J()
            if (r3 == 0) goto L_0x00b1
            r3 = -1
            java.lang.String r5 = "com.ingka.ikea.familyrewards.implementation.compose.details.component.CollectMoreKeys (CollectMoreKeys.kt:36)"
            U0.C4895p.S(r4, r11, r3, r5)
        L_0x00b1:
            androidx.compose.foundation.layout.d r3 = androidx.compose.foundation.layout.C5073d.f18068a
            androidx.compose.foundation.layout.d$m r3 = r3.g()
            i1.c$a r4 = i1.C5437c.f24302a
            i1.c$b r4 = r4.k()
            r9 = 0
            E1.I r3 = androidx.compose.foundation.layout.C5080k.a(r3, r4, r14, r9)
            int r4 = U0.C4883j.a(r14, r9)
            U0.y r5 = r14.s()
            androidx.compose.ui.d r6 = androidx.compose.ui.c.e(r14, r10)
            G1.g$a r7 = G1.C4504g.f6515W
            nI.a r8 = r7.a()
            U0.f r16 = r14.m()
            if (r16 != 0) goto L_0x00dd
            U0.C4883j.c()
        L_0x00dd:
            r14.I()
            boolean r16 = r14.i()
            if (r16 == 0) goto L_0x00ea
            r14.p(r8)
            goto L_0x00ed
        L_0x00ea:
            r14.t()
        L_0x00ed:
            U0.m r8 = U0.F1.a(r14)
            nI.p r12 = r7.c()
            U0.F1.c(r8, r3, r12)
            nI.p r3 = r7.e()
            U0.F1.c(r8, r5, r3)
            nI.p r3 = r7.b()
            boolean r5 = r8.i()
            if (r5 != 0) goto L_0x0117
            java.lang.Object r5 = r8.D()
            java.lang.Integer r12 = java.lang.Integer.valueOf(r4)
            boolean r5 = kotlin.jvm.internal.C17542s.e(r5, r12)
            if (r5 != 0) goto L_0x0125
        L_0x0117:
            java.lang.Integer r5 = java.lang.Integer.valueOf(r4)
            r8.u(r5)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r8.w(r4, r3)
        L_0x0125:
            nI.p r3 = r7.d()
            U0.F1.c(r8, r6, r3)
            s0.h r3 = s0.C5862h.f28810a
            int r3 = Rq.e.f86994o
            java.lang.String r3 = J1.j.b(r3, r14, r9)
            androidx.compose.ui.d$a r12 = androidx.compose.ui.d.f18749a
            java.lang.String r4 = "TestTag-Button"
            androidx.compose.ui.d r4 = androidx.compose.ui.platform.C5116k1.a(r12, r4)
            r8 = 0
            r7 = 0
            androidx.compose.ui.d r4 = androidx.compose.foundation.layout.J.h(r4, r8, r13, r7)
            int r5 = uK.C18146a.f148445g
            java.lang.Integer r16 = java.lang.Integer.valueOf(r5)
            int r5 = r11 << 18
            r6 = 1879048192(0x70000000, float:1.58456325E29)
            r5 = r5 & r6
            r17 = r5 | 48
            r18 = 444(0x1bc, float:6.22E-43)
            r5 = 0
            r6 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r7 = r19
            r8 = r20
            r9 = r16
            r31 = r10
            r10 = r21
            r16 = r11
            r11 = r22
            r32 = r12
            r12 = r37
            r13 = r14
            r33 = r14
            r14 = r17
            r15 = r18
            SC.L.b(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            r3 = r33
            r4 = 0
            Rq.d.f(r3, r4)
            java.lang.String r5 = "TestTag-ProgressBar"
            r7 = r32
            androidx.compose.ui.d r5 = androidx.compose.ui.platform.C5116k1.a(r7, r5)
            r6 = 40
            float r6 = (float) r6
            float r6 = c2.h.B(r6)
            r8 = 2
            r9 = 0
            r10 = 0
            androidx.compose.ui.d r5 = androidx.compose.foundation.layout.D.k(r5, r6, r9, r8, r10)
            r6 = r16 & 14
            r6 = r6 | 48
            sr.o.d(r1, r5, r3, r6, r4)
            Rq.d.h(r3, r4)
            int r4 = IC.C13023e.f110931a
            int r5 = r16 >> 3
            r5 = r5 & 14
            r4 = r4 | r5
            java.lang.String r5 = r2.a(r3, r4)
            TC.b$a$c r6 = TC.C13679b.a.c.f116681a
            Y1.j$a r4 = Y1.j.f14783b
            int r4 = r4.a()
            java.lang.String r8 = "TestTag-KeysNeeded"
            androidx.compose.ui.d r7 = androidx.compose.ui.platform.C5116k1.a(r7, r8)
            r8 = 1
            androidx.compose.ui.d r7 = androidx.compose.foundation.layout.J.h(r7, r9, r8, r10)
            Y1.j r18 = Y1.j.h(r4)
            r29 = 0
            r30 = 261112(0x3fbf8, float:3.65896E-40)
            r8 = 0
            r10 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r17 = 0
            r20 = 0
            r22 = 0
            r23 = 0
            r24 = 0
            r25 = 0
            r26 = 0
            r28 = 432(0x1b0, float:6.05E-43)
            r27 = r3
            SC.C13607l.j(r5, r6, r7, r8, r10, r12, r13, r14, r15, r17, r18, r19, r20, r22, r23, r24, r25, r26, r27, r28, r29, r30)
            r3.x()
            boolean r4 = U0.C4895p.J()
            if (r4 == 0) goto L_0x01ee
            U0.C4895p.R()
        L_0x01ee:
            U0.Y0 r7 = r3.n()
            if (r7 == 0) goto L_0x0209
            Xq.a r8 = new Xq.a
            r0 = r8
            r1 = r34
            r2 = r35
            r3 = r31
            r4 = r37
            r5 = r39
            r6 = r40
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r7.a(r8)
        L_0x0209:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: Xq.b.b(float, IC.e, androidx.compose.ui.d, nI.a, U0.m, int, int):void");
    }

    /* access modifiers changed from: private */
    public static final C16807N c(float f10, C13023e eVar, d dVar, C17631a aVar, int i10, int i11, C4889m mVar, int i12) {
        b(f10, eVar, dVar, aVar, mVar, M0.a(i10 | 1), i11);
        return C16807N.f139792a;
    }
}
