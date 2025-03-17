package gB;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0017\u001a\u0004\b\u0013\u0010\u0018¨\u0006\u0019"}, d2 = {"LgB/i;", "", "LgB/h;", "itemWithPrices", "", "LgB/a;", "articles", "<init>", "(LgB/h;Ljava/util/List;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "LgB/h;", "b", "()LgB/h;", "Ljava/util/List;", "()Ljava/util/List;", "shoppinglist-datalayer_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: gB.i  reason: case insensitive filesystem */
public final class C14507i {

    /* renamed from: a  reason: collision with root package name */
    private final C14506h f127289a;

    /* renamed from: b  reason: collision with root package name */
    private final List<C14499a> f127290b;

    public C14507i(C14506h hVar, List<C14499a> list) {
        C17542s.j(hVar, "itemWithPrices");
        C17542s.j(list, "articles");
        this.f127289a = hVar;
        this.f127290b = list;
    }

    public final List<C14499a> a() {
        return this.f127290b;
    }

    public final C14506h b() {
        return this.f127289a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C14507i)) {
            return false;
        }
        C14507i iVar = (C14507i) obj;
        return C17542s.e(this.f127289a, iVar.f127289a) && C17542s.e(this.f127290b, iVar.f127290b);
    }

    public int hashCode() {
        return (this.f127289a.hashCode() * 31) + this.f127290b.hashCode();
    }

    public String toString() {
        C14506h hVar = this.f127289a;
        List<C14499a> list = this.f127290b;
        return "ShoppingListItemWithPricesAndArticles(itemWithPrices=" + hVar + ", articles=" + list + ")";
    }
}
