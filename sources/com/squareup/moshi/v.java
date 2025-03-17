package com.squareup.moshi;

import com.squareup.moshi.f;
import com.squareup.moshi.k;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;

final class v {

    /* renamed from: a  reason: collision with root package name */
    public static final f.e f122448a = new c();

    /* renamed from: b  reason: collision with root package name */
    static final f<Boolean> f122449b = new d();

    /* renamed from: c  reason: collision with root package name */
    static final f<Byte> f122450c = new e();

    /* renamed from: d  reason: collision with root package name */
    static final f<Character> f122451d = new f();

    /* renamed from: e  reason: collision with root package name */
    static final f<Double> f122452e = new g();

    /* renamed from: f  reason: collision with root package name */
    static final f<Float> f122453f = new h();

    /* renamed from: g  reason: collision with root package name */
    static final f<Integer> f122454g = new i();

    /* renamed from: h  reason: collision with root package name */
    static final f<Long> f122455h = new j();

    /* renamed from: i  reason: collision with root package name */
    static final f<Short> f122456i = new k();

    /* renamed from: j  reason: collision with root package name */
    static final f<String> f122457j = new a();

    class a extends f<String> {
        a() {
        }

        /* renamed from: a */
        public String fromJson(k kVar) {
            return kVar.C1();
        }

        /* renamed from: b */
        public void toJson(q qVar, String str) {
            qVar.N(str);
        }

        public String toString() {
            return "JsonAdapter(String)";
        }
    }

    static /* synthetic */ class b {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f122458a;

        /* JADX WARNING: Can't wrap try/catch for region: R(14:0|1|2|3|4|5|6|7|8|9|10|11|12|14) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                com.squareup.moshi.k$b[] r0 = com.squareup.moshi.k.b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f122458a = r0
                com.squareup.moshi.k$b r1 = com.squareup.moshi.k.b.BEGIN_ARRAY     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f122458a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.squareup.moshi.k$b r1 = com.squareup.moshi.k.b.BEGIN_OBJECT     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f122458a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.squareup.moshi.k$b r1 = com.squareup.moshi.k.b.STRING     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f122458a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.squareup.moshi.k$b r1 = com.squareup.moshi.k.b.NUMBER     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f122458a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.squareup.moshi.k$b r1 = com.squareup.moshi.k.b.BOOLEAN     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f122458a     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.squareup.moshi.k$b r1 = com.squareup.moshi.k.b.NULL     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.squareup.moshi.v.b.<clinit>():void");
        }
    }

    class c implements f.e {
        c() {
        }

        public f<?> a(Type type, Set<? extends Annotation> set, t tVar) {
            if (!set.isEmpty()) {
                return null;
            }
            if (type == Boolean.TYPE) {
                return v.f122449b;
            }
            if (type == Byte.TYPE) {
                return v.f122450c;
            }
            if (type == Character.TYPE) {
                return v.f122451d;
            }
            if (type == Double.TYPE) {
                return v.f122452e;
            }
            if (type == Float.TYPE) {
                return v.f122453f;
            }
            if (type == Integer.TYPE) {
                return v.f122454g;
            }
            if (type == Long.TYPE) {
                return v.f122455h;
            }
            if (type == Short.TYPE) {
                return v.f122456i;
            }
            if (type == Boolean.class) {
                return v.f122449b.nullSafe();
            }
            if (type == Byte.class) {
                return v.f122450c.nullSafe();
            }
            if (type == Character.class) {
                return v.f122451d.nullSafe();
            }
            if (type == Double.class) {
                return v.f122452e.nullSafe();
            }
            if (type == Float.class) {
                return v.f122453f.nullSafe();
            }
            if (type == Integer.class) {
                return v.f122454g.nullSafe();
            }
            if (type == Long.class) {
                return v.f122455h.nullSafe();
            }
            if (type == Short.class) {
                return v.f122456i.nullSafe();
            }
            if (type == String.class) {
                return v.f122457j.nullSafe();
            }
            if (type == Object.class) {
                return new m(tVar).nullSafe();
            }
            Class<?> g10 = w.g(type);
            f<?> d10 = ME.c.d(tVar, type, g10);
            if (d10 != null) {
                return d10;
            }
            if (g10.isEnum()) {
                return new l(g10).nullSafe();
            }
            return null;
        }
    }

    class d extends f<Boolean> {
        d() {
        }

        /* renamed from: a */
        public Boolean fromJson(k kVar) {
            return Boolean.valueOf(kVar.w1());
        }

        /* renamed from: b */
        public void toJson(q qVar, Boolean bool) {
            qVar.U(bool.booleanValue());
        }

        public String toString() {
            return "JsonAdapter(Boolean)";
        }
    }

