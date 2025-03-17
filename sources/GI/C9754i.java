package gi;

import com.ingka.ikea.core.model.product.ProductItem;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012¨\u0006\u0013"}, d2 = {"Lgi/i;", "", "Lcom/ingka/ikea/core/model/product/ProductItem$Price$PriceTag$Fee;", "fee", "<init>", "(Lcom/ingka/ikea/core/model/product/ProductItem$Price$PriceTag$Fee;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/ingka/ikea/core/model/product/ProductItem$Price$PriceTag$Fee;", "()Lcom/ingka/ikea/core/model/product/ProductItem$Price$PriceTag$Fee;", "productinformationpage-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: gi.i  reason: case insensitive filesystem */
public final class C9754i {

    /* renamed from: a  reason: collision with root package name */
    private final ProductItem.Price.PriceTag.Fee f73424a;

    public C9754i(ProductItem.Price.PriceTag.Fee fee) {
        C17542s.j(fee, "fee");
        this.f73424a = fee;
    }

    public final ProductItem.Price.PriceTag.Fee a() {
        return this.f73424a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C9754i) && C17542s.e(this.f73424a, ((C9754i) obj).f73424a);
    }

    public int hashCode() {
        return this.f73424a.hashCode();
    }

    public String toString() {
        ProductItem.Price.PriceTag.Fee fee = this.f73424a;
        return "FeeViewModel(fee=" + fee + ")";
    }
}
