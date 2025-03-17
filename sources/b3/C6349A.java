package B3;

import android.media.AudioTrack;
import java.lang.reflect.Method;
import t3.C5950a;
import t3.C5953d;
import t3.N;

/* renamed from: B3.A  reason: case insensitive filesystem */
final class C6349A {

    /* renamed from: A  reason: collision with root package name */
    private long f32821A;

    /* renamed from: B  reason: collision with root package name */
    private long f32822B;

    /* renamed from: C  reason: collision with root package name */
    private long f32823C;

    /* renamed from: D  reason: collision with root package name */
    private long f32824D;

    /* renamed from: E  reason: collision with root package name */
    private boolean f32825E;

    /* renamed from: F  reason: collision with root package name */
    private long f32826F;

    /* renamed from: G  reason: collision with root package name */
    private long f32827G;

    /* renamed from: H  reason: collision with root package name */
    private boolean f32828H;

    /* renamed from: I  reason: collision with root package name */
    private long f32829I;

    /* renamed from: J  reason: collision with root package name */
    private C5953d f32830J;

    /* renamed from: a  reason: collision with root package name */
    private final a f32831a;

    /* renamed from: b  reason: collision with root package name */
    private final long[] f32832b;

    /* renamed from: c  reason: collision with root package name */
    private AudioTrack f32833c;

    /* renamed from: d  reason: collision with root package name */
    private int f32834d;

    /* renamed from: e  reason: collision with root package name */
    private int f32835e;

    /* renamed from: f  reason: collision with root package name */
    private C6376z f32836f;

    /* renamed from: g  reason: collision with root package name */
    private int f32837g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f32838h;

    /* renamed from: i  reason: collision with root package name */
    private long f32839i;

    /* renamed from: j  reason: collision with root package name */
    private float f32840j;

    /* renamed from: k  reason: collision with root package name */
    private boolean f32841k;

    /* renamed from: l  reason: collision with root package name */
    private long f32842l;

    /* renamed from: m  reason: collision with root package name */
    private long f32843m;

    /* renamed from: n  reason: collision with root package name */
    private Method f32844n;

    /* renamed from: o  reason: collision with root package name */
    private long f32845o;

    /* renamed from: p  reason: collision with root package name */
    private boolean f32846p;

    /* renamed from: q  reason: collision with root package name */
    private boolean f32847q;

    /* renamed from: r  reason: collision with root package name */
    private long f32848r;

    /* renamed from: s  reason: collision with root package name */
    private long f32849s;

    /* renamed from: t  reason: collision with root package name */
    private long f32850t;

    /* renamed from: u  reason: collision with root package name */
    private long f32851u;

    /* renamed from: v  reason: collision with root package name */
    private long f32852v;

    /* renamed from: w  reason: collision with root package name */
    private int f32853w;

    /* renamed from: x  reason: collision with root package name */
    private int f32854x;

    /* renamed from: y  reason: collision with root package name */
    private long f32855y;

    /* renamed from: z  reason: collision with root package name */
    private long f32856z;

    /* renamed from: B3.A$a */
    public interface a {
        void a(int i10, long j10);

        void b(long j10);

        void c(long j10, long j11, long j12, long j13);

        void d(long j10, long j11, long j12, long j13);

        void e(long j10);
    }

    public C6349A(a aVar) {
        this.f32831a = (a) C5950a.e(aVar);
        try {
            this.f32844n = AudioTrack.class.getMethod("getLatency", (Class[]) null);
        } catch (NoSuchMethodException unused) {
        }
        this.f32832b = new long[10];
        this.f32830J = C5953d.f29483a;
    }

    private boolean b() {
        return this.f32838h && ((AudioTrack) C5950a.e(this.f32833c)).getPlayState() == 2 && d() == 0;
    }

    private long d() {
        long c10 = this.f32830J.c();
        if (this.f32855y == -9223372036854775807L) {
            if (c10 - this.f32849s >= 5) {
                v(c10);
                this.f32849s = c10;
            }
            return this.f32850t + this.f32829I + (this.f32851u << 32);
        } else if (((AudioTrack) C5950a.e(this.f32833c)).getPlayState() == 2) {
            return this.f32821A;
        } else {
            return Math.min(this.f32822B, this.f32821A + N.F(N.d0(N.P0(c10) - this.f32855y, this.f32840j), this.f32837g));
        }
    }

