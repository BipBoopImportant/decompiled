package xl;

import U0.C4889m;
import U0.M0;
import XH.C16807N;
import androidx.compose.ui.d;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aI\u0010\n\u001a\u00020\t2\b\b\u0001\u0010\u0001\u001a\u00020\u00002\b\b\u0001\u0010\u0002\u001a\u00020\u00002\b\b\u0001\u0010\u0003\u001a\u00020\u00002\b\b\u0001\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"", "label", "description", "loginButtonText", "signUpButtonText", "Lxl/a;", "loginSignUpActions", "Landroidx/compose/ui/d;", "modifier", "LXH/N;", "d", "(IIIILxl/a;Landroidx/compose/ui/d;LU0/m;II)V", "uicomposables_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class e {
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r20v4, resolved type: nI.a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r20v7, resolved type: nI.a} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:156:0x046c  */
    /* JADX WARNING: Removed duplicated region for block: B:158:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x00cc  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x00d2  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void d(int r41, int r42, int r43, int r44, xl.C12317a r45, androidx.compose.ui.d r46, U0.C4889m r47, int r48, int r49) {
        /*
            r1 = r41
            r2 = r42
            r3 = r43
            r4 = r44
            r5 = r45
            r7 = r48
            r0 = 16
            r6 = 32
            r8 = 2
            r9 = 6
            java.lang.String r10 = "loginSignUpActions"
            kotlin.jvm.internal.C17542s.j(r5, r10)
            r10 = 622741068(0x251e464c, float:1.3728133E-16)
            r11 = r47
            U0.m r14 = r11.k(r10)
            r15 = 1
            r11 = r49 & 1
            r13 = 4
            if (r11 == 0) goto L_0x0029
            r11 = r7 | 6
            goto L_0x0039
        L_0x0029:
            r11 = r7 & 6
            if (r11 != 0) goto L_0x0038
            boolean r11 = r14.d(r1)
            if (r11 == 0) goto L_0x0035
            r11 = r13
            goto L_0x0036
        L_0x0035:
            r11 = r8
        L_0x0036:
            r11 = r11 | r7
            goto L_0x0039
        L_0x0038:
            r11 = r7
        L_0x0039:
            r8 = r49 & 2
            if (r8 == 0) goto L_0x0040
            r11 = r11 | 48
            goto L_0x004e
        L_0x0040:
            r8 = r7 & 48
            if (r8 != 0) goto L_0x004e
            boolean r8 = r14.d(r2)
            if (r8 == 0) goto L_0x004c
            r8 = r6
            goto L_0x004d
        L_0x004c:
            r8 = r0
        L_0x004d:
            r11 = r11 | r8
        L_0x004e:
            r8 = r49 & 4
            if (r8 == 0) goto L_0x0055
            r11 = r11 | 384(0x180, float:5.38E-43)
            goto L_0x0065
        L_0x0055:
            r8 = r7 & 384(0x180, float:5.38E-43)
            if (r8 != 0) goto L_0x0065
            boolean r8 = r14.d(r3)
            if (r8 == 0) goto L_0x0062
            r8 = 256(0x100, float:3.59E-43)
            goto L_0x0064
        L_0x0062:
            r8 = 128(0x80, float:1.794E-43)
        L_0x0064:
            r11 = r11 | r8
        L_0x0065:
            r8 = r49 & 8
            if (r8 == 0) goto L_0x006c
            r11 = r11 | 3072(0xc00, float:4.305E-42)
            goto L_0x007c
        L_0x006c:
            r8 = r7 & 3072(0xc00, float:4.305E-42)
            if (r8 != 0) goto L_0x007c
            boolean r8 = r14.d(r4)
            if (r8 == 0) goto L_0x0079
            r8 = 2048(0x800, float:2.87E-42)
            goto L_0x007b
        L_0x0079:
            r8 = 1024(0x400, float:1.435E-42)
        L_0x007b:
            r11 = r11 | r8
        L_0x007c:
            r0 = r49 & 16
            r37 = 32768(0x8000, float:4.5918E-41)
            if (r0 == 0) goto L_0x0086
            r11 = r11 | 24576(0x6000, float:3.4438E-41)
            goto L_0x009f
        L_0x0086:
            r0 = r7 & 24576(0x6000, float:3.4438E-41)
            if (r0 != 0) goto L_0x009f
            r0 = r7 & r37
            if (r0 != 0) goto L_0x0093
            boolean r0 = r14.V(r5)
            goto L_0x0097
        L_0x0093:
            boolean r0 = r14.F(r5)
        L_0x0097:
            if (r0 == 0) goto L_0x009c
            r0 = 16384(0x4000, float:2.2959E-41)
            goto L_0x009e
        L_0x009c:
            r0 = 8192(0x2000, float:1.14794E-41)
        L_0x009e:
            r11 = r11 | r0
        L_0x009f:
            r0 = r49 & 32
            r6 = 196608(0x30000, float:2.75506E-40)
            if (r0 == 0) goto L_0x00aa
            r11 = r11 | r6
        L_0x00a6:
            r6 = r46
        L_0x00a8:
            r12 = r11
            goto L_0x00bc
        L_0x00aa:
            r6 = r6 & r7
            if (r6 != 0) goto L_0x00a6
            r6 = r46
            boolean r12 = r14.V(r6)
            if (r12 == 0) goto L_0x00b8
            r12 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00ba
        L_0x00b8:
            r12 = 65536(0x10000, float:9.18355E-41)
        L_0x00ba:
            r11 = r11 | r12
            goto L_0x00a8
        L_0x00bc:
            r11 = 74899(0x12493, float:1.04956E-40)
            r11 = r11 & r12
            r13 = 74898(0x12492, float:1.04954E-40)
            if (r11 != r13) goto L_0x00d2
            boolean r11 = r14.l()
            if (r11 != 0) goto L_0x00cc
            goto L_0x00d2
        L_0x00cc:
            r14.L()
            r0 = r14
            goto L_0x0466
        L_0x00d2:
            if (r0 == 0) goto L_0x00d7
            androidx.compose.ui.d$a r0 = androidx.compose.ui.d.f18749a
            goto L_0x00d8
        L_0x00d7:
            r0 = r6
        L_0x00d8:
            boolean r6 = U0.C4895p.J()
            if (r6 == 0) goto L_0x00e4
            r6 = -1
            java.lang.String r11 = "com.ingka.ikea.app.uicomposables.login.LoginSignUpForContent (LoginSignUpForContent.kt:36)"
            U0.C4895p.S(r10, r12, r6, r11)
        L_0x00e4:
            androidx.compose.foundation.layout.d r6 = androidx.compose.foundation.layout.C5073d.f18068a
            r10 = 12
            float r10 = (float) r10
            float r11 = c2.h.B(r10)
            androidx.compose.foundation.layout.d$f r11 = r6.n(r11)
            tK.v r13 = tK.C18030v.f147664a
            int r15 = tK.C18030v.f147665b
            tK.h r13 = r13.a(r14, r15)
            long r17 = r13.l0()
            r20 = 2
            r21 = 0
            r19 = 0
            r16 = r0
            androidx.compose.ui.d r13 = androidx.compose.foundation.b.d(r16, r17, r19, r20, r21)
            r15 = 24
            float r15 = (float) r15
            float r8 = c2.h.B(r15)
            float r15 = c2.h.B(r15)
            androidx.compose.ui.d r8 = androidx.compose.foundation.layout.D.j(r13, r15, r8)
            i1.c$a r38 = i1.C5437c.f24302a
            i1.c$b r13 = r38.k()
            E1.I r11 = androidx.compose.foundation.layout.C5080k.a(r11, r13, r14, r9)
            r15 = 0
            int r13 = U0.C4883j.a(r14, r15)
            U0.y r15 = r14.s()
            androidx.compose.ui.d r8 = androidx.compose.ui.c.e(r14, r8)
            G1.g$a r39 = G1.C4504g.f6515W
            nI.a r9 = r39.a()
            U0.f r16 = r14.m()
            if (r16 != 0) goto L_0x013e
            U0.C4883j.c()
        L_0x013e:
            r14.I()
            boolean r16 = r14.i()
            if (r16 == 0) goto L_0x014b
            r14.p(r9)
            goto L_0x014e
        L_0x014b:
            r14.t()
        L_0x014e:
            U0.m r9 = U0.F1.a(r14)
            r40 = r0
            nI.p r0 = r39.c()
            U0.F1.c(r9, r11, r0)
            nI.p r0 = r39.e()
            U0.F1.c(r9, r15, r0)
            nI.p r0 = r39.b()
            boolean r11 = r9.i()
            if (r11 != 0) goto L_0x017a
            java.lang.Object r11 = r9.D()
            java.lang.Integer r15 = java.lang.Integer.valueOf(r13)
            boolean r11 = kotlin.jvm.internal.C17542s.e(r11, r15)
            if (r11 != 0) goto L_0x0188
        L_0x017a:
            java.lang.Integer r11 = java.lang.Integer.valueOf(r13)
            r9.u(r11)
            java.lang.Integer r11 = java.lang.Integer.valueOf(r13)
            r9.w(r11, r0)
        L_0x0188:
            nI.p r0 = r39.d()
            U0.F1.c(r9, r8, r0)
            s0.h r0 = s0.C5862h.f28810a
            r0 = r12 & 14
            java.lang.String r11 = J1.j.b(r1, r14, r0)
            TC.b$b$f r0 = TC.C13679b.C2857b.f.f116688a
            r8 = r12
            r12 = r0
            androidx.compose.ui.d$a r0 = androidx.compose.ui.d.f18749a
            java.lang.String r9 = "LOGIN_SIGN_UP_FOR_CONTENT_LABEL"
            androidx.compose.ui.d r13 = androidx.compose.ui.platform.C5116k1.a(r0, r9)
            r9 = 4
            r35 = 0
            r36 = 262136(0x3fff8, float:3.67331E-40)
            r15 = 0
            r46 = r14
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
            r28 = 0
            r29 = 0
            r30 = 0
            r31 = 0
            r32 = 0
            r34 = 432(0x1b0, float:6.05E-43)
            r33 = r46
            SC.C13607l.j(r11, r12, r13, r14, r16, r18, r19, r20, r21, r23, r24, r25, r26, r28, r29, r30, r31, r32, r33, r34, r35, r36)
            int r11 = r8 >> 3
            r11 = r11 & 14
            r14 = r46
            java.lang.String r11 = J1.j.b(r2, r14, r11)
            TC.b$a$b r12 = TC.C13679b.a.C2856b.f116680a
            java.lang.String r13 = "LOGIN_SIGN_UP_FOR_CONTENT_DESCRIPTION"
            androidx.compose.ui.d r13 = androidx.compose.ui.platform.C5116k1.a(r0, r13)
            r15 = 0
            r14 = r15
            r16 = 0
            SC.C13607l.j(r11, r12, r13, r14, r16, r18, r19, r20, r21, r23, r24, r25, r26, r28, r29, r30, r31, r32, r33, r34, r35, r36)
            float r9 = (float) r9
            float r9 = c2.h.B(r9)
            androidx.compose.foundation.layout.d$f r9 = r6.n(r9)
            float r17 = c2.h.B(r10)
            r20 = 13
            r21 = 0
            r16 = 0
            r18 = 0
            r19 = 0
            r15 = r0
            androidx.compose.ui.d r10 = androidx.compose.foundation.layout.D.m(r15, r16, r17, r18, r19, r20, r21)
            i1.c$c r11 = r38.l()
            r14 = r46
            r12 = 6
            E1.I r9 = androidx.compose.foundation.layout.G.b(r9, r11, r14, r12)
            r13 = 0
            int r11 = U0.C4883j.a(r14, r13)
            U0.y r12 = r14.s()
            androidx.compose.ui.d r10 = androidx.compose.ui.c.e(r14, r10)
            nI.a r15 = r39.a()
            U0.f r16 = r14.m()
            if (r16 != 0) goto L_0x022c
            U0.C4883j.c()
        L_0x022c:
            r14.I()
            boolean r16 = r14.i()
            if (r16 == 0) goto L_0x0239
            r14.p(r15)
            goto L_0x023c
        L_0x0239:
            r14.t()
        L_0x023c:
            U0.m r15 = U0.F1.a(r14)
            nI.p r13 = r39.c()
            U0.F1.c(r15, r9, r13)
            nI.p r9 = r39.e()
            U0.F1.c(r15, r12, r9)
            nI.p r9 = r39.b()
            boolean r12 = r15.i()
            if (r12 != 0) goto L_0x0266
            java.lang.Object r12 = r15.D()
            java.lang.Integer r13 = java.lang.Integer.valueOf(r11)
            boolean r12 = kotlin.jvm.internal.C17542s.e(r12, r13)
            if (r12 != 0) goto L_0x0274
        L_0x0266:
            java.lang.Integer r12 = java.lang.Integer.valueOf(r11)
            r15.u(r12)
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            r15.w(r11, r9)
        L_0x0274:
            nI.p r9 = r39.d()
            U0.F1.c(r15, r10, r9)
            s0.N r9 = s0.C5843N.f28726a
            r19 = 2
            r20 = 0
            r17 = 1056964608(0x3f000000, float:0.5)
            r18 = 0
            r15 = r9
            r16 = r0
            androidx.compose.ui.d r10 = s0.C5842M.e(r15, r16, r17, r18, r19, r20)
            androidx.compose.foundation.layout.d$m r11 = r6.g()
            i1.c$b r12 = r38.k()
            r13 = 0
            E1.I r11 = androidx.compose.foundation.layout.C5080k.a(r11, r12, r14, r13)
            int r12 = U0.C4883j.a(r14, r13)
            U0.y r15 = r14.s()
            androidx.compose.ui.d r10 = androidx.compose.ui.c.e(r14, r10)
            nI.a r13 = r39.a()
            U0.f r16 = r14.m()
            if (r16 != 0) goto L_0x02b2
            U0.C4883j.c()
        L_0x02b2:
            r14.I()
            boolean r16 = r14.i()
            if (r16 == 0) goto L_0x02bf
            r14.p(r13)
            goto L_0x02c2
        L_0x02bf:
            r14.t()
        L_0x02c2:
            U0.m r13 = U0.F1.a(r14)
            nI.p r1 = r39.c()
            U0.F1.c(r13, r11, r1)
            nI.p r1 = r39.e()
            U0.F1.c(r13, r15, r1)
            nI.p r1 = r39.b()
            boolean r11 = r13.i()
            if (r11 != 0) goto L_0x02ec
            java.lang.Object r11 = r13.D()
            java.lang.Integer r15 = java.lang.Integer.valueOf(r12)
            boolean r11 = kotlin.jvm.internal.C17542s.e(r11, r15)
            if (r11 != 0) goto L_0x02fa
        L_0x02ec:
            java.lang.Integer r11 = java.lang.Integer.valueOf(r12)
            r13.u(r11)
            java.lang.Integer r11 = java.lang.Integer.valueOf(r12)
            r13.w(r11, r1)
        L_0x02fa:
            nI.p r1 = r39.d()
            U0.F1.c(r13, r10, r1)
            r1 = 6
            int r1 = r8 >> 6
            r1 = r1 & 14
            java.lang.String r11 = J1.j.b(r3, r14, r1)
            SC.N r1 = SC.N.Secondary
            SC.M r10 = SC.M.Small
            r15 = 0
            r13 = 0
            r12 = 1
            androidx.compose.ui.d r2 = androidx.compose.foundation.layout.J.h(r0, r15, r12, r13)
            java.lang.String r12 = "LOGIN_SIGN_UP_FOR_CONTENT_LOGIN_BUTTON"
            androidx.compose.ui.d r12 = androidx.compose.ui.platform.C5116k1.a(r2, r12)
            r2 = 1138796181(0x43e0a695, float:449.30142)
            r14.W(r2)
            r2 = 57344(0xe000, float:8.0356E-41)
            r2 = r2 & r8
            r13 = 16384(0x4000, float:2.2959E-41)
            if (r2 == r13) goto L_0x0336
            r13 = r8 & r37
            if (r13 == 0) goto L_0x0334
            boolean r13 = r14.F(r5)
            if (r13 == 0) goto L_0x0334
            goto L_0x0336
        L_0x0334:
            r13 = 0
            goto L_0x0337
        L_0x0336:
            r13 = 1
        L_0x0337:
            java.lang.Object r15 = r14.D()
            if (r13 != 0) goto L_0x0345
            U0.m$a r13 = U0.C4889m.f14007a
            java.lang.Object r13 = r13.a()
            if (r15 != r13) goto L_0x034d
        L_0x0345:
            xl.b r15 = new xl.b
            r15.<init>(r5)
            r14.u(r15)
        L_0x034d:
            r20 = r15
            nI.a r20 = (nI.C17631a) r20
            r14.P()
            r22 = 27696(0x6c30, float:3.881E-41)
            r23 = 484(0x1e4, float:6.78E-43)
            r13 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r15 = 1
            r3 = 0
            r46 = r14
            r14 = r1
            r1 = r15
            r15 = r10
            r21 = r46
            SC.L.b(r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23)
            r46.x()
            r19 = 2
            r20 = 0
            r17 = 1056964608(0x3f000000, float:0.5)
            r18 = 0
            r15 = r9
            r16 = r0
            androidx.compose.ui.d r9 = s0.C5842M.e(r15, r16, r17, r18, r19, r20)
            androidx.compose.foundation.layout.d$m r6 = r6.g()
            i1.c$b r11 = r38.k()
            r15 = r46
            E1.I r6 = androidx.compose.foundation.layout.C5080k.a(r6, r11, r15, r3)
            int r11 = U0.C4883j.a(r15, r3)
            U0.y r12 = r15.s()
            androidx.compose.ui.d r9 = androidx.compose.ui.c.e(r15, r9)
            nI.a r13 = r39.a()
            U0.f r14 = r15.m()
            if (r14 != 0) goto L_0x03a6
            U0.C4883j.c()
        L_0x03a6:
            r15.I()
            boolean r14 = r15.i()
            if (r14 == 0) goto L_0x03b3
            r15.p(r13)
            goto L_0x03b6
        L_0x03b3:
            r15.t()
        L_0x03b6:
            U0.m r13 = U0.F1.a(r15)
            nI.p r14 = r39.c()
            U0.F1.c(r13, r6, r14)
            nI.p r6 = r39.e()
            U0.F1.c(r13, r12, r6)
            nI.p r6 = r39.b()
            boolean r12 = r13.i()
            if (r12 != 0) goto L_0x03e0
            java.lang.Object r12 = r13.D()
            java.lang.Integer r14 = java.lang.Integer.valueOf(r11)
            boolean r12 = kotlin.jvm.internal.C17542s.e(r12, r14)
            if (r12 != 0) goto L_0x03ee
        L_0x03e0:
            java.lang.Integer r12 = java.lang.Integer.valueOf(r11)
            r13.u(r12)
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            r13.w(r11, r6)
        L_0x03ee:
            nI.p r6 = r39.d()
            U0.F1.c(r13, r9, r6)
            int r6 = r8 >> 9
            r6 = r6 & 14
            java.lang.String r11 = J1.j.b(r4, r15, r6)
            SC.N r14 = SC.N.Primary
            r6 = 0
            r9 = 0
            androidx.compose.ui.d r0 = androidx.compose.foundation.layout.J.h(r0, r6, r1, r9)
            java.lang.String r6 = "LOGIN_SIGN_UP_FOR_CONTENT_SIGN_UP_BUTTON"
            androidx.compose.ui.d r12 = androidx.compose.ui.platform.C5116k1.a(r0, r6)
            r0 = 1138812598(0x43e0e6b6, float:449.80243)
            r15.W(r0)
            r0 = 16384(0x4000, float:2.2959E-41)
            if (r2 == r0) goto L_0x0421
            r0 = r8 & r37
            if (r0 == 0) goto L_0x0420
            boolean r0 = r15.F(r5)
            if (r0 == 0) goto L_0x0420
            goto L_0x0421
        L_0x0420:
            r1 = r3
        L_0x0421:
            java.lang.Object r0 = r15.D()
            if (r1 != 0) goto L_0x042f
            U0.m$a r1 = U0.C4889m.f14007a
            java.lang.Object r1 = r1.a()
            if (r0 != r1) goto L_0x0437
        L_0x042f:
            xl.c r0 = new xl.c
            r0.<init>(r5)
            r15.u(r0)
        L_0x0437:
            r20 = r0
            nI.a r20 = (nI.C17631a) r20
            r15.P()
            r22 = 27696(0x6c30, float:3.881E-41)
            r23 = 484(0x1e4, float:6.78E-43)
            r13 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r0 = r15
            r15 = r10
            r21 = r0
            SC.L.b(r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23)
            r0.x()
            r0.x()
            r0.x()
            boolean r1 = U0.C4895p.J()
            if (r1 == 0) goto L_0x0464
            U0.C4895p.R()
        L_0x0464:
            r6 = r40
        L_0x0466:
            U0.Y0 r9 = r0.n()
            if (r9 == 0) goto L_0x0483
            xl.d r10 = new xl.d
            r0 = r10
            r1 = r41
            r2 = r42
            r3 = r43
            r4 = r44
            r5 = r45
            r7 = r48
            r8 = r49
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            r9.a(r10)
        L_0x0483:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: xl.e.d(int, int, int, int, xl.a, androidx.compose.ui.d, U0.m, int, int):void");
    }

    /* access modifiers changed from: private */
    public static final C16807N e(C12317a aVar) {
        aVar.a().invoke();
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N f(C12317a aVar) {
        aVar.b().invoke();
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N g(int i10, int i11, int i12, int i13, C12317a aVar, d dVar, int i14, int i15, C4889m mVar, int i16) {
        d(i10, i11, i12, i13, aVar, dVar, mVar, M0.a(i14 | 1), i15);
        return C16807N.f139792a;
    }
}
