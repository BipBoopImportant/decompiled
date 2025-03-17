package SC;

import U0.C4889m;
import U0.C4895p;
import U0.M0;
import U0.Y0;
import XH.C16807N;
import androidx.compose.ui.d;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import wK.S9;
import wK.V9;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\u001a+\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b\u001a3\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"LSC/L2;", "variant", "Landroidx/compose/ui/d;", "modifier", "", "small", "LXH/N;", "c", "(LSC/L2;Landroidx/compose/ui/d;ZLU0/m;II)V", "", "label", "d", "(Ljava/lang/String;LSC/L2;Landroidx/compose/ui/d;ZLU0/m;II)V", "skapa_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class K2 {
    public static final void c(L2 l22, d dVar, boolean z10, C4889m mVar, int i10, int i11) {
        int i12;
        C17542s.j(l22, "variant");
        C4889m k10 = mVar.k(858203227);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 6) == 0) {
            i12 = (k10.V(l22) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        int i13 = i11 & 2;
        if (i13 != 0) {
            i12 |= 48;
        } else if ((i10 & 48) == 0) {
            i12 |= k10.V(dVar) ? 32 : 16;
        }
        int i14 = i11 & 4;
        if (i14 != 0) {
            i12 |= 384;
        } else if ((i10 & 384) == 0) {
            i12 |= k10.b(z10) ? 256 : 128;
        }
        if ((i12 & 147) != 146 || !k10.l()) {
            if (i13 != 0) {
                dVar = d.f18749a;
            }
            if (i14 != 0) {
                z10 = false;
            }
            if (C4895p.J()) {
                C4895p.S(858203227, i12, -1, "com.ingka.ikea.ui.skapa.SkapaStatus (SkapaStatus.kt:30)");
            }
            S9.e(l22.b(), dVar, z10 ? V9.Small : V9.Proportional, k10, i12 & 112, 0);
            if (C4895p.J()) {
                C4895p.R();
            }
        } else {
            k10.L();
        }
        d dVar2 = dVar;
        boolean z11 = z10;
        Y0 n10 = k10.n();
        if (n10 != null) {
            n10.a(new I2(l22, dVar2, z11, i10, i11));
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:34:0x0066  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x006b  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x008a  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x008f  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00d5  */
    /* JADX WARNING: Removed duplicated region for block: B:70:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void d(java.lang.String r16, SC.L2 r17, androidx.compose.ui.d r18, boolean r19, U0.C4889m r20, int r21, int r22) {
        /*
            r10 = r16
            r11 = r17
            r12 = r21
            java.lang.String r0 = "label"
            kotlin.jvm.internal.C17542s.j(r10, r0)
            java.lang.String r0 = "variant"
            kotlin.jvm.internal.C17542s.j(r11, r0)
            r0 = 1967978018(0x754cf622, float:2.5981951E32)
            r1 = r20
            U0.m r13 = r1.k(r0)
            r1 = r22 & 1
            if (r1 == 0) goto L_0x0020
            r1 = r12 | 6
            goto L_0x0030
        L_0x0020:
            r1 = r12 & 6
            if (r1 != 0) goto L_0x002f
            boolean r1 = r13.V(r10)
            if (r1 == 0) goto L_0x002c
            r1 = 4
            goto L_0x002d
        L_0x002c:
            r1 = 2
        L_0x002d:
            r1 = r1 | r12
            goto L_0x0030
        L_0x002f:
            r1 = r12
        L_0x0030:
            r2 = r22 & 2
            if (r2 == 0) goto L_0x0037
            r1 = r1 | 48
            goto L_0x0047
        L_0x0037:
            r2 = r12 & 48
            if (r2 != 0) goto L_0x0047
            boolean r2 = r13.V(r11)
            if (r2 == 0) goto L_0x0044
            r2 = 32
            goto L_0x0046
        L_0x0044:
            r2 = 16
        L_0x0046:
            r1 = r1 | r2
        L_0x0047:
            r2 = r22 & 4
            if (r2 == 0) goto L_0x0050
            r1 = r1 | 384(0x180, float:5.38E-43)
        L_0x004d:
            r3 = r18
            goto L_0x0062
        L_0x0050:
            r3 = r12 & 384(0x180, float:5.38E-43)
            if (r3 != 0) goto L_0x004d
            r3 = r18
            boolean r4 = r13.V(r3)
            if (r4 == 0) goto L_0x005f
            r4 = 256(0x100, float:3.59E-43)
            goto L_0x0061
        L_0x005f:
            r4 = 128(0x80, float:1.794E-43)
        L_0x0061:
            r1 = r1 | r4
        L_0x0062:
            r4 = r22 & 8
            if (r4 == 0) goto L_0x006b
            r1 = r1 | 3072(0xc00, float:4.305E-42)
        L_0x0068:
            r5 = r19
            goto L_0x007d
        L_0x006b:
            r5 = r12 & 3072(0xc00, float:4.305E-42)
            if (r5 != 0) goto L_0x0068
            r5 = r19
            boolean r6 = r13.b(r5)
            if (r6 == 0) goto L_0x007a
            r6 = 2048(0x800, float:2.87E-42)
            goto L_0x007c
        L_0x007a:
            r6 = 1024(0x400, float:1.435E-42)
        L_0x007c:
            r1 = r1 | r6
        L_0x007d:
            r6 = r1 & 1171(0x493, float:1.641E-42)
            r7 = 1170(0x492, float:1.64E-42)
            if (r6 != r7) goto L_0x008f
            boolean r6 = r13.l()
            if (r6 != 0) goto L_0x008a
            goto L_0x008f
        L_0x008a:
            r13.L()
            r4 = r5
            goto L_0x00cf
        L_0x008f:
            if (r2 == 0) goto L_0x0095
            androidx.compose.ui.d$a r2 = androidx.compose.ui.d.f18749a
            r14 = r2
            goto L_0x0096
        L_0x0095:
            r14 = r3
        L_0x0096:
            if (r4 == 0) goto L_0x009b
            r2 = 0
            r15 = r2
            goto L_0x009c
        L_0x009b:
            r15 = r5
        L_0x009c:
            boolean r2 = U0.C4895p.J()
            if (r2 == 0) goto L_0x00a8
            r2 = -1
            java.lang.String r3 = "com.ingka.ikea.ui.skapa.SkapaStatus (SkapaStatus.kt:47)"
            U0.C4895p.S(r0, r1, r2, r3)
        L_0x00a8:
            wK.W9 r2 = r17.b()
            if (r15 == 0) goto L_0x00b2
            wK.V9 r0 = wK.V9.Small
        L_0x00b0:
            r6 = r0
            goto L_0x00b5
        L_0x00b2:
            wK.V9 r0 = wK.V9.Proportional
            goto L_0x00b0
        L_0x00b5:
            r8 = r1 & 910(0x38e, float:1.275E-42)
            r9 = 24
            r3 = 0
            r4 = 0
            r0 = r16
            r1 = r2
            r2 = r14
            r7 = r13
            wK.S9.i(r0, r1, r2, r3, r4, r6, r7, r8, r9)
            boolean r0 = U0.C4895p.J()
            if (r0 == 0) goto L_0x00cd
            U0.C4895p.R()
        L_0x00cd:
            r3 = r14
            r4 = r15
        L_0x00cf:
            U0.Y0 r7 = r13.n()
            if (r7 == 0) goto L_0x00e6
            SC.J2 r8 = new SC.J2
            r0 = r8
            r1 = r16
            r2 = r17
            r5 = r21
            r6 = r22
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r7.a(r8)
        L_0x00e6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: SC.K2.d(java.lang.String, SC.L2, androidx.compose.ui.d, boolean, U0.m, int, int):void");
    }

    /* access modifiers changed from: private */
    public static final C16807N e(L2 l22, d dVar, boolean z10, int i10, int i11, C4889m mVar, int i12) {
        c(l22, dVar, z10, mVar, M0.a(i10 | 1), i11);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N f(String str, L2 l22, d dVar, boolean z10, int i10, int i11, C4889m mVar, int i12) {
        d(str, l22, dVar, z10, mVar, M0.a(i10 | 1), i11);
        return C16807N.f139792a;
    }
}
