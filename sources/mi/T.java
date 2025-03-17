package MI;

import AI.C15429j;
import DI.C15554a;
import DI.C15555b;
import DI.C15558e;
import DI.C15566m;
import DI.Z;
import DI.a0;
import DI.h0;
import OI.C16161c;
import cJ.C17069f;
import gJ.C17278i;
import kJ.C17506e;
import kotlin.jvm.internal.C17542s;
import uJ.C18113f0;
import vJ.y;

public final class T {
    public static final boolean d(C15555b bVar) {
        C17542s.j(bVar, "<this>");
        return g(bVar) != null;
    }

    public static final String e(C15555b bVar) {
        C15555b w10;
        C17069f j10;
        C17542s.j(bVar, "callableMemberDescriptor");
        C15555b f10 = f(bVar);
        if (f10 == null || (w10 = C17506e.w(f10)) == null) {
            return null;
        }
        if (w10 instanceof a0) {
            return C16069m.f136383a.b(w10);
        }
        if (!(w10 instanceof h0) || (j10 = C16062f.f136372o.j((h0) w10)) == null) {
            return null;
        }
        return j10.b();
    }

    private static final C15555b f(C15555b bVar) {
        if (C15429j.h0(bVar)) {
            return g(bVar);
        }
        return null;
    }

    public static final <T extends C15555b> T g(T t10) {
        C17542s.j(t10, "<this>");
        if (!U.f136347a.g().contains(t10.getName()) && !C16066j.f136376a.d().contains(C17506e.w(t10).getName())) {
            return null;
        }
        if ((t10 instanceof a0) || (t10 instanceof Z)) {
            return C17506e.i(t10, false, C16055P.f136344a, 1, (Object) null);
        }
        if (t10 instanceof h0) {
            return C17506e.i(t10, false, C16056Q.f136345a, 1, (Object) null);
        }
        return null;
    }

    /* access modifiers changed from: private */
    public static final boolean h(C15555b bVar) {
        C17542s.j(bVar, "it");
        return C16069m.f136383a.d(C17506e.w(bVar));
    }

    /* access modifiers changed from: private */
    public static final boolean i(C15555b bVar) {
        C17542s.j(bVar, "it");
        return C16062f.f136372o.k((h0) bVar);
    }

    public static final <T extends C15555b> T j(T t10) {
        C17542s.j(t10, "<this>");
        T g10 = g(t10);
        if (g10 != null) {
            return g10;
        }
        C16065i iVar = C16065i.f136375o;
        C17069f name = t10.getName();
        C17542s.i(name, "getName(...)");
        if (!iVar.n(name)) {
            return null;
        }
        return C17506e.i(t10, false, S.f136346a, 1, (Object) null);
    }

    /* access modifiers changed from: private */
    public static final boolean k(C15555b bVar) {
        C17542s.j(bVar, "it");
        return C15429j.h0(bVar) && C16065i.o(bVar) != null;
    }

    public static final boolean l(C15558e eVar, C15554a aVar) {
        C17542s.j(eVar, "<this>");
        C17542s.j(aVar, "specialCallableDescriptor");
        C15566m b10 = aVar.b();
        C17542s.h(b10, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
        C18113f0 r10 = ((C15558e) b10).r();
        C17542s.i(r10, "getDefaultType(...)");
        for (C15558e s10 = C17278i.s(eVar); s10 != null; s10 = C17278i.s(s10)) {
            if (!(s10 instanceof C16161c) && y.b(s10.r(), r10) != null) {
                return !C15429j.h0(s10);
            }
        }
        return false;
    }

    public static final boolean m(C15555b bVar) {
        C17542s.j(bVar, "<this>");
        return C17506e.w(bVar).b() instanceof C16161c;
    }

    public static final boolean n(C15555b bVar) {
        C17542s.j(bVar, "<this>");
        return m(bVar) || C15429j.h0(bVar);
    }
}
