package t4;

import N3.C6670h;
import N3.C6678p;
import N3.C6679q;
import N3.I;
import N3.J;
import N3.r;
import N3.u;
import androidx.recyclerview.widget.RecyclerView;
import t3.A;
import t3.B;
import t3.C5950a;
import t4.L;

/* renamed from: t4.h  reason: case insensitive filesystem */
public final class C8783h implements C6678p {

    /* renamed from: m  reason: collision with root package name */
    public static final u f56282m = new C8782g();

    /* renamed from: a  reason: collision with root package name */
    private final int f56283a;

    /* renamed from: b  reason: collision with root package name */
    private final C8784i f56284b;

    /* renamed from: c  reason: collision with root package name */
    private final B f56285c;

    /* renamed from: d  reason: collision with root package name */
    private final B f56286d;

    /* renamed from: e  reason: collision with root package name */
    private final A f56287e;

    /* renamed from: f  reason: collision with root package name */
    private r f56288f;

    /* renamed from: g  reason: collision with root package name */
    private long f56289g;

    /* renamed from: h  reason: collision with root package name */
    private long f56290h;

    /* renamed from: i  reason: collision with root package name */
    private int f56291i;

    /* renamed from: j  reason: collision with root package name */
    private boolean f56292j;

    /* renamed from: k  reason: collision with root package name */
    private boolean f56293k;

    /* renamed from: l  reason: collision with root package name */
    private boolean f56294l;

    public C8783h() {
        this(0);
    }

