package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.s0;
import androidx.recyclerview.widget.RecyclerView;
import java.io.IOException;
import java.io.OutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: androidx.datastore.preferences.protobuf.j  reason: case insensitive filesystem */
public abstract class C5157j extends C5153f {

    /* renamed from: c  reason: collision with root package name */
    private static final Logger f21352c = Logger.getLogger(C5157j.class.getName());
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public static final boolean f21353d = r0.B();

    /* renamed from: a  reason: collision with root package name */
    C5158k f21354a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f21355b;

    /* renamed from: androidx.datastore.preferences.protobuf.j$b */
    private static abstract class b extends C5157j {

        /* renamed from: e  reason: collision with root package name */
        final byte[] f21356e;

        /* renamed from: f  reason: collision with root package name */
        final int f21357f;

        /* renamed from: g  reason: collision with root package name */
        int f21358g;

        /* renamed from: h  reason: collision with root package name */
        int f21359h;

        b(int i10) {
            super();
            if (i10 >= 0) {
                byte[] bArr = new byte[Math.max(i10, 20)];
                this.f21356e = bArr;
                this.f21357f = bArr.length;
                return;
            }
            throw new IllegalArgumentException("bufferSize must be >= 0");
        }

        /* access modifiers changed from: package-private */
        public final void a1(byte b10) {
            byte[] bArr = this.f21356e;
            int i10 = this.f21358g;
            this.f21358g = i10 + 1;
            bArr[i10] = b10;
            this.f21359h++;
        }

        /* access modifiers changed from: package-private */
        public final void b1(int i10) {
            byte[] bArr = this.f21356e;
            int i11 = this.f21358g;
            int i12 = i11 + 1;
            this.f21358g = i12;
            bArr[i11] = (byte) (i10 & 255);
            int i13 = i11 + 2;
            this.f21358g = i13;
            bArr[i12] = (byte) ((i10 >> 8) & 255);
            int i14 = i11 + 3;
            this.f21358g = i14;
            bArr[i13] = (byte) ((i10 >> 16) & 255);
            this.f21358g = i11 + 4;
            bArr[i14] = (byte) ((i10 >> 24) & 255);
            this.f21359h += 4;
        }

        /* access modifiers changed from: package-private */
        public final void c1(long j10) {
            byte[] bArr = this.f21356e;
            int i10 = this.f21358g;
            int i11 = i10 + 1;
            this.f21358g = i11;
            bArr[i10] = (byte) ((int) (j10 & 255));
            int i12 = i10 + 2;
            this.f21358g = i12;
            bArr[i11] = (byte) ((int) ((j10 >> 8) & 255));
            int i13 = i10 + 3;
            this.f21358g = i13;
            bArr[i12] = (byte) ((int) ((j10 >> 16) & 255));
            int i14 = i10 + 4;
            this.f21358g = i14;
            bArr[i13] = (byte) ((int) (255 & (j10 >> 24)));
            int i15 = i10 + 5;
            this.f21358g = i15;
            bArr[i14] = (byte) (((int) (j10 >> 32)) & 255);
            int i16 = i10 + 6;
            this.f21358g = i16;
            bArr[i15] = (byte) (((int) (j10 >> 40)) & 255);
            int i17 = i10 + 7;
            this.f21358g = i17;
            bArr[i16] = (byte) (((int) (j10 >> 48)) & 255);
            this.f21358g = i10 + 8;
            bArr[i17] = (byte) (((int) (j10 >> 56)) & 255);
            this.f21359h += 8;
        }

        /* access modifiers changed from: package-private */
        public final void d1(int i10) {
            if (i10 >= 0) {
                f1(i10);
            } else {
                g1((long) i10);
            }
        }

        /* access modifiers changed from: package-private */
        public final void e1(int i10, int i11) {
            f1(t0.c(i10, i11));
        }

