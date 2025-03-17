package com.optimizely.ab.bucketing;

import java.util.HashMap;
import java.util.Map;

public class b {

    /* renamed from: a  reason: collision with root package name */
    public String f122300a;

    public b(String str) {
        this.f122300a = str;
    }

    public Map<String, String> a() {
        HashMap hashMap = new HashMap(1);
        hashMap.put("variation_id", this.f122300a);
        return hashMap;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.f122300a.equals(((b) obj).f122300a);
    }

    public int hashCode() {
        return this.f122300a.hashCode();
    }
}
