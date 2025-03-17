package VI;

import AI.C15432m;
import CI.C15496c;
import UI.t0;
import cJ.C17065b;
import cJ.C17067d;
import java.util.Collection;
import kotlin.jvm.internal.C17542s;
import lJ.C17557d;
import lJ.C17558e;
import uJ.K0;
import yJ.C18740i;
import yJ.n;

/* renamed from: VI.J  reason: case insensitive filesystem */
public final class C16668J {
    public static final <T> T a(C16688t<T> tVar, T t10, boolean z10) {
        C17542s.j(tVar, "<this>");
        C17542s.j(t10, "possiblyPrimitiveType");
        return z10 ? tVar.c(t10) : t10;
    }

    public static final <T> T b(K0 k02, C18740i iVar, C16688t<T> tVar, C16667I i10) {
        C17542s.j(k02, "<this>");
        C17542s.j(iVar, "type");
        C17542s.j(tVar, "typeFactory");
        C17542s.j(i10, "mode");
        n f02 = k02.f0(iVar);
        if (!k02.l0(f02)) {
            return null;
        }
        C15432m z02 = k02.z0(f02);
        if (z02 != null) {
            return a(tVar, tVar.a(z02), k02.F(iVar) || t0.c(k02, iVar));
        }
        C15432m P10 = k02.P(f02);
        if (P10 != null) {
            return tVar.b('[' + C17558e.b(P10).m());
        }
        if (k02.E0(f02)) {
            C17067d k10 = k02.k(f02);
            C17065b n10 = k10 != null ? C15496c.f133492a.n(k10) : null;
            if (n10 != null) {
                if (!i10.a()) {
                    Iterable<C15496c.a> i11 = C15496c.f133492a.i();
                    if (!(i11 instanceof Collection) || !((Collection) i11).isEmpty()) {
                        for (C15496c.a d10 : i11) {
                            if (C17542s.e(d10.d(), n10)) {
                                return null;
                            }
                        }
                    }
                }
                String h10 = C17557d.h(n10);
                C17542s.i(h10, "internalNameByClassId(...)");
                return tVar.e(h10);
            }
        }
        return null;
    }
}
