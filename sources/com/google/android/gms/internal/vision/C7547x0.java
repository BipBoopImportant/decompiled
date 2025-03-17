package com.google.android.gms.internal.vision;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: com.google.android.gms.internal.vision.x0  reason: case insensitive filesystem */
public abstract class C7547x0 extends C7485f0 {

    /* renamed from: b  reason: collision with root package name */
    private static final Logger f49413b = Logger.getLogger(C7547x0.class.getName());
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public static final boolean f49414c = q2.m();

    /* renamed from: a  reason: collision with root package name */
    C7553z0 f49415a;

    /* renamed from: com.google.android.gms.internal.vision.x0$a */
    private static class a extends C7547x0 {

        /* renamed from: d  reason: collision with root package name */
        private final byte[] f49416d;

        /* renamed from: e  reason: collision with root package name */
        private final int f49417e;

        /* renamed from: f  reason: collision with root package name */
        private final int f49418f;

        /* renamed from: g  reason: collision with root package name */
        private int f49419g;

        a(byte[] bArr, int i10, int i11) {
            super();
            if (bArr == null) {
                throw new NullPointerException("buffer");
            } else if (((bArr.length - i11) | i11) >= 0) {
                this.f49416d = bArr;
                this.f49417e = 0;
                this.f49419g = 0;
                this.f49418f = i11;
            } else {
                throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", new Object[]{Integer.valueOf(bArr.length), 0, Integer.valueOf(i11)}));
            }
        }

