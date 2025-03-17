package AG;

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
/* renamed from: AG.k  reason: case insensitive filesystem */
public final class C15403k {

    /* renamed from: a  reason: collision with root package name */
    public static final C15403k f132873a = new C15403k();

    /* renamed from: b  reason: collision with root package name */
    private static p<C4889m, Integer, C16807N> f132874b = c.c(1727523337, false, a.f132876a);

    /* renamed from: c  reason: collision with root package name */
    private static p<C4889m, Integer, C16807N> f132875c = c.c(-751516686, false, b.f132877a);

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: AG.k$a */
    static final class a implements p<C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f132876a = new a();

        a() {
        }

        public final void a(C4889m mVar, int i10) {
            if ((i10 & 3) != 2 || !mVar.l()) {
                if (C4895p.J()) {
                    C4895p.S(1727523337, i10, -1, "com.sugarcube.decorate.v2.internal.ui.catalog.ui.common.drawer.ComposableSingletons$ProductCardKt.lambda-1.<anonymous> (ProductCard.kt:143)");
                }
                V.a(e.c(C18148c.InformationCircle.m(), mVar, 0), j.b(n.f113326a2, mVar, 0), (d) null, C15002a.a(mVar, 0).f(), mVar, 0, 4);
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
    /* renamed from: AG.k$b */
    static final class b implements p<C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f132877a = new b();

        b() {
        }

        public final void a(C4889m mVar, int i10) {
            if ((i10 & 3) != 2 || !mVar.l()) {
                if (C4895p.J()) {
                    C4895p.S(-751516686, i10, -1, "com.sugarcube.decorate.v2.internal.ui.catalog.ui.common.drawer.ComposableSingletons$ProductCardKt.lambda-2.<anonymous> (ProductCard.kt:156)");
                }
                V.a(e.c(C18148c.Heart.m(), mVar, 0), j.b(n.f113486x1, mVar, 0), (d) null, C15002a.a(mVar, 0).f(), mVar, 0, 4);
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
        return f132874b;
    }

    public final p<C4889m, Integer, C16807N> b() {
        return f132875c;
    }
}
