package m5;

import QJ.F0;
import android.content.Context;
import android.text.TextUtils;
import androidx.work.C7034c;
import androidx.work.C7036e;
import androidx.work.C7055y;
import androidx.work.L;
import androidx.work.Q;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.concurrent.CancellationException;
import l5.C8510f;
import l5.C8523t;
import l5.C8525v;
import l5.C8528y;
import l5.K;
import l5.z;
import o5.C8601b;
import o5.C8604e;
import o5.C8605f;
import o5.C8606g;
import q5.n;
import s5.C8731m;
import s5.C8739u;
import t5.C8793D;
import u5.C8878b;

/* renamed from: m5.b  reason: case insensitive filesystem */
public class C8550b implements C8525v, C8604e, C8510f {

    /* renamed from: o  reason: collision with root package name */
    private static final String f54979o = C7055y.i("GreedyScheduler");

    /* renamed from: a  reason: collision with root package name */
    private final Context f54980a;

    /* renamed from: b  reason: collision with root package name */
    private final Map<C8731m, F0> f54981b = new HashMap();

    /* renamed from: c  reason: collision with root package name */
    private C8549a f54982c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f54983d;

    /* renamed from: e  reason: collision with root package name */
    private final Object f54984e = new Object();

    /* renamed from: f  reason: collision with root package name */
    private final z f54985f = z.a();

    /* renamed from: g  reason: collision with root package name */
    private final C8523t f54986g;

    /* renamed from: h  reason: collision with root package name */
    private final K f54987h;

    /* renamed from: i  reason: collision with root package name */
    private final C7034c f54988i;

    /* renamed from: j  reason: collision with root package name */
    private final Map<C8731m, C0876b> f54989j = new HashMap();

    /* renamed from: k  reason: collision with root package name */
    Boolean f54990k;

    /* renamed from: l  reason: collision with root package name */
    private final C8605f f54991l;

    /* renamed from: m  reason: collision with root package name */
    private final C8878b f54992m;

    /* renamed from: n  reason: collision with root package name */
    private final C8552d f54993n;

    /* renamed from: m5.b$b  reason: collision with other inner class name */
    private static class C0876b {

        /* renamed from: a  reason: collision with root package name */
        final int f54994a;

        /* renamed from: b  reason: collision with root package name */
        final long f54995b;

        private C0876b(int i10, long j10) {
            this.f54994a = i10;
            this.f54995b = j10;
        }
    }

    public C8550b(Context context, C7034c cVar, n nVar, C8523t tVar, K k10, C8878b bVar) {
        this.f54980a = context;
        L k11 = cVar.k();
        this.f54982c = new C8549a(this, k11, cVar.a());
        this.f54993n = new C8552d(k11, k10);
        this.f54992m = bVar;
        this.f54991l = new C8605f(nVar);
        this.f54988i = cVar;
        this.f54986g = tVar;
        this.f54987h = k10;
    }

    private void f() {
        this.f54990k = Boolean.valueOf(C8793D.b(this.f54980a, this.f54988i));
    }

    private void g() {
        if (!this.f54983d) {
            this.f54986g.e(this);
            this.f54983d = true;
        }
    }

    private void h(C8731m mVar) {
        F0 remove;
        synchronized (this.f54984e) {
            remove = this.f54981b.remove(mVar);
        }
        if (remove != null) {
            C7055y e10 = C7055y.e();
            String str = f54979o;
            e10.a(str, "Stopping tracking for " + mVar);
            remove.i((CancellationException) null);
        }
    }

