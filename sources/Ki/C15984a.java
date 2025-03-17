package KI;

import DI.C15544O;
import DI.C15558e;
import LI.C16015b;
import LI.C16016c;
import cJ.C17069f;
import kotlin.jvm.internal.C17542s;

/* renamed from: KI.a  reason: case insensitive filesystem */
public final class C15984a {
    public static final void a(C16016c cVar, C16015b bVar, C15558e eVar, C17069f fVar) {
        C17542s.j(cVar, "<this>");
        C17542s.j(bVar, "from");
        C17542s.j(eVar, "scopeOwner");
        C17542s.j(fVar, "name");
        if (cVar != C16016c.a.f136089a) {
            bVar.a();
        }
    }

    public static final void b(C16016c cVar, C16015b bVar, C15544O o10, C17069f fVar) {
        C17542s.j(cVar, "<this>");
        C17542s.j(bVar, "from");
        C17542s.j(o10, "scopeOwner");
        C17542s.j(fVar, "name");
        String a10 = o10.f().a();
        String b10 = fVar.b();
        C17542s.i(b10, "asString(...)");
        c(cVar, bVar, a10, b10);
    }

    public static final void c(C16016c cVar, C16015b bVar, String str, String str2) {
        C17542s.j(cVar, "<this>");
        C17542s.j(bVar, "from");
        C17542s.j(str, "packageFqName");
        C17542s.j(str2, "name");
        if (cVar != C16016c.a.f136089a) {
            bVar.a();
        }
    }
}
