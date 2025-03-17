package Hy;

import A0.g;
import E1.I;
import G1.C4504g;
import Hy.C13013a;
import Hy.C13016d;
import SC.H2;
import U0.A1;
import U0.C4883j;
import U0.C4889m;
import U0.C4895p;
import U0.C4912y;
import U0.F1;
import U0.M0;
import U0.Y0;
import XH.C16807N;
import XH.t;
import androidx.compose.foundation.layout.C5073d;
import androidx.compose.foundation.layout.C5080k;
import androidx.compose.foundation.layout.J;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import androidx.compose.ui.platform.C5116k1;
import c2.h;
import i1.C5437c;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import m1.e;
import nI.C17631a;
import nI.p;
import s0.C5844O;
import s0.C5862h;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a%\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0001¢\u0006\u0004\b\u0005\u0010\u0006\u001a!\u0010\u000b\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0001¢\u0006\u0004\b\u000b\u0010\f\u001a!\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\r2\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0001¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u000f\u0010\u0011\u001a\u00020\u0003H\u0001¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013²\u0006\f\u0010\b\u001a\u00020\u00078\nX\u0002"}, d2 = {"LHy/p;", "viewModel", "Lkotlin/Function0;", "LXH/N;", "closeScreen", "j", "(LHy/p;LnI/a;LU0/m;I)V", "LHy/d;", "uiState", "LHy/g;", "actions", "p", "(LHy/d;LHy/g;LU0/m;I)V", "LHy/c;", "uiData", "i", "(LHy/c;LHy/g;LU0/m;I)V", "g", "(LU0/m;I)V", "cart-implementation_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class n {

    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Hy/n$a", "LHy/g;", "LXH/N;", "a", "()V", "cart-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a implements g {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ p f110868a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ C17631a<C16807N> f110869b;

        a(p pVar, C17631a<C16807N> aVar) {
            this.f110868a = pVar;
            this.f110869b = aVar;
        }

        public void a() {
            this.f110868a.D(C13013a.C2670a.b.f110844a);
            this.f110869b.invoke();
        }
    }

    public static final void g(C4889m mVar, int i10) {
        C4889m k10 = mVar.k(2074785507);
        if (i10 != 0 || !k10.l()) {
            if (C4895p.J()) {
                C4895p.S(2074785507, i10, -1, "com.ingka.ikea.scanandgo.cart.impl.fullserveinfo.FullServeInfoLoading (FullServeInfoScreen.kt:145)");
            }
            d.a aVar = d.f18749a;
            d a10 = C5116k1.a(J.f(aVar, 0.0f, 1, (Object) null), "loading");
            I a11 = C5080k.a(C5073d.f18068a.g(), C5437c.f24302a.k(), k10, 0);
            int a12 = C4883j.a(k10, 0);
            C4912y s10 = k10.s();
            d e10 = c.e(k10, a10);
            C4504g.a aVar2 = C4504g.f6515W;
            C17631a<C4504g> a13 = aVar2.a();
            if (k10.m() == null) {
                C4883j.c();
            }
            k10.I();
            if (k10.i()) {
                k10.p(a13);
            } else {
                k10.t();
            }
            C4889m a14 = F1.a(k10);
            F1.c(a14, a11, aVar2.c());
            F1.c(a14, s10, aVar2.e());
            p<C4504g, Integer, C16807N> b10 = aVar2.b();
            if (a14.i() || !C17542s.e(a14.D(), Integer.valueOf(a12))) {
                a14.u(Integer.valueOf(a12));
                a14.w(Integer.valueOf(a12), b10);
            }
            F1.c(a14, e10, aVar2.d());
            C5862h hVar = C5862h.f28810a;
            float f10 = (float) 24;
            C5844O.a(J.i(aVar, h.B(f10)), k10, 6);
            float f11 = (float) 80;
            float f12 = (float) 4;
            H2.b(e.a(J.i(TC.e.i(aVar), h.B(f11)), g.e(h.B(f12))), true, k10, 48, 0);
            C5844O.a(J.i(aVar, h.B(f10)), k10, 6);
            H2.b(e.a(J.i(TC.e.i(aVar), h.B((float) 320)), g.e(h.B(f12))), true, k10, 48, 0);
            C5844O.a(J.i(aVar, h.B(f10)), k10, 6);
            H2.b(e.a(J.i(TC.e.i(aVar), h.B(f11)), g.e(h.B(f12))), true, k10, 48, 0);
            C5844O.a(J.i(aVar, h.B(f10)), k10, 6);
            H2.b(e.a(J.i(TC.e.i(aVar), h.B(f11)), g.e(h.B(f12))), true, k10, 48, 0);
            k10.x();
            if (C4895p.J()) {
                C4895p.R();
            }
        } else {
            k10.L();
        }
        Y0 n10 = k10.n();
        if (n10 != null) {
            n10.a(new k(i10));
        }
    }

    /* access modifiers changed from: private */
    public static final C16807N h(int i10, C4889m mVar, int i11) {
        g(mVar, M0.a(i10 | 1));
        return C16807N.f139792a;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v2, resolved type: nI.a} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void i(Hy.C13015c r36, Hy.g r37, U0.C4889m r38, int r39) {
        /*
            r0 = r36
            r1 = r37
            r2 = r39
            java.lang.String r3 = "uiData"
            kotlin.jvm.internal.C17542s.j(r0, r3)
            r3 = 166073100(0x9e6130c, float:5.5388397E-33)
            r4 = r38
            U0.m r14 = r4.k(r3)
            r4 = r2 & 6
            if (r4 != 0) goto L_0x002c
            r4 = r2 & 8
            if (r4 != 0) goto L_0x0021
            boolean r4 = r14.V(r0)
            goto L_0x0025
        L_0x0021:
            boolean r4 = r14.F(r0)
        L_0x0025:
            if (r4 == 0) goto L_0x0029
            r4 = 4
            goto L_0x002a
        L_0x0029:
            r4 = 2
        L_0x002a:
            r4 = r4 | r2
            goto L_0x002d
        L_0x002c:
            r4 = r2
        L_0x002d:
            r5 = r2 & 48
            r6 = 16
            r15 = 32
            if (r5 != 0) goto L_0x0048
            r5 = r2 & 64
            if (r5 != 0) goto L_0x003e
            boolean r5 = r14.V(r1)
            goto L_0x0042
        L_0x003e:
            boolean r5 = r14.F(r1)
        L_0x0042:
            if (r5 == 0) goto L_0x0046
            r5 = r15
            goto L_0x0047
        L_0x0046:
            r5 = r6
        L_0x0047:
            r4 = r4 | r5
        L_0x0048:
            r13 = r4
            r4 = r13 & 19
            r5 = 18
            if (r4 != r5) goto L_0x005d
            boolean r4 = r14.l()
            if (r4 != 0) goto L_0x0056
            goto L_0x005d
        L_0x0056:
            r14.L()
            r17 = r14
            goto L_0x031a
        L_0x005d:
            boolean r4 = U0.C4895p.J()
            if (r4 == 0) goto L_0x0069
            r4 = -1
            java.lang.String r5 = "com.ingka.ikea.scanandgo.cart.impl.fullserveinfo.FullServeInfoScreen (FullServeInfoScreen.kt:98)"
            U0.C4895p.S(r3, r13, r4, r5)
        L_0x0069:
            androidx.compose.ui.d$a r3 = androidx.compose.ui.d.f18749a
            androidx.compose.ui.d r4 = TC.e.i(r3)
            androidx.compose.foundation.layout.d r30 = androidx.compose.foundation.layout.C5073d.f18068a
            androidx.compose.foundation.layout.d$m r5 = r30.g()
            i1.c$a r31 = i1.C5437c.f24302a
            i1.c$b r7 = r31.k()
            r12 = 0
            E1.I r5 = androidx.compose.foundation.layout.C5080k.a(r5, r7, r14, r12)
            int r7 = U0.C4883j.a(r14, r12)
            U0.y r8 = r14.s()
            androidx.compose.ui.d r4 = androidx.compose.ui.c.e(r14, r4)
            G1.g$a r32 = G1.C4504g.f6515W
            nI.a r9 = r32.a()
            U0.f r10 = r14.m()
            if (r10 != 0) goto L_0x009b
            U0.C4883j.c()
        L_0x009b:
            r14.I()
            boolean r10 = r14.i()
            if (r10 == 0) goto L_0x00a8
            r14.p(r9)
            goto L_0x00ab
        L_0x00a8:
            r14.t()
        L_0x00ab:
            U0.m r9 = U0.F1.a(r14)
            nI.p r10 = r32.c()
            U0.F1.c(r9, r5, r10)
            nI.p r5 = r32.e()
            U0.F1.c(r9, r8, r5)
            nI.p r5 = r32.b()
            boolean r8 = r9.i()
            if (r8 != 0) goto L_0x00d5
            java.lang.Object r8 = r9.D()
            java.lang.Integer r10 = java.lang.Integer.valueOf(r7)
            boolean r8 = kotlin.jvm.internal.C17542s.e(r8, r10)
            if (r8 != 0) goto L_0x00e3
        L_0x00d5:
            java.lang.Integer r8 = java.lang.Integer.valueOf(r7)
            r9.u(r8)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r9.w(r7, r5)
        L_0x00e3:
            nI.p r5 = r32.d()
            U0.F1.c(r9, r4, r5)
            s0.h r16 = s0.C5862h.f28810a
            r11 = 0
            r9 = 1
            r10 = 0
            androidx.compose.ui.d r17 = androidx.compose.foundation.layout.J.f(r3, r11, r9, r10)
            r20 = 2
            r21 = 0
            r18 = 1065353216(0x3f800000, float:1.0)
            r19 = 0
            androidx.compose.ui.d r22 = s0.C5861g.c(r16, r17, r18, r19, r20, r21)
            androidx.compose.foundation.o r23 = androidx.compose.foundation.m.c(r12, r14, r12, r9)
            r27 = 14
            r28 = 0
            r24 = 0
            r25 = 0
            r26 = 0
            androidx.compose.ui.d r4 = androidx.compose.foundation.m.f(r22, r23, r24, r25, r26, r27, r28)
            androidx.compose.foundation.layout.d$m r5 = r30.g()
            i1.c$b r7 = r31.k()
            E1.I r5 = androidx.compose.foundation.layout.C5080k.a(r5, r7, r14, r12)
            int r7 = U0.C4883j.a(r14, r12)
            U0.y r8 = r14.s()
            androidx.compose.ui.d r4 = androidx.compose.ui.c.e(r14, r4)
            nI.a r9 = r32.a()
            U0.f r16 = r14.m()
            if (r16 != 0) goto L_0x0136
            U0.C4883j.c()
        L_0x0136:
            r14.I()
            boolean r16 = r14.i()
            if (r16 == 0) goto L_0x0143
            r14.p(r9)
            goto L_0x0146
        L_0x0143:
            r14.t()
        L_0x0146:
            U0.m r9 = U0.F1.a(r14)
            nI.p r10 = r32.c()
            U0.F1.c(r9, r5, r10)
            nI.p r5 = r32.e()
            U0.F1.c(r9, r8, r5)
            nI.p r5 = r32.b()
            boolean r8 = r9.i()
            if (r8 != 0) goto L_0x0170
            java.lang.Object r8 = r9.D()
            java.lang.Integer r10 = java.lang.Integer.valueOf(r7)
            boolean r8 = kotlin.jvm.internal.C17542s.e(r8, r10)
            if (r8 != 0) goto L_0x017e
        L_0x0170:
            java.lang.Integer r8 = java.lang.Integer.valueOf(r7)
            r9.u(r8)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r9.w(r7, r5)
        L_0x017e:
            nI.p r5 = r32.d()
            U0.F1.c(r9, r4, r5)
            float r9 = (float) r6
            float r18 = c2.h.B(r9)
            r21 = 13
            r22 = 0
            r17 = 0
            r19 = 0
            r20 = 0
            r16 = r3
            androidx.compose.ui.d r4 = androidx.compose.foundation.layout.D.m(r16, r17, r18, r19, r20, r21, r22)
            java.lang.String r5 = "title"
            androidx.compose.ui.d r6 = androidx.compose.ui.platform.C5116k1.a(r4, r5)
            IC.e r4 = r36.a()
            int r10 = IC.C13023e.f110931a
            java.lang.String r4 = r4.a(r14, r10)
            TC.b$b$b r5 = TC.C13679b.C2857b.C2858b.f116684a
            r28 = 0
            r29 = 262136(0x3fff8, float:3.67331E-40)
            r7 = 0
            r16 = 0
            r33 = r9
            r34 = r10
            r9 = r16
            r16 = 0
            r11 = r16
            r12 = r16
            r35 = r13
            r13 = r16
            r16 = 0
            r38 = r14
            r14 = r16
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r24 = 0
            r25 = 0
            r27 = 432(0x1b0, float:6.05E-43)
            r26 = r38
            SC.C13607l.j(r4, r5, r6, r7, r9, r11, r12, r13, r14, r16, r17, r18, r19, r21, r22, r23, r24, r25, r26, r27, r28, r29)
            r4 = 24
            float r4 = (float) r4
            float r5 = c2.h.B(r4)
            androidx.compose.ui.d r5 = androidx.compose.foundation.layout.J.i(r3, r5)
            r6 = 6
            r15 = r38
            s0.C5844O.a(r5, r15, r6)
            KJ.c r5 = r36.b()
            IC.e r7 = r36.d()
            r8 = r34
            int r9 = r8 << 3
            Hy.A.c(r5, r7, r15, r9)
            float r4 = c2.h.B(r4)
            androidx.compose.ui.d r4 = androidx.compose.foundation.layout.J.i(r3, r4)
            s0.C5844O.a(r4, r15, r6)
            KJ.c r4 = r36.c()
            Hy.u.b(r4, r15, r8)
            r15.x()
            androidx.compose.ui.d r16 = TC.e.i(r3)
            float r18 = c2.h.B(r33)
            r4 = 40
            float r4 = (float) r4
            float r20 = c2.h.B(r4)
            r21 = 5
            r22 = 0
            r17 = 0
            r19 = 0
            androidx.compose.ui.d r4 = androidx.compose.foundation.layout.D.m(r16, r17, r18, r19, r20, r21, r22)
            androidx.compose.foundation.layout.d$m r5 = r30.g()
            i1.c$b r6 = r31.k()
            r7 = 0
            E1.I r5 = androidx.compose.foundation.layout.C5080k.a(r5, r6, r15, r7)
            int r6 = U0.C4883j.a(r15, r7)
            U0.y r8 = r15.s()
            androidx.compose.ui.d r4 = androidx.compose.ui.c.e(r15, r4)
            nI.a r9 = r32.a()
            U0.f r10 = r15.m()
            if (r10 != 0) goto L_0x025a
            U0.C4883j.c()
        L_0x025a:
            r15.I()
            boolean r10 = r15.i()
            if (r10 == 0) goto L_0x0267
            r15.p(r9)
            goto L_0x026a
        L_0x0267:
            r15.t()
        L_0x026a:
            U0.m r9 = U0.F1.a(r15)
            nI.p r10 = r32.c()
            U0.F1.c(r9, r5, r10)
            nI.p r5 = r32.e()
            U0.F1.c(r9, r8, r5)
            nI.p r5 = r32.b()
            boolean r8 = r9.i()
            if (r8 != 0) goto L_0x0294
            java.lang.Object r8 = r9.D()
            java.lang.Integer r10 = java.lang.Integer.valueOf(r6)
            boolean r8 = kotlin.jvm.internal.C17542s.e(r8, r10)
            if (r8 != 0) goto L_0x02a2
        L_0x0294:
            java.lang.Integer r8 = java.lang.Integer.valueOf(r6)
            r9.u(r8)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r9.w(r6, r5)
        L_0x02a2:
            nI.p r5 = r32.d()
            U0.F1.c(r9, r4, r5)
            int r4 = By.C12674m.f108290l0
            java.lang.String r4 = J1.j.b(r4, r15, r7)
            SC.N r8 = SC.N.Primary
            r5 = 0
            r6 = 1
            r9 = 0
            androidx.compose.ui.d r3 = androidx.compose.foundation.layout.J.h(r3, r5, r6, r9)
            java.lang.String r5 = "gotIt"
            androidx.compose.ui.d r5 = androidx.compose.ui.platform.C5116k1.a(r3, r5)
            r3 = -1228184810(0xffffffffb6cb6316, float:-6.0614066E-6)
            r15.W(r3)
            r3 = r35 & 112(0x70, float:1.57E-43)
            r9 = 32
            if (r3 == r9) goto L_0x02d7
            r3 = r35 & 64
            if (r3 == 0) goto L_0x02d5
            boolean r3 = r15.F(r1)
            if (r3 == 0) goto L_0x02d5
            goto L_0x02d7
        L_0x02d5:
            r12 = r7
            goto L_0x02d8
        L_0x02d7:
            r12 = r6
        L_0x02d8:
            java.lang.Object r3 = r15.D()
            if (r12 != 0) goto L_0x02e6
            U0.m$a r6 = U0.C4889m.f14007a
            java.lang.Object r6 = r6.a()
            if (r3 != r6) goto L_0x02ee
        L_0x02e6:
            Hy.l r3 = new Hy.l
            r3.<init>(r1)
            r15.u(r3)
        L_0x02ee:
            r13 = r3
            nI.a r13 = (nI.C17631a) r13
            r15.P()
            r3 = 3120(0xc30, float:4.372E-42)
            r16 = 500(0x1f4, float:7.0E-43)
            r6 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r14 = 0
            r7 = r8
            r8 = r9
            r9 = r10
            r10 = r11
            r11 = r12
            r12 = r14
            r14 = r15
            r17 = r15
            r15 = r3
            SC.L.b(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            r17.x()
            r17.x()
            boolean r3 = U0.C4895p.J()
            if (r3 == 0) goto L_0x031a
            U0.C4895p.R()
        L_0x031a:
            U0.Y0 r3 = r17.n()
            if (r3 == 0) goto L_0x0328
            Hy.m r4 = new Hy.m
            r4.<init>(r0, r1, r2)
            r3.a(r4)
        L_0x0328:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: Hy.n.i(Hy.c, Hy.g, U0.m, int):void");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v12, resolved type: nI.a} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void j(Hy.p r18, nI.C17631a<XH.C16807N> r19, U0.C4889m r20, int r21) {
        /*
            r0 = r18
            r1 = r19
            r2 = r21
            java.lang.String r3 = "viewModel"
            kotlin.jvm.internal.C17542s.j(r0, r3)
            java.lang.String r3 = "closeScreen"
            kotlin.jvm.internal.C17542s.j(r1, r3)
            r3 = 1730524277(0x6725b475, float:7.825193E23)
            r4 = r20
            U0.m r15 = r4.k(r3)
            r4 = r2 & 6
            if (r4 != 0) goto L_0x0028
            boolean r4 = r15.F(r0)
            if (r4 == 0) goto L_0x0025
            r4 = 4
            goto L_0x0026
        L_0x0025:
            r4 = 2
        L_0x0026:
            r4 = r4 | r2
            goto L_0x0029
        L_0x0028:
            r4 = r2
        L_0x0029:
            r5 = r2 & 48
            r11 = 32
            if (r5 != 0) goto L_0x003a
            boolean r5 = r15.F(r1)
            if (r5 == 0) goto L_0x0037
            r5 = r11
            goto L_0x0039
        L_0x0037:
            r5 = 16
        L_0x0039:
            r4 = r4 | r5
        L_0x003a:
            r12 = r4
            r4 = r12 & 19
            r5 = 18
            if (r4 != r5) goto L_0x004e
            boolean r4 = r15.l()
            if (r4 != 0) goto L_0x0048
            goto L_0x004e
        L_0x0048:
            r15.L()
            r2 = r15
            goto L_0x0144
        L_0x004e:
            boolean r4 = U0.C4895p.J()
            if (r4 == 0) goto L_0x005a
            r4 = -1
            java.lang.String r5 = "com.ingka.ikea.scanandgo.cart.impl.fullserveinfo.FullServeInfoScreen (FullServeInfoScreen.kt:48)"
            U0.C4895p.S(r3, r12, r4, r5)
        L_0x005a:
            TJ.P r4 = r18.getState()
            r9 = 0
            r10 = 7
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = r15
            U0.A1 r3 = j3.a.c(r4, r5, r6, r7, r8, r9, r10)
            androidx.compose.ui.d$a r4 = androidx.compose.ui.d.f18749a
            androidx.compose.foundation.layout.d r5 = androidx.compose.foundation.layout.C5073d.f18068a
            androidx.compose.foundation.layout.d$m r5 = r5.g()
            i1.c$a r6 = i1.C5437c.f24302a
            i1.c$b r6 = r6.k()
            r14 = 0
            E1.I r5 = androidx.compose.foundation.layout.C5080k.a(r5, r6, r15, r14)
            int r6 = U0.C4883j.a(r15, r14)
            U0.y r7 = r15.s()
            androidx.compose.ui.d r4 = androidx.compose.ui.c.e(r15, r4)
            G1.g$a r8 = G1.C4504g.f6515W
            nI.a r9 = r8.a()
            U0.f r10 = r15.m()
            if (r10 != 0) goto L_0x0096
            U0.C4883j.c()
        L_0x0096:
            r15.I()
            boolean r10 = r15.i()
            if (r10 == 0) goto L_0x00a3
            r15.p(r9)
            goto L_0x00a6
        L_0x00a3:
            r15.t()
        L_0x00a6:
            U0.m r9 = U0.F1.a(r15)
            nI.p r10 = r8.c()
            U0.F1.c(r9, r5, r10)
            nI.p r5 = r8.e()
            U0.F1.c(r9, r7, r5)
            nI.p r5 = r8.b()
            boolean r7 = r9.i()
            if (r7 != 0) goto L_0x00d0
            java.lang.Object r7 = r9.D()
            java.lang.Integer r10 = java.lang.Integer.valueOf(r6)
            boolean r7 = kotlin.jvm.internal.C17542s.e(r7, r10)
            if (r7 != 0) goto L_0x00de
        L_0x00d0:
            java.lang.Integer r7 = java.lang.Integer.valueOf(r6)
            r9.u(r7)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r9.w(r6, r5)
        L_0x00de:
            nI.p r5 = r8.d()
            U0.F1.c(r9, r4, r5)
            s0.h r4 = s0.C5862h.f28810a
            ol.v r4 = ol.v.CLOSE
            r5 = 1446776331(0x563c0e0b, float:5.1692125E13)
            r15.W(r5)
            boolean r5 = r15.F(r0)
            r6 = r12 & 112(0x70, float:1.57E-43)
            if (r6 != r11) goto L_0x00f9
            r6 = 1
            goto L_0x00fa
        L_0x00f9:
            r6 = r14
        L_0x00fa:
            r5 = r5 | r6
            java.lang.Object r6 = r15.D()
            if (r5 != 0) goto L_0x0109
            U0.m$a r5 = U0.C4889m.f14007a
            java.lang.Object r5 = r5.a()
            if (r6 != r5) goto L_0x0111
        L_0x0109:
            Hy.h r6 = new Hy.h
            r6.<init>(r0, r1)
            r15.u(r6)
        L_0x0111:
            r5 = r6
            nI.a r5 = (nI.C17631a) r5
            r15.P()
            r16 = 6
            r17 = 508(0x1fc, float:7.12E-43)
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = r15
            r14 = r16
            r2 = r15
            r15 = r17
            ol.p.c(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            Hy.d r3 = k(r3)
            Hy.n$a r4 = new Hy.n$a
            r4.<init>(r0, r1)
            r5 = 0
            p(r3, r4, r2, r5)
            r2.x()
            boolean r3 = U0.C4895p.J()
            if (r3 == 0) goto L_0x0144
            U0.C4895p.R()
        L_0x0144:
            U0.Y0 r2 = r2.n()
            if (r2 == 0) goto L_0x0154
            Hy.i r3 = new Hy.i
            r4 = r21
            r3.<init>(r0, r1, r4)
            r2.a(r3)
        L_0x0154:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: Hy.n.j(Hy.p, nI.a, U0.m, int):void");
    }

    private static final C13016d k(A1<? extends C13016d> a12) {
        return (C13016d) a12.getValue();
    }

    /* access modifiers changed from: private */
    public static final C16807N l(g gVar) {
        if (gVar != null) {
            gVar.a();
        }
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N m(C13015c cVar, g gVar, int i10, C4889m mVar, int i11) {
        i(cVar, gVar, mVar, M0.a(i10 | 1));
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N n(p pVar, C17631a aVar) {
        pVar.D(C13013a.C2670a.C2671a.f110843a);
        aVar.invoke();
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N o(p pVar, C17631a aVar, int i10, C4889m mVar, int i11) {
        j(pVar, aVar, mVar, M0.a(i10 | 1));
        return C16807N.f139792a;
    }

    public static final void p(C13016d dVar, g gVar, C4889m mVar, int i10) {
        int i11;
        C17542s.j(dVar, "uiState");
        C4889m k10 = mVar.k(-199309756);
        if ((i10 & 6) == 0) {
            i11 = (k10.V(dVar) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= (i10 & 64) == 0 ? k10.V(gVar) : k10.F(gVar) ? 32 : 16;
        }
        if ((i11 & 19) != 18 || !k10.l()) {
            if (C4895p.J()) {
                C4895p.S(-199309756, i11, -1, "com.ingka.ikea.scanandgo.cart.impl.fullserveinfo.FullServeInfoScreenContent (FullServeInfoScreen.kt:79)");
            }
            if (C17542s.e(dVar, C13016d.a.f110852a)) {
                k10.W(-578596708);
                g(k10, 0);
                k10.P();
            } else if (dVar instanceof C13016d.b) {
                k10.W(-578515612);
                i(((C13016d.b) dVar).a(), gVar, k10, i11 & 112);
                k10.P();
            } else {
                k10.W(-18665601);
                k10.P();
                throw new t();
            }
            if (C4895p.J()) {
                C4895p.R();
            }
        } else {
            k10.L();
        }
        Y0 n10 = k10.n();
        if (n10 != null) {
            n10.a(new j(dVar, gVar, i10));
        }
    }

    /* access modifiers changed from: private */
    public static final C16807N q(C13016d dVar, g gVar, int i10, C4889m mVar, int i11) {
        p(dVar, gVar, mVar, M0.a(i10 | 1));
        return C16807N.f139792a;
    }
}
