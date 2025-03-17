package RC;

import L1.x;
import RC.n;
import SC.L1;
import SC.S1;
import U0.C4889m;
import U0.C4895p;
import U0.M0;
import U0.Y0;
import XH.C16807N;
import androidx.compose.foundation.layout.D;
import androidx.compose.ui.d;
import androidx.compose.ui.platform.C5116k1;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import qx.c;
import tK.C18029u;

@Metadata(d1 = {"\u00002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a?\u0010\n\u001a\u00020\t2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0000H\u0007¢\u0006\u0004\b\n\u0010\u000b\u001aG\u0010\u0010\u001a\u00020\t2\u0006\u0010\u0001\u001a\u00020\u00002\b\u0010\b\u001a\u0004\u0018\u00010\u00002\b\u0010\f\u001a\u0004\u0018\u00010\u00002\u0006\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u000f\u001a\u00020\u000eH\u0007¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u001f\u0010\u0013\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00122\u0006\u0010\u0007\u001a\u00020\u0006H\u0003¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"", "label", "LRC/n;", "price", "Landroidx/compose/ui/d;", "modifier", "LSC/S1;", "totalPriceSize", "labelA11y", "LXH/N;", "n", "(Ljava/lang/String;LRC/n;Landroidx/compose/ui/d;LSC/S1;Ljava/lang/String;LU0/m;II)V", "subLabel", "value", "", "isBold", "j", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroidx/compose/ui/d;ZLU0/m;II)V", "LRC/n$a;", "h", "(LRC/n$a;LSC/S1;LU0/m;I)V", "price-summary_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class v {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f115399a;

        /* JADX WARNING: Can't wrap try/catch for region: R(11:0|1|2|3|4|5|6|7|8|9|11) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0022 */
        static {
            /*
                SC.S1[] r0 = SC.S1.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                SC.S1 r1 = SC.S1.Small     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                SC.S1 r1 = SC.S1.Medium     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                SC.S1 r1 = SC.S1.Size700     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                SC.S1 r1 = SC.S1.Large     // Catch:{ NoSuchFieldError -> 0x002b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002b }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002b }
            L_0x002b:
                f115399a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: RC.v.a.<clinit>():void");
        }
    }

    private static final void h(n.a aVar, S1 s12, C4889m mVar, int i10) {
        int i11;
        C4889m k10 = mVar.k(284047925);
        if ((i10 & 6) == 0) {
            i11 = (k10.F(aVar) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= k10.V(s12) ? 32 : 16;
        }
        if ((i11 & 19) != 18 || !k10.l()) {
            if (C4895p.J()) {
                C4895p.S(284047925, i11, -1, "com.ingka.ikea.ui.pricesummary.compose.FormattedPrice (TotalPriceRow.kt:154)");
            }
            L1.c(aVar.b(), L1.b(aVar.a()), C5116k1.a(D.m(d.f18749a, C18029u.f147649a.a(), 0.0f, 0.0f, 0.0f, 14, (Object) null), "SkapaPriceTestTags_PRICE"), s12, k10, c.f130485c | ((i11 << 6) & 7168), 0);
            if (C4895p.J()) {
                C4895p.R();
            }
        } else {
            k10.L();
        }
        Y0 n10 = k10.n();
        if (n10 != null) {
            n10.a(new u(aVar, s12, i10));
        }
    }

    /* access modifiers changed from: private */
    public static final C16807N i(n.a aVar, S1 s12, int i10, C4889m mVar, int i11) {
        h(aVar, s12, mVar, M0.a(i10 | 1));
        return C16807N.f139792a;
    }

    /* JADX WARNING: Removed duplicated region for block: B:143:0x0369  */
    /* JADX WARNING: Removed duplicated region for block: B:145:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x009f  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00a3  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00c6  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00cf  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void j(java.lang.String r38, java.lang.String r39, java.lang.String r40, java.lang.String r41, androidx.compose.ui.d r42, boolean r43, U0.C4889m r44, int r45, int r46) {
        /*
            r8 = r38
            r2 = r39
            r1 = r40
            r0 = r41
            r15 = r45
            r3 = 32
            r14 = 16
            r4 = 2
            java.lang.String r5 = "label"
            kotlin.jvm.internal.C17542s.j(r8, r5)
            java.lang.String r5 = "value"
            kotlin.jvm.internal.C17542s.j(r0, r5)
            r5 = -131542639(0xfffffffff828d191, float:-1.3696193E34)
            r6 = r44
            U0.m r13 = r6.k(r5)
            r6 = 1
            r7 = r46 & 1
            r9 = 4
            if (r7 == 0) goto L_0x002b
            r7 = r15 | 6
            goto L_0x003b
        L_0x002b:
            r7 = r15 & 6
            if (r7 != 0) goto L_0x003a
            boolean r7 = r13.V(r8)
            if (r7 == 0) goto L_0x0037
            r7 = r9
            goto L_0x0038
        L_0x0037:
            r7 = r4
        L_0x0038:
            r7 = r7 | r15
            goto L_0x003b
        L_0x003a:
            r7 = r15
        L_0x003b:
            r4 = r46 & 2
            if (r4 == 0) goto L_0x0042
            r7 = r7 | 48
            goto L_0x0050
        L_0x0042:
            r4 = r15 & 48
            if (r4 != 0) goto L_0x0050
            boolean r4 = r13.V(r2)
            if (r4 == 0) goto L_0x004e
            r4 = r3
            goto L_0x004f
        L_0x004e:
            r4 = r14
        L_0x004f:
            r7 = r7 | r4
        L_0x0050:
            r4 = r46 & 4
            if (r4 == 0) goto L_0x0057
            r7 = r7 | 384(0x180, float:5.38E-43)
            goto L_0x0067
        L_0x0057:
            r4 = r15 & 384(0x180, float:5.38E-43)
            if (r4 != 0) goto L_0x0067
            boolean r4 = r13.V(r1)
            if (r4 == 0) goto L_0x0064
            r4 = 256(0x100, float:3.59E-43)
            goto L_0x0066
        L_0x0064:
            r4 = 128(0x80, float:1.794E-43)
        L_0x0066:
            r7 = r7 | r4
        L_0x0067:
            r4 = r46 & 8
            if (r4 == 0) goto L_0x006e
            r7 = r7 | 3072(0xc00, float:4.305E-42)
            goto L_0x007e
        L_0x006e:
            r4 = r15 & 3072(0xc00, float:4.305E-42)
            if (r4 != 0) goto L_0x007e
            boolean r4 = r13.V(r0)
            if (r4 == 0) goto L_0x007b
            r4 = 2048(0x800, float:2.87E-42)
            goto L_0x007d
        L_0x007b:
            r4 = 1024(0x400, float:1.435E-42)
        L_0x007d:
            r7 = r7 | r4
        L_0x007e:
            r4 = r46 & 16
            if (r4 == 0) goto L_0x0087
            r7 = r7 | 24576(0x6000, float:3.4438E-41)
        L_0x0084:
            r10 = r42
            goto L_0x0099
        L_0x0087:
            r10 = r15 & 24576(0x6000, float:3.4438E-41)
            if (r10 != 0) goto L_0x0084
            r10 = r42
            boolean r11 = r13.V(r10)
            if (r11 == 0) goto L_0x0096
            r11 = 16384(0x4000, float:2.2959E-41)
            goto L_0x0098
        L_0x0096:
            r11 = 8192(0x2000, float:1.14794E-41)
        L_0x0098:
            r7 = r7 | r11
        L_0x0099:
            r11 = r46 & 32
            r12 = 196608(0x30000, float:2.75506E-40)
            if (r11 == 0) goto L_0x00a3
            r7 = r7 | r12
        L_0x00a0:
            r12 = r43
            goto L_0x00b5
        L_0x00a3:
            r12 = r12 & r15
            if (r12 != 0) goto L_0x00a0
            r12 = r43
            boolean r16 = r13.b(r12)
            if (r16 == 0) goto L_0x00b1
            r16 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00b3
        L_0x00b1:
            r16 = 65536(0x10000, float:9.18355E-41)
        L_0x00b3:
            r7 = r7 | r16
        L_0x00b5:
            r16 = 74899(0x12493, float:1.04956E-40)
            r14 = r7 & r16
            r3 = 74898(0x12492, float:1.04954E-40)
            if (r14 != r3) goto L_0x00cf
            boolean r3 = r13.l()
            if (r3 != 0) goto L_0x00c6
            goto L_0x00cf
        L_0x00c6:
            r13.L()
            r5 = r10
            r6 = r12
            r37 = r13
            goto L_0x0363
        L_0x00cf:
            if (r4 == 0) goto L_0x00d5
            androidx.compose.ui.d$a r3 = androidx.compose.ui.d.f18749a
            r14 = r3
            goto L_0x00d6
        L_0x00d5:
            r14 = r10
        L_0x00d6:
            r3 = 0
            if (r11 == 0) goto L_0x00dc
            r26 = r3
            goto L_0x00de
        L_0x00dc:
            r26 = r12
        L_0x00de:
            boolean r4 = U0.C4895p.J()
            if (r4 == 0) goto L_0x00ea
            r4 = -1
            java.lang.String r10 = "com.ingka.ikea.ui.pricesummary.compose.PriceRow (TotalPriceRow.kt:105)"
            U0.C4895p.S(r5, r7, r4, r10)
        L_0x00ea:
            r4 = -1200277261(0xffffffffb87538f3, float:-5.846559E-5)
            r13.W(r4)
            java.lang.Object r4 = r13.D()
            U0.m$a r5 = U0.C4889m.f14007a
            java.lang.Object r10 = r5.a()
            if (r4 != r10) goto L_0x0104
            RC.o r4 = new RC.o
            r4.<init>()
            r13.u(r4)
        L_0x0104:
            nI.l r4 = (nI.C17642l) r4
            r13.P()
            androidx.compose.ui.d r4 = L1.o.c(r14, r6, r4)
            r10 = 0
            r11 = 0
            androidx.compose.ui.d r4 = androidx.compose.foundation.layout.J.h(r4, r10, r6, r11)
            float r9 = (float) r9
            float r9 = c2.h.B(r9)
            androidx.compose.ui.d r4 = androidx.compose.foundation.layout.D.k(r4, r10, r9, r6, r11)
            androidx.compose.foundation.layout.d r9 = androidx.compose.foundation.layout.C5073d.f18068a
            androidx.compose.foundation.layout.d$f r10 = r9.d()
            i1.c$a r12 = i1.C5437c.f24302a
            i1.c$c r6 = r12.l()
            r11 = 54
            E1.I r6 = androidx.compose.foundation.layout.G.b(r10, r6, r13, r11)
            int r10 = U0.C4883j.a(r13, r3)
            U0.y r11 = r13.s()
            androidx.compose.ui.d r4 = androidx.compose.ui.c.e(r13, r4)
            G1.g$a r18 = G1.C4504g.f6515W
            nI.a r3 = r18.a()
            U0.f r20 = r13.m()
            if (r20 != 0) goto L_0x0149
            U0.C4883j.c()
        L_0x0149:
            r13.I()
            boolean r20 = r13.i()
            if (r20 == 0) goto L_0x0156
            r13.p(r3)
            goto L_0x0159
        L_0x0156:
            r13.t()
        L_0x0159:
            U0.m r3 = U0.F1.a(r13)
            nI.p r0 = r18.c()
            U0.F1.c(r3, r6, r0)
            nI.p r0 = r18.e()
            U0.F1.c(r3, r11, r0)
            nI.p r0 = r18.b()
            boolean r6 = r3.i()
            if (r6 != 0) goto L_0x0183
            java.lang.Object r6 = r3.D()
            java.lang.Integer r11 = java.lang.Integer.valueOf(r10)
            boolean r6 = kotlin.jvm.internal.C17542s.e(r6, r11)
            if (r6 != 0) goto L_0x0191
        L_0x0183:
            java.lang.Integer r6 = java.lang.Integer.valueOf(r10)
            r3.u(r6)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r10)
            r3.w(r6, r0)
        L_0x0191:
            nI.p r0 = r18.d()
            U0.F1.c(r3, r4, r0)
            s0.N r20 = s0.C5843N.f28726a
            androidx.compose.ui.d$a r0 = androidx.compose.ui.d.f18749a
            r24 = 2
            r25 = 0
            r22 = 1065353216(0x3f800000, float:1.0)
            r23 = 0
            r21 = r0
            androidx.compose.ui.d r3 = s0.C5842M.e(r20, r21, r22, r23, r24, r25)
            androidx.compose.foundation.layout.d$m r4 = r9.g()
            i1.c$b r6 = r12.k()
            r9 = 0
            E1.I r4 = androidx.compose.foundation.layout.C5080k.a(r4, r6, r13, r9)
            int r6 = U0.C4883j.a(r13, r9)
            U0.y r9 = r13.s()
            androidx.compose.ui.d r3 = androidx.compose.ui.c.e(r13, r3)
            nI.a r10 = r18.a()
            U0.f r11 = r13.m()
            if (r11 != 0) goto L_0x01d0
            U0.C4883j.c()
        L_0x01d0:
            r13.I()
            boolean r11 = r13.i()
            if (r11 == 0) goto L_0x01dd
            r13.p(r10)
            goto L_0x01e0
        L_0x01dd:
            r13.t()
        L_0x01e0:
            U0.m r10 = U0.F1.a(r13)
            nI.p r11 = r18.c()
            U0.F1.c(r10, r4, r11)
            nI.p r4 = r18.e()
            U0.F1.c(r10, r9, r4)
            nI.p r4 = r18.b()
            boolean r9 = r10.i()
            if (r9 != 0) goto L_0x020a
            java.lang.Object r9 = r10.D()
            java.lang.Integer r11 = java.lang.Integer.valueOf(r6)
            boolean r9 = kotlin.jvm.internal.C17542s.e(r9, r11)
            if (r9 != 0) goto L_0x0218
        L_0x020a:
            java.lang.Integer r9 = java.lang.Integer.valueOf(r6)
            r10.u(r9)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r10.w(r6, r4)
        L_0x0218:
            nI.p r4 = r18.d()
            U0.F1.c(r10, r3, r4)
            s0.h r3 = s0.C5862h.f28810a
            r3 = -1267385203(0xffffffffb4753c8d, float:-2.2839431E-7)
            r13.W(r3)
            if (r2 == 0) goto L_0x025b
            r3 = -1267383403(0xffffffffb4754395, float:-2.2841989E-7)
            r13.W(r3)
            r3 = r7 & 112(0x70, float:1.57E-43)
            r4 = 32
            if (r3 != r4) goto L_0x0237
            r9 = 1
            goto L_0x0238
        L_0x0237:
            r9 = 0
        L_0x0238:
            java.lang.Object r3 = r13.D()
            if (r9 != 0) goto L_0x0244
            java.lang.Object r4 = r5.a()
            if (r3 != r4) goto L_0x024c
        L_0x0244:
            RC.p r3 = new RC.p
            r3.<init>(r2)
            r13.u(r3)
        L_0x024c:
            nI.l r3 = (nI.C17642l) r3
            r13.P()
            r4 = 1
            r5 = 0
            r6 = 0
            androidx.compose.ui.d r3 = L1.o.d(r0, r5, r3, r4, r6)
            r22 = r3
            goto L_0x025d
        L_0x025b:
            r22 = r0
        L_0x025d:
            r13.P()
            TC.b$a$b r34 = TC.C13679b.a.C2856b.f116680a
            S1.C$a r3 = S1.C.f13316b
            if (r26 == 0) goto L_0x026d
            S1.C r3 = r3.a()
        L_0x026a:
            r27 = r3
            goto L_0x0272
        L_0x026d:
            S1.C r3 = r3.d()
            goto L_0x026a
        L_0x0272:
            r3 = r7 & 14
            r23 = r3 | 48
            r24 = 0
            r25 = 262072(0x3ffb8, float:3.67241E-40)
            r3 = 0
            r5 = 0
            r9 = 0
            r35 = r7
            r7 = r9
            r10 = 0
            r12 = 0
            r16 = 0
            r42 = r13
            r13 = r16
            r36 = r14
            r14 = r16
            r16 = 0
            r15 = r16
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r28 = r0
            r0 = r38
            r1 = r34
            r2 = r22
            r8 = r27
            r22 = r42
            SC.C13607l.j(r0, r1, r2, r3, r5, r7, r8, r9, r10, r12, r13, r14, r15, r17, r18, r19, r20, r21, r22, r23, r24, r25)
            r0 = -1267370927(0xffffffffb4757451, float:-2.2859719E-7)
            r8 = r42
            r8.W(r0)
            if (r40 != 0) goto L_0x02ba
            r37 = r8
            goto L_0x02f8
        L_0x02ba:
            TC.b$a$c r1 = TC.C13679b.a.c.f116681a
            S1.C$a r0 = S1.C.f13316b
            if (r26 == 0) goto L_0x02c7
            S1.C r0 = r0.a()
        L_0x02c4:
            r22 = r0
            goto L_0x02cc
        L_0x02c7:
            S1.C r0 = r0.d()
            goto L_0x02c4
        L_0x02cc:
            r24 = 0
            r25 = 262076(0x3ffbc, float:3.67247E-40)
            r2 = 0
            r3 = 0
            r5 = 0
            r7 = 0
            r9 = 0
            r10 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r23 = 48
            r0 = r40
            r37 = r8
            r8 = r22
            r22 = r37
            SC.C13607l.j(r0, r1, r2, r3, r5, r7, r8, r9, r10, r12, r13, r14, r15, r17, r18, r19, r20, r21, r22, r23, r24, r25)
            XH.N r0 = XH.C16807N.f139792a
        L_0x02f8:
            r37.P()
            r37.x()
            r0 = 16
            float r0 = (float) r0
            float r0 = c2.h.B(r0)
            r32 = 14
            r33 = 0
            r29 = 0
            r30 = 0
            r31 = 0
            r27 = r28
            r28 = r0
            androidx.compose.ui.d r2 = androidx.compose.foundation.layout.D.m(r27, r28, r29, r30, r31, r32, r33)
            S1.C$a r0 = S1.C.f13316b
            if (r26 == 0) goto L_0x0321
            S1.C r0 = r0.a()
        L_0x031f:
            r8 = r0
            goto L_0x0326
        L_0x0321:
            S1.C r0 = r0.d()
            goto L_0x031f
        L_0x0326:
            int r0 = r35 >> 9
            r0 = r0 & 14
            r0 = r0 | 432(0x1b0, float:6.05E-43)
            r23 = r0
            r24 = 0
            r25 = 262072(0x3ffb8, float:3.67241E-40)
            r3 = 0
            r5 = 0
            r7 = 0
            r9 = 0
            r10 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r0 = r41
            r1 = r34
            r22 = r37
            SC.C13607l.j(r0, r1, r2, r3, r5, r7, r8, r9, r10, r12, r13, r14, r15, r17, r18, r19, r20, r21, r22, r23, r24, r25)
            r37.x()
            boolean r0 = U0.C4895p.J()
            if (r0 == 0) goto L_0x035f
            U0.C4895p.R()
        L_0x035f:
            r6 = r26
            r5 = r36
        L_0x0363:
            U0.Y0 r9 = r37.n()
            if (r9 == 0) goto L_0x037e
            RC.q r10 = new RC.q
            r0 = r10
            r1 = r38
            r2 = r39
            r3 = r40
            r4 = r41
            r7 = r45
            r8 = r46
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            r9.a(r10)
        L_0x037e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: RC.v.j(java.lang.String, java.lang.String, java.lang.String, java.lang.String, androidx.compose.ui.d, boolean, U0.m, int, int):void");
    }

    /* access modifiers changed from: private */
    public static final C16807N k(String str, x xVar) {
        C17542s.j(xVar, "$this$semantics");
        L1.v.d0(xVar, str);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N l(String str, String str2, String str3, String str4, d dVar, boolean z10, int i10, int i11, C4889m mVar, int i12) {
        j(str, str2, str3, str4, dVar, z10, mVar, M0.a(i10 | 1), i11);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N m(x xVar) {
        C17542s.j(xVar, "$this$semantics");
        return C16807N.f139792a;
    }

    /* JADX WARNING: Removed duplicated region for block: B:124:0x029c  */
    /* JADX WARNING: Removed duplicated region for block: B:128:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0066  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x006b  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0083  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0089  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x00a8  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x00b2  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void n(java.lang.String r32, RC.n r33, androidx.compose.ui.d r34, SC.S1 r35, java.lang.String r36, U0.C4889m r37, int r38, int r39) {
        /*
            r1 = r32
            r0 = r33
            r15 = r38
            java.lang.String r2 = "label"
            kotlin.jvm.internal.C17542s.j(r1, r2)
            java.lang.String r2 = "price"
            kotlin.jvm.internal.C17542s.j(r0, r2)
            r2 = 1301335772(0x4d90cedc, float:3.0368448E8)
            r3 = r37
            U0.m r14 = r3.k(r2)
            r3 = r39 & 1
            if (r3 == 0) goto L_0x0020
            r3 = r15 | 6
            goto L_0x0030
        L_0x0020:
            r3 = r15 & 6
            if (r3 != 0) goto L_0x002f
            boolean r3 = r14.V(r1)
            if (r3 == 0) goto L_0x002c
            r3 = 4
            goto L_0x002d
        L_0x002c:
            r3 = 2
        L_0x002d:
            r3 = r3 | r15
            goto L_0x0030
        L_0x002f:
            r3 = r15
        L_0x0030:
            r6 = r39 & 2
            if (r6 == 0) goto L_0x0037
            r3 = r3 | 48
            goto L_0x0047
        L_0x0037:
            r6 = r15 & 48
            if (r6 != 0) goto L_0x0047
            boolean r6 = r14.V(r0)
            if (r6 == 0) goto L_0x0044
            r6 = 32
            goto L_0x0046
        L_0x0044:
            r6 = 16
        L_0x0046:
            r3 = r3 | r6
        L_0x0047:
            r6 = r39 & 4
            if (r6 == 0) goto L_0x0050
            r3 = r3 | 384(0x180, float:5.38E-43)
        L_0x004d:
            r7 = r34
            goto L_0x0062
        L_0x0050:
            r7 = r15 & 384(0x180, float:5.38E-43)
            if (r7 != 0) goto L_0x004d
            r7 = r34
            boolean r8 = r14.V(r7)
            if (r8 == 0) goto L_0x005f
            r8 = 256(0x100, float:3.59E-43)
            goto L_0x0061
        L_0x005f:
            r8 = 128(0x80, float:1.794E-43)
        L_0x0061:
            r3 = r3 | r8
        L_0x0062:
            r8 = r39 & 8
            if (r8 == 0) goto L_0x006b
            r3 = r3 | 3072(0xc00, float:4.305E-42)
        L_0x0068:
            r9 = r35
            goto L_0x007d
        L_0x006b:
            r9 = r15 & 3072(0xc00, float:4.305E-42)
            if (r9 != 0) goto L_0x0068
            r9 = r35
            boolean r10 = r14.V(r9)
            if (r10 == 0) goto L_0x007a
            r10 = 2048(0x800, float:2.87E-42)
            goto L_0x007c
        L_0x007a:
            r10 = 1024(0x400, float:1.435E-42)
        L_0x007c:
            r3 = r3 | r10
        L_0x007d:
            r10 = r39 & 16
            r11 = 16384(0x4000, float:2.2959E-41)
            if (r10 == 0) goto L_0x0089
            r3 = r3 | 24576(0x6000, float:3.4438E-41)
        L_0x0085:
            r12 = r36
        L_0x0087:
            r13 = r3
            goto L_0x009b
        L_0x0089:
            r12 = r15 & 24576(0x6000, float:3.4438E-41)
            if (r12 != 0) goto L_0x0085
            r12 = r36
            boolean r13 = r14.V(r12)
            if (r13 == 0) goto L_0x0097
            r13 = r11
            goto L_0x0099
        L_0x0097:
            r13 = 8192(0x2000, float:1.14794E-41)
        L_0x0099:
            r3 = r3 | r13
            goto L_0x0087
        L_0x009b:
            r3 = r13 & 9363(0x2493, float:1.312E-41)
            r5 = 9362(0x2492, float:1.3119E-41)
            if (r3 != r5) goto L_0x00b2
            boolean r3 = r14.l()
            if (r3 != 0) goto L_0x00a8
            goto L_0x00b2
        L_0x00a8:
            r14.L()
            r2 = r0
            r3 = r7
            r4 = r9
            r5 = r12
            r1 = r14
            goto L_0x0296
        L_0x00b2:
            if (r6 == 0) goto L_0x00b7
            androidx.compose.ui.d$a r3 = androidx.compose.ui.d.f18749a
            r7 = r3
        L_0x00b7:
            if (r8 == 0) goto L_0x00bc
            SC.S1 r3 = SC.S1.Medium
            r9 = r3
        L_0x00bc:
            r3 = 0
            if (r10 == 0) goto L_0x00c0
            r12 = r3
        L_0x00c0:
            boolean r5 = U0.C4895p.J()
            if (r5 == 0) goto L_0x00cc
            r5 = -1
            java.lang.String r6 = "com.ingka.ikea.ui.pricesummary.compose.TotalPriceRow (TotalPriceRow.kt:44)"
            U0.C4895p.S(r2, r13, r5, r6)
        L_0x00cc:
            r2 = 1800230423(0x6b4d5617, float:2.4823634E26)
            r14.W(r2)
            java.lang.Object r2 = r14.D()
            U0.m$a r5 = U0.C4889m.f14007a
            java.lang.Object r6 = r5.a()
            if (r2 != r6) goto L_0x00e6
            RC.r r2 = new RC.r
            r2.<init>()
            r14.u(r2)
        L_0x00e6:
            nI.l r2 = (nI.C17642l) r2
            r14.P()
            r6 = 1
            androidx.compose.ui.d r2 = L1.o.c(r7, r6, r2)
            r8 = 0
            androidx.compose.ui.d r2 = androidx.compose.foundation.layout.J.h(r2, r8, r6, r3)
            androidx.compose.foundation.layout.d r8 = androidx.compose.foundation.layout.C5073d.f18068a
            androidx.compose.foundation.layout.d$f r8 = r8.d()
            i1.c$a r10 = i1.C5437c.f24302a
            i1.c$c r10 = r10.i()
            r4 = 54
            E1.I r4 = androidx.compose.foundation.layout.G.b(r8, r10, r14, r4)
            r8 = 0
            int r10 = U0.C4883j.a(r14, r8)
            U0.y r3 = r14.s()
            androidx.compose.ui.d r2 = androidx.compose.ui.c.e(r14, r2)
            G1.g$a r17 = G1.C4504g.f6515W
            nI.a r6 = r17.a()
            U0.f r18 = r14.m()
            if (r18 != 0) goto L_0x0123
            U0.C4883j.c()
        L_0x0123:
            r14.I()
            boolean r18 = r14.i()
            if (r18 == 0) goto L_0x0130
            r14.p(r6)
            goto L_0x0133
        L_0x0130:
            r14.t()
        L_0x0133:
            U0.m r6 = U0.F1.a(r14)
            nI.p r8 = r17.c()
            U0.F1.c(r6, r4, r8)
            nI.p r4 = r17.e()
            U0.F1.c(r6, r3, r4)
            nI.p r3 = r17.b()
            boolean r4 = r6.i()
            if (r4 != 0) goto L_0x015d
            java.lang.Object r4 = r6.D()
            java.lang.Integer r8 = java.lang.Integer.valueOf(r10)
            boolean r4 = kotlin.jvm.internal.C17542s.e(r4, r8)
            if (r4 != 0) goto L_0x016b
        L_0x015d:
            java.lang.Integer r4 = java.lang.Integer.valueOf(r10)
            r6.u(r4)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r10)
            r6.w(r4, r3)
        L_0x016b:
            nI.p r3 = r17.d()
            U0.F1.c(r6, r2, r3)
            s0.N r17 = s0.C5843N.f28726a
            r2 = 698615802(0x29a407fa, float:7.284447E-14)
            r14.W(r2)
            if (r12 == 0) goto L_0x01b0
            androidx.compose.ui.d$a r2 = androidx.compose.ui.d.f18749a
            r3 = 698617490(0x29a40e92, float:7.2855906E-14)
            r14.W(r3)
            r3 = 57344(0xe000, float:8.0356E-41)
            r3 = r3 & r13
            if (r3 != r11) goto L_0x018c
            r3 = 1
            goto L_0x018d
        L_0x018c:
            r3 = 0
        L_0x018d:
            java.lang.Object r4 = r14.D()
            if (r3 != 0) goto L_0x0199
            java.lang.Object r3 = r5.a()
            if (r4 != r3) goto L_0x01a1
        L_0x0199:
            RC.s r4 = new RC.s
            r4.<init>(r12)
            r14.u(r4)
        L_0x01a1:
            nI.l r4 = (nI.C17642l) r4
            r14.P()
            r3 = 0
            r5 = 1
            r6 = 0
            androidx.compose.ui.d r2 = L1.o.d(r2, r6, r4, r5, r3)
        L_0x01ad:
            r18 = r2
            goto L_0x01b4
        L_0x01b0:
            r5 = 1
            androidx.compose.ui.d$a r2 = androidx.compose.ui.d.f18749a
            goto L_0x01ad
        L_0x01b4:
            r14.P()
            int[] r2 = RC.v.a.f115399a
            int r3 = r9.ordinal()
            r2 = r2[r3]
            if (r2 == r5) goto L_0x01d6
            r3 = 2
            if (r2 == r3) goto L_0x01d1
            r3 = 3
            if (r2 == r3) goto L_0x01d1
            r3 = 4
            if (r2 != r3) goto L_0x01cb
            goto L_0x01d1
        L_0x01cb:
            XH.t r0 = new XH.t
            r0.<init>()
            throw r0
        L_0x01d1:
            TC.b$b$b r2 = TC.C13679b.C2857b.C2858b.f116684a
        L_0x01d3:
            r26 = r2
            goto L_0x01d9
        L_0x01d6:
            TC.b$b$f r2 = TC.C13679b.C2857b.f.f116688a
            goto L_0x01d3
        L_0x01d9:
            r21 = 2
            r22 = 0
            r19 = 1065353216(0x3f800000, float:1.0)
            r20 = 0
            androidx.compose.ui.d r2 = s0.C5842M.e(r17, r18, r19, r20, r21, r22)
            r23 = r13 & 14
            r24 = 0
            r25 = 262136(0x3fff8, float:3.67331E-40)
            r3 = 0
            r5 = 0
            r8 = 0
            r29 = r7
            r7 = r8
            r10 = 0
            r11 = r9
            r9 = r10
            r16 = 0
            r30 = r11
            r10 = r16
            r16 = 0
            r31 = r12
            r12 = r16
            r27 = r13
            r13 = r16
            r34 = r14
            r14 = r16
            r16 = 0
            r15 = r16
            r17 = 0
            r18 = 0
            r19 = 0
            r21 = 0
            r0 = r32
            r1 = r26
            r22 = r34
            SC.C13607l.j(r0, r1, r2, r3, r5, r7, r8, r9, r10, r12, r13, r14, r15, r17, r18, r19, r20, r21, r22, r23, r24, r25)
            r2 = r33
            boolean r0 = r2 instanceof RC.n.a
            if (r0 == 0) goto L_0x023e
            r0 = 182883893(0xae69635, float:2.2204696E-32)
            r1 = r34
            r1.W(r0)
            r0 = r2
            RC.n$a r0 = (RC.n.a) r0
            int r3 = r27 >> 6
            r3 = r3 & 112(0x70, float:1.57E-43)
            r15 = r30
            h(r0, r15, r1, r3)
            r1.P()
            goto L_0x0284
        L_0x023e:
            r1 = r34
            r15 = r30
            boolean r0 = r2 instanceof RC.n.b
            if (r0 == 0) goto L_0x02ae
            r0 = 183077209(0xae98959, float:2.2488748E-32)
            r1.W(r0)
            r0 = r2
            RC.n$b r0 = (RC.n.b) r0
            IC.e r3 = r0.a()
            TC.b$b$b r4 = TC.C13679b.C2857b.C2858b.f116684a
            int r0 = IC.C13023e.f110931a
            r26 = r0 | 48
            r27 = 0
            r28 = 262140(0x3fffc, float:3.67336E-40)
            r5 = 0
            r6 = 0
            r8 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r0 = 0
            r30 = r15
            r15 = r0
            r16 = 0
            r17 = 0
            r18 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r24 = 0
            r25 = r1
            SC.C13607l.i(r3, r4, r5, r6, r8, r10, r11, r12, r13, r15, r16, r17, r18, r20, r21, r22, r23, r24, r25, r26, r27, r28)
            r1.P()
        L_0x0284:
            r1.x()
            boolean r0 = U0.C4895p.J()
            if (r0 == 0) goto L_0x0290
            U0.C4895p.R()
        L_0x0290:
            r3 = r29
            r4 = r30
            r5 = r31
        L_0x0296:
            U0.Y0 r8 = r1.n()
            if (r8 == 0) goto L_0x02ad
            RC.t r9 = new RC.t
            r0 = r9
            r1 = r32
            r2 = r33
            r6 = r38
            r7 = r39
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            r8.a(r9)
        L_0x02ad:
            return
        L_0x02ae:
            r0 = 698634606(0x29a4516e, float:7.297189E-14)
            r1.W(r0)
            r1.P()
            XH.t r0 = new XH.t
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: RC.v.n(java.lang.String, RC.n, androidx.compose.ui.d, SC.S1, java.lang.String, U0.m, int, int):void");
    }

    /* access modifiers changed from: private */
    public static final C16807N o(x xVar) {
        C17542s.j(xVar, "$this$semantics");
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N p(String str, x xVar) {
        C17542s.j(xVar, "$this$semantics");
        L1.v.d0(xVar, str);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N q(String str, n nVar, d dVar, S1 s12, String str2, int i10, int i11, C4889m mVar, int i12) {
        n(str, nVar, dVar, s12, str2, mVar, M0.a(i10 | 1), i11);
        return C16807N.f139792a;
    }
}
