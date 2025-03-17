package androidx.camera.view;

import G.p;
import H2.d;
import I.n;
import androidx.concurrent.futures.c;
import java.util.Objects;
import ob.C10101e;
import q.C5759a;

class h<T> {

    /* renamed from: a  reason: collision with root package name */
    private d<c.a<Void>, T> f17177a;

    h() {
    }

    /* access modifiers changed from: private */
    public /* synthetic */ Object b(Object obj, c.a aVar) {
        d<c.a<Void>, T> dVar = this.f17177a;
        if (dVar != null) {
            c.a aVar2 = (c.a) dVar.f7052a;
            Objects.requireNonNull(aVar2);
            aVar2.d();
        }
        this.f17177a = new d<>(aVar, obj);
        return "PendingValue " + obj;
    }

    /* access modifiers changed from: package-private */
    public void c(C5759a<T, C10101e<Void>> aVar) {
        p.a();
        d<c.a<Void>, T> dVar = this.f17177a;
        if (dVar != null) {
            c.a aVar2 = (c.a) this.f17177a.f7052a;
            Objects.requireNonNull(aVar2);
            n.C(aVar.apply(dVar.f7053b), aVar2);
            this.f17177a = null;
        }
    }

    /* access modifiers changed from: package-private */
    public C10101e<Void> d(T t10) {
        p.a();
        return c.a(new g(this, t10));
    }
}
