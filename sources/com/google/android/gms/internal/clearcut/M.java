package com.google.android.gms.internal.clearcut;

import java.io.IOException;
import java.nio.BufferOverflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.logging.Level;
import java.util.logging.Logger;

public abstract class M extends C7241z {

    /* renamed from: b  reason: collision with root package name */
    private static final Logger f48208b = Logger.getLogger(M.class.getName());
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public static final boolean f48209c = C1.x();

    /* renamed from: a  reason: collision with root package name */
    O f48210a;

    static class a extends M {

        /* renamed from: d  reason: collision with root package name */
        private final byte[] f48211d;

        /* renamed from: e  reason: collision with root package name */
        private final int f48212e;

        /* renamed from: f  reason: collision with root package name */
        private final int f48213f;

        /* renamed from: g  reason: collision with root package name */
        private int f48214g;

        a(byte[] bArr, int i10, int i11) {
            super();
            if (bArr != null) {
                int i12 = i10 + i11;
                if ((i10 | i11 | (bArr.length - i12)) >= 0) {
                    this.f48211d = bArr;
                    this.f48212e = i10;
                    this.f48214g = i10;
                    this.f48213f = i12;
                    return;
                }
                throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", new Object[]{Integer.valueOf(bArr.length), Integer.valueOf(i10), Integer.valueOf(i11)}));
            }
            throw new NullPointerException("buffer");
        }

