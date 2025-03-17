package vt;

import It.C;
import L1.v;
import L1.x;
import U0.C4889m;
import U0.M0;
import XH.C16807N;
import androidx.compose.ui.d;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import nI.C17631a;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a7\u0010\t\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0001¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"LIt/C;", "shortcut", "", "staticColors", "Landroidx/compose/ui/d;", "modifier", "Lkotlin/Function0;", "LXH/N;", "onClick", "d", "(LIt/C;ZLandroidx/compose/ui/d;LnI/a;LU0/m;II)V", "instore-implementation_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class Z {
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r20v0, resolved type: nI.a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v7, resolved type: androidx.compose.ui.d$a} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x0341  */
    /* JADX WARNING: Removed duplicated region for block: B:112:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0078  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x007b  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0097  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x009e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void d(It.C r44, boolean r45, androidx.compose.ui.d r46, nI.C17631a<XH.C16807N> r47, U0.C4889m r48, int r49, int r50) {
        /*
            r1 = r44
            r2 = r45
            r15 = r47
            r0 = r49
            r3 = 4
            r4 = 48
            r14 = 6
            java.lang.String r5 = "shortcut"
            kotlin.jvm.internal.C17542s.j(r1, r5)
            java.lang.String r5 = "onClick"
            kotlin.jvm.internal.C17542s.j(r15, r5)
            r5 = 1445568402(0x56299f92, float:4.6625704E13)
            r6 = r48
            U0.m r13 = r6.k(r5)
            r6 = 1
            r7 = r50 & 1
            r12 = 2
            if (r7 == 0) goto L_0x0028
            r7 = r0 | 6
            goto L_0x0041
        L_0x0028:
            r7 = r0 & 6
            if (r7 != 0) goto L_0x0040
            r7 = r0 & 8
            if (r7 != 0) goto L_0x0035
            boolean r7 = r13.V(r1)
            goto L_0x0039
        L_0x0035:
            boolean r7 = r13.F(r1)
        L_0x0039:
            if (r7 == 0) goto L_0x003d
            r7 = r3
            goto L_0x003e
        L_0x003d:
            r7 = r12
        L_0x003e:
            r7 = r7 | r0
            goto L_0x0041
        L_0x0040:
            r7 = r0
        L_0x0041:
            r8 = r50 & 2
            if (r8 == 0) goto L_0x0047
            r7 = r7 | r4
            goto L_0x0057
        L_0x0047:
            r8 = r0 & 48
            if (r8 != 0) goto L_0x0057
            boolean r8 = r13.b(r2)
            if (r8 == 0) goto L_0x0054
            r8 = 32
            goto L_0x0056
        L_0x0054:
            r8 = 16
        L_0x0056:
            r7 = r7 | r8
        L_0x0057:
            r3 = r50 & 4
            if (r3 == 0) goto L_0x0060
            r7 = r7 | 384(0x180, float:5.38E-43)
        L_0x005d:
            r8 = r46
            goto L_0x0072
        L_0x0060:
            r8 = r0 & 384(0x180, float:5.38E-43)
            if (r8 != 0) goto L_0x005d
            r8 = r46
            boolean r9 = r13.V(r8)
            if (r9 == 0) goto L_0x006f
            r9 = 256(0x100, float:3.59E-43)
            goto L_0x0071
        L_0x006f:
            r9 = 128(0x80, float:1.794E-43)
        L_0x0071:
            r7 = r7 | r9
        L_0x0072:
            r9 = r50 & 8
            r10 = 2048(0x800, float:2.87E-42)
            if (r9 == 0) goto L_0x007b
            r7 = r7 | 3072(0xc00, float:4.305E-42)
            goto L_0x008a
        L_0x007b:
            r9 = r0 & 3072(0xc00, float:4.305E-42)
            if (r9 != 0) goto L_0x008a
            boolean r9 = r13.F(r15)
            if (r9 == 0) goto L_0x0087
            r9 = r10
            goto L_0x0089
        L_0x0087:
            r9 = 1024(0x400, float:1.435E-42)
        L_0x0089:
            r7 = r7 | r9
        L_0x008a:
            r9 = r7 & 1171(0x493, float:1.641E-42)
            r11 = 1170(0x492, float:1.64E-42)
            if (r9 != r11) goto L_0x009e
            boolean r9 = r13.l()
            if (r9 != 0) goto L_0x0097
            goto L_0x009e
        L_0x0097:
            r13.L()
            r3 = r8
            r5 = r13
            goto L_0x033b
        L_0x009e:
            if (r3 == 0) goto L_0x00a4
            androidx.compose.ui.d$a r3 = androidx.compose.ui.d.f18749a
            r11 = r3
            goto L_0x00a5
        L_0x00a4:
            r11 = r8
        L_0x00a5:
            boolean r3 = U0.C4895p.J()
            if (r3 == 0) goto L_0x00b1
            r3 = -1
            java.lang.String r8 = "com.ingka.ikea.instore.impl.composables.storeselected.Shortcut (Shortcut.kt:40)"
            U0.C4895p.S(r5, r7, r3, r8)
        L_0x00b1:
            boolean r3 = r44.e()
            r9 = 0
            if (r3 != r6) goto L_0x00e6
            r3 = 430596289(0x19aa60c1, float:1.7616667E-23)
            r13.W(r3)
            int r3 = st.c.f102803r0
            java.lang.String r3 = J1.j.b(r3, r13, r9)
            IC.e r5 = r44.d()
            int r8 = IC.C13023e.f110931a
            java.lang.String r5 = r5.a(r13, r8)
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            r8.append(r3)
            java.lang.String r3 = " "
            r8.append(r3)
            r8.append(r5)
            java.lang.String r3 = r8.toString()
            r13.P()
            goto L_0x00fb
        L_0x00e6:
            if (r3 != 0) goto L_0x0355
            r3 = 430600889(0x19aa72b9, float:1.7623924E-23)
            r13.W(r3)
            IC.e r3 = r44.d()
            int r5 = IC.C13023e.f110931a
            java.lang.String r3 = r3.a(r13, r5)
            r13.P()
        L_0x00fb:
            vt.g0 r5 = vt.C12240g0.f105595a
            float r5 = r5.a()
            androidx.compose.ui.d r16 = androidx.compose.foundation.layout.J.y(r11, r5)
            r5 = 430604892(0x19aa825c, float:1.763024E-23)
            r13.W(r5)
            r5 = r7 & 7168(0x1c00, float:1.0045E-41)
            if (r5 != r10) goto L_0x0110
            goto L_0x0111
        L_0x0110:
            r6 = r9
        L_0x0111:
            java.lang.Object r5 = r13.D()
            if (r6 != 0) goto L_0x011f
            U0.m$a r6 = U0.C4889m.f14007a
            java.lang.Object r6 = r6.a()
            if (r5 != r6) goto L_0x0127
        L_0x011f:
            vt.W r5 = new vt.W
            r5.<init>(r15)
            r13.u(r5)
        L_0x0127:
            r20 = r5
            nI.a r20 = (nI.C17631a) r20
            r13.P()
            r21 = 7
            r22 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            androidx.compose.ui.d r5 = androidx.compose.foundation.d.d(r16, r17, r18, r19, r20, r21, r22)
            r6 = 430606491(0x19aa889b, float:1.7632763E-23)
            r13.W(r6)
            boolean r6 = r13.V(r3)
            java.lang.Object r8 = r13.D()
            if (r6 != 0) goto L_0x0154
            U0.m$a r6 = U0.C4889m.f14007a
            java.lang.Object r6 = r6.a()
            if (r8 != r6) goto L_0x015c
        L_0x0154:
            vt.X r8 = new vt.X
            r8.<init>(r3)
            r13.u(r8)
        L_0x015c:
            nI.l r8 = (nI.C17642l) r8
            r13.P()
            androidx.compose.ui.d r3 = L1.o.a(r5, r8)
            i1.c$a r5 = i1.C5437c.f24302a
            i1.c$b r5 = r5.g()
            androidx.compose.foundation.layout.d r6 = androidx.compose.foundation.layout.C5073d.f18068a
            androidx.compose.foundation.layout.d$m r6 = r6.g()
            E1.I r4 = androidx.compose.foundation.layout.C5080k.a(r6, r5, r13, r4)
            int r5 = U0.C4883j.a(r13, r9)
            U0.y r6 = r13.s()
            androidx.compose.ui.d r3 = androidx.compose.ui.c.e(r13, r3)
            G1.g$a r8 = G1.C4504g.f6515W
            nI.a r10 = r8.a()
            U0.f r16 = r13.m()
            if (r16 != 0) goto L_0x0190
            U0.C4883j.c()
        L_0x0190:
            r13.I()
            boolean r16 = r13.i()
            if (r16 == 0) goto L_0x019d
            r13.p(r10)
            goto L_0x01a0
        L_0x019d:
            r13.t()
        L_0x01a0:
            U0.m r10 = U0.F1.a(r13)
            nI.p r9 = r8.c()
            U0.F1.c(r10, r4, r9)
            nI.p r4 = r8.e()
            U0.F1.c(r10, r6, r4)
            nI.p r4 = r8.b()
            boolean r6 = r10.i()
            if (r6 != 0) goto L_0x01ca
            java.lang.Object r6 = r10.D()
            java.lang.Integer r9 = java.lang.Integer.valueOf(r5)
            boolean r6 = kotlin.jvm.internal.C17542s.e(r6, r9)
            if (r6 != 0) goto L_0x01d8
        L_0x01ca:
            java.lang.Integer r6 = java.lang.Integer.valueOf(r5)
            r10.u(r6)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r10.w(r5, r4)
        L_0x01d8:
            nI.p r4 = r8.d()
            U0.F1.c(r10, r3, r4)
            s0.h r3 = s0.C5862h.f28810a
            int r3 = r44.getIcon()
            SC.G0 r8 = SC.G0.Medium
            if (r2 == 0) goto L_0x01f6
            boolean r4 = r44.b()
            if (r4 == 0) goto L_0x01f3
            SC.H0 r4 = SC.H0.PrimaryStatic
        L_0x01f1:
            r9 = r4
            goto L_0x01f9
        L_0x01f3:
            SC.H0 r4 = SC.H0.PrimaryInverseStatic
            goto L_0x01f1
        L_0x01f6:
            SC.H0 r4 = SC.H0.Secondary
            goto L_0x01f1
        L_0x01f9:
            int r4 = r7 << 15
            r5 = 234881024(0xe000000, float:1.5777218E-30)
            r4 = r4 & r5
            r5 = 196656(0x30030, float:2.75574E-40)
            r16 = r4 | r5
            r17 = 204(0xcc, float:2.86E-43)
            r4 = 0
            r5 = 0
            r6 = 0
            r10 = 0
            r18 = 0
            r7 = r9
            r9 = r10
            r10 = r18
            r42 = r11
            r11 = r47
            r12 = r13
            r43 = r13
            r13 = r16
            r0 = r14
            r14 = r17
            SC.F0.b(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            IC.e r3 = r44.l()
            int r4 = IC.C13023e.f110931a
            r5 = r43
            java.lang.String r16 = r3.a(r5, r4)
            TC.b$a$b r17 = TC.C13679b.a.C2856b.f116680a
            androidx.compose.ui.d$a r3 = androidx.compose.ui.d.f18749a
            r4 = 12
            float r4 = (float) r4
            float r8 = c2.h.B(r4)
            r11 = 13
            r12 = 0
            r7 = 0
            r9 = 0
            r10 = 0
            r6 = r3
            androidx.compose.ui.d r18 = androidx.compose.foundation.layout.D.m(r6, r7, r8, r9, r10, r11, r12)
            if (r2 == 0) goto L_0x025a
            r4 = 689655831(0x291b5017, float:3.448638E-14)
            r5.W(r4)
            tK.v r4 = tK.C18030v.f147664a
            int r6 = tK.C18030v.f147665b
            tK.h r4 = r4.a(r5, r6)
            long r6 = r4.x0()
            r5.P()
        L_0x0257:
            r19 = r6
            goto L_0x0270
        L_0x025a:
            r4 = 689722326(0x291c53d6, float:3.4711674E-14)
            r5.W(r4)
            tK.v r4 = tK.C18030v.f147664a
            int r6 = tK.C18030v.f147665b
            tK.h r4 = r4.a(r5, r6)
            long r6 = r4.G0()
            r5.P()
            goto L_0x0257
        L_0x0270:
            Y1.j$a r4 = Y1.j.f14783b
            int r6 = r4.a()
            Y1.j r29 = Y1.j.h(r6)
            r40 = 0
            r41 = 261104(0x3fbf0, float:3.65885E-40)
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
            r39 = 432(0x1b0, float:6.05E-43)
            r38 = r5
            SC.C13607l.j(r16, r17, r18, r19, r21, r23, r24, r25, r26, r28, r29, r30, r31, r33, r34, r35, r36, r37, r38, r39, r40, r41)
            r6 = 853537642(0x32dff36a, float:2.6071309E-8)
            r5.W(r6)
            boolean r6 = r44.e()
            if (r6 == 0) goto L_0x032a
            int r6 = st.c.f102803r0
            r7 = 0
            java.lang.String r16 = J1.j.b(r6, r5, r7)
            TC.b$a$c r17 = TC.C13679b.a.c.f116681a
            S1.C$a r6 = S1.C.f13316b
            S1.C r24 = r6.a()
            float r0 = (float) r0
            float r8 = c2.h.B(r0)
            r11 = 13
            r12 = 0
            r7 = 0
            r9 = 0
            r10 = 0
            r6 = r3
            androidx.compose.ui.d r3 = androidx.compose.foundation.layout.D.m(r6, r7, r8, r9, r10, r11, r12)
            r6 = 50
            A0.f r6 = A0.g.a(r6)
            androidx.compose.ui.d r7 = m1.e.a(r3, r6)
            tK.v r3 = tK.C18030v.f147664a
            int r6 = tK.C18030v.f147665b
            tK.h r8 = r3.a(r5, r6)
            long r8 = r8.A0()
            r11 = 2
            r10 = 0
            androidx.compose.ui.d r7 = androidx.compose.foundation.b.d(r7, r8, r10, r11, r12)
            float r0 = c2.h.B(r0)
            r8 = 2
            float r8 = (float) r8
            float r8 = c2.h.B(r8)
            androidx.compose.ui.d r18 = androidx.compose.foundation.layout.D.j(r7, r0, r8)
            tK.h r0 = r3.a(r5, r6)
            long r19 = r0.F0()
            int r0 = r4.a()
            Y1.j r29 = Y1.j.h(r0)
            r40 = 0
            r41 = 261040(0x3fbb0, float:3.65795E-40)
            r21 = 0
            r23 = 0
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
            r39 = 1572912(0x180030, float:2.204119E-39)
            r38 = r5
            SC.C13607l.j(r16, r17, r18, r19, r21, r23, r24, r25, r26, r28, r29, r30, r31, r33, r34, r35, r36, r37, r38, r39, r40, r41)
        L_0x032a:
            r5.P()
            r5.x()
            boolean r0 = U0.C4895p.J()
            if (r0 == 0) goto L_0x0339
            U0.C4895p.R()
        L_0x0339:
            r3 = r42
        L_0x033b:
            U0.Y0 r7 = r5.n()
            if (r7 == 0) goto L_0x0354
            vt.Y r8 = new vt.Y
            r0 = r8
            r1 = r44
            r2 = r45
            r4 = r47
            r5 = r49
            r6 = r50
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r7.a(r8)
        L_0x0354:
            return
        L_0x0355:
            r5 = r13
            r0 = 430595098(0x19aa5c1a, float:1.7614788E-23)
            r5.W(r0)
            r5.P()
            XH.t r0 = new XH.t
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: vt.Z.d(It.C, boolean, androidx.compose.ui.d, nI.a, U0.m, int, int):void");
    }

    /* access modifiers changed from: private */
    public static final C16807N e(C17631a aVar) {
        aVar.invoke();
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N f(String str, x xVar) {
        C17542s.j(xVar, "$this$clearAndSetSemantics");
        v.d0(xVar, str);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N g(C c10, boolean z10, d dVar, C17631a aVar, int i10, int i11, C4889m mVar, int i12) {
        d(c10, z10, dVar, aVar, mVar, M0.a(i10 | 1), i11);
        return C16807N.f139792a;
    }
}
