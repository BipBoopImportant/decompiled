package uB;

import L1.v;
import L1.x;
import U0.C4889m;
import U0.M0;
import XH.C16807N;
import androidx.compose.ui.d;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import nI.C17631a;
import nI.C17642l;
import vB.C15129b;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aa\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00062\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\n2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\n2\b\b\u0002\u0010\u000e\u001a\u00020\rH\u0007¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"LvB/b;", "carouselShoppingListState", "", "isExpandedWidth", "LuB/g;", "populatedStateConfig", "Lkotlin/Function1;", "", "LXH/N;", "onListClick", "Lkotlin/Function0;", "onCreateListClick", "onSeeAllListsClick", "Landroidx/compose/ui/d;", "modifier", "c", "(LvB/b;ZLuB/g;LnI/l;LnI/a;LnI/a;Landroidx/compose/ui/d;LU0/m;II)V", "shoppinglist_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class r {
    /* JADX WARNING: Removed duplicated region for block: B:122:0x036c  */
    /* JADX WARNING: Removed duplicated region for block: B:124:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x00ec  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x00f3  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void c(vB.C15129b r45, boolean r46, uB.C15109g r47, nI.C17642l<? super java.lang.String, XH.C16807N> r48, nI.C17631a<XH.C16807N> r49, nI.C17631a<XH.C16807N> r50, androidx.compose.ui.d r51, U0.C4889m r52, int r53, int r54) {
        /*
            r1 = r45
            r9 = r46
            r10 = r47
            r11 = r48
            r12 = r49
            r13 = r50
            r14 = r53
            r0 = 16
            r2 = 32
            r3 = 2
            r4 = 4
            r15 = 48
            java.lang.String r5 = "carouselShoppingListState"
            kotlin.jvm.internal.C17542s.j(r1, r5)
            java.lang.String r5 = "populatedStateConfig"
            kotlin.jvm.internal.C17542s.j(r10, r5)
            java.lang.String r5 = "onListClick"
            kotlin.jvm.internal.C17542s.j(r11, r5)
            java.lang.String r5 = "onCreateListClick"
            kotlin.jvm.internal.C17542s.j(r12, r5)
            java.lang.String r5 = "onSeeAllListsClick"
            kotlin.jvm.internal.C17542s.j(r13, r5)
            r5 = -321878987(0xffffffffecd08435, float:-2.0166472E27)
            r6 = r52
            U0.m r8 = r6.k(r5)
            r7 = 1
            r6 = r54 & 1
            if (r6 == 0) goto L_0x0040
            r6 = r14 | 6
            goto L_0x0050
        L_0x0040:
            r6 = r14 & 6
            if (r6 != 0) goto L_0x004f
            boolean r6 = r8.F(r1)
            if (r6 == 0) goto L_0x004c
            r6 = r4
            goto L_0x004d
        L_0x004c:
            r6 = r3
        L_0x004d:
            r6 = r6 | r14
            goto L_0x0050
        L_0x004f:
            r6 = r14
        L_0x0050:
            r3 = r54 & 2
            if (r3 == 0) goto L_0x0056
            r6 = r6 | r15
            goto L_0x0064
        L_0x0056:
            r3 = r14 & 48
            if (r3 != 0) goto L_0x0064
            boolean r3 = r8.b(r9)
            if (r3 == 0) goto L_0x0062
            r3 = r2
            goto L_0x0063
        L_0x0062:
            r3 = r0
        L_0x0063:
            r6 = r6 | r3
        L_0x0064:
            r3 = r54 & 4
            if (r3 == 0) goto L_0x006b
            r6 = r6 | 384(0x180, float:5.38E-43)
            goto L_0x007b
        L_0x006b:
            r3 = r14 & 384(0x180, float:5.38E-43)
            if (r3 != 0) goto L_0x007b
            boolean r3 = r8.V(r10)
            if (r3 == 0) goto L_0x0078
            r3 = 256(0x100, float:3.59E-43)
            goto L_0x007a
        L_0x0078:
            r3 = 128(0x80, float:1.794E-43)
        L_0x007a:
            r6 = r6 | r3
        L_0x007b:
            r3 = r54 & 8
            if (r3 == 0) goto L_0x0082
            r6 = r6 | 3072(0xc00, float:4.305E-42)
            goto L_0x0092
        L_0x0082:
            r3 = r14 & 3072(0xc00, float:4.305E-42)
            if (r3 != 0) goto L_0x0092
            boolean r3 = r8.F(r11)
            if (r3 == 0) goto L_0x008f
            r3 = 2048(0x800, float:2.87E-42)
            goto L_0x0091
        L_0x008f:
            r3 = 1024(0x400, float:1.435E-42)
        L_0x0091:
            r6 = r6 | r3
        L_0x0092:
            r0 = r54 & 16
            if (r0 == 0) goto L_0x0099
            r6 = r6 | 24576(0x6000, float:3.4438E-41)
            goto L_0x00a9
        L_0x0099:
            r0 = r14 & 24576(0x6000, float:3.4438E-41)
            if (r0 != 0) goto L_0x00a9
            boolean r0 = r8.F(r12)
            if (r0 == 0) goto L_0x00a6
            r0 = 16384(0x4000, float:2.2959E-41)
            goto L_0x00a8
        L_0x00a6:
            r0 = 8192(0x2000, float:1.14794E-41)
        L_0x00a8:
            r6 = r6 | r0
        L_0x00a9:
            r0 = r54 & 32
            r2 = 196608(0x30000, float:2.75506E-40)
            if (r0 == 0) goto L_0x00b1
            r6 = r6 | r2
            goto L_0x00c1
        L_0x00b1:
            r0 = r14 & r2
            if (r0 != 0) goto L_0x00c1
            boolean r0 = r8.F(r13)
            if (r0 == 0) goto L_0x00be
            r0 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00c0
        L_0x00be:
            r0 = 65536(0x10000, float:9.18355E-41)
        L_0x00c0:
            r6 = r6 | r0
        L_0x00c1:
            r0 = r54 & 64
            r2 = 1572864(0x180000, float:2.204052E-39)
            if (r0 == 0) goto L_0x00cb
            r6 = r6 | r2
        L_0x00c8:
            r2 = r51
            goto L_0x00dc
        L_0x00cb:
            r2 = r2 & r14
            if (r2 != 0) goto L_0x00c8
            r2 = r51
            boolean r3 = r8.V(r2)
            if (r3 == 0) goto L_0x00d9
            r3 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00db
        L_0x00d9:
            r3 = 524288(0x80000, float:7.34684E-40)
        L_0x00db:
            r6 = r6 | r3
        L_0x00dc:
            r3 = 599187(0x92493, float:8.3964E-40)
            r3 = r3 & r6
            r4 = 599186(0x92492, float:8.39638E-40)
            if (r3 != r4) goto L_0x00f3
            boolean r3 = r8.l()
            if (r3 != 0) goto L_0x00ec
            goto L_0x00f3
        L_0x00ec:
            r8.L()
            r7 = r2
            r0 = r8
            goto L_0x0366
        L_0x00f3:
            if (r0 == 0) goto L_0x00f8
            androidx.compose.ui.d$a r0 = androidx.compose.ui.d.f18749a
            goto L_0x00f9
        L_0x00f8:
            r0 = r2
        L_0x00f9:
            boolean r2 = U0.C4895p.J()
            if (r2 == 0) goto L_0x0105
            r2 = -1
            java.lang.String r3 = "com.ingka.ikea.shoppinglist.ui.ShoppingLists (ShoppingLists.kt:56)"
            U0.C4895p.S(r5, r6, r2, r3)
        L_0x0105:
            KJ.c r42 = r45.a()
            boolean r2 = r42.isEmpty()
            if (r2 == 0) goto L_0x0134
            r2 = 1595992938(0x5f20eb6a, float:1.1595478E19)
            r8.W(r2)
            r2 = r9 ^ 1
            java.lang.String r2 = r1.b(r2)
            java.lang.String r3 = "emptyState"
            androidx.compose.ui.d r4 = androidx.compose.ui.platform.C5116k1.a(r0, r3)
            int r3 = r6 >> 9
            r6 = r3 & 112(0x70, float:1.57E-43)
            r7 = 0
            r3 = r49
            r5 = r8
            uB.C15107e.c(r2, r3, r4, r5, r6, r7)
            r8.P()
            r52 = r0
            r0 = r8
            goto L_0x035b
        L_0x0134:
            r2 = 1596307092(0x5f25b694, float:1.1940894E19)
            r8.W(r2)
            r2 = 0
            r5 = 0
            androidx.compose.ui.d r16 = androidx.compose.foundation.layout.J.h(r0, r2, r7, r5)
            long r17 = r47.a()
            r20 = 2
            r21 = 0
            r19 = 0
            androidx.compose.ui.d r22 = androidx.compose.foundation.b.d(r16, r17, r19, r20, r21)
            tK.u r43 = tK.C18029u.f147649a
            float r26 = r43.d()
            r27 = 7
            r28 = 0
            r23 = 0
            r24 = 0
            r25 = 0
            androidx.compose.ui.d r3 = androidx.compose.foundation.layout.D.m(r22, r23, r24, r25, r26, r27, r28)
            androidx.compose.foundation.layout.d r16 = androidx.compose.foundation.layout.C5073d.f18068a
            androidx.compose.foundation.layout.d$m r4 = r16.g()
            i1.c$a r17 = i1.C5437c.f24302a
            i1.c$b r15 = r17.k()
            r2 = 0
            E1.I r4 = androidx.compose.foundation.layout.C5080k.a(r4, r15, r8, r2)
            int r15 = U0.C4883j.a(r8, r2)
            U0.y r5 = r8.s()
            androidx.compose.ui.d r3 = androidx.compose.ui.c.e(r8, r3)
            G1.g$a r19 = G1.C4504g.f6515W
            nI.a r7 = r19.a()
            U0.f r21 = r8.m()
            if (r21 != 0) goto L_0x018e
            U0.C4883j.c()
        L_0x018e:
            r8.I()
            boolean r21 = r8.i()
            if (r21 == 0) goto L_0x019b
            r8.p(r7)
            goto L_0x019e
        L_0x019b:
            r8.t()
        L_0x019e:
            U0.m r7 = U0.F1.a(r8)
            nI.p r2 = r19.c()
            U0.F1.c(r7, r4, r2)
            nI.p r2 = r19.e()
            U0.F1.c(r7, r5, r2)
            nI.p r2 = r19.b()
            boolean r4 = r7.i()
            if (r4 != 0) goto L_0x01c8
            java.lang.Object r4 = r7.D()
            java.lang.Integer r5 = java.lang.Integer.valueOf(r15)
            boolean r4 = kotlin.jvm.internal.C17542s.e(r4, r5)
            if (r4 != 0) goto L_0x01d6
        L_0x01c8:
            java.lang.Integer r4 = java.lang.Integer.valueOf(r15)
            r7.u(r4)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r15)
            r7.w(r4, r2)
        L_0x01d6:
            nI.p r2 = r19.d()
            U0.F1.c(r7, r3, r2)
            s0.h r2 = s0.C5862h.f28810a
            int r2 = QA.C13351c.f114049a
            r3 = 0
            java.lang.String r15 = J1.j.b(r2, r8, r3)
            androidx.compose.ui.d$a r7 = androidx.compose.ui.d.f18749a
            java.lang.String r2 = "populatedStateHeader"
            androidx.compose.ui.d r2 = androidx.compose.ui.platform.C5116k1.a(r7, r2)
            r3 = 0
            r4 = 0
            r5 = 1
            androidx.compose.ui.d r2 = androidx.compose.foundation.layout.J.h(r2, r4, r5, r3)
            r20 = 7
            r22 = 0
            r4 = 0
            r23 = 0
            r24 = 0
            r21 = r3
            r3 = r4
            r4 = r23
            r21 = r5
            r5 = r24
            r44 = r6
            r6 = r50
            r51 = r7
            r7 = r20
            r52 = r0
            r0 = r8
            r8 = r22
            androidx.compose.ui.d r2 = androidx.compose.foundation.d.d(r2, r3, r4, r5, r6, r7, r8)
            androidx.compose.ui.d r20 = TC.e.i(r2)
            float r22 = r43.e()
            float r24 = r43.d()
            r25 = 5
            r26 = 0
            r21 = 0
            r23 = 0
            androidx.compose.ui.d r2 = androidx.compose.foundation.layout.D.m(r20, r21, r22, r23, r24, r25, r26)
            r3 = 231497129(0xdcc5da9, float:1.2595019E-30)
            r0.W(r3)
            boolean r3 = r0.V(r15)
            java.lang.Object r4 = r0.D()
            if (r3 != 0) goto L_0x0248
            U0.m$a r3 = U0.C4889m.f14007a
            java.lang.Object r3 = r3.a()
            if (r4 != r3) goto L_0x0250
        L_0x0248:
            uB.p r4 = new uB.p
            r4.<init>(r15)
            r0.u(r4)
        L_0x0250:
            nI.l r4 = (nI.C17642l) r4
            r0.P()
            r3 = 1
            r5 = 0
            r6 = 0
            androidx.compose.ui.d r2 = L1.o.d(r2, r6, r4, r3, r5)
            i1.c$c r3 = r17.i()
            androidx.compose.foundation.layout.d$e r4 = r16.f()
            r5 = 48
            E1.I r3 = androidx.compose.foundation.layout.G.b(r4, r3, r0, r5)
            int r4 = U0.C4883j.a(r0, r6)
            U0.y r5 = r0.s()
            androidx.compose.ui.d r2 = androidx.compose.ui.c.e(r0, r2)
            nI.a r7 = r19.a()
            U0.f r8 = r0.m()
            if (r8 != 0) goto L_0x0283
            U0.C4883j.c()
        L_0x0283:
            r0.I()
            boolean r8 = r0.i()
            if (r8 == 0) goto L_0x0290
            r0.p(r7)
            goto L_0x0293
        L_0x0290:
            r0.t()
        L_0x0293:
            U0.m r7 = U0.F1.a(r0)
            nI.p r8 = r19.c()
            U0.F1.c(r7, r3, r8)
            nI.p r3 = r19.e()
            U0.F1.c(r7, r5, r3)
            nI.p r3 = r19.b()
            boolean r5 = r7.i()
            if (r5 != 0) goto L_0x02bd
            java.lang.Object r5 = r7.D()
            java.lang.Integer r8 = java.lang.Integer.valueOf(r4)
            boolean r5 = kotlin.jvm.internal.C17542s.e(r5, r8)
            if (r5 != 0) goto L_0x02cb
        L_0x02bd:
            java.lang.Integer r5 = java.lang.Integer.valueOf(r4)
            r7.u(r5)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r7.w(r4, r3)
        L_0x02cb:
            nI.p r3 = r19.d()
            U0.F1.c(r7, r2, r3)
            s0.N r21 = s0.C5843N.f28726a
            java.lang.String r16 = r47.b()
            TC.b$b$e r17 = TC.C13679b.C2857b.e.f116687a
            r25 = 2
            r26 = 0
            r23 = 1065353216(0x3f800000, float:1.0)
            r24 = 0
            r22 = r51
            androidx.compose.ui.d r18 = s0.C5842M.e(r21, r22, r23, r24, r25, r26)
            r40 = 0
            r41 = 262136(0x3fff8, float:3.67331E-40)
            r19 = 0
            r21 = 0
            r23 = 0
            r24 = 0
            r25 = 0
            r26 = 0
            r28 = 0
            r29 = 0
            r30 = 0
            r31 = 0
            r33 = 0
            r34 = 0
            r35 = 0
            r36 = 0
            r37 = 0
            r39 = 48
            r38 = r0
            SC.C13607l.j(r16, r17, r18, r19, r21, r23, r24, r25, r26, r28, r29, r30, r31, r33, r34, r35, r36, r37, r38, r39, r40, r41)
            float r2 = r43.j()
            r3 = r51
            androidx.compose.ui.d r2 = androidx.compose.foundation.layout.J.y(r3, r2)
            s0.C5844O.a(r2, r0, r6)
            int r2 = uK.C18146a.f148109K
            t1.c r16 = J1.e.c(r2, r0, r6)
            tK.v r2 = tK.C18030v.f147664a
            int r4 = tK.C18030v.f147665b
            tK.h r2 = r2.a(r0, r4)
            long r19 = r2.G0()
            java.lang.String r2 = "arrowIcon"
            androidx.compose.ui.d r18 = androidx.compose.ui.platform.C5116k1.a(r3, r2)
            r22 = 432(0x1b0, float:6.05E-43)
            r23 = 0
            r17 = 0
            r21 = r0
            O0.V.a(r16, r17, r18, r19, r21, r22, r23)
            r0.x()
            r6 = r44
            r7 = r6 & 7280(0x1c70, float:1.0201E-41)
            r8 = 4
            r4 = 0
            r2 = r42
            r3 = r46
            r5 = r48
            r6 = r0
            uB.m.e(r2, r3, r4, r5, r6, r7, r8)
            r0.x()
            r0.P()
        L_0x035b:
            boolean r2 = U0.C4895p.J()
            if (r2 == 0) goto L_0x0364
            U0.C4895p.R()
        L_0x0364:
            r7 = r52
        L_0x0366:
            U0.Y0 r15 = r0.n()
            if (r15 == 0) goto L_0x0386
            uB.q r8 = new uB.q
            r0 = r8
            r1 = r45
            r2 = r46
            r3 = r47
            r4 = r48
            r5 = r49
            r6 = r50
            r10 = r8
            r8 = r53
            r9 = r54
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            r15.a(r10)
        L_0x0386:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: uB.r.c(vB.b, boolean, uB.g, nI.l, nI.a, nI.a, androidx.compose.ui.d, U0.m, int, int):void");
    }

    /* access modifiers changed from: private */
    public static final C16807N d(String str, x xVar) {
        C17542s.j(xVar, "$this$semantics");
        v.d0(xVar, str);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N e(C15129b bVar, boolean z10, C15109g gVar, C17642l lVar, C17631a aVar, C17631a aVar2, d dVar, int i10, int i11, C4889m mVar, int i12) {
        c(bVar, z10, gVar, lVar, aVar, aVar2, dVar, mVar, M0.a(i10 | 1), i11);
        return C16807N.f139792a;
    }
}