    class e extends f<Byte> {
        e() {
        }

        /* renamed from: a */
        public Byte fromJson(k kVar) {
            return Byte.valueOf((byte) v.a(kVar, "a byte", -128, 255));
        }

        /* renamed from: b */
        public void toJson(q qVar, Byte b10) {
            qVar.F((long) (b10.intValue() & 255));
        }

        public String toString() {
            return "JsonAdapter(Byte)";
        }
    }

    class f extends f<Character> {
        f() {
        }

        /* renamed from: a */
        public Character fromJson(k kVar) {
            String C12 = kVar.C1();
            if (C12.length() <= 1) {
                return Character.valueOf(C12.charAt(0));
            }
            throw new h(String.format("Expected %s but was %s at path %s", new Object[]{"a char", '\"' + C12 + '\"', kVar.m()}));
        }

        /* renamed from: b */
        public void toJson(q qVar, Character ch2) {
            qVar.N(ch2.toString());
        }

        public String toString() {
            return "JsonAdapter(Character)";
        }
    }

    class g extends f<Double> {
        g() {
        }

        /* renamed from: a */
        public Double fromJson(k kVar) {
            return Double.valueOf(kVar.d2());
        }

        /* renamed from: b */
        public void toJson(q qVar, Double d10) {
            qVar.B(d10.doubleValue());
        }

        public String toString() {
            return "JsonAdapter(Double)";
        }
    }

    class h extends f<Float> {
        h() {
        }

        /* renamed from: a */
        public Float fromJson(k kVar) {
            float d22 = (float) kVar.d2();
            if (kVar.h() || !Float.isInfinite(d22)) {
                return Float.valueOf(d22);
            }
            throw new h("JSON forbids NaN and infinities: " + d22 + " at path " + kVar.m());
        }

        /* renamed from: b */
        public void toJson(q qVar, Float f10) {
            f10.getClass();
            qVar.J(f10);
        }

        public String toString() {
            return "JsonAdapter(Float)";
        }
    }

    class i extends f<Integer> {
        i() {
        }

        /* renamed from: a */
        public Integer fromJson(k kVar) {
            return Integer.valueOf(kVar.G0());
        }

        /* renamed from: b */
        public void toJson(q qVar, Integer num) {
            qVar.F((long) num.intValue());
        }

        public String toString() {
            return "JsonAdapter(Integer)";
        }
    }

    class j extends f<Long> {
        j() {
        }

        /* renamed from: a */
        public Long fromJson(k kVar) {
            return Long.valueOf(kVar.U2());
        }

        /* renamed from: b */
        public void toJson(q qVar, Long l10) {
            qVar.F(l10.longValue());
        }

        public String toString() {
            return "JsonAdapter(Long)";
        }
    }

    class k extends f<Short> {
        k() {
        }

        /* renamed from: a */
        public Short fromJson(k kVar) {
            return Short.valueOf((short) v.a(kVar, "a short", -32768, 32767));
        }

        /* renamed from: b */
        public void toJson(q qVar, Short sh2) {
            qVar.F((long) sh2.intValue());
        }

        public String toString() {
            return "JsonAdapter(Short)";
        }
    }

    static final class l<T extends Enum<T>> extends f<T> {

        /* renamed from: a  reason: collision with root package name */
        private final Class<T> f122459a;

