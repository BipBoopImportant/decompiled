package ZI;

import kotlin.jvm.internal.C17542s;

public final class i {
    public static final boolean a(C17004a aVar) {
        C17542s.j(aVar, "version");
        return (aVar.a() == 1 && aVar.b() >= 4) || aVar.a() > 1;
    }

    public static final boolean b(C17004a aVar) {
        C17542s.j(aVar, "version");
        return a(aVar);
    }
}
