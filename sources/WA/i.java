package WA;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0019\u001a\u0004\b\u0015\u0010\u001aR\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0019\u001a\u0004\b\u001b\u0010\u001a¨\u0006\u001c"}, d2 = {"LWA/i;", "", "LWA/h;", "item", "", "LWA/c;", "articles", "LWA/e;", "salesPrices", "<init>", "(LWA/h;Ljava/util/List;Ljava/util/List;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "LWA/h;", "b", "()LWA/h;", "Ljava/util/List;", "()Ljava/util/List;", "c", "shoppinglist-datalayer-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class i {

    /* renamed from: a  reason: collision with root package name */
    private final h f117497a;

    /* renamed from: b  reason: collision with root package name */
    private final List<C13765c> f117498b;

    /* renamed from: c  reason: collision with root package name */
    private final List<C13767e> f117499c;

    public i(h hVar, List<C13765c> list, List<C13767e> list2) {
        C17542s.j(hVar, "item");
        C17542s.j(list, "articles");
        C17542s.j(list2, "salesPrices");
        this.f117497a = hVar;
        this.f117498b = list;
        this.f117499c = list2;
    }

    public final List<C13765c> a() {
        return this.f117498b;
    }

    public final h b() {
        return this.f117497a;
    }

    public final List<C13767e> c() {
        return this.f117499c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return C17542s.e(this.f117497a, iVar.f117497a) && C17542s.e(this.f117498b, iVar.f117498b) && C17542s.e(this.f117499c, iVar.f117499c);
    }

    public int hashCode() {
        return (((this.f117497a.hashCode() * 31) + this.f117498b.hashCode()) * 31) + this.f117499c.hashCode();
    }

    public String toString() {
        h hVar = this.f117497a;
        List<C13765c> list = this.f117498b;
        List<C13767e> list2 = this.f117499c;
        return "ShoppingListItemWithPricesAndArticlesHolder(item=" + hVar + ", articles=" + list + ", salesPrices=" + list2 + ")";
    }
}
