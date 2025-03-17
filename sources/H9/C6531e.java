package H9;

import H9.C6536j;
import K9.C6611i;
import K9.C6618p;
import K9.C6621t;
import K9.C6622u;
import K9.C6624w;
import K9.C6625x;
import K9.C6626y;
import K9.L;
import aa.j;
import android.app.Application;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.a;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.f;
import com.google.android.gms.common.util.i;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import j0.C5446b;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import xa.C8971l;
import xa.C8972m;

/* renamed from: H9.e  reason: case insensitive filesystem */
public class C6531e implements Handler.Callback {

    /* renamed from: p  reason: collision with root package name */
    public static final Status f36556p = new Status(4, "Sign-out occurred while this API call was in progress.");
    /* access modifiers changed from: private */

    /* renamed from: q  reason: collision with root package name */
    public static final Status f36557q = new Status(4, "The user must be signed in to make this API call.");
    /* access modifiers changed from: private */

    /* renamed from: r  reason: collision with root package name */
    public static final Object f36558r = new Object();

    /* renamed from: s  reason: collision with root package name */
    private static C6531e f36559s;
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public long f36560a = 10000;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public boolean f36561b = false;

    /* renamed from: c  reason: collision with root package name */
    private C6624w f36562c;

    /* renamed from: d  reason: collision with root package name */
    private C6626y f36563d;
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public final Context f36564e;
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public final a f36565f;
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public final L f36566g;

    /* renamed from: h  reason: collision with root package name */
    private final AtomicInteger f36567h = new AtomicInteger(1);

    /* renamed from: i  reason: collision with root package name */
    private final AtomicInteger f36568i = new AtomicInteger(0);
    /* access modifiers changed from: private */

    /* renamed from: j  reason: collision with root package name */
    public final Map f36569j = new ConcurrentHashMap(5, 0.75f, 1);
    /* access modifiers changed from: private */

    /* renamed from: k  reason: collision with root package name */
    public C6551z f36570k = null;
    /* access modifiers changed from: private */

    /* renamed from: l  reason: collision with root package name */
    public final Set f36571l = new C5446b();

    /* renamed from: m  reason: collision with root package name */
    private final Set f36572m = new C5446b();
    /* access modifiers changed from: private */

    /* renamed from: n  reason: collision with root package name */
    public final Handler f36573n;
    /* access modifiers changed from: private */

    /* renamed from: o  reason: collision with root package name */
    public volatile boolean f36574o = true;

    private C6531e(Context context, Looper looper, a aVar) {
        this.f36564e = context;
        j jVar = new j(looper, this);
        this.f36573n = jVar;
        this.f36565f = aVar;
        this.f36566g = new L(aVar);
        if (i.a(context)) {
            this.f36574o = false;
        }
        jVar.sendMessage(jVar.obtainMessage(6));
    }

