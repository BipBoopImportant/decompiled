package androidx.media3.exoplayer;

import A3.C6298a;
import A3.C6300b;
import A3.t1;
import A3.v1;
import B3.C6374x;
import B3.C6375y;
import G3.C6479C;
import G3.C6505z;
import G3.c0;
import G3.k0;
import H3.h;
import I3.C;
import I3.D;
import J3.C6571d;
import L3.C6634D;
import L3.n;
import L3.o;
import M3.C6649a;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.media.AudioDeviceCallback;
import android.media.AudioDeviceInfo;
import android.media.AudioManager;
import android.media.MediaFormat;
import android.media.metrics.LogSessionId;
import android.os.Handler;
import android.os.Looper;
import android.util.Pair;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.TextureView;
import androidx.media3.exoplayer.C5223a;
import androidx.media3.exoplayer.C5227d;
import androidx.media3.exoplayer.ExoPlayer;
import androidx.media3.exoplayer.W;
import androidx.media3.exoplayer.image.ImageOutput;
import androidx.media3.exoplayer.q0;
import androidx.media3.exoplayer.s0;
import androidx.media3.exoplayer.video.spherical.SphericalGLSurfaceView;
import androidx.media3.exoplayer.w0;
import com.oppwa.mobile.connect.payment.processor.affirm.AffirmProcessorActivity;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.TimeoutException;
import kb.C9967v;
import q3.C5792c;
import q3.C5796g;
import q3.C5802m;
import q3.C5806q;
import q3.C5807s;
import q3.E;
import q3.G;
import q3.J;
import q3.M;
import q3.S;
import q3.u;
import q3.w;
import q3.x;
import q3.y;
import q3.z;
import t3.C5950a;
import t3.C5953d;
import t3.C5956g;
import t3.C5962m;
import t3.N;
import t3.p;
import t3.q;
import z3.B;
import z3.C6279b;
import z3.C6280c;

final class J extends C5796g implements ExoPlayer {

    /* renamed from: A  reason: collision with root package name */
    private final C5223a f22427A;

    /* renamed from: B  reason: collision with root package name */
    private final C5227d f22428B;

    /* renamed from: C  reason: collision with root package name */
    private final w0 f22429C;

    /* renamed from: D  reason: collision with root package name */
    private final z0 f22430D;

    /* renamed from: E  reason: collision with root package name */
    private final A0 f22431E;

    /* renamed from: F  reason: collision with root package name */
    private final long f22432F;

    /* renamed from: G  reason: collision with root package name */
    private AudioManager f22433G;

    /* renamed from: H  reason: collision with root package name */
    private final boolean f22434H;

    /* renamed from: I  reason: collision with root package name */
    private final y0 f22435I;

    /* renamed from: J  reason: collision with root package name */
    private int f22436J;

    /* renamed from: K  reason: collision with root package name */
    private boolean f22437K;

    /* renamed from: L  reason: collision with root package name */
    private int f22438L;

    /* renamed from: M  reason: collision with root package name */
    private int f22439M;

    /* renamed from: N  reason: collision with root package name */
    private boolean f22440N;

    /* renamed from: O  reason: collision with root package name */
    private z3.J f22441O;

    /* renamed from: P  reason: collision with root package name */
    private c0 f22442P;

    /* renamed from: Q  reason: collision with root package name */
    private ExoPlayer.c f22443Q;

    /* renamed from: R  reason: collision with root package name */
    private boolean f22444R;

    /* renamed from: S  reason: collision with root package name */
    private E.b f22445S;
    /* access modifiers changed from: private */

    /* renamed from: T  reason: collision with root package name */
    public y f22446T;

    /* renamed from: U  reason: collision with root package name */
    private y f22447U;
    /* access modifiers changed from: private */

    /* renamed from: V  reason: collision with root package name */
    public C5807s f22448V;
    /* access modifiers changed from: private */

    /* renamed from: W  reason: collision with root package name */
    public C5807s f22449W;
    /* access modifiers changed from: private */

    /* renamed from: X  reason: collision with root package name */
    public Object f22450X;

    /* renamed from: Y  reason: collision with root package name */
    private Surface f22451Y;

    /* renamed from: Z  reason: collision with root package name */
    private SurfaceHolder f22452Z;

    /* renamed from: a0  reason: collision with root package name */
    private SphericalGLSurfaceView f22453a0;

    /* renamed from: b  reason: collision with root package name */
    final D f22454b;
    /* access modifiers changed from: private */

    /* renamed from: b0  reason: collision with root package name */
    public boolean f22455b0;

    /* renamed from: c  reason: collision with root package name */
    final E.b f22456c;

    /* renamed from: c0  reason: collision with root package name */
    private TextureView f22457c0;

    /* renamed from: d  reason: collision with root package name */
    private final C5956g f22458d;

    /* renamed from: d0  reason: collision with root package name */
    private int f22459d0;

    /* renamed from: e  reason: collision with root package name */
    private final Context f22460e;

    /* renamed from: e0  reason: collision with root package name */
    private int f22461e0;

    /* renamed from: f  reason: collision with root package name */
    private final E f22462f;

    /* renamed from: f0  reason: collision with root package name */
    private t3.D f22463f0;

    /* renamed from: g  reason: collision with root package name */
    private final u0[] f22464g;
    /* access modifiers changed from: private */

    /* renamed from: g0  reason: collision with root package name */
    public C6279b f22465g0;

    /* renamed from: h  reason: collision with root package name */
    private final C f22466h;
    /* access modifiers changed from: private */

    /* renamed from: h0  reason: collision with root package name */
    public C6279b f22467h0;

    /* renamed from: i  reason: collision with root package name */
    private final C5962m f22468i;

    /* renamed from: i0  reason: collision with root package name */
    private int f22469i0;

    /* renamed from: j  reason: collision with root package name */
    private final W.f f22470j;

    /* renamed from: j0  reason: collision with root package name */
    private C5792c f22471j0;

    /* renamed from: k  reason: collision with root package name */
    private final W f22472k;

    /* renamed from: k0  reason: collision with root package name */
    private float f22473k0;
    /* access modifiers changed from: private */

    /* renamed from: l  reason: collision with root package name */
    public final p<E.d> f22474l;
    /* access modifiers changed from: private */

    /* renamed from: l0  reason: collision with root package name */
    public boolean f22475l0;

    /* renamed from: m  reason: collision with root package name */
    private final CopyOnWriteArraySet<ExoPlayer.a> f22476m;
    /* access modifiers changed from: private */

    /* renamed from: m0  reason: collision with root package name */
    public s3.b f22477m0;

    /* renamed from: n  reason: collision with root package name */
    private final J.b f22478n;

    /* renamed from: n0  reason: collision with root package name */
    private boolean f22479n0;

    /* renamed from: o  reason: collision with root package name */
    private final List<f> f22480o;

    /* renamed from: o0  reason: collision with root package name */
    private boolean f22481o0;

    /* renamed from: p  reason: collision with root package name */
    private final boolean f22482p;

    /* renamed from: p0  reason: collision with root package name */
    private int f22483p0;

    /* renamed from: q  reason: collision with root package name */
    private final C6479C.a f22484q;

    /* renamed from: q0  reason: collision with root package name */
    private G f22485q0;
    /* access modifiers changed from: private */

    /* renamed from: r  reason: collision with root package name */
    public final C6298a f22486r;

    /* renamed from: r0  reason: collision with root package name */
    private boolean f22487r0;

    /* renamed from: s  reason: collision with root package name */
    private final Looper f22488s;

    /* renamed from: s0  reason: collision with root package name */
    private boolean f22489s0;

    /* renamed from: t  reason: collision with root package name */
    private final C6571d f22490t;

    /* renamed from: t0  reason: collision with root package name */
    private C5802m f22491t0;

    /* renamed from: u  reason: collision with root package name */
    private final long f22492u;
    /* access modifiers changed from: private */

    /* renamed from: u0  reason: collision with root package name */
    public S f22493u0;

    /* renamed from: v  reason: collision with root package name */
    private final long f22494v;
    /* access modifiers changed from: private */

    /* renamed from: v0  reason: collision with root package name */
    public y f22495v0;

    /* renamed from: w  reason: collision with root package name */
    private final long f22496w;
    /* access modifiers changed from: private */

    /* renamed from: w0  reason: collision with root package name */
    public r0 f22497w0;

    /* renamed from: x  reason: collision with root package name */
    private final C5953d f22498x;

    /* renamed from: x0  reason: collision with root package name */
    private int f22499x0;

    /* renamed from: y  reason: collision with root package name */
    private final d f22500y;

    /* renamed from: y0  reason: collision with root package name */
    private int f22501y0;

    /* renamed from: z  reason: collision with root package name */
    private final e f22502z;

    /* renamed from: z0  reason: collision with root package name */
    private long f22503z0;

    private static final class b {
        public static boolean a(Context context, AudioDeviceInfo[] audioDeviceInfoArr) {
            if (!N.J0(context)) {
                return true;
            }
            for (AudioDeviceInfo audioDeviceInfo : audioDeviceInfoArr) {
                if (audioDeviceInfo.getType() == 8 || audioDeviceInfo.getType() == 5 || audioDeviceInfo.getType() == 6 || audioDeviceInfo.getType() == 11 || audioDeviceInfo.getType() == 4 || audioDeviceInfo.getType() == 3) {
                    return true;
                }
                int i10 = N.f29462a;
                if (i10 >= 26 && audioDeviceInfo.getType() == 22) {
                    return true;
                }
                if (i10 >= 28 && audioDeviceInfo.getType() == 23) {
                    return true;
                }
                if (i10 >= 31 && (audioDeviceInfo.getType() == 26 || audioDeviceInfo.getType() == 27)) {
                    return true;
                }
                if (i10 >= 33 && audioDeviceInfo.getType() == 30) {
                    return true;
                }
            }
            return false;
        }

        public static void b(AudioManager audioManager, AudioDeviceCallback audioDeviceCallback, Handler handler) {
            audioManager.registerAudioDeviceCallback(audioDeviceCallback, handler);
        }
    }

    private static final class c {
        public static v1 a(Context context, J j10, boolean z10, String str) {
            t1 v02 = t1.v0(context);
            if (v02 == null) {
                q.h("ExoPlayerImpl", "MediaMetricsService unavailable.");
                return new v1(LogSessionId.LOG_SESSION_ID_NONE, str);
            }
            if (z10) {
                j10.w1(v02);
            }
            return new v1(v02.C0(), str);
        }
    }

