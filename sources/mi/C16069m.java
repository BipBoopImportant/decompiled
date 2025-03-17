package MI;

import AI.C15429j;
import DI.C15555b;
import YH.C16877v;
import cJ.C17069f;
import java.util.Collection;
import kJ.C17506e;
import kotlin.jvm.internal.C17542s;

/* renamed from: MI.m  reason: case insensitive filesystem */
public final class C16069m {

    /* renamed from: a  reason: collision with root package name */
    public static final C16069m f136383a = new C16069m();

    private C16069m() {
    }

    /* access modifiers changed from: private */
    public static final boolean c(C15555b bVar) {
        C17542s.j(bVar, "it");
        return f136383a.d(bVar);
    }

    private final boolean e(C15555b bVar) {
        if (C16877v.l0(C16066j.f136376a.c(), C17506e.k(bVar)) && bVar.j().isEmpty()) {
            return true;
        }
        if (!C15429j.h0(bVar)) {
            return false;
        }
        Collection<? extends C15555b> e10 = bVar.e();
        C17542s.i(e10, "getOverriddenDescriptors(...)");
        Iterable<C15555b> iterable = e10;
        if (!((Collection) iterable).isEmpty()) {
            for (C15555b bVar2 : iterable) {
                C16069m mVar = f136383a;
                C17542s.g(bVar2);
                if (mVar.d(bVar2)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final String b(C15555b bVar) {
        C17069f fVar;
        C17542s.j(bVar, "<this>");
        C15429j.h0(bVar);
        C15555b i10 = C17506e.i(C17506e.w(bVar), false, C16068l.f136382a, 1, (Object) null);
        if (i10 == null || (fVar = C16066j.f136376a.a().get(C17506e.o(i10))) == null) {
            return null;
        }
        return fVar.b();
    }

    public final boolean d(C15555b bVar) {
        C17542s.j(bVar, "callableMemberDescriptor");
        if (!C16066j.f136376a.d().contains(bVar.getName())) {
            return false;
        }
        return e(bVar);
    }
}
