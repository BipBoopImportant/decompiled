package com.google.firebase.messaging;

import F9.C6469a;
import Fb.b;
import Fb.f;
import Hc.i;
import K9.C6620s;
import android.annotation.SuppressLint;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import androidx.annotation.Keep;
import com.google.firebase.messaging.a0;
import j9.j;
import java.io.IOException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import jc.C9894a;
import jc.C9895b;
import jc.C9897d;
import lc.C10007a;
import mc.C10036b;
import nc.e;
import xa.C8971l;
import xa.C8972m;
import xa.C8974o;

public class FirebaseMessaging {

    /* renamed from: m  reason: collision with root package name */
    private static final long f68315m = TimeUnit.HOURS.toSeconds(8);

    /* renamed from: n  reason: collision with root package name */
    private static a0 f68316n;

    /* renamed from: o  reason: collision with root package name */
    static C10036b<j> f68317o = new C9558p();

    /* renamed from: p  reason: collision with root package name */
    static ScheduledExecutorService f68318p;
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final f f68319a;

    /* renamed from: b  reason: collision with root package name */
    private final C10007a f68320b;

    /* renamed from: c  reason: collision with root package name */
    private final Context f68321c;

    /* renamed from: d  reason: collision with root package name */
    private final D f68322d;

    /* renamed from: e  reason: collision with root package name */
    private final V f68323e;

    /* renamed from: f  reason: collision with root package name */
    private final a f68324f;

    /* renamed from: g  reason: collision with root package name */
    private final Executor f68325g;

    /* renamed from: h  reason: collision with root package name */
    private final Executor f68326h;

    /* renamed from: i  reason: collision with root package name */
    private final C8971l<f0> f68327i;

    /* renamed from: j  reason: collision with root package name */
    private final I f68328j;

    /* renamed from: k  reason: collision with root package name */
    private boolean f68329k;

    /* renamed from: l  reason: collision with root package name */
    private final Application.ActivityLifecycleCallbacks f68330l;

    private class a {

        /* renamed from: a  reason: collision with root package name */
        private final C9897d f68331a;

        /* renamed from: b  reason: collision with root package name */
        private boolean f68332b;

        /* renamed from: c  reason: collision with root package name */
        private C9895b<b> f68333c;

        /* renamed from: d  reason: collision with root package name */
        private Boolean f68334d;

        a(C9897d dVar) {
            this.f68331a = dVar;
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void d(C9894a aVar) {
            if (c()) {
                FirebaseMessaging.this.O();
            }
        }

        private Boolean e() {
            ApplicationInfo applicationInfo;
            Bundle bundle;
            Context k10 = FirebaseMessaging.this.f68319a.k();
            SharedPreferences sharedPreferences = k10.getSharedPreferences("com.google.firebase.messaging", 0);
            if (sharedPreferences.contains("auto_init")) {
                return Boolean.valueOf(sharedPreferences.getBoolean("auto_init", false));
            }
            try {
                PackageManager packageManager = k10.getPackageManager();
                if (packageManager == null || (applicationInfo = packageManager.getApplicationInfo(k10.getPackageName(), 128)) == null || (bundle = applicationInfo.metaData) == null || !bundle.containsKey("firebase_messaging_auto_init_enabled")) {
                    return null;
                }
                return Boolean.valueOf(applicationInfo.metaData.getBoolean("firebase_messaging_auto_init_enabled"));
            } catch (PackageManager.NameNotFoundException unused) {
                return null;
            }
        }

        /* access modifiers changed from: package-private */
        public synchronized void b() {
            try {
                if (!this.f68332b) {
                    Boolean e10 = e();
                    this.f68334d = e10;
                    if (e10 == null) {
                        A a10 = new A(this);
                        this.f68333c = a10;
                        this.f68331a.b(b.class, a10);
                    }
                    this.f68332b = true;
                }
            } catch (Throwable th2) {
                while (true) {
                    throw th2;
                }
            }
        }

        /* access modifiers changed from: package-private */
        public synchronized boolean c() {
            Boolean bool;
            try {
                b();
                bool = this.f68334d;
            } catch (Throwable th2) {
                while (true) {
                    throw th2;
                }
            }
            return bool != null ? bool.booleanValue() : FirebaseMessaging.this.f68319a.t();
        }
    }

