package com.google.android.gms.internal.vision;

import com.google.android.libraries.places.api.model.PlaceTypes;
import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

final class q2 {

    /* renamed from: a  reason: collision with root package name */
    private static final Unsafe f49368a;

    /* renamed from: b  reason: collision with root package name */
    private static final Class<?> f49369b = C7465a0.c();

    /* renamed from: c  reason: collision with root package name */
    private static final boolean f49370c;

    /* renamed from: d  reason: collision with root package name */
    private static final boolean f49371d;

    /* renamed from: e  reason: collision with root package name */
    private static final d f49372e;

    /* renamed from: f  reason: collision with root package name */
    private static final boolean f49373f = E();

    /* renamed from: g  reason: collision with root package name */
    private static final boolean f49374g = A();

    /* renamed from: h  reason: collision with root package name */
    private static final long f49375h;

    /* renamed from: i  reason: collision with root package name */
    private static final long f49376i;

    /* renamed from: j  reason: collision with root package name */
    private static final long f49377j;

    /* renamed from: k  reason: collision with root package name */
    private static final long f49378k;

    /* renamed from: l  reason: collision with root package name */
    private static final long f49379l;

    /* renamed from: m  reason: collision with root package name */
    private static final long f49380m;

    /* renamed from: n  reason: collision with root package name */
    private static final long f49381n;

    /* renamed from: o  reason: collision with root package name */
    private static final long f49382o;

    /* renamed from: p  reason: collision with root package name */
    private static final long f49383p;

    /* renamed from: q  reason: collision with root package name */
    private static final long f49384q;

    /* renamed from: r  reason: collision with root package name */
    private static final long f49385r;

    /* renamed from: s  reason: collision with root package name */
    private static final long f49386s;

    /* renamed from: t  reason: collision with root package name */
    private static final long f49387t;

    /* renamed from: u  reason: collision with root package name */
    private static final long f49388u;

    /* renamed from: v  reason: collision with root package name */
    private static final int f49389v;

    /* renamed from: w  reason: collision with root package name */
    static final boolean f49390w = (ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN);

    private static final class a extends d {
        a(Unsafe unsafe) {
            super(unsafe);
        }

        public final byte a(Object obj, long j10) {
            return q2.f49390w ? q2.L(obj, j10) : q2.M(obj, j10);
        }

        public final void b(Object obj, long j10, byte b10) {
            if (q2.f49390w) {
                q2.u(obj, j10, b10);
            } else {
                q2.y(obj, j10, b10);
            }
        }

        public final void c(Object obj, long j10, double d10) {
            f(obj, j10, Double.doubleToLongBits(d10));
        }

        public final void d(Object obj, long j10, float f10) {
            e(obj, j10, Float.floatToIntBits(f10));
        }

        public final void g(Object obj, long j10, boolean z10) {
            if (q2.f49390w) {
                q2.z(obj, j10, z10);
            } else {
                q2.D(obj, j10, z10);
            }
        }

        public final boolean h(Object obj, long j10) {
            return q2.f49390w ? q2.N(obj, j10) : q2.O(obj, j10);
        }

        public final float i(Object obj, long j10) {
            return Float.intBitsToFloat(k(obj, j10));
        }

        public final double j(Object obj, long j10) {
            return Double.longBitsToDouble(l(obj, j10));
        }
    }

    private static final class b extends d {
        b(Unsafe unsafe) {
            super(unsafe);
        }

        public final byte a(Object obj, long j10) {
            return this.f49391a.getByte(obj, j10);
        }

        public final void b(Object obj, long j10, byte b10) {
            this.f49391a.putByte(obj, j10, b10);
        }

        public final void c(Object obj, long j10, double d10) {
            this.f49391a.putDouble(obj, j10, d10);
        }

        public final void d(Object obj, long j10, float f10) {
            this.f49391a.putFloat(obj, j10, f10);
        }

        public final void g(Object obj, long j10, boolean z10) {
            this.f49391a.putBoolean(obj, j10, z10);
        }

        public final boolean h(Object obj, long j10) {
            return this.f49391a.getBoolean(obj, j10);
        }

        public final float i(Object obj, long j10) {
            return this.f49391a.getFloat(obj, j10);
        }

        public final double j(Object obj, long j10) {
            return this.f49391a.getDouble(obj, j10);
        }
    }

    private static final class c extends d {
        c(Unsafe unsafe) {
            super(unsafe);
        }

        public final byte a(Object obj, long j10) {
            return q2.f49390w ? q2.L(obj, j10) : q2.M(obj, j10);
        }

        public final void b(Object obj, long j10, byte b10) {
            if (q2.f49390w) {
                q2.u(obj, j10, b10);
            } else {
                q2.y(obj, j10, b10);
            }
        }

        public final void c(Object obj, long j10, double d10) {
            f(obj, j10, Double.doubleToLongBits(d10));
        }

        public final void d(Object obj, long j10, float f10) {
            e(obj, j10, Float.floatToIntBits(f10));
        }

