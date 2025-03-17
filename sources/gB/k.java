package gB;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ*\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"LgB/k;", "", "LgB/e;", "list", "", "LgB/g;", "items", "<init>", "(LgB/e;Ljava/util/List;)V", "a", "(LgB/e;Ljava/util/List;)LgB/k;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "LgB/e;", "d", "()LgB/e;", "b", "Ljava/util/List;", "c", "()Ljava/util/List;", "shoppinglist-datalayer_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class k {

    /* renamed from: a  reason: collision with root package name */
    private final C14503e f127296a;

    /* renamed from: b  reason: collision with root package name */
    private final List<C14505g> f127297b;

    public k(C14503e eVar, List<C14505g> list) {
        C17542s.j(eVar, "list");
        C17542s.j(list, "items");
        this.f127296a = eVar;
        this.f127297b = list;
    }

    public static /* synthetic */ k b(k kVar, C14503e eVar, List<C14505g> list, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            eVar = kVar.f127296a;
        }
        if ((i10 & 2) != 0) {
            list = kVar.f127297b;
        }
        return kVar.a(eVar, list);
    }

    public final k a(C14503e eVar, List<C14505g> list) {
        C17542s.j(eVar, "list");
        C17542s.j(list, "items");
        return new k(eVar, list);
    }

    public final List<C14505g> c() {
        return this.f127297b;
    }

    public final C14503e d() {
        return this.f127296a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return C17542s.e(this.f127296a, kVar.f127296a) && C17542s.e(this.f127297b, kVar.f127297b);
    }

    public int hashCode() {
        return (this.f127296a.hashCode() * 31) + this.f127297b.hashCode();
    }

    public String toString() {
        C14503e eVar = this.f127296a;
        List<C14505g> list = this.f127297b;
        return "ShoppingListWithItems(list=" + eVar + ", items=" + list + ")";
    }
}
