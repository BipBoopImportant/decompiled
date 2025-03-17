package WA;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0017\u001a\u0004\b\u0013\u0010\u0018¨\u0006\u0019"}, d2 = {"LWA/k;", "", "LWA/f;", "list", "", "LWA/h;", "items", "<init>", "(LWA/f;Ljava/util/List;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "LWA/f;", "b", "()LWA/f;", "Ljava/util/List;", "()Ljava/util/List;", "shoppinglist-datalayer-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class k {

    /* renamed from: a  reason: collision with root package name */
    private final C13768f f117502a;

    /* renamed from: b  reason: collision with root package name */
    private final List<h> f117503b;

    public k(C13768f fVar, List<h> list) {
        C17542s.j(fVar, "list");
        C17542s.j(list, "items");
        this.f117502a = fVar;
        this.f117503b = list;
    }

    public final List<h> a() {
        return this.f117503b;
    }

    public final C13768f b() {
        return this.f117502a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return C17542s.e(this.f117502a, kVar.f117502a) && C17542s.e(this.f117503b, kVar.f117503b);
    }

    public int hashCode() {
        return (this.f117502a.hashCode() * 31) + this.f117503b.hashCode();
    }

    public String toString() {
        C13768f fVar = this.f117502a;
        List<h> list = this.f117503b;
        return "ShoppingListWithItemsHolder(list=" + fVar + ", items=" + list + ")";
    }
}
