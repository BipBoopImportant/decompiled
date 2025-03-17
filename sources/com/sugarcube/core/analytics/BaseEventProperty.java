package com.sugarcube.core.analytics;

import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B+\u0012\"\u0010\u0002\u001a\u001e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003j\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005`\u0006¢\u0006\u0004\b\u0007\u0010\bJ$\u0010\u000b\u001a\u001e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003j\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005`\u0006H\u0016R-\u0010\u0002\u001a\u001e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003j\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005`\u0006¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\f"}, d2 = {"Lcom/sugarcube/core/analytics/BaseEventProperty;", "Lcom/sugarcube/core/analytics/Trackable;", "properties", "Ljava/util/HashMap;", "Lcom/sugarcube/core/analytics/TrackingKey;", "", "Lkotlin/collections/HashMap;", "<init>", "(Ljava/util/HashMap;)V", "getProperties", "()Ljava/util/HashMap;", "getValues", "analytics_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class BaseEventProperty implements Trackable {
    private final HashMap<TrackingKey, String> properties;

    public BaseEventProperty(HashMap<TrackingKey, String> hashMap) {
        C17542s.j(hashMap, "properties");
        this.properties = hashMap;
    }

    public final HashMap<TrackingKey, String> getProperties() {
        return this.properties;
    }

    public HashMap<TrackingKey, String> getValues() {
        return this.properties;
    }
}