    private final class d implements C6634D, C6374x, h, F3.b, SurfaceHolder.Callback, TextureView.SurfaceTextureListener, SphericalGLSurfaceView.b, C5227d.b, C5223a.b, w0.b, ExoPlayer.a {
        private d() {
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void Q(E.d dVar) {
            dVar.E(J.this.f22446T);
        }

        public void A(long j10, int i10) {
            J.this.f22486r.A(j10, i10);
        }

        public void C(Surface surface) {
            J.this.F2(surface);
        }

        public void D(int i10, boolean z10) {
            J.this.f22474l.l(30, new P(i10, z10));
        }

        public void E(boolean z10) {
            J.this.N2();
        }

        public void F(float f10) {
            J.this.A2();
        }

        public void G(int i10) {
            J.this.J2(J.this.H(), i10, J.L1(i10));
        }

        public void a(boolean z10) {
            if (J.this.f22475l0 != z10) {
                boolean unused = J.this.f22475l0 = z10;
                J.this.f22474l.l(23, new Q(z10));
            }
        }

        public void b(Exception exc) {
            J.this.f22486r.b(exc);
        }

        public void c(C6375y.a aVar) {
            J.this.f22486r.c(aVar);
        }

        public void d(C6375y.a aVar) {
            J.this.f22486r.d(aVar);
        }

        public void e(S s10) {
            S unused = J.this.f22493u0 = s10;
            J.this.f22474l.l(25, new O(s10));
        }

        public void f(String str) {
            J.this.f22486r.f(str);
        }

        public void g(String str, long j10, long j11) {
            J.this.f22486r.g(str, j10, j11);
        }

        public void h(z zVar) {
            J j10 = J.this;
            y unused = j10.f22495v0 = j10.f22495v0.a().N(zVar).J();
            y c12 = J.this.z1();
            if (!c12.equals(J.this.f22446T)) {
                y unused2 = J.this.f22446T = c12;
                J.this.f22474l.i(14, new L(this));
            }
            J.this.f22474l.i(28, new M(zVar));
            J.this.f22474l.f();
        }

        public void i(String str) {
            J.this.f22486r.i(str);
        }

        public void j(String str, long j10, long j11) {
            J.this.f22486r.j(str, j10, j11);
        }

        public void k(List<s3.a> list) {
            J.this.f22474l.l(27, new N(list));
        }

        public void l(long j10) {
            J.this.f22486r.l(j10);
        }

        public void m(C6279b bVar) {
            J.this.f22486r.m(bVar);
            C5807s unused = J.this.f22448V = null;
            C6279b unused2 = J.this.f22465g0 = null;
        }

        public void n(Exception exc) {
            J.this.f22486r.n(exc);
        }

        public void o(C5807s sVar, C6280c cVar) {
            C5807s unused = J.this.f22449W = sVar;
            J.this.f22486r.o(sVar, cVar);
        }

        public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i10, int i11) {
            J.this.E2(surfaceTexture);
            J.this.t2(i10, i11);
        }

        public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
            J.this.F2((Object) null);
            J.this.t2(0, 0);
            return true;
        }

