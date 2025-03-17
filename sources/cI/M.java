package ci;

import U0.C4889m;
import U0.M0;
import XH.C16807N;
import androidx.compose.ui.d;
import kotlin.Metadata;
import nI.C17631a;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a1\u0010\u0007\u001a\u00020\u00032\b\b\u0001\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0005H\u0001¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"", "textRes", "Lkotlin/Function0;", "LXH/N;", "onReloadClicked", "Landroidx/compose/ui/d;", "modifier", "b", "(ILnI/a;Landroidx/compose/ui/d;LU0/m;II)V", "productinformationpage-implementation_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class M {
    /* JADX WARNING: Removed duplicated region for block: B:36:0x006e  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0076  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0186  */
    /* JADX WARNING: Removed duplicated region for block: B:63:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void b(int r42, nI.C17631a<XH.C16807N> r43, androidx.compose.ui.d r44, U0.C4889m r45, int r46, int r47) {
        /*
            r1 = r42
            r14 = r43
            r15 = r46
            r0 = 2
            r2 = 4
            r3 = 6
            java.lang.String r4 = "onReloadClicked"
            kotlin.jvm.internal.C17542s.j(r14, r4)
            r4 = -840901078(0xffffffffcde0de2a, float:-4.71582016E8)
            r5 = r45
            U0.m r13 = r5.k(r4)
            r5 = r47 & 1
            if (r5 == 0) goto L_0x001e
            r5 = r15 | 6
            goto L_0x002e
        L_0x001e:
            r5 = r15 & 6
            if (r5 != 0) goto L_0x002d
            boolean r5 = r13.d(r1)
            if (r5 == 0) goto L_0x002a
            r5 = r2
            goto L_0x002b
        L_0x002a:
            r5 = r0
        L_0x002b:
            r5 = r5 | r15
            goto L_0x002e
        L_0x002d:
            r5 = r15
        L_0x002e:
            r0 = r47 & 2
            r6 = 16
            if (r0 == 0) goto L_0x0037
            r5 = r5 | 48
            goto L_0x0046
        L_0x0037:
            r0 = r15 & 48
            if (r0 != 0) goto L_0x0046
            boolean r0 = r13.F(r14)
            if (r0 == 0) goto L_0x0044
            r0 = 32
            goto L_0x0045
        L_0x0044:
            r0 = r6
        L_0x0045:
            r5 = r5 | r0
        L_0x0046:
            r0 = r47 & 4
            if (r0 == 0) goto L_0x004f
            r5 = r5 | 384(0x180, float:5.38E-43)
        L_0x004c:
            r2 = r44
            goto L_0x0061
        L_0x004f:
            r2 = r15 & 384(0x180, float:5.38E-43)
            if (r2 != 0) goto L_0x004c
            r2 = r44
            boolean r7 = r13.V(r2)
            if (r7 == 0) goto L_0x005e
            r7 = 256(0x100, float:3.59E-43)
            goto L_0x0060
        L_0x005e:
            r7 = 128(0x80, float:1.794E-43)
        L_0x0060:
            r5 = r5 | r7
        L_0x0061:
            r7 = r5 & 147(0x93, float:2.06E-43)
            r8 = 146(0x92, float:2.05E-43)
            if (r7 != r8) goto L_0x0076
            boolean r7 = r13.l()
            if (r7 != 0) goto L_0x006e
            goto L_0x0076
        L_0x006e:
            r13.L()
            r3 = r2
            r17 = r13
            goto L_0x0180
        L_0x0076:
            if (r0 == 0) goto L_0x007b
            androidx.compose.ui.d$a r0 = androidx.compose.ui.d.f18749a
            goto L_0x007c
        L_0x007b:
            r0 = r2
        L_0x007c:
            boolean r2 = U0.C4895p.J()
            if (r2 == 0) goto L_0x0088
            r2 = -1
            java.lang.String r7 = "com.ingka.ikea.app.productinformationpage.v2.compose.ReloadErrorComposable (ReloadErrorComposable.kt:31)"
            U0.C4895p.S(r4, r5, r2, r7)
        L_0x0088:
            i1.c$a r2 = i1.C5437c.f24302a
            i1.c$b r2 = r2.g()
            androidx.compose.foundation.layout.d r4 = androidx.compose.foundation.layout.C5073d.f18068a
            androidx.compose.foundation.layout.d$f r4 = r4.b()
            r7 = 54
            E1.I r2 = androidx.compose.foundation.layout.C5080k.a(r4, r2, r13, r7)
            r4 = 0
            int r7 = U0.C4883j.a(r13, r4)
            U0.y r8 = r13.s()
            androidx.compose.ui.d r9 = androidx.compose.ui.c.e(r13, r0)
            G1.g$a r10 = G1.C4504g.f6515W
            nI.a r11 = r10.a()
            U0.f r12 = r13.m()
            if (r12 != 0) goto L_0x00b6
            U0.C4883j.c()
        L_0x00b6:
            r13.I()
            boolean r12 = r13.i()
            if (r12 == 0) goto L_0x00c3
            r13.p(r11)
            goto L_0x00c6
        L_0x00c3:
            r13.t()
        L_0x00c6:
            U0.m r11 = U0.F1.a(r13)
            nI.p r12 = r10.c()
            U0.F1.c(r11, r2, r12)
            nI.p r2 = r10.e()
            U0.F1.c(r11, r8, r2)
            nI.p r2 = r10.b()
            boolean r8 = r11.i()
            if (r8 != 0) goto L_0x00f0
            java.lang.Object r8 = r11.D()
            java.lang.Integer r12 = java.lang.Integer.valueOf(r7)
            boolean r8 = kotlin.jvm.internal.C17542s.e(r8, r12)
            if (r8 != 0) goto L_0x00fe
        L_0x00f0:
            java.lang.Integer r8 = java.lang.Integer.valueOf(r7)
            r11.u(r8)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r11.w(r7, r2)
        L_0x00fe:
            nI.p r2 = r10.d()
            U0.F1.c(r11, r9, r2)
            s0.h r2 = s0.C5862h.f28810a
            r2 = r5 & 14
            java.lang.String r16 = J1.j.b(r1, r13, r2)
            TC.b$b$b r17 = TC.C13679b.C2857b.C2858b.f116684a
            Y1.j$a r2 = Y1.j.f14783b
            int r2 = r2.a()
            androidx.compose.ui.d$a r7 = androidx.compose.ui.d.f18749a
            androidx.compose.ui.d r18 = TC.e.i(r7)
            Y1.j r29 = Y1.j.h(r2)
            r40 = 0
            r41 = 261112(0x3fbf8, float:3.65896E-40)
            r19 = 0
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
            r38 = r13
            SC.C13607l.j(r16, r17, r18, r19, r21, r23, r24, r25, r26, r28, r29, r30, r31, r33, r34, r35, r36, r37, r38, r39, r40, r41)
            float r2 = (float) r6
            float r2 = c2.h.B(r2)
            androidx.compose.ui.d r2 = androidx.compose.foundation.layout.J.i(r7, r2)
            s0.C5844O.a(r2, r13, r3)
            int r2 = uK.C18146a.f148569o
            int r3 = Oo.b.f84823w3
            java.lang.String r3 = J1.j.b(r3, r13, r4)
            int r4 = r5 << 21
            r5 = 234881024(0xe000000, float:1.5777218E-30)
            r12 = r4 & r5
            r16 = 252(0xfc, float:3.53E-43)
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = r43
            r11 = r13
            r17 = r13
            r13 = r16
            SC.F0.b(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            r17.x()
            boolean r2 = U0.C4895p.J()
            if (r2 == 0) goto L_0x017f
            U0.C4895p.R()
        L_0x017f:
            r3 = r0
        L_0x0180:
            U0.Y0 r6 = r17.n()
            if (r6 == 0) goto L_0x0197
            ci.L r7 = new ci.L
            r0 = r7
            r1 = r42
            r2 = r43
            r4 = r46
            r5 = r47
            r0.<init>(r1, r2, r3, r4, r5)
            r6.a(r7)
        L_0x0197:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ci.M.b(int, nI.a, androidx.compose.ui.d, U0.m, int, int):void");
    }

    /* access modifiers changed from: private */
    public static final C16807N c(int i10, C17631a aVar, d dVar, int i11, int i12, C4889m mVar, int i13) {
        b(i10, aVar, dVar, mVar, M0.a(i11 | 1), i12);
        return C16807N.f139792a;
    }
}
