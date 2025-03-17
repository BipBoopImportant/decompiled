package Pi;

import U0.C4889m;
import U0.C4895p;
import U0.M0;
import U0.Y0;
import XH.C16807N;
import androidx.compose.foundation.layout.D;
import androidx.compose.foundation.layout.J;
import androidx.compose.ui.d;
import c2.h;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import nI.C17631a;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a%\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0001¢\u0006\u0004\b\u0005\u0010\u0006\u001a/\u0010\t\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\b\u001a\u00020\u0007H\u0003¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"", "sortingLabel", "Lkotlin/Function0;", "LXH/N;", "onSortingRowClicked", "c", "(Ljava/lang/String;LnI/a;LU0/m;I)V", "Landroidx/compose/ui/d;", "modifier", "d", "(Ljava/lang/String;LnI/a;Landroidx/compose/ui/d;LU0/m;II)V", "ratingsandreviews-implementation_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class T {
    public static final void c(String str, C17631a<C16807N> aVar, C4889m mVar, int i10) {
        int i11;
        C17542s.j(str, "sortingLabel");
        C17542s.j(aVar, "onSortingRowClicked");
        C4889m k10 = mVar.k(773241160);
        if ((i10 & 6) == 0) {
            i11 = (k10.V(str) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= k10.F(aVar) ? 32 : 16;
        }
        if ((i11 & 19) != 18 || !k10.l()) {
            if (C4895p.J()) {
                C4895p.S(773241160, i11, -1, "com.ingka.ikea.app.ratingsandreviews.presentation.composable.SortingRow (SortingRow.kt:27)");
            }
            d(str, aVar, J.h(D.m(d.f18749a, 0.0f, h.B((float) 24), 0.0f, 0.0f, 13, (Object) null), 0.0f, 1, (Object) null), k10, (i11 & 14) | 384 | (i11 & 112), 0);
            if (C4895p.J()) {
                C4895p.R();
            }
        } else {
            k10.L();
        }
        Y0 n10 = k10.n();
        if (n10 != null) {
            n10.a(new Q(str, aVar, i10));
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:37:0x0070  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0075  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x016f  */
    /* JADX WARNING: Removed duplicated region for block: B:64:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static final void d(java.lang.String r22, nI.C17631a<XH.C16807N> r23, androidx.compose.ui.d r24, U0.C4889m r25, int r26, int r27) {
        /*
            r4 = r26
            r0 = 4
            r1 = 2060595879(0x7ad232a7, float:5.4570485E35)
            r2 = r25
            U0.m r2 = r2.k(r1)
            r3 = r27 & 1
            r12 = 2
            if (r3 == 0) goto L_0x0017
            r3 = r4 | 6
            r5 = r3
            r3 = r22
            goto L_0x002b
        L_0x0017:
            r3 = r4 & 6
            if (r3 != 0) goto L_0x0028
            r3 = r22
            boolean r5 = r2.V(r3)
            if (r5 == 0) goto L_0x0025
            r5 = r0
            goto L_0x0026
        L_0x0025:
            r5 = r12
        L_0x0026:
            r5 = r5 | r4
            goto L_0x002b
        L_0x0028:
            r3 = r22
            r5 = r4
        L_0x002b:
            r6 = r27 & 2
            if (r6 == 0) goto L_0x0034
            r5 = r5 | 48
            r15 = r23
            goto L_0x0046
        L_0x0034:
            r6 = r4 & 48
            r15 = r23
            if (r6 != 0) goto L_0x0046
            boolean r6 = r2.F(r15)
            if (r6 == 0) goto L_0x0043
            r6 = 32
            goto L_0x0045
        L_0x0043:
            r6 = 16
        L_0x0045:
            r5 = r5 | r6
        L_0x0046:
            r0 = r27 & 4
            if (r0 == 0) goto L_0x0050
            r5 = r5 | 384(0x180, float:5.38E-43)
        L_0x004c:
            r6 = r24
        L_0x004e:
            r13 = r5
            goto L_0x0063
        L_0x0050:
            r6 = r4 & 384(0x180, float:5.38E-43)
            if (r6 != 0) goto L_0x004c
            r6 = r24
            boolean r7 = r2.V(r6)
            if (r7 == 0) goto L_0x005f
            r7 = 256(0x100, float:3.59E-43)
            goto L_0x0061
        L_0x005f:
            r7 = 128(0x80, float:1.794E-43)
        L_0x0061:
            r5 = r5 | r7
            goto L_0x004e
        L_0x0063:
            r5 = r13 & 147(0x93, float:2.06E-43)
            r7 = 146(0x92, float:2.05E-43)
            if (r5 != r7) goto L_0x0075
            boolean r5 = r2.l()
            if (r5 != 0) goto L_0x0070
            goto L_0x0075
        L_0x0070:
            r2.L()
            goto L_0x0169
        L_0x0075:
            if (r0 == 0) goto L_0x007a
            androidx.compose.ui.d$a r0 = androidx.compose.ui.d.f18749a
            goto L_0x007b
        L_0x007a:
            r0 = r6
        L_0x007b:
            boolean r5 = U0.C4895p.J()
            if (r5 == 0) goto L_0x0087
            r5 = -1
            java.lang.String r6 = "com.ingka.ikea.app.ratingsandreviews.presentation.composable.SortingRow (SortingRow.kt:42)"
            U0.C4895p.S(r1, r13, r5, r6)
        L_0x0087:
            androidx.compose.foundation.layout.d r1 = androidx.compose.foundation.layout.C5073d.f18068a
            androidx.compose.foundation.layout.d$m r1 = r1.g()
            i1.c$a r5 = i1.C5437c.f24302a
            i1.c$b r5 = r5.k()
            r14 = 0
            E1.I r1 = androidx.compose.foundation.layout.C5080k.a(r1, r5, r2, r14)
            int r5 = U0.C4883j.a(r2, r14)
            U0.y r6 = r2.s()
            androidx.compose.ui.d r7 = androidx.compose.ui.c.e(r2, r0)
            G1.g$a r8 = G1.C4504g.f6515W
            nI.a r9 = r8.a()
            U0.f r10 = r2.m()
            if (r10 != 0) goto L_0x00b3
            U0.C4883j.c()
        L_0x00b3:
            r2.I()
            boolean r10 = r2.i()
            if (r10 == 0) goto L_0x00c0
            r2.p(r9)
            goto L_0x00c3
        L_0x00c0:
            r2.t()
        L_0x00c3:
            U0.m r9 = U0.F1.a(r2)
            nI.p r10 = r8.c()
            U0.F1.c(r9, r1, r10)
            nI.p r1 = r8.e()
            U0.F1.c(r9, r6, r1)
            nI.p r1 = r8.b()
            boolean r6 = r9.i()
            if (r6 != 0) goto L_0x00ed
            java.lang.Object r6 = r9.D()
            java.lang.Integer r10 = java.lang.Integer.valueOf(r5)
            boolean r6 = kotlin.jvm.internal.C17542s.e(r6, r10)
            if (r6 != 0) goto L_0x00fb
        L_0x00ed:
            java.lang.Integer r6 = java.lang.Integer.valueOf(r5)
            r9.u(r6)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r9.w(r5, r1)
        L_0x00fb:
            nI.p r1 = r8.d()
            U0.F1.c(r9, r7, r1)
            s0.h r1 = s0.C5862h.f28810a
            r10 = 0
            r11 = 7
            r5 = 0
            r6 = 0
            r7 = 0
            r9 = r2
            SC.C13643u0.c(r5, r6, r7, r9, r10, r11)
            int r1 = Oo.b.f84325A7
            java.lang.String r5 = J1.j.b(r1, r2, r14)
            SC.b1$c r10 = SC.C13569b1.c.f116146b
            androidx.compose.ui.d$a r1 = androidx.compose.ui.d.f18749a
            r6 = 72
            float r6 = (float) r6
            float r6 = c2.h.B(r6)
            r7 = 0
            r8 = 0
            androidx.compose.ui.d r1 = androidx.compose.foundation.layout.J.k(r1, r6, r7, r12, r8)
            java.lang.String r6 = "SortingButton"
            androidx.compose.ui.d r7 = androidx.compose.ui.platform.C5116k1.a(r1, r6)
            r1 = r13 & 112(0x70, float:1.57E-43)
            r1 = r1 | 384(0x180, float:5.38E-43)
            int r6 = r13 << 9
            r6 = r6 & 7168(0x1c00, float:1.0045E-41)
            r1 = r1 | r6
            int r6 = SC.C13569b1.c.f116147c
            int r6 = r6 << 15
            r19 = r1 | r6
            r20 = 6
            r21 = 7120(0x1bd0, float:9.977E-42)
            r9 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r1 = 1
            r15 = r1
            r16 = 0
            r17 = 0
            r6 = r23
            r8 = r22
            r18 = r2
            SC.C13585f1.c(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
            r10 = 0
            r11 = 7
            r5 = 0
            r6 = 0
            r7 = 0
            r9 = r2
            SC.C13643u0.c(r5, r6, r7, r9, r10, r11)
            r2.x()
            boolean r1 = U0.C4895p.J()
            if (r1 == 0) goto L_0x0168
            U0.C4895p.R()
        L_0x0168:
            r6 = r0
        L_0x0169:
            U0.Y0 r7 = r2.n()
            if (r7 == 0) goto L_0x0181
            Pi.S r8 = new Pi.S
            r0 = r8
            r1 = r22
            r2 = r23
            r3 = r6
            r4 = r26
            r5 = r27
            r0.<init>(r1, r2, r3, r4, r5)
            r7.a(r8)
        L_0x0181:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: Pi.T.d(java.lang.String, nI.a, androidx.compose.ui.d, U0.m, int, int):void");
    }

    /* access modifiers changed from: private */
    public static final C16807N e(String str, C17631a aVar, int i10, C4889m mVar, int i11) {
        c(str, aVar, mVar, M0.a(i10 | 1));
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N f(String str, C17631a aVar, d dVar, int i10, int i11, C4889m mVar, int i12) {
        d(str, aVar, dVar, mVar, M0.a(i10 | 1), i11);
        return C16807N.f139792a;
    }
}
