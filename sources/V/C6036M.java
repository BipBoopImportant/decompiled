package v;

import C.C4391e0;
import C.H0;
import C.p0;
import C.r;
import I.n;
import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.SurfaceTexture;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CameraManager;
import android.media.CamcorderProfile;
import android.os.Handler;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Range;
import android.util.Rational;
import android.util.Size;
import android.view.Surface;
import androidx.camera.camera2.internal.compat.quirk.LegacyCameraOutputConfigNullPointerQuirk;
import androidx.camera.camera2.internal.compat.quirk.LegacyCameraSurfaceCleanupQuirk;
import androidx.camera.core.impl.B;
import androidx.camera.core.impl.B0;
import androidx.camera.core.impl.C5010a;
import androidx.camera.core.impl.C5019e0;
import androidx.camera.core.impl.C5050u0;
import androidx.camera.core.impl.E;
import androidx.camera.core.impl.F;
import androidx.camera.core.impl.I;
import androidx.camera.core.impl.J;
import androidx.camera.core.impl.Q;
import androidx.camera.core.impl.V;
import androidx.camera.core.impl.X0;
import androidx.camera.core.impl.Z0;
import androidx.camera.core.impl.c1;
import androidx.camera.core.impl.n1;
import androidx.camera.core.impl.o1;
import androidx.camera.core.impl.p1;
import androidx.concurrent.futures.c;
import com.adjust.sdk.Constants;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import ob.C10101e;
import v.P1;
import w.C6166a;
import w.C6172g;
import w.O;
import x.C6227g;

/* renamed from: v.M  reason: case insensitive filesystem */
final class C6036M implements J {

    /* renamed from: A  reason: collision with root package name */
    private E1 f30261A;

    /* renamed from: B  reason: collision with root package name */
    private final C6066f1 f30262B;

    /* renamed from: C  reason: collision with root package name */
    private final P1.b f30263C;

    /* renamed from: D  reason: collision with root package name */
    private final Set<String> f30264D;

    /* renamed from: E  reason: collision with root package name */
    private B f30265E;

    /* renamed from: F  reason: collision with root package name */
    final Object f30266F;

    /* renamed from: G  reason: collision with root package name */
    private Z0 f30267G;

    /* renamed from: H  reason: collision with root package name */
    boolean f30268H;

    /* renamed from: I  reason: collision with root package name */
    private final C6072h1 f30269I;

    /* renamed from: J  reason: collision with root package name */
    private final w.B f30270J;

    /* renamed from: K  reason: collision with root package name */
    private final C6227g f30271K;

    /* renamed from: L  reason: collision with root package name */
    private final O1 f30272L;
    /* access modifiers changed from: private */

    /* renamed from: M  reason: collision with root package name */
    public final h f30273M;

    /* renamed from: a  reason: collision with root package name */
    private final n1 f30274a;

    /* renamed from: b  reason: collision with root package name */
    private final O f30275b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public final Executor f30276c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public final ScheduledExecutorService f30277d;

    /* renamed from: e  reason: collision with root package name */
    volatile i f30278e = i.INITIALIZED;

    /* renamed from: f  reason: collision with root package name */
    private final B0<J.a> f30279f;

    /* renamed from: g  reason: collision with root package name */
    private final Q0 f30280g;

    /* renamed from: h  reason: collision with root package name */
    private final C6109u f30281h;
    /* access modifiers changed from: private */

    /* renamed from: i  reason: collision with root package name */
    public final j f30282i;

    /* renamed from: j  reason: collision with root package name */
    final C6042T f30283j;

    /* renamed from: k  reason: collision with root package name */
    CameraDevice f30284k;

    /* renamed from: l  reason: collision with root package name */
    int f30285l;

    /* renamed from: m  reason: collision with root package name */
    C6057c1 f30286m;

    /* renamed from: n  reason: collision with root package name */
    final AtomicInteger f30287n;

    /* renamed from: o  reason: collision with root package name */
    c.a<Void> f30288o;

    /* renamed from: p  reason: collision with root package name */
    final Map<C6057c1, C10101e<Void>> f30289p;

    /* renamed from: q  reason: collision with root package name */
    private int f30290q;

    /* renamed from: r  reason: collision with root package name */
    final e f30291r;

    /* renamed from: s  reason: collision with root package name */
    final f f30292s;

    /* renamed from: t  reason: collision with root package name */
    final D.a f30293t;

    /* renamed from: u  reason: collision with root package name */
    final Q f30294u;

    /* renamed from: v  reason: collision with root package name */
    private final boolean f30295v;

    /* renamed from: w  reason: collision with root package name */
    private final boolean f30296w;

    /* renamed from: x  reason: collision with root package name */
    private boolean f30297x;

    /* renamed from: y  reason: collision with root package name */
    private boolean f30298y;

    /* renamed from: z  reason: collision with root package name */
    private boolean f30299z;

    /* renamed from: v.M$a */
    class a implements C6064f {
        a() {
        }

        public CamcorderProfile a(int i10, int i11) {
            return CamcorderProfile.get(i10, i11);
        }

        public boolean b(int i10, int i11) {
            return CamcorderProfile.hasProfile(i10, i11);
        }
    }

    /* renamed from: v.M$b */
    class b extends CameraDevice.StateCallback {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c.a f30301a;

        b(c.a aVar) {
            this.f30301a = aVar;
        }

        public void onClosed(CameraDevice cameraDevice) {
            C6036M.this.U("openCameraConfigAndClose camera closed");
            this.f30301a.c(null);
        }

        public void onDisconnected(CameraDevice cameraDevice) {
            C6036M.this.U("openCameraConfigAndClose camera disconnected");
            this.f30301a.c(null);
        }

        public void onError(CameraDevice cameraDevice, int i10) {
            C6036M m10 = C6036M.this;
            m10.U("openCameraConfigAndClose camera error " + i10);
            this.f30301a.c(null);
        }

        public void onOpened(CameraDevice cameraDevice) {
            C6036M.this.U("openCameraConfigAndClose camera opened");
            C10101e L10 = C6036M.this.R(cameraDevice);
            Objects.requireNonNull(cameraDevice);
            L10.a(new C6037N(cameraDevice), C6036M.this.f30276c);
        }
    }

    /* renamed from: v.M$c */
    class c implements I.c<Void> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C6057c1 f30303a;

        c(C6057c1 c1Var) {
            this.f30303a = c1Var;
        }

        public void b(Throwable th2) {
        }

