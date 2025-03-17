package t3;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import kb.C9970y;
import nb.C10072b;
import nb.C10076f;
import nb.C10079i;

public final class B {

    /* renamed from: d  reason: collision with root package name */
    private static final char[] f29438d = {13, 10};

    /* renamed from: e  reason: collision with root package name */
    private static final char[] f29439e = {10};

    /* renamed from: f  reason: collision with root package name */
    private static final C9970y<Charset> f29440f = C9970y.I(StandardCharsets.US_ASCII, StandardCharsets.UTF_8, StandardCharsets.UTF_16, StandardCharsets.UTF_16BE, StandardCharsets.UTF_16LE);

    /* renamed from: a  reason: collision with root package name */
    private byte[] f29441a;

    /* renamed from: b  reason: collision with root package name */
    private int f29442b;

    /* renamed from: c  reason: collision with root package name */
    private int f29443c;

    public B() {
        this.f29441a = N.f29467f;
    }

    private void Y(Charset charset) {
        if (m(charset, f29438d) == 13) {
            m(charset, f29439e);
        }
    }

    private int d(Charset charset) {
        int i10;
        if (charset.equals(StandardCharsets.UTF_8) || charset.equals(StandardCharsets.US_ASCII)) {
            i10 = 1;
        } else if (charset.equals(StandardCharsets.UTF_16) || charset.equals(StandardCharsets.UTF_16LE) || charset.equals(StandardCharsets.UTF_16BE)) {
            i10 = 2;
        } else {
            throw new IllegalArgumentException("Unsupported charset: " + charset);
        }
        int i11 = this.f29442b;
        while (true) {
            int i12 = this.f29443c;
            if (i11 >= i12 - (i10 - 1)) {
                return i12;
            }
            if ((charset.equals(StandardCharsets.UTF_8) || charset.equals(StandardCharsets.US_ASCII)) && N.G0(this.f29441a[i11])) {
                return i11;
            }
            if (charset.equals(StandardCharsets.UTF_16) || charset.equals(StandardCharsets.UTF_16BE)) {
                byte[] bArr = this.f29441a;
                if (bArr[i11] == 0 && N.G0(bArr[i11 + 1])) {
                    return i11;
                }
            }
            if (charset.equals(StandardCharsets.UTF_16LE)) {
                byte[] bArr2 = this.f29441a;
                if (bArr2[i11 + 1] == 0 && N.G0(bArr2[i11])) {
                    return i11;
                }
            }
            i11 += i10;
        }
    }

    private int i(Charset charset) {
        byte b10;
        char c10;
        int i10 = 1;
        if ((charset.equals(StandardCharsets.UTF_8) || charset.equals(StandardCharsets.US_ASCII)) && a() >= 1) {
            b10 = (byte) C10072b.a((long) C10079i.b(this.f29441a[this.f29442b]));
        } else {
            if ((charset.equals(StandardCharsets.UTF_16) || charset.equals(StandardCharsets.UTF_16BE)) && a() >= 2) {
                byte[] bArr = this.f29441a;
                int i11 = this.f29442b;
                c10 = C10072b.c(bArr[i11], bArr[i11 + 1]);
            } else if (!charset.equals(StandardCharsets.UTF_16LE) || a() < 2) {
                return 0;
            } else {
                byte[] bArr2 = this.f29441a;
                int i12 = this.f29442b;
                c10 = C10072b.c(bArr2[i12 + 1], bArr2[i12]);
            }
            b10 = (byte) c10;
            i10 = 2;
        }
        return (C10072b.a((long) b10) << 16) + i10;
    }

    private char m(Charset charset, char[] cArr) {
        int i10 = i(charset);
        if (i10 == 0) {
            return 0;
        }
        char c10 = (char) (i10 >> 16);
        if (!C10072b.b(cArr, c10)) {
            return 0;
        }
        this.f29442b += i10 & 65535;
        return c10;
    }

    public long A() {
        byte[] bArr = this.f29441a;
        int i10 = this.f29442b;
        int i11 = i10 + 1;
        this.f29442b = i11;
        int i12 = i10 + 2;
        this.f29442b = i12;
        int i13 = i10 + 3;
        this.f29442b = i13;
        long j10 = ((((long) bArr[i10]) & 255) << 56) | ((((long) bArr[i11]) & 255) << 48) | ((((long) bArr[i12]) & 255) << 40);
        int i14 = i10 + 4;
        this.f29442b = i14;
        int i15 = i10 + 5;
        this.f29442b = i15;
        long j11 = j10 | ((((long) bArr[i13]) & 255) << 32) | ((((long) bArr[i14]) & 255) << 24);
        int i16 = i10 + 6;
        this.f29442b = i16;
        int i17 = i10 + 7;
        this.f29442b = i17;
        this.f29442b = i10 + 8;
        return (((long) bArr[i17]) & 255) | j11 | ((((long) bArr[i15]) & 255) << 16) | ((((long) bArr[i16]) & 255) << 8);
    }

