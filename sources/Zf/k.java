package Zf;

import fI.C17221b;
import kotlin.Metadata;
import x4.C;
import x4.C8951o;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0006\b`\u0018\u00002\u00020\u0001:\u0001\fJ3\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007H&¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0004H&¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000e\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0010\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0011\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0012\u0010\u000fJI\u0010\u0019\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u00042\b\u0010\u0018\u001a\u0004\u0018\u00010\u0004H&¢\u0006\u0004\b\u0019\u0010\u001aJ\u001f\u0010\u001b\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0004H&¢\u0006\u0004\b\u001b\u0010\u001cJ\u001f\u0010\u001d\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0004H&¢\u0006\u0004\b\u001d\u0010\u001cR\u001c\u0010#\u001a\u00020\u001e8&@&X¦\u000e¢\u0006\f\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"¨\u0006$"}, d2 = {"LZf/k;", "Lcom/ingka/ikea/app/cart/b;", "Lx4/o;", "navController", "", "menuType", "itemNo", "Lx4/C;", "navOptions", "LXH/N;", "g", "(Lx4/o;Ljava/lang/String;Ljava/lang/String;Lx4/C;)V", "a", "()Ljava/lang/String;", "i", "(Lx4/o;)V", "k", "l", "j", "title", "description", "badge", "buttonText", "imageUrl", "imageContentDescription", "b", "(Lx4/o;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "c", "(Lx4/o;Ljava/lang/String;)V", "f", "LZf/k$a;", "e", "()LZf/k$a;", "d", "(LZf/k$a;)V", "lastActiveCartType", "cart-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface k extends com.ingka.ikea.app.cart.b {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"LZf/k$a;", "", "<init>", "(Ljava/lang/String;I)V", "ONLINE_CART", "STORE_CART", "cart-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public enum a {
        ONLINE_CART,
        STORE_CART;

        static {
            a[] a10;
            $ENTRIES = C17221b.a(a10);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class b {
        public static /* synthetic */ void a(k kVar, C8951o oVar, String str, String str2, C c10, int i10, Object obj) {
            if (obj == null) {
                if ((i10 & 8) != 0) {
                    c10 = null;
                }
                kVar.g(oVar, str, str2, c10);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: openCartItemAvailability");
        }
    }

    String a();

    void b(C8951o oVar, String str, String str2, String str3, String str4, String str5, String str6);

    void c(C8951o oVar, String str);

    void d(a aVar);

    a e();

    void f(C8951o oVar, String str);

    void g(C8951o oVar, String str, String str2, C c10);

    void i(C8951o oVar);

    void j(C8951o oVar);

    void k(C8951o oVar);

    void l(C8951o oVar);
}
