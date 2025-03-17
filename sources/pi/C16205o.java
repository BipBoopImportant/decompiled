package PI;

import DI.C15558e;
import TI.C16503g;
import kotlin.jvm.internal.C17542s;
import lJ.C17556c;

/* renamed from: PI.o  reason: case insensitive filesystem */
public final class C16205o implements C16204n {

    /* renamed from: a  reason: collision with root package name */
    public C17556c f137198a;

    public C15558e a(C16503g gVar) {
        C17542s.j(gVar, "javaClass");
        return b().b(gVar);
    }

    public final C17556c b() {
        C17556c cVar = this.f137198a;
        if (cVar != null) {
            return cVar;
        }
        C17542s.z("resolver");
        return null;
    }

    public final void c(C17556c cVar) {
        C17542s.j(cVar, "<set-?>");
        this.f137198a = cVar;
    }
}
