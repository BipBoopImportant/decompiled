package com.google.protobuf;

import com.google.protobuf.t0;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: com.google.protobuf.k  reason: case insensitive filesystem */
public abstract class C9578k extends C9574g {

    /* renamed from: c  reason: collision with root package name */
    private static final Logger f69321c = Logger.getLogger(C9578k.class.getName());
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public static final boolean f69322d = s0.E();

    /* renamed from: a  reason: collision with root package name */
    C9579l f69323a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f69324b;

    /* renamed from: com.google.protobuf.k$b */
    private static class b extends C9578k {

        /* renamed from: e  reason: collision with root package name */
        private final byte[] f69325e;

        /* renamed from: f  reason: collision with root package name */
        private final int f69326f;

        /* renamed from: g  reason: collision with root package name */
        private final int f69327g;

        /* renamed from: h  reason: collision with root package name */
        private int f69328h;

        b(byte[] bArr, int i10, int i11) {
            super();
            if (bArr != null) {
                int i12 = i10 + i11;
                if ((i10 | i11 | (bArr.length - i12)) >= 0) {
                    this.f69325e = bArr;
                    this.f69326f = i10;
                    this.f69328h = i10;
                    this.f69327g = i12;
                    return;
                }
                throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", new Object[]{Integer.valueOf(bArr.length), Integer.valueOf(i10), Integer.valueOf(i11)}));
            }
            throw new NullPointerException("buffer");
        }

        public final void A0(int i10, int i11) {
            S0(i10, 0);
            B0(i11);
        }

        public final void B0(int i10) {
            if (i10 >= 0) {
                U0(i10);
            } else {
                W0((long) i10);
            }
        }

        /* access modifiers changed from: package-private */
        public final void E0(int i10, S s10, h0 h0Var) {
            S0(i10, 2);
            U0(((C9568a) s10).getSerializedSize(h0Var));
            h0Var.d(s10, this.f69323a);
        }

        public final void F0(S s10) {
            U0(s10.getSerializedSize());
            s10.writeTo(this);
        }

        public final void G0(int i10, S s10) {
            S0(1, 3);
            T0(2, i10);
            Y0(3, s10);
            S0(1, 4);
        }

        public final void H0(int i10, C9575h hVar) {
            S0(1, 3);
            T0(2, i10);
            k0(3, hVar);
            S0(1, 4);
        }

        public final void Q0(int i10, String str) {
            S0(i10, 2);
            R0(str);
        }

        public final void R0(String str) {
            int i10 = this.f69328h;
            try {
                int V10 = C9578k.V(str.length() * 3);
                int V11 = C9578k.V(str.length());
                if (V11 == V10) {
                    int i11 = i10 + V11;
                    this.f69328h = i11;
                    int f10 = t0.f(str, this.f69325e, i11, e0());
                    this.f69328h = i10;
                    U0((f10 - i10) - V11);
                    this.f69328h = f10;
                    return;
                }
                U0(t0.g(str));
                this.f69328h = t0.f(str, this.f69325e, this.f69328h, e0());
            } catch (t0.d e10) {
                this.f69328h = i10;
                a0(str, e10);
            } catch (IndexOutOfBoundsException e11) {
                throw new c(e11);
            }
        }

        public final void S0(int i10, int i11) {
            U0(u0.c(i10, i11));
        }

        public final void T0(int i10, int i11) {
            S0(i10, 0);
            U0(i11);
        }