        public final void g(Object obj, long j10, boolean z10) {
            if (q2.f49390w) {
                q2.z(obj, j10, z10);
            } else {
                q2.D(obj, j10, z10);
            }
        }

        public final boolean h(Object obj, long j10) {
            return q2.f49390w ? q2.N(obj, j10) : q2.O(obj, j10);
        }

        public final float i(Object obj, long j10) {
            return Float.intBitsToFloat(k(obj, j10));
        }

        public final double j(Object obj, long j10) {
            return Double.longBitsToDouble(l(obj, j10));
        }
    }

    private static abstract class d {

        /* renamed from: a  reason: collision with root package name */
        Unsafe f49391a;

        d(Unsafe unsafe) {
            this.f49391a = unsafe;
        }

        public abstract byte a(Object obj, long j10);

        public abstract void b(Object obj, long j10, byte b10);

        public abstract void c(Object obj, long j10, double d10);

        public abstract void d(Object obj, long j10, float f10);

        public final void e(Object obj, long j10, int i10) {
            this.f49391a.putInt(obj, j10, i10);
        }

        public final void f(Object obj, long j10, long j11) {
            this.f49391a.putLong(obj, j10, j11);
        }

        public abstract void g(Object obj, long j10, boolean z10);

        public abstract boolean h(Object obj, long j10);

        public abstract float i(Object obj, long j10);

        public abstract double j(Object obj, long j10);

        public final int k(Object obj, long j10) {
            return this.f49391a.getInt(obj, j10);
        }

        public final long l(Object obj, long j10) {
            return this.f49391a.getLong(obj, j10);
        }
    }

    static {
        Unsafe t10 = t();
        f49368a = t10;
        boolean B10 = B(Long.TYPE);
        f49370c = B10;
        boolean B11 = B(Integer.TYPE);
        f49371d = B11;
        d dVar = null;
        if (t10 != null) {
            if (!C7465a0.b()) {
                dVar = new b(t10);
            } else if (B10) {
                dVar = new c(t10);
            } else if (B11) {
                dVar = new a(t10);
            }
        }
        f49372e = dVar;
        long n10 = (long) n(byte[].class);
        f49375h = n10;
        Class<boolean[]> cls = boolean[].class;
        f49376i = (long) n(cls);
        f49377j = (long) s(cls);
        Class<int[]> cls2 = int[].class;
        f49378k = (long) n(cls2);
        f49379l = (long) s(cls2);
        Class<long[]> cls3 = long[].class;
        f49380m = (long) n(cls3);
        f49381n = (long) s(cls3);
        Class<float[]> cls4 = float[].class;
        f49382o = (long) n(cls4);
        f49383p = (long) s(cls4);
        Class<double[]> cls5 = double[].class;
        f49384q = (long) n(cls5);
        f49385r = (long) s(cls5);
        Class<Object[]> cls6 = Object[].class;
        f49386s = (long) n(cls6);
        f49387t = (long) s(cls6);
        Field G10 = G();
        f49388u = (G10 == null || dVar == null) ? -1 : dVar.f49391a.objectFieldOffset(G10);
        f49389v = (int) (n10 & 7);
    }

    private q2() {
    }

