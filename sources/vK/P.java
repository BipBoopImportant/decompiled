package vk;

import U0.C4889m;
import U0.M0;
import XH.C16807N;
import androidx.compose.ui.d;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a)\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"", "listName", "", "productCount", "Landroidx/compose/ui/d;", "modifier", "LXH/N;", "b", "(Ljava/lang/String;ILandroidx/compose/ui/d;LU0/m;II)V", "shoppinglist-implementation_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class P {
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0071  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0079  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x01f9  */
    /* JADX WARNING: Removed duplicated region for block: B:76:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void b(java.lang.String r43, int r44, androidx.compose.ui.d r45, U0.C4889m r46, int r47, int r48) {
        /*
            r0 = r43
            r15 = r44
            r14 = r47
            r1 = 2
            r2 = 4
            r13 = 6
            java.lang.String r3 = "listName"
            kotlin.jvm.internal.C17542s.j(r0, r3)
            r3 = -1770355583(0xffffffff967a8481, float:-2.023665E-25)
            r4 = r46
            U0.m r12 = r4.k(r3)
            r4 = 1
            r5 = r48 & 1
            if (r5 == 0) goto L_0x001f
            r5 = r14 | 6
            goto L_0x002f
        L_0x001f:
            r5 = r14 & 6
            if (r5 != 0) goto L_0x002e
            boolean r5 = r12.V(r0)
            if (r5 == 0) goto L_0x002b
            r5 = r2
            goto L_0x002c
        L_0x002b:
            r5 = r1
        L_0x002c:
            r5 = r5 | r14
            goto L_0x002f
        L_0x002e:
            r5 = r14
        L_0x002f:
            r1 = r48 & 2
            r6 = 16
            if (r1 == 0) goto L_0x0038
            r5 = r5 | 48
            goto L_0x0047
        L_0x0038:
            r1 = r14 & 48
            if (r1 != 0) goto L_0x0047
            boolean r1 = r12.d(r15)
            if (r1 == 0) goto L_0x0045
            r1 = 32
            goto L_0x0046
        L_0x0045:
            r1 = r6
        L_0x0046:
            r5 = r5 | r1
        L_0x0047:
            r1 = r48 & 4
            if (r1 == 0) goto L_0x0051
            r5 = r5 | 384(0x180, float:5.38E-43)
        L_0x004d:
            r2 = r45
        L_0x004f:
            r10 = r5
            goto L_0x0064
        L_0x0051:
            r2 = r14 & 384(0x180, float:5.38E-43)
            if (r2 != 0) goto L_0x004d
            r2 = r45
            boolean r7 = r12.V(r2)
            if (r7 == 0) goto L_0x0060
            r7 = 256(0x100, float:3.59E-43)
            goto L_0x0062
        L_0x0060:
            r7 = 128(0x80, float:1.794E-43)
        L_0x0062:
            r5 = r5 | r7
            goto L_0x004f
        L_0x0064:
            r5 = r10 & 147(0x93, float:2.06E-43)
            r7 = 146(0x92, float:2.05E-43)
            if (r5 != r7) goto L_0x0079
            boolean r5 = r12.l()
            if (r5 != 0) goto L_0x0071
            goto L_0x0079
        L_0x0071:
            r12.L()
            r3 = r2
            r1 = r12
            r2 = r15
            goto L_0x01f3
        L_0x0079:
            if (r1 == 0) goto L_0x007f
            androidx.compose.ui.d$a r1 = androidx.compose.ui.d.f18749a
            r11 = r1
            goto L_0x0080
        L_0x007f:
            r11 = r2
        L_0x0080:
            boolean r1 = U0.C4895p.J()
            if (r1 == 0) goto L_0x008c
            r1 = -1
            java.lang.String r2 = "com.ingka.ikea.app.shoppinglist.listdetails.ui.composables.ListNameItem (ListNameItem.kt:28)"
            U0.C4895p.S(r3, r10, r1, r2)
        L_0x008c:
            r1 = 0
            r2 = 0
            androidx.compose.ui.d r1 = androidx.compose.foundation.layout.J.h(r11, r1, r4, r2)
            androidx.compose.foundation.layout.d r2 = androidx.compose.foundation.layout.C5073d.f18068a
            androidx.compose.foundation.layout.d$m r2 = r2.g()
            i1.c$a r3 = i1.C5437c.f24302a
            i1.c$b r3 = r3.k()
            r5 = 0
            E1.I r2 = androidx.compose.foundation.layout.C5080k.a(r2, r3, r12, r5)
            int r3 = U0.C4883j.a(r12, r5)
            U0.y r7 = r12.s()
            androidx.compose.ui.d r1 = androidx.compose.ui.c.e(r12, r1)
            G1.g$a r8 = G1.C4504g.f6515W
            nI.a r9 = r8.a()
            U0.f r16 = r12.m()
            if (r16 != 0) goto L_0x00be
            U0.C4883j.c()
        L_0x00be:
            r12.I()
            boolean r16 = r12.i()
            if (r16 == 0) goto L_0x00cb
            r12.p(r9)
            goto L_0x00ce
        L_0x00cb:
            r12.t()
        L_0x00ce:
            U0.m r9 = U0.F1.a(r12)
            nI.p r4 = r8.c()
            U0.F1.c(r9, r2, r4)
            nI.p r2 = r8.e()
            U0.F1.c(r9, r7, r2)
            nI.p r2 = r8.b()
            boolean r4 = r9.i()
            if (r4 != 0) goto L_0x00f8
            java.lang.Object r4 = r9.D()
            java.lang.Integer r7 = java.lang.Integer.valueOf(r3)
            boolean r4 = kotlin.jvm.internal.C17542s.e(r4, r7)
            if (r4 != 0) goto L_0x0106
        L_0x00f8:
            java.lang.Integer r4 = java.lang.Integer.valueOf(r3)
            r9.u(r4)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r9.w(r3, r2)
        L_0x0106:
            nI.p r2 = r8.d()
            U0.F1.c(r9, r1, r2)
            s0.h r1 = s0.C5862h.f28810a
            if (r15 <= 0) goto L_0x0113
            r4 = 1
            goto L_0x0114
        L_0x0113:
            r4 = r5
        L_0x0114:
            androidx.compose.ui.d$a r9 = androidx.compose.ui.d.f18749a
            if (r4 == 0) goto L_0x011e
            float r1 = (float) r6
        L_0x0119:
            float r1 = c2.h.B(r1)
            goto L_0x0122
        L_0x011e:
            r1 = 84
            float r1 = (float) r1
            goto L_0x0119
        L_0x0122:
            androidx.compose.ui.d r1 = androidx.compose.foundation.layout.J.i(r9, r1)
            s0.C5844O.a(r1, r12, r5)
            TC.b$b$a r1 = TC.C13679b.C2857b.a.f116683a
            tK.v r8 = tK.C18030v.f147664a
            int r7 = tK.C18030v.f147665b
            tK.h r2 = r8.a(r12, r7)
            long r3 = r2.G0()
            androidx.compose.ui.d r2 = TC.e.i(r9)
            r5 = r10 & 14
            r23 = r5 | 48
            r24 = 0
            r25 = 262128(0x3fff0, float:3.6732E-40)
            r5 = 0
            r16 = 0
            r40 = r7
            r7 = r16
            r41 = r8
            r8 = r16
            r45 = r9
            r9 = r16
            r16 = 0
            r26 = r10
            r42 = r11
            r10 = r16
            r16 = 0
            r46 = r12
            r12 = r16
            r13 = r16
            r14 = r16
            r16 = 0
            r15 = r16
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r0 = r43
            r22 = r46
            SC.C13607l.j(r0, r1, r2, r3, r5, r7, r8, r9, r10, r12, r13, r14, r15, r17, r18, r19, r20, r21, r22, r23, r24, r25)
            r0 = 1302456651(0x4da1e94b, float:3.39552608E8)
            r1 = r46
            r1.W(r0)
            r2 = r44
            if (r2 <= 0) goto L_0x01d1
            int r0 = ik.b.f98307a
            java.lang.Integer r3 = java.lang.Integer.valueOf(r44)
            java.lang.Object[] r3 = new java.lang.Object[]{r3}
            r4 = r26 & 112(0x70, float:1.57E-43)
            java.lang.String r14 = J1.j.a(r0, r2, r3, r1, r4)
            TC.b$a$b r15 = TC.C13679b.a.C2856b.f116680a
            r3 = r40
            r0 = r41
            tK.h r0 = r0.a(r1, r3)
            long r17 = r0.H0()
            androidx.compose.ui.d r16 = TC.e.i(r45)
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
            r37 = 48
            r36 = r1
            SC.C13607l.j(r14, r15, r16, r17, r19, r21, r22, r23, r24, r26, r27, r28, r29, r31, r32, r33, r34, r35, r36, r37, r38, r39)
        L_0x01d1:
            r1.P()
            r0 = 8
            float r0 = (float) r0
            float r0 = c2.h.B(r0)
            r3 = r45
            androidx.compose.ui.d r0 = androidx.compose.foundation.layout.J.i(r3, r0)
            r3 = 6
            s0.C5844O.a(r0, r1, r3)
            r1.x()
            boolean r0 = U0.C4895p.J()
            if (r0 == 0) goto L_0x01f1
            U0.C4895p.R()
        L_0x01f1:
            r3 = r42
        L_0x01f3:
            U0.Y0 r6 = r1.n()
            if (r6 == 0) goto L_0x020a
            vk.O r7 = new vk.O
            r0 = r7
            r1 = r43
            r2 = r44
            r4 = r47
            r5 = r48
            r0.<init>(r1, r2, r3, r4, r5)
            r6.a(r7)
        L_0x020a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: vk.P.b(java.lang.String, int, androidx.compose.ui.d, U0.m, int, int):void");
    }

    /* access modifiers changed from: private */
    public static final C16807N c(String str, int i10, d dVar, int i11, int i12, C4889m mVar, int i13) {
        b(str, i10, dVar, mVar, M0.a(i11 | 1), i12);
        return C16807N.f139792a;
    }
}
