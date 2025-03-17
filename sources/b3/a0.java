package B3;

import java.nio.ByteBuffer;
import r3.b;
import r3.d;
import t3.C5950a;
import t3.N;

public final class a0 extends d {

    /* renamed from: i  reason: collision with root package name */
    private final float f33017i;

    /* renamed from: j  reason: collision with root package name */
    private final short f33018j;

    /* renamed from: k  reason: collision with root package name */
    private final int f33019k;

    /* renamed from: l  reason: collision with root package name */
    private final long f33020l;

    /* renamed from: m  reason: collision with root package name */
    private final long f33021m;

    /* renamed from: n  reason: collision with root package name */
    private int f33022n;

    /* renamed from: o  reason: collision with root package name */
    private boolean f33023o;

    /* renamed from: p  reason: collision with root package name */
    private int f33024p;

    /* renamed from: q  reason: collision with root package name */
    private long f33025q;

    /* renamed from: r  reason: collision with root package name */
    private int f33026r;

    /* renamed from: s  reason: collision with root package name */
    private byte[] f33027s;

    /* renamed from: t  reason: collision with root package name */
    private int f33028t;

    /* renamed from: u  reason: collision with root package name */
    private int f33029u;

    /* renamed from: v  reason: collision with root package name */
    private byte[] f33030v;

    public a0() {
        this(100000, 0.2f, 2000000, 10, 1024);
    }

    private void A(boolean z10) {
        int i10;
        int i11;
        int i12 = this.f33029u;
        byte[] bArr = this.f33027s;
        if (i12 == bArr.length || z10) {
            boolean z11 = false;
            if (this.f33026r == 0) {
                if (z10) {
                    B(i12, 3);
                    i10 = i12;
                } else {
                    C5950a.g(i12 >= bArr.length / 2);
                    i10 = this.f33027s.length / 2;
                    B(i10, 0);
                }
                i11 = i10;
            } else if (z10) {
                int length = i12 - (bArr.length / 2);
                int length2 = (bArr.length / 2) + length;
                int r10 = r(length) + (this.f33027s.length / 2);
                B(r10, 2);
                int i13 = length2;
                i11 = r10;
                i10 = i13;
            } else {
                i10 = i12 - (bArr.length / 2);
                i11 = r(i10);
                B(i11, 1);
            }
            C5950a.h(i10 % this.f33022n == 0, "bytesConsumed is not aligned to frame size: %s" + i10);
            if (i12 >= i11) {
                z11 = true;
            }
            C5950a.g(z11);
            this.f33029u -= i10;
            int i14 = this.f33028t + i10;
            this.f33028t = i14;
            this.f33028t = i14 % this.f33027s.length;
            int i15 = this.f33026r;
            int i16 = this.f33022n;
            this.f33026r = i15 + (i11 / i16);
            this.f33025q += (long) ((i10 - i11) / i16);
        }
    }

    private void B(int i10, int i11) {
        if (i10 != 0) {
            boolean z10 = true;
            C5950a.a(this.f33029u >= i10);
            if (i11 == 2) {
                int i12 = this.f33028t;
                int i13 = this.f33029u;
                int i14 = i12 + i13;
                byte[] bArr = this.f33027s;
                if (i14 <= bArr.length) {
                    System.arraycopy(bArr, (i12 + i13) - i10, this.f33030v, 0, i10);
                } else {
                    int length = i13 - (bArr.length - i12);
                    if (length >= i10) {
                        System.arraycopy(bArr, length - i10, this.f33030v, 0, i10);
                    } else {
                        int i15 = i10 - length;
                        System.arraycopy(bArr, bArr.length - i15, this.f33030v, 0, i15);
                        System.arraycopy(this.f33027s, 0, this.f33030v, i15, length);
                    }
                }
            } else {
                int i16 = this.f33028t;
                int i17 = i16 + i10;
                byte[] bArr2 = this.f33027s;
                if (i17 <= bArr2.length) {
                    System.arraycopy(bArr2, i16, this.f33030v, 0, i10);
                } else {
                    int length2 = bArr2.length - i16;
                    System.arraycopy(bArr2, i16, this.f33030v, 0, length2);
                    System.arraycopy(this.f33027s, 0, this.f33030v, length2, i10 - length2);
                }
            }
            C5950a.b(i10 % this.f33022n == 0, "sizeToOutput is not aligned to frame size: " + i10);
            if (this.f33028t >= this.f33027s.length) {
                z10 = false;
            }
            C5950a.g(z10);
            z(this.f33030v, i10, i11);
        }
    }

    private void C(ByteBuffer byteBuffer) {
        int limit = byteBuffer.limit();
        byteBuffer.limit(Math.min(limit, byteBuffer.position() + this.f33027s.length));
        int t10 = t(byteBuffer);
        if (t10 == byteBuffer.position()) {
            this.f33024p = 1;
        } else {
            byteBuffer.limit(Math.min(t10, byteBuffer.capacity()));
            y(byteBuffer);
        }
        byteBuffer.limit(limit);
    }

    private static void D(byte[] bArr, int i10, int i11) {
        if (i11 >= 32767) {
            bArr[i10] = -1;
            bArr[i10 + 1] = Byte.MAX_VALUE;
        } else if (i11 <= -32768) {
            bArr[i10] = 0;
            bArr[i10 + 1] = Byte.MIN_VALUE;
        } else {
            bArr[i10] = (byte) (i11 & 255);
            bArr[i10 + 1] = (byte) (i11 >> 8);
        }
    }

