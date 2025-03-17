package androidx.lifecycle;

import androidx.lifecycle.r;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Deprecated
/* renamed from: androidx.lifecycle.d  reason: case insensitive filesystem */
final class C5201d {

    /* renamed from: c  reason: collision with root package name */
    static C5201d f22258c = new C5201d();

    /* renamed from: a  reason: collision with root package name */
    private final Map<Class<?>, a> f22259a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    private final Map<Class<?>, Boolean> f22260b = new HashMap();

    @Deprecated
    /* renamed from: androidx.lifecycle.d$a */
    static class a {

        /* renamed from: a  reason: collision with root package name */
        final Map<r.a, List<b>> f22261a = new HashMap();

        /* renamed from: b  reason: collision with root package name */
        final Map<b, r.a> f22262b;

        a(Map<b, r.a> map) {
            this.f22262b = map;
            for (Map.Entry next : map.entrySet()) {
                r.a aVar = (r.a) next.getValue();
                List list = this.f22261a.get(aVar);
                if (list == null) {
                    list = new ArrayList();
                    this.f22261a.put(aVar, list);
                }
                list.add((b) next.getKey());
            }
        }

        private static void b(List<b> list, C5221y yVar, r.a aVar, Object obj) {
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    list.get(size).a(yVar, aVar, obj);
                }
            }
        }

        /* access modifiers changed from: package-private */
        public void a(C5221y yVar, r.a aVar, Object obj) {
            b(this.f22261a.get(aVar), yVar, aVar, obj);
            b(this.f22261a.get(r.a.ON_ANY), yVar, aVar, obj);
        }
    }

    @Deprecated
    /* renamed from: androidx.lifecycle.d$b */
    static final class b {

        /* renamed from: a  reason: collision with root package name */
        final int f22263a;

        /* renamed from: b  reason: collision with root package name */
        final Method f22264b;

        b(int i10, Method method) {
            this.f22263a = i10;
            this.f22264b = method;
            method.setAccessible(true);
        }

        /* access modifiers changed from: package-private */
        public void a(C5221y yVar, r.a aVar, Object obj) {
            try {
                int i10 = this.f22263a;
                if (i10 == 0) {
                    this.f22264b.invoke(obj, (Object[]) null);
                } else if (i10 == 1) {
                    this.f22264b.invoke(obj, new Object[]{yVar});
                } else if (i10 == 2) {
                    this.f22264b.invoke(obj, new Object[]{yVar, aVar});
                }
            } catch (InvocationTargetException e10) {
                throw new RuntimeException("Failed to call observer method", e10.getCause());
            } catch (IllegalAccessException e11) {
                throw new RuntimeException(e11);
            }
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f22263a == bVar.f22263a && this.f22264b.getName().equals(bVar.f22264b.getName());
        }

        public int hashCode() {
            return (this.f22263a * 31) + this.f22264b.getName().hashCode();
        }
    }

    C5201d() {
    }

    private a a(Class<?> cls, Method[] methodArr) {
        int i10;
        a c10;
        Class<? super Object> superclass = cls.getSuperclass();
        HashMap hashMap = new HashMap();
        if (!(superclass == null || (c10 = c(superclass)) == null)) {
            hashMap.putAll(c10.f22262b);
        }
        for (Class c11 : cls.getInterfaces()) {
            for (Map.Entry next : c(c11).f22262b.entrySet()) {
                e(hashMap, (b) next.getKey(), (r.a) next.getValue(), cls);
            }
        }
        if (methodArr == null) {
            methodArr = b(cls);
        }
        boolean z10 = false;
        for (Method method : methodArr) {
            M m10 = (M) method.getAnnotation(M.class);
            if (m10 != null) {
                Class[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length <= 0) {
                    i10 = 0;
                } else if (C5221y.class.isAssignableFrom(parameterTypes[0])) {
                    i10 = 1;
                } else {
                    throw new IllegalArgumentException("invalid parameter type. Must be one and instanceof LifecycleOwner");
                }
                r.a value = m10.value();
                if (parameterTypes.length > 1) {
                    if (!r.a.class.isAssignableFrom(parameterTypes[1])) {
                        throw new IllegalArgumentException("invalid parameter type. second arg must be an event");
                    } else if (value == r.a.ON_ANY) {
                        i10 = 2;
                    } else {
                        throw new IllegalArgumentException("Second arg is supported only for ON_ANY value");
                    }
                }
                if (parameterTypes.length <= 2) {
                    e(hashMap, new b(i10, method), value, cls);
                    z10 = true;
                } else {
                    throw new IllegalArgumentException("cannot have more than 2 params");
                }
            }
        }
        a aVar = new a(hashMap);
        this.f22259a.put(cls, aVar);
        this.f22260b.put(cls, Boolean.valueOf(z10));
        return aVar;
    }

    private Method[] b(Class<?> cls) {
        try {
            return cls.getDeclaredMethods();
        } catch (NoClassDefFoundError e10) {
            throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e10);
        }
    }

    private void e(Map<b, r.a> map, b bVar, r.a aVar, Class<?> cls) {
        r.a aVar2 = map.get(bVar);
        if (aVar2 != null && aVar != aVar2) {
            Method method = bVar.f22264b;
            throw new IllegalArgumentException("Method " + method.getName() + " in " + cls.getName() + " already declared with different @OnLifecycleEvent value: previous value " + aVar2 + ", new value " + aVar);
        } else if (aVar2 == null) {
            map.put(bVar, aVar);
        }
    }

    /* access modifiers changed from: package-private */
    public a c(Class<?> cls) {
        a aVar = this.f22259a.get(cls);
        return aVar != null ? aVar : a(cls, (Method[]) null);
    }

    /* access modifiers changed from: package-private */
    public boolean d(Class<?> cls) {
        Boolean bool = this.f22260b.get(cls);
        if (bool != null) {
            return bool.booleanValue();
        }
        Method[] b10 = b(cls);
        for (Method annotation : b10) {
            if (((M) annotation.getAnnotation(M.class)) != null) {
                a(cls, b10);
                return true;
            }
        }
        this.f22260b.put(cls, Boolean.FALSE);
        return false;
    }
}
