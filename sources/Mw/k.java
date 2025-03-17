package mw;

import E1.C4478k;
import IC.C13023e;
import J1.e;
import J1.j;
import U0.C4889m;
import U0.C4895p;
import XH.C16807N;
import androidx.compose.ui.d;
import i1.C5437c;
import jw.b;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import n0.C5583F;
import nI.C17642l;
import nI.p;
import p1.C5749w0;
import tK.C18030v;
import uK.C18146a;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
public final class k {

    /* renamed from: a  reason: collision with root package name */
    public static final k f26276a = new k();

    /* renamed from: b  reason: collision with root package name */
    private static p<C4889m, Integer, C16807N> f26277b = c1.c.c(1465206111, false, a.f26280a);

    /* renamed from: c  reason: collision with root package name */
    private static p<C4889m, Integer, C16807N> f26278c = c1.c.c(1532021717, false, b.f26281a);

    /* renamed from: d  reason: collision with root package name */
    private static p<C4889m, Integer, C16807N> f26279d = c1.c.c(1496930035, false, c.f26282a);

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class a implements p<C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f26280a = new a();

        a() {
        }

        public final void a(C4889m mVar, int i10) {
            if ((i10 & 3) != 2 || !mVar.l()) {
                if (C4895p.J()) {
                    C4895p.S(1465206111, i10, -1, "com.ingka.ikea.messaging.impl.presentation.ComposableSingletons$CommercialMessageBannerKt.lambda-1.<anonymous> (CommercialMessageBanner.kt:147)");
                }
                C5583F.a(e.c(C18146a.f148097J2, mVar, 0), j.b(Oo.b.f84665i, mVar, 0), (d) null, (C5437c) null, (C4478k) null, 0.0f, C5749w0.a.b(C5749w0.f27365b, C18030v.f147664a.a(mVar, C18030v.f147665b).F0(), 0, 2, (Object) null), mVar, 0, 60);
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

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class b implements p<C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f26281a = new b();

        b() {
        }

        /* access modifiers changed from: private */
        public static final C16807N c(jw.a aVar) {
            C17542s.j(aVar, "it");
            return C16807N.f139792a;
        }

        public final void b(C4889m mVar, int i10) {
            if ((i10 & 3) != 2 || !mVar.l()) {
                if (C4895p.J()) {
                    C4895p.S(1532021717, i10, -1, "com.ingka.ikea.messaging.impl.presentation.ComposableSingletons$CommercialMessageBannerKt.lambda-2.<anonymous> (CommercialMessageBanner.kt:207)");
                }
                b.a aVar = new b.a("someId", cw.c.SALE, new C13023e.b("Get 30% off your next purchase using Shop & Go in store."), C18146a.f148481i3, "someLinkToSomewhere", false);
                mVar.W(268841660);
                Object D10 = mVar.D();
                if (D10 == C4889m.f14007a.a()) {
                    D10 = new l();
                    mVar.u(D10);
                }
                mVar.P();
                j.j(aVar, (C17642l) D10, mVar, C13023e.f110931a | 48);
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

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class c implements p<C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        public static final c f26282a = new c();

        c() {
        }

        /* access modifiers changed from: private */
        public static final C16807N c(jw.a aVar) {
            C17542s.j(aVar, "it");
            return C16807N.f139792a;
        }

        public final void b(C4889m mVar, int i10) {
            if ((i10 & 3) != 2 || !mVar.l()) {
                if (C4895p.J()) {
                    C4895p.S(1496930035, i10, -1, "com.ingka.ikea.messaging.impl.presentation.ComposableSingletons$CommercialMessageBannerKt.lambda-3.<anonymous> (CommercialMessageBanner.kt:228)");
                }
                b.a aVar = new b.a("anotherId", cw.c.SALE, new C13023e.b("Get 30% off your next purchase using Shop & Go in store."), C18146a.f148481i3, "someLinkToSomewhere", true);
                mVar.W(1776414813);
                Object D10 = mVar.D();
                if (D10 == C4889m.f14007a.a()) {
                    D10 = new m();
                    mVar.u(D10);
                }
                mVar.P();
                j.j(aVar, (C17642l) D10, mVar, C13023e.f110931a | 48);
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

    public final p<C4889m, Integer, C16807N> a() {
        return f26277b;
    }
}
