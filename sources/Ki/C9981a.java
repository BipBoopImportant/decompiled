package ki;

import U0.C4889m;
import U0.C4895p;
import XH.C16807N;
import c1.c;
import kotlin.Metadata;
import nI.p;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* renamed from: ki.a  reason: case insensitive filesystem */
public final class C9981a {

    /* renamed from: a  reason: collision with root package name */
    public static final C9981a f75133a = new C9981a();

    /* renamed from: b  reason: collision with root package name */
    private static p<C4889m, Integer, C16807N> f75134b = c.c(-947551558, false, C1362a.f75135a);

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: ki.a$a  reason: collision with other inner class name */
    static final class C1362a implements p<C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        public static final C1362a f75135a = new C1362a();

        C1362a() {
        }

        public final void a(C4889m mVar, int i10) {
            if ((i10 & 3) != 2 || !mVar.l()) {
                if (C4895p.J()) {
                    C4895p.S(-947551558, i10, -1, "com.ingka.ikea.app.productinformationpage.v3.compose.ComposableSingletons$MessageHandlerKt.lambda-1.<anonymous> (MessageHandler.kt:37)");
                }
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
        return f75134b;
    }
}
