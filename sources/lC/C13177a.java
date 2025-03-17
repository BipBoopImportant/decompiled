package LC;

import E1.C4478k;
import LC.C13178b;
import U0.C4889m;
import U0.C4895p;
import XH.C16807N;
import androidx.compose.foundation.layout.C5074e;
import androidx.compose.foundation.layout.J;
import androidx.compose.ui.d;
import c1.c;
import gs.e;
import gs.h;
import i1.C5437c;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import nI.C17642l;
import nI.p;
import nI.q;
import s0.C5857c;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* renamed from: LC.a  reason: case insensitive filesystem */
public final class C13177a {

    /* renamed from: a  reason: collision with root package name */
    public static final C13177a f111813a = new C13177a();

    /* renamed from: b  reason: collision with root package name */
    private static q<C5857c, C4889m, Integer, C16807N> f111814b = c.c(-604441298, false, C2733a.f111816a);

    /* renamed from: c  reason: collision with root package name */
    private static p<C4889m, Integer, C16807N> f111815c = c.c(2053764768, false, b.f111817a);

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: LC.a$a  reason: collision with other inner class name */
    static final class C2733a implements q<C5857c, C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        public static final C2733a f111816a = new C2733a();

        C2733a() {
        }

        public final void a(C5857c cVar, C4889m mVar, int i10) {
            C17542s.j(cVar, "<this>");
            if ((i10 & 6) == 0) {
                i10 |= mVar.V(cVar) ? 4 : 2;
            }
            if ((i10 & 19) != 18 || !mVar.l()) {
                if (C4895p.J()) {
                    C4895p.S(-604441298, i10, -1, "com.ingka.ikea.ui.image.ComposableSingletons$ImageWithLoadingKt.lambda-1.<anonymous> (ImageWithLoading.kt:75)");
                }
                C13181e.f111832a.e(cVar.e(d.f18749a), mVar, 48, 0);
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

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: LC.a$b */
    static final class b implements p<C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f111817a = new b();

        b() {
        }

        public final void a(C4889m mVar, int i10) {
            int i11 = i10;
            if ((i11 & 3) != 2 || !mVar.l()) {
                if (C4895p.J()) {
                    C4895p.S(2053764768, i11, -1, "com.ingka.ikea.ui.image.ComposableSingletons$ImageWithLoadingKt.lambda-2.<anonymous> (ImageWithLoading.kt:238)");
                }
                h.c("url", (String) null, C5074e.b(J.h(d.f18749a, 0.0f, 1, (Object) null), 1.0f, false, 2, (Object) null), new C13178b.C2734b(h.a.M), (e.b) null, (C4478k) null, (C5437c) null, (C17642l<? super e.c, C16807N>) null, false, false, (q<? super C5857c, ? super C4889m, ? super Integer, C16807N>) null, (q<? super C5857c, ? super C4889m, ? super Integer, C16807N>) null, mVar, 438, 0, 4080);
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

    public final q<C5857c, C4889m, Integer, C16807N> a() {
        return f111814b;
    }
}