        /* renamed from: b  reason: collision with root package name */
        private final String[] f122460b;

        /* renamed from: c  reason: collision with root package name */
        private final T[] f122461c;

        /* renamed from: d  reason: collision with root package name */
        private final k.a f122462d;

        l(Class<T> cls) {
            this.f122459a = cls;
            try {
                T[] tArr = (Enum[]) cls.getEnumConstants();
                this.f122461c = tArr;
                this.f122460b = new String[tArr.length];
                int i10 = 0;
                while (true) {
                    T[] tArr2 = this.f122461c;
                    if (i10 < tArr2.length) {
                        String name = tArr2[i10].name();
                        this.f122460b[i10] = ME.c.m(name, cls.getField(name));
                        i10++;
                    } else {
                        this.f122462d = k.a.a(this.f122460b);
                        return;
                    }
                }
            } catch (NoSuchFieldException e10) {
                throw new AssertionError("Missing field in " + cls.getName(), e10);
            }
        }

        /* renamed from: a */
        public T fromJson(k kVar) {
            int t10 = kVar.t(this.f122462d);
            if (t10 != -1) {
                return this.f122461c[t10];
            }
            String m10 = kVar.m();
            String C12 = kVar.C1();
            throw new h("Expected one of " + Arrays.asList(this.f122460b) + " but was " + C12 + " at path " + m10);
        }

        /* renamed from: b */
        public void toJson(q qVar, T t10) {
            qVar.N(this.f122460b[t10.ordinal()]);
        }

        public String toString() {
            return "JsonAdapter(" + this.f122459a.getName() + ")";
        }
    }

    static final class m extends f<Object> {

        /* renamed from: a  reason: collision with root package name */
        private final t f122463a;

        /* renamed from: b  reason: collision with root package name */
        private final f<List> f122464b;

        /* renamed from: c  reason: collision with root package name */
        private final f<Map> f122465c;

        /* renamed from: d  reason: collision with root package name */
        private final f<String> f122466d;

        /* renamed from: e  reason: collision with root package name */
        private final f<Double> f122467e;

        /* renamed from: f  reason: collision with root package name */
        private final f<Boolean> f122468f;

        m(t tVar) {
            this.f122463a = tVar;
            this.f122464b = tVar.c(List.class);
            this.f122465c = tVar.c(Map.class);
            this.f122466d = tVar.c(String.class);
            this.f122467e = tVar.c(Double.class);
            this.f122468f = tVar.c(Boolean.class);
        }

        private Class<?> a(Class<?> cls) {
            Class<Map> cls2 = Map.class;
            if (cls2.isAssignableFrom(cls)) {
                return cls2;
            }
            Class<Collection> cls3 = Collection.class;
            return cls3.isAssignableFrom(cls) ? cls3 : cls;
        }

        public Object fromJson(k kVar) {
            switch (b.f122458a[kVar.n().ordinal()]) {
                case 1:
                    return this.f122464b.fromJson(kVar);
                case 2:
                    return this.f122465c.fromJson(kVar);
                case 3:
                    return this.f122466d.fromJson(kVar);
                case 4:
                    return this.f122467e.fromJson(kVar);
                case 5:
                    return this.f122468f.fromJson(kVar);
                case 6:
                    return kVar.i();
                default:
                    throw new IllegalStateException("Expected a value but was " + kVar.n() + " at path " + kVar.m());
            }
        }

        public void toJson(q qVar, Object obj) {
            Class<?> cls = obj.getClass();
            if (cls == Object.class) {
                qVar.d();
                qVar.g();
                return;
            }
            this.f122463a.e(a(cls), ME.c.f112012a).toJson(qVar, obj);
        }

        public String toString() {
            return "JsonAdapter(Object)";
        }
    }

    static int a(k kVar, String str, int i10, int i11) {
        int G02 = kVar.G0();
        if (G02 >= i10 && G02 <= i11) {
            return G02;
        }
        throw new h(String.format("Expected %s but was %s at path %s", new Object[]{str, Integer.valueOf(G02), kVar.m()}));
    }
}
