package jv;

import E1.I;
import G1.C4504g;
import J1.j;
import O0.C4762x0;
import P0.b;
import SC.F0;
import SC.G0;
import SC.H0;
import U0.C4883j;
import U0.C4889m;
import U0.C4895p;
import U0.C4912y;
import U0.F1;
import U0.M0;
import U0.Y0;
import XH.C16807N;
import XH.t;
import androidx.compose.foundation.layout.C5077h;
import androidx.compose.foundation.layout.C5079j;
import androidx.compose.foundation.layout.D;
import androidx.compose.foundation.layout.J;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import androidx.compose.ui.platform.C5116k1;
import c2.h;
import e5.C7787c;
import i1.C5437c;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import mv.C11601f;
import mv.C11602g;
import nI.C17631a;
import nI.C17642l;
import nI.p;
import nI.q;
import r0.m;
import s0.C5834E;
import s0.C5850V;
import s0.C5852X;
import uK.C18146a;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a+\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0001¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u001d\u0010\n\u001a\u00020\u00042\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\bH\u0003¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lmv/g;", "uiState", "Lkotlin/Function1;", "Lmv/f;", "LXH/N;", "eventHandler", "e", "(Lmv/g;LnI/l;LU0/m;I)V", "Lkotlin/Function0;", "onClicked", "c", "(LnI/a;LU0/m;I)V", "liveshopping-implementation_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class d0 {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class a implements q<C5834E, C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C11602g f98839a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ C17642l<C11601f, C16807N> f98840b;

        a(C11602g gVar, C17642l<? super C11601f, C16807N> lVar) {
            this.f98839a = gVar;
            this.f98840b = lVar;
        }

        /* access modifiers changed from: private */
        public static final C16807N e(C17642l lVar) {
            lVar.invoke(C11601f.e.f99703a);
            return C16807N.f139792a;
        }

        /* access modifiers changed from: private */
        public static final C16807N f(C17642l lVar) {
            lVar.invoke(C11601f.a.f99699a);
            return C16807N.f139792a;
        }

        public final void c(C5834E e10, C4889m mVar, int i10) {
            C17542s.j(e10, "contentPadding");
            if ((i10 & 6) == 0) {
                i10 |= mVar.V(e10) ? 4 : 2;
            }
            if ((i10 & 19) != 18 || !mVar.l()) {
                if (C4895p.J()) {
                    C4895p.S(1108130726, i10, -1, "com.ingka.ikea.liveshopping.impl.presentation.compose.LiveShoppingScreen.<anonymous> (LiveShoppingScreen.kt:37)");
                }
                d.a aVar = d.f18749a;
                d f10 = J.f(D.h(aVar, e10), 0.0f, 1, (Object) null);
                C11602g gVar = this.f98839a;
                C17642l<C11601f, C16807N> lVar = this.f98840b;
                C5437c.a aVar2 = C5437c.f24302a;
                I h10 = C5077h.h(aVar2.o(), false);
                int a10 = C4883j.a(mVar, 0);
                C4912y s10 = mVar.s();
                d e11 = c.e(mVar, f10);
                C4504g.a aVar3 = C4504g.f6515W;
                C17631a<C4504g> a11 = aVar3.a();
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
                F1.c(a12, h10, aVar3.c());
                F1.c(a12, s10, aVar3.e());
                p<C4504g, Integer, C16807N> b10 = aVar3.b();
                if (a12.i() || !C17542s.e(a12.D(), Integer.valueOf(a10))) {
                    a12.u(Integer.valueOf(a10));
                    a12.w(Integer.valueOf(a10), b10);
                }
                F1.c(a12, e11, aVar3.d());
                C5079j jVar = C5079j.f18125a;
                int i11 = C17542s.e(b.b(mVar, 0).a().b(), C7787c.f50843c) ? 2 : 4;
                if (gVar instanceof C11602g.a) {
                    mVar.W(1051032283);
                    C11462G.m(((C11602g.a) gVar).a(), lVar, i11, C5116k1.a(aVar, "liveShoppingScreenContent"), mVar, 3072, 0);
                    mVar.P();
                } else if (C17542s.e(gVar, C11602g.b.f99705a)) {
                    mVar.W(1051042489);
                    mVar.W(1051044049);
                    boolean V10 = mVar.V(lVar);
                    Object D10 = mVar.D();
                    if (V10 || D10 == C4889m.f14007a.a()) {
                        D10 = new b0(lVar);
                        mVar.u(D10);
                    }
                    mVar.P();
                    C11479Y.b((C17631a) D10, jVar.a(C5116k1.a(aVar, "liveShoppingScreenError"), aVar2.e()), mVar, 0, 0);
                    mVar.P();
                } else if (C17542s.e(gVar, C11602g.c.f99706a)) {
                    mVar.W(1051054527);
                    j0.i(i11, C5116k1.a(aVar, "liveShoppingScreenLoading"), mVar, 48, 0);
                    mVar.P();
                } else {
                    mVar.W(1051030826);
                    mVar.P();
                    throw new t();
                }
                mVar.W(1051062312);
                boolean V11 = mVar.V(lVar);
                Object D11 = mVar.D();
                if (V11 || D11 == C4889m.f14007a.a()) {
                    D11 = new c0(lVar);
                    mVar.u(D11);
                }
                mVar.P();
                d0.c((C17631a) D11, mVar, 0);
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
            c((C5834E) obj, (C4889m) obj2, ((Number) obj3).intValue());
            return C16807N.f139792a;
        }
    }

    /* access modifiers changed from: private */
    public static final void c(C17631a<C16807N> aVar, C4889m mVar, int i10) {
        int i11;
        C4889m k10 = mVar.k(1876216976);
        if ((i10 & 6) == 0) {
            i11 = (k10.F(aVar) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i11 & 3) != 2 || !k10.l()) {
            if (C4895p.J()) {
                C4895p.S(1876216976, i11, -1, "com.ingka.ikea.liveshopping.impl.presentation.compose.BackButton (LiveShoppingScreen.kt:81)");
            }
            F0.b(C18146a.f148719y, j.b(Oo.b.f84632f, k10, 0), D.m(C5852X.e(d.f18749a), h.B((float) 16), h.B((float) 12), 0.0f, 0.0f, 12, (Object) null), false, H0.PrimaryInverse, G0.Small, (m) null, false, aVar, k10, ((i11 << 24) & 234881024) | 221184, 200);
            if (C4895p.J()) {
                C4895p.R();
            }
        } else {
            k10.L();
        }
        Y0 n10 = k10.n();
        if (n10 != null) {
            n10.a(new a0(aVar, i10));
        }
    }

    /* access modifiers changed from: private */
    public static final C16807N d(C17631a aVar, int i10, C4889m mVar, int i11) {
        c(aVar, mVar, M0.a(i10 | 1));
        return C16807N.f139792a;
    }

    public static final void e(C11602g gVar, C17642l<? super C11601f, C16807N> lVar, C4889m mVar, int i10) {
        int i11;
        C4889m mVar2;
        C11602g gVar2 = gVar;
        C17642l<? super C11601f, C16807N> lVar2 = lVar;
        int i12 = i10;
        C17542s.j(gVar2, "uiState");
        C17542s.j(lVar2, "eventHandler");
        C4889m k10 = mVar.k(2106814165);
        if ((i12 & 6) == 0) {
            i11 = ((i12 & 8) == 0 ? k10.V(gVar2) : k10.F(gVar2) ? 4 : 2) | i12;
        } else {
            i11 = i12;
        }
        if ((i12 & 48) == 0) {
            i11 |= k10.F(lVar2) ? 32 : 16;
        }
        if ((i11 & 19) != 18 || !k10.l()) {
            if (C4895p.J()) {
                C4895p.S(2106814165, i11, -1, "com.ingka.ikea.liveshopping.impl.presentation.compose.LiveShoppingScreen (LiveShoppingScreen.kt:33)");
            }
            mVar2 = k10;
            C4762x0.a((d) null, (p<? super C4889m, ? super Integer, C16807N>) null, (p<? super C4889m, ? super Integer, C16807N>) null, (p<? super C4889m, ? super Integer, C16807N>) null, (p<? super C4889m, ? super Integer, C16807N>) null, 0, 0, 0, C5850V.c(h.B((float) 0), 0.0f, 0.0f, 0.0f, 14, (Object) null), c1.c.e(1108130726, true, new a(gVar2, lVar2), k10, 54), mVar2, 805306368, 255);
            if (C4895p.J()) {
                C4895p.R();
            }
        } else {
            k10.L();
            mVar2 = k10;
        }
        Y0 n10 = mVar2.n();
        if (n10 != null) {
            n10.a(new C11480Z(gVar2, lVar2, i12));
        }
    }

    /* access modifiers changed from: private */
    public static final C16807N f(C11602g gVar, C17642l lVar, int i10, C4889m mVar, int i11) {
        e(gVar, lVar, mVar, M0.a(i10 | 1));
        return C16807N.f139792a;
    }
}
