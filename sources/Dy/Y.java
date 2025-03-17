package Dy;

import Oy.e;
import U0.C4889m;
import U0.C4895p;
import XH.C16807N;
import androidx.compose.foundation.layout.J;
import androidx.compose.ui.d;
import c1.c;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import nI.p;
import nI.q;
import s0.C5844O;
import t0.C5938c;
import tK.C18029u;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
public final class Y {

    /* renamed from: a  reason: collision with root package name */
    public static final Y f109190a = new Y();

    /* renamed from: b  reason: collision with root package name */
    private static q<C5938c, C4889m, Integer, C16807N> f109191b = c.c(585771426, false, a.f109193a);

    /* renamed from: c  reason: collision with root package name */
    private static p<C4889m, Integer, C16807N> f109192c = c.c(1069454072, false, b.f109194a);

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class a implements q<C5938c, C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f109193a = new a();

        a() {
        }

        public final void a(C5938c cVar, C4889m mVar, int i10) {
            C17542s.j(cVar, "$this$item");
            if ((i10 & 17) != 16 || !mVar.l()) {
                if (C4895p.J()) {
                    C4895p.S(585771426, i10, -1, "com.ingka.ikea.scanandgo.cart.impl.compose.ComposableSingletons$DeleteCouponScreenKt.lambda-1.<anonymous> (DeleteCouponScreen.kt:102)");
                }
                k0.A(mVar, 0);
                C5844O.a(J.t(J.h(d.f18749a, 0.0f, 1, (Object) null), C18029u.f147649a.a()), mVar, 0);
                k0.y(mVar, 0);
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
    static final class b implements p<C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f109194a = new b();

        @Metadata(d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Dy/Y$b$a", "LDy/Z;", "LOy/e$a;", "action", "LXH/N;", "a", "(LOy/e$a;)V", "LOy/e$b;", "uiAction", "b", "(LOy/e$b;)V", "cart-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class a implements Z {
            a() {
            }

            public void a(e.a aVar) {
                C17542s.j(aVar, "action");
            }

            public void b(e.b bVar) {
                C17542s.j(bVar, "uiAction");
            }
        }

        b() {
        }

        public final void a(C4889m mVar, int i10) {
            if ((i10 & 3) != 2 || !mVar.l()) {
                if (C4895p.J()) {
                    C4895p.S(1069454072, i10, -1, "com.ingka.ikea.scanandgo.cart.impl.compose.ComposableSingletons$DeleteCouponScreenKt.lambda-2.<anonymous> (DeleteCouponScreen.kt:225)");
                }
                k0.s(e.c.f113647d.a(), new a(), mVar, 0);
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

    public final q<C5938c, C4889m, Integer, C16807N> a() {
        return f109191b;
    }
}
