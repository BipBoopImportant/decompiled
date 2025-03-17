package k4;

import N3.O;
import java.io.EOFException;
import k4.s;
import q3.A;
import q3.C5799j;
import q3.C5807s;
import t3.B;
import t3.C5950a;
import t3.N;

final class v implements O {

    /* renamed from: a  reason: collision with root package name */
    private final O f54137a;

    /* renamed from: b  reason: collision with root package name */
    private final s.a f54138b;

    /* renamed from: c  reason: collision with root package name */
    private final C8420d f54139c = new C8420d();

    /* renamed from: d  reason: collision with root package name */
    private final B f54140d = new B();

    /* renamed from: e  reason: collision with root package name */
    private int f54141e = 0;

    /* renamed from: f  reason: collision with root package name */
    private int f54142f = 0;

    /* renamed from: g  reason: collision with root package name */
    private byte[] f54143g = N.f29467f;

    /* renamed from: h  reason: collision with root package name */
    private s f54144h;

    /* renamed from: i  reason: collision with root package name */
    private C5807s f54145i;

    public v(O o10, s.a aVar) {
        this.f54137a = o10;
        this.f54138b = aVar;
    }

    private void h(int i10) {
        int length = this.f54143g.length;
        int i11 = this.f54142f;
        if (length - i11 < i10) {
            int i12 = i11 - this.f54141e;
            int max = Math.max(i12 * 2, i10 + i12);
            byte[] bArr = this.f54143g;
            byte[] bArr2 = max <= bArr.length ? bArr : new byte[max];
            System.arraycopy(bArr, this.f54141e, bArr2, 0, i12);
            this.f54141e = 0;
            this.f54142f = i12;
            this.f54143g = bArr2;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: j */
    public void i(C8421e eVar, long j10, int i10) {
        C5950a.i(this.f54145i);
        byte[] a10 = this.f54139c.a(eVar.f54100a, eVar.f54102c);
        this.f54140d.T(a10);
        this.f54137a.a(this.f54140d, a10.length);
        long j11 = eVar.f54101b;
        if (j11 == -9223372036854775807L) {
            C5950a.g(this.f54145i.f28249t == Long.MAX_VALUE);
        } else {
            long j12 = this.f54145i.f28249t;
            j10 = j12 == Long.MAX_VALUE ? j10 + j11 : j11 + j12;
        }
        this.f54137a.c(j10, i10, a10.length, 0, (O.a) null);
    }

    public void b(B b10, int i10, int i11) {
        if (this.f54144h == null) {
            this.f54137a.b(b10, i10, i11);
            return;
        }
        h(i10);
        b10.l(this.f54143g, this.f54142f, i10);
        this.f54142f += i10;
    }

    public void c(long j10, int i10, int i11, int i12, O.a aVar) {
        if (this.f54144h == null) {
            this.f54137a.c(j10, i10, i11, i12, aVar);
            return;
        }
        C5950a.b(aVar == null, "DRM on subtitles is not supported");
        int i13 = (this.f54142f - i12) - i11;
        this.f54144h.c(this.f54143g, i13, i11, s.b.b(), new u(this, j10, i10));
        int i14 = i13 + i11;
        this.f54141e = i14;
        if (i14 == this.f54142f) {
            this.f54141e = 0;
            this.f54142f = 0;
        }
    }

    public void e(C5807s sVar) {
        C5950a.e(sVar.f28244o);
        C5950a.a(A.k(sVar.f28244o) == 3);
        if (!sVar.equals(this.f54145i)) {
            this.f54145i = sVar;
            this.f54144h = this.f54138b.b(sVar) ? this.f54138b.a(sVar) : null;
        }
        if (this.f54144h == null) {
            this.f54137a.e(sVar);
        } else {
            this.f54137a.e(sVar.b().s0("application/x-media3-cues").R(sVar.f28244o).w0(Long.MAX_VALUE).V(this.f54138b.c(sVar)).M());
        }
    }

    public int f(C5799j jVar, int i10, boolean z10, int i11) {
        if (this.f54144h == null) {
            return this.f54137a.f(jVar, i10, z10, i11);
        }
        h(i10);
        int c10 = jVar.c(this.f54143g, this.f54142f, i10);
        if (c10 != -1) {
            this.f54142f += c10;
            return c10;
        } else if (z10) {
            return -1;
        } else {
            throw new EOFException();
        }
    }
}
