package vk;

import Op.i1;
import U0.C4889m;
import U0.M0;
import XH.C16807N;
import androidx.compose.ui.d;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000$\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aC\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0001\u001a\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\bH\u0001¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"", "price", "familyDiscountAmount", "LOp/i1;", "currencyConfig", "", "isFamilyMember", "areAllItemPricesIncluded", "Landroidx/compose/ui/d;", "modifier", "LXH/N;", "b", "(DLjava/lang/Double;LOp/i1;ZZLandroidx/compose/ui/d;LU0/m;II)V", "shoppinglist-implementation_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class x1 {
    /* JADX WARNING: Removed duplicated region for block: B:139:0x04cd  */
    /* JADX WARNING: Removed duplicated region for block: B:141:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00cc  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00d3  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void b(double r44, java.lang.Double r46, Op.i1 r47, boolean r48, boolean r49, androidx.compose.ui.d r50, U0.C4889m r51, int r52, int r53) {
        /*
            r1 = r44
            r3 = r46
            r4 = r47
            r5 = r48
            r6 = r49
            r8 = r52
            r0 = 8
            r7 = 32
            r9 = 16
            r10 = 2
            r11 = 48
            r12 = 6
            java.lang.String r13 = "currencyConfig"
            kotlin.jvm.internal.C17542s.j(r4, r13)
            r13 = 889090491(0x34fe71bb, float:4.7393937E-7)
            r14 = r51
            U0.m r15 = r14.k(r13)
            r14 = 1
            r16 = r53 & 1
            r14 = 4
            if (r16 == 0) goto L_0x002d
            r16 = r8 | 6
            goto L_0x0041
        L_0x002d:
            r16 = r8 & 6
            if (r16 != 0) goto L_0x003f
            boolean r16 = r15.h(r1)
            if (r16 == 0) goto L_0x003a
            r16 = r14
            goto L_0x003c
        L_0x003a:
            r16 = r10
        L_0x003c:
            r16 = r8 | r16
            goto L_0x0041
        L_0x003f:
            r16 = r8
        L_0x0041:
            r10 = r53 & 2
            if (r10 == 0) goto L_0x004a
            r16 = r16 | 48
        L_0x0047:
            r10 = r16
            goto L_0x005a
        L_0x004a:
            r10 = r8 & 48
            if (r10 != 0) goto L_0x0047
            boolean r10 = r15.V(r3)
            if (r10 == 0) goto L_0x0056
            r10 = r7
            goto L_0x0057
        L_0x0056:
            r10 = r9
        L_0x0057:
            r16 = r16 | r10
            goto L_0x0047
        L_0x005a:
            r16 = r53 & 4
            if (r16 == 0) goto L_0x0061
            r10 = r10 | 384(0x180, float:5.38E-43)
            goto L_0x0071
        L_0x0061:
            r14 = r8 & 384(0x180, float:5.38E-43)
            if (r14 != 0) goto L_0x0071
            boolean r14 = r15.V(r4)
            if (r14 == 0) goto L_0x006e
            r14 = 256(0x100, float:3.59E-43)
            goto L_0x0070
        L_0x006e:
            r14 = 128(0x80, float:1.794E-43)
        L_0x0070:
            r10 = r10 | r14
        L_0x0071:
            r14 = r53 & 8
            if (r14 == 0) goto L_0x0078
            r10 = r10 | 3072(0xc00, float:4.305E-42)
            goto L_0x0088
        L_0x0078:
            r14 = r8 & 3072(0xc00, float:4.305E-42)
            if (r14 != 0) goto L_0x0088
            boolean r14 = r15.b(r5)
            if (r14 == 0) goto L_0x0085
            r14 = 2048(0x800, float:2.87E-42)
            goto L_0x0087
        L_0x0085:
            r14 = 1024(0x400, float:1.435E-42)
        L_0x0087:
            r10 = r10 | r14
        L_0x0088:
            r14 = r53 & 16
            if (r14 == 0) goto L_0x008f
            r10 = r10 | 24576(0x6000, float:3.4438E-41)
            goto L_0x009f
        L_0x008f:
            r14 = r8 & 24576(0x6000, float:3.4438E-41)
            if (r14 != 0) goto L_0x009f
            boolean r14 = r15.b(r6)
            if (r14 == 0) goto L_0x009c
            r14 = 16384(0x4000, float:2.2959E-41)
            goto L_0x009e
        L_0x009c:
            r14 = 8192(0x2000, float:1.14794E-41)
        L_0x009e:
            r10 = r10 | r14
        L_0x009f:
            r7 = r53 & 32
            r14 = 196608(0x30000, float:2.75506E-40)
            if (r7 == 0) goto L_0x00a9
            r10 = r10 | r14
        L_0x00a6:
            r14 = r50
            goto L_0x00bb
        L_0x00a9:
            r14 = r14 & r8
            if (r14 != 0) goto L_0x00a6
            r14 = r50
            boolean r17 = r15.V(r14)
            if (r17 == 0) goto L_0x00b7
            r17 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00b9
        L_0x00b7:
            r17 = 65536(0x10000, float:9.18355E-41)
        L_0x00b9:
            r10 = r10 | r17
        L_0x00bb:
            r17 = 74899(0x12493, float:1.04956E-40)
            r0 = r10 & r17
            r9 = 74898(0x12492, float:1.04954E-40)
            if (r0 != r9) goto L_0x00d3
            boolean r0 = r15.l()
            if (r0 != 0) goto L_0x00cc
            goto L_0x00d3
        L_0x00cc:
            r15.L()
            r7 = r14
            r12 = r15
            goto L_0x04c7
        L_0x00d3:
            if (r7 == 0) goto L_0x00d8
            androidx.compose.ui.d$a r0 = androidx.compose.ui.d.f18749a
            goto L_0x00d9
        L_0x00d8:
            r0 = r14
        L_0x00d9:
            boolean r7 = U0.C4895p.J()
            if (r7 == 0) goto L_0x00e5
            r7 = -1
            java.lang.String r9 = "com.ingka.ikea.app.shoppinglist.listdetails.ui.composables.TotalPriceItem (TotalPriceItem.kt:50)"
            U0.C4895p.S(r13, r10, r7, r9)
        L_0x00e5:
            kp.d r7 = r47.a()
            r9 = 24
            float r9 = (float) r9
            float r10 = c2.h.B(r9)
            androidx.compose.ui.d r10 = androidx.compose.foundation.layout.D.i(r0, r10)
            androidx.compose.foundation.layout.d r13 = androidx.compose.foundation.layout.C5073d.f18068a
            androidx.compose.foundation.layout.d$m r14 = r13.g()
            i1.c$a r40 = i1.C5437c.f24302a
            i1.c$b r11 = r40.k()
            r12 = 0
            E1.I r11 = androidx.compose.foundation.layout.C5080k.a(r14, r11, r15, r12)
            int r14 = U0.C4883j.a(r15, r12)
            U0.y r12 = r15.s()
            androidx.compose.ui.d r10 = androidx.compose.ui.c.e(r15, r10)
            G1.g$a r41 = G1.C4504g.f6515W
            r42 = r0
            nI.a r0 = r41.a()
            U0.f r17 = r15.m()
            if (r17 != 0) goto L_0x0122
            U0.C4883j.c()
        L_0x0122:
            r15.I()
            boolean r17 = r15.i()
            if (r17 == 0) goto L_0x012f
            r15.p(r0)
            goto L_0x0132
        L_0x012f:
            r15.t()
        L_0x0132:
            U0.m r0 = U0.F1.a(r15)
            nI.p r4 = r41.c()
            U0.F1.c(r0, r11, r4)
            nI.p r4 = r41.e()
            U0.F1.c(r0, r12, r4)
            nI.p r4 = r41.b()
            boolean r11 = r0.i()
            if (r11 != 0) goto L_0x015c
            java.lang.Object r11 = r0.D()
            java.lang.Integer r12 = java.lang.Integer.valueOf(r14)
            boolean r11 = kotlin.jvm.internal.C17542s.e(r11, r12)
            if (r11 != 0) goto L_0x016a
        L_0x015c:
            java.lang.Integer r11 = java.lang.Integer.valueOf(r14)
            r0.u(r11)
            java.lang.Integer r11 = java.lang.Integer.valueOf(r14)
            r0.w(r11, r4)
        L_0x016a:
            nI.p r4 = r41.d()
            U0.F1.c(r0, r10, r4)
            s0.h r0 = s0.C5862h.f28810a
            tK.e r0 = tK.C18014e.f147445a
            float r0 = r0.a()
            tK.v r4 = tK.C18030v.f147664a
            int r10 = tK.C18030v.f147665b
            tK.h r11 = r4.a(r15, r10)
            long r11 = r11.p0()
            r19 = 0
            r20 = 1
            r14 = 0
            r8 = 1
            r51 = r15
            r15 = r0
            r16 = r11
            r18 = r51
            SC.C13643u0.c(r14, r15, r16, r18, r19, r20)
            androidx.compose.ui.d$a r0 = androidx.compose.ui.d.f18749a
            float r11 = c2.h.B(r9)
            androidx.compose.ui.d r11 = androidx.compose.foundation.layout.J.i(r0, r11)
            r12 = r51
            r14 = 6
            s0.C5844O.a(r11, r12, r14)
            r11 = 0
            r15 = 0
            androidx.compose.ui.d r14 = androidx.compose.foundation.layout.J.h(r0, r11, r8, r15)
            i1.c$c r15 = r40.i()
            androidx.compose.foundation.layout.d$e r8 = r13.f()
            r11 = 48
            E1.I r8 = androidx.compose.foundation.layout.G.b(r8, r15, r12, r11)
            r11 = 0
            int r15 = U0.C4883j.a(r12, r11)
            U0.y r11 = r12.s()
            androidx.compose.ui.d r14 = androidx.compose.ui.c.e(r12, r14)
            nI.a r6 = r41.a()
            U0.f r16 = r12.m()
            if (r16 != 0) goto L_0x01d3
            U0.C4883j.c()
        L_0x01d3:
            r12.I()
            boolean r16 = r12.i()
            if (r16 == 0) goto L_0x01e0
            r12.p(r6)
            goto L_0x01e3
        L_0x01e0:
            r12.t()
        L_0x01e3:
            U0.m r6 = U0.F1.a(r12)
            r43 = r4
            nI.p r4 = r41.c()
            U0.F1.c(r6, r8, r4)
            nI.p r4 = r41.e()
            U0.F1.c(r6, r11, r4)
            nI.p r4 = r41.b()
            boolean r8 = r6.i()
            if (r8 != 0) goto L_0x020f
            java.lang.Object r8 = r6.D()
            java.lang.Integer r11 = java.lang.Integer.valueOf(r15)
            boolean r8 = kotlin.jvm.internal.C17542s.e(r8, r11)
            if (r8 != 0) goto L_0x021d
        L_0x020f:
            java.lang.Integer r8 = java.lang.Integer.valueOf(r15)
            r6.u(r8)
            java.lang.Integer r8 = java.lang.Integer.valueOf(r15)
            r6.w(r8, r4)
        L_0x021d:
            nI.p r4 = r41.d()
            U0.F1.c(r6, r14, r4)
            s0.N r21 = s0.C5843N.f28726a
            int r4 = ik.c.f98356y
            r6 = 0
            java.lang.String r14 = J1.j.b(r4, r12, r6)
            TC.b$b$b r15 = TC.C13679b.C2857b.C2858b.f116684a
            r4 = 0
            r25 = 2
            r26 = 0
            r23 = 1065353216(0x3f800000, float:1.0)
            r24 = 0
            r22 = r0
            androidx.compose.ui.d r16 = s0.C5842M.e(r21, r22, r23, r24, r25, r26)
            r38 = 0
            r39 = 262136(0x3fff8, float:3.67331E-40)
            r17 = 0
            r19 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r24 = 0
            r27 = 0
            r28 = 0
            r29 = 0
            r31 = 0
            r32 = 0
            r33 = 0
            r34 = 0
            r35 = 0
            r37 = 48
            r36 = r12
            SC.C13607l.j(r14, r15, r16, r17, r19, r21, r22, r23, r24, r26, r27, r28, r29, r31, r32, r33, r34, r35, r36, r37, r38, r39)
            r6 = 4
            float r6 = (float) r6
            float r6 = c2.h.B(r6)
            androidx.compose.ui.d r6 = androidx.compose.foundation.layout.J.y(r0, r6)
            r8 = 6
            s0.C5844O.a(r6, r12, r8)
            qx.c r14 = qx.C14957b.a(r1, r7)
            SC.n r15 = SC.L1.b(r7)
            int r19 = qx.c.f130485c
            r20 = 12
            r16 = 0
            r17 = 0
            r18 = r12
            SC.L1.c(r14, r15, r16, r17, r18, r19, r20)
            r12.x()
            r6 = 758503206(0x2d35d726, float:1.0336431E-11)
            r12.W(r6)
            if (r3 != 0) goto L_0x0298
            r1 = r43
            goto L_0x03a1
        L_0x0298:
            double r14 = r46.doubleValue()
            float r6 = c2.h.B(r9)
            androidx.compose.ui.d r6 = androidx.compose.foundation.layout.J.i(r0, r6)
            r8 = 6
            s0.C5844O.a(r6, r12, r8)
            i1.c$c r6 = r40.i()
            androidx.compose.foundation.layout.d$e r8 = r13.f()
            r9 = 48
            E1.I r6 = androidx.compose.foundation.layout.G.b(r8, r6, r12, r9)
            r8 = 0
            int r9 = U0.C4883j.a(r12, r8)
            U0.y r8 = r12.s()
            androidx.compose.ui.d r11 = androidx.compose.ui.c.e(r12, r0)
            nI.a r4 = r41.a()
            U0.f r16 = r12.m()
            if (r16 != 0) goto L_0x02d0
            U0.C4883j.c()
        L_0x02d0:
            r12.I()
            boolean r16 = r12.i()
            if (r16 == 0) goto L_0x02dd
            r12.p(r4)
            goto L_0x02e0
        L_0x02dd:
            r12.t()
        L_0x02e0:
            U0.m r4 = U0.F1.a(r12)
            nI.p r1 = r41.c()
            U0.F1.c(r4, r6, r1)
            nI.p r1 = r41.e()
            U0.F1.c(r4, r8, r1)
            nI.p r1 = r41.b()
            boolean r2 = r4.i()
            if (r2 != 0) goto L_0x030a
            java.lang.Object r2 = r4.D()
            java.lang.Integer r6 = java.lang.Integer.valueOf(r9)
            boolean r2 = kotlin.jvm.internal.C17542s.e(r2, r6)
            if (r2 != 0) goto L_0x0318
        L_0x030a:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r9)
            r4.u(r2)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r9)
            r4.w(r2, r1)
        L_0x0318:
            nI.p r1 = r41.d()
            U0.F1.c(r4, r11, r1)
            int r1 = lg.C10027d.f75284o
            r2 = 0
            t1.c r1 = J1.e.c(r1, r12, r2)
            r22 = 48
            r23 = 124(0x7c, float:1.74E-43)
            r2 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r8 = r14
            r14 = r1
            r15 = r2
            r21 = r12
            n0.C5583F.a(r14, r15, r16, r17, r18, r19, r20, r21, r22, r23)
            r1 = 16
            float r1 = (float) r1
            float r1 = c2.h.B(r1)
            androidx.compose.ui.d r1 = androidx.compose.foundation.layout.J.y(r0, r1)
            r2 = 6
            s0.C5844O.a(r1, r12, r2)
            if (r5 == 0) goto L_0x0351
            int r1 = ik.c.f98354w
            goto L_0x0353
        L_0x0351:
            int r1 = ik.c.f98355x
        L_0x0353:
            qx.a r2 = qx.C14956a.f130484a
            java.lang.String r2 = r2.b(r8, r7)
            java.lang.Object[] r2 = new java.lang.Object[]{r2}
            r4 = 0
            java.lang.String r14 = J1.j.c(r1, r2, r12, r4)
            TC.b$b$f r15 = TC.C13679b.C2857b.f.f116688a
            r1 = r43
            tK.h r2 = r1.a(r12, r10)
            long r17 = r2.f()
            java.lang.String r2 = "savings_amount_label"
            androidx.compose.ui.d r16 = androidx.compose.ui.platform.C5116k1.a(r0, r2)
            r38 = 0
            r39 = 262128(0x3fff0, float:3.6732E-40)
            r19 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r24 = 0
            r26 = 0
            r27 = 0
            r28 = 0
            r29 = 0
            r31 = 0
            r32 = 0
            r33 = 0
            r34 = 0
            r35 = 0
            r37 = 432(0x1b0, float:6.05E-43)
            r36 = r12
            SC.C13607l.j(r14, r15, r16, r17, r19, r21, r22, r23, r24, r26, r27, r28, r29, r31, r32, r33, r34, r35, r36, r37, r38, r39)
            r12.x()
            XH.N r2 = XH.C16807N.f139792a
        L_0x03a1:
            r12.P()
            r2 = 758537197(0x2d365bed, float:1.0365914E-11)
            r12.W(r2)
            if (r49 != 0) goto L_0x04b6
            r2 = 12
            float r2 = (float) r2
            float r2 = c2.h.B(r2)
            androidx.compose.ui.d r2 = androidx.compose.foundation.layout.J.i(r0, r2)
            r4 = 6
            s0.C5844O.a(r2, r12, r4)
            r2 = 1
            r4 = 0
            r6 = 0
            androidx.compose.ui.d r2 = androidx.compose.foundation.layout.J.h(r0, r4, r2, r6)
            i1.c$c r4 = r40.i()
            androidx.compose.foundation.layout.d$e r6 = r13.f()
            r7 = 48
            E1.I r4 = androidx.compose.foundation.layout.G.b(r6, r4, r12, r7)
            r6 = 0
            int r7 = U0.C4883j.a(r12, r6)
            U0.y r6 = r12.s()
            androidx.compose.ui.d r2 = androidx.compose.ui.c.e(r12, r2)
            nI.a r8 = r41.a()
            U0.f r9 = r12.m()
            if (r9 != 0) goto L_0x03ea
            U0.C4883j.c()
        L_0x03ea:
            r12.I()
            boolean r9 = r12.i()
            if (r9 == 0) goto L_0x03f7
            r12.p(r8)
            goto L_0x03fa
        L_0x03f7:
            r12.t()
        L_0x03fa:
            U0.m r8 = U0.F1.a(r12)
            nI.p r9 = r41.c()
            U0.F1.c(r8, r4, r9)
            nI.p r4 = r41.e()
            U0.F1.c(r8, r6, r4)
            nI.p r4 = r41.b()
            boolean r6 = r8.i()
            if (r6 != 0) goto L_0x0424
            java.lang.Object r6 = r8.D()
            java.lang.Integer r9 = java.lang.Integer.valueOf(r7)
            boolean r6 = kotlin.jvm.internal.C17542s.e(r6, r9)
            if (r6 != 0) goto L_0x0432
        L_0x0424:
            java.lang.Integer r6 = java.lang.Integer.valueOf(r7)
            r8.u(r6)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r7)
            r8.w(r6, r4)
        L_0x0432:
            nI.p r4 = r41.d()
            U0.F1.c(r8, r2, r4)
            int r2 = uK.C18146a.f148718xd
            r4 = 0
            t1.c r14 = J1.e.c(r2, r12, r4)
            p1.w0$a r15 = p1.C5749w0.f27365b
            tK.h r1 = r1.a(r12, r10)
            long r16 = r1.G0()
            r19 = 2
            r20 = 0
            r18 = 0
            p1.w0 r20 = p1.C5749w0.a.b(r15, r16, r18, r19, r20)
            r1 = 18
            float r1 = (float) r1
            float r1 = c2.h.B(r1)
            androidx.compose.ui.d r16 = androidx.compose.foundation.layout.J.t(r0, r1)
            r22 = 432(0x1b0, float:6.05E-43)
            r23 = 56
            r15 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r21 = r12
            n0.C5583F.a(r14, r15, r16, r17, r18, r19, r20, r21, r22, r23)
            r1 = 8
            float r1 = (float) r1
            float r1 = c2.h.B(r1)
            androidx.compose.ui.d r0 = androidx.compose.foundation.layout.J.y(r0, r1)
            r1 = 6
            s0.C5844O.a(r0, r12, r1)
            int r0 = ik.c.f98317I
            r1 = 0
            java.lang.String r14 = J1.j.b(r0, r12, r1)
            TC.b$a$b r15 = TC.C13679b.a.C2856b.f116680a
            r38 = 0
            r39 = 262140(0x3fffc, float:3.67336E-40)
            r16 = 0
            r17 = 0
            r19 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r24 = 0
            r26 = 0
            r27 = 0
            r28 = 0
            r29 = 0
            r31 = 0
            r32 = 0
            r33 = 0
            r34 = 0
            r35 = 0
            r37 = 48
            r36 = r12
            SC.C13607l.j(r14, r15, r16, r17, r19, r21, r22, r23, r24, r26, r27, r28, r29, r31, r32, r33, r34, r35, r36, r37, r38, r39)
            r12.x()
        L_0x04b6:
            r12.P()
            r12.x()
            boolean r0 = U0.C4895p.J()
            if (r0 == 0) goto L_0x04c5
            U0.C4895p.R()
        L_0x04c5:
            r7 = r42
        L_0x04c7:
            U0.Y0 r10 = r12.n()
            if (r10 == 0) goto L_0x04e4
            vk.w1 r11 = new vk.w1
            r0 = r11
            r1 = r44
            r3 = r46
            r4 = r47
            r5 = r48
            r6 = r49
            r8 = r52
            r9 = r53
            r0.<init>(r1, r3, r4, r5, r6, r7, r8, r9)
            r10.a(r11)
        L_0x04e4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: vk.x1.b(double, java.lang.Double, Op.i1, boolean, boolean, androidx.compose.ui.d, U0.m, int, int):void");
    }

    /* access modifiers changed from: private */
    public static final C16807N c(double d10, Double d11, i1 i1Var, boolean z10, boolean z11, d dVar, int i10, int i11, C4889m mVar, int i12) {
        b(d10, d11, i1Var, z10, z11, dVar, mVar, M0.a(i10 | 1), i11);
        return C16807N.f139792a;
    }
}
