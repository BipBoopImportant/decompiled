package zD;

import U0.C4889m;
import U0.C4895p;
import XH.C16807N;
import c1.c;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import nI.q;
import s0.C5861g;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
public final class j {

    /* renamed from: a  reason: collision with root package name */
    public static final j f132483a = new j();

    /* renamed from: b  reason: collision with root package name */
    private static q<C5861g, C4889m, Integer, C16807N> f132484b = c.c(851285598, false, a.f132485a);

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class a implements q<C5861g, C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f132485a = new a();

        a() {
        }

        public final void a(C5861g gVar, C4889m mVar, int i10) {
            C17542s.j(gVar, "<this>");
            if ((i10 & 17) != 16 || !mVar.l()) {
                if (C4895p.J()) {
                    C4895p.S(851285598, i10, -1, "com.ingka.ikea.wallet.impl.compose.card.layout.ComposableSingletons$CardBackScaffoldKt.lambda-1.<anonymous> (CardBackScaffold.kt:55)");
                }
                if (C4895p.J()) {
                    C4895p.R();
                    return;
                }
                return;
            }
            mVar.L();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            a((C5861g) obj, (C4889m) obj2, ((Number) obj3).intValue());
            return C16807N.f139792a;
        }
    }

    public final q<C5861g, C4889m, Integer, C16807N> a() {
        return f132484b;
    }
}
