package i4;

import N3.C6679q;
import N3.C6680s;
import N3.J;
import N3.K;
import java.io.EOFException;
import java.io.IOException;
import java.math.BigInteger;
import t3.C5950a;
import t3.N;

/* renamed from: i4.a  reason: case insensitive filesystem */
final class C8207a implements g {

    /* renamed from: a  reason: collision with root package name */
    private final f f53073a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final long f53074b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public final long f53075c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public final i f53076d;

    /* renamed from: e  reason: collision with root package name */
    private int f53077e;
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public long f53078f;

    /* renamed from: g  reason: collision with root package name */
    private long f53079g;

    /* renamed from: h  reason: collision with root package name */
    private long f53080h;

    /* renamed from: i  reason: collision with root package name */
    private long f53081i;

    /* renamed from: j  reason: collision with root package name */
    private long f53082j;

    /* renamed from: k  reason: collision with root package name */
    private long f53083k;

    /* renamed from: l  reason: collision with root package name */
    private long f53084l;

    /* renamed from: i4.a$b */
    private final class b implements J {
        private b() {
        }

        public J.a c(long j10) {
            return new J.a(new K(j10, N.q((C8207a.this.f53074b + BigInteger.valueOf(C8207a.this.f53076d.c(j10)).multiply(BigInteger.valueOf(C8207a.this.f53075c - C8207a.this.f53074b)).divide(BigInteger.valueOf(C8207a.this.f53078f)).longValue()) - 30000, C8207a.this.f53074b, C8207a.this.f53075c - 1)));
        }

        public boolean f() {
            return true;
        }

        public long l() {
            return C8207a.this.f53076d.b(C8207a.this.f53078f);
        }
    }

    public C8207a(i iVar, long j10, long j11, long j12, long j13, boolean z10) {
        C5950a.a(j10 >= 0 && j11 > j10);
        this.f53076d = iVar;
        this.f53074b = j10;
        this.f53075c = j11;
        if (j12 == j11 - j10 || z10) {
            this.f53078f = j13;
            this.f53077e = 4;
        } else {
            this.f53077e = 0;
        }
        this.f53073a = new f();
    }

    private long i(C6679q qVar) {
        C6679q qVar2 = qVar;
        if (this.f53081i == this.f53082j) {
            return -1;
        }
        long position = qVar.getPosition();
        if (!this.f53073a.d(qVar2, this.f53082j)) {
            long j10 = this.f53081i;
            if (j10 != position) {
                return j10;
            }
            throw new IOException("No ogg page can be found.");
        }
        this.f53073a.a(qVar2, false);
        qVar.f();
        long j11 = this.f53080h;
        f fVar = this.f53073a;
        long j12 = fVar.f53103c;
        long j13 = j11 - j12;
        int i10 = fVar.f53108h + fVar.f53109i;
        if (0 <= j13 && j13 < 72000) {
            return -1;
        }
        int i11 = (j13 > 0 ? 1 : (j13 == 0 ? 0 : -1));
        if (i11 < 0) {
            this.f53082j = position;
            this.f53084l = j12;
        } else {
            this.f53081i = qVar.getPosition() + ((long) i10);
            this.f53083k = this.f53073a.f53103c;
        }
        long j14 = this.f53082j;
        long j15 = this.f53081i;
        if (j14 - j15 < 100000) {
            this.f53082j = j15;
            return j15;
        }
        long position2 = qVar.getPosition() - (((long) i10) * (i11 <= 0 ? 2 : 1));
        long j16 = this.f53082j;
        long j17 = this.f53081i;
        return N.q(position2 + ((j13 * (j16 - j17)) / (this.f53084l - this.f53083k)), j17, j16 - 1);
    }

    private void k(C6679q qVar) {
        while (true) {
            this.f53073a.c(qVar);
            this.f53073a.a(qVar, false);
            f fVar = this.f53073a;
            if (fVar.f53103c > this.f53080h) {
                qVar.f();
                return;
            }
            qVar.k(fVar.f53108h + fVar.f53109i);
            this.f53081i = qVar.getPosition();
            this.f53083k = this.f53073a.f53103c;
        }
    }

    public long b(C6679q qVar) {
        int i10 = this.f53077e;
        if (i10 == 0) {
            long position = qVar.getPosition();
            this.f53079g = position;
            this.f53077e = 1;
            long j10 = this.f53075c - 65307;
            if (j10 > position) {
                return j10;
            }
        } else if (i10 != 1) {
            if (i10 == 2) {
                long i11 = i(qVar);
                if (i11 != -1) {
                    return i11;
                }
                this.f53077e = 3;
            } else if (i10 != 3) {
                if (i10 == 4) {
                    return -1;
                }
                throw new IllegalStateException();
            }
            k(qVar);
            this.f53077e = 4;
            return -(this.f53083k + 2);
        }
        this.f53078f = j(qVar);
        this.f53077e = 4;
        return this.f53079g;
    }

    public void c(long j10) {
        this.f53080h = N.q(j10, 0, this.f53078f - 1);
        this.f53077e = 2;
        this.f53081i = this.f53074b;
        this.f53082j = this.f53075c;
        this.f53083k = 0;
        this.f53084l = this.f53078f;
    }

    /* renamed from: h */
    public b a() {
        if (this.f53078f != 0) {
            return new b();
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public long j(C6679q qVar) {
        this.f53073a.b();
        if (this.f53073a.c(qVar)) {
            this.f53073a.a(qVar, false);
            f fVar = this.f53073a;
            qVar.k(fVar.f53108h + fVar.f53109i);
            long j10 = this.f53073a.f53103c;
            while (true) {
                f fVar2 = this.f53073a;
                if ((fVar2.f53102b & 4) == 4 || !fVar2.c(qVar) || qVar.getPosition() >= this.f53075c || !this.f53073a.a(qVar, true)) {
                    break;
                }
                f fVar3 = this.f53073a;
                if (!C6680s.e(qVar, fVar3.f53108h + fVar3.f53109i)) {
                    break;
                }
                j10 = this.f53073a.f53103c;
            }
            return j10;
        }
        throw new EOFException();
    }
}
