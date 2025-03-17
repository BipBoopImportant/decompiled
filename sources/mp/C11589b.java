package mp;

import com.ingka.ikea.core.model.inspiration.Coordinates;
import com.ingka.ikea.core.model.product.ProductItem;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017¨\u0006\u0018"}, d2 = {"Lmp/b;", "", "Lcom/ingka/ikea/core/model/inspiration/Coordinates;", "coordinates", "Lcom/ingka/ikea/core/model/product/ProductItem;", "productItem", "<init>", "(Lcom/ingka/ikea/core/model/inspiration/Coordinates;Lcom/ingka/ikea/core/model/product/ProductItem;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/ingka/ikea/core/model/inspiration/Coordinates;", "()Lcom/ingka/ikea/core/model/inspiration/Coordinates;", "b", "Lcom/ingka/ikea/core/model/product/ProductItem;", "()Lcom/ingka/ikea/core/model/product/ProductItem;", "model_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: mp.b  reason: case insensitive filesystem */
public final class C11589b {

    /* renamed from: a  reason: collision with root package name */
    private final Coordinates f99645a;

    /* renamed from: b  reason: collision with root package name */
    private final ProductItem f99646b;

    public C11589b(Coordinates coordinates, ProductItem productItem) {
        C17542s.j(productItem, "productItem");
        this.f99645a = coordinates;
        this.f99646b = productItem;
    }

    public final Coordinates a() {
        return this.f99645a;
    }

    public final ProductItem b() {
        return this.f99646b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C11589b)) {
            return false;
        }
        C11589b bVar = (C11589b) obj;
        return C17542s.e(this.f99645a, bVar.f99645a) && C17542s.e(this.f99646b, bVar.f99646b);
    }

    public int hashCode() {
        Coordinates coordinates = this.f99645a;
        return ((coordinates == null ? 0 : coordinates.hashCode()) * 31) + this.f99646b.hashCode();
    }

    public String toString() {
        Coordinates coordinates = this.f99645a;
        ProductItem productItem = this.f99646b;
        return "ProductWithCoordinates(coordinates=" + coordinates + ", productItem=" + productItem + ")";
    }
}
