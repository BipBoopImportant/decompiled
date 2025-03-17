package Sj;

import J1.j;
import Oo.b;
import SC.K0;
import SC.L;
import SC.M;
import SC.N;
import U0.C4889m;
import U0.C4895p;
import U0.M0;
import U0.Y0;
import XH.C16807N;
import androidx.compose.foundation.layout.J;
import androidx.compose.ui.d;
import androidx.compose.ui.platform.C5116k1;
import kotlin.Metadata;
import nI.C17631a;
import r0.m;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\u001aE\u0010\t\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\b\u001a\u00020\u0007H\u0001¢\u0006\u0004\b\t\u0010\n\u001a1\u0010\r\u001a\u00020\u00042\b\b\u0002\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00002\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0003¢\u0006\u0004\b\r\u0010\u000e\u001a\u001d\u0010\u000f\u001a\u00020\u00042\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0003¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"", "isImportButtonEnabled", "isLoading", "Lkotlin/Function0;", "LXH/N;", "onPrimaryButtonClick", "onSecondaryButtonClick", "Landroidx/compose/ui/d;", "modifier", "h", "(ZZLnI/a;LnI/a;Landroidx/compose/ui/d;LU0/m;II)V", "enabled", "onClick", "f", "(ZZLnI/a;LU0/m;II)V", "d", "(LnI/a;LU0/m;I)V", "scanandgo-implementation_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* renamed from: Sj.n  reason: case insensitive filesystem */
public final class C10927n {
    private static final void d(C17631a<C16807N> aVar, C4889m mVar, int i10) {
        int i11;
        C17631a<C16807N> aVar2 = aVar;
        int i12 = i10;
        C4889m k10 = mVar.k(-973232255);
        if ((i12 & 6) == 0) {
            i11 = (k10.F(aVar2) ? 4 : 2) | i12;
        } else {
            i11 = i12;
        }
        if ((i11 & 3) != 2 || !k10.l()) {
            if (C4895p.J()) {
                C4895p.S(-973232255, i11, -1, "com.ingka.ikea.app.scanandgoonlineredesign.upptacka.presentation.ui.CancelButton (UpptackaImportProductButtons.kt:69)");
            }
            L.b(j.b(b.f84518U0, k10, 0), J.h(C5116k1.a(d.f18749a, "UpptackaImportProduct.SecondaryButton.TAG"), 0.0f, 1, (Object) null), false, N.Secondary, (M) null, false, (Integer) null, (K0) null, (m) null, aVar, k10, ((i11 << 27) & 1879048192) | 3120, 500);
            if (C4895p.J()) {
                C4895p.R();
            }
        } else {
            k10.L();
        }
        Y0 n10 = k10.n();
        if (n10 != null) {
            n10.a(new C10926m(aVar2, i12));
        }
    }

