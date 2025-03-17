package iF;

import U0.C4889m;
import U0.M0;
import XH.C16807N;
import android.net.Uri;
import androidx.compose.ui.d;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a!\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Landroid/net/Uri;", "iconUrl", "Landroidx/compose/ui/d;", "modifier", "LXH/N;", "b", "(Landroid/net/Uri;Landroidx/compose/ui/d;LU0/m;II)V", "base_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class I {
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0053  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0059  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x0191  */
    /* JADX WARNING: Removed duplicated region for block: B:53:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void b(android.net.Uri r25, androidx.compose.ui.d r26, U0.C4889m r27, int r28, int r29) {
        /*
            r0 = r25
            r1 = r28
            r2 = r29
            java.lang.String r3 = "iconUrl"
            kotlin.jvm.internal.C17542s.j(r0, r3)
            r3 = 513125665(0x1e95ad21, float:1.5847593E-20)
            r4 = r27
            U0.m r15 = r4.k(r3)
            r4 = r2 & 1
            if (r4 == 0) goto L_0x001b
            r4 = r1 | 6
            goto L_0x002b
        L_0x001b:
            r4 = r1 & 6
            if (r4 != 0) goto L_0x002a
            boolean r4 = r15.F(r0)
            if (r4 == 0) goto L_0x0027
            r4 = 4
            goto L_0x0028
        L_0x0027:
            r4 = 2
        L_0x0028:
            r4 = r4 | r1
            goto L_0x002b
        L_0x002a:
            r4 = r1
        L_0x002b:
            r5 = r2 & 2
            if (r5 == 0) goto L_0x0034
            r4 = r4 | 48
        L_0x0031:
            r6 = r26
            goto L_0x0046
        L_0x0034:
            r6 = r1 & 48
            if (r6 != 0) goto L_0x0031
            r6 = r26
            boolean r7 = r15.V(r6)
            if (r7 == 0) goto L_0x0043
            r7 = 32
            goto L_0x0045
        L_0x0043:
            r7 = 16
        L_0x0045:
            r4 = r4 | r7
        L_0x0046:
            r7 = r4 & 19
            r8 = 18
            if (r7 != r8) goto L_0x0059
            boolean r7 = r15.l()
            if (r7 != 0) goto L_0x0053
            goto L_0x0059
        L_0x0053:
            r15.L()
            r3 = r15
            goto L_0x018b
        L_0x0059:
            if (r5 == 0) goto L_0x005f
            androidx.compose.ui.d$a r5 = androidx.compose.ui.d.f18749a
            r14 = r5
            goto L_0x0060
        L_0x005f:
            r14 = r6
        L_0x0060:
            boolean r5 = U0.C4895p.J()
            if (r5 == 0) goto L_0x006c
            r5 = -1
            java.lang.String r6 = "com.sugarcube.app.base.ui.compose.RoomShapeIcon (RoomShapeIcon.kt:28)"
            U0.C4895p.S(r3, r4, r5, r6)
        L_0x006c:
            U0.I0 r3 = androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.g()
            java.lang.Object r3 = r15.Q(r3)
            android.content.Context r3 = (android.content.Context) r3
            i1.c$a r16 = i1.C5437c.f24302a
            i1.c r4 = r16.o()
            r13 = 0
            E1.I r4 = androidx.compose.foundation.layout.C5077h.h(r4, r13)
            int r5 = U0.C4883j.a(r15, r13)
            U0.y r6 = r15.s()
            androidx.compose.ui.d r7 = androidx.compose.ui.c.e(r15, r14)
            G1.g$a r8 = G1.C4504g.f6515W
            nI.a r9 = r8.a()
            U0.f r10 = r15.m()
            if (r10 != 0) goto L_0x009c
            U0.C4883j.c()
        L_0x009c:
            r15.I()
            boolean r10 = r15.i()
            if (r10 == 0) goto L_0x00a9
            r15.p(r9)
            goto L_0x00ac
        L_0x00a9:
            r15.t()
        L_0x00ac:
            U0.m r9 = U0.F1.a(r15)
            nI.p r10 = r8.c()
            U0.F1.c(r9, r4, r10)
            nI.p r4 = r8.e()
            U0.F1.c(r9, r6, r4)
            nI.p r4 = r8.b()
            boolean r6 = r9.i()
            if (r6 != 0) goto L_0x00d6
            java.lang.Object r6 = r9.D()
            java.lang.Integer r10 = java.lang.Integer.valueOf(r5)
            boolean r6 = kotlin.jvm.internal.C17542s.e(r6, r10)
            if (r6 != 0) goto L_0x00e4
        L_0x00d6:
            java.lang.Integer r6 = java.lang.Integer.valueOf(r5)
            r9.u(r6)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r9.w(r5, r4)
        L_0x00e4:
            nI.p r4 = r8.d()
            U0.F1.c(r9, r7, r4)
            androidx.compose.foundation.layout.j r12 = androidx.compose.foundation.layout.C5079j.f18125a
            androidx.compose.ui.d$a r11 = androidx.compose.ui.d.f18749a
            r4 = 40
            float r4 = (float) r4
            float r4 = c2.h.B(r4)
            androidx.compose.ui.d r4 = androidx.compose.foundation.layout.J.t(r11, r4)
            r5 = 6
            float r5 = (float) r5
            float r5 = c2.h.B(r5)
            A0.f r5 = A0.g.e(r5)
            androidx.compose.ui.d r6 = m1.e.a(r4, r5)
            E1.k$a r17 = E1.C4478k.f5915a
            E1.k r8 = r17.b()
            int r4 = OE.C13316h.f112847b
            t1.c r4 = J1.e.c(r4, r15, r13)
            int r5 = OE.n.f113190D4
            java.lang.String r5 = J1.j.b(r5, r15, r13)
            r18 = 24576(0x6000, float:3.4438E-41)
            r19 = 104(0x68, float:1.46E-43)
            r7 = 0
            r9 = 0
            r10 = 0
            r23 = r11
            r11 = r15
            r24 = r12
            r12 = r18
            r1 = r13
            r13 = r19
            n0.C5583F.a(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            r4 = 24
            float r4 = (float) r4
            float r4 = c2.h.B(r4)
            r5 = r23
            androidx.compose.ui.d r4 = androidx.compose.foundation.layout.J.t(r5, r4)
            i1.c r5 = r16.e()
            r6 = r24
            androidx.compose.ui.d r6 = r6.a(r4, r5)
            k6.h$a r4 = new k6.h$a
            r4.<init>(r3)
            k6.h$a r3 = r4.e(r0)
            k6.h r4 = r3.c()
            E1.k r3 = r17.d()
            r23 = r14
            r14 = r3
            int r3 = OE.C13316h.f112847b
            t1.c r8 = J1.e.c(r3, r15, r1)
            int r3 = OE.n.f113190D4
            java.lang.String r5 = J1.j.b(r3, r15, r1)
            r21 = 6
            r22 = 31720(0x7be8, float:4.4449E-41)
            r9 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r1 = 0
            r3 = r15
            r15 = r1
            r16 = 0
            r17 = 0
            r18 = 0
            r20 = 0
            r19 = r3
            U5.s.b(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
            r3.x()
            boolean r1 = U0.C4895p.J()
            if (r1 == 0) goto L_0x0189
            U0.C4895p.R()
        L_0x0189:
            r6 = r23
        L_0x018b:
            U0.Y0 r1 = r3.n()
            if (r1 == 0) goto L_0x019b
            iF.H r3 = new iF.H
            r4 = r28
            r3.<init>(r0, r6, r4, r2)
            r1.a(r3)
        L_0x019b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: iF.I.b(android.net.Uri, androidx.compose.ui.d, U0.m, int, int):void");
    }

    /* access modifiers changed from: private */
    public static final C16807N c(Uri uri, d dVar, int i10, int i11, C4889m mVar, int i12) {
        b(uri, dVar, mVar, M0.a(i10 | 1), i11);
        return C16807N.f139792a;
    }
}
