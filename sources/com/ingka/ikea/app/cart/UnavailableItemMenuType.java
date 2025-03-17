package com.ingka.ikea.app.cart;

import androidx.annotation.Keep;
import fI.C17220a;
import fI.C17221b;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/ingka/ikea/app/cart/UnavailableItemMenuType;", "", "<init>", "(Ljava/lang/String;I)V", "HOME_DELIVERY", "CLICK_AND_COLLECT", "cart-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@Keep
public enum UnavailableItemMenuType {
    HOME_DELIVERY,
    CLICK_AND_COLLECT;

    static {
        UnavailableItemMenuType[] $values;
        $ENTRIES = C17221b.a($values);
    }

    public static C17220a<UnavailableItemMenuType> getEntries() {
        return $ENTRIES;
    }
}
