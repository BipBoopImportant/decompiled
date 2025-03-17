package wK;

import B0.C4380y;
import E1.I;
import G1.C4504g;
import U0.C4877g1;
import U0.C4883j;
import U0.C4889m;
import U0.C4894o0;
import U0.C4895p;
import U0.C4912y;
import U0.F1;
import XH.C16807N;
import android.content.Context;
import android.widget.Toast;
import androidx.compose.foundation.layout.C5073d;
import androidx.compose.foundation.layout.C5080k;
import androidx.compose.foundation.layout.G;
import androidx.compose.foundation.layout.J;
import androidx.compose.ui.d;
import androidx.room.x;
import com.oppwa.mobile.connect.checkout.dialog.CheckoutActivity;
import i1.C5437c;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import nI.C17631a;
import nI.C17642l;
import nI.p;
import nI.q;
import r0.m;
import s0.C5843N;
import s0.C5862h;
import tK.C18029u;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* renamed from: wK.b2  reason: case insensitive filesystem */
public final class C18272b2 {

    /* renamed from: a  reason: collision with root package name */
    public static final C18272b2 f150601a = new C18272b2();

    /* renamed from: b  reason: collision with root package name */
    private static q<p<? super C4889m, ? super Integer, C16807N>, C4889m, Integer, C16807N> f150602b = c1.c.c(1477994830, false, a.f150605a);

    /* renamed from: c  reason: collision with root package name */
    private static p<C4889m, Integer, C16807N> f150603c = c1.c.c(-160318129, false, b.f150606a);

    /* renamed from: d  reason: collision with root package name */
    private static p<C4889m, Integer, C16807N> f150604d = c1.c.c(1778906689, false, c.f150607a);

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: wK.b2$a */
    static final class a implements q<p<? super C4889m, ? super Integer, ? extends C16807N>, C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f150605a = new a();

        a() {
        }