        public final void A0(int i10) {
            try {
                byte[] bArr = this.f48211d;
                int i11 = this.f48214g;
                int i12 = i11 + 1;
                this.f48214g = i12;
                bArr[i11] = (byte) i10;
                int i13 = i11 + 2;
                this.f48214g = i13;
                bArr[i12] = (byte) (i10 >> 8);
                int i14 = i11 + 3;
                this.f48214g = i14;
                bArr[i13] = (byte) (i10 >> 16);
                this.f48214g = i11 + 4;
                bArr[i14] = i10 >> 24;
            } catch (IndexOutOfBoundsException e10) {
                throw new c(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f48214g), Integer.valueOf(this.f48213f), 1}), e10);
            }
        }

        public final void G(int i10, int i11) {
            y0((i10 << 3) | i11);
        }

        public final void I(int i10, A a10) {
            G(1, 3);
            b0(2, i10);
            m(3, a10);
            G(1, 4);
        }

        public final void J(int i10, M0 m02) {
            G(1, 3);
            b0(2, i10);
            n(3, m02);
            G(1, 4);
        }

        public final void K(int i10, boolean z10) {
            G(i10, 0);
            g(z10 ? (byte) 1 : 0);
        }

        public final int K0() {
            return this.f48214g - this.f48212e;
        }

        public final void L(long j10) {
            if (!M.f48209c || u() < 10) {
                while ((j10 & -128) != 0) {
                    byte[] bArr = this.f48211d;
                    int i10 = this.f48214g;
                    this.f48214g = i10 + 1;
                    bArr[i10] = (byte) ((((int) j10) & 127) | 128);
                    j10 >>>= 7;
                }
                try {
                    byte[] bArr2 = this.f48211d;
                    int i11 = this.f48214g;
                    this.f48214g = i11 + 1;
                    bArr2[i11] = (byte) ((int) j10);
                } catch (IndexOutOfBoundsException e10) {
                    throw new c(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f48214g), Integer.valueOf(this.f48213f), 1}), e10);
                }
            } else {
                while ((j10 & -128) != 0) {
                    byte[] bArr3 = this.f48211d;
                    int i12 = this.f48214g;
                    this.f48214g = i12 + 1;
                    C1.k(bArr3, (long) i12, (byte) ((((int) j10) & 127) | 128));
                    j10 >>>= 7;
                }
                byte[] bArr4 = this.f48211d;
                int i13 = this.f48214g;
                this.f48214g = i13 + 1;
                C1.k(bArr4, (long) i13, (byte) ((int) j10));
            }
        }

        public final void M(M0 m02) {
            y0(m02.y());
            m02.A(this);
        }

        public final void T(int i10, int i11) {
            G(i10, 0);
            x0(i11);
        }

        public final void U(int i10, long j10) {
            G(i10, 1);
            c0(j10);
        }

        public final void a(byte[] bArr, int i10, int i11) {
            c(bArr, i10, i11);
        }

        public void b() {
        }

        public final void b0(int i10, int i11) {
            G(i10, 0);
            y0(i11);
        }

        public final void c(byte[] bArr, int i10, int i11) {
            try {
                System.arraycopy(bArr, i10, this.f48211d, this.f48214g, i11);
                this.f48214g += i11;
            } catch (IndexOutOfBoundsException e10) {
                throw new c(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f48214g), Integer.valueOf(this.f48213f), Integer.valueOf(i11)}), e10);
            }
        }

        public final void c0(long j10) {
            try {
                byte[] bArr = this.f48211d;
                int i10 = this.f48214g;
                int i11 = i10 + 1;
                this.f48214g = i11;
                bArr[i10] = (byte) ((int) j10);
                int i12 = i10 + 2;
                this.f48214g = i12;
                bArr[i11] = (byte) ((int) (j10 >> 8));
                int i13 = i10 + 3;
                this.f48214g = i13;
                bArr[i12] = (byte) ((int) (j10 >> 16));
                int i14 = i10 + 4;
                this.f48214g = i14;
                bArr[i13] = (byte) ((int) (j10 >> 24));
                int i15 = i10 + 5;
                this.f48214g = i15;
                bArr[i14] = (byte) ((int) (j10 >> 32));
                int i16 = i10 + 6;
                this.f48214g = i16;
                bArr[i15] = (byte) ((int) (j10 >> 40));
                int i17 = i10 + 7;
                this.f48214g = i17;
                bArr[i16] = (byte) ((int) (j10 >> 48));
                this.f48214g = i10 + 8;
                bArr[i17] = (byte) ((int) (j10 >> 56));
            } catch (IndexOutOfBoundsException e10) {
                throw new c(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f48214g), Integer.valueOf(this.f48213f), 1}), e10);
            }
        }

        public final void g(byte b10) {
            try {
                byte[] bArr = this.f48211d;
                int i10 = this.f48214g;
                this.f48214g = i10 + 1;
                bArr[i10] = b10;
            } catch (IndexOutOfBoundsException e10) {
                throw new c(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f48214g), Integer.valueOf(this.f48213f), 1}), e10);
            }
        }

        public final void i0(int i10, int i11) {
            G(i10, 5);
            A0(i11);
        }

        public final void l(int i10, long j10) {
            G(i10, 0);
            L(j10);
        }

        public final void m(int i10, A a10) {
            G(i10, 2);
            q(a10);
        }

        public final void m0(String str) {
            int i10 = this.f48214g;
            try {
                int D02 = M.D0(str.length() * 3);
                int D03 = M.D0(str.length());
                if (D03 == D02) {
                    int i11 = i10 + D03;
                    this.f48214g = i11;
                    int b10 = E1.b(str, this.f48211d, i11, u());
                    this.f48214g = i10;
                    y0((b10 - i10) - D03);
                    this.f48214g = b10;
                    return;
                }
                y0(E1.a(str));
                this.f48214g = E1.b(str, this.f48211d, this.f48214g, u());
            } catch (H1 e10) {
                this.f48214g = i10;
                s(str, e10);
            } catch (IndexOutOfBoundsException e11) {
                throw new c((Throwable) e11);
            }
        }

        public final void n(int i10, M0 m02) {
            G(i10, 2);
            M(m02);
        }

        /* access modifiers changed from: package-private */
        public final void o(int i10, M0 m02, C7178d1 d1Var) {
            G(i10, 2);
            C7215q qVar = (C7215q) m02;
            int b10 = qVar.b();
            if (b10 == -1) {
                b10 = d1Var.i(qVar);
                qVar.a(b10);
            }
            y0(b10);
            d1Var.f(m02, this.f48210a);
        }

        public final void p(int i10, String str) {
            G(i10, 2);
            m0(str);
        }

        public final void q(A a10) {
            y0(a10.size());
            a10.k(this);
        }

        /* access modifiers changed from: package-private */
        public final void r(M0 m02, C7178d1 d1Var) {
            C7215q qVar = (C7215q) m02;
            int b10 = qVar.b();
            if (b10 == -1) {
                b10 = d1Var.i(qVar);
                qVar.a(b10);
            }
            y0(b10);
            d1Var.f(m02, this.f48210a);
        }

        public final int u() {
            return this.f48213f - this.f48214g;
        }

        public final void x0(int i10) {
            if (i10 >= 0) {
                y0(i10);
            } else {
                L((long) i10);
            }
        }

        public final void y0(int i10) {
            if (!M.f48209c || u() < 10) {
                while ((i10 & -128) != 0) {
                    byte[] bArr = this.f48211d;
                    int i11 = this.f48214g;
                    this.f48214g = i11 + 1;
                    bArr[i11] = (byte) ((i10 & 127) | 128);
                    i10 >>>= 7;
                }
                try {
                    byte[] bArr2 = this.f48211d;
                    int i12 = this.f48214g;
                    this.f48214g = i12 + 1;
                    bArr2[i12] = (byte) i10;
                } catch (IndexOutOfBoundsException e10) {
                    throw new c(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f48214g), Integer.valueOf(this.f48213f), 1}), e10);
                }
            } else {
                while ((i10 & -128) != 0) {
                    byte[] bArr3 = this.f48211d;
                    int i13 = this.f48214g;
                    this.f48214g = i13 + 1;
                    C1.k(bArr3, (long) i13, (byte) ((i10 & 127) | 128));
                    i10 >>>= 7;
                }
                byte[] bArr4 = this.f48211d;
                int i14 = this.f48214g;
                this.f48214g = i14 + 1;
                C1.k(bArr4, (long) i14, (byte) i10);
            }
        }
    }

    static final class b extends a {

        /* renamed from: h  reason: collision with root package name */
        private final ByteBuffer f48215h;

        /* renamed from: i  reason: collision with root package name */
        private int f48216i;

        b(ByteBuffer byteBuffer) {
            super(byteBuffer.array(), byteBuffer.arrayOffset() + byteBuffer.position(), byteBuffer.remaining());
            this.f48215h = byteBuffer;
            this.f48216i = byteBuffer.position();
        }

        public final void b() {
            this.f48215h.position(this.f48216i + K0());
        }
    }

    public static class c extends IOException {
        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        c(java.lang.String r3) {
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
                r2.<init>(r3)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.clearcut.M.c.<init>(java.lang.String):void");
        }

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        c(java.lang.String r3, java.lang.Throwable r4) {
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
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.clearcut.M.c.<init>(java.lang.String, java.lang.Throwable):void");
        }

        c(Throwable th2) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.", th2);
        }
    }

    static final class d extends M {

        /* renamed from: d  reason: collision with root package name */
        private final ByteBuffer f48217d;

        /* renamed from: e  reason: collision with root package name */
        private final ByteBuffer f48218e;

        /* renamed from: f  reason: collision with root package name */
        private final int f48219f;

        d(ByteBuffer byteBuffer) {
            super();
            this.f48217d = byteBuffer;
            this.f48218e = byteBuffer.duplicate().order(ByteOrder.LITTLE_ENDIAN);
            this.f48219f = byteBuffer.position();
        }

        private final void K0(String str) {
            try {
                E1.c(str, this.f48218e);
            } catch (IndexOutOfBoundsException e10) {
                throw new c((Throwable) e10);
            }
        }

        public final void A0(int i10) {
            try {
                this.f48218e.putInt(i10);
            } catch (BufferOverflowException e10) {
                throw new c((Throwable) e10);
            }
        }

        public final void G(int i10, int i11) {
            y0((i10 << 3) | i11);
        }

        public final void I(int i10, A a10) {
            G(1, 3);
            b0(2, i10);
            m(3, a10);
            G(1, 4);
        }

        public final void J(int i10, M0 m02) {
            G(1, 3);
            b0(2, i10);
            n(3, m02);
            G(1, 4);
        }

        public final void K(int i10, boolean z10) {
            G(i10, 0);
            g(z10 ? (byte) 1 : 0);
        }

        public final void L(long j10) {
            while ((-128 & j10) != 0) {
                this.f48218e.put((byte) ((((int) j10) & 127) | 128));
                j10 >>>= 7;
            }
            try {
                this.f48218e.put((byte) ((int) j10));
            } catch (BufferOverflowException e10) {
                throw new c((Throwable) e10);
            }
        }

        public final void M(M0 m02) {
            y0(m02.y());
            m02.A(this);
        }

        public final void T(int i10, int i11) {
            G(i10, 0);
            x0(i11);
        }

        public final void U(int i10, long j10) {
            G(i10, 1);
            c0(j10);
        }

        public final void a(byte[] bArr, int i10, int i11) {
            c(bArr, i10, i11);
        }

        public final void b() {
            this.f48217d.position(this.f48218e.position());
        }

        public final void b0(int i10, int i11) {
            G(i10, 0);
            y0(i11);
        }

        public final void c(byte[] bArr, int i10, int i11) {
            try {
                this.f48218e.put(bArr, i10, i11);
            } catch (IndexOutOfBoundsException e10) {
                throw new c((Throwable) e10);
            } catch (BufferOverflowException e11) {
                throw new c((Throwable) e11);
            }
        }

        public final void c0(long j10) {
            try {
                this.f48218e.putLong(j10);
            } catch (BufferOverflowException e10) {
                throw new c((Throwable) e10);
            }
        }

        public final void g(byte b10) {
            try {
                this.f48218e.put(b10);
            } catch (BufferOverflowException e10) {
                throw new c((Throwable) e10);
            }
        }

        public final void i0(int i10, int i11) {
            G(i10, 5);
            A0(i11);
        }

        public final void l(int i10, long j10) {
            G(i10, 0);
            L(j10);
        }

        public final void m(int i10, A a10) {
            G(i10, 2);
            q(a10);
        }

        public final void m0(String str) {
            int position = this.f48218e.position();
            try {
                int D02 = M.D0(str.length() * 3);
                int D03 = M.D0(str.length());
                if (D03 == D02) {
                    int position2 = this.f48218e.position() + D03;
                    this.f48218e.position(position2);
                    K0(str);
                    int position3 = this.f48218e.position();
                    this.f48218e.position(position);
                    y0(position3 - position2);
                    this.f48218e.position(position3);
                    return;
                }
                y0(E1.a(str));
                K0(str);
            } catch (H1 e10) {
                this.f48218e.position(position);
                s(str, e10);
            } catch (IllegalArgumentException e11) {
                throw new c((Throwable) e11);
            }
        }

        public final void n(int i10, M0 m02) {
            G(i10, 2);
            M(m02);
        }

        /* access modifiers changed from: package-private */
        public final void o(int i10, M0 m02, C7178d1 d1Var) {
            G(i10, 2);
            r(m02, d1Var);
        }

        public final void p(int i10, String str) {
            G(i10, 2);
            m0(str);
        }

        public final void q(A a10) {
            y0(a10.size());
            a10.k(this);
        }

        /* access modifiers changed from: package-private */
        public final void r(M0 m02, C7178d1 d1Var) {
            C7215q qVar = (C7215q) m02;
            int b10 = qVar.b();
            if (b10 == -1) {
                b10 = d1Var.i(qVar);
                qVar.a(b10);
            }
            y0(b10);
            d1Var.f(m02, this.f48210a);
        }

        public final int u() {
            return this.f48218e.remaining();
        }

        public final void x0(int i10) {
            if (i10 >= 0) {
                y0(i10);
            } else {
                L((long) i10);
            }
        }

        public final void y0(int i10) {
            while ((i10 & -128) != 0) {
                this.f48218e.put((byte) ((i10 & 127) | 128));
                i10 >>>= 7;
            }
            try {
                this.f48218e.put((byte) i10);
            } catch (BufferOverflowException e10) {
                throw new c((Throwable) e10);
            }
        }
    }

    static final class e extends M {

        /* renamed from: d  reason: collision with root package name */
        private final ByteBuffer f48220d;

        /* renamed from: e  reason: collision with root package name */
        private final ByteBuffer f48221e;

        /* renamed from: f  reason: collision with root package name */
        private final long f48222f;

        /* renamed from: g  reason: collision with root package name */
        private final long f48223g;

        /* renamed from: h  reason: collision with root package name */
        private final long f48224h;

        /* renamed from: i  reason: collision with root package name */
        private final long f48225i;

        /* renamed from: j  reason: collision with root package name */
        private long f48226j;

        e(ByteBuffer byteBuffer) {
            super();
            this.f48220d = byteBuffer;
            this.f48221e = byteBuffer.duplicate().order(ByteOrder.LITTLE_ENDIAN);
            long o10 = C1.o(byteBuffer);
            this.f48222f = o10;
            long position = ((long) byteBuffer.position()) + o10;
            this.f48223g = position;
            long limit = o10 + ((long) byteBuffer.limit());
            this.f48224h = limit;
            this.f48225i = limit - 10;
            this.f48226j = position;
        }

        private final void K0(long j10) {
            this.f48221e.position((int) (j10 - this.f48222f));
        }

        public final void A0(int i10) {
            this.f48221e.putInt((int) (this.f48226j - this.f48222f), i10);
            this.f48226j += 4;
        }

        public final void G(int i10, int i11) {
            y0((i10 << 3) | i11);
        }

        public final void I(int i10, A a10) {
            G(1, 3);
            b0(2, i10);
            m(3, a10);
            G(1, 4);
        }

        public final void J(int i10, M0 m02) {
            G(1, 3);
            b0(2, i10);
            n(3, m02);
            G(1, 4);
        }

        public final void K(int i10, boolean z10) {
            G(i10, 0);
            g(z10 ? (byte) 1 : 0);
        }

        public final void L(long j10) {
            if (this.f48226j <= this.f48225i) {
                while ((j10 & -128) != 0) {
                    long j11 = this.f48226j;
                    this.f48226j = j11 + 1;
                    C1.c(j11, (byte) ((((int) j10) & 127) | 128));
                    j10 >>>= 7;
                }
                long j12 = this.f48226j;
                this.f48226j = 1 + j12;
                C1.c(j12, (byte) ((int) j10));
                return;
            }
            while (true) {
                long j13 = this.f48226j;
                if (j13 >= this.f48224h) {
                    throw new c(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Long.valueOf(this.f48226j), Long.valueOf(this.f48224h), 1}));
                } else if ((j10 & -128) == 0) {
                    this.f48226j = 1 + j13;
                    C1.c(j13, (byte) ((int) j10));
                    return;
                } else {
                    this.f48226j = j13 + 1;
                    C1.c(j13, (byte) ((((int) j10) & 127) | 128));
                    j10 >>>= 7;
                }
            }
        }

        public final void M(M0 m02) {
            y0(m02.y());
            m02.A(this);
        }

        public final void T(int i10, int i11) {
            G(i10, 0);
            x0(i11);
        }

        public final void U(int i10, long j10) {
            G(i10, 1);
            c0(j10);
        }

        public final void a(byte[] bArr, int i10, int i11) {
            c(bArr, i10, i11);
        }

        public final void b() {
            this.f48220d.position((int) (this.f48226j - this.f48222f));
        }

        public final void b0(int i10, int i11) {
            G(i10, 0);
            y0(i11);
        }

        public final void c(byte[] bArr, int i10, int i11) {
            if (bArr != null && i10 >= 0 && i11 >= 0 && bArr.length - i11 >= i10) {
                long j10 = (long) i11;
                long j11 = this.f48226j;
                if (this.f48224h - j10 >= j11) {
                    C1.l(bArr, (long) i10, j11, j10);
                    this.f48226j += j10;
                    return;
                }
            }
            if (bArr == null) {
                throw new NullPointerException("value");
            }
            throw new c(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Long.valueOf(this.f48226j), Long.valueOf(this.f48224h), Integer.valueOf(i11)}));
        }

        public final void c0(long j10) {
            this.f48221e.putLong((int) (this.f48226j - this.f48222f), j10);
            this.f48226j += 8;
        }

        public final void g(byte b10) {
            long j10 = this.f48226j;
            if (j10 < this.f48224h) {
                this.f48226j = 1 + j10;
                C1.c(j10, b10);
                return;
            }
            throw new c(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Long.valueOf(this.f48226j), Long.valueOf(this.f48224h), 1}));
        }

        public final void i0(int i10, int i11) {
            G(i10, 5);
            A0(i11);
        }

        public final void l(int i10, long j10) {
            G(i10, 0);
            L(j10);
        }

        public final void m(int i10, A a10) {
            G(i10, 2);
            q(a10);
        }

        public final void m0(String str) {
            long j10 = this.f48226j;
            try {
                int D02 = M.D0(str.length() * 3);
                int D03 = M.D0(str.length());
                if (D03 == D02) {
                    int i10 = ((int) (this.f48226j - this.f48222f)) + D03;
                    this.f48221e.position(i10);
                    E1.c(str, this.f48221e);
                    int position = this.f48221e.position() - i10;
                    y0(position);
                    this.f48226j += (long) position;
                    return;
                }
                int a10 = E1.a(str);
                y0(a10);
                K0(this.f48226j);
                E1.c(str, this.f48221e);
                this.f48226j += (long) a10;
            } catch (H1 e10) {
                this.f48226j = j10;
                K0(j10);
                s(str, e10);
            } catch (IllegalArgumentException e11) {
                throw new c((Throwable) e11);
            } catch (IndexOutOfBoundsException e12) {
                throw new c((Throwable) e12);
            }
        }

        public final void n(int i10, M0 m02) {
            G(i10, 2);
            M(m02);
        }

        /* access modifiers changed from: package-private */
        public final void o(int i10, M0 m02, C7178d1 d1Var) {
            G(i10, 2);
            r(m02, d1Var);
        }

        public final void p(int i10, String str) {
            G(i10, 2);
            m0(str);
        }

        public final void q(A a10) {
            y0(a10.size());
            a10.k(this);
        }

        /* access modifiers changed from: package-private */
        public final void r(M0 m02, C7178d1 d1Var) {
            C7215q qVar = (C7215q) m02;
            int b10 = qVar.b();
            if (b10 == -1) {
                b10 = d1Var.i(qVar);
                qVar.a(b10);
            }
            y0(b10);
            d1Var.f(m02, this.f48210a);
        }

        public final int u() {
            return (int) (this.f48224h - this.f48226j);
        }

        public final void x0(int i10) {
            if (i10 >= 0) {
                y0(i10);
            } else {
                L((long) i10);
            }
        }

        public final void y0(int i10) {
            long j10;
            if (this.f48226j <= this.f48225i) {
                while (true) {
                    int i11 = i10 & -128;
                    j10 = this.f48226j;
                    if (i11 == 0) {
                        break;
                    }
                    this.f48226j = j10 + 1;
                    C1.c(j10, (byte) ((i10 & 127) | 128));
                    i10 >>>= 7;
                }
            } else {
                while (true) {
                    j10 = this.f48226j;
                    if (j10 >= this.f48224h) {
                        throw new c(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Long.valueOf(this.f48226j), Long.valueOf(this.f48224h), 1}));
                    } else if ((i10 & -128) == 0) {
                        break;
                    } else {
                        this.f48226j = j10 + 1;
                        C1.c(j10, (byte) ((i10 & 127) | 128));
                        i10 >>>= 7;
                    }
                }
            }
            this.f48226j = 1 + j10;
            C1.c(j10, (byte) i10);
        }
    }

    private M() {
    }

    public static int A(int i10, C7224t0 t0Var) {
        return (B0(1) << 1) + n0(2, i10) + d(3, t0Var);
    }

    static int B(int i10, M0 m02, C7178d1 d1Var) {
        return B0(i10) + E(m02, d1Var);
    }

    public static int B0(int i10) {
        return D0(i10 << 3);
    }

    public static int C(int i10, String str) {
        return B0(i10) + q0(str);
    }

    public static int C0(int i10) {
        if (i10 >= 0) {
            return D0(i10);
        }
        return 10;
    }

    public static int D(A a10) {
        int size = a10.size();
        return D0(size) + size;
    }

    public static int D0(int i10) {
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

    static int E(M0 m02, C7178d1 d1Var) {
        C7215q qVar = (C7215q) m02;
        int b10 = qVar.b();
        if (b10 == -1) {
            b10 = d1Var.i(qVar);
            qVar.a(b10);
        }
        return D0(b10) + b10;
    }

    public static int E0(int i10) {
        return D0(I0(i10));
    }

    public static int F(boolean z10) {
        return 1;
    }

    public static int F0(int i10) {
        return 4;
    }

    public static int G0(int i10) {
        return 4;
    }

    public static int H0(int i10) {
        return C0(i10);
    }

    private static int I0(int i10) {
        return (i10 >> 31) ^ (i10 << 1);
    }

    @Deprecated
    public static int J0(int i10) {
        return D0(i10);
    }

    public static int N(int i10, A a10) {
        int B02 = B0(i10);
        int size = a10.size();
        return B02 + D0(size) + size;
    }

    public static int O(int i10, M0 m02) {
        return B0(i10) + R(m02);
    }

    @Deprecated
    static int P(int i10, M0 m02, C7178d1 d1Var) {
        int B02 = B0(i10) << 1;
        C7215q qVar = (C7215q) m02;
        int b10 = qVar.b();
        if (b10 == -1) {
            b10 = d1Var.i(qVar);
            qVar.a(b10);
        }
        return B02 + b10;
    }

    public static int Q(int i10, boolean z10) {
        return B0(i10) + 1;
    }

    public static int R(M0 m02) {
        int y10 = m02.y();
        return D0(y10) + y10;
    }

    public static M S(byte[] bArr) {
        return new a(bArr, 0, bArr.length);
    }

    public static int W(int i10, long j10) {
        return B0(i10) + h0(j10);
    }

    public static int X(int i10, A a10) {
        return (B0(1) << 1) + n0(2, i10) + N(3, a10);
    }

    public static int Y(int i10, M0 m02) {
        return (B0(1) << 1) + n0(2, i10) + O(3, m02);
    }

    @Deprecated
    public static int Z(M0 m02) {
        return m02.y();
    }

    public static int a0(byte[] bArr) {
        int length = bArr.length;
        return D0(length) + length;
    }

    public static int d(int i10, C7224t0 t0Var) {
        int B02 = B0(i10);
        int a10 = t0Var.a();
        return B02 + D0(a10) + a10;
    }

    public static int d0(int i10, long j10) {
        return B0(i10) + h0(j10);
    }

    public static int e(C7224t0 t0Var) {
        int a10 = t0Var.a();
        return D0(a10) + a10;
    }

    public static int e0(long j10) {
        return h0(j10);
    }

    public static M f(ByteBuffer byteBuffer) {
        if (byteBuffer.hasArray()) {
            return new b(byteBuffer);
        }
        if (byteBuffer.isDirect() && !byteBuffer.isReadOnly()) {
            return C1.y() ? new e(byteBuffer) : new d(byteBuffer);
        }
        throw new IllegalArgumentException("ByteBuffer is read-only");
    }

    public static int g0(int i10, long j10) {
        return B0(i10) + h0(u0(j10));
    }

    public static int h0(long j10) {
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

    public static int j0(int i10, int i11) {
        return B0(i10) + C0(i11);
    }

    public static int k0(int i10, long j10) {
        return B0(i10) + 8;
    }

    public static int l0(long j10) {
        return h0(u0(j10));
    }

    public static int n0(int i10, int i11) {
        return B0(i10) + D0(i11);
    }

    public static int o0(int i10, long j10) {
        return B0(i10) + 8;
    }

    public static int p0(long j10) {
        return 8;
    }

    public static int q0(String str) {
        int i10;
        try {
            i10 = E1.a(str);
        } catch (H1 unused) {
            i10 = str.getBytes(C7192i0.f48408a).length;
        }
        return D0(i10) + i10;
    }

    public static int r0(int i10, int i11) {
        return B0(i10) + D0(I0(i11));
    }

    public static int s0(long j10) {
        return 8;
    }

    public static int t0(int i10, int i11) {
        return B0(i10) + 4;
    }

    private static long u0(long j10) {
        return (j10 >> 63) ^ (j10 << 1);
    }

    public static int v0(int i10, int i11) {
        return B0(i10) + 4;
    }

    public static int w(double d10) {
        return 8;
    }

    public static int w0(int i10, int i11) {
        return B0(i10) + C0(i11);
    }

    public static int x(float f10) {
        return 4;
    }

    public static int y(int i10, double d10) {
        return B0(i10) + 8;
    }

    public static int z(int i10, float f10) {
        return B0(i10) + 4;
    }

    public abstract void A0(int i10);

    public abstract void G(int i10, int i11);

    public final void H(int i10, long j10) {
        l(i10, u0(j10));
    }

    public abstract void I(int i10, A a10);

    public abstract void J(int i10, M0 m02);

    public abstract void K(int i10, boolean z10);

    public abstract void L(long j10);

    public abstract void M(M0 m02);

    public abstract void T(int i10, int i11);

    public abstract void U(int i10, long j10);

    public final void V(long j10) {
        L(u0(j10));
    }

    public abstract void b();

    public abstract void b0(int i10, int i11);

    public abstract void c(byte[] bArr, int i10, int i11);

    public abstract void c0(long j10);

    public final void f0(int i10, int i11) {
        b0(i10, I0(i11));
    }

    public abstract void g(byte b10);

    public final void h(double d10) {
        c0(Double.doubleToRawLongBits(d10));
    }

    public final void i(float f10) {
        A0(Float.floatToRawIntBits(f10));
    }

    public abstract void i0(int i10, int i11);

    public final void j(int i10, double d10) {
        U(i10, Double.doubleToRawLongBits(d10));
    }

    public final void k(int i10, float f10) {
        i0(i10, Float.floatToRawIntBits(f10));
    }

    public abstract void l(int i10, long j10);

    public abstract void m(int i10, A a10);

    public abstract void m0(String str);

    public abstract void n(int i10, M0 m02);

    /* access modifiers changed from: package-private */
    public abstract void o(int i10, M0 m02, C7178d1 d1Var);

    public abstract void p(int i10, String str);

    public abstract void q(A a10);

    /* access modifiers changed from: package-private */
    public abstract void r(M0 m02, C7178d1 d1Var);

    /* access modifiers changed from: package-private */
    public final void s(String str, H1 h12) {
        f48208b.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", h12);
        byte[] bytes = str.getBytes(C7192i0.f48408a);
        try {
            y0(bytes.length);
            a(bytes, 0, bytes.length);
        } catch (IndexOutOfBoundsException e10) {
            throw new c((Throwable) e10);
        } catch (c e11) {
            throw e11;
        }
    }

    public final void t(boolean z10) {
        g(z10 ? (byte) 1 : 0);
    }

    public abstract int u();

    public abstract void x0(int i10);

    public abstract void y0(int i10);

    public final void z0(int i10) {
        y0(I0(i10));
    }
}
