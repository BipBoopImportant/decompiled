package II;

import DI.C15555b;
import DI.C15558e;
import java.util.List;
import kotlin.jvm.internal.C17542s;
import qJ.C17835w;

/* renamed from: II.j  reason: case insensitive filesystem */
public final class C15901j implements C17835w {

    /* renamed from: b  reason: collision with root package name */
    public static final C15901j f135489b = new C15901j();

    private C15901j() {
    }

    public void a(C15555b bVar) {
        C17542s.j(bVar, "descriptor");
        throw new IllegalStateException("Cannot infer visibility for " + bVar);
    }

    public void b(C15558e eVar, List<String> list) {
        C17542s.j(eVar, "descriptor");
        C17542s.j(list, "unresolvedSuperClasses");
        throw new IllegalStateException("Incomplete hierarchy for class " + eVar.getName() + ", unresolved classes " + list);
    }
}
