package VI;

import AI.C15435p;
import CI.C15496c;
import DI.C15554a;
import DI.C15555b;
import DI.C15558e;
import DI.C15565l;
import DI.C15566m;
import DI.C15579z;
import DI.d0;
import DI.h0;
import DI.u0;
import MI.C16065i;
import MI.T;
import VI.C16687s;
import YH.C16877v;
import cJ.C17065b;
import gJ.C17278i;
import java.util.List;
import kJ.C17506e;
import kotlin.jvm.internal.C17542s;
import lJ.C17557d;
import lJ.C17558e;
import nI.q;
import uJ.C18096U;

/* renamed from: VI.C  reason: case insensitive filesystem */
public final class C16661C {
    private static final void a(StringBuilder sb2, C18096U u10) {
        sb2.append(g(u10));
    }

    public static final String b(C15579z zVar, boolean z10, boolean z11) {
        String str;
        C17542s.j(zVar, "<this>");
        StringBuilder sb2 = new StringBuilder();
        if (z11) {
            if (zVar instanceof C15565l) {
                str = "<init>";
            } else {
                str = zVar.getName().b();
                C17542s.i(str, "asString(...)");
            }
            sb2.append(str);
        }
        sb2.append("(");
        d0 O10 = zVar.O();
        if (O10 != null) {
            C18096U type = O10.getType();
            C17542s.i(type, "getType(...)");
            a(sb2, type);
        }
        for (u0 type2 : zVar.j()) {
            C18096U type3 = type2.getType();
            C17542s.i(type3, "getType(...)");
            a(sb2, type3);
        }
        sb2.append(")");
        if (z10) {
            if (C16678j.c(zVar)) {
                sb2.append("V");
            } else {
                C18096U returnType = zVar.getReturnType();
                C17542s.g(returnType);
                a(sb2, returnType);
            }
        }
        return sb2.toString();
    }

    public static /* synthetic */ String c(C15579z zVar, boolean z10, boolean z11, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = true;
        }
        if ((i10 & 2) != 0) {
            z11 = true;
        }
        return b(zVar, z10, z11);
    }

    public static final String d(C15554a aVar) {
        C17542s.j(aVar, "<this>");
        C16664F f10 = C16664F.f139318a;
        if (C17278i.E(aVar)) {
            return null;
        }
        C15566m b10 = aVar.b();
        C15558e eVar = b10 instanceof C15558e ? (C15558e) b10 : null;
        if (eVar == null || eVar.getName().B()) {
            return null;
        }
        C15554a a10 = aVar.a();
        h0 h0Var = a10 instanceof h0 ? (h0) a10 : null;
        if (h0Var == null) {
            return null;
        }
        return C16660B.a(f10, eVar, c(h0Var, false, false, 3, (Object) null));
    }

    public static final boolean e(C15554a aVar) {
        C15579z l10;
        C17542s.j(aVar, "f");
        if (!(aVar instanceof C15579z)) {
            return false;
        }
        C15579z zVar = (C15579z) aVar;
        if (!C17542s.e(zVar.getName().b(), "remove") || zVar.j().size() != 1 || T.n((C15555b) aVar)) {
            return false;
        }
        List<u0> j10 = zVar.a().j();
        C17542s.i(j10, "getValueParameters(...)");
        C18096U type = ((u0) C16877v.b1(j10)).getType();
        C17542s.i(type, "getType(...)");
        C16687s g10 = g(type);
        C17558e eVar = null;
        C16687s.d dVar = g10 instanceof C16687s.d ? (C16687s.d) g10 : null;
        if (dVar != null) {
            eVar = dVar.i();
        }
        if (eVar != C17558e.INT || (l10 = C16065i.l(zVar)) == null) {
            return false;
        }
        List<u0> j11 = l10.a().j();
        C17542s.i(j11, "getValueParameters(...)");
        C18096U type2 = ((u0) C16877v.b1(j11)).getType();
        C17542s.i(type2, "getType(...)");
        C16687s g11 = g(type2);
        C15566m b10 = l10.b();
        C17542s.i(b10, "getContainingDeclaration(...)");
        return C17542s.e(C17506e.p(b10), C15435p.a.f133101f0.i()) && (g11 instanceof C16687s.c) && C17542s.e(((C16687s.c) g11).i(), "java/lang/Object");
    }

    public static final String f(C15558e eVar) {
        C17542s.j(eVar, "<this>");
        C17065b n10 = C15496c.f133492a.n(C17506e.o(eVar).i());
        if (n10 == null) {
            return C16678j.b(eVar, (C16665G) null, 2, (Object) null);
        }
        String h10 = C17557d.h(n10);
        C17542s.i(h10, "internalNameByClassId(...)");
        return h10;
    }

    public static final C16687s g(C18096U u10) {
        C17542s.j(u10, "<this>");
        return (C16687s) C16678j.e(u10, C16689u.f139420a, C16667I.f139324o, C16666H.f139319a, (C16685q) null, (q) null, 32, (Object) null);
    }
}
