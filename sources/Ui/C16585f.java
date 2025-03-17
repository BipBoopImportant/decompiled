package UI;

import EI.C15644c;
import EI.C15649h;
import YH.C16877v;
import cJ.C17066c;
import java.util.Iterator;
import kotlin.jvm.internal.C17542s;

/* renamed from: UI.f  reason: case insensitive filesystem */
final class C16585f implements C15649h {

    /* renamed from: a  reason: collision with root package name */
    private final C17066c f139021a;

    public C16585f(C17066c cVar) {
        C17542s.j(cVar, "fqNameToMatch");
        this.f139021a = cVar;
    }

    /* renamed from: b */
    public C16584e v(C17066c cVar) {
        C17542s.j(cVar, "fqName");
        if (C17542s.e(cVar, this.f139021a)) {
            return C16584e.f139019a;
        }
        return null;
    }

    public boolean f2(C17066c cVar) {
        return C15649h.b.b(this, cVar);
    }

    public boolean isEmpty() {
        return false;
    }

    public Iterator<C15644c> iterator() {
        return C16877v.n().iterator();
    }
}