    public String B() {
        return n(0);
    }

    public String C(int i10) {
        if (i10 == 0) {
            return "";
        }
        int i11 = this.f29442b;
        int i12 = (i11 + i10) - 1;
        String I10 = N.I(this.f29441a, i11, (i12 >= this.f29443c || this.f29441a[i12] != 0) ? i10 : i10 - 1);
        this.f29442b += i10;
        return I10;
    }

    public short D() {
        byte[] bArr = this.f29441a;
        int i10 = this.f29442b;
        int i11 = i10 + 1;
        this.f29442b = i11;
        this.f29442b = i10 + 2;
        return (short) ((bArr[i11] & 255) | ((bArr[i10] & 255) << 8));
    }

    public String E(int i10) {
        return F(i10, StandardCharsets.UTF_8);
    }

    public String F(int i10, Charset charset) {
        String str = new String(this.f29441a, this.f29442b, i10, charset);
        this.f29442b += i10;
        return str;
    }

    public int G() {
        return (H() << 21) | (H() << 14) | (H() << 7) | H();
    }

    public int H() {
        byte[] bArr = this.f29441a;
        int i10 = this.f29442b;
        this.f29442b = i10 + 1;
        return bArr[i10] & 255;
    }

    public int I() {
        byte[] bArr = this.f29441a;
        int i10 = this.f29442b;
        int i11 = i10 + 1;
        this.f29442b = i11;
        this.f29442b = i10 + 2;
        byte b10 = (bArr[i11] & 255) | ((bArr[i10] & 255) << 8);
        this.f29442b = i10 + 4;
        return b10;
    }

    public long J() {
        byte[] bArr = this.f29441a;
        int i10 = this.f29442b;
        int i11 = i10 + 1;
        this.f29442b = i11;
        int i12 = i10 + 2;
        this.f29442b = i12;
        int i13 = i10 + 3;
        this.f29442b = i13;
        this.f29442b = i10 + 4;
        return (((long) bArr[i13]) & 255) | ((((long) bArr[i10]) & 255) << 24) | ((((long) bArr[i11]) & 255) << 16) | ((((long) bArr[i12]) & 255) << 8);
    }

    public int K() {
        byte[] bArr = this.f29441a;
        int i10 = this.f29442b;
        int i11 = i10 + 1;
        this.f29442b = i11;
        int i12 = i10 + 2;
        this.f29442b = i12;
        int i13 = (bArr[i11] & 255) << 8;
        this.f29442b = i10 + 3;
        return (bArr[i12] & 255) | i13 | ((bArr[i10] & 255) << 16);
    }

    public int L() {
        int q10 = q();
        if (q10 >= 0) {
            return q10;
        }
        throw new IllegalStateException("Top bit not zero: " + q10);
    }

    public int M() {
        return C10076f.d(N());
    }

    public long N() {
        int i10 = 0;
        long j10 = 0;
        while (i10 < 9) {
            if (this.f29442b != this.f29443c) {
                long H10 = (long) H();
                j10 |= (127 & H10) << (i10 * 7);
                if ((H10 & 128) == 0) {
                    break;
                }
                i10++;
            } else {
                throw new IllegalStateException("Attempting to read a byte over the limit.");
            }
        }
        return j10;
    }

    public long O() {
        long A10 = A();
        if (A10 >= 0) {
            return A10;
        }
        throw new IllegalStateException("Top bit not zero: " + A10);
    }

    public int P() {
        byte[] bArr = this.f29441a;
        int i10 = this.f29442b;
        int i11 = i10 + 1;
        this.f29442b = i11;
        this.f29442b = i10 + 2;
        return (bArr[i11] & 255) | ((bArr[i10] & 255) << 8);
    }