    private long e() {
        return N.Y0(d(), this.f32837g);
    }

    private void k(long j10) {
        C6376z zVar = (C6376z) C5950a.e(this.f32836f);
        if (zVar.f(j10)) {
            long d10 = zVar.d();
            long c10 = zVar.c();
            long e10 = e();
            if (Math.abs(d10 - j10) > 5000000) {
                this.f32831a.d(c10, d10, j10, e10);
                zVar.g();
            } else if (Math.abs(N.Y0(c10, this.f32837g) - e10) > 5000000) {
                this.f32831a.c(c10, d10, j10, e10);
                zVar.g();
            } else {
                zVar.a();
            }
        }
    }

    private void l() {
        long b10 = this.f32830J.b() / 1000;
        if (b10 - this.f32843m >= 30000) {
            long e10 = e();
            if (e10 != 0) {
                this.f32832b[this.f32853w] = N.i0(e10, this.f32840j) - b10;
                this.f32853w = (this.f32853w + 1) % 10;
                int i10 = this.f32854x;
                if (i10 < 10) {
                    this.f32854x = i10 + 1;
                }
                this.f32843m = b10;
                this.f32842l = 0;
                int i11 = 0;
                while (true) {
                    int i12 = this.f32854x;
                    if (i11 >= i12) {
                        break;
                    }
                    this.f32842l += this.f32832b[i11] / ((long) i12);
                    i11++;
                }
            } else {
                return;
            }
        }
        if (!this.f32838h) {
            k(b10);
            m(b10);
        }
    }

    private void m(long j10) {
        Method method;
        if (this.f32847q && (method = this.f32844n) != null && j10 - this.f32848r >= 500000) {
            try {
                long intValue = (((long) ((Integer) N.i((Integer) method.invoke(C5950a.e(this.f32833c), (Object[]) null))).intValue()) * 1000) - this.f32839i;
                this.f32845o = intValue;
                long max = Math.max(intValue, 0);
                this.f32845o = max;
                if (max > 5000000) {
                    this.f32831a.b(max);
                    this.f32845o = 0;
                }
            } catch (Exception unused) {
                this.f32844n = null;
            }
            this.f32848r = j10;
        }
    }

    private static boolean n(int i10) {
        return N.f29462a < 23 && (i10 == 5 || i10 == 6);
    }

    private void q() {
        this.f32842l = 0;
        this.f32854x = 0;
        this.f32853w = 0;
        this.f32843m = 0;
        this.f32824D = 0;
        this.f32827G = 0;
        this.f32841k = false;
    }

    private void v(long j10) {
        AudioTrack audioTrack = (AudioTrack) C5950a.e(this.f32833c);
        int playState = audioTrack.getPlayState();
        if (playState != 1) {
            long playbackHeadPosition = ((long) audioTrack.getPlaybackHeadPosition()) & 4294967295L;
            if (this.f32838h) {
                if (playState == 2 && playbackHeadPosition == 0) {
                    this.f32852v = this.f32850t;
                }
                playbackHeadPosition += this.f32852v;
            }
            if (N.f29462a <= 29) {
                if (playbackHeadPosition != 0 || this.f32850t <= 0 || playState != 3) {
                    this.f32856z = -9223372036854775807L;
                } else if (this.f32856z == -9223372036854775807L) {
                    this.f32856z = j10;
                    return;
                } else {
                    return;
                }
            }
            long j11 = this.f32850t;
            if (j11 > playbackHeadPosition) {
                if (this.f32828H) {
                    this.f32829I += j11;
                    this.f32828H = false;
                } else {
                    this.f32851u++;
                }
            }
            this.f32850t = playbackHeadPosition;
        }
    }

    public void a() {
        this.f32828H = true;
        C6376z zVar = this.f32836f;
        if (zVar != null) {
            zVar.b();
        }
    }