        /* access modifiers changed from: package-private */
        public final void f1(int i10) {
            if (C5157j.f21353d) {
                long j10 = (long) this.f21358g;
                while ((i10 & -128) != 0) {
                    byte[] bArr = this.f21356e;
                    int i11 = this.f21358g;
                    this.f21358g = i11 + 1;
                    r0.H(bArr, (long) i11, (byte) ((i10 | 128) & 255));
                    i10 >>>= 7;
                }
                byte[] bArr2 = this.f21356e;
                int i12 = this.f21358g;
                this.f21358g = i12 + 1;
                r0.H(bArr2, (long) i12, (byte) i10);
                this.f21359h += (int) (((long) this.f21358g) - j10);
                return;
            }
            while ((i10 & -128) != 0) {
                byte[] bArr3 = this.f21356e;
                int i13 = this.f21358g;
                this.f21358g = i13 + 1;
                bArr3[i13] = (byte) ((i10 | 128) & 255);
                this.f21359h++;
                i10 >>>= 7;
            }
            byte[] bArr4 = this.f21356e;
            int i14 = this.f21358g;
            this.f21358g = i14 + 1;
            bArr4[i14] = (byte) i10;
            this.f21359h++;
        }

        /* access modifiers changed from: package-private */
        public final void g1(long j10) {
            if (C5157j.f21353d) {
                long j11 = (long) this.f21358g;
                while ((j10 & -128) != 0) {
                    byte[] bArr = this.f21356e;
                    int i10 = this.f21358g;
                    this.f21358g = i10 + 1;
                    r0.H(bArr, (long) i10, (byte) ((((int) j10) | 128) & 255));
                    j10 >>>= 7;
                }
                byte[] bArr2 = this.f21356e;
                int i11 = this.f21358g;
                this.f21358g = i11 + 1;
                r0.H(bArr2, (long) i11, (byte) ((int) j10));
                this.f21359h += (int) (((long) this.f21358g) - j11);
                return;
            }
            while ((j10 & -128) != 0) {
                byte[] bArr3 = this.f21356e;
                int i12 = this.f21358g;
                this.f21358g = i12 + 1;
                bArr3[i12] = (byte) ((((int) j10) | 128) & 255);
                this.f21359h++;
                j10 >>>= 7;
            }
            byte[] bArr4 = this.f21356e;
            int i13 = this.f21358g;
            this.f21358g = i13 + 1;
            bArr4[i13] = (byte) ((int) j10);
            this.f21359h++;
        }

        public final int h0() {
            throw new UnsupportedOperationException("spaceLeft() can only be called on CodedOutputStreams that are writing to a flat array or ByteBuffer.");
        }
    }

    /* renamed from: androidx.datastore.preferences.protobuf.j$c */
    private static class c extends C5157j {

        /* renamed from: e  reason: collision with root package name */
        private final byte[] f21360e;

        /* renamed from: f  reason: collision with root package name */
        private final int f21361f;

        /* renamed from: g  reason: collision with root package name */
        private final int f21362g;

        /* renamed from: h  reason: collision with root package name */
        private int f21363h;

        c(byte[] bArr, int i10, int i11) {
            super();
            if (bArr != null) {
                int i12 = i10 + i11;
                if ((i10 | i11 | (bArr.length - i12)) >= 0) {
                    this.f21360e = bArr;
                    this.f21361f = i10;
                    this.f21363h = i10;
                    this.f21362g = i12;
                    return;
                }
                throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", new Object[]{Integer.valueOf(bArr.length), Integer.valueOf(i10), Integer.valueOf(i11)}));
            }
            throw new NullPointerException("buffer");
        }

        public final void D0(int i10, int i11) {
            V0(i10, 0);
            E0(i11);
        }

        public final void E0(int i10) {
            if (i10 >= 0) {
                X0(i10);
            } else {
                Z0((long) i10);
            }
        }

        /* access modifiers changed from: package-private */
        public final void H0(int i10, S s10, h0 h0Var) {
            V0(i10, 2);
            X0(((C5148a) s10).d(h0Var));
            h0Var.j(s10, this.f21354a);
        }

        public final void I0(S s10) {
            X0(s10.getSerializedSize());
            s10.a(this);
        }

        public final void J0(int i10, S s10) {
            V0(1, 3);
            W0(2, i10);
            b1(3, s10);
            V0(1, 4);
        }

        public final void K0(int i10, C5154g gVar) {
            V0(1, 3);
            W0(2, i10);
            n0(3, gVar);
            V0(1, 4);
        }

        public final void T0(int i10, String str) {
            V0(i10, 2);
            U0(str);
        }