    public long Q() {
        int i10;
        int i11;
        long j10 = (long) this.f29441a[this.f29442b];
        int i12 = 7;
        while (true) {
            i10 = 1;
            if (i12 < 0) {
                break;
            }
            int i13 = 1 << i12;
            if ((((long) i13) & j10) != 0) {
                i12--;
            } else if (i12 < 6) {
                j10 &= (long) (i13 - 1);
                i11 = 7 - i12;
            } else if (i12 == 7) {
                i11 = 1;
            }
        }
        i11 = 0;
        if (i11 != 0) {
            while (i10 < i11) {
                byte b10 = this.f29441a[this.f29442b + i10];
                if ((b10 & 192) == 128) {
                    j10 = (j10 << 6) | ((long) (b10 & 63));
                    i10++;
                } else {
                    throw new NumberFormatException("Invalid UTF-8 sequence continuation byte: " + j10);
                }
            }
            this.f29442b += i11;
            return j10;
        }
        throw new NumberFormatException("Invalid UTF-8 sequence first byte: " + j10);
    }

    public Charset R() {
        if (a() >= 3) {
            byte[] bArr = this.f29441a;
            int i10 = this.f29442b;
            if (bArr[i10] == -17 && bArr[i10 + 1] == -69 && bArr[i10 + 2] == -65) {
                this.f29442b = i10 + 3;
                return StandardCharsets.UTF_8;
            }
        }
        if (a() < 2) {
            return null;
        }
        byte[] bArr2 = this.f29441a;
        int i11 = this.f29442b;
        byte b10 = bArr2[i11];
        if (b10 == -2 && bArr2[i11 + 1] == -1) {
            this.f29442b = i11 + 2;
            return StandardCharsets.UTF_16BE;
        } else if (b10 != -1 || bArr2[i11 + 1] != -2) {
            return null;
        } else {
            this.f29442b = i11 + 2;
            return StandardCharsets.UTF_16LE;
        }
    }

    public void S(int i10) {
        U(b() < i10 ? new byte[i10] : this.f29441a, i10);
    }

    public void T(byte[] bArr) {
        U(bArr, bArr.length);
    }

    public void U(byte[] bArr, int i10) {
        this.f29441a = bArr;
        this.f29443c = i10;
        this.f29442b = 0;
    }

    public void V(int i10) {
        C5950a.a(i10 >= 0 && i10 <= this.f29441a.length);
        this.f29443c = i10;
    }

    public void W(int i10) {
        C5950a.a(i10 >= 0 && i10 <= this.f29443c);
        this.f29442b = i10;
    }

    public void X(int i10) {
        W(this.f29442b + i10);
    }

    public int a() {
        return this.f29443c - this.f29442b;
    }

    public int b() {
        return this.f29441a.length;
    }

    public void c(int i10) {
        if (i10 > b()) {
            this.f29441a = Arrays.copyOf(this.f29441a, i10);
        }
    }

    public byte[] e() {
        return this.f29441a;
    }

    public int f() {
        return this.f29442b;
    }

    public int g() {
        return this.f29443c;
    }

    public char h(Charset charset) {
        boolean contains = f29440f.contains(charset);
        C5950a.b(contains, "Unsupported charset: " + charset);
        return (char) (i(charset) >> 16);
    }

    public int j() {
        return this.f29441a[this.f29442b] & 255;
    }

    public void k(A a10, int i10) {
        l(a10.f29434a, 0, i10);
        a10.p(0);
    }

    public void l(byte[] bArr, int i10, int i11) {
        System.arraycopy(this.f29441a, this.f29442b, bArr, i10, i11);
        this.f29442b += i11;
    }

    public String n(char c10) {
        if (a() == 0) {
            return null;
        }
        int i10 = this.f29442b;
        while (i10 < this.f29443c && this.f29441a[i10] != c10) {
            i10++;
        }
        byte[] bArr = this.f29441a;
        int i11 = this.f29442b;
        String I10 = N.I(bArr, i11, i10 - i11);
        this.f29442b = i10;
        if (i10 < this.f29443c) {
            this.f29442b = i10 + 1;
        }
        return I10;
    }

    public double o() {
        return Double.longBitsToDouble(A());
    }

    public float p() {
        return Float.intBitsToFloat(q());
    }

    public int q() {
        byte[] bArr = this.f29441a;
        int i10 = this.f29442b;
        int i11 = i10 + 1;
        this.f29442b = i11;
        int i12 = i10 + 2;
        this.f29442b = i12;
        byte b10 = ((bArr[i11] & 255) << 16) | ((bArr[i10] & 255) << 24);
        int i13 = i10 + 3;
        this.f29442b = i13;
        this.f29442b = i10 + 4;
        return (bArr[i13] & 255) | b10 | ((bArr[i12] & 255) << 8);
    }

