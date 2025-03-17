package androidx.datastore.preferences.protobuf;

import com.google.android.libraries.places.api.model.PlaceTypes;
import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.security.PrivilegedExceptionAction;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

final class r0 {

    /* renamed from: a  reason: collision with root package name */
    private static final Unsafe f21414a = A();

    /* renamed from: b  reason: collision with root package name */
    private static final Class<?> f21415b = C5151d.b();

    /* renamed from: c  reason: collision with root package name */
    private static final boolean f21416c = m(Long.TYPE);

    /* renamed from: d  reason: collision with root package name */
    private static final boolean f21417d = m(Integer.TYPE);

    /* renamed from: e  reason: collision with root package name */
    private static final e f21418e = y();

    /* renamed from: f  reason: collision with root package name */
    private static final boolean f21419f = Q();

    /* renamed from: g  reason: collision with root package name */
    private static final boolean f21420g = P();

    /* renamed from: h  reason: collision with root package name */
    static final long f21421h;

    /* renamed from: i  reason: collision with root package name */
    private static final long f21422i;

    /* renamed from: j  reason: collision with root package name */
    private static final long f21423j;

    /* renamed from: k  reason: collision with root package name */
    private static final long f21424k;

    /* renamed from: l  reason: collision with root package name */
    private static final long f21425l;

    /* renamed from: m  reason: collision with root package name */
    private static final long f21426m;

    /* renamed from: n  reason: collision with root package name */
    private static final long f21427n;

    /* renamed from: o  reason: collision with root package name */
    private static final long f21428o;

    /* renamed from: p  reason: collision with root package name */
    private static final long f21429p;

    /* renamed from: q  reason: collision with root package name */
    private static final long f21430q;

    /* renamed from: r  reason: collision with root package name */
    private static final long f21431r;

    /* renamed from: s  reason: collision with root package name */
    private static final long f21432s;

    /* renamed from: t  reason: collision with root package name */
    private static final long f21433t;

    /* renamed from: u  reason: collision with root package name */
    private static final long f21434u = o(l());

    /* renamed from: v  reason: collision with root package name */
    private static final int f21435v;

    /* renamed from: w  reason: collision with root package name */
    static final boolean f21436w = (ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN);

    class a implements PrivilegedExceptionAction<Unsafe> {
        a() {
        }

        /* renamed from: a */
        public Unsafe run() {
            Class<Unsafe> cls = Unsafe.class;
            for (Field field : cls.getDeclaredFields()) {
                field.setAccessible(true);
                Object obj = field.get((Object) null);
                if (cls.isInstance(obj)) {
                    return cls.cast(obj);
                }
            }
            return null;
        }
    }

    private static final class b extends e {
        b(Unsafe unsafe) {
            super(unsafe);
        }

        public boolean c(Object obj, long j10) {
            return r0.f21436w ? r0.q(obj, j10) : r0.r(obj, j10);
        }

        public double d(Object obj, long j10) {
            return Double.longBitsToDouble(g(obj, j10));
        }

        public float e(Object obj, long j10) {
            return Float.intBitsToFloat(f(obj, j10));
        }

        public void j(Object obj, long j10, boolean z10) {
            if (r0.f21436w) {
                r0.F(obj, j10, z10);
            } else {
                r0.G(obj, j10, z10);
            }
        }

        public void k(Object obj, long j10, byte b10) {
            if (r0.f21436w) {
                r0.I(obj, j10, b10);
            } else {
                r0.J(obj, j10, b10);
            }
        }

        public void l(Object obj, long j10, double d10) {
            o(obj, j10, Double.doubleToLongBits(d10));
        }

        public void m(Object obj, long j10, float f10) {
            n(obj, j10, Float.floatToIntBits(f10));
        }

        public boolean r() {
            return false;
        }
    }

    private static final class c extends e {
        c(Unsafe unsafe) {
            super(unsafe);
        }

        public boolean c(Object obj, long j10) {
            return r0.f21436w ? r0.q(obj, j10) : r0.r(obj, j10);
        }

        public double d(Object obj, long j10) {
            return Double.longBitsToDouble(g(obj, j10));
        }

        public float e(Object obj, long j10) {
            return Float.intBitsToFloat(f(obj, j10));
        }

        public void j(Object obj, long j10, boolean z10) {
            if (r0.f21436w) {
                r0.F(obj, j10, z10);
            } else {
                r0.G(obj, j10, z10);
            }
        }

