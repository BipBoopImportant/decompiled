package Xq;

import IC.C13023e;
import U0.C4889m;
import U0.M0;
import XH.C16807N;
import androidx.compose.ui.d;
import kotlin.Metadata;
import nI.C17631a;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aC\u0010\n\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0001¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"LIC/e;", "newBalanceInfo", "Landroidx/compose/ui/d;", "modifier", "", "isLoading", "isSimplified", "Lkotlin/Function0;", "LXH/N;", "onRewardUnlockRequested", "b", "(LIC/e;Landroidx/compose/ui/d;ZZLnI/a;LU0/m;II)V", "familyrewards-implementation_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class h {
    /* JADX WARNING: Removed duplicated region for block: B:102:0x026f  */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x027e  */
    /* JADX WARNING: Removed duplicated region for block: B:108:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x005c  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0061  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0077  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x008c  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0092  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x0095  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x00b2  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x00bc  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x010b  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x013b  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x0147  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x014b  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x0193  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x01e4  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void b(IC.C13023e r30, androidx.compose.ui.d r31, boolean r32, boolean r33, nI.C17631a<XH.C16807N> r34, U0.C4889m r35, int r36, int r37) {
        /*
            r0 = r30
            r14 = r34
            r15 = r36
            r1 = 16
            r2 = 2
            r3 = 4
            java.lang.String r4 = "newBalanceInfo"
            kotlin.jvm.internal.C17542s.j(r0, r4)
            java.lang.String r4 = "onRewardUnlockRequested"
            kotlin.jvm.internal.C17542s.j(r14, r4)
            r4 = 1213686896(0x48576470, float:220561.75)
            r5 = r35
            U0.m r13 = r5.k(r4)
            r12 = 1
            r5 = r37 & 1
            if (r5 == 0) goto L_0x0025
            r5 = r15 | 6
            goto L_0x003e
        L_0x0025:
            r5 = r15 & 6
            if (r5 != 0) goto L_0x003d
            r5 = r15 & 8
            if (r5 != 0) goto L_0x0032
            boolean r5 = r13.V(r0)
            goto L_0x0036
        L_0x0032:
            boolean r5 = r13.F(r0)
        L_0x0036:
            if (r5 == 0) goto L_0x003a
            r5 = r3
            goto L_0x003b
        L_0x003a:
            r5 = r2
        L_0x003b:
            r5 = r5 | r15
            goto L_0x003e
        L_0x003d:
            r5 = r15
        L_0x003e:
            r2 = r37 & 2
            if (r2 == 0) goto L_0x0047
            r5 = r5 | 48
        L_0x0044:
            r6 = r31
            goto L_0x0058
        L_0x0047:
            r6 = r15 & 48
            if (r6 != 0) goto L_0x0044
            r6 = r31
            boolean r7 = r13.V(r6)
            if (r7 == 0) goto L_0x0056
            r7 = 32
            goto L_0x0057
        L_0x0056:
            r7 = r1
        L_0x0057:
            r5 = r5 | r7
        L_0x0058:
            r3 = r37 & 4
            if (r3 == 0) goto L_0x0061
            r5 = r5 | 384(0x180, float:5.38E-43)
        L_0x005e:
            r7 = r32
            goto L_0x0073
        L_0x0061:
            r7 = r15 & 384(0x180, float:5.38E-43)
            if (r7 != 0) goto L_0x005e
            r7 = r32
            boolean r8 = r13.b(r7)
            if (r8 == 0) goto L_0x0070
            r8 = 256(0x100, float:3.59E-43)
            goto L_0x0072
        L_0x0070:
            r8 = 128(0x80, float:1.794E-43)
        L_0x0072:
            r5 = r5 | r8
        L_0x0073:
            r8 = r15 & 3072(0xc00, float:4.305E-42)
            if (r8 != 0) goto L_0x008c
            r8 = r37 & 8
            if (r8 != 0) goto L_0x0086
            r8 = r33
            boolean r9 = r13.b(r8)
            if (r9 == 0) goto L_0x0088
            r9 = 2048(0x800, float:2.87E-42)
            goto L_0x008a
        L_0x0086:
            r8 = r33
        L_0x0088:
            r9 = 1024(0x400, float:1.435E-42)
        L_0x008a:
            r5 = r5 | r9
            goto L_0x008e
        L_0x008c:
            r8 = r33
        L_0x008e:
            r1 = r37 & 16
            if (r1 == 0) goto L_0x0095
            r5 = r5 | 24576(0x6000, float:3.4438E-41)
            goto L_0x00a5
        L_0x0095:
            r1 = r15 & 24576(0x6000, float:3.4438E-41)
            if (r1 != 0) goto L_0x00a5
            boolean r1 = r13.F(r14)
            if (r1 == 0) goto L_0x00a2
            r1 = 16384(0x4000, float:2.2959E-41)
            goto L_0x00a4
        L_0x00a2:
            r1 = 8192(0x2000, float:1.14794E-41)
        L_0x00a4:
            r5 = r5 | r1
        L_0x00a5:
            r1 = r5 & 9363(0x2493, float:1.312E-41)
            r9 = 9362(0x2492, float:1.3119E-41)
            if (r1 != r9) goto L_0x00bc
            boolean r1 = r13.l()
            if (r1 != 0) goto L_0x00b2
            goto L_0x00bc
        L_0x00b2:
            r13.L()
            r2 = r6
            r3 = r7
            r4 = r8
            r28 = r13
            goto L_0x0278
        L_0x00bc:
            r13.G()
            r1 = r15 & 1
            r11 = 0
            if (r1 == 0) goto L_0x00db
            boolean r1 = r13.O()
            if (r1 == 0) goto L_0x00cb
            goto L_0x00db
        L_0x00cb:
            r13.L()
            r1 = r37 & 8
            if (r1 == 0) goto L_0x00d4
            r5 = r5 & -7169(0xffffffffffffe3ff, float:NaN)
        L_0x00d4:
            r9 = r5
            r10 = r6
        L_0x00d6:
            r26 = r7
            r27 = r8
            goto L_0x0102
        L_0x00db:
            if (r2 == 0) goto L_0x00e0
            androidx.compose.ui.d$a r1 = androidx.compose.ui.d.f18749a
            goto L_0x00e1
        L_0x00e0:
            r1 = r6
        L_0x00e1:
            if (r3 == 0) goto L_0x00e4
            r7 = r11
        L_0x00e4:
            r2 = r37 & 8
            if (r2 == 0) goto L_0x00ff
            U0.I0 r2 = androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.g()
            java.lang.Object r2 = r13.Q(r2)
            android.content.Context r2 = (android.content.Context) r2
            boolean r2 = Xo.c.b(r2)
            r5 = r5 & -7169(0xffffffffffffe3ff, float:NaN)
            r10 = r1
            r27 = r2
            r9 = r5
            r26 = r7
            goto L_0x0102
        L_0x00ff:
            r10 = r1
            r9 = r5
            goto L_0x00d6
        L_0x0102:
            r13.y()
            boolean r1 = U0.C4895p.J()
            if (r1 == 0) goto L_0x0111
            r1 = -1
            java.lang.String r2 = "com.ingka.ikea.familyrewards.implementation.compose.details.component.UnlockReward (UnlockReward.kt:38)"
            U0.C4895p.S(r4, r9, r1, r2)
        L_0x0111:
            int r1 = r9 >> 3
            androidx.compose.foundation.layout.d r2 = androidx.compose.foundation.layout.C5073d.f18068a
            androidx.compose.foundation.layout.d$m r2 = r2.g()
            i1.c$a r3 = i1.C5437c.f24302a
            i1.c$b r3 = r3.k()
            E1.I r2 = androidx.compose.foundation.layout.C5080k.a(r2, r3, r13, r11)
            int r3 = U0.C4883j.a(r13, r11)
            U0.y r4 = r13.s()
            androidx.compose.ui.d r5 = androidx.compose.ui.c.e(r13, r10)
            G1.g$a r6 = G1.C4504g.f6515W
            nI.a r7 = r6.a()
            U0.f r8 = r13.m()
            if (r8 != 0) goto L_0x013e
            U0.C4883j.c()
        L_0x013e:
            r13.I()
            boolean r8 = r13.i()
            if (r8 == 0) goto L_0x014b
            r13.p(r7)
            goto L_0x014e
        L_0x014b:
            r13.t()
        L_0x014e:
            U0.m r7 = U0.F1.a(r13)
            nI.p r8 = r6.c()
            U0.F1.c(r7, r2, r8)
            nI.p r2 = r6.e()
            U0.F1.c(r7, r4, r2)
            nI.p r2 = r6.b()
            boolean r4 = r7.i()
            if (r4 != 0) goto L_0x0178
            java.lang.Object r4 = r7.D()
            java.lang.Integer r8 = java.lang.Integer.valueOf(r3)
            boolean r4 = kotlin.jvm.internal.C17542s.e(r4, r8)
            if (r4 != 0) goto L_0x0186
        L_0x0178:
            java.lang.Integer r4 = java.lang.Integer.valueOf(r3)
            r7.u(r4)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r7.w(r3, r2)
        L_0x0186:
            nI.p r2 = r6.d()
            U0.F1.c(r7, r5, r2)
            s0.h r2 = s0.C5862h.f28810a
            r8 = 0
            r7 = 0
            if (r27 == 0) goto L_0x01e4
            r1 = -1356037184(0xffffffffaf2c83c0, float:-1.5690116E-10)
            r13.W(r1)
            int r1 = Rq.e.f87001v
            java.lang.String r1 = J1.j.b(r1, r13, r11)
            r3 = r26 ^ 1
            androidx.compose.ui.d$a r2 = androidx.compose.ui.d.f18749a
            java.lang.String r4 = "TestTag-AccessibilityButton"
            androidx.compose.ui.d r2 = androidx.compose.ui.platform.C5116k1.a(r2, r4)
            androidx.compose.ui.d r2 = androidx.compose.foundation.layout.J.h(r2, r7, r12, r8)
            int r4 = r9 << 9
            r5 = 458752(0x70000, float:6.42848E-40)
            r4 = r4 & r5
            r4 = r4 | 48
            int r5 = r9 << 15
            r6 = 1879048192(0x70000000, float:1.58456325E29)
            r5 = r5 & r6
            r16 = r4 | r5
            r17 = 472(0x1d8, float:6.61E-43)
            r4 = 0
            r5 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r6 = r26
            r7 = r18
            r8 = r19
            r18 = r9
            r9 = r20
            r29 = r10
            r10 = r34
            r11 = r13
            r12 = r16
            r31 = r13
            r13 = r17
            SC.L.b(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            r31.P()
            r12 = r31
        L_0x01e2:
            r1 = 0
            goto L_0x021c
        L_0x01e4:
            r18 = r9
            r29 = r10
            r31 = r13
            r2 = -1355631208(0xffffffffaf32b598, float:-1.6253521E-10)
            r12 = r31
            r12.W(r2)
            int r2 = Rq.e.f86999t
            IC.e r3 = IC.C13026h.a(r2)
            androidx.compose.ui.d$a r2 = androidx.compose.ui.d.f18749a
            java.lang.String r4 = "TestTag-SlideToUnlock"
            androidx.compose.ui.d r2 = androidx.compose.ui.platform.C5116k1.a(r2, r4)
            int r4 = r18 >> 6
            r4 = r4 & 14
            r4 = r4 | 48
            int r5 = IC.C13023e.f110931a
            int r5 = r5 << 6
            r4 = r4 | r5
            r1 = r1 & 7168(0x1c00, float:1.0045E-41)
            r6 = r4 | r1
            r7 = 0
            r1 = r26
            r4 = r34
            r5 = r12
            wB.C15163j.k(r1, r2, r3, r4, r5, r6, r7)
            r12.P()
            goto L_0x01e2
        L_0x021c:
            Rq.d.f(r12, r1)
            Y1.j$a r1 = Y1.j.f14783b
            int r2 = r1.a()
            TC.b$a$b r21 = TC.C13679b.a.C2856b.f116680a
            androidx.compose.ui.d$a r1 = androidx.compose.ui.d.f18749a
            r3 = 1
            r4 = 0
            r5 = 0
            androidx.compose.ui.d r1 = androidx.compose.foundation.layout.J.h(r1, r5, r3, r4)
            Y1.j r13 = Y1.j.h(r2)
            int r2 = IC.C13023e.f110931a
            r2 = r2 | 48
            r3 = r18 & 14
            r23 = r2 | r3
            r24 = 12582912(0xc00000, float:1.7632415E-38)
            r25 = 130044(0x1fbfc, float:1.8223E-40)
            r2 = 0
            r3 = 0
            r5 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r16 = 0
            r28 = r12
            r12 = r16
            r16 = 0
            r14 = r16
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r0 = r30
            r22 = r28
            Bl.c.c(r0, r1, r2, r3, r5, r7, r8, r9, r10, r12, r13, r14, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25)
            r28.x()
            boolean r0 = U0.C4895p.J()
            if (r0 == 0) goto L_0x0272
            U0.C4895p.R()
        L_0x0272:
            r3 = r26
            r4 = r27
            r2 = r29
        L_0x0278:
            U0.Y0 r8 = r28.n()
            if (r8 == 0) goto L_0x028f
            Xq.g r9 = new Xq.g
            r0 = r9
            r1 = r30
            r5 = r34
            r6 = r36
            r7 = r37
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            r8.a(r9)
        L_0x028f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: Xq.h.b(IC.e, androidx.compose.ui.d, boolean, boolean, nI.a, U0.m, int, int):void");
    }

    /* access modifiers changed from: private */
    public static final C16807N c(C13023e eVar, d dVar, boolean z10, boolean z11, C17631a aVar, int i10, int i11, C4889m mVar, int i12) {
        b(eVar, dVar, z10, z11, aVar, mVar, M0.a(i10 | 1), i11);
        return C16807N.f139792a;
    }
}
