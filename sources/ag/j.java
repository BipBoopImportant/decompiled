package ag;

import Oo.b;
import SC.K0;
import SC.L;
import SC.M;
import SC.N;
import U0.C4889m;
import U0.C4895p;
import U0.M0;
import U0.Y0;
import XH.C16807N;
import androidx.compose.foundation.layout.D;
import androidx.compose.foundation.layout.J;
import androidx.compose.ui.d;
import androidx.compose.ui.platform.C5116k1;
import c2.h;
import kotlin.Metadata;
import nI.C17631a;
import r0.m;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\u001a=\u0010\b\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0006H\u0001¢\u0006\u0004\b\b\u0010\t\u001a3\u0010\f\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\n2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0003¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lag/k;", "uiState", "Lkotlin/Function0;", "LXH/N;", "onLoginClicked", "onUpgradeClicked", "Landroidx/compose/ui/d;", "modifier", "e", "(Lag/k;LnI/a;LnI/a;Landroidx/compose/ui/d;LU0/m;II)V", "", "isLoggedIn", "c", "(ZLnI/a;LnI/a;LU0/m;I)V", "cart-implementation_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class j {
    private static final void c(boolean z10, C17631a<C16807N> aVar, C17631a<C16807N> aVar2, C4889m mVar, int i10) {
        int i11;
        C4889m mVar2;
        boolean z11 = z10;
        C17631a<C16807N> aVar3 = aVar;
        C17631a<C16807N> aVar4 = aVar2;
        int i12 = i10;
        C4889m k10 = mVar.k(204273429);
        if ((i12 & 6) == 0) {
            i11 = (k10.b(z11) ? 4 : 2) | i12;
        } else {
            i11 = i12;
        }
        if ((i12 & 48) == 0) {
            i11 |= k10.F(aVar3) ? 32 : 16;
        }
        if ((i12 & 384) == 0) {
            i11 |= k10.F(aVar4) ? 256 : 128;
        }
        if ((i11 & 147) != 146 || !k10.l()) {
            if (C4895p.J()) {
                C4895p.S(204273429, i11, -1, "com.ingka.ikea.app.cart.impl.presentation.compose.ActionButton (FamilyPromotionBanner.kt:103)");
            }
            d h10 = J.h(D.m(C5116k1.a(d.f18749a, "FamilyPromotionBannerTestTags_CTA_BUTTON"), 0.0f, h.B((float) 24), 0.0f, 0.0f, 13, (Object) null), 0.0f, 1, (Object) null);
            if (z11) {
                k10.W(1121676371);
                C4889m mVar3 = k10;
                L.b(J1.j.b(b.f84454N6, k10, 0), h10, false, N.Primary, (M) null, false, (Integer) null, (K0) null, (m) null, aVar2, k10, ((i11 << 21) & 1879048192) | 3120, 500);
                mVar3.P();
                mVar2 = mVar3;
            } else {
                C4889m mVar4 = k10;
                mVar4.W(1121920775);
                mVar2 = mVar4;
                L.b(J1.j.b(b.f84824w4, mVar4, 0), h10, false, N.Primary, (M) null, false, (Integer) null, (K0) null, (m) null, aVar, mVar4, ((i11 << 24) & 1879048192) | 3120, 500);
                mVar2.P();
            }
            if (C4895p.J()) {
                C4895p.R();
            }
        } else {
            k10.L();
            mVar2 = k10;
        }
        Y0 n10 = mVar2.n();
        if (n10 != null) {
            n10.a(new i(z11, aVar3, aVar4, i10));
        }
    }

    /* access modifiers changed from: private */
    public static final C16807N d(boolean z10, C17631a aVar, C17631a aVar2, int i10, C4889m mVar, int i11) {
        c(z10, aVar, aVar2, mVar, M0.a(i10 | 1));
        return C16807N.f139792a;
    }

    /* JADX WARNING: Removed duplicated region for block: B:50:0x009d  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00a3  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x025f  */
    /* JADX WARNING: Removed duplicated region for block: B:81:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void e(ag.k r58, nI.C17631a<XH.C16807N> r59, nI.C17631a<XH.C16807N> r60, androidx.compose.ui.d r61, U0.C4889m r62, int r63, int r64) {
        /*
            r1 = r58
            r2 = r59
            r3 = r60
            r5 = r63
            r0 = 2
            r4 = 4
            r6 = 8
            java.lang.String r7 = "uiState"
            kotlin.jvm.internal.C17542s.j(r1, r7)
            java.lang.String r7 = "onLoginClicked"
            kotlin.jvm.internal.C17542s.j(r2, r7)
            java.lang.String r7 = "onUpgradeClicked"
            kotlin.jvm.internal.C17542s.j(r3, r7)
            r7 = -1210603403(0xffffffffb7d7a875, float:-2.5708441E-5)
            r8 = r62
            U0.m r15 = r8.k(r7)
            r8 = 1
            r9 = r64 & 1
            if (r9 == 0) goto L_0x002c
            r9 = r5 | 6
            goto L_0x0045
        L_0x002c:
            r9 = r5 & 6
            if (r9 != 0) goto L_0x0044
            r9 = r5 & 8
            if (r9 != 0) goto L_0x0039
            boolean r9 = r15.V(r1)
            goto L_0x003d
        L_0x0039:
            boolean r9 = r15.F(r1)
        L_0x003d:
            if (r9 == 0) goto L_0x0041
            r9 = r4
            goto L_0x0042
        L_0x0041:
            r9 = r0
        L_0x0042:
            r9 = r9 | r5
            goto L_0x0045
        L_0x0044:
            r9 = r5
        L_0x0045:
            r0 = r64 & 2
            if (r0 == 0) goto L_0x004c
            r9 = r9 | 48
            goto L_0x005c
        L_0x004c:
            r0 = r5 & 48
            if (r0 != 0) goto L_0x005c
            boolean r0 = r15.F(r2)
            if (r0 == 0) goto L_0x0059
            r0 = 32
            goto L_0x005b
        L_0x0059:
            r0 = 16
        L_0x005b:
            r9 = r9 | r0
        L_0x005c:
            r0 = r64 & 4
            if (r0 == 0) goto L_0x0063
            r9 = r9 | 384(0x180, float:5.38E-43)
            goto L_0x0073
        L_0x0063:
            r0 = r5 & 384(0x180, float:5.38E-43)
            if (r0 != 0) goto L_0x0073
            boolean r0 = r15.F(r3)
            if (r0 == 0) goto L_0x0070
            r0 = 256(0x100, float:3.59E-43)
            goto L_0x0072
        L_0x0070:
            r0 = 128(0x80, float:1.794E-43)
        L_0x0072:
            r9 = r9 | r0
        L_0x0073:
            r0 = r64 & 8
            if (r0 == 0) goto L_0x007d
            r9 = r9 | 3072(0xc00, float:4.305E-42)
        L_0x0079:
            r4 = r61
        L_0x007b:
            r13 = r9
            goto L_0x0090
        L_0x007d:
            r4 = r5 & 3072(0xc00, float:4.305E-42)
            if (r4 != 0) goto L_0x0079
            r4 = r61
            boolean r10 = r15.V(r4)
            if (r10 == 0) goto L_0x008c
            r10 = 2048(0x800, float:2.87E-42)
            goto L_0x008e
        L_0x008c:
            r10 = 1024(0x400, float:1.435E-42)
        L_0x008e:
            r9 = r9 | r10
            goto L_0x007b
        L_0x0090:
            r9 = r13 & 1171(0x493, float:1.641E-42)
            r10 = 1170(0x492, float:1.64E-42)
            if (r9 != r10) goto L_0x00a3
            boolean r9 = r15.l()
            if (r9 != 0) goto L_0x009d
            goto L_0x00a3
        L_0x009d:
            r15.L()
            r7 = r15
            goto L_0x0259
        L_0x00a3:
            if (r0 == 0) goto L_0x00a8
            androidx.compose.ui.d$a r0 = androidx.compose.ui.d.f18749a
            goto L_0x00a9
        L_0x00a8:
            r0 = r4
        L_0x00a9:
            boolean r4 = U0.C4895p.J()
            if (r4 == 0) goto L_0x00b5
            r4 = -1
            java.lang.String r9 = "com.ingka.ikea.app.cart.impl.presentation.compose.FamilyPromotionBanner (FamilyPromotionBanner.kt:51)"
            U0.C4895p.S(r7, r13, r4, r9)
        L_0x00b5:
            java.lang.String r4 = "FamilyPromotionBannerTestTags_CONTENT"
            androidx.compose.ui.d r4 = androidx.compose.ui.platform.C5116k1.a(r0, r4)
            r7 = 0
            r9 = 0
            androidx.compose.ui.d r16 = androidx.compose.foundation.layout.J.h(r4, r7, r8, r9)
            tK.v r4 = tK.C18030v.f147664a
            int r11 = tK.C18030v.f147665b
            tK.h r10 = r4.a(r15, r11)
            long r17 = r10.l0()
            r20 = 2
            r21 = 0
            r19 = 0
            androidx.compose.ui.d r10 = androidx.compose.foundation.b.d(r16, r17, r19, r20, r21)
            r12 = 24
            float r12 = (float) r12
            float r12 = c2.h.B(r12)
            androidx.compose.ui.d r7 = androidx.compose.foundation.layout.D.k(r10, r7, r12, r8, r9)
            androidx.compose.ui.d r7 = TC.e.i(r7)
            androidx.compose.foundation.layout.d r8 = androidx.compose.foundation.layout.C5073d.f18068a
            androidx.compose.foundation.layout.d$m r8 = r8.g()
            i1.c$a r9 = i1.C5437c.f24302a
            i1.c$b r9 = r9.k()
            r10 = 0
            E1.I r8 = androidx.compose.foundation.layout.C5080k.a(r8, r9, r15, r10)
            int r9 = U0.C4883j.a(r15, r10)
            U0.y r12 = r15.s()
            androidx.compose.ui.d r7 = androidx.compose.ui.c.e(r15, r7)
            G1.g$a r14 = G1.C4504g.f6515W
            nI.a r6 = r14.a()
            U0.f r16 = r15.m()
            if (r16 != 0) goto L_0x0112
            U0.C4883j.c()
        L_0x0112:
            r15.I()
            boolean r16 = r15.i()
            if (r16 == 0) goto L_0x011f
            r15.p(r6)
            goto L_0x0122
        L_0x011f:
            r15.t()
        L_0x0122:
            U0.m r6 = U0.F1.a(r15)
            nI.p r10 = r14.c()
            U0.F1.c(r6, r8, r10)
            nI.p r8 = r14.e()
            U0.F1.c(r6, r12, r8)
            nI.p r8 = r14.b()
            boolean r10 = r6.i()
            if (r10 != 0) goto L_0x014c
            java.lang.Object r10 = r6.D()
            java.lang.Integer r12 = java.lang.Integer.valueOf(r9)
            boolean r10 = kotlin.jvm.internal.C17542s.e(r10, r12)
            if (r10 != 0) goto L_0x015a
        L_0x014c:
            java.lang.Integer r10 = java.lang.Integer.valueOf(r9)
            r6.u(r10)
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            r6.w(r9, r8)
        L_0x015a:
            nI.p r8 = r14.d()
            U0.F1.c(r6, r7, r8)
            s0.h r6 = s0.C5862h.f28810a
            java.lang.String r6 = r58.a()
            r7 = -1626848490(0xffffffff9f084316, float:-2.8854612E-20)
            r15.W(r7)
            if (r6 != 0) goto L_0x0173
            r4 = r13
            r7 = r15
            goto L_0x01f3
        L_0x0173:
            int r7 = Oo.b.f84451N3
            r8 = 0
            java.lang.String r7 = J1.j.b(r7, r15, r8)
            int r9 = Oo.b.f84490R2
            java.lang.Object[] r6 = new java.lang.Object[]{r6, r7}
            java.lang.String r6 = J1.j.c(r9, r6, r15, r8)
            androidx.compose.ui.d$a r8 = androidx.compose.ui.d.f18749a
            java.lang.String r9 = "FamilyPromotionBannerTestTags_FAMILY_HEADER"
            androidx.compose.ui.d r10 = androidx.compose.ui.platform.C5116k1.a(r8, r9)
            N1.G r8 = new N1.G
            r35 = r8
            tK.h r4 = r4.a(r15, r11)
            long r36 = r4.D0()
            r56 = 65534(0xfffe, float:9.1833E-41)
            r57 = 0
            r38 = 0
            r40 = 0
            r41 = 0
            r42 = 0
            r43 = 0
            r44 = 0
            r45 = 0
            r47 = 0
            r48 = 0
            r49 = 0
            r50 = 0
            r52 = 0
            r53 = 0
            r54 = 0
            r55 = 0
            r35.<init>(r36, r38, r40, r41, r42, r43, r44, r45, r47, r48, r49, r50, r52, r53, r54, r55, r56, r57)
            N1.d r8 = IC.C13021c.e(r6, r7, r8)
            TC.b$b$b r9 = TC.C13679b.C2857b.C2858b.f116684a
            r33 = 0
            r34 = 524280(0x7fff8, float:7.34673E-40)
            r11 = 0
            r6 = 0
            r4 = r13
            r13 = r6
            r6 = 0
            r7 = r15
            r15 = r6
            r16 = 0
            r17 = 0
            r18 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r25 = 0
            r26 = 0
            r27 = 0
            r28 = 0
            r29 = 0
            r30 = 0
            r32 = 432(0x1b0, float:6.05E-43)
            r31 = r7
            SC.C13607l.h(r8, r9, r10, r11, r13, r15, r16, r17, r18, r20, r21, r22, r23, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34)
        L_0x01f3:
            r7.P()
            androidx.compose.ui.d$a r6 = androidx.compose.ui.d.f18749a
            java.lang.String r8 = "FamilyPromotionBannerTestTags_PROMOTION_MESSAGE"
            androidx.compose.ui.d r9 = androidx.compose.ui.platform.C5116k1.a(r6, r8)
            r6 = 8
            float r6 = (float) r6
            float r11 = c2.h.B(r6)
            r14 = 13
            r15 = 0
            r10 = 0
            r12 = 0
            r13 = 0
            androidx.compose.ui.d r10 = androidx.compose.foundation.layout.D.m(r9, r10, r11, r12, r13, r14, r15)
            IC.e r6 = r58.b()
            int r8 = IC.C13023e.f110931a
            java.lang.String r8 = r6.a(r7, r8)
            TC.b$a$b r9 = TC.C13679b.a.C2856b.f116680a
            r32 = 0
            r33 = 262136(0x3fff8, float:3.67331E-40)
            r11 = 0
            r13 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r25 = 0
            r26 = 0
            r27 = 0
            r28 = 0
            r29 = 0
            r31 = 432(0x1b0, float:6.05E-43)
            r30 = r7
            SC.C13607l.j(r8, r9, r10, r11, r13, r15, r16, r17, r18, r20, r21, r22, r23, r25, r26, r27, r28, r29, r30, r31, r32, r33)
            boolean r6 = r58.c()
            r4 = r4 & 1008(0x3f0, float:1.413E-42)
            c(r6, r2, r3, r7, r4)
            r7.x()
            boolean r4 = U0.C4895p.J()
            if (r4 == 0) goto L_0x0258
            U0.C4895p.R()
        L_0x0258:
            r4 = r0
        L_0x0259:
            U0.Y0 r7 = r7.n()
            if (r7 == 0) goto L_0x0272
            ag.h r8 = new ag.h
            r0 = r8
            r1 = r58
            r2 = r59
            r3 = r60
            r5 = r63
            r6 = r64
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r7.a(r8)
        L_0x0272:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ag.j.e(ag.k, nI.a, nI.a, androidx.compose.ui.d, U0.m, int, int):void");
    }

    /* access modifiers changed from: private */
    public static final C16807N f(k kVar, C17631a aVar, C17631a aVar2, d dVar, int i10, int i11, C4889m mVar, int i12) {
        e(kVar, aVar, aVar2, dVar, mVar, M0.a(i10 | 1), i11);
        return C16807N.f139792a;
    }
}
