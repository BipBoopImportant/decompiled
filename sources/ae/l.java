package Ae;

import fI.C17220a;
import fI.C17221b;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0019\b\u0002\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001a¨\u0006\u001b"}, d2 = {"LAe/l;", "", "", "analytics", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "Companion", "a", "CART_BUTTON", "PROFILE_TOGGLE", "PTAG", "QR", "SEARCH_AND_BROWSE_BUTTON", "SEARCH_VIEW_BUTTON", "STORE_PAGE_BANNER", "STORE_PAGE_BUTTON", "STORE_PAGE_MENU", "STORE_PAGE_SHORTCUT", "CART", "INSPIRE", "LIST_DETAIL", "PROFILE", "UNKNOWN", "WAYFINDING", "analytics_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public enum l {
    CART_BUTTON("cart_button"),
    PROFILE_TOGGLE("profile_toggle"),
    PTAG("ptag"),
    QR("qr"),
    SEARCH_AND_BROWSE_BUTTON("search_browse_direct_button"),
    SEARCH_VIEW_BUTTON("search_view_button"),
    STORE_PAGE_BANNER("store_banner"),
    STORE_PAGE_BUTTON("store_button"),
    STORE_PAGE_MENU("store_menu_option"),
    STORE_PAGE_SHORTCUT("scanner_shortcut"),
    CART("cart"),
    INSPIRE("inspire"),
    LIST_DETAIL("shopping_list_details"),
    PROFILE("profile"),
    UNKNOWN("unknown"),
    WAYFINDING("wayfinding");
    
    public static final a Companion = null;
    private final String analytics;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"LAe/l$a;", "", "<init>", "()V", "", "value", "LAe/l;", "a", "(Ljava/lang/String;)LAe/l;", "analytics_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final l a(String str) {
            T t10;
            C17542s.j(str, "value");
            Iterator<T> it = l.j().iterator();
            while (true) {
                if (!it.hasNext()) {
                    t10 = null;
                    break;
                }
                t10 = it.next();
                if (C17542s.e(((l) t10).b(), str)) {
                    break;
                }
            }
            return (l) t10;
        }

        private a() {
        }
    }

    static {
        l[] a10;
        $ENTRIES = C17221b.a(a10);
        Companion = new a((DefaultConstructorMarker) null);
    }

    private l(String str) {
        this.analytics = str;
    }

    public static C17220a<l> j() {
        return $ENTRIES;
    }

    public final String b() {
        return this.analytics;
    }
}
