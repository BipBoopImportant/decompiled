package com.google.android.gms.internal.measurement;

import com.google.android.libraries.places.api.model.PlaceTypes;
import java.lang.reflect.Field;
import java.nio.Buffer;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/* renamed from: com.google.android.gms.internal.measurement.e6  reason: case insensitive filesystem */
final class C7287e6 {

    /* renamed from: a  reason: collision with root package name */
    private static final Unsafe f48909a;

    /* renamed from: b  reason: collision with root package name */
    private static final Class<?> f48910b = W3.a();

    /* renamed from: c  reason: collision with root package name */
    private static final boolean f48911c;

    /* renamed from: d  reason: collision with root package name */
    private static final boolean f48912d;

    /* renamed from: e  reason: collision with root package name */
    private static final c f48913e;

    /* renamed from: f  reason: collision with root package name */
    private static final boolean f48914f;

    /* renamed from: g  reason: collision with root package name */
    private static final boolean f48915g;

    /* renamed from: h  reason: collision with root package name */
    private static final long f48916h = ((long) o(byte[].class));

    /* renamed from: i  reason: collision with root package name */
    static final boolean f48917i;

    /* renamed from: com.google.android.gms.internal.measurement.e6$a */
    private static final class a extends c {
        a(Unsafe unsafe) {
            super(unsafe);
        }

        public final double a(Object obj, long j10) {
            return Double.longBitsToDouble(m(obj, j10));
        }

        public final void b(Object obj, long j10, byte b10) {
            if (C7287e6.f48917i) {
                C7287e6.u(obj, j10, b10);
            } else {
                C7287e6.y(obj, j10, b10);
            }
        }

        public final void c(Object obj, long j10, double d10) {
            f(obj, j10, Double.doubleToLongBits(d10));
        }

        public final void d(Object obj, long j10, float f10) {
            e(obj, j10, Float.floatToIntBits(f10));
        }

        public final void g(Object obj, long j10, boolean z10) {
            if (C7287e6.f48917i) {
                C7287e6.u(obj, j10, r3 ? (byte) 1 : 0);
            } else {
                C7287e6.y(obj, j10, r3 ? (byte) 1 : 0);
            }
        }

        public final float i(Object obj, long j10) {
            return Float.intBitsToFloat(l(obj, j10));
        }

        public final boolean k(Object obj, long j10) {
            return C7287e6.f48917i ? C7287e6.D(obj, j10) : C7287e6.E(obj, j10);
        }
    }

    /* renamed from: com.google.android.gms.internal.measurement.e6$b */
    private static final class b extends c {
        b(Unsafe unsafe) {
            super(unsafe);
        }

        public final double a(Object obj, long j10) {
            return Double.longBitsToDouble(m(obj, j10));
        }

        public final void b(Object obj, long j10, byte b10) {
            if (C7287e6.f48917i) {
                C7287e6.u(obj, j10, b10);
            } else {
                C7287e6.y(obj, j10, b10);
            }
        }

        public final void c(Object obj, long j10, double d10) {
            f(obj, j10, Double.doubleToLongBits(d10));
        }

        public final void d(Object obj, long j10, float f10) {
            e(obj, j10, Float.floatToIntBits(f10));
        }

        public final void g(Object obj, long j10, boolean z10) {
            if (C7287e6.f48917i) {
                C7287e6.u(obj, j10, r3 ? (byte) 1 : 0);
            } else {
                C7287e6.y(obj, j10, r3 ? (byte) 1 : 0);
            }
        }

        public final float i(Object obj, long j10) {
            return Float.intBitsToFloat(l(obj, j10));
        }

        public final boolean k(Object obj, long j10) {
            return C7287e6.f48917i ? C7287e6.D(obj, j10) : C7287e6.E(obj, j10);
        }
    }

    /* renamed from: com.google.android.gms.internal.measurement.e6$c */
    private static abstract class c {

        /* renamed from: a  reason: collision with root package name */
        Unsafe f48918a;

        c(Unsafe unsafe) {
            this.f48918a = unsafe;
        }

        public abstract double a(Object obj, long j10);

        public abstract void b(Object obj, long j10, byte b10);

