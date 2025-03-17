package com.google.gson.internal;

import com.google.gson.r;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ConcurrentNavigableMap;
import java.util.concurrent.ConcurrentSkipListMap;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    private final Map<Type, com.google.gson.g<?>> f69108a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f69109b;

    /* renamed from: c  reason: collision with root package name */
    private final List<com.google.gson.r> f69110c;

    class a implements j<T> {
        a() {
        }

        public T a() {
            return new TreeSet();
        }
    }

    class b implements j<T> {
        b() {
        }

        public T a() {
            return new LinkedHashSet();
        }
    }

    /* renamed from: com.google.gson.internal.c$c  reason: collision with other inner class name */
    class C1187c implements j<T> {
        C1187c() {
        }

        public T a() {
            return new ArrayDeque();
        }
    }

    class d implements j<T> {
        d() {
        }

        public T a() {
            return new ArrayList();
        }
    }

    class e implements j<T> {
        e() {
        }

        public T a() {
            return new ConcurrentSkipListMap();
        }
    }

    class f implements j<T> {
        f() {
        }

        public T a() {
            return new ConcurrentHashMap();
        }
    }

    class g implements j<T> {
        g() {
        }

        public T a() {
            return new TreeMap();
        }
    }

    class h implements j<T> {
        h() {
        }

        public T a() {
            return new LinkedHashMap();
        }
    }

    class i implements j<T> {
        i() {
        }

        public T a() {
            return new g();
        }
    }

    class j implements j<T> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Class f69111a;

        j(Class cls) {
            this.f69111a = cls;
        }

        public T a() {
            try {
                return p.f69166a.d(this.f69111a);
            } catch (Exception e10) {
                throw new RuntimeException("Unable to create instance of " + this.f69111a + ". Registering an InstanceCreator or a TypeAdapter for this type, or adding a no-args constructor may fix this problem.", e10);
            }
        }
    }

    class k implements j<T> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.google.gson.g f69113a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Type f69114b;

        k(com.google.gson.g gVar, Type type) {
            this.f69113a = gVar;
            this.f69114b = type;
        }

        public T a() {
            return this.f69113a.a(this.f69114b);
        }
    }

    class l implements j<T> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f69116a;

        l(String str) {
            this.f69116a = str;
        }

        public T a() {
            throw new com.google.gson.j(this.f69116a);
        }
    }

    class m implements j<T> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.google.gson.g f69118a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Type f69119b;

        m(com.google.gson.g gVar, Type type) {
            this.f69118a = gVar;
            this.f69119b = type;
        }

        public T a() {
            return this.f69118a.a(this.f69119b);
        }
    }

    class n implements j<T> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f69121a;

        n(String str) {
            this.f69121a = str;
        }

        public T a() {
            throw new com.google.gson.j(this.f69121a);
        }
    }

    class o implements j<T> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f69123a;

        o(String str) {
            this.f69123a = str;
        }

        public T a() {
            throw new com.google.gson.j(this.f69123a);
        }
    }

    class p implements j<T> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Type f69125a;

        p(Type type) {
            this.f69125a = type;
        }

        public T a() {
            Type type = this.f69125a;
            if (type instanceof ParameterizedType) {
                Type type2 = ((ParameterizedType) type).getActualTypeArguments()[0];
                if (type2 instanceof Class) {
                    return EnumSet.noneOf((Class) type2);
                }
                throw new com.google.gson.j("Invalid EnumSet type: " + this.f69125a.toString());
            }
            throw new com.google.gson.j("Invalid EnumSet type: " + this.f69125a.toString());
        }
    }

    class q implements j<T> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Type f69126a;

        q(Type type) {
            this.f69126a = type;
        }

        public T a() {
            Type type = this.f69126a;
            if (type instanceof ParameterizedType) {
                Type type2 = ((ParameterizedType) type).getActualTypeArguments()[0];
                if (type2 instanceof Class) {
                    return new EnumMap((Class) type2);
                }
                throw new com.google.gson.j("Invalid EnumMap type: " + this.f69126a.toString());
            }
            throw new com.google.gson.j("Invalid EnumMap type: " + this.f69126a.toString());
        }
    }

    class r implements j<T> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f69127a;

        r(String str) {
            this.f69127a = str;
        }

        public T a() {
            throw new com.google.gson.j(this.f69127a);
        }
    }

    class s implements j<T> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f69128a;

        s(String str) {
            this.f69128a = str;
        }

        public T a() {
            throw new com.google.gson.j(this.f69128a);
        }
    }

    class t implements j<T> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Constructor f69129a;

        t(Constructor constructor) {
            this.f69129a = constructor;
        }

        public T a() {
            try {
                return this.f69129a.newInstance((Object[]) null);
            } catch (InstantiationException e10) {
                throw new RuntimeException("Failed to invoke constructor '" + Sc.a.c(this.f69129a) + "' with no args", e10);
            } catch (InvocationTargetException e11) {
                throw new RuntimeException("Failed to invoke constructor '" + Sc.a.c(this.f69129a) + "' with no args", e11.getCause());
            } catch (IllegalAccessException e12) {
                throw Sc.a.e(e12);
            }
        }
    }

    public c(Map<Type, com.google.gson.g<?>> map, boolean z10, List<com.google.gson.r> list) {
        this.f69108a = map;
        this.f69109b = z10;
        this.f69110c = list;
    }

    static String a(Class<?> cls) {
        int modifiers = cls.getModifiers();
        if (Modifier.isInterface(modifiers)) {
            return "Interfaces can't be instantiated! Register an InstanceCreator or a TypeAdapter for this type. Interface name: " + cls.getName();
        } else if (!Modifier.isAbstract(modifiers)) {
            return null;
        } else {
            return "Abstract classes can't be instantiated! Adjust the R8 configuration or register an InstanceCreator or a TypeAdapter for this type. Class name: " + cls.getName() + "\nSee " + o.a("r8-abstract-class");
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0047, code lost:
        r3 = Sc.a.p(r0);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static <T> com.google.gson.internal.j<T> c(java.lang.Class<? super T> r3, com.google.gson.r.a r4) {
        /*
            int r0 = r3.getModifiers()
            boolean r0 = java.lang.reflect.Modifier.isAbstract(r0)
            r1 = 0
            if (r0 == 0) goto L_0x000c
            return r1
        L_0x000c:
            java.lang.reflect.Constructor r0 = r3.getDeclaredConstructor(r1)     // Catch:{ NoSuchMethodException -> 0x0059 }
            com.google.gson.r$a r2 = com.google.gson.r.a.ALLOW
            if (r4 == r2) goto L_0x0045
            boolean r1 = com.google.gson.internal.m.a(r0, r1)
            if (r1 == 0) goto L_0x0029
            com.google.gson.r$a r1 = com.google.gson.r.a.BLOCK_ALL
            if (r4 != r1) goto L_0x0045
            int r1 = r0.getModifiers()
            boolean r1 = java.lang.reflect.Modifier.isPublic(r1)
            if (r1 == 0) goto L_0x0029
            goto L_0x0045
        L_0x0029:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r0 = "Unable to invoke no-args constructor of "
            r4.append(r0)
            r4.append(r3)
            java.lang.String r3 = "; constructor is not accessible and ReflectionAccessFilter does not permit making it accessible. Register an InstanceCreator or a TypeAdapter for this type, change the visibility of the constructor or adjust the access filter."
            r4.append(r3)
            java.lang.String r3 = r4.toString()
            com.google.gson.internal.c$r r4 = new com.google.gson.internal.c$r
            r4.<init>(r3)
            return r4
        L_0x0045:
            if (r4 != r2) goto L_0x0053
            java.lang.String r3 = Sc.a.p(r0)
            if (r3 == 0) goto L_0x0053
            com.google.gson.internal.c$s r4 = new com.google.gson.internal.c$s
            r4.<init>(r3)
            return r4
        L_0x0053:
            com.google.gson.internal.c$t r3 = new com.google.gson.internal.c$t
            r3.<init>(r0)
            return r3
        L_0x0059:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.gson.internal.c.c(java.lang.Class, com.google.gson.r$a):com.google.gson.internal.j");
    }

    private static <T> j<T> d(Type type, Class<? super T> cls) {
        if (Collection.class.isAssignableFrom(cls)) {
            return SortedSet.class.isAssignableFrom(cls) ? new a() : Set.class.isAssignableFrom(cls) ? new b() : Queue.class.isAssignableFrom(cls) ? new C1187c() : new d();
        }
        if (!Map.class.isAssignableFrom(cls)) {
            return null;
        }
        if (ConcurrentNavigableMap.class.isAssignableFrom(cls)) {
            return new e();
        }
        if (ConcurrentMap.class.isAssignableFrom(cls)) {
            return new f();
        }
        if (SortedMap.class.isAssignableFrom(cls)) {
            return new g();
        }
        if (type instanceof ParameterizedType) {
            if (!String.class.isAssignableFrom(TypeToken.get(((ParameterizedType) type).getActualTypeArguments()[0]).getRawType())) {
                return new h();
            }
        }
        return new i();
    }

    private static <T> j<T> e(Type type, Class<? super T> cls) {
        if (EnumSet.class.isAssignableFrom(cls)) {
            return new p(type);
        }
        if (cls == EnumMap.class) {
            return new q(type);
        }
        return null;
    }

    private <T> j<T> f(Class<? super T> cls) {
        if (this.f69109b) {
            return new j(cls);
        }
        String str = "Unable to create instance of " + cls + "; usage of JDK Unsafe is disabled. Registering an InstanceCreator or a TypeAdapter for this type, adding a no-args constructor, or enabling usage of JDK Unsafe may fix this problem.";
        if (cls.getDeclaredConstructors().length == 0) {
            str = str + " Or adjust your R8 configuration to keep the no-args constructor of the class.";
        }
        return new l(str);
    }

    public <T> j<T> b(TypeToken<T> typeToken) {
        Type type = typeToken.getType();
        Class<? super T> rawType = typeToken.getRawType();
        com.google.gson.g gVar = this.f69108a.get(type);
        if (gVar != null) {
            return new k(gVar, type);
        }
        com.google.gson.g gVar2 = this.f69108a.get(rawType);
        if (gVar2 != null) {
            return new m(gVar2, type);
        }
        j<T> e10 = e(type, rawType);
        if (e10 != null) {
            return e10;
        }
        r.a b10 = m.b(this.f69110c, rawType);
        j<T> c10 = c(rawType, b10);
        if (c10 != null) {
            return c10;
        }
        j<T> d10 = d(type, rawType);
        if (d10 != null) {
            return d10;
        }
        String a10 = a(rawType);
        if (a10 != null) {
            return new n(a10);
        }
        if (b10 == r.a.ALLOW) {
            return f(rawType);
        }
        return new o("Unable to create instance of " + rawType + "; ReflectionAccessFilter does not permit using reflection or Unsafe. Register an InstanceCreator or a TypeAdapter for this type or adjust the access filter to allow using reflection.");
    }

    public String toString() {
        return this.f69108a.toString();
    }
}
