package ei;

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
import kotlin.Metadata;
import nI.p;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* renamed from: ei.p  reason: case insensitive filesystem */
public final class C9675p {

    /* renamed from: a  reason: collision with root package name */
    public static final C9675p f72902a = new C9675p();

    /* renamed from: b  reason: collision with root package name */
    private static p<C4889m, Integer, C16807N> f72903b = c.c(1064593533, false, a.f72904a);

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: ei.p$a */
    static final class a implements p<C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f72904a = new a();

        a() {
        }

        public final void a(C4889m mVar, int i10) {
            if ((i10 & 3) != 2 || !mVar.l()) {
                if (C4895p.J()) {
                    C4895p.S(1064593533, i10, -1, "com.ingka.ikea.app.productinformationpage.v2.delegates.ComposableSingletons$SingleItemLoadingDelegateKt.lambda-1.<anonymous> (SingleItemLoadingDelegate.kt:33)");
                }
                H2.b(J.i(J.g(D.k(e.i(d.f18749a), 0.0f, h.B((float) 40), 1, (Object) null), 0.7f), h.B((float) 16)), false, mVar, 0, 2);
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
        return f72903b;
    }
}
