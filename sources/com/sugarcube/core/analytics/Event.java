package com.sugarcube.core.analytics;

import HJ.C15854t;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, d2 = {"Lcom/sugarcube/core/analytics/Event;", "", "eventName", "", "analytics_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface Event {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class DefaultImpls {
        public static String eventName(Event event) {
            String name = event.getClass().getName();
            C17542s.i(name, "getName(...)");
            String Q10 = C15854t.Q(C15854t.p1(name, ".", (String) null, 2, (Object) null), "$", ".", false, 4, (Object) null);
            return Q10 + "." + event;
        }
    }

    String eventName();
}
