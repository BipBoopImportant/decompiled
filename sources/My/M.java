package my;

import E1.I;
import G1.C4504g;
import Rl.f;
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
import androidx.compose.foundation.layout.G;
import androidx.compose.foundation.layout.J;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import androidx.recyclerview.widget.RecyclerView;
import com.google.ar.core.ImageMetadata;
import i1.C5437c;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import nI.C17631a;
import nI.p;
import ny.C14857c;
import s0.C5842M;
import s0.C5843N;
import s0.C5844O;
import s0.C5862h;
import tK.C18029u;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\u001a;\u0010\b\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0001¢\u0006\u0004\b\b\u0010\t\u001a9\u0010\f\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\n2\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0001¢\u0006\u0004\b\f\u0010\r\u001aM\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000e2\b\b\u0002\u0010\u000b\u001a\u00020\n2\u000e\b\u0002\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0001¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lny/c$a;", "state", "LT0/d;", "widthSizeClass", "Lkotlin/Function0;", "LXH/N;", "onOpenSelection", "onContinueClick", "l", "(Lny/c$a;ILnI/a;LnI/a;LU0/m;I)V", "Landroidx/compose/ui/d;", "modifier", "f", "(Lny/c$a;ILandroidx/compose/ui/d;LnI/a;LU0/m;II)V", "", "selectMarketName", "selectedLanguageName", "onOpenLanguageSelection", "i", "(Lny/c$a;ILjava/lang/String;Ljava/lang/String;Landroidx/compose/ui/d;LnI/a;LU0/m;II)V", "regionsettings-implementation_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class M {
    /* JADX WARNING: Removed duplicated region for block: B:101:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0062  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0067  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0086  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x008e  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x02c0  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void f(ny.C14857c.a r36, int r37, androidx.compose.ui.d r38, nI.C17631a<XH.C16807N> r39, U0.C4889m r40, int r41, int r42) {
        /*
            r1 = r36
            r2 = r37
            r5 = r41
            java.lang.String r0 = "state"
            kotlin.jvm.internal.C17542s.j(r1, r0)
            r0 = -1985886562(0xffffffff89a1c69e, float:-3.894612E-33)
            r3 = r40
            U0.m r3 = r3.k(r0)
            r4 = r42 & 1
            r6 = 4
            if (r4 == 0) goto L_0x001c
            r4 = r5 | 6
            goto L_0x002c
        L_0x001c:
            r4 = r5 & 6
            if (r4 != 0) goto L_0x002b
            boolean r4 = r3.F(r1)
            if (r4 == 0) goto L_0x0028
            r4 = r6
            goto L_0x0029
        L_0x0028:
            r4 = 2
        L_0x0029:
            r4 = r4 | r5
            goto L_0x002c
        L_0x002b:
            r4 = r5
        L_0x002c:
            r7 = r42 & 2
            if (r7 == 0) goto L_0x0033
            r4 = r4 | 48
            goto L_0x0043
        L_0x0033:
            r7 = r5 & 48
            if (r7 != 0) goto L_0x0043
            boolean r7 = r3.d(r2)
            if (r7 == 0) goto L_0x0040
            r7 = 32
            goto L_0x0042
        L_0x0040:
            r7 = 16
        L_0x0042:
            r4 = r4 | r7
        L_0x0043:
            r7 = r42 & 4
            if (r7 == 0) goto L_0x004c
            r4 = r4 | 384(0x180, float:5.38E-43)
        L_0x0049:
            r8 = r38
            goto L_0x005e
        L_0x004c:
            r8 = r5 & 384(0x180, float:5.38E-43)
            if (r8 != 0) goto L_0x0049
            r8 = r38
            boolean r9 = r3.V(r8)
            if (r9 == 0) goto L_0x005b
            r9 = 256(0x100, float:3.59E-43)
            goto L_0x005d
        L_0x005b:
            r9 = 128(0x80, float:1.794E-43)
        L_0x005d:
            r4 = r4 | r9
        L_0x005e:
            r9 = r42 & 8
            if (r9 == 0) goto L_0x0067
            r4 = r4 | 3072(0xc00, float:4.305E-42)
        L_0x0064:
            r10 = r39
            goto L_0x0079
        L_0x0067:
            r10 = r5 & 3072(0xc00, float:4.305E-42)
            if (r10 != 0) goto L_0x0064
            r10 = r39
            boolean r11 = r3.F(r10)
            if (r11 == 0) goto L_0x0076
            r11 = 2048(0x800, float:2.87E-42)
            goto L_0x0078
        L_0x0076:
            r11 = 1024(0x400, float:1.435E-42)
        L_0x0078:
            r4 = r4 | r11
        L_0x0079:
            r11 = r4 & 1171(0x493, float:1.641E-42)
            r12 = 1170(0x492, float:1.64E-42)
            if (r11 != r12) goto L_0x008e
            boolean r11 = r3.l()
            if (r11 != 0) goto L_0x0086
            goto L_0x008e
        L_0x0086:
            r3.L()
            r35 = r8
            r4 = r10
            goto L_0x02ba
        L_0x008e:
            if (r7 == 0) goto L_0x0094
            androidx.compose.ui.d$a r7 = androidx.compose.ui.d.f18749a
            r15 = r7
            goto L_0x0095
        L_0x0094:
            r15 = r8
        L_0x0095:
            if (r9 == 0) goto L_0x00b9
            r7 = 692817183(0x294b8d1f, float:4.5197458E-14)
            r3.W(r7)
            java.lang.Object r7 = r3.D()
            U0.m$a r8 = U0.C4889m.f14007a
            java.lang.Object r8 = r8.a()
            if (r7 != r8) goto L_0x00b1
            my.K r7 = new my.K
            r7.<init>()
            r3.u(r7)
        L_0x00b1:
            nI.a r7 = (nI.C17631a) r7
            r3.P()
            r32 = r7
            goto L_0x00bb
        L_0x00b9:
            r32 = r10
        L_0x00bb:
            boolean r7 = U0.C4895p.J()
            if (r7 == 0) goto L_0x00c7
            r7 = -1
            java.lang.String r8 = "com.ingka.ikea.regionsettings.impl.ui.region.ContinueButton (RegionSelectBottomButtons.kt:97)"
            U0.C4895p.S(r0, r4, r7, r8)
        L_0x00c7:
            T0.d$a r0 = T0.d.f13504b
            int r0 = r0.d()
            boolean r0 = T0.d.F(r2, r0)
            if (r0 == 0) goto L_0x00ea
            tK.u r4 = tK.C18029u.f147649a
            float r7 = r4.a()
            float r8 = r4.a()
            float r9 = r4.d()
            float r4 = r4.d()
            s0.E r4 = androidx.compose.foundation.layout.D.d(r7, r9, r8, r4)
            goto L_0x00f4
        L_0x00ea:
            tK.u r4 = tK.C18029u.f147649a
            float r4 = r4.d()
            s0.E r4 = androidx.compose.foundation.layout.D.a(r4)
        L_0x00f4:
            boolean r7 = r36.k()
            r14 = 0
            if (r7 == 0) goto L_0x010d
            r7 = 3007137(0x2de2a1, float:4.213896E-39)
            r3.W(r7)
            tK.h r7 = SC.C13575d.a(r3, r14)
            long r7 = r7.B0()
            r3.P()
            goto L_0x011e
        L_0x010d:
            r7 = 3080514(0x2f0142, float:4.31672E-39)
            r3.W(r7)
            tK.h r7 = SC.C13575d.a(r3, r14)
            long r7 = r7.K()
            r3.P()
        L_0x011e:
            if (r0 == 0) goto L_0x0136
            float r0 = (float) r6
            float r16 = c2.h.B(r0)
            float r17 = c2.h.B(r0)
            r20 = 12
            r21 = 0
            r18 = 0
            r19 = 0
            A0.f r0 = A0.g.g(r16, r17, r18, r19, r20, r21)
            goto L_0x013f
        L_0x0136:
            float r0 = (float) r6
            float r0 = c2.h.B(r0)
            A0.f r0 = A0.g.e(r0)
        L_0x013f:
            androidx.compose.ui.d r8 = androidx.compose.foundation.b.c(r15, r7, r0)
            boolean r9 = r36.k()
            r13 = 6
            r0 = 0
            r10 = 0
            r11 = 0
            r12 = r32
            r7 = r14
            r14 = r0
            androidx.compose.ui.d r0 = androidx.compose.foundation.d.d(r8, r9, r10, r11, r12, r13, r14)
            androidx.compose.ui.d r0 = androidx.compose.foundation.layout.D.h(r0, r4)
            boolean r4 = r36.k()
            if (r4 == 0) goto L_0x0170
            r4 = 3590371(0x36c8e3, float:5.031181E-39)
            r3.W(r4)
            tK.h r4 = SC.C13575d.a(r3, r7)
            long r8 = r4.x0()
            r3.P()
        L_0x016e:
            r9 = r8
            goto L_0x0182
        L_0x0170:
            r4 = 3630330(0x3764fa, float:5.087176E-39)
            r3.W(r4)
            tK.h r4 = SC.C13575d.a(r3, r7)
            long r8 = r4.L()
            r3.P()
            goto L_0x016e
        L_0x0182:
            boolean r4 = r36.k()
            if (r4 == 0) goto L_0x019c
            r4 = 3726275(0x38dbc3, float:5.221623E-39)
            r3.W(r4)
            tK.h r4 = SC.C13575d.a(r3, r7)
            long r11 = r4.F0()
            r3.P()
        L_0x0199:
            r33 = r11
            goto L_0x01ae
        L_0x019c:
            r4 = 3766234(0x3977da, float:5.277618E-39)
            r3.W(r4)
            tK.h r4 = SC.C13575d.a(r3, r7)
            long r11 = r4.K()
            r3.P()
            goto L_0x0199
        L_0x01ae:
            java.lang.String r4 = "CONTINUE_BUTTON"
            androidx.compose.ui.d r0 = androidx.compose.ui.platform.C5116k1.a(r0, r4)
            i1.c$a r4 = i1.C5437c.f24302a
            i1.c$c r4 = r4.i()
            androidx.compose.foundation.layout.d r6 = androidx.compose.foundation.layout.C5073d.f18068a
            androidx.compose.foundation.layout.d$e r6 = r6.f()
            r8 = 48
            E1.I r4 = androidx.compose.foundation.layout.G.b(r6, r4, r3, r8)
            int r6 = U0.C4883j.a(r3, r7)
            U0.y r8 = r3.s()
            androidx.compose.ui.d r0 = androidx.compose.ui.c.e(r3, r0)
            G1.g$a r11 = G1.C4504g.f6515W
            nI.a r12 = r11.a()
            U0.f r13 = r3.m()
            if (r13 != 0) goto L_0x01e1
            U0.C4883j.c()
        L_0x01e1:
            r3.I()
            boolean r13 = r3.i()
            if (r13 == 0) goto L_0x01ee
            r3.p(r12)
            goto L_0x01f1
        L_0x01ee:
            r3.t()
        L_0x01f1:
            U0.m r12 = U0.F1.a(r3)
            nI.p r13 = r11.c()
            U0.F1.c(r12, r4, r13)
            nI.p r4 = r11.e()
            U0.F1.c(r12, r8, r4)
            nI.p r4 = r11.b()
            boolean r8 = r12.i()
            if (r8 != 0) goto L_0x021b
            java.lang.Object r8 = r12.D()
            java.lang.Integer r13 = java.lang.Integer.valueOf(r6)
            boolean r8 = kotlin.jvm.internal.C17542s.e(r8, r13)
            if (r8 != 0) goto L_0x0229
        L_0x021b:
            java.lang.Integer r8 = java.lang.Integer.valueOf(r6)
            r12.u(r8)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r12.w(r6, r4)
        L_0x0229:
            nI.p r4 = r11.d()
            U0.F1.c(r12, r0, r4)
            s0.N r16 = s0.C5843N.f28726a
            androidx.compose.ui.d$a r0 = androidx.compose.ui.d.f18749a
            r20 = 2
            r21 = 0
            r18 = 1065353216(0x3f800000, float:1.0)
            r19 = 0
            r17 = r0
            androidx.compose.ui.d r8 = s0.C5842M.e(r16, r17, r18, r19, r20, r21)
            int r4 = hy.C14546a.f127517a
            java.lang.String r6 = J1.j.b(r4, r3, r7)
            TC.b$b$c r4 = TC.C13679b.C2857b.c.f116685a
            r14 = r7
            r7 = r4
            r30 = 0
            r31 = 262128(0x3fff0, float:3.6732E-40)
            r11 = 0
            r13 = 0
            r38 = r9
            r4 = 0
            r9 = r14
            r14 = r4
            r35 = r15
            r15 = r4
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
            r29 = 48
            r4 = r9
            r9 = r38
            r28 = r3
            SC.C13607l.j(r6, r7, r8, r9, r11, r13, r14, r15, r16, r18, r19, r20, r21, r23, r24, r25, r26, r27, r28, r29, r30, r31)
            r6 = 50
            A0.f r6 = A0.g.a(r6)
            r8 = r38
            androidx.compose.ui.d r0 = androidx.compose.foundation.b.c(r0, r8, r6)
            r6 = 8
            float r6 = (float) r6
            float r6 = c2.h.B(r6)
            androidx.compose.ui.d r0 = androidx.compose.foundation.layout.D.i(r0, r6)
            r6 = 24
            float r6 = (float) r6
            float r6 = c2.h.B(r6)
            androidx.compose.ui.d r8 = androidx.compose.foundation.layout.J.t(r0, r6)
            int r0 = uK.C18146a.f148109K
            t1.c r6 = J1.e.c(r0, r3, r4)
            r12 = 48
            r13 = 0
            r7 = 0
            r9 = r33
            r11 = r3
            O0.V.a(r6, r7, r8, r9, r11, r12, r13)
            r3.x()
            boolean r0 = U0.C4895p.J()
            if (r0 == 0) goto L_0x02b8
            U0.C4895p.R()
        L_0x02b8:
            r4 = r32
        L_0x02ba:
            U0.Y0 r7 = r3.n()
            if (r7 == 0) goto L_0x02d3
            my.L r8 = new my.L
            r0 = r8
            r1 = r36
            r2 = r37
            r3 = r35
            r5 = r41
            r6 = r42
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r7.a(r8)
        L_0x02d3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: my.M.f(ny.c$a, int, androidx.compose.ui.d, nI.a, U0.m, int, int):void");
    }

    /* access modifiers changed from: private */
    public static final C16807N g() {
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N h(C14857c.a aVar, int i10, d dVar, C17631a aVar2, int i11, int i12, C4889m mVar, int i13) {
        f(aVar, i10, dVar, aVar2, mVar, M0.a(i11 | 1), i12);
        return C16807N.f139792a;
    }

    /* JADX WARNING: Removed duplicated region for block: B:123:0x0325  */
    /* JADX WARNING: Removed duplicated region for block: B:127:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x009d  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00a1  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00c4  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00ca  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void i(ny.C14857c.a r63, int r64, java.lang.String r65, java.lang.String r66, androidx.compose.ui.d r67, nI.C17631a<XH.C16807N> r68, U0.C4889m r69, int r70, int r71) {
        /*
            r0 = r63
            r3 = r64
            r4 = r65
            r5 = r66
            r8 = r70
            r1 = 8
            r2 = 16
            r6 = 32
            r7 = 2
            r9 = 48
            java.lang.String r10 = "state"
            kotlin.jvm.internal.C17542s.j(r0, r10)
            r10 = -1039844149(0xffffffffc2053ccb, float:-33.30937)
            r11 = r69
            U0.m r14 = r11.k(r10)
            r11 = 1
            r12 = r71 & 1
            r13 = 4
            if (r12 == 0) goto L_0x002a
            r12 = r8 | 6
            goto L_0x003a
        L_0x002a:
            r12 = r8 & 6
            if (r12 != 0) goto L_0x0039
            boolean r12 = r14.F(r0)
            if (r12 == 0) goto L_0x0036
            r12 = r13
            goto L_0x0037
        L_0x0036:
            r12 = r7
        L_0x0037:
            r12 = r12 | r8
            goto L_0x003a
        L_0x0039:
            r12 = r8
        L_0x003a:
            r7 = r71 & 2
            if (r7 == 0) goto L_0x0040
            r12 = r12 | r9
            goto L_0x004e
        L_0x0040:
            r7 = r8 & 48
            if (r7 != 0) goto L_0x004e
            boolean r7 = r14.d(r3)
            if (r7 == 0) goto L_0x004c
            r7 = r6
            goto L_0x004d
        L_0x004c:
            r7 = r2
        L_0x004d:
            r12 = r12 | r7
        L_0x004e:
            r7 = r71 & 4
            if (r7 == 0) goto L_0x0055
            r12 = r12 | 384(0x180, float:5.38E-43)
            goto L_0x0065
        L_0x0055:
            r7 = r8 & 384(0x180, float:5.38E-43)
            if (r7 != 0) goto L_0x0065
            boolean r7 = r14.V(r4)
            if (r7 == 0) goto L_0x0062
            r7 = 256(0x100, float:3.59E-43)
            goto L_0x0064
        L_0x0062:
            r7 = 128(0x80, float:1.794E-43)
        L_0x0064:
            r12 = r12 | r7
        L_0x0065:
            r7 = r71 & 8
            if (r7 == 0) goto L_0x006c
            r12 = r12 | 3072(0xc00, float:4.305E-42)
            goto L_0x007c
        L_0x006c:
            r7 = r8 & 3072(0xc00, float:4.305E-42)
            if (r7 != 0) goto L_0x007c
            boolean r7 = r14.V(r5)
            if (r7 == 0) goto L_0x0079
            r7 = 2048(0x800, float:2.87E-42)
            goto L_0x007b
        L_0x0079:
            r7 = 1024(0x400, float:1.435E-42)
        L_0x007b:
            r12 = r12 | r7
        L_0x007c:
            r2 = r71 & 16
            if (r2 == 0) goto L_0x0085
            r12 = r12 | 24576(0x6000, float:3.4438E-41)
        L_0x0082:
            r7 = r67
            goto L_0x0097
        L_0x0085:
            r7 = r8 & 24576(0x6000, float:3.4438E-41)
            if (r7 != 0) goto L_0x0082
            r7 = r67
            boolean r15 = r14.V(r7)
            if (r15 == 0) goto L_0x0094
            r15 = 16384(0x4000, float:2.2959E-41)
            goto L_0x0096
        L_0x0094:
            r15 = 8192(0x2000, float:1.14794E-41)
        L_0x0096:
            r12 = r12 | r15
        L_0x0097:
            r6 = r71 & 32
            r15 = 196608(0x30000, float:2.75506E-40)
            if (r6 == 0) goto L_0x00a1
            r12 = r12 | r15
        L_0x009e:
            r15 = r68
            goto L_0x00b3
        L_0x00a1:
            r15 = r15 & r8
            if (r15 != 0) goto L_0x009e
            r15 = r68
            boolean r16 = r14.F(r15)
            if (r16 == 0) goto L_0x00af
            r16 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00b1
        L_0x00af:
            r16 = 65536(0x10000, float:9.18355E-41)
        L_0x00b1:
            r12 = r12 | r16
        L_0x00b3:
            r16 = 74899(0x12493, float:1.04956E-40)
            r1 = r12 & r16
            r9 = 74898(0x12492, float:1.04954E-40)
            if (r1 != r9) goto L_0x00ca
            boolean r1 = r14.l()
            if (r1 != 0) goto L_0x00c4
            goto L_0x00ca
        L_0x00c4:
            r14.L()
            r6 = r14
            goto L_0x031f
        L_0x00ca:
            if (r2 == 0) goto L_0x00cf
            androidx.compose.ui.d$a r1 = androidx.compose.ui.d.f18749a
            r7 = r1
        L_0x00cf:
            if (r6 == 0) goto L_0x00f1
            r1 = -188593044(0xfffffffff4c24c6c, float:-1.2315132E32)
            r14.W(r1)
            java.lang.Object r1 = r14.D()
            U0.m$a r2 = U0.C4889m.f14007a
            java.lang.Object r2 = r2.a()
            if (r1 != r2) goto L_0x00eb
            my.I r1 = new my.I
            r1.<init>()
            r14.u(r1)
        L_0x00eb:
            nI.a r1 = (nI.C17631a) r1
            r14.P()
            goto L_0x00f2
        L_0x00f1:
            r1 = r15
        L_0x00f2:
            boolean r2 = U0.C4895p.J()
            if (r2 == 0) goto L_0x00fe
            r2 = -1
            java.lang.String r6 = "com.ingka.ikea.regionsettings.impl.ui.region.LanguageSelectButton (RegionSelectBottomButtons.kt:177)"
            U0.C4895p.S(r10, r12, r2, r6)
        L_0x00fe:
            T0.d$a r2 = T0.d.f13504b
            int r2 = r2.d()
            boolean r2 = T0.d.F(r3, r2)
            boolean r6 = r63.k()
            r9 = 0
            if (r6 == 0) goto L_0x0123
            r6 = -1551217612(0xffffffffa38a4c34, float:-1.4994263E-17)
            r14.W(r6)
            tK.h r6 = SC.C13575d.a(r14, r9)
            long r17 = r6.B0()
            r14.P()
        L_0x0120:
            r11 = r17
            goto L_0x0135
        L_0x0123:
            r6 = -1551144235(0xffffffffa38b6ad5, float:-1.5115655E-17)
            r14.W(r6)
            tK.h r6 = SC.C13575d.a(r14, r9)
            long r17 = r6.K()
            r14.P()
            goto L_0x0120
        L_0x0135:
            if (r2 == 0) goto L_0x014d
            float r6 = (float) r13
            float r20 = c2.h.B(r6)
            float r19 = c2.h.B(r6)
            r21 = 3
            r22 = 0
            r17 = 0
            r18 = 0
            A0.f r6 = A0.g.g(r17, r18, r19, r20, r21, r22)
            goto L_0x0156
        L_0x014d:
            float r6 = (float) r13
            float r6 = c2.h.B(r6)
            A0.f r6 = A0.g.e(r6)
        L_0x0156:
            androidx.compose.ui.d r17 = androidx.compose.foundation.b.c(r7, r11, r6)
            boolean r18 = r63.k()
            r22 = 6
            r23 = 0
            r19 = 0
            r20 = 0
            r21 = r1
            androidx.compose.ui.d r6 = androidx.compose.foundation.d.d(r17, r18, r19, r20, r21, r22, r23)
            if (r2 == 0) goto L_0x0175
            tK.u r2 = tK.C18029u.f147649a
            float r2 = r2.a()
            goto L_0x017b
        L_0x0175:
            tK.u r2 = tK.C18029u.f147649a
            float r2 = r2.d()
        L_0x017b:
            androidx.compose.ui.d r2 = androidx.compose.foundation.layout.D.i(r6, r2)
            boolean r6 = r63.k()
            if (r6 == 0) goto L_0x0199
            r6 = -1550453834(0xffffffffa395f3b6, float:-1.6257828E-17)
            r14.W(r6)
            tK.h r6 = SC.C13575d.a(r14, r9)
            long r10 = r6.x0()
            r14.P()
        L_0x0196:
            r38 = r10
            goto L_0x01ab
        L_0x0199:
            r6 = -1550413875(0xffffffffa3968fcd, float:-1.6323935E-17)
            r14.W(r6)
            tK.h r6 = SC.C13575d.a(r14, r9)
            long r10 = r6.L()
            r14.P()
            goto L_0x0196
        L_0x01ab:
            r6 = -188558156(0xfffffffff4c2d4b4, float:-1.2348874E32)
            r14.W(r6)
            N1.d$a r6 = new N1.d$a
            r10 = 0
            r11 = 1
            r6.<init>(r9, r11, r10)
            int r10 = Oo.b.f84640f7
            java.lang.String r10 = J1.j.b(r10, r14, r9)
            r6.j(r10)
            java.lang.String r10 = ": "
            r6.j(r10)
            N1.G r10 = new N1.G
            r40 = r10
            S1.C$a r11 = S1.C.f13316b
            S1.C r45 = r11.a()
            r61 = 65531(0xfffb, float:9.1828E-41)
            r62 = 0
            r41 = 0
            r43 = 0
            r46 = 0
            r47 = 0
            r48 = 0
            r49 = 0
            r50 = 0
            r52 = 0
            r53 = 0
            r54 = 0
            r55 = 0
            r57 = 0
            r58 = 0
            r59 = 0
            r60 = 0
            r40.<init>(r41, r43, r45, r46, r47, r48, r49, r50, r52, r53, r54, r55, r57, r58, r59, r60, r61, r62)
            int r10 = r6.p(r10)
            java.lang.String r11 = " - "
            if (r4 == 0) goto L_0x0219
            if (r5 == 0) goto L_0x0219
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch:{ all -> 0x0216 }
            r12.<init>()     // Catch:{ all -> 0x0216 }
            r12.append(r4)     // Catch:{ all -> 0x0216 }
            r12.append(r11)     // Catch:{ all -> 0x0216 }
            r12.append(r5)     // Catch:{ all -> 0x0216 }
            java.lang.String r11 = r12.toString()     // Catch:{ all -> 0x0216 }
            r6.j(r11)     // Catch:{ all -> 0x0216 }
            goto L_0x021c
        L_0x0216:
            r0 = move-exception
            goto L_0x033d
        L_0x0219:
            r6.j(r11)     // Catch:{ all -> 0x0216 }
        L_0x021c:
            XH.N r11 = XH.C16807N.f139792a     // Catch:{ all -> 0x0216 }
            r6.m(r10)
            N1.d r11 = r6.q()
            r14.P()
            java.lang.String r6 = "REGION_SELECT_BUTTON"
            androidx.compose.ui.d r2 = androidx.compose.ui.platform.C5116k1.a(r2, r6)
            i1.c$a r6 = i1.C5437c.f24302a
            i1.c$c r6 = r6.i()
            androidx.compose.foundation.layout.d r10 = androidx.compose.foundation.layout.C5073d.f18068a
            androidx.compose.foundation.layout.d$e r10 = r10.f()
            r12 = 48
            E1.I r6 = androidx.compose.foundation.layout.G.b(r10, r6, r14, r12)
            int r10 = U0.C4883j.a(r14, r9)
            U0.y r12 = r14.s()
            androidx.compose.ui.d r2 = androidx.compose.ui.c.e(r14, r2)
            G1.g$a r13 = G1.C4504g.f6515W
            nI.a r15 = r13.a()
            U0.f r16 = r14.m()
            if (r16 != 0) goto L_0x025b
            U0.C4883j.c()
        L_0x025b:
            r14.I()
            boolean r16 = r14.i()
            if (r16 == 0) goto L_0x0268
            r14.p(r15)
            goto L_0x026b
        L_0x0268:
            r14.t()
        L_0x026b:
            U0.m r15 = U0.F1.a(r14)
            nI.p r9 = r13.c()
            U0.F1.c(r15, r6, r9)
            nI.p r6 = r13.e()
            U0.F1.c(r15, r12, r6)
            nI.p r6 = r13.b()
            boolean r9 = r15.i()
            if (r9 != 0) goto L_0x0295
            java.lang.Object r9 = r15.D()
            java.lang.Integer r12 = java.lang.Integer.valueOf(r10)
            boolean r9 = kotlin.jvm.internal.C17542s.e(r9, r12)
            if (r9 != 0) goto L_0x02a3
        L_0x0295:
            java.lang.Integer r9 = java.lang.Integer.valueOf(r10)
            r15.u(r9)
            java.lang.Integer r9 = java.lang.Integer.valueOf(r10)
            r15.w(r9, r6)
        L_0x02a3:
            nI.p r6 = r13.d()
            U0.F1.c(r15, r2, r6)
            s0.N r16 = s0.C5843N.f28726a
            androidx.compose.ui.d$a r2 = androidx.compose.ui.d.f18749a
            r20 = 2
            r21 = 0
            r18 = 1065353216(0x3f800000, float:1.0)
            r19 = 0
            r17 = r2
            androidx.compose.ui.d r13 = s0.C5842M.e(r16, r17, r18, r19, r20, r21)
            TC.b$a$b r12 = TC.C13679b.a.C2856b.f116680a
            r36 = 0
            r37 = 524272(0x7fff0, float:7.34662E-40)
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
            r33 = 0
            r35 = 48
            r6 = r14
            r14 = r38
            r34 = r6
            SC.C13607l.h(r11, r12, r13, r14, r16, r18, r19, r20, r21, r23, r24, r25, r26, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37)
            int r9 = uK.C18146a.f148021E1
            r10 = 0
            t1.c r11 = J1.e.c(r9, r6, r10)
            r9 = 8
            float r9 = (float) r9
            float r9 = c2.h.B(r9)
            androidx.compose.ui.d r2 = androidx.compose.foundation.layout.D.i(r2, r9)
            r9 = 24
            float r9 = (float) r9
            float r9 = c2.h.B(r9)
            androidx.compose.ui.d r13 = androidx.compose.foundation.layout.J.t(r2, r9)
            r17 = 432(0x1b0, float:6.05E-43)
            r18 = 0
            r12 = 0
            r16 = r6
            O0.V.a(r11, r12, r13, r14, r16, r17, r18)
            r6.x()
            boolean r2 = U0.C4895p.J()
            if (r2 == 0) goto L_0x031e
            U0.C4895p.R()
        L_0x031e:
            r15 = r1
        L_0x031f:
            U0.Y0 r10 = r6.n()
            if (r10 == 0) goto L_0x033c
            my.J r11 = new my.J
            r1 = r11
            r2 = r63
            r3 = r64
            r4 = r65
            r5 = r66
            r6 = r7
            r7 = r15
            r8 = r70
            r9 = r71
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9)
            r10.a(r11)
        L_0x033c:
            return
        L_0x033d:
            r6.m(r10)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: my.M.i(ny.c$a, int, java.lang.String, java.lang.String, androidx.compose.ui.d, nI.a, U0.m, int, int):void");
    }

    /* access modifiers changed from: private */
    public static final C16807N j(C14857c.a aVar, int i10, String str, String str2, d dVar, C17631a aVar2, int i11, int i12, C4889m mVar, int i13) {
        i(aVar, i10, str, str2, dVar, aVar2, mVar, M0.a(i11 | 1), i12);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N k() {
        return C16807N.f139792a;
    }

    public static final void l(C14857c.a aVar, int i10, C17631a<C16807N> aVar2, C17631a<C16807N> aVar3, C4889m mVar, int i11) {
        int i12;
        C14857c.a aVar4 = aVar;
        int i13 = i10;
        C17631a<C16807N> aVar5 = aVar2;
        C17631a<C16807N> aVar6 = aVar3;
        int i14 = i11;
        C17542s.j(aVar4, "state");
        C17542s.j(aVar5, "onOpenSelection");
        C17542s.j(aVar6, "onContinueClick");
        C4889m k10 = mVar.k(-1488350376);
        if ((i14 & 6) == 0) {
            i12 = (k10.F(aVar4) ? 4 : 2) | i14;
        } else {
            i12 = i14;
        }
        if ((i14 & 48) == 0) {
            i12 |= k10.d(i13) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i12 |= k10.F(aVar5) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            i12 |= k10.F(aVar6) ? RecyclerView.n.FLAG_MOVED : 1024;
        }
        int i15 = i12;
        if ((i15 & 1171) != 1170 || !k10.l()) {
            if (C4895p.J()) {
                C4895p.S(-1488350376, i15, -1, "com.ingka.ikea.regionsettings.impl.ui.region.RegionSelectBottomButtons (RegionSelectBottomButtons.kt:51)");
            }
            if (T0.d.F(i13, T0.d.f13504b.d())) {
                k10.W(53980278);
                d.a aVar7 = d.f18749a;
                I a10 = C5080k.a(C5073d.f18068a.g(), C5437c.f24302a.k(), k10, 0);
                int a11 = C4883j.a(k10, 0);
                C4912y s10 = k10.s();
                d e10 = c.e(k10, aVar7);
                C4504g.a aVar8 = C4504g.f6515W;
                C17631a<C4504g> a12 = aVar8.a();
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
                F1.c(a13, a10, aVar8.c());
                F1.c(a13, s10, aVar8.e());
                p<C4504g, Integer, C16807N> b10 = aVar8.b();
                if (a13.i() || !C17542s.e(a13.D(), Integer.valueOf(a11))) {
                    a13.u(Integer.valueOf(a11));
                    a13.w(Integer.valueOf(a11), b10);
                }
                F1.c(a13, e10, aVar8.d());
                C5862h hVar = C5862h.f28810a;
                int i16 = i15 & 126;
                f(aVar, i10, (d) null, aVar3, k10, i15 & 7294, 4);
                C5844O.a(J.i(aVar7, C18029u.f147649a.f()), k10, 0);
                Rl.d h10 = aVar.h();
                String c10 = h10 != null ? h10.c() : null;
                f g10 = aVar.g();
                i(aVar, i10, c10, g10 != null ? g10.b() : null, (d) null, aVar2, k10, i16 | ((i15 << 9) & ImageMetadata.JPEG_GPS_COORDINATES), 16);
                k10.x();
                k10.P();
            } else {
                k10.W(54570332);
                d.a aVar9 = d.f18749a;
                I b11 = G.b(C5073d.f18068a.f(), C5437c.f24302a.l(), k10, 0);
                int a14 = C4883j.a(k10, 0);
                C4912y s11 = k10.s();
                d e11 = c.e(k10, aVar9);
                C4504g.a aVar10 = C4504g.f6515W;
                C17631a<C4504g> a15 = aVar10.a();
                if (k10.m() == null) {
                    C4883j.c();
                }
                k10.I();
                if (k10.i()) {
                    k10.p(a15);
                } else {
                    k10.t();
                }
                C4889m a16 = F1.a(k10);
                F1.c(a16, b11, aVar10.c());
                F1.c(a16, s11, aVar10.e());
                p<C4504g, Integer, C16807N> b12 = aVar10.b();
                if (a16.i() || !C17542s.e(a16.D(), Integer.valueOf(a14))) {
                    a16.u(Integer.valueOf(a14));
                    a16.w(Integer.valueOf(a14), b12);
                }
                F1.c(a16, e11, aVar10.d());
                C5843N n10 = C5843N.f28726a;
                d e12 = C5842M.e(n10, aVar9, 1.0f, false, 2, (Object) null);
                Rl.d h11 = aVar.h();
                String c11 = h11 != null ? h11.c() : null;
                f g11 = aVar.g();
                d.a aVar11 = aVar9;
                i(aVar, i10, c11, g11 != null ? g11.b() : null, e12, aVar2, k10, (i15 & 126) | ((i15 << 9) & ImageMetadata.JPEG_GPS_COORDINATES), 0);
                C5844O.a(J.y(aVar11, C18029u.f147649a.f()), k10, 0);
                f(aVar, i10, C5842M.e(n10, aVar11, 1.0f, false, 2, (Object) null), aVar3, k10, i15 & 7294, 0);
                k10.x();
                k10.P();
            }
            if (C4895p.J()) {
                C4895p.R();
            }
        } else {
            k10.L();
        }
        Y0 n11 = k10.n();
        if (n11 != null) {
            n11.a(new C14807H(aVar, i10, aVar2, aVar3, i11));
        }
    }

    /* access modifiers changed from: private */
    public static final C16807N m(C14857c.a aVar, int i10, C17631a aVar2, C17631a aVar3, int i11, C4889m mVar, int i12) {
        l(aVar, i10, aVar2, aVar3, mVar, M0.a(i11 | 1));
        return C16807N.f139792a;
    }
}
