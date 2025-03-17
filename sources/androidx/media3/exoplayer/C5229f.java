package androidx.media3.exoplayer;

import android.os.SystemClock;
import nb.C10078h;
import q3.w;
import t3.N;
import z3.E;

/* renamed from: androidx.media3.exoplayer.f  reason: case insensitive filesystem */
public final class C5229f implements E {

    /* renamed from: a  reason: collision with root package name */
    private final float f22708a;

    /* renamed from: b  reason: collision with root package name */
    private final float f22709b;

    /* renamed from: c  reason: collision with root package name */
    private final long f22710c;

    /* renamed from: d  reason: collision with root package name */
    private final float f22711d;

    /* renamed from: e  reason: collision with root package name */
    private final long f22712e;

    /* renamed from: f  reason: collision with root package name */
    private final long f22713f;

    /* renamed from: g  reason: collision with root package name */
    private final float f22714g;

    /* renamed from: h  reason: collision with root package name */
    private long f22715h;

    /* renamed from: i  reason: collision with root package name */
    private long f22716i;

    /* renamed from: j  reason: collision with root package name */
    private long f22717j;

    /* renamed from: k  reason: collision with root package name */
    private long f22718k;

    /* renamed from: l  reason: collision with root package name */
    private long f22719l;

    /* renamed from: m  reason: collision with root package name */
    private long f22720m;

    /* renamed from: n  reason: collision with root package name */
    private float f22721n;

    /* renamed from: o  reason: collision with root package name */
    private float f22722o;

    /* renamed from: p  reason: collision with root package name */
    private float f22723p;

    /* renamed from: q  reason: collision with root package name */
    private long f22724q;

    /* renamed from: r  reason: collision with root package name */
    private long f22725r;

    /* renamed from: s  reason: collision with root package name */
    private long f22726s;

    /* renamed from: androidx.media3.exoplayer.f$b */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        private float f22727a = 0.97f;

        /* renamed from: b  reason: collision with root package name */
        private float f22728b = 1.03f;

        /* renamed from: c  reason: collision with root package name */
        private long f22729c = 1000;

        /* renamed from: d  reason: collision with root package name */
        private float f22730d = 1.0E-7f;

        /* renamed from: e  reason: collision with root package name */
        private long f22731e = N.P0(20);

        /* renamed from: f  reason: collision with root package name */
        private long f22732f = N.P0(500);

        /* renamed from: g  reason: collision with root package name */
        private float f22733g = 0.999f;

        public C5229f a() {
            return new C5229f(this.f22727a, this.f22728b, this.f22729c, this.f22730d, this.f22731e, this.f22732f, this.f22733g);
        }
    }

    private void f(long j10) {
        long j11 = this.f22725r + (this.f22726s * 3);
        if (this.f22720m > j11) {
            float P02 = (float) N.P0(this.f22710c);
            long j12 = ((long) ((this.f22723p - 1.0f) * P02)) + ((long) ((this.f22721n - 1.0f) * P02));
            this.f22720m = C10078h.b(j11, this.f22717j, this.f22720m - j12);
            return;
        }
        long q10 = N.q(j10 - ((long) (Math.max(0.0f, this.f22723p - 1.0f) / this.f22711d)), this.f22720m, j11);
        this.f22720m = q10;
        long j13 = this.f22719l;
        if (j13 != -9223372036854775807L && q10 > j13) {
            this.f22720m = j13;
        }
    }

    private void g() {
        long j10;
        long j11 = this.f22715h;
        if (j11 != -9223372036854775807L) {
            j10 = this.f22716i;
            if (j10 == -9223372036854775807L) {
                long j12 = this.f22718k;
                if (j12 != -9223372036854775807L && j11 < j12) {
                    j11 = j12;
                }
                j10 = this.f22719l;
                if (j10 == -9223372036854775807L || j11 <= j10) {
                    j10 = j11;
                }
            }
        } else {
            j10 = -9223372036854775807L;
        }
        if (this.f22717j != j10) {
            this.f22717j = j10;
            this.f22720m = j10;
            this.f22725r = -9223372036854775807L;
            this.f22726s = -9223372036854775807L;
            this.f22724q = -9223372036854775807L;
        }
    }

    private static long h(long j10, long j11, float f10) {
        return (long) ((((float) j10) * f10) + ((1.0f - f10) * ((float) j11)));
    }

    private void i(long j10, long j11) {
        long j12 = j10 - j11;
        long j13 = this.f22725r;
        if (j13 == -9223372036854775807L) {
            this.f22725r = j12;
            this.f22726s = 0;
            return;
        }
        long max = Math.max(j12, h(j13, j12, this.f22714g));
        this.f22725r = max;
        this.f22726s = h(this.f22726s, Math.abs(j12 - max), this.f22714g);
    }

    public void a(w.g gVar) {
        this.f22715h = N.P0(gVar.f28393a);
        this.f22718k = N.P0(gVar.f28394b);
        this.f22719l = N.P0(gVar.f28395c);
        float f10 = gVar.f28396d;
        if (f10 == -3.4028235E38f) {
            f10 = this.f22708a;
        }
        this.f22722o = f10;
        float f11 = gVar.f28397e;
        if (f11 == -3.4028235E38f) {
            f11 = this.f22709b;
        }
        this.f22721n = f11;
        if (f10 == 1.0f && f11 == 1.0f) {
            this.f22715h = -9223372036854775807L;
        }
        g();
    }

    public float b(long j10, long j11) {
        if (this.f22715h == -9223372036854775807L) {
            return 1.0f;
        }
        i(j10, j11);
        if (this.f22724q != -9223372036854775807L && SystemClock.elapsedRealtime() - this.f22724q < this.f22710c) {
            return this.f22723p;
        }
        this.f22724q = SystemClock.elapsedRealtime();
        f(j10);
        long j12 = j10 - this.f22720m;
        if (Math.abs(j12) < this.f22712e) {
            this.f22723p = 1.0f;
        } else {
            this.f22723p = N.o((this.f22711d * ((float) j12)) + 1.0f, this.f22722o, this.f22721n);
        }
        return this.f22723p;
    }

    public long c() {
        return this.f22720m;
    }

    public void d() {
        long j10 = this.f22720m;
        if (j10 != -9223372036854775807L) {
            long j11 = j10 + this.f22713f;
            this.f22720m = j11;
            long j12 = this.f22719l;
            if (j12 != -9223372036854775807L && j11 > j12) {
                this.f22720m = j12;
            }
            this.f22724q = -9223372036854775807L;
        }
    }

    public void e(long j10) {
        this.f22716i = j10;
        g();
    }

    private C5229f(float f10, float f11, long j10, float f12, long j11, long j12, float f13) {
        this.f22708a = f10;
        this.f22709b = f11;
        this.f22710c = j10;
        this.f22711d = f12;
        this.f22712e = j11;
        this.f22713f = j12;
        this.f22714g = f13;
        this.f22715h = -9223372036854775807L;
        this.f22716i = -9223372036854775807L;
        this.f22718k = -9223372036854775807L;
        this.f22719l = -9223372036854775807L;
        this.f22722o = f10;
        this.f22721n = f11;
        this.f22723p = 1.0f;
        this.f22724q = -9223372036854775807L;
        this.f22717j = -9223372036854775807L;
        this.f22720m = -9223372036854775807L;
        this.f22725r = -9223372036854775807L;
        this.f22726s = -9223372036854775807L;
    }
}
