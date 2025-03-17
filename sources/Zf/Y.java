package zf;

import J1.j;
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
import Y1.k;
import androidx.compose.ui.d;
import c1.c;
import kotlin.Metadata;
import nI.C17642l;
import nI.p;
import wf.C10366b;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
public final class Y {

    /* renamed from: a  reason: collision with root package name */
    public static final Y f78234a = new Y();

    /* renamed from: b  reason: collision with root package name */
    private static p<C4889m, Integer, C16807N> f78235b = c.c(91454387, false, a.f78236a);

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class a implements p<C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f78236a = new a();

        a() {
        }

        public final void a(C4889m mVar, int i10) {
            int i11 = i10;
            if ((i11 & 3) != 2 || !mVar.l()) {
                if (C4895p.J()) {
                    C4895p.S(91454387, i11, -1, "com.ingka.ikea.app.browseandsearch.browseV2.compose.ComposableSingletons$RecentlyViewedComposablesKt.lambda-1.<anonymous> (RecentlyViewedComposables.kt:108)");
                }
                C13607l.j(j.b(C10366b.f77649j, mVar, 0), C13679b.a.C2856b.f116680a, (d) null, 0, 0, (C4830x) null, (C) null, (C4820m) null, 0, (k) null, (Y1.j) null, (f) null, 0, 0, false, 0, 0, (C17642l<? super P, C16807N>) null, mVar, 48, 0, 262140);
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
        return f78235b;
    }
}
