package ki;

import N1.P;
import S1.C;
import S1.C4820m;
import S1.C4830x;
import SC.C13607l;
import TC.C13679b;
import U0.C4889m;
import U0.C4895p;
import XH.C16807N;
import Y1.f;
import Y1.j;
import Y1.k;
import androidx.compose.foundation.b;
import androidx.compose.foundation.layout.D;
import androidx.compose.foundation.layout.J;
import androidx.compose.ui.d;
import c1.c;
import c2.h;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import nI.C17642l;
import nI.q;
import p1.i1;
import t0.C5938c;
import tK.C18030v;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* renamed from: ki.c  reason: case insensitive filesystem */
public final class C9983c {

    /* renamed from: a  reason: collision with root package name */
    public static final C9983c f75141a = new C9983c();

    /* renamed from: b  reason: collision with root package name */
    private static q<C5938c, C4889m, Integer, C16807N> f75142b = c.c(647358327, false, a.f75143a);

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: ki.c$a */
    static final class a implements q<C5938c, C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f75143a = new a();

        a() {
        }

        public final void a(C5938c cVar, C4889m mVar, int i10) {
            int i11 = i10;
            C17542s.j(cVar, "$this$item");
            if ((i11 & 17) != 16 || !mVar.l()) {
                if (C4895p.J()) {
                    C4895p.S(647358327, i11, -1, "com.ingka.ikea.app.productinformationpage.v3.compose.ComposableSingletons$PipRecommendationCarouselKt.lambda-1.<anonymous> (PipRecommendationCarousel.kt:22)");
                }
                float f10 = (float) 24;
                C13607l.j("Related Products", C13679b.a.C2856b.f116680a, D.i(b.d(D.i(J.h(d.f18749a, 0.0f, 1, (Object) null), h.B(f10)), C18030v.f147664a.a(mVar, C18030v.f147665b).l0(), (i1) null, 2, (Object) null), h.B(f10)), 0, 0, (C4830x) null, (C) null, (C4820m) null, 0, (k) null, (j) null, (f) null, 0, 0, false, 0, 0, (C17642l<? super P, C16807N>) null, mVar, 54, 0, 262136);
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
        return f75142b;
    }
}