        /* renamed from: c */
        public void a(Void voidR) {
            C6036M.this.f30289p.remove(this.f30303a);
            int ordinal = C6036M.this.f30278e.ordinal();
            if (!(ordinal == 1 || ordinal == 4)) {
                if (ordinal == 5 || (ordinal == 6 && C6036M.this.f30285l != 0)) {
                    C6036M.this.U("Camera reopen required. Checking if the current camera can be closed safely.");
                } else {
                    return;
                }
            }
            if (C6036M.this.e0()) {
                C6036M m10 = C6036M.this;
                if (m10.f30284k != null) {
                    m10.U("closing camera");
                    C6166a.a(C6036M.this.f30284k);
                    C6036M.this.f30284k = null;
                }
            }
        }
    }

    /* renamed from: v.M$d */
    class d implements I.c<Void> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C6057c1 f30305a;

        d(C6057c1 c1Var) {
            this.f30305a = c1Var;
        }

        public void b(Throwable th2) {
            if (th2 instanceof C5019e0.a) {
                X0 W10 = C6036M.this.W(((C5019e0.a) th2).a());
                if (W10 != null) {
                    C6036M.this.C0(W10);
                }
            } else if (th2 instanceof CancellationException) {
                C6036M.this.U("Unable to configure camera cancelled");
            } else {
                i iVar = C6036M.this.f30278e;
                i iVar2 = i.OPENED;
                if (iVar == iVar2) {
                    C6036M.this.I0(iVar2, r.a.b(4, th2));
                }
                C4391e0.d("Camera2CameraImpl", "Unable to configure camera " + C6036M.this, th2);
                C6036M m10 = C6036M.this;
                if (m10.f30286m == this.f30305a) {
                    m10.F0(false);
                }
            }
        }

        /* renamed from: c */
        public void a(Void voidR) {
            if (C6036M.this.f30293t.c() == 2 && C6036M.this.f30278e == i.OPENED) {
                C6036M.this.H0(i.CONFIGURED);
            }
        }
    }

    /* renamed from: v.M$e */
    final class e extends CameraManager.AvailabilityCallback implements Q.c {

        /* renamed from: a  reason: collision with root package name */
        private final String f30307a;

        /* renamed from: b  reason: collision with root package name */
        private boolean f30308b = true;

        e(String str) {
            this.f30307a = str;
        }

        public void a() {
            if (C6036M.this.f30278e == i.PENDING_OPEN) {
                C6036M.this.Q0(false);
            }
        }

        /* access modifiers changed from: package-private */
        public boolean b() {
            return this.f30308b;
        }

        public void onCameraAvailable(String str) {
            if (this.f30307a.equals(str)) {
                this.f30308b = true;
                if (C6036M.this.f30278e == i.PENDING_OPEN) {
                    C6036M.this.Q0(false);
                }
            }
        }

        public void onCameraUnavailable(String str) {
            if (this.f30307a.equals(str)) {
                this.f30308b = false;
            }
        }
    }

    /* renamed from: v.M$f */
    final class f implements Q.b {
        f() {
        }

        public void a() {
            if (C6036M.this.f30278e == i.OPENED) {
                C6036M.this.A0();
            }
        }
    }

    /* renamed from: v.M$g */
    final class g implements F.d {
        g() {
        }

        public void a() {
            C6036M.this.R0();
        }

        public void b(List<V> list) {
            C6036M.this.K0((List) H2.i.g(list));
        }
    }

    /* renamed from: v.M$i */
    enum i {
        RELEASED,
        RELEASING,
        INITIALIZED,
        PENDING_OPEN,
        CLOSING,
        REOPENING_QUIRK,
        REOPENING,
        OPENING,
        OPENED,
        CONFIGURED
    }

    /* renamed from: v.M$j */
    final class j extends CameraDevice.StateCallback {

        /* renamed from: a  reason: collision with root package name */
        private final Executor f30317a;

        /* renamed from: b  reason: collision with root package name */
        private final ScheduledExecutorService f30318b;

        /* renamed from: c  reason: collision with root package name */
        private b f30319c;

        /* renamed from: d  reason: collision with root package name */
        ScheduledFuture<?> f30320d;

        /* renamed from: e  reason: collision with root package name */
        private final a f30321e;

        /* renamed from: v.M$j$a */
        class a {

            /* renamed from: a  reason: collision with root package name */
            private final long f30323a;

            /* renamed from: b  reason: collision with root package name */
            private long f30324b = -1;

            a(long j10) {
                this.f30323a = j10;
            }

            /* access modifiers changed from: package-private */
            public boolean a() {
                if (b() < ((long) d())) {
                    return true;
                }
                e();
                return false;
            }

            /* access modifiers changed from: package-private */
            public long b() {
                long uptimeMillis = SystemClock.uptimeMillis();
                if (this.f30324b == -1) {
                    this.f30324b = uptimeMillis;
                }
                return uptimeMillis - this.f30324b;
            }

            /* access modifiers changed from: package-private */
            public int c() {
                if (!j.this.f()) {
                    return 700;
                }
                long b10 = b();
                if (b10 <= 120000) {
                    return 1000;
                }
                return b10 <= 300000 ? 2000 : 4000;
            }

            /* access modifiers changed from: package-private */
            public int d() {
                if (!j.this.f()) {
                    long j10 = this.f30323a;
                    if (j10 > 0) {
                        return Math.min((int) j10, 10000);
                    }
                    return 10000;
                }
                long j11 = this.f30323a;
                return j11 > 0 ? Math.min((int) j11, Constants.THIRTY_MINUTES) : Constants.THIRTY_MINUTES;
            }

            /* access modifiers changed from: package-private */
            public void e() {
                this.f30324b = -1;
            }
        }

        /* renamed from: v.M$j$b */
        class b implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            private Executor f30326a;

            /* renamed from: b  reason: collision with root package name */
            private boolean f30327b = false;

            b(Executor executor) {
                this.f30326a = executor;
            }

            /* access modifiers changed from: private */
            public /* synthetic */ void c() {
                if (!this.f30327b) {
                    H2.i.i(C6036M.this.f30278e == i.REOPENING || C6036M.this.f30278e == i.REOPENING_QUIRK);
                    if (j.this.f()) {
                        C6036M.this.P0(true);
                    } else {
                        C6036M.this.Q0(true);
                    }
                }
            }

            /* access modifiers changed from: package-private */
            public void b() {
                this.f30327b = true;
            }

            public void run() {
                this.f30326a.execute(new C6040Q(this));
            }
        }

        j(Executor executor, ScheduledExecutorService scheduledExecutorService, long j10) {
            this.f30317a = executor;
            this.f30318b = scheduledExecutorService;
            this.f30321e = new a(j10);
        }

        private void b(CameraDevice cameraDevice, int i10) {
            boolean z10 = C6036M.this.f30278e == i.OPENING || C6036M.this.f30278e == i.OPENED || C6036M.this.f30278e == i.CONFIGURED || C6036M.this.f30278e == i.REOPENING || C6036M.this.f30278e == i.REOPENING_QUIRK;
            H2.i.j(z10, "Attempt to handle open error from non open state: " + C6036M.this.f30278e);
            if (i10 == 1 || i10 == 2 || i10 == 4) {
                C4391e0.a("Camera2CameraImpl", String.format("Attempt to reopen camera[%s] after error[%s]", new Object[]{cameraDevice.getId(), C6036M.a0(i10)}));
                c(i10);
                return;
            }
            C4391e0.c("Camera2CameraImpl", "Error observed on open (or opening) camera device " + cameraDevice.getId() + ": " + C6036M.a0(i10) + " closing camera.");
            C6036M.this.I0(i.CLOSING, r.a.a(i10 == 3 ? 5 : 6));
            C6036M.this.P(false);
        }

        private void c(int i10) {
            int i11 = 1;
            H2.i.j(C6036M.this.f30285l != 0, "Can only reopen camera device after error if the camera device is actually in an error state.");
            if (i10 == 1) {
                i11 = 2;
            } else if (i10 != 2) {
                i11 = 3;
            }
            C6036M.this.I0(i.REOPENING, r.a.a(i11));
            C6036M.this.P(false);
        }

        /* access modifiers changed from: package-private */
        public boolean a() {
            if (this.f30320d == null) {
                return false;
            }
            C6036M m10 = C6036M.this;
            m10.U("Cancelling scheduled re-open: " + this.f30319c);
            this.f30319c.b();
            this.f30319c = null;
            this.f30320d.cancel(false);
            this.f30320d = null;
            return true;
        }

        /* access modifiers changed from: package-private */
        public void d() {
            this.f30321e.e();
        }

        /* access modifiers changed from: package-private */
        public void e() {
            boolean z10 = true;
            H2.i.i(this.f30319c == null);
            if (this.f30320d != null) {
                z10 = false;
            }
            H2.i.i(z10);
            if (this.f30321e.a()) {
                this.f30319c = new b(this.f30317a);
                C6036M.this.U("Attempting camera re-open in " + this.f30321e.c() + "ms: " + this.f30319c + " activeResuming = " + C6036M.this.f30268H);
                this.f30320d = this.f30318b.schedule(this.f30319c, (long) this.f30321e.c(), TimeUnit.MILLISECONDS);
                return;
            }
            C4391e0.c("Camera2CameraImpl", "Camera reopening attempted for " + this.f30321e.d() + "ms without success.");
            C6036M.this.J0(i.PENDING_OPEN, (r.a) null, false);
        }

        /* access modifiers changed from: package-private */
        /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
            r0 = r0.f30285l;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean f() {
            /*
                r3 = this;
                v.M r0 = v.C6036M.this
                boolean r1 = r0.f30268H
                if (r1 == 0) goto L_0x000f
                int r0 = r0.f30285l
                r1 = 1
                if (r0 == r1) goto L_0x0010
                r2 = 2
                if (r0 != r2) goto L_0x000f
                goto L_0x0010
            L_0x000f:
                r1 = 0
            L_0x0010:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: v.C6036M.j.f():boolean");
        }

        public void onClosed(CameraDevice cameraDevice) {
            C6036M.this.U("CameraDevice.onClosed()");
            boolean z10 = C6036M.this.f30284k == null;
            H2.i.j(z10, "Unexpected onClose callback on camera device: " + cameraDevice);
            int ordinal = C6036M.this.f30278e.ordinal();
            if (ordinal == 1 || ordinal == 4) {
                H2.i.i(C6036M.this.e0());
                C6036M.this.S();
            } else if (ordinal == 5 || ordinal == 6) {
                C6036M m10 = C6036M.this;
                if (m10.f30285l != 0) {
                    m10.U("Camera closed due to error: " + C6036M.a0(C6036M.this.f30285l));
                    e();
                    return;
                }
                m10.Q0(false);
            } else {
                throw new IllegalStateException("Camera closed while in state: " + C6036M.this.f30278e);
            }
        }

        public void onDisconnected(CameraDevice cameraDevice) {
            C6036M.this.U("CameraDevice.onDisconnected()");
            onError(cameraDevice, 1);
        }

        public void onError(CameraDevice cameraDevice, int i10) {
            C6036M m10 = C6036M.this;
            m10.f30284k = cameraDevice;
            m10.f30285l = i10;
            m10.f30273M.b();
            int ordinal = C6036M.this.f30278e.ordinal();
            if (ordinal != 1) {
                switch (ordinal) {
                    case 4:
                        break;
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                    case 9:
                        C4391e0.a("Camera2CameraImpl", String.format("CameraDevice.onError(): %s failed with %s while in %s state. Will attempt recovering from error.", new Object[]{cameraDevice.getId(), C6036M.a0(i10), C6036M.this.f30278e.name()}));
                        b(cameraDevice, i10);
                        return;
                    default:
                        throw new IllegalStateException("onError() should not be possible from state: " + C6036M.this.f30278e);
                }
            }
            C4391e0.c("Camera2CameraImpl", String.format("CameraDevice.onError(): %s failed with %s while in %s state. Will finish closing camera.", new Object[]{cameraDevice.getId(), C6036M.a0(i10), C6036M.this.f30278e.name()}));
            C6036M.this.P(false);
        }

        public void onOpened(CameraDevice cameraDevice) {
            C6036M.this.U("CameraDevice.onOpened()");
            C6036M m10 = C6036M.this;
            m10.f30284k = cameraDevice;
            m10.f30285l = 0;
            d();
            int ordinal = C6036M.this.f30278e.ordinal();
            if (ordinal == 1 || ordinal == 4) {
                H2.i.i(C6036M.this.e0());
                C6036M.this.f30284k.close();
                C6036M.this.f30284k = null;
            } else if (ordinal == 5 || ordinal == 6 || ordinal == 7) {
                C6036M.this.H0(i.OPENED);
                Q q10 = C6036M.this.f30294u;
                String id2 = cameraDevice.getId();
                C6036M m11 = C6036M.this;
                if (q10.j(id2, m11.f30293t.a(m11.f30284k.getId()))) {
                    C6036M.this.A0();
                }
            } else {
                throw new IllegalStateException("onOpened() should not be possible from state: " + C6036M.this.f30278e);
            }
        }
    }

    /* renamed from: v.M$k */
    static abstract class k {
        k() {
        }

        static k a(String str, Class<?> cls, X0 x02, o1<?> o1Var, Size size, c1 c1Var, List<p1.b> list) {
            return new C6058d(str, cls, x02, o1Var, size, c1Var, list);
        }

        static k b(H0 h02, boolean z10) {
            return a(C6036M.c0(h02), h02.getClass(), z10 ? h02.w() : h02.u(), h02.j(), h02.f(), h02.e(), C6036M.Z(h02));
        }

        /* access modifiers changed from: package-private */
        public abstract List<p1.b> c();

        /* access modifiers changed from: package-private */
        public abstract X0 d();

        /* access modifiers changed from: package-private */
        public abstract c1 e();

        /* access modifiers changed from: package-private */
        public abstract Size f();

        /* access modifiers changed from: package-private */
        public abstract o1<?> g();

        /* access modifiers changed from: package-private */
        public abstract String h();

        /* access modifiers changed from: package-private */
        public abstract Class<?> i();
    }

    C6036M(Context context, O o10, String str, C6042T t10, D.a aVar, Q q10, Executor executor, Handler handler, C6072h1 h1Var, long j10) {
        O o11 = o10;
        String str2 = str;
        C6042T t11 = t10;
        Q q11 = q10;
        B0<J.a> b02 = new B0<>();
        this.f30279f = b02;
        this.f30285l = 0;
        this.f30287n = new AtomicInteger(0);
        this.f30289p = new LinkedHashMap();
        this.f30290q = 0;
        this.f30297x = false;
        this.f30298y = false;
        this.f30299z = true;
        this.f30264D = new HashSet();
        this.f30265E = E.a();
        this.f30266F = new Object();
        this.f30268H = false;
        this.f30273M = new h(this, (a) null);
        this.f30275b = o11;
        this.f30293t = aVar;
        this.f30294u = q11;
        ScheduledExecutorService e10 = H.a.e(handler);
        this.f30277d = e10;
        Executor f10 = H.a.f(executor);
        this.f30276c = f10;
        this.f30282i = new j(f10, e10, j10);
        this.f30274a = new n1(str2);
        b02.l(J.a.CLOSED);
        Q0 q02 = new Q0(q11);
        this.f30280g = q02;
        C6066f1 f1Var = new C6066f1(f10);
        this.f30262B = f1Var;
        this.f30269I = h1Var;
        try {
            w.B c10 = o10.c(str);
            this.f30270J = c10;
            C6066f1 f1Var2 = f1Var;
            C6109u uVar = r1;
            C6109u uVar2 = new C6109u(c10, e10, f10, new g(), t10.h());
            this.f30281h = uVar;
            this.f30283j = t11;
            t11.v(uVar);
            t11.y(q02.a());
            this.f30271K = C6227g.a(c10);
            this.f30286m = v0();
            Executor executor2 = f10;
            this.f30263C = new P1.b(f10, e10, handler, f1Var2, t10.h(), androidx.camera.camera2.internal.compat.quirk.b.c());
            this.f30295v = t10.h().a(LegacyCameraOutputConfigNullPointerQuirk.class);
            this.f30296w = t10.h().a(LegacyCameraSurfaceCleanupQuirk.class);
            e eVar = new e(str2);
            this.f30291r = eVar;
            f fVar = new f();
            this.f30292s = fVar;
            q11.g(this, executor2, fVar, eVar);
            o11.g(executor2, eVar);
            this.f30272L = new O1(context, str2, o11, new a());
        } catch (C6172g e11) {
            throw R0.a(e11);
        }
    }

    private void B0() {
        int ordinal = this.f30278e.ordinal();
        boolean z10 = false;
        if (ordinal == 2 || ordinal == 3) {
            P0(false);
        } else if (ordinal != 4) {
            U("open() ignored due to being in state: " + this.f30278e);
        } else {
            H0(i.REOPENING);
            if (!e0() && !this.f30298y && this.f30285l == 0) {
                if (this.f30284k != null) {
                    z10 = true;
                }
                H2.i.j(z10, "Camera Device should be open if session close is not complete");
                H0(i.OPENED);
                A0();
            }
        }
    }

    private void E0() {
        if (this.f30261A != null) {
            n1 n1Var = this.f30274a;
            n1Var.w(this.f30261A.f() + this.f30261A.hashCode());
            n1 n1Var2 = this.f30274a;
            n1Var2.x(this.f30261A.f() + this.f30261A.hashCode());
            this.f30261A.c();
            this.f30261A = null;
        }
    }

    private void G0(String str, X0 x02, o1<?> o1Var, c1 c1Var, List<p1.b> list) {
        this.f30276c.execute(new C6124z(this, str, x02, o1Var, c1Var, list));
    }

    private Collection<k> L0(Collection<H0> collection) {
        ArrayList arrayList = new ArrayList();
        for (H0 b10 : collection) {
            arrayList.add(k.b(b10, this.f30299z));
        }
        return arrayList;
    }

    private void M() {
        E1 e12 = this.f30261A;
        if (e12 != null) {
            String b02 = b0(e12);
            n1 n1Var = this.f30274a;
            X0 h10 = this.f30261A.h();
            o1<?> i10 = this.f30261A.i();
            p1.b bVar = p1.b.METERING_REPEATING;
            n1Var.v(b02, h10, i10, (c1) null, Collections.singletonList(bVar));
            this.f30274a.u(b02, this.f30261A.h(), this.f30261A.i(), (c1) null, Collections.singletonList(bVar));
        }
    }

    private void N() {
        X0 c10 = this.f30274a.g().c();
        V k10 = c10.k();
        int size = k10.i().size();
        int size2 = c10.o().size();
        if (c10.o().isEmpty()) {
            return;
        }
        if (k10.i().isEmpty()) {
            if (this.f30261A == null) {
                this.f30261A = new E1(this.f30283j.s(), this.f30269I, new C6019C(this));
            }
            if (f0()) {
                M();
            } else {
                C4391e0.c("Camera2CameraImpl", "Failed to add a repeating surface, CameraControl and ImageCapture may encounter issues due to the absence of repeating surface. Please add a UseCase (Preview or ImageAnalysis) that can provide a repeating surface for CameraControl and ImageCapture to function properly.");
            }
        } else if (size2 == 1 && size == 1) {
            E0();
        } else if (size >= 2) {
            E0();
        } else if (this.f30261A == null || f0()) {
            C4391e0.a("Camera2CameraImpl", "No need to remove a previous mMeteringRepeating, SessionConfig Surfaces: " + size2 + ", CaptureConfig Surfaces: " + size);
        } else {
            E0();
        }
    }

    private void N0(Collection<k> collection) {
        Size f10;
        boolean isEmpty = this.f30274a.h().isEmpty();
        ArrayList arrayList = new ArrayList();
        Rational rational = null;
        for (k next : collection) {
            if (!this.f30274a.o(next.h())) {
                this.f30274a.v(next.h(), next.d(), next.g(), next.e(), next.c());
                arrayList.add(next.h());
                if (next.i() == p0.class && (f10 = next.f()) != null) {
                    rational = new Rational(f10.getWidth(), f10.getHeight());
                }
            }
        }
        if (!arrayList.isEmpty()) {
            U("Use cases [" + TextUtils.join(", ", arrayList) + "] now ATTACHED");
            if (isEmpty) {
                this.f30281h.p0(true);
                this.f30281h.W();
            }
            N();
            S0();
            R0();
            F0(false);
            if (this.f30278e == i.OPENED) {
                A0();
            } else {
                B0();
            }
            if (rational != null) {
                this.f30281h.q0(rational);
            }
        }
    }

    private boolean O(V.a aVar) {
        if (!aVar.m().isEmpty()) {
            C4391e0.l("Camera2CameraImpl", "The capture config builder already has surface inside.");
            return false;
        }
        for (X0 k10 : this.f30274a.f()) {
            V k11 = k10.k();
            List<C5019e0> i10 = k11.i();
            if (!i10.isEmpty()) {
                if (k11.h() != 0) {
                    aVar.u(k11.h());
                }
                if (k11.l() != 0) {
                    aVar.x(k11.l());
                }
                for (C5019e0 f10 : i10) {
                    aVar.f(f10);
                }
            }
        }
        if (!aVar.m().isEmpty()) {
            return true;
        }
        C4391e0.l("Camera2CameraImpl", "Unable to find a repeating surface to attach to CaptureConfig");
        return false;
    }

    /* access modifiers changed from: private */
    /* renamed from: O0 */
    public void l0(Collection<k> collection) {
        ArrayList arrayList = new ArrayList();
        boolean z10 = false;
        for (k next : collection) {
            if (this.f30274a.o(next.h())) {
                this.f30274a.t(next.h());
                arrayList.add(next.h());
                if (next.i() == p0.class) {
                    z10 = true;
                }
            }
        }
        if (!arrayList.isEmpty()) {
            U("Use cases [" + TextUtils.join(", ", arrayList) + "] now DETACHED for camera");
            if (z10) {
                this.f30281h.q0((Rational) null);
            }
            N();
            if (this.f30274a.i().isEmpty()) {
                this.f30281h.s0(false);
            } else {
                S0();
            }
            if (this.f30274a.h().isEmpty()) {
                this.f30281h.C();
                F0(false);
                this.f30281h.p0(false);
                this.f30286m = v0();
                Q();
                return;
            }
            R0();
            F0(false);
            if (this.f30278e == i.OPENED) {
                A0();
            }
        }
    }

    private void Q() {
        U("Closing camera.");
        boolean z10 = true;
        switch (this.f30278e.ordinal()) {
            case 3:
                if (this.f30284k != null) {
                    z10 = false;
                }
                H2.i.i(z10);
                H0(i.INITIALIZED);
                return;
            case 5:
            case 6:
            case 7:
                if (!this.f30282i.a() && !this.f30273M.c()) {
                    z10 = false;
                }
                this.f30273M.a();
                H0(i.CLOSING);
                if (z10) {
                    H2.i.i(e0());
                    S();
                    return;
                }
                return;
            case 8:
            case 9:
                H0(i.CLOSING);
                P(false);
                return;
            default:
                U("close() ignored due to being in state: " + this.f30278e);
                return;
        }
    }

    /* access modifiers changed from: private */
    public C10101e<Void> R(CameraDevice cameraDevice) {
        C6054b1 b1Var = new C6054b1(this.f30271K);
        SurfaceTexture surfaceTexture = new SurfaceTexture(0);
        surfaceTexture.setDefaultBufferSize(640, 480);
        Surface surface = new Surface(surfaceTexture);
        C5050u0 u0Var = new C5050u0(surface);
        u0Var.k().a(new C6021D(surface, surfaceTexture), H.a.a());
        X0.b bVar = new X0.b();
        bVar.h(u0Var);
        bVar.z(1);
        U("Start configAndClose.");
        return I.d.b(n.I(b1Var.g(bVar.o(), cameraDevice, this.f30263C.a()))).f(new C6023E(b1Var, u0Var), this.f30276c);
    }

    /* access modifiers changed from: private */
    public void S() {
        H2.i.i(this.f30278e == i.RELEASING || this.f30278e == i.CLOSING);
        H2.i.i(this.f30289p.isEmpty());
        if (!this.f30297x) {
            X();
        } else if (this.f30298y) {
            U("Ignored since configAndClose is processing");
        } else if (!this.f30291r.b()) {
            this.f30297x = false;
            X();
            U("Ignore configAndClose and finish the close flow directly since camera is unavailable.");
        } else {
            U("Open camera to configAndClose");
            C10101e<Void> y02 = y0();
            this.f30298y = true;
            y02.a(new C6027G(this), this.f30276c);
        }
    }

    private void S0() {
        boolean z10 = false;
        for (o1<?> L10 : this.f30274a.i()) {
            z10 |= L10.L(false);
        }
        this.f30281h.s0(z10);
    }

    private CameraDevice.StateCallback T() {
        ArrayList arrayList = new ArrayList(this.f30274a.g().c().c());
        arrayList.add(this.f30262B.c());
        arrayList.add(this.f30282i);
        return N0.a(arrayList);
    }

    private void V(String str, Throwable th2) {
        C4391e0.b("Camera2CameraImpl", String.format("{%s} %s", new Object[]{toString(), str}), th2);
    }

    private int Y() {
        synchronized (this.f30266F) {
            try {
                return this.f30293t.c() == 2 ? 1 : 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    static List<p1.b> Z(H0 h02) {
        if (h02.g() == null) {
            return null;
        }
        return S.h.i0(h02);
    }

    static String a0(int i10) {
        return i10 != 0 ? i10 != 1 ? i10 != 2 ? i10 != 3 ? i10 != 4 ? i10 != 5 ? "UNKNOWN ERROR" : "ERROR_CAMERA_SERVICE" : "ERROR_CAMERA_DEVICE" : "ERROR_CAMERA_DISABLED" : "ERROR_MAX_CAMERAS_IN_USE" : "ERROR_CAMERA_IN_USE" : "ERROR_NONE";
    }

    static String b0(E1 e12) {
        return e12.f() + e12.hashCode();
    }

    static String c0(H0 h02) {
        return h02.o() + h02.hashCode();
    }

    private boolean f0() {
        ArrayList arrayList = new ArrayList();
        int Y10 = Y();
        for (n1.b next : this.f30274a.j()) {
            if (next.c() == null || next.c().get(0) != p1.b.METERING_REPEATING) {
                if (next.e() == null || next.c() == null) {
                    C4391e0.l("Camera2CameraImpl", "Invalid stream spec or capture types in " + next);
                    return false;
                }
                X0 d10 = next.d();
                o1<?> f10 = next.f();
                for (C5019e0 next2 : d10.o()) {
                    arrayList.add(C5010a.a(this.f30272L.M(Y10, f10.m(), next2.h()), f10.m(), next2.h(), next.e().b(), next.c(), next.e().d(), f10.x((Range<Integer>) null)));
                }
            }
        }
        H2.i.g(this.f30261A);
        HashMap hashMap = new HashMap();
        hashMap.put(this.f30261A.i(), Collections.singletonList(this.f30261A.e()));
        try {
            this.f30272L.A(Y10, arrayList, hashMap, false, false);
            U("Surface combination with metering repeating supported!");
            return true;
        } catch (IllegalArgumentException e10) {
            V("Surface combination with metering repeating  not supported!", e10);
            return false;
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void g0() {
        if (d0()) {
            G0(b0(this.f30261A), this.f30261A.h(), this.f30261A.i(), (c1) null, Collections.singletonList(p1.b.METERING_REPEATING));
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void h0(List list) {
        try {
            N0(list);
        } finally {
            this.f30281h.C();
        }
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void i0(Surface surface, SurfaceTexture surfaceTexture) {
        surface.release();
        surfaceTexture.release();
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ C10101e j0(C6054b1 b1Var, C5019e0 e0Var, Void voidR) {
        b1Var.close();
        e0Var.d();
        return b1Var.d(false);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void k0() {
        this.f30298y = false;
        this.f30297x = false;
        U("OpenCameraConfigAndClose is done, state: " + this.f30278e);
        int ordinal = this.f30278e.ordinal();
        if (ordinal == 1 || ordinal == 4) {
            H2.i.i(e0());
            X();
        } else if (ordinal != 6) {
            U("OpenCameraConfigAndClose finished while in state: " + this.f30278e);
        } else if (this.f30285l != 0) {
            U("OpenCameraConfigAndClose in error: " + a0(this.f30285l));
            this.f30282i.e();
        } else {
            Q0(false);
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void m0(c.a aVar) {
        E1 e12 = this.f30261A;
        if (e12 == null) {
            aVar.c(Boolean.FALSE);
            return;
        }
        aVar.c(Boolean.valueOf(this.f30274a.o(b0(e12))));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ Object n0(c.a aVar) {
        try {
            this.f30276c.execute(new C6025F(this, aVar));
            return "isMeteringRepeatingAttached";
        } catch (RejectedExecutionException unused) {
            aVar.f(new RuntimeException("Unable to check if MeteringRepeating is attached. Camera executor shut down."));
            return "isMeteringRepeatingAttached";
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void o0(String str, X0 x02, o1 o1Var, c1 c1Var, List list) {
        U("Use case " + str + " ACTIVE");
        this.f30274a.u(str, x02, o1Var, c1Var, list);
        this.f30274a.y(str, x02, o1Var, c1Var, list);
        R0();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void p0(String str) {
        U("Use case " + str + " INACTIVE");
        this.f30274a.x(str);
        R0();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void q0(String str, X0 x02, o1 o1Var, c1 c1Var, List list) {
        U("Use case " + str + " UPDATED");
        this.f30274a.y(str, x02, o1Var, c1Var, list);
        R0();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ Object r0(c.a aVar) {
        try {
            ArrayList arrayList = new ArrayList(this.f30274a.g().c().c());
            arrayList.add(this.f30262B.c());
            arrayList.add(new b(aVar));
            this.f30275b.f(this.f30283j.d(), this.f30276c, N0.a(arrayList));
            return "configAndCloseTask";
        } catch (SecurityException | C6172g e10) {
            V("Unable to open camera for configAndClose: " + e10.getMessage(), e10);
            aVar.f(e10);
            return "configAndCloseTask";
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void t0(String str, X0 x02, o1 o1Var, c1 c1Var, List list) {
        U("Use case " + str + " RESET");
        this.f30274a.y(str, x02, o1Var, c1Var, list);
        N();
        F0(false);
        R0();
        if (this.f30278e == i.OPENED) {
            A0();
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void u0(boolean z10) {
        this.f30268H = z10;
        if (z10 && this.f30278e == i.PENDING_OPEN) {
            P0(false);
        }
    }

    private C6057c1 v0() {
        synchronized (this.f30266F) {
            try {
                if (this.f30267G == null) {
                    C6054b1 b1Var = new C6054b1(this.f30271K, this.f30283j.h());
                    return b1Var;
                }
                K1 k12 = new K1(this.f30267G, this.f30283j, this.f30271K, this.f30276c, this.f30277d);
                return k12;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private void w0(List<H0> list) {
        for (H0 next : list) {
            String c02 = c0(next);
            if (!this.f30264D.contains(c02)) {
                this.f30264D.add(c02);
                next.M();
                next.K();
            }
        }
    }

    private void x0(List<H0> list) {
        for (H0 next : list) {
            String c02 = c0(next);
            if (this.f30264D.contains(c02)) {
                next.N();
                this.f30264D.remove(c02);
            }
        }
    }

    @SuppressLint({"MissingPermission"})
    private C10101e<Void> y0() {
        return androidx.concurrent.futures.c.a(new C6017B(this));
    }

    @SuppressLint({"MissingPermission"})
    private void z0(boolean z10) {
        if (!z10) {
            this.f30282i.d();
        }
        this.f30282i.a();
        this.f30273M.a();
        U("Opening camera.");
        H0(i.OPENING);
        try {
            this.f30275b.f(this.f30283j.d(), this.f30276c, T());
        } catch (C6172g e10) {
            U("Unable to open camera due to " + e10.getMessage());
            if (e10.d() != 10001) {
                this.f30273M.d();
            } else {
                I0(i.INITIALIZED, r.a.b(7, e10));
            }
        } catch (SecurityException e11) {
            U("Unable to open camera due to " + e11.getMessage());
            H0(i.REOPENING);
            this.f30282i.e();
        }
    }

    /* access modifiers changed from: package-private */
    public void A0() {
        H2.i.i(this.f30278e == i.OPENED);
        X0.h g10 = this.f30274a.g();
        if (!g10.f()) {
            U("Unable to create capture session due to conflicting configurations");
        } else if (!this.f30294u.j(this.f30284k.getId(), this.f30293t.a(this.f30284k.getId()))) {
            U("Unable to create capture session in camera operating mode = " + this.f30293t.c());
        } else {
            HashMap hashMap = new HashMap();
            M1.m(this.f30274a.h(), this.f30274a.i(), hashMap);
            this.f30286m.i(hashMap);
            C6057c1 c1Var = this.f30286m;
            n.j(c1Var.g(g10.c(), (CameraDevice) H2.i.g(this.f30284k), this.f30263C.a()), new d(c1Var), this.f30276c);
        }
    }

    /* access modifiers changed from: package-private */
    public void C0(X0 x02) {
        ScheduledExecutorService d10 = H.a.d();
        X0.d d11 = x02.d();
        if (d11 != null) {
            V("Posting surface closed", new Throwable());
            d10.execute(new C6035L(d11, x02));
        }
    }

    /* access modifiers changed from: package-private */
    public C10101e<Void> D0(C6057c1 c1Var, boolean z10) {
        c1Var.close();
        C10101e<Void> d10 = c1Var.d(z10);
        U("Releasing session in state " + this.f30278e.name());
        this.f30289p.put(c1Var, d10);
        n.j(d10, new c(c1Var), H.a.a());
        return d10;
    }

    /* access modifiers changed from: package-private */
    public void F0(boolean z10) {
        H2.i.i(this.f30286m != null);
        U("Resetting Capture Session");
        C6057c1 c1Var = this.f30286m;
        X0 f10 = c1Var.f();
        List<V> e10 = c1Var.e();
        C6057c1 v02 = v0();
        this.f30286m = v02;
        v02.h(f10);
        this.f30286m.a(e10);
        if (this.f30278e.ordinal() != 8) {
            U("Skipping Capture Session state check due to current camera state: " + this.f30278e + " and previous session status: " + c1Var.b());
        } else if (this.f30295v && c1Var.b()) {
            U("Close camera before creating new session");
            H0(i.REOPENING_QUIRK);
        }
        if (this.f30296w && c1Var.b()) {
            U("ConfigAndClose is required when close the camera.");
            this.f30297x = true;
        }
        D0(c1Var, z10);
    }

    /* access modifiers changed from: package-private */
    public void H0(i iVar) {
        I0(iVar, (r.a) null);
    }

    /* access modifiers changed from: package-private */
    public void I0(i iVar, r.a aVar) {
        J0(iVar, aVar, true);
    }

    /* access modifiers changed from: package-private */
    public void J0(i iVar, r.a aVar, boolean z10) {
        J.a aVar2;
        U("Transitioning camera internal state: " + this.f30278e + " --> " + iVar);
        M0(iVar, aVar);
        this.f30278e = iVar;
        switch (iVar.ordinal()) {
            case 0:
                aVar2 = J.a.RELEASED;
                break;
            case 1:
                aVar2 = J.a.RELEASING;
                break;
            case 2:
                aVar2 = J.a.CLOSED;
                break;
            case 3:
                aVar2 = J.a.PENDING_OPEN;
                break;
            case 4:
            case 5:
                aVar2 = J.a.CLOSING;
                break;
            case 6:
            case 7:
                aVar2 = J.a.OPENING;
                break;
            case 8:
                aVar2 = J.a.OPEN;
                break;
            case 9:
                aVar2 = J.a.CONFIGURED;
                break;
            default:
                throw new IllegalStateException("Unknown state: " + iVar);
        }
        this.f30294u.e(this, aVar2, z10);
        this.f30279f.l(aVar2);
        this.f30280g.c(aVar2, aVar);
    }

    /* access modifiers changed from: package-private */
    public void K0(List<V> list) {
        ArrayList arrayList = new ArrayList();
        for (V next : list) {
            V.a k10 = V.a.k(next);
            if (next.k() == 5 && next.d() != null) {
                k10.p(next.d());
            }
            if (!next.i().isEmpty() || !next.n() || O(k10)) {
                arrayList.add(k10.h());
            }
        }
        U("Issue capture request");
        this.f30286m.a(arrayList);
    }

    /* access modifiers changed from: package-private */
    public void M0(i iVar, r.a aVar) {
        if (V4.a.h()) {
            V4.a.j("CX:C2State[" + this + "]", iVar.ordinal());
            if (aVar != null) {
                this.f30290q++;
            }
            if (this.f30290q > 0) {
                V4.a.j("CX:C2StateErrorCode[" + this + "]", aVar != null ? aVar.d() : 0);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void P(boolean z10) {
        boolean z11 = this.f30278e == i.CLOSING || this.f30278e == i.RELEASING || (this.f30278e == i.REOPENING && this.f30285l != 0);
        H2.i.j(z11, "closeCamera should only be called in a CLOSING, RELEASING or REOPENING (with error) state. Current state: " + this.f30278e + " (error: " + a0(this.f30285l) + ")");
        F0(z10);
        this.f30286m.c();
    }

    /* access modifiers changed from: package-private */
    public void P0(boolean z10) {
        U("Attempting to force open the camera.");
        if (!this.f30294u.i(this)) {
            U("No cameras available. Waiting for available camera before opening camera.");
            H0(i.PENDING_OPEN);
            return;
        }
        z0(z10);
    }

    /* access modifiers changed from: package-private */
    public void Q0(boolean z10) {
        U("Attempting to open the camera.");
        if (!this.f30291r.b() || !this.f30294u.i(this)) {
            U("No cameras available. Waiting for available camera before opening camera.");
            H0(i.PENDING_OPEN);
            return;
        }
        z0(z10);
    }

    /* access modifiers changed from: package-private */
    public void R0() {
        X0.h e10 = this.f30274a.e();
        if (e10.f()) {
            this.f30281h.r0(e10.c().p());
            e10.b(this.f30281h.M());
            this.f30286m.h(e10.c());
            return;
        }
        this.f30281h.o0();
        this.f30286m.h(this.f30281h.M());
    }

    /* access modifiers changed from: package-private */
    public void U(String str) {
        V(str, (Throwable) null);
    }

    /* access modifiers changed from: package-private */
    public X0 W(C5019e0 e0Var) {
        for (X0 next : this.f30274a.h()) {
            if (next.o().contains(e0Var)) {
                return next;
            }
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public void X() {
        H2.i.i(this.f30278e == i.RELEASING || this.f30278e == i.CLOSING);
        H2.i.i(this.f30289p.isEmpty());
        this.f30284k = null;
        if (this.f30278e == i.CLOSING) {
            H0(i.INITIALIZED);
            return;
        }
        this.f30275b.h(this.f30291r);
        H0(i.RELEASED);
        c.a<Void> aVar = this.f30288o;
        if (aVar != null) {
            aVar.c(null);
            this.f30288o = null;
        }
    }

    public void c(H0 h02) {
        H2.i.g(h02);
        G0(c0(h02), this.f30299z ? h02.w() : h02.u(), h02.j(), h02.e(), Z(h02));
    }

    public F d() {
        return this.f30281h;
    }

    /* access modifiers changed from: package-private */
    public boolean d0() {
        try {
            return ((Boolean) androidx.concurrent.futures.c.a(new C6118x(this)).get()).booleanValue();
        } catch (InterruptedException | ExecutionException e10) {
            throw new RuntimeException("Unable to check if MeteringRepeating is attached.", e10);
        }
    }

    public void e(H0 h02) {
        H2.i.g(h02);
        this.f30276c.execute(new C6033J(this, c0(h02)));
    }

    /* access modifiers changed from: package-private */
    public boolean e0() {
        return this.f30289p.isEmpty();
    }

    public B f() {
        return this.f30265E;
    }

    public void g(boolean z10) {
        this.f30276c.execute(new C6015A(this, z10));
    }

    public void h(Collection<H0> collection) {
        ArrayList arrayList = new ArrayList(collection);
        if (!arrayList.isEmpty()) {
            this.f30281h.W();
            w0(new ArrayList(arrayList));
            try {
                this.f30276c.execute(new C6029H(this, new ArrayList(L0(arrayList))));
            } catch (RejectedExecutionException e10) {
                V("Unable to attach use cases.", e10);
                this.f30281h.C();
            }
        }
    }

    public void i(Collection<H0> collection) {
        ArrayList arrayList = new ArrayList(collection);
        if (!arrayList.isEmpty()) {
            ArrayList arrayList2 = new ArrayList(L0(arrayList));
            x0(new ArrayList(arrayList));
            this.f30276c.execute(new C6121y(this, arrayList2));
        }
    }

    public I j() {
        return this.f30283j;
    }

    public void k(H0 h02) {
        H2.i.g(h02);
        this.f30276c.execute(new C6034K(this, c0(h02), this.f30299z ? h02.w() : h02.u(), h02.j(), h02.e(), Z(h02)));
    }

    public void l(H0 h02) {
        H2.i.g(h02);
        this.f30276c.execute(new C6031I(this, c0(h02), this.f30299z ? h02.w() : h02.u(), h02.j(), h02.e(), Z(h02)));
    }

    public void o(B b10) {
        if (b10 == null) {
            b10 = E.a();
        }
        Z0 W10 = b10.W((Z0) null);
        this.f30265E = b10;
        synchronized (this.f30266F) {
            this.f30267G = W10;
        }
    }

    public androidx.camera.core.impl.H0<J.a> p() {
        return this.f30279f;
    }

    public void r(boolean z10) {
        this.f30299z = z10;
    }

    public String toString() {
        return String.format(Locale.US, "Camera@%x[id=%s]", new Object[]{Integer.valueOf(hashCode()), this.f30283j.d()});
    }

    /* renamed from: v.M$h */
    private class h {

        /* renamed from: a  reason: collision with root package name */
        private a f30312a;

        /* renamed from: v.M$h$a */
        private class a {

            /* renamed from: a  reason: collision with root package name */
            private final ScheduledFuture<?> f30314a;

            /* renamed from: b  reason: collision with root package name */
            private final AtomicBoolean f30315b = new AtomicBoolean(false);

            a() {
                this.f30314a = C6036M.this.f30277d.schedule(new C6038O(this), 2000, TimeUnit.MILLISECONDS);
            }

            /* access modifiers changed from: private */
            public void d() {
                if (!this.f30315b.getAndSet(true)) {
                    C6036M.this.f30276c.execute(new C6039P(this));
                }
            }

            /* access modifiers changed from: private */
            public void e() {
                if (C6036M.this.f30278e != i.OPENING) {
                    C6036M m10 = C6036M.this;
                    m10.U("Camera skip reopen at state: " + C6036M.this.f30278e);
                    return;
                }
                C6036M.this.U("Camera onError timeout, reopen it.");
                C6036M.this.H0(i.REOPENING);
                C6036M.this.f30282i.e();
            }

            public void c() {
                this.f30315b.set(true);
                this.f30314a.cancel(true);
            }

            public boolean f() {
                return this.f30315b.get();
            }
        }

        private h() {
            this.f30312a = null;
        }

        public void a() {
            a aVar = this.f30312a;
            if (aVar != null) {
                aVar.c();
            }
            this.f30312a = null;
        }

        public void b() {
            C6036M.this.U("Camera receive onErrorCallback");
            a();
        }

        public boolean c() {
            a aVar = this.f30312a;
            return aVar != null && !aVar.f();
        }

        public void d() {
            if (C6036M.this.f30278e != i.OPENING) {
                C6036M.this.U("Don't need the onError timeout handler.");
                return;
            }
            C6036M.this.U("Camera waiting for onError.");
            a();
            this.f30312a = new a();
        }

        /* synthetic */ h(C6036M m10, a aVar) {
            this();
        }
    }
}
