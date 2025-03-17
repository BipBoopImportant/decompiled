package mF;

import J0.a;
import K0.b;
import O0.V;
import U0.C4889m;
import U0.C4895p;
import XH.C16807N;
import androidx.compose.ui.d;
import c1.c;
import kotlin.Metadata;
import nI.p;
import tK.C18030v;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
public final class g {

    /* renamed from: a  reason: collision with root package name */
    public static final g f129421a = new g();

    /* renamed from: b  reason: collision with root package name */
    private static p<C4889m, Integer, C16807N> f129422b = c.c(-584061513, false, a.f129423a);

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class a implements p<C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f129423a = new a();

        a() {
        }

        public final void a(C4889m mVar, int i10) {
            if ((i10 & 3) != 2 || !mVar.l()) {
                if (C4895p.J()) {
                    C4895p.S(-584061513, i10, -1, "com.sugarcube.app.base.ui.compose.entrypoint.ComposableSingletons$BannerEntryPointKt.lambda-1.<anonymous> (BannerEntryPoint.kt:102)");
                }
                V.b(b.a(a.C0123a.C0124a.f8796a), "Enter button", (d) null, C18030v.f147664a.a(mVar, C18030v.f147665b).x0(), mVar, 48, 4);
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
        return f129422b;
    }
}
