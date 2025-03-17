package ts;

import SC.N;
import U0.C4889m;
import U0.M0;
import XH.C16807N;
import androidx.compose.ui.d;
import kotlin.Metadata;
import nI.C17631a;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u001a5\u0010\u0006\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\u0006\u0010\u0007\u001a'\u0010\b\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\b\u0010\t\u001ag\u0010\u0014\u001a\u00020\u00012\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\n2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\n\b\u0003\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0010\b\u0002\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0000H\u0003¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lkotlin/Function0;", "LXH/N;", "onEnableClick", "onDismissClick", "Landroidx/compose/ui/d;", "modifier", "d", "(LnI/a;LnI/a;Landroidx/compose/ui/d;LU0/m;II)V", "h", "(LnI/a;Landroidx/compose/ui/d;LU0/m;II)V", "", "title", "body", "buttonText", "onButtonClick", "LSC/N;", "buttonVariant", "", "iconRes", "onDismissClicked", "f", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;LnI/a;Landroidx/compose/ui/d;LSC/N;Ljava/lang/Integer;LnI/a;LU0/m;II)V", "inbox-implementation_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class e {
    /* JADX WARNING: Removed duplicated region for block: B:36:0x006f  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0073  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00d1  */
    /* JADX WARNING: Removed duplicated region for block: B:51:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void d(nI.C17631a<XH.C16807N> r16, nI.C17631a<XH.C16807N> r17, androidx.compose.ui.d r18, U0.C4889m r19, int r20, int r21) {
        /*
            r11 = r16
            r12 = r17
            r13 = r20
            java.lang.String r0 = "onEnableClick"
            kotlin.jvm.internal.C17542s.j(r11, r0)
            java.lang.String r0 = "onDismissClick"
            kotlin.jvm.internal.C17542s.j(r12, r0)
            r0 = -1775521842(0xffffffff962bafce, float:-1.3868744E-25)
            r1 = r19
            U0.m r14 = r1.k(r0)
            r1 = r21 & 1
            if (r1 == 0) goto L_0x0020
            r1 = r13 | 6
            goto L_0x0030
        L_0x0020:
            r1 = r13 & 6
            if (r1 != 0) goto L_0x002f
            boolean r1 = r14.F(r11)
            if (r1 == 0) goto L_0x002c
            r1 = 4
            goto L_0x002d
        L_0x002c:
            r1 = 2
        L_0x002d:
            r1 = r1 | r13
            goto L_0x0030
        L_0x002f:
            r1 = r13
        L_0x0030:
            r2 = r21 & 2
            if (r2 == 0) goto L_0x0037
            r1 = r1 | 48
            goto L_0x0047
        L_0x0037:
            r2 = r13 & 48
            if (r2 != 0) goto L_0x0047
            boolean r2 = r14.F(r12)
            if (r2 == 0) goto L_0x0044
            r2 = 32
            goto L_0x0046
        L_0x0044:
            r2 = 16
        L_0x0046:
            r1 = r1 | r2
        L_0x0047:
            r2 = r21 & 4
            if (r2 == 0) goto L_0x0050
            r1 = r1 | 384(0x180, float:5.38E-43)
        L_0x004d:
            r3 = r18
            goto L_0x0062
        L_0x0050:
            r3 = r13 & 384(0x180, float:5.38E-43)
            if (r3 != 0) goto L_0x004d
            r3 = r18
            boolean r4 = r14.V(r3)
            if (r4 == 0) goto L_0x005f
            r4 = 256(0x100, float:3.59E-43)
            goto L_0x0061
        L_0x005f:
            r4 = 128(0x80, float:1.794E-43)
        L_0x0061:
            r1 = r1 | r4
        L_0x0062:
            r4 = r1 & 147(0x93, float:2.06E-43)
            r5 = 146(0x92, float:2.05E-43)
            if (r4 != r5) goto L_0x0073
            boolean r4 = r14.l()
            if (r4 != 0) goto L_0x006f
            goto L_0x0073
        L_0x006f:
            r14.L()
            goto L_0x00cb
        L_0x0073:
            if (r2 == 0) goto L_0x0079
            androidx.compose.ui.d$a r2 = androidx.compose.ui.d.f18749a
            r15 = r2
            goto L_0x007a
        L_0x0079:
            r15 = r3
        L_0x007a:
            boolean r2 = U0.C4895p.J()
            if (r2 == 0) goto L_0x0086
            r2 = -1
            java.lang.String r3 = "com.ingka.ikea.inbox.impl.compose.components.EnableNotificationsMessage (EnableNotificationsMessage.kt:46)"
            U0.C4895p.S(r0, r1, r2, r3)
        L_0x0086:
            int r0 = qs.d.f102005q
            r2 = 0
            java.lang.String r0 = J1.j.b(r0, r14, r2)
            int r3 = qs.d.f102003o
            java.lang.String r3 = J1.j.b(r3, r14, r2)
            int r4 = uK.C18146a.f148660u0
            int r5 = qs.d.f102004p
            java.lang.String r2 = J1.j.b(r5, r14, r2)
            SC.N r5 = SC.N.Primary
            java.lang.Integer r6 = java.lang.Integer.valueOf(r4)
            int r4 = r1 << 9
            r4 = r4 & 7168(0x1c00, float:1.0045E-41)
            r7 = 196608(0x30000, float:2.75506E-40)
            r4 = r4 | r7
            r7 = 57344(0xe000, float:8.0356E-41)
            int r8 = r1 << 6
            r7 = r7 & r8
            r4 = r4 | r7
            int r1 = r1 << 18
            r7 = 29360128(0x1c00000, float:7.052966E-38)
            r1 = r1 & r7
            r9 = r4 | r1
            r10 = 0
            r1 = r3
            r3 = r16
            r4 = r15
            r7 = r17
            r8 = r14
            f(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            boolean r0 = U0.C4895p.J()
            if (r0 == 0) goto L_0x00ca
            U0.C4895p.R()
        L_0x00ca:
            r3 = r15
        L_0x00cb:
            U0.Y0 r6 = r14.n()
            if (r6 == 0) goto L_0x00e2
            ts.d r7 = new ts.d
            r0 = r7
            r1 = r16
            r2 = r17
            r4 = r20
            r5 = r21
            r0.<init>(r1, r2, r3, r4, r5)
            r6.a(r7)
        L_0x00e2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ts.e.d(nI.a, nI.a, androidx.compose.ui.d, U0.m, int, int):void");
    }

    /* access modifiers changed from: private */
    public static final C16807N e(C17631a aVar, C17631a aVar2, d dVar, int i10, int i11, C4889m mVar, int i12) {
        d(aVar, aVar2, dVar, mVar, M0.a(i10 | 1), i11);
        return C16807N.f139792a;
    }

    /* JADX WARNING: Removed duplicated region for block: B:144:0x03da  */
    /* JADX WARNING: Removed duplicated region for block: B:146:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0051  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0056  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x006b  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0070  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0086  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x008b  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00a3  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00a8  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x00c1  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x00c6  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x00de  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x00e3  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x0107  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x0112  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static final void f(java.lang.String r40, java.lang.String r41, java.lang.String r42, nI.C17631a<XH.C16807N> r43, androidx.compose.ui.d r44, SC.N r45, java.lang.Integer r46, nI.C17631a<XH.C16807N> r47, U0.C4889m r48, int r49, int r50) {
        /*
            r9 = r49
            r10 = r50
            r0 = 128(0x80, float:1.794E-43)
            r1 = 32
            r2 = 16
            r3 = 2
            r4 = 6
            r5 = 1505148440(0x59b6be18, float:6.429682E15)
            r6 = r48
            U0.m r6 = r6.k(r5)
            r7 = 1
            r8 = r10 & 1
            r14 = 4
            if (r8 == 0) goto L_0x0021
            r8 = r9 | 6
            r11 = r8
            r8 = r40
            goto L_0x0035
        L_0x0021:
            r8 = r9 & 6
            if (r8 != 0) goto L_0x0032
            r8 = r40
            boolean r11 = r6.V(r8)
            if (r11 == 0) goto L_0x002f
            r11 = r14
            goto L_0x0030
        L_0x002f:
            r11 = r3
        L_0x0030:
            r11 = r11 | r9
            goto L_0x0035
        L_0x0032:
            r8 = r40
            r11 = r9
        L_0x0035:
            r3 = r3 & r10
            if (r3 == 0) goto L_0x003d
            r11 = r11 | 48
        L_0x003a:
            r3 = r41
            goto L_0x004d
        L_0x003d:
            r3 = r9 & 48
            if (r3 != 0) goto L_0x003a
            r3 = r41
            boolean r12 = r6.V(r3)
            if (r12 == 0) goto L_0x004b
            r12 = r1
            goto L_0x004c
        L_0x004b:
            r12 = r2
        L_0x004c:
            r11 = r11 | r12
        L_0x004d:
            r12 = r10 & 4
            if (r12 == 0) goto L_0x0056
            r11 = r11 | 384(0x180, float:5.38E-43)
            r15 = r42
            goto L_0x0067
        L_0x0056:
            r12 = r9 & 384(0x180, float:5.38E-43)
            r15 = r42
            if (r12 != 0) goto L_0x0067
            boolean r12 = r6.V(r15)
            if (r12 == 0) goto L_0x0065
            r12 = 256(0x100, float:3.59E-43)
            goto L_0x0066
        L_0x0065:
            r12 = r0
        L_0x0066:
            r11 = r11 | r12
        L_0x0067:
            r12 = r10 & 8
            if (r12 == 0) goto L_0x0070
            r11 = r11 | 3072(0xc00, float:4.305E-42)
            r13 = r43
            goto L_0x0082
        L_0x0070:
            r12 = r9 & 3072(0xc00, float:4.305E-42)
            r13 = r43
            if (r12 != 0) goto L_0x0082
            boolean r12 = r6.F(r13)
            if (r12 == 0) goto L_0x007f
            r12 = 2048(0x800, float:2.87E-42)
            goto L_0x0081
        L_0x007f:
            r12 = 1024(0x400, float:1.435E-42)
        L_0x0081:
            r11 = r11 | r12
        L_0x0082:
            r12 = r10 & 16
            if (r12 == 0) goto L_0x008b
            r11 = r11 | 24576(0x6000, float:3.4438E-41)
        L_0x0088:
            r14 = r44
            goto L_0x009e
        L_0x008b:
            r14 = r9 & 24576(0x6000, float:3.4438E-41)
            if (r14 != 0) goto L_0x0088
            r14 = r44
            boolean r16 = r6.V(r14)
            if (r16 == 0) goto L_0x009a
            r16 = 16384(0x4000, float:2.2959E-41)
            goto L_0x009c
        L_0x009a:
            r16 = 8192(0x2000, float:1.14794E-41)
        L_0x009c:
            r11 = r11 | r16
        L_0x009e:
            r1 = r1 & r10
            r16 = 196608(0x30000, float:2.75506E-40)
            if (r1 == 0) goto L_0x00a8
            r11 = r11 | r16
            r4 = r45
            goto L_0x00bb
        L_0x00a8:
            r16 = r9 & r16
            r4 = r45
            if (r16 != 0) goto L_0x00bb
            boolean r16 = r6.V(r4)
            if (r16 == 0) goto L_0x00b7
            r16 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00b9
        L_0x00b7:
            r16 = 65536(0x10000, float:9.18355E-41)
        L_0x00b9:
            r11 = r11 | r16
        L_0x00bb:
            r16 = r10 & 64
            r17 = 1572864(0x180000, float:2.204052E-39)
            if (r16 == 0) goto L_0x00c6
            r11 = r11 | r17
            r7 = r46
            goto L_0x00d9
        L_0x00c6:
            r17 = r9 & r17
            r7 = r46
            if (r17 != 0) goto L_0x00d9
            boolean r17 = r6.V(r7)
            if (r17 == 0) goto L_0x00d5
            r17 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00d7
        L_0x00d5:
            r17 = 524288(0x80000, float:7.34684E-40)
        L_0x00d7:
            r11 = r11 | r17
        L_0x00d9:
            r0 = r0 & r10
            r17 = 12582912(0xc00000, float:1.7632415E-38)
            if (r0 == 0) goto L_0x00e3
            r11 = r11 | r17
            r2 = r47
            goto L_0x00f6
        L_0x00e3:
            r17 = r9 & r17
            r2 = r47
            if (r17 != 0) goto L_0x00f6
            boolean r17 = r6.F(r2)
            if (r17 == 0) goto L_0x00f2
            r17 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x00f4
        L_0x00f2:
            r17 = 4194304(0x400000, float:5.877472E-39)
        L_0x00f4:
            r11 = r11 | r17
        L_0x00f6:
            r17 = 4793491(0x492493, float:6.717112E-39)
            r5 = r11 & r17
            r2 = 4793490(0x492492, float:6.71711E-39)
            if (r5 != r2) goto L_0x0112
            boolean r2 = r6.l()
            if (r2 != 0) goto L_0x0107
            goto L_0x0112
        L_0x0107:
            r6.L()
            r8 = r47
            r38 = r7
            r5 = r14
            r7 = r4
            goto L_0x03d4
        L_0x0112:
            if (r12 == 0) goto L_0x0117
            androidx.compose.ui.d$a r2 = androidx.compose.ui.d.f18749a
            goto L_0x0118
        L_0x0117:
            r2 = r14
        L_0x0118:
            if (r1 == 0) goto L_0x011d
            SC.N r1 = SC.N.Primary
            goto L_0x011e
        L_0x011d:
            r1 = r4
        L_0x011e:
            r4 = 0
            if (r16 == 0) goto L_0x0122
            r7 = r4
        L_0x0122:
            if (r0 == 0) goto L_0x0126
            r0 = r4
            goto L_0x0128
        L_0x0126:
            r0 = r47
        L_0x0128:
            boolean r5 = U0.C4895p.J()
            if (r5 == 0) goto L_0x0137
            r5 = -1
            java.lang.String r12 = "com.ingka.ikea.inbox.impl.compose.components.GenericInlineHint (EnableNotificationsMessage.kt:84)"
            r14 = 1505148440(0x59b6be18, float:6.429682E15)
            U0.C4895p.S(r14, r11, r5, r12)
        L_0x0137:
            if (r7 == 0) goto L_0x0141
            r5 = 16
            float r12 = (float) r5
            float r5 = c2.h.B(r12)
            goto L_0x0148
        L_0x0141:
            r5 = 20
            float r5 = (float) r5
            float r5 = c2.h.B(r5)
        L_0x0148:
            r14 = 0
            r12 = 1
            androidx.compose.ui.d r20 = androidx.compose.foundation.layout.J.h(r2, r14, r12, r4)
            tK.v r12 = tK.C18030v.f147664a
            int r4 = tK.C18030v.f147665b
            tK.h r4 = r12.a(r6, r4)
            long r21 = r4.l0()
            r24 = 2
            r25 = 0
            r23 = 0
            androidx.compose.ui.d r4 = androidx.compose.foundation.b.d(r20, r21, r23, r24, r25)
            androidx.compose.foundation.layout.d r20 = androidx.compose.foundation.layout.C5073d.f18068a
            androidx.compose.foundation.layout.d$e r12 = r20.f()
            i1.c$a r21 = i1.C5437c.f24302a
            i1.c$c r14 = r21.l()
            r37 = r2
            r2 = 0
            E1.I r12 = androidx.compose.foundation.layout.G.b(r12, r14, r6, r2)
            int r14 = U0.C4883j.a(r6, r2)
            U0.y r2 = r6.s()
            androidx.compose.ui.d r4 = androidx.compose.ui.c.e(r6, r4)
            G1.g$a r22 = G1.C4504g.f6515W
            nI.a r3 = r22.a()
            U0.f r16 = r6.m()
            if (r16 != 0) goto L_0x0192
            U0.C4883j.c()
        L_0x0192:
            r6.I()
            boolean r16 = r6.i()
            if (r16 == 0) goto L_0x019f
            r6.p(r3)
            goto L_0x01a2
        L_0x019f:
            r6.t()
        L_0x01a2:
            U0.m r3 = U0.F1.a(r6)
            nI.p r8 = r22.c()
            U0.F1.c(r3, r12, r8)
            nI.p r8 = r22.e()
            U0.F1.c(r3, r2, r8)
            nI.p r2 = r22.b()
            boolean r8 = r3.i()
            if (r8 != 0) goto L_0x01cc
            java.lang.Object r8 = r3.D()
            java.lang.Integer r12 = java.lang.Integer.valueOf(r14)
            boolean r8 = kotlin.jvm.internal.C17542s.e(r8, r12)
            if (r8 != 0) goto L_0x01da
        L_0x01cc:
            java.lang.Integer r8 = java.lang.Integer.valueOf(r14)
            r3.u(r8)
            java.lang.Integer r8 = java.lang.Integer.valueOf(r14)
            r3.w(r8, r2)
        L_0x01da:
            nI.p r2 = r22.d()
            U0.F1.c(r3, r4, r2)
            s0.N r2 = s0.C5843N.f28726a
            androidx.compose.ui.d$a r3 = androidx.compose.ui.d.f18749a
            androidx.compose.ui.d r4 = androidx.compose.foundation.layout.J.t(r3, r5)
            r8 = 0
            s0.C5844O.a(r4, r6, r8)
            r4 = -1799844256(0xffffffff94b88e60, float:-1.8635409E-26)
            r6.W(r4)
            r4 = 24
            if (r7 == 0) goto L_0x023d
            int r12 = uK.C18146a.f148660u0
            t1.c r12 = J1.e.c(r12, r6, r8)
            tK.h r14 = Cs.a.a(r6, r8)
            long r16 = r14.G0()
            float r8 = (float) r4
            float r8 = c2.h.B(r8)
            r38 = r7
            r4 = 0
            r7 = 0
            r14 = 1
            androidx.compose.ui.d r8 = androidx.compose.foundation.layout.D.k(r3, r7, r8, r14, r4)
            java.lang.String r4 = "HintTestTag-Icon"
            androidx.compose.ui.d r4 = androidx.compose.ui.platform.C5116k1.a(r8, r4)
            r8 = 432(0x1b0, float:6.05E-43)
            r18 = 0
            r14 = 0
            r39 = r11
            r11 = r12
            r12 = r14
            r13 = r4
            r4 = 4
            r14 = r16
            r16 = r6
            r17 = r8
            O0.V.a(r11, r12, r13, r14, r16, r17, r18)
            r8 = 16
            float r11 = (float) r8
            float r8 = c2.h.B(r11)
            androidx.compose.ui.d r8 = androidx.compose.foundation.layout.J.y(r3, r8)
            r11 = 6
            s0.C5844O.a(r8, r6, r11)
            goto L_0x0243
        L_0x023d:
            r38 = r7
            r39 = r11
            r4 = 4
            r7 = 0
        L_0x0243:
            r6.P()
            r16 = 2
            r17 = 0
            r14 = 1065353216(0x3f800000, float:1.0)
            r15 = 0
            r12 = r2
            r13 = r3
            androidx.compose.ui.d r2 = s0.C5842M.e(r12, r13, r14, r15, r16, r17)
            r8 = 24
            float r8 = (float) r8
            float r8 = c2.h.B(r8)
            r11 = 1
            r12 = 0
            androidx.compose.ui.d r2 = androidx.compose.foundation.layout.D.k(r2, r7, r8, r11, r12)
            androidx.compose.foundation.layout.d$m r7 = r20.g()
            i1.c$b r8 = r21.k()
            r11 = 0
            E1.I r7 = androidx.compose.foundation.layout.C5080k.a(r7, r8, r6, r11)
            int r8 = U0.C4883j.a(r6, r11)
            U0.y r11 = r6.s()
            androidx.compose.ui.d r2 = androidx.compose.ui.c.e(r6, r2)
            nI.a r12 = r22.a()
            U0.f r13 = r6.m()
            if (r13 != 0) goto L_0x0286
            U0.C4883j.c()
        L_0x0286:
            r6.I()
            boolean r13 = r6.i()
            if (r13 == 0) goto L_0x0293
            r6.p(r12)
            goto L_0x0296
        L_0x0293:
            r6.t()
        L_0x0296:
            U0.m r12 = U0.F1.a(r6)
            nI.p r13 = r22.c()
            U0.F1.c(r12, r7, r13)
            nI.p r7 = r22.e()
            U0.F1.c(r12, r11, r7)
            nI.p r7 = r22.b()
            boolean r11 = r12.i()
            if (r11 != 0) goto L_0x02c0
            java.lang.Object r11 = r12.D()
            java.lang.Integer r13 = java.lang.Integer.valueOf(r8)
            boolean r11 = kotlin.jvm.internal.C17542s.e(r11, r13)
            if (r11 != 0) goto L_0x02ce
        L_0x02c0:
            java.lang.Integer r11 = java.lang.Integer.valueOf(r8)
            r12.u(r11)
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            r12.w(r8, r7)
        L_0x02ce:
            nI.p r7 = r22.d()
            U0.F1.c(r12, r2, r7)
            s0.h r2 = s0.C5862h.f28810a
            TC.b$b$c r12 = TC.C13679b.C2857b.c.f116685a
            r2 = 0
            tK.h r7 = Cs.a.a(r6, r2)
            long r14 = r7.G0()
            java.lang.String r2 = "HintTestTag-Title"
            androidx.compose.ui.d r13 = androidx.compose.ui.platform.C5116k1.a(r3, r2)
            r2 = r39 & 14
            r2 = r2 | 432(0x1b0, float:6.05E-43)
            r34 = r2
            r35 = 0
            r36 = 262128(0x3fff0, float:3.6732E-40)
            r16 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r23 = 0
            r24 = 0
            r25 = 0
            r26 = 0
            r28 = 0
            r29 = 0
            r30 = 0
            r31 = 0
            r32 = 0
            r11 = r40
            r33 = r6
            SC.C13607l.j(r11, r12, r13, r14, r16, r18, r19, r20, r21, r23, r24, r25, r26, r28, r29, r30, r31, r32, r33, r34, r35, r36)
            float r2 = (float) r4
            float r2 = c2.h.B(r2)
            androidx.compose.ui.d r2 = androidx.compose.foundation.layout.J.i(r3, r2)
            r4 = 6
            s0.C5844O.a(r2, r6, r4)
            TC.b$a$b r12 = TC.C13679b.a.C2856b.f116680a
            r2 = 0
            tK.h r4 = Cs.a.a(r6, r2)
            long r14 = r4.G0()
            java.lang.String r2 = "HintTestTag-Body"
            androidx.compose.ui.d r13 = androidx.compose.ui.platform.C5116k1.a(r3, r2)
            int r2 = r39 >> 3
            r2 = r2 & 14
            r2 = r2 | 432(0x1b0, float:6.05E-43)
            r34 = r2
            r11 = r41
            SC.C13607l.j(r11, r12, r13, r14, r16, r18, r19, r20, r21, r23, r24, r25, r26, r28, r29, r30, r31, r32, r33, r34, r35, r36)
            r2 = 16
            float r2 = (float) r2
            float r2 = c2.h.B(r2)
            androidx.compose.ui.d r2 = androidx.compose.foundation.layout.J.i(r3, r2)
            r4 = 6
            s0.C5844O.a(r2, r6, r4)
            SC.M r15 = SC.M.Small
            java.lang.String r2 = "HintTestTag-Button"
            androidx.compose.ui.d r12 = androidx.compose.ui.platform.C5116k1.a(r3, r2)
            int r2 = r39 >> 6
            r4 = r2 & 14
            r4 = r4 | 24624(0x6030, float:3.4506E-41)
            r2 = r2 & 7168(0x1c00, float:1.0045E-41)
            r2 = r2 | r4
            int r4 = r39 << 18
            r7 = 1879048192(0x70000000, float:1.58456325E29)
            r4 = r4 & r7
            r22 = r2 | r4
            r23 = 484(0x1e4, float:6.78E-43)
            r13 = 0
            r16 = 0
            r17 = 0
            r11 = r42
            r14 = r1
            r20 = r43
            r21 = r6
            SC.L.b(r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23)
            r6.x()
            if (r0 == 0) goto L_0x03b3
            r2 = 40756157(0x26de3bd, float:1.7477368E-37)
            r6.W(r2)
            int r11 = uK.C18146a.f148142M2
            int r2 = Oo.b.f84665i
            r4 = 0
            java.lang.String r12 = J1.j.b(r2, r6, r4)
            SC.H0 r15 = SC.H0.Tertiary
            SC.G0 r16 = SC.G0.Small
            java.lang.String r2 = "HintTestTag-Dismiss"
            androidx.compose.ui.d r13 = androidx.compose.ui.platform.C5116k1.a(r3, r2)
            r2 = 234881024(0xe000000, float:1.5777218E-30)
            int r3 = r39 << 3
            r2 = r2 & r3
            r3 = 221568(0x36180, float:3.10483E-40)
            r21 = r2 | r3
            r22 = 200(0xc8, float:2.8E-43)
            r14 = 0
            r17 = 0
            r18 = 0
            r19 = r0
            r20 = r6
            SC.F0.b(r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
            r6.P()
            goto L_0x03c4
        L_0x03b3:
            r2 = 41181167(0x2745fef, float:1.795382E-37)
            r6.W(r2)
            androidx.compose.ui.d r2 = androidx.compose.foundation.layout.J.t(r3, r5)
            r3 = 0
            s0.C5844O.a(r2, r6, r3)
            r6.P()
        L_0x03c4:
            r6.x()
            boolean r2 = U0.C4895p.J()
            if (r2 == 0) goto L_0x03d0
            U0.C4895p.R()
        L_0x03d0:
            r8 = r0
            r7 = r1
            r5 = r37
        L_0x03d4:
            U0.Y0 r11 = r6.n()
            if (r11 == 0) goto L_0x03f2
            ts.c r12 = new ts.c
            r0 = r12
            r1 = r40
            r2 = r41
            r3 = r42
            r4 = r43
            r6 = r7
            r7 = r38
            r9 = r49
            r10 = r50
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            r11.a(r12)
        L_0x03f2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ts.e.f(java.lang.String, java.lang.String, java.lang.String, nI.a, androidx.compose.ui.d, SC.N, java.lang.Integer, nI.a, U0.m, int, int):void");
    }

    /* access modifiers changed from: private */
    public static final C16807N g(String str, String str2, String str3, C17631a aVar, d dVar, N n10, Integer num, C17631a aVar2, int i10, int i11, C4889m mVar, int i12) {
        f(str, str2, str3, aVar, dVar, n10, num, aVar2, mVar, M0.a(i10 | 1), i11);
        return C16807N.f139792a;
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x0053  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0058  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00a8  */
    /* JADX WARNING: Removed duplicated region for block: B:40:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void h(nI.C17631a<XH.C16807N> r16, androidx.compose.ui.d r17, U0.C4889m r18, int r19, int r20) {
        /*
            r11 = r16
            r12 = r19
            r13 = r20
            java.lang.String r0 = "onEnableClick"
            kotlin.jvm.internal.C17542s.j(r11, r0)
            r0 = -739754080(0xffffffffd3e83fa0, float:-1.99499973E12)
            r1 = r18
            U0.m r14 = r1.k(r0)
            r1 = r13 & 1
            if (r1 == 0) goto L_0x001b
            r1 = r12 | 6
            goto L_0x002b
        L_0x001b:
            r1 = r12 & 6
            if (r1 != 0) goto L_0x002a
            boolean r1 = r14.F(r11)
            if (r1 == 0) goto L_0x0027
            r1 = 4
            goto L_0x0028
        L_0x0027:
            r1 = 2
        L_0x0028:
            r1 = r1 | r12
            goto L_0x002b
        L_0x002a:
            r1 = r12
        L_0x002b:
            r2 = r13 & 2
            if (r2 == 0) goto L_0x0034
            r1 = r1 | 48
        L_0x0031:
            r3 = r17
            goto L_0x0046
        L_0x0034:
            r3 = r12 & 48
            if (r3 != 0) goto L_0x0031
            r3 = r17
            boolean r4 = r14.V(r3)
            if (r4 == 0) goto L_0x0043
            r4 = 32
            goto L_0x0045
        L_0x0043:
            r4 = 16
        L_0x0045:
            r1 = r1 | r4
        L_0x0046:
            r4 = r1 & 19
            r5 = 18
            if (r4 != r5) goto L_0x0058
            boolean r4 = r14.l()
            if (r4 != 0) goto L_0x0053
            goto L_0x0058
        L_0x0053:
            r14.L()
            r15 = r3
            goto L_0x00a2
        L_0x0058:
            if (r2 == 0) goto L_0x005e
            androidx.compose.ui.d$a r2 = androidx.compose.ui.d.f18749a
            r15 = r2
            goto L_0x005f
        L_0x005e:
            r15 = r3
        L_0x005f:
            boolean r2 = U0.C4895p.J()
            if (r2 == 0) goto L_0x006b
            r2 = -1
            java.lang.String r3 = "com.ingka.ikea.inbox.impl.compose.components.NotificationsTurnedOffMessage (EnableNotificationsMessage.kt:63)"
            U0.C4895p.S(r0, r1, r2, r3)
        L_0x006b:
            int r0 = qs.d.f102009u
            r2 = 0
            java.lang.String r0 = J1.j.b(r0, r14, r2)
            int r3 = qs.d.f102007s
            java.lang.String r3 = J1.j.b(r3, r14, r2)
            int r4 = qs.d.f102008t
            java.lang.String r2 = J1.j.b(r4, r14, r2)
            SC.N r5 = SC.N.Secondary
            int r1 = r1 << 9
            r4 = r1 & 7168(0x1c00, float:1.0045E-41)
            r6 = 196608(0x30000, float:2.75506E-40)
            r4 = r4 | r6
            r6 = 57344(0xe000, float:8.0356E-41)
            r1 = r1 & r6
            r9 = r4 | r1
            r10 = 192(0xc0, float:2.69E-43)
            r6 = 0
            r7 = 0
            r1 = r3
            r3 = r16
            r4 = r15
            r8 = r14
            f(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            boolean r0 = U0.C4895p.J()
            if (r0 == 0) goto L_0x00a2
            U0.C4895p.R()
        L_0x00a2:
            U0.Y0 r0 = r14.n()
            if (r0 == 0) goto L_0x00b0
            ts.b r1 = new ts.b
            r1.<init>(r11, r15, r12, r13)
            r0.a(r1)
        L_0x00b0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ts.e.h(nI.a, androidx.compose.ui.d, U0.m, int, int):void");
    }

    /* access modifiers changed from: private */
    public static final C16807N i(C17631a aVar, d dVar, int i10, int i11, C4889m mVar, int i12) {
        h(aVar, dVar, mVar, M0.a(i10 | 1), i11);
        return C16807N.f139792a;
    }
}
