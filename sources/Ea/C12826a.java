package EA;

import fI.C17221b;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f¨\u0006\u0010"}, d2 = {"LEA/a;", "", "", "key", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "SHARE_CART", "SHARE_CART_ITEM", "SHARE_LIST", "SHARE_LIST_ITEM", "SHARE_PIP", "SHARE_ACCEPT", "SHARE_VIEW_ERROR", "shareprovider-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: EA.a  reason: case insensitive filesystem */
public enum C12826a {
    SHARE_CART("share_cart"),
    SHARE_CART_ITEM("share_cart_item"),
    SHARE_LIST("share_list"),
    SHARE_LIST_ITEM("share_list_item"),
    SHARE_PIP("share_pip"),
    SHARE_ACCEPT("share_accept"),
    SHARE_VIEW_ERROR("share_view_error");
    
    private final String key;

    static {
        C12826a[] a10;
        $ENTRIES = C17221b.a(a10);
    }

    private C12826a(String str) {
        this.key = str;
    }

    public final String b() {
        return this.key;
    }
}
