package Tp;

import aq.C11080b;
import com.ingka.ikea.core.model.product.ProductCarousel;
import dI.C17164e;
import java.util.List;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J\u001c\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002H¦@¢\u0006\u0004\b\u0005\u0010\u0006J \u0010\n\u001a\u0004\u0018\u00010\t2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007H¦@¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\f\u001a\u0004\u0018\u00010\tH¦@¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"LTp/b;", "", "", "prioritiser", "Laq/b;", "b", "(Ljava/lang/String;LdI/e;)Ljava/lang/Object;", "", "recentItems", "Lcom/ingka/ikea/core/model/product/ProductCarousel;", "c", "(Ljava/util/List;LdI/e;)Ljava/lang/Object;", "a", "(LdI/e;)Ljava/lang/Object;", "discover_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface b {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        public static /* synthetic */ Object a(b bVar, String str, C17164e eVar, int i10, Object obj) {
            if (obj == null) {
                if ((i10 & 1) != 0) {
                    str = null;
                }
                return bVar.b(str, eVar);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getDiscoverFeed");
        }
    }

    Object a(C17164e<? super ProductCarousel> eVar);

    Object b(String str, C17164e<? super C11080b> eVar);

    Object c(List<String> list, C17164e<? super ProductCarousel> eVar);
}
