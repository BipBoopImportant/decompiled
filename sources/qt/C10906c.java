package Qt;

import LC.C13181e;
import U0.C4889m;
import U0.C4895p;
import XH.C16807N;
import androidx.compose.ui.d;
import c1.c;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import nI.q;
import s0.C5857c;
import tK.C18030v;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* renamed from: Qt.c  reason: case insensitive filesystem */
public final class C10906c {

    /* renamed from: a  reason: collision with root package name */
    public static final C10906c f86254a = new C10906c();

    /* renamed from: b  reason: collision with root package name */
    private static q<C5857c, C4889m, Integer, C16807N> f86255b = c.c(-1353130249, false, a.f86256a);

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Qt.c$a */
    static final class a implements q<C5857c, C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f86256a = new a();

        a() {
        }

        public final void a(C5857c cVar, C4889m mVar, int i10) {
            C17542s.j(cVar, "$this$ImageWithLoading");
            if ((i10 & 17) != 16 || !mVar.l()) {
                if (C4895p.J()) {
                    C4895p.S(-1353130249, i10, -1, "com.ingka.ikea.instore.impl.storeevents.composables.ComposableSingletons$StoreEventImageKt.lambda-1.<anonymous> (StoreEventImage.kt:49)");
                }
                C13181e.f111832a.c((String) null, (d) null, C18030v.f147664a.a(mVar, C18030v.f147665b).G0(), mVar, (C13181e.f111833b << 9) | 6, 2);
                if (C4895p.J()) {
                    C4895p.R();
                    return;
                }
                return;
            }
            mVar.L();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            a((C5857c) obj, (C4889m) obj2, ((Number) obj3).intValue());
            return C16807N.f139792a;
        }
    }

    public final q<C5857c, C4889m, Integer, C16807N> a() {
        return f86255b;
    }
}
