package com.ingka.ikea.analytics;

import androidx.annotation.Keep;
import fI.C17220a;
import fI.C17221b;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, d2 = {"com/ingka/ikea/analytics/Interaction$ContextComponent", "", "Lcom/ingka/ikea/analytics/Interaction$ContextComponent;", "", "value", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Ljava/lang/String;", "getValue", "()Ljava/lang/String;", "VISUAL_MESSAGE", "PRODUCT_LISTING", "QUOTE", "UNKNOWN", "analytics_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@Keep
public enum Interaction$ContextComponent {
    VISUAL_MESSAGE("visual_message"),
    PRODUCT_LISTING("product_listing"),
    QUOTE("quote"),
    UNKNOWN("unknown");
    
    private final String value;

    static {
        Interaction$ContextComponent[] $values;
        $ENTRIES = C17221b.a($values);
    }

    private Interaction$ContextComponent(String str) {
        this.value = str;
    }

    public static C17220a<Interaction$ContextComponent> getEntries() {
        return $ENTRIES;
    }

    public final String getValue() {
        return this.value;
    }
}