    public static void a() {
        synchronized (f36558r) {
            try {
                C6531e eVar = f36559s;
                if (eVar != null) {
                    eVar.f36568i.incrementAndGet();
                    Handler handler = eVar.f36573n;
                    handler.sendMessageAtFrontOfQueue(handler.obtainMessage(10));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* access modifiers changed from: private */
    public static Status g(C6528b bVar, ConnectionResult connectionResult) {
        String b10 = bVar.b();
        String valueOf = String.valueOf(connectionResult);
        return new Status(connectionResult, "API: " + b10 + " is not available on this device. Connection failed with: " + valueOf);
    }

    @ResultIgnorabilityUnspecified
    private final I h(f fVar) {
        Map map = this.f36569j;
        C6528b t10 = fVar.t();
        I i10 = (I) map.get(t10);
        if (i10 == null) {
            i10 = new I(this, fVar);
            this.f36569j.put(t10, i10);
        }
        if (i10.a()) {
            this.f36572m.add(t10);
        }
        i10.C();
        return i10;
    }

    private final C6626y i() {
        if (this.f36563d == null) {
            this.f36563d = C6625x.a(this.f36564e);
        }
        return this.f36563d;
    }

    private final void j() {
        C6624w wVar = this.f36562c;
        if (wVar != null) {
            if (wVar.x() > 0 || e()) {
                i().g(wVar);
            }
            this.f36562c = null;
        }
    }

    private final void k(C8972m mVar, int i10, f fVar) {
        T a10;
        if (i10 != 0 && (a10 = T.a(this, i10, fVar.t())) != null) {
            C8971l a11 = mVar.a();
            Handler handler = this.f36573n;
            handler.getClass();
            a11.b(new C(handler), a10);
        }
    }

    @ResultIgnorabilityUnspecified
    public static C6531e u(Context context) {
        C6531e eVar;
        synchronized (f36558r) {
            try {
                if (f36559s == null) {
                    f36559s = new C6531e(context.getApplicationContext(), C6611i.c().getLooper(), a.n());
                }
                eVar = f36559s;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return eVar;
    }

    public final void C(f fVar, int i10, com.google.android.gms.common.api.internal.a aVar) {
        this.f36573n.sendMessage(this.f36573n.obtainMessage(4, new X(new l0(i10, aVar), this.f36568i.get(), fVar)));
    }

    public final void D(f fVar, int i10, C6545t tVar, C8972m mVar, r rVar) {
        k(mVar, tVar.d(), fVar);
        this.f36573n.sendMessage(this.f36573n.obtainMessage(4, new X(new n0(i10, tVar, mVar, rVar), this.f36568i.get(), fVar)));
    }

    /* access modifiers changed from: package-private */
    public final void E(C6618p pVar, int i10, long j10, int i11) {
        this.f36573n.sendMessage(this.f36573n.obtainMessage(18, new U(pVar, i10, j10, i11)));
    }

    public final void F(ConnectionResult connectionResult, int i10) {
        if (!f(connectionResult, i10)) {
            Handler handler = this.f36573n;
            handler.sendMessage(handler.obtainMessage(5, i10, 0, connectionResult));
        }
    }

    public final void G() {
        Handler handler = this.f36573n;
        handler.sendMessage(handler.obtainMessage(3));
    }

    public final void H(f fVar) {
        Handler handler = this.f36573n;
        handler.sendMessage(handler.obtainMessage(7, fVar));
    }

    public final void b(C6551z zVar) {
        synchronized (f36558r) {
            try {
                if (this.f36570k != zVar) {
                    this.f36570k = zVar;
                    this.f36571l.clear();
                }
                this.f36571l.addAll(zVar.t());
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void c(C6551z zVar) {
        synchronized (f36558r) {
            try {
                if (this.f36570k == zVar) {
                    this.f36570k = null;
                    this.f36571l.clear();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final boolean e() {
        if (this.f36561b) {
            return false;
        }
        C6622u a10 = C6621t.b().a();
        if (a10 != null && !a10.F()) {
            return false;
        }
        int a11 = this.f36566g.a(this.f36564e, 203400000);
        return a11 == -1 || a11 == 0;
    }

    /* access modifiers changed from: package-private */
    @ResultIgnorabilityUnspecified
    public final boolean f(ConnectionResult connectionResult, int i10) {
        return this.f36565f.x(this.f36564e, connectionResult, i10);
    }

    public final boolean handleMessage(Message message) {
        int i10 = message.what;
        long j10 = 300000;
        I i11 = null;
        switch (i10) {
            case 1:
                if (true == ((Boolean) message.obj).booleanValue()) {
                    j10 = 10000;
                }
                this.f36560a = j10;
                this.f36573n.removeMessages(12);
                for (C6528b obtainMessage : this.f36569j.keySet()) {
                    Handler handler = this.f36573n;
                    handler.sendMessageDelayed(handler.obtainMessage(12, obtainMessage), this.f36560a);
                }
                break;
            case 2:
                q0 q0Var = (q0) message.obj;
                Iterator it = q0Var.a().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    } else {
                        C6528b bVar = (C6528b) it.next();
                        I i12 = (I) this.f36569j.get(bVar);
                        if (i12 == null) {
                            q0Var.b(bVar, new ConnectionResult(13), (String) null);
                            break;
                        } else if (i12.N()) {
                            q0Var.b(bVar, ConnectionResult.f47963e, i12.t().d());
                        } else {
                            ConnectionResult r10 = i12.r();
                            if (r10 != null) {
                                q0Var.b(bVar, r10, (String) null);
                            } else {
                                i12.H(q0Var);
                                i12.C();
                            }
                        }
                    }
                }
            case 3:
                for (I i13 : this.f36569j.values()) {
                    i13.B();
                    i13.C();
                }
                break;
            case 4:
            case 8:
            case 13:
                X x10 = (X) message.obj;
                I i14 = (I) this.f36569j.get(x10.f36540c.t());
                if (i14 == null) {
                    i14 = h(x10.f36540c);
                }
                if (i14.a() && this.f36568i.get() != x10.f36539b) {
                    x10.f36538a.a(f36556p);
                    i14.J();
                    break;
                } else {
                    i14.D(x10.f36538a);
                    break;
                }
            case 5:
                int i15 = message.arg1;
                ConnectionResult connectionResult = (ConnectionResult) message.obj;
                Iterator it2 = this.f36569j.values().iterator();
                while (true) {
                    if (it2.hasNext()) {
                        I i16 = (I) it2.next();
                        if (i16.p() == i15) {
                            i11 = i16;
                        }
                    }
                }
                if (i11 != null) {
                    if (connectionResult.x() != 13) {
                        i11.e(g(i11.f36500i, connectionResult));
                        break;
                    } else {
                        String e10 = this.f36565f.e(connectionResult.x());
                        String B10 = connectionResult.B();
                        i11.e(new Status(17, "Error resolution was canceled by the user, original error message: " + e10 + ": " + B10));
                        break;
                    }
                } else {
                    Log.wtf("GoogleApiManager", "Could not find API instance " + i15 + " while trying to fail enqueued calls.", new Exception());
                    break;
                }
            case 6:
                if (this.f36564e.getApplicationContext() instanceof Application) {
                    C6529c.c((Application) this.f36564e.getApplicationContext());
                    C6529c.b().a(new D(this));
                    if (!C6529c.b().e(true)) {
                        this.f36560a = 300000;
                        break;
                    }
                }
                break;
            case 7:
                h((f) message.obj);
                break;
            case 9:
                if (this.f36569j.containsKey(message.obj)) {
                    ((I) this.f36569j.get(message.obj)).I();
                    break;
                }
                break;
            case 10:
                for (C6528b remove : this.f36572m) {
                    I i17 = (I) this.f36569j.remove(remove);
                    if (i17 != null) {
                        i17.J();
                    }
                }
                this.f36572m.clear();
                break;
            case 11:
                if (this.f36569j.containsKey(message.obj)) {
                    ((I) this.f36569j.get(message.obj)).K();
                    break;
                }
                break;
            case 12:
                if (this.f36569j.containsKey(message.obj)) {
                    ((I) this.f36569j.get(message.obj)).b();
                    break;
                }
                break;
            case 14:
                A a10 = (A) message.obj;
                C6528b a11 = a10.a();
                if (this.f36569j.containsKey(a11)) {
                    a10.b().c(Boolean.valueOf(((I) this.f36569j.get(a11)).o(false)));
                    break;
                } else {
                    a10.b().c(Boolean.FALSE);
                    break;
                }
            case 15:
                K k10 = (K) message.obj;
                if (this.f36569j.containsKey(k10.f36511a)) {
                    I.z((I) this.f36569j.get(k10.f36511a), k10);
                    break;
                }
                break;
            case 16:
                K k11 = (K) message.obj;
                if (this.f36569j.containsKey(k11.f36511a)) {
                    I.A((I) this.f36569j.get(k11.f36511a), k11);
                    break;
                }
                break;
            case 17:
                j();
                break;
            case 18:
                U u10 = (U) message.obj;
                if (u10.f36533c != 0) {
                    C6624w wVar = this.f36562c;
                    if (wVar != null) {
                        List B11 = wVar.B();
                        if (wVar.x() != u10.f36532b || (B11 != null && B11.size() >= u10.f36534d)) {
                            this.f36573n.removeMessages(17);
                            j();
                        } else {
                            this.f36562c.F(u10.f36531a);
                        }
                    }
                    if (this.f36562c == null) {
                        ArrayList arrayList = new ArrayList();
                        arrayList.add(u10.f36531a);
                        this.f36562c = new C6624w(u10.f36532b, arrayList);
                        Handler handler2 = this.f36573n;
                        handler2.sendMessageDelayed(handler2.obtainMessage(17), u10.f36533c);
                        break;
                    }
                } else {
                    i().g(new C6624w(u10.f36532b, Arrays.asList(new C6618p[]{u10.f36531a})));
                    break;
                }
                break;
            case 19:
                this.f36561b = false;
                break;
            default:
                Log.w("GoogleApiManager", "Unknown message id: " + i10);
                return false;
        }
        return true;
    }

    public final int l() {
        return this.f36567h.getAndIncrement();
    }

    /* access modifiers changed from: package-private */
    public final I t(C6528b bVar) {
        return (I) this.f36569j.get(bVar);
    }

    public final C8971l w(f fVar, C6540n nVar, C6547v vVar, Runnable runnable) {
        C8972m mVar = new C8972m();
        k(mVar, nVar.e(), fVar);
        this.f36573n.sendMessage(this.f36573n.obtainMessage(8, new X(new m0(new Y(nVar, vVar, runnable), mVar), this.f36568i.get(), fVar)));
        return mVar.a();
    }

    public final C8971l x(f fVar, C6536j.a aVar, int i10) {
        C8972m mVar = new C8972m();
        k(mVar, i10, fVar);
        this.f36573n.sendMessage(this.f36573n.obtainMessage(13, new X(new o0(aVar, mVar), this.f36568i.get(), fVar)));
        return mVar.a();
    }
}
