package com.optimizely.ab;

import IE.e;
import IE.f;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class d {

    /* renamed from: e  reason: collision with root package name */
    private static final Logger f122320e = LoggerFactory.getLogger((Class<?>) d.class);

    /* renamed from: a  reason: collision with root package name */
    Map<String, b> f122321a;

    /* renamed from: b  reason: collision with root package name */
    private final String f122322b;

    /* renamed from: c  reason: collision with root package name */
    private final Map<String, Object> f122323c;

    /* renamed from: d  reason: collision with root package name */
    private final Optimizely f122324d;

    public d(Optimizely optimizely, String str, Map<String, ?> map) {
        this.f122324d = optimizely;
        this.f122322b = str;
        if (map != null) {
            this.f122323c = Collections.synchronizedMap(new HashMap(map));
        } else {
            this.f122323c = Collections.synchronizedMap(new HashMap());
        }
    }

    public d a() {
        return new d(this.f122324d, this.f122322b, this.f122323c, this.f122321a);
    }

    public f b(String str, List<e> list) {
        return this.f122324d.decide(a(), str, list);
    }

    public b c(a aVar) {
        Map<String, b> map = this.f122321a;
        if (map != null) {
            return map.get(aVar.b());
        }
        return null;
    }

    public Map<String, Object> d() {
        return this.f122323c;
    }

    public Optimizely e() {
        return this.f122324d;
    }

    public boolean equals(Object obj) {
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        d dVar = (d) obj;
        return this.f122322b.equals(dVar.f()) && this.f122323c.equals(dVar.d()) && this.f122324d.equals(dVar.e());
    }

    public String f() {
        return this.f122322b;
    }

    public void g(String str, Object obj) {
        this.f122323c.put(str, obj);
    }

    public void h(String str, Map<String, ?> map) {
        this.f122324d.track(str, this.f122322b, this.f122323c, map);
    }

    public int hashCode() {
        return (((this.f122322b.hashCode() * 31) + this.f122323c.hashCode()) * 31) + this.f122324d.hashCode();
    }

    public String toString() {
        return "OptimizelyUserContext {userId='" + this.f122322b + '\'' + ", attributes='" + this.f122323c + '\'' + '}';
    }

    public d(Optimizely optimizely, String str, Map<String, ?> map, Map<String, b> map2) {
        this.f122324d = optimizely;
        this.f122322b = str;
        if (map != null) {
            this.f122323c = Collections.synchronizedMap(new HashMap(map));
        } else {
            this.f122323c = Collections.synchronizedMap(new HashMap());
        }
        if (map2 != null) {
            this.f122321a = new ConcurrentHashMap(map2);
        }
    }

    public d(Optimizely optimizely, String str) {
        this(optimizely, str, Collections.EMPTY_MAP);
    }
}
