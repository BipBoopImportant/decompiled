package LG;

import J1.e;
import J1.j;
import O0.V;
import OE.n;
import U0.C4889m;
import U0.C4895p;
import XH.C16807N;
import androidx.compose.ui.d;
import c1.c;
import kotlin.Metadata;
import nI.p;
import rF.C15002a;
import uK.C18148c;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* renamed from: LG.a  reason: case insensitive filesystem */
public final class C16004a {

    /* renamed from: a  reason: collision with root package name */
    public static final C16004a f136014a = new C16004a();

    /* renamed from: b  reason: collision with root package name */
    private static p<C4889m, Integer, C16807N> f136015b = c.c(-1958253736, false, C3345a.f136016a);

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: LG.a$a  reason: collision with other inner class name */
    static final class C3345a implements p<C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        public static final C3345a f136016a = new C3345a();

        C3345a() {
        }

        public final void a(C4889m mVar, int i10) {
            if ((i10 & 3) != 2 || !mVar.l()) {
                if (C4895p.J()) {
                    C4895p.S(-1958253736, i10, -1, "com.sugarcube.decorate.v2.internal.ui.feedback.ComposableSingletons$SmileRatingBarKt.lambda-1.<anonymous> (SmileRatingBar.kt:113)");
                }
                V.a(e.c(C18148c.Cross.m(), mVar, 0), j.b(n.f113500z2, mVar, 0), (d) null, C15002a.a(mVar, 0).f(), mVar, 0, 4);
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
        return f136015b;
    }
}
