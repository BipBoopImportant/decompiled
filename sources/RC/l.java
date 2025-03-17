package RC;

import E1.I;
import G1.C4504g;
import IC.C13023e;
import L1.v;
import L1.x;
import RC.m;
import SC.C13643u0;
import SC.S1;
import TC.C13679b;
import U0.C4883j;
import U0.C4889m;
import U0.C4895p;
import U0.C4912y;
import U0.F1;
import U0.M0;
import U0.Y0;
import XH.C16807N;
import androidx.compose.foundation.layout.C5073d;
import androidx.compose.foundation.layout.C5080k;
import androidx.compose.foundation.layout.D;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import androidx.compose.ui.platform.C5116k1;
import c2.h;
import i1.C5437c;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nI.C17631a;
import nI.C17642l;
import nI.p;
import s0.C5862h;
import tK.C18030v;

@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a5\u0010\b\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0007¢\u0006\u0004\b\b\u0010\t\u001a\u0017\u0010\f\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\nH\u0003¢\u0006\u0004\b\f\u0010\r\u001a!\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0003\u001a\u00020\u0002H\u0003¢\u0006\u0004\b\u0010\u0010\u0011\u001a!\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010\u0003\u001a\u00020\u0002H\u0003¢\u0006\u0004\b\u0014\u0010\u0015\u001a+\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u00162\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0019\u001a\u00020\u0018H\u0003¢\u0006\u0004\b\u001a\u0010\u001b\u001a3\u0010 \u001a\u00020\u00062\u0006\u0010\u001c\u001a\u00020\u000e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u001f\u001a\u00020\u001e2\b\b\u0002\u0010\u0003\u001a\u00020\u0002H\u0003¢\u0006\u0004\b \u0010!\u001a+\u0010$\u001a\u00020\u00062\u0006\u0010#\u001a\u00020\"2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0003¢\u0006\u0004\b$\u0010%\u001a+\u0010)\u001a\u00020\u00062\u0006\u0010'\u001a\u00020&2\u0012\u0010(\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0003¢\u0006\u0004\b)\u0010*¨\u0006+"}, d2 = {"LRC/m;", "uiState", "Landroidx/compose/ui/d;", "modifier", "Lkotlin/Function1;", "", "LXH/N;", "onDeleteTransaction", "r", "(LRC/m;Landroidx/compose/ui/d;LnI/l;LU0/m;II)V", "LRC/m$d;", "totalPrice", "z", "(LRC/m$d;LU0/m;I)V", "LIC/e;", "familyPromotionText", "p", "(LIC/e;Landroidx/compose/ui/d;LU0/m;II)V", "LRC/m$b;", "familyRewardsPromotion", "n", "(LRC/m$b;Landroidx/compose/ui/d;LU0/m;II)V", "LRC/m$c;", "entry", "", "indentEntries", "w", "(LRC/m$c;Landroidx/compose/ui/d;ZLU0/m;II)V", "label", "value", "LTC/b;", "style", "t", "(LIC/e;Ljava/lang/String;LTC/b;Landroidx/compose/ui/d;LU0/m;II)V", "LRC/m$a;", "amountLeftToPay", "l", "(LRC/m$a;LnI/l;LU0/m;I)V", "LRC/m$a$a;", "transaction", "onDeleteTransactionCallback", "B", "(LRC/m$a$a;LnI/l;LU0/m;I)V", "price-summary_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class l {
    /* access modifiers changed from: private */
    public static final C16807N A(m.d dVar, int i10, C4889m mVar, int i11) {
        z(dVar, mVar, M0.a(i10 | 1));
        return C16807N.f139792a;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v1, resolved type: nI.a} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static final void B(RC.m.a.C2837a r33, nI.C17642l<? super java.lang.String, XH.C16807N> r34, U0.C4889m r35, int r36) {
        /*
            r0 = r33
            r1 = r34
            r2 = r36
            r3 = 8
            r4 = 1517609244(0x5a74e11c, float:1.72318512E16)
            r5 = r35
            U0.m r15 = r5.k(r4)
            r5 = r2 & 6
            r14 = 4
            if (r5 != 0) goto L_0x002a
            r5 = r2 & 8
            if (r5 != 0) goto L_0x001f
            boolean r5 = r15.V(r0)
            goto L_0x0023
        L_0x001f:
            boolean r5 = r15.F(r0)
        L_0x0023:
            if (r5 == 0) goto L_0x0027
            r5 = r14
            goto L_0x0028
        L_0x0027:
            r5 = 2
        L_0x0028:
            r5 = r5 | r2
            goto L_0x002b
        L_0x002a:
            r5 = r2
        L_0x002b:
            r6 = r2 & 48
            r7 = 16
            r13 = 32
            if (r6 != 0) goto L_0x003d
            boolean r6 = r15.F(r1)
            if (r6 == 0) goto L_0x003b
            r6 = r13
            goto L_0x003c
        L_0x003b:
            r6 = r7
        L_0x003c:
            r5 = r5 | r6
        L_0x003d:
            r12 = r5
            r5 = r12 & 19
            r6 = 18
            if (r5 != r6) goto L_0x0051
            boolean r5 = r15.l()
            if (r5 != 0) goto L_0x004b
            goto L_0x0051
        L_0x004b:
            r15.L()
            r3 = r15
            goto L_0x01e2
        L_0x0051:
            boolean r5 = U0.C4895p.J()
            if (r5 == 0) goto L_0x005d
            r5 = -1
            java.lang.String r6 = "com.ingka.ikea.ui.pricesummary.compose.Transaction (OrderSummaryContent.kt:444)"
            U0.C4895p.S(r4, r12, r5, r6)
        L_0x005d:
            androidx.compose.ui.d$a r4 = androidx.compose.ui.d.f18749a
            float r5 = (float) r7
            float r18 = c2.h.B(r5)
            r21 = 13
            r22 = 0
            r17 = 0
            r19 = 0
            r20 = 0
            r16 = r4
            androidx.compose.ui.d r5 = androidx.compose.foundation.layout.D.m(r16, r17, r18, r19, r20, r21, r22)
            androidx.compose.foundation.layout.d r6 = androidx.compose.foundation.layout.C5073d.f18068a
            androidx.compose.foundation.layout.d$m r6 = r6.g()
            i1.c$a r7 = i1.C5437c.f24302a
            i1.c$b r7 = r7.k()
            r11 = 0
            E1.I r6 = androidx.compose.foundation.layout.C5080k.a(r6, r7, r15, r11)
            int r7 = U0.C4883j.a(r15, r11)
            U0.y r8 = r15.s()
            androidx.compose.ui.d r5 = androidx.compose.ui.c.e(r15, r5)
            G1.g$a r9 = G1.C4504g.f6515W
            nI.a r10 = r9.a()
            U0.f r16 = r15.m()
            if (r16 != 0) goto L_0x00a0
            U0.C4883j.c()
        L_0x00a0:
            r15.I()
            boolean r16 = r15.i()
            if (r16 == 0) goto L_0x00ad
            r15.p(r10)
            goto L_0x00b0
        L_0x00ad:
            r15.t()
        L_0x00b0:
            U0.m r10 = U0.F1.a(r15)
            nI.p r11 = r9.c()
            U0.F1.c(r10, r6, r11)
            nI.p r6 = r9.e()
            U0.F1.c(r10, r8, r6)
            nI.p r6 = r9.b()
            boolean r8 = r10.i()
            if (r8 != 0) goto L_0x00da
            java.lang.Object r8 = r10.D()
            java.lang.Integer r11 = java.lang.Integer.valueOf(r7)
            boolean r8 = kotlin.jvm.internal.C17542s.e(r8, r11)
            if (r8 != 0) goto L_0x00e8
        L_0x00da:
            java.lang.Integer r8 = java.lang.Integer.valueOf(r7)
            r10.u(r8)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r10.w(r7, r6)
        L_0x00e8:
            nI.p r6 = r9.d()
            U0.F1.c(r10, r5, r6)
            s0.h r5 = s0.C5862h.f28810a
            IC.e r5 = r33.c()
            java.lang.String r6 = r33.e()
            TC.b$a$b r7 = TC.C13679b.a.C2856b.f116680a
            int r11 = IC.C13023e.f110931a
            r10 = r11 | 384(0x180, float:5.38E-43)
            r16 = 8
            r8 = 0
            r9 = r15
            r3 = r11
            r31 = 0
            r11 = r16
            t(r5, r6, r7, r8, r9, r10, r11)
            IC.e r5 = r33.d()
            r6 = 944624537(0x384dd399, float:4.9072874E-5)
            r15.W(r6)
            if (r5 != 0) goto L_0x011c
            r32 = r12
            r35 = r15
            goto L_0x015f
        L_0x011c:
            java.lang.String r5 = r5.a(r15, r3)
            TC.b$a$c r6 = TC.C13679b.a.c.f116681a
            tK.v r7 = tK.C18030v.f147664a
            int r8 = tK.C18030v.f147665b
            tK.h r7 = r7.a(r15, r8)
            long r8 = r7.I0()
            r29 = 0
            r30 = 262132(0x3fff4, float:3.67325E-40)
            r7 = 0
            r10 = 0
            r16 = 0
            r32 = r12
            r12 = r16
            r13 = r16
            r14 = r16
            r16 = 0
            r35 = r15
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
            r27 = r35
            SC.C13607l.j(r5, r6, r7, r8, r10, r12, r13, r14, r15, r17, r18, r19, r20, r22, r23, r24, r25, r26, r27, r28, r29, r30)
        L_0x015f:
            r35.P()
            r5 = 8
            float r6 = (float) r5
            float r18 = c2.h.B(r6)
            r21 = 13
            r22 = 0
            r17 = 0
            r19 = 0
            r20 = 0
            r16 = r4
            androidx.compose.ui.d r6 = androidx.compose.foundation.layout.D.m(r16, r17, r18, r19, r20, r21, r22)
            IC.e r4 = r33.a()
            r15 = r35
            java.lang.String r5 = r4.a(r15, r3)
            SC.N r8 = SC.N.Secondary
            SC.M r9 = SC.M.Small
            r3 = 944638703(0x384e0aef, float:4.912441E-5)
            r15.W(r3)
            r3 = r32 & 112(0x70, float:1.57E-43)
            r11 = 1
            r4 = 32
            if (r3 != r4) goto L_0x0196
            r3 = r11
            goto L_0x0198
        L_0x0196:
            r3 = r31
        L_0x0198:
            r4 = r32 & 14
            r7 = 4
            if (r4 == r7) goto L_0x01ac
            r4 = 8
            r4 = r32 & 8
            if (r4 == 0) goto L_0x01aa
            boolean r4 = r15.F(r0)
            if (r4 == 0) goto L_0x01aa
            goto L_0x01ac
        L_0x01aa:
            r11 = r31
        L_0x01ac:
            r3 = r3 | r11
            java.lang.Object r4 = r15.D()
            if (r3 != 0) goto L_0x01bb
            U0.m$a r3 = U0.C4889m.f14007a
            java.lang.Object r3 = r3.a()
            if (r4 != r3) goto L_0x01c3
        L_0x01bb:
            RC.i r4 = new RC.i
            r4.<init>(r1, r0)
            r15.u(r4)
        L_0x01c3:
            r14 = r4
            nI.a r14 = (nI.C17631a) r14
            r15.P()
            r16 = 27696(0x6c30, float:3.881E-41)
            r17 = 484(0x1e4, float:6.78E-43)
            r7 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r3 = r15
            SC.L.b(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            r3.x()
            boolean r4 = U0.C4895p.J()
            if (r4 == 0) goto L_0x01e2
            U0.C4895p.R()
        L_0x01e2:
            U0.Y0 r3 = r3.n()
            if (r3 == 0) goto L_0x01f0
            RC.j r4 = new RC.j
            r4.<init>(r0, r1, r2)
            r3.a(r4)
        L_0x01f0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: RC.l.B(RC.m$a$a, nI.l, U0.m, int):void");
    }

    /* access modifiers changed from: private */
    public static final C16807N C(C17642l lVar, m.a.C2837a aVar) {
        lVar.invoke(aVar.b());
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N D(m.a.C2837a aVar, C17642l lVar, int i10, C4889m mVar, int i11) {
        B(aVar, lVar, mVar, M0.a(i10 | 1));
        return C16807N.f139792a;
    }

    private static final void l(m.a aVar, C17642l<? super String, C16807N> lVar, C4889m mVar, int i10) {
        int i11;
        C4889m k10 = mVar.k(-2032935876);
        if ((i10 & 6) == 0) {
            i11 = (k10.F(aVar) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= k10.F(lVar) ? 32 : 16;
        }
        if ((i11 & 19) != 18 || !k10.l()) {
            if (C4895p.J()) {
                C4895p.S(-2032935876, i11, -1, "com.ingka.ikea.ui.pricesummary.compose.AmountLeftToPay (OrderSummaryContent.kt:413)");
            }
            d m10 = D.m(C5116k1.a(d.f18749a, "OrderSummaryTestTags_AMOUNT_LEFT_TO_PAY"), 0.0f, h.B((float) 8), 0.0f, 0.0f, 13, (Object) null);
            I a10 = C5080k.a(C5073d.f18068a.g(), C5437c.f24302a.k(), k10, 0);
            int a11 = C4883j.a(k10, 0);
            C4912y s10 = k10.s();
            d e10 = c.e(k10, m10);
            C4504g.a aVar2 = C4504g.f6515W;
            C17631a<C4504g> a12 = aVar2.a();
            if (k10.m() == null) {
                C4883j.c();
            }
            k10.I();
            if (k10.i()) {
                k10.p(a12);
            } else {
                k10.t();
            }
            C4889m a13 = F1.a(k10);
            F1.c(a13, a10, aVar2.c());
            F1.c(a13, s10, aVar2.e());
            p<C4504g, Integer, C16807N> b10 = aVar2.b();
            if (a13.i() || !C17542s.e(a13.D(), Integer.valueOf(a11))) {
                a13.u(Integer.valueOf(a11));
                a13.w(Integer.valueOf(a11), b10);
            }
            F1.c(a13, e10, aVar2.d());
            C5862h hVar = C5862h.f28810a;
            k10.W(-1941148156);
            for (m.a.C2837a B10 : aVar.a()) {
                B(B10, lVar, k10, C13023e.f110931a | (i11 & 112));
            }
            k10.P();
            C13643u0.c(D.k(d.f18749a, 0.0f, h.B((float) 24), 1, (Object) null), h.B((float) 2), C18030v.f147664a.a(k10, C18030v.f147665b).p0(), k10, 54, 0);
            v.n(aVar.b().a().a(k10, C13023e.f110931a), aVar.b().b(), (d) null, S1.Medium, (String) null, k10, 3072, 20);
            k10.x();
            if (C4895p.J()) {
                C4895p.R();
            }
        } else {
            k10.L();
        }
        Y0 n10 = k10.n();
        if (n10 != null) {
            n10.a(new f(aVar, lVar, i10));
        }
    }

    /* access modifiers changed from: private */
    public static final C16807N m(m.a aVar, C17642l lVar, int i10, C4889m mVar, int i11) {
        l(aVar, lVar, mVar, M0.a(i10 | 1));
        return C16807N.f139792a;
    }

    /* JADX WARNING: Removed duplicated region for block: B:29:0x0059  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0060  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x0255  */
    /* JADX WARNING: Removed duplicated region for block: B:68:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static final void n(RC.m.b r39, androidx.compose.ui.d r40, U0.C4889m r41, int r42, int r43) {
        /*
            r0 = r39
            r1 = r42
            r2 = r43
            r3 = -1352651212(0xffffffffaf602e34, float:-2.0389096E-10)
            r4 = r41
            U0.m r14 = r4.k(r3)
            r4 = r2 & 1
            if (r4 == 0) goto L_0x0016
            r4 = r1 | 6
            goto L_0x002f
        L_0x0016:
            r4 = r1 & 6
            if (r4 != 0) goto L_0x002e
            r4 = r1 & 8
            if (r4 != 0) goto L_0x0023
            boolean r4 = r14.V(r0)
            goto L_0x0027
        L_0x0023:
            boolean r4 = r14.F(r0)
        L_0x0027:
            if (r4 == 0) goto L_0x002b
            r4 = 4
            goto L_0x002c
        L_0x002b:
            r4 = 2
        L_0x002c:
            r4 = r4 | r1
            goto L_0x002f
        L_0x002e:
            r4 = r1
        L_0x002f:
            r5 = r2 & 2
            r6 = 16
            r7 = 32
            if (r5 == 0) goto L_0x003c
            r4 = r4 | 48
        L_0x0039:
            r8 = r40
            goto L_0x004c
        L_0x003c:
            r8 = r1 & 48
            if (r8 != 0) goto L_0x0039
            r8 = r40
            boolean r9 = r14.V(r8)
            if (r9 == 0) goto L_0x004a
            r9 = r7
            goto L_0x004b
        L_0x004a:
            r9 = r6
        L_0x004b:
            r4 = r4 | r9
        L_0x004c:
            r9 = r4 & 19
            r10 = 18
            if (r9 != r10) goto L_0x0060
            boolean r9 = r14.l()
            if (r9 != 0) goto L_0x0059
            goto L_0x0060
        L_0x0059:
            r14.L()
            r31 = r14
            goto L_0x024f
        L_0x0060:
            if (r5 == 0) goto L_0x0066
            androidx.compose.ui.d$a r5 = androidx.compose.ui.d.f18749a
            r15 = r5
            goto L_0x0067
        L_0x0066:
            r15 = r8
        L_0x0067:
            boolean r5 = U0.C4895p.J()
            if (r5 == 0) goto L_0x0073
            r5 = -1
            java.lang.String r8 = "com.ingka.ikea.ui.pricesummary.compose.FamilyRewardsSection (OrderSummaryContent.kt:306)"
            U0.C4895p.S(r3, r4, r5, r8)
        L_0x0073:
            IC.e r3 = r39.b()
            int r4 = IC.C13023e.f110931a
            java.lang.String r3 = r3.a(r14, r4)
            java.lang.String r4 = r39.a()
            N1.G r5 = new N1.G
            r16 = r5
            S1.C$a r8 = S1.C.f13316b
            S1.C r21 = r8.a()
            r37 = 65531(0xfffb, float:9.1828E-41)
            r38 = 0
            r17 = 0
            r19 = 0
            r22 = 0
            r23 = 0
            r24 = 0
            r25 = 0
            r26 = 0
            r28 = 0
            r29 = 0
            r30 = 0
            r31 = 0
            r33 = 0
            r34 = 0
            r35 = 0
            r36 = 0
            r16.<init>(r17, r19, r21, r22, r23, r24, r25, r26, r28, r29, r30, r31, r33, r34, r35, r36, r37, r38)
            N1.d r3 = IC.C13021c.e(r3, r4, r5)
            java.lang.String r4 = "OrderSummaryTestTags_FAMILY_REWARDS_SECTION"
            androidx.compose.ui.d r4 = androidx.compose.ui.platform.C5116k1.a(r15, r4)
            i1.c$a r5 = i1.C5437c.f24302a
            i1.c$c r8 = r5.i()
            androidx.compose.foundation.layout.d r9 = androidx.compose.foundation.layout.C5073d.f18068a
            float r6 = (float) r6
            float r6 = c2.h.B(r6)
            androidx.compose.foundation.layout.d$f r6 = r9.n(r6)
            r9 = 54
            E1.I r6 = androidx.compose.foundation.layout.G.b(r6, r8, r14, r9)
            r8 = 0
            int r9 = U0.C4883j.a(r14, r8)
            U0.y r10 = r14.s()
            androidx.compose.ui.d r4 = androidx.compose.ui.c.e(r14, r4)
            G1.g$a r11 = G1.C4504g.f6515W
            nI.a r12 = r11.a()
            U0.f r13 = r14.m()
            if (r13 != 0) goto L_0x00ee
            U0.C4883j.c()
        L_0x00ee:
            r14.I()
            boolean r13 = r14.i()
            if (r13 == 0) goto L_0x00fb
            r14.p(r12)
            goto L_0x00fe
        L_0x00fb:
            r14.t()
        L_0x00fe:
            U0.m r12 = U0.F1.a(r14)
            nI.p r13 = r11.c()
            U0.F1.c(r12, r6, r13)
            nI.p r6 = r11.e()
            U0.F1.c(r12, r10, r6)
            nI.p r6 = r11.b()
            boolean r10 = r12.i()
            if (r10 != 0) goto L_0x0128
            java.lang.Object r10 = r12.D()
            java.lang.Integer r13 = java.lang.Integer.valueOf(r9)
            boolean r10 = kotlin.jvm.internal.C17542s.e(r10, r13)
            if (r10 != 0) goto L_0x0136
        L_0x0128:
            java.lang.Integer r10 = java.lang.Integer.valueOf(r9)
            r12.u(r10)
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            r12.w(r9, r6)
        L_0x0136:
            nI.p r6 = r11.d()
            U0.F1.c(r12, r4, r6)
            s0.N r16 = s0.C5843N.f28726a
            androidx.compose.ui.d$a r12 = androidx.compose.ui.d.f18749a
            float r4 = (float) r7
            float r4 = c2.h.B(r4)
            androidx.compose.ui.d r4 = androidx.compose.foundation.layout.J.t(r12, r4)
            A0.f r6 = A0.g.h()
            androidx.compose.ui.d r17 = m1.e.a(r4, r6)
            tK.v r4 = tK.C18030v.f147664a
            int r6 = tK.C18030v.f147665b
            tK.h r7 = r4.a(r14, r6)
            long r18 = r7.B0()
            r21 = 2
            r22 = 0
            r20 = 0
            androidx.compose.ui.d r7 = androidx.compose.foundation.b.d(r17, r18, r20, r21, r22)
            i1.c r9 = r5.o()
            E1.I r9 = androidx.compose.foundation.layout.C5077h.h(r9, r8)
            int r10 = U0.C4883j.a(r14, r8)
            U0.y r13 = r14.s()
            androidx.compose.ui.d r7 = androidx.compose.ui.c.e(r14, r7)
            nI.a r8 = r11.a()
            U0.f r17 = r14.m()
            if (r17 != 0) goto L_0x0189
            U0.C4883j.c()
        L_0x0189:
            r14.I()
            boolean r17 = r14.i()
            if (r17 == 0) goto L_0x0196
            r14.p(r8)
            goto L_0x0199
        L_0x0196:
            r14.t()
        L_0x0199:
            U0.m r8 = U0.F1.a(r14)
            r22 = r15
            nI.p r15 = r11.c()
            U0.F1.c(r8, r9, r15)
            nI.p r9 = r11.e()
            U0.F1.c(r8, r13, r9)
            nI.p r9 = r11.b()
            boolean r13 = r8.i()
            if (r13 != 0) goto L_0x01c5
            java.lang.Object r13 = r8.D()
            java.lang.Integer r15 = java.lang.Integer.valueOf(r10)
            boolean r13 = kotlin.jvm.internal.C17542s.e(r13, r15)
            if (r13 != 0) goto L_0x01d3
        L_0x01c5:
            java.lang.Integer r13 = java.lang.Integer.valueOf(r10)
            r8.u(r13)
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            r8.w(r10, r9)
        L_0x01d3:
            nI.p r9 = r11.d()
            U0.F1.c(r8, r7, r9)
            androidx.compose.foundation.layout.j r7 = androidx.compose.foundation.layout.C5079j.f18125a
            i1.c r5 = r5.e()
            androidx.compose.ui.d r7 = r7.a(r12, r5)
            int r5 = uK.C18146a.f148445g
            r8 = 0
            t1.c r5 = J1.e.c(r5, r14, r8)
            tK.h r4 = r4.a(r14, r6)
            long r8 = r4.x0()
            r10 = 48
            r11 = 0
            r6 = 0
            r4 = r5
            r5 = r6
            r6 = r7
            r7 = r8
            r9 = r14
            O0.V.a(r4, r5, r6, r7, r9, r10, r11)
            r14.x()
            r20 = 2
            r21 = 0
            r18 = 1065353216(0x3f800000, float:1.0)
            r19 = 0
            r17 = r12
            androidx.compose.ui.d r6 = s0.C5842M.e(r16, r17, r18, r19, r20, r21)
            TC.b$a$b r5 = TC.C13679b.a.C2856b.f116680a
            r29 = 0
            r30 = 524280(0x7fff8, float:7.34673E-40)
            r7 = 0
            r9 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r15 = 0
            r31 = r14
            r32 = r22
            r14 = r15
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r24 = 0
            r25 = 0
            r26 = 0
            r28 = 48
            r4 = r3
            r27 = r31
            SC.C13607l.h(r4, r5, r6, r7, r9, r11, r12, r13, r14, r16, r17, r18, r19, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30)
            r31.x()
            boolean r3 = U0.C4895p.J()
            if (r3 == 0) goto L_0x024d
            U0.C4895p.R()
        L_0x024d:
            r8 = r32
        L_0x024f:
            U0.Y0 r3 = r31.n()
            if (r3 == 0) goto L_0x025d
            RC.d r4 = new RC.d
            r4.<init>(r0, r8, r1, r2)
            r3.a(r4)
        L_0x025d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: RC.l.n(RC.m$b, androidx.compose.ui.d, U0.m, int, int):void");
    }

    /* access modifiers changed from: private */
    public static final C16807N o(m.b bVar, d dVar, int i10, int i11, C4889m mVar, int i12) {
        n(bVar, dVar, mVar, M0.a(i10 | 1), i11);
        return C16807N.f139792a;
    }

    /* JADX WARNING: Removed duplicated region for block: B:30:0x0059  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x005f  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x0181  */
    /* JADX WARNING: Removed duplicated region for block: B:57:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static final void p(IC.C13023e r31, androidx.compose.ui.d r32, U0.C4889m r33, int r34, int r35) {
        /*
            r0 = r31
            r1 = r34
            r2 = r35
            r3 = 2082814145(0x7c2538c1, float:3.4315204E36)
            r4 = r33
            U0.m r14 = r4.k(r3)
            r4 = r2 & 1
            if (r4 == 0) goto L_0x0016
            r4 = r1 | 6
            goto L_0x002f
        L_0x0016:
            r4 = r1 & 6
            if (r4 != 0) goto L_0x002e
            r4 = r1 & 8
            if (r4 != 0) goto L_0x0023
            boolean r4 = r14.V(r0)
            goto L_0x0027
        L_0x0023:
            boolean r4 = r14.F(r0)
        L_0x0027:
            if (r4 == 0) goto L_0x002b
            r4 = 4
            goto L_0x002c
        L_0x002b:
            r4 = 2
        L_0x002c:
            r4 = r4 | r1
            goto L_0x002f
        L_0x002e:
            r4 = r1
        L_0x002f:
            r5 = r2 & 2
            if (r5 == 0) goto L_0x0039
            r4 = r4 | 48
        L_0x0035:
            r6 = r32
        L_0x0037:
            r11 = r4
            goto L_0x004c
        L_0x0039:
            r6 = r1 & 48
            if (r6 != 0) goto L_0x0035
            r6 = r32
            boolean r7 = r14.V(r6)
            if (r7 == 0) goto L_0x0048
            r7 = 32
            goto L_0x004a
        L_0x0048:
            r7 = 16
        L_0x004a:
            r4 = r4 | r7
            goto L_0x0037
        L_0x004c:
            r4 = r11 & 19
            r7 = 18
            if (r4 != r7) goto L_0x005f
            boolean r4 = r14.l()
            if (r4 != 0) goto L_0x0059
            goto L_0x005f
        L_0x0059:
            r14.L()
            r3 = r14
            goto L_0x017b
        L_0x005f:
            if (r5 == 0) goto L_0x0065
            androidx.compose.ui.d$a r4 = androidx.compose.ui.d.f18749a
            r15 = r4
            goto L_0x0066
        L_0x0065:
            r15 = r6
        L_0x0066:
            boolean r4 = U0.C4895p.J()
            if (r4 == 0) goto L_0x0072
            r4 = -1
            java.lang.String r5 = "com.ingka.ikea.ui.pricesummary.compose.FamilySavingsSection (OrderSummaryContent.kt:280)"
            U0.C4895p.S(r3, r11, r4, r5)
        L_0x0072:
            java.lang.String r3 = "OrderSummaryTestTags_FAMILY_SAVINGS_SECTION"
            androidx.compose.ui.d r3 = androidx.compose.ui.platform.C5116k1.a(r15, r3)
            i1.c$a r4 = i1.C5437c.f24302a
            i1.c$c r4 = r4.i()
            androidx.compose.foundation.layout.d r5 = androidx.compose.foundation.layout.C5073d.f18068a
            r6 = 12
            float r6 = (float) r6
            float r6 = c2.h.B(r6)
            androidx.compose.foundation.layout.d$f r5 = r5.n(r6)
            r6 = 54
            E1.I r4 = androidx.compose.foundation.layout.G.b(r5, r4, r14, r6)
            r5 = 0
            int r6 = U0.C4883j.a(r14, r5)
            U0.y r7 = r14.s()
            androidx.compose.ui.d r3 = androidx.compose.ui.c.e(r14, r3)
            G1.g$a r8 = G1.C4504g.f6515W
            nI.a r9 = r8.a()
            U0.f r10 = r14.m()
            if (r10 != 0) goto L_0x00ad
            U0.C4883j.c()
        L_0x00ad:
            r14.I()
            boolean r10 = r14.i()
            if (r10 == 0) goto L_0x00ba
            r14.p(r9)
            goto L_0x00bd
        L_0x00ba:
            r14.t()
        L_0x00bd:
            U0.m r9 = U0.F1.a(r14)
            nI.p r10 = r8.c()
            U0.F1.c(r9, r4, r10)
            nI.p r4 = r8.e()
            U0.F1.c(r9, r7, r4)
            nI.p r4 = r8.b()
            boolean r7 = r9.i()
            if (r7 != 0) goto L_0x00e7
            java.lang.Object r7 = r9.D()
            java.lang.Integer r10 = java.lang.Integer.valueOf(r6)
            boolean r7 = kotlin.jvm.internal.C17542s.e(r7, r10)
            if (r7 != 0) goto L_0x00f5
        L_0x00e7:
            java.lang.Integer r7 = java.lang.Integer.valueOf(r6)
            r9.u(r7)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r9.w(r6, r4)
        L_0x00f5:
            nI.p r4 = r8.d()
            U0.F1.c(r9, r3, r4)
            s0.N r16 = s0.C5843N.f28726a
            u1.d$b r3 = u1.C6006d.f29827k
            int r4 = lg.C10027d.f75284o
            r6 = 6
            u1.d r3 = J1.k.b(r3, r4, r14, r6)
            u1.s r4 = u1.t.g(r3, r14, r5)
            int r3 = u1.s.f30033o
            r9 = r3 | 48
            r10 = 12
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = r14
            SC.D1.b(r4, r5, r6, r7, r8, r9, r10)
            androidx.compose.ui.d$a r17 = androidx.compose.ui.d.f18749a
            r20 = 2
            r21 = 0
            r18 = 1065353216(0x3f800000, float:1.0)
            r19 = 0
            androidx.compose.ui.d r6 = s0.C5842M.e(r16, r17, r18, r19, r20, r21)
            int r3 = IC.C13023e.f110931a
            r4 = r11 & 14
            r3 = r3 | r4
            java.lang.String r4 = r0.a(r14, r3)
            TC.b$a$b r5 = TC.C13679b.a.C2856b.f116680a
            tK.v r3 = tK.C18030v.f147664a
            int r7 = tK.C18030v.f147665b
            tK.h r3 = r3.a(r14, r7)
            long r7 = r3.f()
            S1.C$a r3 = S1.C.f13316b
            S1.C r12 = r3.a()
            r28 = 0
            r29 = 262064(0x3ffb0, float:3.6723E-40)
            r9 = 0
            r11 = 0
            r13 = 0
            r16 = 0
            r3 = r14
            r30 = r15
            r14 = r16
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r24 = 0
            r25 = 0
            r27 = 1572912(0x180030, float:2.204119E-39)
            r26 = r3
            SC.C13607l.j(r4, r5, r6, r7, r9, r11, r12, r13, r14, r16, r17, r18, r19, r21, r22, r23, r24, r25, r26, r27, r28, r29)
            r3.x()
            boolean r4 = U0.C4895p.J()
            if (r4 == 0) goto L_0x0179
            U0.C4895p.R()
        L_0x0179:
            r6 = r30
        L_0x017b:
            U0.Y0 r3 = r3.n()
            if (r3 == 0) goto L_0x0189
            RC.e r4 = new RC.e
            r4.<init>(r0, r6, r1, r2)
            r3.a(r4)
        L_0x0189:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: RC.l.p(IC.e, androidx.compose.ui.d, U0.m, int, int):void");
    }

    /* access modifiers changed from: private */
    public static final C16807N q(C13023e eVar, d dVar, int i10, int i11, C4889m mVar, int i12) {
        p(eVar, dVar, mVar, M0.a(i10 | 1), i11);
        return C16807N.f139792a;
    }

    /* JADX WARNING: Removed duplicated region for block: B:101:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0053  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0057  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0075  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x007c  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x039e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void r(RC.m r33, androidx.compose.ui.d r34, nI.C17642l<? super java.lang.String, XH.C16807N> r35, U0.C4889m r36, int r37, int r38) {
        /*
            r1 = r33
            r3 = r35
            r4 = r37
            r0 = 2
            r2 = 4
            java.lang.String r5 = "uiState"
            kotlin.jvm.internal.C17542s.j(r1, r5)
            java.lang.String r5 = "onDeleteTransaction"
            kotlin.jvm.internal.C17542s.j(r3, r5)
            r5 = 624269321(0x25359809, float:1.5750759E-16)
            r6 = r36
            U0.m r15 = r6.k(r5)
            r14 = 1
            r6 = r38 & 1
            if (r6 == 0) goto L_0x0023
            r6 = r4 | 6
            goto L_0x0033
        L_0x0023:
            r6 = r4 & 6
            if (r6 != 0) goto L_0x0032
            boolean r6 = r15.F(r1)
            if (r6 == 0) goto L_0x002f
            r6 = r2
            goto L_0x0030
        L_0x002f:
            r6 = r0
        L_0x0030:
            r6 = r6 | r4
            goto L_0x0033
        L_0x0032:
            r6 = r4
        L_0x0033:
            r0 = r38 & 2
            r13 = 16
            if (r0 == 0) goto L_0x003e
            r6 = r6 | 48
        L_0x003b:
            r7 = r34
            goto L_0x004f
        L_0x003e:
            r7 = r4 & 48
            if (r7 != 0) goto L_0x003b
            r7 = r34
            boolean r8 = r15.V(r7)
            if (r8 == 0) goto L_0x004d
            r8 = 32
            goto L_0x004e
        L_0x004d:
            r8 = r13
        L_0x004e:
            r6 = r6 | r8
        L_0x004f:
            r2 = r38 & 4
            if (r2 == 0) goto L_0x0057
            r6 = r6 | 384(0x180, float:5.38E-43)
        L_0x0055:
            r2 = r6
            goto L_0x0068
        L_0x0057:
            r2 = r4 & 384(0x180, float:5.38E-43)
            if (r2 != 0) goto L_0x0055
            boolean r2 = r15.F(r3)
            if (r2 == 0) goto L_0x0064
            r2 = 256(0x100, float:3.59E-43)
            goto L_0x0066
        L_0x0064:
            r2 = 128(0x80, float:1.794E-43)
        L_0x0066:
            r6 = r6 | r2
            goto L_0x0055
        L_0x0068:
            r6 = r2 & 147(0x93, float:2.06E-43)
            r8 = 146(0x92, float:2.05E-43)
            if (r6 != r8) goto L_0x007c
            boolean r6 = r15.l()
            if (r6 != 0) goto L_0x0075
            goto L_0x007c
        L_0x0075:
            r15.L()
            r2 = r7
            r7 = r15
            goto L_0x0398
        L_0x007c:
            if (r0 == 0) goto L_0x0081
            androidx.compose.ui.d$a r0 = androidx.compose.ui.d.f18749a
            goto L_0x0082
        L_0x0081:
            r0 = r7
        L_0x0082:
            boolean r6 = U0.C4895p.J()
            if (r6 == 0) goto L_0x008e
            r6 = -1
            java.lang.String r7 = "com.ingka.ikea.ui.pricesummary.compose.OrderSummaryContent (OrderSummaryContent.kt:133)"
            U0.C4895p.S(r5, r2, r6, r7)
        L_0x008e:
            r5 = 0
            r6 = 0
            androidx.compose.ui.d r5 = androidx.compose.foundation.layout.J.h(r0, r5, r14, r6)
            androidx.compose.foundation.layout.d r6 = androidx.compose.foundation.layout.C5073d.f18068a
            androidx.compose.foundation.layout.d$m r6 = r6.g()
            i1.c$a r7 = i1.C5437c.f24302a
            i1.c$b r7 = r7.k()
            r11 = 0
            E1.I r6 = androidx.compose.foundation.layout.C5080k.a(r6, r7, r15, r11)
            int r7 = U0.C4883j.a(r15, r11)
            U0.y r8 = r15.s()
            androidx.compose.ui.d r5 = androidx.compose.ui.c.e(r15, r5)
            G1.g$a r9 = G1.C4504g.f6515W
            nI.a r10 = r9.a()
            U0.f r12 = r15.m()
            if (r12 != 0) goto L_0x00c0
            U0.C4883j.c()
        L_0x00c0:
            r15.I()
            boolean r12 = r15.i()
            if (r12 == 0) goto L_0x00cd
            r15.p(r10)
            goto L_0x00d0
        L_0x00cd:
            r15.t()
        L_0x00d0:
            U0.m r10 = U0.F1.a(r15)
            nI.p r12 = r9.c()
            U0.F1.c(r10, r6, r12)
            nI.p r6 = r9.e()
            U0.F1.c(r10, r8, r6)
            nI.p r6 = r9.b()
            boolean r8 = r10.i()
            if (r8 != 0) goto L_0x00fa
            java.lang.Object r8 = r10.D()
            java.lang.Integer r12 = java.lang.Integer.valueOf(r7)
            boolean r8 = kotlin.jvm.internal.C17542s.e(r8, r12)
            if (r8 != 0) goto L_0x0108
        L_0x00fa:
            java.lang.Integer r8 = java.lang.Integer.valueOf(r7)
            r10.u(r8)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r10.w(r7, r6)
        L_0x0108:
            nI.p r6 = r9.d()
            U0.F1.c(r10, r5, r6)
            s0.h r5 = s0.C5862h.f28810a
            IC.e r5 = r33.j()
            r6 = 253676050(0xf1eca12, float:7.828919E-30)
            r15.W(r6)
            r12 = 24
            if (r5 != 0) goto L_0x0125
            r5 = r13
            r32 = r14
            r36 = r15
            goto L_0x0180
        L_0x0125:
            androidx.compose.ui.d$a r5 = androidx.compose.ui.d.f18749a
            java.lang.String r6 = "OrderSummaryTestTags_TITLE"
            androidx.compose.ui.d r16 = androidx.compose.ui.platform.C5116k1.a(r5, r6)
            float r5 = (float) r12
            float r20 = c2.h.B(r5)
            r21 = 7
            r22 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            androidx.compose.ui.d r8 = androidx.compose.foundation.layout.D.m(r16, r17, r18, r19, r20, r21, r22)
            IC.e r6 = r33.j()
            TC.b$b$c r7 = TC.C13679b.C2857b.c.f116685a
            int r5 = IC.C13023e.f110931a
            r5 = r5 | 432(0x1b0, float:6.05E-43)
            r29 = r5
            r30 = 0
            r31 = 262136(0x3fff8, float:3.67331E-40)
            r9 = 0
            r16 = 0
            r5 = r11
            r11 = r16
            r16 = 0
            r5 = r13
            r13 = r16
            r32 = r14
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
            r28 = r36
            SC.C13607l.i(r6, r7, r8, r9, r11, r13, r14, r15, r16, r18, r19, r20, r21, r23, r24, r25, r26, r27, r28, r29, r30, r31)
            XH.N r6 = XH.C16807N.f139792a
        L_0x0180:
            r36.P()
            androidx.compose.ui.d$a r14 = androidx.compose.ui.d.f18749a
            java.lang.String r6 = "OrderSummaryTestTags_SUB_PRODUCTS"
            androidx.compose.ui.d r7 = androidx.compose.ui.platform.C5116k1.a(r14, r6)
            RC.m$c r6 = r33.f()
            r10 = 48
            r11 = 4
            r8 = 0
            r9 = r36
            w(r6, r7, r8, r9, r10, r11)
            RC.m$c r6 = r33.b()
            r7 = 253692042(0xf1f088a, float:7.84095E-30)
            r15 = r36
            r15.W(r7)
            if (r6 != 0) goto L_0x01a7
            goto L_0x01ca
        L_0x01a7:
            java.lang.String r7 = "OrderSummaryTestTags_DELIVERY"
            androidx.compose.ui.d r16 = androidx.compose.ui.platform.C5116k1.a(r14, r7)
            float r7 = (float) r5
            float r18 = c2.h.B(r7)
            r21 = 13
            r22 = 0
            r17 = 0
            r19 = 0
            r20 = 0
            androidx.compose.ui.d r7 = androidx.compose.foundation.layout.D.m(r16, r17, r18, r19, r20, r21, r22)
            r10 = 48
            r11 = 4
            r8 = 0
            r9 = r15
            w(r6, r7, r8, r9, r10, r11)
            XH.N r6 = XH.C16807N.f139792a
        L_0x01ca:
            r15.P()
            RC.m$c r6 = r33.h()
            r7 = 253701066(0xf1f2bca, float:7.847739E-30)
            r15.W(r7)
            if (r6 != 0) goto L_0x01da
            goto L_0x01fd
        L_0x01da:
            java.lang.String r7 = "OrderSummaryTestTags_SERVICES"
            androidx.compose.ui.d r16 = androidx.compose.ui.platform.C5116k1.a(r14, r7)
            float r7 = (float) r5
            float r18 = c2.h.B(r7)
            r21 = 13
            r22 = 0
            r17 = 0
            r19 = 0
            r20 = 0
            androidx.compose.ui.d r7 = androidx.compose.foundation.layout.D.m(r16, r17, r18, r19, r20, r21, r22)
            r10 = 48
            r11 = 4
            r8 = 0
            r9 = r15
            w(r6, r7, r8, r9, r10, r11)
            XH.N r6 = XH.C16807N.f139792a
        L_0x01fd:
            r15.P()
            RC.m$c r6 = r33.g()
            r7 = 253710149(0xf1f4f45, float:7.854572E-30)
            r15.W(r7)
            if (r6 != 0) goto L_0x020d
            goto L_0x023d
        L_0x020d:
            java.lang.String r7 = "OrderSummaryTestTags_SAVINGS"
            androidx.compose.ui.d r16 = androidx.compose.ui.platform.C5116k1.a(r14, r7)
            float r7 = (float) r5
            float r18 = c2.h.B(r7)
            r21 = 13
            r22 = 0
            r17 = 0
            r19 = 0
            r20 = 0
            androidx.compose.ui.d r7 = androidx.compose.foundation.layout.D.m(r16, r17, r18, r19, r20, r21, r22)
            RC.m$c r8 = r33.g()
            IC.e r8 = r8.b()
            if (r8 == 0) goto L_0x0233
            r8 = r32
            goto L_0x0234
        L_0x0233:
            r8 = 0
        L_0x0234:
            r10 = 48
            r11 = 0
            r9 = r15
            w(r6, r7, r8, r9, r10, r11)
            XH.N r6 = XH.C16807N.f139792a
        L_0x023d:
            r15.P()
            RC.m$c r6 = r33.i()
            r7 = 253722661(0xf1f8025, float:7.863985E-30)
            r15.W(r7)
            if (r6 != 0) goto L_0x024d
            goto L_0x0270
        L_0x024d:
            java.lang.String r7 = "OrderSummaryTestTags_TAX"
            androidx.compose.ui.d r16 = androidx.compose.ui.platform.C5116k1.a(r14, r7)
            float r7 = (float) r5
            float r18 = c2.h.B(r7)
            r21 = 13
            r22 = 0
            r17 = 0
            r19 = 0
            r20 = 0
            androidx.compose.ui.d r7 = androidx.compose.foundation.layout.D.m(r16, r17, r18, r19, r20, r21, r22)
            r10 = 48
            r11 = 4
            r8 = 0
            r9 = r15
            w(r6, r7, r8, r9, r10, r11)
            XH.N r6 = XH.C16807N.f139792a
        L_0x0270:
            r15.P()
            RC.m$d r6 = r33.k()
            r7 = 0
            z(r6, r15, r7)
            RC.m$c r6 = r33.l()
            r7 = 253735181(0xf1fb10d, float:7.873404E-30)
            r15.W(r7)
            if (r6 != 0) goto L_0x0288
            goto L_0x02ad
        L_0x0288:
            java.lang.String r7 = "OrderSummaryTestTags_TRANSACTIONS"
            androidx.compose.ui.d r16 = androidx.compose.ui.platform.C5116k1.a(r14, r7)
            r7 = 8
            float r7 = (float) r7
            float r18 = c2.h.B(r7)
            r21 = 13
            r22 = 0
            r17 = 0
            r19 = 0
            r20 = 0
            androidx.compose.ui.d r7 = androidx.compose.foundation.layout.D.m(r16, r17, r18, r19, r20, r21, r22)
            r10 = 48
            r11 = 4
            r8 = 0
            r9 = r15
            w(r6, r7, r8, r9, r10, r11)
            XH.N r6 = XH.C16807N.f139792a
        L_0x02ad:
            r15.P()
            IC.e r6 = r33.d()
            r7 = 253745027(0xf1fd783, float:7.880811E-30)
            r15.W(r7)
            if (r6 != 0) goto L_0x02bf
            r5 = 24
            goto L_0x02df
        L_0x02bf:
            r13 = 24
            float r7 = (float) r13
            float r9 = c2.h.B(r7)
            r12 = 13
            r16 = 0
            r8 = 0
            r10 = 0
            r11 = 0
            r7 = r14
            r5 = r13
            r13 = r16
            androidx.compose.ui.d r7 = androidx.compose.foundation.layout.D.m(r7, r8, r9, r10, r11, r12, r13)
            int r8 = IC.C13023e.f110931a
            r8 = r8 | 48
            r9 = 0
            p(r6, r7, r15, r8, r9)
            XH.N r6 = XH.C16807N.f139792a
        L_0x02df:
            r15.P()
            RC.m$b r6 = r33.e()
            r7 = 253751590(0xf1ff126, float:7.885749E-30)
            r15.W(r7)
            if (r6 != 0) goto L_0x02ef
            goto L_0x0309
        L_0x02ef:
            float r5 = (float) r5
            float r9 = c2.h.B(r5)
            r12 = 13
            r13 = 0
            r8 = 0
            r10 = 0
            r11 = 0
            r7 = r14
            androidx.compose.ui.d r5 = androidx.compose.foundation.layout.D.m(r7, r8, r9, r10, r11, r12, r13)
            int r7 = IC.C13023e.f110931a
            r7 = r7 | 48
            r8 = 0
            n(r6, r5, r15, r7, r8)
            XH.N r5 = XH.C16807N.f139792a
        L_0x0309:
            r15.P()
            IC.e r6 = r33.c()
            r5 = 253758014(0xf200a3e, float:7.890582E-30)
            r15.W(r5)
            if (r6 != 0) goto L_0x031b
            r36 = r15
            goto L_0x036d
        L_0x031b:
            java.lang.String r5 = "OrderSummaryTestTags_DISCLAIMER"
            androidx.compose.ui.d r7 = androidx.compose.ui.platform.C5116k1.a(r14, r5)
            r5 = 16
            float r5 = (float) r5
            float r9 = c2.h.B(r5)
            r12 = 13
            r13 = 0
            r8 = 0
            r10 = 0
            r11 = 0
            androidx.compose.ui.d r8 = androidx.compose.foundation.layout.D.m(r7, r8, r9, r10, r11, r12, r13)
            tK.v r5 = tK.C18030v.f147664a
            int r7 = tK.C18030v.f147665b
            tK.h r5 = r5.a(r15, r7)
            long r9 = r5.I0()
            TC.b$a$b r7 = TC.C13679b.a.C2856b.f116680a
            int r5 = IC.C13023e.f110931a
            r5 = r5 | 432(0x1b0, float:6.05E-43)
            r29 = r5
            r30 = 0
            r31 = 262128(0x3fff0, float:3.6732E-40)
            r11 = 0
            r14 = 0
            r5 = 0
            r36 = r15
            r15 = r5
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
            r28 = r36
            SC.C13607l.i(r6, r7, r8, r9, r11, r13, r14, r15, r16, r18, r19, r20, r21, r23, r24, r25, r26, r27, r28, r29, r30, r31)
            XH.N r5 = XH.C16807N.f139792a
        L_0x036d:
            r36.P()
            RC.m$a r5 = r33.a()
            r6 = 253770139(0xf20399b, float:7.8997035E-30)
            r7 = r36
            r7.W(r6)
            if (r5 != 0) goto L_0x037f
            goto L_0x0388
        L_0x037f:
            int r2 = r2 >> 3
            r2 = r2 & 112(0x70, float:1.57E-43)
            l(r5, r3, r7, r2)
            XH.N r2 = XH.C16807N.f139792a
        L_0x0388:
            r7.P()
            r7.x()
            boolean r2 = U0.C4895p.J()
            if (r2 == 0) goto L_0x0397
            U0.C4895p.R()
        L_0x0397:
            r2 = r0
        L_0x0398:
            U0.Y0 r6 = r7.n()
            if (r6 == 0) goto L_0x03af
            RC.a r7 = new RC.a
            r0 = r7
            r1 = r33
            r3 = r35
            r4 = r37
            r5 = r38
            r0.<init>(r1, r2, r3, r4, r5)
            r6.a(r7)
        L_0x03af:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: RC.l.r(RC.m, androidx.compose.ui.d, nI.l, U0.m, int, int):void");
    }

    /* access modifiers changed from: private */
    public static final C16807N s(m mVar, d dVar, C17642l lVar, int i10, int i11, C4889m mVar2, int i12) {
        r(mVar, dVar, lVar, mVar2, M0.a(i10 | 1), i11);
        return C16807N.f139792a;
    }

    /* JADX WARNING: Removed duplicated region for block: B:50:0x008c  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x0094  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x0208  */
    /* JADX WARNING: Removed duplicated region for block: B:84:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static final void t(IC.C13023e r33, java.lang.String r34, TC.C13679b r35, androidx.compose.ui.d r36, U0.C4889m r37, int r38, int r39) {
        /*
            r1 = r33
            r0 = r34
            r3 = r38
            r2 = -1532673388(0xffffffffa4a54294, float:-7.167013E-17)
            r4 = r37
            U0.m r5 = r4.k(r2)
            r4 = r39 & 1
            if (r4 == 0) goto L_0x0016
            r4 = r3 | 6
            goto L_0x002f
        L_0x0016:
            r4 = r3 & 6
            if (r4 != 0) goto L_0x002e
            r4 = r3 & 8
            if (r4 != 0) goto L_0x0023
            boolean r4 = r5.V(r1)
            goto L_0x0027
        L_0x0023:
            boolean r4 = r5.F(r1)
        L_0x0027:
            if (r4 == 0) goto L_0x002b
            r4 = 4
            goto L_0x002c
        L_0x002b:
            r4 = 2
        L_0x002c:
            r4 = r4 | r3
            goto L_0x002f
        L_0x002e:
            r4 = r3
        L_0x002f:
            r6 = r39 & 2
            r14 = 16
            if (r6 == 0) goto L_0x0038
            r4 = r4 | 48
            goto L_0x0047
        L_0x0038:
            r6 = r3 & 48
            if (r6 != 0) goto L_0x0047
            boolean r6 = r5.V(r0)
            if (r6 == 0) goto L_0x0045
            r6 = 32
            goto L_0x0046
        L_0x0045:
            r6 = r14
        L_0x0046:
            r4 = r4 | r6
        L_0x0047:
            r6 = r39 & 4
            if (r6 == 0) goto L_0x0050
            r4 = r4 | 384(0x180, float:5.38E-43)
            r15 = r35
            goto L_0x0062
        L_0x0050:
            r6 = r3 & 384(0x180, float:5.38E-43)
            r15 = r35
            if (r6 != 0) goto L_0x0062
            boolean r6 = r5.V(r15)
            if (r6 == 0) goto L_0x005f
            r6 = 256(0x100, float:3.59E-43)
            goto L_0x0061
        L_0x005f:
            r6 = 128(0x80, float:1.794E-43)
        L_0x0061:
            r4 = r4 | r6
        L_0x0062:
            r6 = r39 & 8
            if (r6 == 0) goto L_0x006c
            r4 = r4 | 3072(0xc00, float:4.305E-42)
        L_0x0068:
            r7 = r36
        L_0x006a:
            r8 = r4
            goto L_0x007f
        L_0x006c:
            r7 = r3 & 3072(0xc00, float:4.305E-42)
            if (r7 != 0) goto L_0x0068
            r7 = r36
            boolean r8 = r5.V(r7)
            if (r8 == 0) goto L_0x007b
            r8 = 2048(0x800, float:2.87E-42)
            goto L_0x007d
        L_0x007b:
            r8 = 1024(0x400, float:1.435E-42)
        L_0x007d:
            r4 = r4 | r8
            goto L_0x006a
        L_0x007f:
            r4 = r8 & 1171(0x493, float:1.641E-42)
            r9 = 1170(0x492, float:1.64E-42)
            if (r4 != r9) goto L_0x0094
            boolean r4 = r5.l()
            if (r4 != 0) goto L_0x008c
            goto L_0x0094
        L_0x008c:
            r5.L()
            r28 = r5
            r4 = r7
            goto L_0x0202
        L_0x0094:
            if (r6 == 0) goto L_0x009a
            androidx.compose.ui.d$a r4 = androidx.compose.ui.d.f18749a
            r13 = r4
            goto L_0x009b
        L_0x009a:
            r13 = r7
        L_0x009b:
            boolean r4 = U0.C4895p.J()
            if (r4 == 0) goto L_0x00a7
            r4 = -1
            java.lang.String r6 = "com.ingka.ikea.ui.pricesummary.compose.OrderSummaryPriceRow (OrderSummaryContent.kt:385)"
            U0.C4895p.S(r2, r8, r4, r6)
        L_0x00a7:
            r2 = -1385685429(0xffffffffad681e4b, float:-1.31943996E-11)
            r5.W(r2)
            java.lang.Object r2 = r5.D()
            U0.m$a r4 = U0.C4889m.f14007a
            java.lang.Object r4 = r4.a()
            if (r2 != r4) goto L_0x00c1
            RC.k r2 = new RC.k
            r2.<init>()
            r5.u(r2)
        L_0x00c1:
            nI.l r2 = (nI.C17642l) r2
            r5.P()
            r4 = 1
            androidx.compose.ui.d r2 = L1.o.c(r13, r4, r2)
            r6 = 0
            r7 = 0
            androidx.compose.ui.d r2 = androidx.compose.foundation.layout.J.h(r2, r6, r4, r7)
            androidx.compose.foundation.layout.d r4 = androidx.compose.foundation.layout.C5073d.f18068a
            androidx.compose.foundation.layout.d$f r4 = r4.d()
            i1.c$a r6 = i1.C5437c.f24302a
            i1.c$c r6 = r6.l()
            r7 = 54
            E1.I r4 = androidx.compose.foundation.layout.G.b(r4, r6, r5, r7)
            r6 = 0
            int r6 = U0.C4883j.a(r5, r6)
            U0.y r7 = r5.s()
            androidx.compose.ui.d r2 = androidx.compose.ui.c.e(r5, r2)
            G1.g$a r9 = G1.C4504g.f6515W
            nI.a r10 = r9.a()
            U0.f r11 = r5.m()
            if (r11 != 0) goto L_0x00ff
            U0.C4883j.c()
        L_0x00ff:
            r5.I()
            boolean r11 = r5.i()
            if (r11 == 0) goto L_0x010c
            r5.p(r10)
            goto L_0x010f
        L_0x010c:
            r5.t()
        L_0x010f:
            U0.m r10 = U0.F1.a(r5)
            nI.p r11 = r9.c()
            U0.F1.c(r10, r4, r11)
            nI.p r4 = r9.e()
            U0.F1.c(r10, r7, r4)
            nI.p r4 = r9.b()
            boolean r7 = r10.i()
            if (r7 != 0) goto L_0x0139
            java.lang.Object r7 = r10.D()
            java.lang.Integer r11 = java.lang.Integer.valueOf(r6)
            boolean r7 = kotlin.jvm.internal.C17542s.e(r7, r11)
            if (r7 != 0) goto L_0x0147
        L_0x0139:
            java.lang.Integer r7 = java.lang.Integer.valueOf(r6)
            r10.u(r7)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r10.w(r6, r4)
        L_0x0147:
            nI.p r4 = r9.d()
            U0.F1.c(r10, r2, r4)
            s0.N r16 = s0.C5843N.f28726a
            androidx.compose.ui.d$a r2 = androidx.compose.ui.d.f18749a
            r20 = 2
            r21 = 0
            r18 = 1065353216(0x3f800000, float:1.0)
            r19 = 0
            r17 = r2
            androidx.compose.ui.d r6 = s0.C5842M.e(r16, r17, r18, r19, r20, r21)
            int r4 = IC.C13023e.f110931a
            r7 = r8 & 14
            r4 = r4 | r7
            java.lang.String r4 = r1.a(r5, r4)
            int r30 = r8 >> 3
            r31 = r30 & 112(0x70, float:1.57E-43)
            r27 = r31
            r28 = 0
            r29 = 262136(0x3fff8, float:3.67331E-40)
            r7 = 0
            r9 = 0
            r11 = 0
            r12 = 0
            r16 = 0
            r32 = r13
            r13 = r16
            r16 = 0
            r14 = r16
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r24 = 0
            r25 = 0
            r36 = r5
            r5 = r35
            r26 = r36
            SC.C13607l.j(r4, r5, r6, r7, r9, r11, r12, r13, r14, r16, r17, r18, r19, r21, r22, r23, r24, r25, r26, r27, r28, r29)
            r4 = 969994260(0x39d0f014, float:3.9851724E-4)
            r15 = r36
            r15.W(r4)
            if (r0 != 0) goto L_0x01ac
            r28 = r15
            goto L_0x01f1
        L_0x01ac:
            r4 = 16
            float r4 = (float) r4
            float r18 = c2.h.B(r4)
            r22 = 14
            r23 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r17 = r2
            androidx.compose.ui.d r4 = androidx.compose.foundation.layout.D.m(r17, r18, r19, r20, r21, r22, r23)
            r2 = r30 & 14
            r2 = r2 | 384(0x180, float:5.38E-43)
            r25 = r2 | r31
            r26 = 0
            r27 = 262136(0x3fff8, float:3.67331E-40)
            r5 = 0
            r7 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r14 = 0
            r2 = 0
            r28 = r15
            r15 = r2
            r16 = 0
            r17 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r2 = r34
            r3 = r35
            r24 = r28
            SC.C13607l.j(r2, r3, r4, r5, r7, r9, r10, r11, r12, r14, r15, r16, r17, r19, r20, r21, r22, r23, r24, r25, r26, r27)
        L_0x01f1:
            r28.P()
            r28.x()
            boolean r2 = U0.C4895p.J()
            if (r2 == 0) goto L_0x0200
            U0.C4895p.R()
        L_0x0200:
            r4 = r32
        L_0x0202:
            U0.Y0 r7 = r28.n()
            if (r7 == 0) goto L_0x021b
            RC.b r8 = new RC.b
            r0 = r8
            r1 = r33
            r2 = r34
            r3 = r35
            r5 = r38
            r6 = r39
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r7.a(r8)
        L_0x021b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: RC.l.t(IC.e, java.lang.String, TC.b, androidx.compose.ui.d, U0.m, int, int):void");
    }

    /* access modifiers changed from: private */
    public static final C16807N u(x xVar) {
        C17542s.j(xVar, "$this$semantics");
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N v(C13023e eVar, String str, C13679b bVar, d dVar, int i10, int i11, C4889m mVar, int i12) {
        t(eVar, str, bVar, dVar, mVar, M0.a(i10 | 1), i11);
        return C16807N.f139792a;
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x0049  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x004e  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x006d  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0073  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x01d6  */
    /* JADX WARNING: Removed duplicated region for block: B:92:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static final void w(RC.m.c r23, androidx.compose.ui.d r24, boolean r25, U0.C4889m r26, int r27, int r28) {
        /*
            r4 = r27
            r0 = 2
            r1 = -1291553063(0xffffffffb30476d9, float:-3.0841736E-8)
            r2 = r26
            U0.m r2 = r2.k(r1)
            r3 = 1
            r5 = r28 & 1
            r6 = 4
            if (r5 == 0) goto L_0x0017
            r5 = r4 | 6
            r12 = r23
            goto L_0x0029
        L_0x0017:
            r5 = r4 & 6
            r12 = r23
            if (r5 != 0) goto L_0x0028
            boolean r5 = r2.F(r12)
            if (r5 == 0) goto L_0x0025
            r5 = r6
            goto L_0x0026
        L_0x0025:
            r5 = r0
        L_0x0026:
            r5 = r5 | r4
            goto L_0x0029
        L_0x0028:
            r5 = r4
        L_0x0029:
            r0 = r28 & 2
            r13 = 16
            if (r0 == 0) goto L_0x0034
            r5 = r5 | 48
        L_0x0031:
            r7 = r24
            goto L_0x0045
        L_0x0034:
            r7 = r4 & 48
            if (r7 != 0) goto L_0x0031
            r7 = r24
            boolean r8 = r2.V(r7)
            if (r8 == 0) goto L_0x0043
            r8 = 32
            goto L_0x0044
        L_0x0043:
            r8 = r13
        L_0x0044:
            r5 = r5 | r8
        L_0x0045:
            r8 = r28 & 4
            if (r8 == 0) goto L_0x004e
            r5 = r5 | 384(0x180, float:5.38E-43)
        L_0x004b:
            r9 = r25
            goto L_0x0060
        L_0x004e:
            r9 = r4 & 384(0x180, float:5.38E-43)
            if (r9 != 0) goto L_0x004b
            r9 = r25
            boolean r10 = r2.b(r9)
            if (r10 == 0) goto L_0x005d
            r10 = 256(0x100, float:3.59E-43)
            goto L_0x005f
        L_0x005d:
            r10 = 128(0x80, float:1.794E-43)
        L_0x005f:
            r5 = r5 | r10
        L_0x0060:
            r10 = r5 & 147(0x93, float:2.06E-43)
            r11 = 146(0x92, float:2.05E-43)
            if (r10 != r11) goto L_0x0073
            boolean r10 = r2.l()
            if (r10 != 0) goto L_0x006d
            goto L_0x0073
        L_0x006d:
            r2.L()
            r3 = r9
            goto L_0x01d0
        L_0x0073:
            if (r0 == 0) goto L_0x0078
            androidx.compose.ui.d$a r0 = androidx.compose.ui.d.f18749a
            goto L_0x0079
        L_0x0078:
            r0 = r7
        L_0x0079:
            r14 = 0
            if (r8 == 0) goto L_0x007e
            r15 = r14
            goto L_0x007f
        L_0x007e:
            r15 = r9
        L_0x007f:
            boolean r7 = U0.C4895p.J()
            if (r7 == 0) goto L_0x008b
            r7 = -1
            java.lang.String r8 = "com.ingka.ikea.ui.pricesummary.compose.OrderSummaryPriceSection (OrderSummaryContent.kt:346)"
            U0.C4895p.S(r1, r5, r7, r8)
        L_0x008b:
            androidx.compose.foundation.layout.d r1 = androidx.compose.foundation.layout.C5073d.f18068a
            androidx.compose.foundation.layout.d$m r1 = r1.g()
            i1.c$a r5 = i1.C5437c.f24302a
            i1.c$b r5 = r5.k()
            E1.I r1 = androidx.compose.foundation.layout.C5080k.a(r1, r5, r2, r14)
            int r5 = U0.C4883j.a(r2, r14)
            U0.y r7 = r2.s()
            androidx.compose.ui.d r8 = androidx.compose.ui.c.e(r2, r0)
            G1.g$a r9 = G1.C4504g.f6515W
            nI.a r10 = r9.a()
            U0.f r11 = r2.m()
            if (r11 != 0) goto L_0x00b6
            U0.C4883j.c()
        L_0x00b6:
            r2.I()
            boolean r11 = r2.i()
            if (r11 == 0) goto L_0x00c3
            r2.p(r10)
            goto L_0x00c6
        L_0x00c3:
            r2.t()
        L_0x00c6:
            U0.m r10 = U0.F1.a(r2)
            nI.p r11 = r9.c()
            U0.F1.c(r10, r1, r11)
            nI.p r1 = r9.e()
            U0.F1.c(r10, r7, r1)
            nI.p r1 = r9.b()
            boolean r7 = r10.i()
            if (r7 != 0) goto L_0x00f0
            java.lang.Object r7 = r10.D()
            java.lang.Integer r11 = java.lang.Integer.valueOf(r5)
            boolean r7 = kotlin.jvm.internal.C17542s.e(r7, r11)
            if (r7 != 0) goto L_0x00fe
        L_0x00f0:
            java.lang.Integer r7 = java.lang.Integer.valueOf(r5)
            r10.u(r7)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r10.w(r5, r1)
        L_0x00fe:
            nI.p r1 = r9.d()
            U0.F1.c(r10, r8, r1)
            s0.h r1 = s0.C5862h.f28810a
            IC.e r5 = r23.b()
            r1 = 2125347872(0x7eae3c20, float:1.1579893E38)
            r2.W(r1)
            if (r5 != 0) goto L_0x0114
            goto L_0x015d
        L_0x0114:
            java.lang.String r1 = r23.c()
            TC.b$b$f r7 = TC.C13679b.C2857b.f.f116688a
            androidx.compose.ui.d$a r16 = androidx.compose.ui.d.f18749a
            float r6 = (float) r6
            float r20 = c2.h.B(r6)
            r21 = 7
            r22 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            androidx.compose.ui.d r6 = androidx.compose.foundation.layout.D.m(r16, r17, r18, r19, r20, r21, r22)
            r8 = 1872177503(0x6f97295f, float:9.35645E28)
            r2.W(r8)
            java.lang.Object r8 = r2.D()
            U0.m$a r9 = U0.C4889m.f14007a
            java.lang.Object r9 = r9.a()
            if (r8 != r9) goto L_0x0149
            RC.g r8 = new RC.g
            r8.<init>()
            r2.u(r8)
        L_0x0149:
            nI.l r8 = (nI.C17642l) r8
            r2.P()
            r9 = 0
            androidx.compose.ui.d r8 = L1.o.d(r6, r14, r8, r3, r9)
            int r6 = IC.C13023e.f110931a
            r10 = r6 | 384(0x180, float:5.38E-43)
            r11 = 0
            r6 = r1
            r9 = r2
            t(r5, r6, r7, r8, r9, r10, r11)
        L_0x015d:
            r2.P()
            if (r15 == 0) goto L_0x0168
            float r1 = (float) r13
        L_0x0163:
            float r1 = c2.h.B(r1)
            goto L_0x016a
        L_0x0168:
            float r1 = (float) r14
            goto L_0x0163
        L_0x016a:
            r5 = 2125360399(0x7eae6d0f, float:1.1592597E38)
            r2.W(r5)
            java.util.List r5 = r23.a()
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            java.util.Iterator r13 = r5.iterator()
            r5 = r14
        L_0x017b:
            boolean r6 = r13.hasNext()
            if (r6 == 0) goto L_0x01bf
            java.lang.Object r6 = r13.next()
            int r16 = r5 + 1
            if (r5 >= 0) goto L_0x018c
            YH.C16877v.x()
        L_0x018c:
            r17 = r6
            RC.m$c$a r17 = (RC.m.c.a) r17
            if (r5 != 0) goto L_0x0199
            float r5 = (float) r14
        L_0x0193:
            float r5 = c2.h.B(r5)
            r7 = r5
            goto L_0x019d
        L_0x0199:
            r5 = 8
            float r5 = (float) r5
            goto L_0x0193
        L_0x019d:
            androidx.compose.ui.d$a r5 = androidx.compose.ui.d.f18749a
            r10 = 12
            r11 = 0
            r8 = 0
            r9 = 0
            r6 = r1
            androidx.compose.ui.d r8 = androidx.compose.foundation.layout.D.m(r5, r6, r7, r8, r9, r10, r11)
            IC.e r5 = r17.a()
            java.lang.String r6 = r17.b()
            TC.b$a$b r7 = TC.C13679b.a.C2856b.f116680a
            int r9 = IC.C13023e.f110931a
            r10 = r9 | 384(0x180, float:5.38E-43)
            r11 = 0
            r9 = r2
            t(r5, r6, r7, r8, r9, r10, r11)
            r5 = r16
            goto L_0x017b
        L_0x01bf:
            r2.P()
            r2.x()
            boolean r1 = U0.C4895p.J()
            if (r1 == 0) goto L_0x01ce
            U0.C4895p.R()
        L_0x01ce:
            r7 = r0
            r3 = r15
        L_0x01d0:
            U0.Y0 r6 = r2.n()
            if (r6 == 0) goto L_0x01e6
            RC.h r8 = new RC.h
            r0 = r8
            r1 = r23
            r2 = r7
            r4 = r27
            r5 = r28
            r0.<init>(r1, r2, r3, r4, r5)
            r6.a(r8)
        L_0x01e6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: RC.l.w(RC.m$c, androidx.compose.ui.d, boolean, U0.m, int, int):void");
    }

    /* access modifiers changed from: private */
    public static final C16807N x(x xVar) {
        C17542s.j(xVar, "$this$semantics");
        v.v(xVar);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N y(m.c cVar, d dVar, boolean z10, int i10, int i11, C4889m mVar, int i12) {
        w(cVar, dVar, z10, mVar, M0.a(i10 | 1), i11);
        return C16807N.f139792a;
    }

    private static final void z(m.d dVar, C4889m mVar, int i10) {
        int i11;
        C4889m k10 = mVar.k(-1820864368);
        if ((i10 & 6) == 0) {
            i11 = (k10.F(dVar) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i11 & 3) != 2 || !k10.l()) {
            if (C4895p.J()) {
                C4895p.S(-1820864368, i11, -1, "com.ingka.ikea.ui.pricesummary.compose.TotalPriceContent (OrderSummaryContent.kt:248)");
            }
            d.a aVar = d.f18749a;
            I a10 = C5080k.a(C5073d.f18068a.g(), C5437c.f24302a.k(), k10, 0);
            int a11 = C4883j.a(k10, 0);
            C4912y s10 = k10.s();
            d e10 = c.e(k10, aVar);
            C4504g.a aVar2 = C4504g.f6515W;
            C17631a<C4504g> a12 = aVar2.a();
            if (k10.m() == null) {
                C4883j.c();
            }
            k10.I();
            if (k10.i()) {
                k10.p(a12);
            } else {
                k10.t();
            }
            C4889m a13 = F1.a(k10);
            F1.c(a13, a10, aVar2.c());
            F1.c(a13, s10, aVar2.e());
            p<C4504g, Integer, C16807N> b10 = aVar2.b();
            if (a13.i() || !C17542s.e(a13.D(), Integer.valueOf(a11))) {
                a13.u(Integer.valueOf(a11));
                a13.w(Integer.valueOf(a11), b10);
            }
            F1.c(a13, e10, aVar2.d());
            C5862h hVar = C5862h.f28810a;
            C13643u0.c(D.k(aVar, 0.0f, h.B((float) 24), 1, (Object) null), h.B((float) 2), C18030v.f147664a.a(k10, C18030v.f147665b).p0(), k10, 54, 0);
            v.n(dVar.a().a(k10, C13023e.f110931a), dVar.b(), C5116k1.a(aVar, "OrderSummaryTestTags_TOTAL_PRICE_TAG"), S1.Medium, (String) null, k10, 3456, 16);
            k10.W(1080394274);
            w(new m.c((C13023e) null, (String) null, dVar.c(), 2, (DefaultConstructorMarker) null), D.m(C5116k1.a(aVar, "OrderSummaryTestTags_TOTAL_PRICE_TAX_SECTION_TAG"), 0.0f, h.B((float) 8), 0.0f, 0.0f, 13, (Object) null), false, k10, 48, 4);
            k10.P();
            k10.x();
            if (C4895p.J()) {
                C4895p.R();
            }
        } else {
            k10.L();
        }
        Y0 n10 = k10.n();
        if (n10 != null) {
            n10.a(new c(dVar, i10));
        }
    }
}
