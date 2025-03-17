package com.squareup.moshi;

import com.squareup.moshi.f;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.util.Map;
import java.util.Set;

final class s<K, V> extends f<Map<K, V>> {

    /* renamed from: c  reason: collision with root package name */
    public static final f.e f122427c = new a();

    /* renamed from: a  reason: collision with root package name */
    private final f<K> f122428a;

    /* renamed from: b  reason: collision with root package name */
    private final f<V> f122429b;

    class a implements f.e {
        a() {
        }

        public f<?> a(Type type, Set<? extends Annotation> set, t tVar) {
            Class<?> g10;
            if (!set.isEmpty() || (g10 = w.g(type)) != Map.class) {
                return null;
            }
            Type[] i10 = w.i(type, g10);
            return new s(tVar, i10[0], i10[1]).nullSafe();
        }
    }

    s(t tVar, Type type, Type type2) {
        this.f122428a = tVar.d(type);
        this.f122429b = tVar.d(type2);
    }

    /* renamed from: a */
    public Map<K, V> fromJson(k kVar) {
        r rVar = new r();
        kVar.d();
        while (kVar.hasNext()) {
            kVar.o();
            K fromJson = this.f122428a.fromJson(kVar);
            V fromJson2 = this.f122429b.fromJson(kVar);
            Object put = rVar.put(fromJson, fromJson2);
            if (put != null) {
                throw new h("Map key '" + fromJson + "' has multiple values at path " + kVar.m() + ": " + put + " and " + fromJson2);
            }
        }
        kVar.f();
        return rVar;
    }

    /* renamed from: b */
    public void toJson(q qVar, Map<K, V> map) {
        qVar.d();
        for (Map.Entry next : map.entrySet()) {
            if (next.getKey() != null) {
                qVar.t();
                this.f122428a.toJson(qVar, next.getKey());
                this.f122429b.toJson(qVar, next.getValue());
            } else {
                throw new h("Map key is null at " + qVar.m());
            }
        }
        qVar.g();
    }

    public String toString() {
        return "JsonAdapter(" + this.f122428a + "=" + this.f122429b + ")";
    }
}
