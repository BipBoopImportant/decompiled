package com.google.gson.internal.bind;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.d;
import com.google.gson.internal.Excluder;
import com.google.gson.internal.j;
import com.google.gson.internal.m;
import com.google.gson.internal.o;
import com.google.gson.l;
import com.google.gson.p;
import com.google.gson.r;
import com.google.gson.reflect.TypeToken;
import com.google.gson.v;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class ReflectiveTypeAdapterFactory implements v {

    /* renamed from: a  reason: collision with root package name */
    private final com.google.gson.internal.c f68984a;

    /* renamed from: b  reason: collision with root package name */
    private final d f68985b;

    /* renamed from: c  reason: collision with root package name */
    private final Excluder f68986c;

    /* renamed from: d  reason: collision with root package name */
    private final JsonAdapterAnnotationTypeAdapterFactory f68987d;

    /* renamed from: e  reason: collision with root package name */
    private final List<r> f68988e;

    public static abstract class Adapter<T, A> extends TypeAdapter<T> {

        /* renamed from: a  reason: collision with root package name */
        private final c f68990a;

        Adapter(c cVar) {
            this.f68990a = cVar;
        }

        /* access modifiers changed from: package-private */
        public abstract A a();

        /* access modifiers changed from: package-private */
        public abstract T b(A a10);

        /* access modifiers changed from: package-private */
        public abstract void c(A a10, Tc.a aVar, b bVar);

        public T read(Tc.a aVar) {
            if (aVar.F() == Tc.b.NULL) {
                aVar.x();
                return null;
            }
            Object a10 = a();
            Map<String, b> map = this.f68990a.f69007a;
            try {
                aVar.e();
                while (aVar.hasNext()) {
                    b bVar = map.get(aVar.B0());
                    if (bVar == null) {
                        aVar.a0();
                    } else {
                        c(a10, aVar, bVar);
                    }
                }
                aVar.l();
                return b(a10);
            } catch (IllegalStateException e10) {
                throw new p((Throwable) e10);
            } catch (IllegalAccessException e11) {
                throw Sc.a.e(e11);
            }
        }

        public void write(Tc.c cVar, T t10) {
            if (t10 == null) {
                cVar.v();
                return;
            }
            cVar.f();
            try {
                for (b c10 : this.f68990a.f69008b) {
                    c10.c(cVar, t10);
                }
                cVar.i();
            } catch (IllegalAccessException e10) {
                throw Sc.a.e(e10);
            }
        }
    }

    private static final class FieldReflectionAdapter<T> extends Adapter<T, T> {

        /* renamed from: b  reason: collision with root package name */
        private final j<T> f68991b;

        FieldReflectionAdapter(j<T> jVar, c cVar) {
            super(cVar);
            this.f68991b = jVar;
        }

        /* access modifiers changed from: package-private */
        public T a() {
            return this.f68991b.a();
        }

        /* access modifiers changed from: package-private */
        public T b(T t10) {
            return t10;
        }

        /* access modifiers changed from: package-private */
        public void c(T t10, Tc.a aVar, b bVar) {
            bVar.b(aVar, t10);
        }
    }

    private static final class RecordAdapter<T> extends Adapter<T, Object[]> {

        /* renamed from: e  reason: collision with root package name */
        static final Map<Class<?>, Object> f68992e = f();

        /* renamed from: b  reason: collision with root package name */
        private final Constructor<T> f68993b;

        /* renamed from: c  reason: collision with root package name */
        private final Object[] f68994c;

        /* renamed from: d  reason: collision with root package name */
        private final Map<String, Integer> f68995d = new HashMap();

        RecordAdapter(Class<T> cls, c cVar, boolean z10) {
            super(cVar);
            Constructor<T> i10 = Sc.a.i(cls);
            this.f68993b = i10;
            if (z10) {
                ReflectiveTypeAdapterFactory.b((Object) null, i10);
            } else {
                Sc.a.o(i10);
            }
            String[] k10 = Sc.a.k(cls);
            for (int i11 = 0; i11 < k10.length; i11++) {
                this.f68995d.put(k10[i11], Integer.valueOf(i11));
            }
            Class[] parameterTypes = this.f68993b.getParameterTypes();
            this.f68994c = new Object[parameterTypes.length];
            for (int i12 = 0; i12 < parameterTypes.length; i12++) {
                this.f68994c[i12] = f68992e.get(parameterTypes[i12]);
            }
        }

        private static Map<Class<?>, Object> f() {
            HashMap hashMap = new HashMap();
            hashMap.put(Byte.TYPE, (byte) 0);
            hashMap.put(Short.TYPE, (short) 0);
            hashMap.put(Integer.TYPE, 0);
            hashMap.put(Long.TYPE, 0L);
            hashMap.put(Float.TYPE, Float.valueOf(0.0f));
            hashMap.put(Double.TYPE, Double.valueOf(0.0d));
            hashMap.put(Character.TYPE, 0);
            hashMap.put(Boolean.TYPE, Boolean.FALSE);
            return hashMap;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public Object[] a() {
            return (Object[]) this.f68994c.clone();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public T b(Object[] objArr) {
            try {
                return this.f68993b.newInstance(objArr);
            } catch (IllegalAccessException e10) {
                throw Sc.a.e(e10);
            } catch (IllegalArgumentException | InstantiationException e11) {
                throw new RuntimeException("Failed to invoke constructor '" + Sc.a.c(this.f68993b) + "' with args " + Arrays.toString(objArr), e11);
            } catch (InvocationTargetException e12) {
                throw new RuntimeException("Failed to invoke constructor '" + Sc.a.c(this.f68993b) + "' with args " + Arrays.toString(objArr), e12.getCause());
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: g */
        public void c(Object[] objArr, Tc.a aVar, b bVar) {
            Integer num = this.f68995d.get(bVar.f69005c);
            if (num != null) {
                bVar.a(aVar, num.intValue(), objArr);
                return;
            }
            throw new IllegalStateException("Could not find the index in the constructor '" + Sc.a.c(this.f68993b) + "' for field with name '" + bVar.f69005c + "', unable to determine which argument in the constructor the field corresponds to. This is unexpected behavior, as we expect the RecordComponents to have the same names as the fields in the Java class, and that the order of the RecordComponents is the same as the order of the canonical constructor parameters.");
        }
    }

    class a extends b {

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ boolean f68996d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ Method f68997e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ TypeAdapter f68998f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ TypeAdapter f68999g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ boolean f69000h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ boolean f69001i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(String str, Field field, boolean z10, Method method, TypeAdapter typeAdapter, TypeAdapter typeAdapter2, boolean z11, boolean z12) {
            super(str, field);
            this.f68996d = z10;
            this.f68997e = method;
            this.f68998f = typeAdapter;
            this.f68999g = typeAdapter2;
            this.f69000h = z11;
            this.f69001i = z12;
        }

        /* access modifiers changed from: package-private */
        public void a(Tc.a aVar, int i10, Object[] objArr) {
            Object read = this.f68999g.read(aVar);
            if (read != null || !this.f69000h) {
                objArr[i10] = read;
                return;
            }
            throw new l("null is not allowed as value for record component '" + this.f69005c + "' of primitive type; at path " + aVar.m());
        }

        /* access modifiers changed from: package-private */
        public void b(Tc.a aVar, Object obj) {
            Object read = this.f68999g.read(aVar);
            if (read != null || !this.f69000h) {
                if (this.f68996d) {
                    ReflectiveTypeAdapterFactory.b(obj, this.f69004b);
                } else if (this.f69001i) {
                    String g10 = Sc.a.g(this.f69004b, false);
                    throw new com.google.gson.j("Cannot set value of 'static final' " + g10);
                }
                this.f69004b.set(obj, read);
            }
        }

        /* access modifiers changed from: package-private */
        public void c(Tc.c cVar, Object obj) {
            Object obj2;
            if (this.f68996d) {
                Method method = this.f68997e;
                if (method == null) {
                    ReflectiveTypeAdapterFactory.b(obj, this.f69004b);
                } else {
                    ReflectiveTypeAdapterFactory.b(obj, method);
                }
            }
            Method method2 = this.f68997e;
            if (method2 != null) {
                try {
                    obj2 = method2.invoke(obj, (Object[]) null);
                } catch (InvocationTargetException e10) {
                    String g10 = Sc.a.g(this.f68997e, false);
                    throw new com.google.gson.j("Accessor " + g10 + " threw exception", e10.getCause());
                }
            } else {
                obj2 = this.f69004b.get(obj);
            }
            if (obj2 != obj) {
                cVar.t(this.f69003a);
                this.f68998f.write(cVar, obj2);
            }
        }
    }

    static abstract class b {

        /* renamed from: a  reason: collision with root package name */
        final String f69003a;

        /* renamed from: b  reason: collision with root package name */
        final Field f69004b;

        /* renamed from: c  reason: collision with root package name */
        final String f69005c;

        protected b(String str, Field field) {
            this.f69003a = str;
            this.f69004b = field;
            this.f69005c = field.getName();
        }

        /* access modifiers changed from: package-private */
        public abstract void a(Tc.a aVar, int i10, Object[] objArr);

        /* access modifiers changed from: package-private */
        public abstract void b(Tc.a aVar, Object obj);

        /* access modifiers changed from: package-private */
        public abstract void c(Tc.c cVar, Object obj);
    }

    private static class c {

        /* renamed from: c  reason: collision with root package name */
        public static final c f69006c = new c(Collections.emptyMap(), Collections.emptyList());

        /* renamed from: a  reason: collision with root package name */
        public final Map<String, b> f69007a;

        /* renamed from: b  reason: collision with root package name */
        public final List<b> f69008b;

        public c(Map<String, b> map, List<b> list) {
            this.f69007a = map;
            this.f69008b = list;
        }
    }

    public ReflectiveTypeAdapterFactory(com.google.gson.internal.c cVar, d dVar, Excluder excluder, JsonAdapterAnnotationTypeAdapterFactory jsonAdapterAnnotationTypeAdapterFactory, List<r> list) {
        this.f68984a = cVar;
        this.f68985b = dVar;
        this.f68986c = excluder;
        this.f68987d = jsonAdapterAnnotationTypeAdapterFactory;
        this.f68988e = list;
    }

    /* access modifiers changed from: private */
    public static <M extends AccessibleObject & Member> void b(Object obj, M m10) {
        if (Modifier.isStatic(((Member) m10).getModifiers())) {
            obj = null;
        }
        if (!m.a(m10, obj)) {
            String g10 = Sc.a.g(m10, true);
            throw new com.google.gson.j(g10 + " is not accessible and ReflectionAccessFilter does not permit making it accessible. Register a TypeAdapter for the declaring type, adjust the access filter or increase the visibility of the element and its declaring type.");
        }
    }

    private b c(Gson gson, Field field, Method method, String str, TypeToken<?> typeToken, boolean z10, boolean z11) {
        TypeAdapter<?> typeAdapter;
        Gson gson2 = gson;
        boolean a10 = com.google.gson.internal.l.a(typeToken.getRawType());
        int modifiers = field.getModifiers();
        boolean z12 = false;
        boolean z13 = Modifier.isStatic(modifiers) && Modifier.isFinal(modifiers);
        Qc.b bVar = (Qc.b) field.getAnnotation(Qc.b.class);
        TypeAdapter<?> c10 = bVar != null ? this.f68987d.c(this.f68984a, gson, typeToken, bVar, false) : null;
        if (c10 != null) {
            z12 = true;
        }
        TypeToken<?> typeToken2 = typeToken;
        if (c10 == null) {
            c10 = gson.p(typeToken2);
        }
        TypeAdapter<?> typeAdapter2 = c10;
        if (z10) {
            typeAdapter = z12 ? typeAdapter2 : new TypeAdapterRuntimeTypeWrapper<>(gson, typeAdapter2, typeToken.getType());
        } else {
            typeAdapter = typeAdapter2;
        }
        return new a(str, field, z11, method, typeAdapter, typeAdapter2, a10, z13);
    }

    private static IllegalArgumentException d(Class<?> cls, String str, Field field, Field field2) {
        throw new IllegalArgumentException("Class " + cls.getName() + " declares multiple JSON fields named '" + str + "'; conflict is caused by fields " + Sc.a.f(field) + " and " + Sc.a.f(field2) + "\nSee " + o.a("duplicate-fields"));
    }

    /* JADX WARNING: Removed duplicated region for block: B:46:0x0108  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x012a  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x013c A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.c e(com.google.gson.Gson r24, com.google.gson.reflect.TypeToken<?> r25, java.lang.Class<?> r26, boolean r27, boolean r28) {
        /*
            r23 = this;
            r8 = r23
            r9 = r26
            boolean r0 = r26.isInterface()
            if (r0 == 0) goto L_0x000d
            com.google.gson.internal.bind.ReflectiveTypeAdapterFactory$c r0 = com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.c.f69006c
            return r0
        L_0x000d:
            java.util.LinkedHashMap r10 = new java.util.LinkedHashMap
            r10.<init>()
            java.util.LinkedHashMap r11 = new java.util.LinkedHashMap
            r11.<init>()
            r12 = r25
            r0 = r27
            r13 = r9
        L_0x001c:
            java.lang.Class<java.lang.Object> r1 = java.lang.Object.class
            if (r13 == r1) goto L_0x015d
            java.lang.reflect.Field[] r14 = r13.getDeclaredFields()
            r15 = 1
            r7 = 0
            if (r13 == r9) goto L_0x003c
            int r1 = r14.length
            if (r1 <= 0) goto L_0x003c
            java.util.List<com.google.gson.r> r0 = r8.f68988e
            com.google.gson.r$a r0 = com.google.gson.internal.m.b(r0, r13)
            com.google.gson.r$a r1 = com.google.gson.r.a.BLOCK_ALL
            if (r0 == r1) goto L_0x003f
            com.google.gson.r$a r1 = com.google.gson.r.a.BLOCK_INACCESSIBLE
            if (r0 != r1) goto L_0x003b
            r0 = r15
            goto L_0x003c
        L_0x003b:
            r0 = r7
        L_0x003c:
            r16 = r0
            goto L_0x0063
        L_0x003f:
            com.google.gson.j r0 = new com.google.gson.j
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "ReflectionAccessFilter does not permit using reflection for "
            r1.append(r2)
            r1.append(r13)
            java.lang.String r2 = " (supertype of "
            r1.append(r2)
            r1.append(r9)
            java.lang.String r2 = "). Register a TypeAdapter for this type or adjust the access filter."
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>((java.lang.String) r1)
            throw r0
        L_0x0063:
            int r6 = r14.length
            r5 = r7
        L_0x0065:
            if (r5 >= r6) goto L_0x0145
            r4 = r14[r5]
            boolean r17 = r8.g(r4, r15)
            boolean r0 = r8.g(r4, r7)
            if (r17 != 0) goto L_0x007d
            if (r0 != 0) goto L_0x007d
            r21 = r5
            r19 = r6
            r22 = r7
            goto L_0x013c
        L_0x007d:
            r1 = 0
            if (r28 == 0) goto L_0x00c6
            int r2 = r4.getModifiers()
            boolean r2 = java.lang.reflect.Modifier.isStatic(r2)
            if (r2 == 0) goto L_0x008e
            r3 = r1
            r18 = r7
            goto L_0x00c9
        L_0x008e:
            java.lang.reflect.Method r1 = Sc.a.h(r13, r4)
            if (r16 != 0) goto L_0x0097
            Sc.a.o(r1)
        L_0x0097:
            java.lang.Class<Qc.c> r2 = Qc.c.class
            java.lang.annotation.Annotation r3 = r1.getAnnotation(r2)
            if (r3 == 0) goto L_0x00c6
            java.lang.annotation.Annotation r2 = r4.getAnnotation(r2)
            if (r2 == 0) goto L_0x00a6
            goto L_0x00c6
        L_0x00a6:
            java.lang.String r0 = Sc.a.g(r1, r7)
            com.google.gson.j r1 = new com.google.gson.j
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "@SerializedName on "
            r2.append(r3)
            r2.append(r0)
            java.lang.String r0 = " is not supported"
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r1.<init>((java.lang.String) r0)
            throw r1
        L_0x00c6:
            r18 = r0
            r3 = r1
        L_0x00c9:
            if (r16 != 0) goto L_0x00d0
            if (r3 != 0) goto L_0x00d0
            Sc.a.o(r4)
        L_0x00d0:
            java.lang.reflect.Type r0 = r12.getType()
            java.lang.reflect.Type r1 = r4.getGenericType()
            java.lang.reflect.Type r0 = com.google.gson.internal.b.p(r0, r13, r1)
            java.util.List r2 = r8.f(r4)
            java.lang.Object r1 = r2.get(r7)
            java.lang.String r1 = (java.lang.String) r1
            com.google.gson.reflect.TypeToken r19 = com.google.gson.reflect.TypeToken.get((java.lang.reflect.Type) r0)
            r0 = r23
            r25 = r1
            r1 = r24
            r20 = r2
            r2 = r4
            r15 = r4
            r4 = r25
            r21 = r5
            r5 = r19
            r19 = r6
            r6 = r17
            r22 = r7
            r7 = r16
            com.google.gson.internal.bind.ReflectiveTypeAdapterFactory$b r0 = r0.c(r1, r2, r3, r4, r5, r6, r7)
            if (r18 == 0) goto L_0x0128
            java.util.Iterator r1 = r20.iterator()
        L_0x010c:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x0128
            java.lang.Object r2 = r1.next()
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r3 = r10.put(r2, r0)
            com.google.gson.internal.bind.ReflectiveTypeAdapterFactory$b r3 = (com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.b) r3
            if (r3 != 0) goto L_0x0121
            goto L_0x010c
        L_0x0121:
            java.lang.reflect.Field r0 = r3.f69004b
            java.lang.IllegalArgumentException r0 = d(r9, r2, r0, r15)
            throw r0
        L_0x0128:
            if (r17 == 0) goto L_0x013c
            r1 = r25
            java.lang.Object r0 = r11.put(r1, r0)
            com.google.gson.internal.bind.ReflectiveTypeAdapterFactory$b r0 = (com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.b) r0
            if (r0 != 0) goto L_0x0135
            goto L_0x013c
        L_0x0135:
            java.lang.reflect.Field r0 = r0.f69004b
            java.lang.IllegalArgumentException r0 = d(r9, r1, r0, r15)
            throw r0
        L_0x013c:
            int r5 = r21 + 1
            r6 = r19
            r7 = r22
            r15 = 1
            goto L_0x0065
        L_0x0145:
            java.lang.reflect.Type r0 = r12.getType()
            java.lang.reflect.Type r1 = r13.getGenericSuperclass()
            java.lang.reflect.Type r0 = com.google.gson.internal.b.p(r0, r13, r1)
            com.google.gson.reflect.TypeToken r12 = com.google.gson.reflect.TypeToken.get((java.lang.reflect.Type) r0)
            java.lang.Class r13 = r12.getRawType()
            r0 = r16
            goto L_0x001c
        L_0x015d:
            com.google.gson.internal.bind.ReflectiveTypeAdapterFactory$c r0 = new com.google.gson.internal.bind.ReflectiveTypeAdapterFactory$c
            java.util.ArrayList r1 = new java.util.ArrayList
            java.util.Collection r2 = r11.values()
            r1.<init>(r2)
            r0.<init>(r10, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.e(com.google.gson.Gson, com.google.gson.reflect.TypeToken, java.lang.Class, boolean, boolean):com.google.gson.internal.bind.ReflectiveTypeAdapterFactory$c");
    }

    private List<String> f(Field field) {
        Qc.c cVar = (Qc.c) field.getAnnotation(Qc.c.class);
        if (cVar == null) {
            return Collections.singletonList(this.f68985b.a(field));
        }
        String value = cVar.value();
        String[] alternate = cVar.alternate();
        if (alternate.length == 0) {
            return Collections.singletonList(value);
        }
        ArrayList arrayList = new ArrayList(alternate.length + 1);
        arrayList.add(value);
        Collections.addAll(arrayList, alternate);
        return arrayList;
    }

    private boolean g(Field field, boolean z10) {
        return !this.f68986c.c(field, z10);
    }

    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> typeToken) {
        Class<? super T> rawType = typeToken.getRawType();
        if (!Object.class.isAssignableFrom(rawType)) {
            return null;
        }
        if (Sc.a.l(rawType)) {
            return new TypeAdapter<T>() {
                public T read(Tc.a aVar) {
                    aVar.a0();
                    return null;
                }

                public String toString() {
                    return "AnonymousOrNonStaticLocalClassAdapter";
                }

                public void write(Tc.c cVar, T t10) {
                    cVar.v();
                }
            };
        }
        r.a b10 = m.b(this.f68988e, rawType);
        if (b10 != r.a.BLOCK_ALL) {
            boolean z10 = b10 == r.a.BLOCK_INACCESSIBLE;
            return Sc.a.m(rawType) ? new RecordAdapter(rawType, e(gson, typeToken, rawType, z10, true), z10) : new FieldReflectionAdapter(this.f68984a.b(typeToken), e(gson, typeToken, rawType, z10, false));
        }
        throw new com.google.gson.j("ReflectionAccessFilter does not permit using reflection for " + rawType + ". Register a TypeAdapter for this type or adjust the access filter.");
    }
}
