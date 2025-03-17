package MI;

import DI.C15555b;
import DI.C15574u;
import DI.C15579z;
import DI.y0;
import EI.C15644c;
import OI.C16163e;
import PI.C16197g;
import PI.C16201k;
import TI.C16495C;
import cJ.C17066c;
import java.util.Iterator;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class V {
    public static final C15644c a(C16201k kVar, C16495C c10) {
        Object obj;
        C17542s.j(kVar, "c");
        C17542s.j(c10, "wildcardType");
        if (c10.y() != null) {
            Iterator it = new C16197g(kVar, c10, false, 4, (DefaultConstructorMarker) null).iterator();
            loop0:
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                C15644c cVar = (C15644c) obj;
                C17066c[] f10 = C16041B.f();
                int length = f10.length;
                int i10 = 0;
                while (true) {
                    if (i10 < length) {
                        if (C17542s.e(cVar.f(), f10[i10])) {
                            break loop0;
                        }
                        i10++;
                    }
                }
            }
            return (C15644c) obj;
        }
        throw new IllegalArgumentException("Nullability annotations on unbounded wildcards aren't supported");
    }

    public static final boolean b(C15555b bVar) {
        C17542s.j(bVar, "memberDescriptor");
        return (bVar instanceof C15579z) && C17542s.e(bVar.T(C16163e.f136912H), Boolean.TRUE);
    }

    public static final boolean c(C16043D d10) {
        C17542s.j(d10, "javaTypeEnhancementState");
        return d10.c().invoke(C16041B.e()) == C16054O.STRICT;
    }

    public static final C15574u d(y0 y0Var) {
        C17542s.j(y0Var, "<this>");
        C15574u g10 = y.g(y0Var);
        C17542s.i(g10, "toDescriptorVisibility(...)");
        return g10;
    }
}
