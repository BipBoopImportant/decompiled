package NC;

import A0.g;
import E1.I;
import G1.C4504g;
import KJ.C15985a;
import KJ.C15990f;
import NC.C13275d;
import SC.H0;
import U0.C4883j;
import U0.C4889m;
import U0.C4895p;
import U0.C4912y;
import U0.F1;
import XH.C16807N;
import androidx.compose.foundation.b;
import androidx.compose.foundation.layout.C5073d;
import androidx.compose.foundation.layout.G;
import androidx.compose.ui.d;
import androidx.compose.ui.platform.C5116k1;
import c1.c;
import i1.C5437c;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import l0.e;
import nI.C17631a;
import nI.p;
import nI.q;
import s0.C5843N;
import s0.C5844O;
import tK.C18030v;
import uK.C18146a;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* renamed from: NC.b  reason: case insensitive filesystem */
public final class C13273b {

    /* renamed from: a  reason: collision with root package name */
    public static final C13273b f112387a = new C13273b();

    /* renamed from: b  reason: collision with root package name */
    private static q<e, C4889m, Integer, C16807N> f112388b = c.c(-418969523, false, a.f112390a);

    /* renamed from: c  reason: collision with root package name */
    private static p<C4889m, Integer, C16807N> f112389c = c.c(1316587356, false, C2762b.f112391a);

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: NC.b$a */
    static final class a implements q<e, C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f112390a = new a();

        a() {
        }

        public final void a(e eVar, C4889m mVar, int i10) {
            C17542s.j(eVar, "$this$AnimatedVisibility");
            if (C4895p.J()) {
                C4895p.S(-418969523, i10, -1, "com.ingka.ikea.ui.overflowmenu.ComposableSingletons$OverflowMenuKt.lambda-1.<anonymous> (OverflowMenu.kt:162)");
            }
            C5844O.a(b.c(C5116k1.a(d.f18749a, "MENU_BADGE"), C18030v.f147664a.a(mVar, C18030v.f147665b).v0(), g.h()), mVar, 0);
            if (C4895p.J()) {
                C4895p.R();
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            a((e) obj, (C4889m) obj2, ((Number) obj3).intValue());
            return C16807N.f139792a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: NC.b$b  reason: collision with other inner class name */
    static final class C2762b implements p<C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        public static final C2762b f112391a = new C2762b();

        C2762b() {
        }

        /* access modifiers changed from: private */
        public static final C16807N c() {
            return C16807N.f139792a;
        }

        public final void b(C4889m mVar, int i10) {
            if ((i10 & 3) != 2 || !mVar.l()) {
                if (C4895p.J()) {
                    C4895p.S(1316587356, i10, -1, "com.ingka.ikea.ui.overflowmenu.ComposableSingletons$OverflowMenuKt.lambda-2.<anonymous> (OverflowMenu.kt:214)");
                }
                d.a aVar = d.f18749a;
                I b10 = G.b(C5073d.f18068a.f(), C5437c.f24302a.l(), mVar, 0);
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
                F1.c(a12, b10, aVar2.c());
                F1.c(a12, s10, aVar2.e());
                p<C4504g, Integer, C16807N> b11 = aVar2.b();
                if (a12.i() || !C17542s.e(a12.D(), Integer.valueOf(a10))) {
                    a12.u(Integer.valueOf(a10));
                    a12.w(Integer.valueOf(a10), b11);
                }
                F1.c(a12, e10, aVar2.d());
                C5843N n10 = C5843N.f28726a;
                C15990f a13 = C15985a.a();
                mVar.W(-399139583);
                Object D10 = mVar.D();
                if (D10 == C4889m.f14007a.a()) {
                    D10 = new C13274c();
                    mVar.u(D10);
                }
                mVar.P();
                k.j(C15985a.b(new C13275d.a((C17631a) D10, false, C18146a.f148311X6, "Map", (H0) null, false, 50, (DefaultConstructorMarker) null)), a13, new C13275d.b(C18146a.f148098J3, false, "More", (H0) null, 10, (DefaultConstructorMarker) null), mVar, 48);
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
            b((C4889m) obj, ((Number) obj2).intValue());
            return C16807N.f139792a;
        }
    }

    public final q<e, C4889m, Integer, C16807N> a() {
        return f112388b;
    }
}
