package VI;

import EJ.C15662c;
import cJ.C17065b;
import kotlin.jvm.internal.C17542s;
import qJ.C17821i;
import qJ.C17822j;

/* renamed from: VI.o  reason: case insensitive filesystem */
public final class C16683o implements C17822j {

    /* renamed from: a  reason: collision with root package name */
    private final C16690v f139398a;

    /* renamed from: b  reason: collision with root package name */
    private final C16682n f139399b;

    public C16683o(C16690v vVar, C16682n nVar) {
        C17542s.j(vVar, "kotlinClassFinder");
        C17542s.j(nVar, "deserializedDescriptorResolver");
        this.f139398a = vVar;
        this.f139399b = nVar;
    }

    public C17821i a(C17065b bVar) {
        C17542s.j(bVar, "classId");
        C16692x b10 = C16691w.b(this.f139398a, bVar, C15662c.a(this.f139399b.f().g()));
        if (b10 == null) {
            return null;
        }
        C17542s.e(b10.k(), bVar);
        return this.f139399b.l(b10);
    }
}
