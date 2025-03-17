package ts;

import U0.C4889m;
import U0.C4895p;
import XH.C16807N;
import c1.c;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import nI.q;
import s0.C5842M;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* renamed from: ts.a  reason: case insensitive filesystem */
public final class C11987a {

    /* renamed from: a  reason: collision with root package name */
    public static final C11987a f103360a = new C11987a();

    /* renamed from: b  reason: collision with root package name */
    private static q<C5842M, C4889m, Integer, C16807N> f103361b = c.c(-1974766789, false, C2460a.f103362a);

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: ts.a$a  reason: collision with other inner class name */
    static final class C2460a implements q<C5842M, C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        public static final C2460a f103362a = new C2460a();

        C2460a() {
        }

        public final void a(C5842M m10, C4889m mVar, int i10) {
            C17542s.j(m10, "<this>");
            if ((i10 & 17) != 16 || !mVar.l()) {
                if (C4895p.J()) {
                    C4895p.S(-1974766789, i10, -1, "com.ingka.ikea.inbox.impl.compose.components.ComposableSingletons$TopBarKt.lambda-1.<anonymous> (TopBar.kt:26)");
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
            a((C5842M) obj, (C4889m) obj2, ((Number) obj3).intValue());
            return C16807N.f139792a;
        }
    }

    public final q<C5842M, C4889m, Integer, C16807N> a() {
        return f103361b;
    }
}
