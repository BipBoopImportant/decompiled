package uJ;

import XH.t;
import kotlin.jvm.internal.C17542s;
import nI.C17642l;

public final class O0 {
    public static final C18096U a(C18096U u10) {
        C17542s.j(u10, "<this>");
        if (u10 instanceof N0) {
            return ((N0) u10).j0();
        }
        return null;
    }

    public static final P0 b(P0 p02, C18096U u10) {
        C17542s.j(p02, "<this>");
        C17542s.j(u10, "origin");
        return d(p02, a(u10));
    }

    public static final P0 c(P0 p02, C18096U u10, C17642l<? super C18096U, ? extends C18096U> lVar) {
        C17542s.j(p02, "<this>");
        C17542s.j(u10, "origin");
        C17542s.j(lVar, "transform");
        C18096U a10 = a(u10);
        return d(p02, a10 != null ? (C18096U) lVar.invoke(a10) : null);
    }

    public static final P0 d(P0 p02, C18096U u10) {
        C17542s.j(p02, "<this>");
        if (p02 instanceof N0) {
            return d(((N0) p02).H0(), u10);
        }
        if (u10 == null || C17542s.e(u10, p02)) {
            return p02;
        }
        if (p02 instanceof C18113f0) {
            return new C18119i0((C18113f0) p02, u10);
        }
        if (p02 instanceof C18087K) {
            return new C18089M((C18087K) p02, u10);
        }
        throw new t();
    }
}
