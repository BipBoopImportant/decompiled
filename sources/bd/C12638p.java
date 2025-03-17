package BD;

import GD.C12935h;
import GD.k;
import SC.C13575d;
import U0.C4889m;
import U0.C4895p;
import U0.C4899r0;
import U0.o1;
import XH.C16807N;
import androidx.compose.foundation.layout.C5077h;
import androidx.compose.foundation.layout.D;
import androidx.compose.foundation.layout.J;
import androidx.compose.ui.d;
import c2.h;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import nI.C17631a;
import nI.C17642l;
import nI.p;
import nI.q;
import p0.v;
import p1.i1;
import s0.C5857c;
import vD.C15133a;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* renamed from: BD.p  reason: case insensitive filesystem */
public final class C12638p {

    /* renamed from: a  reason: collision with root package name */
    public static final C12638p f108029a = new C12638p();

    /* renamed from: b  reason: collision with root package name */
    private static q<C5857c, C4889m, Integer, C16807N> f108030b = c1.c.c(1908790973, false, a.f108033a);

    /* renamed from: c  reason: collision with root package name */
    private static p<C4889m, Integer, C16807N> f108031c = c1.c.c(-1844165165, false, b.f108034a);

    /* renamed from: d  reason: collision with root package name */
    private static p<C4889m, Integer, C16807N> f108032d = c1.c.c(543888601, false, c.f108035a);

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: BD.p$a */
    static final class a implements q<C5857c, C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f108033a = new a();

        a() {
        }

