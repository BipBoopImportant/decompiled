package EI;

import EI.C15649h;
import cJ.C17066c;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.C17542s;

/* renamed from: EI.i  reason: case insensitive filesystem */
public final class C15650i implements C15649h {

    /* renamed from: a  reason: collision with root package name */
    private final List<C15644c> f134234a;

    public C15650i(List<? extends C15644c> list) {
        C17542s.j(list, "annotations");
        this.f134234a = list;
    }

    public boolean f2(C17066c cVar) {
        return C15649h.b.b(this, cVar);
    }

    public boolean isEmpty() {
        return this.f134234a.isEmpty();
    }

    public Iterator<C15644c> iterator() {
        return this.f134234a.iterator();
    }

    public String toString() {
        return this.f134234a.toString();
    }

    public C15644c v(C17066c cVar) {
        return C15649h.b.a(this, cVar);
    }
}
