package DI;

import kotlin.jvm.internal.C17542s;
import oJ.C17705g;

/* renamed from: DI.u  reason: case insensitive filesystem */
public abstract class C15574u {
    protected C15574u() {
    }

    public final Integer a(C15574u uVar) {
        C17542s.j(uVar, "visibility");
        return b().a(uVar.b());
    }

    public abstract y0 b();

    public abstract String c();

    public final boolean d() {
        return b().c();
    }

    public abstract boolean e(C17705g gVar, C15570q qVar, C15566m mVar, boolean z10);

    public abstract C15574u f();

    public final String toString() {
        return b().toString();
    }
}
