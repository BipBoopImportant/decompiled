package zl;

import J1.e;
import J1.j;
import O0.V;
import U0.C4889m;
import U0.C4895p;
import XH.C16807N;
import androidx.compose.ui.d;
import c1.c;
import kotlin.Metadata;
import nI.p;
import tK.C18030v;
import uK.C18146a;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* renamed from: zl.a  reason: case insensitive filesystem */
public final class C12533a {

    /* renamed from: a  reason: collision with root package name */
    public static final C12533a f107475a = new C12533a();

    /* renamed from: b  reason: collision with root package name */
    private static p<C4889m, Integer, C16807N> f107476b = c.c(593393597, false, C2564a.f107478a);

    /* renamed from: c  reason: collision with root package name */
    private static p<C4889m, Integer, C16807N> f107477c = c.c(-398512287, false, b.f107479a);

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: zl.a$a  reason: collision with other inner class name */
    static final class C2564a implements p<C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        public static final C2564a f107478a = new C2564a();

        C2564a() {
        }

        public final void a(C4889m mVar, int i10) {
            if ((i10 & 3) != 2 || !mVar.l()) {
                if (C4895p.J()) {
                    C4895p.S(593393597, i10, -1, "com.ingka.ikea.app.uicomposables.search.ComposableSingletons$SearchFieldKt.lambda-1.<anonymous> (SearchField.kt:101)");
                }
                V.a(e.c(C18146a.f148719y, mVar, 0), j.b(Oo.b.f84632f, mVar, 0), (d) null, C18030v.f147664a.a(mVar, C18030v.f147665b).G0(), mVar, 0, 4);
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
    /* renamed from: zl.a$b */
    static final class b implements p<C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f107479a = new b();

        b() {
        }

        public final void a(C4889m mVar, int i10) {
            if ((i10 & 3) != 2 || !mVar.l()) {
                if (C4895p.J()) {
                    C4895p.S(-398512287, i10, -1, "com.ingka.ikea.app.uicomposables.search.ComposableSingletons$SearchFieldKt.lambda-2.<anonymous> (SearchField.kt:132)");
                }
                V.a(e.c(C18146a.f148097J2, mVar, 0), j.b(Oo.b.f84777s1, mVar, 0), (d) null, C18030v.f147664a.a(mVar, C18030v.f147665b).G0(), mVar, 0, 4);
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
        return f107476b;
    }

    public final p<C4889m, Integer, C16807N> b() {
        return f107477c;
    }
}
