package br;

import U0.C4889m;
import U0.C4895p;
import XH.C16807N;
import androidx.compose.foundation.layout.D;
import androidx.compose.ui.d;
import c1.c;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import nI.q;
import t0.C5938c;
import tK.C18029u;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* renamed from: br.a  reason: case insensitive filesystem */
public final class C11120a {

    /* renamed from: a  reason: collision with root package name */
    public static final C11120a f90613a = new C11120a();

    /* renamed from: b  reason: collision with root package name */
    private static q<C5938c, C4889m, Integer, C16807N> f90614b = c.c(-1239083167, false, C1976a.f90615a);

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: br.a$a  reason: collision with other inner class name */
    static final class C1976a implements q<C5938c, C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        public static final C1976a f90615a = new C1976a();

        C1976a() {
        }

        public final void a(C5938c cVar, C4889m mVar, int i10) {
            C17542s.j(cVar, "$this$item");
            if ((i10 & 17) != 16 || !mVar.l()) {
                if (C4895p.J()) {
                    C4895p.S(-1239083167, i10, -1, "com.ingka.ikea.familyrewards.implementation.compose.history.content.ComposableSingletons$RewardsHistoryContentKt.lambda-1.<anonymous> (RewardsHistoryContent.kt:60)");
                }
                p.g(D.k(d.f18749a, C18029u.f147649a.a(), 0.0f, 2, (Object) null), mVar, 0, 0);
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
        return f90614b;
    }
}
