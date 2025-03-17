package MI;

import AI.C15429j;
import DI.C15555b;
import DI.h0;
import VI.C16661C;
import cJ.C17069f;
import java.util.Map;
import kJ.C17506e;
import kotlin.jvm.internal.C17542s;

/* renamed from: MI.f  reason: case insensitive filesystem */
public final class C16062f extends U {

    /* renamed from: o  reason: collision with root package name */
    public static final C16062f f136372o = new C16062f();

    private C16062f() {
    }

    /* access modifiers changed from: private */
    public static final boolean l(h0 h0Var, C15555b bVar) {
        C17542s.j(bVar, "it");
        return U.f136347a.j().containsKey(C16661C.d(h0Var));
    }

    public final C17069f j(h0 h0Var) {
        C17542s.j(h0Var, "functionDescriptor");
        Map<String, C17069f> j10 = U.f136347a.j();
        String d10 = C16661C.d(h0Var);
        if (d10 == null) {
            return null;
        }
        return j10.get(d10);
    }

    public final boolean k(h0 h0Var) {
        C17542s.j(h0Var, "functionDescriptor");
        return C15429j.h0(h0Var) && C17506e.i(h0Var, false, new C16061e(h0Var), 1, (Object) null) != null;
    }

    public final boolean m(h0 h0Var) {
        C17542s.j(h0Var, "<this>");
        return C17542s.e(h0Var.getName().b(), "removeAt") && C17542s.e(C16661C.d(h0Var), U.f136347a.h().d());
    }
}
