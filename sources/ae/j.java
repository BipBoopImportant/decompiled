package Ae;

import fI.C17221b;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b$\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b j\u0002\b!j\u0002\b\"j\u0002\b#j\u0002\b$j\u0002\b%¨\u0006&"}, d2 = {"LAe/j;", "", "", "value", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "ACTION_FAIL", "ACTION_SUCCESS", "ACTION_TAP", "ACTION_SWIPE", "ACTION_VIEWED", "ACTION_TRIGGERED", "ACTION_SCREENSHOT", "LIST_TOTAL", "PROFILE_OPEN", "PTAG_SCANNED", "PUSH_NOTIFICATION", "SHOP_AND_GO_ACTION_FAIL", "SHOP_AND_GO_ACTION_SUCCESS", "SHOP_AND_GO_CART_VIEWED", "SHOP_AND_GO_CHECKOUT_SCANNED", "SHOP_AND_GO_NOTIFICATION_RECEIVED", "SHOP_AND_GO_PURCHASE", "SHOP_AND_GO_PURCHASE_ITEM", "SHOP_AND_GO_RATING", "SHOP_AND_GO_SCAN", "SHOP_AND_GO_SCAN_DISCOUNT", "SHOP_AND_GO_SCAN_FAIL", "SHOP_AND_GO_TAP", "SHOP_AND_GO_FAIL", "SHOP_AND_GO_VIEWED", "SHOP_AND_GO_VIEW_ITEM", "VIEW_ITEM_LIST", "OPTIMIZELY", "KOMPASS_SDK_UNSUPPORTED", "analytics_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public enum j {
    ACTION_FAIL("action_fail"),
    ACTION_SUCCESS("action_success"),
    ACTION_TAP("action_tap"),
    ACTION_SWIPE("action_swipe"),
    ACTION_VIEWED("action_viewed"),
    ACTION_TRIGGERED("action_triggered"),
    ACTION_SCREENSHOT("action_screenshot"),
    LIST_TOTAL("total_wishlist"),
    PROFILE_OPEN("profile_open"),
    PTAG_SCANNED("ptag_scanned"),
    PUSH_NOTIFICATION("push_notification"),
    SHOP_AND_GO_ACTION_FAIL("shopgo_action_fail"),
    SHOP_AND_GO_ACTION_SUCCESS("shopgo_action_success"),
    SHOP_AND_GO_CART_VIEWED("shopgo_bag_view"),
    SHOP_AND_GO_CHECKOUT_SCANNED("shopgo_checkout_scan"),
    SHOP_AND_GO_NOTIFICATION_RECEIVED("shopgo_notification_receive"),
    SHOP_AND_GO_PURCHASE("shopgo_purchase"),
    SHOP_AND_GO_PURCHASE_ITEM("shopgo_purchase_item"),
    SHOP_AND_GO_RATING("shopgo_rating"),
    SHOP_AND_GO_SCAN("shopgo_scan"),
    SHOP_AND_GO_SCAN_DISCOUNT("shopgo_scan_discount"),
    SHOP_AND_GO_SCAN_FAIL("shopgo_scan_fail"),
    SHOP_AND_GO_TAP("shopgo_tap"),
    SHOP_AND_GO_FAIL("shopgo_fail"),
    SHOP_AND_GO_VIEWED("shopgo_viewed"),
    SHOP_AND_GO_VIEW_ITEM("shopgo_view_item"),
    VIEW_ITEM_LIST("view_item_list"),
    OPTIMIZELY("optimizely"),
    KOMPASS_SDK_UNSUPPORTED("Kompass_SDK_Unsupported");
    
    private final String value;

    static {
        j[] a10;
        $ENTRIES = C17221b.a(a10);
    }

    private j(String str) {
        this.value = str;
    }

    public final String b() {
        return this.value;
    }
}
