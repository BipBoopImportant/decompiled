package C;

import C.C4415x;
import C.s0;
import G.e;
import H2.i;
import I.n;
import android.app.Application;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.SystemClock;
import android.util.SparseArray;
import androidx.camera.core.impl.G;
import androidx.camera.core.impl.H;
import androidx.camera.core.impl.MetadataHolderService;
import androidx.camera.core.impl.N;
import androidx.camera.core.impl.O0;
import androidx.camera.core.impl.P0;
import androidx.camera.core.impl.Q0;
import androidx.camera.core.impl.p1;
import androidx.concurrent.futures.c;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.Executor;
import ob.C10101e;
import q.C5759a;

/* renamed from: C.w  reason: case insensitive filesystem */
public final class C4414w {

    /* renamed from: o  reason: collision with root package name */
    private static final Object f5431o = new Object();

    /* renamed from: p  reason: collision with root package name */
    private static final SparseArray<Integer> f5432p = new SparseArray<>();

    /* renamed from: a  reason: collision with root package name */
    final N f5433a;

    /* renamed from: b  reason: collision with root package name */
    private final Object f5434b;

    /* renamed from: c  reason: collision with root package name */
    private final C4415x f5435c;

    /* renamed from: d  reason: collision with root package name */
    private final Executor f5436d;

    /* renamed from: e  reason: collision with root package name */
    private final Handler f5437e;

    /* renamed from: f  reason: collision with root package name */
    private final HandlerThread f5438f;

    /* renamed from: g  reason: collision with root package name */
    private H f5439g;

    /* renamed from: h  reason: collision with root package name */
    private G f5440h;

    /* renamed from: i  reason: collision with root package name */
    private p1 f5441i;

    /* renamed from: j  reason: collision with root package name */
    private final s0 f5442j;

    /* renamed from: k  reason: collision with root package name */
    private final C10101e<Void> f5443k;

    /* renamed from: l  reason: collision with root package name */
    private a f5444l;

    /* renamed from: m  reason: collision with root package name */
    private C10101e<Void> f5445m;

    /* renamed from: n  reason: collision with root package name */
    private final Integer f5446n;

    /* renamed from: C.w$a */
    private enum a {
        UNINITIALIZED,
        INITIALIZING,
        INITIALIZING_ERROR,
        INITIALIZED,
        SHUTDOWN
    }

    public C4414w(Context context, C4415x.b bVar) {
        this(context, bVar, new Q0());
    }

    private static C4415x.b g(Context context) {
        Application b10 = e.b(context);
        if (b10 instanceof C4415x.b) {
            return (C4415x.b) b10;
        }
        try {
            Context a10 = e.a(context);
            Bundle bundle = a10.getPackageManager().getServiceInfo(new ComponentName(a10, MetadataHolderService.class), 640).metaData;
            String string = bundle != null ? bundle.getString("androidx.camera.core.impl.MetadataHolderService.DEFAULT_CONFIG_PROVIDER") : null;
            if (string != null) {
                return (C4415x.b) Class.forName(string).getDeclaredConstructor((Class[]) null).newInstance((Object[]) null);
            }
            C4391e0.c("CameraX", "No default CameraXConfig.Provider specified in meta-data. The most likely cause is you did not include a default implementation in your build such as 'camera-camera2'.");
            return null;
        } catch (PackageManager.NameNotFoundException e10) {
            e = e10;
            C4391e0.d("CameraX", "Failed to retrieve default CameraXConfig.Provider from meta-data", e);
            return null;
        } catch (ClassNotFoundException e11) {
            e = e11;
            C4391e0.d("CameraX", "Failed to retrieve default CameraXConfig.Provider from meta-data", e);
            return null;
        } catch (InstantiationException e12) {
            e = e12;
            C4391e0.d("CameraX", "Failed to retrieve default CameraXConfig.Provider from meta-data", e);
            return null;
        } catch (InvocationTargetException e13) {
            e = e13;
            C4391e0.d("CameraX", "Failed to retrieve default CameraXConfig.Provider from meta-data", e);
            return null;
        } catch (NoSuchMethodException e14) {
            e = e14;
            C4391e0.d("CameraX", "Failed to retrieve default CameraXConfig.Provider from meta-data", e);
            return null;
        } catch (IllegalAccessException e15) {
            e = e15;
            C4391e0.d("CameraX", "Failed to retrieve default CameraXConfig.Provider from meta-data", e);
            return null;
        } catch (NullPointerException e16) {
            e = e16;
            C4391e0.d("CameraX", "Failed to retrieve default CameraXConfig.Provider from meta-data", e);
            return null;
        }
    }

