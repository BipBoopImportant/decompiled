package androidx.media3.exoplayer;

import A3.v1;
import G3.C6479C;
import G3.k0;
import I3.x;
import J3.C6569b;
import J3.C6573f;
import androidx.media3.exoplayer.X;
import com.google.ar.core.ImageMetadata;
import java.util.HashMap;
import q3.J;
import t3.C5950a;
import t3.N;
import t3.q;

/* renamed from: androidx.media3.exoplayer.g  reason: case insensitive filesystem */
public class C5230g implements X {

    /* renamed from: b  reason: collision with root package name */
    private final C6573f f22738b;

    /* renamed from: c  reason: collision with root package name */
    private final long f22739c;

    /* renamed from: d  reason: collision with root package name */
    private final long f22740d;

    /* renamed from: e  reason: collision with root package name */
    private final long f22741e;

    /* renamed from: f  reason: collision with root package name */
    private final long f22742f;

    /* renamed from: g  reason: collision with root package name */
    private final int f22743g;

    /* renamed from: h  reason: collision with root package name */
    private final boolean f22744h;

    /* renamed from: i  reason: collision with root package name */
    private final long f22745i;

    /* renamed from: j  reason: collision with root package name */
    private final boolean f22746j;

    /* renamed from: k  reason: collision with root package name */
    private final HashMap<v1, b> f22747k;

    /* renamed from: l  reason: collision with root package name */
    private long f22748l;

    /* renamed from: androidx.media3.exoplayer.g$b */
    private static class b {

        /* renamed from: a  reason: collision with root package name */
        public boolean f22749a;

        /* renamed from: b  reason: collision with root package name */
        public int f22750b;

        private b() {
        }
    }

    public C5230g() {
        this(new C6573f(true, ImageMetadata.CONTROL_AE_ANTIBANDING_MODE), 50000, 50000, 2500, 5000, -1, false, 0, false);
    }

    private static void s(int i10, int i11, String str, String str2) {
        boolean z10 = i10 >= i11;
        C5950a.b(z10, str + " cannot be less than " + str2);
    }

    private static int v(int i10) {
        switch (i10) {
            case -2:
                return 0;
            case -1:
                return 13107200;
            case 0:
                return 144310272;
            case 1:
                return 13107200;
            case 2:
                return 131072000;
            case 3:
            case 4:
            case 5:
            case 6:
                return 131072;
            default:
                throw new IllegalArgumentException();
        }
    }

    private void w(v1 v1Var) {
        if (this.f22747k.remove(v1Var) != null) {
            y();
        }
    }

    private void x(v1 v1Var) {
        b bVar = (b) C5950a.e(this.f22747k.get(v1Var));
        int i10 = this.f22743g;
        if (i10 == -1) {
            i10 = 13107200;
        }
        bVar.f22750b = i10;
        bVar.f22749a = false;
    }

    private void y() {
        if (this.f22747k.isEmpty()) {
            this.f22738b.g();
        } else {
            this.f22738b.h(u());
        }
    }

    public boolean a(X.a aVar) {
        long i02 = N.i0(aVar.f22613e, aVar.f22614f);
        long j10 = aVar.f22616h ? this.f22742f : this.f22741e;
        long j11 = aVar.f22617i;
        if (j11 != -9223372036854775807L) {
            j10 = Math.min(j11 / 2, j10);
        }
        return j10 <= 0 || i02 >= j10 || (!this.f22744h && this.f22738b.f() >= u());
    }

    public void c(v1 v1Var) {
        w(v1Var);
    }

    public void d(v1 v1Var) {
        w(v1Var);
        if (this.f22747k.isEmpty()) {
            this.f22748l = -1;
        }
    }

    public void g(v1 v1Var) {
        long id2 = Thread.currentThread().getId();
        long j10 = this.f22748l;
        C5950a.h(j10 == -1 || j10 == id2, "Players that share the same LoadControl must share the same playback thread. See ExoPlayer.Builder.setPlaybackLooper(Looper).");
        this.f22748l = id2;
        if (!this.f22747k.containsKey(v1Var)) {
            this.f22747k.put(v1Var, new b());
        }
        x(v1Var);
    }

    public C6569b i() {
        return this.f22738b;
    }

    public boolean l(X.a aVar) {
        b bVar = (b) C5950a.e(this.f22747k.get(aVar.f22609a));
        boolean z10 = true;
        boolean z11 = this.f22738b.f() >= u();
        long j10 = this.f22739c;
        float f10 = aVar.f22614f;
        if (f10 > 1.0f) {
            j10 = Math.min(N.d0(j10, f10), this.f22740d);
        }
        long max = Math.max(j10, 500000);
        long j11 = aVar.f22613e;
        if (j11 < max) {
            if (!this.f22744h && z11) {
                z10 = false;
            }
            bVar.f22749a = z10;
            if (!z10 && j11 < 500000) {
                q.h("DefaultLoadControl", "Target buffer size reached with less than 500ms of buffered media data.");
            }
        } else if (j11 >= this.f22740d || z11) {
            bVar.f22749a = false;
        }
        return bVar.f22749a;
    }

    public void m(X.a aVar, k0 k0Var, x[] xVarArr) {
        b bVar = (b) C5950a.e(this.f22747k.get(aVar.f22609a));
        int i10 = this.f22743g;
        if (i10 == -1) {
            i10 = t(xVarArr);
        }
        bVar.f22750b = i10;
        y();
    }

    public long n(v1 v1Var) {
        return this.f22745i;
    }

    public boolean o(J j10, C6479C.b bVar, long j11) {
        for (b bVar2 : this.f22747k.values()) {
            if (bVar2.f22749a) {
                return false;
            }
        }
        return true;
    }

    public boolean p(v1 v1Var) {
        return this.f22746j;
    }

    /* access modifiers changed from: protected */
    public int t(x[] xVarArr) {
        int i10 = 0;
        for (x xVar : xVarArr) {
            if (xVar != null) {
                i10 += v(xVar.h().f27945c);
            }
        }
        return Math.max(13107200, i10);
    }

    /* access modifiers changed from: package-private */
    public int u() {
        int i10 = 0;
        for (b bVar : this.f22747k.values()) {
            i10 += bVar.f22750b;
        }
        return i10;
    }

    protected C5230g(C6573f fVar, int i10, int i11, int i12, int i13, int i14, boolean z10, int i15, boolean z11) {
        s(i12, 0, "bufferForPlaybackMs", "0");
        s(i13, 0, "bufferForPlaybackAfterRebufferMs", "0");
        s(i10, i12, "minBufferMs", "bufferForPlaybackMs");
        s(i10, i13, "minBufferMs", "bufferForPlaybackAfterRebufferMs");
        s(i11, i10, "maxBufferMs", "minBufferMs");
        s(i15, 0, "backBufferDurationMs", "0");
        this.f22738b = fVar;
        this.f22739c = N.P0((long) i10);
        this.f22740d = N.P0((long) i11);
        this.f22741e = N.P0((long) i12);
        this.f22742f = N.P0((long) i13);
        this.f22743g = i14;
        this.f22744h = z10;
        this.f22745i = N.P0((long) i15);
        this.f22746j = z11;
        this.f22747k = new HashMap<>();
        this.f22748l = -1;
    }
}