        public final void U0(int i10) {
            while ((i10 & -128) != 0) {
                byte[] bArr = this.f69325e;
                int i11 = this.f69328h;
                this.f69328h = i11 + 1;
                bArr[i11] = (byte) ((i10 | 128) & 255);
                i10 >>>= 7;
            }
            try {
                byte[] bArr2 = this.f69325e;
                int i12 = this.f69328h;
                this.f69328h = i12 + 1;
                bArr2[i12] = (byte) i10;
            } catch (IndexOutOfBoundsException e10) {
                throw new c(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f69328h), Integer.valueOf(this.f69327g), 1}), e10);
            }
        }

        public final void V0(int i10, long j10) {
            S0(i10, 0);
            W0(j10);
        }

        public final void W0(long j10) {
            if (!C9578k.f69322d || e0() < 10) {
                while ((j10 & -128) != 0) {
                    byte[] bArr = this.f69325e;
                    int i10 = this.f69328h;
                    this.f69328h = i10 + 1;
                    bArr[i10] = (byte) ((((int) j10) | 128) & 255);
                    j10 >>>= 7;
                }
                try {
                    byte[] bArr2 = this.f69325e;
                    int i11 = this.f69328h;
                    this.f69328h = i11 + 1;
                    bArr2[i11] = (byte) ((int) j10);
                } catch (IndexOutOfBoundsException e10) {
                    throw new c(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f69328h), Integer.valueOf(this.f69327g), 1}), e10);
                }
            } else {
                while ((j10 & -128) != 0) {
                    byte[] bArr3 = this.f69325e;
                    int i12 = this.f69328h;
                    this.f69328h = i12 + 1;
                    s0.K(bArr3, (long) i12, (byte) ((((int) j10) | 128) & 255));
                    j10 >>>= 7;
                }
                byte[] bArr4 = this.f69325e;
                int i13 = this.f69328h;
                this.f69328h = i13 + 1;
                s0.K(bArr4, (long) i13, (byte) ((int) j10));
            }
        }

        public final void X0(byte[] bArr, int i10, int i11) {
            try {
                System.arraycopy(bArr, i10, this.f69325e, this.f69328h, i11);
                this.f69328h += i11;
            } catch (IndexOutOfBoundsException e10) {
                throw new c(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f69328h), Integer.valueOf(this.f69327g), Integer.valueOf(i11)}), e10);
            }
        }

        public final void Y0(int i10, S s10) {
            S0(i10, 2);
            F0(s10);
        }

        public final void a(byte[] bArr, int i10, int i11) {
            X0(bArr, i10, i11);
        }

        public final int e0() {
            return this.f69327g - this.f69328h;
        }

        public final void f0(byte b10) {
            try {
                byte[] bArr = this.f69325e;
                int i10 = this.f69328h;
                this.f69328h = i10 + 1;
                bArr[i10] = b10;
            } catch (IndexOutOfBoundsException e10) {
                throw new c(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f69328h), Integer.valueOf(this.f69327g), 1}), e10);
            }
        }

        public final void g0(int i10, boolean z10) {
            S0(i10, 0);
            f0(z10 ? (byte) 1 : 0);
        }

        public final void j0(byte[] bArr, int i10, int i11) {
            U0(i11);
            X0(bArr, i10, i11);
        }

        public final void k0(int i10, C9575h hVar) {
            S0(i10, 2);
            l0(hVar);
        }

        public final void l0(C9575h hVar) {
            U0(hVar.size());
            hVar.K(this);
        }

        public final void q0(int i10, int i11) {
            S0(i10, 5);
            r0(i11);
        }

        public final void r0(int i10) {
            try {
                byte[] bArr = this.f69325e;
                int i11 = this.f69328h;
                int i12 = i11 + 1;
                this.f69328h = i12;
                bArr[i11] = (byte) (i10 & 255);
                int i13 = i11 + 2;
                this.f69328h = i13;
                bArr[i12] = (byte) ((i10 >> 8) & 255);
                int i14 = i11 + 3;
                this.f69328h = i14;
                bArr[i13] = (byte) ((i10 >> 16) & 255);
                this.f69328h = i11 + 4;
                bArr[i14] = (byte) ((i10 >> 24) & 255);
            } catch (IndexOutOfBoundsException e10) {
                throw new c(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f69328h), Integer.valueOf(this.f69327g), 1}), e10);
            }
        }

        public final void s0(int i10, long j10) {
            S0(i10, 1);
            t0(j10);
        }

        public final void t0(long j10) {
            try {
                byte[] bArr = this.f69325e;
                int i10 = this.f69328h;
                int i11 = i10 + 1;
                this.f69328h = i11;
                bArr[i10] = (byte) (((int) j10) & 255);
                int i12 = i10 + 2;
                this.f69328h = i12;
                bArr[i11] = (byte) (((int) (j10 >> 8)) & 255);
                int i13 = i10 + 3;
                this.f69328h = i13;
                bArr[i12] = (byte) (((int) (j10 >> 16)) & 255);
                int i14 = i10 + 4;
                this.f69328h = i14;
                bArr[i13] = (byte) (((int) (j10 >> 24)) & 255);
                int i15 = i10 + 5;
                this.f69328h = i15;
                bArr[i14] = (byte) (((int) (j10 >> 32)) & 255);
                int i16 = i10 + 6;
                this.f69328h = i16;
                bArr[i15] = (byte) (((int) (j10 >> 40)) & 255);
                int i17 = i10 + 7;
                this.f69328h = i17;
                bArr[i16] = (byte) (((int) (j10 >> 48)) & 255);
                this.f69328h = i10 + 8;
                bArr[i17] = (byte) (((int) (j10 >> 56)) & 255);
            } catch (IndexOutOfBoundsException e10) {
                throw new c(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f69328h), Integer.valueOf(this.f69327g), 1}), e10);
            }
        }
    }

    /* renamed from: com.google.protobuf.k$c */
    public static class c extends IOException {
        c(Throwable th2) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.", th2);
        }

        c(String str, Throwable th2) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.: " + str, th2);
        }
    }

    public static int A(int i10, E e10) {
        return T(i10) + B(e10);
    }

    public static int B(E e10) {
        return C(e10.b());
    }

    static int C(int i10) {
        return V(i10) + i10;
    }

    public static int D(int i10, S s10) {
        return (T(1) * 2) + U(2, i10) + E(3, s10);
    }

    public static int E(int i10, S s10) {
        return T(i10) + G(s10);
    }

    static int F(int i10, S s10, h0 h0Var) {
        return T(i10) + H(s10, h0Var);
    }

    public static int G(S s10) {
        return C(s10.getSerializedSize());
    }

    static int H(S s10, h0 h0Var) {
        return C(((C9568a) s10).getSerializedSize(h0Var));
    }

    public static int I(int i10, C9575h hVar) {
        return (T(1) * 2) + U(2, i10) + g(3, hVar);
    }

    public static int J(int i10, int i11) {
        return T(i10) + K(i11);
    }

    public static int K(int i10) {
        return 4;
    }

    public static int L(int i10, long j10) {
        return T(i10) + M(j10);
    }

    public static int M(long j10) {
        return 8;
    }

    public static int N(int i10, int i11) {
        return T(i10) + O(i11);
    }

    public static int O(int i10) {
        return V(Y(i10));
    }

    public static int P(int i10, long j10) {
        return T(i10) + Q(j10);
    }

    public static int Q(long j10) {
        return X(Z(j10));
    }

    public static int R(int i10, String str) {
        return T(i10) + S(str);
    }

    public static int S(String str) {
        int i10;
        try {
            i10 = t0.g(str);
        } catch (t0.d unused) {
            i10 = str.getBytes(C9592z.f69430b).length;
        }
        return C(i10);
    }

    public static int T(int i10) {
        return V(u0.c(i10, 0));
    }

    public static int U(int i10, int i11) {
        return T(i10) + V(i11);
    }

    public static int V(int i10) {
        return (352 - (Integer.numberOfLeadingZeros(i10) * 9)) >>> 6;
    }

    public static int W(int i10, long j10) {
        return T(i10) + X(j10);
    }

    public static int X(long j10) {
        return (640 - (Long.numberOfLeadingZeros(j10) * 9)) >>> 6;
    }

    public static int Y(int i10) {
        return (i10 >> 31) ^ (i10 << 1);
    }

    public static long Z(long j10) {
        return (j10 >> 63) ^ (j10 << 1);
    }

    public static C9578k c0(byte[] bArr) {
        return d0(bArr, 0, bArr.length);
    }

    public static int d(int i10, boolean z10) {
        return T(i10) + e(z10);
    }

    public static C9578k d0(byte[] bArr, int i10, int i11) {
        return new b(bArr, i10, i11);
    }

    public static int e(boolean z10) {
        return 1;
    }

    public static int f(byte[] bArr) {
        return C(bArr.length);
    }

    public static int g(int i10, C9575h hVar) {
        return T(i10) + h(hVar);
    }

    public static int h(C9575h hVar) {
        return C(hVar.size());
    }

    public static int i(int i10, double d10) {
        return T(i10) + j(d10);
    }

    public static int j(double d10) {
        return 8;
    }

    public static int k(int i10, int i11) {
        return T(i10) + l(i11);
    }

    public static int l(int i10) {
        return w(i10);
    }

    public static int m(int i10, int i11) {
        return T(i10) + n(i11);
    }

    public static int n(int i10) {
        return 4;
    }

    public static int o(int i10, long j10) {
        return T(i10) + p(j10);
    }

    public static int p(long j10) {
        return 8;
    }

    public static int q(int i10, float f10) {
        return T(i10) + r(f10);
    }

    public static int r(float f10) {
        return 4;
    }

    @Deprecated
    static int s(int i10, S s10, h0 h0Var) {
        return (T(i10) * 2) + u(s10, h0Var);
    }

    @Deprecated
    public static int t(S s10) {
        return s10.getSerializedSize();
    }

    @Deprecated
    static int u(S s10, h0 h0Var) {
        return ((C9568a) s10).getSerializedSize(h0Var);
    }

    public static int v(int i10, int i11) {
        return T(i10) + w(i11);
    }

    public static int w(int i10) {
        return X((long) i10);
    }

    public static int x(int i10, long j10) {
        return T(i10) + y(j10);
    }

    public static int y(long j10) {
        return X(j10);
    }

    public static int z(int i10, E e10) {
        return (T(1) * 2) + U(2, i10) + A(3, e10);
    }

    public abstract void A0(int i10, int i11);

    public abstract void B0(int i10);

    public final void C0(int i10, long j10) {
        V0(i10, j10);
    }

    public final void D0(long j10) {
        W0(j10);
    }

    /* access modifiers changed from: package-private */
    public abstract void E0(int i10, S s10, h0 h0Var);

    public abstract void F0(S s10);

    public abstract void G0(int i10, S s10);

    public abstract void H0(int i10, C9575h hVar);

    public final void I0(int i10, int i11) {
        q0(i10, i11);
    }

    public final void J0(int i10) {
        r0(i10);
    }

    public final void K0(int i10, long j10) {
        s0(i10, j10);
    }

    public final void L0(long j10) {
        t0(j10);
    }

    public final void M0(int i10, int i11) {
        T0(i10, Y(i11));
    }

    public final void N0(int i10) {
        U0(Y(i10));
    }

    public final void O0(int i10, long j10) {
        V0(i10, Z(j10));
    }

    public final void P0(long j10) {
        W0(Z(j10));
    }

    public abstract void Q0(int i10, String str);

    public abstract void R0(String str);

    public abstract void S0(int i10, int i11);

    public abstract void T0(int i10, int i11);

    public abstract void U0(int i10);

    public abstract void V0(int i10, long j10);

    public abstract void W0(long j10);

    public abstract void a(byte[] bArr, int i10, int i11);

    /* access modifiers changed from: package-private */
    public final void a0(String str, t0.d dVar) {
        f69321c.log(Level.WARNING, "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", dVar);
        byte[] bytes = str.getBytes(C9592z.f69430b);
        try {
            U0(bytes.length);
            a(bytes, 0, bytes.length);
        } catch (IndexOutOfBoundsException e10) {
            throw new c(e10);
        }
    }

    /* access modifiers changed from: package-private */
    public boolean b0() {
        return this.f69324b;
    }

    public final void c() {
        if (e0() != 0) {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
    }

    public abstract int e0();

    public abstract void f0(byte b10);

    public abstract void g0(int i10, boolean z10);

    public final void h0(boolean z10) {
        f0(z10 ? (byte) 1 : 0);
    }

    public final void i0(byte[] bArr) {
        j0(bArr, 0, bArr.length);
    }

    /* access modifiers changed from: package-private */
    public abstract void j0(byte[] bArr, int i10, int i11);

    public abstract void k0(int i10, C9575h hVar);

    public abstract void l0(C9575h hVar);

    public final void m0(int i10, double d10) {
        s0(i10, Double.doubleToRawLongBits(d10));
    }

    public final void n0(double d10) {
        t0(Double.doubleToRawLongBits(d10));
    }

    public final void o0(int i10, int i11) {
        A0(i10, i11);
    }

    public final void p0(int i10) {
        B0(i10);
    }

    public abstract void q0(int i10, int i11);

    public abstract void r0(int i10);

    public abstract void s0(int i10, long j10);

    public abstract void t0(long j10);

    public final void u0(int i10, float f10) {
        q0(i10, Float.floatToRawIntBits(f10));
    }

    public final void v0(float f10) {
        r0(Float.floatToRawIntBits(f10));
    }

    @Deprecated
    public final void w0(int i10, S s10) {
        S0(i10, 3);
        y0(s10);
        S0(i10, 4);
    }

    /* access modifiers changed from: package-private */
    @Deprecated
    public final void x0(int i10, S s10, h0 h0Var) {
        S0(i10, 3);
        z0(s10, h0Var);
        S0(i10, 4);
    }

    @Deprecated
    public final void y0(S s10) {
        s10.writeTo(this);
    }

    /* access modifiers changed from: package-private */
    @Deprecated
    public final void z0(S s10, h0 h0Var) {
        h0Var.d(s10, this.f69323a);
    }

    private C9578k() {
    }
}
