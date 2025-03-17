package go;

import U0.C4889m;
import U0.M0;
import XH.C16807N;
import androidx.compose.ui.d;
import gs.e;
import gs.h;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import nI.p;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a=\u0010\t\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006H\u0001¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lgo/s;", "uiModel", "Landroidx/compose/ui/d;", "modifier", "Lc2/h;", "imageSize", "Lkotlin/Function0;", "LXH/N;", "addons", "c", "(Lgo/s;Landroidx/compose/ui/d;FLnI/p;LU0/m;II)V", "checkout-implementation_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class r {
    /* JADX WARNING: Removed duplicated region for block: B:116:0x03a2  */
    /* JADX WARNING: Removed duplicated region for block: B:119:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0056  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x005b  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0071  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0076  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x0096  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x009d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void c(go.C11334s r62, androidx.compose.ui.d r63, float r64, nI.p<? super U0.C4889m, ? super java.lang.Integer, XH.C16807N> r65, U0.C4889m r66, int r67, int r68) {
        /*
            r1 = r62
            r5 = r67
            r0 = 8
            java.lang.String r2 = "uiModel"
            kotlin.jvm.internal.C17542s.j(r1, r2)
            r2 = 507475119(0x1e3f74af, float:1.01355854E-20)
            r3 = r66
            U0.m r3 = r3.k(r2)
            r4 = 1
            r6 = r68 & 1
            r7 = 2
            r8 = 4
            if (r6 == 0) goto L_0x001e
            r6 = r5 | 6
            goto L_0x0037
        L_0x001e:
            r6 = r5 & 6
            if (r6 != 0) goto L_0x0036
            r6 = r5 & 8
            if (r6 != 0) goto L_0x002b
            boolean r6 = r3.V(r1)
            goto L_0x002f
        L_0x002b:
            boolean r6 = r3.F(r1)
        L_0x002f:
            if (r6 == 0) goto L_0x0033
            r6 = r8
            goto L_0x0034
        L_0x0033:
            r6 = r7
        L_0x0034:
            r6 = r6 | r5
            goto L_0x0037
        L_0x0036:
            r6 = r5
        L_0x0037:
            r9 = r68 & 2
            if (r9 == 0) goto L_0x0040
            r6 = r6 | 48
        L_0x003d:
            r10 = r63
            goto L_0x0052
        L_0x0040:
            r10 = r5 & 48
            if (r10 != 0) goto L_0x003d
            r10 = r63
            boolean r11 = r3.V(r10)
            if (r11 == 0) goto L_0x004f
            r11 = 32
            goto L_0x0051
        L_0x004f:
            r11 = 16
        L_0x0051:
            r6 = r6 | r11
        L_0x0052:
            r11 = r68 & 4
            if (r11 == 0) goto L_0x005b
            r6 = r6 | 384(0x180, float:5.38E-43)
        L_0x0058:
            r12 = r64
            goto L_0x006d
        L_0x005b:
            r12 = r5 & 384(0x180, float:5.38E-43)
            if (r12 != 0) goto L_0x0058
            r12 = r64
            boolean r13 = r3.c(r12)
            if (r13 == 0) goto L_0x006a
            r13 = 256(0x100, float:3.59E-43)
            goto L_0x006c
        L_0x006a:
            r13 = 128(0x80, float:1.794E-43)
        L_0x006c:
            r6 = r6 | r13
        L_0x006d:
            r13 = r68 & 8
            if (r13 == 0) goto L_0x0076
            r6 = r6 | 3072(0xc00, float:4.305E-42)
        L_0x0073:
            r14 = r65
            goto L_0x0089
        L_0x0076:
            r14 = r5 & 3072(0xc00, float:4.305E-42)
            if (r14 != 0) goto L_0x0073
            r14 = r65
            boolean r16 = r3.F(r14)
            if (r16 == 0) goto L_0x0085
            r16 = 2048(0x800, float:2.87E-42)
            goto L_0x0087
        L_0x0085:
            r16 = 1024(0x400, float:1.435E-42)
        L_0x0087:
            r6 = r6 | r16
        L_0x0089:
            r15 = r6 & 1171(0x493, float:1.641E-42)
            r7 = 1170(0x492, float:1.64E-42)
            if (r15 != r7) goto L_0x009d
            boolean r7 = r3.l()
            if (r7 != 0) goto L_0x0096
            goto L_0x009d
        L_0x0096:
            r3.L()
            r2 = r10
            r4 = r14
            goto L_0x039c
        L_0x009d:
            if (r9 == 0) goto L_0x00a3
            androidx.compose.ui.d$a r7 = androidx.compose.ui.d.f18749a
            r15 = r7
            goto L_0x00a4
        L_0x00a3:
            r15 = r10
        L_0x00a4:
            if (r11 == 0) goto L_0x00ae
            r7 = 80
            float r7 = (float) r7
            float r7 = c2.h.B(r7)
            r12 = r7
        L_0x00ae:
            r11 = 0
            if (r13 == 0) goto L_0x00b2
            r14 = r11
        L_0x00b2:
            boolean r7 = U0.C4895p.J()
            if (r7 == 0) goto L_0x00be
            r7 = -1
            java.lang.String r9 = "com.ingka.ikea.checkout.impl.delivery.compose.CheckoutProductContent (CheckoutProductContent.kt:45)"
            U0.C4895p.S(r2, r6, r7, r9)
        L_0x00be:
            r2 = 0
            androidx.compose.ui.d r7 = androidx.compose.foundation.layout.J.h(r15, r2, r4, r11)
            androidx.compose.foundation.layout.d r21 = androidx.compose.foundation.layout.C5073d.f18068a
            androidx.compose.foundation.layout.d$e r9 = r21.f()
            i1.c$a r22 = i1.C5437c.f24302a
            i1.c$c r10 = r22.l()
            r13 = 0
            E1.I r9 = androidx.compose.foundation.layout.G.b(r9, r10, r3, r13)
            int r10 = U0.C4883j.a(r3, r13)
            U0.y r2 = r3.s()
            androidx.compose.ui.d r7 = androidx.compose.ui.c.e(r3, r7)
            G1.g$a r23 = G1.C4504g.f6515W
            nI.a r4 = r23.a()
            U0.f r17 = r3.m()
            if (r17 != 0) goto L_0x00ef
            U0.C4883j.c()
        L_0x00ef:
            r3.I()
            boolean r17 = r3.i()
            if (r17 == 0) goto L_0x00fc
            r3.p(r4)
            goto L_0x00ff
        L_0x00fc:
            r3.t()
        L_0x00ff:
            U0.m r4 = U0.F1.a(r3)
            nI.p r11 = r23.c()
            U0.F1.c(r4, r9, r11)
            nI.p r9 = r23.e()
            U0.F1.c(r4, r2, r9)
            nI.p r2 = r23.b()
            boolean r9 = r4.i()
            if (r9 != 0) goto L_0x0129
            java.lang.Object r9 = r4.D()
            java.lang.Integer r11 = java.lang.Integer.valueOf(r10)
            boolean r9 = kotlin.jvm.internal.C17542s.e(r9, r11)
            if (r9 != 0) goto L_0x0137
        L_0x0129:
            java.lang.Integer r9 = java.lang.Integer.valueOf(r10)
            r4.u(r9)
            java.lang.Integer r9 = java.lang.Integer.valueOf(r10)
            r4.w(r9, r2)
        L_0x0137:
            nI.p r2 = r23.d()
            U0.F1.c(r4, r7, r2)
            s0.N r24 = s0.C5843N.f28726a
            r2 = 148756754(0x8ddd912, float:1.3351987E-33)
            r3.W(r2)
            r2 = r6 & 14
            if (r2 == r8) goto L_0x0157
            r2 = r6 & 8
            if (r2 == 0) goto L_0x0155
            boolean r2 = r3.F(r1)
            if (r2 == 0) goto L_0x0155
            goto L_0x0157
        L_0x0155:
            r2 = r13
            goto L_0x0158
        L_0x0157:
            r2 = 1
        L_0x0158:
            java.lang.Object r4 = r3.D()
            if (r2 != 0) goto L_0x0166
            U0.m$a r2 = U0.C4889m.f14007a
            java.lang.Object r2 = r2.a()
            if (r4 != r2) goto L_0x016e
        L_0x0166:
            go.p r4 = new go.p
            r4.<init>(r1)
            r3.u(r4)
        L_0x016e:
            nI.l r4 = (nI.C17642l) r4
            r3.P()
            gs.e r2 = gs.f.a(r4, r3, r13)
            Op.d$d r4 = r62.b()
            java.lang.String r7 = r4.a()
            int r4 = uK.C18146a.f148160N5
            t1.c r10 = J1.e.c(r4, r3, r13)
            androidx.compose.ui.d$a r4 = androidx.compose.ui.d.f18749a
            androidx.compose.ui.d r8 = androidx.compose.foundation.layout.J.t(r4, r12)
            r9 = 1065353216(0x3f800000, float:1.0)
            r1 = 0
            r11 = 2
            androidx.compose.ui.d r8 = androidx.compose.foundation.layout.C5074e.b(r8, r9, r13, r11, r1)
            float r0 = (float) r0
            float r9 = c2.h.B(r0)
            A0.f r9 = A0.g.e(r9)
            androidx.compose.ui.d r8 = m1.e.a(r8, r9)
            int r18 = gs.e.f97946h
            r19 = 0
            r20 = 2024(0x7e8, float:2.836E-42)
            r9 = 0
            r11 = 0
            r16 = 0
            r17 = 0
            r25 = 0
            r26 = 0
            r27 = 0
            r58 = r6
            r6 = r2
            r2 = r12
            r12 = r16
            r1 = r13
            r13 = r17
            r59 = r14
            r14 = r25
            r60 = r15
            r1 = 16
            r15 = r26
            r16 = r27
            r17 = r3
            gs.C11352b.b(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            r28 = 2
            r29 = 0
            r26 = 1065353216(0x3f800000, float:1.0)
            r25 = r4
            androidx.compose.ui.d r6 = s0.C5842M.e(r24, r25, r26, r27, r28, r29)
            float r1 = (float) r1
            float r7 = c2.h.B(r1)
            r11 = 14
            r12 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            androidx.compose.ui.d r6 = androidx.compose.foundation.layout.D.m(r6, r7, r8, r9, r10, r11, r12)
            androidx.compose.foundation.layout.d$m r7 = r21.g()
            i1.c$b r8 = r22.k()
            r9 = 0
            E1.I r7 = androidx.compose.foundation.layout.C5080k.a(r7, r8, r3, r9)
            int r8 = U0.C4883j.a(r3, r9)
            U0.y r9 = r3.s()
            androidx.compose.ui.d r6 = androidx.compose.ui.c.e(r3, r6)
            nI.a r10 = r23.a()
            U0.f r11 = r3.m()
            if (r11 != 0) goto L_0x020d
            U0.C4883j.c()
        L_0x020d:
            r3.I()
            boolean r11 = r3.i()
            if (r11 == 0) goto L_0x021a
            r3.p(r10)
            goto L_0x021d
        L_0x021a:
            r3.t()
        L_0x021d:
            U0.m r10 = U0.F1.a(r3)
            nI.p r11 = r23.c()
            U0.F1.c(r10, r7, r11)
            nI.p r7 = r23.e()
            U0.F1.c(r10, r9, r7)
            nI.p r7 = r23.b()
            boolean r9 = r10.i()
            if (r9 != 0) goto L_0x0247
            java.lang.Object r9 = r10.D()
            java.lang.Integer r11 = java.lang.Integer.valueOf(r8)
            boolean r9 = kotlin.jvm.internal.C17542s.e(r9, r11)
            if (r9 != 0) goto L_0x0255
        L_0x0247:
            java.lang.Integer r9 = java.lang.Integer.valueOf(r8)
            r10.u(r9)
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            r10.w(r8, r7)
        L_0x0255:
            nI.p r7 = r23.d()
            U0.F1.c(r10, r6, r7)
            s0.h r6 = s0.C5862h.f28810a
            float r29 = c2.h.B(r0)
            r30 = 7
            r31 = 0
            r26 = 0
            r27 = 0
            r28 = 0
            r25 = r4
            androidx.compose.ui.d r8 = androidx.compose.foundation.layout.D.m(r25, r26, r27, r28, r29, r30, r31)
            java.lang.String r6 = r62.d()
            TC.b$a$c r61 = TC.C13679b.a.c.f116681a
            r33 = r61
            r7 = r61
            S1.C$a r9 = S1.C.f13316b
            S1.C r14 = r9.a()
            r30 = 0
            r31 = 262072(0x3ffb8, float:3.67241E-40)
            r9 = 0
            r11 = 0
            r13 = 0
            r15 = 0
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
            r29 = 1573296(0x1801b0, float:2.204657E-39)
            r28 = r3
            SC.C13607l.j(r6, r7, r8, r9, r11, r13, r14, r15, r16, r18, r19, r20, r21, r23, r24, r25, r26, r27, r28, r29, r30, r31)
            float r29 = c2.h.B(r0)
            r30 = 7
            r31 = 0
            r26 = 0
            r27 = 0
            r28 = 0
            r25 = r4
            androidx.compose.ui.d r34 = androidx.compose.foundation.layout.D.m(r25, r26, r27, r28, r29, r30, r31)
            java.lang.String r32 = r62.c()
            r56 = 0
            r57 = 262136(0x3fff8, float:3.67331E-40)
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
            r55 = 432(0x1b0, float:6.05E-43)
            r54 = r3
            SC.C13607l.j(r32, r33, r34, r35, r37, r39, r40, r41, r42, r44, r45, r46, r47, r49, r50, r51, r52, r53, r54, r55, r56, r57)
            IC.e r0 = r62.e()
            r4 = 478785065(0x1c89ae29, float:9.110919E-22)
            r3.W(r4)
            if (r0 != 0) goto L_0x02f8
            goto L_0x032a
        L_0x02f8:
            int r4 = IC.C13023e.f110931a
            java.lang.String r6 = r0.a(r3, r4)
            r30 = 0
            r31 = 262140(0x3fffc, float:3.67336E-40)
            r8 = 0
            r9 = 0
            r11 = 0
            r13 = 0
            r14 = 0
            r15 = 0
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
            r29 = 48
            r7 = r61
            r28 = r3
            SC.C13607l.j(r6, r7, r8, r9, r11, r13, r14, r15, r16, r18, r19, r20, r21, r23, r24, r25, r26, r27, r28, r29, r30, r31)
            XH.N r0 = XH.C16807N.f139792a
        L_0x032a:
            r3.P()
            r0 = 478791158(0x1c89c5f6, float:9.117071E-22)
            r3.W(r0)
            KJ.c r0 = r62.a()
            java.util.Iterator r0 = r0.iterator()
        L_0x033b:
            boolean r4 = r0.hasNext()
            if (r4 == 0) goto L_0x036b
            java.lang.Object r4 = r0.next()
            Op.d$f r4 = (Op.C10828d.f) r4
            androidx.compose.ui.d$a r6 = androidx.compose.ui.d.f18749a
            float r7 = c2.h.B(r1)
            r13 = 1
            r14 = 0
            r15 = 0
            androidx.compose.ui.d r8 = androidx.compose.foundation.layout.D.k(r6, r15, r7, r13, r14)
            SC.L2 r7 = r4.c()
            IC.e r4 = r4.b()
            int r6 = IC.C13023e.f110931a
            java.lang.String r6 = r4.a(r3, r6)
            r11 = 3456(0xd80, float:4.843E-42)
            r12 = 0
            r9 = 1
            r10 = r3
            SC.K2.d(r6, r7, r8, r9, r10, r11, r12)
            goto L_0x033b
        L_0x036b:
            r3.P()
            r0 = 478799961(0x1c89e859, float:9.12596E-22)
            r3.W(r0)
            r11 = r59
            if (r11 != 0) goto L_0x0379
            goto L_0x0386
        L_0x0379:
            int r0 = r58 >> 9
            r0 = r0 & 14
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r11.invoke(r3, r0)
            XH.N r0 = XH.C16807N.f139792a
        L_0x0386:
            r3.P()
            r3.x()
            r3.x()
            boolean r0 = U0.C4895p.J()
            if (r0 == 0) goto L_0x0398
            U0.C4895p.R()
        L_0x0398:
            r12 = r2
            r4 = r11
            r2 = r60
        L_0x039c:
            U0.Y0 r7 = r3.n()
            if (r7 == 0) goto L_0x03b2
            go.q r8 = new go.q
            r0 = r8
            r1 = r62
            r3 = r12
            r5 = r67
            r6 = r68
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r7.a(r8)
        L_0x03b2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: go.r.c(go.s, androidx.compose.ui.d, float, nI.p, U0.m, int, int):void");
    }

    /* access modifiers changed from: private */
    public static final C16807N d(C11334s sVar, e.a aVar) {
        C17542s.j(aVar, "$this$ikeaImageRequest");
        aVar.j(sVar.b().b());
        aVar.l(h.a.XXXS);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N e(C11334s sVar, d dVar, float f10, p pVar, int i10, int i11, C4889m mVar, int i12) {
        c(sVar, dVar, f10, pVar, mVar, M0.a(i10 | 1), i11);
        return C16807N.f139792a;
    }
}
