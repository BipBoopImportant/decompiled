package com.google.protobuf;

import com.google.android.libraries.places.api.model.PlaceTypes;
import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.security.PrivilegedExceptionAction;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

final class s0 {

    /* renamed from: a  reason: collision with root package name */
    private static final Unsafe f69384a = D();

    /* renamed from: b  reason: collision with root package name */
    private static final Class<?> f69385b = C9571d.b();

    /* renamed from: c  reason: collision with root package name */
    private static final boolean f69386c = o(Long.TYPE);

    /* renamed from: d  reason: collision with root package name */
    private static final boolean f69387d = o(Integer.TYPE);

    /* renamed from: e  reason: collision with root package name */
    private static final e f69388e = B();

    /* renamed from: f  reason: collision with root package name */
    private static final boolean f69389f = T();

    /* renamed from: g  reason: collision with root package name */
    private static final boolean f69390g = S();

    /* renamed from: h  reason: collision with root package name */
    static final long f69391h;

    /* renamed from: i  reason: collision with root package name */
    private static final long f69392i;

    /* renamed from: j  reason: collision with root package name */
    private static final long f69393j;

    /* renamed from: k  reason: collision with root package name */
    private static final long f69394k;

    /* renamed from: l  reason: collision with root package name */
    private static final long f69395l;

    /* renamed from: m  reason: collision with root package name */
    private static final long f69396m;

    /* renamed from: n  reason: collision with root package name */
    private static final long f69397n;

    /* renamed from: o  reason: collision with root package name */
    private static final long f69398o;

    /* renamed from: p  reason: collision with root package name */
    private static final long f69399p;

    /* renamed from: q  reason: collision with root package name */
    private static final long f69400q;

    /* renamed from: r  reason: collision with root package name */
    private static final long f69401r;

    /* renamed from: s  reason: collision with root package name */
    private static final long f69402s;

    /* renamed from: t  reason: collision with root package name */
    private static final long f69403t;

    /* renamed from: u  reason: collision with root package name */
    private static final long f69404u = q(n());

    /* renamed from: v  reason: collision with root package name */
    private static final int f69405v;

