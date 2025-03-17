package my;

import E1.I;
import G1.C4504g;
import Rl.f;
import U0.C4883j;
import U0.C4889m;
import U0.C4895p;
import U0.C4912y;
import U0.F1;
import XH.C16807N;
import androidx.compose.foundation.layout.C5077h;
import androidx.compose.foundation.layout.C5079j;
import androidx.compose.foundation.layout.J;
import androidx.compose.ui.d;
import c1.c;
import i1.C5437c;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import l0.e;
import nI.C17631a;
import nI.p;
import nI.q;
import ny.C14856b;
import ny.C14857c;
import ny.C14861g;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* renamed from: my.a  reason: case insensitive filesystem */
public final class C14810a {

    /* renamed from: a  reason: collision with root package name */
    public static final C14810a f129560a = new C14810a();

    /* renamed from: b  reason: collision with root package name */
    private static q<e, C4889m, Integer, C16807N> f129561b = c.c(-410171398, false, C3184a.f129563a);

    /* renamed from: c  reason: collision with root package name */
    private static p<C4889m, Integer, C16807N> f129562c = c.c(598094652, false, b.f129564a);

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: my.a$a  reason: collision with other inner class name */
    static final class C3184a implements q<e, C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        public static final C3184a f129563a = new C3184a();

        C3184a() {
        }

        public final void a(e eVar, C4889m mVar, int i10) {
            C17542s.j(eVar, "$this$AnimatedVisibility");
            if (C4895p.J()) {
                C4895p.S(-410171398, i10, -1, "com.ingka.ikea.regionsettings.impl.ui.region.ComposableSingletons$RegionSelectBackgroundImageKt.lambda-1.<anonymous> (RegionSelectBackgroundImage.kt:96)");
            }
            C14806G.t(J.f(d.f18749a, 0.0f, 1, (Object) null), mVar, 6, 0);
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
    /* renamed from: my.a$b */
    static final class b implements p<C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f129564a = new b();

        b() {
        }

        public final void a(C4889m mVar, int i10) {
            if ((i10 & 3) != 2 || !mVar.l()) {
                if (C4895p.J()) {
                    C4895p.S(598094652, i10, -1, "com.ingka.ikea.regionsettings.impl.ui.region.ComposableSingletons$RegionSelectBackgroundImageKt.lambda-2.<anonymous> (RegionSelectBackgroundImage.kt:181)");
                }
                d f10 = J.f(d.f18749a, 0.0f, 1, (Object) null);
                I h10 = C5077h.h(C5437c.f24302a.o(), false);
                int a10 = C4883j.a(mVar, 0);
                C4912y s10 = mVar.s();
                d e10 = androidx.compose.ui.c.e(mVar, f10);
                C4504g.a aVar = C4504g.f6515W;
                C17631a<C4504g> a11 = aVar.a();
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
                F1.c(a12, h10, aVar.c());
                F1.c(a12, s10, aVar.e());
                p<C4504g, Integer, C16807N> b10 = aVar.b();
                if (a12.i() || !C17542s.e(a12.D(), Integer.valueOf(a10))) {
                    a12.u(Integer.valueOf(a10));
                    a12.w(Integer.valueOf(a10), b10);
                }
                F1.c(a12, e10, aVar.d());
                C5079j jVar = C5079j.f18125a;
                C14806G.j(C14857c.a.b(new C14857c.a((List) null, (Rl.d) null, (f) null, false, false, (C14856b) null, false, (C14861g) null, 255, (DefaultConstructorMarker) null), (List) null, (Rl.d) null, (f) null, false, false, (C14856b) null, false, C14861g.b.f129919a, 127, (Object) null), f10, mVar, 48, 0);
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

    public final q<e, C4889m, Integer, C16807N> a() {
        return f129561b;
    }
}
