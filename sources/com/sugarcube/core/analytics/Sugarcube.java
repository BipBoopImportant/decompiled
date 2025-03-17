package com.sugarcube.core.analytics;

import com.sugarcube.core.analytics.Event;
import fI.C17220a;
import fI.C17221b;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/sugarcube/core/analytics/Sugarcube;", "Lcom/sugarcube/core/analytics/Event;", "<init>", "()V", "Error", "analytics_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class Sugarcube implements Event {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/sugarcube/core/analytics/Sugarcube$Error;", "Lcom/sugarcube/core/analytics/Event;", "", "<init>", "(Ljava/lang/String;I)V", "AddToCart", "analytics_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public enum Error implements Event {
        AddToCart;

        static {
            Error[] $values;
            $ENTRIES = C17221b.a($values);
        }

        public static C17220a<Error> getEntries() {
            return $ENTRIES;
        }

        public String eventName() {
            return Event.DefaultImpls.eventName(this);
        }
    }

    public String eventName() {
        return Event.DefaultImpls.eventName(this);
    }
}
