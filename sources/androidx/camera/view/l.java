package androidx.camera.view;

import C.C4391e0;
import C.C4408p;
import I.c;
import I.d;
import I.n;
import androidx.camera.core.impl.C5040p;
import androidx.camera.core.impl.C5059z;
import androidx.camera.core.impl.H0;
import androidx.camera.core.impl.I;
import androidx.camera.core.impl.J;
import androidx.camera.view.PreviewView;
import androidx.concurrent.futures.c;
import androidx.lifecycle.K;
import java.util.ArrayList;
import java.util.List;
import ob.C10101e;

final class l implements H0.a<J.a> {

    /* renamed from: a  reason: collision with root package name */
    private final I f17184a;

    /* renamed from: b  reason: collision with root package name */
    private final K<PreviewView.e> f17185b;

    /* renamed from: c  reason: collision with root package name */
    private PreviewView.e f17186c;

    /* renamed from: d  reason: collision with root package name */
    private final q f17187d;

    /* renamed from: e  reason: collision with root package name */
    C10101e<Void> f17188e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f17189f = false;

    class a implements c<Void> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ List f17190a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ C4408p f17191b;

        a(List list, C4408p pVar) {
            this.f17190a = list;
            this.f17191b = pVar;
        }

        public void b(Throwable th2) {
            l.this.f17188e = null;
            if (!this.f17190a.isEmpty()) {
                for (C5040p j10 : this.f17190a) {
                    ((I) this.f17191b).j(j10);
                }
                this.f17190a.clear();
            }
        }

        /* renamed from: c */
        public void a(Void voidR) {
            l.this.f17188e = null;
        }
    }

    class b extends C5040p {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c.a f17193a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ C4408p f17194b;

        b(c.a aVar, C4408p pVar) {
            this.f17193a = aVar;
            this.f17194b = pVar;
        }

        public void b(int i10, C5059z zVar) {
            this.f17193a.c(null);
            ((I) this.f17194b).j(this);
        }
    }

    l(I i10, K<PreviewView.e> k10, q qVar) {
        this.f17184a = i10;
        this.f17185b = k10;
        this.f17187d = qVar;
        synchronized (this) {
            this.f17186c = k10.getValue();
        }
    }

    private void e() {
        C10101e<Void> eVar = this.f17188e;
        if (eVar != null) {
            eVar.cancel(false);
            this.f17188e = null;
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ C10101e g(Void voidR) {
        return this.f17187d.i();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ Void h(Void voidR) {
        l(PreviewView.e.STREAMING);
        return null;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ Object i(C4408p pVar, List list, c.a aVar) {
        b bVar = new b(aVar, pVar);
        list.add(bVar);
        ((I) pVar).e(H.a.a(), bVar);
        return "waitForCaptureResult";
    }

    private void k(C4408p pVar) {
        l(PreviewView.e.IDLE);
        ArrayList arrayList = new ArrayList();
        d<T> e10 = d.b(m(pVar, arrayList)).f(new i(this), H.a.a()).e(new j(this), H.a.a());
        this.f17188e = e10;
        n.j(e10, new a(arrayList, pVar), H.a.a());
    }

    private C10101e<Void> m(C4408p pVar, List<C5040p> list) {
        return androidx.concurrent.futures.c.a(new k(this, pVar, list));
    }

    /* access modifiers changed from: package-private */
    public void f() {
        e();
    }

    /* renamed from: j */
    public void a(J.a aVar) {
        if (aVar == J.a.CLOSING || aVar == J.a.CLOSED || aVar == J.a.RELEASING || aVar == J.a.RELEASED) {
            l(PreviewView.e.IDLE);
            if (this.f17189f) {
                this.f17189f = false;
                e();
            }
        } else if ((aVar == J.a.OPENING || aVar == J.a.OPEN || aVar == J.a.PENDING_OPEN) && !this.f17189f) {
            k(this.f17184a);
            this.f17189f = true;
        }
    }

    /* access modifiers changed from: package-private */
    public void l(PreviewView.e eVar) {
        synchronized (this) {
            try {
                if (!this.f17186c.equals(eVar)) {
                    this.f17186c = eVar;
                    C4391e0.a("StreamStateObserver", "Update Preview stream state to " + eVar);
                    this.f17185b.postValue(eVar);
                }
            } catch (Throwable th2) {
                while (true) {
                    throw th2;
                }
            }
        }
    }

    public void onError(Throwable th2) {
        f();
        l(PreviewView.e.IDLE);
    }
}
