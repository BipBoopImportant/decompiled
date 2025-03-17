package Za;

import Ya.p;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
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

/* renamed from: Za.D  reason: case insensitive filesystem */
public final class C9373D {

    /* renamed from: o  reason: collision with root package name */
    private static final Map f65017o = new HashMap();
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final Context f65018a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final s f65019b;

    /* renamed from: c  reason: collision with root package name */
    private final String f65020c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public final List f65021d = new ArrayList();

    /* renamed from: e  reason: collision with root package name */
    private final Set f65022e = new HashSet();
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public final Object f65023f = new Object();
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public boolean f65024g;

    /* renamed from: h  reason: collision with root package name */
    private final Intent f65025h;

    /* renamed from: i  reason: collision with root package name */
    private final WeakReference f65026i;

    /* renamed from: j  reason: collision with root package name */
    private final IBinder.DeathRecipient f65027j = new v(this);
    /* access modifiers changed from: private */

    /* renamed from: k  reason: collision with root package name */
    public final AtomicInteger f65028k = new AtomicInteger(0);
    /* access modifiers changed from: private */

    /* renamed from: l  reason: collision with root package name */
    public ServiceConnection f65029l;
    /* access modifiers changed from: private */

    /* renamed from: m  reason: collision with root package name */
    public IInterface f65030m;

    /* renamed from: n  reason: collision with root package name */
    private final p f65031n;

    public C9373D(Context context, s sVar, String str, Intent intent, p pVar, y yVar) {
        this.f65018a = context;
        this.f65019b = sVar;
        this.f65020c = "AppUpdateService";
        this.f65025h = intent;
        this.f65031n = pVar;
        this.f65026i = new WeakReference((Object) null);
    }

    public static /* synthetic */ void j(C9373D d10) {
        d10.f65019b.d("reportBinderDeath", new Object[0]);
        y yVar = (y) d10.f65026i.get();
        if (yVar != null) {
            d10.f65019b.d("calling onBinderDied", new Object[0]);
            yVar.zza();
        } else {
            d10.f65019b.d("%s : Binder has died.", d10.f65020c);
            for (t c10 : d10.f65021d) {
                c10.c(d10.v());
            }
            d10.f65021d.clear();
        }
        synchronized (d10.f65023f) {
            d10.w();
        }
    }

    static /* bridge */ /* synthetic */ void n(C9373D d10, C8972m mVar) {
        d10.f65022e.add(mVar);
        mVar.a().c(new u(d10, mVar));
    }

    static /* bridge */ /* synthetic */ void p(C9373D d10, t tVar) {
        if (d10.f65030m == null && !d10.f65024g) {
            d10.f65019b.d("Initiate binding to the service.", new Object[0]);
            d10.f65021d.add(tVar);
            C9372C c10 = new C9372C(d10, (C9371B) null);
            d10.f65029l = c10;
            d10.f65024g = true;
            if (!d10.f65018a.bindService(d10.f65025h, c10, 1)) {
                d10.f65019b.d("Failed to bind to the service.", new Object[0]);
                d10.f65024g = false;
                for (t c11 : d10.f65021d) {
                    c11.c(new C9374E());
                }
                d10.f65021d.clear();
            }
        } else if (d10.f65024g) {
            d10.f65019b.d("Waiting to bind to the service.", new Object[0]);
            d10.f65021d.add(tVar);
        } else {
            tVar.run();
        }
    }

    static /* bridge */ /* synthetic */ void q(C9373D d10) {
        d10.f65019b.d("linkToDeath", new Object[0]);
        try {
            d10.f65030m.asBinder().linkToDeath(d10.f65027j, 0);
        } catch (RemoteException e10) {
            d10.f65019b.c(e10, "linkToDeath failed", new Object[0]);
        }
    }

    static /* bridge */ /* synthetic */ void r(C9373D d10) {
        d10.f65019b.d("unlinkToDeath", new Object[0]);
        d10.f65030m.asBinder().unlinkToDeath(d10.f65027j, 0);
    }

    private final RemoteException v() {
        return new RemoteException(String.valueOf(this.f65020c).concat(" : Binder has died."));
    }

    /* access modifiers changed from: private */
    public final void w() {
        for (C8972m d10 : this.f65022e) {
            d10.d(v());
        }
        this.f65022e.clear();
    }

    public final Handler c() {
        Handler handler;
        Map map = f65017o;
        synchronized (map) {
            try {
                if (!map.containsKey(this.f65020c)) {
                    HandlerThread handlerThread = new HandlerThread(this.f65020c, 10);
                    handlerThread.start();
                    map.put(this.f65020c, new Handler(handlerThread.getLooper()));
                }
                handler = (Handler) map.get(this.f65020c);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return handler;
    }

    public final IInterface e() {
        return this.f65030m;
    }

    public final void s(t tVar, C8972m mVar) {
        c().post(new w(this, tVar.b(), mVar, tVar));
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void t(C8972m mVar, C8971l lVar) {
        synchronized (this.f65023f) {
            this.f65022e.remove(mVar);
        }
    }

    public final void u(C8972m mVar) {
        synchronized (this.f65023f) {
            this.f65022e.remove(mVar);
        }
        c().post(new x(this));
    }
}