    /* JADX WARNING: Removed duplicated region for block: B:31:0x007c  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0082  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void e(N3.C6679q r10) {
        /*
            r9 = this;
            boolean r0 = r9.f56292j
            if (r0 == 0) goto L_0x0005
            return
        L_0x0005:
            r0 = -1
            r9.f56291i = r0
            r10.f()
            long r1 = r10.getPosition()
            r3 = 0
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 != 0) goto L_0x0018
            r9.m(r10)
        L_0x0018:
            r1 = 0
            r2 = r1
        L_0x001a:
            r5 = 1
            t3.B r6 = r9.f56286d     // Catch:{ EOFException -> 0x0076 }
            byte[] r6 = r6.e()     // Catch:{ EOFException -> 0x0076 }
            r7 = 2
            boolean r6 = r10.d(r6, r1, r7, r5)     // Catch:{ EOFException -> 0x0076 }
            if (r6 == 0) goto L_0x0076
            t3.B r6 = r9.f56286d     // Catch:{ EOFException -> 0x0076 }
            r6.W(r1)     // Catch:{ EOFException -> 0x0076 }
            t3.B r6 = r9.f56286d     // Catch:{ EOFException -> 0x0076 }
            int r6 = r6.P()     // Catch:{ EOFException -> 0x0076 }
            boolean r6 = t4.C8784i.m(r6)     // Catch:{ EOFException -> 0x0076 }
            if (r6 != 0) goto L_0x003a
            goto L_0x0077
        L_0x003a:
            t3.B r6 = r9.f56286d     // Catch:{ EOFException -> 0x0076 }
            byte[] r6 = r6.e()     // Catch:{ EOFException -> 0x0076 }
            r7 = 4
            boolean r6 = r10.d(r6, r1, r7, r5)     // Catch:{ EOFException -> 0x0076 }
            if (r6 != 0) goto L_0x0048
            goto L_0x0076
        L_0x0048:
            t3.A r6 = r9.f56287e     // Catch:{ EOFException -> 0x0076 }
            r7 = 14
            r6.p(r7)     // Catch:{ EOFException -> 0x0076 }
            t3.A r6 = r9.f56287e     // Catch:{ EOFException -> 0x0076 }
            r7 = 13
            int r6 = r6.h(r7)     // Catch:{ EOFException -> 0x0076 }
            r7 = 6
            if (r6 <= r7) goto L_0x006c
            long r7 = (long) r6     // Catch:{ EOFException -> 0x0076 }
            long r3 = r3 + r7
            int r2 = r2 + 1
            r7 = 1000(0x3e8, float:1.401E-42)
            if (r2 != r7) goto L_0x0063
            goto L_0x006b
        L_0x0063:
            int r6 = r6 + -6
            boolean r6 = r10.m(r6, r5)     // Catch:{ EOFException -> 0x0076 }
            if (r6 != 0) goto L_0x001a
        L_0x006b:
            goto L_0x0076
        L_0x006c:
            r9.f56292j = r5     // Catch:{ EOFException -> 0x0076 }
            java.lang.String r1 = "Malformed ADTS stream"
            r6 = 0
            q3.B r1 = q3.B.a(r1, r6)     // Catch:{ EOFException -> 0x0076 }
            throw r1     // Catch:{ EOFException -> 0x0076 }
        L_0x0076:
            r1 = r2
        L_0x0077:
            r10.f()
            if (r1 <= 0) goto L_0x0082
            long r0 = (long) r1
            long r3 = r3 / r0
            int r10 = (int) r3
            r9.f56291i = r10
            goto L_0x0084
        L_0x0082:
            r9.f56291i = r0
        L_0x0084:
            r9.f56292j = r5
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: t4.C8783h.e(N3.q):void");
    }

    private static int f(int i10, long j10) {
        return (int) ((((long) i10) * 8000000) / j10);
    }

    private J g(long j10, boolean z10) {
        return new C6670h(j10, this.f56290h, f(this.f56291i, this.f56284b.k()), this.f56291i, z10);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ C6678p[] k() {
        return new C6678p[]{new C8783h()};
    }

    private void l(long j10, boolean z10) {
        if (!this.f56294l) {
            boolean z11 = false;
            boolean z12 = (this.f56283a & 1) != 0 && this.f56291i > 0;
            if (!z12 || this.f56284b.k() != -9223372036854775807L || z10) {
                if (!z12 || this.f56284b.k() == -9223372036854775807L) {
                    this.f56288f.n(new J.b(-9223372036854775807L));
                } else {
                    r rVar = this.f56288f;
                    if ((this.f56283a & 2) != 0) {
                        z11 = true;
                    }
                    rVar.n(g(j10, z11));
                }
                this.f56294l = true;
            }
        }
    }

    private int m(C6679q qVar) {
        int i10 = 0;
        while (true) {
            qVar.o(this.f56286d.e(), 0, 10);
            this.f56286d.W(0);
            if (this.f56286d.K() != 4801587) {
                break;
            }
            this.f56286d.X(3);
            int G10 = this.f56286d.G();
            i10 += G10 + 10;
            qVar.i(G10);
        }
        qVar.f();
        qVar.i(i10);
        if (this.f56290h == -1) {
            this.f56290h = (long) i10;
        }
        return i10;
    }

    public void a(long j10, long j11) {
        this.f56293k = false;
        this.f56284b.c();
        this.f56289g = j11;
    }

    public void b(r rVar) {
        this.f56288f = rVar;
        this.f56284b.d(rVar, new L.d(0, 1));
        rVar.r();
    }

    public boolean h(C6679q qVar) {
        int m10 = m(qVar);
        int i10 = m10;
        int i11 = 0;
        int i12 = 0;
        do {
            qVar.o(this.f56286d.e(), 0, 2);
            this.f56286d.W(0);
            if (!C8784i.m(this.f56286d.P())) {
                i10++;
                qVar.f();
                qVar.i(i10);
            } else {
                i11++;
                if (i11 >= 4 && i12 > 188) {
                    return true;
                }
                qVar.o(this.f56286d.e(), 0, 4);
                this.f56287e.p(14);
                int h10 = this.f56287e.h(13);
                if (h10 <= 6) {
                    i10++;
                    qVar.f();
                    qVar.i(i10);
                } else {
                    qVar.i(h10 - 6);
                    i12 += h10;
                }
            }
            i11 = 0;
            i12 = 0;
        } while (i10 - m10 < 8192);
        return false;
    }

    public int j(C6679q qVar, I i10) {
        C5950a.i(this.f56288f);
        long length = qVar.getLength();
        int i11 = this.f56283a;
        if (!((i11 & 2) == 0 && ((i11 & 1) == 0 || length == -1))) {
            e(qVar);
        }
        int c10 = qVar.c(this.f56285c.e(), 0, RecyclerView.n.FLAG_MOVED);
        boolean z10 = c10 == -1;
        l(length, z10);
        if (z10) {
            return -1;
        }
        this.f56285c.W(0);
        this.f56285c.V(c10);
        if (!this.f56293k) {
            this.f56284b.f(this.f56289g, 4);
            this.f56293k = true;
        }
        this.f56284b.a(this.f56285c);
        return 0;
    }

    public void release() {
    }

    public C8783h(int i10) {
        this.f56283a = (i10 & 2) != 0 ? i10 | 1 : i10;
        this.f56284b = new C8784i(true);
        this.f56285c = new B((int) RecyclerView.n.FLAG_MOVED);
        this.f56291i = -1;
        this.f56290h = -1;
        B b10 = new B(10);
        this.f56286d = b10;
        this.f56287e = new A(b10.e());
    }
}