    private static boolean A() {
        Class<Class> cls = Class.class;
        Class<Object> cls2 = Object.class;
        Unsafe unsafe = f49368a;
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
            if (C7465a0.b()) {
                return true;
            }
            cls3.getMethod("getByte", new Class[]{cls2, cls4});
            cls3.getMethod("putByte", new Class[]{cls2, cls4, Byte.TYPE});
            cls3.getMethod("getBoolean", new Class[]{cls2, cls4});
            cls3.getMethod("putBoolean", new Class[]{cls2, cls4, Boolean.TYPE});
            cls3.getMethod("getFloat", new Class[]{cls2, cls4});
            cls3.getMethod("putFloat", new Class[]{cls2, cls4, Float.TYPE});
            cls3.getMethod("getDouble", new Class[]{cls2, cls4});
            cls3.getMethod("putDouble", new Class[]{cls2, cls4, Double.TYPE});
            return true;
        } catch (Throwable th2) {
            Logger logger = Logger.getLogger(q2.class.getName());
            Level level = Level.WARNING;
            String valueOf = String.valueOf(th2);
            StringBuilder sb2 = new StringBuilder(valueOf.length() + 71);
            sb2.append("platform method missing - proto runtime falling back to safer methods: ");
            sb2.append(valueOf);
            logger.logp(level, "com.google.protobuf.UnsafeUtil", "supportsUnsafeArrayOperations", sb2.toString());
            return false;
        }
    }

    private static boolean B(Class<?> cls) {
        Class<byte[]> cls2 = byte[].class;
        if (!C7465a0.b()) {
            return false;
        }
        try {
            Class<?> cls3 = f49369b;
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

    static double C(Object obj, long j10) {
        return f49372e.j(obj, j10);
    }

    /* access modifiers changed from: private */
    public static void D(Object obj, long j10, boolean z10) {
        y(obj, j10, z10 ? (byte) 1 : 0);
    }

    private static boolean E() {
        Class<Object> cls = Object.class;
        Unsafe unsafe = f49368a;
        if (unsafe == null) {
            return false;
        }
        try {
            Class<?> cls2 = unsafe.getClass();
            cls2.getMethod("objectFieldOffset", new Class[]{Field.class});
            Class cls3 = Long.TYPE;
            cls2.getMethod("getLong", new Class[]{cls, cls3});
            if (G() == null) {
                return false;
            }
            if (C7465a0.b()) {
                return true;
            }
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
            Logger logger = Logger.getLogger(q2.class.getName());
            Level level = Level.WARNING;
            String valueOf = String.valueOf(th2);
            StringBuilder sb2 = new StringBuilder(valueOf.length() + 71);
            sb2.append("platform method missing - proto runtime falling back to safer methods: ");
            sb2.append(valueOf);
            logger.logp(level, "com.google.protobuf.UnsafeUtil", "supportsUnsafeByteBufferOperations", sb2.toString());
            return false;
        }
    }

    static Object F(Object obj, long j10) {
        return f49372e.f49391a.getObject(obj, j10);
    }

    private static Field G() {
        Field d10;
        Class<Buffer> cls = Buffer.class;
        if (C7465a0.b() && (d10 = d(cls, "effectiveDirectAddress")) != null) {
            return d10;
        }
        Field d11 = d(cls, PlaceTypes.ADDRESS);
        if (d11 == null || d11.getType() != Long.TYPE) {
            return null;
        }
        return d11;
    }

    /* access modifiers changed from: private */
    public static byte L(Object obj, long j10) {
        return (byte) (b(obj, -4 & j10) >>> ((int) (((~j10) & 3) << 3)));
    }

    /* access modifiers changed from: private */
    public static byte M(Object obj, long j10) {
        return (byte) (b(obj, -4 & j10) >>> ((int) ((j10 & 3) << 3)));
    }

    /* access modifiers changed from: private */
    public static boolean N(Object obj, long j10) {
        return L(obj, j10) != 0;
    }

    /* access modifiers changed from: private */
    public static boolean O(Object obj, long j10) {
        return M(obj, j10) != 0;
    }

    static byte a(byte[] bArr, long j10) {
        return f49372e.a(bArr, f49375h + j10);
    }

    static int b(Object obj, long j10) {
        return f49372e.k(obj, j10);
    }

    static <T> T c(Class<T> cls) {
        try {
            return f49368a.allocateInstance(cls);
        } catch (InstantiationException e10) {
            throw new IllegalStateException(e10);
        }
    }

    private static Field d(Class<?> cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    static void f(Object obj, long j10, double d10) {
        f49372e.c(obj, j10, d10);
    }

    static void g(Object obj, long j10, float f10) {
        f49372e.d(obj, j10, f10);
    }

    static void h(Object obj, long j10, int i10) {
        f49372e.e(obj, j10, i10);
    }

    static void i(Object obj, long j10, long j11) {
        f49372e.f(obj, j10, j11);
    }

    static void j(Object obj, long j10, Object obj2) {
        f49372e.f49391a.putObject(obj, j10, obj2);
    }

    static void k(Object obj, long j10, boolean z10) {
        f49372e.g(obj, j10, z10);
    }

    static void l(byte[] bArr, long j10, byte b10) {
        f49372e.b(bArr, f49375h + j10, b10);
    }

    static boolean m() {
        return f49374g;
    }

    private static int n(Class<?> cls) {
        if (f49374g) {
            return f49372e.f49391a.arrayBaseOffset(cls);
        }
        return -1;
    }

    static long o(Object obj, long j10) {
        return f49372e.l(obj, j10);
    }

    static boolean r() {
        return f49373f;
    }

    private static int s(Class<?> cls) {
        if (f49374g) {
            return f49372e.f49391a.arrayIndexScale(cls);
        }
        return -1;
    }

    static Unsafe t() {
        try {
            return (Unsafe) AccessController.doPrivileged(new s2());
        } catch (Throwable unused) {
            return null;
        }
    }

    /* access modifiers changed from: private */
    public static void u(Object obj, long j10, byte b10) {
        long j11 = -4 & j10;
        int b11 = b(obj, j11);
        int i10 = ((~((int) j10)) & 3) << 3;
        h(obj, j11, ((255 & b10) << i10) | (b11 & (~(255 << i10))));
    }

    static boolean w(Object obj, long j10) {
        return f49372e.h(obj, j10);
    }

    static float x(Object obj, long j10) {
        return f49372e.i(obj, j10);
    }

    /* access modifiers changed from: private */
    public static void y(Object obj, long j10, byte b10) {
        long j11 = -4 & j10;
        int i10 = (((int) j10) & 3) << 3;
        h(obj, j11, ((255 & b10) << i10) | (b(obj, j11) & (~(255 << i10))));
    }

    /* access modifiers changed from: private */
    public static void z(Object obj, long j10, boolean z10) {
        u(obj, j10, z10 ? (byte) 1 : 0);
    }
}