        public abstract void c(Object obj, long j10, double d10);

        public abstract void d(Object obj, long j10, float f10);

        public final void e(Object obj, long j10, int i10) {
            this.f48918a.putInt(obj, j10, i10);
        }

        public final void f(Object obj, long j10, long j11) {
            this.f48918a.putLong(obj, j10, j11);
        }

        public abstract void g(Object obj, long j10, boolean z10);

        public final boolean h() {
            Class<Class> cls = Class.class;
            Class<Object> cls2 = Object.class;
            Unsafe unsafe = this.f48918a;
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
                C7287e6.l(th2);
                return false;
            }
        }

        public abstract float i(Object obj, long j10);

        public final boolean j() {
            Unsafe unsafe = this.f48918a;
            if (unsafe == null) {
                return false;
            }
            try {
                Class<?> cls = unsafe.getClass();
                cls.getMethod("objectFieldOffset", new Class[]{Field.class});
                cls.getMethod("getLong", new Class[]{Object.class, Long.TYPE});
                return C7287e6.C() != null;
            } catch (Throwable th2) {
                C7287e6.l(th2);
                return false;
            }
        }

        public abstract boolean k(Object obj, long j10);

        public final int l(Object obj, long j10) {
            return this.f48918a.getInt(obj, j10);
        }

