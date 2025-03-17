package Nd;

import fI.C17221b;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\n\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"LNd/b;", "", "", "key", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "VISITED_BEGIN_CHECKOUT", "SHOP_GO_ADD_TO_CART_USER", "SHOP_GO_SCAN_USER", "abtesting_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public enum b {
    VISITED_BEGIN_CHECKOUT("visited_begin_checkout"),
    SHOP_GO_ADD_TO_CART_USER("shopgo_add_to_cart_user"),
    SHOP_GO_SCAN_USER("shopgo_scan_user");
    
    private final String key;

    static {
        b[] a10;
        $ENTRIES = C17221b.a(a10);
    }

    private b(String str) {
        this.key = str;
    }

    public final String b() {
        return this.key;
    }
}