    private void F(ByteBuffer byteBuffer) {
        int i10;
        int i11;
        boolean z10 = true;
        C5950a.g(this.f33028t < this.f33027s.length);
        int limit = byteBuffer.limit();
        int u10 = u(byteBuffer);
        int position = u10 - byteBuffer.position();
        int i12 = this.f33028t;
        int i13 = this.f33029u;
        int i14 = i12 + i13;
        byte[] bArr = this.f33027s;
        if (i14 < bArr.length) {
            i10 = bArr.length - (i13 + i12);
            i11 = i12 + i13;
        } else {
            int length = i13 - (bArr.length - i12);
            i10 = i12 - length;
            i11 = length;
        }
        boolean z11 = u10 < limit;
        int min = Math.min(position, i10);
        byteBuffer.limit(byteBuffer.position() + min);
        byteBuffer.get(this.f33027s, i11, min);
        int i15 = this.f33029u + min;
        this.f33029u = i15;
        C5950a.g(i15 <= this.f33027s.length);
        if (!z11 || position >= i10) {
            z10 = false;
        }
        A(z10);
        if (z10) {
            this.f33024p = 0;
            this.f33026r = 0;
        }
        byteBuffer.limit(limit);
    }

    private static int G(byte b10, byte b11) {
        return (b10 << 8) | (b11 & 255);
    }

    private int n(float f10) {
        return o((int) f10);
    }

    private int o(int i10) {
        int i11 = this.f33022n;
        return (i10 / i11) * i11;
    }

    private int p(int i10, int i11) {
        int i12 = this.f33019k;
        return i12 + ((((100 - i12) * (i10 * 1000)) / i11) / 1000);
    }

    private int q(int i10, int i11) {
        return (((this.f33019k - 100) * ((i10 * 1000) / i11)) / 1000) + 100;
    }

    private int r(int i10) {
        int s10 = ((s(this.f33021m) - this.f33026r) * this.f33022n) - (this.f33027s.length / 2);
        C5950a.g(s10 >= 0);
        return n(Math.min((((float) i10) * this.f33017i) + 0.5f, (float) s10));
    }

    private int s(long j10) {
        return (int) ((j10 * ((long) this.f28650b.f28645a)) / 1000000);
    }

    private int t(ByteBuffer byteBuffer) {
        for (int limit = byteBuffer.limit() - 1; limit >= byteBuffer.position(); limit -= 2) {
            if (w(byteBuffer.get(limit), byteBuffer.get(limit - 1))) {
                int i10 = this.f33022n;
                return ((limit / i10) * i10) + i10;
            }
        }
        return byteBuffer.position();
    }

    private int u(ByteBuffer byteBuffer) {
        for (int position = byteBuffer.position() + 1; position < byteBuffer.limit(); position += 2) {
            if (w(byteBuffer.get(position), byteBuffer.get(position - 1))) {
                int i10 = this.f33022n;
                return i10 * (position / i10);
            }
        }
        return byteBuffer.limit();
    }

    private boolean w(byte b10, byte b11) {
        return Math.abs(G(b10, b11)) > this.f33018j;
    }

    private void x(byte[] bArr, int i10, int i11) {
        if (i11 != 3) {
            for (int i12 = 0; i12 < i10; i12 += 2) {
                D(bArr, i12, (G(bArr[i12 + 1], bArr[i12]) * (i11 == 0 ? q(i12, i10 - 1) : i11 == 2 ? p(i12, i10 - 1) : this.f33019k)) / 100);
            }
        }
    }

    private void y(ByteBuffer byteBuffer) {
        m(byteBuffer.remaining()).put(byteBuffer).flip();
    }

    private void z(byte[] bArr, int i10, int i11) {
        boolean z10 = i10 % this.f33022n == 0;
        C5950a.b(z10, "byteOutput size is not aligned to frame size " + i10);
        x(bArr, i10, i11);
        m(i10).put(bArr, 0, i10).flip();
    }

    public void E(boolean z10) {
        this.f33023o = z10;
    }

    public boolean c() {
        return super.c() && this.f33023o;
    }

    public void e(ByteBuffer byteBuffer) {
        while (byteBuffer.hasRemaining() && !h()) {
            int i10 = this.f33024p;
            if (i10 == 0) {
                C(byteBuffer);
            } else if (i10 == 1) {
                F(byteBuffer);
            } else {
                throw new IllegalStateException();
            }
        }
    }

    /* access modifiers changed from: protected */
    public b.a i(b.a aVar) {
        if (aVar.f28647c == 2) {
            return aVar.f28645a == -1 ? b.a.f28644e : aVar;
        }
        throw new b.C0454b(aVar);
    }

    public void j() {
        if (c()) {
            this.f33022n = this.f28650b.f28646b * 2;
            int o10 = o(s(this.f33020l) / 2) * 2;
            if (this.f33027s.length != o10) {
                this.f33027s = new byte[o10];
                this.f33030v = new byte[o10];
            }
        }
        this.f33024p = 0;
        this.f33025q = 0;
        this.f33026r = 0;
        this.f33028t = 0;
        this.f33029u = 0;
    }

    public void k() {
        if (this.f33029u > 0) {
            A(true);
            this.f33026r = 0;
        }
    }

    public void l() {
        this.f33023o = false;
        byte[] bArr = N.f29467f;
        this.f33027s = bArr;
        this.f33030v = bArr;
    }

    public long v() {
        return this.f33025q;
    }

    public a0(long j10, float f10, long j11, int i10, short s10) {
        boolean z10 = false;
        this.f33026r = 0;
        this.f33028t = 0;
        this.f33029u = 0;
        if (f10 >= 0.0f && f10 <= 1.0f) {
            z10 = true;
        }
        C5950a.a(z10);
        this.f33020l = j10;
        this.f33017i = f10;
        this.f33021m = j11;
        this.f33019k = i10;
        this.f33018j = s10;
        byte[] bArr = N.f29467f;
        this.f33027s = bArr;
        this.f33030v = bArr;
    }
}
