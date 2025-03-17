package JI;

import TI.C16497a;
import TI.C16503g;
import TI.u;
import YH.C16877v;
import cJ.C17066c;
import cJ.C17069f;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.C17542s;
import nI.C17642l;

/* renamed from: JI.B  reason: case insensitive filesystem */
public final class C15958B extends u implements u {

    /* renamed from: a  reason: collision with root package name */
    private final C17066c f135746a;

    public C15958B(C17066c cVar) {
        C17542s.j(cVar, "fqName");
        this.f135746a = cVar;
    }

    public boolean E() {
        return false;
    }

    public Collection<C16503g> G(C17642l<? super C17069f, Boolean> lVar) {
        C17542s.j(lVar, "nameFilter");
        return C16877v.n();
    }

    public boolean equals(Object obj) {
        return (obj instanceof C15958B) && C17542s.e(f(), ((C15958B) obj).f());
    }

    public C17066c f() {
        return this.f135746a;
    }

    public int hashCode() {
        return f().hashCode();
    }

    public String toString() {
        return C15958B.class.getName() + ": " + f();
    }

    public C16497a v(C17066c cVar) {
        C17542s.j(cVar, "fqName");
        return null;
    }

    public Collection<u> w() {
        return C16877v.n();
    }

    public List<C16497a> getAnnotations() {
        return C16877v.n();
    }
}
