package Yp;

import Dr.c;
import E1.I;
import G1.C4504g;
import Qr.b;
import U0.C4883j;
import U0.C4889m;
import U0.C4895p;
import U0.C4912y;
import U0.F1;
import XH.C16807N;
import android.net.Uri;
import androidx.compose.foundation.layout.C5077h;
import androidx.compose.foundation.layout.C5079j;
import androidx.compose.foundation.layout.J;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import i1.C5437c;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import nI.C17631a;
import nI.C17642l;
import nI.p;
import nI.q;
import t0.C5938c;
import t0.x;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a?\u0010\u000b\u001a\u00020\t*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007H\u0000¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lt0/x;", "", "index", "LQr/b$c;", "model", "LDr/a;", "kreativComposable", "Lkotlin/Function1;", "Landroid/net/Uri;", "LXH/N;", "onDeeplink", "a", "(Lt0/x;ILQr/b$c;LDr/a;LnI/l;)V", "discover-implementation_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class P {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class a implements q<C5938c, C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Dr.a f89583a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ b.c f89584b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C17642l<Uri, C16807N> f89585c;

        a(Dr.a aVar, b.c cVar, C17642l<? super Uri, C16807N> lVar) {
            this.f89583a = aVar;
            this.f89584b = cVar;
            this.f89585c = lVar;
        }

        public final void a(C5938c cVar, C4889m mVar, int i10) {
            C17542s.j(cVar, "$this$item");
            if ((i10 & 17) != 16 || !mVar.l()) {
                if (C4895p.J()) {
                    C4895p.S(-246958802, i10, -1, "com.ingka.ikea.discover.impl.ui.kreativSection.<anonymous> (KreativComposables.kt:25)");
                }
                d h10 = J.h(d.f18749a, 0.0f, 1, (Object) null);
                Dr.a aVar = this.f89583a;
                b.c cVar2 = this.f89584b;
                C17642l<Uri, C16807N> lVar = this.f89585c;
                I h11 = C5077h.h(C5437c.f24302a.o(), false);
                int a10 = C4883j.a(mVar, 0);
                C4912y s10 = mVar.s();
                d e10 = c.e(mVar, h10);
                C4504g.a aVar2 = C4504g.f6515W;
                C17631a<C4504g> a11 = aVar2.a();
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
                F1.c(a12, h11, aVar2.c());
                F1.c(a12, s10, aVar2.e());
                p<C4504g, Integer, C16807N> b10 = aVar2.b();
                if (a12.i() || !C17542s.e(a12.D(), Integer.valueOf(a10))) {
                    a12.u(Integer.valueOf(a10));
                    a12.w(Integer.valueOf(a10), b10);
                }
                F1.c(a12, e10, aVar2.d());
                C5079j jVar = C5079j.f18125a;
                aVar.a(cVar2, c.a.SEARCH, lVar, mVar, b.c.f86229a | 48);
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
            a((C5938c) obj, (C4889m) obj2, ((Number) obj3).intValue());
            return C16807N.f139792a;
        }
    }

    public static final void a(x xVar, int i10, b.c cVar, Dr.a aVar, C17642l<? super Uri, C16807N> lVar) {
        C17542s.j(xVar, "<this>");
        C17542s.j(cVar, "model");
        C17542s.j(aVar, "kreativComposable");
        C17542s.j(lVar, "onDeeplink");
        xVar.b(Integer.valueOf(i10), "Kreativ", c1.c.c(-246958802, true, new a(aVar, cVar, lVar)));
    }
}