        public void k(Object obj, long j10, byte b10) {
            if (r0.f21436w) {
                r0.I(obj, j10, b10);
            } else {
                r0.J(obj, j10, b10);
            }
        }

        public void l(Object obj, long j10, double d10) {
            o(obj, j10, Double.doubleToLongBits(d10));
        }

        public void m(Object obj, long j10, float f10) {
            n(obj, j10, Float.floatToIntBits(f10));
        }

        public boolean r() {
            return false;
        }
    }

    private static final class d extends e {
        d(Unsafe unsafe) {
            super(unsafe);
        }

        public boolean c(Object obj, long j10) {
            return this.f21437a.getBoolean(obj, j10);
        }

        public double d(Object obj, long j10) {
            return this.f21437a.getDouble(obj, j10);
        }

        public float e(Object obj, long j10) {
            return this.f21437a.getFloat(obj, j10);
        }

        public void j(Object obj, long j10, boolean z10) {
            this.f21437a.putBoolean(obj, j10, z10);
        }

        public void k(Object obj, long j10, byte b10) {
            this.f21437a.putByte(obj, j10, b10);
        }

        public void l(Object obj, long j10, double d10) {
            this.f21437a.putDouble(obj, j10, d10);
        }

        public void m(Object obj, long j10, float f10) {
            this.f21437a.putFloat(obj, j10, f10);
        }

        public boolean q() {
            Class<Object> cls = Object.class;
            if (!super.q()) {
                return false;
            }
            try {
                Class<?> cls2 = this.f21437a.getClass();
                Class cls3 = Long.TYPE;
                cls2.getMethod("getByte", new Class[]{cls, cls3});
                cls2.getMethod("putByte", new Class[]{cls, cls3, Byte.TYPE});
                cls2.getMethod("getBoolean", new Class[]{cls, cls3});
                cls2.getMethod("putBoolean", new Class[]{cls, cls3, Boolean.TYPE});
                cls2.getMethod("getFloat", new Class[]{cls, cls3});
                cls2.getMethod("putFloat", new Class[]{cls, cls3, Float.TYPE});
                cls2.getMethod("getDouble", new Class[]{cls, cls3});
                cls2.getMethod("putDouble", new Class[]{cls, cls3, Double.TYPE});
                return true;
            } catch (Throwable th2) {
                r0.D(th2);
                return false;
            }
        }

        public boolean r() {
            Class<Object> cls = Object.class;
            if (!super.r()) {
                return false;
            }
            try {
                Class<?> cls2 = this.f21437a.getClass();
                Class cls3 = Long.TYPE;
                cls2.getMethod("getByte", new Class[]{cls3});
                cls2.getMethod("putByte", new Class[]{cls3, Byte.TYPE});
                cls2.getMethod("getInt", new Class[]{cls3});
                cls2.getMethod("putInt", new Class[]{cls3, Integer.TYPE});
                cls2.getMethod("getLong", new Class[]{cls3});
                cls2.getMethod("putLong", new Class[]{cls3, cls3});
                cls2.getMethod("copyMemory", new Class[]{cls3, cls3, cls3});
                cls2.getMethod("copyMemory", new Class[]{cls, cls3, cls, cls3, cls3});
                return true;
            } catch (Throwable th2) {
                r0.D(th2);
                return false;
            }
        }
    }

    private static abstract class e {

        /* renamed from: a  reason: collision with root package name */
        Unsafe f21437a;

        e(Unsafe unsafe) {
            this.f21437a = unsafe;
        }

        public final int a(Class<?> cls) {
            return this.f21437a.arrayBaseOffset(cls);
        }

        public final int b(Class<?> cls) {
            return this.f21437a.arrayIndexScale(cls);
        }

        public abstract boolean c(Object obj, long j10);

        public abstract double d(Object obj, long j10);

        public abstract float e(Object obj, long j10);

        public final int f(Object obj, long j10) {
            return this.f21437a.getInt(obj, j10);
        }

        public final long g(Object obj, long j10) {
            return this.f21437a.getLong(obj, j10);
        }

        public final Object h(Object obj, long j10) {
            return this.f21437a.getObject(obj, j10);
        }

        public final long i(Field field) {
            return this.f21437a.objectFieldOffset(field);
        }

        public abstract void j(Object obj, long j10, boolean z10);

        public abstract void k(Object obj, long j10, byte b10);

        public abstract void l(Object obj, long j10, double d10);

        public abstract void m(Object obj, long j10, float f10);

