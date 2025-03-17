package com.sugarcube.core.analytics;

import java.util.HashMap;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J$\u0010\u0002\u001a\u001e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003j\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005`\u0006H&¨\u0006\u0007"}, d2 = {"Lcom/sugarcube/core/analytics/Trackable;", "", "getValues", "Ljava/util/HashMap;", "Lcom/sugarcube/core/analytics/TrackingKey;", "", "Lkotlin/collections/HashMap;", "analytics_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface Trackable {
    HashMap<TrackingKey, String> getValues();
}
