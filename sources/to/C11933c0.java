package to;

import E1.I;
import G1.C4504g;
import U0.C4883j;
import U0.C4889m;
import U0.C4895p;
import U0.C4912y;
import U0.F1;
import XH.C16807N;
import androidx.compose.foundation.layout.C5073d;
import androidx.compose.foundation.layout.C5080k;
import androidx.compose.foundation.layout.D;
import androidx.compose.ui.d;
import c2.h;
import i1.C5437c;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import nI.C17631a;
import nI.C17642l;
import nI.p;
import nI.q;
import s0.C5862h;
import to.C0;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* renamed from: to.c0  reason: case insensitive filesystem */
public final class C11933c0 {

    /* renamed from: a  reason: collision with root package name */
    public static final C11933c0 f103096a = new C11933c0();

    /* renamed from: b  reason: collision with root package name */
    private static q<C0.c, C4889m, Integer, C16807N> f103097b = c1.c.c(-49016970, false, a.f103100a);

    /* renamed from: c  reason: collision with root package name */
    private static q<C0.a, C4889m, Integer, C16807N> f103098c = c1.c.c(-2108336623, false, b.f103101a);

    /* renamed from: d  reason: collision with root package name */
    private static p<C4889m, Integer, C16807N> f103099d = c1.c.c(140048623, false, c.f103102a);

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: to.c0$a */
    static final class a implements q<C0.c, C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f103100a = new a();

        a() {
        }

        public final void a(C0.c cVar, C4889m mVar, int i10) {
            C17542s.j(cVar, "item");
            if ((i10 & 6) == 0) {
                i10 |= mVar.V(cVar) ? 4 : 2;
            }
            if ((i10 & 19) != 18 || !mVar.l()) {
                if (C4895p.J()) {
                    C4895p.S(-49016970, i10, -1, "com.ingka.ikea.checkout.impl.presentation.compose.ComposableSingletons$TaxRequirementsSectionKt.lambda-1.<anonymous> (TaxRequirementsSection.kt:257)");
                }
                i1.N(cVar.f(), mVar, 0);
                if (C4895p.J()) {
                    C4895p.R();
                    return;
                }
                return;
            }
            mVar.L();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            a((C0.c) obj, (C4889m) obj2, ((Number) obj3).intValue());
            return C16807N.f139792a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: to.c0$b */
    static final class b implements q<C0.a, C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f103101a = new b();

        b() {
        }

        public final void a(C0.a aVar, C4889m mVar, int i10) {
            C17542s.j(aVar, "item");
            if ((i10 & 6) == 0) {
                i10 |= mVar.V(aVar) ? 4 : 2;
            }
            if ((i10 & 19) != 18 || !mVar.l()) {
                if (C4895p.J()) {
                    C4895p.S(-2108336623, i10, -1, "com.ingka.ikea.checkout.impl.presentation.compose.ComposableSingletons$TaxRequirementsSectionKt.lambda-2.<anonymous> (TaxRequirementsSection.kt:347)");
                }
                i1.N(aVar.g(), mVar, 0);
                if (C4895p.J()) {
                    C4895p.R();
                    return;
                }
                return;
            }
            mVar.L();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            a((C0.a) obj, (C4889m) obj2, ((Number) obj3).intValue());
            return C16807N.f139792a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: to.c0$c */
    static final class c implements p<C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        public static final c f103102a = new c();

        c() {
        }

        /* access modifiers changed from: private */
        public static final C16807N c(F0 f02) {
            C17542s.j(f02, "it");
            return C16807N.f139792a;
        }

        public final void b(C4889m mVar, int i10) {
            if ((i10 & 3) != 2 || !mVar.l()) {
                if (C4895p.J()) {
                    C4895p.S(140048623, i10, -1, "com.ingka.ikea.checkout.impl.presentation.compose.ComposableSingletons$TaxRequirementsSectionKt.lambda-3.<anonymous> (TaxRequirementsSection.kt:386)");
                }
                d j10 = D.j(d.f18749a, h.B((float) 24), h.B((float) 12));
                I a10 = C5080k.a(C5073d.f18068a.g(), C5437c.f24302a.k(), mVar, 0);
                int a11 = C4883j.a(mVar, 0);
                C4912y s10 = mVar.s();
                d e10 = androidx.compose.ui.c.e(mVar, j10);
                C4504g.a aVar = C4504g.f6515W;
                C17631a<C4504g> a12 = aVar.a();
                if (mVar.m() == null) {
                    C4883j.c();
                }
                mVar.I();
                if (mVar.i()) {
                    mVar.p(a12);
                } else {
                    mVar.t();
                }
                C4889m a13 = F1.a(mVar);
                F1.c(a13, a10, aVar.c());
                F1.c(a13, s10, aVar.e());
                p<C4504g, Integer, C16807N> b10 = aVar.b();
                if (a13.i() || !C17542s.e(a13.D(), Integer.valueOf(a11))) {
                    a13.u(Integer.valueOf(a11));
                    a13.w(Integer.valueOf(a11), b10);
                }
                F1.c(a13, e10, aVar.d());
                C5862h hVar = C5862h.f28810a;
                C0 h10 = C11976y0.f103268a.h();
                mVar.W(650503126);
                Object D10 = mVar.D();
                if (D10 == C4889m.f14007a.a()) {
                    D10 = new C11935d0();
                    mVar.u(D10);
                }
                mVar.P();
                i1.Y(h10, (C17642l) D10, (d) null, mVar, 48, 4);
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

    public final q<C0.c, C4889m, Integer, C16807N> a() {
        return f103097b;
    }

    public final q<C0.a, C4889m, Integer, C16807N> b() {
        return f103098c;
    }
}
