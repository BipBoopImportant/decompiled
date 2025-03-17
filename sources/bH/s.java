package bh;

import SC.N;
import U0.C4889m;
import U0.C4895p;
import U0.M0;
import U0.Y0;
import XH.C16807N;
import gh.C9743b;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import nI.C17642l;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a+\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0001¢\u0006\u0004\b\u0006\u0010\u0007\u001a=\u0010\f\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00032\b\u0010\t\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u000b\u001a\u00020\n2\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0003¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lgh/b;", "buyGiftCardUiState", "Lkotlin/Function1;", "", "LXH/N;", "onBuyGiftCards", "g", "(Lgh/b;LnI/l;LU0/m;I)V", "buyGiftCardsLink", "displayButtonText", "LSC/N;", "buttonVariant", "d", "(Ljava/lang/String;Ljava/lang/String;LSC/N;LnI/l;LU0/m;I)V", "giftcard-implementation_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class s {
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v6, resolved type: nI.a} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static final void d(java.lang.String r35, java.lang.String r36, SC.N r37, nI.C17642l<? super java.lang.String, XH.C16807N> r38, U0.C4889m r39, int r40) {
        /*
            r1 = r35
            r2 = r36
            r4 = r38
            r5 = r40
            r0 = -313535938(0xffffffffed4fd23e, float:-4.0198478E27)
            r3 = r39
            U0.m r3 = r3.k(r0)
            r6 = 6
            r7 = r5 & 6
            if (r7 != 0) goto L_0x0021
            boolean r7 = r3.V(r1)
            if (r7 == 0) goto L_0x001e
            r7 = 4
            goto L_0x001f
        L_0x001e:
            r7 = 2
        L_0x001f:
            r7 = r7 | r5
            goto L_0x0022
        L_0x0021:
            r7 = r5
        L_0x0022:
            r8 = r5 & 48
            if (r8 != 0) goto L_0x0032
            boolean r8 = r3.V(r2)
            if (r8 == 0) goto L_0x002f
            r8 = 32
            goto L_0x0031
        L_0x002f:
            r8 = 16
        L_0x0031:
            r7 = r7 | r8
        L_0x0032:
            r8 = r5 & 384(0x180, float:5.38E-43)
            r14 = r37
            if (r8 != 0) goto L_0x0044
            boolean r8 = r3.V(r14)
            if (r8 == 0) goto L_0x0041
            r8 = 256(0x100, float:3.59E-43)
            goto L_0x0043
        L_0x0041:
            r8 = 128(0x80, float:1.794E-43)
        L_0x0043:
            r7 = r7 | r8
        L_0x0044:
            r8 = r5 & 3072(0xc00, float:4.305E-42)
            if (r8 != 0) goto L_0x0054
            boolean r8 = r3.F(r4)
            if (r8 == 0) goto L_0x0051
            r8 = 2048(0x800, float:2.87E-42)
            goto L_0x0053
        L_0x0051:
            r8 = 1024(0x400, float:1.435E-42)
        L_0x0053:
            r7 = r7 | r8
        L_0x0054:
            r11 = r7
            r7 = r11 & 1171(0x493, float:1.641E-42)
            r8 = 1170(0x492, float:1.64E-42)
            if (r7 != r8) goto L_0x0067
            boolean r7 = r3.l()
            if (r7 != 0) goto L_0x0062
            goto L_0x0067
        L_0x0062:
            r3.L()
            goto L_0x01fb
        L_0x0067:
            boolean r7 = U0.C4895p.J()
            if (r7 == 0) goto L_0x0073
            r7 = -1
            java.lang.String r8 = "com.ingka.ikea.app.mcommerce.giftcard.impl.compose.BuyGiftCardComposable (BuyGiftCardsComposables.kt:54)"
            U0.C4895p.S(r0, r11, r7, r8)
        L_0x0073:
            androidx.compose.foundation.layout.d r0 = androidx.compose.foundation.layout.C5073d.f18068a
            r7 = 24
            float r7 = (float) r7
            float r8 = c2.h.B(r7)
            androidx.compose.foundation.layout.d$f r0 = r0.n(r8)
            androidx.compose.ui.d$a r12 = androidx.compose.ui.d.f18749a
            r8 = 12
            float r8 = (float) r8
            float r9 = c2.h.B(r8)
            float r7 = c2.h.B(r7)
            androidx.compose.ui.d r7 = androidx.compose.foundation.layout.D.j(r12, r7, r9)
            i1.c$a r9 = i1.C5437c.f24302a
            i1.c$b r9 = r9.k()
            E1.I r0 = androidx.compose.foundation.layout.C5080k.a(r0, r9, r3, r6)
            r9 = 0
            int r6 = U0.C4883j.a(r3, r9)
            U0.y r10 = r3.s()
            androidx.compose.ui.d r7 = androidx.compose.ui.c.e(r3, r7)
            G1.g$a r16 = G1.C4504g.f6515W
            nI.a r13 = r16.a()
            U0.f r17 = r3.m()
            if (r17 != 0) goto L_0x00b7
            U0.C4883j.c()
        L_0x00b7:
            r3.I()
            boolean r17 = r3.i()
            if (r17 == 0) goto L_0x00c4
            r3.p(r13)
            goto L_0x00c7
        L_0x00c4:
            r3.t()
        L_0x00c7:
            U0.m r13 = U0.F1.a(r3)
            nI.p r15 = r16.c()
            U0.F1.c(r13, r0, r15)
            nI.p r0 = r16.e()
            U0.F1.c(r13, r10, r0)
            nI.p r0 = r16.b()
            boolean r10 = r13.i()
            if (r10 != 0) goto L_0x00f1
            java.lang.Object r10 = r13.D()
            java.lang.Integer r15 = java.lang.Integer.valueOf(r6)
            boolean r10 = kotlin.jvm.internal.C17542s.e(r10, r15)
            if (r10 != 0) goto L_0x00ff
        L_0x00f1:
            java.lang.Integer r10 = java.lang.Integer.valueOf(r6)
            r13.u(r10)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r13.w(r6, r0)
        L_0x00ff:
            nI.p r0 = r16.d()
            U0.F1.c(r13, r7, r0)
            s0.h r0 = s0.C5862h.f28810a
            int r0 = Zg.c.f65248b
            java.lang.String r6 = J1.j.b(r0, r3, r9)
            TC.b$b$f r7 = TC.C13679b.C2857b.f.f116688a
            float r20 = c2.h.B(r8)
            r21 = 7
            r22 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r16 = r12
            androidx.compose.ui.d r0 = androidx.compose.foundation.layout.D.m(r16, r17, r18, r19, r20, r21, r22)
            java.lang.String r8 = "BUY_GIFT_CARD_LABEL"
            androidx.compose.ui.d r8 = androidx.compose.ui.platform.C5116k1.a(r0, r8)
            r30 = 0
            r31 = 262136(0x3fff8, float:3.67331E-40)
            r15 = 0
            r0 = r9
            r9 = r15
            r13 = r11
            r32 = r12
            r11 = r15
            r15 = 0
            r33 = r13
            r13 = r15
            r14 = r15
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
            r29 = 432(0x1b0, float:6.05E-43)
            r28 = r3
            SC.C13607l.j(r6, r7, r8, r9, r11, r13, r14, r15, r16, r18, r19, r20, r21, r23, r24, r25, r26, r27, r28, r29, r30, r31)
            int r6 = Zg.c.f65247a
            java.lang.String r6 = J1.j.b(r6, r3, r0)
            TC.b$a$b r7 = TC.C13679b.a.C2856b.f116680a
            java.lang.String r8 = "BUY_GIFT_CARD_DESCRIPTION"
            r15 = r32
            androidx.compose.ui.d r8 = androidx.compose.ui.platform.C5116k1.a(r15, r8)
            r9 = 0
            r11 = 0
            r13 = 0
            r14 = 0
            r16 = 0
            r34 = r15
            r15 = r16
            r16 = 0
            SC.C13607l.j(r6, r7, r8, r9, r11, r13, r14, r15, r16, r18, r19, r20, r21, r23, r24, r25, r26, r27, r28, r29, r30, r31)
            r6 = -1956287496(0xffffffff8b656bf8, float:-4.4185022E-32)
            r3.W(r6)
            if (r2 != 0) goto L_0x0187
            int r6 = Zg.c.f65248b
            java.lang.String r6 = J1.j.b(r6, r3, r0)
            goto L_0x0188
        L_0x0187:
            r6 = r2
        L_0x0188:
            r3.P()
            SC.M r10 = SC.M.Medium
            r7 = 0
            r8 = 0
            r9 = 1
            r11 = r34
            androidx.compose.ui.d r7 = androidx.compose.foundation.layout.J.h(r11, r7, r9, r8)
            java.lang.String r8 = "BUY_GIFT_CARD_BUTTON"
            androidx.compose.ui.d r7 = androidx.compose.ui.platform.C5116k1.a(r7, r8)
            int r8 = uK.C18146a.f147996C6
            SC.K0 r13 = SC.K0.LEADING
            java.lang.Integer r12 = java.lang.Integer.valueOf(r8)
            r8 = -1956274386(0xffffffff8b659f2e, float:-4.422355E-32)
            r3.W(r8)
            r8 = r33
            r11 = r8 & 7168(0x1c00, float:1.0045E-41)
            r14 = 2048(0x800, float:2.87E-42)
            if (r11 != r14) goto L_0x01b4
            r11 = r9
            goto L_0x01b5
        L_0x01b4:
            r11 = r0
        L_0x01b5:
            r14 = r8 & 14
            r15 = 4
            if (r14 != r15) goto L_0x01bb
            goto L_0x01bc
        L_0x01bb:
            r9 = r0
        L_0x01bc:
            r0 = r11 | r9
            java.lang.Object r9 = r3.D()
            if (r0 != 0) goto L_0x01cc
            U0.m$a r0 = U0.C4889m.f14007a
            java.lang.Object r0 = r0.a()
            if (r9 != r0) goto L_0x01d4
        L_0x01cc:
            bh.q r9 = new bh.q
            r9.<init>(r4, r1)
            r3.u(r9)
        L_0x01d4:
            r15 = r9
            nI.a r15 = (nI.C17631a) r15
            r3.P()
            int r0 = r8 << 3
            r0 = r0 & 7168(0x1c00, float:1.0045E-41)
            r8 = 12607536(0xc06030, float:1.7666921E-38)
            r17 = r0 | r8
            r18 = 292(0x124, float:4.09E-43)
            r8 = 0
            r11 = 0
            r14 = 0
            r9 = r37
            r16 = r3
            SC.L.b(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            r3.x()
            boolean r0 = U0.C4895p.J()
            if (r0 == 0) goto L_0x01fb
            U0.C4895p.R()
        L_0x01fb:
            U0.Y0 r6 = r3.n()
            if (r6 == 0) goto L_0x0214
            bh.r r7 = new bh.r
            r0 = r7
            r1 = r35
            r2 = r36
            r3 = r37
            r4 = r38
            r5 = r40
            r0.<init>(r1, r2, r3, r4, r5)
            r6.a(r7)
        L_0x0214:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: bh.s.d(java.lang.String, java.lang.String, SC.N, nI.l, U0.m, int):void");
    }

    /* access modifiers changed from: private */
    public static final C16807N e(C17642l lVar, String str) {
        lVar.invoke(str);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N f(String str, String str2, N n10, C17642l lVar, int i10, C4889m mVar, int i11) {
        d(str, str2, n10, lVar, mVar, M0.a(i10 | 1));
        return C16807N.f139792a;
    }

    public static final void g(C9743b bVar, C17642l<? super String, C16807N> lVar, C4889m mVar, int i10) {
        int i11;
        C17542s.j(bVar, "buyGiftCardUiState");
        C17542s.j(lVar, "onBuyGiftCards");
        C4889m k10 = mVar.k(-1890816259);
        if ((i10 & 6) == 0) {
            i11 = (k10.V(bVar) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= k10.F(lVar) ? 32 : 16;
        }
        if ((i11 & 19) != 18 || !k10.l()) {
            if (C4895p.J()) {
                C4895p.S(-1890816259, i11, -1, "com.ingka.ikea.app.mcommerce.giftcard.impl.compose.BuyGiftCardScreen (BuyGiftCardsComposables.kt:32)");
            }
            if (bVar instanceof C9743b.a) {
                C9743b.a aVar = (C9743b.a) bVar;
                d(aVar.b(), aVar.c(), aVar.a(), lVar, k10, (i11 << 6) & 7168);
            }
            if (C4895p.J()) {
                C4895p.R();
            }
        } else {
            k10.L();
        }
        Y0 n10 = k10.n();
        if (n10 != null) {
            n10.a(new p(bVar, lVar, i10));
        }
    }

    /* access modifiers changed from: private */
    public static final C16807N h(C9743b bVar, C17642l lVar, int i10, C4889m mVar, int i11) {
        g(bVar, lVar, mVar, M0.a(i10 | 1));
        return C16807N.f139792a;
    }
}