        public final long m(Object obj, long j10) {
            return this.f48918a.getLong(obj, j10);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0036  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x003e  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0040  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0095  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0034  */
    static {
        /*
            sun.misc.Unsafe r0 = p()
            f48909a = r0
            java.lang.Class r1 = com.google.android.gms.internal.measurement.W3.a()
            f48910b = r1
            java.lang.Class r1 = java.lang.Long.TYPE
            boolean r1 = A(r1)
            f48911c = r1
            java.lang.Class r2 = java.lang.Integer.TYPE
            boolean r2 = A(r2)
            f48912d = r2
            if (r0 == 0) goto L_0x002e
            if (r1 == 0) goto L_0x0026
            com.google.android.gms.internal.measurement.e6$a r1 = new com.google.android.gms.internal.measurement.e6$a
            r1.<init>(r0)
            goto L_0x002f
        L_0x0026:
            if (r2 == 0) goto L_0x002e
            com.google.android.gms.internal.measurement.e6$b r1 = new com.google.android.gms.internal.measurement.e6$b
            r1.<init>(r0)
            goto L_0x002f
        L_0x002e:
            r1 = 0
        L_0x002f:
            f48913e = r1
            r0 = 0
            if (r1 != 0) goto L_0x0036
            r2 = r0
            goto L_0x003a
        L_0x0036:
            boolean r2 = r1.j()
        L_0x003a:
            f48914f = r2
            if (r1 != 0) goto L_0x0040
            r2 = r0
            goto L_0x0044
        L_0x0040:
            boolean r2 = r1.h()
        L_0x0044:
            f48915g = r2
            java.lang.Class<byte[]> r2 = byte[].class
            int r2 = o(r2)
            long r2 = (long) r2
            f48916h = r2
            java.lang.Class<boolean[]> r2 = boolean[].class
            o(r2)
            s(r2)
            java.lang.Class<int[]> r2 = int[].class
            o(r2)
            s(r2)
            java.lang.Class<long[]> r2 = long[].class
            o(r2)
            s(r2)
            java.lang.Class<float[]> r2 = float[].class
            o(r2)
            s(r2)
            java.lang.Class<double[]> r2 = double[].class
            o(r2)
            s(r2)
            java.lang.Class<java.lang.Object[]> r2 = java.lang.Object[].class
            o(r2)
            s(r2)
            java.lang.reflect.Field r2 = C()
            if (r2 == 0) goto L_0x008d
            if (r1 != 0) goto L_0x0088
            goto L_0x008d
        L_0x0088:
            sun.misc.Unsafe r1 = r1.f48918a
            r1.objectFieldOffset(r2)
        L_0x008d:
            java.nio.ByteOrder r1 = java.nio.ByteOrder.nativeOrder()
            java.nio.ByteOrder r2 = java.nio.ByteOrder.BIG_ENDIAN
            if (r1 != r2) goto L_0x0096
            r0 = 1
        L_0x0096:
            f48917i = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.C7287e6.<clinit>():void");
    }

    private C7287e6() {
    }

    private static boolean A(Class<?> cls) {
        Class<byte[]> cls2 = byte[].class;
        try {
            Class<?> cls3 = f48910b;
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

    static Object B(Object obj, long j10) {
        return f48913e.f48918a.getObject(obj, j10);
    }

    /* access modifiers changed from: private */
    public static Field C() {
        Class<Buffer> cls = Buffer.class;
        Field d10 = d(cls, "effectiveDirectAddress");
        if (d10 != null) {
            return d10;
        }
        Field d11 = d(cls, PlaceTypes.ADDRESS);
        if (d11 == null || d11.getType() != Long.TYPE) {
            return null;
        }
        return d11;
    }

    static /* synthetic */ boolean D(Object obj, long j10) {
        return ((byte) (t(obj, -4 & j10) >>> ((int) (((~j10) & 3) << 3)))) != 0;
    }

    static /* synthetic */ boolean E(Object obj, long j10) {
        return ((byte) (t(obj, -4 & j10) >>> ((int) ((j10 & 3) << 3)))) != 0;
    }

    static boolean F(Object obj, long j10) {
        return f48913e.k(obj, j10);
    }

    static double a(Object obj, long j10) {
        return f48913e.a(obj, j10);
    }

    static <T> T b(Class<T> cls) {
        try {
            return f48909a.allocateInstance(cls);
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
        f48913e.c(obj, j10, d10);
    }

    static void g(Object obj, long j10, float f10) {
        f48913e.d(obj, j10, f10);
    }

    static void h(Object obj, long j10, int i10) {
        f48913e.e(obj, j10, i10);
    }

    static void i(Object obj, long j10, long j11) {
        f48913e.f(obj, j10, j11);
    }

    static void j(Object obj, long j10, Object obj2) {
        f48913e.f48918a.putObject(obj, j10, obj2);
    }

    static /* synthetic */ void l(Throwable th2) {
        Logger logger = Logger.getLogger(C7287e6.class.getName());
        Level level = Level.WARNING;
        String valueOf = String.valueOf(th2);
        logger.logp(level, "com.google.protobuf.UnsafeUtil", "logMissingMethod", "platform method missing - proto runtime falling back to safer methods: " + valueOf);
    }

    static void m(byte[] bArr, long j10, byte b10) {
        f48913e.b(bArr, f48916h + j10, b10);
    }

    static float n(Object obj, long j10) {
        return f48913e.i(obj, j10);
    }

    private static int o(Class<?> cls) {
        if (f48915g) {
            return f48913e.f48918a.arrayBaseOffset(cls);
        }
        return -1;
    }

    static Unsafe p() {
        try {
            return (Unsafe) AccessController.doPrivileged(new C7278d6());
        } catch (Throwable unused) {
            return null;
        }
    }

    private static int s(Class<?> cls) {
        if (f48915g) {
            return f48913e.f48918a.arrayIndexScale(cls);
        }
        return -1;
    }

    static int t(Object obj, long j10) {
        return f48913e.l(obj, j10);
    }

    /* access modifiers changed from: private */
    public static void u(Object obj, long j10, byte b10) {
        long j11 = -4 & j10;
        int t10 = t(obj, j11);
        int i10 = ((~((int) j10)) & 3) << 3;
        h(obj, j11, ((255 & b10) << i10) | (t10 & (~(255 << i10))));
    }

    static void v(Object obj, long j10, boolean z10) {
        f48913e.g(obj, j10, z10);
    }

    static boolean w() {
        return f48915g;
    }

    static long x(Object obj, long j10) {
        return f48913e.m(obj, j10);
    }

    /* access modifiers changed from: private */
    public static void y(Object obj, long j10, byte b10) {
        long j11 = -4 & j10;
        int i10 = (((int) j10) & 3) << 3;
        h(obj, j11, ((255 & b10) << i10) | (t(obj, j11) & (~(255 << i10))));
    }

    static boolean z() {
        return f48914f;
    }
}
