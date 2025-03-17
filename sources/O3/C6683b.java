package O3;

import N3.C6659E;
import N3.C6670h;
import N3.C6675m;
import N3.C6678p;
import N3.C6679q;
import N3.I;
import N3.J;
import N3.O;
import N3.r;
import N3.u;
import java.io.EOFException;
import java.util.Arrays;
import q3.B;
import q3.C5807s;
import t3.C5950a;
import t3.N;

/* renamed from: O3.b  reason: case insensitive filesystem */
public final class C6683b implements C6678p {

    /* renamed from: s  reason: collision with root package name */
    public static final u f39196s = new C6682a();

    /* renamed from: t  reason: collision with root package name */
    private static final int[] f39197t = {13, 14, 16, 18, 20, 21, 27, 32, 6, 7, 6, 6, 1, 1, 1, 1};

    /* renamed from: u  reason: collision with root package name */
    private static final int[] f39198u = {18, 24, 33, 37, 41, 47, 51, 59, 61, 6, 1, 1, 1, 1, 1, 1};

    /* renamed from: v  reason: collision with root package name */
    private static final byte[] f39199v = N.s0("#!AMR\n");

    /* renamed from: w  reason: collision with root package name */
    private static final byte[] f39200w = N.s0("#!AMR-WB\n");

    /* renamed from: a  reason: collision with root package name */
    private final byte[] f39201a;

    /* renamed from: b  reason: collision with root package name */
    private final int f39202b;

    /* renamed from: c  reason: collision with root package name */
    private final O f39203c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f39204d;

    /* renamed from: e  reason: collision with root package name */
    private long f39205e;

    /* renamed from: f  reason: collision with root package name */
    private int f39206f;

    /* renamed from: g  reason: collision with root package name */
    private int f39207g;

    /* renamed from: h  reason: collision with root package name */
    private long f39208h;

    /* renamed from: i  reason: collision with root package name */
    private int f39209i;

    /* renamed from: j  reason: collision with root package name */
    private int f39210j;

    /* renamed from: k  reason: collision with root package name */
    private long f39211k;

    /* renamed from: l  reason: collision with root package name */
    private r f39212l;

    /* renamed from: m  reason: collision with root package name */
    private O f39213m;

    /* renamed from: n  reason: collision with root package name */
    private O f39214n;

    /* renamed from: o  reason: collision with root package name */
    private J f39215o;

    /* renamed from: p  reason: collision with root package name */
    private boolean f39216p;

    /* renamed from: q  reason: collision with root package name */
    private long f39217q;

    /* renamed from: r  reason: collision with root package name */
    private boolean f39218r;

    public C6683b() {
        this(0);
    }

    private void e() {
        C5950a.i(this.f39213m);
        N.i(this.f39212l);
    }

    private static int f(int i10, long j10) {
        return (int) ((((long) i10) * 8000000) / j10);
    }

    private J g(long j10, boolean z10) {
        return new C6670h(j10, this.f39208h, f(this.f39209i, 20000), this.f39209i, z10);
    }

