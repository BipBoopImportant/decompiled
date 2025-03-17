package PF;

import E1.I;
import G1.C4504g;
import J1.j;
import OE.n;
import U0.C4883j;
import U0.C4889m;
import U0.C4895p;
import U0.C4912y;
import U0.F1;
import XH.C16807N;
import androidx.compose.foundation.b;
import androidx.compose.foundation.layout.C5073d;
import androidx.compose.foundation.layout.C5080k;
import androidx.compose.foundation.layout.J;
import androidx.compose.ui.d;
import c1.c;
import i1.C5437c;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import nI.C17631a;
import nI.p;
import p1.i1;
import rF.C15002a;
import s0.C5862h;
import wK.J4;
import wK.X4;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* renamed from: PF.a  reason: case insensitive filesystem */
public final class C13344a {

    /* renamed from: a  reason: collision with root package name */
    public static final C13344a f114037a = new C13344a();

    /* renamed from: b  reason: collision with root package name */
    private static p<C4889m, Integer, C16807N> f114038b = c.c(-1556487741, false, C2808a.f114039a);

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: PF.a$a  reason: collision with other inner class name */
    static final class C2808a implements p<C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        public static final C2808a f114039a = new C2808a();

        C2808a() {
        }

        public final void a(C4889m mVar, int i10) {
            if ((i10 & 3) != 2 || !mVar.l()) {
                if (C4895p.J()) {
                    C4895p.S(-1556487741, i10, -1, "com.sugarcube.decorate.ComposableSingletons$DecorateLandingFragmentKt.lambda-1.<anonymous> (DecorateLandingFragment.kt:117)");
                }
                d d10 = b.d(J.f(d.f18749a, 0.0f, 1, (Object) null), C15002a.a(mVar, 0).p(), (i1) null, 2, (Object) null);
                I a10 = C5080k.a(C5073d.f18068a.b(), C5437c.f24302a.g(), mVar, 54);
                int a11 = C4883j.a(mVar, 0);
                C4912y s10 = mVar.s();
                d e10 = androidx.compose.ui.c.e(mVar, d10);
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
                X4.r(j.b(n.f113334b3, mVar, 0), (d) null, J4.Emphasised, false, mVar, 384, 10);
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
            a((C4889m) obj, ((Number) obj2).intValue());
            return C16807N.f139792a;
        }
    }

    public final p<C4889m, Integer, C16807N> a() {
        return f114038b;
    }
}
