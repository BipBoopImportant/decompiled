package YB;

import J1.e;
import O0.V;
import U0.C4889m;
import U0.C4895p;
import XH.C16807N;
import androidx.compose.ui.d;
import c1.c;
import kotlin.Metadata;
import nI.p;
import uK.C18146a;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* renamed from: YB.r  reason: case insensitive filesystem */
public final class C13851r {

    /* renamed from: a  reason: collision with root package name */
    public static final C13851r f118048a = new C13851r();

    /* renamed from: b  reason: collision with root package name */
    private static p<C4889m, Integer, C16807N> f118049b = c.c(1010827120, false, a.f118050a);

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: YB.r$a */
    static final class a implements p<C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f118050a = new a();

        a() {
        }

        public final void a(C4889m mVar, int i10) {
            if ((i10 & 3) != 2 || !mVar.l()) {
                if (C4895p.J()) {
                    C4895p.S(1010827120, i10, -1, "com.ingka.ikea.storedetails.impl.map.presentation.ui.ComposableSingletons$StoreDetailsScreenKt.lambda-1.<anonymous> (StoreDetailsScreen.kt:210)");
                }
                V.a(e.c(C18146a.f148101J6, mVar, 0), (String) null, (d) null, 0, mVar, 48, 12);
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
        return f118049b;
    }
}
