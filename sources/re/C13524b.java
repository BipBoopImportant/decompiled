package RE;

import I0.b1;
import J1.e;
import N1.P;
import O0.V;
import S1.C;
import S1.C4820m;
import S1.C4830x;
import U0.C4889m;
import U0.C4895p;
import XH.C16807N;
import Y1.j;
import Y1.k;
import androidx.compose.ui.d;
import c1.c;
import kotlin.Metadata;
import nI.C17642l;
import nI.p;
import tK.C18030v;
import uK.C18146a;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* renamed from: RE.b  reason: case insensitive filesystem */
public final class C13524b {

    /* renamed from: a  reason: collision with root package name */
    public static final C13524b f115478a = new C13524b();

    /* renamed from: b  reason: collision with root package name */
    private static p<C4889m, Integer, C16807N> f115479b = c.c(-1465183980, false, a.f115481a);

    /* renamed from: c  reason: collision with root package name */
    private static p<C4889m, Integer, C16807N> f115480c = c.c(762160277, false, C2839b.f115482a);

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: RE.b$a */
    static final class a implements p<C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f115481a = new a();

        a() {
        }

        public final void a(C4889m mVar, int i10) {
            int i11 = i10;
            if ((i11 & 3) != 2 || !mVar.l()) {
                if (C4895p.J()) {
                    C4895p.S(-1465183980, i11, -1, "com.sugarcube.app.base.debug.ComposableSingletons$DebugFragmentKt.lambda-1.<anonymous> (DebugFragment.kt:333)");
                }
                b1.b("Kreativ debug", (d) null, 0, 0, (C4830x) null, (C) null, (C4820m) null, 0, (k) null, (j) null, 0, 0, false, 0, 0, (C17642l<? super P, C16807N>) null, C18030v.f147664a.b(mVar, C18030v.f147665b).c().e(), mVar, 6, 0, 65534);
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
    /* renamed from: RE.b$b  reason: collision with other inner class name */
    static final class C2839b implements p<C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        public static final C2839b f115482a = new C2839b();

        C2839b() {
        }

        public final void a(C4889m mVar, int i10) {
            if ((i10 & 3) != 2 || !mVar.l()) {
                if (C4895p.J()) {
                    C4895p.S(762160277, i10, -1, "com.sugarcube.app.base.debug.ComposableSingletons$DebugFragmentKt.lambda-2.<anonymous> (DebugFragment.kt:342)");
                }
                V.a(e.c(C18146a.f148719y, mVar, 0), "Localized description", (d) null, 0, mVar, 48, 12);
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
        return f115479b;
    }

    public final p<C4889m, Integer, C16807N> b() {
        return f115480c;
    }
}
