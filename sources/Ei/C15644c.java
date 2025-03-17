package EI;

import DI.C15558e;
import DI.i0;
import cJ.C17066c;
import cJ.C17069f;
import iJ.C17373g;
import java.util.Map;
import kJ.C17506e;
import uJ.C18096U;
import wJ.C18230l;

/* renamed from: EI.c  reason: case insensitive filesystem */
public interface C15644c {

    /* renamed from: EI.c$a */
    public static final class a {
        public static C17066c a(C15644c cVar) {
            C15558e l10 = C17506e.l(cVar);
            if (l10 == null) {
                return null;
            }
            if (C18230l.m(l10)) {
                l10 = null;
            }
            if (l10 != null) {
                return C17506e.k(l10);
            }
            return null;
        }
    }

    Map<C17069f, C17373g<?>> a();

    C17066c f();

    C18096U getType();

    i0 i();
}
