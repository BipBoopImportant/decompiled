package Iu;

import Hu.a;
import SC.C13616n0;
import SC.C13620o0;
import SC.C13624p0;
import U0.C4889m;
import U0.C4895p;
import XH.C16807N;
import androidx.compose.foundation.layout.D;
import androidx.compose.ui.d;
import c1.c;
import com.ingka.ikea.core.model.Media;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nI.C17631a;
import nI.p;
import nI.q;
import tK.C18029u;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f82472a = new a();

    /* renamed from: b  reason: collision with root package name */
    private static q<String, C4889m, Integer, C16807N> f82473b = c.c(-2072369830, false, C1619a.f82475a);

    /* renamed from: c  reason: collision with root package name */
    private static p<C4889m, Integer, C16807N> f82474c = c.c(-2115198631, false, b.f82476a);

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Iu.a$a  reason: collision with other inner class name */
    static final class C1619a implements q<String, C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        public static final C1619a f82475a = new C1619a();

        C1619a() {
        }

        public final void a(String str, C4889m mVar, int i10) {
            int i11;
            String str2 = str;
            C17542s.j(str, "it");
            C4889m mVar2 = mVar;
            if ((i10 & 6) == 0) {
                i11 = i10 | (mVar.V(str) ? 4 : 2);
            } else {
                i11 = i10;
            }
            if ((i11 & 19) != 18 || !mVar.l()) {
                if (C4895p.J()) {
                    C4895p.S(-2072369830, i11, -1, "com.ingka.ikea.instore.wayfinding.impl.onboarding.ui.ComposableSingletons$OnboardingContentKt.lambda-1.<anonymous> (OnboardingContent.kt:89)");
                }
                d.a aVar = d.f18749a;
                C18029u uVar = C18029u.f147649a;
                C13616n0.b(str, C13620o0.NewLowerPrice, D.m(aVar, 0.0f, uVar.e(), 0.0f, uVar.j(), 5, (Object) null), C13624p0.Emphasised, mVar, (i11 & 14) | 3120, 0);
                if (C4895p.J()) {
                    C4895p.R();
                    return;
                }
                return;
            }
            mVar.L();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            a((String) obj, (C4889m) obj2, ((Number) obj3).intValue());
            return C16807N.f139792a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class b implements p<C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f82476a = new b();

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

        public final void c(C4889m mVar, int i10) {
            if ((i10 & 3) != 2 || !mVar.l()) {
                if (C4895p.J()) {
                    C4895p.S(-2115198631, i10, -1, "com.ingka.ikea.instore.wayfinding.impl.onboarding.ui.ComposableSingletons$OnboardingContentKt.lambda-2.<anonymous> (OnboardingContent.kt:108)");
                }
                a.C1600a aVar = new a.C1600a((Media.Image) null, 1, (DefaultConstructorMarker) null);
                mVar.W(1281453699);
                Object D10 = mVar.D();
                C4889m.a aVar2 = C4889m.f14007a;
                if (D10 == aVar2.a()) {
                    D10 = new b();
                    mVar.u(D10);
                }
                C17631a aVar3 = (C17631a) D10;
                mVar.P();
                mVar.W(1281454787);
                Object D11 = mVar.D();
                if (D11 == aVar2.a()) {
                    D11 = new c();
                    mVar.u(D11);
                }
                mVar.P();
                h.e(aVar, aVar3, (C17631a) D11, mVar, 432);
                if (C4895p.J()) {
                    C4895p.R();
                    return;
                }
                return;
            }
            mVar.L();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            c((C4889m) obj, ((Number) obj2).intValue());
            return C16807N.f139792a;
        }
    }

    public final q<String, C4889m, Integer, C16807N> a() {
        return f82473b;
    }
}
