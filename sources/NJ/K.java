package nj;

import U0.C4889m;
import U0.M0;
import XH.C16807N;
import androidx.compose.ui.d;
import kotlin.Metadata;
import nI.C17631a;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a1\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0001¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Landroidx/compose/ui/d;", "modifier", "", "restTitle", "Lkotlin/Function0;", "LXH/N;", "onClick", "b", "(Landroidx/compose/ui/d;ILnI/a;LU0/m;II)V", "scanandgo-implementation_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class K {
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00af  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00fd  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void b(androidx.compose.ui.d r19, int r20, nI.C17631a<XH.C16807N> r21, U0.C4889m r22, int r23, int r24) {
        /*
            r13 = r21
            r14 = r23
            java.lang.String r0 = "onClick"
            kotlin.jvm.internal.C17542s.j(r13, r0)
            r0 = 1594391607(0x5f087c37, float:9.834796E18)
            r1 = r22
            U0.m r15 = r1.k(r0)
            r1 = r24 & 1
            if (r1 == 0) goto L_0x001c
            r2 = r14 | 6
            r3 = r2
            r2 = r19
            goto L_0x0030
        L_0x001c:
            r2 = r14 & 6
            if (r2 != 0) goto L_0x002d
            r2 = r19
            boolean r3 = r15.V(r2)
            if (r3 == 0) goto L_0x002a
            r3 = 4
            goto L_0x002b
        L_0x002a:
            r3 = 2
        L_0x002b:
            r3 = r3 | r14
            goto L_0x0030
        L_0x002d:
            r2 = r19
            r3 = r14
        L_0x0030:
            r4 = r14 & 48
            if (r4 != 0) goto L_0x0049
            r4 = r24 & 2
            if (r4 != 0) goto L_0x0043
            r4 = r20
            boolean r5 = r15.d(r4)
            if (r5 == 0) goto L_0x0045
            r5 = 32
            goto L_0x0047
        L_0x0043:
            r4 = r20
        L_0x0045:
            r5 = 16
        L_0x0047:
            r3 = r3 | r5
            goto L_0x004b
        L_0x0049:
            r4 = r20
        L_0x004b:
            r5 = r24 & 4
            if (r5 == 0) goto L_0x0052
            r3 = r3 | 384(0x180, float:5.38E-43)
            goto L_0x0062
        L_0x0052:
            r5 = r14 & 384(0x180, float:5.38E-43)
            if (r5 != 0) goto L_0x0062
            boolean r5 = r15.F(r13)
            if (r5 == 0) goto L_0x005f
            r5 = 256(0x100, float:3.59E-43)
            goto L_0x0061
        L_0x005f:
            r5 = 128(0x80, float:1.794E-43)
        L_0x0061:
            r3 = r3 | r5
        L_0x0062:
            r5 = r3 & 147(0x93, float:2.06E-43)
            r6 = 146(0x92, float:2.05E-43)
            if (r5 != r6) goto L_0x0076
            boolean r5 = r15.l()
            if (r5 != 0) goto L_0x006f
            goto L_0x0076
        L_0x006f:
            r15.L()
            r1 = r2
            r2 = r4
            goto L_0x0104
        L_0x0076:
            r15.G()
            r5 = r14 & 1
            if (r5 == 0) goto L_0x0091
            boolean r5 = r15.O()
            if (r5 == 0) goto L_0x0084
            goto L_0x0091
        L_0x0084:
            r15.L()
            r1 = r24 & 2
            if (r1 == 0) goto L_0x008d
            r3 = r3 & -113(0xffffffffffffff8f, float:NaN)
        L_0x008d:
            r16 = r2
        L_0x008f:
            r12 = r4
            goto L_0x00a6
        L_0x0091:
            if (r1 == 0) goto L_0x0096
            androidx.compose.ui.d$a r1 = androidx.compose.ui.d.f18749a
            goto L_0x0097
        L_0x0096:
            r1 = r2
        L_0x0097:
            r2 = r24 & 2
            if (r2 == 0) goto L_0x00a3
            int r2 = Oo.b.f84488R0
            r3 = r3 & -113(0xffffffffffffff8f, float:NaN)
            r16 = r1
            r12 = r2
            goto L_0x00a6
        L_0x00a3:
            r16 = r1
            goto L_0x008f
        L_0x00a6:
            r15.y()
            boolean r1 = U0.C4895p.J()
            if (r1 == 0) goto L_0x00b5
            r1 = -1
            java.lang.String r2 = "com.ingka.ikea.app.scanandgoonlineredesign.dialog.bottomsheet.composable.SecondaryButton (SecondaryButton.kt:23)"
            U0.C4895p.S(r0, r3, r1, r2)
        L_0x00b5:
            tK.u r0 = tK.C18029u.f147649a
            float r6 = r0.a()
            r9 = 13
            r10 = 0
            r5 = 0
            r7 = 0
            r8 = 0
            r4 = r16
            androidx.compose.ui.d r0 = androidx.compose.foundation.layout.D.m(r4, r5, r6, r7, r8, r9, r10)
            r1 = 0
            r2 = 0
            r4 = 1
            androidx.compose.ui.d r1 = androidx.compose.foundation.layout.J.h(r0, r1, r4, r2)
            int r0 = r3 >> 3
            r0 = r0 & 14
            java.lang.String r0 = J1.j.b(r12, r15, r0)
            SC.N r4 = SC.N.Tertiary
            int r2 = r3 << 21
            r3 = 1879048192(0x70000000, float:1.58456325E29)
            r2 = r2 & r3
            r11 = r2 | 3072(0xc00, float:4.305E-42)
            r17 = 500(0x1f4, float:7.0E-43)
            r2 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r3 = r4
            r4 = r5
            r5 = r6
            r6 = r7
            r7 = r8
            r8 = r9
            r9 = r21
            r10 = r15
            r18 = r12
            r12 = r17
            SC.L.b(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            boolean r0 = U0.C4895p.J()
            if (r0 == 0) goto L_0x0100
            U0.C4895p.R()
        L_0x0100:
            r1 = r16
            r2 = r18
        L_0x0104:
            U0.Y0 r6 = r15.n()
            if (r6 == 0) goto L_0x0119
            nj.J r7 = new nj.J
            r0 = r7
            r3 = r21
            r4 = r23
            r5 = r24
            r0.<init>(r1, r2, r3, r4, r5)
            r6.a(r7)
        L_0x0119:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: nj.K.b(androidx.compose.ui.d, int, nI.a, U0.m, int, int):void");
    }

    /* access modifiers changed from: private */
    public static final C16807N c(d dVar, int i10, C17631a aVar, int i11, int i12, C4889m mVar, int i13) {
        b(dVar, i10, aVar, mVar, M0.a(i11 | 1), i12);
        return C16807N.f139792a;
    }
}
