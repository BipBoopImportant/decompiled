package Iv;

import U0.C4889m;
import U0.M0;
import XH.C16807N;
import androidx.compose.ui.d;
import androidx.compose.ui.graphics.c;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import nI.C17631a;
import nI.q;
import p1.C5728l0;
import p1.C5749w0;
import p1.C5751x0;
import r1.C5817c;
import r1.f;
import r1.g;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aM\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00022\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00030\u0007H\u0001¢\u0006\u0004\b\n\u0010\u000b\u001a5\u0010\f\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00022\b\b\u0002\u0010\u0001\u001a\u00020\u0000H\u0003¢\u0006\u0004\b\f\u0010\r\"\u0014\u0010\u0011\u001a\u00020\u000e8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, d2 = {"Landroidx/compose/ui/d;", "modifier", "Lkotlin/Function0;", "LXH/N;", "onVideoReady", "", "requestContentAlpha", "Lkotlin/Function1;", "Ls0/c;", "content", "h", "(Landroidx/compose/ui/d;LnI/a;LnI/a;LnI/q;LU0/m;II)V", "l", "(LnI/a;LnI/a;Landroidx/compose/ui/d;LU0/m;II)V", "Lp1/v0;", "a", "J", "GradientStartColor", "membership-implementation_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class K {

    /* renamed from: a  reason: collision with root package name */
    private static final long f37139a = C5751x0.d(4278230774L);

    /* JADX WARNING: Removed duplicated region for block: B:24:0x004f  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0054  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x006a  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x006e  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x008c  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0095  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x0242  */
    /* JADX WARNING: Removed duplicated region for block: B:99:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void h(androidx.compose.ui.d r24, nI.C17631a<XH.C16807N> r25, nI.C17631a<java.lang.Float> r26, nI.q<? super s0.C5857c, ? super U0.C4889m, ? super java.lang.Integer, XH.C16807N> r27, U0.C4889m r28, int r29, int r30) {
        /*
            r4 = r27
            r5 = r29
            java.lang.String r0 = "content"
            kotlin.jvm.internal.C17542s.j(r4, r0)
            r0 = 1032273764(0x3d873f64, float:0.06603888)
            r1 = r28
            U0.m r1 = r1.k(r0)
            r2 = r30 & 1
            if (r2 == 0) goto L_0x001c
            r3 = r5 | 6
            r6 = r3
            r3 = r24
            goto L_0x0030
        L_0x001c:
            r3 = r5 & 6
            if (r3 != 0) goto L_0x002d
            r3 = r24
            boolean r6 = r1.V(r3)
            if (r6 == 0) goto L_0x002a
            r6 = 4
            goto L_0x002b
        L_0x002a:
            r6 = 2
        L_0x002b:
            r6 = r6 | r5
            goto L_0x0030
        L_0x002d:
            r3 = r24
            r6 = r5
        L_0x0030:
            r7 = r30 & 2
            if (r7 == 0) goto L_0x0039
            r6 = r6 | 48
        L_0x0036:
            r8 = r25
            goto L_0x004b
        L_0x0039:
            r8 = r5 & 48
            if (r8 != 0) goto L_0x0036
            r8 = r25
            boolean r9 = r1.F(r8)
            if (r9 == 0) goto L_0x0048
            r9 = 32
            goto L_0x004a
        L_0x0048:
            r9 = 16
        L_0x004a:
            r6 = r6 | r9
        L_0x004b:
            r9 = r30 & 4
            if (r9 == 0) goto L_0x0054
            r6 = r6 | 384(0x180, float:5.38E-43)
        L_0x0051:
            r10 = r26
            goto L_0x0066
        L_0x0054:
            r10 = r5 & 384(0x180, float:5.38E-43)
            if (r10 != 0) goto L_0x0051
            r10 = r26
            boolean r11 = r1.F(r10)
            if (r11 == 0) goto L_0x0063
            r11 = 256(0x100, float:3.59E-43)
            goto L_0x0065
        L_0x0063:
            r11 = 128(0x80, float:1.794E-43)
        L_0x0065:
            r6 = r6 | r11
        L_0x0066:
            r11 = r30 & 8
            if (r11 == 0) goto L_0x006e
            r6 = r6 | 3072(0xc00, float:4.305E-42)
        L_0x006c:
            r12 = r6
            goto L_0x007f
        L_0x006e:
            r11 = r5 & 3072(0xc00, float:4.305E-42)
            if (r11 != 0) goto L_0x006c
            boolean r11 = r1.F(r4)
            if (r11 == 0) goto L_0x007b
            r11 = 2048(0x800, float:2.87E-42)
            goto L_0x007d
        L_0x007b:
            r11 = 1024(0x400, float:1.435E-42)
        L_0x007d:
            r6 = r6 | r11
            goto L_0x006c
        L_0x007f:
            r6 = r12 & 1171(0x493, float:1.641E-42)
            r11 = 1170(0x492, float:1.64E-42)
            if (r6 != r11) goto L_0x0095
            boolean r6 = r1.l()
            if (r6 != 0) goto L_0x008c
            goto L_0x0095
        L_0x008c:
            r1.L()
            r16 = r3
            r2 = r8
            r3 = r10
            goto L_0x023c
        L_0x0095:
            if (r2 == 0) goto L_0x009a
            androidx.compose.ui.d$a r2 = androidx.compose.ui.d.f18749a
            goto L_0x009b
        L_0x009a:
            r2 = r3
        L_0x009b:
            if (r7 == 0) goto L_0x00bd
            r3 = 1005643641(0x3bf0e779, float:0.0073518124)
            r1.W(r3)
            java.lang.Object r3 = r1.D()
            U0.m$a r6 = U0.C4889m.f14007a
            java.lang.Object r6 = r6.a()
            if (r3 != r6) goto L_0x00b7
            Iv.D r3 = new Iv.D
            r3.<init>()
            r1.u(r3)
        L_0x00b7:
            nI.a r3 = (nI.C17631a) r3
            r1.P()
            goto L_0x00be
        L_0x00bd:
            r3 = r8
        L_0x00be:
            if (r9 == 0) goto L_0x00e1
            r6 = 1005645021(0x3bf0ecdd, float:0.007352455)
            r1.W(r6)
            java.lang.Object r6 = r1.D()
            U0.m$a r7 = U0.C4889m.f14007a
            java.lang.Object r7 = r7.a()
            if (r6 != r7) goto L_0x00da
            Iv.E r6 = new Iv.E
            r6.<init>()
            r1.u(r6)
        L_0x00da:
            nI.a r6 = (nI.C17631a) r6
            r1.P()
            r13 = r6
            goto L_0x00e2
        L_0x00e1:
            r13 = r10
        L_0x00e2:
            boolean r6 = U0.C4895p.J()
            if (r6 == 0) goto L_0x00ee
            r6 = -1
            java.lang.String r7 = "com.ingka.ikea.membership.impl.compose.member.VideoBackgroundBox (VideoBackgroundBox.kt:41)"
            U0.C4895p.S(r0, r12, r6, r7)
        L_0x00ee:
            i1.c$a r0 = i1.C5437c.f24302a
            i1.c r6 = r0.o()
            r14 = 0
            E1.I r6 = androidx.compose.foundation.layout.C5077h.h(r6, r14)
            int r7 = U0.C4883j.a(r1, r14)
            U0.y r8 = r1.s()
            androidx.compose.ui.d r9 = androidx.compose.ui.c.e(r1, r2)
            G1.g$a r15 = G1.C4504g.f6515W
            nI.a r10 = r15.a()
            U0.f r11 = r1.m()
            if (r11 != 0) goto L_0x0114
            U0.C4883j.c()
        L_0x0114:
            r1.I()
            boolean r11 = r1.i()
            if (r11 == 0) goto L_0x0121
            r1.p(r10)
            goto L_0x0124
        L_0x0121:
            r1.t()
        L_0x0124:
            U0.m r10 = U0.F1.a(r1)
            nI.p r11 = r15.c()
            U0.F1.c(r10, r6, r11)
            nI.p r6 = r15.e()
            U0.F1.c(r10, r8, r6)
            nI.p r6 = r15.b()
            boolean r8 = r10.i()
            if (r8 != 0) goto L_0x014e
            java.lang.Object r8 = r10.D()
            java.lang.Integer r11 = java.lang.Integer.valueOf(r7)
            boolean r8 = kotlin.jvm.internal.C17542s.e(r8, r11)
            if (r8 != 0) goto L_0x015c
        L_0x014e:
            java.lang.Integer r8 = java.lang.Integer.valueOf(r7)
            r10.u(r8)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r10.w(r7, r6)
        L_0x015c:
            nI.p r6 = r15.d()
            U0.F1.c(r10, r9, r6)
            androidx.compose.foundation.layout.j r11 = androidx.compose.foundation.layout.C5079j.f18125a
            androidx.compose.ui.d$a r10 = androidx.compose.ui.d.f18749a
            androidx.compose.ui.d r8 = r11.e(r10)
            int r6 = r12 >> 3
            r16 = r6 & 126(0x7e, float:1.77E-43)
            r17 = 0
            r6 = r3
            r7 = r13
            r9 = r1
            r14 = r10
            r10 = r16
            r16 = r2
            r2 = r11
            r11 = r17
            l(r6, r7, r8, r9, r10, r11)
            r6 = 0
            r7 = 0
            r8 = 1
            androidx.compose.ui.d r6 = androidx.compose.foundation.layout.J.h(r14, r6, r8, r7)
            androidx.compose.ui.d r17 = s0.C5852X.e(r6)
            ol.m r6 = ol.m.f100559a
            float r19 = r6.a()
            r6 = 8
            float r6 = (float) r6
            float r21 = c2.h.B(r6)
            r22 = 5
            r23 = 0
            r18 = 0
            r20 = 0
            androidx.compose.ui.d r6 = androidx.compose.foundation.layout.D.m(r17, r18, r19, r20, r21, r22, r23)
            i1.c r7 = r0.d()
            androidx.compose.ui.d r6 = r2.a(r6, r7)
            r7 = r12 & 7168(0x1c00, float:1.0045E-41)
            i1.c r0 = r0.o()
            r8 = 0
            E1.I r0 = androidx.compose.foundation.layout.C5077h.h(r0, r8)
            int r8 = U0.C4883j.a(r1, r8)
            U0.y r9 = r1.s()
            androidx.compose.ui.d r6 = androidx.compose.ui.c.e(r1, r6)
            nI.a r10 = r15.a()
            U0.f r11 = r1.m()
            if (r11 != 0) goto L_0x01cf
            U0.C4883j.c()
        L_0x01cf:
            r1.I()
            boolean r11 = r1.i()
            if (r11 == 0) goto L_0x01dc
            r1.p(r10)
            goto L_0x01df
        L_0x01dc:
            r1.t()
        L_0x01df:
            U0.m r10 = U0.F1.a(r1)
            nI.p r11 = r15.c()
            U0.F1.c(r10, r0, r11)
            nI.p r0 = r15.e()
            U0.F1.c(r10, r9, r0)
            nI.p r0 = r15.b()
            boolean r9 = r10.i()
            if (r9 != 0) goto L_0x0209
            java.lang.Object r9 = r10.D()
            java.lang.Integer r11 = java.lang.Integer.valueOf(r8)
            boolean r9 = kotlin.jvm.internal.C17542s.e(r9, r11)
            if (r9 != 0) goto L_0x0217
        L_0x0209:
            java.lang.Integer r9 = java.lang.Integer.valueOf(r8)
            r10.u(r9)
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            r10.w(r8, r0)
        L_0x0217:
            nI.p r0 = r15.d()
            U0.F1.c(r10, r6, r0)
            int r0 = r7 >> 6
            r0 = r0 & 112(0x70, float:1.57E-43)
            r0 = r0 | 6
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r4.invoke(r2, r1, r0)
            r1.x()
            r1.x()
            boolean r0 = U0.C4895p.J()
            if (r0 == 0) goto L_0x023a
            U0.C4895p.R()
        L_0x023a:
            r2 = r3
            r3 = r13
        L_0x023c:
            U0.Y0 r7 = r1.n()
            if (r7 == 0) goto L_0x0253
            Iv.F r8 = new Iv.F
            r0 = r8
            r1 = r16
            r4 = r27
            r5 = r29
            r6 = r30
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r7.a(r8)
        L_0x0253:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: Iv.K.h(androidx.compose.ui.d, nI.a, nI.a, nI.q, U0.m, int, int):void");
    }

    /* access modifiers changed from: private */
    public static final C16807N i() {
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final float j() {
        return 1.0f;
    }

    /* access modifiers changed from: private */
    public static final C16807N k(d dVar, C17631a aVar, C17631a aVar2, q qVar, int i10, int i11, C4889m mVar, int i12) {
        h(dVar, aVar, aVar2, qVar, mVar, M0.a(i10 | 1), i11);
        return C16807N.f139792a;
    }

    /* JADX WARNING: Removed duplicated region for block: B:36:0x006b  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0071  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x0236  */
    /* JADX WARNING: Removed duplicated region for block: B:88:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static final void l(nI.C17631a<XH.C16807N> r25, nI.C17631a<java.lang.Float> r26, androidx.compose.ui.d r27, U0.C4889m r28, int r29, int r30) {
        /*
            r2 = r26
            r4 = r29
            r0 = 2
            r1 = 4
            r3 = 813966724(0x30842584, float:9.614927E-10)
            r5 = r28
            U0.m r13 = r5.k(r3)
            r5 = 1
            r6 = r30 & 1
            if (r6 == 0) goto L_0x0019
            r6 = r4 | 6
            r14 = r25
            goto L_0x002b
        L_0x0019:
            r6 = r4 & 6
            r14 = r25
            if (r6 != 0) goto L_0x002a
            boolean r6 = r13.F(r14)
            if (r6 == 0) goto L_0x0027
            r6 = r1
            goto L_0x0028
        L_0x0027:
            r6 = r0
        L_0x0028:
            r6 = r6 | r4
            goto L_0x002b
        L_0x002a:
            r6 = r4
        L_0x002b:
            r0 = r30 & 2
            r7 = 32
            if (r0 == 0) goto L_0x0034
            r6 = r6 | 48
            goto L_0x0043
        L_0x0034:
            r0 = r4 & 48
            if (r0 != 0) goto L_0x0043
            boolean r0 = r13.F(r2)
            if (r0 == 0) goto L_0x0040
            r0 = r7
            goto L_0x0042
        L_0x0040:
            r0 = 16
        L_0x0042:
            r6 = r6 | r0
        L_0x0043:
            r0 = r30 & 4
            if (r0 == 0) goto L_0x004c
            r6 = r6 | 384(0x180, float:5.38E-43)
        L_0x0049:
            r1 = r27
            goto L_0x005e
        L_0x004c:
            r1 = r4 & 384(0x180, float:5.38E-43)
            if (r1 != 0) goto L_0x0049
            r1 = r27
            boolean r8 = r13.V(r1)
            if (r8 == 0) goto L_0x005b
            r8 = 256(0x100, float:3.59E-43)
            goto L_0x005d
        L_0x005b:
            r8 = 128(0x80, float:1.794E-43)
        L_0x005d:
            r6 = r6 | r8
        L_0x005e:
            r8 = r6 & 147(0x93, float:2.06E-43)
            r9 = 146(0x92, float:2.05E-43)
            if (r8 != r9) goto L_0x0071
            boolean r8 = r13.l()
            if (r8 != 0) goto L_0x006b
            goto L_0x0071
        L_0x006b:
            r13.L()
            r3 = r1
            goto L_0x0230
        L_0x0071:
            if (r0 == 0) goto L_0x0076
            androidx.compose.ui.d$a r0 = androidx.compose.ui.d.f18749a
            goto L_0x0077
        L_0x0076:
            r0 = r1
        L_0x0077:
            boolean r1 = U0.C4895p.J()
            if (r1 == 0) goto L_0x0083
            r1 = -1
            java.lang.String r8 = "com.ingka.ikea.membership.impl.compose.member.VideoFrame (VideoBackgroundBox.kt:68)"
            U0.C4895p.S(r3, r6, r1, r8)
        L_0x0083:
            r1 = 0
            tK.h r3 = SC.C13575d.a(r13, r1)
            long r8 = r3.D0()
            tK.h r3 = SC.C13575d.a(r13, r1)
            long r15 = r3.D0()
            r3 = -462112925(0xffffffffe474b763, float:-1.805688E22)
            r13.W(r3)
            java.lang.Object r3 = r13.D()
            U0.m$a r10 = U0.C4889m.f14007a
            java.lang.Object r11 = r10.a()
            if (r3 != r11) goto L_0x00f6
            p1.l0$a r3 = p1.C5728l0.f27325b
            r11 = 0
            java.lang.Float r11 = java.lang.Float.valueOf(r11)
            long r17 = f37139a
            r23 = 14
            r24 = 0
            r19 = 1056964608(0x3f000000, float:0.5)
            r20 = 0
            r21 = 0
            r22 = 0
            long r17 = p1.C5747v0.o(r17, r19, r20, r21, r22, r23, r24)
            p1.v0 r12 = p1.C5747v0.k(r17)
            XH.v r11 = XH.C16796C.a(r11, r12)
            r12 = 1065353216(0x3f800000, float:1.0)
            java.lang.Float r12 = java.lang.Float.valueOf(r12)
            r21 = 14
            r22 = 0
            r17 = 1056964608(0x3f000000, float:0.5)
            r18 = 0
            r19 = 0
            long r15 = p1.C5747v0.o(r15, r17, r18, r19, r20, r21, r22)
            p1.v0 r15 = p1.C5747v0.k(r15)
            XH.v r12 = XH.C16796C.a(r12, r15)
            XH.v[] r18 = new XH.v[]{r11, r12}
            r22 = 14
            r23 = 0
            r21 = 0
            r17 = r3
            p1.l0 r3 = p1.C5728l0.a.m(r17, r18, r19, r20, r21, r22, r23)
            r13.u(r3)
        L_0x00f6:
            p1.l0 r3 = (p1.C5728l0) r3
            r13.P()
            U0.I0 r11 = androidx.compose.ui.platform.C5135u0.a()
            java.lang.Object r11 = r13.Q(r11)
            java.lang.Boolean r11 = (java.lang.Boolean) r11
            boolean r11 = r11.booleanValue()
            if (r11 == 0) goto L_0x0140
            r5 = -1440372516(0xffffffffaa25a8dc, float:-1.4713529E-13)
            r13.W(r5)
            r5 = -462102295(0xffffffffe474e0e9, float:-1.8068848E22)
            r13.W(r5)
            boolean r5 = r13.e(r8)
            java.lang.Object r6 = r13.D()
            if (r5 != 0) goto L_0x0127
            java.lang.Object r5 = r10.a()
            if (r6 != r5) goto L_0x012f
        L_0x0127:
            Iv.G r6 = new Iv.G
            r6.<init>(r8, r3)
            r13.u(r6)
        L_0x012f:
            nI.l r6 = (nI.C17642l) r6
            r13.P()
            androidx.compose.ui.d r3 = androidx.compose.ui.draw.b.b(r0, r6)
            androidx.compose.foundation.layout.C5077h.a(r3, r13, r1)
            r13.P()
            goto L_0x0226
        L_0x0140:
            r11 = -1440136544(0xffffffffaa2942a0, float:-1.503333E-13)
            r13.W(r11)
            r11 = -462096181(0xffffffffe474f8cb, float:-1.8075732E22)
            r13.W(r11)
            boolean r11 = r13.e(r8)
            java.lang.Object r12 = r13.D()
            if (r11 != 0) goto L_0x015c
            java.lang.Object r11 = r10.a()
            if (r12 != r11) goto L_0x0164
        L_0x015c:
            Iv.H r12 = new Iv.H
            r12.<init>(r8, r3)
            r13.u(r12)
        L_0x0164:
            nI.l r12 = (nI.C17642l) r12
            r13.P()
            androidx.compose.ui.d r3 = androidx.compose.ui.draw.b.d(r0, r12)
            i1.c$a r8 = i1.C5437c.f24302a
            i1.c r8 = r8.o()
            E1.I r8 = androidx.compose.foundation.layout.C5077h.h(r8, r1)
            int r9 = U0.C4883j.a(r13, r1)
            U0.y r11 = r13.s()
            androidx.compose.ui.d r3 = androidx.compose.ui.c.e(r13, r3)
            G1.g$a r12 = G1.C4504g.f6515W
            nI.a r15 = r12.a()
            U0.f r16 = r13.m()
            if (r16 != 0) goto L_0x0192
            U0.C4883j.c()
        L_0x0192:
            r13.I()
            boolean r16 = r13.i()
            if (r16 == 0) goto L_0x019f
            r13.p(r15)
            goto L_0x01a2
        L_0x019f:
            r13.t()
        L_0x01a2:
            U0.m r15 = U0.F1.a(r13)
            nI.p r1 = r12.c()
            U0.F1.c(r15, r8, r1)
            nI.p r1 = r12.e()
            U0.F1.c(r15, r11, r1)
            nI.p r1 = r12.b()
            boolean r8 = r15.i()
            if (r8 != 0) goto L_0x01cc
            java.lang.Object r8 = r15.D()
            java.lang.Integer r11 = java.lang.Integer.valueOf(r9)
            boolean r8 = kotlin.jvm.internal.C17542s.e(r8, r11)
            if (r8 != 0) goto L_0x01da
        L_0x01cc:
            java.lang.Integer r8 = java.lang.Integer.valueOf(r9)
            r15.u(r8)
            java.lang.Integer r8 = java.lang.Integer.valueOf(r9)
            r15.w(r8, r1)
        L_0x01da:
            nI.p r1 = r12.d()
            U0.F1.c(r15, r3, r1)
            androidx.compose.foundation.layout.j r1 = androidx.compose.foundation.layout.C5079j.f18125a
            int r1 = yv.C9007l.f58127a
            androidx.compose.ui.d$a r3 = androidx.compose.ui.d.f18749a
            r8 = 1073887864(0x40023a78, float:2.0348186)
            r13.W(r8)
            r8 = r6 & 112(0x70, float:1.57E-43)
            if (r8 != r7) goto L_0x01f2
            goto L_0x01f3
        L_0x01f2:
            r5 = 0
        L_0x01f3:
            java.lang.Object r7 = r13.D()
            if (r5 != 0) goto L_0x01ff
            java.lang.Object r5 = r10.a()
            if (r7 != r5) goto L_0x0207
        L_0x01ff:
            Iv.I r7 = new Iv.I
            r7.<init>(r2)
            r13.u(r7)
        L_0x0207:
            nI.l r7 = (nI.C17642l) r7
            r13.P()
            androidx.compose.ui.d r3 = androidx.compose.ui.graphics.b.a(r3, r7)
            int r5 = r6 << 9
            r11 = r5 & 7168(0x1c00, float:1.0045E-41)
            r12 = 20
            r7 = 0
            r9 = 0
            r5 = r1
            r6 = r3
            r8 = r25
            r10 = r13
            ZC.C13892o.n(r5, r6, r7, r8, r9, r10, r11, r12)
            r13.x()
            r13.P()
        L_0x0226:
            boolean r1 = U0.C4895p.J()
            if (r1 == 0) goto L_0x022f
            U0.C4895p.R()
        L_0x022f:
            r3 = r0
        L_0x0230:
            U0.Y0 r6 = r13.n()
            if (r6 == 0) goto L_0x0247
            Iv.J r7 = new Iv.J
            r0 = r7
            r1 = r25
            r2 = r26
            r4 = r29
            r5 = r30
            r0.<init>(r1, r2, r3, r4, r5)
            r6.a(r7)
        L_0x0247:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: Iv.K.l(nI.a, nI.a, androidx.compose.ui.d, U0.m, int, int):void");
    }

    /* access modifiers changed from: private */
    public static final C16807N m(long j10, C5728l0 l0Var, C5817c cVar) {
        C17542s.j(cVar, "$this$drawWithContent");
        C5817c cVar2 = cVar;
        f.q1(cVar2, j10, 0, 0, 0.0f, (g) null, (C5749w0) null, 0, 126, (Object) null);
        cVar.V1();
        f.M0(cVar2, l0Var, 0, 0, 0.0f, (g) null, (C5749w0) null, 0, 126, (Object) null);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N n(C17631a aVar, c cVar) {
        C17542s.j(cVar, "$this$graphicsLayer");
        cVar.d(((Number) aVar.invoke()).floatValue() * 0.75f);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N o(C17631a aVar, C17631a aVar2, d dVar, int i10, int i11, C4889m mVar, int i12) {
        l(aVar, aVar2, dVar, mVar, M0.a(i10 | 1), i11);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N p(long j10, C5728l0 l0Var, f fVar) {
        C17542s.j(fVar, "$this$drawBehind");
        f fVar2 = fVar;
        f.q1(fVar2, j10, 0, 0, 0.0f, (g) null, (C5749w0) null, 0, 126, (Object) null);
        f.M0(fVar2, l0Var, 0, 0, 0.0f, (g) null, (C5749w0) null, 0, 126, (Object) null);
        return C16807N.f139792a;
    }
}
