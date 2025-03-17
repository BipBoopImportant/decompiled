package gJ;

import DI.C15555b;
import java.util.Collection;
import kotlin.jvm.internal.C17542s;

/* renamed from: gJ.n  reason: case insensitive filesystem */
public abstract class C17283n {
    public abstract void a(C15555b bVar);

    public abstract void b(C15555b bVar, C15555b bVar2);

    public abstract void c(C15555b bVar, C15555b bVar2);

    public void d(C15555b bVar, Collection<? extends C15555b> collection) {
        C17542s.j(bVar, "member");
        C17542s.j(collection, "overridden");
        bVar.E0(collection);
    }
}
