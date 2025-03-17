package com.ingka.ikea.app.scanandgoonlineredesign.coupon.presentation;

import E1.I;
import G1.C4504g;
import J1.j;
import Oo.b;
import QJ.Q;
import S1.C;
import S1.C4820m;
import S1.C4830x;
import SC.C13607l;
import SC.K0;
import SC.L;
import SC.M;
import SC.N;
import TC.C13679b;
import TC.e;
import U0.A1;
import U0.C4883j;
import U0.C4889m;
import U0.C4895p;
import U0.C4912y;
import U0.F1;
import U0.M0;
import U0.P;
import U0.Y0;
import XH.C16807N;
import XH.y;
import Y1.k;
import androidx.compose.foundation.layout.C5073d;
import androidx.compose.foundation.layout.C5080k;
import androidx.compose.foundation.layout.D;
import androidx.compose.foundation.layout.J;
import androidx.compose.ui.d;
import androidx.compose.ui.platform.C5116k1;
import androidx.lifecycle.C5221y;
import androidx.lifecycle.r;
import com.ingka.ikea.app.scanandgoonlineredesign.coupon.presentation.a;
import dI.C17164e;
import dI.C17168i;
import eI.C17187b;
import i1.C5437c;
import ij.C11391d;
import ij.C11392e;
import ij.C11393f;
import ij.C11394g;
import ij.C11395h;
import ij.C11396i;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17542s;
import nI.C17631a;
import nI.C17642l;
import nI.p;
import r0.m;
import s0.C5844O;
import s0.C5862h;
import tK.C18029u;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u001f\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0001¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u001f\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0001¢\u0006\u0004\b\t\u0010\n\u001a\u000f\u0010\u000b\u001a\u00020\u0004H\u0003¢\u0006\u0004\b\u000b\u0010\f\u001a\u000f\u0010\r\u001a\u00020\u0004H\u0003¢\u0006\u0004\b\r\u0010\f\u001a\u001f\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u0002H\u0003¢\u0006\u0004\b\u0010\u0010\u0011\u001a%\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u00122\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00040\u0014H\u0003¢\u0006\u0004\b\u0016\u0010\u0017¨\u0006\u0018²\u0006\f\u0010\b\u001a\u00020\u00078\nX\u0002"}, d2 = {"Lcom/ingka/ikea/app/scanandgoonlineredesign/coupon/presentation/a;", "viewModel", "Lcom/ingka/ikea/app/scanandgoonlineredesign/coupon/presentation/b;", "actions", "LXH/N;", "k", "(Lcom/ingka/ikea/app/scanandgoonlineredesign/coupon/presentation/a;Lcom/ingka/ikea/app/scanandgoonlineredesign/coupon/presentation/b;LU0/m;I)V", "Lcom/ingka/ikea/app/scanandgoonlineredesign/coupon/presentation/a$c;", "uiState", "j", "(Lcom/ingka/ikea/app/scanandgoonlineredesign/coupon/presentation/a$c;Lcom/ingka/ikea/app/scanandgoonlineredesign/coupon/presentation/b;LU0/m;I)V", "x", "(LU0/m;I)V", "r", "", "couponInputField", "t", "(Ljava/lang/String;Lcom/ingka/ikea/app/scanandgoonlineredesign/coupon/presentation/b;LU0/m;I)V", "", "enabled", "Lkotlin/Function0;", "onClick", "p", "(ZLnI/a;LU0/m;I)V", "scanandgo-implementation_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class c {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @f(c = "com.ingka.ikea.app.scanandgoonlineredesign.coupon.presentation.AddCouponScreenKt$AddCouponScreen$2$1", f = "AddCouponScreen.kt", l = {}, m = "invokeSuspend")
    static final class a extends l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f91304c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ a.c f91305d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ b f91306e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(a.c cVar, b bVar, C17164e<? super a> eVar) {
            super(2, eVar);
            this.f91305d = cVar;
            this.f91306e = bVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new a(this.f91305d, this.f91306e, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((a) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            C17187b.f();
            if (this.f91304c == 0) {
                y.b(obj);
                a.C1995a e10 = this.f91305d.e();
                b bVar = this.f91306e;
                bVar.b(e10);
                bVar.a(a.b.c.f91293a);
                return C16807N.f139792a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public static final void j(a.c cVar, b bVar, C4889m mVar, int i10) {
        int i11;
        a.c cVar2 = cVar;
        b bVar2 = bVar;
        int i12 = i10;
        C17542s.j(cVar2, "uiState");
        C17542s.j(bVar2, "actions");
        C4889m k10 = mVar.k(-2141972475);
        if ((i12 & 6) == 0) {
            i11 = (k10.F(cVar2) ? 4 : 2) | i12;
        } else {
            i11 = i12;
        }
        if ((i12 & 48) == 0) {
            i11 |= (i12 & 64) == 0 ? k10.V(bVar2) : k10.F(bVar2) ? 32 : 16;
        }
        if ((i11 & 19) != 18 || !k10.l()) {
            if (C4895p.J()) {
                C4895p.S(-2141972475, i11, -1, "com.ingka.ikea.app.scanandgoonlineredesign.coupon.presentation.AddCouponScreen (AddCouponScreen.kt:59)");
            }
            a.C1995a e10 = cVar.e();
            k10.W(1607635780);
            int i13 = i11 & 112;
            boolean F10 = k10.F(cVar2) | (i13 == 32 || ((i11 & 64) != 0 && k10.F(bVar2)));
            Object D10 = k10.D();
            if (F10 || D10 == C4889m.f14007a.a()) {
                D10 = new a(cVar2, bVar2, (C17164e<? super a>) null);
                k10.u(D10);
            }
            k10.P();
            P.g(e10, (p) D10, k10, 0);
            d.a aVar = d.f18749a;
            d i14 = e.i(J.h(aVar, 0.0f, 1, (Object) null));
            C18029u uVar = C18029u.f147649a;
            d k11 = D.k(i14, 0.0f, uVar.d(), 1, (Object) null);
            I a10 = C5080k.a(C5073d.f18068a.g(), C5437c.f24302a.k(), k10, 0);
            int a11 = C4883j.a(k10, 0);
            C4912y s10 = k10.s();
            d e11 = androidx.compose.ui.c.e(k10, k11);
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
            F1.c(a13, e11, aVar2.d());
            C5862h hVar = C5862h.f28810a;
            x(k10, 0);
            C5844O.a(J.t(J.h(aVar, 0.0f, 1, (Object) null), uVar.a()), k10, 0);
            r(k10, 0);
            C5844O.a(J.t(J.h(aVar, 0.0f, 1, (Object) null), uVar.a()), k10, 0);
            t(cVar.d().c(), bVar2, k10, i13);
            boolean z10 = cVar.d().c().length() > 0;
            k10.W(-777222577);
            boolean z11 = i13 == 32 || ((i11 & 64) != 0 && k10.F(bVar2));
            Object D11 = k10.D();
            if (z11 || D11 == C4889m.f14007a.a()) {
                D11 = new C11392e(bVar2);
                k10.u(D11);
            }
            k10.P();
            p(z10, (C17631a) D11, k10, 0);
            k10.x();
            if (C4895p.J()) {
                C4895p.R();
            }
        } else {
            k10.L();
        }
        Y0 n10 = k10.n();
        if (n10 != null) {
            n10.a(new C11393f(cVar2, bVar2, i12));
        }
    }

    public static final void k(a aVar, b bVar, C4889m mVar, int i10) {
        int i11;
        C17542s.j(aVar, "viewModel");
        C17542s.j(bVar, "actions");
        C4889m k10 = mVar.k(-1776715221);
        if ((i10 & 6) == 0) {
            i11 = (k10.F(aVar) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= (i10 & 64) == 0 ? k10.V(bVar) : k10.F(bVar) ? 32 : 16;
        }
        int i12 = i11;
        if ((i12 & 19) != 18 || !k10.l()) {
            if (C4895p.J()) {
                C4895p.S(-1776715221, i12, -1, "com.ingka.ikea.app.scanandgoonlineredesign.coupon.presentation.AddCouponScreen (AddCouponScreen.kt:46)");
            }
            j(l(j3.a.c(aVar.m(), (C5221y) null, (r.b) null, (C17168i) null, k10, 0, 7)), bVar, k10, i12 & 112);
            if (C4895p.J()) {
                C4895p.R();
            }
        } else {
            k10.L();
        }
        Y0 n10 = k10.n();
        if (n10 != null) {
            n10.a(new C11391d(aVar, bVar, i10));
        }
    }

    private static final a.c l(A1<a.c> a12) {
        return a12.getValue();
    }

    /* access modifiers changed from: private */
    public static final C16807N m(a aVar, b bVar, int i10, C4889m mVar, int i11) {
        k(aVar, bVar, mVar, M0.a(i10 | 1));
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N n(b bVar) {
        bVar.a(a.b.C1997a.f91291a);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N o(a.c cVar, b bVar, int i10, C4889m mVar, int i11) {
        j(cVar, bVar, mVar, M0.a(i10 | 1));
        return C16807N.f139792a;
    }

    private static final void p(boolean z10, C17631a<C16807N> aVar, C4889m mVar, int i10) {
        int i11;
        C4889m mVar2;
        boolean z11 = z10;
        C17631a<C16807N> aVar2 = aVar;
        int i12 = i10;
        C4889m k10 = mVar.k(-1947563321);
        if ((i12 & 6) == 0) {
            i11 = (k10.b(z11) ? 4 : 2) | i12;
        } else {
            i11 = i12;
        }
        if ((i12 & 48) == 0) {
            i11 |= k10.F(aVar2) ? 32 : 16;
        }
        if ((i11 & 19) != 18 || !k10.l()) {
            if (C4895p.J()) {
                C4895p.S(-1947563321, i11, -1, "com.ingka.ikea.app.scanandgoonlineredesign.coupon.presentation.ApplyButton (AddCouponScreen.kt:141)");
            }
            mVar2 = k10;
            L.b(j.b(b.f84557Y, k10, 0), C5116k1.a(D.m(J.h(d.f18749a, 0.0f, 1, (Object) null), 0.0f, C18029u.f147649a.d(), 0.0f, 0.0f, 13, (Object) null), "AddCouponScreenTest.Tag.Button.Apply"), z10, N.Primary, M.Medium, false, (Integer) null, (K0) null, (m) null, aVar, k10, ((i11 << 6) & 896) | 27648 | ((i11 << 24) & 1879048192), 480);
            if (C4895p.J()) {
                C4895p.R();
            }
        } else {
            k10.L();
            mVar2 = k10;
        }
        Y0 n10 = mVar2.n();
        if (n10 != null) {
            n10.a(new C11395h(z11, aVar2, i12));
        }
    }

    /* access modifiers changed from: private */
    public static final C16807N q(boolean z10, C17631a aVar, int i10, C4889m mVar, int i11) {
        p(z10, aVar, mVar, M0.a(i10 | 1));
        return C16807N.f139792a;
    }

    private static final void r(C4889m mVar, int i10) {
        C4889m mVar2;
        int i11 = i10;
        C4889m k10 = mVar.k(1785578595);
        if (i11 != 0 || !k10.l()) {
            if (C4895p.J()) {
                C4895p.S(1785578595, i11, -1, "com.ingka.ikea.app.scanandgoonlineredesign.coupon.presentation.Description (AddCouponScreen.kt:105)");
            }
            d a10 = C5116k1.a(J.h(d.f18749a, 0.0f, 1, (Object) null), "AddCouponScreenTest.Tag.Description");
            mVar2 = k10;
            C13607l.j(j.b(Ez.f.f109664D, k10, 0), C13679b.a.C2856b.f116680a, a10, 0, 0, (C4830x) null, (C) null, (C4820m) null, 0, (k) null, (Y1.j) null, (Y1.f) null, 0, 0, false, 0, 0, (C17642l<? super N1.P, C16807N>) null, mVar2, 432, 0, 262136);
            if (C4895p.J()) {
                C4895p.R();
            }
        } else {
            k10.L();
            mVar2 = k10;
        }
        Y0 n10 = mVar2.n();
        if (n10 != null) {
            n10.a(new C11394g(i11));
        }
    }

    /* access modifiers changed from: private */
    public static final C16807N s(int i10, C4889m mVar, int i11) {
        r(mVar, M0.a(i10 | 1));
        return C16807N.f139792a;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v7, resolved type: nI.l} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static final void t(java.lang.String r35, com.ingka.ikea.app.scanandgoonlineredesign.coupon.presentation.b r36, U0.C4889m r37, int r38) {
        /*
            r15 = r35
            r7 = r36
            r0 = 1691817079(0x64d71477, float:3.1740197E22)
            r1 = r37
            U0.m r5 = r1.k(r0)
            r1 = r38 & 6
            if (r1 != 0) goto L_0x001d
            boolean r1 = r5.V(r15)
            if (r1 == 0) goto L_0x0019
            r1 = 4
            goto L_0x001a
        L_0x0019:
            r1 = 2
        L_0x001a:
            r1 = r38 | r1
            goto L_0x001f
        L_0x001d:
            r1 = r38
        L_0x001f:
            r2 = r38 & 48
            r3 = 32
            if (r2 != 0) goto L_0x0039
            r2 = r38 & 64
            if (r2 != 0) goto L_0x002e
            boolean r2 = r5.V(r7)
            goto L_0x0032
        L_0x002e:
            boolean r2 = r5.F(r7)
        L_0x0032:
            if (r2 == 0) goto L_0x0036
            r2 = r3
            goto L_0x0038
        L_0x0036:
            r2 = 16
        L_0x0038:
            r1 = r1 | r2
        L_0x0039:
            r2 = r1 & 19
            r4 = 18
            if (r2 != r4) goto L_0x004d
            boolean r2 = r5.l()
            if (r2 != 0) goto L_0x0046
            goto L_0x004d
        L_0x0046:
            r5.L()
            r23 = r5
            goto L_0x011b
        L_0x004d:
            boolean r2 = U0.C4895p.J()
            if (r2 == 0) goto L_0x0059
            r2 = -1
            java.lang.String r4 = "com.ingka.ikea.app.scanandgoonlineredesign.coupon.presentation.InputFieldCouponCode (AddCouponScreen.kt:117)"
            U0.C4895p.S(r0, r1, r2, r4)
        L_0x0059:
            androidx.compose.ui.d$a r0 = androidx.compose.ui.d.f18749a
            java.lang.String r2 = "AddCouponScreenTest.Tag.Input.DiscountCode"
            androidx.compose.ui.d r19 = androidx.compose.ui.platform.C5116k1.a(r0, r2)
            int r0 = Oo.b.f84579a1
            r2 = 0
            java.lang.String r23 = J1.j.b(r0, r5, r2)
            uK.c r0 = uK.C18148c.DiscountTag
            int r0 = r0.m()
            B0.A r34 = new B0.A
            T1.r$a r4 = T1.r.f13620b
            int r28 = r4.b()
            r32 = 119(0x77, float:1.67E-43)
            r33 = 0
            r25 = 0
            r26 = 0
            r27 = 0
            r29 = 0
            r30 = 0
            r31 = 0
            r24 = r34
            r24.<init>(r25, r26, r27, r28, r29, r30, r31, r32, r33)
            int r4 = Oo.b.f84601c1
            java.lang.String r24 = J1.j.b(r4, r5, r2)
            r4 = -456252291(0xffffffffe4ce247d, float:-3.0421268E22)
            r5.W(r4)
            r4 = r1 & 112(0x70, float:1.57E-43)
            if (r4 == r3) goto L_0x00a5
            r3 = r1 & 64
            if (r3 == 0) goto L_0x00a6
            boolean r3 = r5.F(r7)
            if (r3 == 0) goto L_0x00a6
        L_0x00a5:
            r2 = 1
        L_0x00a6:
            java.lang.Object r3 = r5.D()
            if (r2 != 0) goto L_0x00b4
            U0.m$a r2 = U0.C4889m.f14007a
            java.lang.Object r2 = r2.a()
            if (r3 != r2) goto L_0x00bc
        L_0x00b4:
            ij.j r3 = new ij.j
            r3.<init>(r7)
            r5.u(r3)
        L_0x00bc:
            r2 = r3
            nI.l r2 = (nI.C17642l) r2
            r5.P()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r0)
            r0 = -456244428(0xffffffffe4ce4334, float:-3.0438974E22)
            r5.W(r0)
            java.lang.Object r0 = r5.D()
            U0.m$a r4 = U0.C4889m.f14007a
            java.lang.Object r4 = r4.a()
            if (r0 != r4) goto L_0x00e0
            ij.k r0 = new ij.k
            r0.<init>()
            r5.u(r0)
        L_0x00e0:
            r4 = r0
            nI.a r4 = (nI.C17631a) r4
            r5.P()
            r0 = r1 & 14
            r1 = 14180352(0xd86000, float:1.9870905E-38)
            r20 = r0 | r1
            r21 = 196608(0x30000, float:2.75506E-40)
            r22 = 491264(0x77f00, float:6.88407E-40)
            r6 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r0 = r35
            r1 = r2
            r2 = r23
            r23 = r5
            r5 = r24
            r7 = r19
            r15 = r34
            r19 = r23
            SC.V0.e(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
            boolean r0 = U0.C4895p.J()
            if (r0 == 0) goto L_0x011b
            U0.C4895p.R()
        L_0x011b:
            U0.Y0 r0 = r23.n()
            if (r0 == 0) goto L_0x012f
            ij.l r1 = new ij.l
            r2 = r35
            r3 = r36
            r4 = r38
            r1.<init>(r2, r3, r4)
            r0.a(r1)
        L_0x012f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ingka.ikea.app.scanandgoonlineredesign.coupon.presentation.c.t(java.lang.String, com.ingka.ikea.app.scanandgoonlineredesign.coupon.presentation.b, U0.m, int):void");
    }

    /* access modifiers changed from: private */
    public static final C16807N u(b bVar, String str) {
        C17542s.j(str, "it");
        bVar.a(new a.b.C1998b(str));
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N v() {
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N w(String str, b bVar, int i10, C4889m mVar, int i11) {
        t(str, bVar, mVar, M0.a(i10 | 1));
        return C16807N.f139792a;
    }

    private static final void x(C4889m mVar, int i10) {
        C4889m mVar2;
        int i11 = i10;
        C4889m k10 = mVar.k(1582210055);
        if (i11 != 0 || !k10.l()) {
            if (C4895p.J()) {
                C4895p.S(1582210055, i11, -1, "com.ingka.ikea.app.scanandgoonlineredesign.coupon.presentation.Title (AddCouponScreen.kt:96)");
            }
            d a10 = C5116k1.a(J.h(d.f18749a, 0.0f, 1, (Object) null), "AddCouponScreenTest.Tag.Title");
            mVar2 = k10;
            C13607l.j(j.b(b.f84574Z6, k10, 0), C13679b.C2857b.a.f116683a, a10, 0, 0, (C4830x) null, (C) null, (C4820m) null, 0, (k) null, (Y1.j) null, (Y1.f) null, 0, 0, false, 0, 0, (C17642l<? super N1.P, C16807N>) null, mVar2, 432, 0, 262136);
            if (C4895p.J()) {
                C4895p.R();
            }
        } else {
            k10.L();
            mVar2 = k10;
        }
        Y0 n10 = mVar2.n();
        if (n10 != null) {
            n10.a(new C11396i(i11));
        }
    }

    /* access modifiers changed from: private */
    public static final C16807N y(int i10, C4889m mVar, int i11) {
        x(mVar, M0.a(i10 | 1));
        return C16807N.f139792a;
    }
}
