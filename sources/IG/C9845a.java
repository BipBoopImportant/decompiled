package ig;

import EB.C12832d;
import Ln.d;
import TJ.C16532g;
import Wk.e;
import com.ingka.ikea.app.base.UserPostalCodeAddress;
import ip.l;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0004\b`\u0018\u00002\u00020\u0001:\u0001\bJ$\u0010\u0006\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00030\u0002H¦\u0002¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lig/a;", "", "LTJ/g;", "Lip/l;", "Lig/a$a;", "", "invoke", "()LTJ/g;", "a", "cart-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: ig.a  reason: case insensitive filesystem */
public interface C9845a {

    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\r\b\b\u0018\u00002\u00020\u0001B5\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0018\u001a\u0004\b\u0017\u0010\u001aR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001b\u0010\u001dR\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001e\u0010 ¨\u0006!"}, d2 = {"Lig/a$a;", "", "", "LLn/d;", "cartItems", "LWk/e;", "availability", "Lcom/ingka/ikea/app/base/UserPostalCodeAddress;", "postalCodeAddress", "LEB/d;", "store", "<init>", "(Ljava/util/List;Ljava/util/List;Lcom/ingka/ikea/app/base/UserPostalCodeAddress;LEB/d;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/List;", "b", "()Ljava/util/List;", "c", "Lcom/ingka/ikea/app/base/UserPostalCodeAddress;", "()Lcom/ingka/ikea/app/base/UserPostalCodeAddress;", "d", "LEB/d;", "()LEB/d;", "cart-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: ig.a$a  reason: collision with other inner class name */
    public static final class C1326a {

        /* renamed from: a  reason: collision with root package name */
        private final List<d> f74299a;

        /* renamed from: b  reason: collision with root package name */
        private final List<e> f74300b;

        /* renamed from: c  reason: collision with root package name */
        private final UserPostalCodeAddress f74301c;

        /* renamed from: d  reason: collision with root package name */
        private final C12832d f74302d;

        public C1326a(List<d> list, List<e> list2, UserPostalCodeAddress userPostalCodeAddress, C12832d dVar) {
            C17542s.j(list, "cartItems");
            C17542s.j(list2, "availability");
            C17542s.j(userPostalCodeAddress, "postalCodeAddress");
            this.f74299a = list;
            this.f74300b = list2;
            this.f74301c = userPostalCodeAddress;
            this.f74302d = dVar;
        }

        public final List<e> a() {
            return this.f74300b;
        }

        public final List<d> b() {
            return this.f74299a;
        }

        public final UserPostalCodeAddress c() {
            return this.f74301c;
        }

        public final C12832d d() {
            return this.f74302d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C1326a)) {
                return false;
            }
            C1326a aVar = (C1326a) obj;
            return C17542s.e(this.f74299a, aVar.f74299a) && C17542s.e(this.f74300b, aVar.f74300b) && C17542s.e(this.f74301c, aVar.f74301c) && C17542s.e(this.f74302d, aVar.f74302d);
        }

        public int hashCode() {
            int hashCode = ((((this.f74299a.hashCode() * 31) + this.f74300b.hashCode()) * 31) + this.f74301c.hashCode()) * 31;
            C12832d dVar = this.f74302d;
            return hashCode + (dVar == null ? 0 : dVar.hashCode());
        }

        public String toString() {
            List<d> list = this.f74299a;
            List<e> list2 = this.f74300b;
            UserPostalCodeAddress userPostalCodeAddress = this.f74301c;
            C12832d dVar = this.f74302d;
            return "CartItemAvailability(cartItems=" + list + ", availability=" + list2 + ", postalCodeAddress=" + userPostalCodeAddress + ", store=" + dVar + ")";
        }
    }

    C16532g<l<C1326a, Throwable>> invoke();
}