        public final void n(Object obj, long j10, int i10) {
            this.f21437a.putInt(obj, j10, i10);
        }

        public final void o(Object obj, long j10, long j11) {
            this.f21437a.putLong(obj, j10, j11);
        }

        public final void p(Object obj, long j10, Object obj2) {
            this.f21437a.putObject(obj, j10, obj2);
        }

        public boolean q() {
            Class<Class> cls = Class.class;
            Class<Object> cls2 = Object.class;
            Unsafe unsafe = this.f21437a;
            if (unsafe == null) {
                return false;
            }
            try {
                Class<?> cls3 = unsafe.getClass();
                cls3.getMethod("objectFieldOffset", new Class[]{Field.class});
                cls3.getMethod("arrayBaseOffset", new Class[]{cls});
                cls3.getMethod("arrayIndexScale", new Class[]{cls});
                Class cls4 = Long.TYPE;
                cls3.getMethod("getInt", new Class[]{cls2, cls4});
                cls3.getMethod("putInt", new Class[]{cls2, cls4, Integer.TYPE});
                cls3.getMethod("getLong", new Class[]{cls2, cls4});
                cls3.getMethod("putLong", new Class[]{cls2, cls4, cls4});
                cls3.getMethod("getObject", new Class[]{cls2, cls4});
                cls3.getMethod("putObject", new Class[]{cls2, cls4, cls2});
                return true;
            } catch (Throwable th2) {
                r0.D(th2);
                return false;
            }
        }

        public boolean r() {
            Unsafe unsafe = this.f21437a;
            if (unsafe == null) {
                return false;
            }
            try {
                Class<?> cls = unsafe.getClass();
                cls.getMethod("objectFieldOffset", new Class[]{Field.class});
                cls.getMethod("getLong", new Class[]{Object.class, Long.TYPE});
                return r0.l() != null;
            } catch (Throwable th2) {
                r0.D(th2);
                return false;
            }
        }
    }

    static {
        long j10 = (long) j(byte[].class);
        f21421h = j10;
        Class<boolean[]> cls = boolean[].class;
        f21422i = (long) j(cls);
        f21423j = (long) k(cls);
        Class<int[]> cls2 = int[].class;
        f21424k = (long) j(cls2);
        f21425l = (long) k(cls2);
        Class<long[]> cls3 = long[].class;
        f21426m = (long) j(cls3);
        f21427n = (long) k(cls3);
        Class<float[]> cls4 = float[].class;
        f21428o = (long) j(cls4);
        f21429p = (long) k(cls4);
        Class<double[]> cls5 = double[].class;
        f21430q = (long) j(cls5);
        f21431r = (long) k(cls5);
        Class<Object[]> cls6 = Object[].class;
        f21432s = (long) j(cls6);
        f21433t = (long) k(cls6);
        f21435v = (int) (j10 & 7);
    }

    private r0() {
    }

    static Unsafe A() {
        try {
            return (Unsafe) AccessController.doPrivileged(new a());
        } catch (Throwable unused) {
            return null;
        }
    }

    static boolean B() {
        return f21420g;
    }

    static boolean C() {
        return f21419f;
    }

    /* access modifiers changed from: private */
    public static void D(Throwable th2) {
        Logger logger = Logger.getLogger(r0.class.getName());
        Level level = Level.WARNING;
        logger.log(level, "platform method missing - proto runtime falling back to safer methods: " + th2);
    }

    static void E(Object obj, long j10, boolean z10) {
        f21418e.j(obj, j10, z10);
    }

    /* access modifiers changed from: private */
    public static void F(Object obj, long j10, boolean z10) {
        I(obj, j10, z10 ? (byte) 1 : 0);
    }

    /* access modifiers changed from: private */
    public static void G(Object obj, long j10, boolean z10) {
        J(obj, j10, z10 ? (byte) 1 : 0);
    }

    static void H(byte[] bArr, long j10, byte b10) {
        f21418e.k(bArr, f21421h + j10, b10);
    }

    /* access modifiers changed from: private */
    public static void I(Object obj, long j10, byte b10) {
        long j11 = -4 & j10;
        int w10 = w(obj, j11);
        int i10 = ((~((int) j10)) & 3) << 3;
        M(obj, j11, ((255 & b10) << i10) | (w10 & (~(255 << i10))));
    }

    /* access modifiers changed from: private */
    public static void J(Object obj, long j10, byte b10) {
        long j11 = -4 & j10;
        int i10 = (((int) j10) & 3) << 3;
        M(obj, j11, ((255 & b10) << i10) | (w(obj, j11) & (~(255 << i10))));
    }

