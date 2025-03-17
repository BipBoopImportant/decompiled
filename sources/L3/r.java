package L3;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.view.Choreographer;
import android.view.Display;
import android.view.Surface;
import t3.C5950a;
import t3.N;
import t3.q;

public final class r {

    /* renamed from: a  reason: collision with root package name */
    private final C6637b f38209a = new C6637b();

    /* renamed from: b  reason: collision with root package name */
    private final b f38210b;

    /* renamed from: c  reason: collision with root package name */
    private final c f38211c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f38212d;

    /* renamed from: e  reason: collision with root package name */
    private Surface f38213e;

    /* renamed from: f  reason: collision with root package name */
    private float f38214f;

    /* renamed from: g  reason: collision with root package name */
    private float f38215g;

    /* renamed from: h  reason: collision with root package name */
    private float f38216h;

    /* renamed from: i  reason: collision with root package name */
    private float f38217i;

    /* renamed from: j  reason: collision with root package name */
    private int f38218j;

    /* renamed from: k  reason: collision with root package name */
    private long f38219k;

    /* renamed from: l  reason: collision with root package name */
    private long f38220l;

    /* renamed from: m  reason: collision with root package name */
    private long f38221m;

    /* renamed from: n  reason: collision with root package name */
    private long f38222n;

    /* renamed from: o  reason: collision with root package name */
    private long f38223o;

    /* renamed from: p  reason: collision with root package name */
    private long f38224p;

    /* renamed from: q  reason: collision with root package name */
    private long f38225q;

    private static final class a {
        public static void a(Surface surface, float f10) {
            try {
                surface.setFrameRate(f10, f10 == 0.0f ? 0 : 1);
            } catch (IllegalStateException e10) {
                q.d("VideoFrameReleaseHelper", "Failed to call Surface.setFrameRate", e10);
            }
        }
    }

    private final class b implements DisplayManager.DisplayListener {

        /* renamed from: a  reason: collision with root package name */
        private final DisplayManager f38226a;

        public b(DisplayManager displayManager) {
            this.f38226a = displayManager;
        }

        private Display a() {
            return this.f38226a.getDisplay(0);
        }

        public void b() {
            this.f38226a.registerDisplayListener(this, N.A());
            r.this.p(a());
        }

        public void c() {
            this.f38226a.unregisterDisplayListener(this);
        }

        public void onDisplayAdded(int i10) {
        }

        public void onDisplayChanged(int i10) {
            if (i10 == 0) {
                r.this.p(a());
            }
        }

        public void onDisplayRemoved(int i10) {
        }
    }

    private static final class c implements Choreographer.FrameCallback, Handler.Callback {

        /* renamed from: f  reason: collision with root package name */
        private static final c f38228f = new c();

        /* renamed from: a  reason: collision with root package name */
        public volatile long f38229a = -9223372036854775807L;

        /* renamed from: b  reason: collision with root package name */
        private final Handler f38230b;

        /* renamed from: c  reason: collision with root package name */
        private final HandlerThread f38231c;

        /* renamed from: d  reason: collision with root package name */
        private Choreographer f38232d;

        /* renamed from: e  reason: collision with root package name */
        private int f38233e;

        private c() {
            HandlerThread handlerThread = new HandlerThread("ExoPlayer:FrameReleaseChoreographer");
            this.f38231c = handlerThread;
            handlerThread.start();
            Handler z10 = N.z(handlerThread.getLooper(), this);
            this.f38230b = z10;
            z10.sendEmptyMessage(1);
        }

        private void b() {
            Choreographer choreographer = this.f38232d;
            if (choreographer != null) {
                int i10 = this.f38233e + 1;
                this.f38233e = i10;
                if (i10 == 1) {
                    choreographer.postFrameCallback(this);
                }
            }
        }

        private void c() {
            try {
                this.f38232d = Choreographer.getInstance();
            } catch (RuntimeException e10) {
                q.i("VideoFrameReleaseHelper", "Vsync sampling disabled due to platform error", e10);
            }
        }

        public static c d() {
            return f38228f;
        }

        private void f() {
            Choreographer choreographer = this.f38232d;
            if (choreographer != null) {
                int i10 = this.f38233e - 1;
                this.f38233e = i10;
                if (i10 == 0) {
                    choreographer.removeFrameCallback(this);
                    this.f38229a = -9223372036854775807L;
                }
            }
        }

        public void a() {
            this.f38230b.sendEmptyMessage(2);
        }

        public void doFrame(long j10) {
            this.f38229a = j10;
            ((Choreographer) C5950a.e(this.f38232d)).postFrameCallbackDelayed(this, 500);
        }

        public void e() {
            this.f38230b.sendEmptyMessage(3);
        }

        public boolean handleMessage(Message message) {
            int i10 = message.what;
            if (i10 == 1) {
                c();
                return true;
            } else if (i10 == 2) {
                b();
                return true;
            } else if (i10 != 3) {
                return false;
            } else {
                f();
                return true;
            }
        }
    }

    public r(Context context) {
        b f10 = f(context);
        this.f38210b = f10;
        this.f38211c = f10 != null ? c.d() : null;
        this.f38219k = -9223372036854775807L;
        this.f38220l = -9223372036854775807L;
        this.f38214f = -1.0f;
        this.f38217i = 1.0f;
        this.f38218j = 0;
    }

    private static boolean c(long j10, long j11) {
        return Math.abs(j10 - j11) <= 20000000;
    }

    private void d() {
        Surface surface;
        if (N.f29462a >= 30 && (surface = this.f38213e) != null && this.f38218j != Integer.MIN_VALUE && this.f38216h != 0.0f) {
            this.f38216h = 0.0f;
            a.a(surface, 0.0f);
        }
    }

