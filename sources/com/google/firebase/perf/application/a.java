package com.google.firebase.perf.application;

import Bc.f;
import Fc.k;
import Gc.d;
import Gc.m;
import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import androidx.fragment.app.C5191t;
import com.google.firebase.perf.metrics.Trace;
import com.google.firebase.perf.session.SessionManager;
import com.google.firebase.perf.util.c;
import com.google.firebase.perf.util.g;
import com.google.firebase.perf.util.j;
import com.google.firebase.perf.util.l;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicInteger;

public class a implements Application.ActivityLifecycleCallbacks {

    /* renamed from: r  reason: collision with root package name */
    private static final Ac.a f68502r = Ac.a.e();

    /* renamed from: s  reason: collision with root package name */
    private static volatile a f68503s;

    /* renamed from: a  reason: collision with root package name */
    private final WeakHashMap<Activity, Boolean> f68504a;

    /* renamed from: b  reason: collision with root package name */
    private final WeakHashMap<Activity, c> f68505b;

    /* renamed from: c  reason: collision with root package name */
    private final WeakHashMap<Activity, FragmentStateMonitor> f68506c;

    /* renamed from: d  reason: collision with root package name */
    private final WeakHashMap<Activity, Trace> f68507d;

    /* renamed from: e  reason: collision with root package name */
    private final Map<String, Long> f68508e;

    /* renamed from: f  reason: collision with root package name */
    private final Set<WeakReference<b>> f68509f;

    /* renamed from: g  reason: collision with root package name */
    private Set<C1180a> f68510g;

    /* renamed from: h  reason: collision with root package name */
    private final AtomicInteger f68511h;

    /* renamed from: i  reason: collision with root package name */
    private final k f68512i;

    /* renamed from: j  reason: collision with root package name */
    private final com.google.firebase.perf.config.a f68513j;

    /* renamed from: k  reason: collision with root package name */
    private final com.google.firebase.perf.util.a f68514k;

    /* renamed from: l  reason: collision with root package name */
    private final boolean f68515l;

    /* renamed from: m  reason: collision with root package name */
    private l f68516m;

    /* renamed from: n  reason: collision with root package name */
    private l f68517n;

    /* renamed from: o  reason: collision with root package name */
    private d f68518o;

    /* renamed from: p  reason: collision with root package name */
    private boolean f68519p;

    /* renamed from: q  reason: collision with root package name */
    private boolean f68520q;

    /* renamed from: com.google.firebase.perf.application.a$a  reason: collision with other inner class name */
    public interface C1180a {
        void a();
    }

    public interface b {
        void onUpdateAppState(d dVar);
    }

    a(k kVar, com.google.firebase.perf.util.a aVar) {
        this(kVar, aVar, com.google.firebase.perf.config.a.g(), g());
    }