        public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i10, int i11) {
            J.this.t2(i10, i11);
        }

        public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        }

        public void p() {
            J.this.J2(false, -1, 3);
        }

        public void q(C5807s sVar, C6280c cVar) {
            C5807s unused = J.this.f22448V = sVar;
            J.this.f22486r.q(sVar, cVar);
        }

        public void r(C6279b bVar) {
            C6279b unused = J.this.f22467h0 = bVar;
            J.this.f22486r.r(bVar);
        }

        public void s(int i10, long j10) {
            J.this.f22486r.s(i10, j10);
        }

        public void surfaceChanged(SurfaceHolder surfaceHolder, int i10, int i11, int i12) {
            J.this.t2(i11, i12);
        }

        public void surfaceCreated(SurfaceHolder surfaceHolder) {
            if (J.this.f22455b0) {
                J.this.F2(surfaceHolder.getSurface());
            }
        }

        public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
            if (J.this.f22455b0) {
                J.this.F2((Object) null);
            }
            J.this.t2(0, 0);
        }

        public void t(Object obj, long j10) {
            J.this.f22486r.t(obj, j10);
            if (J.this.f22450X == obj) {
                J.this.f22474l.l(26, new B());
            }
        }

        public void u(Surface surface) {
            J.this.F2((Object) null);
        }

        public void v(C6279b bVar) {
            C6279b unused = J.this.f22465g0 = bVar;
            J.this.f22486r.v(bVar);
        }

        public void w(Exception exc) {
            J.this.f22486r.w(exc);
        }

        public void x(s3.b bVar) {
            s3.b unused = J.this.f22477m0 = bVar;
            J.this.f22474l.l(27, new K(bVar));
        }

        public void y(int i10, long j10, long j11) {
            J.this.f22486r.y(i10, j10, j11);
        }

        public void z(C6279b bVar) {
            J.this.f22486r.z(bVar);
            C5807s unused = J.this.f22449W = null;
            C6279b unused2 = J.this.f22467h0 = null;
        }
    }

    private static final class e implements o, C6649a, s0.b {

        /* renamed from: a  reason: collision with root package name */
        private o f22505a;

        /* renamed from: b  reason: collision with root package name */
        private C6649a f22506b;

        /* renamed from: c  reason: collision with root package name */
        private o f22507c;

        /* renamed from: d  reason: collision with root package name */
        private C6649a f22508d;

        private e() {
        }

        public void b(long j10, float[] fArr) {
            C6649a aVar = this.f22508d;
            if (aVar != null) {
                aVar.b(j10, fArr);
            }
            C6649a aVar2 = this.f22506b;
            if (aVar2 != null) {
                aVar2.b(j10, fArr);
            }
        }

        public void e() {
            C6649a aVar = this.f22508d;
            if (aVar != null) {
                aVar.e();
            }
            C6649a aVar2 = this.f22506b;
            if (aVar2 != null) {
                aVar2.e();
            }
        }

        public void g(long j10, long j11, C5807s sVar, MediaFormat mediaFormat) {
            o oVar = this.f22507c;
            if (oVar != null) {
                oVar.g(j10, j11, sVar, mediaFormat);
            }
            o oVar2 = this.f22505a;
            if (oVar2 != null) {
                oVar2.g(j10, j11, sVar, mediaFormat);
            }
        }

        public void x(int i10, Object obj) {
            if (i10 == 7) {
                this.f22505a = (o) obj;
            } else if (i10 == 8) {
                this.f22506b = (C6649a) obj;
            } else if (i10 == 10000) {
                SphericalGLSurfaceView sphericalGLSurfaceView = (SphericalGLSurfaceView) obj;
                if (sphericalGLSurfaceView == null) {
                    this.f22507c = null;
                    this.f22508d = null;
                    return;
                }
                this.f22507c = sphericalGLSurfaceView.getVideoFrameMetadataListener();
                this.f22508d = sphericalGLSurfaceView.getCameraMotionListener();
            }
        }
    }

    private static final class f implements d0 {

        /* renamed from: a  reason: collision with root package name */
        private final Object f22509a;

        /* renamed from: b  reason: collision with root package name */
        private final C6479C f22510b;

        /* renamed from: c  reason: collision with root package name */
        private q3.J f22511c;

        public f(Object obj, C6505z zVar) {
            this.f22509a = obj;
            this.f22510b = zVar;
            this.f22511c = zVar.V();
        }

        public Object a() {
            return this.f22509a;
        }

        public q3.J b() {
            return this.f22511c;
        }

        public void c(q3.J j10) {
            this.f22511c = j10;
        }
    }

    private final class g extends AudioDeviceCallback {
        private g() {
        }

        public void onAudioDevicesAdded(AudioDeviceInfo[] audioDeviceInfoArr) {
            if (J.this.R1() && J.this.f22497w0.f22857n == 3) {
                J j10 = J.this;
                j10.L2(j10.f22497w0.f22855l, 1, 0);
            }
        }

        public void onAudioDevicesRemoved(AudioDeviceInfo[] audioDeviceInfoArr) {
            if (!J.this.R1()) {
                J j10 = J.this;
                j10.L2(j10.f22497w0.f22855l, 1, 3);
            }
        }
    }

    static {
        x.a("media3.exoplayer");
    }

    /* JADX WARNING: type inference failed for: r44v0, types: [q3.E] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x02c0 A[Catch:{ all -> 0x01c6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x02d2 A[Catch:{ all -> 0x01c6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x02e1 A[Catch:{ all -> 0x01c6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x02e3 A[Catch:{ all -> 0x01c6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x02f5 A[Catch:{ all -> 0x01c6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x02f7 A[Catch:{ all -> 0x01c6 }] */
    /* JADX WARNING: Unknown variable types count: 1 */
    @android.annotation.SuppressLint({"HandlerLeak"})
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public J(androidx.media3.exoplayer.ExoPlayer.b r43, q3.E r44) {
        /*
            r42 = this;
            r1 = r42
            r0 = r43
            r42.<init>()
            t3.g r9 = new t3.g
            r9.<init>()
            r1.f22458d = r9
            java.lang.String r10 = "ExoPlayerImpl"
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ all -> 0x01c6 }
            r11.<init>()     // Catch:{ all -> 0x01c6 }
            java.lang.String r12 = "Init "
            r11.append(r12)     // Catch:{ all -> 0x01c6 }
            int r12 = java.lang.System.identityHashCode(r42)     // Catch:{ all -> 0x01c6 }
            java.lang.String r12 = java.lang.Integer.toHexString(r12)     // Catch:{ all -> 0x01c6 }
            r11.append(r12)     // Catch:{ all -> 0x01c6 }
            java.lang.String r12 = " ["
            r11.append(r12)     // Catch:{ all -> 0x01c6 }
            java.lang.String r12 = "AndroidXMedia3/1.5.1"
            r11.append(r12)     // Catch:{ all -> 0x01c6 }
            java.lang.String r12 = "] ["
            r11.append(r12)     // Catch:{ all -> 0x01c6 }
            java.lang.String r12 = t3.N.f29466e     // Catch:{ all -> 0x01c6 }
            r11.append(r12)     // Catch:{ all -> 0x01c6 }
            java.lang.String r12 = "]"
            r11.append(r12)     // Catch:{ all -> 0x01c6 }
            java.lang.String r11 = r11.toString()     // Catch:{ all -> 0x01c6 }
            t3.q.f(r10, r11)     // Catch:{ all -> 0x01c6 }
            android.content.Context r10 = r0.f22394a     // Catch:{ all -> 0x01c6 }
            android.content.Context r10 = r10.getApplicationContext()     // Catch:{ all -> 0x01c6 }
            r1.f22460e = r10     // Catch:{ all -> 0x01c6 }
            jb.f<t3.d, A3.a> r11 = r0.f22402i     // Catch:{ all -> 0x01c6 }
            t3.d r12 = r0.f22395b     // Catch:{ all -> 0x01c6 }
            java.lang.Object r11 = r11.apply(r12)     // Catch:{ all -> 0x01c6 }
            A3.a r11 = (A3.C6298a) r11     // Catch:{ all -> 0x01c6 }
            r1.f22486r = r11     // Catch:{ all -> 0x01c6 }
            int r12 = r0.f22404k     // Catch:{ all -> 0x01c6 }
            r1.f22483p0 = r12     // Catch:{ all -> 0x01c6 }
            q3.G r12 = r0.f22405l     // Catch:{ all -> 0x01c6 }
            r1.f22485q0 = r12     // Catch:{ all -> 0x01c6 }
            q3.c r12 = r0.f22406m     // Catch:{ all -> 0x01c6 }
            r1.f22471j0 = r12     // Catch:{ all -> 0x01c6 }
            int r12 = r0.f22412s     // Catch:{ all -> 0x01c6 }
            r1.f22459d0 = r12     // Catch:{ all -> 0x01c6 }
            int r12 = r0.f22413t     // Catch:{ all -> 0x01c6 }
            r1.f22461e0 = r12     // Catch:{ all -> 0x01c6 }
            boolean r12 = r0.f22410q     // Catch:{ all -> 0x01c6 }
            r1.f22475l0 = r12     // Catch:{ all -> 0x01c6 }
            long r12 = r0.f22385B     // Catch:{ all -> 0x01c6 }
            r1.f22432F = r12     // Catch:{ all -> 0x01c6 }
            androidx.media3.exoplayer.J$d r13 = new androidx.media3.exoplayer.J$d     // Catch:{ all -> 0x01c6 }
            r12 = 0
            r13.<init>()     // Catch:{ all -> 0x01c6 }
            r1.f22500y = r13     // Catch:{ all -> 0x01c6 }
            androidx.media3.exoplayer.J$e r15 = new androidx.media3.exoplayer.J$e     // Catch:{ all -> 0x01c6 }
            r15.<init>()     // Catch:{ all -> 0x01c6 }
            r1.f22502z = r15     // Catch:{ all -> 0x01c6 }
            android.os.Handler r14 = new android.os.Handler     // Catch:{ all -> 0x01c6 }
            android.os.Looper r5 = r0.f22403j     // Catch:{ all -> 0x01c6 }
            r14.<init>(r5)     // Catch:{ all -> 0x01c6 }
            jb.r<z3.I> r5 = r0.f22397d     // Catch:{ all -> 0x01c6 }
            java.lang.Object r5 = r5.get()     // Catch:{ all -> 0x01c6 }
            z3.I r5 = (z3.I) r5     // Catch:{ all -> 0x01c6 }
            r33 = r14
            r14 = r5
            r5 = r15
            r15 = r33
            r16 = r13
            r17 = r13
            r18 = r13
            r19 = r13
            androidx.media3.exoplayer.u0[] r14 = r14.a(r15, r16, r17, r18, r19)     // Catch:{ all -> 0x01c6 }
            r1.f22464g = r14     // Catch:{ all -> 0x01c6 }
            int r15 = r14.length     // Catch:{ all -> 0x01c6 }
            r6 = 0
            if (r15 <= 0) goto L_0x00ad
            r15 = 1
            goto L_0x00ae
        L_0x00ad:
            r15 = r6
        L_0x00ae:
            t3.C5950a.g(r15)     // Catch:{ all -> 0x01c6 }
            jb.r<I3.C> r15 = r0.f22399f     // Catch:{ all -> 0x01c6 }
            java.lang.Object r15 = r15.get()     // Catch:{ all -> 0x01c6 }
            I3.C r15 = (I3.C) r15     // Catch:{ all -> 0x01c6 }
            r1.f22466h = r15     // Catch:{ all -> 0x01c6 }
            jb.r<G3.C$a> r7 = r0.f22398e     // Catch:{ all -> 0x01c6 }
            java.lang.Object r7 = r7.get()     // Catch:{ all -> 0x01c6 }
            G3.C$a r7 = (G3.C6479C.a) r7     // Catch:{ all -> 0x01c6 }
            r1.f22484q = r7     // Catch:{ all -> 0x01c6 }
            jb.r<J3.d> r7 = r0.f22401h     // Catch:{ all -> 0x01c6 }
            java.lang.Object r7 = r7.get()     // Catch:{ all -> 0x01c6 }
            J3.d r7 = (J3.C6571d) r7     // Catch:{ all -> 0x01c6 }
            r1.f22490t = r7     // Catch:{ all -> 0x01c6 }
            boolean r2 = r0.f22414u     // Catch:{ all -> 0x01c6 }
            r1.f22482p = r2     // Catch:{ all -> 0x01c6 }
            z3.J r2 = r0.f22415v     // Catch:{ all -> 0x01c6 }
            r1.f22441O = r2     // Catch:{ all -> 0x01c6 }
            r34 = r9
            long r8 = r0.f22416w     // Catch:{ all -> 0x01c6 }
            r1.f22492u = r8     // Catch:{ all -> 0x01c6 }
            long r8 = r0.f22417x     // Catch:{ all -> 0x01c6 }
            r1.f22494v = r8     // Catch:{ all -> 0x01c6 }
            long r8 = r0.f22418y     // Catch:{ all -> 0x01c6 }
            r1.f22496w = r8     // Catch:{ all -> 0x01c6 }
            boolean r8 = r0.f22386C     // Catch:{ all -> 0x01c6 }
            r1.f22444R = r8     // Catch:{ all -> 0x01c6 }
            android.os.Looper r8 = r0.f22403j     // Catch:{ all -> 0x01c6 }
            r1.f22488s = r8     // Catch:{ all -> 0x01c6 }
            t3.d r9 = r0.f22395b     // Catch:{ all -> 0x01c6 }
            r1.f22498x = r9     // Catch:{ all -> 0x01c6 }
            if (r44 != 0) goto L_0x00f5
            r2 = r1
            goto L_0x00f7
        L_0x00f5:
            r2 = r44
        L_0x00f7:
            r1.f22462f = r2     // Catch:{ all -> 0x01c6 }
            boolean r4 = r0.f22390G     // Catch:{ all -> 0x01c6 }
            r1.f22434H = r4     // Catch:{ all -> 0x01c6 }
            t3.p r3 = new t3.p     // Catch:{ all -> 0x01c6 }
            androidx.media3.exoplayer.s r12 = new androidx.media3.exoplayer.s     // Catch:{ all -> 0x01c6 }
            r12.<init>(r1)     // Catch:{ all -> 0x01c6 }
            r3.<init>(r8, r9, r12)     // Catch:{ all -> 0x01c6 }
            r1.f22474l = r3     // Catch:{ all -> 0x01c6 }
            java.util.concurrent.CopyOnWriteArraySet r3 = new java.util.concurrent.CopyOnWriteArraySet     // Catch:{ all -> 0x01c6 }
            r3.<init>()     // Catch:{ all -> 0x01c6 }
            r1.f22476m = r3     // Catch:{ all -> 0x01c6 }
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch:{ all -> 0x01c6 }
            r3.<init>()     // Catch:{ all -> 0x01c6 }
            r1.f22480o = r3     // Catch:{ all -> 0x01c6 }
            G3.c0$a r3 = new G3.c0$a     // Catch:{ all -> 0x01c6 }
            r3.<init>(r6)     // Catch:{ all -> 0x01c6 }
            r1.f22442P = r3     // Catch:{ all -> 0x01c6 }
            androidx.media3.exoplayer.ExoPlayer$c r3 = androidx.media3.exoplayer.ExoPlayer.c.f22420b     // Catch:{ all -> 0x01c6 }
            r1.f22443Q = r3     // Catch:{ all -> 0x01c6 }
            I3.D r3 = new I3.D     // Catch:{ all -> 0x01c6 }
            int r12 = r14.length     // Catch:{ all -> 0x01c6 }
            z3.H[] r12 = new z3.H[r12]     // Catch:{ all -> 0x01c6 }
            int r6 = r14.length     // Catch:{ all -> 0x01c6 }
            I3.x[] r6 = new I3.x[r6]     // Catch:{ all -> 0x01c6 }
            r19 = r13
            q3.N r13 = q3.N.f28051b     // Catch:{ all -> 0x01c6 }
            r35 = r5
            r5 = 0
            r3.<init>(r12, r6, r13, r5)     // Catch:{ all -> 0x01c6 }
            r1.f22454b = r3     // Catch:{ all -> 0x01c6 }
            q3.J$b r5 = new q3.J$b     // Catch:{ all -> 0x01c6 }
            r5.<init>()     // Catch:{ all -> 0x01c6 }
            r1.f22478n = r5     // Catch:{ all -> 0x01c6 }
            q3.E$b$a r5 = new q3.E$b$a     // Catch:{ all -> 0x01c6 }
            r5.<init>()     // Catch:{ all -> 0x01c6 }
            r6 = 20
            int[] r6 = new int[r6]     // Catch:{ all -> 0x01c6 }
            r6 = {1, 2, 3, 13, 14, 15, 16, 17, 18, 19, 31, 20, 30, 21, 35, 22, 24, 27, 28, 32} // fill-array     // Catch:{ all -> 0x01c6 }
            q3.E$b$a r5 = r5.c(r6)     // Catch:{ all -> 0x01c6 }
            boolean r6 = r15.h()     // Catch:{ all -> 0x01c6 }
            r12 = 29
            q3.E$b$a r5 = r5.d(r12, r6)     // Catch:{ all -> 0x01c6 }
            boolean r6 = r0.f22411r     // Catch:{ all -> 0x01c6 }
            r13 = 23
            q3.E$b$a r5 = r5.d(r13, r6)     // Catch:{ all -> 0x01c6 }
            boolean r6 = r0.f22411r     // Catch:{ all -> 0x01c6 }
            r12 = 25
            q3.E$b$a r5 = r5.d(r12, r6)     // Catch:{ all -> 0x01c6 }
            boolean r6 = r0.f22411r     // Catch:{ all -> 0x01c6 }
            r12 = 33
            q3.E$b$a r5 = r5.d(r12, r6)     // Catch:{ all -> 0x01c6 }
            boolean r6 = r0.f22411r     // Catch:{ all -> 0x01c6 }
            r12 = 26
            q3.E$b$a r5 = r5.d(r12, r6)     // Catch:{ all -> 0x01c6 }
            boolean r6 = r0.f22411r     // Catch:{ all -> 0x01c6 }
            r12 = 34
            q3.E$b$a r5 = r5.d(r12, r6)     // Catch:{ all -> 0x01c6 }
            q3.E$b r5 = r5.e()     // Catch:{ all -> 0x01c6 }
            r1.f22456c = r5     // Catch:{ all -> 0x01c6 }
            q3.E$b$a r6 = new q3.E$b$a     // Catch:{ all -> 0x01c6 }
            r6.<init>()     // Catch:{ all -> 0x01c6 }
            q3.E$b$a r5 = r6.b(r5)     // Catch:{ all -> 0x01c6 }
            r6 = 4
            q3.E$b$a r5 = r5.a(r6)     // Catch:{ all -> 0x01c6 }
            r12 = 10
            q3.E$b$a r5 = r5.a(r12)     // Catch:{ all -> 0x01c6 }
            q3.E$b r5 = r5.e()     // Catch:{ all -> 0x01c6 }
            r1.f22445S = r5     // Catch:{ all -> 0x01c6 }
            r5 = 0
            t3.m r12 = r9.e(r8, r5)     // Catch:{ all -> 0x01c6 }
            r1.f22468i = r12     // Catch:{ all -> 0x01c6 }
            androidx.media3.exoplayer.t r12 = new androidx.media3.exoplayer.t     // Catch:{ all -> 0x01c6 }
            r12.<init>(r1)     // Catch:{ all -> 0x01c6 }
            r1.f22470j = r12     // Catch:{ all -> 0x01c6 }
            androidx.media3.exoplayer.r0 r5 = androidx.media3.exoplayer.r0.k(r3)     // Catch:{ all -> 0x01c6 }
            r1.f22497w0 = r5     // Catch:{ all -> 0x01c6 }
            r11.n0(r2, r8)     // Catch:{ all -> 0x01c6 }
            int r5 = t3.N.f29462a     // Catch:{ all -> 0x01c6 }
            r2 = 31
            if (r5 >= r2) goto L_0x01c9
            A3.v1 r2 = new A3.v1     // Catch:{ all -> 0x01c6 }
            java.lang.String r13 = r0.f22391H     // Catch:{ all -> 0x01c6 }
            r2.<init>(r13)     // Catch:{ all -> 0x01c6 }
        L_0x01c3:
            r30 = r2
            goto L_0x01d2
        L_0x01c6:
            r0 = move-exception
            goto L_0x0369
        L_0x01c9:
            boolean r2 = r0.f22387D     // Catch:{ all -> 0x01c6 }
            java.lang.String r13 = r0.f22391H     // Catch:{ all -> 0x01c6 }
            A3.v1 r2 = androidx.media3.exoplayer.J.c.a(r10, r1, r2, r13)     // Catch:{ all -> 0x01c6 }
            goto L_0x01c3
        L_0x01d2:
            androidx.media3.exoplayer.W r2 = new androidx.media3.exoplayer.W     // Catch:{ all -> 0x01c6 }
            jb.r<androidx.media3.exoplayer.X> r13 = r0.f22400g     // Catch:{ all -> 0x01c6 }
            java.lang.Object r13 = r13.get()     // Catch:{ all -> 0x01c6 }
            r17 = r13
            androidx.media3.exoplayer.X r17 = (androidx.media3.exoplayer.X) r17     // Catch:{ all -> 0x01c6 }
            int r13 = r1.f22436J     // Catch:{ all -> 0x01c6 }
            boolean r6 = r1.f22437K     // Catch:{ all -> 0x01c6 }
            r36 = r4
            z3.J r4 = r1.f22441O     // Catch:{ all -> 0x01c6 }
            r37 = r5
            z3.E r5 = r0.f22419z     // Catch:{ all -> 0x01c6 }
            r28 = r9
            r38 = r10
            long r9 = r0.f22384A     // Catch:{ all -> 0x01c6 }
            r39 = r8
            boolean r8 = r1.f22444R     // Catch:{ all -> 0x01c6 }
            r25 = r8
            boolean r8 = r0.f22392I     // Catch:{ all -> 0x01c6 }
            r26 = r8
            z3.G r8 = r0.f22388E     // Catch:{ all -> 0x01c6 }
            androidx.media3.exoplayer.ExoPlayer$c r0 = r1.f22443Q     // Catch:{ all -> 0x01c6 }
            r29 = r12
            r12 = r2
            r18 = r13
            r40 = r19
            r13 = r14
            r14 = r15
            r41 = r15
            r15 = r3
            r16 = r17
            r17 = r7
            r19 = r6
            r20 = r11
            r21 = r4
            r22 = r5
            r23 = r9
            r27 = r39
            r31 = r8
            r32 = r0
            r12.<init>(r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r25, r26, r27, r28, r29, r30, r31, r32)     // Catch:{ all -> 0x01c6 }
            r1.f22472k = r2     // Catch:{ all -> 0x01c6 }
            r0 = 1065353216(0x3f800000, float:1.0)
            r1.f22473k0 = r0     // Catch:{ all -> 0x01c6 }
            r0 = 0
            r1.f22436J = r0     // Catch:{ all -> 0x01c6 }
            q3.y r3 = q3.y.f28453I     // Catch:{ all -> 0x01c6 }
            r1.f22446T = r3     // Catch:{ all -> 0x01c6 }
            r1.f22447U = r3     // Catch:{ all -> 0x01c6 }
            r1.f22495v0 = r3     // Catch:{ all -> 0x01c6 }
            r3 = -1
            r1.f22499x0 = r3     // Catch:{ all -> 0x01c6 }
            int r3 = t3.N.J(r38)     // Catch:{ all -> 0x01c6 }
            r1.f22469i0 = r3     // Catch:{ all -> 0x01c6 }
            s3.b r3 = s3.b.f29075c     // Catch:{ all -> 0x01c6 }
            r1.f22477m0 = r3     // Catch:{ all -> 0x01c6 }
            r3 = 1
            r1.f22479n0 = r3     // Catch:{ all -> 0x01c6 }
            r3 = r2
            r1.u(r11)     // Catch:{ all -> 0x01c6 }
            android.os.Handler r4 = new android.os.Handler     // Catch:{ all -> 0x01c6 }
            r5 = r39
            r4.<init>(r5)     // Catch:{ all -> 0x01c6 }
            r7.e(r4, r11)     // Catch:{ all -> 0x01c6 }
            r4 = r40
            r1.x1(r4)     // Catch:{ all -> 0x01c6 }
            r6 = r43
            long r7 = r6.f22396c     // Catch:{ all -> 0x01c6 }
            r9 = 0
            int r9 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r9 <= 0) goto L_0x0262
            r3.A(r7)     // Catch:{ all -> 0x01c6 }
        L_0x0262:
            androidx.media3.exoplayer.a r3 = new androidx.media3.exoplayer.a     // Catch:{ all -> 0x01c6 }
            android.content.Context r7 = r6.f22394a     // Catch:{ all -> 0x01c6 }
            r8 = r33
            r3.<init>(r7, r8, r4)     // Catch:{ all -> 0x01c6 }
            r1.f22427A = r3     // Catch:{ all -> 0x01c6 }
            boolean r7 = r6.f22409p     // Catch:{ all -> 0x01c6 }
            r3.b(r7)     // Catch:{ all -> 0x01c6 }
            androidx.media3.exoplayer.d r3 = new androidx.media3.exoplayer.d     // Catch:{ all -> 0x01c6 }
            android.content.Context r7 = r6.f22394a     // Catch:{ all -> 0x01c6 }
            r3.<init>(r7, r8, r4)     // Catch:{ all -> 0x01c6 }
            r1.f22428B = r3     // Catch:{ all -> 0x01c6 }
            boolean r7 = r6.f22407n     // Catch:{ all -> 0x01c6 }
            if (r7 == 0) goto L_0x0282
            q3.c r12 = r1.f22471j0     // Catch:{ all -> 0x01c6 }
            goto L_0x0283
        L_0x0282:
            r12 = 0
        L_0x0283:
            r3.o(r12)     // Catch:{ all -> 0x01c6 }
            androidx.media3.exoplayer.y0 r3 = r6.f22393J     // Catch:{ all -> 0x01c6 }
            r1.f22435I = r3     // Catch:{ all -> 0x01c6 }
            r7 = r37
            if (r3 == 0) goto L_0x029c
            r9 = 35
            if (r7 < r9) goto L_0x029c
            androidx.media3.exoplayer.u r5 = new androidx.media3.exoplayer.u     // Catch:{ all -> 0x01c6 }
            r5.<init>(r1)     // Catch:{ all -> 0x01c6 }
            r3.a(r5)     // Catch:{ all -> 0x01c6 }
        L_0x029a:
            r9 = 0
            goto L_0x02bc
        L_0x029c:
            if (r36 == 0) goto L_0x029a
            r3 = 23
            if (r7 < r3) goto L_0x029a
            java.lang.String r3 = "audio"
            r7 = r38
            java.lang.Object r3 = r7.getSystemService(r3)     // Catch:{ all -> 0x01c6 }
            android.media.AudioManager r3 = (android.media.AudioManager) r3     // Catch:{ all -> 0x01c6 }
            r1.f22433G = r3     // Catch:{ all -> 0x01c6 }
            androidx.media3.exoplayer.J$g r7 = new androidx.media3.exoplayer.J$g     // Catch:{ all -> 0x01c6 }
            r9 = 0
            r7.<init>()     // Catch:{ all -> 0x01c6 }
            android.os.Handler r10 = new android.os.Handler     // Catch:{ all -> 0x01c6 }
            r10.<init>(r5)     // Catch:{ all -> 0x01c6 }
            androidx.media3.exoplayer.J.b.b(r3, r7, r10)     // Catch:{ all -> 0x01c6 }
        L_0x02bc:
            boolean r3 = r6.f22411r     // Catch:{ all -> 0x01c6 }
            if (r3 == 0) goto L_0x02d2
            androidx.media3.exoplayer.w0 r3 = new androidx.media3.exoplayer.w0     // Catch:{ all -> 0x01c6 }
            android.content.Context r5 = r6.f22394a     // Catch:{ all -> 0x01c6 }
            q3.c r7 = r1.f22471j0     // Catch:{ all -> 0x01c6 }
            int r7 = r7.f28116c     // Catch:{ all -> 0x01c6 }
            int r7 = t3.N.l0(r7)     // Catch:{ all -> 0x01c6 }
            r3.<init>(r5, r8, r4, r7)     // Catch:{ all -> 0x01c6 }
            r1.f22429C = r3     // Catch:{ all -> 0x01c6 }
            goto L_0x02d4
        L_0x02d2:
            r1.f22429C = r9     // Catch:{ all -> 0x01c6 }
        L_0x02d4:
            androidx.media3.exoplayer.z0 r3 = new androidx.media3.exoplayer.z0     // Catch:{ all -> 0x01c6 }
            android.content.Context r4 = r6.f22394a     // Catch:{ all -> 0x01c6 }
            r3.<init>(r4)     // Catch:{ all -> 0x01c6 }
            r1.f22430D = r3     // Catch:{ all -> 0x01c6 }
            int r4 = r6.f22408o     // Catch:{ all -> 0x01c6 }
            if (r4 == 0) goto L_0x02e3
            r4 = 1
            goto L_0x02e4
        L_0x02e3:
            r4 = r0
        L_0x02e4:
            r3.a(r4)     // Catch:{ all -> 0x01c6 }
            androidx.media3.exoplayer.A0 r3 = new androidx.media3.exoplayer.A0     // Catch:{ all -> 0x01c6 }
            android.content.Context r4 = r6.f22394a     // Catch:{ all -> 0x01c6 }
            r3.<init>(r4)     // Catch:{ all -> 0x01c6 }
            r1.f22431E = r3     // Catch:{ all -> 0x01c6 }
            int r4 = r6.f22408o     // Catch:{ all -> 0x01c6 }
            r5 = 2
            if (r4 != r5) goto L_0x02f7
            r6 = 1
            goto L_0x02f8
        L_0x02f7:
            r6 = r0
        L_0x02f8:
            r3.a(r6)     // Catch:{ all -> 0x01c6 }
            androidx.media3.exoplayer.w0 r0 = r1.f22429C     // Catch:{ all -> 0x01c6 }
            q3.m r0 = D1(r0)     // Catch:{ all -> 0x01c6 }
            r1.f22491t0 = r0     // Catch:{ all -> 0x01c6 }
            q3.S r0 = q3.S.f28064e     // Catch:{ all -> 0x01c6 }
            r1.f22493u0 = r0     // Catch:{ all -> 0x01c6 }
            t3.D r0 = t3.D.f29444c     // Catch:{ all -> 0x01c6 }
            r1.f22463f0 = r0     // Catch:{ all -> 0x01c6 }
            q3.c r0 = r1.f22471j0     // Catch:{ all -> 0x01c6 }
            r15 = r41
            r15.l(r0)     // Catch:{ all -> 0x01c6 }
            int r0 = r1.f22469i0     // Catch:{ all -> 0x01c6 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x01c6 }
            r2 = 10
            r3 = 1
            r1.y2(r3, r2, r0)     // Catch:{ all -> 0x01c6 }
            int r0 = r1.f22469i0     // Catch:{ all -> 0x01c6 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x01c6 }
            r4 = 2
            r1.y2(r4, r2, r0)     // Catch:{ all -> 0x01c6 }
            q3.c r0 = r1.f22471j0     // Catch:{ all -> 0x01c6 }
            r2 = 3
            r1.y2(r3, r2, r0)     // Catch:{ all -> 0x01c6 }
            int r0 = r1.f22459d0     // Catch:{ all -> 0x01c6 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x01c6 }
            r3 = 4
            r1.y2(r4, r3, r0)     // Catch:{ all -> 0x01c6 }
            int r0 = r1.f22461e0     // Catch:{ all -> 0x01c6 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x01c6 }
            r3 = 5
            r1.y2(r4, r3, r0)     // Catch:{ all -> 0x01c6 }
            boolean r0 = r1.f22475l0     // Catch:{ all -> 0x01c6 }
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch:{ all -> 0x01c6 }
            r3 = 9
            r2 = 1
            r1.y2(r2, r3, r0)     // Catch:{ all -> 0x01c6 }
            r0 = 7
            r2 = r35
            r1.y2(r4, r0, r2)     // Catch:{ all -> 0x01c6 }
            r0 = 6
            r3 = 8
            r1.y2(r0, r3, r2)     // Catch:{ all -> 0x01c6 }
            int r0 = r1.f22483p0     // Catch:{ all -> 0x01c6 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x01c6 }
            r2 = 16
            r1.z2(r2, r0)     // Catch:{ all -> 0x01c6 }
            r34.e()
            return
        L_0x0369:
            t3.g r2 = r1.f22458d
            r2.e()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.J.<init>(androidx.media3.exoplayer.ExoPlayer$b, q3.E):void");
    }

    /* access modifiers changed from: private */
    public void A2() {
        y2(1, 2, Float.valueOf(this.f22473k0 * this.f22428B.h()));
    }

    private int C1(boolean z10, int i10) {
        if (i10 == 0) {
            return 1;
        }
        if (!this.f22434H) {
            return 0;
        }
        if (!z10 || R1()) {
            return (z10 || this.f22497w0.f22857n != 3) ? 0 : 3;
        }
        return 3;
    }

    private void C2(List<C6479C> list, int i10, long j10, boolean z10) {
        int i11;
        long j11;
        int i12 = i10;
        int K12 = K1(this.f22497w0);
        long h02 = h0();
        boolean z11 = true;
        this.f22438L++;
        if (!this.f22480o.isEmpty()) {
            w2(0, this.f22480o.size());
        }
        List<q0.c> y12 = y1(0, list);
        q3.J E12 = E1();
        if (E12.q() || i12 < E12.p()) {
            long j12 = j10;
            if (z10) {
                j11 = -9223372036854775807L;
                i11 = E12.a(this.f22437K);
            } else if (i12 == -1) {
                i11 = K12;
                j11 = h02;
            } else {
                i11 = i12;
                j11 = j12;
            }
            r0 r22 = r2(this.f22497w0, E12, s2(E12, i11, j11));
            int i13 = r22.f22848e;
            if (!(i11 == -1 || i13 == 1)) {
                i13 = (E12.q() || i11 >= E12.p()) ? 4 : 2;
            }
            r0 h10 = r22.h(i13);
            this.f22472k.b1(y12, i11, N.P0(j11), this.f22442P);
            if (this.f22497w0.f22845b.f35620a.equals(h10.f22845b.f35620a) || this.f22497w0.f22844a.q()) {
                z11 = false;
            }
            K2(h10, 0, z11, 4, J1(h10), -1, false);
            return;
        }
        throw new u(E12, i12, j10);
    }

    private static C5802m D1(w0 w0Var) {
        int i10 = 0;
        C5802m.b g10 = new C5802m.b(0).g(w0Var != null ? w0Var.d() : 0);
        if (w0Var != null) {
            i10 = w0Var.c();
        }
        return g10.f(i10).e();
    }

    private void D2(SurfaceHolder surfaceHolder) {
        this.f22455b0 = false;
        this.f22452Z = surfaceHolder;
        surfaceHolder.addCallback(this.f22500y);
        Surface surface = this.f22452Z.getSurface();
        if (surface == null || !surface.isValid()) {
            t2(0, 0);
            return;
        }
        Rect surfaceFrame = this.f22452Z.getSurfaceFrame();
        t2(surfaceFrame.width(), surfaceFrame.height());
    }

    private q3.J E1() {
        return new t0(this.f22480o, this.f22442P);
    }

    /* access modifiers changed from: private */
    public void E2(SurfaceTexture surfaceTexture) {
        Surface surface = new Surface(surfaceTexture);
        F2(surface);
        this.f22451Y = surface;
    }

    private List<C6479C> F1(List<w> list) {
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < list.size(); i10++) {
            arrayList.add(this.f22484q.d(list.get(i10)));
        }
        return arrayList;
    }

    /* access modifiers changed from: private */
    public void F2(Object obj) {
        ArrayList<s0> arrayList = new ArrayList<>();
        boolean z10 = false;
        for (u0 u0Var : this.f22464g) {
            if (u0Var.i() == 2) {
                arrayList.add(G1(u0Var).n(1).m(obj).l());
            }
        }
        Object obj2 = this.f22450X;
        if (!(obj2 == null || obj2 == obj)) {
            try {
                for (s0 a10 : arrayList) {
                    a10.a(this.f22432F);
                }
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            } catch (TimeoutException unused2) {
                z10 = true;
            }
            Object obj3 = this.f22450X;
            Surface surface = this.f22451Y;
            if (obj3 == surface) {
                surface.release();
                this.f22451Y = null;
            }
        }
        this.f22450X = obj;
        if (z10) {
            H2(C5233j.d(new z3.C(3), AffirmProcessorActivity.RESULT_CODE_ERROR));
        }
    }

    private s0 G1(s0.b bVar) {
        int K12 = K1(this.f22497w0);
        W w10 = this.f22472k;
        q3.J j10 = this.f22497w0.f22844a;
        if (K12 == -1) {
            K12 = 0;
        }
        return new s0(w10, bVar, j10, K12, this.f22498x, w10.H());
    }

    private Pair<Boolean, Integer> H1(r0 r0Var, r0 r0Var2, boolean z10, int i10, boolean z11, boolean z12) {
        q3.J j10 = r0Var2.f22844a;
        q3.J j11 = r0Var.f22844a;
        if (j11.q() && j10.q()) {
            return new Pair<>(Boolean.FALSE, -1);
        }
        int i11 = 3;
        if (j11.q() != j10.q()) {
            return new Pair<>(Boolean.TRUE, 3);
        }
        if (j10.n(j10.h(r0Var2.f22845b.f35620a, this.f22478n).f27904c, this.f28128a).f27925a.equals(j11.n(j11.h(r0Var.f22845b.f35620a, this.f22478n).f27904c, this.f28128a).f27925a)) {
            return (!z10 || i10 != 0 || r0Var2.f22845b.f35623d >= r0Var.f22845b.f35623d) ? (!z10 || i10 != 1 || !z12) ? new Pair<>(Boolean.FALSE, -1) : new Pair<>(Boolean.TRUE, 2) : new Pair<>(Boolean.TRUE, 0);
        }
        if (z10 && i10 == 0) {
            i11 = 1;
        } else if (z10 && i10 == 1) {
            i11 = 2;
        } else if (!z11) {
            throw new IllegalStateException();
        }
        return new Pair<>(Boolean.TRUE, Integer.valueOf(i11));
    }

    private void H2(C5233j jVar) {
        r0 r0Var = this.f22497w0;
        r0 c10 = r0Var.c(r0Var.f22845b);
        c10.f22860q = c10.f22862s;
        c10.f22861r = 0;
        r0 h10 = c10.h(1);
        if (jVar != null) {
            h10 = h10.f(jVar);
        }
        this.f22438L++;
        this.f22472k.w1();
        K2(h10, 0, false, 5, -9223372036854775807L, -1, false);
    }

    private long I1(r0 r0Var) {
        if (!r0Var.f22845b.b()) {
            return N.q1(J1(r0Var));
        }
        r0Var.f22844a.h(r0Var.f22845b.f35620a, this.f22478n);
        return r0Var.f22846c == -9223372036854775807L ? r0Var.f22844a.n(K1(r0Var), this.f28128a).b() : this.f22478n.m() + N.q1(r0Var.f22846c);
    }

    private void I2() {
        E.b bVar = this.f22445S;
        E.b O10 = N.O(this.f22462f, this.f22456c);
        this.f22445S = O10;
        if (!O10.equals(bVar)) {
            this.f22474l.i(13, new C5247y(this));
        }
    }

    private long J1(r0 r0Var) {
        if (r0Var.f22844a.q()) {
            return N.P0(this.f22503z0);
        }
        long m10 = r0Var.f22859p ? r0Var.m() : r0Var.f22862s;
        return r0Var.f22845b.b() ? m10 : v2(r0Var.f22844a, r0Var.f22845b, m10);
    }

    /* access modifiers changed from: private */
    public void J2(boolean z10, int i10, int i11) {
        boolean z11 = z10 && i10 != -1;
        int C12 = C1(z11, i10);
        r0 r0Var = this.f22497w0;
        if (r0Var.f22855l != z11 || r0Var.f22857n != C12 || r0Var.f22856m != i11) {
            L2(z11, i11, C12);
        }
    }

    private int K1(r0 r0Var) {
        return r0Var.f22844a.q() ? this.f22499x0 : r0Var.f22844a.h(r0Var.f22845b.f35620a, this.f22478n).f27904c;
    }

    private void K2(r0 r0Var, int i10, boolean z10, int i11, long j10, int i12, boolean z11) {
        r0 r0Var2 = r0Var;
        int i13 = i11;
        r0 r0Var3 = this.f22497w0;
        this.f22497w0 = r0Var2;
        boolean equals = r0Var3.f22844a.equals(r0Var2.f22844a);
        Pair<Boolean, Integer> H12 = H1(r0Var, r0Var3, z10, i11, !equals, z11);
        boolean booleanValue = ((Boolean) H12.first).booleanValue();
        int intValue = ((Integer) H12.second).intValue();
        w wVar = null;
        if (booleanValue) {
            if (!r0Var2.f22844a.q()) {
                wVar = r0Var2.f22844a.n(r0Var2.f22844a.h(r0Var2.f22845b.f35620a, this.f22478n).f27904c, this.f28128a).f27927c;
            }
            this.f22495v0 = y.f28453I;
        }
        if (booleanValue || !r0Var3.f22853j.equals(r0Var2.f22853j)) {
            this.f22495v0 = this.f22495v0.a().M(r0Var2.f22853j).J();
        }
        y z12 = z1();
        boolean equals2 = z12.equals(this.f22446T);
        this.f22446T = z12;
        boolean z13 = r0Var3.f22855l != r0Var2.f22855l;
        boolean z14 = r0Var3.f22848e != r0Var2.f22848e;
        if (z14 || z13) {
            N2();
        }
        boolean z15 = r0Var3.f22850g;
        boolean z16 = r0Var2.f22850g;
        boolean z17 = z15 != z16;
        if (z17) {
            M2(z16);
        }
        if (!equals) {
            this.f22474l.i(0, new C5234k(r0Var2, i10));
        }
        if (z10) {
            this.f22474l.i(11, new E(i13, O1(i13, r0Var3, i12), N1(j10)));
        }
        if (booleanValue) {
            this.f22474l.i(1, new F(wVar, intValue));
        }
        if (r0Var3.f22849f != r0Var2.f22849f) {
            this.f22474l.i(10, new G(r0Var2));
            if (r0Var2.f22849f != null) {
                this.f22474l.i(10, new H(r0Var2));
            }
        }
        D d10 = r0Var3.f22852i;
        D d11 = r0Var2.f22852i;
        if (d10 != d11) {
            this.f22466h.i(d11.f36669e);
            this.f22474l.i(2, new I(r0Var2));
        }
        if (!equals2) {
            this.f22474l.i(14, new C5235l(this.f22446T));
        }
        if (z17) {
            this.f22474l.i(3, new C5236m(r0Var2));
        }
        if (z14 || z13) {
            this.f22474l.i(-1, new C5237n(r0Var2));
        }
        if (z14) {
            this.f22474l.i(4, new C5238o(r0Var2));
        }
        if (z13 || r0Var3.f22856m != r0Var2.f22856m) {
            this.f22474l.i(5, new C5244v(r0Var2));
        }
        if (r0Var3.f22857n != r0Var2.f22857n) {
            this.f22474l.i(6, new B(r0Var2));
        }
        if (r0Var3.n() != r0Var.n()) {
            this.f22474l.i(7, new C(r0Var2));
        }
        if (!r0Var3.f22858o.equals(r0Var2.f22858o)) {
            this.f22474l.i(12, new D(r0Var2));
        }
        I2();
        this.f22474l.f();
        if (r0Var3.f22859p != r0Var2.f22859p) {
            Iterator<ExoPlayer.a> it = this.f22476m.iterator();
            while (it.hasNext()) {
                it.next().E(r0Var2.f22859p);
            }
        }
    }

    /* access modifiers changed from: private */
    public static int L1(int i10) {
        return i10 == -1 ? 2 : 1;
    }

    /* access modifiers changed from: private */
    public void L2(boolean z10, int i10, int i11) {
        this.f22438L++;
        r0 r0Var = this.f22497w0;
        if (r0Var.f22859p) {
            r0Var = r0Var.a();
        }
        r0 e10 = r0Var.e(z10, i10, i11);
        this.f22472k.e1(z10, i10, i11);
        K2(e10, 0, false, 5, -9223372036854775807L, -1, false);
    }

    private void M2(boolean z10) {
        G g10 = this.f22485q0;
        if (g10 == null) {
            return;
        }
        if (z10 && !this.f22487r0) {
            g10.a(this.f22483p0);
            this.f22487r0 = true;
        } else if (!z10 && this.f22487r0) {
            g10.c(this.f22483p0);
            this.f22487r0 = false;
        }
    }

    private E.e N1(long j10) {
        int i10;
        Object obj;
        w wVar;
        Object obj2;
        int Y10 = Y();
        if (!this.f22497w0.f22844a.q()) {
            r0 r0Var = this.f22497w0;
            Object obj3 = r0Var.f22845b.f35620a;
            r0Var.f22844a.h(obj3, this.f22478n);
            i10 = this.f22497w0.f22844a.b(obj3);
            obj = obj3;
            obj2 = this.f22497w0.f22844a.n(Y10, this.f28128a).f27925a;
            wVar = this.f28128a.f27927c;
        } else {
            wVar = null;
            obj = null;
            i10 = -1;
            obj2 = null;
        }
        long q12 = N.q1(j10);
        long q13 = this.f22497w0.f22845b.b() ? N.q1(P1(this.f22497w0)) : q12;
        C6479C.b bVar = this.f22497w0.f22845b;
        return new E.e(obj2, Y10, wVar, obj, i10, q12, q13, bVar.f35621b, bVar.f35622c);
    }

    /* access modifiers changed from: private */
    public void N2() {
        int V10 = V();
        boolean z10 = true;
        if (V10 != 1) {
            if (V10 == 2 || V10 == 3) {
                boolean S12 = S1();
                z0 z0Var = this.f22430D;
                if (!H() || S12) {
                    z10 = false;
                }
                z0Var.b(z10);
                this.f22431E.b(H());
                return;
            } else if (V10 != 4) {
                throw new IllegalStateException();
            }
        }
        this.f22430D.b(false);
        this.f22431E.b(false);
    }

    private E.e O1(int i10, r0 r0Var, int i11) {
        int i12;
        Object obj;
        w wVar;
        int i13;
        Object obj2;
        long j10;
        long j11;
        r0 r0Var2 = r0Var;
        J.b bVar = new J.b();
        if (!r0Var2.f22844a.q()) {
            Object obj3 = r0Var2.f22845b.f35620a;
            r0Var2.f22844a.h(obj3, bVar);
            int i14 = bVar.f27904c;
            int b10 = r0Var2.f22844a.b(obj3);
            Object obj4 = r0Var2.f22844a.n(i14, this.f28128a).f27925a;
            wVar = this.f28128a.f27927c;
            obj = obj3;
            i12 = b10;
            obj2 = obj4;
            i13 = i14;
        } else {
            i13 = i11;
            obj2 = null;
            wVar = null;
            obj = null;
            i12 = -1;
        }
        if (i10 == 0) {
            if (r0Var2.f22845b.b()) {
                C6479C.b bVar2 = r0Var2.f22845b;
                j11 = bVar.b(bVar2.f35621b, bVar2.f35622c);
                j10 = P1(r0Var);
                long q12 = N.q1(j11);
                long q13 = N.q1(j10);
                C6479C.b bVar3 = r0Var2.f22845b;
                return new E.e(obj2, i13, wVar, obj, i12, q12, q13, bVar3.f35621b, bVar3.f35622c);
            }
            j11 = r0Var2.f22845b.f35624e != -1 ? P1(this.f22497w0) : bVar.f27906e + bVar.f27905d;
        } else if (r0Var2.f22845b.b()) {
            j11 = r0Var2.f22862s;
            j10 = P1(r0Var);
            long q122 = N.q1(j11);
            long q132 = N.q1(j10);
            C6479C.b bVar32 = r0Var2.f22845b;
            return new E.e(obj2, i13, wVar, obj, i12, q122, q132, bVar32.f35621b, bVar32.f35622c);
        } else {
            j11 = bVar.f27906e + r0Var2.f22862s;
        }
        j10 = j11;
        long q1222 = N.q1(j11);
        long q1322 = N.q1(j10);
        C6479C.b bVar322 = r0Var2.f22845b;
        return new E.e(obj2, i13, wVar, obj, i12, q1222, q1322, bVar322.f35621b, bVar322.f35622c);
    }

    private void O2() {
        this.f22458d.b();
        if (Thread.currentThread() != B().getThread()) {
            String G10 = N.G("Player is accessed on the wrong thread.\nCurrent thread: '%s'\nExpected thread: '%s'\nSee https://developer.android.com/guide/topics/media/issues/player-accessed-on-wrong-thread", Thread.currentThread().getName(), B().getThread().getName());
            if (!this.f22479n0) {
                q.i("ExoPlayerImpl", G10, this.f22481o0 ? null : new IllegalStateException());
                this.f22481o0 = true;
                return;
            }
            throw new IllegalStateException(G10);
        }
    }

    private static long P1(r0 r0Var) {
        J.c cVar = new J.c();
        J.b bVar = new J.b();
        r0Var.f22844a.h(r0Var.f22845b.f35620a, bVar);
        return r0Var.f22846c == -9223372036854775807L ? r0Var.f22844a.n(bVar.f27904c, cVar).c() : bVar.n() + r0Var.f22846c;
    }

    /* access modifiers changed from: private */
    /* renamed from: Q1 */
    public void V1(W.e eVar) {
        long j10;
        int i10 = this.f22438L - eVar.f22596c;
        this.f22438L = i10;
        boolean z10 = true;
        if (eVar.f22597d) {
            this.f22439M = eVar.f22598e;
            this.f22440N = true;
        }
        if (i10 == 0) {
            q3.J j11 = eVar.f22595b.f22844a;
            if (!this.f22497w0.f22844a.q() && j11.q()) {
                this.f22499x0 = -1;
                this.f22503z0 = 0;
                this.f22501y0 = 0;
            }
            if (!j11.q()) {
                List<q3.J> F10 = ((t0) j11).F();
                C5950a.g(F10.size() == this.f22480o.size());
                for (int i11 = 0; i11 < F10.size(); i11++) {
                    this.f22480o.get(i11).c(F10.get(i11));
                }
            }
            long j12 = -9223372036854775807L;
            if (this.f22440N) {
                if (eVar.f22595b.f22845b.equals(this.f22497w0.f22845b) && eVar.f22595b.f22847d == this.f22497w0.f22862s) {
                    z10 = false;
                }
                if (z10) {
                    if (j11.q() || eVar.f22595b.f22845b.b()) {
                        j10 = eVar.f22595b.f22847d;
                    } else {
                        r0 r0Var = eVar.f22595b;
                        j10 = v2(j11, r0Var.f22845b, r0Var.f22847d);
                    }
                    j12 = j10;
                }
            } else {
                z10 = false;
            }
            this.f22440N = false;
            K2(eVar.f22595b, 1, z10, this.f22439M, j12, -1, false);
        }
    }

    /* access modifiers changed from: private */
    public boolean R1() {
        AudioManager audioManager;
        y0 y0Var;
        int i10 = N.f29462a;
        if (i10 >= 35 && (y0Var = this.f22435I) != null) {
            return y0Var.b();
        }
        if (i10 < 23 || (audioManager = this.f22433G) == null) {
            return true;
        }
        return b.a(this.f22460e, audioManager.getDevices(2));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void U1(E.d dVar, C5806q qVar) {
        dVar.d0(this.f22462f, new E.c(qVar));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void W1(W.e eVar) {
        this.f22468i.h(new C5246x(this, eVar));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void c2(E.d dVar) {
        dVar.T(this.f22445S);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void e2(int i10, E.e eVar, E.e eVar2, E.d dVar) {
        dVar.Y(i10);
        dVar.N(eVar, eVar2, i10);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void k2(r0 r0Var, E.d dVar) {
        dVar.D(r0Var.f22850g);
        dVar.Z(r0Var.f22850g);
    }

    private r0 r2(r0 r0Var, q3.J j10, Pair<Object, Long> pair) {
        int i10;
        q3.J j11 = j10;
        Pair<Object, Long> pair2 = pair;
        C5950a.a(j10.q() || pair2 != null);
        q3.J j12 = r0Var.f22844a;
        long I12 = I1(r0Var);
        r0 j13 = r0Var.j(j10);
        if (j10.q()) {
            C6479C.b l10 = r0.l();
            long P02 = N.P0(this.f22503z0);
            r0 c10 = j13.d(l10, P02, P02, P02, 0, k0.f35937d, this.f22454b, C9967v.E()).c(l10);
            c10.f22860q = c10.f22862s;
            return c10;
        }
        Object obj = j13.f22845b.f35620a;
        boolean equals = obj.equals(((Pair) N.i(pair)).first);
        C6479C.b bVar = !equals ? new C6479C.b(pair2.first) : j13.f22845b;
        long longValue = ((Long) pair2.second).longValue();
        long P03 = N.P0(I12);
        if (!j12.q()) {
            P03 -= j12.h(obj, this.f22478n).n();
        }
        if (!equals || longValue < P03) {
            long j14 = longValue;
            C6479C.b bVar2 = bVar;
            C5950a.g(!bVar2.b());
            C6479C.b bVar3 = bVar2;
            r0 c11 = j13.d(bVar3, j14, j14, j14, 0, !equals ? k0.f35937d : j13.f22851h, !equals ? this.f22454b : j13.f22852i, !equals ? C9967v.E() : j13.f22853j).c(bVar3);
            c11.f22860q = j14;
            return c11;
        }
        if (i10 == 0) {
            int b10 = j11.b(j13.f22854k.f35620a);
            if (b10 == -1 || j11.f(b10, this.f22478n).f27904c != j11.h(bVar.f35620a, this.f22478n).f27904c) {
                j11.h(bVar.f35620a, this.f22478n);
                long b11 = bVar.b() ? this.f22478n.b(bVar.f35621b, bVar.f35622c) : this.f22478n.f27905d;
                j13 = j13.d(bVar, j13.f22862s, j13.f22862s, j13.f22847d, b11 - j13.f22862s, j13.f22851h, j13.f22852i, j13.f22853j).c(bVar);
                j13.f22860q = b11;
            }
        } else {
            C6479C.b bVar4 = bVar;
            C5950a.g(!bVar4.b());
            long max = Math.max(0, j13.f22861r - (longValue - P03));
            long j15 = j13.f22860q;
            if (j13.f22854k.equals(j13.f22845b)) {
                j15 = longValue + max;
            }
            j13 = j13.d(bVar4, longValue, longValue, longValue, max, j13.f22851h, j13.f22852i, j13.f22853j);
            j13.f22860q = j15;
        }
        return j13;
    }

    private Pair<Object, Long> s2(q3.J j10, int i10, long j11) {
        if (j10.q()) {
            this.f22499x0 = i10;
            if (j11 == -9223372036854775807L) {
                j11 = 0;
            }
            this.f22503z0 = j11;
            this.f22501y0 = 0;
            return null;
        }
        if (i10 == -1 || i10 >= j10.p()) {
            i10 = j10.a(this.f22437K);
            j11 = j10.n(i10, this.f28128a).b();
        }
        return j10.j(this.f28128a, this.f22478n, i10, N.P0(j11));
    }

    /* access modifiers changed from: private */
    public void t2(int i10, int i11) {
        if (i10 != this.f22463f0.b() || i11 != this.f22463f0.a()) {
            this.f22463f0 = new t3.D(i10, i11);
            this.f22474l.l(24, new C5239p(i10, i11));
            y2(2, 14, new t3.D(i10, i11));
        }
    }

    /* access modifiers changed from: private */
    public void u2(boolean z10) {
        if (z10) {
            r0 r0Var = this.f22497w0;
            if (r0Var.f22857n == 3) {
                L2(r0Var.f22855l, 1, 0);
                return;
            }
            return;
        }
        L2(this.f22497w0.f22855l, 1, 3);
    }

    private long v2(q3.J j10, C6479C.b bVar, long j11) {
        j10.h(bVar.f35620a, this.f22478n);
        return j11 + this.f22478n.n();
    }

    private void w2(int i10, int i11) {
        for (int i12 = i11 - 1; i12 >= i10; i12--) {
            this.f22480o.remove(i12);
        }
        this.f22442P = this.f22442P.a(i10, i11);
    }

    private void x2() {
        if (this.f22453a0 != null) {
            G1(this.f22502z).n(10000).m((Object) null).l();
            this.f22453a0.i(this.f22500y);
            this.f22453a0 = null;
        }
        TextureView textureView = this.f22457c0;
        if (textureView != null) {
            if (textureView.getSurfaceTextureListener() != this.f22500y) {
                q.h("ExoPlayerImpl", "SurfaceTextureListener already unset or replaced.");
            } else {
                this.f22457c0.setSurfaceTextureListener((TextureView.SurfaceTextureListener) null);
            }
            this.f22457c0 = null;
        }
        SurfaceHolder surfaceHolder = this.f22452Z;
        if (surfaceHolder != null) {
            surfaceHolder.removeCallback(this.f22500y);
            this.f22452Z = null;
        }
    }

    private List<q0.c> y1(int i10, List<C6479C> list) {
        ArrayList arrayList = new ArrayList();
        for (int i11 = 0; i11 < list.size(); i11++) {
            q0.c cVar = new q0.c(list.get(i11), this.f22482p);
            arrayList.add(cVar);
            this.f22480o.add(i11 + i10, new f(cVar.f22838b, cVar.f22837a));
        }
        this.f22442P = this.f22442P.g(i10, arrayList.size());
        return arrayList;
    }

    private void y2(int i10, int i11, Object obj) {
        for (u0 u0Var : this.f22464g) {
            if (i10 == -1 || u0Var.i() == i10) {
                G1(u0Var).n(i11).m(obj).l();
            }
        }
    }

    /* access modifiers changed from: private */
    public y z1() {
        q3.J z10 = z();
        if (z10.q()) {
            return this.f22495v0;
        }
        return this.f22495v0.a().L(z10.n(Y(), this.f28128a).f27927c.f28322e).J();
    }

    private void z2(int i10, Object obj) {
        y2(-1, i10, obj);
    }

    public void A(E.d dVar) {
        O2();
        this.f22474l.k((E.d) C5950a.e(dVar));
    }

    public void A1() {
        O2();
        x2();
        F2((Object) null);
        t2(0, 0);
    }

    public Looper B() {
        return this.f22488s;
    }

    public void B1(SurfaceHolder surfaceHolder) {
        O2();
        if (surfaceHolder != null && surfaceHolder == this.f22452Z) {
            A1();
        }
    }

    public void B2(List<C6479C> list, boolean z10) {
        O2();
        C2(list, -1, -9223372036854775807L, z10);
    }

    public M C() {
        O2();
        return this.f22466h.c();
    }

    public void E(TextureView textureView) {
        O2();
        if (textureView == null) {
            A1();
            return;
        }
        x2();
        this.f22457c0 = textureView;
        if (textureView.getSurfaceTextureListener() != null) {
            q.h("ExoPlayerImpl", "Replacing existing SurfaceTextureListener.");
        }
        textureView.setSurfaceTextureListener(this.f22500y);
        SurfaceTexture surfaceTexture = textureView.isAvailable() ? textureView.getSurfaceTexture() : null;
        if (surfaceTexture == null) {
            F2((Object) null);
            t2(0, 0);
            return;
        }
        E2(surfaceTexture);
        t2(textureView.getWidth(), textureView.getHeight());
    }

    public E.b G() {
        O2();
        return this.f22445S;
    }

    public void G2(SurfaceHolder surfaceHolder) {
        O2();
        if (surfaceHolder == null) {
            A1();
            return;
        }
        x2();
        this.f22455b0 = true;
        this.f22452Z = surfaceHolder;
        surfaceHolder.addCallback(this.f22500y);
        Surface surface = surfaceHolder.getSurface();
        if (surface == null || !surface.isValid()) {
            F2((Object) null);
            t2(0, 0);
            return;
        }
        F2(surface);
        Rect surfaceFrame = surfaceHolder.getSurfaceFrame();
        t2(surfaceFrame.width(), surfaceFrame.height());
    }

    public boolean H() {
        O2();
        return this.f22497w0.f22855l;
    }

    public void I(boolean z10) {
        O2();
        if (this.f22437K != z10) {
            this.f22437K = z10;
            this.f22472k.m1(z10);
            this.f22474l.i(9, new C5248z(z10));
            I2();
            this.f22474l.f();
        }
    }

    public long J() {
        O2();
        return this.f22496w;
    }

    public int L() {
        O2();
        if (this.f22497w0.f22844a.q()) {
            return this.f22501y0;
        }
        r0 r0Var = this.f22497w0;
        return r0Var.f22844a.b(r0Var.f22845b.f35620a);
    }

    public void M(TextureView textureView) {
        O2();
        if (textureView != null && textureView == this.f22457c0) {
            A1();
        }
    }

    /* renamed from: M1 */
    public C5233j p() {
        O2();
        return this.f22497w0.f22849f;
    }

    public S N() {
        O2();
        return this.f22493u0;
    }

    public int Q() {
        O2();
        if (f()) {
            return this.f22497w0.f22845b.f35622c;
        }
        return -1;
    }

    public long S() {
        O2();
        return this.f22494v;
    }

    public boolean S1() {
        O2();
        return this.f22497w0.f22859p;
    }

    public long T() {
        O2();
        return I1(this.f22497w0);
    }

    public int V() {
        O2();
        return this.f22497w0.f22848e;
    }

    public void X(M m10) {
        O2();
        if (this.f22466h.h() && !m10.equals(this.f22466h.c())) {
            this.f22466h.m(m10);
            this.f22474l.l(19, new A(m10));
        }
    }

    public int Y() {
        O2();
        int K12 = K1(this.f22497w0);
        if (K12 == -1) {
            return 0;
        }
        return K12;
    }

    public void Z(int i10) {
        O2();
        if (this.f22436J != i10) {
            this.f22436J = i10;
            this.f22472k.j1(i10);
            this.f22474l.i(8, new r(i10));
            I2();
            this.f22474l.f();
        }
    }

    public long a() {
        O2();
        if (!f()) {
            return K();
        }
        r0 r0Var = this.f22497w0;
        C6479C.b bVar = r0Var.f22845b;
        r0Var.f22844a.h(bVar.f35620a, this.f22478n);
        return N.q1(this.f22478n.b(bVar.f35621b, bVar.f35622c));
    }

    public void a0(SurfaceView surfaceView) {
        O2();
        B1(surfaceView == null ? null : surfaceView.getHolder());
    }

    public void b(int i10) {
        O2();
        this.f22459d0 = i10;
        y2(2, 4, Integer.valueOf(i10));
    }

    public int b0() {
        O2();
        return this.f22436J;
    }

    public boolean c0() {
        O2();
        return this.f22437K;
    }

    public void d() {
        O2();
        boolean H10 = H();
        int i10 = 2;
        int r10 = this.f22428B.r(H10, 2);
        J2(H10, r10, L1(r10));
        r0 r0Var = this.f22497w0;
        if (r0Var.f22848e == 1) {
            r0 f10 = r0Var.f((C5233j) null);
            if (f10.f22844a.q()) {
                i10 = 4;
            }
            r0 h10 = f10.h(i10);
            this.f22438L++;
            this.f22472k.v0();
            K2(h10, 1, false, 5, -9223372036854775807L, -1, false);
        }
    }

    public long d0() {
        O2();
        if (this.f22497w0.f22844a.q()) {
            return this.f22503z0;
        }
        r0 r0Var = this.f22497w0;
        if (r0Var.f22854k.f35623d != r0Var.f22845b.f35623d) {
            return r0Var.f22844a.n(Y(), this.f28128a).d();
        }
        long j10 = r0Var.f22860q;
        if (this.f22497w0.f22854k.b()) {
            r0 r0Var2 = this.f22497w0;
            J.b h10 = r0Var2.f22844a.h(r0Var2.f22854k.f35620a, this.f22478n);
            long f10 = h10.f(this.f22497w0.f22854k.f35621b);
            j10 = f10 == Long.MIN_VALUE ? h10.f27905d : f10;
        }
        r0 r0Var3 = this.f22497w0;
        return N.q1(v2(r0Var3.f22844a, r0Var3.f22854k, j10));
    }

    public q3.D e() {
        O2();
        return this.f22497w0.f22858o;
    }

    public boolean f() {
        O2();
        return this.f22497w0.f22845b.b();
    }

    public void g(q3.D d10) {
        O2();
        if (d10 == null) {
            d10 = q3.D.f27856d;
        }
        if (!this.f22497w0.f22858o.equals(d10)) {
            r0 g10 = this.f22497w0.g(d10);
            this.f22438L++;
            this.f22472k.g1(d10);
            K2(g10, 0, false, 5, -9223372036854775807L, -1, false);
        }
    }

    public y g0() {
        O2();
        return this.f22446T;
    }

    public void h(float f10) {
        O2();
        float o10 = N.o(f10, 0.0f, 1.0f);
        if (this.f22473k0 != o10) {
            this.f22473k0 = o10;
            A2();
            this.f22474l.l(22, new C5245w(o10));
        }
    }

    public long h0() {
        O2();
        return N.q1(J1(this.f22497w0));
    }

    public long i0() {
        O2();
        return this.f22492u;
    }

    public long k() {
        O2();
        return N.q1(this.f22497w0.f22861r);
    }

    public void m(List<w> list, boolean z10) {
        O2();
        B2(F1(list), z10);
    }

    public void n(SurfaceView surfaceView) {
        O2();
        if (surfaceView instanceof n) {
            x2();
            F2(surfaceView);
            D2(surfaceView.getHolder());
        } else if (surfaceView instanceof SphericalGLSurfaceView) {
            x2();
            this.f22453a0 = (SphericalGLSurfaceView) surfaceView;
            G1(this.f22502z).n(10000).m(this.f22453a0).l();
            this.f22453a0.d(this.f22500y);
            F2(this.f22453a0.getVideoSurface());
            D2(surfaceView.getHolder());
        } else {
            G2(surfaceView == null ? null : surfaceView.getHolder());
        }
    }

    public void p0(int i10, long j10, int i11, boolean z10) {
        O2();
        if (i10 != -1) {
            C5950a.a(i10 >= 0);
            q3.J j11 = this.f22497w0.f22844a;
            if (j11.q() || i10 < j11.p()) {
                this.f22486r.H();
                this.f22438L++;
                if (f()) {
                    q.h("ExoPlayerImpl", "seekTo ignored because an ad is playing");
                    W.e eVar = new W.e(this.f22497w0);
                    eVar.b(1);
                    this.f22470j.a(eVar);
                    return;
                }
                r0 r0Var = this.f22497w0;
                int i12 = r0Var.f22848e;
                if (i12 == 3 || (i12 == 4 && !j11.q())) {
                    r0Var = this.f22497w0.h(2);
                }
                int Y10 = Y();
                r0 r22 = r2(r0Var, j11, s2(j11, i10, j10));
                this.f22472k.O0(j11, i10, N.P0(j10));
                K2(r22, 0, true, 1, J1(r22), Y10, z10);
            }
        }
    }

    public void q(boolean z10) {
        O2();
        int r10 = this.f22428B.r(z10, V());
        J2(z10, r10, L1(r10));
    }

    public q3.N r() {
        O2();
        return this.f22497w0.f22852i.f36668d;
    }

    public void release() {
        q.f("ExoPlayerImpl", "Release " + Integer.toHexString(System.identityHashCode(this)) + " [" + "AndroidXMedia3/1.5.1" + "] [" + N.f29466e + "] [" + x.b() + "]");
        O2();
        this.f22427A.b(false);
        w0 w0Var = this.f22429C;
        if (w0Var != null) {
            w0Var.g();
        }
        this.f22430D.b(false);
        this.f22431E.b(false);
        this.f22428B.k();
        if (!this.f22472k.x0()) {
            this.f22474l.l(10, new C5240q());
        }
        this.f22474l.j();
        this.f22468i.e((Object) null);
        this.f22490t.d(this.f22486r);
        r0 r0Var = this.f22497w0;
        if (r0Var.f22859p) {
            this.f22497w0 = r0Var.a();
        }
        y0 y0Var = this.f22435I;
        if (y0Var != null && N.f29462a >= 35) {
            y0Var.c();
        }
        r0 h10 = this.f22497w0.h(1);
        this.f22497w0 = h10;
        r0 c10 = h10.c(h10.f22845b);
        this.f22497w0 = c10;
        c10.f22860q = c10.f22862s;
        this.f22497w0.f22861r = 0;
        this.f22486r.release();
        this.f22466h.j();
        x2();
        Surface surface = this.f22451Y;
        if (surface != null) {
            surface.release();
            this.f22451Y = null;
        }
        if (this.f22487r0) {
            ((G) C5950a.e(this.f22485q0)).c(this.f22483p0);
            this.f22487r0 = false;
        }
        this.f22477m0 = s3.b.f29075c;
        this.f22489s0 = true;
    }

    public void setImageOutput(ImageOutput imageOutput) {
        O2();
        y2(4, 15, imageOutput);
    }

    public void stop() {
        O2();
        this.f22428B.r(H(), 1);
        H2((C5233j) null);
        this.f22477m0 = new s3.b(C9967v.E(), this.f22497w0.f22862s);
    }

    public s3.b t() {
        O2();
        return this.f22477m0;
    }

    public void u(E.d dVar) {
        this.f22474l.c((E.d) C5950a.e(dVar));
    }

    public int v() {
        O2();
        if (f()) {
            return this.f22497w0.f22845b.f35621b;
        }
        return -1;
    }

    public void w1(C6300b bVar) {
        this.f22486r.M((C6300b) C5950a.e(bVar));
    }

    public void x1(ExoPlayer.a aVar) {
        this.f22476m.add(aVar);
    }

    public int y() {
        O2();
        return this.f22497w0.f22857n;
    }

    public q3.J z() {
        O2();
        return this.f22497w0.f22844a;
    }
}
