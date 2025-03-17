package com.squareup.moshi;

import com.squareup.moshi.f;
import com.squareup.moshi.k;
import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

final class c<T> extends f<T> {

    /* renamed from: d  reason: collision with root package name */
    public static final f.e f122339d = new a();

    /* renamed from: a  reason: collision with root package name */
    private final b<T> f122340a;

    /* renamed from: b  reason: collision with root package name */
    private final b<?>[] f122341b;

    /* renamed from: c  reason: collision with root package name */
    private final k.a f122342c;

    class a implements f.e {
        a() {
        }

        private void b(t tVar, Type type, Map<String, b<?>> map) {
            e eVar;
            Class<?> g10 = w.g(type);
            boolean i10 = ME.c.i(g10);
            for (Field field : g10.getDeclaredFields()) {
                if (c(i10, field.getModifiers()) && ((eVar = (e) field.getAnnotation(e.class)) == null || !eVar.ignore())) {
                    Type p10 = ME.c.p(type, g10, field.getGenericType());
                    Set<? extends Annotation> j10 = ME.c.j(field);
                    String name = field.getName();
                    f<T> f10 = tVar.f(p10, j10, name);
                    field.setAccessible(true);
                    String l10 = ME.c.l(name, eVar);
                    b bVar = new b(l10, field, f10);
                    b put = map.put(l10, bVar);
                    if (put != null) {
                        throw new IllegalArgumentException("Conflicting fields:\n    " + put.f122344b + "\n    " + bVar.f122344b);
                    }
                }
            }
        }

        private boolean c(boolean z10, int i10) {
            if (Modifier.isStatic(i10) || Modifier.isTransient(i10)) {
                return false;
            }
            return Modifier.isPublic(i10) || Modifier.isProtected(i10) || !z10;
        }

        private void d(Type type, Class<?> cls) {
            Class<?> g10 = w.g(type);
            if (cls.isAssignableFrom(g10)) {
                throw new IllegalArgumentException("No JsonAdapter for " + type + ", you should probably use " + cls.getSimpleName() + " instead of " + g10.getSimpleName() + " (Moshi only supports the collection interfaces by default) or else register a custom JsonAdapter.");
            }
        }

        public f<?> a(Type type, Set<? extends Annotation> set, t tVar) {
            if (!(type instanceof Class) && !(type instanceof ParameterizedType)) {
                return null;
            }
            Class<?> g10 = w.g(type);
            if (g10.isInterface() || g10.isEnum() || !set.isEmpty()) {
                return null;
            }
            if (ME.c.i(g10)) {
                d(type, List.class);
                d(type, Set.class);
                d(type, Map.class);
                d(type, Collection.class);
                String str = "Platform " + g10;
                if (type instanceof ParameterizedType) {
                    str = str + " in " + type;
                }
                throw new IllegalArgumentException(str + " requires explicit JsonAdapter to be registered");
            } else if (g10.isAnonymousClass()) {
                throw new IllegalArgumentException("Cannot serialize anonymous class " + g10.getName());
            } else if (g10.isLocalClass()) {
                throw new IllegalArgumentException("Cannot serialize local class " + g10.getName());
            } else if (g10.getEnclosingClass() != null && !Modifier.isStatic(g10.getModifiers())) {
                throw new IllegalArgumentException("Cannot serialize non-static nested class " + g10.getName());
            } else if (Modifier.isAbstract(g10.getModifiers())) {
                throw new IllegalArgumentException("Cannot serialize abstract class " + g10.getName());
            } else if (!ME.c.h(g10)) {
                b<?> a10 = b.a(g10);
                TreeMap treeMap = new TreeMap();
                while (type != Object.class) {
                    b(tVar, type, treeMap);
                    type = w.f(type);
                }
                return new c(a10, treeMap).nullSafe();
            } else {
                throw new IllegalArgumentException("Cannot serialize Kotlin type " + g10.getName() + ". Reflective serialization of Kotlin classes without using kotlin-reflect has undefined and unexpected behavior. Please use KotlinJsonAdapterFactory from the moshi-kotlin artifact or use code gen from the moshi-kotlin-codegen artifact.");
            }
        }
    }

    static class b<T> {

        /* renamed from: a  reason: collision with root package name */
        final String f122343a;

        /* renamed from: b  reason: collision with root package name */
        final Field f122344b;

        /* renamed from: c  reason: collision with root package name */
        final f<T> f122345c;

        b(String str, Field field, f<T> fVar) {
            this.f122343a = str;
            this.f122344b = field;
            this.f122345c = fVar;
        }

        /* access modifiers changed from: package-private */
        public void a(k kVar, Object obj) {
            this.f122344b.set(obj, this.f122345c.fromJson(kVar));
        }

        /* access modifiers changed from: package-private */
        public void b(q qVar, Object obj) {
            this.f122345c.toJson(qVar, this.f122344b.get(obj));
        }
    }

    c(b<T> bVar, Map<String, b<?>> map) {
        this.f122340a = bVar;
        this.f122341b = (b[]) map.values().toArray(new b[map.size()]);
        this.f122342c = k.a.a((String[]) map.keySet().toArray(new String[map.size()]));
    }

    public T fromJson(k kVar) {
        try {
            T b10 = this.f122340a.b();
            try {
                kVar.d();
                while (kVar.hasNext()) {
                    int s10 = kVar.s(this.f122342c);
                    if (s10 == -1) {
                        kVar.w();
                        kVar.a0();
                    } else {
                        this.f122341b[s10].a(kVar, b10);
                    }
                }
                kVar.f();
                return b10;
            } catch (IllegalAccessException unused) {
                throw new AssertionError();
            }
        } catch (InstantiationException e10) {
            throw new RuntimeException(e10);
        } catch (InvocationTargetException e11) {
            throw ME.c.s(e11);
        } catch (IllegalAccessException unused2) {
            throw new AssertionError();
        }
    }

    public void toJson(q qVar, T t10) {
        try {
            qVar.d();
            for (b<?> bVar : this.f122341b) {
                qVar.n(bVar.f122343a);
                bVar.b(qVar, t10);
            }
            qVar.g();
        } catch (IllegalAccessException unused) {
            throw new AssertionError();
        }
    }

    public String toString() {
        return "JsonAdapter(" + this.f122340a + ")";
    }
}
