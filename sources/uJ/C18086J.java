package uJ;

import java.util.HashSet;
import kotlin.jvm.internal.C17542s;
import yJ.C18740i;
import yJ.C18742k;
import yJ.n;
import yJ.o;

/* renamed from: uJ.J  reason: case insensitive filesystem */
public final class C18086J {
    public static final C18740i a(K0 k02, C18740i iVar) {
        C17542s.j(k02, "<this>");
        C17542s.j(iVar, "inlineClassType");
        return b(k02, iVar, new HashSet());
    }

    private static final C18740i b(K0 k02, C18740i iVar, HashSet<n> hashSet) {
        C18740i iVar2;
        C18740i q10;
        n f02 = k02.f0(iVar);
        if (!hashSet.add(f02)) {
            return null;
        }
        o h02 = k02.h0(f02);
        if (h02 != null) {
            C18740i S10 = k02.S(h02);
            iVar2 = b(k02, S10, hashSet);
            if (iVar2 == null) {
                return null;
            }
            boolean z10 = k02.L(k02.f0(S10)) || ((S10 instanceof C18742k) && k02.p0((C18742k) S10));
            if ((iVar2 instanceof C18742k) && k02.p0((C18742k) iVar2) && k02.F(iVar) && z10) {
                q10 = k02.q(S10);
            } else if (!k02.F(iVar2) && k02.d0(iVar)) {
                q10 = k02.q(iVar2);
            }
            return q10;
        } else if (!k02.L(f02)) {
            return iVar;
        } else {
            C18740i F02 = k02.F0(iVar);
            if (F02 == null || (iVar2 = b(k02, F02, hashSet)) == null) {
                return null;
            }
            if (k02.F(iVar)) {
                return k02.F(iVar2) ? iVar : (!(iVar2 instanceof C18742k) || !k02.p0((C18742k) iVar2)) ? k02.q(iVar2) : iVar;
            }
        }
        return iVar2;
    }
}
