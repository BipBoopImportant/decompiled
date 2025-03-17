package com.google.android.gms.internal.measurement;

import java.io.IOException;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: com.google.android.gms.internal.measurement.s4  reason: case insensitive filesystem */
public abstract class C7405s4 extends C7249a4 {

    /* renamed from: b  reason: collision with root package name */
    private static final Logger f49066b = Logger.getLogger(C7405s4.class.getName());
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public static final boolean f49067c = C7287e6.w();

    /* renamed from: a  reason: collision with root package name */
    C7413t4 f49068a;

    /* renamed from: com.google.android.gms.internal.measurement.s4$a */
    public static class a extends IOException {
        a(Throwable th2) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.", th2);
        }

        private a(String str, Throwable th2) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.: " + str, th2);
        }

        a(int i10, int i11, int i12, Throwable th2) {
            this((long) i10, (long) i11, i12, th2);
        }

        private a(long j10, long j11, int i10, Throwable th2) {
            this(String.format(Locale.US, "Pos: %d, limit: %d, len: %d", new Object[]{Long.valueOf(j10), Long.valueOf(j11), Integer.valueOf(i10)}), th2);
        }
    }

    /* renamed from: com.google.android.gms.internal.measurement.s4$b */
    private static class b extends C7405s4 {

        /* renamed from: d  reason: collision with root package name */
        private final byte[] f49069d;

        /* renamed from: e  reason: collision with root package name */
        private final int f49070e;

        /* renamed from: f  reason: collision with root package name */
        private int f49071f;

        b(byte[] bArr, int i10, int i11) {
            super();
            if (bArr == null) {
                throw new NullPointerException("buffer");
            } else if (((bArr.length - i11) | i11) >= 0) {
                this.f49069d = bArr;
                this.f49071f = 0;
                this.f49070e = i11;
            } else {
                throw new IllegalArgumentException(String.format(Locale.US, "Array range is invalid. Buffer.length=%d, offset=%d, length=%d", new Object[]{Integer.valueOf(bArr.length), 0, Integer.valueOf(i11)}));
            }
        }

        private final void E0(byte[] bArr, int i10, int i11) {
            try {
                System.arraycopy(bArr, i10, this.f49069d, this.f49071f, i11);
                this.f49071f += i11;
            } catch (IndexOutOfBoundsException e10) {
                throw new a(this.f49071f, this.f49070e, i11, (Throwable) e10);
            }
        }

        public final void A0(int i10, int i11) {
            B0((i10 << 3) | i11);
        }

        public final void B0(int i10) {
            int i11;
            int i12 = this.f49071f;
            while ((i10 & -128) != 0) {
                i11 = i12 + 1;
                this.f49069d[i12] = (byte) (i10 | 128);
                i10 >>>= 7;
                i12 = i11;
            }
            try {
                i11 = i12 + 1;
                try {
                    this.f49069d[i12] = (byte) i10;
                    this.f49071f = i11;
                } catch (IndexOutOfBoundsException e10) {
                    e = e10;
                    i12 = i11;
                    throw new a(i12, this.f49070e, 1, (Throwable) e);
                }
            } catch (IndexOutOfBoundsException e11) {
                e = e11;
                throw new a(i12, this.f49070e, 1, (Throwable) e);
            }
        }

        public final void C0(int i10, int i11) {
            A0(i10, 0);
            B0(i11);
        }

        public final void N(int i10, C7406s5 s5Var) {
            A0(1, 3);
            C0(2, i10);
            A0(3, 2);
            Z(s5Var);
            A0(1, 4);
        }

        public final void O(int i10, String str) {
            A0(i10, 2);
            R(str);
        }

        public final void P(int i10, boolean z10) {
            A0(i10, 0);
            x(z10 ? (byte) 1 : 0);
        }

        public final void Q(C7276d4 d4Var) {
            B0(d4Var.x());
            d4Var.s(this);
        }

        public final void R(String str) {
            int i10 = this.f49071f;
            try {
                int o02 = C7405s4.o0(str.length() * 3);
                int o03 = C7405s4.o0(str.length());
                if (o03 == o02) {
                    int i11 = i10 + o03;
                    this.f49071f = i11;
                    int b10 = C7305g6.b(str, this.f49069d, i11, b());
                    this.f49071f = i10;
                    B0((b10 - i10) - o03);
                    this.f49071f = b10;
                    return;
                }
                B0(C7305g6.a(str));
                this.f49071f = C7305g6.b(str, this.f49069d, this.f49071f, b());
            } catch (C7332j6 e10) {
                this.f49071f = i10;
                y(str, e10);
            } catch (IndexOutOfBoundsException e11) {
                throw new a(e11);
            }
        }

        public final void X(int i10, C7276d4 d4Var) {
            A0(i10, 2);
            Q(d4Var);
        }

        /* access modifiers changed from: package-private */
        public final void Y(int i10, C7406s5 s5Var, K5 k52) {
            A0(i10, 2);
            B0(((T3) s5Var).g(k52));
            k52.d(s5Var, this.f49068a);
        }

        public final void Z(C7406s5 s5Var) {
            B0(s5Var.a());
            s5Var.j(this);
        }

        public final void a(byte[] bArr, int i10, int i11) {
            E0(bArr, i10, i11);
        }

        public final int b() {
            return this.f49070e - this.f49071f;
        }

        public final void f0(int i10, C7276d4 d4Var) {
            A0(1, 3);
            C0(2, i10);
            X(3, d4Var);
            A0(1, 4);
        }

        public final void m0(int i10, long j10) {
            A0(i10, 1);
            n0(j10);
        }

        public final void n0(long j10) {
            int i10 = this.f49071f;
            try {
                byte[] bArr = this.f49069d;
                bArr[i10] = (byte) ((int) j10);
                bArr[i10 + 1] = (byte) ((int) (j10 >> 8));
                bArr[i10 + 2] = (byte) ((int) (j10 >> 16));
                bArr[i10 + 3] = (byte) ((int) (j10 >> 24));
                bArr[i10 + 4] = (byte) ((int) (j10 >> 32));
                bArr[i10 + 5] = (byte) ((int) (j10 >> 40));
                bArr[i10 + 6] = (byte) ((int) (j10 >> 48));
                bArr[i10 + 7] = (byte) ((int) (j10 >> 56));
                this.f49071f = i10 + 8;
            } catch (IndexOutOfBoundsException e10) {
                throw new a(i10, this.f49070e, 8, (Throwable) e10);
            }
        }

        public final void p0(int i10, int i11) {
            A0(i10, 5);
            s0(i11);
        }

        public final void s0(int i10) {
            int i11 = this.f49071f;
            try {
                byte[] bArr = this.f49069d;
                bArr[i11] = (byte) i10;
                bArr[i11 + 1] = (byte) (i10 >> 8);
                bArr[i11 + 2] = (byte) (i10 >> 16);
                bArr[i11 + 3] = i10 >> 24;
                this.f49071f = i11 + 4;
            } catch (IndexOutOfBoundsException e10) {
                throw new a(i11, this.f49070e, 4, (Throwable) e10);
            }
        }

        public final void t0(int i10, int i11) {
            A0(i10, 0);
            x0(i11);
        }

        public final void u0(int i10, long j10) {
            A0(i10, 0);
            v0(j10);
        }

        public final void v0(long j10) {
            int i10;
            int i11 = this.f49071f;
            if (!C7405s4.f49067c || b() < 10) {
                while ((j10 & -128) != 0) {
                    int i12 = i11 + 1;
                    try {
                        this.f49069d[i11] = (byte) (((int) j10) | 128);
                        j10 >>>= 7;
                        i11 = i12;
                    } catch (IndexOutOfBoundsException e10) {
                        e = e10;
                        i11 = i12;
                        throw new a(i11, this.f49070e, 1, (Throwable) e);
                    }
                }
                try {
                    i10 = i11 + 1;
                } catch (IndexOutOfBoundsException e11) {
                    e = e11;
                    throw new a(i11, this.f49070e, 1, (Throwable) e);
                }
                try {
                    this.f49069d[i11] = (byte) ((int) j10);
                } catch (IndexOutOfBoundsException e12) {
                    e = e12;
                    i11 = i10;
                    throw new a(i11, this.f49070e, 1, (Throwable) e);
                }
            } else {
                while ((j10 & -128) != 0) {
                    C7287e6.m(this.f49069d, (long) i11, (byte) (((int) j10) | 128));
                    j10 >>>= 7;
                    i11++;
                }
                i10 = i11 + 1;
                C7287e6.m(this.f49069d, (long) i11, (byte) ((int) j10));
            }
            this.f49071f = i10;
        }

        public final void x(byte b10) {
            int i10 = this.f49071f;
            try {
                int i11 = i10 + 1;
                try {
                    this.f49069d[i10] = b10;
                    this.f49071f = i11;
                } catch (IndexOutOfBoundsException e10) {
                    e = e10;
                    i10 = i11;
                    throw new a(i10, this.f49070e, 1, (Throwable) e);
                }
            } catch (IndexOutOfBoundsException e11) {
                e = e11;
                throw new a(i10, this.f49070e, 1, (Throwable) e);
            }
        }

        public final void x0(int i10) {
            if (i10 >= 0) {
                B0(i10);
            } else {
                v0((long) i10);
            }
        }
    }

    public static int A(int i10, int i11) {
        return o0(i10 << 3) + 4;
    }

    public static int B(int i10, long j10) {
        return o0(i10 << 3) + j0(j10);
    }

    public static int C(int i10, C7276d4 d4Var) {
        return (o0(8) << 1) + l0(2, i10) + j(3, d4Var);
    }

    public static int D(int i10, Z4 z42) {
        int o02 = o0(i10 << 3);
        int a10 = z42.a();
        return o02 + o0(a10) + a10;
    }

    private static int D0(int i10) {
        return (i10 >> 31) ^ (i10 << 1);
    }

    static int E(int i10, C7406s5 s5Var, K5 k52) {
        return o0(i10 << 3) + t(s5Var, k52);
    }

    public static int F(long j10) {
        return j0(j10);
    }

    public static int G(C7406s5 s5Var) {
        int a10 = s5Var.a();
        return o0(a10) + a10;
    }

    public static C7405s4 H(byte[] bArr) {
        return new b(bArr, 0, bArr.length);
    }

    public static int T(int i10) {
        return j0((long) i10);
    }

    public static int U(int i10, int i11) {
        return o0(i10 << 3) + j0((long) i11);
    }

    public static int V(int i10, long j10) {
        return o0(i10 << 3) + 8;
    }

    public static int W(long j10) {
        return 8;
    }

    public static int b0(int i10) {
        return 4;
    }

    public static int c(double d10) {
        return 8;
    }

    public static int c0(int i10, int i11) {
        return o0(i10 << 3) + 4;
    }

    public static int d(float f10) {
        return 4;
    }

    public static int d0(int i10, long j10) {
        return o0(i10 << 3) + j0(w0(j10));
    }

    public static int e(int i10) {
        return j0((long) i10);
    }

    public static int e0(long j10) {
        return j0(w0(j10));
    }

    public static int f(int i10, double d10) {
        return o0(i10 << 3) + 8;
    }

    public static int g(int i10, float f10) {
        return o0(i10 << 3) + 4;
    }

    public static int g0(int i10) {
        return o0(D0(i10));
    }

    public static int h(int i10, int i11) {
        return o0(i10 << 3) + j0((long) i11);
    }

    public static int h0(int i10, int i11) {
        return o0(i10 << 3) + o0(D0(i11));
    }

    public static int i(int i10, long j10) {
        return o0(i10 << 3) + 8;
    }

    public static int i0(int i10, long j10) {
        return o0(i10 << 3) + j0(j10);
    }

    public static int j(int i10, C7276d4 d4Var) {
        int o02 = o0(i10 << 3);
        int x10 = d4Var.x();
        return o02 + o0(x10) + x10;
    }

    public static int j0(long j10) {
        return (640 - (Long.numberOfLeadingZeros(j10) * 9)) >>> 6;
    }

    public static int k(int i10, Z4 z42) {
        return (o0(8) << 1) + l0(2, i10) + D(3, z42);
    }

    public static int k0(int i10) {
        return o0(i10 << 3);
    }

    public static int l(int i10, C7406s5 s5Var) {
        return (o0(8) << 1) + l0(2, i10) + o0(24) + G(s5Var);
    }

    public static int l0(int i10, int i11) {
        return o0(i10 << 3) + o0(i11);
    }

    @Deprecated
    static int m(int i10, C7406s5 s5Var, K5 k52) {
        return (o0(i10 << 3) << 1) + ((T3) s5Var).g(k52);
    }

    public static int n(int i10, String str) {
        return o0(i10 << 3) + u(str);
    }

    public static int o(int i10, boolean z10) {
        return o0(i10 << 3) + 1;
    }

    public static int o0(int i10) {
        return (352 - (Integer.numberOfLeadingZeros(i10) * 9)) >>> 6;
    }

    public static int p(long j10) {
        return 8;
    }

    public static int q(C7276d4 d4Var) {
        int x10 = d4Var.x();
        return o0(x10) + x10;
    }

    public static int r(Z4 z42) {
        int a10 = z42.a();
        return o0(a10) + a10;
    }

    @Deprecated
    public static int s(C7406s5 s5Var) {
        return s5Var.a();
    }

    static int t(C7406s5 s5Var, K5 k52) {
        int g10 = ((T3) s5Var).g(k52);
        return o0(g10) + g10;
    }

    public static int u(String str) {
        int i10;
        try {
            i10 = C7305g6.a(str);
        } catch (C7332j6 unused) {
            i10 = str.getBytes(O4.f48769a).length;
        }
        return o0(i10) + i10;
    }

    public static int v(boolean z10) {
        return 1;
    }

    public static int w(byte[] bArr) {
        int length = bArr.length;
        return o0(length) + length;
    }

    private static long w0(long j10) {
        return (j10 >> 63) ^ (j10 << 1);
    }

    public static int z(int i10) {
        return 4;
    }

    public abstract void A0(int i10, int i11);

    public abstract void B0(int i10);

    public abstract void C0(int i10, int i11);

    public final void I() {
        if (b() != 0) {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
    }

    public final void J(double d10) {
        n0(Double.doubleToRawLongBits(d10));
    }

    public final void K(float f10) {
        s0(Float.floatToRawIntBits(f10));
    }

    public final void L(int i10, double d10) {
        m0(i10, Double.doubleToRawLongBits(d10));
    }

    public final void M(int i10, float f10) {
        p0(i10, Float.floatToRawIntBits(f10));
    }

    public abstract void N(int i10, C7406s5 s5Var);

    public abstract void O(int i10, String str);

    public abstract void P(int i10, boolean z10);

    public abstract void Q(C7276d4 d4Var);

    public abstract void R(String str);

    public final void S(boolean z10) {
        x(z10 ? (byte) 1 : 0);
    }

    public abstract void X(int i10, C7276d4 d4Var);

    /* access modifiers changed from: package-private */
    public abstract void Y(int i10, C7406s5 s5Var, K5 k52);

    public abstract void Z(C7406s5 s5Var);

    public abstract int b();

    public abstract void f0(int i10, C7276d4 d4Var);

    public abstract void m0(int i10, long j10);

    public abstract void n0(long j10);

    public abstract void p0(int i10, int i11);

    public final void q0(int i10, long j10) {
        u0(i10, w0(j10));
    }

    public final void r0(long j10) {
        v0(w0(j10));
    }

    public abstract void s0(int i10);

    public abstract void t0(int i10, int i11);

    public abstract void u0(int i10, long j10);

    public abstract void v0(long j10);

    public abstract void x(byte b10);

    public abstract void x0(int i10);

    /* access modifiers changed from: package-private */
    public final void y(String str, C7332j6 j6Var) {
        f49066b.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", j6Var);
        byte[] bytes = str.getBytes(O4.f48769a);
        try {
            B0(bytes.length);
            a(bytes, 0, bytes.length);
        } catch (IndexOutOfBoundsException e10) {
            throw new a(e10);
        }
    }

    public final void y0(int i10, int i11) {
        C0(i10, D0(i11));
    }

    public final void z0(int i10) {
        B0(D0(i10));
    }

    private C7405s4() {
    }
}
