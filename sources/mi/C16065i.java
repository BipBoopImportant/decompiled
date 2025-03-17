package MI;

import DI.C15555b;
import DI.C15579z;
import MI.U;
import VI.C16661C;
import YH.C16877v;
import cJ.C17069f;
import kJ.C17506e;
import kotlin.jvm.internal.C17542s;

/* renamed from: MI.i  reason: case insensitive filesystem */
public final class C16065i extends U {

    /* renamed from: o  reason: collision with root package name */
    public static final C16065i f136375o = new C16065i();

    private C16065i() {
    }

    private final boolean k(C15555b bVar) {
        return C16877v.l0(U.f136347a.e(), C16661C.d(bVar));
    }

    public static final C15579z l(C15579z zVar) {
        C17542s.j(zVar, "functionDescriptor");
        C16065i iVar = f136375o;
        C17069f name = zVar.getName();
        C17542s.i(name, "getName(...)");
        if (!iVar.n(name)) {
            return null;
        }
        return (C15579z) C17506e.i(zVar, false, C16063g.f136373a, 1, (Object) null);
    }

    /* access modifiers changed from: private */
    public static final boolean m(C15555b bVar) {
        C17542s.j(bVar, "it");
        return f136375o.k(bVar);
    }

    public static final U.b o(C15555b bVar) {
        C15555b i10;
        String d10;
        C17542s.j(bVar, "<this>");
        U.a aVar = U.f136347a;
        if (!aVar.d().contains(bVar.getName()) || (i10 = C17506e.i(bVar, false, C16064h.f136374a, 1, (Object) null)) == null || (d10 = C16661C.d(i10)) == null) {
            return null;
        }
        return aVar.l(d10);
    }

    /* access modifiers changed from: private */
    public static final boolean p(C15555b bVar) {
        C17542s.j(bVar, "it");
        return (bVar instanceof C15579z) && f136375o.k(bVar);
    }

    public final boolean n(C17069f fVar) {
        C17542s.j(fVar, "<this>");
        return U.f136347a.d().contains(fVar);
    }
}
