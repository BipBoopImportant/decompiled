package op;

import com.ingka.ikea.core.model.product.ProductItem;
import com.ingka.ikea.core.model.product.ProductLarge;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0015\u0010\u001bR\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u001a\u001a\u0004\b\u0019\u0010\u001b¨\u0006\u001c"}, d2 = {"Lop/k;", "", "Lcom/ingka/ikea/core/model/product/ProductLarge;", "productLarge", "", "Lop/h;", "facets", "Lcom/ingka/ikea/core/model/product/ProductItem;", "mustCompleteWith", "<init>", "(Lcom/ingka/ikea/core/model/product/ProductLarge;Ljava/util/List;Ljava/util/List;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/ingka/ikea/core/model/product/ProductLarge;", "c", "()Lcom/ingka/ikea/core/model/product/ProductLarge;", "b", "Ljava/util/List;", "()Ljava/util/List;", "model_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: op.k  reason: case insensitive filesystem */
public final class C11700k {

    /* renamed from: a  reason: collision with root package name */
    private final ProductLarge f100650a;

    /* renamed from: b  reason: collision with root package name */
    private final List<C11697h> f100651b;

    /* renamed from: c  reason: collision with root package name */
    private final List<ProductItem> f100652c;

    public C11700k(ProductLarge productLarge, List<C11697h> list, List<ProductItem> list2) {
        C17542s.j(productLarge, "productLarge");
        C17542s.j(list, "facets");
        C17542s.j(list2, "mustCompleteWith");
        this.f100650a = productLarge;
        this.f100651b = list;
        this.f100652c = list2;
    }

    public final List<C11697h> a() {
        return this.f100651b;
    }

    public final List<ProductItem> b() {
        return this.f100652c;
    }

    public final ProductLarge c() {
        return this.f100650a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C11700k)) {
            return false;
        }
        C11700k kVar = (C11700k) obj;
        return C17542s.e(this.f100650a, kVar.f100650a) && C17542s.e(this.f100651b, kVar.f100651b) && C17542s.e(this.f100652c, kVar.f100652c);
    }

    public int hashCode() {
        return (((this.f100650a.hashCode() * 31) + this.f100651b.hashCode()) * 31) + this.f100652c.hashCode();
    }

    public String toString() {
        ProductLarge productLarge = this.f100650a;
        List<C11697h> list = this.f100651b;
        List<ProductItem> list2 = this.f100652c;
        return "ProductIncludingFacets(productLarge=" + productLarge + ", facets=" + list + ", mustCompleteWith=" + list2 + ")";
    }
}
