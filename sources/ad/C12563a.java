package AD;

import U0.C4889m;
import U0.C4895p;
import XH.C16807N;
import c1.c;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import nI.q;
import s0.C5857c;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* renamed from: AD.a  reason: case insensitive filesystem */
public final class C12563a {

    /* renamed from: a  reason: collision with root package name */
    public static final C12563a f107620a = new C12563a();

    /* renamed from: b  reason: collision with root package name */
    private static q<C5857c, C4889m, Integer, C16807N> f107621b = c.c(-1696329291, false, C2569a.f107622a);

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: AD.a$a  reason: collision with other inner class name */
    static final class C2569a implements q<C5857c, C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        public static final C2569a f107622a = new C2569a();

        C2569a() {
        }

        public final void a(C5857c cVar, C4889m mVar, int i10) {
            C17542s.j(cVar, "$this$FlippableCard");
            if ((i10 & 17) != 16 || !mVar.l()) {
                if (C4895p.J()) {
                    C4895p.S(-1696329291, i10, -1, "com.ingka.ikea.wallet.impl.compose.card.loading.ComposableSingletons$LoadingCardKt.lambda-1.<anonymous> (LoadingCard.kt:28)");
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
            a((C5857c) obj, (C4889m) obj2, ((Number) obj3).intValue());
            return C16807N.f139792a;
        }
    }

    public final q<C5857c, C4889m, Integer, C16807N> a() {
        return f107621b;
    }
}
