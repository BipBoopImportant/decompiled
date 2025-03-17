package us;

import U0.C4889m;
import U0.C4895p;
import XH.C16807N;
import androidx.compose.foundation.layout.J;
import androidx.compose.ui.d;
import c1.c;
import c2.h;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import nI.C17642l;
import nI.p;
import nI.q;
import s0.C5844O;
import ss.C;
import t0.C5938c;
import ys.C12503b;
import ys.C12506e;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* renamed from: us.a  reason: case insensitive filesystem */
public final class C12081a {

    /* renamed from: a  reason: collision with root package name */
    public static final C12081a f104050a = new C12081a();

    /* renamed from: b  reason: collision with root package name */
    private static q<C5938c, C4889m, Integer, C16807N> f104051b = c.c(517691802, false, C2482a.f104053a);

    /* renamed from: c  reason: collision with root package name */
    private static p<C4889m, Integer, C16807N> f104052c = c.c(1602985362, false, b.f104054a);

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: us.a$a  reason: collision with other inner class name */
    static final class C2482a implements q<C5938c, C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        public static final C2482a f104053a = new C2482a();

        C2482a() {
        }

        public final void a(C5938c cVar, C4889m mVar, int i10) {
            C17542s.j(cVar, "$this$item");
            if ((i10 & 17) != 16 || !mVar.l()) {
                if (C4895p.J()) {
                    C4895p.S(517691802, i10, -1, "com.ingka.ikea.inbox.impl.compose.content.ComposableSingletons$NotificationListContentKt.lambda-1.<anonymous> (NotificationListContent.kt:59)");
                }
                C5844O.a(J.i(d.f18749a, h.B((float) 24)), mVar, 6);
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

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: us.a$b */
    static final class b implements p<C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f104054a = new b();

        b() {
        }

        /* access modifiers changed from: private */
        public static final C16807N e(boolean z10) {
            return C16807N.f139792a;
        }

        /* access modifiers changed from: private */
        public static final C16807N f(C12503b bVar) {
            C17542s.j(bVar, "it");
            return C16807N.f139792a;
        }

        public final void c(C4889m mVar, int i10) {
            if ((i10 & 3) != 2 || !mVar.l()) {
                if (C4895p.J()) {
                    C4895p.S(1602985362, i10, -1, "com.ingka.ikea.inbox.impl.compose.content.ComposableSingletons$NotificationListContentKt.lambda-2.<anonymous> (NotificationListContent.kt:96)");
                }
                C12506e.a a10 = C.f102575a.a();
                mVar.W(1585944455);
                Object D10 = mVar.D();
                C4889m.a aVar = C4889m.f14007a;
                if (D10 == aVar.a()) {
                    D10 = new b();
                    mVar.u(D10);
                }
                C17642l lVar = (C17642l) D10;
                mVar.P();
                mVar.W(1585945319);
                Object D11 = mVar.D();
                if (D11 == aVar.a()) {
                    D11 = new c();
                    mVar.u(D11);
                }
                mVar.P();
                o.d("Notifications", a10, lVar, (C17642l) D11, J.f(d.f18749a, 0.0f, 1, (Object) null), mVar, 28038, 0);
                if (C4895p.J()) {
                    C4895p.R();
                    return;
                }
                return;
            }
            mVar.L();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            c((C4889m) obj, ((Number) obj2).intValue());
            return C16807N.f139792a;
        }
    }

    public final q<C5938c, C4889m, Integer, C16807N> a() {
        return f104051b;
    }
}
