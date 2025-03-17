package lJ;

import AI.C15435p;
import DI.C15555b;
import DI.C15557d;
import DI.C15558e;
import DI.C15561h;
import DI.C15566m;
import DI.C15573t;
import DI.n0;
import DI.u0;
import gJ.C17278i;
import gJ.C17280k;
import java.util.Collection;
import java.util.List;
import kJ.C17506e;
import kotlin.jvm.internal.C17542s;
import uJ.C18096U;
import zJ.C18755d;

/* renamed from: lJ.b  reason: case insensitive filesystem */
public final class C17555b {
    private static final boolean a(C15558e eVar) {
        return C17542s.e(C17506e.o(eVar), C15435p.f133045w);
    }

    private static final boolean b(C18096U u10, boolean z10) {
        C15561h e10 = u10.N0().e();
        n0 n0Var = e10 instanceof n0 ? (n0) e10 : null;
        if (n0Var == null) {
            return false;
        }
        return (z10 || !C17280k.d(n0Var)) && e(C18755d.o(n0Var));
    }

    public static final boolean c(C15566m mVar) {
        C17542s.j(mVar, "<this>");
        return C17280k.g(mVar) && !a((C15558e) mVar);
    }

    public static final boolean d(C18096U u10) {
        C17542s.j(u10, "<this>");
        C15561h e10 = u10.N0().e();
        if (e10 != null) {
            return (C17280k.b(e10) && c(e10)) || C17280k.i(u10);
        }
        return false;
    }

    private static final boolean e(C18096U u10) {
        return d(u10) || b(u10, true);
    }

    public static final boolean f(C15555b bVar) {
        C17542s.j(bVar, "descriptor");
        C15557d dVar = bVar instanceof C15557d ? (C15557d) bVar : null;
        if (dVar == null || C15573t.g(dVar.getVisibility())) {
            return false;
        }
        C15558e e02 = dVar.e0();
        C17542s.i(e02, "getConstructedClass(...)");
        if (C17280k.g(e02) || C17278i.G(dVar.e0())) {
            return false;
        }
        List<u0> j10 = dVar.j();
        C17542s.i(j10, "getValueParameters(...)");
        Iterable<u0> iterable = j10;
        if ((iterable instanceof Collection) && ((Collection) iterable).isEmpty()) {
            return false;
        }
        for (u0 type : iterable) {
            C18096U type2 = type.getType();
            C17542s.i(type2, "getType(...)");
            if (e(type2)) {
                return true;
            }
        }
        return false;
    }
}
