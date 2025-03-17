package com.google.firebase.perf.metrics;

import Bc.e;
import Fb.f;
import Fb.o;
import Fc.k;
import Gc.d;
import Gc.m;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.os.Process;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.annotation.Keep;
import androidx.lifecycle.C5220x;
import androidx.lifecycle.M;
import androidx.lifecycle.O;
import androidx.lifecycle.r;
import com.google.firebase.perf.util.l;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class AppStartTrace implements Application.ActivityLifecycleCallbacks, C5220x {

    /* renamed from: A  reason: collision with root package name */
    private static volatile AppStartTrace f68560A;

    /* renamed from: B  reason: collision with root package name */
    private static ExecutorService f68561B;

    /* renamed from: y  reason: collision with root package name */
    private static final l f68562y = new com.google.firebase.perf.util.a().a();

    /* renamed from: z  reason: collision with root package name */
    private static final long f68563z = TimeUnit.MINUTES.toMicros(1);

    /* renamed from: a  reason: collision with root package name */
    private boolean f68564a = false;

    /* renamed from: b  reason: collision with root package name */
    private final k f68565b;

    /* renamed from: c  reason: collision with root package name */
    private final com.google.firebase.perf.util.a f68566c;

    /* renamed from: d  reason: collision with root package name */
    private final com.google.firebase.perf.config.a f68567d;

    /* renamed from: e  reason: collision with root package name */
    private final m.b f68568e;

    /* renamed from: f  reason: collision with root package name */
    private Context f68569f;

    /* renamed from: g  reason: collision with root package name */
    private WeakReference<Activity> f68570g;

    /* renamed from: h  reason: collision with root package name */
    private WeakReference<Activity> f68571h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f68572i = false;

    /* renamed from: j  reason: collision with root package name */
    private final l f68573j;

    /* renamed from: k  reason: collision with root package name */
    private final l f68574k;
    /* access modifiers changed from: private */

    /* renamed from: l  reason: collision with root package name */
    public l f68575l;

    /* renamed from: m  reason: collision with root package name */
    private l f68576m;

    /* renamed from: n  reason: collision with root package name */
    private l f68577n;

    /* renamed from: o  reason: collision with root package name */
    private l f68578o;

    /* renamed from: p  reason: collision with root package name */
    private l f68579p;

    /* renamed from: q  reason: collision with root package name */
    private l f68580q;

    /* renamed from: r  reason: collision with root package name */
    private l f68581r;

    /* renamed from: s  reason: collision with root package name */
    private l f68582s;

    /* renamed from: t  reason: collision with root package name */
    private Ec.a f68583t;
    /* access modifiers changed from: private */

    /* renamed from: u  reason: collision with root package name */
    public boolean f68584u;

    /* renamed from: v  reason: collision with root package name */
    private int f68585v;

    /* renamed from: w  reason: collision with root package name */
    private final b f68586w;

    /* renamed from: x  reason: collision with root package name */
    private boolean f68587x;

    private final class b implements ViewTreeObserver.OnDrawListener {
        private b() {
        }

        public void onDraw() {
            AppStartTrace.j(AppStartTrace.this);
        }
    }

    public static class c implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        private final AppStartTrace f68589a;

        public c(AppStartTrace appStartTrace) {
            this.f68589a = appStartTrace;
        }

        public void run() {
            if (this.f68589a.f68575l == null) {
                boolean unused = this.f68589a.f68584u = true;
            }
        }
    }

    AppStartTrace(k kVar, com.google.firebase.perf.util.a aVar, com.google.firebase.perf.config.a aVar2, ExecutorService executorService) {
        l lVar = null;
        this.f68575l = null;
        this.f68576m = null;
        this.f68577n = null;
        this.f68578o = null;
        this.f68579p = null;
        this.f68580q = null;
        this.f68581r = null;
        this.f68582s = null;
        this.f68584u = false;
        this.f68585v = 0;
        this.f68586w = new b();
        this.f68587x = false;
        this.f68565b = kVar;
        this.f68566c = aVar;
        this.f68567d = aVar2;
        f68561B = executorService;
        this.f68568e = m.O().Q("_experiment_app_start_ttid");
        this.f68573j = l.f(Process.getStartElapsedRealtime());
        o oVar = (o) f.l().j(o.class);
        this.f68574k = oVar != null ? l.f(oVar.b()) : lVar;
    }

    static /* synthetic */ int j(AppStartTrace appStartTrace) {
        int i10 = appStartTrace.f68585v;
        appStartTrace.f68585v = i10 + 1;
        return i10;
    }

    private l k() {
        l lVar = this.f68574k;
        return lVar != null ? lVar : f68562y;
    }

    public static AppStartTrace m() {
        return f68560A != null ? f68560A : o(k.k(), new com.google.firebase.perf.util.a());
    }

    @SuppressLint({"ThreadPoolCreation"})
    static AppStartTrace o(k kVar, com.google.firebase.perf.util.a aVar) {
        if (f68560A == null) {
            synchronized (AppStartTrace.class) {
                try {
                    if (f68560A == null) {
                        f68560A = new AppStartTrace(kVar, aVar, com.google.firebase.perf.config.a.g(), new ThreadPoolExecutor(0, 1, f68563z + 10, TimeUnit.SECONDS, new LinkedBlockingQueue()));
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f68560A;
    }

    private l p() {
        l lVar = this.f68573j;
        return lVar != null ? lVar : k();
    }

    public static boolean q(Context context) {
        ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
        if (activityManager == null) {
            return true;
        }
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = activityManager.getRunningAppProcesses();
        if (runningAppProcesses == null) {
            return false;
        }
        String packageName = context.getPackageName();
        String str = packageName + ":";
        for (ActivityManager.RunningAppProcessInfo next : runningAppProcesses) {
            if (next.importance == 100 && (next.processName.equals(packageName) || next.processName.startsWith(str))) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void r(m.b bVar) {
        this.f68565b.C((m) bVar.g(), d.FOREGROUND_BACKGROUND);
    }

    /* access modifiers changed from: private */
    public void s() {
        m.b P10 = m.O().Q(com.google.firebase.perf.util.c.APP_START_TRACE_NAME.toString()).O(k().e()).P(k().d(this.f68577n));
        ArrayList arrayList = new ArrayList(3);
        arrayList.add((m) m.O().Q(com.google.firebase.perf.util.c.ON_CREATE_TRACE_NAME.toString()).O(k().e()).P(k().d(this.f68575l)).g());
        if (this.f68576m != null) {
            m.b O10 = m.O();
            O10.Q(com.google.firebase.perf.util.c.ON_START_TRACE_NAME.toString()).O(this.f68575l.e()).P(this.f68575l.d(this.f68576m));
            arrayList.add((m) O10.g());
            m.b O11 = m.O();
            O11.Q(com.google.firebase.perf.util.c.ON_RESUME_TRACE_NAME.toString()).O(this.f68576m.e()).P(this.f68576m.d(this.f68577n));
            arrayList.add((m) O11.g());
        }
        P10.G(arrayList).H(this.f68583t.a());
        this.f68565b.C((m) P10.g(), d.FOREGROUND_BACKGROUND);
    }

    @Keep
    public static void setLauncherActivityOnCreateTime(String str) {
    }

    @Keep
    public static void setLauncherActivityOnResumeTime(String str) {
    }

    @Keep
    public static void setLauncherActivityOnStartTime(String str) {
    }

    private void t(m.b bVar) {
        if (this.f68580q != null && this.f68581r != null && this.f68582s != null) {
            f68561B.execute(new e(this, bVar));
            y();
        }
    }

    /* access modifiers changed from: private */
    public void u() {
        if (this.f68582s == null) {
            this.f68582s = this.f68566c.a();
            this.f68568e.I((m) m.O().Q("_experiment_onDrawFoQ").O(p().e()).P(p().d(this.f68582s)).g());
            if (this.f68573j != null) {
                this.f68568e.I((m) m.O().Q("_experiment_procStart_to_classLoad").O(p().e()).P(p().d(k())).g());
            }
            this.f68568e.N("systemDeterminedForeground", this.f68587x ? "true" : "false");
            this.f68568e.M("onDrawCount", (long) this.f68585v);
            this.f68568e.H(this.f68583t.a());
            t(this.f68568e);
        }
    }

    /* access modifiers changed from: private */
    public void v() {
        if (this.f68580q == null) {
            this.f68580q = this.f68566c.a();
            this.f68568e.O(p().e()).P(p().d(this.f68580q));
            t(this.f68568e);
        }
    }

    /* access modifiers changed from: private */
    public void w() {
        if (this.f68581r == null) {
            this.f68581r = this.f68566c.a();
            this.f68568e.I((m) m.O().Q("_experiment_preDrawFoQ").O(p().e()).P(p().d(this.f68581r)).g());
            t(this.f68568e);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0041, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0043, code lost:
        return;
     */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x003e A[Catch:{ all -> 0x001a }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void onActivityCreated(android.app.Activity r4, android.os.Bundle r5) {
        /*
            r3 = this;
            monitor-enter(r3)
            boolean r5 = r3.f68584u     // Catch:{ all -> 0x001a }
            if (r5 != 0) goto L_0x0042
            com.google.firebase.perf.util.l r5 = r3.f68575l     // Catch:{ all -> 0x001a }
            if (r5 == 0) goto L_0x000a
            goto L_0x0042
        L_0x000a:
            boolean r5 = r3.f68587x     // Catch:{ all -> 0x001a }
            r0 = 1
            if (r5 != 0) goto L_0x001c
            android.content.Context r5 = r3.f68569f     // Catch:{ all -> 0x001a }
            boolean r5 = q(r5)     // Catch:{ all -> 0x001a }
            if (r5 == 0) goto L_0x0018
            goto L_0x001c
        L_0x0018:
            r5 = 0
            goto L_0x001d
        L_0x001a:
            r4 = move-exception
            goto L_0x0044
        L_0x001c:
            r5 = r0
        L_0x001d:
            r3.f68587x = r5     // Catch:{ all -> 0x001a }
            java.lang.ref.WeakReference r5 = new java.lang.ref.WeakReference     // Catch:{ all -> 0x001a }
            r5.<init>(r4)     // Catch:{ all -> 0x001a }
            r3.f68570g = r5     // Catch:{ all -> 0x001a }
            com.google.firebase.perf.util.a r4 = r3.f68566c     // Catch:{ all -> 0x001a }
            com.google.firebase.perf.util.l r4 = r4.a()     // Catch:{ all -> 0x001a }
            r3.f68575l = r4     // Catch:{ all -> 0x001a }
            com.google.firebase.perf.util.l r4 = r3.p()     // Catch:{ all -> 0x001a }
            com.google.firebase.perf.util.l r5 = r3.f68575l     // Catch:{ all -> 0x001a }
            long r4 = r4.d(r5)     // Catch:{ all -> 0x001a }
            long r1 = f68563z     // Catch:{ all -> 0x001a }
            int r4 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r4 <= 0) goto L_0x0040
            r3.f68572i = r0     // Catch:{ all -> 0x001a }
        L_0x0040:
            monitor-exit(r3)
            return
        L_0x0042:
            monitor-exit(r3)
            return
        L_0x0044:
            monitor-exit(r3)     // Catch:{ all -> 0x001a }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.perf.metrics.AppStartTrace.onActivityCreated(android.app.Activity, android.os.Bundle):void");
    }

    public void onActivityDestroyed(Activity activity) {
    }

    public void onActivityPaused(Activity activity) {
        View findViewById;
        if (!this.f68584u && !this.f68572i && this.f68567d.h() && (findViewById = activity.findViewById(16908290)) != null) {
            findViewById.getViewTreeObserver().removeOnDrawListener(this.f68586w);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x00a3, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x00a5, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void onActivityResumed(android.app.Activity r6) {
        /*
            r5 = this;
            monitor-enter(r5)
            boolean r0 = r5.f68584u     // Catch:{ all -> 0x003b }
            if (r0 != 0) goto L_0x00a4
            boolean r0 = r5.f68572i     // Catch:{ all -> 0x003b }
            if (r0 == 0) goto L_0x000b
            goto L_0x00a4
        L_0x000b:
            com.google.firebase.perf.config.a r0 = r5.f68567d     // Catch:{ all -> 0x003b }
            boolean r0 = r0.h()     // Catch:{ all -> 0x003b }
            if (r0 == 0) goto L_0x003d
            r1 = 16908290(0x1020002, float:2.3877235E-38)
            android.view.View r1 = r6.findViewById(r1)     // Catch:{ all -> 0x003b }
            if (r1 == 0) goto L_0x003d
            android.view.ViewTreeObserver r2 = r1.getViewTreeObserver()     // Catch:{ all -> 0x003b }
            com.google.firebase.perf.metrics.AppStartTrace$b r3 = r5.f68586w     // Catch:{ all -> 0x003b }
            r2.addOnDrawListener(r3)     // Catch:{ all -> 0x003b }
            Bc.a r2 = new Bc.a     // Catch:{ all -> 0x003b }
            r2.<init>(r5)     // Catch:{ all -> 0x003b }
            com.google.firebase.perf.util.e.c(r1, r2)     // Catch:{ all -> 0x003b }
            Bc.b r2 = new Bc.b     // Catch:{ all -> 0x003b }
            r2.<init>(r5)     // Catch:{ all -> 0x003b }
            Bc.c r3 = new Bc.c     // Catch:{ all -> 0x003b }
            r3.<init>(r5)     // Catch:{ all -> 0x003b }
            com.google.firebase.perf.util.h.a(r1, r2, r3)     // Catch:{ all -> 0x003b }
            goto L_0x003d
        L_0x003b:
            r6 = move-exception
            goto L_0x00a6
        L_0x003d:
            com.google.firebase.perf.util.l r1 = r5.f68577n     // Catch:{ all -> 0x003b }
            if (r1 == 0) goto L_0x0043
            monitor-exit(r5)
            return
        L_0x0043:
            java.lang.ref.WeakReference r1 = new java.lang.ref.WeakReference     // Catch:{ all -> 0x003b }
            r1.<init>(r6)     // Catch:{ all -> 0x003b }
            r5.f68571h = r1     // Catch:{ all -> 0x003b }
            com.google.firebase.perf.util.a r1 = r5.f68566c     // Catch:{ all -> 0x003b }
            com.google.firebase.perf.util.l r1 = r1.a()     // Catch:{ all -> 0x003b }
            r5.f68577n = r1     // Catch:{ all -> 0x003b }
            com.google.firebase.perf.session.SessionManager r1 = com.google.firebase.perf.session.SessionManager.getInstance()     // Catch:{ all -> 0x003b }
            Ec.a r1 = r1.perfSession()     // Catch:{ all -> 0x003b }
            r5.f68583t = r1     // Catch:{ all -> 0x003b }
            Ac.a r1 = Ac.a.e()     // Catch:{ all -> 0x003b }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x003b }
            r2.<init>()     // Catch:{ all -> 0x003b }
            java.lang.String r3 = "onResume(): "
            r2.append(r3)     // Catch:{ all -> 0x003b }
            java.lang.Class r6 = r6.getClass()     // Catch:{ all -> 0x003b }
            java.lang.String r6 = r6.getName()     // Catch:{ all -> 0x003b }
            r2.append(r6)     // Catch:{ all -> 0x003b }
            java.lang.String r6 = ": "
            r2.append(r6)     // Catch:{ all -> 0x003b }
            com.google.firebase.perf.util.l r6 = r5.k()     // Catch:{ all -> 0x003b }
            com.google.firebase.perf.util.l r3 = r5.f68577n     // Catch:{ all -> 0x003b }
            long r3 = r6.d(r3)     // Catch:{ all -> 0x003b }
            r2.append(r3)     // Catch:{ all -> 0x003b }
            java.lang.String r6 = " microseconds"
            r2.append(r6)     // Catch:{ all -> 0x003b }
            java.lang.String r6 = r2.toString()     // Catch:{ all -> 0x003b }
            r1.a(r6)     // Catch:{ all -> 0x003b }
            java.util.concurrent.ExecutorService r6 = f68561B     // Catch:{ all -> 0x003b }
            Bc.d r1 = new Bc.d     // Catch:{ all -> 0x003b }
            r1.<init>(r5)     // Catch:{ all -> 0x003b }
            r6.execute(r1)     // Catch:{ all -> 0x003b }
            if (r0 != 0) goto L_0x00a2
            r5.y()     // Catch:{ all -> 0x003b }
        L_0x00a2:
            monitor-exit(r5)
            return
        L_0x00a4:
            monitor-exit(r5)
            return
        L_0x00a6:
            monitor-exit(r5)     // Catch:{ all -> 0x003b }
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.perf.metrics.AppStartTrace.onActivityResumed(android.app.Activity):void");
    }

    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x001b, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void onActivityStarted(android.app.Activity r1) {
        /*
            r0 = this;
            monitor-enter(r0)
            boolean r1 = r0.f68584u     // Catch:{ all -> 0x0018 }
            if (r1 != 0) goto L_0x001a
            com.google.firebase.perf.util.l r1 = r0.f68576m     // Catch:{ all -> 0x0018 }
            if (r1 != 0) goto L_0x001a
            boolean r1 = r0.f68572i     // Catch:{ all -> 0x0018 }
            if (r1 == 0) goto L_0x000e
            goto L_0x001a
        L_0x000e:
            com.google.firebase.perf.util.a r1 = r0.f68566c     // Catch:{ all -> 0x0018 }
            com.google.firebase.perf.util.l r1 = r1.a()     // Catch:{ all -> 0x0018 }
            r0.f68576m = r1     // Catch:{ all -> 0x0018 }
            monitor-exit(r0)
            return
        L_0x0018:
            r1 = move-exception
            goto L_0x001c
        L_0x001a:
            monitor-exit(r0)
            return
        L_0x001c:
            monitor-exit(r0)     // Catch:{ all -> 0x0018 }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.perf.metrics.AppStartTrace.onActivityStarted(android.app.Activity):void");
    }

    public void onActivityStopped(Activity activity) {
    }

    @Keep
    @M(r.a.ON_STOP)
    public void onAppEnteredBackground() {
        if (!this.f68584u && !this.f68572i && this.f68579p == null) {
            this.f68579p = this.f68566c.a();
            this.f68568e.I((m) m.O().Q("_experiment_firstBackgrounding").O(p().e()).P(p().d(this.f68579p)).g());
        }
    }

    @Keep
    @M(r.a.ON_START)
    public void onAppEnteredForeground() {
        if (!this.f68584u && !this.f68572i && this.f68578o == null) {
            this.f68578o = this.f68566c.a();
            this.f68568e.I((m) m.O().Q("_experiment_firstForegrounding").O(p().e()).P(p().d(this.f68578o)).g());
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0038, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void x(android.content.Context r3) {
        /*
            r2 = this;
            monitor-enter(r2)
            boolean r0 = r2.f68564a     // Catch:{ all -> 0x002e }
            if (r0 == 0) goto L_0x0007
            monitor-exit(r2)
            return
        L_0x0007:
            androidx.lifecycle.y r0 = androidx.lifecycle.O.l()     // Catch:{ all -> 0x002e }
            androidx.lifecycle.r r0 = r0.getLifecycle()     // Catch:{ all -> 0x002e }
            r0.c(r2)     // Catch:{ all -> 0x002e }
            android.content.Context r3 = r3.getApplicationContext()     // Catch:{ all -> 0x002e }
            boolean r0 = r3 instanceof android.app.Application     // Catch:{ all -> 0x002e }
            if (r0 == 0) goto L_0x0037
            r0 = r3
            android.app.Application r0 = (android.app.Application) r0     // Catch:{ all -> 0x002e }
            r0.registerActivityLifecycleCallbacks(r2)     // Catch:{ all -> 0x002e }
            boolean r0 = r2.f68587x     // Catch:{ all -> 0x002e }
            r1 = 1
            if (r0 != 0) goto L_0x0030
            boolean r0 = q(r3)     // Catch:{ all -> 0x002e }
            if (r0 == 0) goto L_0x002c
            goto L_0x0030
        L_0x002c:
            r0 = 0
            goto L_0x0031
        L_0x002e:
            r3 = move-exception
            goto L_0x0039
        L_0x0030:
            r0 = r1
        L_0x0031:
            r2.f68587x = r0     // Catch:{ all -> 0x002e }
            r2.f68564a = r1     // Catch:{ all -> 0x002e }
            r2.f68569f = r3     // Catch:{ all -> 0x002e }
        L_0x0037:
            monitor-exit(r2)
            return
        L_0x0039:
            monitor-exit(r2)     // Catch:{ all -> 0x002e }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.perf.metrics.AppStartTrace.x(android.content.Context):void");
    }

    public synchronized void y() {
        if (this.f68564a) {
            O.l().getLifecycle().g(this);
            ((Application) this.f68569f).unregisterActivityLifecycleCallbacks(this);
            this.f68564a = false;
        }
    }
}
