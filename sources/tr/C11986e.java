package tr;

import U0.C4889m;
import U0.M0;
import XH.C16807N;
import androidx.compose.ui.d;
import c2.h;
import kotlin.Metadata;
import nI.C17631a;

@Metadata(d1 = {"\u0000&\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a9\u0010\t\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\t\u0010\n\"\u0014\u0010\u000e\u001a\u00020\u000b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u000f"}, d2 = {"", "points", "Lkotlin/Function0;", "LXH/N;", "onClick", "Landroidx/compose/ui/d;", "modifier", "", "loading", "b", "(ILnI/a;Landroidx/compose/ui/d;ZLU0/m;II)V", "Lc2/h;", "a", "F", "MinWidth", "familyrewards_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* renamed from: tr.e  reason: case insensitive filesystem */
public final class C11986e {

    /* renamed from: a  reason: collision with root package name */
    private static final float f103359a = h.B((float) 160);

    /* JADX WARNING: Removed duplicated region for block: B:34:0x0065  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x006b  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x008b  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0093  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x02c4  */
    /* JADX WARNING: Removed duplicated region for block: B:94:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void b(int r29, nI.C17631a<XH.C16807N> r30, androidx.compose.ui.d r31, boolean r32, U0.C4889m r33, int r34, int r35) {
        /*
            r9 = r30
            r10 = r34
            java.lang.String r0 = "onClick"
            kotlin.jvm.internal.C17542s.j(r9, r0)
            r0 = 1607459773(0x5fcfe3bd, float:2.996005E19)
            r1 = r33
            U0.m r15 = r1.k(r0)
            r1 = r35 & 1
            r2 = 2
            if (r1 == 0) goto L_0x001c
            r1 = r10 | 6
            r14 = r29
            goto L_0x002e
        L_0x001c:
            r1 = r10 & 6
            r14 = r29
            if (r1 != 0) goto L_0x002d
            boolean r1 = r15.d(r14)
            if (r1 == 0) goto L_0x002a
            r1 = 4
            goto L_0x002b
        L_0x002a:
            r1 = r2
        L_0x002b:
            r1 = r1 | r10
            goto L_0x002e
        L_0x002d:
            r1 = r10
        L_0x002e:
            r3 = r35 & 2
            r13 = 16
            if (r3 == 0) goto L_0x0037
            r1 = r1 | 48
            goto L_0x0046
        L_0x0037:
            r3 = r10 & 48
            if (r3 != 0) goto L_0x0046
            boolean r3 = r15.F(r9)
            if (r3 == 0) goto L_0x0044
            r3 = 32
            goto L_0x0045
        L_0x0044:
            r3 = r13
        L_0x0045:
            r1 = r1 | r3
        L_0x0046:
            r3 = r35 & 4
            if (r3 == 0) goto L_0x004f
            r1 = r1 | 384(0x180, float:5.38E-43)
        L_0x004c:
            r4 = r31
            goto L_0x0061
        L_0x004f:
            r4 = r10 & 384(0x180, float:5.38E-43)
            if (r4 != 0) goto L_0x004c
            r4 = r31
            boolean r5 = r15.V(r4)
            if (r5 == 0) goto L_0x005e
            r5 = 256(0x100, float:3.59E-43)
            goto L_0x0060
        L_0x005e:
            r5 = 128(0x80, float:1.794E-43)
        L_0x0060:
            r1 = r1 | r5
        L_0x0061:
            r5 = r35 & 8
            if (r5 == 0) goto L_0x006b
            r1 = r1 | 3072(0xc00, float:4.305E-42)
        L_0x0067:
            r6 = r32
        L_0x0069:
            r12 = r1
            goto L_0x007e
        L_0x006b:
            r6 = r10 & 3072(0xc00, float:4.305E-42)
            if (r6 != 0) goto L_0x0067
            r6 = r32
            boolean r7 = r15.b(r6)
            if (r7 == 0) goto L_0x007a
            r7 = 2048(0x800, float:2.87E-42)
            goto L_0x007c
        L_0x007a:
            r7 = 1024(0x400, float:1.435E-42)
        L_0x007c:
            r1 = r1 | r7
            goto L_0x0069
        L_0x007e:
            r1 = r12 & 1171(0x493, float:1.641E-42)
            r7 = 1170(0x492, float:1.64E-42)
            if (r1 != r7) goto L_0x0093
            boolean r1 = r15.l()
            if (r1 != 0) goto L_0x008b
            goto L_0x0093
        L_0x008b:
            r15.L()
            r3 = r4
            r4 = r6
            r14 = r15
            goto L_0x02be
        L_0x0093:
            if (r3 == 0) goto L_0x0099
            androidx.compose.ui.d$a r1 = androidx.compose.ui.d.f18749a
            r11 = r1
            goto L_0x009a
        L_0x0099:
            r11 = r4
        L_0x009a:
            r8 = 0
            if (r5 == 0) goto L_0x00a0
            r27 = r8
            goto L_0x00a2
        L_0x00a0:
            r27 = r6
        L_0x00a2:
            boolean r1 = U0.C4895p.J()
            if (r1 == 0) goto L_0x00ae
            r1 = -1
            java.lang.String r3 = "com.ingka.ikea.familyrewards.presentation.entrypoint.RewardsHubEntryPoint (RewardsHubEntryPoint.kt:49)"
            U0.C4895p.S(r0, r12, r1, r3)
        L_0x00ae:
            java.lang.String r0 = "RewardsHubEntryPointTestTag-Root"
            androidx.compose.ui.d r0 = androidx.compose.ui.platform.C5116k1.a(r11, r0)
            float r1 = f103359a
            r3 = 0
            r4 = 0
            androidx.compose.ui.d r0 = androidx.compose.foundation.layout.J.A(r0, r1, r3, r2, r4)
            r1 = -674531699(0xffffffffd7cb768d, float:-4.47420064E14)
            r15.W(r1)
            java.lang.Object r1 = r15.D()
            U0.m$a r2 = U0.C4889m.f14007a
            java.lang.Object r2 = r2.a()
            if (r1 != r2) goto L_0x00d5
            r0.m r1 = r0.l.a()
            r15.u(r1)
        L_0x00d5:
            r0.m r1 = (r0.m) r1
            r15.P()
            tK.h r2 = SC.C13575d.a(r15, r8)
            long r18 = r2.x0()
            r20 = 3
            r21 = 0
            r16 = 0
            r17 = 0
            n0.I r2 = O0.C4756u0.c(r16, r17, r18, r20, r21)
            int r3 = Oo.b.f84636f3
            java.lang.String r4 = J1.j.b(r3, r15, r8)
            r7 = 20
            r16 = 0
            r3 = 0
            r5 = 0
            r6 = r30
            r14 = r8
            r8 = r16
            androidx.compose.ui.d r0 = androidx.compose.foundation.d.b(r0, r1, r2, r3, r4, r5, r6, r7, r8)
            i1.c$a r1 = i1.C5437c.f24302a
            i1.c r2 = r1.o()
            E1.I r2 = androidx.compose.foundation.layout.C5077h.h(r2, r14)
            int r3 = U0.C4883j.a(r15, r14)
            U0.y r4 = r15.s()
            androidx.compose.ui.d r0 = androidx.compose.ui.c.e(r15, r0)
            G1.g$a r5 = G1.C4504g.f6515W
            nI.a r6 = r5.a()
            U0.f r7 = r15.m()
            if (r7 != 0) goto L_0x0128
            U0.C4883j.c()
        L_0x0128:
            r15.I()
            boolean r7 = r15.i()
            if (r7 == 0) goto L_0x0135
            r15.p(r6)
            goto L_0x0138
        L_0x0135:
            r15.t()
        L_0x0138:
            U0.m r6 = U0.F1.a(r15)
            nI.p r7 = r5.c()
            U0.F1.c(r6, r2, r7)
            nI.p r2 = r5.e()
            U0.F1.c(r6, r4, r2)
            nI.p r2 = r5.b()
            boolean r4 = r6.i()
            if (r4 != 0) goto L_0x0162
            java.lang.Object r4 = r6.D()
            java.lang.Integer r7 = java.lang.Integer.valueOf(r3)
            boolean r4 = kotlin.jvm.internal.C17542s.e(r4, r7)
            if (r4 != 0) goto L_0x0170
        L_0x0162:
            java.lang.Integer r4 = java.lang.Integer.valueOf(r3)
            r6.u(r4)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r6.w(r3, r2)
        L_0x0170:
            nI.p r2 = r5.d()
            U0.F1.c(r6, r0, r2)
            androidx.compose.foundation.layout.j r0 = androidx.compose.foundation.layout.C5079j.f18125a
            androidx.compose.ui.d$a r8 = androidx.compose.ui.d.f18749a
            androidx.compose.ui.d r16 = r0.e(r8)
            tK.h r0 = SC.C13575d.a(r15, r14)
            long r17 = r0.B0()
            r20 = 2
            r21 = 0
            r19 = 0
            androidx.compose.ui.d r0 = androidx.compose.foundation.b.d(r16, r17, r19, r20, r21)
            tr.a r2 = tr.C11982a.f103346a
            nI.q r22 = r2.a()
            r25 = 48
            r26 = 1528(0x5f8, float:2.141E-42)
            java.lang.String r2 = "https://shop.static.ingka.ikea.com/family-rewards/main/header_background.png"
            r3 = 0
            r4 = 0
            r6 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 1
            r24 = 805306422(0x30000036, float:4.656643E-10)
            r28 = r11
            r11 = r2
            r7 = r12
            r12 = r3
            r2 = r13
            r13 = r0
            r0 = r14
            r14 = r4
            r4 = r15
            r15 = r6
            r23 = r4
            LC.h.c(r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)
            androidx.compose.foundation.layout.d r3 = androidx.compose.foundation.layout.C5073d.f18068a
            androidx.compose.foundation.layout.d$m r3 = r3.g()
            i1.c$b r1 = r1.k()
            E1.I r1 = androidx.compose.foundation.layout.C5080k.a(r3, r1, r4, r0)
            int r3 = U0.C4883j.a(r4, r0)
            U0.y r6 = r4.s()
            androidx.compose.ui.d r11 = androidx.compose.ui.c.e(r4, r8)
            nI.a r12 = r5.a()
            U0.f r13 = r4.m()
            if (r13 != 0) goto L_0x01e4
            U0.C4883j.c()
        L_0x01e4:
            r4.I()
            boolean r13 = r4.i()
            if (r13 == 0) goto L_0x01f1
            r4.p(r12)
            goto L_0x01f4
        L_0x01f1:
            r4.t()
        L_0x01f4:
            U0.m r12 = U0.F1.a(r4)
            nI.p r13 = r5.c()
            U0.F1.c(r12, r1, r13)
            nI.p r1 = r5.e()
            U0.F1.c(r12, r6, r1)
            nI.p r1 = r5.b()
            boolean r6 = r12.i()
            if (r6 != 0) goto L_0x021e
            java.lang.Object r6 = r12.D()
            java.lang.Integer r13 = java.lang.Integer.valueOf(r3)
            boolean r6 = kotlin.jvm.internal.C17542s.e(r6, r13)
            if (r6 != 0) goto L_0x022c
        L_0x021e:
            java.lang.Integer r6 = java.lang.Integer.valueOf(r3)
            r12.u(r6)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r12.w(r3, r1)
        L_0x022c:
            nI.p r1 = r5.d()
            U0.F1.c(r12, r11, r1)
            s0.h r16 = s0.C5862h.f28810a
            int r1 = uK.C18146a.f148445g
            t1.c r1 = J1.e.c(r1, r4, r0)
            tK.h r3 = SC.C13575d.a(r4, r0)
            long r5 = r3.G0()
            float r11 = (float) r2
            float r2 = c2.h.B(r11)
            androidx.compose.ui.d r2 = androidx.compose.foundation.layout.D.i(r8, r2)
            r3 = 40
            float r3 = (float) r3
            float r3 = c2.h.B(r3)
            androidx.compose.ui.d r2 = androidx.compose.foundation.layout.J.t(r2, r3)
            tK.h r3 = SC.C13575d.a(r4, r0)
            long r12 = r3.k0()
            A0.f r3 = A0.g.h()
            androidx.compose.ui.d r2 = androidx.compose.foundation.b.c(r2, r12, r3)
            r3 = 8
            float r3 = (float) r3
            float r3 = c2.h.B(r3)
            androidx.compose.ui.d r3 = androidx.compose.foundation.layout.D.i(r2, r3)
            r12 = 48
            r13 = 0
            r2 = 0
            r14 = r4
            r4 = r5
            r6 = r14
            r15 = r7
            r7 = r12
            r12 = r8
            r8 = r13
            O0.V.a(r1, r2, r3, r4, r6, r7, r8)
            r20 = 2
            r21 = 0
            r18 = 1065353216(0x3f800000, float:1.0)
            r19 = 0
            r17 = r12
            androidx.compose.ui.d r1 = s0.C5861g.c(r16, r17, r18, r19, r20, r21)
            s0.C5844O.a(r1, r14, r0)
            float r0 = c2.h.B(r11)
            androidx.compose.ui.d r2 = androidx.compose.foundation.layout.D.i(r12, r0)
            r0 = r15 & 14
            r0 = r0 | 48
            r1 = r15 & 7168(0x1c00, float:1.0045E-41)
            r7 = r0 | r1
            r8 = 4
            r3 = 0
            r1 = r29
            r5 = r27
            sr.k.b(r1, r2, r3, r5, r6, r7, r8)
            r14.x()
            r14.x()
            boolean r0 = U0.C4895p.J()
            if (r0 == 0) goto L_0x02ba
            U0.C4895p.R()
        L_0x02ba:
            r4 = r27
            r3 = r28
        L_0x02be:
            U0.Y0 r7 = r14.n()
            if (r7 == 0) goto L_0x02d5
            tr.d r8 = new tr.d
            r0 = r8
            r1 = r29
            r2 = r30
            r5 = r34
            r6 = r35
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r7.a(r8)
        L_0x02d5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: tr.C11986e.b(int, nI.a, androidx.compose.ui.d, boolean, U0.m, int, int):void");
    }

    /* access modifiers changed from: private */
    public static final C16807N c(int i10, C17631a aVar, d dVar, boolean z10, int i11, int i12, C4889m mVar, int i13) {
        b(i10, aVar, dVar, z10, mVar, M0.a(i11 | 1), i12);
        return C16807N.f139792a;
    }
}
