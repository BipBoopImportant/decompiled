package com.google.android.gms.internal.measurement;

import java.util.HashMap;
import java.util.Map;
import kb.C9970y;

/* renamed from: com.google.android.gms.internal.measurement.e  reason: case insensitive filesystem */
public final class C7280e {

    /* renamed from: d  reason: collision with root package name */
    private static final C9970y<String> f48896d = C9970y.H("_syn", "_err", "_el");

    /* renamed from: a  reason: collision with root package name */
    private String f48897a;

    /* renamed from: b  reason: collision with root package name */
    private long f48898b;

    /* renamed from: c  reason: collision with root package name */
    private Map<String, Object> f48899c;

    public C7280e(String str, long j10, Map<String, Object> map) {
        this.f48897a = str;
        this.f48898b = j10;
        HashMap hashMap = new HashMap();
        this.f48899c = hashMap;
        if (map != null) {
            hashMap.putAll(map);
        }
    }

    public static Object c(String str, Object obj, Object obj2) {
        return (!f48896d.contains(str) || !(obj2 instanceof Double)) ? str.startsWith("_") ? (!(obj instanceof String) && obj != null) ? obj : obj2 : obj instanceof Double ? obj2 : obj instanceof Long ? Long.valueOf(Math.round(((Double) obj2).doubleValue())) : obj instanceof String ? obj2.toString() : obj2 : Long.valueOf(Math.round(((Double) obj2).doubleValue()));
    }

    public final long a() {
        return this.f48898b;
    }

    public final Object b(String str) {
        if (this.f48899c.containsKey(str)) {
            return this.f48899c.get(str);
        }
        return null;
    }

    public final /* synthetic */ Object clone() {
        return new C7280e(this.f48897a, this.f48898b, new HashMap(this.f48899c));
    }

    public final void d(String str, Object obj) {
        if (obj == null) {
            this.f48899c.remove(str);
            return;
        }
        this.f48899c.put(str, c(str, this.f48899c.get(str), obj));
    }

    public final String e() {
        return this.f48897a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7280e)) {
            return false;
        }
        C7280e eVar = (C7280e) obj;
        if (this.f48898b == eVar.f48898b && this.f48897a.equals(eVar.f48897a)) {
            return this.f48899c.equals(eVar.f48899c);
        }
        return false;
    }

    public final void f(String str) {
        this.f48897a = str;
    }

    public final Map<String, Object> g() {
        return this.f48899c;
    }

    public final int hashCode() {
        long j10 = this.f48898b;
        return (((this.f48897a.hashCode() * 31) + ((int) (j10 ^ (j10 >>> 32)))) * 31) + this.f48899c.hashCode();
    }

    public final String toString() {
        String str = this.f48897a;
        long j10 = this.f48898b;
        String valueOf = String.valueOf(this.f48899c);
        return "Event{name='" + str + "', timestamp=" + j10 + ", params=" + valueOf + "}";
    }
}
