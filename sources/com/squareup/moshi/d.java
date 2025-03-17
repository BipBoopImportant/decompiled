package com.squareup.moshi;

import com.squareup.moshi.f;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

abstract class d<C extends Collection<T>, T> extends f<C> {

    /* renamed from: b  reason: collision with root package name */
    public static final f.e f122346b = new a();

    /* renamed from: a  reason: collision with root package name */
    private final f<T> f122347a;

    class a implements f.e {
        a() {
        }

        public f<?> a(Type type, Set<? extends Annotation> set, t tVar) {
            Class<?> g10 = w.g(type);
            if (!set.isEmpty()) {
                return null;
            }
            if (g10 == List.class || g10 == Collection.class) {
                return d.b(type, tVar).nullSafe();
            }
            if (g10 == Set.class) {
                return d.d(type, tVar).nullSafe();
            }
            return null;
        }
    }

    class b extends d<Collection<T>, T> {
        b(f fVar) {
            super(fVar, (a) null);
        }

        /* access modifiers changed from: package-private */
        public Collection<T> c() {
            return new ArrayList();
        }

        public /* bridge */ /* synthetic */ Object fromJson(k kVar) {
            return d.super.a(kVar);
        }

        public /* bridge */ /* synthetic */ void toJson(q qVar, Object obj) {
            d.super.e(qVar, (Collection) obj);
        }
    }

    class c extends d<Set<T>, T> {
        c(f fVar) {
            super(fVar, (a) null);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: f */
        public Set<T> c() {
            return new LinkedHashSet();
        }

        public /* bridge */ /* synthetic */ Object fromJson(k kVar) {
            return d.super.a(kVar);
        }

        public /* bridge */ /* synthetic */ void toJson(q qVar, Object obj) {
            d.super.e(qVar, (Collection) obj);
        }
    }

    /* synthetic */ d(f fVar, a aVar) {
        this(fVar);
    }

    static <T> f<Collection<T>> b(Type type, t tVar) {
        return new b(tVar.d(w.c(type, Collection.class)));
    }

    static <T> f<Set<T>> d(Type type, t tVar) {
        return new c(tVar.d(w.c(type, Collection.class)));
    }

    public C a(k kVar) {
        C c10 = c();
        kVar.c();
        while (kVar.hasNext()) {
            c10.add(this.f122347a.fromJson(kVar));
        }
        kVar.e();
        return c10;
    }

    /* access modifiers changed from: package-private */
    public abstract C c();

    public void e(q qVar, C c10) {
        qVar.c();
        for (Object json : c10) {
            this.f122347a.toJson(qVar, json);
        }
        qVar.f();
    }

    public String toString() {
        return this.f122347a + ".collection()";
    }

    private d(f<T> fVar) {
        this.f122347a = fVar;
    }
}
