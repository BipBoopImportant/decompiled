package com.optimizely.ab.bucketing;

import java.util.HashMap;
import java.util.Map;

public class d {

    /* renamed from: a  reason: collision with root package name */
    public final String f122304a;

    /* renamed from: b  reason: collision with root package name */
    public final Map<String, b> f122305b;

    public d(String str, Map<String, b> map) {
        this.f122304a = str;
        this.f122305b = map;
    }

    /* access modifiers changed from: package-private */
    public Map<String, Object> a() {
        HashMap hashMap = new HashMap(2);
        hashMap.put("user_id", this.f122304a);
        HashMap hashMap2 = new HashMap(this.f122305b.size());
        for (Map.Entry next : this.f122305b.entrySet()) {
            hashMap2.put(next.getKey(), ((b) next.getValue()).a());
        }
        hashMap.put("experiment_bucket_map", hashMap2);
        return hashMap;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        d dVar = (d) obj;
        if (!this.f122304a.equals(dVar.f122304a)) {
            return false;
        }
        return this.f122305b.equals(dVar.f122305b);
    }

    public int hashCode() {
        return (this.f122304a.hashCode() * 31) + this.f122305b.hashCode();
    }
}