    private static long e(long j10, long j11, long j12) {
        long j13;
        long j14 = j11 + (((j10 - j11) / j12) * j12);
        if (j10 <= j14) {
            j13 = j14 - j12;
        } else {
            long j15 = j14;
            j14 = j12 + j14;
            j13 = j15;
        }
        return j14 - j10 < j10 - j13 ? j14 : j13;
    }

    private b f(Context context) {
        DisplayManager displayManager;
        if (context == null || (displayManager = (DisplayManager) context.getSystemService("display")) == null) {
            return null;
        }
        return new b(displayManager);
    }

    private void n() {
        this.f38221m = 0;
        this.f38224p = -1;
        this.f38222n = -1;
    }

    /* access modifiers changed from: private */
    public void p(Display display) {
        if (display != null) {
            long refreshRate = (long) (1.0E9d / ((double) display.getRefreshRate()));
            this.f38219k = refreshRate;
            this.f38220l = (refreshRate * 80) / 100;
            return;
        }
        q.h("VideoFrameReleaseHelper", "Unable to query display refresh rate");
        this.f38219k = -9223372036854775807L;
        this.f38220l = -9223372036854775807L;
    }

    private void q() {
        if (N.f29462a >= 30 && this.f38213e != null) {
            float b10 = this.f38209a.e() ? this.f38209a.b() : this.f38214f;
            float f10 = this.f38215g;
            if (b10 != f10) {
                int i10 = (b10 > -1.0f ? 1 : (b10 == -1.0f ? 0 : -1));
                if (i10 != 0 && f10 != -1.0f) {
                    if (Math.abs(b10 - this.f38215g) < ((!this.f38209a.e() || this.f38209a.d() < 5000000000L) ? 1.0f : 0.02f)) {
                        return;
                    }
                } else if (i10 == 0 && this.f38209a.c() < 30) {
                    return;
                }
                this.f38215g = b10;
                r(false);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x002a A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x002b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void r(boolean r4) {
        /*
            r3 = this;
            int r0 = t3.N.f29462a
            r1 = 30
            if (r0 < r1) goto L_0x0030
            android.view.Surface r0 = r3.f38213e
            if (r0 == 0) goto L_0x0030
            int r1 = r3.f38218j
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r1 != r2) goto L_0x0011
            goto L_0x0030
        L_0x0011:
            boolean r1 = r3.f38212d
            if (r1 == 0) goto L_0x0021
            float r1 = r3.f38215g
            r2 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r2 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r2 == 0) goto L_0x0021
            float r2 = r3.f38217i
            float r1 = r1 * r2
            goto L_0x0022
        L_0x0021:
            r1 = 0
        L_0x0022:
            if (r4 != 0) goto L_0x002b
            float r4 = r3.f38216h
            int r4 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r4 != 0) goto L_0x002b
            return
        L_0x002b:
            r3.f38216h = r1
            L3.r.a.a(r0, r1)
        L_0x0030:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: L3.r.r(boolean):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0046  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0057 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public long b(long r11) {
        /*
            r10 = this;
            long r0 = r10.f38224p
            r2 = -1
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto L_0x002f
            L3.b r0 = r10.f38209a
            boolean r0 = r0.e()
            if (r0 == 0) goto L_0x002f
            L3.b r0 = r10.f38209a
            long r0 = r0.a()
            long r2 = r10.f38225q
            long r4 = r10.f38221m
            long r6 = r10.f38224p
            long r4 = r4 - r6
            long r0 = r0 * r4
            float r0 = (float) r0
            float r1 = r10.f38217i
            float r0 = r0 / r1
            long r0 = (long) r0
            long r2 = r2 + r0
            boolean r0 = c(r11, r2)
            if (r0 == 0) goto L_0x002c
            r4 = r2
            goto L_0x0030
        L_0x002c:
            r10.n()
        L_0x002f:
            r4 = r11
        L_0x0030:
            long r11 = r10.f38221m
            r10.f38222n = r11
            r10.f38223o = r4
            L3.r$c r11 = r10.f38211c
            if (r11 == 0) goto L_0x0057
            long r0 = r10.f38219k
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r12 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r12 != 0) goto L_0x0046
            goto L_0x0057
        L_0x0046:
            long r6 = r11.f38229a
            int r11 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r11 != 0) goto L_0x004d
            return r4
        L_0x004d:
            long r8 = r10.f38219k
            long r11 = e(r4, r6, r8)
            long r0 = r10.f38220l
            long r11 = r11 - r0
            return r11
        L_0x0057:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: L3.r.b(long):long");
    }

    public void g(float f10) {
        this.f38214f = f10;
        this.f38209a.g();
        q();
    }

    public void h(long j10) {
        long j11 = this.f38222n;
        if (j11 != -1) {
            this.f38224p = j11;
            this.f38225q = this.f38223o;
        }
        this.f38221m++;
        this.f38209a.f(j10 * 1000);
        q();
    }

    public void i(float f10) {
        this.f38217i = f10;
        n();
        r(false);
    }

    public void j() {
        n();
    }

    public void k() {
        this.f38212d = true;
        n();
        if (this.f38210b != null) {
            ((c) C5950a.e(this.f38211c)).a();
            this.f38210b.b();
        }
        r(false);
    }

    public void l() {
        this.f38212d = false;
        b bVar = this.f38210b;
        if (bVar != null) {
            bVar.c();
            ((c) C5950a.e(this.f38211c)).e();
        }
        d();
    }

    public void m(Surface surface) {
        if (this.f38213e != surface) {
            d();
            this.f38213e = surface;
            r(true);
        }
    }

    public void o(int i10) {
        if (this.f38218j != i10) {
            this.f38218j = i10;
            r(true);
        }
    }
}
