package nn;

import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\rR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0016\u001a\u0004\b\u0018\u0010\rR\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0019\u0010\u001bR\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00020\b8\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u001c\u001a\u0004\b\u0015\u0010\u001d¨\u0006\u001e"}, d2 = {"Lnn/g;", "", "", "id", "title", "", "Lnn/f;", "products", "", "allProductsInShoppingLists", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/Set;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "d", "c", "Ljava/util/List;", "()Ljava/util/List;", "Ljava/util/Set;", "()Ljava/util/Set;", "datalayer_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: nn.g  reason: case insensitive filesystem */
public final class C11661g {

    /* renamed from: a  reason: collision with root package name */
    private final String f99951a;

    /* renamed from: b  reason: collision with root package name */
    private final String f99952b;

    /* renamed from: c  reason: collision with root package name */
    private final List<C11660f> f99953c;

    /* renamed from: d  reason: collision with root package name */
    private final Set<String> f99954d;

    public C11661g(String str, String str2, List<C11660f> list, Set<String> set) {
        C17542s.j(str, "id");
        C17542s.j(str2, "title");
        C17542s.j(list, "products");
        C17542s.j(set, "allProductsInShoppingLists");
        this.f99951a = str;
        this.f99952b = str2;
        this.f99953c = list;
        this.f99954d = set;
    }

    public final Set<String> a() {
        return this.f99954d;
    }

    public final String b() {
        return this.f99951a;
    }

    public final List<C11660f> c() {
        return this.f99953c;
    }

    public final String d() {
        return this.f99952b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C11661g)) {
            return false;
        }
        C11661g gVar = (C11661g) obj;
        return C17542s.e(this.f99951a, gVar.f99951a) && C17542s.e(this.f99952b, gVar.f99952b) && C17542s.e(this.f99953c, gVar.f99953c) && C17542s.e(this.f99954d, gVar.f99954d);
    }

    public int hashCode() {
        return (((((this.f99951a.hashCode() * 31) + this.f99952b.hashCode()) * 31) + this.f99953c.hashCode()) * 31) + this.f99954d.hashCode();
    }

    public String toString() {
        String str = this.f99951a;
        String str2 = this.f99952b;
        List<C11660f> list = this.f99953c;
        Set<String> set = this.f99954d;
        return "PromotionWithShoppingListData(id=" + str + ", title=" + str2 + ", products=" + list + ", allProductsInShoppingLists=" + set + ")";
    }
}
