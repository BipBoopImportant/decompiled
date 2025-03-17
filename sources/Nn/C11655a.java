package nn;

import com.ingka.ikea.core.model.Category;
import com.ingka.ikea.core.model.product.ProductCarousel;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\b\u0018\u00002\u00020\u0001B-\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u0016R\u001d\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0015\u001a\u0004\b\u0018\u0010\u0016R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0017\u0010\u001a¨\u0006\u001b"}, d2 = {"Lnn/a;", "", "", "Lcom/ingka/ikea/core/model/Category;", "categories", "rooms", "Lcom/ingka/ikea/core/model/product/ProductCarousel;", "promotion", "<init>", "(Ljava/util/List;Ljava/util/List;Lcom/ingka/ikea/core/model/product/ProductCarousel;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/List;", "()Ljava/util/List;", "b", "c", "Lcom/ingka/ikea/core/model/product/ProductCarousel;", "()Lcom/ingka/ikea/core/model/product/ProductCarousel;", "datalayer_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: nn.a  reason: case insensitive filesystem */
public final class C11655a {

    /* renamed from: a  reason: collision with root package name */
    private final List<Category> f99936a;

    /* renamed from: b  reason: collision with root package name */
    private final List<Category> f99937b;

    /* renamed from: c  reason: collision with root package name */
    private final ProductCarousel f99938c;

    public C11655a(List<Category> list, List<Category> list2, ProductCarousel productCarousel) {
        C17542s.j(list, "categories");
        C17542s.j(list2, "rooms");
        this.f99936a = list;
        this.f99937b = list2;
        this.f99938c = productCarousel;
    }

    public final List<Category> a() {
        return this.f99936a;
    }

    public final ProductCarousel b() {
        return this.f99938c;
    }

    public final List<Category> c() {
        return this.f99937b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C11655a)) {
            return false;
        }
        C11655a aVar = (C11655a) obj;
        return C17542s.e(this.f99936a, aVar.f99936a) && C17542s.e(this.f99937b, aVar.f99937b) && C17542s.e(this.f99938c, aVar.f99938c);
    }

    public int hashCode() {
        int hashCode = ((this.f99936a.hashCode() * 31) + this.f99937b.hashCode()) * 31;
        ProductCarousel productCarousel = this.f99938c;
        return hashCode + (productCarousel == null ? 0 : productCarousel.hashCode());
    }

    public String toString() {
        List<Category> list = this.f99936a;
        List<Category> list2 = this.f99937b;
        ProductCarousel productCarousel = this.f99938c;
        return "BrowseContent(categories=" + list + ", rooms=" + list2 + ", promotion=" + productCarousel + ")";
    }
}
