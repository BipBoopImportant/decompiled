package sl;

import J1.j;
import Oo.b;
import SC.F0;
import SC.G0;
import SC.H0;
import U0.C4889m;
import U0.C4895p;
import U0.M0;
import U0.Y0;
import XH.C16807N;
import androidx.compose.foundation.layout.D;
import androidx.compose.ui.d;
import c2.h;
import kotlin.Metadata;
import nI.C17631a;
import r0.m;
import s0.C5852X;
import uK.C18146a;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\n\u001a)\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b\u001a\u001d\u0010\u000b\u001a\u00020\u00062\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\tH\u0003¢\u0006\u0004\b\u000b\u0010\f\u001a/\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\r2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00060\t2\b\b\u0002\u0010\u0005\u001a\u00020\u0004H\u0003¢\u0006\u0004\b\u0010\u0010\u0011\u001a1\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\r2\b\b\u0002\u0010\u0005\u001a\u00020\u0004H\u0003¢\u0006\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lsl/g;", "dataContent", "Lsl/f;", "actions", "Landroidx/compose/ui/d;", "modifier", "LXH/N;", "k", "(Lsl/g;Lsl/f;Landroidx/compose/ui/d;LU0/m;II)V", "Lkotlin/Function0;", "onQuitClicked", "g", "(LnI/a;LU0/m;I)V", "", "buttonText", "onClick", "o", "(Ljava/lang/String;LnI/a;Landroidx/compose/ui/d;LU0/m;II)V", "badge", "title", "description", "i", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroidx/compose/ui/d;LU0/m;II)V", "uicomposables_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class n {
    private static final void g(C17631a<C16807N> aVar, C4889m mVar, int i10) {
        int i11;
        C4889m k10 = mVar.k(2029114182);
        if ((i10 & 6) == 0) {
            i11 = (k10.F(aVar) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i11 & 3) != 2 || !k10.l()) {
            if (C4895p.J()) {
                C4895p.S(2029114182, i11, -1, "com.ingka.ikea.app.uicomposables.dialog.CloseButton (FullscreenWithImageDialog.kt:90)");
            }
            float f10 = (float) 16;
            F0.b(C18146a.f148097J2, j.b(b.f84665i, k10, 0), D.m(C5852X.e(d.f18749a), h.B(f10), h.B(f10), 0.0f, 0.0f, 12, (Object) null), false, H0.PrimaryInverseStatic, G0.Small, (m) null, false, aVar, k10, ((i11 << 24) & 234881024) | 221184, 200);
            if (C4895p.J()) {
                C4895p.R();
            }
        } else {
            k10.L();
        }
        Y0 n10 = k10.n();
        if (n10 != null) {
            n10.a(new k(aVar, i10));
        }
    }

    /* access modifiers changed from: private */
    public static final C16807N h(C17631a aVar, int i10, C4889m mVar, int i11) {
        g(aVar, mVar, M0.a(i10 | 1));
        return C16807N.f139792a;
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x004b  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0050  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0066  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x006c  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x008c  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x0093  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x01ec  */
    /* JADX WARNING: Removed duplicated region for block: B:76:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static final void i(java.lang.String r34, java.lang.String r35, java.lang.String r36, androidx.compose.ui.d r37, U0.C4889m r38, int r39, int r40) {
        /*
            r5 = r39
            r0 = 8
            r1 = 2
            r2 = 4
            r3 = 6
            r4 = -388007555(0xffffffffe8df797d, float:-8.4426303E24)
            r6 = r38
            U0.m r6 = r6.k(r4)
            r7 = 1
            r8 = r40 & 1
            if (r8 == 0) goto L_0x001a
            r8 = r5 | 6
            r15 = r34
            goto L_0x002c
        L_0x001a:
            r8 = r5 & 6
            r15 = r34
            if (r8 != 0) goto L_0x002b
            boolean r8 = r6.V(r15)
            if (r8 == 0) goto L_0x0028
            r8 = r2
            goto L_0x0029
        L_0x0028:
            r8 = r1
        L_0x0029:
            r8 = r8 | r5
            goto L_0x002c
        L_0x002b:
            r8 = r5
        L_0x002c:
            r1 = r40 & 2
            if (r1 == 0) goto L_0x0035
            r8 = r8 | 48
        L_0x0032:
            r1 = r35
            goto L_0x0047
        L_0x0035:
            r1 = r5 & 48
            if (r1 != 0) goto L_0x0032
            r1 = r35
            boolean r9 = r6.V(r1)
            if (r9 == 0) goto L_0x0044
            r9 = 32
            goto L_0x0046
        L_0x0044:
            r9 = 16
        L_0x0046:
            r8 = r8 | r9
        L_0x0047:
            r2 = r40 & 4
            if (r2 == 0) goto L_0x0050
            r8 = r8 | 384(0x180, float:5.38E-43)
        L_0x004d:
            r2 = r36
            goto L_0x0062
        L_0x0050:
            r2 = r5 & 384(0x180, float:5.38E-43)
            if (r2 != 0) goto L_0x004d
            r2 = r36
            boolean r9 = r6.V(r2)
            if (r9 == 0) goto L_0x005f
            r9 = 256(0x100, float:3.59E-43)
            goto L_0x0061
        L_0x005f:
            r9 = 128(0x80, float:1.794E-43)
        L_0x0061:
            r8 = r8 | r9
        L_0x0062:
            r9 = r40 & 8
            if (r9 == 0) goto L_0x006c
            r8 = r8 | 3072(0xc00, float:4.305E-42)
        L_0x0068:
            r10 = r37
        L_0x006a:
            r11 = r8
            goto L_0x007f
        L_0x006c:
            r10 = r5 & 3072(0xc00, float:4.305E-42)
            if (r10 != 0) goto L_0x0068
            r10 = r37
            boolean r11 = r6.V(r10)
            if (r11 == 0) goto L_0x007b
            r11 = 2048(0x800, float:2.87E-42)
            goto L_0x007d
        L_0x007b:
            r11 = 1024(0x400, float:1.435E-42)
        L_0x007d:
            r8 = r8 | r11
            goto L_0x006a
        L_0x007f:
            r8 = r11 & 1171(0x493, float:1.641E-42)
            r12 = 1170(0x492, float:1.64E-42)
            if (r8 != r12) goto L_0x0093
            boolean r8 = r6.l()
            if (r8 != 0) goto L_0x008c
            goto L_0x0093
        L_0x008c:
            r6.L()
            r0 = r6
            r4 = r10
            goto L_0x01e6
        L_0x0093:
            if (r9 == 0) goto L_0x0099
            androidx.compose.ui.d$a r8 = androidx.compose.ui.d.f18749a
            r12 = r8
            goto L_0x009a
        L_0x0099:
            r12 = r10
        L_0x009a:
            boolean r8 = U0.C4895p.J()
            if (r8 == 0) goto L_0x00a6
            r8 = -1
            java.lang.String r9 = "com.ingka.ikea.app.uicomposables.dialog.Content (FullscreenWithImageDialog.kt:134)"
            U0.C4895p.S(r4, r11, r8, r9)
        L_0x00a6:
            r4 = 0
            r8 = 0
            androidx.compose.ui.d r4 = androidx.compose.foundation.layout.J.f(r12, r4, r7, r8)
            androidx.compose.foundation.layout.d r7 = androidx.compose.foundation.layout.C5073d.f18068a
            androidx.compose.foundation.layout.d$m r7 = r7.g()
            i1.c$a r8 = i1.C5437c.f24302a
            i1.c$b r8 = r8.k()
            r9 = 0
            E1.I r7 = androidx.compose.foundation.layout.C5080k.a(r7, r8, r6, r9)
            int r8 = U0.C4883j.a(r6, r9)
            U0.y r9 = r6.s()
            androidx.compose.ui.d r4 = androidx.compose.ui.c.e(r6, r4)
            G1.g$a r10 = G1.C4504g.f6515W
            nI.a r14 = r10.a()
            U0.f r16 = r6.m()
            if (r16 != 0) goto L_0x00d8
            U0.C4883j.c()
        L_0x00d8:
            r6.I()
            boolean r16 = r6.i()
            if (r16 == 0) goto L_0x00e5
            r6.p(r14)
            goto L_0x00e8
        L_0x00e5:
            r6.t()
        L_0x00e8:
            U0.m r14 = U0.F1.a(r6)
            nI.p r13 = r10.c()
            U0.F1.c(r14, r7, r13)
            nI.p r7 = r10.e()
            U0.F1.c(r14, r9, r7)
            nI.p r7 = r10.b()
            boolean r9 = r14.i()
            if (r9 != 0) goto L_0x0112
            java.lang.Object r9 = r14.D()
            java.lang.Integer r13 = java.lang.Integer.valueOf(r8)
            boolean r9 = kotlin.jvm.internal.C17542s.e(r9, r13)
            if (r9 != 0) goto L_0x0120
        L_0x0112:
            java.lang.Integer r9 = java.lang.Integer.valueOf(r8)
            r14.u(r9)
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            r14.w(r8, r7)
        L_0x0120:
            nI.p r7 = r10.d()
            U0.F1.c(r14, r4, r7)
            s0.h r4 = s0.C5862h.f28810a
            androidx.compose.ui.d$a r4 = androidx.compose.ui.d.f18749a
            r7 = 40
            float r7 = (float) r7
            float r7 = c2.h.B(r7)
            androidx.compose.ui.d r7 = androidx.compose.foundation.layout.J.i(r4, r7)
            s0.C5844O.a(r7, r6, r3)
            TC.b$a$c r7 = TC.C13679b.a.c.f116681a
            S1.C$a r8 = S1.C.f13316b
            S1.C r14 = r8.a()
            r8 = r11 & 14
            r9 = 1572912(0x180030, float:2.204119E-39)
            r29 = r8 | r9
            r30 = 0
            r31 = 262076(0x3ffbc, float:3.67247E-40)
            r8 = 0
            r9 = 0
            r16 = 0
            r32 = r11
            r33 = r12
            r11 = r16
            r13 = 0
            r16 = 0
            r15 = r16
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
            r37 = r6
            r6 = r34
            r28 = r37
            SC.C13607l.j(r6, r7, r8, r9, r11, r13, r14, r15, r16, r18, r19, r20, r21, r23, r24, r25, r26, r27, r28, r29, r30, r31)
            float r0 = (float) r0
            float r0 = c2.h.B(r0)
            androidx.compose.ui.d r0 = androidx.compose.foundation.layout.J.i(r4, r0)
            r6 = r37
            s0.C5844O.a(r0, r6, r3)
            TC.b$b$a r7 = TC.C13679b.C2857b.a.f116683a
            int r0 = r32 >> 3
            r0 = r0 & 14
            r29 = r0 | 48
            r31 = 262140(0x3fffc, float:3.67336E-40)
            r11 = 0
            r14 = 0
            r15 = 0
            r0 = r6
            r6 = r35
            r28 = r0
            SC.C13607l.j(r6, r7, r8, r9, r11, r13, r14, r15, r16, r18, r19, r20, r21, r23, r24, r25, r26, r27, r28, r29, r30, r31)
            r6 = 20
            float r6 = (float) r6
            float r6 = c2.h.B(r6)
            androidx.compose.ui.d r6 = androidx.compose.foundation.layout.J.i(r4, r6)
            s0.C5844O.a(r6, r0, r3)
            TC.b$a$b r7 = TC.C13679b.a.C2856b.f116680a
            tK.v r6 = tK.C18030v.f147664a
            int r8 = tK.C18030v.f147665b
            tK.h r6 = r6.a(r0, r8)
            long r9 = r6.G0()
            int r6 = r32 >> 6
            r6 = r6 & 14
            r29 = r6 | 48
            r31 = 262132(0x3fff4, float:3.67325E-40)
            r8 = 0
            r6 = r36
            SC.C13607l.j(r6, r7, r8, r9, r11, r13, r14, r15, r16, r18, r19, r20, r21, r23, r24, r25, r26, r27, r28, r29, r30, r31)
            r6 = 16
            float r6 = (float) r6
            float r6 = c2.h.B(r6)
            androidx.compose.ui.d r4 = androidx.compose.foundation.layout.J.i(r4, r6)
            s0.C5844O.a(r4, r0, r3)
            r0.x()
            boolean r3 = U0.C4895p.J()
            if (r3 == 0) goto L_0x01e4
            U0.C4895p.R()
        L_0x01e4:
            r4 = r33
        L_0x01e6:
            U0.Y0 r7 = r0.n()
            if (r7 == 0) goto L_0x01ff
            sl.l r8 = new sl.l
            r0 = r8
            r1 = r34
            r2 = r35
            r3 = r36
            r5 = r39
            r6 = r40
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r7.a(r8)
        L_0x01ff:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: sl.n.i(java.lang.String, java.lang.String, java.lang.String, androidx.compose.ui.d, U0.m, int, int):void");
    }

    /* access modifiers changed from: private */
    public static final C16807N j(String str, String str2, String str3, d dVar, int i10, int i11, C4889m mVar, int i12) {
        i(str, str2, str3, dVar, mVar, M0.a(i10 | 1), i11);
        return C16807N.f139792a;
    }

    /* JADX WARNING: Removed duplicated region for block: B:103:0x02b0  */
    /* JADX WARNING: Removed duplicated region for block: B:105:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x007e  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0085  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void k(sl.C11867g r27, sl.C11866f r28, androidx.compose.ui.d r29, U0.C4889m r30, int r31, int r32) {
        /*
            r1 = r27
            r2 = r28
            r4 = r31
            r0 = 4
            r3 = 6
            java.lang.String r5 = "dataContent"
            kotlin.jvm.internal.C17542s.j(r1, r5)
            java.lang.String r5 = "actions"
            kotlin.jvm.internal.C17542s.j(r2, r5)
            r5 = 98774459(0x5e32dbb, float:2.1363776E-35)
            r6 = r30
            U0.m r15 = r6.k(r5)
            r14 = 1
            r6 = r32 & 1
            r13 = 2
            if (r6 == 0) goto L_0x0024
            r6 = r4 | 6
            goto L_0x0034
        L_0x0024:
            r6 = r4 & 6
            if (r6 != 0) goto L_0x0033
            boolean r6 = r15.V(r1)
            if (r6 == 0) goto L_0x0030
            r6 = r0
            goto L_0x0031
        L_0x0030:
            r6 = r13
        L_0x0031:
            r6 = r6 | r4
            goto L_0x0034
        L_0x0033:
            r6 = r4
        L_0x0034:
            r7 = r32 & 2
            if (r7 == 0) goto L_0x003b
            r6 = r6 | 48
            goto L_0x0054
        L_0x003b:
            r7 = r4 & 48
            if (r7 != 0) goto L_0x0054
            r7 = r4 & 64
            if (r7 != 0) goto L_0x0048
            boolean r7 = r15.V(r2)
            goto L_0x004c
        L_0x0048:
            boolean r7 = r15.F(r2)
        L_0x004c:
            if (r7 == 0) goto L_0x0051
            r7 = 32
            goto L_0x0053
        L_0x0051:
            r7 = 16
        L_0x0053:
            r6 = r6 | r7
        L_0x0054:
            r0 = r32 & 4
            if (r0 == 0) goto L_0x005e
            r6 = r6 | 384(0x180, float:5.38E-43)
        L_0x005a:
            r7 = r29
        L_0x005c:
            r11 = r6
            goto L_0x0071
        L_0x005e:
            r7 = r4 & 384(0x180, float:5.38E-43)
            if (r7 != 0) goto L_0x005a
            r7 = r29
            boolean r8 = r15.V(r7)
            if (r8 == 0) goto L_0x006d
            r8 = 256(0x100, float:3.59E-43)
            goto L_0x006f
        L_0x006d:
            r8 = 128(0x80, float:1.794E-43)
        L_0x006f:
            r6 = r6 | r8
            goto L_0x005c
        L_0x0071:
            r6 = r11 & 147(0x93, float:2.06E-43)
            r8 = 146(0x92, float:2.05E-43)
            if (r6 != r8) goto L_0x0085
            boolean r6 = r15.l()
            if (r6 != 0) goto L_0x007e
            goto L_0x0085
        L_0x007e:
            r15.L()
            r3 = r7
            r5 = r15
            goto L_0x02aa
        L_0x0085:
            if (r0 == 0) goto L_0x008a
            androidx.compose.ui.d$a r0 = androidx.compose.ui.d.f18749a
            goto L_0x008b
        L_0x008a:
            r0 = r7
        L_0x008b:
            boolean r6 = U0.C4895p.J()
            if (r6 == 0) goto L_0x0097
            r6 = -1
            java.lang.String r7 = "com.ingka.ikea.app.uicomposables.dialog.FullscreenWithImageDialog (FullscreenWithImageDialog.kt:50)"
            U0.C4895p.S(r5, r11, r6, r7)
        L_0x0097:
            i1.c$a r5 = i1.C5437c.f24302a
            i1.c r6 = r5.o()
            r10 = 0
            E1.I r6 = androidx.compose.foundation.layout.C5077h.h(r6, r10)
            int r7 = U0.C4883j.a(r15, r10)
            U0.y r8 = r15.s()
            androidx.compose.ui.d r9 = androidx.compose.ui.c.e(r15, r0)
            G1.g$a r16 = G1.C4504g.f6515W
            nI.a r12 = r16.a()
            U0.f r17 = r15.m()
            if (r17 != 0) goto L_0x00bd
            U0.C4883j.c()
        L_0x00bd:
            r15.I()
            boolean r17 = r15.i()
            if (r17 == 0) goto L_0x00ca
            r15.p(r12)
            goto L_0x00cd
        L_0x00ca:
            r15.t()
        L_0x00cd:
            U0.m r12 = U0.F1.a(r15)
            nI.p r13 = r16.c()
            U0.F1.c(r12, r6, r13)
            nI.p r6 = r16.e()
            U0.F1.c(r12, r8, r6)
            nI.p r6 = r16.b()
            boolean r8 = r12.i()
            if (r8 != 0) goto L_0x00f7
            java.lang.Object r8 = r12.D()
            java.lang.Integer r13 = java.lang.Integer.valueOf(r7)
            boolean r8 = kotlin.jvm.internal.C17542s.e(r8, r13)
            if (r8 != 0) goto L_0x0105
        L_0x00f7:
            java.lang.Integer r8 = java.lang.Integer.valueOf(r7)
            r12.u(r8)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r12.w(r7, r6)
        L_0x0105:
            nI.p r6 = r16.d()
            U0.F1.c(r12, r9, r6)
            androidx.compose.foundation.layout.j r6 = androidx.compose.foundation.layout.C5079j.f18125a
            androidx.compose.ui.d$a r13 = androidx.compose.ui.d.f18749a
            r12 = 0
            r9 = 0
            androidx.compose.ui.d r18 = androidx.compose.foundation.layout.J.f(r13, r12, r14, r9)
            androidx.compose.foundation.o r19 = androidx.compose.foundation.m.c(r10, r15, r10, r14)
            r23 = 14
            r24 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            androidx.compose.ui.d r6 = androidx.compose.foundation.m.f(r18, r19, r20, r21, r22, r23, r24)
            androidx.compose.foundation.layout.d r7 = androidx.compose.foundation.layout.C5073d.f18068a
            androidx.compose.foundation.layout.d$f r7 = r7.d()
            i1.c$b r5 = r5.k()
            E1.I r3 = androidx.compose.foundation.layout.C5080k.a(r7, r5, r15, r3)
            int r5 = U0.C4883j.a(r15, r10)
            U0.y r7 = r15.s()
            androidx.compose.ui.d r6 = androidx.compose.ui.c.e(r15, r6)
            nI.a r8 = r16.a()
            U0.f r18 = r15.m()
            if (r18 != 0) goto L_0x014f
            U0.C4883j.c()
        L_0x014f:
            r15.I()
            boolean r18 = r15.i()
            if (r18 == 0) goto L_0x015c
            r15.p(r8)
            goto L_0x015f
        L_0x015c:
            r15.t()
        L_0x015f:
            U0.m r8 = U0.F1.a(r15)
            nI.p r10 = r16.c()
            U0.F1.c(r8, r3, r10)
            nI.p r3 = r16.e()
            U0.F1.c(r8, r7, r3)
            nI.p r3 = r16.b()
            boolean r7 = r8.i()
            if (r7 != 0) goto L_0x0189
            java.lang.Object r7 = r8.D()
            java.lang.Integer r10 = java.lang.Integer.valueOf(r5)
            boolean r7 = kotlin.jvm.internal.C17542s.e(r7, r10)
            if (r7 != 0) goto L_0x0197
        L_0x0189:
            java.lang.Integer r7 = java.lang.Integer.valueOf(r5)
            r8.u(r7)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r8.w(r5, r3)
        L_0x0197:
            nI.p r3 = r16.d()
            U0.F1.c(r8, r6, r3)
            s0.h r3 = s0.C5862h.f28810a
            java.lang.String r6 = r27.e()
            java.lang.String r7 = r27.d()
            LC.b$b r3 = new LC.b$b
            gs.h$a r5 = gs.h.a.XS
            r3.<init>(r5)
            E1.k$a r5 = E1.C4478k.f5915a
            E1.k r5 = r5.a()
            androidx.compose.ui.d r8 = androidx.compose.foundation.layout.J.h(r13, r12, r14, r9)
            r10 = 1069547520(0x3fc00000, float:1.5)
            r12 = 0
            r14 = 2
            androidx.compose.ui.d r8 = androidx.compose.foundation.layout.C5074e.b(r8, r10, r12, r14, r9)
            int r10 = LC.C13178b.C2734b.f111820b
            int r10 = r10 << 9
            r17 = 196992(0x30180, float:2.76045E-40)
            r19 = r10 | r17
            r20 = 0
            r21 = 4048(0xfd0, float:5.672E-42)
            r10 = 0
            r17 = 0
            r18 = 0
            r22 = 0
            r23 = 0
            r24 = 0
            r25 = 0
            r9 = r3
            r3 = r12
            r26 = r11
            r11 = r5
            r3 = 0
            r5 = 32
            r12 = r17
            r5 = r13
            r13 = r18
            r14 = r22
            r22 = r15
            r15 = r23
            r16 = r24
            r17 = r25
            r18 = r22
            LC.h.c(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
            java.lang.String r6 = r27.a()
            java.lang.String r7 = r27.f()
            java.lang.String r8 = r27.c()
            r9 = 0
            r13 = 1
            androidx.compose.ui.d r5 = androidx.compose.foundation.layout.J.f(r5, r3, r13, r9)
            r10 = 24
            float r10 = (float) r10
            float r10 = c2.h.B(r10)
            r11 = 2
            s0.E r3 = androidx.compose.foundation.layout.D.c(r10, r3, r11, r9)
            androidx.compose.ui.d r9 = androidx.compose.foundation.layout.D.h(r5, r3)
            r11 = 3072(0xc00, float:4.305E-42)
            r12 = 0
            r10 = r22
            i(r6, r7, r8, r9, r10, r11, r12)
            java.lang.String r6 = r27.b()
            r3 = 1708232588(0x65d18f8c, float:1.2370282E23)
            r5 = r22
            r5.W(r3)
            r3 = r26 & 112(0x70, float:1.57E-43)
            r7 = 32
            if (r3 == r7) goto L_0x0240
            r7 = r26 & 64
            if (r7 == 0) goto L_0x023e
            boolean r7 = r5.F(r2)
            if (r7 == 0) goto L_0x023e
            goto L_0x0240
        L_0x023e:
            r14 = 0
            goto L_0x0241
        L_0x0240:
            r14 = r13
        L_0x0241:
            java.lang.Object r7 = r5.D()
            if (r14 != 0) goto L_0x024f
            U0.m$a r8 = U0.C4889m.f14007a
            java.lang.Object r8 = r8.a()
            if (r7 != r8) goto L_0x0257
        L_0x024f:
            sl.h r7 = new sl.h
            r7.<init>(r2)
            r5.u(r7)
        L_0x0257:
            nI.a r7 = (nI.C17631a) r7
            r5.P()
            r10 = 0
            r11 = 4
            r8 = 0
            r9 = r5
            o(r6, r7, r8, r9, r10, r11)
            r5.x()
            r6 = 1786980447(0x6a83285f, float:7.9279965E25)
            r5.W(r6)
            r6 = 32
            if (r3 == r6) goto L_0x027d
            r3 = r26 & 64
            if (r3 == 0) goto L_0x027b
            boolean r3 = r5.F(r2)
            if (r3 == 0) goto L_0x027b
            goto L_0x027d
        L_0x027b:
            r14 = 0
            goto L_0x027e
        L_0x027d:
            r14 = r13
        L_0x027e:
            java.lang.Object r3 = r5.D()
            if (r14 != 0) goto L_0x028c
            U0.m$a r6 = U0.C4889m.f14007a
            java.lang.Object r6 = r6.a()
            if (r3 != r6) goto L_0x0294
        L_0x028c:
            sl.i r3 = new sl.i
            r3.<init>(r2)
            r5.u(r3)
        L_0x0294:
            nI.a r3 = (nI.C17631a) r3
            r5.P()
            r6 = 0
            g(r3, r5, r6)
            r5.x()
            boolean r3 = U0.C4895p.J()
            if (r3 == 0) goto L_0x02a9
            U0.C4895p.R()
        L_0x02a9:
            r3 = r0
        L_0x02aa:
            U0.Y0 r6 = r5.n()
            if (r6 == 0) goto L_0x02c1
            sl.j r7 = new sl.j
            r0 = r7
            r1 = r27
            r2 = r28
            r4 = r31
            r5 = r32
            r0.<init>(r1, r2, r3, r4, r5)
            r6.a(r7)
        L_0x02c1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: sl.n.k(sl.g, sl.f, androidx.compose.ui.d, U0.m, int, int):void");
    }

    /* access modifiers changed from: private */
    public static final C16807N l(C11866f fVar) {
        fVar.b();
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N m(C11866f fVar) {
        fVar.a();
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N n(C11867g gVar, C11866f fVar, d dVar, int i10, int i11, C4889m mVar, int i12) {
        k(gVar, fVar, dVar, mVar, M0.a(i10 | 1), i11);
        return C16807N.f139792a;
    }

    /* JADX WARNING: Removed duplicated region for block: B:36:0x006d  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0072  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00d1  */
    /* JADX WARNING: Removed duplicated region for block: B:51:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static final void o(java.lang.String r18, nI.C17631a<XH.C16807N> r19, androidx.compose.ui.d r20, U0.C4889m r21, int r22, int r23) {
        /*
            r4 = r22
            r0 = 1676321710(0x63eaa3ae, float:8.656665E21)
            r1 = r21
            U0.m r1 = r1.k(r0)
            r2 = r23 & 1
            if (r2 == 0) goto L_0x0015
            r2 = r4 | 6
            r3 = r2
            r2 = r18
            goto L_0x0029
        L_0x0015:
            r2 = r4 & 6
            if (r2 != 0) goto L_0x0026
            r2 = r18
            boolean r3 = r1.V(r2)
            if (r3 == 0) goto L_0x0023
            r3 = 4
            goto L_0x0024
        L_0x0023:
            r3 = 2
        L_0x0024:
            r3 = r3 | r4
            goto L_0x0029
        L_0x0026:
            r2 = r18
            r3 = r4
        L_0x0029:
            r5 = r23 & 2
            r6 = 16
            if (r5 == 0) goto L_0x0034
            r3 = r3 | 48
            r15 = r19
            goto L_0x0045
        L_0x0034:
            r5 = r4 & 48
            r15 = r19
            if (r5 != 0) goto L_0x0045
            boolean r5 = r1.F(r15)
            if (r5 == 0) goto L_0x0043
            r5 = 32
            goto L_0x0044
        L_0x0043:
            r5 = r6
        L_0x0044:
            r3 = r3 | r5
        L_0x0045:
            r5 = r23 & 4
            if (r5 == 0) goto L_0x004e
            r3 = r3 | 384(0x180, float:5.38E-43)
        L_0x004b:
            r7 = r20
            goto L_0x0060
        L_0x004e:
            r7 = r4 & 384(0x180, float:5.38E-43)
            if (r7 != 0) goto L_0x004b
            r7 = r20
            boolean r8 = r1.V(r7)
            if (r8 == 0) goto L_0x005d
            r8 = 256(0x100, float:3.59E-43)
            goto L_0x005f
        L_0x005d:
            r8 = 128(0x80, float:1.794E-43)
        L_0x005f:
            r3 = r3 | r8
        L_0x0060:
            r8 = r3 & 147(0x93, float:2.06E-43)
            r9 = 146(0x92, float:2.05E-43)
            if (r8 != r9) goto L_0x0072
            boolean r8 = r1.l()
            if (r8 != 0) goto L_0x006d
            goto L_0x0072
        L_0x006d:
            r1.L()
            r3 = r7
            goto L_0x00cb
        L_0x0072:
            if (r5 == 0) goto L_0x0078
            androidx.compose.ui.d$a r5 = androidx.compose.ui.d.f18749a
            r14 = r5
            goto L_0x0079
        L_0x0078:
            r14 = r7
        L_0x0079:
            boolean r5 = U0.C4895p.J()
            if (r5 == 0) goto L_0x0085
            r5 = -1
            java.lang.String r7 = "com.ingka.ikea.app.uicomposables.dialog.PrimaryButton (FullscreenWithImageDialog.kt:111)"
            U0.C4895p.S(r0, r3, r5, r7)
        L_0x0085:
            r0 = 0
            r5 = 0
            r7 = 1
            androidx.compose.ui.d r0 = androidx.compose.foundation.layout.J.h(r14, r0, r7, r5)
            float r5 = (float) r6
            float r6 = c2.h.B(r5)
            float r8 = c2.h.B(r5)
            float r9 = c2.h.B(r5)
            r10 = 2
            r11 = 0
            r7 = 0
            s0.E r5 = androidx.compose.foundation.layout.D.e(r6, r7, r8, r9, r10, r11)
            androidx.compose.ui.d r6 = androidx.compose.foundation.layout.D.h(r0, r5)
            SC.N r8 = SC.N.Primary
            r0 = r3 & 14
            r0 = r0 | 3072(0xc00, float:4.305E-42)
            int r3 = r3 << 24
            r5 = 1879048192(0x70000000, float:1.58456325E29)
            r3 = r3 & r5
            r16 = r0 | r3
            r17 = 500(0x1f4, float:7.0E-43)
            r7 = 0
            r9 = 0
            r10 = 0
            r12 = 0
            r13 = 0
            r5 = r18
            r0 = r14
            r14 = r19
            r15 = r1
            SC.L.b(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            boolean r3 = U0.C4895p.J()
            if (r3 == 0) goto L_0x00ca
            U0.C4895p.R()
        L_0x00ca:
            r3 = r0
        L_0x00cb:
            U0.Y0 r6 = r1.n()
            if (r6 == 0) goto L_0x00e2
            sl.m r7 = new sl.m
            r0 = r7
            r1 = r18
            r2 = r19
            r4 = r22
            r5 = r23
            r0.<init>(r1, r2, r3, r4, r5)
            r6.a(r7)
        L_0x00e2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: sl.n.o(java.lang.String, nI.a, androidx.compose.ui.d, U0.m, int, int):void");
    }

    /* access modifiers changed from: private */
    public static final C16807N p(String str, C17631a aVar, d dVar, int i10, int i11, C4889m mVar, int i12) {
        o(str, aVar, dVar, mVar, M0.a(i10 | 1), i11);
        return C16807N.f139792a;
    }
}
