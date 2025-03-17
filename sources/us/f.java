package us;

import U0.C4889m;
import U0.M0;
import XH.C16807N;
import androidx.compose.ui.d;
import kotlin.Metadata;
import nI.C17642l;
import ys.C12503b;
import ys.C12506e;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a5\u0010\b\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0006H\u0001¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lys/e$b;", "uiState", "Lkotlin/Function1;", "Lys/b;", "LXH/N;", "onEvent", "Landroidx/compose/ui/d;", "modifier", "c", "(Lys/e$b;LnI/l;Landroidx/compose/ui/d;LU0/m;II)V", "inbox-implementation_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class f {
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v9, resolved type: nI.a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v9, resolved type: androidx.compose.ui.d$a} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x007c  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0083  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x02c4  */
    /* JADX WARNING: Removed duplicated region for block: B:79:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void c(ys.C12506e.b r40, nI.C17642l<? super ys.C12503b, XH.C16807N> r41, androidx.compose.ui.d r42, U0.C4889m r43, int r44, int r45) {
        /*
            r1 = r40
            r2 = r41
            r4 = r44
            java.lang.String r0 = "uiState"
            kotlin.jvm.internal.C17542s.j(r1, r0)
            java.lang.String r0 = "onEvent"
            kotlin.jvm.internal.C17542s.j(r2, r0)
            r0 = 1718551231(0x666f02bf, float:2.8217406E23)
            r3 = r43
            U0.m r3 = r3.k(r0)
            r5 = r45 & 1
            r6 = 2
            if (r5 == 0) goto L_0x0021
            r5 = r4 | 6
            goto L_0x003a
        L_0x0021:
            r5 = r4 & 6
            if (r5 != 0) goto L_0x0039
            r5 = r4 & 8
            if (r5 != 0) goto L_0x002e
            boolean r5 = r3.V(r1)
            goto L_0x0032
        L_0x002e:
            boolean r5 = r3.F(r1)
        L_0x0032:
            if (r5 == 0) goto L_0x0036
            r5 = 4
            goto L_0x0037
        L_0x0036:
            r5 = r6
        L_0x0037:
            r5 = r5 | r4
            goto L_0x003a
        L_0x0039:
            r5 = r4
        L_0x003a:
            r7 = r45 & 2
            r15 = 32
            if (r7 == 0) goto L_0x0043
            r5 = r5 | 48
            goto L_0x0052
        L_0x0043:
            r7 = r4 & 48
            if (r7 != 0) goto L_0x0052
            boolean r7 = r3.F(r2)
            if (r7 == 0) goto L_0x004f
            r7 = r15
            goto L_0x0051
        L_0x004f:
            r7 = 16
        L_0x0051:
            r5 = r5 | r7
        L_0x0052:
            r7 = r45 & 4
            if (r7 == 0) goto L_0x005c
            r5 = r5 | 384(0x180, float:5.38E-43)
        L_0x0058:
            r8 = r42
        L_0x005a:
            r14 = r5
            goto L_0x006f
        L_0x005c:
            r8 = r4 & 384(0x180, float:5.38E-43)
            if (r8 != 0) goto L_0x0058
            r8 = r42
            boolean r9 = r3.V(r8)
            if (r9 == 0) goto L_0x006b
            r9 = 256(0x100, float:3.59E-43)
            goto L_0x006d
        L_0x006b:
            r9 = 128(0x80, float:1.794E-43)
        L_0x006d:
            r5 = r5 | r9
            goto L_0x005a
        L_0x006f:
            r5 = r14 & 147(0x93, float:2.06E-43)
            r9 = 146(0x92, float:2.05E-43)
            if (r5 != r9) goto L_0x0083
            boolean r5 = r3.l()
            if (r5 != 0) goto L_0x007c
            goto L_0x0083
        L_0x007c:
            r3.L()
            r34 = r8
            goto L_0x02be
        L_0x0083:
            if (r7 == 0) goto L_0x0089
            androidx.compose.ui.d$a r5 = androidx.compose.ui.d.f18749a
            r13 = r5
            goto L_0x008a
        L_0x0089:
            r13 = r8
        L_0x008a:
            boolean r5 = U0.C4895p.J()
            if (r5 == 0) goto L_0x0096
            r5 = -1
            java.lang.String r7 = "com.ingka.ikea.inbox.impl.compose.content.EmptyContent (EmptyContent.kt:40)"
            U0.C4895p.S(r0, r14, r5, r7)
        L_0x0096:
            r0 = 48
            float r0 = (float) r0
            float r0 = c2.h.B(r0)
            r12 = 0
            r11 = 0
            androidx.compose.ui.d r0 = androidx.compose.foundation.layout.D.k(r13, r0, r12, r6, r11)
            androidx.compose.foundation.layout.d r5 = androidx.compose.foundation.layout.C5073d.f18068a
            androidx.compose.foundation.layout.d$m r5 = r5.g()
            i1.c$a r31 = i1.C5437c.f24302a
            i1.c$b r6 = r31.k()
            r10 = 0
            E1.I r5 = androidx.compose.foundation.layout.C5080k.a(r5, r6, r3, r10)
            int r6 = U0.C4883j.a(r3, r10)
            U0.y r7 = r3.s()
            androidx.compose.ui.d r0 = androidx.compose.ui.c.e(r3, r0)
            G1.g$a r8 = G1.C4504g.f6515W
            nI.a r9 = r8.a()
            U0.f r16 = r3.m()
            if (r16 != 0) goto L_0x00cf
            U0.C4883j.c()
        L_0x00cf:
            r3.I()
            boolean r16 = r3.i()
            if (r16 == 0) goto L_0x00dc
            r3.p(r9)
            goto L_0x00df
        L_0x00dc:
            r3.t()
        L_0x00df:
            U0.m r9 = U0.F1.a(r3)
            nI.p r11 = r8.c()
            U0.F1.c(r9, r5, r11)
            nI.p r5 = r8.e()
            U0.F1.c(r9, r7, r5)
            nI.p r5 = r8.b()
            boolean r7 = r9.i()
            if (r7 != 0) goto L_0x0109
            java.lang.Object r7 = r9.D()
            java.lang.Integer r11 = java.lang.Integer.valueOf(r6)
            boolean r7 = kotlin.jvm.internal.C17542s.e(r7, r11)
            if (r7 != 0) goto L_0x0117
        L_0x0109:
            java.lang.Integer r7 = java.lang.Integer.valueOf(r6)
            r9.u(r7)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r9.w(r6, r5)
        L_0x0117:
            nI.p r5 = r8.d()
            U0.F1.c(r9, r0, r5)
            s0.h r0 = s0.C5862h.f28810a
            androidx.compose.ui.d$a r11 = androidx.compose.ui.d.f18749a
            r20 = 2
            r21 = 0
            r18 = 1051372203(0x3eaaaaab, float:0.33333334)
            r19 = 0
            r16 = r0
            r17 = r11
            androidx.compose.ui.d r5 = s0.C5861g.c(r16, r17, r18, r19, r20, r21)
            s0.C5844O.a(r5, r3, r10)
            int r5 = qs.C11814b.f101987a
            t1.c r5 = J1.e.c(r5, r3, r10)
            E1.k$a r6 = E1.C4478k.f5915a
            E1.k r9 = r6.d()
            r6 = 1060320051(0x3f333333, float:0.7)
            androidx.compose.ui.d r6 = androidx.compose.foundation.layout.J.g(r11, r6)
            i1.c$b r7 = r31.g()
            androidx.compose.ui.d r7 = r0.b(r6, r7)
            r16 = 24624(0x6030, float:3.4506E-41)
            r17 = 104(0x68, float:1.46E-43)
            r6 = 0
            r8 = 0
            r18 = 0
            r19 = 0
            r10 = r18
            r33 = r11
            r11 = r19
            r12 = r3
            r34 = r13
            r13 = r16
            r35 = r14
            r14 = r17
            n0.C5583F.a(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            float r5 = (float) r15
            float r5 = c2.h.B(r5)
            r14 = r33
            androidx.compose.ui.d r5 = androidx.compose.foundation.layout.J.i(r14, r5)
            r13 = 6
            s0.C5844O.a(r5, r3, r13)
            int r5 = qs.d.f102000l
            r12 = 0
            java.lang.String r5 = J1.j.b(r5, r3, r12)
            Y1.j$a r32 = Y1.j.f14783b
            int r10 = r32.a()
            TC.b$b$e r6 = TC.C13679b.C2857b.e.f116687a
            tK.v r11 = tK.C18030v.f147664a
            int r7 = tK.C18030v.f147665b
            tK.h r8 = r11.a(r3, r7)
            long r8 = r8.G0()
            r15 = 1
            r12 = 0
            r13 = 0
            androidx.compose.ui.d r17 = androidx.compose.foundation.layout.J.h(r14, r13, r15, r12)
            r36 = r7
            r7 = r17
            Y1.j r18 = Y1.j.h(r10)
            r29 = 0
            r30 = 261104(0x3fbf0, float:3.65885E-40)
            r19 = 0
            r37 = r11
            r10 = r19
            r17 = 0
            r12 = r17
            r16 = 0
            r13 = r16
            r38 = r14
            r14 = r16
            r16 = 0
            r15 = r16
            r17 = 0
            r19 = 0
            r20 = 0
            r22 = 0
            r23 = 0
            r24 = 0
            r25 = 0
            r26 = 0
            r28 = 432(0x1b0, float:6.05E-43)
            r27 = r3
            SC.C13607l.j(r5, r6, r7, r8, r10, r12, r13, r14, r15, r17, r18, r19, r20, r22, r23, r24, r25, r26, r27, r28, r29, r30)
            r5 = 20
            float r5 = (float) r5
            float r5 = c2.h.B(r5)
            r15 = r38
            androidx.compose.ui.d r5 = androidx.compose.foundation.layout.J.i(r15, r5)
            r14 = 6
            s0.C5844O.a(r5, r3, r14)
            int r5 = qs.d.f101999k
            r13 = 0
            java.lang.String r5 = J1.j.b(r5, r3, r13)
            int r10 = r32.a()
            TC.b$a$a r6 = TC.C13679b.a.C2855a.f116679a
            r8 = r36
            r7 = r37
            tK.h r7 = r7.a(r3, r8)
            long r8 = r7.H0()
            r7 = 0
            r11 = 0
            r12 = 1
            androidx.compose.ui.d r7 = androidx.compose.foundation.layout.J.h(r15, r7, r12, r11)
            Y1.j r18 = Y1.j.h(r10)
            r10 = 0
            r16 = 0
            r32 = r12
            r12 = r16
            r13 = r16
            r14 = r16
            r16 = 0
            r39 = r15
            r15 = r16
            r17 = 0
            SC.C13607l.j(r5, r6, r7, r8, r10, r12, r13, r14, r15, r17, r18, r19, r20, r22, r23, r24, r25, r26, r27, r28, r29, r30)
            r5 = 24
            float r5 = (float) r5
            float r5 = c2.h.B(r5)
            r15 = r39
            androidx.compose.ui.d r5 = androidx.compose.foundation.layout.J.i(r15, r5)
            r6 = 6
            s0.C5844O.a(r5, r3, r6)
            r5 = 1958759976(0x74c04e28, float:1.2188796E32)
            r3.W(r5)
            boolean r5 = r40.e()
            if (r5 == 0) goto L_0x0297
            int r5 = qs.d.f102004p
            r14 = 0
            java.lang.String r5 = J1.j.b(r5, r3, r14)
            SC.N r8 = SC.N.Primary
            SC.M r9 = SC.M.Small
            i1.c$b r6 = r31.g()
            androidx.compose.ui.d r6 = r0.b(r15, r6)
            r7 = 1958765544(0x74c063e8, float:1.2194181E32)
            r3.W(r7)
            r7 = r35 & 112(0x70, float:1.57E-43)
            r10 = 32
            if (r7 != r10) goto L_0x0263
            r10 = r32
            goto L_0x0264
        L_0x0263:
            r10 = r14
        L_0x0264:
            java.lang.Object r7 = r3.D()
            if (r10 != 0) goto L_0x0272
            U0.m$a r10 = U0.C4889m.f14007a
            java.lang.Object r10 = r10.a()
            if (r7 != r10) goto L_0x027a
        L_0x0272:
            us.d r7 = new us.d
            r7.<init>(r2)
            r3.u(r7)
        L_0x027a:
            r16 = r7
            nI.a r16 = (nI.C17631a) r16
            r3.P()
            r17 = 27648(0x6c00, float:3.8743E-41)
            r18 = 484(0x1e4, float:6.78E-43)
            r7 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = r16
            r19 = r15
            r15 = r3
            r16 = r17
            r17 = r18
            SC.L.b(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            goto L_0x0299
        L_0x0297:
            r19 = r15
        L_0x0299:
            r3.P()
            r20 = 2
            r21 = 0
            r18 = 1059760811(0x3f2aaaab, float:0.6666667)
            r5 = 0
            r16 = r0
            r17 = r19
            r19 = r5
            androidx.compose.ui.d r0 = s0.C5861g.c(r16, r17, r18, r19, r20, r21)
            r5 = 0
            s0.C5844O.a(r0, r3, r5)
            r3.x()
            boolean r0 = U0.C4895p.J()
            if (r0 == 0) goto L_0x02be
            U0.C4895p.R()
        L_0x02be:
            U0.Y0 r6 = r3.n()
            if (r6 == 0) goto L_0x02d7
            us.e r7 = new us.e
            r0 = r7
            r1 = r40
            r2 = r41
            r3 = r34
            r4 = r44
            r5 = r45
            r0.<init>(r1, r2, r3, r4, r5)
            r6.a(r7)
        L_0x02d7:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: us.f.c(ys.e$b, nI.l, androidx.compose.ui.d, U0.m, int, int):void");
    }

    /* access modifiers changed from: private */
    public static final C16807N d(C17642l lVar) {
        lVar.invoke(C12503b.c.f107219a);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N e(C12506e.b bVar, C17642l lVar, d dVar, int i10, int i11, C4889m mVar, int i12) {
        c(bVar, lVar, dVar, mVar, M0.a(i10 | 1), i11);
        return C16807N.f139792a;
    }
}
