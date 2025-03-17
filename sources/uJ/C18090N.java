package uJ;

import XH.t;
import kotlin.jvm.internal.C17542s;

/* renamed from: uJ.N  reason: case insensitive filesystem */
public final class C18090N {
    public static final C18087K a(C18096U u10) {
        C17542s.j(u10, "<this>");
        P0 Q02 = u10.Q0();
        C17542s.h(Q02, "null cannot be cast to non-null type org.jetbrains.kotlin.types.FlexibleType");
        return (C18087K) Q02;
    }

    public static final boolean b(C18096U u10) {
        C17542s.j(u10, "<this>");
        return u10.Q0() instanceof C18087K;
    }

    public static final C18113f0 c(C18096U u10) {
        C17542s.j(u10, "<this>");
        P0 Q02 = u10.Q0();
        if (Q02 instanceof C18087K) {
            return ((C18087K) Q02).V0();
        }
        if (Q02 instanceof C18113f0) {
            return (C18113f0) Q02;
        }
        throw new t();
    }

    public static final C18113f0 d(C18096U u10) {
        C17542s.j(u10, "<this>");
        P0 Q02 = u10.Q0();
        if (Q02 instanceof C18087K) {
            return ((C18087K) Q02).W0();
        }
        if (Q02 instanceof C18113f0) {
            return (C18113f0) Q02;
        }
        throw new t();
    }
}
