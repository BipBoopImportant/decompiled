package com.sugarcube.app.base.data.analytics;

import fI.C17220a;
import fI.C17221b;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/sugarcube/app/base/data/analytics/SearchType;", "", "<init>", "(Ljava/lang/String;I)V", "CATEGORY", "TEXTBOX", "RECENT_TAG", "POP_TAG", "QUICK_FILTER", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public enum SearchType {
    CATEGORY,
    TEXTBOX,
    RECENT_TAG,
    POP_TAG,
    QUICK_FILTER;

    static {
        SearchType[] $values;
        $ENTRIES = C17221b.a($values);
    }

    public static C17220a<SearchType> getEntries() {
        return $ENTRIES;
    }
}
