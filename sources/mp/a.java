package Mp;

import com.ingka.ikea.core.model.product.ProductCarousel;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kp.C11521c;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\b\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0019\u001a\u0004\b\u0014\u0010\u001bR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0019\u001a\u0004\b\u0018\u0010\u001b¨\u0006\u001c"}, d2 = {"LMp/a;", "", "Lkp/c;", "offerTypeCategories", "Lcom/ingka/ikea/core/model/product/ProductCarousel;", "recent", "expiringSoon", "lowestPrice", "<init>", "(Lkp/c;Lcom/ingka/ikea/core/model/product/ProductCarousel;Lcom/ingka/ikea/core/model/product/ProductCarousel;Lcom/ingka/ikea/core/model/product/ProductCarousel;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lkp/c;", "c", "()Lkp/c;", "b", "Lcom/ingka/ikea/core/model/product/ProductCarousel;", "d", "()Lcom/ingka/ikea/core/model/product/ProductCarousel;", "datalayer_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class a {

    /* renamed from: a  reason: collision with root package name */
    private final C11521c f83623a;

    /* renamed from: b  reason: collision with root package name */
    private final ProductCarousel f83624b;

    /* renamed from: c  reason: collision with root package name */
    private final ProductCarousel f83625c;

    /* renamed from: d  reason: collision with root package name */
    private final ProductCarousel f83626d;

    public a(C11521c cVar, ProductCarousel productCarousel, ProductCarousel productCarousel2, ProductCarousel productCarousel3) {
        C17542s.j(cVar, "offerTypeCategories");
        this.f83623a = cVar;
        this.f83624b = productCarousel;
        this.f83625c = productCarousel2;
        this.f83626d = productCarousel3;
    }

    public final ProductCarousel a() {
        return this.f83625c;
    }

    public final ProductCarousel b() {
        return this.f83626d;
    }

    public final C11521c c() {
        return this.f83623a;
    }

    public final ProductCarousel d() {
        return this.f83624b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return C17542s.e(this.f83623a, aVar.f83623a) && C17542s.e(this.f83624b, aVar.f83624b) && C17542s.e(this.f83625c, aVar.f83625c) && C17542s.e(this.f83626d, aVar.f83626d);
    }

    public int hashCode() {
        int hashCode = this.f83623a.hashCode() * 31;
        ProductCarousel productCarousel = this.f83624b;
        int i10 = 0;
        int hashCode2 = (hashCode + (productCarousel == null ? 0 : productCarousel.hashCode())) * 31;
        ProductCarousel productCarousel2 = this.f83625c;
        int hashCode3 = (hashCode2 + (productCarousel2 == null ? 0 : productCarousel2.hashCode())) * 31;
        ProductCarousel productCarousel3 = this.f83626d;
        if (productCarousel3 != null) {
            i10 = productCarousel3.hashCode();
        }
        return hashCode3 + i10;
    }

    public String toString() {
        C11521c cVar = this.f83623a;
        ProductCarousel productCarousel = this.f83624b;
        ProductCarousel productCarousel2 = this.f83625c;
        ProductCarousel productCarousel3 = this.f83626d;
        return "OfferHub(offerTypeCategories=" + cVar + ", recent=" + productCarousel + ", expiringSoon=" + productCarousel2 + ", lowestPrice=" + productCarousel3 + ")";
    }
}