    /* renamed from: w  reason: collision with root package name */
    static final boolean f69406w = (ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN);

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
            return s0.f69406w ? s0.s(obj, j10) : s0.t(obj, j10);
        }

        public byte d(Object obj, long j10) {
            return s0.f69406w ? s0.v(obj, j10) : s0.w(obj, j10);
        }

        public double e(Object obj, long j10) {
            return Double.longBitsToDouble(h(obj, j10));
        }

        public float f(Object obj, long j10) {
            return Float.intBitsToFloat(g(obj, j10));
        }

        public void k(Object obj, long j10, boolean z10) {
            if (s0.f69406w) {
                s0.I(obj, j10, z10);
            } else {
                s0.J(obj, j10, z10);
            }
        }

        public void l(Object obj, long j10, byte b10) {
            if (s0.f69406w) {
                s0.L(obj, j10, b10);
            } else {
                s0.M(obj, j10, b10);
            }
        }

        public void m(Object obj, long j10, double d10) {
            p(obj, j10, Double.doubleToLongBits(d10));
        }

        public void n(Object obj, long j10, float f10) {
            o(obj, j10, Float.floatToIntBits(f10));
        }

        public boolean s() {
            return false;
        }
    }

    private static final class c extends e {
        c(Unsafe unsafe) {
            super(unsafe);
        }

        public boolean c(Object obj, long j10) {
            return s0.f69406w ? s0.s(obj, j10) : s0.t(obj, j10);
        }

        public byte d(Object obj, long j10) {
            return s0.f69406w ? s0.v(obj, j10) : s0.w(obj, j10);
        }

        public double e(Object obj, long j10) {
            return Double.longBitsToDouble(h(obj, j10));
        }

        public float f(Object obj, long j10) {
            return Float.intBitsToFloat(g(obj, j10));
        }

        public void k(Object obj, long j10, boolean z10) {
            if (s0.f69406w) {
                s0.I(obj, j10, z10);
            } else {
                s0.J(obj, j10, z10);
            }
        }

        public void l(Object obj, long j10, byte b10) {
            if (s0.f69406w) {
                s0.L(obj, j10, b10);
            } else {
                s0.M(obj, j10, b10);
            }
        }

        public void m(Object obj, long j10, double d10) {
            p(obj, j10, Double.doubleToLongBits(d10));
        }

        public void n(Object obj, long j10, float f10) {
            o(obj, j10, Float.floatToIntBits(f10));
        }

        public boolean s() {
            return false;
        }
    }

    private static final class d extends e {
        d(Unsafe unsafe) {
            super(unsafe);
        }

        public boolean c(Object obj, long j10) {
            return this.f69407a.getBoolean(obj, j10);
        }

        public byte d(Object obj, long j10) {
            return this.f69407a.getByte(obj, j10);
        }

        public double e(Object obj, long j10) {
            return this.f69407a.getDouble(obj, j10);
        }

        public float f(Object obj, long j10) {
            return this.f69407a.getFloat(obj, j10);
        }

        public void k(Object obj, long j10, boolean z10) {
            this.f69407a.putBoolean(obj, j10, z10);
        }

        public void l(Object obj, long j10, byte b10) {
            this.f69407a.putByte(obj, j10, b10);
        }

        public void m(Object obj, long j10, double d10) {
            this.f69407a.putDouble(obj, j10, d10);
        }

        public void n(Object obj, long j10, float f10) {
            this.f69407a.putFloat(obj, j10, f10);
        }

        public boolean r() {
            Class<Object> cls = Object.class;
            if (!super.r()) {
                return false;
            }
            try {
                Class<?> cls2 = this.f69407a.getClass();
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
                s0.G(th2);
                return false;
            }
        }

        public boolean s() {
            Class<Object> cls = Object.class;
            if (!super.s()) {
                return false;
            }
            try {
                Class<?> cls2 = this.f69407a.getClass();
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
                s0.G(th2);
                return false;
            }
        }
    }

    private static abstract class e {

        /* renamed from: a  reason: collision with root package name */
        Unsafe f69407a;

        e(Unsafe unsafe) {
            this.f69407a = unsafe;
        }

        public final int a(Class<?> cls) {
            return this.f69407a.arrayBaseOffset(cls);
        }

        public final int b(Class<?> cls) {
            return this.f69407a.arrayIndexScale(cls);
        }

        public abstract boolean c(Object obj, long j10);

        public abstract byte d(Object obj, long j10);

        public abstract double e(Object obj, long j10);

        public abstract float f(Object obj, long j10);

        public final int g(Object obj, long j10) {
            return this.f69407a.getInt(obj, j10);
        }

        public final long h(Object obj, long j10) {
            return this.f69407a.getLong(obj, j10);
        }

        public final Object i(Object obj, long j10) {
            return this.f69407a.getObject(obj, j10);
        }

        public final long j(Field field) {
            return this.f69407a.objectFieldOffset(field);
        }

        public abstract void k(Object obj, long j10, boolean z10);

        public abstract void l(Object obj, long j10, byte b10);

        public abstract void m(Object obj, long j10, double d10);

        public abstract void n(Object obj, long j10, float f10);

        public final void o(Object obj, long j10, int i10) {
            this.f69407a.putInt(obj, j10, i10);
        }

        public final void p(Object obj, long j10, long j11) {
            this.f69407a.putLong(obj, j10, j11);
        }

        public final void q(Object obj, long j10, Object obj2) {
            this.f69407a.putObject(obj, j10, obj2);
        }

        public boolean r() {
            Class<Class> cls = Class.class;
            Class<Object> cls2 = Object.class;
            Unsafe unsafe = this.f69407a;
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
                s0.G(th2);
                return false;
            }
        }

        public boolean s() {
            Unsafe unsafe = this.f69407a;
            if (unsafe == null) {
                return false;
            }
            try {
                Class<?> cls = unsafe.getClass();
                cls.getMethod("objectFieldOffset", new Class[]{Field.class});
                cls.getMethod("getLong", new Class[]{Object.class, Long.TYPE});
                return s0.n() != null;
            } catch (Throwable th2) {
                s0.G(th2);
                return false;
            }
        }
    }

    static {
        long l10 = (long) l(byte[].class);
        f69391h = l10;
        Class<boolean[]> cls = boolean[].class;
        f69392i = (long) l(cls);
        f69393j = (long) m(cls);
        Class<int[]> cls2 = int[].class;
        f69394k = (long) l(cls2);
        f69395l = (long) m(cls2);
        Class<long[]> cls3 = long[].class;
        f69396m = (long) l(cls3);
        f69397n = (long) m(cls3);
        Class<float[]> cls4 = float[].class;
        f69398o = (long) l(cls4);
        f69399p = (long) m(cls4);
        Class<double[]> cls5 = double[].class;
        f69400q = (long) l(cls5);
        f69401r = (long) m(cls5);
        Class<Object[]> cls6 = Object[].class;
        f69402s = (long) l(cls6);
        f69403t = (long) m(cls6);
        f69405v = (int) (l10 & 7);
    }

    private s0() {
    }

    static long A(Object obj, long j10) {
        return f69388e.h(obj, j10);
    }

    private static e B() {
        Unsafe unsafe = f69384a;
        if (unsafe == null) {
            return null;
        }
        if (!C9571d.c()) {
            return new d(unsafe);
        }
        if (f69386c) {
            return new c(unsafe);
        }
        if (f69387d) {
            return new b(unsafe);
        }
        return null;
    }

    static Object C(Object obj, long j10) {
        return f69388e.i(obj, j10);
    }

    static Unsafe D() {
        try {
            return (Unsafe) AccessController.doPrivileged(new a());
        } catch (Throwable unused) {
            return null;
        }
    }

    static boolean E() {
        return f69390g;
    }

    static boolean F() {
        return f69389f;
    }

    /* access modifiers changed from: private */
    public static void G(Throwable th2) {
        Logger logger = Logger.getLogger(s0.class.getName());
        Level level = Level.WARNING;
        logger.log(level, "platform method missing - proto runtime falling back to safer methods: " + th2);
    }

    static void H(Object obj, long j10, boolean z10) {
        f69388e.k(obj, j10, z10);
    }

    /* access modifiers changed from: private */
    public static void I(Object obj, long j10, boolean z10) {
        L(obj, j10, z10 ? (byte) 1 : 0);
    }

    /* access modifiers changed from: private */
    public static void J(Object obj, long j10, boolean z10) {
        M(obj, j10, z10 ? (byte) 1 : 0);
    }

    static void K(byte[] bArr, long j10, byte b10) {
        f69388e.l(bArr, f69391h + j10, b10);
    }

    /* access modifiers changed from: private */
    public static void L(Object obj, long j10, byte b10) {
        long j11 = -4 & j10;
        int z10 = z(obj, j11);
        int i10 = ((~((int) j10)) & 3) << 3;
        P(obj, j11, ((255 & b10) << i10) | (z10 & (~(255 << i10))));
    }

    /* access modifiers changed from: private */
    public static void M(Object obj, long j10, byte b10) {
        long j11 = -4 & j10;
        int i10 = (((int) j10) & 3) << 3;
        P(obj, j11, ((255 & b10) << i10) | (z(obj, j11) & (~(255 << i10))));
    }

    static void N(Object obj, long j10, double d10) {
        f69388e.m(obj, j10, d10);
    }

    static void O(Object obj, long j10, float f10) {
        f69388e.n(obj, j10, f10);
    }

    static void P(Object obj, long j10, int i10) {
        f69388e.o(obj, j10, i10);
    }

    static void Q(Object obj, long j10, long j11) {
        f69388e.p(obj, j10, j11);
    }

    static void R(Object obj, long j10, Object obj2) {
        f69388e.q(obj, j10, obj2);
    }

    private static boolean S() {
        e eVar = f69388e;
        if (eVar == null) {
            return false;
        }
        return eVar.r();
    }

    private static boolean T() {
        e eVar = f69388e;
        if (eVar == null) {
            return false;
        }
        return eVar.s();
    }

    static <T> T k(Class<T> cls) {
        try {
            return f69384a.allocateInstance(cls);
        } catch (InstantiationException e10) {
            throw new IllegalStateException(e10);
        }
    }

    private static int l(Class<?> cls) {
        if (f69390g) {
            return f69388e.a(cls);
        }
        return -1;
    }

    private static int m(Class<?> cls) {
        if (f69390g) {
            return f69388e.b(cls);
        }
        return -1;
    }

    /* access modifiers changed from: private */
    public static Field n() {
        Field p10;
        Class<Buffer> cls = Buffer.class;
        if (C9571d.c() && (p10 = p(cls, "effectiveDirectAddress")) != null) {
            return p10;
        }
        Field p11 = p(cls, PlaceTypes.ADDRESS);
        if (p11 == null || p11.getType() != Long.TYPE) {
            return null;
        }
        return p11;
    }

    static boolean o(Class<?> cls) {
        Class<byte[]> cls2 = byte[].class;
        if (!C9571d.c()) {
            return false;
        }
        try {
            Class<?> cls3 = f69385b;
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

    private static Field p(Class<?> cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    private static long q(Field field) {
        e eVar;
        if (field == null || (eVar = f69388e) == null) {
            return -1;
        }
        return eVar.j(field);
    }

    static boolean r(Object obj, long j10) {
        return f69388e.c(obj, j10);
    }

    /* access modifiers changed from: private */
    public static boolean s(Object obj, long j10) {
        return v(obj, j10) != 0;
    }

    /* access modifiers changed from: private */
    public static boolean t(Object obj, long j10) {
        return w(obj, j10) != 0;
    }

    static byte u(byte[] bArr, long j10) {
        return f69388e.d(bArr, f69391h + j10);
    }

    /* access modifiers changed from: private */
    public static byte v(Object obj, long j10) {
        return (byte) ((z(obj, -4 & j10) >>> ((int) (((~j10) & 3) << 3))) & 255);
    }

    /* access modifiers changed from: private */
    public static byte w(Object obj, long j10) {
        return (byte) ((z(obj, -4 & j10) >>> ((int) ((j10 & 3) << 3))) & 255);
    }

    static double x(Object obj, long j10) {
        return f69388e.e(obj, j10);
    }

    static float y(Object obj, long j10) {
        return f69388e.f(obj, j10);
    }

    static int z(Object obj, long j10) {
        return f69388e.g(obj, j10);
    }
}
