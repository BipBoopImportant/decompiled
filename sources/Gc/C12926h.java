package GC;

import GC.C12925g;
import IC.C13023e;
import SC.H2;
import TC.e;
import U0.C4889m;
import U0.C4895p;
import XH.C16807N;
import androidx.compose.foundation.layout.D;
import androidx.compose.foundation.layout.J;
import androidx.compose.ui.d;
import c1.c;
import c2.h;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nI.C17631a;
import nI.p;
import nI.q;
import t0.C5938c;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* renamed from: GC.h  reason: case insensitive filesystem */
public final class C12926h {

    /* renamed from: a  reason: collision with root package name */
    public static final C12926h f110326a = new C12926h();

    /* renamed from: b  reason: collision with root package name */
    private static q<C5938c, C4889m, Integer, C16807N> f110327b = c.c(-742178904, false, a.f110329a);

    /* renamed from: c  reason: collision with root package name */
    private static p<C4889m, Integer, C16807N> f110328c = c.c(657832372, false, b.f110330a);

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: GC.h$a */
    static final class a implements q<C5938c, C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f110329a = new a();

        a() {
        }

        public final void a(C5938c cVar, C4889m mVar, int i10) {
            C17542s.j(cVar, "$this$item");
            if ((i10 & 17) != 16 || !mVar.l()) {
                if (C4895p.J()) {
                    C4895p.S(-742178904, i10, -1, "com.ingka.ikea.ui.assemblyservices.ComposableSingletons$AssemblyDetailsContentKt.lambda-1.<anonymous> (AssemblyDetailsContent.kt:77)");
                }
                H2.b(J.i(D.k(e.i(d.f18749a), 0.0f, h.B((float) 16), 1, (Object) null), h.B((float) 56)), false, mVar, 0, 2);
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

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: GC.h$b */
    static final class b implements p<C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f110330a = new b();

        b() {
        }

        /* access modifiers changed from: private */
        public static final C16807N c() {
            return C16807N.f139792a;
        }

        public final void b(C4889m mVar, int i10) {
            if ((i10 & 3) != 2 || !mVar.l()) {
                if (C4895p.J()) {
                    C4895p.S(657832372, i10, -1, "com.ingka.ikea.ui.assemblyservices.ComposableSingletons$AssemblyDetailsContentKt.lambda-2.<anonymous> (AssemblyDetailsContent.kt:275)");
                }
                C12925g gVar = new C12925g(true, (C13023e) null, (C13023e) null, (List) null, (C12925g.a) null, 30, (DefaultConstructorMarker) null);
                mVar.W(515635747);
                Object D10 = mVar.D();
                if (D10 == C4889m.f14007a.a()) {
                    D10 = new C12927i();
                    mVar.u(D10);
                }
                mVar.P();
                C12924f.f(gVar, (C17631a) D10, (d) null, mVar, 48, 4);
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

    public final q<C5938c, C4889m, Integer, C16807N> a() {
        return f110327b;
    }
}
