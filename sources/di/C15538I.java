package DI;

import AI.C15429j;
import cJ.C17066c;
import cJ.C17069f;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.C17542s;
import nI.C17642l;

/* renamed from: DI.I  reason: case insensitive filesystem */
public interface C15538I extends C15566m {

    /* renamed from: DI.I$a */
    public static final class a {
        public static <R, D> R a(C15538I i10, C15568o<R, D> oVar, D d10) {
            C17542s.j(oVar, "visitor");
            return oVar.l(i10, d10);
        }

        public static C15566m b(C15538I i10) {
            return null;
        }
    }

    List<C15538I> A0();

    <T> T l0(C15537H<T> h10);

    C15429j p();

    Collection<C17066c> s(C17066c cVar, C17642l<? super C17069f, Boolean> lVar);

    C15551W v0(C17066c cVar);

    boolean z(C15538I i10);
}
