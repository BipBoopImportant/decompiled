package sl;

import O0.e1;
import O0.g1;
import SC.K0;
import SC.L;
import SC.M;
import SC.N;
import U0.C4889m;
import U0.C4895p;
import U0.M0;
import U0.Y0;
import XH.C16807N;
import androidx.compose.foundation.layout.D;
import androidx.compose.foundation.layout.J;
import androidx.compose.ui.d;
import c2.h;
import kotlin.Metadata;
import nI.C17631a;
import nI.q;
import ol.p;
import ol.u;
import ol.v;
import r0.m;
import s0.C5842M;
import s0.C5848T;
import tK.C18029u;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\u001aA\u0010\t\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0007¢\u0006\u0004\b\t\u0010\n\u001a%\u0010\u000b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00002\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0003¢\u0006\u0004\b\u000b\u0010\f\u001a)\u0010\r\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u0004H\u0003¢\u0006\u0004\b\r\u0010\u000e\u001a\u001d\u0010\u000f\u001a\u00020\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0003¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"", "title", "description", "buttonText", "Landroidx/compose/ui/d;", "modifier", "Lkotlin/Function0;", "LXH/N;", "onDismiss", "i", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroidx/compose/ui/d;LnI/a;LU0/m;II)V", "e", "(Ljava/lang/String;LnI/a;LU0/m;I)V", "g", "(Ljava/lang/String;Ljava/lang/String;Landroidx/compose/ui/d;LU0/m;II)V", "k", "(LnI/a;LU0/m;I)V", "uicomposables_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* renamed from: sl.e  reason: case insensitive filesystem */
public final class C11865e {
    private static final void e(String str, C17631a<C16807N> aVar, C4889m mVar, int i10) {
        int i11;
        C4889m mVar2;
        String str2 = str;
        C17631a<C16807N> aVar2 = aVar;
        int i12 = i10;
        C4889m k10 = mVar.k(1464134204);
        if ((i12 & 6) == 0) {
            i11 = (k10.V(str2) ? 4 : 2) | i12;
        } else {
            i11 = i12;
        }
        if ((i12 & 48) == 0) {
            i11 |= k10.F(aVar2) ? 32 : 16;
        }
        if ((i11 & 19) != 18 || !k10.l()) {
            if (C4895p.J()) {
                C4895p.S(1464134204, i11, -1, "com.ingka.ikea.app.uicomposables.dialog.Button (FullscreenDialog.kt:67)");
            }
            d h10 = J.h(d.f18749a, 0.0f, 1, (Object) null);
            C18029u uVar = C18029u.f147649a;
            mVar2 = k10;
            L.b(str, D.h(h10, D.e(uVar.a(), 0.0f, uVar.a(), h.B((float) 16), 2, (Object) null)), false, N.Primary, M.Medium, false, (Integer) null, (K0) null, (m) null, aVar, k10, (i11 & 14) | 27648 | ((i11 << 24) & 1879048192), 484);
            if (C4895p.J()) {
                C4895p.R();
            }
        } else {
            k10.L();
            mVar2 = k10;
        }
        Y0 n10 = mVar2.n();
        if (n10 != null) {
            n10.a(new C11864d(str2, aVar2, i12));
        }
    }

