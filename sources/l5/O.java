package l5;

import QJ.Q;
import XH.C16807N;
import android.content.BroadcastReceiver;
import android.content.Context;
import androidx.work.B;
import androidx.work.C;
import androidx.work.C7034c;
import androidx.work.C7041j;
import androidx.work.C7042k;
import androidx.work.C7055y;
import androidx.work.I;
import androidx.work.S;
import androidx.work.T;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.j;
import androidx.work.impl.utils.ForceStopRunnable;
import java.util.Collections;
import java.util.List;
import java.util.UUID;
import n5.C8580k;
import ob.C10101e;
import q5.n;
import s5.C8731m;
import t5.C8792C;
import t5.C8795F;
import t5.C8796G;
import t5.C8809d;
import u5.C8878b;

public class O extends S {

    /* renamed from: m  reason: collision with root package name */
    private static final String f54632m = C7055y.i("WorkManagerImpl");

    /* renamed from: n  reason: collision with root package name */
    private static O f54633n = null;

    /* renamed from: o  reason: collision with root package name */
    private static O f54634o = null;

    /* renamed from: p  reason: collision with root package name */
    private static final Object f54635p = new Object();

    /* renamed from: b  reason: collision with root package name */
    private Context f54636b;

    /* renamed from: c  reason: collision with root package name */
    private C7034c f54637c;

    /* renamed from: d  reason: collision with root package name */
    private WorkDatabase f54638d;

    /* renamed from: e  reason: collision with root package name */
    private C8878b f54639e;

    /* renamed from: f  reason: collision with root package name */
    private List<C8525v> f54640f;

    /* renamed from: g  reason: collision with root package name */
    private C8523t f54641g;

    /* renamed from: h  reason: collision with root package name */
    private C8792C f54642h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f54643i = false;

    /* renamed from: j  reason: collision with root package name */
    private BroadcastReceiver.PendingResult f54644j;

    /* renamed from: k  reason: collision with root package name */
    private final n f54645k;

    /* renamed from: l  reason: collision with root package name */
    private final Q f54646l;

    static class a {
        static boolean a(Context context) {
            return context.isDeviceProtectedStorage();
        }
    }

    public O(Context context, C7034c cVar, C8878b bVar, WorkDatabase workDatabase, List<C8525v> list, C8523t tVar, n nVar) {
        Context applicationContext = context.getApplicationContext();
        if (!a.a(applicationContext)) {
            C7055y.h(new C7055y.a(cVar.j()));
            this.f54636b = applicationContext;
            this.f54639e = bVar;
            this.f54638d = workDatabase;
            this.f54641g = tVar;
            this.f54645k = nVar;
            this.f54637c = cVar;
            this.f54640f = list;
            Q f10 = j.f(bVar);
            this.f54646l = f10;
            this.f54642h = new C8792C(this.f54638d);
            androidx.work.impl.a.g(list, this.f54641g, bVar.c(), this.f54638d, cVar);
            this.f54639e.d(new ForceStopRunnable(applicationContext, this));
            C8499D.c(f10, this.f54636b, cVar, workDatabase);
            return;
        }
        throw new IllegalStateException("Cannot initialize WorkManager in direct boot mode");
    }

    public static void l(Context context, C7034c cVar) {
        synchronized (f54635p) {
            try {
                O o10 = f54633n;
                if (o10 != null) {
                    if (f54634o != null) {
                        throw new IllegalStateException("WorkManager is already initialized.  Did you try to initialize it manually without disabling WorkManagerInitializer? See WorkManager#initialize(Context, Configuration) or the class level Javadoc for more information.");
                    }
                }
                if (o10 == null) {
                    Context applicationContext = context.getApplicationContext();
                    if (f54634o == null) {
                        f54634o = j.c(applicationContext, cVar);
                    }
                    f54633n = f54634o;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Deprecated
    public static O q() {
        synchronized (f54635p) {
            try {
                O o10 = f54633n;
                if (o10 != null) {
                    return o10;
                }
                O o11 = f54634o;
                return o11;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static O r(Context context) {
        O q10;
        synchronized (f54635p) {
            try {
                q10 = q();
                if (q10 == null) {
                    Context applicationContext = context.getApplicationContext();
                    if (applicationContext instanceof C7034c.C0777c) {
                        l(applicationContext, ((C7034c.C0777c) applicationContext).b());
                        q10 = r(applicationContext);
                    } else {
                        throw new IllegalStateException("WorkManager is not initialized properly.  You have explicitly disabled WorkManagerInitializer in your manifest, have not manually called WorkManager#initialize at this point, and your Application does not implement Configuration.Provider.");
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return q10;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ C16807N y() {
        C8580k.b(o());
        w().f().o();
        androidx.work.impl.a.h(p(), w(), u());
        return C16807N.f139792a;
    }

    public void A() {
        androidx.work.O.a(p().n(), "ReschedulingWork", new N(this));
    }

    public void B(BroadcastReceiver.PendingResult pendingResult) {
        synchronized (f54635p) {
            try {
                BroadcastReceiver.PendingResult pendingResult2 = this.f54644j;
                if (pendingResult2 != null) {
                    pendingResult2.finish();
                }
                this.f54644j = pendingResult;
                if (this.f54643i) {
                    pendingResult.finish();
                    this.f54644j = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void C(C8731m mVar, int i10) {
        this.f54639e.d(new C8796G(this.f54641g, new C8528y(mVar), true, i10));
    }

    public C a(String str) {
        return C8809d.i(str, this);
    }

    public C b(String str) {
        return C8809d.f(str, this);
    }

    public C c(UUID uuid) {
        return C8809d.e(uuid, this);
    }

    public C e(List<? extends T> list) {
        if (!list.isEmpty()) {
            return new C8501F(this, list).b();
        }
        throw new IllegalArgumentException("enqueue needs at least one WorkRequest.");
    }

    public C f(String str, C7041j jVar, I i10) {
        return jVar == C7041j.UPDATE ? T.c(this, str, i10) : n(str, jVar, i10).b();
    }

    public C h(String str, C7042k kVar, List<B> list) {
        return new C8501F(this, str, kVar, list).b();
    }

    public C10101e<androidx.work.Q> j(UUID uuid) {
        return C8795F.a(this.f54638d, this.f54639e, uuid);
    }

    public C10101e<List<androidx.work.Q>> k(String str) {
        return C8795F.b(this.f54638d, this.f54639e, str);
    }

    public C8501F n(String str, C7041j jVar, I i10) {
        return new C8501F(this, str, jVar == C7041j.KEEP ? C7042k.KEEP : C7042k.REPLACE, Collections.singletonList(i10));
    }

    public Context o() {
        return this.f54636b;
    }

    public C7034c p() {
        return this.f54637c;
    }

    public C8792C s() {
        return this.f54642h;
    }

    public C8523t t() {
        return this.f54641g;
    }

    public List<C8525v> u() {
        return this.f54640f;
    }

    public n v() {
        return this.f54645k;
    }

    public WorkDatabase w() {
        return this.f54638d;
    }

    public C8878b x() {
        return this.f54639e;
    }

    public void z() {
        synchronized (f54635p) {
            try {
                this.f54643i = true;
                BroadcastReceiver.PendingResult pendingResult = this.f54644j;
                if (pendingResult != null) {
                    pendingResult.finish();
                    this.f54644j = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
