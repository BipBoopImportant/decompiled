package com.google.android.gms.internal.clearcut;

import com.google.android.libraries.places.api.model.PlaceTypes;
import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import libcore.io.Memory;
import sun.misc.Unsafe;

final class C1 {

    /* renamed from: a  reason: collision with root package name */
    private static final Logger f48162a = Logger.getLogger(C1.class.getName());

    /* renamed from: b  reason: collision with root package name */
    private static final Unsafe f48163b;

    /* renamed from: c  reason: collision with root package name */
    private static final Class<?> f48164c = C7226u.c();

    /* renamed from: d  reason: collision with root package name */
    private static final boolean f48165d;

    /* renamed from: e  reason: collision with root package name */
    private static final boolean f48166e;

    /* renamed from: f  reason: collision with root package name */
    private static final d f48167f;

    /* renamed from: g  reason: collision with root package name */
    private static final boolean f48168g = B();

    /* renamed from: h  reason: collision with root package name */
    private static final boolean f48169h = A();
    /* access modifiers changed from: private */

    /* renamed from: i  reason: collision with root package name */
    public static final long f48170i = ((long) E(byte[].class));

    /* renamed from: j  reason: collision with root package name */
    private static final long f48171j;

    /* renamed from: k  reason: collision with root package name */
    private static final long f48172k;

    /* renamed from: l  reason: collision with root package name */
    private static final long f48173l;

    /* renamed from: m  reason: collision with root package name */
    private static final long f48174m;

    /* renamed from: n  reason: collision with root package name */
    private static final long f48175n;

    /* renamed from: o  reason: collision with root package name */
    private static final long f48176o;

    /* renamed from: p  reason: collision with root package name */
    private static final long f48177p;

    /* renamed from: q  reason: collision with root package name */
    private static final long f48178q;

    /* renamed from: r  reason: collision with root package name */
    private static final long f48179r;

    /* renamed from: s  reason: collision with root package name */
    private static final long f48180s;

    /* renamed from: t  reason: collision with root package name */
    private static final long f48181t;

    /* renamed from: u  reason: collision with root package name */
    private static final long f48182u;

    /* renamed from: v  reason: collision with root package name */
    private static final long f48183v = n(C());

    /* renamed from: w  reason: collision with root package name */
    private static final long f48184w;
    /* access modifiers changed from: private */

    /* renamed from: x  reason: collision with root package name */
    public static final boolean f48185x = (ByteOrder.nativeOrder() != ByteOrder.BIG_ENDIAN);

    static final class a extends d {
        a(Unsafe unsafe) {
            super(unsafe);
        }

        public final void b(long j10, byte b10) {
            Memory.pokeByte((int) j10, b10);
        }

        public final void c(Object obj, long j10, double d10) {
            f(obj, j10, Double.doubleToLongBits(d10));
        }

        public final void d(Object obj, long j10, float f10) {
            e(obj, j10, Float.floatToIntBits(f10));
        }

        public final void g(Object obj, long j10, boolean z10) {
            if (C1.f48185x) {
                C1.r(obj, j10, z10);
            } else {
                C1.t(obj, j10, z10);
            }
        }

        public final void h(byte[] bArr, long j10, long j11, long j12) {
            Memory.pokeByteArray((int) j11, bArr, (int) j10, (int) j12);
        }

        public final void i(Object obj, long j10, byte b10) {
            if (C1.f48185x) {
                C1.d(obj, j10, b10);
            } else {
                C1.q(obj, j10, b10);
            }
        }

        public final boolean l(Object obj, long j10) {
            return C1.f48185x ? C1.P(obj, j10) : C1.Q(obj, j10);
        }

        public final float m(Object obj, long j10) {
            return Float.intBitsToFloat(j(obj, j10));
        }

        public final double n(Object obj, long j10) {
            return Double.longBitsToDouble(k(obj, j10));
        }

        public final byte o(Object obj, long j10) {
            return C1.f48185x ? C1.N(obj, j10) : C1.O(obj, j10);
        }
    }

    static final class b extends d {
        b(Unsafe unsafe) {
            super(unsafe);
        }

        public final void b(long j10, byte b10) {
            Memory.pokeByte(j10, b10);
        }

        public final void c(Object obj, long j10, double d10) {
            f(obj, j10, Double.doubleToLongBits(d10));
        }

        public final void d(Object obj, long j10, float f10) {
            e(obj, j10, Float.floatToIntBits(f10));
        }

        public final void g(Object obj, long j10, boolean z10) {
            if (C1.f48185x) {
                C1.r(obj, j10, z10);
            } else {
                C1.t(obj, j10, z10);
            }
        }

        public final void h(byte[] bArr, long j10, long j11, long j12) {
            Memory.pokeByteArray(j11, bArr, (int) j10, (int) j12);
        }

