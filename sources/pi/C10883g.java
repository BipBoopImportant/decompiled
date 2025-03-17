package Pi;

import Mi.C10771f;
import U0.C4889m;
import U0.M0;
import XH.C16807N;
import androidx.compose.ui.d;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a!\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002H\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"LMi/f;", "productDetailedRating", "Landroidx/compose/ui/d;", "modifier", "LXH/N;", "b", "(LMi/f;Landroidx/compose/ui/d;LU0/m;II)V", "ratingsandreviews-implementation_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* renamed from: Pi.g  reason: case insensitive filesystem */
public final class C10883g {
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0057  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x005e  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x0216  */
    /* JADX WARNING: Removed duplicated region for block: B:64:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void b(Mi.C10771f r35, androidx.compose.ui.d r36, U0.C4889m r37, int r38, int r39) {
        /*
            r0 = r35
            r1 = r38
            r2 = r39
            r3 = 2
            r4 = 6
            java.lang.String r5 = "productDetailedRating"
            kotlin.jvm.internal.C17542s.j(r0, r5)
            r5 = -1999061922(0xffffffff88d8bc5e, float:-1.3044312E-33)
            r6 = r37
            U0.m r15 = r6.k(r5)
            r14 = 1
            r6 = r2 & 1
            r13 = 4
            if (r6 == 0) goto L_0x001f
            r6 = r1 | 6
            goto L_0x002f
        L_0x001f:
            r6 = r1 & 6
            if (r6 != 0) goto L_0x002e
            boolean r6 = r15.V(r0)
            if (r6 == 0) goto L_0x002b
            r6 = r13
            goto L_0x002c
        L_0x002b:
            r6 = r3
        L_0x002c:
            r6 = r6 | r1
            goto L_0x002f
        L_0x002e:
            r6 = r1
        L_0x002f:
            r3 = r3 & r2
            r11 = 16
            if (r3 == 0) goto L_0x0039
            r6 = r6 | 48
        L_0x0036:
            r7 = r36
            goto L_0x004a
        L_0x0039:
            r7 = r1 & 48
            if (r7 != 0) goto L_0x0036
            r7 = r36
            boolean r8 = r15.V(r7)
            if (r8 == 0) goto L_0x0048
            r8 = 32
            goto L_0x0049
        L_0x0048:
            r8 = r11
        L_0x0049:
            r6 = r6 | r8
        L_0x004a:
            r8 = r6 & 19
            r9 = 18
            if (r8 != r9) goto L_0x005e
            boolean r8 = r15.l()
            if (r8 != 0) goto L_0x0057
            goto L_0x005e
        L_0x0057:
            r15.L()
            r3 = r7
            r7 = r15
            goto L_0x0210
        L_0x005e:
            if (r3 == 0) goto L_0x0063
            androidx.compose.ui.d$a r3 = androidx.compose.ui.d.f18749a
            goto L_0x0064
        L_0x0063:
            r3 = r7
        L_0x0064:
            boolean r7 = U0.C4895p.J()
            if (r7 == 0) goto L_0x0070
            r7 = -1
            java.lang.String r8 = "com.ingka.ikea.app.ratingsandreviews.presentation.composable.RatingCategory (RatingCategory.kt:29)"
            U0.C4895p.S(r5, r6, r7, r8)
        L_0x0070:
            androidx.compose.foundation.layout.d r5 = androidx.compose.foundation.layout.C5073d.f18068a
            androidx.compose.foundation.layout.d$m r5 = r5.g()
            i1.c$a r32 = i1.C5437c.f24302a
            i1.c$b r6 = r32.k()
            r12 = 0
            E1.I r5 = androidx.compose.foundation.layout.C5080k.a(r5, r6, r15, r12)
            int r6 = U0.C4883j.a(r15, r12)
            U0.y r7 = r15.s()
            androidx.compose.ui.d r8 = androidx.compose.ui.c.e(r15, r3)
            G1.g$a r33 = G1.C4504g.f6515W
            nI.a r9 = r33.a()
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
            nI.p r10 = r33.c()
            U0.F1.c(r9, r5, r10)
            nI.p r5 = r33.e()
            U0.F1.c(r9, r7, r5)
            nI.p r5 = r33.b()
            boolean r7 = r9.i()
            if (r7 != 0) goto L_0x00d6
            java.lang.Object r7 = r9.D()
            java.lang.Integer r10 = java.lang.Integer.valueOf(r6)
            boolean r7 = kotlin.jvm.internal.C17542s.e(r7, r10)
            if (r7 != 0) goto L_0x00e4
        L_0x00d6:
            java.lang.Integer r7 = java.lang.Integer.valueOf(r6)
            r9.u(r7)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r9.w(r6, r5)
        L_0x00e4:
            nI.p r5 = r33.d()
            U0.F1.c(r9, r8, r5)
            s0.h r5 = s0.C5862h.f28810a
            java.lang.String r6 = r35.a()
            TC.b$a$c r7 = TC.C13679b.a.c.f116681a
            tK.v r5 = tK.C18030v.f147664a
            int r8 = tK.C18030v.f147665b
            tK.h r9 = r5.a(r15, r8)
            long r9 = r9.H0()
            r30 = 0
            r31 = 262132(0x3fff4, float:3.67325E-40)
            r16 = 0
            r34 = r8
            r8 = r16
            r16 = 0
            r4 = r11
            r11 = r16
            r16 = 0
            r13 = r16
            r14 = r16
            r36 = r15
            r15 = r16
            r16 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r23 = 0
            r24 = 0
            r25 = 0
            r26 = 0
            r27 = 0
            r29 = 48
            r28 = r36
            SC.C13607l.j(r6, r7, r8, r9, r11, r13, r14, r15, r16, r18, r19, r20, r21, r23, r24, r25, r26, r27, r28, r29, r30, r31)
            androidx.compose.ui.d$a r6 = androidx.compose.ui.d.f18749a
            float r4 = (float) r4
            float r4 = c2.h.B(r4)
            androidx.compose.ui.d r4 = androidx.compose.foundation.layout.J.i(r6, r4)
            r7 = r36
            r8 = 6
            s0.C5844O.a(r4, r7, r8)
            r4 = 0
            r8 = 0
            r9 = 1
            androidx.compose.ui.d r10 = androidx.compose.foundation.layout.J.h(r6, r4, r9, r8)
            r4 = r34
            tK.h r8 = r5.a(r7, r4)
            long r11 = r8.m0()
            r14 = 2
            r15 = 0
            r13 = 0
            androidx.compose.ui.d r8 = androidx.compose.foundation.b.d(r10, r11, r13, r14, r15)
            r9 = 4
            float r9 = (float) r9
            float r10 = c2.h.B(r9)
            androidx.compose.ui.d r8 = androidx.compose.foundation.layout.J.i(r8, r10)
            i1.c r10 = r32.o()
            r11 = 0
            E1.I r10 = androidx.compose.foundation.layout.C5077h.h(r10, r11)
            int r12 = U0.C4883j.a(r7, r11)
            U0.y r13 = r7.s()
            androidx.compose.ui.d r8 = androidx.compose.ui.c.e(r7, r8)
            nI.a r14 = r33.a()
            U0.f r15 = r7.m()
            if (r15 != 0) goto L_0x0189
            U0.C4883j.c()
        L_0x0189:
            r7.I()
            boolean r15 = r7.i()
            if (r15 == 0) goto L_0x0196
            r7.p(r14)
            goto L_0x0199
        L_0x0196:
            r7.t()
        L_0x0199:
            U0.m r14 = U0.F1.a(r7)
            nI.p r15 = r33.c()
            U0.F1.c(r14, r10, r15)
            nI.p r10 = r33.e()
            U0.F1.c(r14, r13, r10)
            nI.p r10 = r33.b()
            boolean r13 = r14.i()
            if (r13 != 0) goto L_0x01c3
            java.lang.Object r13 = r14.D()
            java.lang.Integer r15 = java.lang.Integer.valueOf(r12)
            boolean r13 = kotlin.jvm.internal.C17542s.e(r13, r15)
            if (r13 != 0) goto L_0x01d1
        L_0x01c3:
            java.lang.Integer r13 = java.lang.Integer.valueOf(r12)
            r14.u(r13)
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
            r14.w(r12, r10)
        L_0x01d1:
            nI.p r10 = r33.d()
            U0.F1.c(r14, r8, r10)
            androidx.compose.foundation.layout.j r8 = androidx.compose.foundation.layout.C5079j.f18125a
            float r8 = r35.b()
            r10 = 5
            float r10 = (float) r10
            float r8 = r8 / r10
            androidx.compose.ui.d r6 = androidx.compose.foundation.layout.J.g(r6, r8)
            float r8 = c2.h.B(r9)
            androidx.compose.ui.d r12 = androidx.compose.foundation.layout.J.i(r6, r8)
            tK.h r4 = r5.a(r7, r4)
            long r13 = r4.p0()
            r16 = 2
            r17 = 0
            r15 = 0
            androidx.compose.ui.d r4 = androidx.compose.foundation.b.d(r12, r13, r15, r16, r17)
            androidx.compose.foundation.layout.C5077h.a(r4, r7, r11)
            r7.x()
            r7.x()
            boolean r4 = U0.C4895p.J()
            if (r4 == 0) goto L_0x0210
            U0.C4895p.R()
        L_0x0210:
            U0.Y0 r4 = r7.n()
            if (r4 == 0) goto L_0x021e
            Pi.f r5 = new Pi.f
            r5.<init>(r0, r3, r1, r2)
            r4.a(r5)
        L_0x021e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: Pi.C10883g.b(Mi.f, androidx.compose.ui.d, U0.m, int, int):void");
    }

    /* access modifiers changed from: private */
    public static final C16807N c(C10771f fVar, d dVar, int i10, int i11, C4889m mVar, int i12) {
        b(fVar, dVar, mVar, M0.a(i10 | 1), i11);
        return C16807N.f139792a;
    }
}
