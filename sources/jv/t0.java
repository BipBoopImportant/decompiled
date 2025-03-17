package jv;

import U0.C4889m;
import U0.M0;
import XH.C16807N;
import androidx.compose.ui.d;
import hv.C11387c;
import kotlin.Metadata;
import nI.C17642l;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a=\u0010\t\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0002\u0010\b\u001a\u00020\u0007H\u0001¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lhv/c;", "show", "", "label", "Lkotlin/Function1;", "LXH/N;", "onClick", "Landroidx/compose/ui/d;", "modifier", "c", "(Lhv/c;Ljava/lang/String;LnI/l;Landroidx/compose/ui/d;LU0/m;II)V", "liveshopping-implementation_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class t0 {
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r20v0, resolved type: nI.a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r31v2, resolved type: androidx.compose.ui.d$a} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:121:0x0431  */
    /* JADX WARNING: Removed duplicated region for block: B:123:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0094  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x009b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void c(hv.C11387c r36, java.lang.String r37, nI.C17642l<? super java.lang.String, XH.C16807N> r38, androidx.compose.ui.d r39, U0.C4889m r40, int r41, int r42) {
        /*
            r1 = r36
            r0 = r37
            r2 = r38
            r15 = r41
            r3 = 48
            java.lang.String r4 = "show"
            kotlin.jvm.internal.C17542s.j(r1, r4)
            java.lang.String r4 = "label"
            kotlin.jvm.internal.C17542s.j(r0, r4)
            java.lang.String r4 = "onClick"
            kotlin.jvm.internal.C17542s.j(r2, r4)
            r4 = 147393001(0x8c909e9, float:1.2099577E-33)
            r5 = r40
            U0.m r14 = r5.k(r4)
            r11 = 1
            r5 = r42 & 1
            r6 = 2
            r12 = 4
            if (r5 == 0) goto L_0x002c
            r5 = r15 | 6
            goto L_0x003c
        L_0x002c:
            r5 = r15 & 6
            if (r5 != 0) goto L_0x003b
            boolean r5 = r14.F(r1)
            if (r5 == 0) goto L_0x0038
            r5 = r12
            goto L_0x0039
        L_0x0038:
            r5 = r6
        L_0x0039:
            r5 = r5 | r15
            goto L_0x003c
        L_0x003b:
            r5 = r15
        L_0x003c:
            r7 = r42 & 2
            if (r7 == 0) goto L_0x0042
            r5 = r5 | r3
            goto L_0x0052
        L_0x0042:
            r7 = r15 & 48
            if (r7 != 0) goto L_0x0052
            boolean r7 = r14.V(r0)
            if (r7 == 0) goto L_0x004f
            r7 = 32
            goto L_0x0051
        L_0x004f:
            r7 = 16
        L_0x0051:
            r5 = r5 | r7
        L_0x0052:
            r7 = r42 & 4
            r8 = 256(0x100, float:3.59E-43)
            if (r7 == 0) goto L_0x005b
            r5 = r5 | 384(0x180, float:5.38E-43)
            goto L_0x006a
        L_0x005b:
            r7 = r15 & 384(0x180, float:5.38E-43)
            if (r7 != 0) goto L_0x006a
            boolean r7 = r14.F(r2)
            if (r7 == 0) goto L_0x0067
            r7 = r8
            goto L_0x0069
        L_0x0067:
            r7 = 128(0x80, float:1.794E-43)
        L_0x0069:
            r5 = r5 | r7
        L_0x006a:
            r7 = r42 & 8
            if (r7 == 0) goto L_0x0074
            r5 = r5 | 3072(0xc00, float:4.305E-42)
        L_0x0070:
            r9 = r39
        L_0x0072:
            r13 = r5
            goto L_0x0087
        L_0x0074:
            r9 = r15 & 3072(0xc00, float:4.305E-42)
            if (r9 != 0) goto L_0x0070
            r9 = r39
            boolean r10 = r14.V(r9)
            if (r10 == 0) goto L_0x0083
            r10 = 2048(0x800, float:2.87E-42)
            goto L_0x0085
        L_0x0083:
            r10 = 1024(0x400, float:1.435E-42)
        L_0x0085:
            r5 = r5 | r10
            goto L_0x0072
        L_0x0087:
            r5 = r13 & 1171(0x493, float:1.641E-42)
            r10 = 1170(0x492, float:1.64E-42)
            if (r5 != r10) goto L_0x009b
            boolean r5 = r14.l()
            if (r5 != 0) goto L_0x0094
            goto L_0x009b
        L_0x0094:
            r14.L()
            r4 = r9
            r2 = r14
            goto L_0x042b
        L_0x009b:
            if (r7 == 0) goto L_0x00a2
            androidx.compose.ui.d$a r5 = androidx.compose.ui.d.f18749a
            r31 = r5
            goto L_0x00a4
        L_0x00a2:
            r31 = r9
        L_0x00a4:
            boolean r5 = U0.C4895p.J()
            if (r5 == 0) goto L_0x00b0
            r5 = -1
            java.lang.String r7 = "com.ingka.ikea.liveshopping.impl.presentation.compose.UpcomingVideoItem (UpcomingVideoItem.kt:47)"
            U0.C4895p.S(r4, r13, r5, r7)
        L_0x00b0:
            r4 = -2054639049(0xffffffff8588b237, float:-1.2854844E-35)
            r14.W(r4)
            r4 = r13 & 896(0x380, float:1.256E-42)
            r10 = 0
            if (r4 != r8) goto L_0x00bd
            r4 = r11
            goto L_0x00be
        L_0x00bd:
            r4 = r10
        L_0x00be:
            boolean r5 = r14.F(r1)
            r4 = r4 | r5
            java.lang.Object r5 = r14.D()
            if (r4 != 0) goto L_0x00d1
            U0.m$a r4 = U0.C4889m.f14007a
            java.lang.Object r4 = r4.a()
            if (r5 != r4) goto L_0x00d9
        L_0x00d1:
            jv.r0 r5 = new jv.r0
            r5.<init>(r2, r1)
            r14.u(r5)
        L_0x00d9:
            r20 = r5
            nI.a r20 = (nI.C17631a) r20
            r14.P()
            r21 = 7
            r22 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r16 = r31
            androidx.compose.ui.d r4 = androidx.compose.foundation.d.d(r16, r17, r18, r19, r20, r21, r22)
            androidx.compose.foundation.layout.d r16 = androidx.compose.foundation.layout.C5073d.f18068a
            androidx.compose.foundation.layout.d$m r5 = r16.g()
            i1.c$a r17 = i1.C5437c.f24302a
            i1.c$b r7 = r17.k()
            E1.I r5 = androidx.compose.foundation.layout.C5080k.a(r5, r7, r14, r10)
            int r7 = U0.C4883j.a(r14, r10)
            U0.y r8 = r14.s()
            androidx.compose.ui.d r4 = androidx.compose.ui.c.e(r14, r4)
            G1.g$a r18 = G1.C4504g.f6515W
            nI.a r9 = r18.a()
            U0.f r19 = r14.m()
            if (r19 != 0) goto L_0x011b
            U0.C4883j.c()
        L_0x011b:
            r14.I()
            boolean r19 = r14.i()
            if (r19 == 0) goto L_0x0128
            r14.p(r9)
            goto L_0x012b
        L_0x0128:
            r14.t()
        L_0x012b:
            U0.m r9 = U0.F1.a(r14)
            nI.p r12 = r18.c()
            U0.F1.c(r9, r5, r12)
            nI.p r5 = r18.e()
            U0.F1.c(r9, r8, r5)
            nI.p r5 = r18.b()
            boolean r8 = r9.i()
            if (r8 != 0) goto L_0x0155
            java.lang.Object r8 = r9.D()
            java.lang.Integer r12 = java.lang.Integer.valueOf(r7)
            boolean r8 = kotlin.jvm.internal.C17542s.e(r8, r12)
            if (r8 != 0) goto L_0x0163
        L_0x0155:
            java.lang.Integer r8 = java.lang.Integer.valueOf(r7)
            r9.u(r8)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r9.w(r7, r5)
        L_0x0163:
            nI.p r5 = r18.d()
            U0.F1.c(r9, r4, r5)
            s0.h r4 = s0.C5862h.f28810a
            androidx.compose.ui.d$a r12 = androidx.compose.ui.d.f18749a
            i1.c r4 = r17.o()
            E1.I r4 = androidx.compose.foundation.layout.C5077h.h(r4, r10)
            int r5 = U0.C4883j.a(r14, r10)
            U0.y r7 = r14.s()
            androidx.compose.ui.d r8 = androidx.compose.ui.c.e(r14, r12)
            nI.a r9 = r18.a()
            U0.f r19 = r14.m()
            if (r19 != 0) goto L_0x018f
            U0.C4883j.c()
        L_0x018f:
            r14.I()
            boolean r19 = r14.i()
            if (r19 == 0) goto L_0x019c
            r14.p(r9)
            goto L_0x019f
        L_0x019c:
            r14.t()
        L_0x019f:
            U0.m r9 = U0.F1.a(r14)
            nI.p r3 = r18.c()
            U0.F1.c(r9, r4, r3)
            nI.p r3 = r18.e()
            U0.F1.c(r9, r7, r3)
            nI.p r3 = r18.b()
            boolean r4 = r9.i()
            if (r4 != 0) goto L_0x01c9
            java.lang.Object r4 = r9.D()
            java.lang.Integer r7 = java.lang.Integer.valueOf(r5)
            boolean r4 = kotlin.jvm.internal.C17542s.e(r4, r7)
            if (r4 != 0) goto L_0x01d7
        L_0x01c9:
            java.lang.Integer r4 = java.lang.Integer.valueOf(r5)
            r9.u(r4)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r5)
            r9.w(r4, r3)
        L_0x01d7:
            nI.p r3 = r18.d()
            U0.F1.c(r9, r8, r3)
            androidx.compose.foundation.layout.j r3 = androidx.compose.foundation.layout.C5079j.f18125a
            com.ingka.ikea.core.model.Image r3 = r36.k()
            r4 = 0
            jv.C11493m.b(r3, r4, r14, r10, r6)
            java.lang.String r3 = r36.j()
            r5 = 1965295640(0x75240818, float:2.0793478E32)
            r14.W(r5)
            r9 = 12
            if (r3 != 0) goto L_0x01f8
            r3 = r10
            goto L_0x0220
        L_0x01f8:
            SC.F$c r5 = new SC.F$c
            int r6 = uK.C18146a.f148290W0
            r5.<init>(r3, r6)
            SC.B r6 = SC.B.White
            float r3 = (float) r9
            float r3 = c2.h.B(r3)
            androidx.compose.ui.d r3 = androidx.compose.foundation.layout.D.i(r12, r3)
            java.lang.String r7 = "UpcomingVideoItemTestTags-DATE"
            androidx.compose.ui.d r7 = androidx.compose.ui.platform.C5116k1.a(r3, r7)
            int r3 = SC.F.c.f115717d
            r3 = r3 | 432(0x1b0, float:6.05E-43)
            r20 = 0
            r8 = r14
            r9 = r3
            r3 = r10
            r10 = r20
            SC.D.b(r5, r6, r7, r8, r9, r10)
            XH.N r5 = XH.C16807N.f139792a
        L_0x0220:
            r14.P()
            r14.x()
            r5 = 0
            androidx.compose.ui.d r20 = androidx.compose.foundation.layout.J.h(r12, r5, r11, r4)
            tK.v r11 = tK.C18030v.f147664a
            int r10 = tK.C18030v.f147665b
            tK.h r4 = r11.a(r14, r10)
            long r21 = r4.l0()
            r24 = 2
            r25 = 0
            r23 = 0
            androidx.compose.ui.d r4 = androidx.compose.foundation.b.d(r20, r21, r23, r24, r25)
            r5 = 12
            float r5 = (float) r5
            float r6 = c2.h.B(r5)
            r7 = 20
            float r7 = (float) r7
            float r7 = c2.h.B(r7)
            float r8 = c2.h.B(r5)
            float r5 = c2.h.B(r5)
            androidx.compose.ui.d r4 = androidx.compose.foundation.layout.D.l(r4, r8, r6, r5, r7)
            i1.c$c r5 = r17.i()
            androidx.compose.foundation.layout.d$e r6 = r16.f()
            r7 = 48
            E1.I r5 = androidx.compose.foundation.layout.G.b(r6, r5, r14, r7)
            int r6 = U0.C4883j.a(r14, r3)
            U0.y r7 = r14.s()
            androidx.compose.ui.d r4 = androidx.compose.ui.c.e(r14, r4)
            nI.a r8 = r18.a()
            U0.f r9 = r14.m()
            if (r9 != 0) goto L_0x0282
            U0.C4883j.c()
        L_0x0282:
            r14.I()
            boolean r9 = r14.i()
            if (r9 == 0) goto L_0x028f
            r14.p(r8)
            goto L_0x0292
        L_0x028f:
            r14.t()
        L_0x0292:
            U0.m r8 = U0.F1.a(r14)
            nI.p r9 = r18.c()
            U0.F1.c(r8, r5, r9)
            nI.p r5 = r18.e()
            U0.F1.c(r8, r7, r5)
            nI.p r5 = r18.b()
            boolean r7 = r8.i()
            if (r7 != 0) goto L_0x02bc
            java.lang.Object r7 = r8.D()
            java.lang.Integer r9 = java.lang.Integer.valueOf(r6)
            boolean r7 = kotlin.jvm.internal.C17542s.e(r7, r9)
            if (r7 != 0) goto L_0x02ca
        L_0x02bc:
            java.lang.Integer r7 = java.lang.Integer.valueOf(r6)
            r8.u(r7)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r8.w(r6, r5)
        L_0x02ca:
            nI.p r5 = r18.d()
            U0.F1.c(r8, r4, r5)
            s0.N r32 = s0.C5843N.f28726a
            androidx.compose.foundation.layout.d$m r4 = r16.g()
            i1.c$b r5 = r17.k()
            E1.I r4 = androidx.compose.foundation.layout.C5080k.a(r4, r5, r14, r3)
            int r5 = U0.C4883j.a(r14, r3)
            U0.y r6 = r14.s()
            androidx.compose.ui.d r7 = androidx.compose.ui.c.e(r14, r12)
            nI.a r8 = r18.a()
            U0.f r9 = r14.m()
            if (r9 != 0) goto L_0x02f8
            U0.C4883j.c()
        L_0x02f8:
            r14.I()
            boolean r9 = r14.i()
            if (r9 == 0) goto L_0x0305
            r14.p(r8)
            goto L_0x0308
        L_0x0305:
            r14.t()
        L_0x0308:
            U0.m r8 = U0.F1.a(r14)
            nI.p r9 = r18.c()
            U0.F1.c(r8, r4, r9)
            nI.p r4 = r18.e()
            U0.F1.c(r8, r6, r4)
            nI.p r4 = r18.b()
            boolean r6 = r8.i()
            if (r6 != 0) goto L_0x0332
            java.lang.Object r6 = r8.D()
            java.lang.Integer r9 = java.lang.Integer.valueOf(r5)
            boolean r6 = kotlin.jvm.internal.C17542s.e(r6, r9)
            if (r6 != 0) goto L_0x0340
        L_0x0332:
            java.lang.Integer r6 = java.lang.Integer.valueOf(r5)
            r8.u(r6)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r8.w(r5, r4)
        L_0x0340:
            nI.p r4 = r18.d()
            U0.F1.c(r8, r7, r4)
            TC.b$a$c r4 = TC.C13679b.a.c.f116681a
            r9 = r3
            r3 = r4
            tK.h r4 = r11.a(r14, r10)
            long r5 = r4.H0()
            java.lang.String r4 = "UpcomingVideoItemTestTags-LABEL"
            androidx.compose.ui.d r4 = androidx.compose.ui.platform.C5116k1.a(r12, r4)
            int r7 = r13 >> 3
            r7 = r7 & 14
            r7 = r7 | 432(0x1b0, float:6.05E-43)
            r25 = r7
            r26 = 0
            r27 = 262128(0x3fff0, float:3.6732E-40)
            r7 = 0
            r13 = 0
            r9 = r13
            r33 = r10
            r10 = r13
            r34 = r11
            r11 = r13
            r16 = 0
            r35 = r12
            r12 = r16
            r16 = 0
            r39 = r14
            r14 = r16
            r15 = r16
            r17 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r2 = r37
            r24 = r39
            SC.C13607l.j(r2, r3, r4, r5, r7, r9, r10, r11, r12, r14, r15, r16, r17, r19, r20, r21, r22, r23, r24, r25, r26, r27)
            java.lang.String r5 = r36.o()
            TC.b$b$f r6 = TC.C13679b.C2857b.f.f116688a
            r2 = r39
            r4 = r33
            r3 = r34
            tK.h r7 = r3.a(r2, r4)
            long r8 = r7.G0()
            java.lang.String r7 = "UpcomingVideoItemTestTags-TITLE"
            r15 = r35
            androidx.compose.ui.d r7 = androidx.compose.ui.platform.C5116k1.a(r15, r7)
            r29 = 0
            r30 = 262128(0x3fff0, float:3.6732E-40)
            r10 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r16 = 0
            r33 = r15
            r15 = r16
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r23 = 0
            r24 = 0
            r25 = 0
            r26 = 0
            r28 = 432(0x1b0, float:6.05E-43)
            r27 = r2
            SC.C13607l.j(r5, r6, r7, r8, r10, r12, r13, r14, r15, r17, r18, r19, r20, r22, r23, r24, r25, r26, r27, r28, r29, r30)
            r2.x()
            r23 = 2
            r24 = 0
            r21 = 1065353216(0x3f800000, float:1.0)
            r19 = r32
            r20 = r33
            androidx.compose.ui.d r5 = s0.C5842M.e(r19, r20, r21, r22, r23, r24)
            r6 = 0
            s0.C5844O.a(r5, r2, r6)
            int r5 = uK.C18146a.f148109K
            t1.c r5 = J1.e.c(r5, r2, r6)
            int r7 = av.C11097a.f90456c
            java.lang.String r6 = J1.j.b(r7, r2, r6)
            r7 = 4
            float r7 = (float) r7
            float r20 = c2.h.B(r7)
            r24 = 14
            r25 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r19 = r33
            androidx.compose.ui.d r7 = androidx.compose.foundation.layout.D.m(r19, r20, r21, r22, r23, r24, r25)
            tK.h r3 = r3.a(r2, r4)
            long r8 = r3.G0()
            r11 = 384(0x180, float:5.38E-43)
            r12 = 0
            r10 = r2
            O0.V.a(r5, r6, r7, r8, r10, r11, r12)
            r2.x()
            r2.x()
            boolean r3 = U0.C4895p.J()
            if (r3 == 0) goto L_0x0429
            U0.C4895p.R()
        L_0x0429:
            r4 = r31
        L_0x042b:
            U0.Y0 r7 = r2.n()
            if (r7 == 0) goto L_0x0444
            jv.s0 r8 = new jv.s0
            r0 = r8
            r1 = r36
            r2 = r37
            r3 = r38
            r5 = r41
            r6 = r42
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r7.a(r8)
        L_0x0444:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: jv.t0.c(hv.c, java.lang.String, nI.l, androidx.compose.ui.d, U0.m, int, int):void");
    }

    /* access modifiers changed from: private */
    public static final C16807N d(C17642l lVar, C11387c cVar) {
        lVar.invoke(cVar.getId());
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N e(C11387c cVar, String str, C17642l lVar, d dVar, int i10, int i11, C4889m mVar, int i12) {
        c(cVar, str, lVar, dVar, mVar, M0.a(i10 | 1), i11);
        return C16807N.f139792a;
    }
}
