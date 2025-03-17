package androidx.work.impl.background.systemalarm;

import android.content.Context;
import android.content.Intent;
import android.os.Looper;
import android.os.PowerManager;
import android.text.TextUtils;
import androidx.work.C7055y;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import l5.C8510f;
import l5.C8523t;
import l5.K;
import l5.M;
import l5.O;
import l5.z;
import s5.C8731m;
import t5.C8797H;
import t5.C8804O;
import u5.C8877a;
import u5.C8878b;

public class g implements C8510f {

    /* renamed from: l  reason: collision with root package name */
    static final String f45253l = C7055y.i("SystemAlarmDispatcher");

    /* renamed from: a  reason: collision with root package name */
    final Context f45254a;

    /* renamed from: b  reason: collision with root package name */
    final C8878b f45255b;

    /* renamed from: c  reason: collision with root package name */
    private final C8804O f45256c;

    /* renamed from: d  reason: collision with root package name */
    private final C8523t f45257d;

    /* renamed from: e  reason: collision with root package name */
    private final O f45258e;

    /* renamed from: f  reason: collision with root package name */
    final b f45259f;

    /* renamed from: g  reason: collision with root package name */
    final List<Intent> f45260g;

    /* renamed from: h  reason: collision with root package name */
    Intent f45261h;

    /* renamed from: i  reason: collision with root package name */
    private c f45262i;

    /* renamed from: j  reason: collision with root package name */
    private z f45263j;

    /* renamed from: k  reason: collision with root package name */
    private final K f45264k;

    class a implements Runnable {
        a() {
        }

        public void run() {
            Executor a10;
            d dVar;
            synchronized (g.this.f45260g) {
                g gVar = g.this;
                gVar.f45261h = gVar.f45260g.get(0);
            }
            Intent intent = g.this.f45261h;
            if (intent != null) {
                String action = intent.getAction();
                int intExtra = g.this.f45261h.getIntExtra("KEY_START_ID", 0);
                C7055y e10 = C7055y.e();
                String str = g.f45253l;
                e10.a(str, "Processing command " + g.this.f45261h + ", " + intExtra);
                Context context = g.this.f45254a;
                PowerManager.WakeLock b10 = C8797H.b(context, action + " (" + intExtra + ")");
                try {
                    C7055y e11 = C7055y.e();
                    e11.a(str, "Acquiring operation wake lock (" + action + ") " + b10);
                    b10.acquire();
                    g gVar2 = g.this;
                    gVar2.f45259f.o(gVar2.f45261h, intExtra, gVar2);
                    C7055y e12 = C7055y.e();
                    e12.a(str, "Releasing operation wake lock (" + action + ") " + b10);
                    b10.release();
                    a10 = g.this.f45255b.a();
                    dVar = new d(g.this);
                } catch (Throwable th2) {
                    C7055y e13 = C7055y.e();
                    String str2 = g.f45253l;
                    e13.a(str2, "Releasing operation wake lock (" + action + ") " + b10);
                    b10.release();
                    g.this.f45255b.a().execute(new d(g.this));
                    throw th2;
                }
                a10.execute(dVar);
            }
        }
    }

    static class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        private final g f45266a;

        /* renamed from: b  reason: collision with root package name */
        private final Intent f45267b;

        /* renamed from: c  reason: collision with root package name */
        private final int f45268c;

        b(g gVar, Intent intent, int i10) {
            this.f45266a = gVar;
            this.f45267b = intent;
            this.f45268c = i10;
        }

