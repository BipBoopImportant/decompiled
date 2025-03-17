package k4;

import N3.C6659E;
import N3.C6678p;
import N3.C6679q;
import N3.I;
import N3.O;
import N3.r;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import k4.s;
import nb.C10076f;
import q3.C5807s;
import t3.B;
import t3.C5950a;
import t3.N;

/* renamed from: k4.o  reason: case insensitive filesystem */
public class C8431o implements C6678p {

    /* renamed from: a  reason: collision with root package name */
    private final s f54110a;

    /* renamed from: b  reason: collision with root package name */
    private final C8420d f54111b = new C8420d();

    /* renamed from: c  reason: collision with root package name */
    private final C5807s f54112c;

    /* renamed from: d  reason: collision with root package name */
    private final List<b> f54113d;

    /* renamed from: e  reason: collision with root package name */
    private final B f54114e = new B();

    /* renamed from: f  reason: collision with root package name */
    private byte[] f54115f = N.f29467f;

    /* renamed from: g  reason: collision with root package name */
    private O f54116g;

    /* renamed from: h  reason: collision with root package name */
    private int f54117h;

    /* renamed from: i  reason: collision with root package name */
    private int f54118i;

    /* renamed from: j  reason: collision with root package name */
    private long[] f54119j;

    /* renamed from: k  reason: collision with root package name */
    private long f54120k;

    /* renamed from: k4.o$b */
    private static class b implements Comparable<b> {
        /* access modifiers changed from: private */

        /* renamed from: a  reason: collision with root package name */
        public final long f54121a;
        /* access modifiers changed from: private */

        /* renamed from: b  reason: collision with root package name */
        public final byte[] f54122b;

        /* renamed from: j */
        public int compareTo(b bVar) {
            return Long.compare(this.f54121a, bVar.f54121a);
        }

        private b(long j10, byte[] bArr) {
            this.f54121a = j10;
            this.f54122b = bArr;
        }
    }

    public C8431o(s sVar, C5807s sVar2) {
        this.f54110a = sVar;
        this.f54112c = sVar2.b().s0("application/x-media3-cues").R(sVar2.f28244o).V(sVar.d()).M();
        this.f54113d = new ArrayList();
        this.f54118i = 0;
        this.f54119j = N.f29468g;
        this.f54120k = -9223372036854775807L;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void e(C8421e eVar) {
        b bVar = new b(eVar.f54101b, this.f54111b.a(eVar.f54100a, eVar.f54102c));
        this.f54113d.add(bVar);
        long j10 = this.f54120k;
        if (j10 == -9223372036854775807L || eVar.f54101b >= j10) {
            m(bVar);
        }
    }

    private void f() {
        try {
            long j10 = this.f54120k;
            this.f54110a.c(this.f54115f, 0, this.f54117h, j10 != -9223372036854775807L ? s.b.c(j10) : s.b.b(), new C8430n(this));
            Collections.sort(this.f54113d);
            this.f54119j = new long[this.f54113d.size()];
            for (int i10 = 0; i10 < this.f54113d.size(); i10++) {
                this.f54119j[i10] = this.f54113d.get(i10).f54121a;
            }
            this.f54115f = N.f29467f;
        } catch (RuntimeException e10) {
            throw q3.B.a("SubtitleParser failed.", e10);
        }
    }

    private boolean g(C6679q qVar) {
        byte[] bArr = this.f54115f;
        if (bArr.length == this.f54117h) {
            this.f54115f = Arrays.copyOf(bArr, bArr.length + 1024);
        }
        byte[] bArr2 = this.f54115f;
        int i10 = this.f54117h;
        int c10 = qVar.c(bArr2, i10, bArr2.length - i10);
        if (c10 != -1) {
            this.f54117h += c10;
        }
        long length = qVar.getLength();
        return (length != -1 && ((long) this.f54117h) == length) || c10 == -1;
    }

    private boolean k(C6679q qVar) {
        return qVar.a((qVar.getLength() > -1 ? 1 : (qVar.getLength() == -1 ? 0 : -1)) != 0 ? C10076f.d(qVar.getLength()) : 1024) == -1;
    }

    private void l() {
        long j10 = this.f54120k;
        for (int h10 = j10 == -9223372036854775807L ? 0 : N.h(this.f54119j, j10, true, true); h10 < this.f54113d.size(); h10++) {
            m(this.f54113d.get(h10));
        }
    }

    private void m(b bVar) {
        C5950a.i(this.f54116g);
        int length = bVar.f54122b.length;
        this.f54114e.T(bVar.f54122b);
        this.f54116g.a(this.f54114e, length);
        this.f54116g.c(bVar.f54121a, 1, length, 0, (O.a) null);
    }

    public void a(long j10, long j11) {
        int i10 = this.f54118i;
        C5950a.g((i10 == 0 || i10 == 5) ? false : true);
        this.f54120k = j11;
        if (this.f54118i == 2) {
            this.f54118i = 1;
        }
        if (this.f54118i == 4) {
            this.f54118i = 3;
        }
    }

    public void b(r rVar) {
        C5950a.g(this.f54118i == 0);
        O t10 = rVar.t(0, 3);
        this.f54116g = t10;
        t10.e(this.f54112c);
        rVar.r();
        rVar.n(new C6659E(new long[]{0}, new long[]{0}, -9223372036854775807L));
        this.f54118i = 1;
    }

    public boolean h(C6679q qVar) {
        return true;
    }

    public int j(C6679q qVar, I i10) {
        int i11 = this.f54118i;
        C5950a.g((i11 == 0 || i11 == 5) ? false : true);
        if (this.f54118i == 1) {
            int d10 = qVar.getLength() != -1 ? C10076f.d(qVar.getLength()) : 1024;
            if (d10 > this.f54115f.length) {
                this.f54115f = new byte[d10];
            }
            this.f54117h = 0;
            this.f54118i = 2;
        }
        if (this.f54118i == 2 && g(qVar)) {
            f();
            this.f54118i = 4;
        }
        if (this.f54118i == 3 && k(qVar)) {
            l();
            this.f54118i = 4;
        }
        return this.f54118i == 4 ? -1 : 0;
    }

    public void release() {
        if (this.f54118i != 5) {
            this.f54110a.a();
            this.f54118i = 5;
        }
    }
}
