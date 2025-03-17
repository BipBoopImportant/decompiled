package hi;

import TJ.C16532g;
import com.ingka.ikea.core.model.product.ProductItem;
import gi.O;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001:\u0001\bJ&\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H¦\u0002¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lhi/g;", "", "", "itemNo", "Lgi/O;", "type", "LTJ/g;", "Lhi/g$a;", "a", "(Ljava/lang/String;Lgi/O;)LTJ/g;", "productinformationpage-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface g {

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\b\u0018\u00002\u00020\u0001B#\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0017\u001a\u0004\b\u0013\u0010\u0018¨\u0006\u0019"}, d2 = {"Lhi/g$a;", "", "", "Lcom/ingka/ikea/core/model/product/ProductItem;", "recommendations", "", "", "allItemNosInShoppingLists", "<init>", "(Ljava/util/List;Ljava/util/Set;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/List;", "b", "()Ljava/util/List;", "Ljava/util/Set;", "()Ljava/util/Set;", "productinformationpage-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final List<ProductItem> f74179a;

        /* renamed from: b  reason: collision with root package name */
        private final Set<String> f74180b;

        public a(List<ProductItem> list, Set<String> set) {
            C17542s.j(list, "recommendations");
            C17542s.j(set, "allItemNosInShoppingLists");
            this.f74179a = list;
            this.f74180b = set;
        }

        public final Set<String> a() {
            return this.f74180b;
        }

        public final List<ProductItem> b() {
            return this.f74179a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return C17542s.e(this.f74179a, aVar.f74179a) && C17542s.e(this.f74180b, aVar.f74180b);
        }

        public int hashCode() {
            return (this.f74179a.hashCode() * 31) + this.f74180b.hashCode();
        }

        public String toString() {
            List<ProductItem> list = this.f74179a;
            Set<String> set = this.f74180b;
            return "RecommendationsData(recommendations=" + list + ", allItemNosInShoppingLists=" + set + ")";
        }
    }

    C16532g<a> a(String str, O o10);
}