        public final void a(p<? super C4889m, ? super Integer, C16807N> pVar, C4889m mVar, int i10) {
            C17542s.j(pVar, "innerTextField");
            if ((i10 & 6) == 0) {
                i10 |= mVar.F(pVar) ? 4 : 2;
            }
            if ((i10 & 19) != 18 || !mVar.l()) {
                if (C4895p.J()) {
                    C4895p.S(1477994830, i10, -1, "net.ikea.skapa.ui.components.ComposableSingletons$QuantityStepperKt.lambda-1.<anonymous> (QuantityStepper.kt:454)");
                }
                C5437c.C0386c i11 = C5437c.f24302a.i();
                C5073d.f b10 = C5073d.f18068a.b();
                d.a aVar = d.f18749a;
                I b11 = G.b(b10, i11, mVar, 54);
                int a10 = C4883j.a(mVar, 0);
                C4912y s10 = mVar.s();
                d e10 = androidx.compose.ui.c.e(mVar, aVar);
                C4504g.a aVar2 = C4504g.f6515W;
                C17631a<C4504g> a11 = aVar2.a();
                if (mVar.m() == null) {
                    C4883j.c();
                }
                mVar.I();
                if (mVar.i()) {
                    mVar.p(a11);
                } else {
                    mVar.t();
                }
                C4889m a12 = F1.a(mVar);
                F1.c(a12, b11, aVar2.c());
                F1.c(a12, s10, aVar2.e());
                p<C4504g, Integer, C16807N> b12 = aVar2.b();
                if (a12.i() || !C17542s.e(a12.D(), Integer.valueOf(a10))) {
                    a12.u(Integer.valueOf(a10));
                    a12.w(Integer.valueOf(a10), b12);
                }
                F1.c(a12, e10, aVar2.d());
                C5843N n10 = C5843N.f28726a;
                pVar.invoke(mVar, Integer.valueOf(i10 & 14));
                mVar.x();
                if (C4895p.J()) {
                    C4895p.R();
                    return;
                }
                return;
            }
            mVar.L();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            a((p) obj, (C4889m) obj2, ((Number) obj3).intValue());
            return C16807N.f139792a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: wK.b2$b */
    static final class b implements p<C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f150606a = new b();

        b() {
        }

        private static final int h(C4894o0 o0Var) {
            return o0Var.e();
        }

        /* access modifiers changed from: private */
        public static final C16807N i(C4894o0 o0Var, int i10) {
            j(o0Var, i10);
            return C16807N.f139792a;
        }

        private static final void j(C4894o0 o0Var, int i10) {
            o0Var.g(i10);
        }

        /* access modifiers changed from: private */
        public static final C16807N k(C4894o0 o0Var, int i10) {
            j(o0Var, i10);
            return C16807N.f139792a;
        }

        /* access modifiers changed from: private */
        public static final C16807N m(C4894o0 o0Var, int i10) {
            j(o0Var, i10);
            return C16807N.f139792a;
        }

        /* access modifiers changed from: private */
        public static final C16807N n(C4894o0 o0Var, int i10) {
            j(o0Var, i10);
            return C16807N.f139792a;
        }

        public final void f(C4889m mVar, int i10) {
            C4889m mVar2 = mVar;
            int i11 = i10;
            if ((i11 & 3) != 2 || !mVar.l()) {
                if (C4895p.J()) {
                    C4895p.S(-160318129, i11, -1, "net.ikea.skapa.ui.components.ComposableSingletons$QuantityStepperKt.lambda-2.<anonymous> (QuantityStepper.kt:553)");
                }
                C5073d.f n10 = C5073d.f18068a.n(C18029u.f147649a.j());
                d.a aVar = d.f18749a;
                I a10 = C5080k.a(n10, C5437c.f24302a.k(), mVar2, 0);
                int a11 = C4883j.a(mVar2, 0);
                C4912y s10 = mVar.s();
                d e10 = androidx.compose.ui.c.e(mVar2, aVar);
                C4504g.a aVar2 = C4504g.f6515W;
                C17631a<C4504g> a12 = aVar2.a();
                if (mVar.m() == null) {
                    C4883j.c();
                }
                mVar.I();
                if (mVar.i()) {
                    mVar2.p(a12);
                } else {
                    mVar.t();
                }
                C4889m a13 = F1.a(mVar);
                F1.c(a13, a10, aVar2.c());
                F1.c(a13, s10, aVar2.e());
                p<C4504g, Integer, C16807N> b10 = aVar2.b();
                if (a13.i() || !C17542s.e(a13.D(), Integer.valueOf(a11))) {
                    a13.u(Integer.valueOf(a11));
                    a13.w(Integer.valueOf(a11), b10);
                }
                F1.c(a13, e10, aVar2.d());
                C5862h hVar = C5862h.f28810a;
                mVar2.W(-1857292504);
                Object D10 = mVar.D();
                C4889m.a aVar3 = C4889m.f14007a;
                if (D10 == aVar3.a()) {
                    D10 = C4877g1.a(0);
                    mVar2.u(D10);
                }
                C4894o0 o0Var = (C4894o0) D10;
                mVar.P();
                d h10 = J.h(aVar, 0.0f, 1, (Object) null);
                int h11 = h(o0Var);
                R7 r72 = R7.Small;
                mVar2.W(-1857280171);
                Object D11 = mVar.D();
                if (D11 == aVar3.a()) {
                    D11 = new C18284c2(o0Var);
                    mVar2.u(D11);
                }
                mVar.P();
                P7.m(h11, (d) null, 0, 9999, r72, false, (m) null, "Increase", "Decrease", (C17642l) D11, mVar, 918580224, CheckoutActivity.RESULT_ERROR);
                int h12 = h(o0Var);
                mVar2.W(-1857269643);
                Object D12 = mVar.D();
                if (D12 == aVar3.a()) {
                    D12 = new C18296d2(o0Var);
                    mVar2.u(D12);
                }
                mVar.P();
                P7.m(h12, (d) null, 0, x.MAX_BIND_PARAMETER_CNT, r72, false, (m) null, "Increase", "Decrease", (C17642l) D12, mVar, 918580224, CheckoutActivity.RESULT_ERROR);
                int h13 = h(o0Var);
                R7 r73 = R7.Medium;
                mVar2.W(-1857260911);
                Object D13 = mVar.D();
                if (D13 == aVar3.a()) {
                    D13 = new C18308e2(o0Var);
                    mVar2.u(D13);
                }
                mVar.P();
                P7.m(h13, (d) null, 0, 0, r73, false, (m) null, "plus", "minus", (C17642l) D13, mVar, 918577152, 110);
                int h14 = h(o0Var);
                mVar2.W(-1857250383);
                Object D14 = mVar.D();
                if (D14 == aVar3.a()) {
                    D14 = new C18320f2(o0Var);
                    mVar2.u(D14);
                }
                mVar.P();
                P7.m(h14, h10, 0, 0, r72, false, (m) null, "Increase", "Decrease", (C17642l) D14, mVar, 918577200, 108);
                mVar.x();
                if (C4895p.J()) {
                    C4895p.R();
                    return;
                }
                return;
            }
            mVar.L();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            f((C4889m) obj, ((Number) obj2).intValue());
            return C16807N.f139792a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: wK.b2$c */
    static final class c implements p<C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        public static final c f150607a = new c();

        c() {
        }

        private static final int i(C4894o0 o0Var) {
            return o0Var.e();
        }

        /* access modifiers changed from: private */
        public static final C16807N j(Context context, int i10) {
            Toast.makeText(context, "New input value: " + i10, 0).show();
            return C16807N.f139792a;
        }

        /* access modifiers changed from: private */
        public static final C16807N k(Context context, C4894o0 o0Var, int i10) {
            m(o0Var, i10);
            Toast.makeText(context, "Value updated by from buttons or input field: " + i10, 0).show();
            return C16807N.f139792a;
        }

        private static final void m(C4894o0 o0Var, int i10) {
            o0Var.g(i10);
        }

        /* access modifiers changed from: private */
        public static final C16807N n(Context context, C4380y yVar) {
            C17542s.j(yVar, "$this$KeyboardActions");
            Toast.makeText(context, "Done", 0).show();
            return C16807N.f139792a;
        }

        /* access modifiers changed from: private */
        public static final C16807N p(Context context, int i10) {
            Toast.makeText(context, "Decrease value: " + i10, 0).show();
            return C16807N.f139792a;
        }

        /* access modifiers changed from: private */
        public static final C16807N q(Context context, int i10) {
            Toast.makeText(context, "Increase value: " + i10, 0).show();
            return C16807N.f139792a;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v0, resolved type: nI.l} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v0, resolved type: nI.l} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void h(U0.C4889m r24, int r25) {
            /*
                r23 = this;
                r13 = r24
                r0 = r25
                r1 = r0 & 3
                r2 = 2
                if (r1 != r2) goto L_0x0015
                boolean r1 = r24.l()
                if (r1 != 0) goto L_0x0010
                goto L_0x0015
            L_0x0010:
                r24.L()
                goto L_0x0150
            L_0x0015:
                boolean r1 = U0.C4895p.J()
                if (r1 == 0) goto L_0x0024
                r1 = -1
                java.lang.String r2 = "net.ikea.skapa.ui.components.ComposableSingletons$QuantityStepperKt.lambda-3.<anonymous> (QuantityStepper.kt:597)"
                r3 = 1778906689(0x6a07f641, float:4.109197E25)
                U0.C4895p.S(r3, r0, r1, r2)
            L_0x0024:
                r0 = -1612191286(0xffffffff9fe7e9ca, float:-9.821908E-20)
                r13.W(r0)
                java.lang.Object r0 = r24.D()
                U0.m$a r1 = U0.C4889m.f14007a
                java.lang.Object r2 = r1.a()
                if (r0 != r2) goto L_0x003e
                r0 = 0
                U0.o0 r0 = U0.C4877g1.a(r0)
                r13.u(r0)
            L_0x003e:
                U0.o0 r0 = (U0.C4894o0) r0
                r24.P()
                U0.I0 r2 = androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.g()
                java.lang.Object r2 = r13.Q(r2)
                android.content.Context r2 = (android.content.Context) r2
                int r3 = i(r0)
                androidx.compose.ui.d$a r4 = androidx.compose.ui.d.f18749a
                r5 = 1
                r6 = 0
                r7 = 0
                androidx.compose.ui.d r9 = androidx.compose.foundation.layout.J.h(r4, r7, r5, r6)
                T1.r$a r4 = T1.r.f13620b
                int r10 = r4.b()
                r4 = -1612178197(0xffffffff9fe81ceb, float:-9.830366E-20)
                r13.W(r4)
                boolean r4 = r13.F(r2)
                java.lang.Object r5 = r24.D()
                if (r4 != 0) goto L_0x0076
                java.lang.Object r4 = r1.a()
                if (r5 != r4) goto L_0x007e
            L_0x0076:
                wK.g2 r5 = new wK.g2
                r5.<init>(r2)
                r13.u(r5)
            L_0x007e:
                r15 = r5
                nI.l r15 = (nI.C17642l) r15
                r24.P()
                B0.z r11 = new B0.z
                r16 = 0
                r17 = 0
                r18 = 0
                r19 = 0
                r20 = 0
                r21 = 62
                r22 = 0
                r14 = r11
                r14.<init>(r15, r16, r17, r18, r19, r20, r21, r22)
                r4 = -1612171654(0xffffffff9fe8367a, float:-9.8345946E-20)
                r13.W(r4)
                boolean r4 = r13.F(r2)
                java.lang.Object r5 = r24.D()
                if (r4 != 0) goto L_0x00ae
                java.lang.Object r4 = r1.a()
                if (r5 != r4) goto L_0x00b6
            L_0x00ae:
                wK.h2 r5 = new wK.h2
                r5.<init>(r2)
                r13.u(r5)
            L_0x00b6:
                nI.l r5 = (nI.C17642l) r5
                r24.P()
                r4 = -1612167046(0xffffffff9fe8487a, float:-9.8375724E-20)
                r13.W(r4)
                boolean r4 = r13.F(r2)
                java.lang.Object r6 = r24.D()
                if (r4 != 0) goto L_0x00d1
                java.lang.Object r4 = r1.a()
                if (r6 != r4) goto L_0x00d9
            L_0x00d1:
                wK.i2 r6 = new wK.i2
                r6.<init>(r2)
                r13.u(r6)
            L_0x00d9:
                nI.l r6 = (nI.C17642l) r6
                r24.P()
                r4 = -1612162181(0xffffffff9fe85b7b, float:-9.8407164E-20)
                r13.W(r4)
                boolean r4 = r13.F(r2)
                java.lang.Object r7 = r24.D()
                if (r4 != 0) goto L_0x00f4
                java.lang.Object r4 = r1.a()
                if (r7 != r4) goto L_0x00fc
            L_0x00f4:
                wK.j2 r7 = new wK.j2
                r7.<init>(r2)
                r13.u(r7)
            L_0x00fc:
                nI.l r7 = (nI.C17642l) r7
                r24.P()
                wK.C7 r14 = new wK.C7
                r14.<init>(r5, r6, r7)
                r4 = -1612157697(0xffffffff9fe86cff, float:-9.843614E-20)
                r13.W(r4)
                boolean r4 = r13.F(r2)
                java.lang.Object r5 = r24.D()
                if (r4 != 0) goto L_0x011c
                java.lang.Object r1 = r1.a()
                if (r5 != r1) goto L_0x0124
            L_0x011c:
                wK.k2 r5 = new wK.k2
                r5.<init>(r2, r0)
                r13.u(r5)
            L_0x0124:
                r12 = r5
                nI.l r12 = (nI.C17642l) r12
                r24.P()
                r15 = 0
                r16 = 496(0x1f0, float:6.95E-43)
                java.lang.String r1 = "Decrease"
                java.lang.String r2 = "Increase"
                r4 = 0
                r5 = 0
                r6 = 0
                r7 = 0
                r8 = 0
                r0 = 805309872(0x30000db0, float:4.658558E-10)
                r17 = r14
                r14 = r0
                r0 = r3
                r3 = r9
                r9 = r10
                r10 = r11
                r11 = r17
                r13 = r24
                wK.P7.o(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
                boolean r0 = U0.C4895p.J()
                if (r0 == 0) goto L_0x0150
                U0.C4895p.R()
            L_0x0150:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: wK.C18272b2.c.h(U0.m, int):void");
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            h((C4889m) obj, ((Number) obj2).intValue());
            return C16807N.f139792a;
        }
    }

    public final q<p<? super C4889m, ? super Integer, C16807N>, C4889m, Integer, C16807N> a() {
        return f150602b;
    }
}
