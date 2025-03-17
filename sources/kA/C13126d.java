package KA;

import LA.C13173a;
import PA.C13331a;
import TJ.C16532g;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001:\u0001\bJ&\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H¦\u0002¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"LKA/d;", "", "", "imageId", "LPA/a$b;", "type", "LTJ/g;", "LKA/d$a;", "a", "(Ljava/lang/String;LPA/a$b;)LTJ/g;", "shoppableimage-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: KA.d  reason: case insensitive filesystem */
public interface C13126d {

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0016\u001a\u0004\b\u0012\u0010\u0017¨\u0006\u0018"}, d2 = {"LKA/d$a;", "", "LLA/a;", "shoppableImageModel", "", "", "allProductNumbersInShoppingLists", "<init>", "(LLA/a;Ljava/util/Set;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "LLA/a;", "b", "()LLA/a;", "Ljava/util/Set;", "()Ljava/util/Set;", "shoppableimage-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: KA.d$a */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final C13173a f111479a;

        /* renamed from: b  reason: collision with root package name */
        private final Set<String> f111480b;

        public a(C13173a aVar, Set<String> set) {
            C17542s.j(aVar, "shoppableImageModel");
            C17542s.j(set, "allProductNumbersInShoppingLists");
            this.f111479a = aVar;
            this.f111480b = set;
        }

        public final Set<String> a() {
            return this.f111480b;
        }

        public final C13173a b() {
            return this.f111479a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return C17542s.e(this.f111479a, aVar.f111479a) && C17542s.e(this.f111480b, aVar.f111480b);
        }

        public int hashCode() {
            return (this.f111479a.hashCode() * 31) + this.f111480b.hashCode();
        }

        public String toString() {
            C13173a aVar = this.f111479a;
            Set<String> set = this.f111480b;
            return "ShoppableImageData(shoppableImageModel=" + aVar + ", allProductNumbersInShoppingLists=" + set + ")";
        }
    }

    C16532g<a> a(String str, C13331a.b bVar);
}
