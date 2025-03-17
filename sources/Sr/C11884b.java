package sr;

import IC.C13023e;
import TC.C13679b;
import U0.C4889m;
import U0.M0;
import XH.C16807N;
import androidx.compose.ui.d;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a3\u0010\t\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"LIC/e;", "text", "LTC/b;", "style", "Landroidx/compose/ui/d;", "modifier", "Lp1/v0;", "color", "LXH/N;", "b", "(LIC/e;LTC/b;Landroidx/compose/ui/d;JLU0/m;II)V", "familyrewards_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* renamed from: sr.b  reason: case insensitive filesystem */
public final class C11884b {
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0073  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0088  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x0097  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x009f  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x01d5  */
    /* JADX WARNING: Removed duplicated region for block: B:89:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void b(IC.C13023e r32, TC.C13679b r33, androidx.compose.ui.d r34, long r35, U0.C4889m r37, int r38, int r39) {
        /*
            r1 = r32
            r0 = r33
            r5 = r38
            r2 = 2
            r3 = 4
            r4 = 8
            java.lang.String r6 = "text"
            kotlin.jvm.internal.C17542s.j(r1, r6)
            java.lang.String r6 = "style"
            kotlin.jvm.internal.C17542s.j(r0, r6)
            r6 = -671871332(0xffffffffd7f40e9c, float:-5.36687168E14)
            r7 = r37
            U0.m r15 = r7.k(r6)
            r7 = r39 & 1
            if (r7 == 0) goto L_0x0024
            r7 = r5 | 6
            goto L_0x003d
        L_0x0024:
            r7 = r5 & 6
            if (r7 != 0) goto L_0x003c
            r7 = r5 & 8
            if (r7 != 0) goto L_0x0031
            boolean r7 = r15.V(r1)
            goto L_0x0035
        L_0x0031:
            boolean r7 = r15.F(r1)
        L_0x0035:
            if (r7 == 0) goto L_0x0039
            r7 = r3
            goto L_0x003a
        L_0x0039:
            r7 = r2
        L_0x003a:
            r7 = r7 | r5
            goto L_0x003d
        L_0x003c:
            r7 = r5
        L_0x003d:
            r2 = r39 & 2
            if (r2 == 0) goto L_0x0044
            r7 = r7 | 48
            goto L_0x0054
        L_0x0044:
            r2 = r5 & 48
            if (r2 != 0) goto L_0x0054
            boolean r2 = r15.V(r0)
            if (r2 == 0) goto L_0x0051
            r2 = 32
            goto L_0x0053
        L_0x0051:
            r2 = 16
        L_0x0053:
            r7 = r7 | r2
        L_0x0054:
            r2 = r39 & 4
            if (r2 == 0) goto L_0x005d
            r7 = r7 | 384(0x180, float:5.38E-43)
        L_0x005a:
            r3 = r34
            goto L_0x006f
        L_0x005d:
            r3 = r5 & 384(0x180, float:5.38E-43)
            if (r3 != 0) goto L_0x005a
            r3 = r34
            boolean r8 = r15.V(r3)
            if (r8 == 0) goto L_0x006c
            r8 = 256(0x100, float:3.59E-43)
            goto L_0x006e
        L_0x006c:
            r8 = 128(0x80, float:1.794E-43)
        L_0x006e:
            r7 = r7 | r8
        L_0x006f:
            r8 = r5 & 3072(0xc00, float:4.305E-42)
            if (r8 != 0) goto L_0x0088
            r8 = r39 & 8
            if (r8 != 0) goto L_0x0082
            r8 = r35
            boolean r10 = r15.e(r8)
            if (r10 == 0) goto L_0x0084
            r10 = 2048(0x800, float:2.87E-42)
            goto L_0x0086
        L_0x0082:
            r8 = r35
        L_0x0084:
            r10 = 1024(0x400, float:1.435E-42)
        L_0x0086:
            r7 = r7 | r10
            goto L_0x008a
        L_0x0088:
            r8 = r35
        L_0x008a:
            r10 = r7 & 1171(0x493, float:1.641E-42)
            r11 = 1170(0x492, float:1.64E-42)
            if (r10 != r11) goto L_0x009f
            boolean r10 = r15.l()
            if (r10 != 0) goto L_0x0097
            goto L_0x009f
        L_0x0097:
            r15.L()
            r4 = r8
            r30 = r15
            goto L_0x01cf
        L_0x009f:
            r15.G()
            r10 = r5 & 1
            if (r10 == 0) goto L_0x00b9
            boolean r10 = r15.O()
            if (r10 == 0) goto L_0x00ad
            goto L_0x00b9
        L_0x00ad:
            r15.L()
            r2 = r39 & 8
            if (r2 == 0) goto L_0x00b6
            r7 = r7 & -7169(0xffffffffffffe3ff, float:NaN)
        L_0x00b6:
            r28 = r8
            goto L_0x00d3
        L_0x00b9:
            if (r2 == 0) goto L_0x00be
            androidx.compose.ui.d$a r2 = androidx.compose.ui.d.f18749a
            goto L_0x00bf
        L_0x00be:
            r2 = r3
        L_0x00bf:
            r3 = r39 & 8
            if (r3 == 0) goto L_0x00d1
            tK.v r3 = tK.C18030v.f147664a
            int r8 = tK.C18030v.f147665b
            tK.h r3 = r3.a(r15, r8)
            long r8 = r3.G0()
            r7 = r7 & -7169(0xffffffffffffe3ff, float:NaN)
        L_0x00d1:
            r3 = r2
            goto L_0x00b6
        L_0x00d3:
            r15.y()
            boolean r2 = U0.C4895p.J()
            if (r2 == 0) goto L_0x00e2
            r2 = -1
            java.lang.String r8 = "com.ingka.ikea.familyrewards.presentation.common.ExpiryDate (ExpiryDate.kt:31)"
            U0.C4895p.S(r6, r7, r2, r8)
        L_0x00e2:
            androidx.compose.foundation.layout.d r2 = androidx.compose.foundation.layout.C5073d.f18068a
            float r4 = (float) r4
            float r6 = c2.h.B(r4)
            androidx.compose.foundation.layout.d$f r2 = r2.n(r6)
            i1.c$a r6 = i1.C5437c.f24302a
            i1.c$c r6 = r6.i()
            r8 = 54
            E1.I r2 = androidx.compose.foundation.layout.G.b(r2, r6, r15, r8)
            r6 = 0
            int r8 = U0.C4883j.a(r15, r6)
            U0.y r9 = r15.s()
            androidx.compose.ui.d r10 = androidx.compose.ui.c.e(r15, r3)
            G1.g$a r11 = G1.C4504g.f6515W
            nI.a r12 = r11.a()
            U0.f r13 = r15.m()
            if (r13 != 0) goto L_0x0115
            U0.C4883j.c()
        L_0x0115:
            r15.I()
            boolean r13 = r15.i()
            if (r13 == 0) goto L_0x0122
            r15.p(r12)
            goto L_0x0125
        L_0x0122:
            r15.t()
        L_0x0125:
            U0.m r12 = U0.F1.a(r15)
            nI.p r13 = r11.c()
            U0.F1.c(r12, r2, r13)
            nI.p r2 = r11.e()
            U0.F1.c(r12, r9, r2)
            nI.p r2 = r11.b()
            boolean r9 = r12.i()
            if (r9 != 0) goto L_0x014f
            java.lang.Object r9 = r12.D()
            java.lang.Integer r13 = java.lang.Integer.valueOf(r8)
            boolean r9 = kotlin.jvm.internal.C17542s.e(r9, r13)
            if (r9 != 0) goto L_0x015d
        L_0x014f:
            java.lang.Integer r9 = java.lang.Integer.valueOf(r8)
            r12.u(r9)
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            r12.w(r8, r2)
        L_0x015d:
            nI.p r2 = r11.d()
            U0.F1.c(r12, r10, r2)
            s0.N r2 = s0.C5843N.f28726a
            androidx.compose.ui.d$a r2 = androidx.compose.ui.d.f18749a
            float r4 = c2.h.B(r4)
            androidx.compose.ui.d r2 = androidx.compose.foundation.layout.J.t(r2, r4)
            tK.v r4 = tK.C18030v.f147664a
            int r8 = tK.C18030v.f147665b
            tK.h r4 = r4.a(r15, r8)
            long r8 = r4.B0()
            A0.f r4 = A0.g.h()
            androidx.compose.ui.d r2 = androidx.compose.foundation.b.c(r2, r8, r4)
            androidx.compose.foundation.layout.C5077h.a(r2, r15, r6)
            int r2 = IC.C13023e.f110931a
            r4 = r7 & 14
            r2 = r2 | r4
            java.lang.String r2 = r1.a(r15, r2)
            r4 = r7 & 7280(0x1c70, float:1.0201E-41)
            r25 = r4
            r26 = 0
            r27 = 262132(0x3fff4, float:3.67325E-40)
            r4 = 0
            r7 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r14 = 0
            r6 = 0
            r30 = r15
            r15 = r6
            r16 = 0
            r17 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r31 = r3
            r3 = r33
            r5 = r28
            r24 = r30
            SC.C13607l.j(r2, r3, r4, r5, r7, r9, r10, r11, r12, r14, r15, r16, r17, r19, r20, r21, r22, r23, r24, r25, r26, r27)
            r30.x()
            boolean r2 = U0.C4895p.J()
            if (r2 == 0) goto L_0x01cb
            U0.C4895p.R()
        L_0x01cb:
            r4 = r28
            r3 = r31
        L_0x01cf:
            U0.Y0 r8 = r30.n()
            if (r8 == 0) goto L_0x01e6
            sr.a r9 = new sr.a
            r0 = r9
            r1 = r32
            r2 = r33
            r6 = r38
            r7 = r39
            r0.<init>(r1, r2, r3, r4, r6, r7)
            r8.a(r9)
        L_0x01e6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: sr.C11884b.b(IC.e, TC.b, androidx.compose.ui.d, long, U0.m, int, int):void");
    }

    /* access modifiers changed from: private */
    public static final C16807N c(C13023e eVar, C13679b bVar, d dVar, long j10, int i10, int i11, C4889m mVar, int i12) {
        b(eVar, bVar, dVar, j10, mVar, M0.a(i10 | 1), i11);
        return C16807N.f139792a;
    }
}