    public int r() {
        byte[] bArr = this.f29441a;
        int i10 = this.f29442b;
        int i11 = i10 + 1;
        this.f29442b = i11;
        int i12 = i10 + 2;
        this.f29442b = i12;
        int i13 = (bArr[i11] & 255) << 8;
        this.f29442b = i10 + 3;
        return (bArr[i12] & 255) | i13 | (((bArr[i10] & 255) << 24) >> 8);
    }

    public String s() {
        return t(StandardCharsets.UTF_8);
    }

    public String t(Charset charset) {
        boolean contains = f29440f.contains(charset);
        C5950a.b(contains, "Unsupported charset: " + charset);
        if (a() == 0) {
            return null;
        }
        if (!charset.equals(StandardCharsets.US_ASCII)) {
            R();
        }
        String F10 = F(d(charset) - this.f29442b, charset);
        if (this.f29442b == this.f29443c) {
            return F10;
        }
        Y(charset);
        return F10;
    }

    public int u() {
        byte[] bArr = this.f29441a;
        int i10 = this.f29442b;
        int i11 = i10 + 1;
        this.f29442b = i11;
        int i12 = i10 + 2;
        this.f29442b = i12;
        byte b10 = ((bArr[i11] & 255) << 8) | (bArr[i10] & 255);
        int i13 = i10 + 3;
        this.f29442b = i13;
        this.f29442b = i10 + 4;
        return ((bArr[i13] & 255) << 24) | b10 | ((bArr[i12] & 255) << 16);
    }

    public long v() {
        byte[] bArr = this.f29441a;
        int i10 = this.f29442b;
        int i11 = i10 + 1;
        this.f29442b = i11;
        int i12 = i10 + 2;
        this.f29442b = i12;
        long j10 = (((long) bArr[i10]) & 255) | ((((long) bArr[i11]) & 255) << 8);
        int i13 = i10 + 3;
        this.f29442b = i13;
        int i14 = i10 + 4;
        this.f29442b = i14;
        long j11 = j10 | ((((long) bArr[i12]) & 255) << 16) | ((((long) bArr[i13]) & 255) << 24);
        int i15 = i10 + 5;
        this.f29442b = i15;
        int i16 = i10 + 6;
        this.f29442b = i16;
        long j12 = j11 | ((((long) bArr[i14]) & 255) << 32) | ((((long) bArr[i15]) & 255) << 40);
        int i17 = i10 + 7;
        this.f29442b = i17;
        this.f29442b = i10 + 8;
        return ((((long) bArr[i17]) & 255) << 56) | j12 | ((((long) bArr[i16]) & 255) << 48);
    }

    public short w() {
        byte[] bArr = this.f29441a;
        int i10 = this.f29442b;
        int i11 = i10 + 1;
        this.f29442b = i11;
        this.f29442b = i10 + 2;
        return (short) (((bArr[i11] & 255) << 8) | (bArr[i10] & 255));
    }

    public long x() {
        byte[] bArr = this.f29441a;
        int i10 = this.f29442b;
        int i11 = i10 + 1;
        this.f29442b = i11;
        int i12 = i10 + 2;
        this.f29442b = i12;
        int i13 = i10 + 3;
        this.f29442b = i13;
        this.f29442b = i10 + 4;
        return ((((long) bArr[i13]) & 255) << 24) | (((long) bArr[i10]) & 255) | ((((long) bArr[i11]) & 255) << 8) | ((((long) bArr[i12]) & 255) << 16);
    }

    public int y() {
        int u10 = u();
        if (u10 >= 0) {
            return u10;
        }
        throw new IllegalStateException("Top bit not zero: " + u10);
    }

    public int z() {
        byte[] bArr = this.f29441a;
        int i10 = this.f29442b;
        int i11 = i10 + 1;
        this.f29442b = i11;
        this.f29442b = i10 + 2;
        return ((bArr[i11] & 255) << 8) | (bArr[i10] & 255);
    }

    public B(int i10) {
        this.f29441a = new byte[i10];
        this.f29443c = i10;
    }

    public B(byte[] bArr) {
        this.f29441a = bArr;
        this.f29443c = bArr.length;
    }

    public B(byte[] bArr, int i10) {
        this.f29441a = bArr;
        this.f29443c = i10;
    }
}
