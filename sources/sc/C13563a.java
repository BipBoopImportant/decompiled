package SC;

import E1.I;
import G1.C4504g;
import O0.H0;
import U0.C4883j;
import U0.C4889m;
import U0.C4895p;
import U0.C4912y;
import U0.F1;
import XH.C16807N;
import androidx.compose.foundation.layout.C5073d;
import androidx.compose.foundation.layout.C5080k;
import androidx.compose.ui.d;
import c1.c;
import i1.C5437c;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import nI.C17631a;
import nI.p;
import nI.r;
import s0.C5862h;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* renamed from: SC.a  reason: case insensitive filesystem */
public final class C13563a {

    /* renamed from: a  reason: collision with root package name */
    public static final C13563a f116101a = new C13563a();

    /* renamed from: b  reason: collision with root package name */
    private static r<H0, p<? super C4889m, ? super Integer, C16807N>, C4889m, Integer, C16807N> f116102b = c.c(1798097957, false, C2845a.f116104a);

    /* renamed from: c  reason: collision with root package name */
    private static p<C4889m, Integer, C16807N> f116103c = c.c(-1155957681, false, b.f116105a);

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: SC.a$a  reason: collision with other inner class name */
    static final class C2845a implements r<H0, p<? super C4889m, ? super Integer, ? extends C16807N>, C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        public static final C2845a f116104a = new C2845a();

        C2845a() {
        }

        public final void a(H0 h02, p<? super C4889m, ? super Integer, C16807N> pVar, C4889m mVar, int i10) {
            C17542s.j(h02, "$unused$var$");
            C17542s.j(pVar, "defaultSnackbar");
            if ((i10 & 48) == 0) {
                i10 |= mVar.F(pVar) ? 32 : 16;
            }
            if ((i10 & 145) != 144 || !mVar.l()) {
                if (C4895p.J()) {
                    C4895p.S(1798097957, i10, -1, "com.ingka.ikea.ui.skapa.ComposableSingletons$SkapaToastSnackbarKt.lambda-1.<anonymous> (SkapaToastSnackbar.kt:59)");
                }
                pVar.invoke(mVar, Integer.valueOf((i10 >> 3) & 14));
                if (C4895p.J()) {
                    C4895p.R();
                    return;
                }
                return;
            }
            mVar.L();
        }

        public /* bridge */ /* synthetic */ Object l(Object obj, Object obj2, Object obj3, Object obj4) {
            a((H0) obj, (p) obj2, (C4889m) obj3, ((Number) obj4).intValue());
            return C16807N.f139792a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: SC.a$b */
    static final class b implements p<C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f116105a = new b();

        b() {
        }

        /* access modifiers changed from: private */
        public static final C16807N c() {
            return C16807N.f139792a;
        }

        public final void b(C4889m mVar, int i10) {
            if ((i10 & 3) != 2 || !mVar.l()) {
                if (C4895p.J()) {
                    C4895p.S(-1155957681, i10, -1, "com.ingka.ikea.ui.skapa.ComposableSingletons$SkapaToastSnackbarKt.lambda-2.<anonymous> (SkapaToastSnackbar.kt:92)");
                }
                d.a aVar = d.f18749a;
                I a10 = C5080k.a(C5073d.f18068a.g(), C5437c.f24302a.k(), mVar, 0);
                int a11 = C4883j.a(mVar, 0);
                C4912y s10 = mVar.s();
                d e10 = androidx.compose.ui.c.e(mVar, aVar);
                C4504g.a aVar2 = C4504g.f6515W;
                C17631a<C4504g> a12 = aVar2.a();
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
                F1.c(a13, a10, aVar2.c());
                F1.c(a13, s10, aVar2.e());
                p<C4504g, Integer, C16807N> b10 = aVar2.b();
                if (a13.i() || !C17542s.e(a13.D(), Integer.valueOf(a11))) {
                    a13.u(Integer.valueOf(a11));
                    a13.w(Integer.valueOf(a11), b10);
                }
                F1.c(a13, e10, aVar2.d());
                C5862h hVar = C5862h.f28810a;
                mVar.W(486306481);
                Object D10 = mVar.D();
                if (D10 == C4889m.f14007a.a()) {
                    D10 = new C13567b();
                    mVar.u(D10);
                }
                mVar.P();
                Y2.e("Here is an important message for you.", new C13628q0((C17631a) D10, (String) null), (d) null, "Retry", (C17631a<C16807N>) null, mVar, 3078, 20);
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

    public final r<H0, p<? super C4889m, ? super Integer, C16807N>, C4889m, Integer, C16807N> a() {
        return f116102b;
    }
}
