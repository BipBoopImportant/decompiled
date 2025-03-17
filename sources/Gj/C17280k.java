package gJ;

import DI.C15530A;
import DI.C15539J;
import DI.C15554a;
import DI.C15558e;
import DI.C15561h;
import DI.C15566m;
import DI.a0;
import DI.b0;
import DI.s0;
import DI.v0;
import cJ.C17065b;
import cJ.C17066c;
import cJ.C17069f;
import kJ.C17506e;
import kotlin.jvm.internal.C17542s;
import uJ.C18096U;
import uJ.C18113f0;
import uJ.J0;
import uJ.Q0;
import vJ.u;

/* renamed from: gJ.k  reason: case insensitive filesystem */
public final class C17280k {

    /* renamed from: a  reason: collision with root package name */
    private static final C17066c f143307a;

    /* renamed from: b  reason: collision with root package name */
    private static final C17065b f143308b;

    static {
        C17066c cVar = new C17066c("kotlin.jvm.JvmInline");
        f143307a = cVar;
        f143308b = C17065b.f141241d.c(cVar);
    }

    public static final boolean a(C15554a aVar) {
        C17542s.j(aVar, "<this>");
        if (aVar instanceof b0) {
            a0 W10 = ((b0) aVar).W();
            C17542s.i(W10, "getCorrespondingProperty(...)");
            if (f(W10)) {
                return true;
            }
        }
        return false;
    }

    public static final boolean b(C15566m mVar) {
        C17542s.j(mVar, "<this>");
        return (mVar instanceof C15558e) && (((C15558e) mVar).V() instanceof C15530A);
    }

    public static final boolean c(C18096U u10) {
        C17542s.j(u10, "<this>");
        C15561h e10 = u10.N0().e();
        if (e10 != null) {
            return b(e10);
        }
        return false;
    }

    public static final boolean d(C15566m mVar) {
        C17542s.j(mVar, "<this>");
        return (mVar instanceof C15558e) && (((C15558e) mVar).V() instanceof C15539J);
    }

    public static final boolean e(v0 v0Var) {
        C15530A<C18113f0> q10;
        C17542s.j(v0Var, "<this>");
        if (v0Var.O() == null) {
            C15566m b10 = v0Var.b();
            C17069f fVar = null;
            C15558e eVar = b10 instanceof C15558e ? (C15558e) b10 : null;
            if (!(eVar == null || (q10 = C17506e.q(eVar)) == null)) {
                fVar = q10.c();
            }
            if (C17542s.e(fVar, v0Var.getName())) {
                return true;
            }
        }
        return false;
    }

    public static final boolean f(v0 v0Var) {
        s0<C18113f0> V10;
        C17542s.j(v0Var, "<this>");
        if (v0Var.O() == null) {
            C15566m b10 = v0Var.b();
            C15558e eVar = b10 instanceof C15558e ? (C15558e) b10 : null;
            if (!(eVar == null || (V10 = eVar.V()) == null)) {
                C17069f name = v0Var.getName();
                C17542s.i(name, "getName(...)");
                if (V10.a(name)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static final boolean g(C15566m mVar) {
        C17542s.j(mVar, "<this>");
        return b(mVar) || d(mVar);
    }

    public static final boolean h(C18096U u10) {
        C17542s.j(u10, "<this>");
        C15561h e10 = u10.N0().e();
        if (e10 != null) {
            return g(e10);
        }
        return false;
    }

    public static final boolean i(C18096U u10) {
        C17542s.j(u10, "<this>");
        C15561h e10 = u10.N0().e();
        return e10 != null && d(e10) && !u.f149076a.F(u10);
    }

    public static final C18096U j(C18096U u10) {
        C17542s.j(u10, "<this>");
        C18096U k10 = k(u10);
        if (k10 != null) {
            return J0.f(u10).p(k10, Q0.INVARIANT);
        }
        return null;
    }

    public static final C18096U k(C18096U u10) {
        C15530A<C18113f0> q10;
        C17542s.j(u10, "<this>");
        C15561h e10 = u10.N0().e();
        C15558e eVar = e10 instanceof C15558e ? (C15558e) e10 : null;
        if (eVar == null || (q10 = C17506e.q(eVar)) == null) {
            return null;
        }
        return q10.d();
    }
}