    static void K(Object obj, long j10, double d10) {
        f21418e.l(obj, j10, d10);
    }

    static void L(Object obj, long j10, float f10) {
        f21418e.m(obj, j10, f10);
    }

    static void M(Object obj, long j10, int i10) {
        f21418e.n(obj, j10, i10);
    }

    static void N(Object obj, long j10, long j11) {
        f21418e.o(obj, j10, j11);
    }

    static void O(Object obj, long j10, Object obj2) {
        f21418e.p(obj, j10, obj2);
    }

    private static boolean P() {
        e eVar = f21418e;
        if (eVar == null) {
            return false;
        }
        return eVar.q();
    }

    private static boolean Q() {
        e eVar = f21418e;
        if (eVar == null) {
            return false;
        }
        return eVar.r();
    }

    static <T> T i(Class<T> cls) {
        try {
            return f21414a.allocateInstance(cls);
        } catch (InstantiationException e10) {
            throw new IllegalStateException(e10);
        }
    }

    private static int j(Class<?> cls) {
        if (f21420g) {
            return f21418e.a(cls);
        }
        return -1;
    }

    private static int k(Class<?> cls) {
        if (f21420g) {
            return f21418e.b(cls);
        }
        return -1;
    }

    /* access modifiers changed from: private */
    public static Field l() {
        Field n10;
        Class<Buffer> cls = Buffer.class;
        if (C5151d.c() && (n10 = n(cls, "effectiveDirectAddress")) != null) {
            return n10;
        }
        Field n11 = n(cls, PlaceTypes.ADDRESS);
        if (n11 == null || n11.getType() != Long.TYPE) {
            return null;
        }
        return n11;
    }

    static boolean m(Class<?> cls) {
        Class<byte[]> cls2 = byte[].class;
        if (!C5151d.c()) {
            return false;
        }
        try {
            Class<?> cls3 = f21415b;
            Class cls4 = Boolean.TYPE;
            cls3.getMethod("peekLong", new Class[]{cls, cls4});
            cls3.getMethod("pokeLong", new Class[]{cls, Long.TYPE, cls4});
            Class cls5 = Integer.TYPE;
            cls3.getMethod("pokeInt", new Class[]{cls, cls5, cls4});
            cls3.getMethod("peekInt", new Class[]{cls, cls4});
            cls3.getMethod("pokeByte", new Class[]{cls, Byte.TYPE});
            cls3.getMethod("peekByte", new Class[]{cls});
            cls3.getMethod("pokeByteArray", new Class[]{cls, cls2, cls5, cls5});
            cls3.getMethod("peekByteArray", new Class[]{cls, cls2, cls5, cls5});
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    private static Field n(Class<?> cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    private static long o(Field field) {
        e eVar;
        if (field == null || (eVar = f21418e) == null) {
            return -1;
        }
        return eVar.i(field);
    }

    static boolean p(Object obj, long j10) {
        return f21418e.c(obj, j10);
    }

    /* access modifiers changed from: private */
    public static boolean q(Object obj, long j10) {
        return s(obj, j10) != 0;
    }

    /* access modifiers changed from: private */
    public static boolean r(Object obj, long j10) {
        return t(obj, j10) != 0;
    }

    private static byte s(Object obj, long j10) {
        return (byte) ((w(obj, -4 & j10) >>> ((int) (((~j10) & 3) << 3))) & 255);
    }

    private static byte t(Object obj, long j10) {
        return (byte) ((w(obj, -4 & j10) >>> ((int) ((j10 & 3) << 3))) & 255);
    }

    static double u(Object obj, long j10) {
        return f21418e.d(obj, j10);
    }

    static float v(Object obj, long j10) {
        return f21418e.e(obj, j10);
    }

    static int w(Object obj, long j10) {
        return f21418e.f(obj, j10);
    }

    static long x(Object obj, long j10) {
        return f21418e.g(obj, j10);
    }

    private static e y() {
        Unsafe unsafe = f21414a;
        if (unsafe == null) {
            return null;
        }
        if (!C5151d.c()) {
            return new d(unsafe);
        }
        if (f21416c) {
            return new c(unsafe);
        }
        if (f21417d) {
            return new b(unsafe);
        }
        return null;
    }

    static Object z(Object obj, long j10) {
        return f21418e.h(obj, j10);
    }
}
