package zG;

import N1.Y;
import U0.C4889m;
import U0.M0;
import XH.C16807N;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a)\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"", "text", "LN1/Y;", "style", "", "maxLines", "LXH/N;", "b", "(Ljava/lang/String;LN1/Y;ILU0/m;II)V", "v2_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class j {
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0070  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0076  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x0189  */
    /* JADX WARNING: Removed duplicated region for block: B:65:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void b(java.lang.String r49, N1.Y r50, int r51, U0.C4889m r52, int r53, int r54) {
        /*
            r12 = r49
            r13 = r50
            r14 = r53
            java.lang.String r0 = "text"
            kotlin.jvm.internal.C17542s.j(r12, r0)
            java.lang.String r0 = "style"
            kotlin.jvm.internal.C17542s.j(r13, r0)
            r0 = -1548725612(0xffffffffa3b05294, float:-1.9116931E-17)
            r1 = r52
            U0.m r15 = r1.k(r0)
            r1 = r54 & 1
            if (r1 == 0) goto L_0x0020
            r1 = r14 | 6
            goto L_0x0030
        L_0x0020:
            r1 = r14 & 6
            if (r1 != 0) goto L_0x002f
            boolean r1 = r15.V(r12)
            if (r1 == 0) goto L_0x002c
            r1 = 4
            goto L_0x002d
        L_0x002c:
            r1 = 2
        L_0x002d:
            r1 = r1 | r14
            goto L_0x0030
        L_0x002f:
            r1 = r14
        L_0x0030:
            r2 = r54 & 2
            r3 = 16
            if (r2 == 0) goto L_0x0039
            r1 = r1 | 48
            goto L_0x0048
        L_0x0039:
            r2 = r14 & 48
            if (r2 != 0) goto L_0x0048
            boolean r2 = r15.V(r13)
            if (r2 == 0) goto L_0x0046
            r2 = 32
            goto L_0x0047
        L_0x0046:
            r2 = r3
        L_0x0047:
            r1 = r1 | r2
        L_0x0048:
            r2 = r54 & 4
            if (r2 == 0) goto L_0x0051
            r1 = r1 | 384(0x180, float:5.38E-43)
        L_0x004e:
            r4 = r51
            goto L_0x0063
        L_0x0051:
            r4 = r14 & 384(0x180, float:5.38E-43)
            if (r4 != 0) goto L_0x004e
            r4 = r51
            boolean r5 = r15.d(r4)
            if (r5 == 0) goto L_0x0060
            r5 = 256(0x100, float:3.59E-43)
            goto L_0x0062
        L_0x0060:
            r5 = 128(0x80, float:1.794E-43)
        L_0x0062:
            r1 = r1 | r5
        L_0x0063:
            r5 = r1 & 147(0x93, float:2.06E-43)
            r6 = 146(0x92, float:2.05E-43)
            if (r5 != r6) goto L_0x0076
            boolean r5 = r15.l()
            if (r5 != 0) goto L_0x0070
            goto L_0x0076
        L_0x0070:
            r15.L()
            r3 = r4
            goto L_0x0183
        L_0x0076:
            if (r2 == 0) goto L_0x007c
            r2 = 3
            r16 = r2
            goto L_0x007e
        L_0x007c:
            r16 = r4
        L_0x007e:
            boolean r2 = U0.C4895p.J()
            if (r2 == 0) goto L_0x008a
            r2 = -1
            java.lang.String r4 = "com.sugarcube.decorate.v2.internal.ui.catalog.ui.common.LimitedLinesText (LimitedLinesText.kt:34)"
            U0.C4895p.S(r0, r1, r2, r4)
        L_0x008a:
            long r4 = r50.l()
            c2.v r0 = c2.v.b(r4)
            long r4 = r0.k()
            c2.v$a r2 = c2.v.f23057b
            long r6 = r2.a()
            boolean r4 = c2.v.e(r4, r6)
            r5 = 0
            if (r4 != 0) goto L_0x00a4
            goto L_0x00a5
        L_0x00a4:
            r0 = r5
        L_0x00a5:
            if (r0 == 0) goto L_0x00ae
            long r3 = r0.k()
        L_0x00ab:
            r20 = r3
            goto L_0x00b3
        L_0x00ae:
            long r3 = c2.w.i(r3)
            goto L_0x00ab
        L_0x00b3:
            long r3 = r50.s()
            c2.v r0 = c2.v.b(r3)
            long r3 = r0.k()
            long r6 = r2.a()
            boolean r2 = c2.v.e(r3, r6)
            if (r2 != 0) goto L_0x00ca
            r5 = r0
        L_0x00ca:
            if (r5 == 0) goto L_0x00d3
            long r2 = r5.k()
        L_0x00d0:
            r39 = r2
            goto L_0x00e7
        L_0x00d3:
            c2.w.b(r20)
            long r2 = c2.v.f(r20)
            float r0 = c2.v.h(r20)
            r4 = 1067030938(0x3f99999a, float:1.2)
            float r0 = r0 * r4
            long r2 = c2.w.l(r2, r0)
            goto L_0x00d0
        L_0x00e7:
            int r0 = r16 + 1
            c2.w.b(r39)
            long r2 = c2.v.f(r39)
            float r4 = c2.v.h(r39)
            float r0 = (float) r0
            float r4 = r4 * r0
            long r2 = c2.w.l(r2, r4)
            U0.I0 r0 = androidx.compose.ui.platform.C5100f0.e()
            java.lang.Object r0 = r15.Q(r0)
            c2.d r0 = (c2.d) r0
            float r0 = r0.q(r2)
            tK.v r2 = tK.C18030v.f147664a
            int r3 = tK.C18030v.f147665b
            tK.h r2 = r2.a(r15, r3)
            long r18 = r2.G0()
            N1.Y r2 = new N1.Y
            r17 = r2
            r47 = 16646140(0xfdfffc, float:2.332621E-38)
            r48 = 0
            r22 = 0
            r23 = 0
            r24 = 0
            r25 = 0
            r26 = 0
            r27 = 0
            r29 = 0
            r30 = 0
            r31 = 0
            r32 = 0
            r34 = 0
            r35 = 0
            r36 = 0
            r37 = 0
            r38 = 0
            r41 = 0
            r42 = 0
            r43 = 0
            r44 = 0
            r45 = 0
            r46 = 0
            r17.<init>(r18, r20, r22, r23, r24, r25, r26, r27, r29, r30, r31, r32, r34, r35, r36, r37, r38, r39, r41, r42, r43, r44, r45, r46, r47, r48)
            androidx.compose.ui.d$a r3 = androidx.compose.ui.d.f18749a
            androidx.compose.ui.d r0 = androidx.compose.foundation.layout.J.j(r3, r0, r0)
            java.lang.String r3 = "PRODUCT_CARD_DESCRIPTION_TEST_TAG"
            androidx.compose.ui.d r3 = androidx.compose.ui.platform.C5116k1.a(r0, r3)
            Y1.t$a r0 = Y1.t.f14827a
            int r4 = r0.b()
            r0 = r1 & 14
            r0 = r0 | 24576(0x6000, float:3.4438E-41)
            int r1 = r1 << 12
            r5 = 3670016(0x380000, float:5.142788E-39)
            r1 = r1 & r5
            r10 = r0 | r1
            r11 = 424(0x1a8, float:5.94E-43)
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r0 = r49
            r1 = r3
            r3 = r5
            r5 = r6
            r6 = r16
            r9 = r15
            B0.C4360d.b(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            boolean r0 = U0.C4895p.J()
            if (r0 == 0) goto L_0x0181
            U0.C4895p.R()
        L_0x0181:
            r3 = r16
        L_0x0183:
            U0.Y0 r6 = r15.n()
            if (r6 == 0) goto L_0x019a
            zG.i r7 = new zG.i
            r0 = r7
            r1 = r49
            r2 = r50
            r4 = r53
            r5 = r54
            r0.<init>(r1, r2, r3, r4, r5)
            r6.a(r7)
        L_0x019a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: zG.j.b(java.lang.String, N1.Y, int, U0.m, int, int):void");
    }

    /* access modifiers changed from: private */
    public static final C16807N c(String str, Y y10, int i10, int i11, int i12, C4889m mVar, int i13) {
        b(str, y10, i10, mVar, M0.a(i11 | 1), i12);
        return C16807N.f139792a;
    }
}
