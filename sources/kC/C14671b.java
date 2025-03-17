package kC;

import U0.C4889m;
import U0.M0;
import XH.C16807N;
import androidx.compose.ui.d;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a-\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Landroidx/compose/ui/d;", "modifier", "Lp1/v0;", "color", "", "consumeInsets", "LXH/N;", "b", "(Landroidx/compose/ui/d;JZLU0/m;II)V", "systemui_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* renamed from: kC.b  reason: case insensitive filesystem */
public final class C14671b {
    /* JADX WARNING: Removed duplicated region for block: B:37:0x006c  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0073  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x0108  */
    /* JADX WARNING: Removed duplicated region for block: B:68:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void b(androidx.compose.ui.d r18, long r19, boolean r21, U0.C4889m r22, int r23, int r24) {
        /*
            r5 = r23
            r0 = 1329822186(0x4f4379ea, float:3.27954688E9)
            r1 = r22
            U0.m r1 = r1.k(r0)
            r2 = r24 & 1
            if (r2 == 0) goto L_0x0015
            r3 = r5 | 6
            r4 = r3
            r3 = r18
            goto L_0x0029
        L_0x0015:
            r3 = r5 & 6
            if (r3 != 0) goto L_0x0026
            r3 = r18
            boolean r4 = r1.V(r3)
            if (r4 == 0) goto L_0x0023
            r4 = 4
            goto L_0x0024
        L_0x0023:
            r4 = 2
        L_0x0024:
            r4 = r4 | r5
            goto L_0x0029
        L_0x0026:
            r3 = r18
            r4 = r5
        L_0x0029:
            r6 = r5 & 48
            if (r6 != 0) goto L_0x0042
            r6 = r24 & 2
            if (r6 != 0) goto L_0x003c
            r6 = r19
            boolean r8 = r1.e(r6)
            if (r8 == 0) goto L_0x003e
            r8 = 32
            goto L_0x0040
        L_0x003c:
            r6 = r19
        L_0x003e:
            r8 = 16
        L_0x0040:
            r4 = r4 | r8
            goto L_0x0044
        L_0x0042:
            r6 = r19
        L_0x0044:
            r8 = r24 & 4
            if (r8 == 0) goto L_0x004d
            r4 = r4 | 384(0x180, float:5.38E-43)
        L_0x004a:
            r9 = r21
            goto L_0x005f
        L_0x004d:
            r9 = r5 & 384(0x180, float:5.38E-43)
            if (r9 != 0) goto L_0x004a
            r9 = r21
            boolean r10 = r1.b(r9)
            if (r10 == 0) goto L_0x005c
            r10 = 256(0x100, float:3.59E-43)
            goto L_0x005e
        L_0x005c:
            r10 = 128(0x80, float:1.794E-43)
        L_0x005e:
            r4 = r4 | r10
        L_0x005f:
            r10 = r4 & 147(0x93, float:2.06E-43)
            r11 = 146(0x92, float:2.05E-43)
            if (r10 != r11) goto L_0x0073
            boolean r10 = r1.l()
            if (r10 != 0) goto L_0x006c
            goto L_0x0073
        L_0x006c:
            r1.L()
            r2 = r3
        L_0x0070:
            r4 = r9
            goto L_0x0102
        L_0x0073:
            r1.G()
            r10 = r5 & 1
            r11 = 1
            if (r10 == 0) goto L_0x008d
            boolean r10 = r1.O()
            if (r10 == 0) goto L_0x0082
            goto L_0x008d
        L_0x0082:
            r1.L()
            r2 = r24 & 2
            if (r2 == 0) goto L_0x008b
            r4 = r4 & -113(0xffffffffffffff8f, float:NaN)
        L_0x008b:
            r2 = r3
            goto L_0x00a8
        L_0x008d:
            if (r2 == 0) goto L_0x0092
            androidx.compose.ui.d$a r2 = androidx.compose.ui.d.f18749a
            goto L_0x0093
        L_0x0092:
            r2 = r3
        L_0x0093:
            r3 = r24 & 2
            if (r3 == 0) goto L_0x00a5
            tK.v r3 = tK.C18030v.f147664a
            int r6 = tK.C18030v.f147665b
            tK.h r3 = r3.a(r1, r6)
            long r6 = r3.k0()
            r4 = r4 & -113(0xffffffffffffff8f, float:NaN)
        L_0x00a5:
            if (r8 == 0) goto L_0x00a8
            r9 = r11
        L_0x00a8:
            r1.y()
            boolean r3 = U0.C4895p.J()
            if (r3 == 0) goto L_0x00b7
            r3 = -1
            java.lang.String r8 = "com.ingka.ikea.systemui.compose.NavigationBarBackground (NavigationBarBackground.kt:27)"
            U0.C4895p.S(r0, r4, r3, r8)
        L_0x00b7:
            androidx.compose.ui.d$a r0 = androidx.compose.ui.d.f18749a
            r3 = 0
            r4 = 0
            androidx.compose.ui.d r3 = androidx.compose.foundation.layout.J.h(r0, r3, r11, r4)
            s0.T$a r4 = s0.C5848T.f28733a
            r8 = 6
            s0.T r10 = s0.a0.b(r4, r1, r8)
            androidx.compose.ui.d r3 = s0.C5854Z.a(r3, r10)
            r10 = -1072284897(0xffffffffc0163b1f, float:-2.3473585)
            r1.W(r10)
            r10 = 0
            if (r9 == 0) goto L_0x00df
            s0.T r4 = s0.a0.b(r4, r1, r8)
            s0.E r4 = s0.C5850V.f(r4, r1, r10)
            androidx.compose.ui.d r0 = s0.C5851W.a(r0, r4)
        L_0x00df:
            r1.P()
            androidx.compose.ui.d r12 = r3.s(r0)
            r16 = 2
            r17 = 0
            r15 = 0
            r13 = r6
            androidx.compose.ui.d r0 = androidx.compose.foundation.b.d(r12, r13, r15, r16, r17)
            androidx.compose.ui.d r0 = r0.s(r2)
            s0.C5844O.a(r0, r1, r10)
            boolean r0 = U0.C4895p.J()
            if (r0 == 0) goto L_0x0070
            U0.C4895p.R()
            goto L_0x0070
        L_0x0102:
            U0.Y0 r8 = r1.n()
            if (r8 == 0) goto L_0x0117
            kC.a r9 = new kC.a
            r0 = r9
            r1 = r2
            r2 = r6
            r5 = r23
            r6 = r24
            r0.<init>(r1, r2, r4, r5, r6)
            r8.a(r9)
        L_0x0117:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kC.C14671b.b(androidx.compose.ui.d, long, boolean, U0.m, int, int):void");
    }

    /* access modifiers changed from: private */
    public static final C16807N c(d dVar, long j10, boolean z10, int i10, int i11, C4889m mVar, int i12) {
        b(dVar, j10, z10, mVar, M0.a(i10 | 1), i11);
        return C16807N.f139792a;
    }
}
