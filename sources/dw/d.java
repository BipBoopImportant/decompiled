package Dw;

import com.ingka.ikea.core.model.product.ProductItem;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\b\u0018\u00002\u00020\u0001B\u001d\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u0018¨\u0006\u0019"}, d2 = {"LDw/d;", "", "", "Lcom/ingka/ikea/core/model/product/ProductItem;", "products", "", "totalPrice", "<init>", "(Ljava/util/List;D)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/List;", "()Ljava/util/List;", "b", "D", "()D", "ongoinginstoreordersrepository_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class d {

    /* renamed from: a  reason: collision with root package name */
    private final List<ProductItem> f109091a;

    /* renamed from: b  reason: collision with root package name */
    private final double f109092b;

    public d(List<ProductItem> list, double d10) {
        C17542s.j(list, "products");
        this.f109091a = list;
        this.f109092b = d10;
    }

    public final List<ProductItem> a() {
        return this.f109091a;
    }

    public final double b() {
        return this.f109092b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return C17542s.e(this.f109091a, dVar.f109091a) && Double.compare(this.f109092b, dVar.f109092b) == 0;
    }

    public int hashCode() {
        return (this.f109091a.hashCode() * 31) + Double.hashCode(this.f109092b);
    }

    public String toString() {
        List<ProductItem> list = this.f109091a;
        double d10 = this.f109092b;
        return "PurchaseInformation(products=" + list + ", totalPrice=" + d10 + ")";
    }
}
