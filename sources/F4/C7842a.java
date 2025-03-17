package f4;

import N3.C6679q;
import java.util.ArrayDeque;
import q3.B;
import t3.C5950a;

/* renamed from: f4.a  reason: case insensitive filesystem */
final class C7842a implements C7844c {

    /* renamed from: a  reason: collision with root package name */
    private final byte[] f50981a = new byte[8];

    /* renamed from: b  reason: collision with root package name */
    private final ArrayDeque<b> f50982b = new ArrayDeque<>();

    /* renamed from: c  reason: collision with root package name */
    private final g f50983c = new g();

    /* renamed from: d  reason: collision with root package name */
    private C7843b f50984d;

    /* renamed from: e  reason: collision with root package name */
    private int f50985e;

    /* renamed from: f  reason: collision with root package name */
    private int f50986f;

    /* renamed from: g  reason: collision with root package name */
    private long f50987g;

    /* renamed from: f4.a$b */
    private static final class b {
        /* access modifiers changed from: private */

        /* renamed from: a  reason: collision with root package name */
        public final int f50988a;
        /* access modifiers changed from: private */

        /* renamed from: b  reason: collision with root package name */
        public final long f50989b;

        private b(int i10, long j10) {
            this.f50988a = i10;
            this.f50989b = j10;
        }
    }

    private long d(C6679q qVar) {
        qVar.f();
        while (true) {
            qVar.o(this.f50981a, 0, 4);
            int c10 = g.c(this.f50981a[0]);
            if (c10 != -1 && c10 <= 4) {
                int a10 = (int) g.a(this.f50981a, c10, false);
                if (this.f50984d.f(a10)) {
                    qVar.k(c10);
                    return (long) a10;
                }
            }
            qVar.k(1);
        }
    }

    private double e(C6679q qVar, int i10) {
        long f10 = f(qVar, i10);
        return i10 == 4 ? (double) Float.intBitsToFloat((int) f10) : Double.longBitsToDouble(f10);
    }

    private long f(C6679q qVar, int i10) {
        qVar.readFully(this.f50981a, 0, i10);
        long j10 = 0;
        for (int i11 = 0; i11 < i10; i11++) {
            j10 = (j10 << 8) | ((long) (this.f50981a[i11] & 255));
        }
        return j10;
    }

    private static String g(C6679q qVar, int i10) {
        if (i10 == 0) {
            return "";
        }
        byte[] bArr = new byte[i10];
        qVar.readFully(bArr, 0, i10);
        while (i10 > 0 && bArr[i10 - 1] == 0) {
            i10--;
        }
        return new String(bArr, 0, i10);
    }

    public void a() {
        this.f50985e = 0;
        this.f50982b.clear();
        this.f50983c.e();
    }

    public boolean b(C6679q qVar) {
        C5950a.i(this.f50984d);
        while (true) {
            b peek = this.f50982b.peek();
            if (peek == null || qVar.getPosition() < peek.f50989b) {
                if (this.f50985e == 0) {
                    long d10 = this.f50983c.d(qVar, true, false, 4);
                    if (d10 == -2) {
                        d10 = d(qVar);
                    }
                    if (d10 == -1) {
                        return false;
                    }
                    this.f50986f = (int) d10;
                    this.f50985e = 1;
                }
                if (this.f50985e == 1) {
                    this.f50987g = this.f50983c.d(qVar, false, true, 8);
                    this.f50985e = 2;
                }
                int e10 = this.f50984d.e(this.f50986f);
                if (e10 == 0) {
                    qVar.k((int) this.f50987g);
                    this.f50985e = 0;
                } else if (e10 == 1) {
                    long position = qVar.getPosition();
                    this.f50982b.push(new b(this.f50986f, this.f50987g + position));
                    this.f50984d.h(this.f50986f, position, this.f50987g);
                    this.f50985e = 0;
                    return true;
                } else if (e10 == 2) {
                    long j10 = this.f50987g;
                    if (j10 <= 8) {
                        this.f50984d.d(this.f50986f, f(qVar, (int) j10));
                        this.f50985e = 0;
                        return true;
                    }
                    throw B.a("Invalid integer size: " + this.f50987g, (Throwable) null);
                } else if (e10 == 3) {
                    long j11 = this.f50987g;
                    if (j11 <= 2147483647L) {
                        this.f50984d.g(this.f50986f, g(qVar, (int) j11));
                        this.f50985e = 0;
                        return true;
                    }
                    throw B.a("String element size: " + this.f50987g, (Throwable) null);
                } else if (e10 == 4) {
                    this.f50984d.b(this.f50986f, (int) this.f50987g, qVar);
                    this.f50985e = 0;
                    return true;
                } else if (e10 == 5) {
                    long j12 = this.f50987g;
                    if (j12 == 4 || j12 == 8) {
                        this.f50984d.c(this.f50986f, e(qVar, (int) j12));
                        this.f50985e = 0;
                        return true;
                    }
                    throw B.a("Invalid float size: " + this.f50987g, (Throwable) null);
                } else {
                    throw B.a("Invalid element type " + e10, (Throwable) null);
                }
            } else {
                this.f50984d.a(this.f50982b.pop().f50988a);
                return true;
            }
        }
    }

    public void c(C7843b bVar) {
        this.f50984d = bVar;
    }
}