        public final void a(C5857c cVar, C4889m mVar, int i10) {
            C17542s.j(cVar, "$this$ImageWithLoading");
            if ((i10 & 17) != 16 || !mVar.l()) {
                if (C4895p.J()) {
                    C4895p.S(1908790973, i10, -1, "com.ingka.ikea.wallet.impl.compose.card.prepaid.ComposableSingletons$GiftCardKt.lambda-1.<anonymous> (GiftCard.kt:161)");
                }
                C5077h.a(androidx.compose.foundation.b.d(J.f(d.f18749a, 0.0f, 1, (Object) null), C13575d.a(mVar, 0).m0(), (i1) null, 2, (Object) null), mVar, 0);
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
    /* renamed from: BD.p$b */
    static final class b implements p<C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f108034a = new b();

        b() {
        }

        private static final boolean f(C4899r0<Boolean> r0Var) {
            return r0Var.getValue().booleanValue();
        }

        private static final void h(C4899r0<Boolean> r0Var, boolean z10) {
            r0Var.setValue(Boolean.valueOf(z10));
        }

        /* access modifiers changed from: private */
        public static final C16807N i(C4899r0 r0Var) {
            h(r0Var, !f(r0Var));
            return C16807N.f139792a;
        }

        /* access modifiers changed from: private */
        public static final C16807N j(C12935h hVar) {
            C17542s.j(hVar, "it");
            return C16807N.f139792a;
        }

        /* access modifiers changed from: private */
        public static final C16807N k(boolean z10) {
            return C16807N.f139792a;
        }

        public final void e(C4889m mVar, int i10) {
            if ((i10 & 3) != 2 || !mVar.l()) {
                if (C4895p.J()) {
                    C4895p.S(-1844165165, i10, -1, "com.ingka.ikea.wallet.impl.compose.card.prepaid.ComposableSingletons$GiftCardKt.lambda-2.<anonymous> (GiftCard.kt:233)");
                }
                mVar.W(1922152318);
                Object D10 = mVar.D();
                C4889m.a aVar = C4889m.f14007a;
                if (D10 == aVar.a()) {
                    D10 = u1.e(Boolean.FALSE, (o1) null, 2, (Object) null);
                    mVar.u(D10);
                }
                C4899r0 r0Var = (C4899r0) D10;
                mVar.P();
                v vVar = v.Vertical;
                boolean f10 = f(r0Var);
                k.b.c a10 = C15133a.f131425a.a();
                d i11 = D.i(d.f18749a, h.B((float) 32));
                mVar.W(1922159296);
                Object D11 = mVar.D();
                if (D11 == aVar.a()) {
                    D11 = new C12639q(r0Var);
                    mVar.u(D11);
                }
                C17631a aVar2 = (C17631a) D11;
                mVar.P();
                mVar.W(1922161183);
                Object D12 = mVar.D();
                if (D12 == aVar.a()) {
                    D12 = new r();
                    mVar.u(D12);
                }
                C17642l lVar = (C17642l) D12;
                mVar.P();
                mVar.W(1922162431);
                Object D13 = mVar.D();
                if (D13 == aVar.a()) {
                    D13 = new C12640s();
                    mVar.u(D13);
                }
                mVar.P();
                G.e(a10, vVar, f10, aVar2, lVar, (C17642l) D13, i11, false, mVar, 1797168, 128);
                if (C4895p.J()) {
                    C4895p.R();
                    return;
                }
                return;
            }
            mVar.L();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            e((C4889m) obj, ((Number) obj2).intValue());
            return C16807N.f139792a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: BD.p$c */
    static final class c implements p<C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        public static final c f108035a = new c();

        c() {
        }

        private static final boolean f(C4899r0<Boolean> r0Var) {
            return r0Var.getValue().booleanValue();
        }

        private static final void h(C4899r0<Boolean> r0Var, boolean z10) {
            r0Var.setValue(Boolean.valueOf(z10));
        }

        /* access modifiers changed from: private */
        public static final C16807N i(C4899r0 r0Var) {
            h(r0Var, !f(r0Var));
            return C16807N.f139792a;
        }

        /* access modifiers changed from: private */
        public static final C16807N j(C12935h hVar) {
            C17542s.j(hVar, "it");
            return C16807N.f139792a;
        }

        /* access modifiers changed from: private */
        public static final C16807N k(boolean z10) {
            return C16807N.f139792a;
        }

        public final void e(C4889m mVar, int i10) {
            if ((i10 & 3) != 2 || !mVar.l()) {
                if (C4895p.J()) {
                    C4895p.S(543888601, i10, -1, "com.ingka.ikea.wallet.impl.compose.card.prepaid.ComposableSingletons$GiftCardKt.lambda-3.<anonymous> (GiftCard.kt:251)");
                }
                mVar.W(-865245281);
                Object D10 = mVar.D();
                C4889m.a aVar = C4889m.f14007a;
                if (D10 == aVar.a()) {
                    D10 = u1.e(Boolean.FALSE, (o1) null, 2, (Object) null);
                    mVar.u(D10);
                }
                C4899r0 r0Var = (C4899r0) D10;
                mVar.P();
                v vVar = v.Horizontal;
                boolean f10 = f(r0Var);
                k.b.c a10 = C15133a.f131425a.a();
                d i11 = D.i(J.f(d.f18749a, 0.0f, 1, (Object) null), h.B((float) 32));
                mVar.W(-865238239);
                Object D11 = mVar.D();
                if (D11 == aVar.a()) {
                    D11 = new C12641t(r0Var);
                    mVar.u(D11);
                }
                C17631a aVar2 = (C17631a) D11;
                mVar.P();
                mVar.W(-865236352);
                Object D12 = mVar.D();
                if (D12 == aVar.a()) {
                    D12 = new C12642u();
                    mVar.u(D12);
                }
                C17642l lVar = (C17642l) D12;
                mVar.P();
                mVar.W(-865235104);
                Object D13 = mVar.D();
                if (D13 == aVar.a()) {
                    D13 = new C12643v();
                    mVar.u(D13);
                }
                mVar.P();
                G.e(a10, vVar, f10, aVar2, lVar, (C17642l) D13, i11, false, mVar, 1797168, 128);
                if (C4895p.J()) {
                    C4895p.R();
                    return;
                }
                return;
            }
            mVar.L();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            e((C4889m) obj, ((Number) obj2).intValue());
            return C16807N.f139792a;
        }
    }

    public final q<C5857c, C4889m, Integer, C16807N> a() {
        return f108030b;
    }
}