    FirebaseMessaging(f fVar, C10007a aVar, C10036b<i> bVar, C10036b<kc.j> bVar2, e eVar, C10036b<j> bVar3, C9897d dVar) {
        this(fVar, aVar, bVar, bVar2, eVar, bVar3, dVar, new I(fVar.k()));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ C8971l B(String str, a0.a aVar, String str2) {
        r(this.f68321c).g(s(), str, str2, this.f68328j.a());
        if (aVar == null || !str2.equals(aVar.f68392a)) {
            y(str2);
        }
        return C8974o.f(str2);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ C8971l C(String str, a0.a aVar) {
        return this.f68322d.g().r(this.f68326h, new C9565x(this, str, aVar));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void D(C8972m mVar) {
        try {
            this.f68320b.a(I.c(this.f68319a), "FCM");
            mVar.c(null);
        } catch (Exception e10) {
            mVar.b(e10);
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void E(C8972m mVar) {
        try {
            C8974o.a(this.f68322d.c());
            r(this.f68321c).d(s(), I.c(this.f68319a));
            mVar.c(null);
        } catch (Exception e10) {
            mVar.b(e10);
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void F(C8972m mVar) {
        try {
            mVar.c(m());
        } catch (Exception e10) {
            mVar.b(e10);
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void G(C6469a aVar) {
        if (aVar != null) {
            H.y(aVar.x());
            w();
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void H() {
        if (z()) {
            O();
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void I(f0 f0Var) {
        if (z()) {
            f0Var.o();
        }
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ j K() {
        return null;
    }

    private boolean M() {
        O.c(this.f68321c);
        if (!O.d(this.f68321c)) {
            return false;
        }
        if (this.f68319a.j(Ib.a.class) != null) {
            return true;
        }
        return H.a() && f68317o != null;
    }

    private synchronized void N() {
        if (!this.f68329k) {
            P(0);
        }
    }

    /* access modifiers changed from: private */
    public void O() {
        C10007a aVar = this.f68320b;
        if (aVar != null) {
            aVar.getToken();
        } else if (Q(u())) {
            N();
        }
    }

    @Keep
    static synchronized FirebaseMessaging getInstance(f fVar) {
        FirebaseMessaging firebaseMessaging;
        synchronized (FirebaseMessaging.class) {
            firebaseMessaging = (FirebaseMessaging) fVar.j(FirebaseMessaging.class);
            C6620s.m(firebaseMessaging, "Firebase Messaging component is not present");
        }
        return firebaseMessaging;
    }

    public static synchronized FirebaseMessaging q() {
        FirebaseMessaging instance;
        synchronized (FirebaseMessaging.class) {
            instance = getInstance(f.l());
        }
        return instance;
    }

    private static synchronized a0 r(Context context) {
        a0 a0Var;
        synchronized (FirebaseMessaging.class) {
            try {
                if (f68316n == null) {
                    f68316n = new a0(context);
                }
                a0Var = f68316n;
            } catch (Throwable th2) {
                while (true) {
                    throw th2;
                }
            }
        }
        return a0Var;
    }

    private String s() {
        return "[DEFAULT]".equals(this.f68319a.m()) ? "" : this.f68319a.o();
    }

    public static j v() {
        return f68317o.get();
    }

    private void w() {
        this.f68322d.f().f(this.f68325g, new C9563v(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: x */
    public void J() {
        O.c(this.f68321c);
        Q.g(this.f68321c, this.f68322d, M());
        if (M()) {
            w();
        }
    }

    private void y(String str) {
        if ("[DEFAULT]".equals(this.f68319a.m())) {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Invoking onNewToken for app: " + this.f68319a.m());
            }
            Intent intent = new Intent("com.google.firebase.messaging.NEW_TOKEN");
            intent.putExtra("token", str);
            new C9555m(this.f68321c).k(intent);
        }
    }

    /* access modifiers changed from: package-private */
    public boolean A() {
        return this.f68328j.g();
    }

    /* access modifiers changed from: package-private */
    public synchronized void L(boolean z10) {
        this.f68329k = z10;
    }

    /* access modifiers changed from: package-private */
    public synchronized void P(long j10) {
        o(new b0(this, Math.min(Math.max(30, 2 * j10), f68315m)), j10);
        this.f68329k = true;
    }

    /* access modifiers changed from: package-private */
    public boolean Q(a0.a aVar) {
        return aVar == null || aVar.b(this.f68328j.a());
    }

    /* access modifiers changed from: package-private */
    public String m() {
        C10007a aVar = this.f68320b;
        if (aVar != null) {
            try {
                return (String) C8974o.a(aVar.c());
            } catch (InterruptedException | ExecutionException e10) {
                throw new IOException(e10);
            }
        } else {
            a0.a u10 = u();
            if (!Q(u10)) {
                return u10.f68392a;
            }
            String c10 = I.c(this.f68319a);
            try {
                return (String) C8974o.a(this.f68323e.b(c10, new C9564w(this, c10, u10)));
            } catch (InterruptedException | ExecutionException e11) {
                throw new IOException(e11);
            }
        }
    }

    public C8971l<Void> n() {
        if (this.f68320b != null) {
            C8972m mVar = new C8972m();
            this.f68325g.execute(new C9567z(this, mVar));
            return mVar.a();
        } else if (u() == null) {
            return C8974o.f(null);
        } else {
            C8972m mVar2 = new C8972m();
            C9556n.e().execute(new C9559q(this, mVar2));
            return mVar2.a();
        }
    }

    /* access modifiers changed from: package-private */
    @SuppressLint({"ThreadPoolCreation"})
    public void o(Runnable runnable, long j10) {
        synchronized (FirebaseMessaging.class) {
            try {
                if (f68318p == null) {
                    f68318p = new ScheduledThreadPoolExecutor(1, new R9.b("TAG"));
                }
                f68318p.schedule(runnable, j10, TimeUnit.SECONDS);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* access modifiers changed from: package-private */
    public Context p() {
        return this.f68321c;
    }

    public C8971l<String> t() {
        C10007a aVar = this.f68320b;
        if (aVar != null) {
            return aVar.c();
        }
        C8972m mVar = new C8972m();
        this.f68325g.execute(new C9566y(this, mVar));
        return mVar.a();
    }

    /* access modifiers changed from: package-private */
    public a0.a u() {
        return r(this.f68321c).e(s(), I.c(this.f68319a));
    }

    public boolean z() {
        return this.f68324f.c();
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    FirebaseMessaging(Fb.f r11, lc.C10007a r12, mc.C10036b<Hc.i> r13, mc.C10036b<kc.j> r14, nc.e r15, mc.C10036b<j9.j> r16, jc.C9897d r17, com.google.firebase.messaging.I r18) {
        /*
            r10 = this;
            com.google.firebase.messaging.D r6 = new com.google.firebase.messaging.D
            r0 = r6
            r1 = r11
            r2 = r18
            r3 = r13
            r4 = r14
            r5 = r15
            r0.<init>(r1, r2, r3, r4, r5)
            java.util.concurrent.ExecutorService r7 = com.google.firebase.messaging.C9556n.f()
            java.util.concurrent.ScheduledExecutorService r8 = com.google.firebase.messaging.C9556n.c()
            java.util.concurrent.Executor r9 = com.google.firebase.messaging.C9556n.b()
            r0 = r10
            r2 = r12
            r3 = r16
            r4 = r17
            r5 = r18
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.messaging.FirebaseMessaging.<init>(Fb.f, lc.a, mc.b, mc.b, nc.e, mc.b, jc.d, com.google.firebase.messaging.I):void");
    }

    FirebaseMessaging(f fVar, C10007a aVar, C10036b<j> bVar, C9897d dVar, I i10, D d10, Executor executor, Executor executor2, Executor executor3) {
        this.f68329k = false;
        f68317o = bVar;
        this.f68319a = fVar;
        this.f68320b = aVar;
        this.f68324f = new a(dVar);
        Context k10 = fVar.k();
        this.f68321c = k10;
        C9557o oVar = new C9557o();
        this.f68330l = oVar;
        this.f68328j = i10;
        this.f68322d = d10;
        this.f68323e = new V(executor);
        this.f68325g = executor2;
        this.f68326h = executor3;
        Context k11 = fVar.k();
        if (k11 instanceof Application) {
            ((Application) k11).registerActivityLifecycleCallbacks(oVar);
        } else {
            Log.w("FirebaseMessaging", "Context " + k11 + " was not an application, can't register for lifecycle callbacks. Some notification events may be dropped as a result.");
        }
        if (aVar != null) {
            aVar.b(new r(this));
        }
        executor2.execute(new C9560s(this));
        C8971l<f0> e10 = f0.e(this, i10, d10, k10, C9556n.g());
        this.f68327i = e10;
        e10.f(executor2, new C9561t(this));
        executor2.execute(new C9562u(this));
    }
}
