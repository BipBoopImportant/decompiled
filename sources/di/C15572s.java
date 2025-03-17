package DI;

import BJ.t;
import LI.C16015b;
import cJ.C17066c;
import gJ.C17280k;
import kotlin.jvm.internal.C17542s;
import nJ.C17656k;
import uJ.C18096U;
import uJ.C18113f0;
import zJ.C18755d;

/* renamed from: DI.s  reason: case insensitive filesystem */
public final class C15572s {
    public static final C15561h a(C15566m mVar) {
        C17542s.j(mVar, "<this>");
        C15566m b10 = mVar.b();
        if (b10 == null || (mVar instanceof C15544O)) {
            return null;
        }
        if (!b(b10)) {
            return a(b10);
        }
        if (b10 instanceof C15561h) {
            return (C15561h) b10;
        }
        return null;
    }

    public static final boolean b(C15566m mVar) {
        C17542s.j(mVar, "<this>");
        return mVar.b() instanceof C15544O;
    }

    public static final boolean c(C15579z zVar) {
        C18113f0 r10;
        C18096U D10;
        C18096U returnType;
        C17542s.j(zVar, "<this>");
        C15566m b10 = zVar.b();
        C15558e eVar = null;
        C15558e eVar2 = b10 instanceof C15558e ? (C15558e) b10 : null;
        if (eVar2 == null) {
            return false;
        }
        if (C17280k.g(eVar2)) {
            eVar = eVar2;
        }
        if (eVar == null || (r10 = eVar.r()) == null || (D10 = C18755d.D(r10)) == null || (returnType = zVar.getReturnType()) == null || !C17542s.e(zVar.getName(), t.f133373e)) {
            return false;
        }
        if ((!C18755d.s(returnType) && !C18755d.t(returnType)) || zVar.j().size() != 1) {
            return false;
        }
        C18096U type = zVar.j().get(0).getType();
        C17542s.i(type, "getType(...)");
        return C17542s.e(C18755d.D(type), D10) && zVar.y0().isEmpty() && zVar.O() == null;
    }

    public static final C15558e d(C15538I i10, C17066c cVar, C16015b bVar) {
        C17656k U10;
        C17542s.j(i10, "<this>");
        C17542s.j(cVar, "fqName");
        C17542s.j(bVar, "lookupLocation");
        if (cVar.c()) {
            return null;
        }
        C15561h e10 = i10.v0(cVar.d()).q().e(cVar.f(), bVar);
        C15558e eVar = e10 instanceof C15558e ? (C15558e) e10 : null;
        if (eVar != null) {
            return eVar;
        }
        C15558e d10 = d(i10, cVar.d(), bVar);
        C15540K e11 = (d10 == null || (U10 = d10.U()) == null) ? null : U10.e(cVar.f(), bVar);
        if (e11 instanceof C15558e) {
            return (C15558e) e11;
        }
        return null;
    }
}