        public final void U0(String str) {
            int i10 = this.f21363h;
            try {
                int W10 = C5157j.W(str.length() * 3);
                int W11 = C5157j.W(str.length());
                if (W11 == W10) {
                    int i11 = i10 + W11;
                    this.f21363h = i11;
                    int b10 = s0.b(str, this.f21360e, i11, h0());
                    this.f21363h = i10;
                    X0((b10 - i10) - W11);
                    this.f21363h = b10;
                    return;
                }
                X0(s0.c(str));
                this.f21363h = s0.b(str, this.f21360e, this.f21363h, h0());
            } catch (s0.d e10) {
                this.f21363h = i10;
                c0(str, e10);
            } catch (IndexOutOfBoundsException e11) {
                throw new d(e11);
            }
        }

        public final void V0(int i10, int i11) {
            X0(t0.c(i10, i11));
        }

        public final void W0(int i10, int i11) {
            V0(i10, 0);
            X0(i11);
        }

        public final void X0(int i10) {
            while ((i10 & -128) != 0) {
                byte[] bArr = this.f21360e;
                int i11 = this.f21363h;
                this.f21363h = i11 + 1;
                bArr[i11] = (byte) ((i10 | 128) & 255);
                i10 >>>= 7;
            }
            try {
                byte[] bArr2 = this.f21360e;
                int i12 = this.f21363h;
                this.f21363h = i12 + 1;
                bArr2[i12] = (byte) i10;
            } catch (IndexOutOfBoundsException e10) {
                throw new d(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f21363h), Integer.valueOf(this.f21362g), 1}), e10);
            }
        }

        public final void Y0(int i10, long j10) {
            V0(i10, 0);
            Z0(j10);
        }

        public final void Z0(long j10) {
            if (!C5157j.f21353d || h0() < 10) {
                while ((j10 & -128) != 0) {
                    byte[] bArr = this.f21360e;
                    int i10 = this.f21363h;
                    this.f21363h = i10 + 1;
                    bArr[i10] = (byte) ((((int) j10) | 128) & 255);
                    j10 >>>= 7;
                }
                try {
                    byte[] bArr2 = this.f21360e;
                    int i11 = this.f21363h;
                    this.f21363h = i11 + 1;
                    bArr2[i11] = (byte) ((int) j10);
                } catch (IndexOutOfBoundsException e10) {
                    throw new d(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f21363h), Integer.valueOf(this.f21362g), 1}), e10);
                }
            } else {
                while ((j10 & -128) != 0) {
                    byte[] bArr3 = this.f21360e;
                    int i12 = this.f21363h;
                    this.f21363h = i12 + 1;
                    r0.H(bArr3, (long) i12, (byte) ((((int) j10) | 128) & 255));
                    j10 >>>= 7;
                }
                byte[] bArr4 = this.f21360e;
                int i13 = this.f21363h;
                this.f21363h = i13 + 1;
                r0.H(bArr4, (long) i13, (byte) ((int) j10));
            }
        }

        public final void a(byte[] bArr, int i10, int i11) {
            a1(bArr, i10, i11);
        }

        public final void a1(byte[] bArr, int i10, int i11) {
            try {
                System.arraycopy(bArr, i10, this.f21360e, this.f21363h, i11);
                this.f21363h += i11;
            } catch (IndexOutOfBoundsException e10) {
                throw new d(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f21363h), Integer.valueOf(this.f21362g), Integer.valueOf(i11)}), e10);
            }
        }

        public void b0() {
        }

        public final void b1(int i10, S s10) {
            V0(i10, 2);
            I0(s10);
        }

        public final int h0() {
            return this.f21362g - this.f21363h;
        }

        public final void i0(byte b10) {
            try {
                byte[] bArr = this.f21360e;
                int i10 = this.f21363h;
                this.f21363h = i10 + 1;
                bArr[i10] = b10;
            } catch (IndexOutOfBoundsException e10) {
                throw new d(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f21363h), Integer.valueOf(this.f21362g), 1}), e10);
            }
        }

        public final void j0(int i10, boolean z10) {
            V0(i10, 0);
            i0(z10 ? (byte) 1 : 0);
        }

        public final void m0(byte[] bArr, int i10, int i11) {
            X0(i11);
            a1(bArr, i10, i11);
        }

        public final void n0(int i10, C5154g gVar) {
            V0(i10, 2);
            o0(gVar);
        }

        public final void o0(C5154g gVar) {
            X0(gVar.size());
            gVar.I(this);
        }

        public final void t0(int i10, int i11) {
            V0(i10, 5);
            u0(i11);
        }

        public final void u0(int i10) {
            try {
                byte[] bArr = this.f21360e;
                int i11 = this.f21363h;
                int i12 = i11 + 1;
                this.f21363h = i12;
                bArr[i11] = (byte) (i10 & 255);
                int i13 = i11 + 2;
                this.f21363h = i13;
                bArr[i12] = (byte) ((i10 >> 8) & 255);
                int i14 = i11 + 3;
                this.f21363h = i14;
                bArr[i13] = (byte) ((i10 >> 16) & 255);
                this.f21363h = i11 + 4;
                bArr[i14] = (byte) ((i10 >> 24) & 255);
            } catch (IndexOutOfBoundsException e10) {
                throw new d(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f21363h), Integer.valueOf(this.f21362g), 1}), e10);
            }
        }

        public final void v0(int i10, long j10) {
            V0(i10, 1);
            w0(j10);
        }

        public final void w0(long j10) {
            try {
                byte[] bArr = this.f21360e;
                int i10 = this.f21363h;
                int i11 = i10 + 1;
                this.f21363h = i11;
                bArr[i10] = (byte) (((int) j10) & 255);
                int i12 = i10 + 2;
                this.f21363h = i12;
                bArr[i11] = (byte) (((int) (j10 >> 8)) & 255);
                int i13 = i10 + 3;
                this.f21363h = i13;
                bArr[i12] = (byte) (((int) (j10 >> 16)) & 255);
                int i14 = i10 + 4;
                this.f21363h = i14;
                bArr[i13] = (byte) (((int) (j10 >> 24)) & 255);
                int i15 = i10 + 5;
                this.f21363h = i15;
                bArr[i14] = (byte) (((int) (j10 >> 32)) & 255);
                int i16 = i10 + 6;
                this.f21363h = i16;
                bArr[i15] = (byte) (((int) (j10 >> 40)) & 255);
                int i17 = i10 + 7;
                this.f21363h = i17;
                bArr[i16] = (byte) (((int) (j10 >> 48)) & 255);
                this.f21363h = i10 + 8;
                bArr[i17] = (byte) (((int) (j10 >> 56)) & 255);
            } catch (IndexOutOfBoundsException e10) {
                throw new d(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f21363h), Integer.valueOf(this.f21362g), 1}), e10);
            }
        }
    }

    /* renamed from: androidx.datastore.preferences.protobuf.j$d */
    public static class d extends IOException {
        d(Throwable th2) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.", th2);
        }

        d(String str, Throwable th2) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.: " + str, th2);
        }
    }

    /* renamed from: androidx.datastore.preferences.protobuf.j$e */
    private static final class e extends b {

        /* renamed from: i  reason: collision with root package name */
        private final OutputStream f21364i;

        e(OutputStream outputStream, int i10) {
            super(i10);
            if (outputStream != null) {
                this.f21364i = outputStream;
                return;
            }
            throw new NullPointerException("out");
        }

        private void h1() {
            this.f21364i.write(this.f21356e, 0, this.f21358g);
            this.f21358g = 0;
        }

        private void i1(int i10) {
            if (this.f21357f - this.f21358g < i10) {
                h1();
            }
        }

        public void D0(int i10, int i11) {
            i1(20);
            e1(i10, 0);
            d1(i11);
        }

        public void E0(int i10) {
            if (i10 >= 0) {
                X0(i10);
            } else {
                Z0((long) i10);
            }
        }

        /* access modifiers changed from: package-private */
        public void H0(int i10, S s10, h0 h0Var) {
            V0(i10, 2);
            l1(s10, h0Var);
        }

        public void I0(S s10) {
            X0(s10.getSerializedSize());
            s10.a(this);
        }

        public void J0(int i10, S s10) {
            V0(1, 3);
            W0(2, i10);
            k1(3, s10);
            V0(1, 4);
        }

        public void K0(int i10, C5154g gVar) {
            V0(1, 3);
            W0(2, i10);
            n0(3, gVar);
            V0(1, 4);
        }

        public void T0(int i10, String str) {
            V0(i10, 2);
            U0(str);
        }

        public void U0(String str) {
            int i10;
            int i11;
            try {
                int length = str.length() * 3;
                int W10 = C5157j.W(length);
                int i12 = W10 + length;
                int i13 = this.f21357f;
                if (i12 > i13) {
                    byte[] bArr = new byte[length];
                    int b10 = s0.b(str, bArr, 0, length);
                    X0(b10);
                    a(bArr, 0, b10);
                    return;
                }
                if (i12 > i13 - this.f21358g) {
                    h1();
                }
                int W11 = C5157j.W(str.length());
                i10 = this.f21358g;
                if (W11 == W10) {
                    int i14 = i10 + W11;
                    this.f21358g = i14;
                    int b11 = s0.b(str, this.f21356e, i14, this.f21357f - i14);
                    this.f21358g = i10;
                    i11 = (b11 - i10) - W11;
                    f1(i11);
                    this.f21358g = b11;
                } else {
                    i11 = s0.c(str);
                    f1(i11);
                    this.f21358g = s0.b(str, this.f21356e, this.f21358g, i11);
                }
                this.f21359h += i11;
            } catch (s0.d e10) {
                this.f21359h -= this.f21358g - i10;
                this.f21358g = i10;
                throw e10;
            } catch (ArrayIndexOutOfBoundsException e11) {
                throw new d(e11);
            } catch (s0.d e12) {
                c0(str, e12);
            }
        }

        public void V0(int i10, int i11) {
            X0(t0.c(i10, i11));
        }

        public void W0(int i10, int i11) {
            i1(20);
            e1(i10, 0);
            f1(i11);
        }

        public void X0(int i10) {
            i1(5);
            f1(i10);
        }

        public void Y0(int i10, long j10) {
            i1(20);
            e1(i10, 0);
            g1(j10);
        }

        public void Z0(long j10) {
            i1(10);
            g1(j10);
        }

        public void a(byte[] bArr, int i10, int i11) {
            j1(bArr, i10, i11);
        }

        public void b0() {
            if (this.f21358g > 0) {
                h1();
            }
        }

        public void i0(byte b10) {
            if (this.f21358g == this.f21357f) {
                h1();
            }
            a1(b10);
        }

        public void j0(int i10, boolean z10) {
            i1(11);
            e1(i10, 0);
            a1(z10 ? (byte) 1 : 0);
        }

        public void j1(byte[] bArr, int i10, int i11) {
            int i12 = this.f21357f;
            int i13 = this.f21358g;
            if (i12 - i13 >= i11) {
                System.arraycopy(bArr, i10, this.f21356e, i13, i11);
                this.f21358g += i11;
                this.f21359h += i11;
                return;
            }
            int i14 = i12 - i13;
            System.arraycopy(bArr, i10, this.f21356e, i13, i14);
            int i15 = i10 + i14;
            int i16 = i11 - i14;
            this.f21358g = this.f21357f;
            this.f21359h += i14;
            h1();
            if (i16 <= this.f21357f) {
                System.arraycopy(bArr, i15, this.f21356e, 0, i16);
                this.f21358g = i16;
            } else {
                this.f21364i.write(bArr, i15, i16);
            }
            this.f21359h += i16;
        }

        public void k1(int i10, S s10) {
            V0(i10, 2);
            I0(s10);
        }

        /* access modifiers changed from: package-private */
        public void l1(S s10, h0 h0Var) {
            X0(((C5148a) s10).d(h0Var));
            h0Var.j(s10, this.f21354a);
        }

        public void m0(byte[] bArr, int i10, int i11) {
            X0(i11);
            j1(bArr, i10, i11);
        }

        public void n0(int i10, C5154g gVar) {
            V0(i10, 2);
            o0(gVar);
        }

        public void o0(C5154g gVar) {
            X0(gVar.size());
            gVar.I(this);
        }

        public void t0(int i10, int i11) {
            i1(14);
            e1(i10, 5);
            b1(i11);
        }

        public void u0(int i10) {
            i1(4);
            b1(i10);
        }

        public void v0(int i10, long j10) {
            i1(18);
            e1(i10, 1);
            c1(j10);
        }

        public void w0(long j10) {
            i1(8);
            c1(j10);
        }
    }

    public static int A(int i10, D d10) {
        return U(i10) + B(d10);
    }

    public static int B(D d10) {
        return C(d10.b());
    }

    static int C(int i10) {
        return W(i10) + i10;
    }

    public static int D(int i10, S s10) {
        return (U(1) * 2) + V(2, i10) + E(3, s10);
    }

    public static int E(int i10, S s10) {
        return U(i10) + G(s10);
    }

    static int F(int i10, S s10, h0 h0Var) {
        return U(i10) + H(s10, h0Var);
    }

    public static int G(S s10) {
        return C(s10.getSerializedSize());
    }

    static int H(S s10, h0 h0Var) {
        return C(((C5148a) s10).d(h0Var));
    }

    static int I(int i10) {
        return i10 > 4096 ? RecyclerView.n.FLAG_APPEARED_IN_PRE_LAYOUT : i10;
    }

    public static int J(int i10, C5154g gVar) {
        return (U(1) * 2) + V(2, i10) + g(3, gVar);
    }

    public static int K(int i10, int i11) {
        return U(i10) + L(i11);
    }

    public static int L(int i10) {
        return 4;
    }

    public static int M(int i10, long j10) {
        return U(i10) + N(j10);
    }

    public static int N(long j10) {
        return 8;
    }

    public static int O(int i10, int i11) {
        return U(i10) + P(i11);
    }

    public static int P(int i10) {
        return W(Z(i10));
    }

    public static int Q(int i10, long j10) {
        return U(i10) + R(j10);
    }

    public static int R(long j10) {
        return Y(a0(j10));
    }

    public static int S(int i10, String str) {
        return U(i10) + T(str);
    }

    public static int T(String str) {
        int i10;
        try {
            i10 = s0.c(str);
        } catch (s0.d unused) {
            i10 = str.getBytes(C5172z.f21469b).length;
        }
        return C(i10);
    }

    public static int U(int i10) {
        return W(t0.c(i10, 0));
    }

    public static int V(int i10, int i11) {
        return U(i10) + W(i11);
    }

    public static int W(int i10) {
        return (352 - (Integer.numberOfLeadingZeros(i10) * 9)) >>> 6;
    }

    public static int X(int i10, long j10) {
        return U(i10) + Y(j10);
    }

    public static int Y(long j10) {
        return (640 - (Long.numberOfLeadingZeros(j10) * 9)) >>> 6;
    }

    public static int Z(int i10) {
        return (i10 >> 31) ^ (i10 << 1);
    }

    public static long a0(long j10) {
        return (j10 >> 63) ^ (j10 << 1);
    }

    public static int d(int i10, boolean z10) {
        return U(i10) + e(z10);
    }

    public static int e(boolean z10) {
        return 1;
    }

    public static C5157j e0(OutputStream outputStream, int i10) {
        return new e(outputStream, i10);
    }

    public static int f(byte[] bArr) {
        return C(bArr.length);
    }

    public static C5157j f0(byte[] bArr) {
        return g0(bArr, 0, bArr.length);
    }

    public static int g(int i10, C5154g gVar) {
        return U(i10) + h(gVar);
    }

    public static C5157j g0(byte[] bArr, int i10, int i11) {
        return new c(bArr, i10, i11);
    }

    public static int h(C5154g gVar) {
        return C(gVar.size());
    }

    public static int i(int i10, double d10) {
        return U(i10) + j(d10);
    }

    public static int j(double d10) {
        return 8;
    }

    public static int k(int i10, int i11) {
        return U(i10) + l(i11);
    }

    public static int l(int i10) {
        return w(i10);
    }

    public static int m(int i10, int i11) {
        return U(i10) + n(i11);
    }

    public static int n(int i10) {
        return 4;
    }

    public static int o(int i10, long j10) {
        return U(i10) + p(j10);
    }

    public static int p(long j10) {
        return 8;
    }

    public static int q(int i10, float f10) {
        return U(i10) + r(f10);
    }

    public static int r(float f10) {
        return 4;
    }

    @Deprecated
    static int s(int i10, S s10, h0 h0Var) {
        return (U(i10) * 2) + u(s10, h0Var);
    }

    @Deprecated
    public static int t(S s10) {
        return s10.getSerializedSize();
    }

    @Deprecated
    static int u(S s10, h0 h0Var) {
        return ((C5148a) s10).d(h0Var);
    }

    public static int v(int i10, int i11) {
        return U(i10) + w(i11);
    }

    public static int w(int i10) {
        return Y((long) i10);
    }

    public static int x(int i10, long j10) {
        return U(i10) + y(j10);
    }

    public static int y(long j10) {
        return Y(j10);
    }

    public static int z(int i10, D d10) {
        return (U(1) * 2) + V(2, i10) + A(3, d10);
    }

    /* access modifiers changed from: package-private */
    @Deprecated
    public final void A0(int i10, S s10, h0 h0Var) {
        V0(i10, 3);
        C0(s10, h0Var);
        V0(i10, 4);
    }

    @Deprecated
    public final void B0(S s10) {
        s10.a(this);
    }

    /* access modifiers changed from: package-private */
    @Deprecated
    public final void C0(S s10, h0 h0Var) {
        h0Var.j(s10, this.f21354a);
    }

    public abstract void D0(int i10, int i11);

    public abstract void E0(int i10);

    public final void F0(int i10, long j10) {
        Y0(i10, j10);
    }

    public final void G0(long j10) {
        Z0(j10);
    }

    /* access modifiers changed from: package-private */
    public abstract void H0(int i10, S s10, h0 h0Var);

    public abstract void I0(S s10);

    public abstract void J0(int i10, S s10);

    public abstract void K0(int i10, C5154g gVar);

    public final void L0(int i10, int i11) {
        t0(i10, i11);
    }

    public final void M0(int i10) {
        u0(i10);
    }

    public final void N0(int i10, long j10) {
        v0(i10, j10);
    }

    public final void O0(long j10) {
        w0(j10);
    }

    public final void P0(int i10, int i11) {
        W0(i10, Z(i11));
    }

    public final void Q0(int i10) {
        X0(Z(i10));
    }

    public final void R0(int i10, long j10) {
        Y0(i10, a0(j10));
    }

    public final void S0(long j10) {
        Z0(a0(j10));
    }

    public abstract void T0(int i10, String str);

    public abstract void U0(String str);

    public abstract void V0(int i10, int i11);

    public abstract void W0(int i10, int i11);

    public abstract void X0(int i10);

    public abstract void Y0(int i10, long j10);

    public abstract void Z0(long j10);

    public abstract void a(byte[] bArr, int i10, int i11);

    public abstract void b0();

    public final void c() {
        if (h0() != 0) {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
    }

    /* access modifiers changed from: package-private */
    public final void c0(String str, s0.d dVar) {
        f21352c.log(Level.WARNING, "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", dVar);
        byte[] bytes = str.getBytes(C5172z.f21469b);
        try {
            X0(bytes.length);
            a(bytes, 0, bytes.length);
        } catch (IndexOutOfBoundsException e10) {
            throw new d(e10);
        }
    }

    /* access modifiers changed from: package-private */
    public boolean d0() {
        return this.f21355b;
    }

    public abstract int h0();

    public abstract void i0(byte b10);

    public abstract void j0(int i10, boolean z10);

    public final void k0(boolean z10) {
        i0(z10 ? (byte) 1 : 0);
    }

    public final void l0(byte[] bArr) {
        m0(bArr, 0, bArr.length);
    }

    /* access modifiers changed from: package-private */
    public abstract void m0(byte[] bArr, int i10, int i11);

    public abstract void n0(int i10, C5154g gVar);

    public abstract void o0(C5154g gVar);

    public final void p0(int i10, double d10) {
        v0(i10, Double.doubleToRawLongBits(d10));
    }

    public final void q0(double d10) {
        w0(Double.doubleToRawLongBits(d10));
    }

    public final void r0(int i10, int i11) {
        D0(i10, i11);
    }

    public final void s0(int i10) {
        E0(i10);
    }

    public abstract void t0(int i10, int i11);

    public abstract void u0(int i10);

    public abstract void v0(int i10, long j10);

    public abstract void w0(long j10);

    public final void x0(int i10, float f10) {
        t0(i10, Float.floatToRawIntBits(f10));
    }

    public final void y0(float f10) {
        u0(Float.floatToRawIntBits(f10));
    }

    @Deprecated
    public final void z0(int i10, S s10) {
        V0(i10, 3);
        B0(s10);
        V0(i10, 4);
    }

    private C5157j() {
    }
}
