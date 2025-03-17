package WD;

import E1.C4488v;
import E1.I;
import G1.C4504g;
import QJ.C16297b0;
import QJ.Q;
import TC.e;
import U0.C4883j;
import U0.C4889m;
import U0.C4895p;
import U0.C4899r0;
import U0.C4912y;
import U0.F1;
import U0.M0;
import U0.Y0;
import VD.d;
import XH.C16807N;
import XH.y;
import androidx.compose.foundation.layout.C5073d;
import androidx.compose.foundation.layout.C5080k;
import androidx.compose.foundation.layout.J;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import androidx.lifecycle.C5221y;
import androidx.lifecycle.r;
import c2.r;
import dI.C17164e;
import dI.C17168i;
import eI.C17187b;
import i1.C5437c;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17542s;
import nI.C17631a;
import nI.C17642l;
import nI.p;
import s0.C5844O;
import s0.C5852X;
import s0.C5857c;
import s0.C5861g;
import s0.C5862h;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a%\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0001¢\u0006\u0004\b\u0005\u0010\u0006\u001a%\u0010\n\u001a\u00020\u00032\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\t\u001a\u00020\bH\u0001¢\u0006\u0004\b\n\u0010\u000b\u001a\u0017\u0010\f\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\bH\u0003¢\u0006\u0004\b\f\u0010\r\u001a%\u0010\u0012\u001a\u00020\u00032\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0003¢\u0006\u0004\b\u0012\u0010\u0013\u001a\u001d\u0010\u0015\u001a\u00020\u0003*\u00020\u00142\b\b\u0002\u0010\u000f\u001a\u00020\u000eH\u0003¢\u0006\u0004\b\u0015\u0010\u0016¨\u0006\u0019²\u0006\u000e\u0010\u0018\u001a\u00020\u00178\n@\nX\u0002"}, d2 = {"LVD/d;", "viewModel", "Lkotlin/Function0;", "LXH/N;", "onDismiss", "p", "(LVD/d;LnI/a;LU0/m;I)V", "onContinue", "LVD/d$b;", "state", "m", "(LnI/a;LVD/d$b;LU0/m;I)V", "r", "(LVD/d$b;LU0/m;I)V", "Landroidx/compose/ui/d;", "modifier", "", "userName", "t", "(Landroidx/compose/ui/d;Ljava/lang/String;LU0/m;II)V", "Ls0/c;", "h", "(Ls0/c;Landroidx/compose/ui/d;LU0/m;II)V", "Lc2/r;", "sizeImage", "welcome-implementation_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* renamed from: WD.l  reason: case insensitive filesystem */
public final class C13795l {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @f(c = "com.ingka.ikea.welcome.impl.presentation.welcome.compose.OnboardingWelcomeScreenKt$OnboardingWelcomeContent$1$1", f = "OnboardingWelcomeScreen.kt", l = {80}, m = "invokeSuspend")
    /* renamed from: WD.l$a */
    static final class a extends l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f117674c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C17631a<C16807N> f117675d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(C17631a<C16807N> aVar, C17164e<? super a> eVar) {
            super(2, eVar);
            this.f117675d = aVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new a(this.f117675d, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((a) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f117674c;
            if (i10 == 0) {
                y.b(obj);
                this.f117674c = 1;
                if (C16297b0.b(3000, this) == f10) {
                    return f10;
                }
            } else if (i10 == 1) {
                y.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            this.f117675d.invoke();
            return C16807N.f139792a;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x0050  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0055  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x014a  */
    /* JADX WARNING: Removed duplicated region for block: B:47:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static final void h(s0.C5857c r23, androidx.compose.ui.d r24, U0.C4889m r25, int r26, int r27) {
        /*
            r0 = r23
            r1 = r26
            r2 = r27
            r3 = -968239943(0xffffffffc649d4b9, float:-12917.181)
            r4 = r25
            U0.m r14 = r4.k(r3)
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r4 & r2
            r5 = 2
            if (r4 == 0) goto L_0x0018
            r4 = r1 | 6
            goto L_0x0028
        L_0x0018:
            r4 = r1 & 6
            if (r4 != 0) goto L_0x0027
            boolean r4 = r14.V(r0)
            if (r4 == 0) goto L_0x0024
            r4 = 4
            goto L_0x0025
        L_0x0024:
            r4 = r5
        L_0x0025:
            r4 = r4 | r1
            goto L_0x0028
        L_0x0027:
            r4 = r1
        L_0x0028:
            r6 = r2 & 1
            if (r6 == 0) goto L_0x0031
            r4 = r4 | 48
        L_0x002e:
            r7 = r24
            goto L_0x0043
        L_0x0031:
            r7 = r1 & 48
            if (r7 != 0) goto L_0x002e
            r7 = r24
            boolean r8 = r14.V(r7)
            if (r8 == 0) goto L_0x0040
            r8 = 32
            goto L_0x0042
        L_0x0040:
            r8 = 16
        L_0x0042:
            r4 = r4 | r8
        L_0x0043:
            r8 = r4 & 19
            r9 = 18
            if (r8 != r9) goto L_0x0055
            boolean r8 = r14.l()
            if (r8 != 0) goto L_0x0050
            goto L_0x0055
        L_0x0050:
            r14.L()
            goto L_0x0144
        L_0x0055:
            if (r6 == 0) goto L_0x005b
            androidx.compose.ui.d$a r6 = androidx.compose.ui.d.f18749a
            r15 = r6
            goto L_0x005c
        L_0x005b:
            r15 = r7
        L_0x005c:
            boolean r6 = U0.C4895p.J()
            if (r6 == 0) goto L_0x0068
            r6 = -1
            java.lang.String r7 = "com.ingka.ikea.welcome.impl.presentation.welcome.compose.BackgroundImage (OnboardingWelcomeScreen.kt:170)"
            U0.C4895p.S(r3, r4, r6, r7)
        L_0x0068:
            r3 = -2055712561(0xffffffff857850cf, float:-1.1675746E-35)
            r14.W(r3)
            java.lang.Object r3 = r14.D()
            U0.m$a r4 = U0.C4889m.f14007a
            java.lang.Object r6 = r4.a()
            r7 = 0
            if (r3 != r6) goto L_0x008c
            c2.r$a r3 = c2.r.f23053b
            long r8 = r3.a()
            c2.r r3 = c2.r.b(r8)
            U0.r0 r3 = U0.u1.e(r3, r7, r5, r7)
            r14.u(r3)
        L_0x008c:
            U0.r0 r3 = (U0.C4899r0) r3
            r14.P()
            p1.l0$a r16 = p1.C5728l0.f27325b
            p1.v0$a r6 = p1.C5747v0.f27350b
            long r8 = r6.h()
            p1.v0 r6 = p1.C5747v0.k(r8)
            tK.v r8 = tK.C18030v.f147664a
            int r9 = tK.C18030v.f147665b
            tK.h r8 = r8.a(r14, r9)
            long r8 = r8.x0()
            p1.v0 r8 = p1.C5747v0.k(r8)
            p1.v0[] r6 = new p1.C5747v0[]{r6, r8}
            java.util.List r17 = YH.C16877v.q(r6)
            long r8 = i(r3)
            int r6 = c2.r.g(r8)
            float r6 = (float) r6
            long r8 = i(r3)
            int r8 = c2.r.g(r8)
            float r8 = (float) r8
            float r5 = (float) r5
            float r8 = r8 * r5
            r5 = 3
            float r5 = (float) r5
            float r8 = r8 / r5
            float r18 = r6 - r8
            long r5 = i(r3)
            int r5 = c2.r.g(r5)
            float r5 = (float) r5
            r21 = 8
            r22 = 0
            r20 = 0
            r19 = r5
            p1.l0 r16 = p1.C5728l0.a.l(r16, r17, r18, r19, r20, r21, r22)
            r5 = 0
            r6 = 1
            androidx.compose.ui.d r5 = androidx.compose.foundation.layout.J.f(r15, r5, r6, r7)
            r6 = -2055699943(0xffffffff85788219, float:-1.1684799E-35)
            r14.W(r6)
            java.lang.Object r6 = r14.D()
            java.lang.Object r4 = r4.a()
            if (r6 != r4) goto L_0x0101
            WD.h r6 = new WD.h
            r6.<init>(r3)
            r14.u(r6)
        L_0x0101:
            nI.l r6 = (nI.C17642l) r6
            r14.P()
            androidx.compose.ui.d r6 = androidx.compose.ui.layout.c.a(r5, r6)
            int r3 = QD.C13418a.f114308a
            r13 = 0
            t1.c r4 = J1.e.c(r3, r14, r13)
            E1.k$a r3 = E1.C4478k.f5915a
            E1.k r8 = r3.a()
            r12 = 24624(0x6030, float:3.4506E-41)
            r3 = 104(0x68, float:1.46E-43)
            r5 = 0
            r7 = 0
            r9 = 0
            r10 = 0
            r11 = r14
            r17 = r15
            r15 = r13
            r13 = r3
            n0.C5583F.a(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            androidx.compose.ui.d$a r3 = androidx.compose.ui.d.f18749a
            androidx.compose.ui.d r8 = r0.e(r3)
            r12 = 6
            r13 = 0
            r11 = 0
            r9 = r16
            androidx.compose.ui.d r3 = androidx.compose.foundation.b.b(r8, r9, r10, r11, r12, r13)
            androidx.compose.foundation.layout.C5077h.a(r3, r14, r15)
            boolean r3 = U0.C4895p.J()
            if (r3 == 0) goto L_0x0142
            U0.C4895p.R()
        L_0x0142:
            r7 = r17
        L_0x0144:
            U0.Y0 r3 = r14.n()
            if (r3 == 0) goto L_0x0152
            WD.i r4 = new WD.i
            r4.<init>(r0, r7, r1, r2)
            r3.a(r4)
        L_0x0152:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: WD.C13795l.h(s0.c, androidx.compose.ui.d, U0.m, int, int):void");
    }

    private static final long i(C4899r0<r> r0Var) {
        return r0Var.getValue().k();
    }

    private static final void j(C4899r0<r> r0Var, long j10) {
        r0Var.setValue(r.b(j10));
    }

    /* access modifiers changed from: private */
    public static final C16807N k(C4899r0 r0Var, C4488v vVar) {
        C17542s.j(vVar, "it");
        j(r0Var, vVar.a());
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N l(C5857c cVar, d dVar, int i10, int i11, C4889m mVar, int i12) {
        h(cVar, dVar, mVar, M0.a(i10 | 1), i11);
        return C16807N.f139792a;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v0, resolved type: nI.a} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m(nI.C17631a<XH.C16807N> r21, VD.d.b r22, U0.C4889m r23, int r24) {
        /*
            r0 = r21
            r1 = r22
            r2 = r24
            java.lang.String r3 = "onContinue"
            kotlin.jvm.internal.C17542s.j(r0, r3)
            java.lang.String r3 = "state"
            kotlin.jvm.internal.C17542s.j(r1, r3)
            r3 = -1781393211(0xffffffff95d218c5, float:-8.4857404E-26)
            r4 = r23
            U0.m r4 = r4.k(r3)
            r5 = r2 & 6
            r6 = 4
            if (r5 != 0) goto L_0x0029
            boolean r5 = r4.F(r0)
            if (r5 == 0) goto L_0x0026
            r5 = r6
            goto L_0x0027
        L_0x0026:
            r5 = 2
        L_0x0027:
            r5 = r5 | r2
            goto L_0x002a
        L_0x0029:
            r5 = r2
        L_0x002a:
            r7 = r2 & 48
            r8 = 32
            if (r7 != 0) goto L_0x0044
            r7 = r2 & 64
            if (r7 != 0) goto L_0x0039
            boolean r7 = r4.V(r1)
            goto L_0x003d
        L_0x0039:
            boolean r7 = r4.F(r1)
        L_0x003d:
            if (r7 == 0) goto L_0x0041
            r7 = r8
            goto L_0x0043
        L_0x0041:
            r7 = 16
        L_0x0043:
            r5 = r5 | r7
        L_0x0044:
            r7 = r5 & 19
            r9 = 18
            if (r7 != r9) goto L_0x0056
            boolean r7 = r4.l()
            if (r7 != 0) goto L_0x0051
            goto L_0x0056
        L_0x0051:
            r4.L()
            goto L_0x01a2
        L_0x0056:
            boolean r7 = U0.C4895p.J()
            if (r7 == 0) goto L_0x0062
            r7 = -1
            java.lang.String r9 = "com.ingka.ikea.welcome.impl.presentation.welcome.compose.OnboardingWelcomeContent (OnboardingWelcomeScreen.kt:76)"
            U0.C4895p.S(r3, r5, r7, r9)
        L_0x0062:
            r3 = -332749457(0xffffffffec2aa56f, float:-8.251945E26)
            r4.W(r3)
            VD.d$b$a r3 = VD.d.b.a.f117407a
            boolean r3 = kotlin.jvm.internal.C17542s.e(r1, r3)
            r7 = 0
            r9 = 1
            r10 = 0
            if (r3 != 0) goto L_0x00a2
            r3 = -332747603(0xffffffffec2aacad, float:-8.253313E26)
            r4.W(r3)
            r3 = r5 & 14
            if (r3 != r6) goto L_0x007f
            r3 = r9
            goto L_0x0080
        L_0x007f:
            r3 = r10
        L_0x0080:
            java.lang.Object r11 = r4.D()
            if (r3 != 0) goto L_0x008e
            U0.m$a r3 = U0.C4889m.f14007a
            java.lang.Object r3 = r3.a()
            if (r11 != r3) goto L_0x0096
        L_0x008e:
            WD.l$a r11 = new WD.l$a
            r11.<init>(r0, r7)
            r4.u(r11)
        L_0x0096:
            nI.p r11 = (nI.p) r11
            r4.P()
            int r3 = r5 >> 3
            r3 = r3 & 14
            U0.P.g(r1, r11, r4, r3)
        L_0x00a2:
            r4.P()
            androidx.compose.ui.d$a r3 = androidx.compose.ui.d.f18749a
            java.lang.String r11 = "CLICK_ANYWHERE_FOR_NEXT_FEATURE"
            androidx.compose.ui.d r12 = androidx.compose.ui.platform.C5116k1.a(r3, r11)
            r3 = -332739232(0xffffffffec2acd60, float:-8.25949E26)
            r4.W(r3)
            java.lang.Object r3 = r4.D()
            U0.m$a r11 = U0.C4889m.f14007a
            java.lang.Object r13 = r11.a()
            if (r3 != r13) goto L_0x00c6
            r0.m r3 = r0.l.a()
            r4.u(r3)
        L_0x00c6:
            r13 = r3
            r0.m r13 = (r0.m) r13
            r4.P()
            r3 = -332736279(0xffffffffec2ad8e9, float:-8.261669E26)
            r4.W(r3)
            r3 = r5 & 112(0x70, float:1.57E-43)
            if (r3 == r8) goto L_0x00e3
            r3 = r5 & 64
            if (r3 == 0) goto L_0x00e1
            boolean r3 = r4.F(r1)
            if (r3 == 0) goto L_0x00e1
            goto L_0x00e3
        L_0x00e1:
            r3 = r10
            goto L_0x00e4
        L_0x00e3:
            r3 = r9
        L_0x00e4:
            r8 = r5 & 14
            if (r8 != r6) goto L_0x00ea
            r6 = r9
            goto L_0x00eb
        L_0x00ea:
            r6 = r10
        L_0x00eb:
            r3 = r3 | r6
            java.lang.Object r6 = r4.D()
            if (r3 != 0) goto L_0x00f8
            java.lang.Object r3 = r11.a()
            if (r6 != r3) goto L_0x0100
        L_0x00f8:
            WD.e r6 = new WD.e
            r6.<init>(r1, r0)
            r4.u(r6)
        L_0x0100:
            r18 = r6
            nI.a r18 = (nI.C17631a) r18
            r4.P()
            r19 = 28
            r20 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            androidx.compose.ui.d r3 = androidx.compose.foundation.d.b(r12, r13, r14, r15, r16, r17, r18, r19, r20)
            i1.c$a r6 = i1.C5437c.f24302a
            i1.c r6 = r6.o()
            E1.I r6 = androidx.compose.foundation.layout.C5077h.h(r6, r10)
            int r8 = U0.C4883j.a(r4, r10)
            U0.y r10 = r4.s()
            androidx.compose.ui.d r3 = androidx.compose.ui.c.e(r4, r3)
            G1.g$a r11 = G1.C4504g.f6515W
            nI.a r12 = r11.a()
            U0.f r13 = r4.m()
            if (r13 != 0) goto L_0x013a
            U0.C4883j.c()
        L_0x013a:
            r4.I()
            boolean r13 = r4.i()
            if (r13 == 0) goto L_0x0147
            r4.p(r12)
            goto L_0x014a
        L_0x0147:
            r4.t()
        L_0x014a:
            U0.m r12 = U0.F1.a(r4)
            nI.p r13 = r11.c()
            U0.F1.c(r12, r6, r13)
            nI.p r6 = r11.e()
            U0.F1.c(r12, r10, r6)
            nI.p r6 = r11.b()
            boolean r10 = r12.i()
            if (r10 != 0) goto L_0x0174
            java.lang.Object r10 = r12.D()
            java.lang.Integer r13 = java.lang.Integer.valueOf(r8)
            boolean r10 = kotlin.jvm.internal.C17542s.e(r10, r13)
            if (r10 != 0) goto L_0x0182
        L_0x0174:
            java.lang.Integer r10 = java.lang.Integer.valueOf(r8)
            r12.u(r10)
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            r12.w(r8, r6)
        L_0x0182:
            nI.p r6 = r11.d()
            U0.F1.c(r12, r3, r6)
            androidx.compose.foundation.layout.j r3 = androidx.compose.foundation.layout.C5079j.f18125a
            r6 = 6
            h(r3, r7, r4, r6, r9)
            int r3 = r5 >> 3
            r3 = r3 & 14
            r(r1, r4, r3)
            r4.x()
            boolean r3 = U0.C4895p.J()
            if (r3 == 0) goto L_0x01a2
            U0.C4895p.R()
        L_0x01a2:
            U0.Y0 r3 = r4.n()
            if (r3 == 0) goto L_0x01b0
            WD.f r4 = new WD.f
            r4.<init>(r0, r1, r2)
            r3.a(r4)
        L_0x01b0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: WD.C13795l.m(nI.a, VD.d$b, U0.m, int):void");
    }

    /* access modifiers changed from: private */
    public static final C16807N n(d.b bVar, C17631a aVar) {
        if (!C17542s.e(bVar, d.b.a.f117407a)) {
            aVar.invoke();
        }
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N o(C17631a aVar, d.b bVar, int i10, C4889m mVar, int i11) {
        m(aVar, bVar, mVar, M0.a(i10 | 1));
        return C16807N.f139792a;
    }

    public static final void p(VD.d dVar, C17631a<C16807N> aVar, C4889m mVar, int i10) {
        int i11;
        C17542s.j(dVar, "viewModel");
        C17542s.j(aVar, "onDismiss");
        C4889m k10 = mVar.k(1010354529);
        if ((i10 & 6) == 0) {
            i11 = (k10.F(dVar) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= k10.F(aVar) ? 32 : 16;
        }
        int i12 = i11;
        if ((i12 & 19) != 18 || !k10.l()) {
            if (C4895p.J()) {
                C4895p.S(1010354529, i12, -1, "com.ingka.ikea.welcome.impl.presentation.welcome.compose.OnboardingWelcomeScreen (OnboardingWelcomeScreen.kt:63)");
            }
            m(aVar, j3.a.c(dVar.getState(), (C5221y) null, (r.b) null, (C17168i) null, k10, 0, 7).getValue(), k10, (i12 >> 3) & 14);
            if (C4895p.J()) {
                C4895p.R();
            }
        } else {
            k10.L();
        }
        Y0 n10 = k10.n();
        if (n10 != null) {
            n10.a(new C13794k(dVar, aVar, i10));
        }
    }

    /* access modifiers changed from: private */
    public static final C16807N q(VD.d dVar, C17631a aVar, int i10, C4889m mVar, int i11) {
        p(dVar, aVar, mVar, M0.a(i10 | 1));
        return C16807N.f139792a;
    }

    private static final void r(d.b bVar, C4889m mVar, int i10) {
        int i11;
        C4889m k10 = mVar.k(101020395);
        if ((i10 & 6) == 0) {
            i11 = ((i10 & 8) == 0 ? k10.V(bVar) : k10.F(bVar) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i11 & 3) != 2 || !k10.l()) {
            if (C4895p.J()) {
                C4895p.S(101020395, i11, -1, "com.ingka.ikea.welcome.impl.presentation.welcome.compose.OnboardingWelcomeUserInfo (OnboardingWelcomeScreen.kt:104)");
            }
            d.a aVar = androidx.compose.ui.d.f18749a;
            androidx.compose.ui.d f10 = J.f(e.i(C5852X.d(aVar)), 0.0f, 1, (Object) null);
            I a10 = C5080k.a(C5073d.f18068a.g(), C5437c.f24302a.g(), k10, 48);
            int a11 = C4883j.a(k10, 0);
            C4912y s10 = k10.s();
            androidx.compose.ui.d e10 = c.e(k10, f10);
            C4504g.a aVar2 = C4504g.f6515W;
            C17631a<C4504g> a12 = aVar2.a();
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
            F1.c(a13, a10, aVar2.c());
            F1.c(a13, s10, aVar2.e());
            p<C4504g, Integer, C16807N> b10 = aVar2.b();
            if (a13.i() || !C17542s.e(a13.D(), Integer.valueOf(a11))) {
                a13.u(Integer.valueOf(a11));
                a13.w(Integer.valueOf(a11), b10);
            }
            F1.c(a13, e10, aVar2.d());
            C5844O.a(C5861g.c(C5862h.f28810a, aVar, 1.0f, false, 2, (Object) null), k10, 0);
            androidx.compose.animation.a.a(bVar, J.h(aVar, 0.0f, 1, (Object) null), (C17642l) null, (C5437c) null, "animationLabel", (C17642l) null, C13784a.f117644a.b(), k10, (i11 & 14) | 1597488, 44);
            k10.x();
            if (C4895p.J()) {
                C4895p.R();
            }
        } else {
            k10.L();
        }
        Y0 n10 = k10.n();
        if (n10 != null) {
            n10.a(new C13790g(bVar, i10));
        }
    }

    /* access modifiers changed from: private */
    public static final C16807N s(d.b bVar, int i10, C4889m mVar, int i11) {
        r(bVar, mVar, M0.a(i10 | 1));
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0055  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x005c  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x01ea  */
    /* JADX WARNING: Removed duplicated region for block: B:61:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void t(androidx.compose.ui.d r33, java.lang.String r34, U0.C4889m r35, int r36, int r37) {
        /*
            r0 = r36
            r1 = r37
            r2 = 2
            r3 = 6
            r4 = 1788856545(0x6a9fc8e1, float:9.658391E25)
            r5 = r35
            U0.m r15 = r5.k(r4)
            r5 = 1
            r6 = r1 & 1
            if (r6 == 0) goto L_0x001a
            r7 = r0 | 6
            r8 = r7
            r7 = r33
            goto L_0x002e
        L_0x001a:
            r7 = r0 & 6
            if (r7 != 0) goto L_0x002b
            r7 = r33
            boolean r8 = r15.V(r7)
            if (r8 == 0) goto L_0x0028
            r8 = 4
            goto L_0x0029
        L_0x0028:
            r8 = r2
        L_0x0029:
            r8 = r8 | r0
            goto L_0x002e
        L_0x002b:
            r7 = r33
            r8 = r0
        L_0x002e:
            r2 = r2 & r1
            if (r2 == 0) goto L_0x0036
            r8 = r8 | 48
        L_0x0033:
            r9 = r34
            goto L_0x0048
        L_0x0036:
            r9 = r0 & 48
            if (r9 != 0) goto L_0x0033
            r9 = r34
            boolean r10 = r15.V(r9)
            if (r10 == 0) goto L_0x0045
            r10 = 32
            goto L_0x0047
        L_0x0045:
            r10 = 16
        L_0x0047:
            r8 = r8 | r10
        L_0x0048:
            r10 = r8 & 19
            r11 = 18
            if (r10 != r11) goto L_0x005c
            boolean r10 = r15.l()
            if (r10 != 0) goto L_0x0055
            goto L_0x005c
        L_0x0055:
            r15.L()
            r2 = r9
            r3 = r15
            goto L_0x01e4
        L_0x005c:
            if (r6 == 0) goto L_0x0062
            androidx.compose.ui.d$a r6 = androidx.compose.ui.d.f18749a
            r14 = r6
            goto L_0x0063
        L_0x0062:
            r14 = r7
        L_0x0063:
            r6 = 0
            if (r2 == 0) goto L_0x0068
            r2 = r6
            goto L_0x0069
        L_0x0068:
            r2 = r9
        L_0x0069:
            boolean r7 = U0.C4895p.J()
            if (r7 == 0) goto L_0x0075
            r7 = -1
            java.lang.String r9 = "com.ingka.ikea.welcome.impl.presentation.welcome.compose.UserInformation (OnboardingWelcomeScreen.kt:140)"
            U0.C4895p.S(r4, r8, r7, r9)
        L_0x0075:
            r4 = 0
            androidx.compose.ui.d r4 = androidx.compose.foundation.layout.J.h(r14, r4, r5, r6)
            i1.c$a r5 = i1.C5437c.f24302a
            i1.c$b r5 = r5.g()
            androidx.compose.foundation.layout.d r6 = androidx.compose.foundation.layout.C5073d.f18068a
            androidx.compose.foundation.layout.d$f r6 = r6.b()
            r7 = 54
            E1.I r5 = androidx.compose.foundation.layout.C5080k.a(r6, r5, r15, r7)
            r13 = 0
            int r6 = U0.C4883j.a(r15, r13)
            U0.y r7 = r15.s()
            androidx.compose.ui.d r4 = androidx.compose.ui.c.e(r15, r4)
            G1.g$a r8 = G1.C4504g.f6515W
            nI.a r9 = r8.a()
            U0.f r10 = r15.m()
            if (r10 != 0) goto L_0x00a8
            U0.C4883j.c()
        L_0x00a8:
            r15.I()
            boolean r10 = r15.i()
            if (r10 == 0) goto L_0x00b5
            r15.p(r9)
            goto L_0x00b8
        L_0x00b5:
            r15.t()
        L_0x00b8:
            U0.m r9 = U0.F1.a(r15)
            nI.p r10 = r8.c()
            U0.F1.c(r9, r5, r10)
            nI.p r5 = r8.e()
            U0.F1.c(r9, r7, r5)
            nI.p r5 = r8.b()
            boolean r7 = r9.i()
            if (r7 != 0) goto L_0x00e2
            java.lang.Object r7 = r9.D()
            java.lang.Integer r10 = java.lang.Integer.valueOf(r6)
            boolean r7 = kotlin.jvm.internal.C17542s.e(r7, r10)
            if (r7 != 0) goto L_0x00f0
        L_0x00e2:
            java.lang.Integer r7 = java.lang.Integer.valueOf(r6)
            r9.u(r7)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r9.w(r6, r5)
        L_0x00f0:
            nI.p r5 = r8.d()
            U0.F1.c(r9, r4, r5)
            s0.h r4 = s0.C5862h.f28810a
            int r4 = QD.C13419b.f114309a
            java.lang.String r5 = J1.j.b(r4, r15, r13)
            tK.v r4 = tK.C18030v.f147664a
            int r12 = tK.C18030v.f147665b
            tK.h r6 = r4.a(r15, r12)
            long r8 = r6.F0()
            TC.b$a$a r6 = TC.C13679b.a.C2855a.f116679a
            Y1.j$a r31 = Y1.j.f14783b
            int r7 = r31.a()
            Y1.j r18 = Y1.j.h(r7)
            r29 = 0
            r30 = 261108(0x3fbf4, float:3.6589E-40)
            r7 = 0
            r10 = 0
            r16 = 0
            r3 = r12
            r12 = r16
            r13 = r16
            r32 = r14
            r14 = r16
            r16 = 0
            r33 = r15
            r15 = r16
            r17 = 0
            r19 = 0
            r20 = 0
            r22 = 0
            r23 = 0
            r24 = 0
            r25 = 0
            r26 = 0
            r28 = 48
            r27 = r33
            SC.C13607l.j(r5, r6, r7, r8, r10, r12, r13, r14, r15, r17, r18, r19, r20, r22, r23, r24, r25, r26, r27, r28, r29, r30)
            androidx.compose.ui.d$a r7 = androidx.compose.ui.d.f18749a
            java.lang.String r5 = "USER_NAME_LABEL"
            androidx.compose.ui.d r27 = androidx.compose.ui.platform.C5116k1.a(r7, r5)
            r5 = 1832313890(0x6d36e422, float:3.5376292E27)
            r15 = r33
            r15.W(r5)
            if (r2 != 0) goto L_0x0161
            int r5 = QD.C13419b.f114310b
            r14 = 0
            java.lang.String r5 = J1.j.b(r5, r15, r14)
            goto L_0x0163
        L_0x0161:
            r14 = 0
            r5 = r2
        L_0x0163:
            r15.P()
            tK.h r3 = r4.a(r15, r3)
            long r8 = r3.F0()
            TC.b$b$d r6 = TC.C13679b.C2857b.d.f116686a
            int r3 = r31.a()
            Y1.j r18 = Y1.j.h(r3)
            r29 = 0
            r30 = 261104(0x3fbf0, float:3.65885E-40)
            r10 = 0
            r12 = 0
            r13 = 0
            r3 = 0
            r4 = r14
            r14 = r3
            r16 = 0
            r3 = r15
            r15 = r16
            r17 = 0
            r19 = 0
            r20 = 0
            r22 = 0
            r23 = 0
            r24 = 0
            r25 = 0
            r26 = 0
            r28 = 432(0x1b0, float:6.05E-43)
            r4 = r7
            r7 = r27
            r27 = r3
            SC.C13607l.j(r5, r6, r7, r8, r10, r12, r13, r14, r15, r17, r18, r19, r20, r22, r23, r24, r25, r26, r27, r28, r29, r30)
            r5 = 52
            float r5 = (float) r5
            float r5 = c2.h.B(r5)
            androidx.compose.ui.d r5 = androidx.compose.foundation.layout.J.i(r4, r5)
            r6 = 6
            s0.C5844O.a(r5, r3, r6)
            int r5 = lg.C10027d.f75285p
            r6 = 0
            t1.c r5 = J1.e.c(r5, r3, r6)
            r13 = 48
            r14 = 124(0x7c, float:1.74E-43)
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = r3
            n0.C5583F.a(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            r5 = 64
            float r5 = (float) r5
            float r5 = c2.h.B(r5)
            androidx.compose.ui.d r4 = androidx.compose.foundation.layout.J.i(r4, r5)
            r5 = 6
            s0.C5844O.a(r4, r3, r5)
            r3.x()
            boolean r4 = U0.C4895p.J()
            if (r4 == 0) goto L_0x01e2
            U0.C4895p.R()
        L_0x01e2:
            r7 = r32
        L_0x01e4:
            U0.Y0 r3 = r3.n()
            if (r3 == 0) goto L_0x01f2
            WD.j r4 = new WD.j
            r4.<init>(r7, r2, r0, r1)
            r3.a(r4)
        L_0x01f2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: WD.C13795l.t(androidx.compose.ui.d, java.lang.String, U0.m, int, int):void");
    }

    /* access modifiers changed from: private */
    public static final C16807N u(androidx.compose.ui.d dVar, String str, int i10, int i11, C4889m mVar, int i12) {
        t(dVar, str, mVar, M0.a(i10 | 1), i11);
        return C16807N.f139792a;
    }
}