        public final void i(Object obj, long j10, byte b10) {
            if (C1.f48185x) {
                C1.d(obj, j10, b10);
            } else {
                C1.q(obj, j10, b10);
            }
        }

        public final boolean l(Object obj, long j10) {
            return C1.f48185x ? C1.P(obj, j10) : C1.Q(obj, j10);
        }

        public final float m(Object obj, long j10) {
            return Float.intBitsToFloat(j(obj, j10));
        }

        public final double n(Object obj, long j10) {
            return Double.longBitsToDouble(k(obj, j10));
        }

        public final byte o(Object obj, long j10) {
            return C1.f48185x ? C1.N(obj, j10) : C1.O(obj, j10);
        }
    }

    static final class c extends d {
        c(Unsafe unsafe) {
            super(unsafe);
        }

        public final void b(long j10, byte b10) {
            this.f48186a.putByte(j10, b10);
        }

        public final void c(Object obj, long j10, double d10) {
            this.f48186a.putDouble(obj, j10, d10);
        }

        public final void d(Object obj, long j10, float f10) {
            this.f48186a.putFloat(obj, j10, f10);
        }

        public final void g(Object obj, long j10, boolean z10) {
            this.f48186a.putBoolean(obj, j10, z10);
        }

        public final void h(byte[] bArr, long j10, long j11, long j12) {
            this.f48186a.copyMemory(bArr, C1.f48170i + j10, (Object) null, j11, j12);
        }

        public final void i(Object obj, long j10, byte b10) {
            this.f48186a.putByte(obj, j10, b10);
        }

        public final boolean l(Object obj, long j10) {
            return this.f48186a.getBoolean(obj, j10);
        }

        public final float m(Object obj, long j10) {
            return this.f48186a.getFloat(obj, j10);
        }

        public final double n(Object obj, long j10) {
            return this.f48186a.getDouble(obj, j10);
        }

        public final byte o(Object obj, long j10) {
            return this.f48186a.getByte(obj, j10);
        }
    }

    static abstract class d {

        /* renamed from: a  reason: collision with root package name */
        Unsafe f48186a;

        d(Unsafe unsafe) {
            this.f48186a = unsafe;
        }

        public final long a(Field field) {
            return this.f48186a.objectFieldOffset(field);
        }

        public abstract void b(long j10, byte b10);

        public abstract void c(Object obj, long j10, double d10);

        public abstract void d(Object obj, long j10, float f10);

        public final void e(Object obj, long j10, int i10) {
            this.f48186a.putInt(obj, j10, i10);
        }

        public final void f(Object obj, long j10, long j11) {
            this.f48186a.putLong(obj, j10, j11);
        }

        public abstract void g(Object obj, long j10, boolean z10);

        public abstract void h(byte[] bArr, long j10, long j11, long j12);

        public abstract void i(Object obj, long j10, byte b10);

        public final int j(Object obj, long j10) {
            return this.f48186a.getInt(obj, j10);
        }

        public final long k(Object obj, long j10) {
            return this.f48186a.getLong(obj, j10);
        }

        public abstract boolean l(Object obj, long j10);

        public abstract float m(Object obj, long j10);

        public abstract double n(Object obj, long j10);

