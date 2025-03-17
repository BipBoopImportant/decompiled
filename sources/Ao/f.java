package Ao;

import Bo.a;
import E1.I;
import G1.C4504g;
import IC.C13023e;
import KJ.C15985a;
import KJ.C15987c;
import N1.P;
import O0.V;
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
import U0.Y0;
import XH.C16807N;
import XH.t;
import XH.y;
import Y1.j;
import Y1.k;
import androidx.compose.foundation.layout.C5073d;
import androidx.compose.foundation.layout.C5080k;
import androidx.compose.foundation.layout.D;
import androidx.compose.foundation.layout.G;
import androidx.compose.foundation.layout.J;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import androidx.compose.ui.platform.C5116k1;
import androidx.lifecycle.C5221y;
import androidx.lifecycle.r;
import dI.C17164e;
import dI.C17168i;
import eI.C17187b;
import i1.C5437c;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17542s;
import nI.C17631a;
import nI.C17642l;
import nI.p;
import r0.m;
import s0.C5842M;
import s0.C5843N;
import s0.C5862h;
import tK.C18029u;
import uK.C18146a;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u001a%\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0001¢\u0006\u0004\b\u0005\u0010\u0006\u001a3\u0010\u000b\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0003¢\u0006\u0004\b\u000b\u0010\f\u001a\u001d\u0010\u0010\u001a\u00020\u00032\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH\u0003¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0013²\u0006\f\u0010\b\u001a\u00020\u00128\nX\u0002"}, d2 = {"LBo/b;", "viewModel", "Lkotlin/Function0;", "LXH/N;", "onDismiss", "j", "(LBo/b;LnI/a;LU0/m;I)V", "LBo/a$a;", "uiState", "onPrimaryAction", "onSecondaryAction", "h", "(LBo/a$a;LnI/a;LnI/a;LU0/m;I)V", "LKJ/c;", "LBo/a$a$a;", "addressContent", "f", "(LKJ/c;LU0/m;I)V", "LBo/a;", "checkout-implementation_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class f {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.checkout.impl.userdetails.update.compose.UpdateAddressScreenKt$UpdateAddressScreen$3$1", f = "UpdateAddressScreen.kt", l = {}, m = "invokeSuspend")
    static final class a extends l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f79053c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ Bo.a f79054d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ C17631a<C16807N> f79055e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ Bo.b f79056f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(Bo.a aVar, C17631a<C16807N> aVar2, Bo.b bVar, C17164e<? super a> eVar) {
            super(2, eVar);
            this.f79054d = aVar;
            this.f79055e = aVar2;
            this.f79056f = bVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new a(this.f79054d, this.f79055e, this.f79056f, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((a) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            C17187b.f();
            if (this.f79053c == 0) {
                y.b(obj);
                if (((a.C1469a) this.f79054d).d()) {
                    this.f79055e.invoke();
                    this.f79056f.H();
                }
                return C16807N.f139792a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.checkout.impl.userdetails.update.compose.UpdateAddressScreenKt$UpdateAddressScreen$4$1", f = "UpdateAddressScreen.kt", l = {}, m = "invokeSuspend")
    static final class b extends l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f79057c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ Bo.b f79058d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(Bo.b bVar, C17164e<? super b> eVar) {
            super(2, eVar);
            this.f79058d = bVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new b(this.f79058d, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((b) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            C17187b.f();
            if (this.f79057c == 0) {
                y.b(obj);
                this.f79058d.J();
                return C16807N.f139792a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    private static final void f(C15987c<a.C1469a.C1470a> cVar, C4889m mVar, int i10) {
        int i11;
        C4889m mVar2;
        C15987c<a.C1469a.C1470a> cVar2 = cVar;
        int i12 = i10;
        C4889m k10 = mVar.k(1804175824);
        if ((i12 & 6) == 0) {
            i11 = (k10.V(cVar2) ? 4 : 2) | i12;
        } else {
            i11 = i12;
        }
        if ((i11 & 3) != 2 || !k10.l()) {
            if (C4895p.J()) {
                C4895p.S(1804175824, i11, -1, "com.ingka.ikea.checkout.impl.userdetails.update.compose.AddressDiffContent (UpdateAddressScreen.kt:126)");
            }
            d.a aVar = d.f18749a;
            d i13 = e.i(J.h(C5116k1.a(aVar, "ADDRESS_CONTENT"), 0.0f, 1, (Object) null));
            C18029u uVar = C18029u.f147649a;
            d k11 = D.k(i13, 0.0f, uVar.e(), 1, (Object) null);
            C5437c.a aVar2 = C5437c.f24302a;
            C5437c.C0386c i14 = aVar2.i();
            C5073d dVar = C5073d.f18068a;
            I b10 = G.b(dVar.f(), i14, k10, 48);
            int a10 = C4883j.a(k10, 0);
            C4912y s10 = k10.s();
            d e10 = c.e(k10, k11);
            C4504g.a aVar3 = C4504g.f6515W;
            C17631a<C4504g> a11 = aVar3.a();
            if (k10.m() == null) {
                C4883j.c();
            }
            k10.I();
            if (k10.i()) {
                k10.p(a11);
            } else {
                k10.t();
            }
            C4889m a12 = F1.a(k10);
            F1.c(a12, b10, aVar3.c());
            F1.c(a12, s10, aVar3.e());
            p<C4504g, Integer, C16807N> b11 = aVar3.b();
            if (a12.i() || !C17542s.e(a12.D(), Integer.valueOf(a10))) {
                a12.u(Integer.valueOf(a10));
                a12.w(Integer.valueOf(a10), b11);
            }
            F1.c(a12, e10, aVar3.d());
            C5843N n10 = C5843N.f28726a;
            V.a(J1.e.c(C18146a.f148086I6, k10, 0), (String) null, (d) null, 0, k10, 48, 12);
            d m10 = D.m(C5842M.e(n10, aVar, 1.0f, false, 2, (Object) null), uVar.a(), 0.0f, 0.0f, 0.0f, 14, (Object) null);
            I a13 = C5080k.a(dVar.g(), aVar2.k(), k10, 0);
            int a14 = C4883j.a(k10, 0);
            C4912y s11 = k10.s();
            d e11 = c.e(k10, m10);
            C17631a<C4504g> a15 = aVar3.a();
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
            F1.c(a16, a13, aVar3.c());
            F1.c(a16, s11, aVar3.e());
            p<C4504g, Integer, C16807N> b12 = aVar3.b();
            if (a16.i() || !C17542s.e(a16.D(), Integer.valueOf(a14))) {
                a16.u(Integer.valueOf(a14));
                a16.w(Integer.valueOf(a14), b12);
            }
            F1.c(a16, e11, aVar3.d());
            C5862h hVar = C5862h.f28810a;
            k10.W(922452159);
            for (a.C1469a.C1470a aVar4 : cVar) {
                C4889m mVar3 = k10;
                C13607l.j(aVar4.a(), C13679b.a.C2856b.f116680a, (d) null, 0, 0, (C4830x) null, aVar4.b() ? C.f13316b.a() : C.f13316b.d(), (C4820m) null, 0, (k) null, (j) null, (Y1.f) null, 0, 0, false, 0, 0, (C17642l<? super P, C16807N>) null, mVar3, 48, 0, 262076);
                k10 = mVar3;
            }
            mVar2 = k10;
            mVar2.P();
            mVar2.x();
            mVar2.x();
            if (C4895p.J()) {
                C4895p.R();
            }
        } else {
            k10.L();
            mVar2 = k10;
        }
        Y0 n11 = mVar2.n();
        if (n11 != null) {
            n11.a(new b(cVar2, i12));
        }
    }

    /* access modifiers changed from: private */
    public static final C16807N g(C15987c cVar, int i10, C4889m mVar, int i11) {
        f(cVar, mVar, M0.a(i10 | 1));
        return C16807N.f139792a;
    }

    private static final void h(a.C1469a aVar, C17631a<C16807N> aVar2, C17631a<C16807N> aVar3, C4889m mVar, int i10) {
        int i11;
        C4889m mVar2;
        a.C1469a aVar4 = aVar;
        C17631a<C16807N> aVar5 = aVar2;
        C17631a<C16807N> aVar6 = aVar3;
        int i12 = i10;
        C4889m k10 = mVar.k(-649971855);
        if ((i12 & 6) == 0) {
            i11 = (k10.F(aVar4) ? 4 : 2) | i12;
        } else {
            i11 = i12;
        }
        if ((i12 & 48) == 0) {
            i11 |= k10.F(aVar5) ? 32 : 16;
        }
        if ((i12 & 384) == 0) {
            i11 |= k10.F(aVar6) ? 256 : 128;
        }
        int i13 = i11;
        if ((i13 & 147) != 146 || !k10.l()) {
            if (C4895p.J()) {
                C4895p.S(-649971855, i13, -1, "com.ingka.ikea.checkout.impl.userdetails.update.compose.UpdateAddressContent (UpdateAddressScreen.kt:79)");
            }
            d.a aVar7 = d.f18749a;
            d h10 = J.h(aVar7, 0.0f, 1, (Object) null);
            I a10 = C5080k.a(C5073d.f18068a.g(), C5437c.f24302a.k(), k10, 0);
            int a11 = C4883j.a(k10, 0);
            C4912y s10 = k10.s();
            d e10 = c.e(k10, h10);
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
            d i14 = e.i(aVar7);
            C18029u uVar = C18029u.f147649a;
            d k11 = D.k(i14, 0.0f, uVar.a(), 1, (Object) null);
            C13023e e11 = aVar.e();
            int i15 = C13023e.f110931a;
            C4889m mVar3 = k10;
            C13607l.j(e11.a(k10, i15), C13679b.C2857b.a.f116683a, k11, 0, 0, (C4830x) null, (C) null, (C4820m) null, 0, (k) null, (j) null, (Y1.f) null, 0, 0, false, 0, 0, (C17642l<? super P, C16807N>) null, mVar3, 48, 0, 262136);
            C13607l.j(aVar.b().a(k10, i15), C13679b.a.C2856b.f116680a, e.i(aVar7), 0, 0, (C4830x) null, (C) null, (C4820m) null, 0, (k) null, (j) null, (Y1.f) null, 0, 0, false, 0, 0, (C17642l<? super P, C16807N>) null, mVar3, 48, 0, 262136);
            f(C15985a.h(aVar.a()), k10, 0);
            L.b(aVar.c().a(k10, i15), D.k(J.h(aVar7, 0.0f, 1, (Object) null), uVar.a(), 0.0f, 2, (Object) null), false, N.Primary, (M) null, aVar.f(), (Integer) null, (K0) null, (m) null, aVar2, k10, ((i13 << 24) & 1879048192) | 3072, 468);
            C4889m mVar4 = k10;
            mVar2 = mVar4;
            L.b(J1.j.b(Oo.b.f84522U4, mVar4, 0), D.i(J.h(aVar7, 0.0f, 1, (Object) null), uVar.a()), false, N.Tertiary, (M) null, false, (Integer) null, (K0) null, (m) null, aVar3, mVar4, ((i13 << 21) & 1879048192) | 3072, 500);
            mVar2.x();
            if (C4895p.J()) {
                C4895p.R();
            }
        } else {
            k10.L();
            mVar2 = k10;
        }
        Y0 n10 = mVar2.n();
        if (n10 != null) {
            n10.a(new a(aVar4, aVar5, aVar6, i10));
        }
    }

    /* access modifiers changed from: private */
    public static final C16807N i(a.C1469a aVar, C17631a aVar2, C17631a aVar3, int i10, C4889m mVar, int i11) {
        h(aVar, aVar2, aVar3, mVar, M0.a(i10 | 1));
        return C16807N.f139792a;
    }

    public static final void j(Bo.b bVar, C17631a<C16807N> aVar, C4889m mVar, int i10) {
        int i11;
        C17542s.j(bVar, "viewModel");
        C17542s.j(aVar, "onDismiss");
        C4889m k10 = mVar.k(766019986);
        if ((i10 & 6) == 0) {
            i11 = (k10.F(bVar) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= k10.F(aVar) ? 32 : 16;
        }
        int i12 = i11;
        if ((i12 & 19) != 18 || !k10.l()) {
            if (C4895p.J()) {
                C4895p.S(766019986, i12, -1, "com.ingka.ikea.checkout.impl.userdetails.update.compose.UpdateAddressScreen (UpdateAddressScreen.kt:43)");
            }
            Bo.a k11 = k(j3.a.c(bVar.m(), (C5221y) null, (r.b) null, (C17168i) null, k10, 0, 7));
            if (k11 instanceof a.C1469a) {
                a.C1469a aVar2 = (a.C1469a) k11;
                k10.W(-236859110);
                boolean F10 = k10.F(bVar);
                Object D10 = k10.D();
                if (F10 || D10 == C4889m.f14007a.a()) {
                    D10 = new c(bVar);
                    k10.u(D10);
                }
                C17631a aVar3 = (C17631a) D10;
                k10.P();
                k10.W(-236856037);
                boolean F11 = k10.F(bVar);
                Object D11 = k10.D();
                if (F11 || D11 == C4889m.f14007a.a()) {
                    D11 = new d(bVar);
                    k10.u(D11);
                }
                k10.P();
                h(aVar2, aVar3, (C17631a) D11, k10, 0);
                Boolean valueOf = Boolean.valueOf(aVar2.d());
                k10.W(-236852174);
                boolean V10 = k10.V(k11) | ((i12 & 112) == 32) | k10.F(bVar);
                Object D12 = k10.D();
                if (V10 || D12 == C4889m.f14007a.a()) {
                    D12 = new a(k11, aVar, bVar, (C17164e<? super a>) null);
                    k10.u(D12);
                }
                k10.P();
                U0.P.g(valueOf, (p) D12, k10, 0);
                C16807N n10 = C16807N.f139792a;
                k10.W(-236846466);
                boolean F12 = k10.F(bVar);
                Object D13 = k10.D();
                if (F12 || D13 == C4889m.f14007a.a()) {
                    D13 = new b(bVar, (C17164e<? super b>) null);
                    k10.u(D13);
                }
                k10.P();
                U0.P.g(n10, (p) D13, k10, 6);
            } else if (!C17542s.e(k11, a.b.f79336a)) {
                throw new t();
            }
            if (C4895p.J()) {
                C4895p.R();
            }
        } else {
            k10.L();
        }
        Y0 n11 = k10.n();
        if (n11 != null) {
            n11.a(new e(bVar, aVar, i10));
        }
    }

    private static final Bo.a k(A1<? extends Bo.a> a12) {
        return (Bo.a) a12.getValue();
    }

    /* access modifiers changed from: private */
    public static final C16807N l(Bo.b bVar) {
        bVar.I();
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N m(Bo.b bVar) {
        bVar.F();
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N n(Bo.b bVar, C17631a aVar, int i10, C4889m mVar, int i11) {
        j(bVar, aVar, mVar, M0.a(i10 | 1));
        return C16807N.f139792a;
    }
}
