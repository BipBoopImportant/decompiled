package G3;

import G3.Z;
import J3.C6568a;
import J3.C6569b;
import N3.O;
import java.io.EOFException;
import java.nio.ByteBuffer;
import java.util.Arrays;
import q3.C5799j;
import t3.B;
import t3.C5950a;
import t3.N;
import y3.c;
import y3.f;

class X {

    /* renamed from: a  reason: collision with root package name */
    private final C6569b f35772a;

    /* renamed from: b  reason: collision with root package name */
    private final int f35773b;

    /* renamed from: c  reason: collision with root package name */
    private final B f35774c = new B(32);

    /* renamed from: d  reason: collision with root package name */
    private a f35775d;

    /* renamed from: e  reason: collision with root package name */
    private a f35776e;

    /* renamed from: f  reason: collision with root package name */
    private a f35777f;

    /* renamed from: g  reason: collision with root package name */
    private long f35778g;

    private static final class a implements C6569b.a {

        /* renamed from: a  reason: collision with root package name */
        public long f35779a;

        /* renamed from: b  reason: collision with root package name */
        public long f35780b;

        /* renamed from: c  reason: collision with root package name */
        public C6568a f35781c;

        /* renamed from: d  reason: collision with root package name */
        public a f35782d;

        public a(long j10, int i10) {
            d(j10, i10);
        }

        public C6568a a() {
            return (C6568a) C5950a.e(this.f35781c);
        }

        public a b() {
            this.f35781c = null;
            a aVar = this.f35782d;
            this.f35782d = null;
            return aVar;
        }

        public void c(C6568a aVar, a aVar2) {
            this.f35781c = aVar;
            this.f35782d = aVar2;
        }

        public void d(long j10, int i10) {
            C5950a.g(this.f35781c == null);
            this.f35779a = j10;
            this.f35780b = j10 + ((long) i10);
        }

        public int e(long j10) {
            return ((int) (j10 - this.f35779a)) + this.f35781c.f37251b;
        }

        public C6569b.a next() {
            a aVar = this.f35782d;
            if (aVar == null || aVar.f35781c == null) {
                return null;
            }
            return aVar;
        }
    }

    public X(C6569b bVar) {
        this.f35772a = bVar;
        int e10 = bVar.e();
        this.f35773b = e10;
        a aVar = new a(0, e10);
        this.f35775d = aVar;
        this.f35776e = aVar;
        this.f35777f = aVar;
    }

    private void a(a aVar) {
        if (aVar.f35781c != null) {
            this.f35772a.a(aVar);
            aVar.b();
        }
    }

    private static a c(a aVar, long j10) {
        while (j10 >= aVar.f35780b) {
            aVar = aVar.f35782d;
        }
        return aVar;
    }

    private void f(int i10) {
        long j10 = this.f35778g + ((long) i10);
        this.f35778g = j10;
        a aVar = this.f35777f;
        if (j10 == aVar.f35780b) {
            this.f35777f = aVar.f35782d;
        }
    }

    private int g(int i10) {
        a aVar = this.f35777f;
        if (aVar.f35781c == null) {
            aVar.c(this.f35772a.b(), new a(this.f35777f.f35780b, this.f35773b));
        }
        return Math.min(i10, (int) (this.f35777f.f35780b - this.f35778g));
    }

    private static a h(a aVar, long j10, ByteBuffer byteBuffer, int i10) {
        a c10 = c(aVar, j10);
        while (i10 > 0) {
            int min = Math.min(i10, (int) (c10.f35780b - j10));
            byteBuffer.put(c10.f35781c.f37250a, c10.e(j10), min);
            i10 -= min;
            j10 += (long) min;
            if (j10 == c10.f35780b) {
                c10 = c10.f35782d;
            }
        }
        return c10;
    }

    private static a i(a aVar, long j10, byte[] bArr, int i10) {
        a c10 = c(aVar, j10);
        int i11 = i10;
        while (i11 > 0) {
            int min = Math.min(i11, (int) (c10.f35780b - j10));
            System.arraycopy(c10.f35781c.f37250a, c10.e(j10), bArr, i10 - i11, min);
            i11 -= min;
            j10 += (long) min;
            if (j10 == c10.f35780b) {
                c10 = c10.f35782d;
            }
        }
        return c10;
    }

