package wK;

import U0.C4889m;
import U0.M0;
import XH.C16807N;
import androidx.compose.ui.d;
import kotlin.Metadata;
import t1.C5942c;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a5\u0010\t\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lt1/c;", "painter", "", "contentDescription", "Landroidx/compose/ui/d;", "modifier", "LwK/d6;", "size", "LXH/N;", "b", "(Lt1/c;Ljava/lang/String;Landroidx/compose/ui/d;LwK/d6;LU0/m;II)V", "design_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* renamed from: wK.a6  reason: case insensitive filesystem */
public final class C18264a6 {
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0063  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0068  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0087  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x008d  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x00ff  */
    /* JADX WARNING: Removed duplicated region for block: B:65:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void b(t1.C5942c r16, java.lang.String r17, androidx.compose.ui.d r18, wK.C18300d6 r19, U0.C4889m r20, int r21, int r22) {
        /*
            r10 = r16
            r11 = r21
            java.lang.String r0 = "painter"
            kotlin.jvm.internal.C17542s.j(r10, r0)
            r0 = 102501050(0x61c0aba, float:2.934822E-35)
            r1 = r20
            U0.m r12 = r1.k(r0)
            r1 = r22 & 1
            if (r1 == 0) goto L_0x0019
            r1 = r11 | 6
            goto L_0x0029
        L_0x0019:
            r1 = r11 & 6
            if (r1 != 0) goto L_0x0028
            boolean r1 = r12.F(r10)
            if (r1 == 0) goto L_0x0025
            r1 = 4
            goto L_0x0026
        L_0x0025:
            r1 = 2
        L_0x0026:
            r1 = r1 | r11
            goto L_0x0029
        L_0x0028:
            r1 = r11
        L_0x0029:
            r2 = r22 & 2
            if (r2 == 0) goto L_0x0032
            r1 = r1 | 48
            r13 = r17
            goto L_0x0044
        L_0x0032:
            r2 = r11 & 48
            r13 = r17
            if (r2 != 0) goto L_0x0044
            boolean r2 = r12.V(r13)
            if (r2 == 0) goto L_0x0041
            r2 = 32
            goto L_0x0043
        L_0x0041:
            r2 = 16
        L_0x0043:
            r1 = r1 | r2
        L_0x0044:
            r2 = r22 & 4
            if (r2 == 0) goto L_0x004d
            r1 = r1 | 384(0x180, float:5.38E-43)
        L_0x004a:
            r3 = r18
            goto L_0x005f
        L_0x004d:
            r3 = r11 & 384(0x180, float:5.38E-43)
            if (r3 != 0) goto L_0x004a
            r3 = r18
            boolean r4 = r12.V(r3)
            if (r4 == 0) goto L_0x005c
            r4 = 256(0x100, float:3.59E-43)
            goto L_0x005e
        L_0x005c:
            r4 = 128(0x80, float:1.794E-43)
        L_0x005e:
            r1 = r1 | r4
        L_0x005f:
            r4 = r22 & 8
            if (r4 == 0) goto L_0x0068
            r1 = r1 | 3072(0xc00, float:4.305E-42)
        L_0x0065:
            r5 = r19
            goto L_0x007a
        L_0x0068:
            r5 = r11 & 3072(0xc00, float:4.305E-42)
            if (r5 != 0) goto L_0x0065
            r5 = r19
            boolean r6 = r12.V(r5)
            if (r6 == 0) goto L_0x0077
            r6 = 2048(0x800, float:2.87E-42)
            goto L_0x0079
        L_0x0077:
            r6 = 1024(0x400, float:1.435E-42)
        L_0x0079:
            r1 = r1 | r6
        L_0x007a:
            r6 = r1 & 1171(0x493, float:1.641E-42)
            r7 = 1170(0x492, float:1.64E-42)
            if (r6 != r7) goto L_0x008d
            boolean r6 = r12.l()
            if (r6 != 0) goto L_0x0087
            goto L_0x008d
        L_0x0087:
            r12.L()
            r4 = r5
            goto L_0x00f9
        L_0x008d:
            if (r2 == 0) goto L_0x0093
            androidx.compose.ui.d$a r2 = androidx.compose.ui.d.f18749a
            r14 = r2
            goto L_0x0094
        L_0x0093:
            r14 = r3
        L_0x0094:
            if (r4 == 0) goto L_0x009a
            wK.d6 r2 = wK.C18300d6.Medium
            r15 = r2
            goto L_0x009b
        L_0x009a:
            r15 = r5
        L_0x009b:
            boolean r2 = U0.C4895p.J()
            if (r2 == 0) goto L_0x00a7
            r2 = -1
            java.lang.String r3 = "net.ikea.skapa.ui.components.PaymentLogo (PaymentLogo.kt:45)"
            U0.C4895p.S(r0, r1, r2, r3)
        L_0x00a7:
            wK.c6 r0 = wK.C18288c6.f150671a
            int r2 = r1 >> 9
            r2 = r2 & 14
            r2 = r2 | 48
            wK.e6 r0 = r0.a(r15, r12, r2)
            float r2 = r0.f()
            float r3 = r0.e()
            androidx.compose.ui.d r2 = androidx.compose.foundation.layout.J.v(r14, r2, r3)
            n0.g r3 = r0.b()
            p1.i1 r4 = r0.c()
            androidx.compose.ui.d r2 = n0.C5599e.e(r2, r3, r4)
            p1.i1 r3 = r0.d()
            androidx.compose.ui.d r4 = m1.e.a(r2, r3)
            long r5 = r0.a()
            r8 = 2
            r9 = 0
            r7 = 0
            androidx.compose.ui.d r2 = androidx.compose.foundation.b.d(r4, r5, r7, r8, r9)
            r8 = r1 & 126(0x7e, float:1.77E-43)
            r9 = 120(0x78, float:1.68E-43)
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r0 = r16
            r1 = r17
            r7 = r12
            n0.C5583F.a(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9)
            boolean r0 = U0.C4895p.J()
            if (r0 == 0) goto L_0x00f7
            U0.C4895p.R()
        L_0x00f7:
            r3 = r14
            r4 = r15
        L_0x00f9:
            U0.Y0 r7 = r12.n()
            if (r7 == 0) goto L_0x0110
            wK.Z5 r8 = new wK.Z5
            r0 = r8
            r1 = r16
            r2 = r17
            r5 = r21
            r6 = r22
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r7.a(r8)
        L_0x0110:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: wK.C18264a6.b(t1.c, java.lang.String, androidx.compose.ui.d, wK.d6, U0.m, int, int):void");
    }

    /* access modifiers changed from: private */
    public static final C16807N c(C5942c cVar, String str, d dVar, C18300d6 d6Var, int i10, int i11, C4889m mVar, int i12) {
        b(cVar, str, dVar, d6Var, mVar, M0.a(i10 | 1), i11);
        return C16807N.f139792a;
    }
}
