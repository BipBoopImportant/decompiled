package RH;

import SH.C16416a;
import SH.g;
import XH.C16820k;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\n\n\u0002\b\u0004\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0013\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\u0002¢\u0006\u0004\b\u0004\u0010\u0003¨\u0006\u0005"}, d2 = {"LRH/n;", "", "a", "(LRH/n;)S", "b", "ktor-io"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class q {
    public static final short a(n nVar) {
        C17542s.j(nVar, "<this>");
        if (nVar.U() - nVar.f0() <= 2) {
            return b(nVar);
        }
        int f02 = nVar.f0();
        nVar.Q0(f02 + 2);
        return nVar.e0().getShort(f02);
    }

    private static final short b(n nVar) {
        C16416a b10 = g.b(nVar, 2);
        if (b10 != null) {
            short c10 = C16373f.c(b10);
            g.a(nVar, b10);
            return c10;
        }
        w.a(2);
        throw new C16820k();
    }
}
