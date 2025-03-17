package fb;

import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import eb.i;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;
import xa.C8971l;
import xa.C8972m;

public final class t {

    /* renamed from: n  reason: collision with root package name */
    private static final Map f72951n = new HashMap();
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final Context f72952a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final C9693i f72953b;

    /* renamed from: c  reason: collision with root package name */
    private final String f72954c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public final List f72955d = new ArrayList();

    /* renamed from: e  reason: collision with root package name */
    private final Set f72956e = new HashSet();
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public final Object f72957f = new Object();
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public boolean f72958g;

    /* renamed from: h  reason: collision with root package name */
    private final Intent f72959h;

    /* renamed from: i  reason: collision with root package name */
    private final WeakReference f72960i;

    /* renamed from: j  reason: collision with root package name */
    private final IBinder.DeathRecipient f72961j = new C9695k(this);
    /* access modifiers changed from: private */

    /* renamed from: k  reason: collision with root package name */
    public final AtomicInteger f72962k = new AtomicInteger(0);
    /* access modifiers changed from: private */

    /* renamed from: l  reason: collision with root package name */
    public ServiceConnection f72963l;
    /* access modifiers changed from: private */

    /* renamed from: m  reason: collision with root package name */
    public IInterface f72964m;

    public t(Context context, C9693i iVar, String str, Intent intent, i iVar2, C9699o oVar) {
        this.f72952a = context;
        this.f72953b = iVar;
        this.f72954c = "com.google.android.finsky.inappreviewservice.InAppReviewService";
        this.f72959h = intent;
        this.f72960i = new WeakReference((Object) null);
    }

    public static /* synthetic */ void j(t tVar) {
        tVar.f72953b.c("reportBinderDeath", new Object[0]);
        C9699o oVar = (C9699o) tVar.f72960i.get();
        if (oVar != null) {
            tVar.f72953b.c("calling onBinderDied", new Object[0]);
            oVar.zza();
        } else {
            tVar.f72953b.c("%s : Binder has died.", tVar.f72954c);
            for (C9694j c10 : tVar.f72955d) {
                c10.c(tVar.v());
            }
            tVar.f72955d.clear();
        }
        synchronized (tVar.f72957f) {
            tVar.w();
        }
    }

    static /* bridge */ /* synthetic */ void n(t tVar, C8972m mVar) {
        tVar.f72956e.add(mVar);
        mVar.a().c(new C9696l(tVar, mVar));
    }

    static /* bridge */ /* synthetic */ void p(t tVar, C9694j jVar) {
        if (tVar.f72964m == null && !tVar.f72958g) {
            tVar.f72953b.c("Initiate binding to the service.", new Object[0]);
            tVar.f72955d.add(jVar);
            r rVar = new r(tVar, (s) null);
            tVar.f72963l = rVar;
            tVar.f72958g = true;
            if (!tVar.f72952a.bindService(tVar.f72959h, rVar, 1)) {
                tVar.f72953b.c("Failed to bind to the service.", new Object[0]);
                tVar.f72958g = false;
                for (C9694j c10 : tVar.f72955d) {
                    c10.c(new u());
                }
                tVar.f72955d.clear();
            }
        } else if (tVar.f72958g) {
            tVar.f72953b.c("Waiting to bind to the service.", new Object[0]);
            tVar.f72955d.add(jVar);
        } else {
            jVar.run();
        }
    }

    static /* bridge */ /* synthetic */ void q(t tVar) {
        tVar.f72953b.c("linkToDeath", new Object[0]);
        try {
            tVar.f72964m.asBinder().linkToDeath(tVar.f72961j, 0);
        } catch (RemoteException e10) {
            tVar.f72953b.b(e10, "linkToDeath failed", new Object[0]);
        }
    }

    static /* bridge */ /* synthetic */ void r(t tVar) {
        tVar.f72953b.c("unlinkToDeath", new Object[0]);
        tVar.f72964m.asBinder().unlinkToDeath(tVar.f72961j, 0);
    }

    private final RemoteException v() {
        return new RemoteException(String.valueOf(this.f72954c).concat(" : Binder has died."));
    }

    /* access modifiers changed from: private */
    public final void w() {
        for (C8972m d10 : this.f72956e) {
            d10.d(v());
        }
        this.f72956e.clear();
    }

    public final Handler c() {
        Handler handler;
        Map map = f72951n;
        synchronized (map) {
            try {
                if (!map.containsKey(this.f72954c)) {
                    HandlerThread handlerThread = new HandlerThread(this.f72954c, 10);
                    handlerThread.start();
                    map.put(this.f72954c, new Handler(handlerThread.getLooper()));
                }
                handler = (Handler) map.get(this.f72954c);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return handler;
    }

    public final IInterface e() {
        return this.f72964m;
    }

    public final void s(C9694j jVar, C8972m mVar) {
        c().post(new C9697m(this, jVar.b(), mVar, jVar));
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void t(C8972m mVar, C8971l lVar) {
        synchronized (this.f72957f) {
            this.f72956e.remove(mVar);
        }
    }

    public final void u(C8972m mVar) {
        synchronized (this.f72957f) {
            this.f72956e.remove(mVar);
        }
        c().post(new C9698n(this));
    }
}
