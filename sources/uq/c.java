package Uq;

import U0.C4889m;
import U0.C4895p;
import U0.M0;
import U0.Y0;
import XH.C16807N;
import XH.t;
import androidx.compose.ui.d;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kr.h;
import nI.C17631a;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a3\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0001¢\u0006\u0004\b\u0006\u0010\u0007\u001a=\u0010\f\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\b2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u000b\u001a\u00020\nH\u0001¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lkr/h;", "uiState", "Lkotlin/Function0;", "LXH/N;", "onCloseClicked", "onLaterClicked", "c", "(Lkr/h;LnI/a;LnI/a;LU0/m;I)V", "Lkr/h$c;", "model", "Landroidx/compose/ui/d;", "modifier", "e", "(Lkr/h$c;LnI/a;LnI/a;Landroidx/compose/ui/d;LU0/m;II)V", "familyrewards-implementation_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class c {
    public static final void c(h hVar, C17631a<C16807N> aVar, C17631a<C16807N> aVar2, C4889m mVar, int i10) {
        int i11;
        C17542s.j(hVar, "uiState");
        C17542s.j(aVar, "onCloseClicked");
        C17542s.j(aVar2, "onLaterClicked");
        C4889m k10 = mVar.k(-206433674);
        if ((i10 & 6) == 0) {
            i11 = ((i10 & 8) == 0 ? k10.V(hVar) : k10.F(hVar) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= k10.F(aVar) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= k10.F(aVar2) ? 256 : 128;
        }
        if ((i11 & 147) != 146 || !k10.l()) {
            if (C4895p.J()) {
                C4895p.S(-206433674, i11, -1, "com.ingka.ikea.familyrewards.implementation.compose.bottomsheet.RewardBottomSheet (RewardBottomSheet.kt:37)");
            }
            if (!(hVar instanceof h.a) && !(hVar instanceof h.d)) {
                if (hVar instanceof h.c) {
                    e((h.c) hVar, aVar, aVar2, (d) null, k10, i11 & 1008, 8);
                } else {
                    throw new t();
                }
            }
            if (C4895p.J()) {
                C4895p.R();
            }
        } else {
            k10.L();
        }
        Y0 n10 = k10.n();
        if (n10 != null) {
            n10.a(new a(hVar, aVar, aVar2, i10));
        }
    }

    /* access modifiers changed from: private */
    public static final C16807N d(h hVar, C17631a aVar, C17631a aVar2, int i10, C4889m mVar, int i11) {
        c(hVar, aVar, aVar2, mVar, M0.a(i10 | 1));
        return C16807N.f139792a;
    }

    /* JADX WARNING: Removed duplicated region for block: B:50:0x0098  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00a0  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x020f  */
    /* JADX WARNING: Removed duplicated region for block: B:94:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void e(kr.h.c r25, nI.C17631a<XH.C16807N> r26, nI.C17631a<XH.C16807N> r27, androidx.compose.ui.d r28, U0.C4889m r29, int r30, int r31) {
        /*
            r1 = r25
            r14 = r26
            r15 = r27
            r0 = r30
            java.lang.String r2 = "model"
            kotlin.jvm.internal.C17542s.j(r1, r2)
            java.lang.String r2 = "onCloseClicked"
            kotlin.jvm.internal.C17542s.j(r14, r2)
            java.lang.String r2 = "onLaterClicked"
            kotlin.jvm.internal.C17542s.j(r15, r2)
            r2 = 299734814(0x11dd971e, float:3.4960785E-28)
            r3 = r29
            U0.m r13 = r3.k(r2)
            r3 = r31 & 1
            if (r3 == 0) goto L_0x0027
            r3 = r0 | 6
            goto L_0x0040
        L_0x0027:
            r3 = r0 & 6
            if (r3 != 0) goto L_0x003f
            r3 = r0 & 8
            if (r3 != 0) goto L_0x0034
            boolean r3 = r13.V(r1)
            goto L_0x0038
        L_0x0034:
            boolean r3 = r13.F(r1)
        L_0x0038:
            if (r3 == 0) goto L_0x003c
            r3 = 4
            goto L_0x003d
        L_0x003c:
            r3 = 2
        L_0x003d:
            r3 = r3 | r0
            goto L_0x0040
        L_0x003f:
            r3 = r0
        L_0x0040:
            r4 = r31 & 2
            if (r4 == 0) goto L_0x0047
            r3 = r3 | 48
            goto L_0x0057
        L_0x0047:
            r4 = r0 & 48
            if (r4 != 0) goto L_0x0057
            boolean r4 = r13.F(r14)
            if (r4 == 0) goto L_0x0054
            r4 = 32
            goto L_0x0056
        L_0x0054:
            r4 = 16
        L_0x0056:
            r3 = r3 | r4
        L_0x0057:
            r4 = r31 & 4
            if (r4 == 0) goto L_0x005e
            r3 = r3 | 384(0x180, float:5.38E-43)
            goto L_0x006e
        L_0x005e:
            r4 = r0 & 384(0x180, float:5.38E-43)
            if (r4 != 0) goto L_0x006e
            boolean r4 = r13.F(r15)
            if (r4 == 0) goto L_0x006b
            r4 = 256(0x100, float:3.59E-43)
            goto L_0x006d
        L_0x006b:
            r4 = 128(0x80, float:1.794E-43)
        L_0x006d:
            r3 = r3 | r4
        L_0x006e:
            r4 = r31 & 8
            if (r4 == 0) goto L_0x0078
            r3 = r3 | 3072(0xc00, float:4.305E-42)
        L_0x0074:
            r5 = r28
        L_0x0076:
            r10 = r3
            goto L_0x008b
        L_0x0078:
            r5 = r0 & 3072(0xc00, float:4.305E-42)
            if (r5 != 0) goto L_0x0074
            r5 = r28
            boolean r6 = r13.V(r5)
            if (r6 == 0) goto L_0x0087
            r6 = 2048(0x800, float:2.87E-42)
            goto L_0x0089
        L_0x0087:
            r6 = 1024(0x400, float:1.435E-42)
        L_0x0089:
            r3 = r3 | r6
            goto L_0x0076
        L_0x008b:
            r3 = r10 & 1171(0x493, float:1.641E-42)
            r6 = 1170(0x492, float:1.64E-42)
            if (r3 != r6) goto L_0x00a0
            boolean r3 = r13.l()
            if (r3 != 0) goto L_0x0098
            goto L_0x00a0
        L_0x0098:
            r13.L()
            r4 = r5
            r28 = r13
            goto L_0x0209
        L_0x00a0:
            if (r4 == 0) goto L_0x00a6
            androidx.compose.ui.d$a r3 = androidx.compose.ui.d.f18749a
            r12 = r3
            goto L_0x00a7
        L_0x00a6:
            r12 = r5
        L_0x00a7:
            boolean r3 = U0.C4895p.J()
            if (r3 == 0) goto L_0x00b3
            r3 = -1
            java.lang.String r4 = "com.ingka.ikea.familyrewards.implementation.compose.bottomsheet.UseRewardBottomSheet (RewardBottomSheet.kt:60)"
            U0.C4895p.S(r2, r10, r3, r4)
        L_0x00b3:
            boolean r2 = r1 instanceof kr.h.e
            if (r2 == 0) goto L_0x00bb
            SC.H0 r3 = SC.H0.TertiaryStatic
        L_0x00b9:
            r11 = r3
            goto L_0x00c2
        L_0x00bb:
            boolean r3 = r1 instanceof kr.h.b
            if (r3 == 0) goto L_0x0236
            SC.H0 r3 = SC.H0.Tertiary
            goto L_0x00b9
        L_0x00c2:
            i1.c$a r16 = i1.C5437c.f24302a
            i1.c r3 = r16.o()
            r9 = 0
            E1.I r3 = androidx.compose.foundation.layout.C5077h.h(r3, r9)
            int r4 = U0.C4883j.a(r13, r9)
            U0.y r5 = r13.s()
            androidx.compose.ui.d r6 = androidx.compose.ui.c.e(r13, r12)
            G1.g$a r7 = G1.C4504g.f6515W
            nI.a r8 = r7.a()
            U0.f r17 = r13.m()
            if (r17 != 0) goto L_0x00e8
            U0.C4883j.c()
        L_0x00e8:
            r13.I()
            boolean r17 = r13.i()
            if (r17 == 0) goto L_0x00f5
            r13.p(r8)
            goto L_0x00f8
        L_0x00f5:
            r13.t()
        L_0x00f8:
            U0.m r8 = U0.F1.a(r13)
            nI.p r9 = r7.c()
            U0.F1.c(r8, r3, r9)
            nI.p r3 = r7.e()
            U0.F1.c(r8, r5, r3)
            nI.p r3 = r7.b()
            boolean r5 = r8.i()
            if (r5 != 0) goto L_0x0122
            java.lang.Object r5 = r8.D()
            java.lang.Integer r9 = java.lang.Integer.valueOf(r4)
            boolean r5 = kotlin.jvm.internal.C17542s.e(r5, r9)
            if (r5 != 0) goto L_0x0130
        L_0x0122:
            java.lang.Integer r5 = java.lang.Integer.valueOf(r4)
            r8.u(r5)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r8.w(r4, r3)
        L_0x0130:
            nI.p r3 = r7.d()
            U0.F1.c(r8, r6, r3)
            androidx.compose.foundation.layout.j r9 = androidx.compose.foundation.layout.C5079j.f18125a
            r3 = 48
            if (r2 == 0) goto L_0x015b
            r2 = 2131548102(0x7f0cd7c6, float:1.8721228E38)
            r13.W(r2)
            androidx.compose.ui.d$a r2 = androidx.compose.ui.d.f18749a
            java.lang.String r4 = "TestTag-ClaimedOnlineReward"
            androidx.compose.ui.d r2 = androidx.compose.ui.platform.C5116k1.a(r2, r4)
            int r4 = r10 >> 6
            r4 = r4 & 14
            r3 = r3 | r4
            r8 = 0
            Vq.h.i(r15, r2, r13, r3, r8)
            r13.P()
            r2 = r8
            r24 = r9
            goto L_0x01ab
        L_0x015b:
            r8 = 0
            boolean r2 = r1 instanceof kr.h.b
            if (r2 == 0) goto L_0x0223
            r2 = 2131837394(0x7f1141d2, float:1.9307982E38)
            r13.W(r2)
            r2 = r1
            kr.h$b r2 = (kr.h.b) r2
            IC.e r4 = r2.c()
            IC.e r5 = r2.a()
            java.lang.String r2 = r2.b()
            androidx.compose.ui.d$a r6 = androidx.compose.ui.d.f18749a
            java.lang.String r7 = "TestTag-UseInstoreMultiRewardScreen"
            androidx.compose.ui.d r17 = androidx.compose.ui.platform.C5116k1.a(r6, r7)
            float r3 = (float) r3
            float r19 = c2.h.B(r3)
            r22 = 13
            r23 = 0
            r18 = 0
            r20 = 0
            r21 = 0
            androidx.compose.ui.d r6 = androidx.compose.foundation.layout.D.m(r17, r18, r19, r20, r21, r22, r23)
            int r3 = IC.C13023e.f110931a
            r7 = r3 | 3072(0xc00, float:4.305E-42)
            int r3 = r3 << 3
            r17 = r7 | r3
            r18 = 0
            r3 = r4
            r4 = r5
            r5 = r2
            r7 = r13
            r2 = r8
            r8 = r17
            r24 = r9
            r9 = r18
            Vq.p.t(r3, r4, r5, r6, r7, r8, r9)
            r13.P()
        L_0x01ab:
            int r3 = uK.C18146a.f148097J2
            int r4 = Oo.b.f84665i
            java.lang.String r4 = J1.j.b(r4, r13, r2)
            androidx.compose.ui.d$a r2 = androidx.compose.ui.d.f18749a
            java.lang.String r5 = "TestTag-CloseButton"
            androidx.compose.ui.d r2 = androidx.compose.ui.platform.C5116k1.a(r2, r5)
            i1.c r5 = r16.n()
            r6 = r24
            androidx.compose.ui.d r16 = r6.a(r2, r5)
            r2 = 8
            float r2 = (float) r2
            float r18 = c2.h.B(r2)
            float r19 = c2.h.B(r2)
            r21 = 9
            r22 = 0
            r17 = 0
            r20 = 0
            androidx.compose.ui.d r5 = androidx.compose.foundation.layout.D.m(r16, r17, r18, r19, r20, r21, r22)
            int r2 = r10 << 21
            r6 = 234881024(0xe000000, float:1.5777218E-30)
            r16 = r2 & r6
            r17 = 232(0xe8, float:3.25E-43)
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r2 = r3
            r3 = r4
            r4 = r5
            r5 = r6
            r6 = r11
            r10 = r26
            r11 = r13
            r18 = r12
            r12 = r16
            r28 = r13
            r13 = r17
            SC.F0.b(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            r28.x()
            boolean r2 = U0.C4895p.J()
            if (r2 == 0) goto L_0x0207
            U0.C4895p.R()
        L_0x0207:
            r4 = r18
        L_0x0209:
            U0.Y0 r7 = r28.n()
            if (r7 == 0) goto L_0x0222
            Uq.b r8 = new Uq.b
            r0 = r8
            r1 = r25
            r2 = r26
            r3 = r27
            r5 = r30
            r6 = r31
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r7.a(r8)
        L_0x0222:
            return
        L_0x0223:
            r28 = r13
            r0 = -69789286(0xfffffffffbd7199a, float:-2.2337262E36)
            r1 = r28
            r1.W(r0)
            r1.P()
            XH.t r0 = new XH.t
            r0.<init>()
            throw r0
        L_0x0236:
            XH.t r0 = new XH.t
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: Uq.c.e(kr.h$c, nI.a, nI.a, androidx.compose.ui.d, U0.m, int, int):void");
    }

    /* access modifiers changed from: private */
    public static final C16807N f(h.c cVar, C17631a aVar, C17631a aVar2, d dVar, int i10, int i11, C4889m mVar, int i12) {
        e(cVar, aVar, aVar2, dVar, mVar, M0.a(i10 | 1), i11);
        return C16807N.f139792a;
    }
}
