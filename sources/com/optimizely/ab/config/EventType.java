package com.optimizely.ab.config;

import java.util.List;

public class EventType implements IdKeyMapped {
    public static final String TOTAL_REVENUE_GOAL_KEY = "Total Revenue";
    private final List<String> experimentIds;

    /* renamed from: id  reason: collision with root package name */
    private final String f122307id;
    private final String key;

    public EventType(String str, String str2, List<String> list) {
        this.f122307id = str;
        this.key = str2;
        this.experimentIds = list;
    }

    public List<String> getExperimentIds() {
        return this.experimentIds;
    }

    public String getId() {
        return this.f122307id;
    }

    public String getKey() {
        return this.key;
    }

    public String toString() {
        return "EventType{id='" + this.f122307id + '\'' + ", key='" + this.key + '\'' + ", experimentIds=" + this.experimentIds + '}';
    }
}
