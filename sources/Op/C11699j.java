package op;

import com.ingka.ikea.core.model.product.ProductItem;
import com.ingka.ikea.core.model.product.ProductLarge;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0019\u001a\u0004\b\u001d\u0010\u001b¨\u0006\u001e"}, d2 = {"Lop/j;", "", "Lcom/ingka/ikea/core/model/product/ProductLarge;", "productLarge", "", "Lcom/ingka/ikea/core/model/product/ProductItem;", "mustBeComplementedWith", "Lop/h;", "facets", "<init>", "(Lcom/ingka/ikea/core/model/product/ProductLarge;Ljava/util/List;Ljava/util/List;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/ingka/ikea/core/model/product/ProductLarge;", "()Lcom/ingka/ikea/core/model/product/ProductLarge;", "b", "Ljava/util/List;", "getMustBeComplementedWith", "()Ljava/util/List;", "c", "getFacets", "model_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: op.j  reason: case insensitive filesystem */
public final class C11699j {

    /* renamed from: a  reason: collision with root package name */
    private final ProductLarge f100647a;

    /* renamed from: b  reason: collision with root package name */
    private final List<ProductItem> f100648b;

    /* renamed from: c  reason: collision with root package name */
    private final List<C11697h> f100649c;

    public C11699j(ProductLarge productLarge, List<ProductItem> list, List<C11697h> list2) {
        C17542s.j(productLarge, "productLarge");
        C17542s.j(list, "mustBeComplementedWith");
        C17542s.j(list2, "facets");
        this.f100647a = productLarge;
        this.f100648b = list;
        this.f100649c = list2;
    }

    public final ProductLarge a() {
        return this.f100647a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C11699j)) {
            return false;
        }
        C11699j jVar = (C11699j) obj;
        return C17542s.e(this.f100647a, jVar.f100647a) && C17542s.e(this.f100648b, jVar.f100648b) && C17542s.e(this.f100649c, jVar.f100649c);
    }

    public int hashCode() {
        return (((this.f100647a.hashCode() * 31) + this.f100648b.hashCode()) * 31) + this.f100649c.hashCode();
    }

    public String toString() {
        ProductLarge productLarge = this.f100647a;
        List<ProductItem> list = this.f100648b;
        List<C11697h> list2 = this.f100649c;
        return "ProductDetails(productLarge=" + productLarge + ", mustBeComplementedWith=" + list + ", facets=" + list2 + ")";
    }
}
