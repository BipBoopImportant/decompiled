package Wn;

import fI.C17221b;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0012\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013¨\u0006\u0014"}, d2 = {"LWn/r;", "", "", "key", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "ADD_TO_CALENDAR", "AMBIGUOUS_AREA_CONFIRM", "CHANGE_DELIVERY_TIME_SLOT", "CHANGE_PICK_UP_POINT", "CHECKOUT_PROFILE_FETCH_FAILED", "CHECKOUT_PROGRESS_UNAVAILABLE_CLICK", "CHECKOUT_START_SCREEN", "FIELD_VALIDATION_ERROR", "UNAVAILABLE_ITEMS", "UNAVAILABLE_ITEMS_BUY", "UNAVAILABLE_ITEMS_CHANGE_DELIVERY", "checkout-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public enum r {
    ADD_TO_CALENDAR("delivery_add_to_calendar"),
    AMBIGUOUS_AREA_CONFIRM("begin_checkout_confirm_state"),
    CHANGE_DELIVERY_TIME_SLOT("delivery_change_timeslot"),
    CHANGE_PICK_UP_POINT("change_pick_up_point"),
    CHECKOUT_PROFILE_FETCH_FAILED("checkout_profile_fetch_failed"),
    CHECKOUT_PROGRESS_UNAVAILABLE_CLICK("checkout_progress_unavailable_item_click"),
    CHECKOUT_START_SCREEN("checkout_screen_view"),
    FIELD_VALIDATION_ERROR("field_validation_error"),
    UNAVAILABLE_ITEMS("unavailable_items"),
    UNAVAILABLE_ITEMS_BUY("unavailable_items_buy"),
    UNAVAILABLE_ITEMS_CHANGE_DELIVERY("unavailable_items_change_delivery");
    
    private final String key;

    static {
        r[] a10;
        $ENTRIES = C17221b.a(a10);
    }

    private r(String str) {
        this.key = str;
    }

    public final String b() {
        return this.key;
    }
}
