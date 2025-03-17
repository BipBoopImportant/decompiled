package Qw;

import J1.j;
import SC.C13611m;
import SC.C13643u0;
import SC.R0;
import TC.e;
import U0.C4889m;
import U0.C4895p;
import XH.C16807N;
import androidx.compose.foundation.layout.D;
import androidx.compose.ui.d;
import androidx.compose.ui.platform.C5116k1;
import c1.c;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import nI.q;
import rv.C11849b;
import t0.C5938c;
import tK.C18029u;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* renamed from: Qw.B  reason: case insensitive filesystem */
public final class C13452B {

    /* renamed from: a  reason: collision with root package name */
    public static final C13452B f114762a = new C13452B();

    /* renamed from: b  reason: collision with root package name */
    private static q<C5938c, C4889m, Integer, C16807N> f114763b = c.c(1299123475, false, a.f114764a);

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Qw.B$a */
    static final class a implements q<C5938c, C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f114764a = new a();

        a() {
        }

        public final void a(C5938c cVar, C4889m mVar, int i10) {
            int i11 = i10;
            C17542s.j(cVar, "$this$item");
            if ((i11 & 17) != 16 || !mVar.l()) {
                if (C4895p.J()) {
                    C4895p.S(1299123475, i11, -1, "com.ingka.ikea.onlinepayment.impl.presentation.compose.ComposableSingletons$PaymentScreenKt.lambda-1.<anonymous> (PaymentScreen.kt:505)");
                }
                R0.e(j.b(C11849b.f102297g1, mVar, 0), C13611m.INFORMATIVE, false, D.k(e.i(C5116k1.a(d.f18749a, "PaymentOptionsScreenTestTags.DISCLAIMER")), 0.0f, C18029u.f147649a.d(), 1, (Object) null), (String) null, true, mVar, 197040, 16);
                C13643u0.c((d) null, 0.0f, 0, mVar, 0, 7);
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
        return f114763b;
    }
}
