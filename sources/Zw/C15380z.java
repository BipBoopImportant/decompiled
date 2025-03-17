package zw;

import Op.P;
import U0.C4889m;
import U0.C4895p;
import XH.C16807N;
import androidx.compose.ui.d;
import c1.c;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import nI.q;
import t0.C5938c;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* renamed from: zw.z  reason: case insensitive filesystem */
public final class C15380z {

    /* renamed from: a  reason: collision with root package name */
    public static final C15380z f132754a = new C15380z();

    /* renamed from: b  reason: collision with root package name */
    private static q<C5938c, C4889m, Integer, C16807N> f132755b = c.c(-144089510, false, a.f132756a);

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: zw.z$a */
    static final class a implements q<C5938c, C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f132756a = new a();

        a() {
        }

        public final void a(C5938c cVar, C4889m mVar, int i10) {
            C17542s.j(cVar, "$this$item");
            if ((i10 & 17) != 16 || !mVar.l()) {
                if (C4895p.J()) {
                    C4895p.S(-144089510, i10, -1, "com.ingka.ikea.offerhub.impl.ui.ComposableSingletons$ProductCarouselComposablesKt.lambda-1.<anonymous> (ProductCarouselComposables.kt:107)");
                }
                P.e(true, (d) null, true, mVar, 390, 2);
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
        return f132755b;
    }
}