    /* access modifiers changed from: private */
    public static final C16807N e(C17631a aVar, int i10, C4889m mVar, int i11) {
        d(aVar, mVar, M0.a(i10 | 1));
        return C16807N.f139792a;
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x0048  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x004d  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x006c  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0072  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00e8  */
    /* JADX WARNING: Removed duplicated region for block: B:55:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static final void f(boolean r26, boolean r27, nI.C17631a<XH.C16807N> r28, U0.C4889m r29, int r30, int r31) {
        /*
            r4 = r30
            r0 = 38445220(0x24aa0a4, float:1.4886718E-37)
            r1 = r29
            U0.m r1 = r1.k(r0)
            r2 = r31 & 1
            if (r2 == 0) goto L_0x0015
            r3 = r4 | 6
            r5 = r3
            r3 = r26
            goto L_0x0029
        L_0x0015:
            r3 = r4 & 6
            if (r3 != 0) goto L_0x0026
            r3 = r26
            boolean r5 = r1.b(r3)
            if (r5 == 0) goto L_0x0023
            r5 = 4
            goto L_0x0024
        L_0x0023:
            r5 = 2
        L_0x0024:
            r5 = r5 | r4
            goto L_0x0029
        L_0x0026:
            r3 = r26
            r5 = r4
        L_0x0029:
            r6 = r31 & 2
            if (r6 == 0) goto L_0x0032
            r5 = r5 | 48
        L_0x002f:
            r7 = r27
            goto L_0x0044
        L_0x0032:
            r7 = r4 & 48
            if (r7 != 0) goto L_0x002f
            r7 = r27
            boolean r8 = r1.b(r7)
            if (r8 == 0) goto L_0x0041
            r8 = 32
            goto L_0x0043
        L_0x0041:
            r8 = 16
        L_0x0043:
            r5 = r5 | r8
        L_0x0044:
            r8 = r31 & 4
            if (r8 == 0) goto L_0x004d
            r5 = r5 | 384(0x180, float:5.38E-43)
            r15 = r28
            goto L_0x005f
        L_0x004d:
            r8 = r4 & 384(0x180, float:5.38E-43)
            r15 = r28
            if (r8 != 0) goto L_0x005f
            boolean r8 = r1.F(r15)
            if (r8 == 0) goto L_0x005c
            r8 = 256(0x100, float:3.59E-43)
            goto L_0x005e
        L_0x005c:
            r8 = 128(0x80, float:1.794E-43)
        L_0x005e:
            r5 = r5 | r8
        L_0x005f:
            r8 = r5 & 147(0x93, float:2.06E-43)
            r9 = 146(0x92, float:2.05E-43)
            if (r8 != r9) goto L_0x0072
            boolean r8 = r1.l()
            if (r8 != 0) goto L_0x006c
            goto L_0x0072
        L_0x006c:
            r1.L()
            r2 = r7
            goto L_0x00e2
        L_0x0072:
            r8 = 1
            if (r2 == 0) goto L_0x0076
            r3 = r8
        L_0x0076:
            r2 = 0
            if (r6 == 0) goto L_0x007c
            r18 = r2
            goto L_0x007e
        L_0x007c:
            r18 = r7
        L_0x007e:
            boolean r6 = U0.C4895p.J()
            if (r6 == 0) goto L_0x008a
            r6 = -1
            java.lang.String r7 = "com.ingka.ikea.app.scanandgoonlineredesign.upptacka.presentation.ui.ImportButton (UpptackaImportProductButtons.kt:52)"
            U0.C4895p.S(r0, r5, r6, r7)
        L_0x008a:
            androidx.compose.ui.d$a r0 = androidx.compose.ui.d.f18749a
            java.lang.String r6 = "UpptackaImportProduct.PrimaryButton.TAG"
            androidx.compose.ui.d r19 = androidx.compose.ui.platform.C5116k1.a(r0, r6)
            tK.u r0 = tK.C18029u.f147649a
            float r23 = r0.j()
            r24 = 7
            r25 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            androidx.compose.ui.d r0 = androidx.compose.foundation.layout.D.m(r19, r20, r21, r22, r23, r24, r25)
            r6 = 0
            r7 = 0
            androidx.compose.ui.d r6 = androidx.compose.foundation.layout.J.h(r0, r6, r8, r7)
            int r0 = Ez.f.f109695e
            java.lang.String r0 = J1.j.b(r0, r1, r2)
            SC.N r8 = SC.N.Primary
            int r2 = r5 << 6
            r2 = r2 & 896(0x380, float:1.256E-42)
            r2 = r2 | 3072(0xc00, float:4.305E-42)
            int r7 = r5 << 12
            r9 = 458752(0x70000, float:6.42848E-40)
            r7 = r7 & r9
            r2 = r2 | r7
            int r5 = r5 << 21
            r7 = 1879048192(0x70000000, float:1.58456325E29)
            r5 = r5 & r7
            r16 = r2 | r5
            r17 = 464(0x1d0, float:6.5E-43)
            r9 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r5 = r0
            r7 = r3
            r10 = r18
            r14 = r28
            r15 = r1
            SC.L.b(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            boolean r0 = U0.C4895p.J()
            if (r0 == 0) goto L_0x00e0
            U0.C4895p.R()
        L_0x00e0:
            r2 = r18
        L_0x00e2:
            U0.Y0 r6 = r1.n()
            if (r6 == 0) goto L_0x00f8
            Sj.l r7 = new Sj.l
            r0 = r7
            r1 = r3
            r3 = r28
            r4 = r30
            r5 = r31
            r0.<init>(r1, r2, r3, r4, r5)
            r6.a(r7)
        L_0x00f8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: Sj.C10927n.f(boolean, boolean, nI.a, U0.m, int, int):void");
    }

    /* access modifiers changed from: private */
    public static final C16807N g(boolean z10, boolean z11, C17631a aVar, int i10, int i11, C4889m mVar, int i12) {
        f(z10, z11, aVar, mVar, M0.a(i10 | 1), i11);
        return C16807N.f139792a;
    }

    /* JADX WARNING: Removed duplicated region for block: B:57:0x00a8  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00ae  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x017a  */
    /* JADX WARNING: Removed duplicated region for block: B:84:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void h(boolean r15, boolean r16, nI.C17631a<XH.C16807N> r17, nI.C17631a<XH.C16807N> r18, androidx.compose.ui.d r19, U0.C4889m r20, int r21, int r22) {
        /*
            r6 = r17
            r7 = r18
            r8 = r21
            r0 = 16
            r1 = 2
            r2 = 4
            java.lang.String r3 = "onPrimaryButtonClick"
            kotlin.jvm.internal.C17542s.j(r6, r3)
            java.lang.String r3 = "onSecondaryButtonClick"
            kotlin.jvm.internal.C17542s.j(r7, r3)
            r3 = -594243766(0xffffffffdc948f4a, float:-3.34526756E17)
            r4 = r20
            U0.m r9 = r4.k(r3)
            r4 = r22 & 1
            if (r4 == 0) goto L_0x0025
            r4 = r8 | 6
            r10 = r15
            goto L_0x0036
        L_0x0025:
            r4 = r8 & 6
            r10 = r15
            if (r4 != 0) goto L_0x0035
            boolean r4 = r9.b(r15)
            if (r4 == 0) goto L_0x0032
            r4 = r2
            goto L_0x0033
        L_0x0032:
            r4 = r1
        L_0x0033:
            r4 = r4 | r8
            goto L_0x0036
        L_0x0035:
            r4 = r8
        L_0x0036:
            r1 = r22 & 2
            if (r1 == 0) goto L_0x003f
            r4 = r4 | 48
            r11 = r16
            goto L_0x0050
        L_0x003f:
            r1 = r8 & 48
            r11 = r16
            if (r1 != 0) goto L_0x0050
            boolean r1 = r9.b(r11)
            if (r1 == 0) goto L_0x004e
            r1 = 32
            goto L_0x004f
        L_0x004e:
            r1 = r0
        L_0x004f:
            r4 = r4 | r1
        L_0x0050:
            r1 = r22 & 4
            if (r1 == 0) goto L_0x0057
            r4 = r4 | 384(0x180, float:5.38E-43)
            goto L_0x0067
        L_0x0057:
            r1 = r8 & 384(0x180, float:5.38E-43)
            if (r1 != 0) goto L_0x0067
            boolean r1 = r9.F(r6)
            if (r1 == 0) goto L_0x0064
            r1 = 256(0x100, float:3.59E-43)
            goto L_0x0066
        L_0x0064:
            r1 = 128(0x80, float:1.794E-43)
        L_0x0066:
            r4 = r4 | r1
        L_0x0067:
            r1 = r22 & 8
            if (r1 == 0) goto L_0x006e
            r4 = r4 | 3072(0xc00, float:4.305E-42)
            goto L_0x007e
        L_0x006e:
            r1 = r8 & 3072(0xc00, float:4.305E-42)
            if (r1 != 0) goto L_0x007e
            boolean r1 = r9.F(r7)
            if (r1 == 0) goto L_0x007b
            r1 = 2048(0x800, float:2.87E-42)
            goto L_0x007d
        L_0x007b:
            r1 = 1024(0x400, float:1.435E-42)
        L_0x007d:
            r4 = r4 | r1
        L_0x007e:
            r0 = r22 & 16
            if (r0 == 0) goto L_0x0088
            r4 = r4 | 24576(0x6000, float:3.4438E-41)
        L_0x0084:
            r1 = r19
        L_0x0086:
            r12 = r4
            goto L_0x009b
        L_0x0088:
            r1 = r8 & 24576(0x6000, float:3.4438E-41)
            if (r1 != 0) goto L_0x0084
            r1 = r19
            boolean r2 = r9.V(r1)
            if (r2 == 0) goto L_0x0097
            r2 = 16384(0x4000, float:2.2959E-41)
            goto L_0x0099
        L_0x0097:
            r2 = 8192(0x2000, float:1.14794E-41)
        L_0x0099:
            r4 = r4 | r2
            goto L_0x0086
        L_0x009b:
            r2 = r12 & 9363(0x2493, float:1.312E-41)
            r4 = 9362(0x2492, float:1.3119E-41)
            if (r2 != r4) goto L_0x00ae
            boolean r2 = r9.l()
            if (r2 != 0) goto L_0x00a8
            goto L_0x00ae
        L_0x00a8:
            r9.L()
            r5 = r1
            goto L_0x0174
        L_0x00ae:
            if (r0 == 0) goto L_0x00b4
            androidx.compose.ui.d$a r0 = androidx.compose.ui.d.f18749a
            r13 = r0
            goto L_0x00b5
        L_0x00b4:
            r13 = r1
        L_0x00b5:
            boolean r0 = U0.C4895p.J()
            if (r0 == 0) goto L_0x00c1
            r0 = -1
            java.lang.String r1 = "com.ingka.ikea.app.scanandgoonlineredesign.upptacka.presentation.ui.UpptackaImportProductButtons (UpptackaImportProductButtons.kt:29)"
            U0.C4895p.S(r3, r12, r0, r1)
        L_0x00c1:
            tK.u r0 = tK.C18029u.f147649a
            float r1 = r0.e()
            float r2 = r0.d()
            float r3 = r0.d()
            float r0 = r0.d()
            androidx.compose.ui.d r0 = androidx.compose.foundation.layout.D.l(r13, r3, r1, r0, r2)
            androidx.compose.foundation.layout.d r1 = androidx.compose.foundation.layout.C5073d.f18068a
            androidx.compose.foundation.layout.d$m r1 = r1.g()
            i1.c$a r2 = i1.C5437c.f24302a
            i1.c$b r2 = r2.k()
            r3 = 0
            E1.I r1 = androidx.compose.foundation.layout.C5080k.a(r1, r2, r9, r3)
            int r2 = U0.C4883j.a(r9, r3)
            U0.y r3 = r9.s()
            androidx.compose.ui.d r0 = androidx.compose.ui.c.e(r9, r0)
            G1.g$a r4 = G1.C4504g.f6515W
            nI.a r5 = r4.a()
            U0.f r14 = r9.m()
            if (r14 != 0) goto L_0x0103
            U0.C4883j.c()
        L_0x0103:
            r9.I()
            boolean r14 = r9.i()
            if (r14 == 0) goto L_0x0110
            r9.p(r5)
            goto L_0x0113
        L_0x0110:
            r9.t()
        L_0x0113:
            U0.m r5 = U0.F1.a(r9)
            nI.p r14 = r4.c()
            U0.F1.c(r5, r1, r14)
            nI.p r1 = r4.e()
            U0.F1.c(r5, r3, r1)
            nI.p r1 = r4.b()
            boolean r3 = r5.i()
            if (r3 != 0) goto L_0x013d
            java.lang.Object r3 = r5.D()
            java.lang.Integer r14 = java.lang.Integer.valueOf(r2)
            boolean r3 = kotlin.jvm.internal.C17542s.e(r3, r14)
            if (r3 != 0) goto L_0x014b
        L_0x013d:
            java.lang.Integer r3 = java.lang.Integer.valueOf(r2)
            r5.u(r3)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r5.w(r2, r1)
        L_0x014b:
            nI.p r1 = r4.d()
            U0.F1.c(r5, r0, r1)
            s0.h r0 = s0.C5862h.f28810a
            r4 = r12 & 1022(0x3fe, float:1.432E-42)
            r5 = 0
            r0 = r15
            r1 = r16
            r2 = r17
            r3 = r9
            f(r0, r1, r2, r3, r4, r5)
            int r0 = r12 >> 9
            r0 = r0 & 14
            d(r7, r9, r0)
            r9.x()
            boolean r0 = U0.C4895p.J()
            if (r0 == 0) goto L_0x0173
            U0.C4895p.R()
        L_0x0173:
            r5 = r13
        L_0x0174:
            U0.Y0 r9 = r9.n()
            if (r9 == 0) goto L_0x018e
            Sj.k r12 = new Sj.k
            r0 = r12
            r1 = r15
            r2 = r16
            r3 = r17
            r4 = r18
            r6 = r21
            r7 = r22
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            r9.a(r12)
        L_0x018e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: Sj.C10927n.h(boolean, boolean, nI.a, nI.a, androidx.compose.ui.d, U0.m, int, int):void");
    }

    /* access modifiers changed from: private */
    public static final C16807N i(boolean z10, boolean z11, C17631a aVar, C17631a aVar2, d dVar, int i10, int i11, C4889m mVar, int i12) {
        h(z10, z11, aVar, aVar2, dVar, mVar, M0.a(i10 | 1), i11);
        return C16807N.f139792a;
    }
}
