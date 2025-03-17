package Eh;

import Gh.a;
import U0.C4889m;
import U0.C4895p;
import XH.C16807N;
import androidx.compose.ui.d;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import l0.C5507b;
import nI.C17631a;
import nI.p;
import nI.r;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* renamed from: Eh.a  reason: case insensitive filesystem */
public final class C9079a {

    /* renamed from: a  reason: collision with root package name */
    public static final C9079a f60284a = new C9079a();

    /* renamed from: b  reason: collision with root package name */
    private static r<C5507b, Gh.b, C4889m, Integer, C16807N> f60285b = c1.c.c(1171377354, false, C0986a.f60288a);

    /* renamed from: c  reason: collision with root package name */
    private static p<C4889m, Integer, C16807N> f60286c = c1.c.c(148780849, false, b.f60289a);

    /* renamed from: d  reason: collision with root package name */
    private static p<C4889m, Integer, C16807N> f60287d = c1.c.c(265015531, false, c.f60290a);

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Eh.a$a  reason: collision with other inner class name */
    static final class C0986a implements r<C5507b, Gh.b, C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        public static final C0986a f60288a = new C0986a();

        C0986a() {
        }

        public final void a(C5507b bVar, Gh.b bVar2, C4889m mVar, int i10) {
            C17542s.j(bVar, "$this$AnimatedContent");
            C17542s.j(bVar2, "it");
            if (C4895p.J()) {
                C4895p.S(1171377354, i10, -1, "com.ingka.ikea.app.onboarding.gallery.compose.ComposableSingletons$OnboardingFeatureDetailsKt.lambda-1.<anonymous> (OnboardingFeatureDetails.kt:194)");
            }
            p.l(bVar2.b(), bVar2.f(), (d) null, mVar, 0, 4);
            if (C4895p.J()) {
                C4895p.R();
            }
        }

        public /* bridge */ /* synthetic */ Object l(Object obj, Object obj2, Object obj3, Object obj4) {
            a((C5507b) obj, (Gh.b) obj2, (C4889m) obj3, ((Number) obj4).intValue());
            return C16807N.f139792a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Eh.a$b */
    static final class b implements p<C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f60289a = new b();

        b() {
        }

        /* access modifiers changed from: private */
        public static final C16807N c() {
            return C16807N.f139792a;
        }

        public final void b(C4889m mVar, int i10) {
            if ((i10 & 3) != 2 || !mVar.l()) {
                if (C4895p.J()) {
                    C4895p.S(148780849, i10, -1, "com.ingka.ikea.app.onboarding.gallery.compose.ComposableSingletons$OnboardingFeatureDetailsKt.lambda-2.<anonymous> (OnboardingFeatureDetails.kt:285)");
                }
                int f10 = T0.d.f13504b.f();
                Gh.b bVar = new Gh.b(6000, a.HALF_PILL, "Find the latest deals for IKEA Family members", "Offers", "id", (Gh.d) null, new Gh.c("someUrl"), 32, (DefaultConstructorMarker) null);
                mVar.W(2122075181);
                Object D10 = mVar.D();
                if (D10 == C4889m.f14007a.a()) {
                    D10 = new C9080b();
                    mVar.u(D10);
                }
                mVar.P();
                p.B(f10, bVar, (C17631a) D10, (d) null, mVar, 384, 8);
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
    /* renamed from: Eh.a$c */
    static final class c implements p<C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        public static final c f60290a = new c();

        c() {
        }

        /* access modifiers changed from: private */
        public static final C16807N c() {
            return C16807N.f139792a;
        }

        public final void b(C4889m mVar, int i10) {
            if ((i10 & 3) != 2 || !mVar.l()) {
                if (C4895p.J()) {
                    C4895p.S(265015531, i10, -1, "com.ingka.ikea.app.onboarding.gallery.compose.ComposableSingletons$OnboardingFeatureDetailsKt.lambda-3.<anonymous> (OnboardingFeatureDetails.kt:305)");
                }
                int d10 = T0.d.f13504b.d();
                Gh.b bVar = new Gh.b(6000, a.HALF_PILL, "Find the latest deals for IKEA Family members", "Offers", "id", (Gh.d) null, new Gh.c("someUrl"), 32, (DefaultConstructorMarker) null);
                mVar.W(-665320466);
                Object D10 = mVar.D();
                if (D10 == C4889m.f14007a.a()) {
                    D10 = new c();
                    mVar.u(D10);
                }
                mVar.P();
                p.B(d10, bVar, (C17631a) D10, (d) null, mVar, 384, 8);
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

    public final r<C5507b, Gh.b, C4889m, Integer, C16807N> a() {
        return f60285b;
    }
}
