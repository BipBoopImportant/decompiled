package nn;

import com.ingka.ikea.core.model.product.ProductItem;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\r\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u000f\u001a\u00020\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lnn/f;", "", "Lcom/ingka/ikea/core/model/product/ProductItem;", "productItem", "", "inShoppingList", "<init>", "(Lcom/ingka/ikea/core/model/product/ProductItem;Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/ingka/ikea/core/model/product/ProductItem;", "()Lcom/ingka/ikea/core/model/product/ProductItem;", "b", "Z", "getInShoppingList", "()Z", "datalayer_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: nn.f  reason: case insensitive filesystem */
public final class C11660f {

    /* renamed from: a  reason: collision with root package name */
    private final ProductItem f99949a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f99950b;

    public C11660f(ProductItem productItem, boolean z10) {
        C17542s.j(productItem, "productItem");
        this.f99949a = productItem;
        this.f99950b = z10;
    }

    public final ProductItem a() {
        return this.f99949a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C11660f)) {
            return false;
        }
        C11660f fVar = (C11660f) obj;
        return C17542s.e(this.f99949a, fVar.f99949a) && this.f99950b == fVar.f99950b;
    }

    public int hashCode() {
        return (this.f99949a.hashCode() * 31) + Boolean.hashCode(this.f99950b);
    }

    public String toString() {
        ProductItem productItem = this.f99949a;
        boolean z10 = this.f99950b;
        return "ProductWithShoppingListData(productItem=" + productItem + ", inShoppingList=" + z10 + ")";
    }
}
