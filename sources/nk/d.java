package Nk;

import U0.C4889m;
import U0.C4895p;
import U0.M0;
import U0.Y0;
import XH.C16807N;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import nI.C17631a;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a=\u0010\b\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0006H\u0001¢\u0006\u0004\b\b\u0010\t\u001a5\u0010\n\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0006H\u0003¢\u0006\u0004\b\n\u0010\u000b\u001a5\u0010\f\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0006H\u0003¢\u0006\u0004\b\f\u0010\u000b¨\u0006\r"}, d2 = {"LT0/d;", "widthSizeClass", "Lkotlin/Function0;", "LXH/N;", "onOpenPushNotificationSettings", "onSkip", "Landroidx/compose/ui/d;", "modifier", "h", "(ILnI/a;LnI/a;Landroidx/compose/ui/d;LU0/m;II)V", "f", "(LnI/a;LnI/a;Landroidx/compose/ui/d;LU0/m;II)V", "d", "splash_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class d {
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0048  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x004e  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x006e  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0073  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x01a7  */
    /* JADX WARNING: Removed duplicated region for block: B:65:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static final void d(nI.C17631a<XH.C16807N> r26, nI.C17631a<XH.C16807N> r27, androidx.compose.ui.d r28, U0.C4889m r29, int r30, int r31) {
        /*
            r4 = r30
            r0 = 2
            r1 = 4
            r2 = -1023051511(0xffffffffc3057909, float:-133.4728)
            r3 = r29
            U0.m r3 = r3.k(r2)
            r15 = 1
            r5 = r31 & 1
            if (r5 == 0) goto L_0x0017
            r5 = r4 | 6
            r14 = r26
            goto L_0x0029
        L_0x0017:
            r5 = r4 & 6
            r14 = r26
            if (r5 != 0) goto L_0x0028
            boolean r5 = r3.F(r14)
            if (r5 == 0) goto L_0x0025
            r5 = r1
            goto L_0x0026
        L_0x0025:
            r5 = r0
        L_0x0026:
            r5 = r5 | r4
            goto L_0x0029
        L_0x0028:
            r5 = r4
        L_0x0029:
            r0 = r31 & 2
            if (r0 == 0) goto L_0x0032
            r5 = r5 | 48
        L_0x002f:
            r0 = r27
            goto L_0x0044
        L_0x0032:
            r0 = r4 & 48
            if (r0 != 0) goto L_0x002f
            r0 = r27
            boolean r6 = r3.F(r0)
            if (r6 == 0) goto L_0x0041
            r6 = 32
            goto L_0x0043
        L_0x0041:
            r6 = 16
        L_0x0043:
            r5 = r5 | r6
        L_0x0044:
            r1 = r31 & 4
            if (r1 == 0) goto L_0x004e
            r5 = r5 | 384(0x180, float:5.38E-43)
        L_0x004a:
            r6 = r28
        L_0x004c:
            r13 = r5
            goto L_0x0061
        L_0x004e:
            r6 = r4 & 384(0x180, float:5.38E-43)
            if (r6 != 0) goto L_0x004a
            r6 = r28
            boolean r7 = r3.V(r6)
            if (r7 == 0) goto L_0x005d
            r7 = 256(0x100, float:3.59E-43)
            goto L_0x005f
        L_0x005d:
            r7 = 128(0x80, float:1.794E-43)
        L_0x005f:
            r5 = r5 | r7
            goto L_0x004c
        L_0x0061:
            r5 = r13 & 147(0x93, float:2.06E-43)
            r7 = 146(0x92, float:2.05E-43)
            if (r5 != r7) goto L_0x0073
            boolean r5 = r3.l()
            if (r5 != 0) goto L_0x006e
            goto L_0x0073
        L_0x006e:
            r3.L()
            goto L_0x01a1
        L_0x0073:
            if (r1 == 0) goto L_0x0078
            androidx.compose.ui.d$a r1 = androidx.compose.ui.d.f18749a
            goto L_0x0079
        L_0x0078:
            r1 = r6
        L_0x0079:
            boolean r5 = U0.C4895p.J()
            if (r5 == 0) goto L_0x0085
            r5 = -1
            java.lang.String r6 = "com.ingka.ikea.app.splash.onboarding.steps.notifications.compose.ButtonsCompact (OnboardingEnablePushButtons.kt:84)"
            U0.C4895p.S(r2, r13, r5, r6)
        L_0x0085:
            tK.u r2 = tK.C18029u.f147649a
            float r7 = r2.a()
            float r9 = r2.a()
            r10 = 5
            r11 = 0
            r6 = 0
            r8 = 0
            r5 = r1
            androidx.compose.ui.d r5 = androidx.compose.foundation.layout.D.m(r5, r6, r7, r8, r9, r10, r11)
            androidx.compose.foundation.layout.d r6 = androidx.compose.foundation.layout.C5073d.f18068a
            androidx.compose.foundation.layout.d$m r6 = r6.g()
            i1.c$a r7 = i1.C5437c.f24302a
            i1.c$b r7 = r7.k()
            r12 = 0
            E1.I r6 = androidx.compose.foundation.layout.C5080k.a(r6, r7, r3, r12)
            int r7 = U0.C4883j.a(r3, r12)
            U0.y r8 = r3.s()
            androidx.compose.ui.d r5 = androidx.compose.ui.c.e(r3, r5)
            G1.g$a r9 = G1.C4504g.f6515W
            nI.a r10 = r9.a()
            U0.f r11 = r3.m()
            if (r11 != 0) goto L_0x00c4
            U0.C4883j.c()
        L_0x00c4:
            r3.I()
            boolean r11 = r3.i()
            if (r11 == 0) goto L_0x00d1
            r3.p(r10)
            goto L_0x00d4
        L_0x00d1:
            r3.t()
        L_0x00d4:
            U0.m r10 = U0.F1.a(r3)
            nI.p r11 = r9.c()
            U0.F1.c(r10, r6, r11)
            nI.p r6 = r9.e()
            U0.F1.c(r10, r8, r6)
            nI.p r6 = r9.b()
            boolean r8 = r10.i()
            if (r8 != 0) goto L_0x00fe
            java.lang.Object r8 = r10.D()
            java.lang.Integer r11 = java.lang.Integer.valueOf(r7)
            boolean r8 = kotlin.jvm.internal.C17542s.e(r8, r11)
            if (r8 != 0) goto L_0x010c
        L_0x00fe:
            java.lang.Integer r8 = java.lang.Integer.valueOf(r7)
            r10.u(r8)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r10.w(r7, r6)
        L_0x010c:
            nI.p r6 = r9.d()
            U0.F1.c(r10, r5, r6)
            s0.h r5 = s0.C5862h.f28810a
            int r5 = com.ingka.ikea.app.splash.n.f92435b
            java.lang.String r5 = J1.j.b(r5, r3, r12)
            SC.N r8 = SC.N.Primary
            androidx.compose.ui.d$a r11 = androidx.compose.ui.d.f18749a
            r10 = 0
            r9 = 0
            androidx.compose.ui.d r6 = androidx.compose.foundation.layout.J.h(r11, r10, r15, r9)
            java.lang.String r7 = "OPEN_PUSH_SETTINGS_BUTTON"
            androidx.compose.ui.d r6 = androidx.compose.ui.platform.C5116k1.a(r6, r7)
            int r7 = r13 << 27
            r18 = 1879048192(0x70000000, float:1.58456325E29)
            r7 = r7 & r18
            r7 = r7 | 3120(0xc30, float:4.372E-42)
            r17 = 500(0x1f4, float:7.0E-43)
            r16 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r24 = r7
            r7 = r16
            r9 = r19
            r10 = r20
            r25 = r11
            r11 = r21
            r12 = r22
            r19 = r13
            r13 = r23
            r14 = r26
            r15 = r3
            r16 = r24
            SC.L.b(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            float r2 = r2.l()
            r5 = r25
            androidx.compose.ui.d r2 = androidx.compose.foundation.layout.J.i(r5, r2)
            r6 = 0
            s0.C5844O.a(r2, r3, r6)
            int r2 = com.ingka.ikea.app.splash.n.f92438e
            java.lang.String r2 = J1.j.b(r2, r3, r6)
            SC.N r8 = SC.N.Tertiary
            r6 = 1
            r7 = 0
            r9 = 0
            androidx.compose.ui.d r5 = androidx.compose.foundation.layout.J.h(r5, r7, r6, r9)
            java.lang.String r6 = "SKIP_BUTTON"
            androidx.compose.ui.d r6 = androidx.compose.ui.platform.C5116k1.a(r5, r6)
            int r5 = r19 << 24
            r5 = r5 & r18
            r15 = r5 | 3120(0xc30, float:4.372E-42)
            r7 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r5 = r2
            r14 = r27
            r2 = r15
            r15 = r3
            r16 = r2
            SC.L.b(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            r3.x()
            boolean r2 = U0.C4895p.J()
            if (r2 == 0) goto L_0x01a0
            U0.C4895p.R()
        L_0x01a0:
            r6 = r1
        L_0x01a1:
            U0.Y0 r7 = r3.n()
            if (r7 == 0) goto L_0x01b9
            Nk.b r8 = new Nk.b
            r0 = r8
            r1 = r26
            r2 = r27
            r3 = r6
            r4 = r30
            r5 = r31
            r0.<init>(r1, r2, r3, r4, r5)
            r7.a(r8)
        L_0x01b9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: Nk.d.d(nI.a, nI.a, androidx.compose.ui.d, U0.m, int, int):void");
    }

    /* access modifiers changed from: private */
    public static final C16807N e(C17631a aVar, C17631a aVar2, androidx.compose.ui.d dVar, int i10, int i11, C4889m mVar, int i12) {
        d(aVar, aVar2, dVar, mVar, M0.a(i10 | 1), i11);
        return C16807N.f139792a;
    }

    /* JADX WARNING: Removed duplicated region for block: B:36:0x006c  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0072  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x019f  */
    /* JADX WARNING: Removed duplicated region for block: B:63:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static final void f(nI.C17631a<XH.C16807N> r28, nI.C17631a<XH.C16807N> r29, androidx.compose.ui.d r30, U0.C4889m r31, int r32, int r33) {
        /*
            r4 = r32
            r0 = -766857427(0xffffffffd24aaf2d, float:-2.17630589E11)
            r1 = r31
            U0.m r1 = r1.k(r0)
            r2 = r33 & 1
            if (r2 == 0) goto L_0x0015
            r2 = r4 | 6
            r3 = r2
            r2 = r28
            goto L_0x0029
        L_0x0015:
            r2 = r4 & 6
            if (r2 != 0) goto L_0x0026
            r2 = r28
            boolean r3 = r1.F(r2)
            if (r3 == 0) goto L_0x0023
            r3 = 4
            goto L_0x0024
        L_0x0023:
            r3 = 2
        L_0x0024:
            r3 = r3 | r4
            goto L_0x0029
        L_0x0026:
            r2 = r28
            r3 = r4
        L_0x0029:
            r5 = r33 & 2
            if (r5 == 0) goto L_0x0032
            r3 = r3 | 48
            r15 = r29
            goto L_0x0044
        L_0x0032:
            r5 = r4 & 48
            r15 = r29
            if (r5 != 0) goto L_0x0044
            boolean r5 = r1.F(r15)
            if (r5 == 0) goto L_0x0041
            r5 = 32
            goto L_0x0043
        L_0x0041:
            r5 = 16
        L_0x0043:
            r3 = r3 | r5
        L_0x0044:
            r5 = r33 & 4
            if (r5 == 0) goto L_0x004d
            r3 = r3 | 384(0x180, float:5.38E-43)
        L_0x004a:
            r6 = r30
            goto L_0x005f
        L_0x004d:
            r6 = r4 & 384(0x180, float:5.38E-43)
            if (r6 != 0) goto L_0x004a
            r6 = r30
            boolean r7 = r1.V(r6)
            if (r7 == 0) goto L_0x005c
            r7 = 256(0x100, float:3.59E-43)
            goto L_0x005e
        L_0x005c:
            r7 = 128(0x80, float:1.794E-43)
        L_0x005e:
            r3 = r3 | r7
        L_0x005f:
            r7 = r3 & 147(0x93, float:2.06E-43)
            r8 = 146(0x92, float:2.05E-43)
            if (r7 != r8) goto L_0x0072
            boolean r7 = r1.l()
            if (r7 != 0) goto L_0x006c
            goto L_0x0072
        L_0x006c:
            r1.L()
            r3 = r6
            goto L_0x0199
        L_0x0072:
            if (r5 == 0) goto L_0x0079
            androidx.compose.ui.d$a r5 = androidx.compose.ui.d.f18749a
            r18 = r5
            goto L_0x007b
        L_0x0079:
            r18 = r6
        L_0x007b:
            boolean r5 = U0.C4895p.J()
            if (r5 == 0) goto L_0x0087
            r5 = -1
            java.lang.String r6 = "com.ingka.ikea.app.splash.onboarding.steps.notifications.compose.ButtonsExpanded (OnboardingEnablePushButtons.kt:52)"
            U0.C4895p.S(r0, r3, r5, r6)
        L_0x0087:
            tK.u r0 = tK.C18029u.f147649a
            float r10 = r0.g()
            r11 = 7
            r12 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r6 = r18
            androidx.compose.ui.d r5 = androidx.compose.foundation.layout.D.m(r6, r7, r8, r9, r10, r11, r12)
            androidx.compose.foundation.layout.d r6 = androidx.compose.foundation.layout.C5073d.f18068a
            androidx.compose.foundation.layout.d$e r6 = r6.f()
            i1.c$a r7 = i1.C5437c.f24302a
            i1.c$c r7 = r7.l()
            r14 = 0
            E1.I r6 = androidx.compose.foundation.layout.G.b(r6, r7, r1, r14)
            int r7 = U0.C4883j.a(r1, r14)
            U0.y r8 = r1.s()
            androidx.compose.ui.d r5 = androidx.compose.ui.c.e(r1, r5)
            G1.g$a r9 = G1.C4504g.f6515W
            nI.a r10 = r9.a()
            U0.f r11 = r1.m()
            if (r11 != 0) goto L_0x00c4
            U0.C4883j.c()
        L_0x00c4:
            r1.I()
            boolean r11 = r1.i()
            if (r11 == 0) goto L_0x00d1
            r1.p(r10)
            goto L_0x00d4
        L_0x00d1:
            r1.t()
        L_0x00d4:
            U0.m r10 = U0.F1.a(r1)
            nI.p r11 = r9.c()
            U0.F1.c(r10, r6, r11)
            nI.p r6 = r9.e()
            U0.F1.c(r10, r8, r6)
            nI.p r6 = r9.b()
            boolean r8 = r10.i()
            if (r8 != 0) goto L_0x00fe
            java.lang.Object r8 = r10.D()
            java.lang.Integer r11 = java.lang.Integer.valueOf(r7)
            boolean r8 = kotlin.jvm.internal.C17542s.e(r8, r11)
            if (r8 != 0) goto L_0x010c
        L_0x00fe:
            java.lang.Integer r8 = java.lang.Integer.valueOf(r7)
            r10.u(r8)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r10.w(r7, r6)
        L_0x010c:
            nI.p r6 = r9.d()
            U0.F1.c(r10, r5, r6)
            s0.N r25 = s0.C5843N.f28726a
            int r5 = com.ingka.ikea.app.splash.n.f92435b
            java.lang.String r5 = J1.j.b(r5, r1, r14)
            SC.N r8 = SC.N.Primary
            androidx.compose.ui.d$a r13 = androidx.compose.ui.d.f18749a
            r23 = 2
            r24 = 0
            r21 = 1065353216(0x3f800000, float:1.0)
            r22 = 0
            r19 = r25
            r20 = r13
            androidx.compose.ui.d r6 = s0.C5842M.e(r19, r20, r21, r22, r23, r24)
            java.lang.String r7 = "OPEN_PUSH_SETTINGS_BUTTON"
            androidx.compose.ui.d r6 = androidx.compose.ui.platform.C5116k1.a(r6, r7)
            int r7 = r3 << 27
            r26 = 1879048192(0x70000000, float:1.58456325E29)
            r7 = r7 & r26
            r12 = r7 | 3072(0xc00, float:4.305E-42)
            r17 = 500(0x1f4, float:7.0E-43)
            r7 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r16 = 0
            r19 = 0
            r20 = r12
            r12 = r16
            r27 = r13
            r13 = r19
            r14 = r28
            r15 = r1
            r16 = r20
            SC.L.b(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            float r0 = r0.l()
            r5 = r27
            androidx.compose.ui.d r0 = androidx.compose.foundation.layout.J.y(r5, r0)
            r6 = 0
            s0.C5844O.a(r0, r1, r6)
            int r0 = com.ingka.ikea.app.splash.n.f92438e
            java.lang.String r0 = J1.j.b(r0, r1, r6)
            SC.N r8 = SC.N.Secondary
            r19 = r25
            r20 = r5
            androidx.compose.ui.d r5 = s0.C5842M.e(r19, r20, r21, r22, r23, r24)
            java.lang.String r6 = "SKIP_BUTTON"
            androidx.compose.ui.d r6 = androidx.compose.ui.platform.C5116k1.a(r5, r6)
            int r3 = r3 << 24
            r3 = r3 & r26
            r3 = r3 | 3072(0xc00, float:4.305E-42)
            r12 = 0
            r13 = 0
            r5 = r0
            r14 = r29
            r16 = r3
            SC.L.b(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            r1.x()
            boolean r0 = U0.C4895p.J()
            if (r0 == 0) goto L_0x0197
            U0.C4895p.R()
        L_0x0197:
            r3 = r18
        L_0x0199:
            U0.Y0 r6 = r1.n()
            if (r6 == 0) goto L_0x01b0
            Nk.c r7 = new Nk.c
            r0 = r7
            r1 = r28
            r2 = r29
            r4 = r32
            r5 = r33
            r0.<init>(r1, r2, r3, r4, r5)
            r6.a(r7)
        L_0x01b0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: Nk.d.f(nI.a, nI.a, androidx.compose.ui.d, U0.m, int, int):void");
    }

    /* access modifiers changed from: private */
    public static final C16807N g(C17631a aVar, C17631a aVar2, androidx.compose.ui.d dVar, int i10, int i11, C4889m mVar, int i12) {
        f(aVar, aVar2, dVar, mVar, M0.a(i10 | 1), i11);
        return C16807N.f139792a;
    }

    public static final void h(int i10, C17631a<C16807N> aVar, C17631a<C16807N> aVar2, androidx.compose.ui.d dVar, C4889m mVar, int i11, int i12) {
        int i13;
        C17542s.j(aVar, "onOpenPushNotificationSettings");
        C17542s.j(aVar2, "onSkip");
        C4889m k10 = mVar.k(-1675591921);
        if ((i12 & 1) != 0) {
            i13 = i11 | 6;
        } else if ((i11 & 6) == 0) {
            i13 = (k10.d(i10) ? 4 : 2) | i11;
        } else {
            i13 = i11;
        }
        if ((i12 & 2) != 0) {
            i13 |= 48;
        } else if ((i11 & 48) == 0) {
            i13 |= k10.F(aVar) ? 32 : 16;
        }
        if ((i12 & 4) != 0) {
            i13 |= 384;
        } else if ((i11 & 384) == 0) {
            i13 |= k10.F(aVar2) ? 256 : 128;
        }
        int i14 = i12 & 8;
        if (i14 != 0) {
            i13 |= 3072;
        } else if ((i11 & 3072) == 0) {
            i13 |= k10.V(dVar) ? RecyclerView.n.FLAG_MOVED : 1024;
        }
        if ((i13 & 1171) != 1170 || !k10.l()) {
            if (i14 != 0) {
                dVar = androidx.compose.ui.d.f18749a;
            }
            if (C4895p.J()) {
                C4895p.S(-1675591921, i13, -1, "com.ingka.ikea.app.splash.onboarding.steps.notifications.compose.OnboardingEnablePushButtons (OnboardingEnablePushButtons.kt:31)");
            }
            if (T0.d.F(i10, T0.d.f13504b.d())) {
                k10.W(1590355892);
                d(aVar, aVar2, dVar, k10, (i13 >> 3) & 1022, 0);
                k10.P();
            } else {
                k10.W(1590540435);
                f(aVar, aVar2, dVar, k10, (i13 >> 3) & 1022, 0);
                k10.P();
            }
            if (C4895p.J()) {
                C4895p.R();
            }
        } else {
            k10.L();
        }
        androidx.compose.ui.d dVar2 = dVar;
        Y0 n10 = k10.n();
        if (n10 != null) {
            n10.a(new a(i10, aVar, aVar2, dVar2, i11, i12));
        }
    }

    /* access modifiers changed from: private */
    public static final C16807N i(int i10, C17631a aVar, C17631a aVar2, androidx.compose.ui.d dVar, int i11, int i12, C4889m mVar, int i13) {
        h(i10, aVar, aVar2, dVar, mVar, M0.a(i11 | 1), i12);
        return C16807N.f139792a;
    }
}
