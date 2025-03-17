package com.google.gson.internal.bind;

import Tc.b;
import Tc.c;
import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonPrimitive;
import com.google.gson.TypeAdapter;
import com.google.gson.internal.f;
import com.google.gson.internal.i;
import com.google.gson.internal.o;
import com.google.gson.j;
import com.google.gson.k;
import com.google.gson.p;
import com.google.gson.reflect.TypeToken;
import com.google.gson.v;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.net.InetAddress;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.security.AccessController;
import java.security.PrivilegedAction;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Calendar;
import java.util.Currency;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicIntegerArray;
import org.slf4j.Marker;

public final class TypeAdapters {

    /* renamed from: A  reason: collision with root package name */
    public static final TypeAdapter<BigInteger> f69026A = new TypeAdapter<BigInteger>() {
        /* renamed from: a */
        public BigInteger read(Tc.a aVar) {
            if (aVar.F() == b.NULL) {
                aVar.x();
                return null;
            }
            String C12 = aVar.C1();
            try {
                return i.c(C12);
            } catch (NumberFormatException e10) {
                throw new p("Failed parsing '" + C12 + "' as BigInteger; at path " + aVar.q(), e10);
            }
        }

        /* renamed from: b */
        public void write(c cVar, BigInteger bigInteger) {
            cVar.j0(bigInteger);
        }
    };

    /* renamed from: B  reason: collision with root package name */
    public static final TypeAdapter<f> f69027B = new TypeAdapter<f>() {
        /* renamed from: a */
        public f read(Tc.a aVar) {
            if (aVar.F() != b.NULL) {
                return new f(aVar.C1());
            }
            aVar.x();
            return null;
        }

        /* renamed from: b */
        public void write(c cVar, f fVar) {
            cVar.j0(fVar);
        }
    };

    /* renamed from: C  reason: collision with root package name */
    public static final v f69028C;

    /* renamed from: D  reason: collision with root package name */
    public static final TypeAdapter<StringBuilder> f69029D;

    /* renamed from: E  reason: collision with root package name */
    public static final v f69030E;

    /* renamed from: F  reason: collision with root package name */
    public static final TypeAdapter<StringBuffer> f69031F;

    /* renamed from: G  reason: collision with root package name */
    public static final v f69032G;

    /* renamed from: H  reason: collision with root package name */
    public static final TypeAdapter<URL> f69033H;

    /* renamed from: I  reason: collision with root package name */
    public static final v f69034I;

    /* renamed from: J  reason: collision with root package name */
    public static final TypeAdapter<URI> f69035J;

    /* renamed from: K  reason: collision with root package name */
    public static final v f69036K;

    /* renamed from: L  reason: collision with root package name */
    public static final TypeAdapter<InetAddress> f69037L;

    /* renamed from: M  reason: collision with root package name */
    public static final v f69038M;

    /* renamed from: N  reason: collision with root package name */
    public static final TypeAdapter<UUID> f69039N;

    /* renamed from: O  reason: collision with root package name */
    public static final v f69040O;

    /* renamed from: P  reason: collision with root package name */
    public static final TypeAdapter<Currency> f69041P;

    /* renamed from: Q  reason: collision with root package name */
    public static final v f69042Q;

    /* renamed from: R  reason: collision with root package name */
    public static final TypeAdapter<Calendar> f69043R;

    /* renamed from: S  reason: collision with root package name */
    public static final v f69044S;

    /* renamed from: T  reason: collision with root package name */
    public static final TypeAdapter<Locale> f69045T;

    /* renamed from: U  reason: collision with root package name */
    public static final v f69046U;

    /* renamed from: V  reason: collision with root package name */
    public static final TypeAdapter<JsonElement> f69047V;

    /* renamed from: W  reason: collision with root package name */
    public static final v f69048W;