    private int k(int i10) {
        if (n(i10)) {
            return this.f39204d ? f39198u[i10] : f39197t[i10];
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Illegal AMR ");
        sb2.append(this.f39204d ? "WB" : "NB");
        sb2.append(" frame type ");
        sb2.append(i10);
        throw B.a(sb2.toString(), (Throwable) null);
    }

    private boolean l(int i10) {
        return !this.f39204d && (i10 < 12 || i10 > 14);
    }

    private boolean m(long j10, long j11) {
        return Math.abs(j11 - j10) < 20000;
    }

    private boolean n(int i10) {
        return i10 >= 0 && i10 <= 15 && (o(i10) || l(i10));
    }

    private boolean o(int i10) {
        return this.f39204d && (i10 < 10 || i10 > 13);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ C6678p[] p() {
        return new C6678p[]{new C6683b()};
    }

    private void q() {
        if (!this.f39218r) {
            this.f39218r = true;
            boolean z10 = this.f39204d;
            this.f39214n.e(new C5807s.b().s0(z10 ? "audio/amr-wb" : "audio/3gpp").j0(z10 ? f39198u[8] : f39197t[7]).Q(1).t0(z10 ? 16000 : 8000).M());
        }
    }

    private void r(long j10, int i10) {
        int i11;
        boolean z10 = false;
        if (this.f39215o == null) {
            int i12 = this.f39202b;
            if ((i12 & 4) != 0) {
                this.f39215o = new C6659E(new long[]{this.f39208h}, new long[]{0}, -9223372036854775807L);
            } else if ((i12 & 1) == 0 || !((i11 = this.f39209i) == -1 || i11 == this.f39206f)) {
                this.f39215o = new J.b(-9223372036854775807L);
            } else if (this.f39210j >= 20 || i10 == -1) {
                if ((i12 & 2) != 0) {
                    z10 = true;
                }
                this.f39215o = g(j10, z10);
            }
            J j11 = this.f39215o;
            if (j11 != null) {
                this.f39212l.n(j11);
            }
        }
    }

    private static boolean s(C6679q qVar, byte[] bArr) {
        qVar.f();
        byte[] bArr2 = new byte[bArr.length];
        qVar.o(bArr2, 0, bArr.length);
        return Arrays.equals(bArr2, bArr);
    }

    private int t(C6679q qVar) {
        qVar.f();
        qVar.o(this.f39201a, 0, 1);
        byte b10 = this.f39201a[0];
        if ((b10 & 131) <= 0) {
            return k((b10 >> 3) & 15);
        }
        throw B.a("Invalid padding bits for frame header " + b10, (Throwable) null);
    }

    private boolean u(C6679q qVar) {
        byte[] bArr = f39199v;
        if (s(qVar, bArr)) {
            this.f39204d = false;
            qVar.k(bArr.length);
            return true;
        }
        byte[] bArr2 = f39200w;
        if (!s(qVar, bArr2)) {
            return false;
        }
        this.f39204d = true;
        qVar.k(bArr2.length);
        return true;
    }

    private int v(C6679q qVar) {
        if (this.f39207g == 0) {
            try {
                int t10 = t(qVar);
                this.f39206f = t10;
                this.f39207g = t10;
                if (this.f39209i == -1) {
                    this.f39208h = qVar.getPosition();
                    this.f39209i = this.f39206f;
                }
                if (this.f39209i == this.f39206f) {
                    this.f39210j++;
                }
                J j10 = this.f39215o;
                if (j10 instanceof C6659E) {
                    C6659E e10 = (C6659E) j10;
                    long j11 = this.f39211k + this.f39205e + 20000;
                    long position = qVar.getPosition() + ((long) this.f39206f);
                    if (!e10.b(j11, 100000)) {
                        e10.a(j11, position);
                    }
                    if (this.f39216p && m(j11, this.f39217q)) {
                        this.f39216p = false;
                        this.f39214n = this.f39213m;
                    }
                }
            } catch (EOFException unused) {
                return -1;
            }
        }
        int d10 = this.f39214n.d(qVar, this.f39207g, true);
        if (d10 == -1) {
            return -1;
        }
        int i10 = this.f39207g - d10;
        this.f39207g = i10;
        if (i10 > 0) {
            return 0;
        }
        this.f39214n.c(this.f39211k + this.f39205e, 1, this.f39206f, 0, (O.a) null);
        this.f39205e += 20000;
        return 0;
    }

    public void a(long j10, long j11) {
        this.f39205e = 0;
        this.f39206f = 0;
        this.f39207g = 0;
        this.f39217q = j11;
        J j12 = this.f39215o;
        if (j12 instanceof C6659E) {
            long g10 = ((C6659E) j12).g(j10);
            this.f39211k = g10;
            if (!m(g10, this.f39217q)) {
                this.f39216p = true;
                this.f39214n = this.f39203c;
            }
        } else if (j10 == 0 || !(j12 instanceof C6670h)) {
            this.f39211k = 0;
        } else {
            this.f39211k = ((C6670h) j12).b(j10);
        }
    }

    public void b(r rVar) {
        this.f39212l = rVar;
        O t10 = rVar.t(0, 1);
        this.f39213m = t10;
        this.f39214n = t10;
        rVar.r();
    }

    public boolean h(C6679q qVar) {
        return u(qVar);
    }

    public int j(C6679q qVar, I i10) {
        e();
        if (qVar.getPosition() != 0 || u(qVar)) {
            q();
            int v10 = v(qVar);
            r(qVar.getLength(), v10);
            if (v10 == -1) {
                J j10 = this.f39215o;
                if (j10 instanceof C6659E) {
                    ((C6659E) j10).d(this.f39211k + this.f39205e);
                    this.f39212l.n(this.f39215o);
                }
            }
            return v10;
        }
        throw B.a("Could not find AMR header.", (Throwable) null);
    }

    public void release() {
    }

    public C6683b(int i10) {
        this.f39202b = (i10 & 2) != 0 ? i10 | 1 : i10;
        this.f39201a = new byte[1];
        this.f39209i = -1;
        C6675m mVar = new C6675m();
        this.f39203c = mVar;
        this.f39214n = mVar;
    }
}
