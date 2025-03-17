package com.squareup.moshi;

import com.squareup.moshi.f;
import java.lang.annotation.Annotation;
import java.lang.reflect.Array;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Set;

final class a extends f<Object> {

    /* renamed from: c  reason: collision with root package name */
    public static final f.e f122326c = new C3017a();

    /* renamed from: a  reason: collision with root package name */
    private final Class<?> f122327a;

    /* renamed from: b  reason: collision with root package name */
    private final f<Object> f122328b;

    /* renamed from: com.squareup.moshi.a$a  reason: collision with other inner class name */
    class C3017a implements f.e {
        C3017a() {
        }

        public f<?> a(Type type, Set<? extends Annotation> set, t tVar) {
            Type a10 = w.a(type);
            if (a10 != null && set.isEmpty()) {
                return new a(w.g(a10), tVar.d(a10)).nullSafe();
            }
            return null;
        }
    }

    a(Class<?> cls, f<Object> fVar) {
        this.f122327a = cls;
        this.f122328b = fVar;
    }

    public Object fromJson(k kVar) {
        ArrayList arrayList = new ArrayList();
        kVar.c();
        while (kVar.hasNext()) {
            arrayList.add(this.f122328b.fromJson(kVar));
        }
        kVar.e();
        Object newInstance = Array.newInstance(this.f122327a, arrayList.size());
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            Array.set(newInstance, i10, arrayList.get(i10));
        }
        return newInstance;
    }

    public void toJson(q qVar, Object obj) {
        qVar.c();
        int length = Array.getLength(obj);
        for (int i10 = 0; i10 < length; i10++) {
            this.f122328b.toJson(qVar, Array.get(obj, i10));
        }
        qVar.f();
    }

    public String toString() {
        return this.f122328b + ".array()";
    }
}
