package Pi;

import J1.j;
import Mi.C10771f;
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
import androidx.compose.foundation.layout.D;
import androidx.compose.ui.d;
import c1.c;
import c2.h;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import nI.C17642l;
import nI.p;
import nI.r;
import s0.C5857c;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* renamed from: Pi.a  reason: case insensitive filesystem */
public final class C10877a {

    /* renamed from: a  reason: collision with root package name */
    public static final C10877a f85461a = new C10877a();

    /* renamed from: b  reason: collision with root package name */
    private static p<C4889m, Integer, C16807N> f85462b = c.c(-1279303063, false, C1725a.f85464a);

    /* renamed from: c  reason: collision with root package name */
    private static r<C5857c, C10771f, C4889m, Integer, C16807N> f85463c = c.c(-2125358761, false, b.f85465a);

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Pi.a$a  reason: collision with other inner class name */
    static final class C1725a implements p<C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        public static final C1725a f85464a = new C1725a();

        C1725a() {
        }

        public final void a(C4889m mVar, int i10) {
            int i11 = i10;
            if ((i11 & 3) != 2 || !mVar.l()) {
                if (C4895p.J()) {
                    C4895p.S(-1279303063, i11, -1, "com.ingka.ikea.app.ratingsandreviews.presentation.composable.ComposableSingletons$RatingsAndReviewsScreenKt.lambda-1.<anonymous> (RatingsAndReviewsScreen.kt:224)");
                }
                C13607l.j(j.b(Oo.b.f84526U8, mVar, 0), C13679b.a.C2856b.f116680a, (d) null, 0, 0, (C4830x) null, (C) null, (C4820m) null, 0, (k) null, (Y1.j) null, (f) null, 0, 0, false, 0, 0, (C17642l<? super P, C16807N>) null, mVar, 48, 0, 262140);
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

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Pi.a$b */
    static final class b implements r<C5857c, C10771f, C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f85465a = new b();

        b() {
        }

        public final void a(C5857c cVar, C10771f fVar, C4889m mVar, int i10) {
            C17542s.j(cVar, "$this$gridItems");
            C17542s.j(fVar, "data");
            if ((i10 & 48) == 0) {
                i10 |= mVar.V(fVar) ? 32 : 16;
            }
            if ((i10 & 145) != 144 || !mVar.l()) {
                if (C4895p.J()) {
                    C4895p.S(-2125358761, i10, -1, "com.ingka.ikea.app.ratingsandreviews.presentation.composable.ComposableSingletons$RatingsAndReviewsScreenKt.lambda-2.<anonymous> (RatingsAndReviewsScreen.kt:302)");
                }
                float f10 = (float) 8;
                float f11 = (float) 24;
                C10883g.b(fVar, D.l(d.f18749a, h.B(f10), h.B(f11), h.B(f10), h.B(f11)), mVar, (i10 >> 3) & 14, 0);
                if (C4895p.J()) {
                    C4895p.R();
                    return;
                }
                return;
            }
            mVar.L();
        }

        public /* bridge */ /* synthetic */ Object l(Object obj, Object obj2, Object obj3, Object obj4) {
            a((C5857c) obj, (C10771f) obj2, (C4889m) obj3, ((Number) obj4).intValue());
            return C16807N.f139792a;
        }
    }

    public final p<C4889m, Integer, C16807N> a() {
        return f85462b;
    }

    public final r<C5857c, C10771f, C4889m, Integer, C16807N> b() {
        return f85463c;
    }
}
