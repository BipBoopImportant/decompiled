package com.optimizely.ab.config.audience;

import com.optimizely.ab.config.IdKeyMapped;

public class Audience implements IdKeyMapped {
    private final Condition<UserAttribute> conditions;

    /* renamed from: id  reason: collision with root package name */
    private final String f122319id;
    private final String name;

    public Audience(String str, String str2, Condition condition) {
        this.f122319id = str;
        this.name = str2;
        this.conditions = condition;
    }

    public Condition getConditions() {
        return this.conditions;
    }

    public String getId() {
        return this.f122319id;
    }

    public String getKey() {
        return this.name;
    }

    public String getName() {
        return this.name;
    }

    public String toString() {
        return "Audience{id='" + this.f122319id + '\'' + ", name='" + this.name + '\'' + ", conditions=" + this.conditions + '}';
    }
}