        public void run() {
            this.f45266a.a(this.f45267b, this.f45268c);
        }
    }

    interface c {
        void b();
    }

    static class d implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        private final g f45269a;

        d(g gVar) {
            this.f45269a = gVar;
        }

        public void run() {
            this.f45269a.d();
        }
    }

    g(Context context) {
        this(context, (C8523t) null, (O) null, (K) null);
    }

    private void c() {
        if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
            throw new IllegalStateException("Needs to be invoked on the main thread.");
        }
    }

    private boolean j(String str) {
        c();
        synchronized (this.f45260g) {
            try {
                for (Intent action : this.f45260g) {
                    if (str.equals(action.getAction())) {
                        return true;
                    }
                }
                return false;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private void l() {
        c();
        PowerManager.WakeLock b10 = C8797H.b(this.f45254a, "ProcessCommand");
        try {
            b10.acquire();
            this.f45258e.x().d(new a());
        } finally {
            b10.release();
        }
    }

    public boolean a(Intent intent, int i10) {
        C7055y e10 = C7055y.e();
        String str = f45253l;
        e10.a(str, "Adding command " + intent + " (" + i10 + ")");
        c();
        String action = intent.getAction();
        if (TextUtils.isEmpty(action)) {
            C7055y.e().k(str, "Unknown command. Ignoring");
            return false;
        } else if ("ACTION_CONSTRAINTS_CHANGED".equals(action) && j("ACTION_CONSTRAINTS_CHANGED")) {
            return false;
        } else {
            intent.putExtra("KEY_START_ID", i10);
            synchronized (this.f45260g) {
                try {
                    boolean isEmpty = this.f45260g.isEmpty();
                    this.f45260g.add(intent);
                    if (isEmpty) {
                        l();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return true;
        }
    }

    public void b(C8731m mVar, boolean z10) {
        this.f45255b.a().execute(new b(this, b.d(this.f45254a, mVar, z10), 0));
    }

    /* access modifiers changed from: package-private */
    public void d() {
        C7055y e10 = C7055y.e();
        String str = f45253l;
        e10.a(str, "Checking if commands are complete.");
        c();
        synchronized (this.f45260g) {
            try {
                if (this.f45261h != null) {
                    C7055y e11 = C7055y.e();
                    e11.a(str, "Removing command " + this.f45261h);
                    if (this.f45260g.remove(0).equals(this.f45261h)) {
                        this.f45261h = null;
                    } else {
                        throw new IllegalStateException("Dequeue-d command is not the first.");
                    }
                }
                C8877a c10 = this.f45255b.c();
                if (!this.f45259f.n() && this.f45260g.isEmpty() && !c10.l0()) {
                    C7055y.e().a(str, "No more commands & intents.");
                    c cVar = this.f45262i;
                    if (cVar != null) {
                        cVar.b();
                    }
                } else if (!this.f45260g.isEmpty()) {
                    l();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* access modifiers changed from: package-private */
    public C8523t e() {
        return this.f45257d;
    }

    /* access modifiers changed from: package-private */
    public C8878b f() {
        return this.f45255b;
    }

    /* access modifiers changed from: package-private */
    public O g() {
        return this.f45258e;
    }

    /* access modifiers changed from: package-private */
    public C8804O h() {
        return this.f45256c;
    }

    /* access modifiers changed from: package-private */
    public K i() {
        return this.f45264k;
    }

    /* access modifiers changed from: package-private */
    public void k() {
        C7055y.e().a(f45253l, "Destroying SystemAlarmDispatcher");
        this.f45257d.p(this);
        this.f45262i = null;
    }

    /* access modifiers changed from: package-private */
    public void m(c cVar) {
        if (this.f45262i != null) {
            C7055y.e().c(f45253l, "A completion listener for SystemAlarmDispatcher already exists.");
        } else {
            this.f45262i = cVar;
        }
    }

    g(Context context, C8523t tVar, O o10, K k10) {
        Context applicationContext = context.getApplicationContext();
        this.f45254a = applicationContext;
        this.f45263j = z.a();
        o10 = o10 == null ? O.r(context) : o10;
        this.f45258e = o10;
        this.f45259f = new b(applicationContext, o10.p().a(), this.f45263j);
        this.f45256c = new C8804O(o10.p().k());
        tVar = tVar == null ? o10.t() : tVar;
        this.f45257d = tVar;
        C8878b x10 = o10.x();
        this.f45255b = x10;
        this.f45264k = k10 == null ? new M(tVar, x10) : k10;
        tVar.e(this);
        this.f45260g = new ArrayList();
        this.f45261h = null;
    }
}