        private final void F0(byte[] bArr, int i10, int i11) {
            try {
                System.arraycopy(bArr, i10, this.f49416d, this.f49419g, i11);
                this.f49419g += i11;
            } catch (IndexOutOfBoundsException e10) {
                throw new b(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f49419g), Integer.valueOf(this.f49418f), Integer.valueOf(i11)}), e10);
            }
        }

        public final void O(int i10) {
            if (!C7547x0.f49414c || C7465a0.b() || b() < 5) {
                while ((i10 & -128) != 0) {
                    byte[] bArr = this.f49416d;
                    int i11 = this.f49419g;
                    this.f49419g = i11 + 1;
                    bArr[i11] = (byte) ((i10 & 127) | 128);
                    i10 >>>= 7;
                }
                try {
                    byte[] bArr2 = this.f49416d;
                    int i12 = this.f49419g;
                    this.f49419g = i12 + 1;
                    bArr2[i12] = (byte) i10;
                } catch (IndexOutOfBoundsException e10) {
                    throw new b(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f49419g), Integer.valueOf(this.f49418f), 1}), e10);
                }
            } else if ((i10 & -128) == 0) {
                byte[] bArr3 = this.f49416d;
                int i13 = this.f49419g;
                this.f49419g = i13 + 1;
                q2.l(bArr3, (long) i13, (byte) i10);
            } else {
                byte[] bArr4 = this.f49416d;
                int i14 = this.f49419g;
                this.f49419g = i14 + 1;
                q2.l(bArr4, (long) i14, (byte) (i10 | 128));
                int i15 = i10 >>> 7;
                if ((i15 & -128) == 0) {
                    byte[] bArr5 = this.f49416d;
                    int i16 = this.f49419g;
                    this.f49419g = i16 + 1;
                    q2.l(bArr5, (long) i16, (byte) i15);
                    return;
                }
                byte[] bArr6 = this.f49416d;
                int i17 = this.f49419g;
                this.f49419g = i17 + 1;
                q2.l(bArr6, (long) i17, (byte) (i15 | 128));
                int i18 = i10 >>> 14;
                if ((i18 & -128) == 0) {
                    byte[] bArr7 = this.f49416d;
                    int i19 = this.f49419g;
                    this.f49419g = i19 + 1;
                    q2.l(bArr7, (long) i19, (byte) i18);
                    return;
                }
                byte[] bArr8 = this.f49416d;
                int i20 = this.f49419g;
                this.f49419g = i20 + 1;
                q2.l(bArr8, (long) i20, (byte) (i18 | 128));
                int i21 = i10 >>> 21;
                if ((i21 & -128) == 0) {
                    byte[] bArr9 = this.f49416d;
                    int i22 = this.f49419g;
                    this.f49419g = i22 + 1;
                    q2.l(bArr9, (long) i22, (byte) i21);
                    return;
                }
                byte[] bArr10 = this.f49416d;
                int i23 = this.f49419g;
                this.f49419g = i23 + 1;
                q2.l(bArr10, (long) i23, (byte) (i21 | 128));
                byte[] bArr11 = this.f49416d;
                int i24 = this.f49419g;
                this.f49419g = i24 + 1;
                q2.l(bArr11, (long) i24, (byte) (i10 >>> 28));
            }
        }

        public final void P(int i10, int i11) {
            m(i10, 0);
            j(i11);
        }

        public final void R(int i10, C7497i0 i0Var) {
            m(1, 3);
            X(2, i10);
            o(3, i0Var);
            m(1, 4);
        }

        public final void X(int i10, int i11) {
            m(i10, 0);
            O(i11);
        }

        public final void Y(int i10, long j10) {
            m(i10, 1);
            Z(j10);
        }

        public final void Z(long j10) {
            try {
                byte[] bArr = this.f49416d;
                int i10 = this.f49419g;
                int i11 = i10 + 1;
                this.f49419g = i11;
                bArr[i10] = (byte) ((int) j10);
                int i12 = i10 + 2;
                this.f49419g = i12;
                bArr[i11] = (byte) ((int) (j10 >> 8));
                int i13 = i10 + 3;
                this.f49419g = i13;
                bArr[i12] = (byte) ((int) (j10 >> 16));
                int i14 = i10 + 4;
                this.f49419g = i14;
                bArr[i13] = (byte) ((int) (j10 >> 24));
                int i15 = i10 + 5;
                this.f49419g = i15;
                bArr[i14] = (byte) ((int) (j10 >> 32));
                int i16 = i10 + 6;
                this.f49419g = i16;
                bArr[i15] = (byte) ((int) (j10 >> 40));
                int i17 = i10 + 7;
                this.f49419g = i17;
                bArr[i16] = (byte) ((int) (j10 >> 48));
                this.f49419g = i10 + 8;
                bArr[i17] = (byte) ((int) (j10 >> 56));
            } catch (IndexOutOfBoundsException e10) {
                throw new b(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f49419g), Integer.valueOf(this.f49418f), 1}), e10);
            }
        }

        public final void a(byte[] bArr, int i10, int i11) {
            F0(bArr, i10, i11);
        }

        public final int b() {
            return this.f49418f - this.f49419g;
        }

        public final void e0(int i10) {
            try {
                byte[] bArr = this.f49416d;
                int i11 = this.f49419g;
                int i12 = i11 + 1;
                this.f49419g = i12;
                bArr[i11] = (byte) i10;
                int i13 = i11 + 2;
                this.f49419g = i13;
                bArr[i12] = (byte) (i10 >> 8);
                int i14 = i11 + 3;
                this.f49419g = i14;
                bArr[i13] = (byte) (i10 >> 16);
                this.f49419g = i11 + 4;
                bArr[i14] = (byte) (i10 >>> 24);
            } catch (IndexOutOfBoundsException e10) {
                throw new b(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f49419g), Integer.valueOf(this.f49418f), 1}), e10);
            }
        }

        public final void g(byte b10) {
            try {
                byte[] bArr = this.f49416d;
                int i10 = this.f49419g;
                this.f49419g = i10 + 1;
                bArr[i10] = b10;
            } catch (IndexOutOfBoundsException e10) {
                throw new b(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f49419g), Integer.valueOf(this.f49418f), 1}), e10);
            }
        }

        public final void j(int i10) {
            if (i10 >= 0) {
                O(i10);
            } else {
                t((long) i10);
            }
        }

        public final void j0(int i10, int i11) {
            m(i10, 5);
            e0(i11);
        }

        public final void m(int i10, int i11) {
            O((i10 << 3) | i11);
        }

        public final void n(int i10, long j10) {
            m(i10, 0);
            t(j10);
        }

        public final void o(int i10, C7497i0 i0Var) {
            m(i10, 2);
            u(i0Var);
        }

        public final void p(int i10, A1 a12) {
            m(1, 3);
            X(2, i10);
            m(3, 2);
            v(a12);
            m(1, 4);
        }

        /* access modifiers changed from: package-private */
        public final void q(int i10, A1 a12, S1 s12) {
            m(i10, 2);
            X x10 = (X) a12;
            int k10 = x10.k();
            if (k10 == -1) {
                k10 = s12.zzb(x10);
                x10.f(k10);
            }
            O(k10);
            s12.a(a12, this.f49415a);
        }

        public final void r(int i10, String str) {
            m(i10, 2);
            w(str);
        }

        public final void s(int i10, boolean z10) {
            m(i10, 0);
            g(z10 ? (byte) 1 : 0);
        }

        public final void t(long j10) {
            if (!C7547x0.f49414c || b() < 10) {
                while ((j10 & -128) != 0) {
                    byte[] bArr = this.f49416d;
                    int i10 = this.f49419g;
                    this.f49419g = i10 + 1;
                    bArr[i10] = (byte) ((((int) j10) & 127) | 128);
                    j10 >>>= 7;
                }
                try {
                    byte[] bArr2 = this.f49416d;
                    int i11 = this.f49419g;
                    this.f49419g = i11 + 1;
                    bArr2[i11] = (byte) ((int) j10);
                } catch (IndexOutOfBoundsException e10) {
                    throw new b(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f49419g), Integer.valueOf(this.f49418f), 1}), e10);
                }
            } else {
                while ((j10 & -128) != 0) {
                    byte[] bArr3 = this.f49416d;
                    int i12 = this.f49419g;
                    this.f49419g = i12 + 1;
                    q2.l(bArr3, (long) i12, (byte) ((((int) j10) & 127) | 128));
                    j10 >>>= 7;
                }
                byte[] bArr4 = this.f49416d;
                int i13 = this.f49419g;
                this.f49419g = i13 + 1;
                q2.l(bArr4, (long) i13, (byte) ((int) j10));
            }
        }

        public final void u(C7497i0 i0Var) {
            O(i0Var.i());
            i0Var.s(this);
        }

        public final void v(A1 a12) {
            O(a12.r());
            a12.b(this);
        }

        public final void w(String str) {
            int i10 = this.f49419g;
            try {
                int o02 = C7547x0.o0(str.length() * 3);
                int o03 = C7547x0.o0(str.length());
                if (o03 == o02) {
                    int i11 = i10 + o03;
                    this.f49419g = i11;
                    int e10 = t2.e(str, this.f49416d, i11, b());
                    this.f49419g = i10;
                    O((e10 - i10) - o03);
                    this.f49419g = e10;
                    return;
                }
                O(t2.d(str));
                this.f49419g = t2.e(str, this.f49416d, this.f49419g, b());
            } catch (w2 e11) {
                this.f49419g = i10;
                x(str, e11);
            } catch (IndexOutOfBoundsException e12) {
                throw new b(e12);
            }
        }
    }

    /* renamed from: com.google.android.gms.internal.vision.x0$b */
    public static class b extends IOException {
        b(Throwable th2) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.", th2);
        }

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        b(java.lang.String r3, java.lang.Throwable r4) {
            /*
                r2 = this;
                java.lang.String r3 = java.lang.String.valueOf(r3)
                int r0 = r3.length()
                java.lang.String r1 = "CodedOutputStream was writing to a flat byte array and ran out of space.: "
                if (r0 == 0) goto L_0x0011
                java.lang.String r3 = r1.concat(r3)
                goto L_0x0016
            L_0x0011:
                java.lang.String r3 = new java.lang.String
                r3.<init>(r1)
            L_0x0016:
                r2.<init>(r3, r4)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.vision.C7547x0.b.<init>(java.lang.String, java.lang.Throwable):void");
        }
    }

    private C7547x0() {
    }

    public static int A(float f10) {
        return 4;
    }

    public static int A0(int i10, int i11) {
        return o0(i10 << 3) + 4;
    }

    public static int B(int i10, double d10) {
        return o0(i10 << 3) + 8;
    }

    public static int B0(int i10) {
        return k0(i10);
    }

    public static int C(int i10, float f10) {
        return o0(i10 << 3) + 4;
    }

    public static int C0(int i10, int i11) {
        return o0(i10 << 3) + k0(i11);
    }

    public static int D(int i10, C7498i1 i1Var) {
        return (o0(8) << 1) + p0(2, i10) + c(3, i1Var);
    }

    @Deprecated
    public static int D0(int i10) {
        return o0(i10);
    }

    public static int E(int i10, A1 a12) {
        return (o0(8) << 1) + p0(2, i10) + o0(24) + J(a12);
    }

    private static int E0(int i10) {
        return (i10 >> 31) ^ (i10 << 1);
    }

    static int F(int i10, A1 a12, S1 s12) {
        return o0(i10 << 3) + e(a12, s12);
    }

    public static int G(int i10, String str) {
        return o0(i10 << 3) + K(str);
    }

    public static int H(int i10, boolean z10) {
        return o0(i10 << 3) + 1;
    }

    public static int I(C7497i0 i0Var) {
        int i10 = i0Var.i();
        return o0(i10) + i10;
    }

    public static int J(A1 a12) {
        int r10 = a12.r();
        return o0(r10) + r10;
    }

    public static int K(String str) {
        int i10;
        try {
            i10 = t2.d(str);
        } catch (w2 unused) {
            i10 = str.getBytes(U0.f49276a).length;
        }
        return o0(i10) + i10;
    }

    public static int L(boolean z10) {
        return 1;
    }

    public static int M(byte[] bArr) {
        int length = bArr.length;
        return o0(length) + length;
    }

    public static int T(int i10, C7497i0 i0Var) {
        int o02 = o0(i10 << 3);
        int i11 = i0Var.i();
        return o02 + o0(i11) + i11;
    }

    @Deprecated
    static int U(int i10, A1 a12, S1 s12) {
        int o02 = o0(i10 << 3) << 1;
        X x10 = (X) a12;
        int k10 = x10.k();
        if (k10 == -1) {
            k10 = s12.zzb(x10);
            x10.f(k10);
        }
        return o02 + k10;
    }

    @Deprecated
    public static int V(A1 a12) {
        return a12.r();
    }

    public static int b0(int i10, long j10) {
        return o0(i10 << 3) + i0(j10);
    }

    public static int c(int i10, C7498i1 i1Var) {
        int o02 = o0(i10 << 3);
        int b10 = i1Var.b();
        return o02 + o0(b10) + b10;
    }

    public static int c0(int i10, C7497i0 i0Var) {
        return (o0(8) << 1) + p0(2, i10) + T(3, i0Var);
    }

    public static int d(C7498i1 i1Var) {
        int b10 = i1Var.b();
        return o0(b10) + b10;
    }

    public static int d0(long j10) {
        return i0(j10);
    }

    static int e(A1 a12, S1 s12) {
        X x10 = (X) a12;
        int k10 = x10.k();
        if (k10 == -1) {
            k10 = s12.zzb(x10);
            x10.f(k10);
        }
        return o0(k10) + k10;
    }

    public static C7547x0 f(byte[] bArr) {
        return new a(bArr, 0, bArr.length);
    }

    public static int g0(int i10) {
        return o0(i10 << 3);
    }

    public static int h0(int i10, long j10) {
        return o0(i10 << 3) + i0(j10);
    }

    public static int i0(long j10) {
        int i10;
        if ((-128 & j10) == 0) {
            return 1;
        }
        if (j10 < 0) {
            return 10;
        }
        if ((-34359738368L & j10) != 0) {
            j10 >>>= 28;
            i10 = 6;
        } else {
            i10 = 2;
        }
        if ((-2097152 & j10) != 0) {
            i10 += 2;
            j10 >>>= 14;
        }
        return (j10 & -16384) != 0 ? i10 + 1 : i10;
    }

    public static int k0(int i10) {
        if (i10 >= 0) {
            return o0(i10);
        }
        return 10;
    }

    public static int l0(int i10, int i11) {
        return o0(i10 << 3) + k0(i11);
    }

    public static int m0(int i10, long j10) {
        return o0(i10 << 3) + i0(y0(j10));
    }

    public static int n0(long j10) {
        return i0(y0(j10));
    }

    public static int o0(int i10) {
        if ((i10 & -128) == 0) {
            return 1;
        }
        if ((i10 & -16384) == 0) {
            return 2;
        }
        if ((-2097152 & i10) == 0) {
            return 3;
        }
        return (i10 & -268435456) == 0 ? 4 : 5;
    }

    public static int p0(int i10, int i11) {
        return o0(i10 << 3) + o0(i11);
    }

    public static int q0(int i10, long j10) {
        return o0(i10 << 3) + 8;
    }

    public static int r0(long j10) {
        return 8;
    }

    public static int s0(int i10) {
        return o0(E0(i10));
    }

    public static int t0(int i10, int i11) {
        return o0(i10 << 3) + o0(E0(i11));
    }

    public static int u0(int i10, long j10) {
        return o0(i10 << 3) + 8;
    }

    public static int v0(long j10) {
        return 8;
    }

    public static int w0(int i10) {
        return 4;
    }

    public static int x0(int i10, int i11) {
        return o0(i10 << 3) + 4;
    }

    private static long y0(long j10) {
        return (j10 >> 63) ^ (j10 << 1);
    }

    public static int z(double d10) {
        return 8;
    }

    public static int z0(int i10) {
        return 4;
    }

    public final void N() {
        if (b() != 0) {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
    }

    public abstract void O(int i10);

    public abstract void P(int i10, int i11);

    public final void Q(int i10, long j10) {
        n(i10, y0(j10));
    }

    public abstract void R(int i10, C7497i0 i0Var);

    public final void S(long j10) {
        t(y0(j10));
    }

    public final void W(int i10) {
        O(E0(i10));
    }

    public abstract void X(int i10, int i11);

    public abstract void Y(int i10, long j10);

    public abstract void Z(long j10);

    public abstract int b();

    public abstract void e0(int i10);

    public final void f0(int i10, int i11) {
        X(i10, E0(i11));
    }

    public abstract void g(byte b10);

    public final void h(double d10) {
        Z(Double.doubleToRawLongBits(d10));
    }

    public final void i(float f10) {
        e0(Float.floatToRawIntBits(f10));
    }

    public abstract void j(int i10);

    public abstract void j0(int i10, int i11);

    public final void k(int i10, double d10) {
        Y(i10, Double.doubleToRawLongBits(d10));
    }

    public final void l(int i10, float f10) {
        j0(i10, Float.floatToRawIntBits(f10));
    }

    public abstract void m(int i10, int i11);

    public abstract void n(int i10, long j10);

    public abstract void o(int i10, C7497i0 i0Var);

    public abstract void p(int i10, A1 a12);

    /* access modifiers changed from: package-private */
    public abstract void q(int i10, A1 a12, S1 s12);

    public abstract void r(int i10, String str);

    public abstract void s(int i10, boolean z10);

    public abstract void t(long j10);

    public abstract void u(C7497i0 i0Var);

    public abstract void v(A1 a12);

    public abstract void w(String str);

    /* access modifiers changed from: package-private */
    public final void x(String str, w2 w2Var) {
        f49413b.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", w2Var);
        byte[] bytes = str.getBytes(U0.f49276a);
        try {
            O(bytes.length);
            a(bytes, 0, bytes.length);
        } catch (IndexOutOfBoundsException e10) {
            throw new b(e10);
        } catch (b e11) {
            throw e11;
        }
    }

    public final void y(boolean z10) {
        g(z10 ? (byte) 1 : 0);
    }
}
