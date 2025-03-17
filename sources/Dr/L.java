package dr;

import IC.C13023e;
import U0.C4889m;
import U0.M0;
import XH.C16807N;
import androidx.compose.ui.d;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a!\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002H\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"LIC/e;", "title", "Landroidx/compose/ui/d;", "modifier", "LXH/N;", "b", "(LIC/e;Landroidx/compose/ui/d;LU0/m;II)V", "familyrewards-implementation_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class L {
    /* JADX WARNING: Removed duplicated region for block: B:29:0x005d  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0063  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x016e  */
    /* JADX WARNING: Removed duplicated region for block: B:56:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void b(IC.C13023e r31, androidx.compose.ui.d r32, U0.C4889m r33, int r34, int r35) {
        /*
            r0 = r31
            r1 = r34
            r2 = r35
            java.lang.String r3 = "title"
            kotlin.jvm.internal.C17542s.j(r0, r3)
            r3 = -389471303(0xffffffffe8c923b9, float:-7.598837E24)
            r4 = r33
            U0.m r14 = r4.k(r3)
            r4 = r2 & 1
            r5 = 2
            if (r4 == 0) goto L_0x001c
            r4 = r1 | 6
            goto L_0x0035
        L_0x001c:
            r4 = r1 & 6
            if (r4 != 0) goto L_0x0034
            r4 = r1 & 8
            if (r4 != 0) goto L_0x0029
            boolean r4 = r14.V(r0)
            goto L_0x002d
        L_0x0029:
            boolean r4 = r14.F(r0)
        L_0x002d:
            if (r4 == 0) goto L_0x0031
            r4 = 4
            goto L_0x0032
        L_0x0031:
            r4 = r5
        L_0x0032:
            r4 = r4 | r1
            goto L_0x0035
        L_0x0034:
            r4 = r1
        L_0x0035:
            r6 = r2 & 2
            if (r6 == 0) goto L_0x003e
            r4 = r4 | 48
        L_0x003b:
            r7 = r32
            goto L_0x0050
        L_0x003e:
            r7 = r1 & 48
            if (r7 != 0) goto L_0x003b
            r7 = r32
            boolean r8 = r14.V(r7)
            if (r8 == 0) goto L_0x004d
            r8 = 32
            goto L_0x004f
        L_0x004d:
            r8 = 16
        L_0x004f:
            r4 = r4 | r8
        L_0x0050:
            r8 = r4 & 19
            r9 = 18
            if (r8 != r9) goto L_0x0063
            boolean r8 = r14.l()
            if (r8 != 0) goto L_0x005d
            goto L_0x0063
        L_0x005d:
            r14.L()
            r3 = r14
            goto L_0x0168
        L_0x0063:
            if (r6 == 0) goto L_0x0069
            androidx.compose.ui.d$a r6 = androidx.compose.ui.d.f18749a
            r15 = r6
            goto L_0x006a
        L_0x0069:
            r15 = r7
        L_0x006a:
            boolean r6 = U0.C4895p.J()
            if (r6 == 0) goto L_0x0076
            r6 = -1
            java.lang.String r7 = "com.ingka.ikea.familyrewards.implementation.compose.rewards.SectionTitle (SectionTitle.kt:38)"
            U0.C4895p.S(r3, r4, r6, r7)
        L_0x0076:
            s0.T$a r3 = s0.C5848T.f28733a
            r6 = 6
            s0.T r3 = s0.a0.c(r3, r14, r6)
            s0.Y$a r6 = s0.C5853Y.f28774a
            int r6 = r6.f()
            s0.T r3 = s0.C5850V.i(r3, r6)
            r6 = 80
            float r6 = (float) r6
            float r6 = c2.h.B(r6)
            r7 = 0
            r8 = 0
            androidx.compose.ui.d r5 = androidx.compose.foundation.layout.J.k(r15, r6, r7, r5, r8)
            androidx.compose.ui.d r3 = s0.C5851W.d(r5, r3)
            i1.c$a r6 = i1.C5437c.f24302a
            i1.c r5 = r6.o()
            r7 = 0
            E1.I r5 = androidx.compose.foundation.layout.C5077h.h(r5, r7)
            int r7 = U0.C4883j.a(r14, r7)
            U0.y r8 = r14.s()
            androidx.compose.ui.d r3 = androidx.compose.ui.c.e(r14, r3)
            G1.g$a r9 = G1.C4504g.f6515W
            nI.a r10 = r9.a()
            U0.f r11 = r14.m()
            if (r11 != 0) goto L_0x00be
            U0.C4883j.c()
        L_0x00be:
            r14.I()
            boolean r11 = r14.i()
            if (r11 == 0) goto L_0x00cb
            r14.p(r10)
            goto L_0x00ce
        L_0x00cb:
            r14.t()
        L_0x00ce:
            U0.m r10 = U0.F1.a(r14)
            nI.p r11 = r9.c()
            U0.F1.c(r10, r5, r11)
            nI.p r5 = r9.e()
            U0.F1.c(r10, r8, r5)
            nI.p r5 = r9.b()
            boolean r8 = r10.i()
            if (r8 != 0) goto L_0x00f8
            java.lang.Object r8 = r10.D()
            java.lang.Integer r11 = java.lang.Integer.valueOf(r7)
            boolean r8 = kotlin.jvm.internal.C17542s.e(r8, r11)
            if (r8 != 0) goto L_0x0106
        L_0x00f8:
            java.lang.Integer r8 = java.lang.Integer.valueOf(r7)
            r10.u(r8)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r10.w(r7, r5)
        L_0x0106:
            nI.p r5 = r9.d()
            U0.F1.c(r10, r3, r5)
            androidx.compose.foundation.layout.j r3 = androidx.compose.foundation.layout.C5079j.f18125a
            int r5 = IC.C13023e.f110931a
            r4 = r4 & 14
            r4 = r4 | r5
            java.lang.String r4 = r0.a(r14, r4)
            tK.v r5 = tK.C18030v.f147664a
            int r7 = tK.C18030v.f147665b
            tK.h r5 = r5.a(r14, r7)
            long r7 = r5.G0()
            TC.b$b$e r5 = TC.C13679b.C2857b.e.f116687a
            androidx.compose.ui.d$a r9 = androidx.compose.ui.d.f18749a
            i1.c r6 = r6.h()
            androidx.compose.ui.d r6 = r3.a(r9, r6)
            r28 = 0
            r29 = 262128(0x3fff0, float:3.6732E-40)
            r9 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r16 = 0
            r3 = r14
            r30 = r15
            r14 = r16
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
            r26 = r3
            SC.C13607l.j(r4, r5, r6, r7, r9, r11, r12, r13, r14, r16, r17, r18, r19, r21, r22, r23, r24, r25, r26, r27, r28, r29)
            r3.x()
            boolean r4 = U0.C4895p.J()
            if (r4 == 0) goto L_0x0166
            U0.C4895p.R()
        L_0x0166:
            r7 = r30
        L_0x0168:
            U0.Y0 r3 = r3.n()
            if (r3 == 0) goto L_0x0176
            dr.K r4 = new dr.K
            r4.<init>(r0, r7, r1, r2)
            r3.a(r4)
        L_0x0176:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: dr.L.b(IC.e, androidx.compose.ui.d, U0.m, int, int):void");
    }

    /* access modifiers changed from: private */
    public static final C16807N c(C13023e eVar, d dVar, int i10, int i11, C4889m mVar, int i12) {
        b(eVar, dVar, mVar, M0.a(i10 | 1), i11);
        return C16807N.f139792a;
    }
}