    public long c(boolean z10) {
        long j10;
        if (((AudioTrack) C5950a.e(this.f32833c)).getPlayState() == 3) {
            l();
        }
        long b10 = this.f32830J.b() / 1000;
        C6376z zVar = (C6376z) C5950a.e(this.f32836f);
        boolean e10 = zVar.e();
        if (e10) {
            j10 = N.Y0(zVar.c(), this.f32837g) + N.d0(b10 - zVar.d(), this.f32840j);
        } else {
            j10 = this.f32854x == 0 ? e() : N.d0(this.f32842l + b10, this.f32840j);
            if (!z10) {
                j10 = Math.max(0, j10 - this.f32845o);
            }
        }
        if (this.f32825E != e10) {
            this.f32827G = this.f32824D;
            this.f32826F = this.f32823C;
        }
        long j11 = b10 - this.f32827G;
        if (j11 < 1000000) {
            long j12 = (j11 * 1000) / 1000000;
            j10 = ((j10 * j12) + ((1000 - j12) * (this.f32826F + N.d0(j11, this.f32840j)))) / 1000;
        }
        if (!this.f32841k) {
            long j13 = this.f32823C;
            if (j10 > j13) {
                this.f32841k = true;
                this.f32831a.e(this.f32830J.a() - N.q1(N.i0(N.q1(j10 - j13), this.f32840j)));
            }
        }
        this.f32824D = b10;
        this.f32823C = j10;
        this.f32825E = e10;
        return j10;
    }

    public void f(long j10) {
        this.f32821A = d();
        this.f32855y = N.P0(this.f32830J.c());
        this.f32822B = j10;
    }

    public boolean g(long j10) {
        return j10 > N.F(c(false), this.f32837g) || b();
    }

    public boolean h() {
        return ((AudioTrack) C5950a.e(this.f32833c)).getPlayState() == 3;
    }

    public boolean i(long j10) {
        return this.f32856z != -9223372036854775807L && j10 > 0 && this.f32830J.c() - this.f32856z >= 200;
    }

    public boolean j(long j10) {
        int playState = ((AudioTrack) C5950a.e(this.f32833c)).getPlayState();
        if (this.f32838h) {
            if (playState == 2) {
                this.f32846p = false;
                return false;
            } else if (playState == 1 && d() == 0) {
                return false;
            }
        }
        boolean z10 = this.f32846p;
        boolean g10 = g(j10);
        this.f32846p = g10;
        if (z10 && !g10 && playState != 1) {
            this.f32831a.a(this.f32835e, N.q1(this.f32839i));
        }
        return true;
    }

    public boolean o() {
        q();
        if (this.f32855y == -9223372036854775807L) {
            ((C6376z) C5950a.e(this.f32836f)).h();
            return true;
        }
        this.f32821A = d();
        return false;
    }

    public void p() {
        q();
        this.f32833c = null;
        this.f32836f = null;
    }

    public void r(AudioTrack audioTrack, boolean z10, int i10, int i11, int i12) {
        this.f32833c = audioTrack;
        this.f32834d = i11;
        this.f32835e = i12;
        this.f32836f = new C6376z(audioTrack);
        this.f32837g = audioTrack.getSampleRate();
        this.f32838h = z10 && n(i10);
        boolean E02 = N.E0(i10);
        this.f32847q = E02;
        this.f32839i = E02 ? N.Y0((long) (i12 / i11), this.f32837g) : -9223372036854775807L;
        this.f32850t = 0;
        this.f32851u = 0;
        this.f32828H = false;
        this.f32829I = 0;
        this.f32852v = 0;
        this.f32846p = false;
        this.f32855y = -9223372036854775807L;
        this.f32856z = -9223372036854775807L;
        this.f32848r = 0;
        this.f32845o = 0;
        this.f32840j = 1.0f;
    }

    public void s(float f10) {
        this.f32840j = f10;
        C6376z zVar = this.f32836f;
        if (zVar != null) {
            zVar.h();
        }
        q();
    }

    public void t(C5953d dVar) {
        this.f32830J = dVar;
    }

    public void u() {
        if (this.f32855y != -9223372036854775807L) {
            this.f32855y = N.P0(this.f32830J.c());
        }
        ((C6376z) C5950a.e(this.f32836f)).h();
    }
}