    private static void j(Integer num) {
        synchronized (f5431o) {
            if (num == null) {
                try {
                } catch (Throwable th2) {
                    throw th2;
                }
            } else {
                i.c(num.intValue(), 3, 6, "minLogLevel");
                SparseArray<Integer> sparseArray = f5432p;
                int i10 = 1;
                if (sparseArray.get(num.intValue()) != null) {
                    i10 = 1 + sparseArray.get(num.intValue()).intValue();
                }
                sparseArray.put(num.intValue(), Integer.valueOf(i10));
                r();
            }
        }
    }

    private void k(Executor executor, long j10, int i10, Context context, c.a<Void> aVar) {
        executor.execute(new C4412u(this, context, executor, i10, aVar, j10));
    }

    private C10101e<Void> l(Context context) {
        C10101e<Void> a10;
        synchronized (this.f5434b) {
            i.j(this.f5444l == a.UNINITIALIZED, "CameraX.initInternal() should only be called once per instance");
            this.f5444l = a.INITIALIZING;
            a10 = c.a(new C4411t(this, context));
        }
        return a10;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void m(Executor executor, long j10, int i10, Context context, c.a aVar) {
        k(executor, j10, i10 + 1, context, aVar);
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00d3 A[Catch:{ all -> 0x006d }] */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0112 A[Catch:{ all -> 0x006d }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ void n(android.content.Context r17, java.util.concurrent.Executor r18, int r19, androidx.concurrent.futures.c.a r20, long r21) {
        /*
            r16 = this;
            r9 = r16
            r3 = r18
            r6 = r19
            r8 = r20
            r4 = r21
            java.lang.String r0 = "CX:initAndRetryRecursively"
            V4.a.c(r0)
            android.content.Context r7 = G.e.a(r17)
            r1 = 0
            C.x r0 = r9.f5435c     // Catch:{ b -> 0x0074, c0 -> 0x0072, RuntimeException -> 0x0070 }
            androidx.camera.core.impl.H$a r10 = r0.Z(r1)     // Catch:{ b -> 0x0074, c0 -> 0x0072, RuntimeException -> 0x0070 }
            if (r10 == 0) goto L_0x00ad
            java.util.concurrent.Executor r0 = r9.f5436d     // Catch:{ b -> 0x0074, c0 -> 0x0072, RuntimeException -> 0x0070 }
            android.os.Handler r2 = r9.f5437e     // Catch:{ b -> 0x0074, c0 -> 0x0072, RuntimeException -> 0x0070 }
            androidx.camera.core.impl.S r12 = androidx.camera.core.impl.S.a(r0, r2)     // Catch:{ b -> 0x0074, c0 -> 0x0072, RuntimeException -> 0x0070 }
            C.x r0 = r9.f5435c     // Catch:{ b -> 0x0074, c0 -> 0x0072, RuntimeException -> 0x0070 }
            C.q r0 = r0.X(r1)     // Catch:{ b -> 0x0074, c0 -> 0x0072, RuntimeException -> 0x0070 }
            C.x r2 = r9.f5435c     // Catch:{ b -> 0x0074, c0 -> 0x0072, RuntimeException -> 0x0070 }
            long r14 = r2.a0()     // Catch:{ b -> 0x0074, c0 -> 0x0072, RuntimeException -> 0x0070 }
            r11 = r7
            r13 = r0
            androidx.camera.core.impl.H r2 = r10.a(r11, r12, r13, r14)     // Catch:{ b -> 0x0074, c0 -> 0x0072, RuntimeException -> 0x0070 }
            r9.f5439g = r2     // Catch:{ b -> 0x0074, c0 -> 0x0072, RuntimeException -> 0x0070 }
            C.x r2 = r9.f5435c     // Catch:{ b -> 0x0074, c0 -> 0x0072, RuntimeException -> 0x0070 }
            androidx.camera.core.impl.G$a r2 = r2.c0(r1)     // Catch:{ b -> 0x0074, c0 -> 0x0072, RuntimeException -> 0x0070 }
            if (r2 == 0) goto L_0x00a0
            androidx.camera.core.impl.H r10 = r9.f5439g     // Catch:{ b -> 0x0074, c0 -> 0x0072, RuntimeException -> 0x0070 }
            java.lang.Object r10 = r10.c()     // Catch:{ b -> 0x0074, c0 -> 0x0072, RuntimeException -> 0x0070 }
            androidx.camera.core.impl.H r11 = r9.f5439g     // Catch:{ b -> 0x0074, c0 -> 0x0072, RuntimeException -> 0x0070 }
            java.util.Set r11 = r11.b()     // Catch:{ b -> 0x0074, c0 -> 0x0072, RuntimeException -> 0x0070 }
            androidx.camera.core.impl.G r2 = r2.a(r7, r10, r11)     // Catch:{ b -> 0x0074, c0 -> 0x0072, RuntimeException -> 0x0070 }
            r9.f5440h = r2     // Catch:{ b -> 0x0074, c0 -> 0x0072, RuntimeException -> 0x0070 }
            C.x r2 = r9.f5435c     // Catch:{ b -> 0x0074, c0 -> 0x0072, RuntimeException -> 0x0070 }
            androidx.camera.core.impl.p1$c r2 = r2.f0(r1)     // Catch:{ b -> 0x0074, c0 -> 0x0072, RuntimeException -> 0x0070 }
            if (r2 == 0) goto L_0x0093
            androidx.camera.core.impl.p1 r2 = r2.a(r7)     // Catch:{ b -> 0x0074, c0 -> 0x0072, RuntimeException -> 0x0070 }
            r9.f5441i = r2     // Catch:{ b -> 0x0074, c0 -> 0x0072, RuntimeException -> 0x0070 }
            boolean r2 = r3 instanceof C.C4406n     // Catch:{ b -> 0x0074, c0 -> 0x0072, RuntimeException -> 0x0070 }
            if (r2 == 0) goto L_0x0076
            r2 = r3
            C.n r2 = (C.C4406n) r2     // Catch:{ b -> 0x0074, c0 -> 0x0072, RuntimeException -> 0x0070 }
            androidx.camera.core.impl.H r10 = r9.f5439g     // Catch:{ b -> 0x0074, c0 -> 0x0072, RuntimeException -> 0x0070 }
            r2.c(r10)     // Catch:{ b -> 0x0074, c0 -> 0x0072, RuntimeException -> 0x0070 }
            goto L_0x0076
        L_0x006d:
            r0 = move-exception
            goto L_0x0170
        L_0x0070:
            r0 = move-exception
            goto L_0x00ba
        L_0x0072:
            r0 = move-exception
            goto L_0x00ba
        L_0x0074:
            r0 = move-exception
            goto L_0x00ba
        L_0x0076:
            androidx.camera.core.impl.N r2 = r9.f5433a     // Catch:{ b -> 0x0074, c0 -> 0x0072, RuntimeException -> 0x0070 }
            androidx.camera.core.impl.H r10 = r9.f5439g     // Catch:{ b -> 0x0074, c0 -> 0x0072, RuntimeException -> 0x0070 }
            r2.b(r10)     // Catch:{ b -> 0x0074, c0 -> 0x0072, RuntimeException -> 0x0070 }
            androidx.camera.core.impl.N r2 = r9.f5433a     // Catch:{ b -> 0x0074, c0 -> 0x0072, RuntimeException -> 0x0070 }
            androidx.camera.core.impl.T.a(r7, r2, r0)     // Catch:{ b -> 0x0074, c0 -> 0x0072, RuntimeException -> 0x0070 }
            r0 = 1
            if (r6 <= r0) goto L_0x0088
            r9.q(r1)     // Catch:{ b -> 0x0074, c0 -> 0x0072, RuntimeException -> 0x0070 }
        L_0x0088:
            r16.p()     // Catch:{ b -> 0x0074, c0 -> 0x0072, RuntimeException -> 0x0070 }
            r8.c(r1)     // Catch:{ b -> 0x0074, c0 -> 0x0072, RuntimeException -> 0x0070 }
        L_0x008e:
            V4.a.f()
            goto L_0x016c
        L_0x0093:
            C.c0 r0 = new C.c0     // Catch:{ b -> 0x0074, c0 -> 0x0072, RuntimeException -> 0x0070 }
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException     // Catch:{ b -> 0x0074, c0 -> 0x0072, RuntimeException -> 0x0070 }
            java.lang.String r10 = "Invalid app configuration provided. Missing UseCaseConfigFactory."
            r2.<init>(r10)     // Catch:{ b -> 0x0074, c0 -> 0x0072, RuntimeException -> 0x0070 }
            r0.<init>(r2)     // Catch:{ b -> 0x0074, c0 -> 0x0072, RuntimeException -> 0x0070 }
            throw r0     // Catch:{ b -> 0x0074, c0 -> 0x0072, RuntimeException -> 0x0070 }
        L_0x00a0:
            C.c0 r0 = new C.c0     // Catch:{ b -> 0x0074, c0 -> 0x0072, RuntimeException -> 0x0070 }
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException     // Catch:{ b -> 0x0074, c0 -> 0x0072, RuntimeException -> 0x0070 }
            java.lang.String r10 = "Invalid app configuration provided. Missing CameraDeviceSurfaceManager."
            r2.<init>(r10)     // Catch:{ b -> 0x0074, c0 -> 0x0072, RuntimeException -> 0x0070 }
            r0.<init>(r2)     // Catch:{ b -> 0x0074, c0 -> 0x0072, RuntimeException -> 0x0070 }
            throw r0     // Catch:{ b -> 0x0074, c0 -> 0x0072, RuntimeException -> 0x0070 }
        L_0x00ad:
            C.c0 r0 = new C.c0     // Catch:{ b -> 0x0074, c0 -> 0x0072, RuntimeException -> 0x0070 }
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException     // Catch:{ b -> 0x0074, c0 -> 0x0072, RuntimeException -> 0x0070 }
            java.lang.String r10 = "Invalid app configuration provided. Missing CameraFactory."
            r2.<init>(r10)     // Catch:{ b -> 0x0074, c0 -> 0x0072, RuntimeException -> 0x0070 }
            r0.<init>(r2)     // Catch:{ b -> 0x0074, c0 -> 0x0072, RuntimeException -> 0x0070 }
            throw r0     // Catch:{ b -> 0x0074, c0 -> 0x0072, RuntimeException -> 0x0070 }
        L_0x00ba:
            androidx.camera.core.impl.L r2 = new androidx.camera.core.impl.L     // Catch:{ all -> 0x006d }
            r2.<init>(r4, r6, r0)     // Catch:{ all -> 0x006d }
            C.s0 r10 = r9.f5442j     // Catch:{ all -> 0x006d }
            C.s0$c r10 = r10.c(r2)     // Catch:{ all -> 0x006d }
            r9.q(r2)     // Catch:{ all -> 0x006d }
            boolean r2 = r10.d()     // Catch:{ all -> 0x006d }
            if (r2 == 0) goto L_0x0112
            r2 = 2147483647(0x7fffffff, float:NaN)
            if (r6 >= r2) goto L_0x0112
            java.lang.String r1 = "CameraX"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x006d }
            r2.<init>()     // Catch:{ all -> 0x006d }
            java.lang.String r11 = "Retry init. Start time "
            r2.append(r11)     // Catch:{ all -> 0x006d }
            r2.append(r4)     // Catch:{ all -> 0x006d }
            java.lang.String r11 = " current time "
            r2.append(r11)     // Catch:{ all -> 0x006d }
            long r11 = android.os.SystemClock.elapsedRealtime()     // Catch:{ all -> 0x006d }
            r2.append(r11)     // Catch:{ all -> 0x006d }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x006d }
            C.C4391e0.m(r1, r2, r0)     // Catch:{ all -> 0x006d }
            android.os.Handler r0 = r9.f5437e     // Catch:{ all -> 0x006d }
            C.v r11 = new C.v     // Catch:{ all -> 0x006d }
            r1 = r11
            r2 = r16
            r3 = r18
            r4 = r21
            r6 = r19
            r8 = r20
            r1.<init>(r2, r3, r4, r6, r7, r8)     // Catch:{ all -> 0x006d }
            java.lang.String r1 = "retry_token"
            long r2 = r10.b()     // Catch:{ all -> 0x006d }
            D2.i.b(r0, r11, r1, r2)     // Catch:{ all -> 0x006d }
            goto L_0x008e
        L_0x0112:
            java.lang.Object r2 = r9.f5434b     // Catch:{ all -> 0x006d }
            monitor-enter(r2)     // Catch:{ all -> 0x006d }
            C.w$a r3 = C.C4414w.a.INITIALIZING_ERROR     // Catch:{ all -> 0x016d }
            r9.f5444l = r3     // Catch:{ all -> 0x016d }
            monitor-exit(r2)     // Catch:{ all -> 0x016d }
            boolean r2 = r10.c()     // Catch:{ all -> 0x006d }
            if (r2 == 0) goto L_0x0128
            r16.p()     // Catch:{ all -> 0x006d }
            r8.c(r1)     // Catch:{ all -> 0x006d }
            goto L_0x008e
        L_0x0128:
            boolean r1 = r0 instanceof androidx.camera.core.impl.T.b     // Catch:{ all -> 0x006d }
            if (r1 == 0) goto L_0x0159
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x006d }
            r1.<init>()     // Catch:{ all -> 0x006d }
            java.lang.String r2 = "Device reporting less cameras than anticipated. On real devices: Retrying initialization might resolve temporary camera errors. On emulators: Ensure virtual camera configuration matches supported camera features as reported by PackageManager#hasSystemFeature. Available cameras: "
            r1.append(r2)     // Catch:{ all -> 0x006d }
            r2 = r0
            androidx.camera.core.impl.T$b r2 = (androidx.camera.core.impl.T.b) r2     // Catch:{ all -> 0x006d }
            int r2 = r2.a()     // Catch:{ all -> 0x006d }
            r1.append(r2)     // Catch:{ all -> 0x006d }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x006d }
            java.lang.String r2 = "CameraX"
            C.C4391e0.d(r2, r1, r0)     // Catch:{ all -> 0x006d }
            C.c0 r0 = new C.c0     // Catch:{ all -> 0x006d }
            C.s r2 = new C.s     // Catch:{ all -> 0x006d }
            r3 = 3
            r2.<init>((int) r3, (java.lang.String) r1)     // Catch:{ all -> 0x006d }
            r0.<init>(r2)     // Catch:{ all -> 0x006d }
            r8.f(r0)     // Catch:{ all -> 0x006d }
            goto L_0x008e
        L_0x0159:
            boolean r1 = r0 instanceof C.C4387c0     // Catch:{ all -> 0x006d }
            if (r1 == 0) goto L_0x0162
            r8.f(r0)     // Catch:{ all -> 0x006d }
            goto L_0x008e
        L_0x0162:
            C.c0 r1 = new C.c0     // Catch:{ all -> 0x006d }
            r1.<init>(r0)     // Catch:{ all -> 0x006d }
            r8.f(r1)     // Catch:{ all -> 0x006d }
            goto L_0x008e
        L_0x016c:
            return
        L_0x016d:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x016d }
            throw r0     // Catch:{ all -> 0x006d }
        L_0x0170:
            V4.a.f()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: C.C4414w.n(android.content.Context, java.util.concurrent.Executor, int, androidx.concurrent.futures.c$a, long):void");
    }

    /* access modifiers changed from: private */
    public /* synthetic */ Object o(Context context, c.a aVar) {
        k(this.f5436d, SystemClock.elapsedRealtime(), 1, context, aVar);
        return "CameraX initInternal";
    }

    private void p() {
        synchronized (this.f5434b) {
            this.f5444l = a.INITIALIZED;
        }
    }

    private void q(s0.b bVar) {
        if (V4.a.h()) {
            V4.a.j("CX:CameraProvider-RetryStatus", bVar != null ? bVar.i() : -1);
        }
    }

    private static void r() {
        SparseArray<Integer> sparseArray = f5432p;
        if (sparseArray.size() == 0) {
            C4391e0.i();
        } else if (sparseArray.get(3) != null) {
            C4391e0.j(3);
        } else if (sparseArray.get(4) != null) {
            C4391e0.j(4);
        } else if (sparseArray.get(5) != null) {
            C4391e0.j(5);
        } else if (sparseArray.get(6) != null) {
            C4391e0.j(6);
        }
    }

    private static void s(Context context, O0 o02, C5759a<Context, O0> aVar) {
        if (o02 != null) {
            C4391e0.a("CameraX", "QuirkSettings from CameraXConfig: " + o02);
        } else {
            o02 = aVar.apply(context);
            C4391e0.a("CameraX", "QuirkSettings from app metadata: " + o02);
        }
        if (o02 == null) {
            o02 = P0.f16760b;
            C4391e0.a("CameraX", "QuirkSettings by default: " + o02);
        }
        P0.b().d(o02);
    }

    public G d() {
        G g10 = this.f5440h;
        if (g10 != null) {
            return g10;
        }
        throw new IllegalStateException("CameraX not initialized yet.");
    }

    public H e() {
        H h10 = this.f5439g;
        if (h10 != null) {
            return h10;
        }
        throw new IllegalStateException("CameraX not initialized yet.");
    }

    public N f() {
        return this.f5433a;
    }

    public p1 h() {
        p1 p1Var = this.f5441i;
        if (p1Var != null) {
            return p1Var;
        }
        throw new IllegalStateException("CameraX not initialized yet.");
    }

    public C10101e<Void> i() {
        return this.f5443k;
    }

    C4414w(Context context, C4415x.b bVar, C5759a<Context, O0> aVar) {
        this.f5433a = new N();
        this.f5434b = new Object();
        this.f5444l = a.UNINITIALIZED;
        this.f5445m = n.p(null);
        if (bVar != null) {
            this.f5435c = bVar.getCameraXConfig();
        } else {
            C4415x.b g10 = g(context);
            if (g10 != null) {
                this.f5435c = g10.getCameraXConfig();
            } else {
                throw new IllegalStateException("CameraX is not configured properly. The most likely cause is you did not include a default implementation in your build such as 'camera-camera2'.");
            }
        }
        s(context, this.f5435c.d0(), aVar);
        Executor Y10 = this.f5435c.Y((Executor) null);
        Handler e02 = this.f5435c.e0((Handler) null);
        this.f5436d = Y10 == null ? new C4406n() : Y10;
        if (e02 == null) {
            HandlerThread handlerThread = new HandlerThread("CameraX-scheduler", 10);
            this.f5438f = handlerThread;
            handlerThread.start();
            this.f5437e = D2.i.a(handlerThread.getLooper());
        } else {
            this.f5438f = null;
            this.f5437e = e02;
        }
        Integer num = (Integer) this.f5435c.g(C4415x.f5452O, null);
        this.f5446n = num;
        j(num);
        this.f5442j = new s0.a(this.f5435c.b0()).a();
        this.f5443k = l(context);
    }
}
