package EI;

import cJ.C17066c;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import kotlin.jvm.internal.C17542s;
import nI.C17642l;

/* renamed from: EI.p  reason: case insensitive filesystem */
public final class C15657p implements C15649h {

    /* renamed from: a  reason: collision with root package name */
    private final C15649h f134244a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f134245b;

    /* renamed from: c  reason: collision with root package name */
    private final C17642l<C17066c, Boolean> f134246c;

    public C15657p(C15649h hVar, boolean z10, C17642l<? super C17066c, Boolean> lVar) {
        C17542s.j(hVar, "delegate");
        C17542s.j(lVar, "fqNameFilter");
        this.f134244a = hVar;
        this.f134245b = z10;
        this.f134246c = lVar;
    }

    private final boolean b(C15644c cVar) {
        C17066c f10 = cVar.f();
        return f10 != null && this.f134246c.invoke(f10).booleanValue();
    }

    public boolean f2(C17066c cVar) {
        C17542s.j(cVar, "fqName");
        if (this.f134246c.invoke(cVar).booleanValue()) {
            return this.f134244a.f2(cVar);
        }
        return false;
    }

    public boolean isEmpty() {
        boolean z10;
        C15649h hVar = this.f134244a;
        if (!(hVar instanceof Collection) || !((Collection) hVar).isEmpty()) {
            Iterator it = hVar.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (b((C15644c) it.next())) {
                        z10 = true;
                        break;
                    }
                } else {
                    break;
                }
            }
        }
        z10 = false;
        return this.f134245b ? !z10 : z10;
    }

    public Iterator<C15644c> iterator() {
        C15649h hVar = this.f134244a;
        ArrayList arrayList = new ArrayList();
        for (Object next : hVar) {
            if (b((C15644c) next)) {
                arrayList.add(next);
            }
        }
        return arrayList.iterator();
    }

    public C15644c v(C17066c cVar) {
        C17542s.j(cVar, "fqName");
        if (this.f134246c.invoke(cVar).booleanValue()) {
            return this.f134244a.v(cVar);
        }
        return null;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C15657p(C15649h hVar, C17642l<? super C17066c, Boolean> lVar) {
        this(hVar, false, lVar);
        C17542s.j(hVar, "delegate");
        C17542s.j(lVar, "fqNameFilter");
    }
}
