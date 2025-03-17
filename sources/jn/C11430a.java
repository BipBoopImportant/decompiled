package jn;

import com.ingka.ikea.core.model.Category;
import com.ingka.ikea.core.model.product.ProductCarousel;
import gK.C17294a;
import java.util.List;
import kK.C17514c;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\b\u001a\u00020\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0007¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\n\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u001b\u0010\u000f\u001a\u0004\u0018\u00010\u00072\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Ljn/a;", "", "<init>", "()V", "", "Lcom/ingka/ikea/core/model/Category;", "list", "", "a", "(Ljava/util/List;)Ljava/lang/String;", "jsonString", "c", "(Ljava/lang/String;)Ljava/util/List;", "Lcom/ingka/ikea/core/model/product/ProductCarousel;", "promotion", "b", "(Lcom/ingka/ikea/core/model/product/ProductCarousel;)Ljava/lang/String;", "serializedObject", "d", "(Ljava/lang/String;)Lcom/ingka/ikea/core/model/product/ProductCarousel;", "datalayer-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: jn.a  reason: case insensitive filesystem */
public final class C11430a {
    public final String a(List<Category> list) {
        C17542s.j(list, "list");
        return C17514c.f144280d.b(C17294a.h(Category.Companion.serializer()), list);
    }

    public final String b(ProductCarousel productCarousel) {
        if (productCarousel != null) {
            return C17514c.f144280d.b(ProductCarousel.Companion.serializer(), productCarousel);
        }
        return null;
    }

    public final List<Category> c(String str) {
        C17542s.j(str, "jsonString");
        return (List) C17514c.f144280d.c(C17294a.h(Category.Companion.serializer()), str);
    }

    public final ProductCarousel d(String str) {
        C17542s.j(str, "serializedObject");
        return (ProductCarousel) C17514c.f144280d.c(ProductCarousel.Companion.serializer(), str);
    }
}
