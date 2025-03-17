package jn;

import com.ingka.ikea.core.model.Category;
import com.ingka.ikea.core.model.product.ProductCarousel;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\f\b\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0010R \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0015\u0010\u0019R \u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u0018\u001a\u0004\b\u001b\u0010\u0019R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001a\u0010\u001d¨\u0006\u001e"}, d2 = {"Ljn/d;", "", "", "id", "", "Lcom/ingka/ikea/core/model/Category;", "categories", "rooms", "Lcom/ingka/ikea/core/model/product/ProductCarousel;", "promotion", "<init>", "(ILjava/util/List;Ljava/util/List;Lcom/ingka/ikea/core/model/product/ProductCarousel;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "b", "Ljava/util/List;", "()Ljava/util/List;", "c", "d", "Lcom/ingka/ikea/core/model/product/ProductCarousel;", "()Lcom/ingka/ikea/core/model/product/ProductCarousel;", "datalayer-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: jn.d  reason: case insensitive filesystem */
public final class C11433d {

    /* renamed from: a  reason: collision with root package name */
    private final int f98593a;

    /* renamed from: b  reason: collision with root package name */
    private final List<Category> f98594b;

    /* renamed from: c  reason: collision with root package name */
    private final List<Category> f98595c;

    /* renamed from: d  reason: collision with root package name */
    private final ProductCarousel f98596d;

    public C11433d(int i10, List<Category> list, List<Category> list2, ProductCarousel productCarousel) {
        C17542s.j(list, "categories");
        C17542s.j(list2, "rooms");
        this.f98593a = i10;
        this.f98594b = list;
        this.f98595c = list2;
        this.f98596d = productCarousel;
    }

    public final List<Category> a() {
        return this.f98594b;
    }

    public final int b() {
        return this.f98593a;
    }

    public final ProductCarousel c() {
        return this.f98596d;
    }

    public final List<Category> d() {
        return this.f98595c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C11433d)) {
            return false;
        }
        C11433d dVar = (C11433d) obj;
        return this.f98593a == dVar.f98593a && C17542s.e(this.f98594b, dVar.f98594b) && C17542s.e(this.f98595c, dVar.f98595c) && C17542s.e(this.f98596d, dVar.f98596d);
    }

    public int hashCode() {
        int hashCode = ((((Integer.hashCode(this.f98593a) * 31) + this.f98594b.hashCode()) * 31) + this.f98595c.hashCode()) * 31;
        ProductCarousel productCarousel = this.f98596d;
        return hashCode + (productCarousel == null ? 0 : productCarousel.hashCode());
    }

    public String toString() {
        int i10 = this.f98593a;
        List<Category> list = this.f98594b;
        List<Category> list2 = this.f98595c;
        ProductCarousel productCarousel = this.f98596d;
        return "BrowseEntity(id=" + i10 + ", categories=" + list + ", rooms=" + list2 + ", promotion=" + productCarousel + ")";
    }
}
