package ki;

import E1.C4478k;
import LC.C13178b;
import LC.h;
import TC.e;
import U0.C4889m;
import U0.C4895p;
import XH.C16807N;
import androidx.compose.foundation.layout.J;
import androidx.compose.ui.d;
import c1.c;
import gs.e;
import i1.C5437c;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import nI.C17642l;
import nI.q;
import s0.C5857c;
import t0.C5938c;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* renamed from: ki.b  reason: case insensitive filesystem */
public final class C9982b {

    /* renamed from: a  reason: collision with root package name */
    public static final C9982b f75137a = new C9982b();

    /* renamed from: b  reason: collision with root package name */
    private static q<C5938c, C4889m, Integer, C16807N> f75138b = c.c(1022137306, false, a.f75139a);

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: ki.b$a */
    static final class a implements q<C5938c, C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f75139a = new a();

        a() {
        }

        public final void a(C5938c cVar, C4889m mVar, int i10) {
            int i11 = i10;
            C17542s.j(cVar, "$this$item");
            if ((i11 & 17) != 16 || !mVar.l()) {
                if (C4895p.J()) {
                    C4895p.S(1022137306, i11, -1, "com.ingka.ikea.app.productinformationpage.v3.compose.ComposableSingletons$PipInspirationKt.lambda-1.<anonymous> (PipInspiration.kt:19)");
                }
                h.c("https://www.ikea.com/ext/ingkadam/m/2d3d4d961df69ce5/original/PH201489_SHI_001.jpg", (String) null, e.i(J.f(d.f18749a, 0.0f, 1, (Object) null)), C13178b.a.f111818a, (e.b) null, (C4478k) null, (C5437c) null, (C17642l<? super e.c, C16807N>) null, false, false, (q<? super C5857c, ? super C4889m, ? super Integer, C16807N>) null, (q<? super C5857c, ? super C4889m, ? super Integer, C16807N>) null, mVar, (C13178b.a.f111819b << 9) | 54, 0, 4080);
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
        return f75138b;
    }
}