    private long i(C8739u uVar) {
        long max;
        synchronized (this.f54984e) {
            try {
                C8731m a10 = s5.z.a(uVar);
                C0876b bVar = this.f54989j.get(a10);
                if (bVar == null) {
                    bVar = new C0876b(uVar.f55920k, this.f54988i.a().a());
                    this.f54989j.put(a10, bVar);
                }
                max = bVar.f54995b + (((long) Math.max((uVar.f55920k - bVar.f54994a) - 5, 0)) * 30000);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return max;
    }

    public void a(String str) {
        if (this.f54990k == null) {
            f();
        }
        if (!this.f54990k.booleanValue()) {
            C7055y.e().f(f54979o, "Ignoring schedule request in non-main process");
            return;
        }
        g();
        C7055y e10 = C7055y.e();
        String str2 = f54979o;
        e10.a(str2, "Cancelling work ID " + str);
        C8549a aVar = this.f54982c;
        if (aVar != null) {
            aVar.b(str);
        }
        for (C8528y next : this.f54985f.remove(str)) {
            this.f54993n.b(next);
            this.f54987h.b(next);
        }
    }

    public void b(C8731m mVar, boolean z10) {
        C8528y f10 = this.f54985f.f(mVar);
        if (f10 != null) {
            this.f54993n.b(f10);
        }
        h(mVar);
        if (!z10) {
            synchronized (this.f54984e) {
                this.f54989j.remove(mVar);
            }
        }
    }

    public void c(C8739u... uVarArr) {
        if (this.f54990k == null) {
            f();
        }
        if (!this.f54990k.booleanValue()) {
            C7055y.e().f(f54979o, "Ignoring schedule request in a secondary process");
            return;
        }
        g();
        HashSet<C8739u> hashSet = new HashSet<>();
        HashSet hashSet2 = new HashSet();
        for (C8739u uVar : uVarArr) {
            if (!this.f54985f.b(s5.z.a(uVar))) {
                long max = Math.max(uVar.c(), i(uVar));
                long a10 = this.f54988i.a().a();
                if (uVar.f55911b == Q.c.ENQUEUED) {
                    if (a10 < max) {
                        C8549a aVar = this.f54982c;
                        if (aVar != null) {
                            aVar.a(uVar, max);
                        }
                    } else if (uVar.l()) {
                        C7036e eVar = uVar.f55919j;
                        if (eVar.j()) {
                            C7055y.e().a(f54979o, "Ignoring " + uVar + ". Requires device idle.");
                        } else if (eVar.g()) {
                            C7055y.e().a(f54979o, "Ignoring " + uVar + ". Requires ContentUri triggers.");
                        } else {
                            hashSet.add(uVar);
                            hashSet2.add(uVar.f55910a);
                        }
                    } else if (!this.f54985f.b(s5.z.a(uVar))) {
                        C7055y.e().a(f54979o, "Starting work for " + uVar.f55910a);
                        C8528y c10 = this.f54985f.c(uVar);
                        this.f54993n.c(c10);
                        this.f54987h.e(c10);
                    }
                }
            }
        }
        synchronized (this.f54984e) {
            try {
                if (!hashSet.isEmpty()) {
                    String join = TextUtils.join(",", hashSet2);
                    C7055y.e().a(f54979o, "Starting tracking for " + join);
                    for (C8739u uVar2 : hashSet) {
                        C8731m a11 = s5.z.a(uVar2);
                        if (!this.f54981b.containsKey(a11)) {
                            this.f54981b.put(a11, C8606g.d(this.f54991l, uVar2, this.f54992m.b(), this));
                        }
                    }
                }
            } finally {
            }
        }
    }

    public void d(C8739u uVar, C8601b bVar) {
        C8731m a10 = s5.z.a(uVar);
        if (!(bVar instanceof C8601b.a)) {
            C7055y e10 = C7055y.e();
            String str = f54979o;
            e10.a(str, "Constraints not met: Cancelling work ID " + a10);
            C8528y f10 = this.f54985f.f(a10);
            if (f10 != null) {
                this.f54993n.b(f10);
                this.f54987h.a(f10, ((C8601b.C0881b) bVar).a());
            }
        } else if (!this.f54985f.b(a10)) {
            C7055y e11 = C7055y.e();
            String str2 = f54979o;
            e11.a(str2, "Constraints met: Scheduling work ID " + a10);
            C8528y d10 = this.f54985f.d(a10);
            this.f54993n.c(d10);
            this.f54987h.e(d10);
        }
    }

    public boolean e() {
        return false;
    }
}