    /* renamed from: X  reason: collision with root package name */
    public static final v f69049X = new v() {
        /* JADX WARNING: type inference failed for: r3v0, types: [com.google.gson.reflect.TypeToken<T>, com.google.gson.reflect.TypeToken] */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public <T> com.google.gson.TypeAdapter<T> create(com.google.gson.Gson r2, com.google.gson.reflect.TypeToken<T> r3) {
            /*
                r1 = this;
                java.lang.Class r2 = r3.getRawType()
                java.lang.Class<java.lang.Enum> r3 = java.lang.Enum.class
                boolean r0 = r3.isAssignableFrom(r2)
                if (r0 == 0) goto L_0x001f
                if (r2 != r3) goto L_0x000f
                goto L_0x001f
            L_0x000f:
                boolean r3 = r2.isEnum()
                if (r3 != 0) goto L_0x0019
                java.lang.Class r2 = r2.getSuperclass()
            L_0x0019:
                com.google.gson.internal.bind.TypeAdapters$EnumTypeAdapter r3 = new com.google.gson.internal.bind.TypeAdapters$EnumTypeAdapter
                r3.<init>(r2)
                return r3
            L_0x001f:
                r2 = 0
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.gson.internal.bind.TypeAdapters.AnonymousClass29.create(com.google.gson.Gson, com.google.gson.reflect.TypeToken):com.google.gson.TypeAdapter");
        }
    };

    /* renamed from: a  reason: collision with root package name */
    public static final TypeAdapter<Class> f69050a;

    /* renamed from: b  reason: collision with root package name */
    public static final v f69051b;

    /* renamed from: c  reason: collision with root package name */
    public static final TypeAdapter<BitSet> f69052c;

    /* renamed from: d  reason: collision with root package name */
    public static final v f69053d;

    /* renamed from: e  reason: collision with root package name */
    public static final TypeAdapter<Boolean> f69054e;

    /* renamed from: f  reason: collision with root package name */
    public static final TypeAdapter<Boolean> f69055f = new TypeAdapter<Boolean>() {
        /* renamed from: a */
        public Boolean read(Tc.a aVar) {
            if (aVar.F() != b.NULL) {
                return Boolean.valueOf(aVar.C1());
            }
            aVar.x();
            return null;
        }

        /* renamed from: b */
        public void write(c cVar, Boolean bool) {
            cVar.l0(bool == null ? "null" : bool.toString());
        }
    };

    /* renamed from: g  reason: collision with root package name */
    public static final v f69056g;

    /* renamed from: h  reason: collision with root package name */
    public static final TypeAdapter<Number> f69057h;

    /* renamed from: i  reason: collision with root package name */
    public static final v f69058i;

    /* renamed from: j  reason: collision with root package name */
    public static final TypeAdapter<Number> f69059j;

    /* renamed from: k  reason: collision with root package name */
    public static final v f69060k;

    /* renamed from: l  reason: collision with root package name */
    public static final TypeAdapter<Number> f69061l;

    /* renamed from: m  reason: collision with root package name */
    public static final v f69062m;

    /* renamed from: n  reason: collision with root package name */
    public static final TypeAdapter<AtomicInteger> f69063n;

    /* renamed from: o  reason: collision with root package name */
    public static final v f69064o;

    /* renamed from: p  reason: collision with root package name */
    public static final TypeAdapter<AtomicBoolean> f69065p;

    /* renamed from: q  reason: collision with root package name */
    public static final v f69066q;

    /* renamed from: r  reason: collision with root package name */
    public static final TypeAdapter<AtomicIntegerArray> f69067r;

    /* renamed from: s  reason: collision with root package name */
    public static final v f69068s;

    /* renamed from: t  reason: collision with root package name */
    public static final TypeAdapter<Number> f69069t = new TypeAdapter<Number>() {
        /* renamed from: a */
        public Number read(Tc.a aVar) {
            if (aVar.F() == b.NULL) {
                aVar.x();
                return null;
            }
            try {
                return Long.valueOf(aVar.U2());
            } catch (NumberFormatException e10) {
                throw new p((Throwable) e10);
            }
        }

        /* renamed from: b */
        public void write(c cVar, Number number) {
            if (number == null) {
                cVar.v();
            } else {
                cVar.h0(number.longValue());
            }
        }
    };

    /* renamed from: u  reason: collision with root package name */
    public static final TypeAdapter<Number> f69070u = new TypeAdapter<Number>() {
        /* renamed from: a */
        public Number read(Tc.a aVar) {
            if (aVar.F() != b.NULL) {
                return Float.valueOf((float) aVar.d2());
            }
            aVar.x();
            return null;
        }

        /* renamed from: b */
        public void write(c cVar, Number number) {
            if (number == null) {
                cVar.v();
                return;
            }
            if (!(number instanceof Float)) {
                number = Float.valueOf(number.floatValue());
            }
            cVar.j0(number);
        }
    };

    /* renamed from: v  reason: collision with root package name */
    public static final TypeAdapter<Number> f69071v = new TypeAdapter<Number>() {
        /* renamed from: a */
        public Number read(Tc.a aVar) {
            if (aVar.F() != b.NULL) {
                return Double.valueOf(aVar.d2());
            }
            aVar.x();
            return null;
        }

        /* renamed from: b */
        public void write(c cVar, Number number) {
            if (number == null) {
                cVar.v();
            } else {
                cVar.f0(number.doubleValue());
            }
        }
    };

    /* renamed from: w  reason: collision with root package name */
    public static final TypeAdapter<Character> f69072w;

    /* renamed from: x  reason: collision with root package name */
    public static final v f69073x;

    /* renamed from: y  reason: collision with root package name */
    public static final TypeAdapter<String> f69074y;

    /* renamed from: z  reason: collision with root package name */
    public static final TypeAdapter<BigDecimal> f69075z = new TypeAdapter<BigDecimal>() {
        /* renamed from: a */
        public BigDecimal read(Tc.a aVar) {
            if (aVar.F() == b.NULL) {
                aVar.x();
                return null;
            }
            String C12 = aVar.C1();
            try {
                return i.b(C12);
            } catch (NumberFormatException e10) {
                throw new p("Failed parsing '" + C12 + "' as BigDecimal; at path " + aVar.q(), e10);
            }
        }

        /* renamed from: b */
        public void write(c cVar, BigDecimal bigDecimal) {
            cVar.j0(bigDecimal);
        }
    };

    private static final class EnumTypeAdapter<T extends Enum<T>> extends TypeAdapter<T> {

        /* renamed from: a  reason: collision with root package name */
        private final Map<String, T> f69090a = new HashMap();

        /* renamed from: b  reason: collision with root package name */
        private final Map<String, T> f69091b = new HashMap();

        /* renamed from: c  reason: collision with root package name */
        private final Map<T, String> f69092c = new HashMap();

        class a implements PrivilegedAction<Field[]> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ Class f69093a;

            a(Class cls) {
                this.f69093a = cls;
            }

            /* renamed from: a */
            public Field[] run() {
                Field[] declaredFields = this.f69093a.getDeclaredFields();
                ArrayList arrayList = new ArrayList(declaredFields.length);
                for (Field field : declaredFields) {
                    if (field.isEnumConstant()) {
                        arrayList.add(field);
                    }
                }
                Field[] fieldArr = (Field[]) arrayList.toArray(new Field[0]);
                AccessibleObject.setAccessible(fieldArr, true);
                return fieldArr;
            }
        }

        public EnumTypeAdapter(Class<T> cls) {
            try {
                for (Field field : (Field[]) AccessController.doPrivileged(new a(cls))) {
                    Enum enumR = (Enum) field.get((Object) null);
                    String name = enumR.name();
                    String str = enumR.toString();
                    Qc.c cVar = (Qc.c) field.getAnnotation(Qc.c.class);
                    if (cVar != null) {
                        name = cVar.value();
                        for (String put : cVar.alternate()) {
                            this.f69090a.put(put, enumR);
                        }
                    }
                    this.f69090a.put(name, enumR);
                    this.f69091b.put(str, enumR);
                    this.f69092c.put(enumR, name);
                }
            } catch (IllegalAccessException e10) {
                throw new AssertionError(e10);
            }
        }

        /* renamed from: a */
        public T read(Tc.a aVar) {
            if (aVar.F() == b.NULL) {
                aVar.x();
                return null;
            }
            String C12 = aVar.C1();
            T t10 = (Enum) this.f69090a.get(C12);
            return t10 == null ? (Enum) this.f69091b.get(C12) : t10;
        }

        /* renamed from: b */
        public void write(c cVar, T t10) {
            cVar.l0(t10 == null ? null : this.f69092c.get(t10));
        }
    }

    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f69095a;

        /* JADX WARNING: Can't wrap try/catch for region: R(14:0|1|2|3|4|5|6|7|8|9|10|11|12|14) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                Tc.b[] r0 = Tc.b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f69095a = r0
                Tc.b r1 = Tc.b.NUMBER     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f69095a     // Catch:{ NoSuchFieldError -> 0x001d }
                Tc.b r1 = Tc.b.STRING     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f69095a     // Catch:{ NoSuchFieldError -> 0x0028 }
                Tc.b r1 = Tc.b.BOOLEAN     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f69095a     // Catch:{ NoSuchFieldError -> 0x0033 }
                Tc.b r1 = Tc.b.BEGIN_ARRAY     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f69095a     // Catch:{ NoSuchFieldError -> 0x003e }
                Tc.b r1 = Tc.b.BEGIN_OBJECT     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f69095a     // Catch:{ NoSuchFieldError -> 0x0049 }
                Tc.b r1 = Tc.b.NULL     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.gson.internal.bind.TypeAdapters.a.<clinit>():void");
        }
    }

    static {
        TypeAdapter<Class> nullSafe = new TypeAdapter<Class>() {
            /* renamed from: a */
            public Class read(Tc.a aVar) {
                throw new UnsupportedOperationException("Attempted to deserialize a java.lang.Class. Forgot to register a type adapter?\nSee " + o.a("java-lang-class-unsupported"));
            }

            /* renamed from: b */
            public void write(c cVar, Class cls) {
                throw new UnsupportedOperationException("Attempted to serialize java.lang.Class: " + cls.getName() + ". Forgot to register a type adapter?\nSee " + o.a("java-lang-class-unsupported"));
            }
        }.nullSafe();
        f69050a = nullSafe;
        f69051b = b(Class.class, nullSafe);
        TypeAdapter<BitSet> nullSafe2 = new TypeAdapter<BitSet>() {
            /* renamed from: a */
            public BitSet read(Tc.a aVar) {
                BitSet bitSet = new BitSet();
                aVar.d();
                b F10 = aVar.F();
                int i10 = 0;
                while (F10 != b.END_ARRAY) {
                    int i11 = a.f69095a[F10.ordinal()];
                    boolean z10 = true;
                    if (i11 == 1 || i11 == 2) {
                        int G02 = aVar.G0();
                        if (G02 == 0) {
                            z10 = false;
                        } else if (G02 != 1) {
                            throw new p("Invalid bitset value " + G02 + ", expected 0 or 1; at path " + aVar.q());
                        }
                    } else if (i11 == 3) {
                        z10 = aVar.w1();
                    } else {
                        throw new p("Invalid bitset value type: " + F10 + "; at path " + aVar.m());
                    }
                    if (z10) {
                        bitSet.set(i10);
                    }
                    i10++;
                    F10 = aVar.F();
                }
                aVar.i();
                return bitSet;
            }

            /* renamed from: b */
            public void write(c cVar, BitSet bitSet) {
                cVar.e();
                int length = bitSet.length();
                for (int i10 = 0; i10 < length; i10++) {
                    cVar.h0(bitSet.get(i10) ? 1 : 0);
                }
                cVar.h();
            }
        }.nullSafe();
        f69052c = nullSafe2;
        f69053d = b(BitSet.class, nullSafe2);
        AnonymousClass3 r02 = new TypeAdapter<Boolean>() {
            /* renamed from: a */
            public Boolean read(Tc.a aVar) {
                b F10 = aVar.F();
                if (F10 != b.NULL) {
                    return F10 == b.STRING ? Boolean.valueOf(Boolean.parseBoolean(aVar.C1())) : Boolean.valueOf(aVar.w1());
                }
                aVar.x();
                return null;
            }

            /* renamed from: b */
            public void write(c cVar, Boolean bool) {
                cVar.i0(bool);
            }
        };
        f69054e = r02;
        f69056g = c(Boolean.TYPE, Boolean.class, r02);
        AnonymousClass5 r03 = new TypeAdapter<Number>() {
            /* renamed from: a */
            public Number read(Tc.a aVar) {
                if (aVar.F() == b.NULL) {
                    aVar.x();
                    return null;
                }
                try {
                    int G02 = aVar.G0();
                    if (G02 <= 255 && G02 >= -128) {
                        return Byte.valueOf((byte) G02);
                    }
                    throw new p("Lossy conversion from " + G02 + " to byte; at path " + aVar.q());
                } catch (NumberFormatException e10) {
                    throw new p((Throwable) e10);
                }
            }

            /* renamed from: b */
            public void write(c cVar, Number number) {
                if (number == null) {
                    cVar.v();
                } else {
                    cVar.h0((long) number.byteValue());
                }
            }
        };
        f69057h = r03;
        f69058i = c(Byte.TYPE, Byte.class, r03);
        AnonymousClass6 r04 = new TypeAdapter<Number>() {
            /* renamed from: a */
            public Number read(Tc.a aVar) {
                if (aVar.F() == b.NULL) {
                    aVar.x();
                    return null;
                }
                try {
                    int G02 = aVar.G0();
                    if (G02 <= 65535 && G02 >= -32768) {
                        return Short.valueOf((short) G02);
                    }
                    throw new p("Lossy conversion from " + G02 + " to short; at path " + aVar.q());
                } catch (NumberFormatException e10) {
                    throw new p((Throwable) e10);
                }
            }

            /* renamed from: b */
            public void write(c cVar, Number number) {
                if (number == null) {
                    cVar.v();
                } else {
                    cVar.h0((long) number.shortValue());
                }
            }
        };
        f69059j = r04;
        f69060k = c(Short.TYPE, Short.class, r04);
        AnonymousClass7 r05 = new TypeAdapter<Number>() {
            /* renamed from: a */
            public Number read(Tc.a aVar) {
                if (aVar.F() == b.NULL) {
                    aVar.x();
                    return null;
                }
                try {
                    return Integer.valueOf(aVar.G0());
                } catch (NumberFormatException e10) {
                    throw new p((Throwable) e10);
                }
            }

            /* renamed from: b */
            public void write(c cVar, Number number) {
                if (number == null) {
                    cVar.v();
                } else {
                    cVar.h0((long) number.intValue());
                }
            }
        };
        f69061l = r05;
        f69062m = c(Integer.TYPE, Integer.class, r05);
        TypeAdapter<AtomicInteger> nullSafe3 = new TypeAdapter<AtomicInteger>() {
            /* renamed from: a */
            public AtomicInteger read(Tc.a aVar) {
                try {
                    return new AtomicInteger(aVar.G0());
                } catch (NumberFormatException e10) {
                    throw new p((Throwable) e10);
                }
            }

            /* renamed from: b */
            public void write(c cVar, AtomicInteger atomicInteger) {
                cVar.h0((long) atomicInteger.get());
            }
        }.nullSafe();
        f69063n = nullSafe3;
        f69064o = b(AtomicInteger.class, nullSafe3);
        TypeAdapter<AtomicBoolean> nullSafe4 = new TypeAdapter<AtomicBoolean>() {
            /* renamed from: a */
            public AtomicBoolean read(Tc.a aVar) {
                return new AtomicBoolean(aVar.w1());
            }

            /* renamed from: b */
            public void write(c cVar, AtomicBoolean atomicBoolean) {
                cVar.o0(atomicBoolean.get());
            }
        }.nullSafe();
        f69065p = nullSafe4;
        f69066q = b(AtomicBoolean.class, nullSafe4);
        TypeAdapter<AtomicIntegerArray> nullSafe5 = new TypeAdapter<AtomicIntegerArray>() {
            /* renamed from: a */
            public AtomicIntegerArray read(Tc.a aVar) {
                ArrayList arrayList = new ArrayList();
                aVar.d();
                while (aVar.hasNext()) {
                    try {
                        arrayList.add(Integer.valueOf(aVar.G0()));
                    } catch (NumberFormatException e10) {
                        throw new p((Throwable) e10);
                    }
                }
                aVar.i();
                int size = arrayList.size();
                AtomicIntegerArray atomicIntegerArray = new AtomicIntegerArray(size);
                for (int i10 = 0; i10 < size; i10++) {
                    atomicIntegerArray.set(i10, ((Integer) arrayList.get(i10)).intValue());
                }
                return atomicIntegerArray;
            }

            /* renamed from: b */
            public void write(c cVar, AtomicIntegerArray atomicIntegerArray) {
                cVar.e();
                int length = atomicIntegerArray.length();
                for (int i10 = 0; i10 < length; i10++) {
                    cVar.h0((long) atomicIntegerArray.get(i10));
                }
                cVar.h();
            }
        }.nullSafe();
        f69067r = nullSafe5;
        f69068s = b(AtomicIntegerArray.class, nullSafe5);
        AnonymousClass14 r06 = new TypeAdapter<Character>() {
            /* renamed from: a */
            public Character read(Tc.a aVar) {
                if (aVar.F() == b.NULL) {
                    aVar.x();
                    return null;
                }
                String C12 = aVar.C1();
                if (C12.length() == 1) {
                    return Character.valueOf(C12.charAt(0));
                }
                throw new p("Expecting character, got: " + C12 + "; at " + aVar.q());
            }

            /* renamed from: b */
            public void write(c cVar, Character ch2) {
                cVar.l0(ch2 == null ? null : String.valueOf(ch2));
            }
        };
        f69072w = r06;
        f69073x = c(Character.TYPE, Character.class, r06);
        AnonymousClass15 r07 = new TypeAdapter<String>() {
            /* renamed from: a */
            public String read(Tc.a aVar) {
                b F10 = aVar.F();
                if (F10 != b.NULL) {
                    return F10 == b.BOOLEAN ? Boolean.toString(aVar.w1()) : aVar.C1();
                }
                aVar.x();
                return null;
            }

            /* renamed from: b */
            public void write(c cVar, String str) {
                cVar.l0(str);
            }
        };
        f69074y = r07;
        f69028C = b(String.class, r07);
        AnonymousClass19 r08 = new TypeAdapter<StringBuilder>() {
            /* renamed from: a */
            public StringBuilder read(Tc.a aVar) {
                if (aVar.F() != b.NULL) {
                    return new StringBuilder(aVar.C1());
                }
                aVar.x();
                return null;
            }

            /* renamed from: b */
            public void write(c cVar, StringBuilder sb2) {
                cVar.l0(sb2 == null ? null : sb2.toString());
            }
        };
        f69029D = r08;
        f69030E = b(StringBuilder.class, r08);
        AnonymousClass20 r09 = new TypeAdapter<StringBuffer>() {
            /* renamed from: a */
            public StringBuffer read(Tc.a aVar) {
                if (aVar.F() != b.NULL) {
                    return new StringBuffer(aVar.C1());
                }
                aVar.x();
                return null;
            }

            /* renamed from: b */
            public void write(c cVar, StringBuffer stringBuffer) {
                cVar.l0(stringBuffer == null ? null : stringBuffer.toString());
            }
        };
        f69031F = r09;
        f69032G = b(StringBuffer.class, r09);
        AnonymousClass21 r010 = new TypeAdapter<URL>() {
            /* renamed from: a */
            public URL read(Tc.a aVar) {
                if (aVar.F() == b.NULL) {
                    aVar.x();
                    return null;
                }
                String C12 = aVar.C1();
                if (C12.equals("null")) {
                    return null;
                }
                return new URL(C12);
            }

            /* renamed from: b */
            public void write(c cVar, URL url) {
                cVar.l0(url == null ? null : url.toExternalForm());
            }
        };
        f69033H = r010;
        f69034I = b(URL.class, r010);
        AnonymousClass22 r011 = new TypeAdapter<URI>() {
            /* renamed from: a */
            public URI read(Tc.a aVar) {
                if (aVar.F() == b.NULL) {
                    aVar.x();
                    return null;
                }
                try {
                    String C12 = aVar.C1();
                    if (C12.equals("null")) {
                        return null;
                    }
                    return new URI(C12);
                } catch (URISyntaxException e10) {
                    throw new j((Throwable) e10);
                }
            }

            /* renamed from: b */
            public void write(c cVar, URI uri) {
                cVar.l0(uri == null ? null : uri.toASCIIString());
            }
        };
        f69035J = r011;
        f69036K = b(URI.class, r011);
        AnonymousClass23 r012 = new TypeAdapter<InetAddress>() {
            /* renamed from: a */
            public InetAddress read(Tc.a aVar) {
                if (aVar.F() != b.NULL) {
                    return InetAddress.getByName(aVar.C1());
                }
                aVar.x();
                return null;
            }

            /* renamed from: b */
            public void write(c cVar, InetAddress inetAddress) {
                cVar.l0(inetAddress == null ? null : inetAddress.getHostAddress());
            }
        };
        f69037L = r012;
        f69038M = e(InetAddress.class, r012);
        AnonymousClass24 r013 = new TypeAdapter<UUID>() {
            /* renamed from: a */
            public UUID read(Tc.a aVar) {
                if (aVar.F() == b.NULL) {
                    aVar.x();
                    return null;
                }
                String C12 = aVar.C1();
                try {
                    return UUID.fromString(C12);
                } catch (IllegalArgumentException e10) {
                    throw new p("Failed parsing '" + C12 + "' as UUID; at path " + aVar.q(), e10);
                }
            }

            /* renamed from: b */
            public void write(c cVar, UUID uuid) {
                cVar.l0(uuid == null ? null : uuid.toString());
            }
        };
        f69039N = r013;
        f69040O = b(UUID.class, r013);
        TypeAdapter<Currency> nullSafe6 = new TypeAdapter<Currency>() {
            /* renamed from: a */
            public Currency read(Tc.a aVar) {
                String C12 = aVar.C1();
                try {
                    return Currency.getInstance(C12);
                } catch (IllegalArgumentException e10) {
                    throw new p("Failed parsing '" + C12 + "' as Currency; at path " + aVar.q(), e10);
                }
            }

            /* renamed from: b */
            public void write(c cVar, Currency currency) {
                cVar.l0(currency.getCurrencyCode());
            }
        }.nullSafe();
        f69041P = nullSafe6;
        f69042Q = b(Currency.class, nullSafe6);
        AnonymousClass26 r014 = new TypeAdapter<Calendar>() {
            /* renamed from: a */
            public Calendar read(Tc.a aVar) {
                if (aVar.F() == b.NULL) {
                    aVar.x();
                    return null;
                }
                aVar.e();
                int i10 = 0;
                int i11 = 0;
                int i12 = 0;
                int i13 = 0;
                int i14 = 0;
                int i15 = 0;
                while (aVar.F() != b.END_OBJECT) {
                    String B02 = aVar.B0();
                    int G02 = aVar.G0();
                    B02.hashCode();
                    char c10 = 65535;
                    switch (B02.hashCode()) {
                        case -1181204563:
                            if (B02.equals("dayOfMonth")) {
                                c10 = 0;
                                break;
                            }
                            break;
                        case -1074026988:
                            if (B02.equals("minute")) {
                                c10 = 1;
                                break;
                            }
                            break;
                        case -906279820:
                            if (B02.equals("second")) {
                                c10 = 2;
                                break;
                            }
                            break;
                        case 3704893:
                            if (B02.equals("year")) {
                                c10 = 3;
                                break;
                            }
                            break;
                        case 104080000:
                            if (B02.equals("month")) {
                                c10 = 4;
                                break;
                            }
                            break;
                        case 985252545:
                            if (B02.equals("hourOfDay")) {
                                c10 = 5;
                                break;
                            }
                            break;
                    }
                    switch (c10) {
                        case 0:
                            i12 = G02;
                            break;
                        case 1:
                            i14 = G02;
                            break;
                        case 2:
                            i15 = G02;
                            break;
                        case 3:
                            i10 = G02;
                            break;
                        case 4:
                            i11 = G02;
                            break;
                        case 5:
                            i13 = G02;
                            break;
                    }
                }
                aVar.l();
                return new GregorianCalendar(i10, i11, i12, i13, i14, i15);
            }

            /* renamed from: b */
            public void write(c cVar, Calendar calendar) {
                if (calendar == null) {
                    cVar.v();
                    return;
                }
                cVar.f();
                cVar.t("year");
                cVar.h0((long) calendar.get(1));
                cVar.t("month");
                cVar.h0((long) calendar.get(2));
                cVar.t("dayOfMonth");
                cVar.h0((long) calendar.get(5));
                cVar.t("hourOfDay");
                cVar.h0((long) calendar.get(11));
                cVar.t("minute");
                cVar.h0((long) calendar.get(12));
                cVar.t("second");
                cVar.h0((long) calendar.get(13));
                cVar.i();
            }
        };
        f69043R = r014;
        f69044S = d(Calendar.class, GregorianCalendar.class, r014);
        AnonymousClass27 r015 = new TypeAdapter<Locale>() {
            /* renamed from: a */
            public Locale read(Tc.a aVar) {
                String str = null;
                if (aVar.F() == b.NULL) {
                    aVar.x();
                    return null;
                }
                StringTokenizer stringTokenizer = new StringTokenizer(aVar.C1(), "_");
                String nextToken = stringTokenizer.hasMoreElements() ? stringTokenizer.nextToken() : null;
                String nextToken2 = stringTokenizer.hasMoreElements() ? stringTokenizer.nextToken() : null;
                if (stringTokenizer.hasMoreElements()) {
                    str = stringTokenizer.nextToken();
                }
                return (nextToken2 == null && str == null) ? new Locale(nextToken) : str == null ? new Locale(nextToken, nextToken2) : new Locale(nextToken, nextToken2, str);
            }

            /* renamed from: b */
            public void write(c cVar, Locale locale) {
                cVar.l0(locale == null ? null : locale.toString());
            }
        };
        f69045T = r015;
        f69046U = b(Locale.class, r015);
        AnonymousClass28 r016 = new TypeAdapter<JsonElement>() {
            private JsonElement b(Tc.a aVar, b bVar) {
                int i10 = a.f69095a[bVar.ordinal()];
                if (i10 == 1) {
                    return new JsonPrimitive((Number) new f(aVar.C1()));
                }
                if (i10 == 2) {
                    return new JsonPrimitive(aVar.C1());
                }
                if (i10 == 3) {
                    return new JsonPrimitive(Boolean.valueOf(aVar.w1()));
                }
                if (i10 == 6) {
                    aVar.x();
                    return k.f69184a;
                }
                throw new IllegalStateException("Unexpected token: " + bVar);
            }

            private JsonElement c(Tc.a aVar, b bVar) {
                int i10 = a.f69095a[bVar.ordinal()];
                if (i10 == 4) {
                    aVar.d();
                    return new JsonArray();
                } else if (i10 != 5) {
                    return null;
                } else {
                    aVar.e();
                    return new JsonObject();
                }
            }

            /* renamed from: a */
            public JsonElement read(Tc.a aVar) {
                if (aVar instanceof a) {
                    return ((a) aVar).A0();
                }
                b F10 = aVar.F();
                JsonElement c10 = c(aVar, F10);
                if (c10 == null) {
                    return b(aVar, F10);
                }
                ArrayDeque arrayDeque = new ArrayDeque();
                while (true) {
                    if (aVar.hasNext()) {
                        String B02 = c10 instanceof JsonObject ? aVar.B0() : null;
                        b F11 = aVar.F();
                        JsonElement c11 = c(aVar, F11);
                        boolean z10 = c11 != null;
                        if (c11 == null) {
                            c11 = b(aVar, F11);
                        }
                        if (c10 instanceof JsonArray) {
                            ((JsonArray) c10).add(c11);
                        } else {
                            ((JsonObject) c10).add(B02, c11);
                        }
                        if (z10) {
                            arrayDeque.addLast(c10);
                            c10 = c11;
                        }
                    } else {
                        if (c10 instanceof JsonArray) {
                            aVar.i();
                        } else {
                            aVar.l();
                        }
                        if (arrayDeque.isEmpty()) {
                            return c10;
                        }
                        c10 = (JsonElement) arrayDeque.removeLast();
                    }
                }
            }

            /* renamed from: d */
            public void write(c cVar, JsonElement jsonElement) {
                if (jsonElement == null || jsonElement.isJsonNull()) {
                    cVar.v();
                } else if (jsonElement.isJsonPrimitive()) {
                    JsonPrimitive asJsonPrimitive = jsonElement.getAsJsonPrimitive();
                    if (asJsonPrimitive.isNumber()) {
                        cVar.j0(asJsonPrimitive.getAsNumber());
                    } else if (asJsonPrimitive.isBoolean()) {
                        cVar.o0(asJsonPrimitive.getAsBoolean());
                    } else {
                        cVar.l0(asJsonPrimitive.getAsString());
                    }
                } else if (jsonElement.isJsonArray()) {
                    cVar.e();
                    Iterator<JsonElement> it = jsonElement.getAsJsonArray().iterator();
                    while (it.hasNext()) {
                        write(cVar, it.next());
                    }
                    cVar.h();
                } else if (jsonElement.isJsonObject()) {
                    cVar.f();
                    for (Map.Entry next : jsonElement.getAsJsonObject().entrySet()) {
                        cVar.t((String) next.getKey());
                        write(cVar, (JsonElement) next.getValue());
                    }
                    cVar.i();
                } else {
                    throw new IllegalArgumentException("Couldn't write " + jsonElement.getClass());
                }
            }
        };
        f69047V = r016;
        f69048W = e(JsonElement.class, r016);
    }

    public static <TT> v a(final TypeToken<TT> typeToken, final TypeAdapter<TT> typeAdapter) {
        return new v() {
            public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> typeToken) {
                if (typeToken.equals(TypeToken.this)) {
                    return typeAdapter;
                }
                return null;
            }
        };
    }

    public static <TT> v b(final Class<TT> cls, final TypeAdapter<TT> typeAdapter) {
        return new v() {
            public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> typeToken) {
                if (typeToken.getRawType() == cls) {
                    return typeAdapter;
                }
                return null;
            }

            public String toString() {
                return "Factory[type=" + cls.getName() + ",adapter=" + typeAdapter + "]";
            }
        };
    }

    public static <TT> v c(final Class<TT> cls, final Class<TT> cls2, final TypeAdapter<? super TT> typeAdapter) {
        return new v() {
            public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> typeToken) {
                Class<? super T> rawType = typeToken.getRawType();
                if (rawType == cls || rawType == cls2) {
                    return typeAdapter;
                }
                return null;
            }

            public String toString() {
                return "Factory[type=" + cls2.getName() + Marker.ANY_NON_NULL_MARKER + cls.getName() + ",adapter=" + typeAdapter + "]";
            }
        };
    }

    public static <TT> v d(final Class<TT> cls, final Class<? extends TT> cls2, final TypeAdapter<? super TT> typeAdapter) {
        return new v() {
            public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> typeToken) {
                Class<? super T> rawType = typeToken.getRawType();
                if (rawType == cls || rawType == cls2) {
                    return typeAdapter;
                }
                return null;
            }

            public String toString() {
                return "Factory[type=" + cls.getName() + Marker.ANY_NON_NULL_MARKER + cls2.getName() + ",adapter=" + typeAdapter + "]";
            }
        };
    }

    public static <T1> v e(final Class<T1> cls, final TypeAdapter<T1> typeAdapter) {
        return new v() {
            public <T2> TypeAdapter<T2> create(Gson gson, TypeToken<T2> typeToken) {
                final Class<? super T2> rawType = typeToken.getRawType();
                if (!cls.isAssignableFrom(rawType)) {
                    return null;
                }
                return new TypeAdapter<T1>() {
                    public T1 read(Tc.a aVar) {
                        T1 read = typeAdapter.read(aVar);
                        if (read == null || rawType.isInstance(read)) {
                            return read;
                        }
                        throw new p("Expected a " + rawType.getName() + " but was " + read.getClass().getName() + "; at path " + aVar.q());
                    }

                    public void write(c cVar, T1 t12) {
                        typeAdapter.write(cVar, t12);
                    }
                };
            }

            public String toString() {
                return "Factory[typeHierarchy=" + cls.getName() + ",adapter=" + typeAdapter + "]";
            }
        };
    }
}
