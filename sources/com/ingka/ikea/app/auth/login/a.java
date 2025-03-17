package com.ingka.ikea.app.auth.login;

import E1.C4478k;
import LC.C13178b;
import LC.h;
import U0.C4889m;
import U0.C4895p;
import U0.M0;
import U0.Y0;
import XH.C16807N;
import androidx.compose.ui.d;
import com.ingka.ikea.app.auth.login.LoginSignupPromotionBottomSheet;
import ef.C9650b;
import gs.e;
import i1.C5437c;
import kotlin.Metadata;
import nI.C17631a;
import nI.C17642l;
import nI.q;
import s0.C5857c;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u001aE\u0010\n\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0002\u0010\t\u001a\u00020\bH\u0001¢\u0006\u0004\b\n\u0010\u000b\u001a\u0019\u0010\f\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\bH\u0003¢\u0006\u0004\b\f\u0010\r\u001a/\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0002\u0010\t\u001a\u00020\bH\u0003¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lcom/ingka/ikea/app/auth/login/LoginSignupPromotionBottomSheet$b;", "promotionModeSetting", "LT0/b;", "heightSizeClass", "Lkotlin/Function0;", "LXH/N;", "onCloseClick", "onLoginClick", "Landroidx/compose/ui/d;", "modifier", "h", "(Lcom/ingka/ikea/app/auth/login/LoginSignupPromotionBottomSheet$b;ILnI/a;LnI/a;Landroidx/compose/ui/d;LU0/m;II)V", "f", "(Landroidx/compose/ui/d;LU0/m;II)V", "d", "(Lcom/ingka/ikea/app/auth/login/LoginSignupPromotionBottomSheet$b;LnI/a;Landroidx/compose/ui/d;LU0/m;II)V", "profile-implementation_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class a {
    /* JADX WARNING: Removed duplicated region for block: B:37:0x006d  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0073  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x029c  */
    /* JADX WARNING: Removed duplicated region for block: B:83:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static final void d(com.ingka.ikea.app.auth.login.LoginSignupPromotionBottomSheet.b r35, nI.C17631a<XH.C16807N> r36, androidx.compose.ui.d r37, U0.C4889m r38, int r39, int r40) {
        /*
            r1 = r35
            r4 = r39
            r0 = 4
            r2 = 6
            r3 = 2144913477(0x7fd8c845, float:NaN)
            r5 = r38
            U0.m r15 = r5.k(r3)
            r14 = 1
            r5 = r40 & 1
            r13 = 2
            if (r5 == 0) goto L_0x0018
            r5 = r4 | 6
            goto L_0x0028
        L_0x0018:
            r5 = r4 & 6
            if (r5 != 0) goto L_0x0027
            boolean r5 = r15.V(r1)
            if (r5 == 0) goto L_0x0024
            r5 = r0
            goto L_0x0025
        L_0x0024:
            r5 = r13
        L_0x0025:
            r5 = r5 | r4
            goto L_0x0028
        L_0x0027:
            r5 = r4
        L_0x0028:
            r6 = r40 & 2
            if (r6 == 0) goto L_0x0031
            r5 = r5 | 48
            r11 = r36
            goto L_0x0043
        L_0x0031:
            r6 = r4 & 48
            r11 = r36
            if (r6 != 0) goto L_0x0043
            boolean r6 = r15.F(r11)
            if (r6 == 0) goto L_0x0040
            r6 = 32
            goto L_0x0042
        L_0x0040:
            r6 = 16
        L_0x0042:
            r5 = r5 | r6
        L_0x0043:
            r0 = r40 & 4
            if (r0 == 0) goto L_0x004d
            r5 = r5 | 384(0x180, float:5.38E-43)
        L_0x0049:
            r6 = r37
        L_0x004b:
            r10 = r5
            goto L_0x0060
        L_0x004d:
            r6 = r4 & 384(0x180, float:5.38E-43)
            if (r6 != 0) goto L_0x0049
            r6 = r37
            boolean r8 = r15.V(r6)
            if (r8 == 0) goto L_0x005c
            r8 = 256(0x100, float:3.59E-43)
            goto L_0x005e
        L_0x005c:
            r8 = 128(0x80, float:1.794E-43)
        L_0x005e:
            r5 = r5 | r8
            goto L_0x004b
        L_0x0060:
            r5 = r10 & 147(0x93, float:2.06E-43)
            r8 = 146(0x92, float:2.05E-43)
            if (r5 != r8) goto L_0x0073
            boolean r5 = r15.l()
            if (r5 != 0) goto L_0x006d
            goto L_0x0073
        L_0x006d:
            r15.L()
            r3 = r15
            goto L_0x0296
        L_0x0073:
            if (r0 == 0) goto L_0x0078
            androidx.compose.ui.d$a r0 = androidx.compose.ui.d.f18749a
            goto L_0x0079
        L_0x0078:
            r0 = r6
        L_0x0079:
            boolean r5 = U0.C4895p.J()
            if (r5 == 0) goto L_0x0085
            r5 = -1
            java.lang.String r6 = "com.ingka.ikea.app.auth.login.Content (LoginPromotionScreen.kt:110)"
            U0.C4895p.S(r3, r10, r5, r6)
        L_0x0085:
            androidx.compose.foundation.layout.d r3 = androidx.compose.foundation.layout.C5073d.f18068a
            androidx.compose.foundation.layout.d$m r5 = r3.g()
            i1.c$a r6 = i1.C5437c.f24302a
            i1.c$b r8 = r6.k()
            r9 = 0
            E1.I r5 = androidx.compose.foundation.layout.C5080k.a(r5, r8, r15, r9)
            int r8 = U0.C4883j.a(r15, r9)
            U0.y r12 = r15.s()
            androidx.compose.ui.d r14 = androidx.compose.ui.c.e(r15, r0)
            G1.g$a r17 = G1.C4504g.f6515W
            nI.a r2 = r17.a()
            U0.f r18 = r15.m()
            if (r18 != 0) goto L_0x00b1
            U0.C4883j.c()
        L_0x00b1:
            r15.I()
            boolean r18 = r15.i()
            if (r18 == 0) goto L_0x00be
            r15.p(r2)
            goto L_0x00c1
        L_0x00be:
            r15.t()
        L_0x00c1:
            U0.m r2 = U0.F1.a(r15)
            nI.p r7 = r17.c()
            U0.F1.c(r2, r5, r7)
            nI.p r5 = r17.e()
            U0.F1.c(r2, r12, r5)
            nI.p r5 = r17.b()
            boolean r7 = r2.i()
            if (r7 != 0) goto L_0x00eb
            java.lang.Object r7 = r2.D()
            java.lang.Integer r12 = java.lang.Integer.valueOf(r8)
            boolean r7 = kotlin.jvm.internal.C17542s.e(r7, r12)
            if (r7 != 0) goto L_0x00f9
        L_0x00eb:
            java.lang.Integer r7 = java.lang.Integer.valueOf(r8)
            r2.u(r7)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r8)
            r2.w(r7, r5)
        L_0x00f9:
            nI.p r5 = r17.d()
            U0.F1.c(r2, r14, r5)
            s0.h r2 = s0.C5862h.f28810a
            androidx.compose.ui.d$a r2 = androidx.compose.ui.d.f18749a
            r14 = 24
            float r12 = (float) r14
            float r5 = c2.h.B(r12)
            r8 = 0
            r7 = 0
            androidx.compose.ui.d r5 = androidx.compose.foundation.layout.D.k(r2, r5, r8, r13, r7)
            androidx.compose.foundation.layout.d$m r3 = r3.g()
            i1.c$b r6 = r6.k()
            E1.I r3 = androidx.compose.foundation.layout.C5080k.a(r3, r6, r15, r9)
            int r6 = U0.C4883j.a(r15, r9)
            U0.y r7 = r15.s()
            androidx.compose.ui.d r5 = androidx.compose.ui.c.e(r15, r5)
            nI.a r8 = r17.a()
            U0.f r20 = r15.m()
            if (r20 != 0) goto L_0x0136
            U0.C4883j.c()
        L_0x0136:
            r15.I()
            boolean r20 = r15.i()
            if (r20 == 0) goto L_0x0143
            r15.p(r8)
            goto L_0x0146
        L_0x0143:
            r15.t()
        L_0x0146:
            U0.m r8 = U0.F1.a(r15)
            nI.p r13 = r17.c()
            U0.F1.c(r8, r3, r13)
            nI.p r3 = r17.e()
            U0.F1.c(r8, r7, r3)
            nI.p r3 = r17.b()
            boolean r7 = r8.i()
            if (r7 != 0) goto L_0x0170
            java.lang.Object r7 = r8.D()
            java.lang.Integer r13 = java.lang.Integer.valueOf(r6)
            boolean r7 = kotlin.jvm.internal.C17542s.e(r7, r13)
            if (r7 != 0) goto L_0x017e
        L_0x0170:
            java.lang.Integer r7 = java.lang.Integer.valueOf(r6)
            r8.u(r7)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r8.w(r6, r3)
        L_0x017e:
            nI.p r3 = r17.d()
            U0.F1.c(r8, r5, r3)
            r3 = 32
            float r3 = (float) r3
            float r3 = c2.h.B(r3)
            androidx.compose.ui.d r3 = androidx.compose.foundation.layout.J.i(r2, r3)
            r5 = 6
            s0.C5844O.a(r3, r15, r5)
            r3 = 1616898367(0x605fe93f, float:6.4537986E19)
            r15.W(r3)
            com.ingka.ikea.app.auth.login.LoginSignupPromotionBottomSheet$b$f r3 = com.ingka.ikea.app.auth.login.LoginSignupPromotionBottomSheet.b.f.f70098h
            boolean r3 = kotlin.jvm.internal.C17542s.e(r1, r3)
            if (r3 == 0) goto L_0x01ba
            int r3 = Oo.b.f84451N3
            java.lang.String r5 = J1.j.b(r3, r15, r9)
            SC.o0 r6 = SC.C13620o0.IkeaFamilyPrice
            SC.p0 r8 = SC.C13624p0.Subtle
            r3 = 3120(0xc30, float:4.372E-42)
            r13 = 4
            r7 = 0
            r14 = r9
            r9 = r15
            r31 = r10
            r10 = r3
            r11 = r13
            SC.C13616n0.b(r5, r6, r7, r8, r9, r10, r11)
            goto L_0x01bd
        L_0x01ba:
            r14 = r9
            r31 = r10
        L_0x01bd:
            r15.P()
            int r3 = r35.a()
            java.lang.String r5 = J1.j.b(r3, r15, r14)
            TC.b$b$a r6 = TC.C13679b.C2857b.a.f116683a
            r29 = 0
            r30 = 262140(0x3fffc, float:3.67336E-40)
            r7 = 0
            r8 = 0
            r10 = 0
            r3 = 0
            r32 = r12
            r13 = 16
            r12 = r3
            r13 = r3
            r34 = 24
            r14 = r3
            r16 = 0
            r3 = r15
            r15 = r16
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r22 = 0
            r23 = 0
            r24 = 0
            r25 = 0
            r26 = 0
            r28 = 48
            r27 = r3
            SC.C13607l.j(r5, r6, r7, r8, r10, r12, r13, r14, r15, r17, r18, r19, r20, r22, r23, r24, r25, r26, r27, r28, r29, r30)
            r5 = 16
            float r15 = (float) r5
            float r5 = c2.h.B(r15)
            androidx.compose.ui.d r5 = androidx.compose.foundation.layout.J.i(r2, r5)
            r6 = 6
            s0.C5844O.a(r5, r3, r6)
            int r5 = r35.e()
            r14 = 0
            java.lang.String r5 = J1.j.b(r5, r3, r14)
            TC.b$a$a r6 = TC.C13679b.a.C2855a.f116679a
            r12 = 0
            r13 = 0
            r16 = 0
            r14 = r16
            r16 = 0
            r33 = r15
            r15 = r16
            r17 = 0
            SC.C13607l.j(r5, r6, r7, r8, r10, r12, r13, r14, r15, r17, r18, r19, r20, r22, r23, r24, r25, r26, r27, r28, r29, r30)
            float r5 = c2.h.B(r33)
            androidx.compose.ui.d r5 = androidx.compose.foundation.layout.J.i(r2, r5)
            r6 = 6
            s0.C5844O.a(r5, r3, r6)
            r3.x()
            r5 = 790543122(0x2f1ebb12, float:1.4436477E-10)
            r3.W(r5)
            boolean r5 = r35.f()
            if (r5 == 0) goto L_0x027a
            float r5 = c2.h.B(r32)
            androidx.compose.ui.d r5 = androidx.compose.foundation.layout.J.i(r2, r5)
            s0.C5844O.a(r5, r3, r6)
            int r5 = Oo.b.f84824w4
            r6 = 0
            java.lang.String r5 = J1.j.b(r5, r3, r6)
            r6 = 1
            r7 = 0
            r8 = 0
            androidx.compose.ui.d r6 = androidx.compose.foundation.layout.J.h(r2, r7, r6, r8)
            float r9 = c2.h.B(r32)
            r10 = 2
            androidx.compose.ui.d r6 = androidx.compose.foundation.layout.D.k(r6, r9, r7, r10, r8)
            r7 = 1879048192(0x70000000, float:1.58456325E29)
            int r8 = r31 << 24
            r7 = r7 & r8
            r16 = r7 | 48
            r17 = 508(0x1fc, float:7.12E-43)
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = r36
            r15 = r3
            SC.L.b(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
        L_0x027a:
            r3.P()
            float r5 = c2.h.B(r32)
            androidx.compose.ui.d r2 = androidx.compose.foundation.layout.J.i(r2, r5)
            r5 = 6
            s0.C5844O.a(r2, r3, r5)
            r3.x()
            boolean r2 = U0.C4895p.J()
            if (r2 == 0) goto L_0x0295
            U0.C4895p.R()
        L_0x0295:
            r6 = r0
        L_0x0296:
            U0.Y0 r7 = r3.n()
            if (r7 == 0) goto L_0x02ae
            ef.c r8 = new ef.c
            r0 = r8
            r1 = r35
            r2 = r36
            r3 = r6
            r4 = r39
            r5 = r40
            r0.<init>(r1, r2, r3, r4, r5)
            r7.a(r8)
        L_0x02ae:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ingka.ikea.app.auth.login.a.d(com.ingka.ikea.app.auth.login.LoginSignupPromotionBottomSheet$b, nI.a, androidx.compose.ui.d, U0.m, int, int):void");
    }

    /* access modifiers changed from: private */
    public static final C16807N e(LoginSignupPromotionBottomSheet.b bVar, C17631a aVar, d dVar, int i10, int i11, C4889m mVar, int i12) {
        d(bVar, aVar, dVar, mVar, M0.a(i10 | 1), i11);
        return C16807N.f139792a;
    }

    private static final void f(d dVar, C4889m mVar, int i10, int i11) {
        int i12;
        d dVar2;
        C4889m mVar2;
        int i13 = i10;
        int i14 = i11;
        C4889m k10 = mVar.k(-1765447308);
        int i15 = i14 & 1;
        if (i15 != 0) {
            i12 = i13 | 6;
            dVar2 = dVar;
        } else if ((i13 & 6) == 0) {
            dVar2 = dVar;
            i12 = (k10.V(dVar2) ? 4 : 2) | i13;
        } else {
            dVar2 = dVar;
            i12 = i13;
        }
        if ((i12 & 3) != 2 || !k10.l()) {
            d.a aVar = i15 != 0 ? d.f18749a : dVar2;
            if (C4895p.J()) {
                C4895p.S(-1765447308, i12, -1, "com.ingka.ikea.app.auth.login.HeaderImage (LoginPromotionScreen.kt:96)");
            }
            mVar2 = k10;
            h.c("https://shop.static.ingka.ikea.com/instore/login_promotion_header.webp", (String) null, aVar, (C13178b) null, (e.b) null, C4478k.f5915a.a(), (C5437c) null, (C17642l<? super e.c, C16807N>) null, false, false, (q<? super C5857c, ? super C4889m, ? super Integer, C16807N>) null, (q<? super C5857c, ? super C4889m, ? super Integer, C16807N>) null, k10, ((i12 << 6) & 896) | 196662, 0, 4056);
            if (C4895p.J()) {
                C4895p.R();
            }
            dVar2 = aVar;
        } else {
            k10.L();
            mVar2 = k10;
        }
        Y0 n10 = mVar2.n();
        if (n10 != null) {
            n10.a(new C9650b(dVar2, i13, i14));
        }
    }

    /* access modifiers changed from: private */
    public static final C16807N g(d dVar, int i10, int i11, C4889m mVar, int i12) {
        f(dVar, mVar, M0.a(i10 | 1), i11);
        return C16807N.f139792a;
    }

    /* JADX WARNING: Removed duplicated region for block: B:110:0x0325  */
    /* JADX WARNING: Removed duplicated region for block: B:112:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00af  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00b6  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void h(com.ingka.ikea.app.auth.login.LoginSignupPromotionBottomSheet.b r28, int r29, nI.C17631a<XH.C16807N> r30, nI.C17631a<XH.C16807N> r31, androidx.compose.ui.d r32, U0.C4889m r33, int r34, int r35) {
        /*
            r6 = r28
            r15 = r30
            r14 = r31
            r13 = r34
            r7 = 16
            r0 = 4
            r1 = 6
            java.lang.String r2 = "promotionModeSetting"
            kotlin.jvm.internal.C17542s.j(r6, r2)
            java.lang.String r2 = "onCloseClick"
            kotlin.jvm.internal.C17542s.j(r15, r2)
            java.lang.String r2 = "onLoginClick"
            kotlin.jvm.internal.C17542s.j(r14, r2)
            r2 = -973565074(0xffffffffc5f8936e, float:-7954.4287)
            r3 = r33
            U0.m r12 = r3.k(r2)
            r3 = 1
            r4 = r35 & 1
            r5 = 2
            if (r4 == 0) goto L_0x002d
            r4 = r13 | 6
            goto L_0x003d
        L_0x002d:
            r4 = r13 & 6
            if (r4 != 0) goto L_0x003c
            boolean r4 = r12.V(r6)
            if (r4 == 0) goto L_0x0039
            r4 = r0
            goto L_0x003a
        L_0x0039:
            r4 = r5
        L_0x003a:
            r4 = r4 | r13
            goto L_0x003d
        L_0x003c:
            r4 = r13
        L_0x003d:
            r8 = r35 & 2
            if (r8 == 0) goto L_0x0046
            r4 = r4 | 48
            r11 = r29
            goto L_0x0057
        L_0x0046:
            r8 = r13 & 48
            r11 = r29
            if (r8 != 0) goto L_0x0057
            boolean r8 = r12.d(r11)
            if (r8 == 0) goto L_0x0055
            r8 = 32
            goto L_0x0056
        L_0x0055:
            r8 = r7
        L_0x0056:
            r4 = r4 | r8
        L_0x0057:
            r0 = r35 & 4
            if (r0 == 0) goto L_0x005e
            r4 = r4 | 384(0x180, float:5.38E-43)
            goto L_0x006e
        L_0x005e:
            r0 = r13 & 384(0x180, float:5.38E-43)
            if (r0 != 0) goto L_0x006e
            boolean r0 = r12.F(r15)
            if (r0 == 0) goto L_0x006b
            r0 = 256(0x100, float:3.59E-43)
            goto L_0x006d
        L_0x006b:
            r0 = 128(0x80, float:1.794E-43)
        L_0x006d:
            r4 = r4 | r0
        L_0x006e:
            r0 = r35 & 8
            if (r0 == 0) goto L_0x0075
            r4 = r4 | 3072(0xc00, float:4.305E-42)
            goto L_0x0085
        L_0x0075:
            r0 = r13 & 3072(0xc00, float:4.305E-42)
            if (r0 != 0) goto L_0x0085
            boolean r0 = r12.F(r14)
            if (r0 == 0) goto L_0x0082
            r0 = 2048(0x800, float:2.87E-42)
            goto L_0x0084
        L_0x0082:
            r0 = 1024(0x400, float:1.435E-42)
        L_0x0084:
            r4 = r4 | r0
        L_0x0085:
            r0 = r35 & 16
            if (r0 == 0) goto L_0x008f
            r4 = r4 | 24576(0x6000, float:3.4438E-41)
        L_0x008b:
            r8 = r32
        L_0x008d:
            r9 = r4
            goto L_0x00a2
        L_0x008f:
            r8 = r13 & 24576(0x6000, float:3.4438E-41)
            if (r8 != 0) goto L_0x008b
            r8 = r32
            boolean r9 = r12.V(r8)
            if (r9 == 0) goto L_0x009e
            r9 = 16384(0x4000, float:2.2959E-41)
            goto L_0x00a0
        L_0x009e:
            r9 = 8192(0x2000, float:1.14794E-41)
        L_0x00a0:
            r4 = r4 | r9
            goto L_0x008d
        L_0x00a2:
            r4 = r9 & 9363(0x2493, float:1.312E-41)
            r10 = 9362(0x2492, float:1.3119E-41)
            if (r4 != r10) goto L_0x00b6
            boolean r4 = r12.l()
            if (r4 != 0) goto L_0x00af
            goto L_0x00b6
        L_0x00af:
            r12.L()
            r5 = r8
            r1 = r12
            goto L_0x031f
        L_0x00b6:
            if (r0 == 0) goto L_0x00bc
            androidx.compose.ui.d$a r0 = androidx.compose.ui.d.f18749a
            r10 = r0
            goto L_0x00bd
        L_0x00bc:
            r10 = r8
        L_0x00bd:
            boolean r0 = U0.C4895p.J()
            if (r0 == 0) goto L_0x00c9
            r0 = -1
            java.lang.String r4 = "com.ingka.ikea.app.auth.login.LoginPromotionScreen (LoginPromotionScreen.kt:51)"
            U0.C4895p.S(r2, r9, r0, r4)
        L_0x00c9:
            boolean r0 = Xo.g.c(r29)
            i1.c$a r8 = i1.C5437c.f24302a
            i1.c r2 = r8.o()
            r4 = 0
            E1.I r2 = androidx.compose.foundation.layout.C5077h.h(r2, r4)
            int r16 = U0.C4883j.a(r12, r4)
            U0.y r7 = r12.s()
            androidx.compose.ui.d r1 = androidx.compose.ui.c.e(r12, r10)
            G1.g$a r19 = G1.C4504g.f6515W
            nI.a r5 = r19.a()
            U0.f r20 = r12.m()
            if (r20 != 0) goto L_0x00f3
            U0.C4883j.c()
        L_0x00f3:
            r12.I()
            boolean r20 = r12.i()
            if (r20 == 0) goto L_0x0100
            r12.p(r5)
            goto L_0x0103
        L_0x0100:
            r12.t()
        L_0x0103:
            U0.m r5 = U0.F1.a(r12)
            nI.p r4 = r19.c()
            U0.F1.c(r5, r2, r4)
            nI.p r2 = r19.e()
            U0.F1.c(r5, r7, r2)
            nI.p r2 = r19.b()
            boolean r4 = r5.i()
            if (r4 != 0) goto L_0x012d
            java.lang.Object r4 = r5.D()
            java.lang.Integer r7 = java.lang.Integer.valueOf(r16)
            boolean r4 = kotlin.jvm.internal.C17542s.e(r4, r7)
            if (r4 != 0) goto L_0x013b
        L_0x012d:
            java.lang.Integer r4 = java.lang.Integer.valueOf(r16)
            r5.u(r4)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r16)
            r5.w(r4, r2)
        L_0x013b:
            nI.p r2 = r19.d()
            U0.F1.c(r5, r1, r2)
            androidx.compose.foundation.layout.j r7 = androidx.compose.foundation.layout.C5079j.f18125a
            r1 = 0
            r2 = 0
            if (r0 == 0) goto L_0x0200
            r0 = 76900780(0x49569ac, float:3.5126776E-36)
            r12.W(r0)
            androidx.compose.ui.d$a r0 = androidx.compose.ui.d.f18749a
            androidx.compose.ui.d r4 = androidx.compose.foundation.layout.J.h(r0, r1, r3, r2)
            androidx.compose.foundation.layout.d r5 = androidx.compose.foundation.layout.C5073d.f18068a
            androidx.compose.foundation.layout.d$m r5 = r5.g()
            i1.c$b r1 = r8.k()
            r2 = 0
            E1.I r1 = androidx.compose.foundation.layout.C5080k.a(r5, r1, r12, r2)
            int r5 = U0.C4883j.a(r12, r2)
            U0.y r2 = r12.s()
            androidx.compose.ui.d r4 = androidx.compose.ui.c.e(r12, r4)
            nI.a r3 = r19.a()
            U0.f r21 = r12.m()
            if (r21 != 0) goto L_0x017c
            U0.C4883j.c()
        L_0x017c:
            r12.I()
            boolean r21 = r12.i()
            if (r21 == 0) goto L_0x0189
            r12.p(r3)
            goto L_0x018c
        L_0x0189:
            r12.t()
        L_0x018c:
            U0.m r3 = U0.F1.a(r12)
            nI.p r6 = r19.c()
            U0.F1.c(r3, r1, r6)
            nI.p r1 = r19.e()
            U0.F1.c(r3, r2, r1)
            nI.p r1 = r19.b()
            boolean r2 = r3.i()
            if (r2 != 0) goto L_0x01b6
            java.lang.Object r2 = r3.D()
            java.lang.Integer r6 = java.lang.Integer.valueOf(r5)
            boolean r2 = kotlin.jvm.internal.C17542s.e(r2, r6)
            if (r2 != 0) goto L_0x01c4
        L_0x01b6:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r5)
            r3.u(r2)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r5)
            r3.w(r2, r1)
        L_0x01c4:
            nI.p r1 = r19.d()
            U0.F1.c(r3, r4, r1)
            s0.h r1 = s0.C5862h.f28810a
            r1 = 1
            r2 = 0
            r3 = 0
            androidx.compose.ui.d r0 = androidx.compose.foundation.layout.J.h(r0, r2, r1, r3)
            r1 = 1068121457(0x3faa3d71, float:1.33)
            r2 = 2
            r4 = 0
            androidx.compose.ui.d r0 = androidx.compose.foundation.layout.C5074e.b(r0, r1, r4, r2, r3)
            r1 = 6
            f(r0, r12, r1, r4)
            r0 = r9 & 14
            int r1 = r9 >> 6
            r1 = r1 & 112(0x70, float:1.57E-43)
            r5 = r0 | r1
            r6 = 4
            r2 = 0
            r0 = r28
            r1 = r31
            r3 = r12
            r4 = r5
            r5 = r6
            d(r0, r1, r2, r3, r4, r5)
            r12.x()
            r12.P()
            r19 = r10
            r10 = 0
            goto L_0x02d1
        L_0x0200:
            r0 = 77261651(0x49aeb53, float:3.6421337E-36)
            r12.W(r0)
            androidx.compose.ui.d$a r2 = androidx.compose.ui.d.f18749a
            r0 = 1
            r1 = 0
            r3 = 0
            androidx.compose.ui.d r4 = androidx.compose.foundation.layout.J.h(r2, r1, r0, r3)
            androidx.compose.foundation.layout.d r0 = androidx.compose.foundation.layout.C5073d.f18068a
            androidx.compose.foundation.layout.d$e r0 = r0.f()
            i1.c$c r1 = r8.l()
            r6 = 0
            E1.I r0 = androidx.compose.foundation.layout.G.b(r0, r1, r12, r6)
            int r1 = U0.C4883j.a(r12, r6)
            U0.y r3 = r12.s()
            androidx.compose.ui.d r4 = androidx.compose.ui.c.e(r12, r4)
            nI.a r5 = r19.a()
            U0.f r21 = r12.m()
            if (r21 != 0) goto L_0x0237
            U0.C4883j.c()
        L_0x0237:
            r12.I()
            boolean r21 = r12.i()
            if (r21 == 0) goto L_0x0244
            r12.p(r5)
            goto L_0x0247
        L_0x0244:
            r12.t()
        L_0x0247:
            U0.m r5 = U0.F1.a(r12)
            nI.p r6 = r19.c()
            U0.F1.c(r5, r0, r6)
            nI.p r0 = r19.e()
            U0.F1.c(r5, r3, r0)
            nI.p r0 = r19.b()
            boolean r3 = r5.i()
            if (r3 != 0) goto L_0x0271
            java.lang.Object r3 = r5.D()
            java.lang.Integer r6 = java.lang.Integer.valueOf(r1)
            boolean r3 = kotlin.jvm.internal.C17542s.e(r3, r6)
            if (r3 != 0) goto L_0x027f
        L_0x0271:
            java.lang.Integer r3 = java.lang.Integer.valueOf(r1)
            r5.u(r3)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r5.w(r1, r0)
        L_0x027f:
            nI.p r0 = r19.d()
            U0.F1.c(r5, r4, r0)
            s0.N r0 = s0.C5843N.f28726a
            r1 = 1
            r3 = 0
            r4 = 0
            androidx.compose.ui.d r23 = androidx.compose.foundation.layout.J.d(r2, r3, r1, r4)
            r26 = 2
            r27 = 0
            r24 = 1065353216(0x3f800000, float:1.0)
            r25 = 0
            r22 = r0
            androidx.compose.ui.d r1 = s0.C5842M.e(r22, r23, r24, r25, r26, r27)
            r6 = 0
            f(r1, r12, r6, r6)
            r5 = 2
            r16 = 0
            r3 = 1065353216(0x3f800000, float:1.0)
            r4 = 0
            r1 = r0
            r19 = r10
            r10 = r6
            r6 = r16
            androidx.compose.ui.d r1 = s0.C5842M.e(r1, r2, r3, r4, r5, r6)
            i1.c$c r2 = r8.i()
            androidx.compose.ui.d r2 = r0.c(r1, r2)
            r0 = r9 & 14
            r1 = 6
            int r1 = r9 >> 6
            r1 = r1 & 112(0x70, float:1.57E-43)
            r4 = r0 | r1
            r5 = 0
            r0 = r28
            r1 = r31
            r3 = r12
            d(r0, r1, r2, r3, r4, r5)
            r12.x()
            r12.P()
        L_0x02d1:
            int r0 = uK.C18146a.f148097J2
            int r1 = Oo.b.f84665i
            java.lang.String r1 = J1.j.b(r1, r12, r10)
            SC.G0 r2 = SC.G0.Small
            SC.H0 r3 = SC.H0.PrimaryInverseStatic
            androidx.compose.ui.d$a r4 = androidx.compose.ui.d.f18749a
            i1.c r5 = r8.n()
            androidx.compose.ui.d r4 = r7.a(r4, r5)
            r5 = 16
            float r5 = (float) r5
            float r5 = c2.h.B(r5)
            androidx.compose.ui.d r4 = androidx.compose.foundation.layout.D.i(r4, r5)
            int r5 = r9 << 18
            r6 = 234881024(0xe000000, float:1.5777218E-30)
            r5 = r5 & r6
            r6 = 221184(0x36000, float:3.09945E-40)
            r17 = r5 | r6
            r18 = 200(0xc8, float:2.8E-43)
            r10 = 0
            r5 = 0
            r6 = 0
            r7 = r0
            r8 = r1
            r9 = r4
            r0 = r19
            r11 = r3
            r1 = r12
            r12 = r2
            r13 = r5
            r14 = r6
            r15 = r30
            r16 = r1
            SC.F0.b(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            r1.x()
            boolean r2 = U0.C4895p.J()
            if (r2 == 0) goto L_0x031e
            U0.C4895p.R()
        L_0x031e:
            r5 = r0
        L_0x031f:
            U0.Y0 r8 = r1.n()
            if (r8 == 0) goto L_0x033a
            ef.a r9 = new ef.a
            r0 = r9
            r1 = r28
            r2 = r29
            r3 = r30
            r4 = r31
            r6 = r34
            r7 = r35
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            r8.a(r9)
        L_0x033a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ingka.ikea.app.auth.login.a.h(com.ingka.ikea.app.auth.login.LoginSignupPromotionBottomSheet$b, int, nI.a, nI.a, androidx.compose.ui.d, U0.m, int, int):void");
    }

    /* access modifiers changed from: private */
    public static final C16807N i(LoginSignupPromotionBottomSheet.b bVar, int i10, C17631a aVar, C17631a aVar2, d dVar, int i11, int i12, C4889m mVar, int i13) {
        h(bVar, i10, aVar, aVar2, dVar, mVar, M0.a(i11 | 1), i12);
        return C16807N.f139792a;
    }
}
