package Bm;

import A0.g;
import E1.I;
import G1.C4504g;
import LC.C13181e;
import Mm.e;
import Mm.f;
import T0.c;
import U0.C4883j;
import U0.C4889m;
import U0.C4895p;
import U0.C4912y;
import U0.F1;
import XH.C16807N;
import YH.C16877v;
import androidx.compose.foundation.layout.C5077h;
import androidx.compose.foundation.layout.C5079j;
import androidx.compose.foundation.layout.J;
import androidx.compose.ui.d;
import c2.h;
import c2.i;
import i1.C5437c;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import nI.C17631a;
import nI.p;
import nI.q;
import p1.i1;
import s0.C5857c;
import s0.C5858d;
import s0.C5859e;
import tK.C18030v;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f79262a = new a();

    /* renamed from: b  reason: collision with root package name */
    private static q<C5857c, C4889m, Integer, C16807N> f79263b = c1.c.c(-210946546, false, C1467a.f79266a);

    /* renamed from: c  reason: collision with root package name */
    private static q<C5859e, C4889m, Integer, C16807N> f79264c = c1.c.c(422143805, false, b.f79267a);

    /* renamed from: d  reason: collision with root package name */
    private static p<C4889m, Integer, C16807N> f79265d = c1.c.c(353493203, false, c.f79268a);

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Bm.a$a  reason: collision with other inner class name */
    static final class C1467a implements q<C5857c, C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        public static final C1467a f79266a = new C1467a();

        C1467a() {
        }

        public final void a(C5857c cVar, C4889m mVar, int i10) {
            C17542s.j(cVar, "$this$ImageWithLoading");
            if ((i10 & 17) != 16 || !mVar.l()) {
                if (C4895p.J()) {
                    C4895p.S(-210946546, i10, -1, "com.ingka.ikea.benefits.compose.ComposableSingletons$FeaturedBenefitContentKt.lambda-1.<anonymous> (FeaturedBenefitContent.kt:269)");
                }
                C13181e.f111832a.c((String) null, (d) null, C18030v.f147664a.a(mVar, C18030v.f147665b).G0(), mVar, (C13181e.f111833b << 9) | 6, 2);
                if (C4895p.J()) {
                    C4895p.R();
                    return;
                }
                return;
            }
            mVar.L();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            a((C5857c) obj, (C4889m) obj2, ((Number) obj3).intValue());
            return C16807N.f139792a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class b implements q<C5859e, C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f79267a = new b();

        b() {
        }

        /* access modifiers changed from: private */
        public static final C16807N e() {
            return C16807N.f139792a;
        }

        /* access modifiers changed from: private */
        public static final C16807N f() {
            return C16807N.f139792a;
        }

        public final void c(C5859e eVar, C4889m mVar, int i10) {
            int i11;
            C5859e eVar2 = eVar;
            C4889m mVar2 = mVar;
            C17542s.j(eVar2, "$this$BoxWithConstraints");
            if ((i10 & 6) == 0) {
                i11 = i10 | (mVar2.V(eVar2) ? 4 : 2);
            } else {
                i11 = i10;
            }
            if ((i11 & 19) != 18 || !mVar.l()) {
                if (C4895p.J()) {
                    C4895p.S(422143805, i11, -1, "com.ingka.ikea.benefits.compose.ComposableSingletons$FeaturedBenefitContentKt.lambda-2.<anonymous> (FeaturedBenefitContent.kt:398)");
                }
                int b10 = c.a.b(T0.c.f13501c, i.b(eVar.c(), eVar.d()), (Set) null, (Set) null, 6, (Object) null).b();
                d.a aVar = d.f18749a;
                C5437c.a aVar2 = C5437c.f24302a;
                float f10 = (float) 24;
                d c10 = androidx.compose.foundation.b.c(J.A(eVar2.a(aVar, aVar2.b()), 0.0f, h.B((float) 640), 1, (Object) null), C18030v.f147664a.a(mVar2, C18030v.f147665b).k0(), g.g(h.B(f10), h.B(f10), 0.0f, 0.0f, 12, (Object) null));
                I h10 = C5077h.h(aVar2.o(), false);
                int a10 = C4883j.a(mVar2, 0);
                C4912y s10 = mVar.s();
                d e10 = androidx.compose.ui.c.e(mVar2, c10);
                C4504g.a aVar3 = C4504g.f6515W;
                C17631a<C4504g> a11 = aVar3.a();
                if (mVar.m() == null) {
                    C4883j.c();
                }
                mVar.I();
                if (mVar.i()) {
                    mVar2.p(a11);
                } else {
                    mVar.t();
                }
                C4889m a12 = F1.a(mVar);
                F1.c(a12, h10, aVar3.c());
                F1.c(a12, s10, aVar3.e());
                p<C4504g, Integer, C16807N> b11 = aVar3.b();
                if (a12.i() || !C17542s.e(a12.D(), Integer.valueOf(a10))) {
                    a12.u(Integer.valueOf(a10));
                    a12.w(Integer.valueOf(a10), b11);
                }
                F1.c(a12, e10, aVar3.d());
                C5079j jVar = C5079j.f18125a;
                Mm.a aVar4 = new Mm.a("2", "", Mm.c.INSTANT_BENEFIT, "Free hot drink", "The next time you're in store, pick up a hot cup of tea or coffee. It’s on the house.", "Relax with a free hot drink. Monday to Friday.", C16877v.e(new e(f.IMAGE, "https://shop.static.ingka.ikea.com/membership/guest/track_order.png")), new Mm.h("calendar", ""), (Mm.b) null);
                mVar2.W(-867540652);
                Object D10 = mVar.D();
                C4889m.a aVar5 = C4889m.f14007a;
                if (D10 == aVar5.a()) {
                    D10 = new b();
                    mVar2.u(D10);
                }
                C17631a aVar6 = (C17631a) D10;
                mVar.P();
                mVar2.W(-867536332);
                Object D11 = mVar.D();
                if (D11 == aVar5.a()) {
                    D11 = new c();
                    mVar2.u(D11);
                }
                mVar.P();
                o.D(aVar4, "IKEA Family benefit", "Got it", b10, aVar6, (C17631a) D11, (d) null, mVar, 221616, 64);
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
            c((C5859e) obj, (C4889m) obj2, ((Number) obj3).intValue());
            return C16807N.f139792a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class c implements p<C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        public static final c f79268a = new c();

        c() {
        }

        public final void a(C4889m mVar, int i10) {
            if ((i10 & 3) != 2 || !mVar.l()) {
                if (C4895p.J()) {
                    C4895p.S(353493203, i10, -1, "com.ingka.ikea.benefits.compose.ComposableSingletons$FeaturedBenefitContentKt.lambda-3.<anonymous> (FeaturedBenefitContent.kt:393)");
                }
                C5858d.a(androidx.compose.foundation.b.d(J.f(d.f18749a, 0.0f, 1, (Object) null), C18030v.f147664a.a(mVar, C18030v.f147665b).m0(), (i1) null, 2, (Object) null), (C5437c) null, false, a.f79262a.b(), mVar, 3072, 6);
                if (C4895p.J()) {
                    C4895p.R();
                    return;
                }
                return;
            }
            mVar.L();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((C4889m) obj, ((Number) obj2).intValue());
            return C16807N.f139792a;
        }
    }

    public final q<C5857c, C4889m, Integer, C16807N> a() {
        return f79263b;
    }

    public final q<C5859e, C4889m, Integer, C16807N> b() {
        return f79264c;
    }
}
