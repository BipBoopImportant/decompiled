package zD;

import GD.C12929b;
import U0.C4889m;
import U0.M0;
import XH.C16807N;
import androidx.compose.ui.d;
import kotlin.Metadata;
import nI.C17631a;
import xD.C15208e;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aE\u0010\u000b\u001a\u00020\t2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bH\u0001¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"LGD/b;", "model", "Lp0/v;", "orientation", "Landroidx/compose/ui/d;", "modifier", "LxD/e;", "contentColor", "Lkotlin/Function0;", "LXH/N;", "onClick", "b", "(LGD/b;Lp0/v;Landroidx/compose/ui/d;LxD/e;LnI/a;LU0/m;II)V", "wallet-implementation_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class v {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f132534a;

        /* JADX WARNING: Can't wrap try/catch for region: R(9:0|1|2|3|4|5|6|7|9) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        static {
            /*
                xD.e[] r0 = xD.C15208e.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                xD.e r1 = xD.C15208e.Light     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                xD.e r1 = xD.C15208e.Dark     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                xD.e r1 = xD.C15208e.System     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                f132534a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: zD.v.a.<clinit>():void");
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:115:0x02e0  */
    /* JADX WARNING: Removed duplicated region for block: B:117:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0068  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x006d  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0083  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0089  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x00a9  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x00b1  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void b(GD.C12929b r44, p0.v r45, androidx.compose.ui.d r46, xD.C15208e r47, nI.C17631a<XH.C16807N> r48, U0.C4889m r49, int r50, int r51) {
        /*
            r7 = r44
            r8 = r45
            r9 = r50
            java.lang.String r0 = "model"
            kotlin.jvm.internal.C17542s.j(r7, r0)
            java.lang.String r0 = "orientation"
            kotlin.jvm.internal.C17542s.j(r8, r0)
            r0 = -1429731022(0xffffffffaac80932, float:-3.5533517E-13)
            r1 = r49
            U0.m r13 = r1.k(r0)
            r1 = r51 & 1
            r10 = 4
            r14 = 2
            if (r1 == 0) goto L_0x0022
            r1 = r9 | 6
            goto L_0x0032
        L_0x0022:
            r1 = r9 & 6
            if (r1 != 0) goto L_0x0031
            boolean r1 = r13.V(r7)
            if (r1 == 0) goto L_0x002e
            r1 = r10
            goto L_0x002f
        L_0x002e:
            r1 = r14
        L_0x002f:
            r1 = r1 | r9
            goto L_0x0032
        L_0x0031:
            r1 = r9
        L_0x0032:
            r2 = r51 & 2
            if (r2 == 0) goto L_0x0039
            r1 = r1 | 48
            goto L_0x0049
        L_0x0039:
            r2 = r9 & 48
            if (r2 != 0) goto L_0x0049
            boolean r2 = r13.V(r8)
            if (r2 == 0) goto L_0x0046
            r2 = 32
            goto L_0x0048
        L_0x0046:
            r2 = 16
        L_0x0048:
            r1 = r1 | r2
        L_0x0049:
            r2 = r51 & 4
            if (r2 == 0) goto L_0x0052
            r1 = r1 | 384(0x180, float:5.38E-43)
        L_0x004f:
            r3 = r46
            goto L_0x0064
        L_0x0052:
            r3 = r9 & 384(0x180, float:5.38E-43)
            if (r3 != 0) goto L_0x004f
            r3 = r46
            boolean r4 = r13.V(r3)
            if (r4 == 0) goto L_0x0061
            r4 = 256(0x100, float:3.59E-43)
            goto L_0x0063
        L_0x0061:
            r4 = 128(0x80, float:1.794E-43)
        L_0x0063:
            r1 = r1 | r4
        L_0x0064:
            r4 = r51 & 8
            if (r4 == 0) goto L_0x006d
            r1 = r1 | 3072(0xc00, float:4.305E-42)
        L_0x006a:
            r5 = r47
            goto L_0x007f
        L_0x006d:
            r5 = r9 & 3072(0xc00, float:4.305E-42)
            if (r5 != 0) goto L_0x006a
            r5 = r47
            boolean r6 = r13.V(r5)
            if (r6 == 0) goto L_0x007c
            r6 = 2048(0x800, float:2.87E-42)
            goto L_0x007e
        L_0x007c:
            r6 = 1024(0x400, float:1.435E-42)
        L_0x007e:
            r1 = r1 | r6
        L_0x007f:
            r6 = r51 & 16
            if (r6 == 0) goto L_0x0089
            r1 = r1 | 24576(0x6000, float:3.4438E-41)
        L_0x0085:
            r11 = r48
        L_0x0087:
            r15 = r1
            goto L_0x009c
        L_0x0089:
            r11 = r9 & 24576(0x6000, float:3.4438E-41)
            if (r11 != 0) goto L_0x0085
            r11 = r48
            boolean r12 = r13.F(r11)
            if (r12 == 0) goto L_0x0098
            r12 = 16384(0x4000, float:2.2959E-41)
            goto L_0x009a
        L_0x0098:
            r12 = 8192(0x2000, float:1.14794E-41)
        L_0x009a:
            r1 = r1 | r12
            goto L_0x0087
        L_0x009c:
            r1 = r15 & 9363(0x2493, float:1.312E-41)
            r12 = 9362(0x2492, float:1.3119E-41)
            if (r1 != r12) goto L_0x00b1
            boolean r1 = r13.l()
            if (r1 != 0) goto L_0x00a9
            goto L_0x00b1
        L_0x00a9:
            r13.L()
            r4 = r5
            r5 = r11
            r0 = r13
            goto L_0x02da
        L_0x00b1:
            if (r2 == 0) goto L_0x00b7
            androidx.compose.ui.d$a r1 = androidx.compose.ui.d.f18749a
            r12 = r1
            goto L_0x00b8
        L_0x00b7:
            r12 = r3
        L_0x00b8:
            if (r4 == 0) goto L_0x00bf
            xD.e r1 = xD.C15208e.Light
            r36 = r1
            goto L_0x00c1
        L_0x00bf:
            r36 = r5
        L_0x00c1:
            r5 = 0
            if (r6 == 0) goto L_0x00c5
            r11 = r5
        L_0x00c5:
            boolean r1 = U0.C4895p.J()
            if (r1 == 0) goto L_0x00d1
            r1 = -1
            java.lang.String r2 = "com.ingka.ikea.wallet.impl.compose.card.layout.WalletCardHeader (WalletCardHeader.kt:35)"
            U0.C4895p.S(r0, r15, r1, r2)
        L_0x00d1:
            if (r11 == 0) goto L_0x00df
            int r0 = uK.C18146a.f148220R5
            int r1 = Oo.b.f84387H
            xD.a r2 = new xD.a
            r2.<init>(r11, r1, r0)
            r37 = r2
            goto L_0x00e1
        L_0x00df:
            r37 = r5
        L_0x00e1:
            int[] r0 = zD.v.a.f132534a
            int r1 = r36.ordinal()
            r0 = r0[r1]
            r6 = 0
            r1 = 1
            if (r0 == r1) goto L_0x0127
            if (r0 == r14) goto L_0x0115
            r2 = 3
            if (r0 != r2) goto L_0x0106
            r0 = 1107651626(0x42056c2a, float:33.35563)
            r13.W(r0)
            tK.h r0 = SC.C13575d.a(r13, r6)
            long r2 = r0.G0()
            r13.P()
        L_0x0103:
            r38 = r2
            goto L_0x0139
        L_0x0106:
            r0 = 1107646765(0x4205592d, float:33.337086)
            r13.W(r0)
            r13.P()
            XH.t r0 = new XH.t
            r0.<init>()
            throw r0
        L_0x0115:
            r0 = 1107650025(0x420565e9, float:33.34952)
            r13.W(r0)
            tK.h r0 = SC.C13575d.a(r13, r6)
            long r2 = r0.x0()
            r13.P()
            goto L_0x0103
        L_0x0127:
            r0 = 1107648489(0x42055fe9, float:33.343662)
            r13.W(r0)
            tK.h r0 = SC.C13575d.a(r13, r6)
            long r2 = r0.F0()
            r13.P()
            goto L_0x0103
        L_0x0139:
            r0 = 24
            float r4 = (float) r0
            float r0 = c2.h.B(r4)
            r3 = 0
            androidx.compose.ui.d r0 = androidx.compose.foundation.layout.D.k(r12, r3, r0, r1, r5)
            androidx.compose.foundation.layout.d r1 = androidx.compose.foundation.layout.C5073d.f18068a
            androidx.compose.foundation.layout.d$m r1 = r1.g()
            i1.c$a r2 = i1.C5437c.f24302a
            i1.c$b r2 = r2.k()
            E1.I r1 = androidx.compose.foundation.layout.C5080k.a(r1, r2, r13, r6)
            int r2 = U0.C4883j.a(r13, r6)
            U0.y r3 = r13.s()
            androidx.compose.ui.d r0 = androidx.compose.ui.c.e(r13, r0)
            G1.g$a r16 = G1.C4504g.f6515W
            nI.a r5 = r16.a()
            U0.f r17 = r13.m()
            if (r17 != 0) goto L_0x0170
            U0.C4883j.c()
        L_0x0170:
            r13.I()
            boolean r17 = r13.i()
            if (r17 == 0) goto L_0x017d
            r13.p(r5)
            goto L_0x0180
        L_0x017d:
            r13.t()
        L_0x0180:
            U0.m r5 = U0.F1.a(r13)
            nI.p r6 = r16.c()
            U0.F1.c(r5, r1, r6)
            nI.p r1 = r16.e()
            U0.F1.c(r5, r3, r1)
            nI.p r1 = r16.b()
            boolean r3 = r5.i()
            if (r3 != 0) goto L_0x01aa
            java.lang.Object r3 = r5.D()
            java.lang.Integer r6 = java.lang.Integer.valueOf(r2)
            boolean r3 = kotlin.jvm.internal.C17542s.e(r3, r6)
            if (r3 != 0) goto L_0x01b8
        L_0x01aa:
            java.lang.Integer r3 = java.lang.Integer.valueOf(r2)
            r5.u(r3)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r5.w(r2, r1)
        L_0x01b8:
            nI.p r1 = r16.d()
            U0.F1.c(r5, r0, r1)
            s0.h r40 = s0.C5862h.f28810a
            if (r37 == 0) goto L_0x01ca
            p0.v r0 = p0.v.Vertical
            if (r8 != r0) goto L_0x01ca
            r3 = r37
            goto L_0x01cb
        L_0x01ca:
            r3 = 0
        L_0x01cb:
            r0 = r15 & 14
            int r1 = r15 >> 3
            r1 = r1 & 896(0x380, float:1.256E-42)
            r5 = r0 | r1
            r6 = 2
            r1 = 0
            r0 = r44
            r2 = r36
            r16 = r15
            r15 = 0
            r41 = r4
            r4 = r13
            xD.C15207d.e(r0, r1, r2, r3, r4, r5, r6)
            androidx.compose.ui.d$a r0 = androidx.compose.ui.d.f18749a
            float r1 = (float) r10
            float r1 = c2.h.B(r1)
            androidx.compose.ui.d r1 = androidx.compose.foundation.layout.J.i(r0, r1)
            r2 = 6
            s0.C5844O.a(r1, r13, r2)
            IC.e r10 = r44.c()
            TC.b$b$a r1 = TC.C13679b.C2857b.a.f116683a
            r43 = r11
            r11 = r1
            Y1.t$a r1 = Y1.t.f14827a
            int r27 = r1.b()
            java.lang.String r1 = "WalletTestTags-Title"
            androidx.compose.ui.d r1 = androidx.compose.ui.platform.C5116k1.a(r0, r1)
            float r3 = c2.h.B(r41)
            r4 = 0
            androidx.compose.ui.d r1 = androidx.compose.foundation.layout.D.k(r1, r3, r15, r14, r4)
            r42 = r12
            r12 = r1
            int r1 = IC.C13023e.f110931a
            r3 = r1 | 432(0x1b0, float:6.05E-43)
            r33 = r3
            r34 = 199680(0x30c00, float:2.79811E-40)
            r35 = 221168(0x35ff0, float:3.09922E-40)
            r5 = 0
            r3 = r16
            r15 = r5
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r22 = 0
            r23 = 0
            r24 = 0
            r25 = 0
            r28 = 0
            r29 = 2
            r30 = 0
            r31 = 0
            r6 = r13
            r5 = r14
            r13 = r38
            r32 = r6
            SC.C13607l.i(r10, r11, r12, r13, r15, r17, r18, r19, r20, r22, r23, r24, r25, r27, r28, r29, r30, r31, r32, r33, r34, r35)
            float r10 = (float) r2
            float r10 = c2.h.B(r10)
            androidx.compose.ui.d r10 = androidx.compose.foundation.layout.J.i(r0, r10)
            s0.C5844O.a(r10, r6, r2)
            IC.e r10 = r44.a()
            TC.b$a$b r11 = TC.C13679b.a.C2856b.f116680a
            java.lang.String r12 = "WalletTestTags-Description"
            androidx.compose.ui.d r12 = androidx.compose.ui.platform.C5116k1.a(r0, r12)
            float r13 = c2.h.B(r41)
            r14 = 0
            androidx.compose.ui.d r12 = androidx.compose.foundation.layout.D.k(r12, r13, r14, r5, r4)
            r1 = r1 | 432(0x1b0, float:6.05E-43)
            r33 = r1
            r34 = 0
            r35 = 262128(0x3fff0, float:3.6732E-40)
            r15 = 0
            r27 = 0
            r29 = 0
            r13 = r38
            SC.C13607l.i(r10, r11, r12, r13, r15, r17, r18, r19, r20, r22, r23, r24, r25, r27, r28, r29, r30, r31, r32, r33, r34, r35)
            r1 = -1240905758(0xffffffffb60947e2, float:-2.0456432E-6)
            r6.W(r1)
            p0.v r1 = p0.v.Horizontal
            if (r8 != r1) goto L_0x02c4
            if (r37 == 0) goto L_0x02c4
            r20 = 2
            r21 = 0
            r18 = 1065353216(0x3f800000, float:1.0)
            r19 = 0
            r16 = r40
            r17 = r0
            androidx.compose.ui.d r1 = s0.C5861g.c(r16, r17, r18, r19, r20, r21)
            r4 = 0
            s0.C5844O.a(r1, r6, r4)
            java.lang.String r1 = "WalletTestTags-DetailsButton"
            androidx.compose.ui.d r10 = androidx.compose.ui.platform.C5116k1.a(r0, r1)
            r0 = 12
            float r0 = (float) r0
            float r11 = c2.h.B(r0)
            r15 = 14
            r16 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            androidx.compose.ui.d r0 = androidx.compose.foundation.layout.D.m(r10, r11, r12, r13, r14, r15, r16)
            int r1 = r3 >> 6
            r1 = r1 & 112(0x70, float:1.57E-43)
            r5 = r1 | 384(0x180, float:5.38E-43)
            r10 = 0
            r1 = r37
            r2 = r36
            r3 = r0
            r4 = r6
            r0 = r6
            r6 = r10
            xD.C15207d.c(r1, r2, r3, r4, r5, r6)
            goto L_0x02c5
        L_0x02c4:
            r0 = r6
        L_0x02c5:
            r0.P()
            r0.x()
            boolean r1 = U0.C4895p.J()
            if (r1 == 0) goto L_0x02d4
            U0.C4895p.R()
        L_0x02d4:
            r4 = r36
            r3 = r42
            r5 = r43
        L_0x02da:
            U0.Y0 r10 = r0.n()
            if (r10 == 0) goto L_0x02f1
            zD.u r11 = new zD.u
            r0 = r11
            r1 = r44
            r2 = r45
            r6 = r50
            r7 = r51
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            r10.a(r11)
        L_0x02f1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: zD.v.b(GD.b, p0.v, androidx.compose.ui.d, xD.e, nI.a, U0.m, int, int):void");
    }

    /* access modifiers changed from: private */
    public static final C16807N c(C12929b bVar, p0.v vVar, d dVar, C15208e eVar, C17631a aVar, int i10, int i11, C4889m mVar, int i12) {
        b(bVar, vVar, dVar, eVar, aVar, mVar, M0.a(i10 | 1), i11);
        return C16807N.f139792a;
    }
}
