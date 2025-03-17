package go;

import U0.C4889m;
import U0.C4895p;
import XH.C16807N;
import androidx.compose.ui.d;
import c1.c;
import c2.h;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import nI.q;
import s0.C5844O;
import t0.C5938c;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
public final class J {

    /* renamed from: a  reason: collision with root package name */
    public static final J f97722a = new J();

    /* renamed from: b  reason: collision with root package name */
    private static q<C5938c, C4889m, Integer, C16807N> f97723b = c.c(-1346647852, false, a.f97724a);

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class a implements q<C5938c, C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f97724a = new a();

        a() {
        }

        public final void a(C5938c cVar, C4889m mVar, int i10) {
            C17542s.j(cVar, "$this$item");
            if ((i10 & 17) != 16 || !mVar.l()) {
                if (C4895p.J()) {
                    C4895p.S(-1346647852, i10, -1, "com.ingka.ikea.checkout.impl.delivery.compose.ComposableSingletons$UnavailableItemsContentKt.lambda-1.<anonymous> (UnavailableItemsContent.kt:130)");
                }
                C5844O.a(androidx.compose.foundation.layout.J.i(d.f18749a, h.B((float) 24)), mVar, 6);
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

    public final q<C5938c, C4889m, Integer, C16807N> a() {
        return f97723b;
    }
}
