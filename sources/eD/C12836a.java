package ED;

import GD.C12935h;
import GD.k;
import U0.C4889m;
import U0.C4895p;
import XH.C16807N;
import androidx.compose.foundation.layout.D;
import androidx.compose.foundation.layout.J;
import androidx.compose.ui.d;
import c2.h;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import nI.C17642l;
import nI.p;
import nI.q;
import p0.v;
import s0.C5857c;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* renamed from: ED.a  reason: case insensitive filesystem */
public final class C12836a {

    /* renamed from: a  reason: collision with root package name */
    public static final C12836a f109384a = new C12836a();

    /* renamed from: b  reason: collision with root package name */
    private static q<C5857c, C4889m, Integer, C16807N> f109385b = c1.c.c(853874274, false, C2614a.f109388a);

    /* renamed from: c  reason: collision with root package name */
    private static p<C4889m, Integer, C16807N> f109386c = c1.c.c(784378697, false, b.f109389a);

    /* renamed from: d  reason: collision with root package name */
    private static p<C4889m, Integer, C16807N> f109387d = c1.c.c(1209755345, false, c.f109390a);

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: ED.a$a  reason: collision with other inner class name */
    static final class C2614a implements q<C5857c, C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        public static final C2614a f109388a = new C2614a();

        C2614a() {
        }

        public final void a(C5857c cVar, C4889m mVar, int i10) {
            C17542s.j(cVar, "$this$FlippableCard");
            if ((i10 & 17) != 16 || !mVar.l()) {
                if (C4895p.J()) {
                    C4895p.S(853874274, i10, -1, "com.ingka.ikea.wallet.impl.compose.card.upgrade.ComposableSingletons$UpgradeCardKt.lambda-1.<anonymous> (UpgradeCard.kt:60)");
                }
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
    /* renamed from: ED.a$b */
    static final class b implements p<C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f109389a = new b();

        b() {
        }

        /* access modifiers changed from: private */
        public static final C16807N c(C12935h hVar) {
            C17542s.j(hVar, "it");
            return C16807N.f139792a;
        }

        public final void b(C4889m mVar, int i10) {
            if ((i10 & 3) != 2 || !mVar.l()) {
                if (C4895p.J()) {
                    C4895p.S(784378697, i10, -1, "com.ingka.ikea.wallet.impl.compose.card.upgrade.ComposableSingletons$UpgradeCardKt.lambda-2.<anonymous> (UpgradeCard.kt:165)");
                }
                k.d dVar = k.d.f110442a;
                v vVar = v.Vertical;
                mVar.W(923817608);
                Object D10 = mVar.D();
                if (D10 == C4889m.f14007a.a()) {
                    D10 = new C12837b();
                    mVar.u(D10);
                }
                mVar.P();
                C12845j.f(dVar, vVar, (C17642l) D10, D.i(d.f18749a, h.B((float) 32)), mVar, 3510, 0);
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
    /* renamed from: ED.a$c */
    static final class c implements p<C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        public static final c f109390a = new c();

        c() {
        }

        /* access modifiers changed from: private */
        public static final C16807N c(C12935h hVar) {
            C17542s.j(hVar, "it");
            return C16807N.f139792a;
        }

        public final void b(C4889m mVar, int i10) {
            if ((i10 & 3) != 2 || !mVar.l()) {
                if (C4895p.J()) {
                    C4895p.S(1209755345, i10, -1, "com.ingka.ikea.wallet.impl.compose.card.upgrade.ComposableSingletons$UpgradeCardKt.lambda-3.<anonymous> (UpgradeCard.kt:179)");
                }
                k.d dVar = k.d.f110442a;
                v vVar = v.Horizontal;
                mVar.W(-1863586743);
                Object D10 = mVar.D();
                if (D10 == C4889m.f14007a.a()) {
                    D10 = new C12838c();
                    mVar.u(D10);
                }
                mVar.P();
                C12845j.f(dVar, vVar, (C17642l) D10, D.i(J.f(d.f18749a, 0.0f, 1, (Object) null), h.B((float) 32)), mVar, 3510, 0);
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

    public final q<C5857c, C4889m, Integer, C16807N> a() {
        return f109385b;
    }
}
