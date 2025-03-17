package Ae;

import com.adjust.sdk.Constants;
import fI.C17220a;
import fI.C17221b;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0014\b\u0002\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015¨\u0006\u0016"}, d2 = {"LAe/p;", "", "", "value", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Ljava/lang/String;", "j", "()Ljava/lang/String;", "Companion", "a", "BROWSE", "CART", "DEEPLINK", "DISCOVER", "FTE", "INSTORE", "LIST", "PROFILE", "PUSH_NOTIFICATION", "SHOP_AND_GO_ONLINE", "FOOD_MOBILE", "analytics_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public enum p {
    BROWSE("search_browse"),
    CART("cart"),
    DEEPLINK(Constants.DEEPLINK),
    DISCOVER("discover"),
    FTE("fte"),
    INSTORE("store_page"),
    LIST("list"),
    PROFILE("profile"),
    PUSH_NOTIFICATION("push_notification"),
    SHOP_AND_GO_ONLINE("shopgo_online"),
    FOOD_MOBILE("foodmobile");
    
    public static final a Companion = null;
    private final String value;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LAe/p$a;", "", "<init>", "()V", "analytics_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    static {
        p[] a10;
        $ENTRIES = C17221b.a(a10);
        Companion = new a((DefaultConstructorMarker) null);
    }

    private p(String str) {
        this.value = str;
    }

    public static C17220a<p> b() {
        return $ENTRIES;
    }

    public final String j() {
        return this.value;
    }
}
