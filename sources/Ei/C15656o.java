package EI;

import GJ.C15765h;
import GJ.C15768k;
import YH.C16870n;
import YH.C16877v;
import cJ.C17066c;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.C17542s;

/* renamed from: EI.o  reason: case insensitive filesystem */
public final class C15656o implements C15649h {

    /* renamed from: a  reason: collision with root package name */
    private final List<C15649h> f134243a;

    public C15656o(List<? extends C15649h> list) {
        C17542s.j(list, "delegates");
        this.f134243a = list;
    }

    /* access modifiers changed from: private */
    public static final C15644c k(C17066c cVar, C15649h hVar) {
        C17542s.j(hVar, "it");
        return hVar.v(cVar);
    }

    /* access modifiers changed from: private */
    public static final C15765h m(C15649h hVar) {
        C17542s.j(hVar, "it");
        return C16877v.h0(hVar);
    }

    public boolean f2(C17066c cVar) {
        C17542s.j(cVar, "fqName");
        for (C15649h f22 : C16877v.h0(this.f134243a)) {
            if (f22.f2(cVar)) {
                return true;
            }
        }
        return false;
    }

    public boolean isEmpty() {
        Iterable<C15649h> iterable = this.f134243a;
        if ((iterable instanceof Collection) && ((Collection) iterable).isEmpty()) {
            return true;
        }
        for (C15649h isEmpty : iterable) {
            if (!isEmpty.isEmpty()) {
                return false;
            }
        }
        return true;
    }

    public Iterator<C15644c> iterator() {
        return C15768k.M(C16877v.h0(this.f134243a), C15655n.f134242a).iterator();
    }

    public C15644c v(C17066c cVar) {
        C17542s.j(cVar, "fqName");
        return (C15644c) C15768k.L(C15768k.T(C16877v.h0(this.f134243a), new C15654m(cVar)));
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C15656o(C15649h... hVarArr) {
        this((List<? extends C15649h>) C16870n.c1(hVarArr));
        C17542s.j(hVarArr, "delegates");
    }
}
