package com.google.gson;

import Tc.a;
import Tc.b;
import Tc.d;
import com.google.gson.internal.Excluder;
import com.google.gson.internal.bind.ArrayTypeAdapter;
import com.google.gson.internal.bind.CollectionTypeAdapterFactory;
import com.google.gson.internal.bind.DefaultDateTypeAdapter;
import com.google.gson.internal.bind.JsonAdapterAnnotationTypeAdapterFactory;
import com.google.gson.internal.bind.MapTypeAdapterFactory;
import com.google.gson.internal.bind.NumberTypeAdapter;
import com.google.gson.internal.bind.ObjectTypeAdapter;
import com.google.gson.internal.bind.ReflectiveTypeAdapterFactory;
import com.google.gson.internal.bind.SerializationDelegatingTypeAdapter;
import com.google.gson.internal.bind.TypeAdapters;
import com.google.gson.internal.c;
import com.google.gson.internal.f;
import com.google.gson.internal.l;
import com.google.gson.internal.n;
import com.google.gson.reflect.TypeToken;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.io.StringWriter;
import java.io.Writer;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicLongArray;

public final class Gson {

    /* renamed from: A  reason: collision with root package name */
    static final e f68871A = e.f68909d;

    /* renamed from: B  reason: collision with root package name */
    static final String f68872B = null;

    /* renamed from: C  reason: collision with root package name */
    static final d f68873C = c.IDENTITY;

    /* renamed from: D  reason: collision with root package name */
    static final u f68874D = t.DOUBLE;

    /* renamed from: E  reason: collision with root package name */
    static final u f68875E = t.LAZILY_PARSED_NUMBER;

    /* renamed from: z  reason: collision with root package name */
    static final s f68876z = null;

    /* renamed from: a  reason: collision with root package name */
    private final ThreadLocal<Map<TypeToken<?>, TypeAdapter<?>>> f68877a;

    /* renamed from: b  reason: collision with root package name */
    private final ConcurrentMap<TypeToken<?>, TypeAdapter<?>> f68878b;

    /* renamed from: c  reason: collision with root package name */
    private final c f68879c;

    /* renamed from: d  reason: collision with root package name */
    private final JsonAdapterAnnotationTypeAdapterFactory f68880d;

    /* renamed from: e  reason: collision with root package name */
    final List<v> f68881e;

    /* renamed from: f  reason: collision with root package name */
    final Excluder f68882f;

    /* renamed from: g  reason: collision with root package name */
    final d f68883g;

    /* renamed from: h  reason: collision with root package name */
    final Map<Type, g<?>> f68884h;

    /* renamed from: i  reason: collision with root package name */
    final boolean f68885i;

    /* renamed from: j  reason: collision with root package name */
    final boolean f68886j;

    /* renamed from: k  reason: collision with root package name */
    final boolean f68887k;

    /* renamed from: l  reason: collision with root package name */
    final boolean f68888l;

    /* renamed from: m  reason: collision with root package name */
    final e f68889m;

    /* renamed from: n  reason: collision with root package name */
    final s f68890n;

    /* renamed from: o  reason: collision with root package name */
    final boolean f68891o;

    /* renamed from: p  reason: collision with root package name */
    final boolean f68892p;

    /* renamed from: q  reason: collision with root package name */
    final String f68893q;

    /* renamed from: r  reason: collision with root package name */
    final int f68894r;

    /* renamed from: s  reason: collision with root package name */
    final int f68895s;

    /* renamed from: t  reason: collision with root package name */
    final q f68896t;

    /* renamed from: u  reason: collision with root package name */
    final List<v> f68897u;

    /* renamed from: v  reason: collision with root package name */
    final List<v> f68898v;

    /* renamed from: w  reason: collision with root package name */
    final u f68899w;

    /* renamed from: x  reason: collision with root package name */
    final u f68900x;

    /* renamed from: y  reason: collision with root package name */
    final List<r> f68901y;

    static class FutureTypeAdapter<T> extends SerializationDelegatingTypeAdapter<T> {

        /* renamed from: a  reason: collision with root package name */
        private TypeAdapter<T> f68906a = null;

        FutureTypeAdapter() {
        }

        private TypeAdapter<T> b() {
            TypeAdapter<T> typeAdapter = this.f68906a;
            if (typeAdapter != null) {
                return typeAdapter;
            }
            throw new IllegalStateException("Adapter for type with cyclic dependency has been used before dependency has been resolved");
        }

