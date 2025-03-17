package ei;

import TC.e;
import U0.C4889m;
import U0.C4895p;
import XH.C16807N;
import androidx.compose.foundation.layout.D;
import androidx.compose.ui.d;
import c1.c;
import c2.h;
import ci.K;
import kotlin.Metadata;
import nI.p;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* renamed from: ei.o  reason: case insensitive filesystem */
public final class C9674o {

    /* renamed from: a  reason: collision with root package name */
    public static final C9674o f72899a = new C9674o();

    /* renamed from: b  reason: collision with root package name */
    private static p<C4889m, Integer, C16807N> f72900b = c.c(696270286, false, a.f72901a);

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: ei.o$a */
    static final class a implements p<C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f72901a = new a();

        a() {
        }

        public final void a(C4889m mVar, int i10) {
            if ((i10 & 3) != 2 || !mVar.l()) {
                if (C4895p.J()) {
                    C4895p.S(696270286, i10, -1, "com.ingka.ikea.app.productinformationpage.v2.delegates.ComposableSingletons$OnlyInStoreDelegateKt.lambda-1.<anonymous> (OnlyInStoreDelegate.kt:34)");
                }
                K.b(D.m(e.i(d.f18749a), 0.0f, h.B((float) 48), 0.0f, h.B((float) 24), 5, (Object) null), mVar, 0, 0);
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
        return f72900b;
    }
}
