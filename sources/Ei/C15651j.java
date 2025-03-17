package EI;

import kotlin.jvm.internal.C17542s;

/* renamed from: EI.j  reason: case insensitive filesystem */
public final class C15651j {
    public static final C15649h a(C15649h hVar, C15649h hVar2) {
        C17542s.j(hVar, "first");
        C17542s.j(hVar2, "second");
        if (hVar.isEmpty()) {
            return hVar2;
        }
        if (hVar2.isEmpty()) {
            return hVar;
        }
        return new C15656o(hVar, hVar2);
    }
}
