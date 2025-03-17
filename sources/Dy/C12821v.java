package Dy;

import Jy.o;
import KJ.C15987c;
import U0.C4889m;
import U0.M0;
import XH.C16807N;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kp.C11522d;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\u001a=\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0001¢\u0006\u0004\b\f\u0010\r\u001a/\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\tH\u0003¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"LJy/o$b;", "header", "LKJ/c;", "LJy/i;", "cartItems", "", "totalPrice", "Lkp/d;", "currencyConfig", "LDy/p;", "onClickListener", "LXH/N;", "f", "(LJy/o$b;LKJ/c;DLkp/d;LDy/p;LU0/m;I)V", "", "numOfItems", "j", "(Lkp/d;IDLDy/p;LU0/m;I)V", "cart-implementation_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* renamed from: Dy.v  reason: case insensitive filesystem */
public final class C12821v {
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v11, resolved type: nI.a} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void f(Jy.o.b r26, KJ.C15987c<Jy.i> r27, double r28, kp.C11522d r30, Dy.C12816p r31, U0.C4889m r32, int r33) {
        /*
            r1 = r26
            r2 = r27
            r10 = r30
            r11 = r31
            r12 = r33
            java.lang.String r0 = "header"
            kotlin.jvm.internal.C17542s.j(r1, r0)
            java.lang.String r0 = "cartItems"
            kotlin.jvm.internal.C17542s.j(r2, r0)
            java.lang.String r0 = "currencyConfig"
            kotlin.jvm.internal.C17542s.j(r10, r0)
            java.lang.String r0 = "onClickListener"
            kotlin.jvm.internal.C17542s.j(r11, r0)
            r0 = -1721537354(0xffffffff99636cb6, float:-1.1757579E-23)
            r3 = r32
            U0.m r13 = r3.k(r0)
            r14 = 6
            r3 = r12 & 6
            if (r3 != 0) goto L_0x0040
            r3 = r12 & 8
            if (r3 != 0) goto L_0x0035
            boolean r3 = r13.V(r1)
            goto L_0x0039
        L_0x0035:
            boolean r3 = r13.F(r1)
        L_0x0039:
            if (r3 == 0) goto L_0x003d
            r3 = 4
            goto L_0x003e
        L_0x003d:
            r3 = 2
        L_0x003e:
            r3 = r3 | r12
            goto L_0x0041
        L_0x0040:
            r3 = r12
        L_0x0041:
            r4 = r12 & 48
            if (r4 != 0) goto L_0x0051
            boolean r4 = r13.F(r2)
            if (r4 == 0) goto L_0x004e
            r4 = 32
            goto L_0x0050
        L_0x004e:
            r4 = 16
        L_0x0050:
            r3 = r3 | r4
        L_0x0051:
            r4 = r12 & 384(0x180, float:5.38E-43)
            r8 = r28
            if (r4 != 0) goto L_0x0063
            boolean r4 = r13.h(r8)
            if (r4 == 0) goto L_0x0060
            r4 = 256(0x100, float:3.59E-43)
            goto L_0x0062
        L_0x0060:
            r4 = 128(0x80, float:1.794E-43)
        L_0x0062:
            r3 = r3 | r4
        L_0x0063:
            r4 = r12 & 3072(0xc00, float:4.305E-42)
            if (r4 != 0) goto L_0x0073
            boolean r4 = r13.F(r10)
            if (r4 == 0) goto L_0x0070
            r4 = 2048(0x800, float:2.87E-42)
            goto L_0x0072
        L_0x0070:
            r4 = 1024(0x400, float:1.435E-42)
        L_0x0072:
            r3 = r3 | r4
        L_0x0073:
            r4 = r12 & 24576(0x6000, float:3.4438E-41)
            r7 = 16384(0x4000, float:2.2959E-41)
            r16 = 32768(0x8000, float:4.5918E-41)
            if (r4 != 0) goto L_0x0090
            r4 = r12 & r16
            if (r4 != 0) goto L_0x0085
            boolean r4 = r13.V(r11)
            goto L_0x0089
        L_0x0085:
            boolean r4 = r13.F(r11)
        L_0x0089:
            if (r4 == 0) goto L_0x008d
            r4 = r7
            goto L_0x008f
        L_0x008d:
            r4 = 8192(0x2000, float:1.14794E-41)
        L_0x008f:
            r3 = r3 | r4
        L_0x0090:
            r6 = r3
            r3 = r6 & 9363(0x2493, float:1.312E-41)
            r4 = 9362(0x2492, float:1.3119E-41)
            if (r3 != r4) goto L_0x00a3
            boolean r3 = r13.l()
            if (r3 != 0) goto L_0x009e
            goto L_0x00a3
        L_0x009e:
            r13.L()
            goto L_0x0243
        L_0x00a3:
            boolean r3 = U0.C4895p.J()
            if (r3 == 0) goto L_0x00af
            r3 = -1
            java.lang.String r4 = "com.ingka.ikea.scanandgo.cart.impl.compose.CartFullServeItemSection (CartFullServeItemSection.kt:43)"
            U0.C4895p.S(r0, r6, r3, r4)
        L_0x00af:
            androidx.compose.ui.d$a r0 = androidx.compose.ui.d.f18749a
            androidx.compose.foundation.layout.d r3 = androidx.compose.foundation.layout.C5073d.f18068a
            androidx.compose.foundation.layout.d$m r3 = r3.g()
            i1.c$a r4 = i1.C5437c.f24302a
            i1.c$b r4 = r4.k()
            r5 = 0
            E1.I r3 = androidx.compose.foundation.layout.C5080k.a(r3, r4, r13, r5)
            int r4 = U0.C4883j.a(r13, r5)
            U0.y r5 = r13.s()
            androidx.compose.ui.d r0 = androidx.compose.ui.c.e(r13, r0)
            G1.g$a r17 = G1.C4504g.f6515W
            nI.a r15 = r17.a()
            U0.f r18 = r13.m()
            if (r18 != 0) goto L_0x00dd
            U0.C4883j.c()
        L_0x00dd:
            r13.I()
            boolean r18 = r13.i()
            if (r18 == 0) goto L_0x00ea
            r13.p(r15)
            goto L_0x00ed
        L_0x00ea:
            r13.t()
        L_0x00ed:
            U0.m r15 = U0.F1.a(r13)
            nI.p r14 = r17.c()
            U0.F1.c(r15, r3, r14)
            nI.p r3 = r17.e()
            U0.F1.c(r15, r5, r3)
            nI.p r3 = r17.b()
            boolean r5 = r15.i()
            if (r5 != 0) goto L_0x0117
            java.lang.Object r5 = r15.D()
            java.lang.Integer r14 = java.lang.Integer.valueOf(r4)
            boolean r5 = kotlin.jvm.internal.C17542s.e(r5, r14)
            if (r5 != 0) goto L_0x0125
        L_0x0117:
            java.lang.Integer r5 = java.lang.Integer.valueOf(r4)
            r15.u(r5)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r15.w(r4, r3)
        L_0x0125:
            nI.p r3 = r17.d()
            U0.F1.c(r15, r0, r3)
            s0.h r0 = s0.C5862h.f28810a
            IC.e r3 = r26.getTitle()
            IC.e r0 = r26.h()
            IC.e r5 = r26.g()
            r4 = 1471524046(0x57b5acce, float:3.9950759E14)
            r13.W(r4)
            r4 = 57344(0xe000, float:8.0356E-41)
            r14 = r6 & r4
            if (r14 == r7) goto L_0x0154
            r4 = r6 & r16
            if (r4 == 0) goto L_0x0152
            boolean r4 = r13.F(r11)
            if (r4 == 0) goto L_0x0152
            goto L_0x0154
        L_0x0152:
            r4 = 0
            goto L_0x0155
        L_0x0154:
            r4 = 1
        L_0x0155:
            java.lang.Object r7 = r13.D()
            if (r4 != 0) goto L_0x0163
            U0.m$a r4 = U0.C4889m.f14007a
            java.lang.Object r4 = r4.a()
            if (r7 != r4) goto L_0x016b
        L_0x0163:
            Dy.q r7 = new Dy.q
            r7.<init>(r11)
            r13.u(r7)
        L_0x016b:
            r4 = r7
            nI.a r4 = (nI.C17631a) r4
            r13.P()
            int r7 = IC.C13023e.f110931a
            r18 = 6
            int r19 = r7 << 6
            r19 = r7 | r19
            int r7 = r7 << 9
            r19 = r19 | r7
            r20 = 0
            r7 = 0
            r15 = r6
            r6 = r0
            r0 = 16384(0x4000, float:2.2959E-41)
            r7 = r13
            r8 = r19
            r9 = r20
            Dy.H0.b(r3, r4, r5, r6, r7, r8, r9)
            r3 = 1471526457(0x57b5b639, float:3.9958849E14)
            r13.W(r3)
            java.util.ArrayList r3 = new java.util.ArrayList
            r4 = 10
            int r4 = YH.C16877v.y(r2, r4)
            r3.<init>(r4)
            java.util.Iterator r4 = r27.iterator()
        L_0x01a1:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x01e8
            java.lang.Object r5 = r4.next()
            Jy.i r5 = (Jy.i) r5
            r6 = 764144536(0x2d8beb98, float:1.5907095E-11)
            r13.W(r6)
            if (r14 == r0) goto L_0x01c2
            r6 = r15 & r16
            if (r6 == 0) goto L_0x01c0
            boolean r6 = r13.F(r11)
            if (r6 == 0) goto L_0x01c0
            goto L_0x01c2
        L_0x01c0:
            r6 = 0
            goto L_0x01c3
        L_0x01c2:
            r6 = 1
        L_0x01c3:
            java.lang.Object r7 = r13.D()
            if (r6 != 0) goto L_0x01d1
            U0.m$a r6 = U0.C4889m.f14007a
            java.lang.Object r6 = r6.a()
            if (r7 != r6) goto L_0x01d9
        L_0x01d1:
            Dy.r r7 = new Dy.r
            r7.<init>(r11)
            r13.u(r7)
        L_0x01d9:
            nI.l r7 = (nI.C17642l) r7
            r13.P()
            r6 = 0
            Dy.E.d(r5, r7, r13, r6)
            XH.N r5 = XH.C16807N.f139792a
            r3.add(r5)
            goto L_0x01a1
        L_0x01e8:
            r13.P()
            androidx.compose.ui.d$a r0 = androidx.compose.ui.d.f18749a
            r3 = 24
            float r3 = (float) r3
            float r23 = c2.h.B(r3)
            r24 = 7
            r25 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r19 = r0
            androidx.compose.ui.d r3 = androidx.compose.foundation.layout.D.m(r19, r20, r21, r22, r23, r24, r25)
            r8 = 6
            r9 = 6
            r4 = 0
            r5 = 0
            r7 = r13
            SC.C13643u0.c(r3, r4, r5, r7, r8, r9)
            int r4 = r27.size()
            int r3 = r15 >> 9
            r3 = r3 & 14
            r5 = r15 & 896(0x380, float:1.256E-42)
            r3 = r3 | r5
            int r5 = r15 >> 3
            r5 = r5 & 7168(0x1c00, float:1.0045E-41)
            r9 = r3 | r5
            r3 = r30
            r5 = r28
            r7 = r31
            r8 = r13
            j(r3, r4, r5, r7, r8, r9)
            r3 = 32
            float r3 = (float) r3
            float r3 = c2.h.B(r3)
            androidx.compose.ui.d r0 = androidx.compose.foundation.layout.J.i(r0, r3)
            r3 = 6
            s0.C5844O.a(r0, r13, r3)
            r13.x()
            boolean r0 = U0.C4895p.J()
            if (r0 == 0) goto L_0x0243
            U0.C4895p.R()
        L_0x0243:
            U0.Y0 r8 = r13.n()
            if (r8 == 0) goto L_0x025e
            Dy.s r9 = new Dy.s
            r0 = r9
            r1 = r26
            r2 = r27
            r3 = r28
            r5 = r30
            r6 = r31
            r7 = r33
            r0.<init>(r1, r2, r3, r5, r6, r7)
            r8.a(r9)
        L_0x025e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: Dy.C12821v.f(Jy.o$b, KJ.c, double, kp.d, Dy.p, U0.m, int):void");
    }

    /* access modifiers changed from: private */
    public static final C16807N g(C12816p pVar) {
        pVar.b();
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N h(C12816p pVar, F f10) {
        C17542s.j(f10, "it");
        pVar.a(f10);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N i(o.b bVar, C15987c cVar, double d10, C11522d dVar, C12816p pVar, int i10, C4889m mVar, int i11) {
        f(bVar, cVar, d10, dVar, pVar, mVar, M0.a(i10 | 1));
        return C16807N.f139792a;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v2, resolved type: nI.a} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static final void j(kp.C11522d r33, int r34, double r35, Dy.C12816p r37, U0.C4889m r38, int r39) {
        /*
            r1 = r33
            r3 = r35
            r5 = r37
            r6 = r39
            r0 = 600202766(0x23c65e0e, float:2.1507037E-17)
            r2 = r38
            U0.m r2 = r2.k(r0)
            r7 = r6 & 6
            r8 = 2
            if (r7 != 0) goto L_0x0021
            boolean r7 = r2.F(r1)
            if (r7 == 0) goto L_0x001e
            r7 = 4
            goto L_0x001f
        L_0x001e:
            r7 = r8
        L_0x001f:
            r7 = r7 | r6
            goto L_0x0022
        L_0x0021:
            r7 = r6
        L_0x0022:
            r9 = r6 & 48
            r15 = r34
            if (r9 != 0) goto L_0x0034
            boolean r9 = r2.d(r15)
            if (r9 == 0) goto L_0x0031
            r9 = 32
            goto L_0x0033
        L_0x0031:
            r9 = 16
        L_0x0033:
            r7 = r7 | r9
        L_0x0034:
            r9 = r6 & 384(0x180, float:5.38E-43)
            if (r9 != 0) goto L_0x0044
            boolean r9 = r2.h(r3)
            if (r9 == 0) goto L_0x0041
            r9 = 256(0x100, float:3.59E-43)
            goto L_0x0043
        L_0x0041:
            r9 = 128(0x80, float:1.794E-43)
        L_0x0043:
            r7 = r7 | r9
        L_0x0044:
            r9 = r6 & 3072(0xc00, float:4.305E-42)
            if (r9 != 0) goto L_0x005d
            r9 = r6 & 4096(0x1000, float:5.74E-42)
            if (r9 != 0) goto L_0x0051
            boolean r9 = r2.V(r5)
            goto L_0x0055
        L_0x0051:
            boolean r9 = r2.F(r5)
        L_0x0055:
            if (r9 == 0) goto L_0x005a
            r9 = 2048(0x800, float:2.87E-42)
            goto L_0x005c
        L_0x005a:
            r9 = 1024(0x400, float:1.435E-42)
        L_0x005c:
            r7 = r7 | r9
        L_0x005d:
            r12 = r7
            r7 = r12 & 1171(0x493, float:1.641E-42)
            r9 = 1170(0x492, float:1.64E-42)
            if (r7 != r9) goto L_0x0070
            boolean r7 = r2.l()
            if (r7 != 0) goto L_0x006b
            goto L_0x0070
        L_0x006b:
            r2.L()
            goto L_0x023f
        L_0x0070:
            boolean r7 = U0.C4895p.J()
            if (r7 == 0) goto L_0x007c
            r7 = -1
            java.lang.String r9 = "com.ingka.ikea.scanandgo.cart.impl.compose.Footer (CartFullServeItemSection.kt:75)"
            U0.C4895p.S(r0, r12, r7, r9)
        L_0x007c:
            androidx.compose.foundation.layout.d r0 = androidx.compose.foundation.layout.C5073d.f18068a
            androidx.compose.foundation.layout.d$f r7 = r0.d()
            i1.c$a r9 = i1.C5437c.f24302a
            i1.c$c r10 = r9.i()
            androidx.compose.ui.d$a r11 = androidx.compose.ui.d.f18749a
            r13 = 24
            float r13 = (float) r13
            float r13 = c2.h.B(r13)
            r14 = 0
            r6 = 0
            androidx.compose.ui.d r8 = androidx.compose.foundation.layout.D.k(r11, r13, r14, r8, r6)
            r13 = 1
            androidx.compose.ui.d r6 = androidx.compose.foundation.layout.J.h(r8, r14, r13, r6)
            r8 = 54
            E1.I r7 = androidx.compose.foundation.layout.G.b(r7, r10, r2, r8)
            r14 = 0
            int r8 = U0.C4883j.a(r2, r14)
            U0.y r10 = r2.s()
            androidx.compose.ui.d r6 = androidx.compose.ui.c.e(r2, r6)
            G1.g$a r16 = G1.C4504g.f6515W
            nI.a r13 = r16.a()
            U0.f r18 = r2.m()
            if (r18 != 0) goto L_0x00be
            U0.C4883j.c()
        L_0x00be:
            r2.I()
            boolean r18 = r2.i()
            if (r18 == 0) goto L_0x00cb
            r2.p(r13)
            goto L_0x00ce
        L_0x00cb:
            r2.t()
        L_0x00ce:
            U0.m r13 = U0.F1.a(r2)
            nI.p r14 = r16.c()
            U0.F1.c(r13, r7, r14)
            nI.p r7 = r16.e()
            U0.F1.c(r13, r10, r7)
            nI.p r7 = r16.b()
            boolean r10 = r13.i()
            if (r10 != 0) goto L_0x00f8
            java.lang.Object r10 = r13.D()
            java.lang.Integer r14 = java.lang.Integer.valueOf(r8)
            boolean r10 = kotlin.jvm.internal.C17542s.e(r10, r14)
            if (r10 != 0) goto L_0x0106
        L_0x00f8:
            java.lang.Integer r10 = java.lang.Integer.valueOf(r8)
            r13.u(r10)
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            r13.w(r8, r7)
        L_0x0106:
            nI.p r7 = r16.d()
            U0.F1.c(r13, r6, r7)
            s0.N r6 = s0.C5843N.f28726a
            androidx.compose.foundation.layout.d$m r0 = r0.g()
            i1.c$b r6 = r9.k()
            r7 = 0
            E1.I r0 = androidx.compose.foundation.layout.C5080k.a(r0, r6, r2, r7)
            int r6 = U0.C4883j.a(r2, r7)
            U0.y r7 = r2.s()
            androidx.compose.ui.d r8 = androidx.compose.ui.c.e(r2, r11)
            nI.a r9 = r16.a()
            U0.f r10 = r2.m()
            if (r10 != 0) goto L_0x0135
            U0.C4883j.c()
        L_0x0135:
            r2.I()
            boolean r10 = r2.i()
            if (r10 == 0) goto L_0x0142
            r2.p(r9)
            goto L_0x0145
        L_0x0142:
            r2.t()
        L_0x0145:
            U0.m r9 = U0.F1.a(r2)
            nI.p r10 = r16.c()
            U0.F1.c(r9, r0, r10)
            nI.p r0 = r16.e()
            U0.F1.c(r9, r7, r0)
            nI.p r0 = r16.b()
            boolean r7 = r9.i()
            if (r7 != 0) goto L_0x016f
            java.lang.Object r7 = r9.D()
            java.lang.Integer r10 = java.lang.Integer.valueOf(r6)
            boolean r7 = kotlin.jvm.internal.C17542s.e(r7, r10)
            if (r7 != 0) goto L_0x017d
        L_0x016f:
            java.lang.Integer r7 = java.lang.Integer.valueOf(r6)
            r9.u(r7)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r9.w(r6, r0)
        L_0x017d:
            nI.p r0 = r16.d()
            U0.F1.c(r9, r8, r0)
            s0.h r0 = s0.C5862h.f28810a
            int r0 = Oo.b.f84456N8
            r6 = 0
            java.lang.String r7 = J1.j.b(r0, r2, r6)
            TC.b$b$c r8 = TC.C13679b.C2857b.c.f116685a
            r31 = 0
            r32 = 262140(0x3fffc, float:3.67336E-40)
            r9 = 0
            r10 = 0
            r13 = 0
            r0 = r12
            r12 = r13
            r14 = 0
            r16 = 0
            r15 = r16
            r17 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r24 = 0
            r25 = 0
            r26 = 0
            r27 = 0
            r28 = 0
            r30 = 48
            r29 = r2
            SC.C13607l.j(r7, r8, r9, r10, r12, r14, r15, r16, r17, r19, r20, r21, r22, r24, r25, r26, r27, r28, r29, r30, r31, r32)
            int r7 = By.C12674m.f108305t
            java.lang.Integer r8 = java.lang.Integer.valueOf(r34)
            java.lang.Object[] r8 = new java.lang.Object[]{r8}
            java.lang.String r7 = J1.j.c(r7, r8, r2, r6)
            TC.b$a$c r8 = TC.C13679b.a.c.f116681a
            r12 = 0
            r15 = 0
            SC.C13607l.j(r7, r8, r9, r10, r12, r14, r15, r16, r17, r19, r20, r21, r22, r24, r25, r26, r27, r28, r29, r30, r31, r32)
            r2.x()
            qx.c r7 = qx.C14957b.a(r3, r1)
            SC.n r8 = SC.L1.b(r33)
            int r12 = qx.c.f130485c
            r13 = 12
            r10 = 0
            r11 = r2
            SC.L1.c(r7, r8, r9, r10, r11, r12, r13)
            int r7 = By.C12674m.f108241A
            java.lang.String r7 = J1.j.b(r7, r2, r6)
            r8 = -2114443947(0xffffffff81f82555, float:-9.115438E-38)
            r2.W(r8)
            r8 = r0 & 7168(0x1c00, float:1.0045E-41)
            r9 = 2048(0x800, float:2.87E-42)
            if (r8 == r9) goto L_0x0204
            r0 = r0 & 4096(0x1000, float:5.74E-42)
            if (r0 == 0) goto L_0x0202
            boolean r0 = r2.F(r5)
            if (r0 == 0) goto L_0x0202
            goto L_0x0204
        L_0x0202:
            r13 = r6
            goto L_0x0205
        L_0x0204:
            r13 = 1
        L_0x0205:
            java.lang.Object r0 = r2.D()
            if (r13 != 0) goto L_0x0213
            U0.m$a r6 = U0.C4889m.f14007a
            java.lang.Object r6 = r6.a()
            if (r0 != r6) goto L_0x021b
        L_0x0213:
            Dy.t r0 = new Dy.t
            r0.<init>(r5)
            r2.u(r0)
        L_0x021b:
            r16 = r0
            nI.a r16 = (nI.C17631a) r16
            r2.P()
            r18 = 0
            r19 = 510(0x1fe, float:7.15E-43)
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r17 = r2
            SC.L.b(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            r2.x()
            boolean r0 = U0.C4895p.J()
            if (r0 == 0) goto L_0x023f
            U0.C4895p.R()
        L_0x023f:
            U0.Y0 r7 = r2.n()
            if (r7 == 0) goto L_0x0258
            Dy.u r8 = new Dy.u
            r0 = r8
            r1 = r33
            r2 = r34
            r3 = r35
            r5 = r37
            r6 = r39
            r0.<init>(r1, r2, r3, r5, r6)
            r7.a(r8)
        L_0x0258:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: Dy.C12821v.j(kp.d, int, double, Dy.p, U0.m, int):void");
    }

    /* access modifiers changed from: private */
    public static final C16807N k(C12816p pVar) {
        pVar.c();
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N l(C11522d dVar, int i10, double d10, C12816p pVar, int i11, C4889m mVar, int i12) {
        j(dVar, i10, d10, pVar, mVar, M0.a(i11 | 1));
        return C16807N.f139792a;
    }
}