        public abstract byte o(Object obj, long j10);
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x00ea  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x00ec  */
    static {
        /*
            java.lang.Class<com.google.android.gms.internal.clearcut.C1> r0 = com.google.android.gms.internal.clearcut.C1.class
            java.lang.String r0 = r0.getName()
            java.util.logging.Logger r0 = java.util.logging.Logger.getLogger(r0)
            f48162a = r0
            sun.misc.Unsafe r0 = z()
            f48163b = r0
            java.lang.Class r1 = com.google.android.gms.internal.clearcut.C7226u.c()
            f48164c = r1
            java.lang.Class r1 = java.lang.Long.TYPE
            boolean r1 = G(r1)
            f48165d = r1
            java.lang.Class r2 = java.lang.Integer.TYPE
            boolean r2 = G(r2)
            f48166e = r2
            r3 = 0
            if (r0 != 0) goto L_0x002d
        L_0x002b:
            r1 = r3
            goto L_0x0048
        L_0x002d:
            boolean r4 = com.google.android.gms.internal.clearcut.C7226u.b()
            if (r4 == 0) goto L_0x0043
            if (r1 == 0) goto L_0x003b
            com.google.android.gms.internal.clearcut.C1$b r1 = new com.google.android.gms.internal.clearcut.C1$b
            r1.<init>(r0)
            goto L_0x0048
        L_0x003b:
            if (r2 == 0) goto L_0x002b
            com.google.android.gms.internal.clearcut.C1$a r1 = new com.google.android.gms.internal.clearcut.C1$a
            r1.<init>(r0)
            goto L_0x0048
        L_0x0043:
            com.google.android.gms.internal.clearcut.C1$c r1 = new com.google.android.gms.internal.clearcut.C1$c
            r1.<init>(r0)
        L_0x0048:
            f48167f = r1
            boolean r0 = B()
            f48168g = r0
            boolean r0 = A()
            f48169h = r0
            java.lang.Class<byte[]> r0 = byte[].class
            int r0 = E(r0)
            long r0 = (long) r0
            f48170i = r0
            java.lang.Class<boolean[]> r0 = boolean[].class
            int r1 = E(r0)
            long r1 = (long) r1
            f48171j = r1
            int r0 = F(r0)
            long r0 = (long) r0
            f48172k = r0
            java.lang.Class<int[]> r0 = int[].class
            int r1 = E(r0)
            long r1 = (long) r1
            f48173l = r1
            int r0 = F(r0)
            long r0 = (long) r0
            f48174m = r0
            java.lang.Class<long[]> r0 = long[].class
            int r1 = E(r0)
            long r1 = (long) r1
            f48175n = r1
            int r0 = F(r0)
            long r0 = (long) r0
            f48176o = r0
            java.lang.Class<float[]> r0 = float[].class
            int r1 = E(r0)
            long r1 = (long) r1
            f48177p = r1
            int r0 = F(r0)
            long r0 = (long) r0
            f48178q = r0
            java.lang.Class<double[]> r0 = double[].class
            int r1 = E(r0)
            long r1 = (long) r1
            f48179r = r1
            int r0 = F(r0)
            long r0 = (long) r0
            f48180s = r0
            java.lang.Class<java.lang.Object[]> r0 = java.lang.Object[].class
            int r1 = E(r0)
            long r1 = (long) r1
            f48181t = r1
            int r0 = F(r0)
            long r0 = (long) r0
            f48182u = r0
            java.lang.reflect.Field r0 = C()
            long r0 = n(r0)
            f48183v = r0
            java.lang.Class<java.lang.String> r0 = java.lang.String.class
            java.lang.String r1 = "value"
            java.lang.reflect.Field r0 = p(r0, r1)
            if (r0 == 0) goto L_0x00dc
            java.lang.Class r1 = r0.getType()
            java.lang.Class<char[]> r2 = char[].class
            if (r1 != r2) goto L_0x00dc
            r3 = r0
        L_0x00dc:
            long r0 = n(r3)
            f48184w = r0
            java.nio.ByteOrder r0 = java.nio.ByteOrder.nativeOrder()
            java.nio.ByteOrder r1 = java.nio.ByteOrder.BIG_ENDIAN
            if (r0 != r1) goto L_0x00ec
            r0 = 1
            goto L_0x00ed
        L_0x00ec:
            r0 = 0
        L_0x00ed:
            f48185x = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.clearcut.C1.<clinit>():void");
    }

    private C1() {
    }

    private static boolean A() {
        Class<Class> cls = Class.class;
        Class<Object> cls2 = Object.class;
        Unsafe unsafe = f48163b;
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
            if (C7226u.b()) {
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
            Logger logger = f48162a;
            Level level = Level.WARNING;
            String valueOf = String.valueOf(th2);
            StringBuilder sb2 = new StringBuilder(valueOf.length() + 71);
            sb2.append("platform method missing - proto runtime falling back to safer methods: ");
            sb2.append(valueOf);
            logger.logp(level, "com.google.protobuf.UnsafeUtil", "supportsUnsafeArrayOperations", sb2.toString());
            return false;
        }
    }

    private static boolean B() {
        Class<Object> cls = Object.class;
        Unsafe unsafe = f48163b;
        if (unsafe == null) {
            return false;
        }
        try {
            Class<?> cls2 = unsafe.getClass();
            cls2.getMethod("objectFieldOffset", new Class[]{Field.class});
            Class cls3 = Long.TYPE;
            cls2.getMethod("getLong", new Class[]{cls, cls3});
            if (C() == null) {
                return false;
            }
            if (C7226u.b()) {
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
            Logger logger = f48162a;
            Level level = Level.WARNING;
            String valueOf = String.valueOf(th2);
            StringBuilder sb2 = new StringBuilder(valueOf.length() + 71);
            sb2.append("platform method missing - proto runtime falling back to safer methods: ");
            sb2.append(valueOf);
            logger.logp(level, "com.google.protobuf.UnsafeUtil", "supportsUnsafeByteBufferOperations", sb2.toString());
            return false;
        }
    }

    private static Field C() {
        Field p10;
        Class<Buffer> cls = Buffer.class;
        if (C7226u.b() && (p10 = p(cls, "effectiveDirectAddress")) != null) {
            return p10;
        }
        Field p11 = p(cls, PlaceTypes.ADDRESS);
        if (p11 == null || p11.getType() != Long.TYPE) {
            return null;
        }
        return p11;
    }

    private static int E(Class<?> cls) {
        if (f48169h) {
            return f48167f.f48186a.arrayBaseOffset(cls);
        }
        return -1;
    }

    private static int F(Class<?> cls) {
        if (f48169h) {
            return f48167f.f48186a.arrayIndexScale(cls);
        }
        return -1;
    }

    private static boolean G(Class<?> cls) {
        Class<byte[]> cls2 = byte[].class;
        if (!C7226u.b()) {
            return false;
        }
        try {
            Class<?> cls3 = f48164c;
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

    static int H(Object obj, long j10) {
        return f48167f.j(obj, j10);
    }

    static long I(Object obj, long j10) {
        return f48167f.k(obj, j10);
    }

    static boolean J(Object obj, long j10) {
        return f48167f.l(obj, j10);
    }

    static float K(Object obj, long j10) {
        return f48167f.m(obj, j10);
    }

    static double L(Object obj, long j10) {
        return f48167f.n(obj, j10);
    }

    static Object M(Object obj, long j10) {
        return f48167f.f48186a.getObject(obj, j10);
    }

    /* access modifiers changed from: private */
    public static byte N(Object obj, long j10) {
        return (byte) (H(obj, -4 & j10) >>> ((int) (((~j10) & 3) << 3)));
    }

    /* access modifiers changed from: private */
    public static byte O(Object obj, long j10) {
        return (byte) (H(obj, -4 & j10) >>> ((int) ((j10 & 3) << 3)));
    }

    /* access modifiers changed from: private */
    public static boolean P(Object obj, long j10) {
        return N(obj, j10) != 0;
    }

    /* access modifiers changed from: private */
    public static boolean Q(Object obj, long j10) {
        return O(obj, j10) != 0;
    }

    static byte a(byte[] bArr, long j10) {
        return f48167f.o(bArr, f48170i + j10);
    }

    static long b(Field field) {
        return f48167f.a(field);
    }

    static void c(long j10, byte b10) {
        f48167f.b(j10, b10);
    }

    /* access modifiers changed from: private */
    public static void d(Object obj, long j10, byte b10) {
        long j11 = -4 & j10;
        int H10 = H(obj, j11);
        int i10 = ((~((int) j10)) & 3) << 3;
        g(obj, j11, ((255 & b10) << i10) | (H10 & (~(255 << i10))));
    }

    static void e(Object obj, long j10, double d10) {
        f48167f.c(obj, j10, d10);
    }

    static void f(Object obj, long j10, float f10) {
        f48167f.d(obj, j10, f10);
    }

    static void g(Object obj, long j10, int i10) {
        f48167f.e(obj, j10, i10);
    }

    static void h(Object obj, long j10, long j11) {
        f48167f.f(obj, j10, j11);
    }

    static void i(Object obj, long j10, Object obj2) {
        f48167f.f48186a.putObject(obj, j10, obj2);
    }

    static void j(Object obj, long j10, boolean z10) {
        f48167f.g(obj, j10, z10);
    }

    static void k(byte[] bArr, long j10, byte b10) {
        f48167f.i(bArr, f48170i + j10, b10);
    }

    static void l(byte[] bArr, long j10, long j11, long j12) {
        f48167f.h(bArr, j10, j11, j12);
    }

    private static long n(Field field) {
        d dVar;
        if (field == null || (dVar = f48167f) == null) {
            return -1;
        }
        return dVar.a(field);
    }

    static long o(ByteBuffer byteBuffer) {
        return f48167f.k(byteBuffer, f48183v);
    }

    private static Field p(Class<?> cls, String str) {
        try {
            Field declaredField = cls.getDeclaredField(str);
            declaredField.setAccessible(true);
            return declaredField;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* access modifiers changed from: private */
    public static void q(Object obj, long j10, byte b10) {
        long j11 = -4 & j10;
        int i10 = (((int) j10) & 3) << 3;
        g(obj, j11, ((255 & b10) << i10) | (H(obj, j11) & (~(255 << i10))));
    }

    /* access modifiers changed from: private */
    public static void r(Object obj, long j10, boolean z10) {
        d(obj, j10, z10 ? (byte) 1 : 0);
    }

    /* access modifiers changed from: private */
    public static void t(Object obj, long j10, boolean z10) {
        q(obj, j10, z10 ? (byte) 1 : 0);
    }

    static boolean x() {
        return f48169h;
    }

    static boolean y() {
        return f48168g;
    }

    static Unsafe z() {
        try {
            return (Unsafe) AccessController.doPrivileged(new D1());
        } catch (Throwable unused) {
            return null;
        }
    }
}