    public static a b() {
        if (f68503s == null) {
            synchronized (a.class) {
                try {
                    if (f68503s == null) {
                        f68503s = new a(k.k(), new com.google.firebase.perf.util.a());
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f68503s;
    }

    public static String c(Activity activity) {
        return "_st_" + activity.getClass().getSimpleName();
    }

    private static boolean g() {
        return c.a();
    }

    private void l() {
        synchronized (this.f68510g) {
            try {
                for (C1180a next : this.f68510g) {
                    if (next != null) {
                        next.a();
                    }
                }
            } finally {
            }
        }
    }

    private void m(Activity activity) {
        Trace trace = this.f68507d.get(activity);
        if (trace != null) {
            this.f68507d.remove(activity);
            g<f.a> e10 = this.f68505b.get(activity).e();
            if (!e10.d()) {
                f68502r.k("Failed to record frame data for %s.", activity.getClass().getSimpleName());
                return;
            }
            j.a(trace, e10.c());
            trace.stop();
        }
    }

    private void n(String str, l lVar, l lVar2) {
        if (this.f68513j.K()) {
            m.b H10 = m.O().Q(str).O(lVar.e()).P(lVar.d(lVar2)).H(SessionManager.getInstance().perfSession().a());
            int andSet = this.f68511h.getAndSet(0);
            synchronized (this.f68508e) {
                try {
                    H10.K(this.f68508e);
                    if (andSet != 0) {
                        H10.M(com.google.firebase.perf.util.b.TRACE_STARTED_NOT_STOPPED.toString(), (long) andSet);
                    }
                    this.f68508e.clear();
                } catch (Throwable th2) {
                    while (true) {
                        throw th2;
                    }
                }
            }
            this.f68512i.C((m) H10.g(), d.FOREGROUND_BACKGROUND);
        }
    }

    private void o(Activity activity) {
        if (h() && this.f68513j.K()) {
            c cVar = new c(activity);
            this.f68505b.put(activity, cVar);
            if (activity instanceof C5191t) {
                FragmentStateMonitor fragmentStateMonitor = new FragmentStateMonitor(this.f68514k, this.f68512i, this, cVar);
                this.f68506c.put(activity, fragmentStateMonitor);
                ((C5191t) activity).getSupportFragmentManager().A1(fragmentStateMonitor, true);
            }
        }
    }

    private void q(d dVar) {
        this.f68518o = dVar;
        synchronized (this.f68509f) {
            try {
                Iterator<WeakReference<b>> it = this.f68509f.iterator();
                while (it.hasNext()) {
                    b bVar = (b) it.next().get();
                    if (bVar != null) {
                        bVar.onUpdateAppState(this.f68518o);
                    } else {
                        it.remove();
                    }
                }
            } finally {
            }
        }
    }

    public d a() {
        return this.f68518o;
    }

    public void d(String str, long j10) {
        synchronized (this.f68508e) {
            try {
                Long l10 = this.f68508e.get(str);
                if (l10 == null) {
                    this.f68508e.put(str, Long.valueOf(j10));
                } else {
                    this.f68508e.put(str, Long.valueOf(l10.longValue() + j10));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void e(int i10) {
        this.f68511h.addAndGet(i10);
    }

    public boolean f() {
        return this.f68520q;
    }

    /* access modifiers changed from: protected */
    public boolean h() {
        return this.f68515l;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x001b, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void i(android.content.Context r2) {
        /*
            r1 = this;
            monitor-enter(r1)
            boolean r0 = r1.f68519p     // Catch:{ all -> 0x0018 }
            if (r0 == 0) goto L_0x0007
            monitor-exit(r1)
            return
        L_0x0007:
            android.content.Context r2 = r2.getApplicationContext()     // Catch:{ all -> 0x0018 }
            boolean r0 = r2 instanceof android.app.Application     // Catch:{ all -> 0x0018 }
            if (r0 == 0) goto L_0x001a
            android.app.Application r2 = (android.app.Application) r2     // Catch:{ all -> 0x0018 }
            r2.registerActivityLifecycleCallbacks(r1)     // Catch:{ all -> 0x0018 }
            r2 = 1
            r1.f68519p = r2     // Catch:{ all -> 0x0018 }
            goto L_0x001a
        L_0x0018:
            r2 = move-exception
            goto L_0x001c
        L_0x001a:
            monitor-exit(r1)
            return
        L_0x001c:
            monitor-exit(r1)     // Catch:{ all -> 0x0018 }
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.perf.application.a.i(android.content.Context):void");
    }

    public void j(C1180a aVar) {
        synchronized (this.f68510g) {
            this.f68510g.add(aVar);
        }
    }

    public void k(WeakReference<b> weakReference) {
        synchronized (this.f68509f) {
            this.f68509f.add(weakReference);
        }
    }

    public void onActivityCreated(Activity activity, Bundle bundle) {
        o(activity);
    }

    public void onActivityDestroyed(Activity activity) {
        this.f68505b.remove(activity);
        if (this.f68506c.containsKey(activity)) {
            ((C5191t) activity).getSupportFragmentManager().Y1(this.f68506c.remove(activity));
        }
    }

    public void onActivityPaused(Activity activity) {
    }

    public synchronized void onActivityResumed(Activity activity) {
        try {
            if (this.f68504a.isEmpty()) {
                this.f68516m = this.f68514k.a();
                this.f68504a.put(activity, Boolean.TRUE);
                if (this.f68520q) {
                    q(d.FOREGROUND);
                    l();
                    this.f68520q = false;
                } else {
                    n(c.BACKGROUND_TRACE_NAME.toString(), this.f68517n, this.f68516m);
                    q(d.FOREGROUND);
                }
            } else {
                this.f68504a.put(activity, Boolean.TRUE);
            }
        } catch (Throwable th2) {
            while (true) {
                throw th2;
            }
        }
    }

    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    public synchronized void onActivityStarted(Activity activity) {
        try {
            if (h() && this.f68513j.K()) {
                if (!this.f68505b.containsKey(activity)) {
                    o(activity);
                }
                this.f68505b.get(activity).c();
                Trace trace = new Trace(c(activity), this.f68512i, this.f68514k, this);
                trace.start();
                this.f68507d.put(activity, trace);
            }
        } catch (Throwable th2) {
            while (true) {
                throw th2;
            }
        }
    }

    public synchronized void onActivityStopped(Activity activity) {
        try {
            if (h()) {
                m(activity);
            }
            if (this.f68504a.containsKey(activity)) {
                this.f68504a.remove(activity);
                if (this.f68504a.isEmpty()) {
                    this.f68517n = this.f68514k.a();
                    n(c.FOREGROUND_TRACE_NAME.toString(), this.f68516m, this.f68517n);
                    q(d.BACKGROUND);
                }
            }
        } catch (Throwable th2) {
            while (true) {
                throw th2;
            }
        }
    }

    public void p(WeakReference<b> weakReference) {
        synchronized (this.f68509f) {
            this.f68509f.remove(weakReference);
        }
    }

    a(k kVar, com.google.firebase.perf.util.a aVar, com.google.firebase.perf.config.a aVar2, boolean z10) {
        this.f68504a = new WeakHashMap<>();
        this.f68505b = new WeakHashMap<>();
        this.f68506c = new WeakHashMap<>();
        this.f68507d = new WeakHashMap<>();
        this.f68508e = new HashMap();
        this.f68509f = new HashSet();
        this.f68510g = new HashSet();
        this.f68511h = new AtomicInteger(0);
        this.f68518o = d.BACKGROUND;
        this.f68519p = false;
        this.f68520q = true;
        this.f68512i = kVar;
        this.f68514k = aVar;
        this.f68513j = aVar2;
        this.f68515l = z10;
    }
}