        public TypeAdapter<T> a() {
            return b();
        }

        public void c(TypeAdapter<T> typeAdapter) {
            if (this.f68906a == null) {
                this.f68906a = typeAdapter;
                return;
            }
            throw new AssertionError("Delegate is already set");
        }

        public T read(a aVar) {
            return b().read(aVar);
        }

        public void write(Tc.c cVar, T t10) {
            b().write(cVar, t10);
        }
    }

    public Gson() {
        this(Excluder.f68934g, f68873C, Collections.emptyMap(), false, false, false, true, f68871A, f68876z, false, true, q.DEFAULT, f68872B, 2, 2, Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), f68874D, f68875E, Collections.emptyList());
    }

    private static void a(Object obj, a aVar) {
        if (obj != null) {
            try {
                if (aVar.F() != b.END_DOCUMENT) {
                    throw new p("JSON document was not fully consumed.");
                }
            } catch (d e10) {
                throw new p((Throwable) e10);
            } catch (IOException e11) {
                throw new j((Throwable) e11);
            }
        }
    }

    private static TypeAdapter<AtomicLong> b(final TypeAdapter<Number> typeAdapter) {
        return new TypeAdapter<AtomicLong>() {
            /* renamed from: a */
            public AtomicLong read(a aVar) {
                return new AtomicLong(((Number) TypeAdapter.this.read(aVar)).longValue());
            }

            /* renamed from: b */
            public void write(Tc.c cVar, AtomicLong atomicLong) {
                TypeAdapter.this.write(cVar, Long.valueOf(atomicLong.get()));
            }
        }.nullSafe();
    }

    private static TypeAdapter<AtomicLongArray> c(final TypeAdapter<Number> typeAdapter) {
        return new TypeAdapter<AtomicLongArray>() {
            /* renamed from: a */
            public AtomicLongArray read(a aVar) {
                ArrayList arrayList = new ArrayList();
                aVar.d();
                while (aVar.hasNext()) {
                    arrayList.add(Long.valueOf(((Number) TypeAdapter.this.read(aVar)).longValue()));
                }
                aVar.i();
                int size = arrayList.size();
                AtomicLongArray atomicLongArray = new AtomicLongArray(size);
                for (int i10 = 0; i10 < size; i10++) {
                    atomicLongArray.set(i10, ((Long) arrayList.get(i10)).longValue());
                }
                return atomicLongArray;
            }

            /* renamed from: b */
            public void write(Tc.c cVar, AtomicLongArray atomicLongArray) {
                cVar.e();
                int length = atomicLongArray.length();
                for (int i10 = 0; i10 < length; i10++) {
                    TypeAdapter.this.write(cVar, Long.valueOf(atomicLongArray.get(i10)));
                }
                cVar.h();
            }
        }.nullSafe();
    }

    static void d(double d10) {
        if (Double.isNaN(d10) || Double.isInfinite(d10)) {
            throw new IllegalArgumentException(d10 + " is not a valid double value as per JSON specification. To override this behavior, use GsonBuilder.serializeSpecialFloatingPointValues() method.");
        }
    }

    private TypeAdapter<Number> e(boolean z10) {
        return z10 ? TypeAdapters.f69071v : new TypeAdapter<Number>() {
            /* renamed from: a */
            public Double read(a aVar) {
                if (aVar.F() != b.NULL) {
                    return Double.valueOf(aVar.d2());
                }
                aVar.x();
                return null;
            }

            /* renamed from: b */
            public void write(Tc.c cVar, Number number) {
                if (number == null) {
                    cVar.v();
                    return;
                }
                double doubleValue = number.doubleValue();
                Gson.d(doubleValue);
                cVar.f0(doubleValue);
            }
        };
    }

    private TypeAdapter<Number> f(boolean z10) {
        return z10 ? TypeAdapters.f69070u : new TypeAdapter<Number>() {
            /* renamed from: a */
            public Float read(a aVar) {
                if (aVar.F() != b.NULL) {
                    return Float.valueOf((float) aVar.d2());
                }
                aVar.x();
                return null;
            }

            /* renamed from: b */
            public void write(Tc.c cVar, Number number) {
                if (number == null) {
                    cVar.v();
                    return;
                }
                float floatValue = number.floatValue();
                Gson.d((double) floatValue);
                if (!(number instanceof Float)) {
                    number = Float.valueOf(floatValue);
                }
                cVar.j0(number);
            }
        };
    }

    private static TypeAdapter<Number> s(q qVar) {
        return qVar == q.DEFAULT ? TypeAdapters.f69069t : new TypeAdapter<Number>() {
            /* renamed from: a */
            public Number read(a aVar) {
                if (aVar.F() != b.NULL) {
                    return Long.valueOf(aVar.U2());
                }
                aVar.x();
                return null;
            }

            /* renamed from: b */
            public void write(Tc.c cVar, Number number) {
                if (number == null) {
                    cVar.v();
                } else {
                    cVar.l0(number.toString());
                }
            }
        };
    }

    public void A(Object obj, Type type, Tc.c cVar) {
        TypeAdapter<?> p10 = p(TypeToken.get(type));
        s n10 = cVar.n();
        s sVar = this.f68890n;
        if (sVar != null) {
            cVar.U(sVar);
        } else if (cVar.n() == s.LEGACY_STRICT) {
            cVar.U(s.LENIENT);
        }
        boolean o10 = cVar.o();
        boolean l10 = cVar.l();
        cVar.J(this.f68888l);
        cVar.N(this.f68885i);
        try {
            p10.write(cVar, obj);
            cVar.U(n10);
            cVar.J(o10);
            cVar.N(l10);
        } catch (IOException e10) {
            throw new j((Throwable) e10);
        } catch (AssertionError e11) {
            throw new AssertionError("AssertionError (GSON 2.11.0): " + e11.getMessage(), e11);
        } catch (Throwable th2) {
            cVar.U(n10);
            cVar.J(o10);
            cVar.N(l10);
            throw th2;
        }
    }

    public void B(Object obj, Type type, Appendable appendable) {
        try {
            A(obj, type, u(n.c(appendable)));
        } catch (IOException e10) {
            throw new j((Throwable) e10);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002b, code lost:
        r6 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x002d, code lost:
        r6 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x002f, code lost:
        r6 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x004d, code lost:
        throw new java.lang.AssertionError("AssertionError (GSON 2.11.0): " + r6.getMessage(), r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0053, code lost:
        throw new com.google.gson.p((java.lang.Throwable) r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0059, code lost:
        throw new com.google.gson.p((java.lang.Throwable) r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x005a, code lost:
        r6 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x005b, code lost:
        r1 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x005e, code lost:
        r5.f0(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0062, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0068, code lost:
        throw new com.google.gson.p((java.lang.Throwable) r6);
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x002b A[ExcHandler: AssertionError (r6v5 'e' java.lang.AssertionError A[CUSTOM_DECLARE]), Splitter:B:6:0x0019] */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x002d A[ExcHandler: IOException (r6v4 'e' java.io.IOException A[CUSTOM_DECLARE]), Splitter:B:6:0x0019] */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x002f A[ExcHandler: IllegalStateException (r6v3 'e' java.lang.IllegalStateException A[CUSTOM_DECLARE]), Splitter:B:6:0x0019] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x005e  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0063 A[SYNTHETIC, Splitter:B:30:0x0063] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public <T> T g(Tc.a r5, com.google.gson.reflect.TypeToken<T> r6) {
        /*
            r4 = this;
            com.google.gson.s r0 = r5.s()
            com.google.gson.s r1 = r4.f68890n
            if (r1 == 0) goto L_0x000c
            r5.f0(r1)
            goto L_0x0019
        L_0x000c:
            com.google.gson.s r1 = r5.s()
            com.google.gson.s r2 = com.google.gson.s.LEGACY_STRICT
            if (r1 != r2) goto L_0x0019
            com.google.gson.s r1 = com.google.gson.s.LENIENT
            r5.f0(r1)
        L_0x0019:
            r5.F()     // Catch:{ EOFException -> 0x005a, IllegalStateException -> 0x002f, IOException -> 0x002d, AssertionError -> 0x002b }
            r1 = 0
            com.google.gson.TypeAdapter r6 = r4.p(r6)     // Catch:{ EOFException -> 0x0031, IllegalStateException -> 0x002f, IOException -> 0x002d, AssertionError -> 0x002b }
            java.lang.Object r6 = r6.read(r5)     // Catch:{ EOFException -> 0x0031, IllegalStateException -> 0x002f, IOException -> 0x002d, AssertionError -> 0x002b }
            r5.f0(r0)
            return r6
        L_0x0029:
            r6 = move-exception
            goto L_0x0069
        L_0x002b:
            r6 = move-exception
            goto L_0x0033
        L_0x002d:
            r6 = move-exception
            goto L_0x004e
        L_0x002f:
            r6 = move-exception
            goto L_0x0054
        L_0x0031:
            r6 = move-exception
            goto L_0x005c
        L_0x0033:
            java.lang.AssertionError r1 = new java.lang.AssertionError     // Catch:{ all -> 0x0029 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0029 }
            r2.<init>()     // Catch:{ all -> 0x0029 }
            java.lang.String r3 = "AssertionError (GSON 2.11.0): "
            r2.append(r3)     // Catch:{ all -> 0x0029 }
            java.lang.String r3 = r6.getMessage()     // Catch:{ all -> 0x0029 }
            r2.append(r3)     // Catch:{ all -> 0x0029 }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x0029 }
            r1.<init>(r2, r6)     // Catch:{ all -> 0x0029 }
            throw r1     // Catch:{ all -> 0x0029 }
        L_0x004e:
            com.google.gson.p r1 = new com.google.gson.p     // Catch:{ all -> 0x0029 }
            r1.<init>((java.lang.Throwable) r6)     // Catch:{ all -> 0x0029 }
            throw r1     // Catch:{ all -> 0x0029 }
        L_0x0054:
            com.google.gson.p r1 = new com.google.gson.p     // Catch:{ all -> 0x0029 }
            r1.<init>((java.lang.Throwable) r6)     // Catch:{ all -> 0x0029 }
            throw r1     // Catch:{ all -> 0x0029 }
        L_0x005a:
            r6 = move-exception
            r1 = 1
        L_0x005c:
            if (r1 == 0) goto L_0x0063
            r5.f0(r0)
            r5 = 0
            return r5
        L_0x0063:
            com.google.gson.p r1 = new com.google.gson.p     // Catch:{ all -> 0x0029 }
            r1.<init>((java.lang.Throwable) r6)     // Catch:{ all -> 0x0029 }
            throw r1     // Catch:{ all -> 0x0029 }
        L_0x0069:
            r5.f0(r0)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.gson.Gson.g(Tc.a, com.google.gson.reflect.TypeToken):java.lang.Object");
    }

    public <T> T h(JsonElement jsonElement, TypeToken<T> typeToken) {
        if (jsonElement == null) {
            return null;
        }
        return g(new com.google.gson.internal.bind.a(jsonElement), typeToken);
    }

    public <T> T i(JsonElement jsonElement, Class<T> cls) {
        return l.b(cls).cast(h(jsonElement, TypeToken.get(cls)));
    }

    public <T> T j(JsonElement jsonElement, Type type) {
        return h(jsonElement, TypeToken.get(type));
    }

    public <T> T k(Reader reader, TypeToken<T> typeToken) {
        a t10 = t(reader);
        T g10 = g(t10, typeToken);
        a(g10, t10);
        return g10;
    }

    public <T> T l(Reader reader, Class<T> cls) {
        return l.b(cls).cast(k(reader, TypeToken.get(cls)));
    }

    public <T> T m(String str, TypeToken<T> typeToken) {
        if (str == null) {
            return null;
        }
        return k(new StringReader(str), typeToken);
    }

    public <T> T n(String str, Class<T> cls) {
        return l.b(cls).cast(m(str, TypeToken.get(cls)));
    }

    public <T> T o(String str, Type type) {
        return m(str, TypeToken.get(type));
    }

    public <T> TypeAdapter<T> p(TypeToken<T> typeToken) {
        boolean z10;
        Objects.requireNonNull(typeToken, "type must not be null");
        TypeAdapter<T> typeAdapter = this.f68878b.get(typeToken);
        if (typeAdapter != null) {
            return typeAdapter;
        }
        Map map = this.f68877a.get();
        if (map == null) {
            map = new HashMap();
            this.f68877a.set(map);
            z10 = true;
        } else {
            TypeAdapter<T> typeAdapter2 = (TypeAdapter) map.get(typeToken);
            if (typeAdapter2 != null) {
                return typeAdapter2;
            }
            z10 = false;
        }
        try {
            FutureTypeAdapter futureTypeAdapter = new FutureTypeAdapter();
            map.put(typeToken, futureTypeAdapter);
            Iterator<v> it = this.f68881e.iterator();
            TypeAdapter<T> typeAdapter3 = null;
            while (true) {
                if (it.hasNext()) {
                    typeAdapter3 = it.next().create(this, typeToken);
                    if (typeAdapter3 != null) {
                        futureTypeAdapter.c(typeAdapter3);
                        map.put(typeToken, typeAdapter3);
                        break;
                    }
                } else {
                    break;
                }
            }
            if (typeAdapter3 != null) {
                if (z10) {
                    this.f68878b.putAll(map);
                }
                return typeAdapter3;
            }
            throw new IllegalArgumentException("GSON (2.11.0) cannot handle " + typeToken);
        } finally {
            if (z10) {
                this.f68877a.remove();
            }
        }
    }

    public <T> TypeAdapter<T> q(Class<T> cls) {
        return p(TypeToken.get(cls));
    }

    public <T> TypeAdapter<T> r(v vVar, TypeToken<T> typeToken) {
        Objects.requireNonNull(vVar, "skipPast must not be null");
        Objects.requireNonNull(typeToken, "type must not be null");
        if (this.f68880d.d(typeToken, vVar)) {
            vVar = this.f68880d;
        }
        boolean z10 = false;
        for (v next : this.f68881e) {
            if (z10) {
                TypeAdapter<T> create = next.create(this, typeToken);
                if (create != null) {
                    return create;
                }
            } else if (next == vVar) {
                z10 = true;
            }
        }
        if (!z10) {
            return p(typeToken);
        }
        throw new IllegalArgumentException("GSON cannot serialize or deserialize " + typeToken);
    }

    public a t(Reader reader) {
        a aVar = new a(reader);
        s sVar = this.f68890n;
        if (sVar == null) {
            sVar = s.LEGACY_STRICT;
        }
        aVar.f0(sVar);
        return aVar;
    }

    public String toString() {
        return "{serializeNulls:" + this.f68885i + ",factories:" + this.f68881e + ",instanceCreators:" + this.f68879c + "}";
    }

    public Tc.c u(Writer writer) {
        if (this.f68887k) {
            writer.write(")]}'\n");
        }
        Tc.c cVar = new Tc.c(writer);
        cVar.F(this.f68889m);
        cVar.J(this.f68888l);
        s sVar = this.f68890n;
        if (sVar == null) {
            sVar = s.LEGACY_STRICT;
        }
        cVar.U(sVar);
        cVar.N(this.f68885i);
        return cVar;
    }

    public String v(JsonElement jsonElement) {
        StringWriter stringWriter = new StringWriter();
        z(jsonElement, stringWriter);
        return stringWriter.toString();
    }

    public String w(Object obj) {
        return obj == null ? v(k.f69184a) : x(obj, obj.getClass());
    }

    public String x(Object obj, Type type) {
        StringWriter stringWriter = new StringWriter();
        B(obj, type, stringWriter);
        return stringWriter.toString();
    }

    public void y(JsonElement jsonElement, Tc.c cVar) {
        s n10 = cVar.n();
        boolean o10 = cVar.o();
        boolean l10 = cVar.l();
        cVar.J(this.f68888l);
        cVar.N(this.f68885i);
        s sVar = this.f68890n;
        if (sVar != null) {
            cVar.U(sVar);
        } else if (cVar.n() == s.LEGACY_STRICT) {
            cVar.U(s.LENIENT);
        }
        try {
            n.b(jsonElement, cVar);
            cVar.U(n10);
            cVar.J(o10);
            cVar.N(l10);
        } catch (IOException e10) {
            throw new j((Throwable) e10);
        } catch (AssertionError e11) {
            throw new AssertionError("AssertionError (GSON 2.11.0): " + e11.getMessage(), e11);
        } catch (Throwable th2) {
            cVar.U(n10);
            cVar.J(o10);
            cVar.N(l10);
            throw th2;
        }
    }

    public void z(JsonElement jsonElement, Appendable appendable) {
        try {
            y(jsonElement, u(n.c(appendable)));
        } catch (IOException e10) {
            throw new j((Throwable) e10);
        }
    }

    Gson(Excluder excluder, d dVar, Map<Type, g<?>> map, boolean z10, boolean z11, boolean z12, boolean z13, e eVar, s sVar, boolean z14, boolean z15, q qVar, String str, int i10, int i11, List<v> list, List<v> list2, List<v> list3, u uVar, u uVar2, List<r> list4) {
        Map<Type, g<?>> map2 = map;
        boolean z16 = z11;
        boolean z17 = z14;
        boolean z18 = z15;
        List<r> list5 = list4;
        this.f68877a = new ThreadLocal<>();
        this.f68878b = new ConcurrentHashMap();
        this.f68882f = excluder;
        this.f68883g = dVar;
        this.f68884h = map2;
        c cVar = new c(map2, z18, list5);
        this.f68879c = cVar;
        this.f68885i = z10;
        this.f68886j = z16;
        this.f68887k = z12;
        this.f68888l = z13;
        this.f68889m = eVar;
        this.f68890n = sVar;
        this.f68891o = z17;
        this.f68892p = z18;
        this.f68896t = qVar;
        this.f68893q = str;
        this.f68894r = i10;
        this.f68895s = i11;
        this.f68897u = list;
        this.f68898v = list2;
        this.f68899w = uVar;
        this.f68900x = uVar2;
        this.f68901y = list5;
        ArrayList arrayList = new ArrayList();
        arrayList.add(TypeAdapters.f69048W);
        arrayList.add(ObjectTypeAdapter.a(uVar));
        arrayList.add(excluder);
        arrayList.addAll(list3);
        arrayList.add(TypeAdapters.f69028C);
        arrayList.add(TypeAdapters.f69062m);
        arrayList.add(TypeAdapters.f69056g);
        arrayList.add(TypeAdapters.f69058i);
        arrayList.add(TypeAdapters.f69060k);
        TypeAdapter<Number> s10 = s(qVar);
        arrayList.add(TypeAdapters.c(Long.TYPE, Long.class, s10));
        arrayList.add(TypeAdapters.c(Double.TYPE, Double.class, e(z17)));
        arrayList.add(TypeAdapters.c(Float.TYPE, Float.class, f(z17)));
        arrayList.add(NumberTypeAdapter.a(uVar2));
        arrayList.add(TypeAdapters.f69064o);
        arrayList.add(TypeAdapters.f69066q);
        arrayList.add(TypeAdapters.b(AtomicLong.class, b(s10)));
        arrayList.add(TypeAdapters.b(AtomicLongArray.class, c(s10)));
        arrayList.add(TypeAdapters.f69068s);
        arrayList.add(TypeAdapters.f69073x);
        arrayList.add(TypeAdapters.f69030E);
        arrayList.add(TypeAdapters.f69032G);
        arrayList.add(TypeAdapters.b(BigDecimal.class, TypeAdapters.f69075z));
        arrayList.add(TypeAdapters.b(BigInteger.class, TypeAdapters.f69026A));
        arrayList.add(TypeAdapters.b(f.class, TypeAdapters.f69027B));
        arrayList.add(TypeAdapters.f69034I);
        arrayList.add(TypeAdapters.f69036K);
        arrayList.add(TypeAdapters.f69040O);
        arrayList.add(TypeAdapters.f69042Q);
        arrayList.add(TypeAdapters.f69046U);
        arrayList.add(TypeAdapters.f69038M);
        arrayList.add(TypeAdapters.f69053d);
        arrayList.add(DefaultDateTypeAdapter.f68960c);
        arrayList.add(TypeAdapters.f69044S);
        if (com.google.gson.internal.sql.a.f69178a) {
            arrayList.add(com.google.gson.internal.sql.a.f69182e);
            arrayList.add(com.google.gson.internal.sql.a.f69181d);
            arrayList.add(com.google.gson.internal.sql.a.f69183f);
        }
        arrayList.add(ArrayTypeAdapter.f68954c);
        arrayList.add(TypeAdapters.f69051b);
        arrayList.add(new CollectionTypeAdapterFactory(cVar));
        arrayList.add(new MapTypeAdapterFactory(cVar, z16));
        JsonAdapterAnnotationTypeAdapterFactory jsonAdapterAnnotationTypeAdapterFactory = new JsonAdapterAnnotationTypeAdapterFactory(cVar);
        this.f68880d = jsonAdapterAnnotationTypeAdapterFactory;
        arrayList.add(jsonAdapterAnnotationTypeAdapterFactory);
        arrayList.add(TypeAdapters.f69049X);
        arrayList.add(new ReflectiveTypeAdapterFactory(cVar, dVar, excluder, jsonAdapterAnnotationTypeAdapterFactory, list4));
        this.f68881e = Collections.unmodifiableList(arrayList);
    }
}