    private static a j(a aVar, f fVar, Z.b bVar, B b10) {
        Z.b bVar2 = bVar;
        B b11 = b10;
        long j10 = bVar2.f35817b;
        int i10 = 1;
        b11.S(1);
        a i11 = i(aVar, j10, b10.e(), 1);
        long j11 = j10 + 1;
        byte b12 = b10.e()[0];
        boolean z10 = (b12 & 128) != 0;
        byte b13 = b12 & Byte.MAX_VALUE;
        c cVar = fVar.f32278c;
        byte[] bArr = cVar.f32265a;
        if (bArr == null) {
            cVar.f32265a = new byte[16];
        } else {
            Arrays.fill(bArr, (byte) 0);
        }
        a i12 = i(i11, j11, cVar.f32265a, b13);
        long j12 = j11 + ((long) b13);
        if (z10) {
            b11.S(2);
            i12 = i(i12, j12, b10.e(), 2);
            j12 += 2;
            i10 = b10.P();
        }
        int i13 = i10;
        int[] iArr = cVar.f32268d;
        if (iArr == null || iArr.length < i13) {
            iArr = new int[i13];
        }
        int[] iArr2 = iArr;
        int[] iArr3 = cVar.f32269e;
        if (iArr3 == null || iArr3.length < i13) {
            iArr3 = new int[i13];
        }
        int[] iArr4 = iArr3;
        if (z10) {
            int i14 = i13 * 6;
            b11.S(i14);
            i12 = i(i12, j12, b10.e(), i14);
            j12 += (long) i14;
            b11.W(0);
            for (int i15 = 0; i15 < i13; i15++) {
                iArr2[i15] = b10.P();
                iArr4[i15] = b10.L();
            }
        } else {
            iArr2[0] = 0;
            iArr4[0] = bVar2.f35816a - ((int) (j12 - bVar2.f35817b));
        }
        O.a aVar2 = (O.a) N.i(bVar2.f35818c);
        cVar.c(i13, iArr2, iArr4, aVar2.f38778b, cVar.f32265a, aVar2.f38777a, aVar2.f38779c, aVar2.f38780d);
        long j13 = bVar2.f35817b;
        int i16 = (int) (j12 - j13);
        bVar2.f35817b = j13 + ((long) i16);
        bVar2.f35816a -= i16;
        return i12;
    }

    private static a k(a aVar, f fVar, Z.b bVar, B b10) {
        if (fVar.M()) {
            aVar = j(aVar, fVar, bVar, b10);
        }
        if (fVar.C()) {
            b10.S(4);
            a i10 = i(aVar, bVar.f35817b, b10.e(), 4);
            int L10 = b10.L();
            bVar.f35817b += 4;
            bVar.f35816a -= 4;
            fVar.K(L10);
            a h10 = h(i10, bVar.f35817b, fVar.f32279d, L10);
            bVar.f35817b += (long) L10;
            int i11 = bVar.f35816a - L10;
            bVar.f35816a = i11;
            fVar.O(i11);
            return h(h10, bVar.f35817b, fVar.f32282g, bVar.f35816a);
        }
        fVar.K(bVar.f35816a);
        return h(aVar, bVar.f35817b, fVar.f32279d, bVar.f35816a);
    }

    public void b(long j10) {
        a aVar;
        if (j10 != -1) {
            while (true) {
                aVar = this.f35775d;
                if (j10 < aVar.f35780b) {
                    break;
                }
                this.f35772a.c(aVar.f35781c);
                this.f35775d = this.f35775d.b();
            }
            if (this.f35776e.f35779a < aVar.f35779a) {
                this.f35776e = aVar;
            }
        }
    }

    public long d() {
        return this.f35778g;
    }

    public void e(f fVar, Z.b bVar) {
        k(this.f35776e, fVar, bVar, this.f35774c);
    }

    public void l(f fVar, Z.b bVar) {
        this.f35776e = k(this.f35776e, fVar, bVar, this.f35774c);
    }

    public void m() {
        a(this.f35775d);
        this.f35775d.d(0, this.f35773b);
        a aVar = this.f35775d;
        this.f35776e = aVar;
        this.f35777f = aVar;
        this.f35778g = 0;
        this.f35772a.d();
    }

    public void n() {
        this.f35776e = this.f35775d;
    }

    public int o(C5799j jVar, int i10, boolean z10) {
        int g10 = g(i10);
        a aVar = this.f35777f;
        int c10 = jVar.c(aVar.f35781c.f37250a, aVar.e(this.f35778g), g10);
        if (c10 != -1) {
            f(c10);
            return c10;
        } else if (z10) {
            return -1;
        } else {
            throw new EOFException();
        }
    }

    public void p(B b10, int i10) {
        while (i10 > 0) {
            int g10 = g(i10);
            a aVar = this.f35777f;
            b10.l(aVar.f35781c.f37250a, aVar.e(this.f35778g), g10);
            i10 -= g10;
            f(g10);
        }
    }
}
