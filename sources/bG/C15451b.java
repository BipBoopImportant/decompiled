package BG;

import U0.C4889m;
import U0.C4895p;
import XH.C16807N;
import androidx.compose.foundation.layout.J;
import androidx.compose.ui.d;
import c1.c;
import c2.h;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import nI.q;
import s0.C5844O;
import t0.C5938c;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* renamed from: BG.b  reason: case insensitive filesystem */
public final class C15451b {

    /* renamed from: a  reason: collision with root package name */
    public static final C15451b f133169a = new C15451b();

    /* renamed from: b  reason: collision with root package name */
    private static q<C5938c, C4889m, Integer, C16807N> f133170b = c.c(1120919291, false, a.f133171a);

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: BG.b$a */
    static final class a implements q<C5938c, C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f133171a = new a();

        a() {
        }

        public final void a(C5938c cVar, C4889m mVar, int i10) {
            C17542s.j(cVar, "$this$item");
            if ((i10 & 17) != 16 || !mVar.l()) {
                if (C4895p.J()) {
                    C4895p.S(1120919291, i10, -1, "com.sugarcube.decorate.v2.internal.ui.catalog.ui.common.stripe.ComposableSingletons$MiniCatalogLazyListKt.lambda-1.<anonymous> (MiniCatalogLazyList.kt:79)");
                }
                C5844O.a(J.i(d.f18749a, h.B((float) 60)), mVar, 6);
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
        return f133170b;
    }
}