    /* access modifiers changed from: private */
    public static final C16807N f(String str, C17631a aVar, int i10, C4889m mVar, int i11) {
        e(str, aVar, mVar, M0.a(i10 | 1));
        return C16807N.f139792a;
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x0049  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x004f  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x006f  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0075  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x01b2  */
    /* JADX WARNING: Removed duplicated region for block: B:65:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static final void g(java.lang.String r32, java.lang.String r33, androidx.compose.ui.d r34, U0.C4889m r35, int r36, int r37) {
        /*
            r4 = r36
            r0 = 2
            r1 = 4
            r2 = 6
            r3 = -505491061(0xffffffffe1ded18b, float:-5.1378454E20)
            r5 = r35
            U0.m r5 = r5.k(r3)
            r6 = r37 & 1
            if (r6 == 0) goto L_0x0017
            r6 = r4 | 6
            r15 = r32
            goto L_0x0029
        L_0x0017:
            r6 = r4 & 6
            r15 = r32
            if (r6 != 0) goto L_0x0028
            boolean r6 = r5.V(r15)
            if (r6 == 0) goto L_0x0025
            r6 = r1
            goto L_0x0026
        L_0x0025:
            r6 = r0
        L_0x0026:
            r6 = r6 | r4
            goto L_0x0029
        L_0x0028:
            r6 = r4
        L_0x0029:
            r0 = r37 & 2
            r14 = 16
            if (r0 == 0) goto L_0x0034
            r6 = r6 | 48
        L_0x0031:
            r0 = r33
            goto L_0x0045
        L_0x0034:
            r0 = r4 & 48
            if (r0 != 0) goto L_0x0031
            r0 = r33
            boolean r7 = r5.V(r0)
            if (r7 == 0) goto L_0x0043
            r7 = 32
            goto L_0x0044
        L_0x0043:
            r7 = r14
        L_0x0044:
            r6 = r6 | r7
        L_0x0045:
            r1 = r37 & 4
            if (r1 == 0) goto L_0x004f
            r6 = r6 | 384(0x180, float:5.38E-43)
        L_0x004b:
            r7 = r34
        L_0x004d:
            r12 = r6
            goto L_0x0062
        L_0x004f:
            r7 = r4 & 384(0x180, float:5.38E-43)
            if (r7 != 0) goto L_0x004b
            r7 = r34
            boolean r8 = r5.V(r7)
            if (r8 == 0) goto L_0x005e
            r8 = 256(0x100, float:3.59E-43)
            goto L_0x0060
        L_0x005e:
            r8 = 128(0x80, float:1.794E-43)
        L_0x0060:
            r6 = r6 | r8
            goto L_0x004d
        L_0x0062:
            r6 = r12 & 147(0x93, float:2.06E-43)
            r8 = 146(0x92, float:2.05E-43)
            if (r6 != r8) goto L_0x0075
            boolean r6 = r5.l()
            if (r6 != 0) goto L_0x006f
            goto L_0x0075
        L_0x006f:
            r5.L()
            r3 = r7
            goto L_0x01ac
        L_0x0075:
            if (r1 == 0) goto L_0x007a
            androidx.compose.ui.d$a r1 = androidx.compose.ui.d.f18749a
            goto L_0x007b
        L_0x007a:
            r1 = r7
        L_0x007b:
            boolean r6 = U0.C4895p.J()
            if (r6 == 0) goto L_0x0087
            r6 = -1
            java.lang.String r7 = "com.ingka.ikea.app.uicomposables.dialog.Content (FullscreenDialog.kt:90)"
            U0.C4895p.S(r3, r12, r6, r7)
        L_0x0087:
            androidx.compose.foundation.layout.d r3 = androidx.compose.foundation.layout.C5073d.f18068a
            androidx.compose.foundation.layout.d$m r3 = r3.g()
            i1.c$a r6 = i1.C5437c.f24302a
            i1.c$b r6 = r6.k()
            r7 = 0
            E1.I r3 = androidx.compose.foundation.layout.C5080k.a(r3, r6, r5, r7)
            int r6 = U0.C4883j.a(r5, r7)
            U0.y r7 = r5.s()
            androidx.compose.ui.d r8 = androidx.compose.ui.c.e(r5, r1)
            G1.g$a r9 = G1.C4504g.f6515W
            nI.a r10 = r9.a()
            U0.f r11 = r5.m()
            if (r11 != 0) goto L_0x00b3
            U0.C4883j.c()
        L_0x00b3:
            r5.I()
            boolean r11 = r5.i()
            if (r11 == 0) goto L_0x00c0
            r5.p(r10)
            goto L_0x00c3
        L_0x00c0:
            r5.t()
        L_0x00c3:
            U0.m r10 = U0.F1.a(r5)
            nI.p r11 = r9.c()
            U0.F1.c(r10, r3, r11)
            nI.p r3 = r9.e()
            U0.F1.c(r10, r7, r3)
            nI.p r3 = r9.b()
            boolean r7 = r10.i()
            if (r7 != 0) goto L_0x00ed
            java.lang.Object r7 = r10.D()
            java.lang.Integer r11 = java.lang.Integer.valueOf(r6)
            boolean r7 = kotlin.jvm.internal.C17542s.e(r7, r11)
            if (r7 != 0) goto L_0x00fb
        L_0x00ed:
            java.lang.Integer r7 = java.lang.Integer.valueOf(r6)
            r10.u(r7)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r10.w(r6, r3)
        L_0x00fb:
            nI.p r3 = r9.d()
            U0.F1.c(r10, r8, r3)
            s0.h r3 = s0.C5862h.f28810a
            androidx.compose.ui.d$a r3 = androidx.compose.ui.d.f18749a
            r6 = 40
            float r6 = (float) r6
            float r6 = c2.h.B(r6)
            androidx.compose.ui.d r6 = androidx.compose.foundation.layout.J.i(r3, r6)
            s0.C5844O.a(r6, r5, r2)
            TC.b$b$a r6 = TC.C13679b.C2857b.a.f116683a
            S1.C$a r7 = S1.C.f13316b
            S1.C r13 = r7.a()
            r7 = r12 & 14
            r8 = 1572912(0x180030, float:2.204119E-39)
            r28 = r7 | r8
            r29 = 0
            r30 = 262076(0x3ffbc, float:3.67247E-40)
            r7 = 0
            r8 = 0
            r10 = 0
            r16 = 0
            r31 = r12
            r12 = r16
            r14 = r16
            r16 = 0
            r15 = r16
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r22 = 0
            r23 = 0
            r24 = 0
            r25 = 0
            r26 = 0
            r34 = r5
            r5 = r32
            r27 = r34
            SC.C13607l.j(r5, r6, r7, r8, r10, r12, r13, r14, r15, r17, r18, r19, r20, r22, r23, r24, r25, r26, r27, r28, r29, r30)
            r5 = 20
            float r5 = (float) r5
            float r5 = c2.h.B(r5)
            androidx.compose.ui.d r5 = androidx.compose.foundation.layout.J.i(r3, r5)
            r15 = r34
            s0.C5844O.a(r5, r15, r2)
            TC.b$a$b r6 = TC.C13679b.a.C2856b.f116680a
            tK.v r5 = tK.C18030v.f147664a
            int r7 = tK.C18030v.f147665b
            tK.h r5 = r5.a(r15, r7)
            long r8 = r5.G0()
            int r5 = r31 >> 3
            r5 = r5 & 14
            r28 = r5 | 48
            r30 = 262132(0x3fff4, float:3.67325E-40)
            r7 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r16 = 0
            r5 = r15
            r15 = r16
            r17 = 0
            r34 = r5
            r5 = r33
            r27 = r34
            SC.C13607l.j(r5, r6, r7, r8, r10, r12, r13, r14, r15, r17, r18, r19, r20, r22, r23, r24, r25, r26, r27, r28, r29, r30)
            r5 = 16
            float r5 = (float) r5
            float r5 = c2.h.B(r5)
            androidx.compose.ui.d r3 = androidx.compose.foundation.layout.J.i(r3, r5)
            r5 = r34
            s0.C5844O.a(r3, r5, r2)
            r5.x()
            boolean r2 = U0.C4895p.J()
            if (r2 == 0) goto L_0x01ab
            U0.C4895p.R()
        L_0x01ab:
            r3 = r1
        L_0x01ac:
            U0.Y0 r6 = r5.n()
            if (r6 == 0) goto L_0x01c3
            sl.b r7 = new sl.b
            r0 = r7
            r1 = r32
            r2 = r33
            r4 = r36
            r5 = r37
            r0.<init>(r1, r2, r3, r4, r5)
            r6.a(r7)
        L_0x01c3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: sl.C11865e.g(java.lang.String, java.lang.String, androidx.compose.ui.d, U0.m, int, int):void");
    }

    /* access modifiers changed from: private */
    public static final C16807N h(String str, String str2, d dVar, int i10, int i11, C4889m mVar, int i12) {
        g(str, str2, dVar, mVar, M0.a(i10 | 1), i11);
        return C16807N.f139792a;
    }

    /* JADX WARNING: Removed duplicated region for block: B:44:0x0087  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x008b  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00a9  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00ae  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x01b5  */
    /* JADX WARNING: Removed duplicated region for block: B:87:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void i(java.lang.String r26, java.lang.String r27, java.lang.String r28, androidx.compose.ui.d r29, nI.C17631a<XH.C16807N> r30, U0.C4889m r31, int r32, int r33) {
        /*
            r6 = r26
            r7 = r27
            r8 = r28
            r9 = r30
            r10 = r32
            java.lang.String r0 = "title"
            kotlin.jvm.internal.C17542s.j(r6, r0)
            java.lang.String r0 = "description"
            kotlin.jvm.internal.C17542s.j(r7, r0)
            java.lang.String r0 = "onDismiss"
            kotlin.jvm.internal.C17542s.j(r9, r0)
            r0 = 634921310(0x25d8215e, float:3.7492638E-16)
            r1 = r31
            U0.m r11 = r1.k(r0)
            r1 = r33 & 1
            r2 = 2
            if (r1 == 0) goto L_0x002a
            r1 = r10 | 6
            goto L_0x003a
        L_0x002a:
            r1 = r10 & 6
            if (r1 != 0) goto L_0x0039
            boolean r1 = r11.V(r6)
            if (r1 == 0) goto L_0x0036
            r1 = 4
            goto L_0x0037
        L_0x0036:
            r1 = r2
        L_0x0037:
            r1 = r1 | r10
            goto L_0x003a
        L_0x0039:
            r1 = r10
        L_0x003a:
            r3 = r33 & 2
            if (r3 == 0) goto L_0x0041
            r1 = r1 | 48
            goto L_0x0051
        L_0x0041:
            r3 = r10 & 48
            if (r3 != 0) goto L_0x0051
            boolean r3 = r11.V(r7)
            if (r3 == 0) goto L_0x004e
            r3 = 32
            goto L_0x0050
        L_0x004e:
            r3 = 16
        L_0x0050:
            r1 = r1 | r3
        L_0x0051:
            r3 = r33 & 4
            if (r3 == 0) goto L_0x0058
            r1 = r1 | 384(0x180, float:5.38E-43)
            goto L_0x0068
        L_0x0058:
            r3 = r10 & 384(0x180, float:5.38E-43)
            if (r3 != 0) goto L_0x0068
            boolean r3 = r11.V(r8)
            if (r3 == 0) goto L_0x0065
            r3 = 256(0x100, float:3.59E-43)
            goto L_0x0067
        L_0x0065:
            r3 = 128(0x80, float:1.794E-43)
        L_0x0067:
            r1 = r1 | r3
        L_0x0068:
            r3 = r33 & 8
            if (r3 == 0) goto L_0x0071
            r1 = r1 | 3072(0xc00, float:4.305E-42)
        L_0x006e:
            r4 = r29
            goto L_0x0083
        L_0x0071:
            r4 = r10 & 3072(0xc00, float:4.305E-42)
            if (r4 != 0) goto L_0x006e
            r4 = r29
            boolean r5 = r11.V(r4)
            if (r5 == 0) goto L_0x0080
            r5 = 2048(0x800, float:2.87E-42)
            goto L_0x0082
        L_0x0080:
            r5 = 1024(0x400, float:1.435E-42)
        L_0x0082:
            r1 = r1 | r5
        L_0x0083:
            r5 = r33 & 16
            if (r5 == 0) goto L_0x008b
            r1 = r1 | 24576(0x6000, float:3.4438E-41)
        L_0x0089:
            r12 = r1
            goto L_0x009c
        L_0x008b:
            r5 = r10 & 24576(0x6000, float:3.4438E-41)
            if (r5 != 0) goto L_0x0089
            boolean r5 = r11.F(r9)
            if (r5 == 0) goto L_0x0098
            r5 = 16384(0x4000, float:2.2959E-41)
            goto L_0x009a
        L_0x0098:
            r5 = 8192(0x2000, float:1.14794E-41)
        L_0x009a:
            r1 = r1 | r5
            goto L_0x0089
        L_0x009c:
            r1 = r12 & 9363(0x2493, float:1.312E-41)
            r5 = 9362(0x2492, float:1.3119E-41)
            if (r1 != r5) goto L_0x00ae
            boolean r1 = r11.l()
            if (r1 != 0) goto L_0x00a9
            goto L_0x00ae
        L_0x00a9:
            r11.L()
            goto L_0x01af
        L_0x00ae:
            if (r3 == 0) goto L_0x00b4
            androidx.compose.ui.d$a r1 = androidx.compose.ui.d.f18749a
            r13 = r1
            goto L_0x00b5
        L_0x00b4:
            r13 = r4
        L_0x00b5:
            boolean r1 = U0.C4895p.J()
            if (r1 == 0) goto L_0x00c1
            r1 = -1
            java.lang.String r3 = "com.ingka.ikea.app.uicomposables.dialog.FullscreenDialog (FullscreenDialog.kt:45)"
            U0.C4895p.S(r0, r12, r1, r3)
        L_0x00c1:
            r0 = 0
            r1 = 1
            r3 = 0
            androidx.compose.ui.d r4 = androidx.compose.foundation.layout.J.f(r13, r0, r1, r3)
            androidx.compose.ui.d r4 = s0.C5852X.e(r4)
            androidx.compose.foundation.layout.d r5 = androidx.compose.foundation.layout.C5073d.f18068a
            androidx.compose.foundation.layout.d$m r5 = r5.g()
            i1.c$a r14 = i1.C5437c.f24302a
            i1.c$b r14 = r14.k()
            r15 = 0
            E1.I r5 = androidx.compose.foundation.layout.C5080k.a(r5, r14, r11, r15)
            int r14 = U0.C4883j.a(r11, r15)
            U0.y r1 = r11.s()
            androidx.compose.ui.d r4 = androidx.compose.ui.c.e(r11, r4)
            G1.g$a r16 = G1.C4504g.f6515W
            nI.a r15 = r16.a()
            U0.f r17 = r11.m()
            if (r17 != 0) goto L_0x00f8
            U0.C4883j.c()
        L_0x00f8:
            r11.I()
            boolean r17 = r11.i()
            if (r17 == 0) goto L_0x0105
            r11.p(r15)
            goto L_0x0108
        L_0x0105:
            r11.t()
        L_0x0108:
            U0.m r15 = U0.F1.a(r11)
            nI.p r0 = r16.c()
            U0.F1.c(r15, r5, r0)
            nI.p r0 = r16.e()
            U0.F1.c(r15, r1, r0)
            nI.p r0 = r16.b()
            boolean r1 = r15.i()
            if (r1 != 0) goto L_0x0132
            java.lang.Object r1 = r15.D()
            java.lang.Integer r5 = java.lang.Integer.valueOf(r14)
            boolean r1 = kotlin.jvm.internal.C17542s.e(r1, r5)
            if (r1 != 0) goto L_0x0140
        L_0x0132:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r14)
            r15.u(r1)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r14)
            r15.w(r1, r0)
        L_0x0140:
            nI.p r0 = r16.d()
            U0.F1.c(r15, r4, r0)
            s0.h r18 = s0.C5862h.f28810a
            int r0 = r12 >> 12
            r0 = r0 & 14
            k(r9, r11, r0)
            androidx.compose.ui.d$a r0 = androidx.compose.ui.d.f18749a
            tK.u r1 = tK.C18029u.f147649a
            float r1 = r1.d()
            r4 = 0
            s0.E r1 = androidx.compose.foundation.layout.D.c(r1, r4, r2, r3)
            androidx.compose.ui.d r19 = androidx.compose.foundation.layout.D.h(r0, r1)
            r0 = 1
            r1 = 0
            androidx.compose.foundation.o r20 = androidx.compose.foundation.m.c(r1, r11, r1, r0)
            r24 = 14
            r25 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            androidx.compose.ui.d r19 = androidx.compose.foundation.m.f(r19, r20, r21, r22, r23, r24, r25)
            r22 = 2
            r23 = 0
            r20 = 1065353216(0x3f800000, float:1.0)
            androidx.compose.ui.d r2 = s0.C5861g.c(r18, r19, r20, r21, r22, r23)
            r4 = r12 & 126(0x7e, float:1.77E-43)
            r5 = 0
            r0 = r26
            r1 = r27
            r3 = r11
            g(r0, r1, r2, r3, r4, r5)
            r0 = 800199620(0x2fb213c4, float:3.2392056E-10)
            r11.W(r0)
            if (r8 != 0) goto L_0x0193
            goto L_0x019f
        L_0x0193:
            int r0 = r12 >> 6
            r0 = r0 & 14
            int r1 = r12 >> 9
            r1 = r1 & 112(0x70, float:1.57E-43)
            r0 = r0 | r1
            e(r8, r9, r11, r0)
        L_0x019f:
            r11.P()
            r11.x()
            boolean r0 = U0.C4895p.J()
            if (r0 == 0) goto L_0x01ae
            U0.C4895p.R()
        L_0x01ae:
            r4 = r13
        L_0x01af:
            U0.Y0 r11 = r11.n()
            if (r11 == 0) goto L_0x01ca
            sl.a r12 = new sl.a
            r0 = r12
            r1 = r26
            r2 = r27
            r3 = r28
            r5 = r30
            r6 = r32
            r7 = r33
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            r11.a(r12)
        L_0x01ca:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: sl.C11865e.i(java.lang.String, java.lang.String, java.lang.String, androidx.compose.ui.d, nI.a, U0.m, int, int):void");
    }

    /* access modifiers changed from: private */
    public static final C16807N j(String str, String str2, String str3, d dVar, C17631a aVar, int i10, int i11, C4889m mVar, int i12) {
        i(str, str2, str3, dVar, aVar, mVar, M0.a(i10 | 1), i11);
        return C16807N.f139792a;
    }

    private static final void k(C17631a<C16807N> aVar, C4889m mVar, int i10) {
        int i11;
        C4889m k10 = mVar.k(1860225181);
        if ((i10 & 6) == 0) {
            i11 = (k10.F(aVar) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i11 & 3) != 2 || !k10.l()) {
            if (C4895p.J()) {
                C4895p.S(1860225181, i11, -1, "com.ingka.ikea.app.uicomposables.dialog.FullscreenDialogTopAppBar (FullscreenDialog.kt:114)");
            }
            p.c(v.CLOSE, aVar, (d) null, (String) null, (u) null, (q<? super C5842M, ? super C4889m, ? super Integer, C16807N>) null, (C5848T) null, (e1) null, (g1) null, k10, ((i11 << 3) & 112) | 6, 508);
            if (C4895p.J()) {
                C4895p.R();
            }
        } else {
            k10.L();
        }
        Y0 n10 = k10.n();
        if (n10 != null) {
            n10.a(new C11863c(aVar, i10));
        }
    }

    /* access modifiers changed from: private */
    public static final C16807N l(C17631a aVar, int i10, C4889m mVar, int i11) {
        k(aVar, mVar, M0.a(i10 | 1));
        return C16807N.f139792a;
    }
}
