package iB;

import com.ingka.ikea.core.model.product.ProductItem;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\fR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0017\u001a\u0004\b\u0014\u0010\u0019¨\u0006\u001a"}, d2 = {"LiB/b;", "", "", "listId", "", "Lcom/ingka/ikea/core/model/product/ProductItem;", "products", "LiB/a;", "inspirations", "<init>", "(Ljava/lang/String;Ljava/util/List;Ljava/util/List;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "Ljava/util/List;", "c", "()Ljava/util/List;", "shoppinglist-datalayer_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: iB.b  reason: case insensitive filesystem */
public final class C14550b {

    /* renamed from: a  reason: collision with root package name */
    private final String f127525a;

    /* renamed from: b  reason: collision with root package name */
    private final List<ProductItem> f127526b;

    /* renamed from: c  reason: collision with root package name */
    private final List<C14549a> f127527c;

    public C14550b(String str, List<ProductItem> list, List<C14549a> list2) {
        C17542s.j(str, "listId");
        C17542s.j(list, "products");
        C17542s.j(list2, "inspirations");
        this.f127525a = str;
        this.f127526b = list;
        this.f127527c = list2;
    }

    public final List<C14549a> a() {
        return this.f127527c;
    }

    public final String b() {
        return this.f127525a;
    }

    public final List<ProductItem> c() {
        return this.f127526b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C14550b)) {
            return false;
        }
        C14550b bVar = (C14550b) obj;
        return C17542s.e(this.f127525a, bVar.f127525a) && C17542s.e(this.f127526b, bVar.f127526b) && C17542s.e(this.f127527c, bVar.f127527c);
    }

    public int hashCode() {
        return (((this.f127525a.hashCode() * 31) + this.f127526b.hashCode()) * 31) + this.f127527c.hashCode();
    }

    public String toString() {
        String str = this.f127525a;
        List<ProductItem> list = this.f127526b;
        List<C14549a> list2 = this.f127527c;
        return "ShoppingListRecommendations(listId=" + str + ", products=" + list + ", inspirations=" + list2 + ")";
    }
}
