package dc;

import G9.C6521b;
import H9.C6545t;
import H9.C6546u;
import K9.C6620s;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import cc.C9450a;
import cc.C9451b;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.f;
import dc.h;
import mc.C10036b;
import xa.C8971l;
import xa.C8972m;

public class g extends C9450a {

    /* renamed from: a  reason: collision with root package name */
    private final f<a.d.c> f72382a;

    /* renamed from: b  reason: collision with root package name */
    private final C10036b<Ib.a> f72383b;

    /* renamed from: c  reason: collision with root package name */
    private final Fb.f f72384c;

    static class a extends h.a {
        a() {
        }

        public void f3(Status status, j jVar) {
            throw new UnsupportedOperationException();
        }
    }

    static class b extends a {

        /* renamed from: a  reason: collision with root package name */
        private final C8972m<C9451b> f72385a;

        /* renamed from: b  reason: collision with root package name */
        private final C10036b<Ib.a> f72386b;

        public b(C10036b<Ib.a> bVar, C8972m<C9451b> mVar) {
            this.f72386b = bVar;
            this.f72385a = mVar;
        }

        public void l3(Status status, C9615a aVar) {
            Bundle bundle;
            Ib.a aVar2;
            C6546u.a(status, aVar == null ? null : new C9451b(aVar), this.f72385a);
            if (aVar != null && (bundle = aVar.J().getBundle("scionData")) != null && bundle.keySet() != null && (aVar2 = this.f72386b.get()) != null) {
                for (String next : bundle.keySet()) {
                    aVar2.c("fdl", next, bundle.getBundle(next));
                }
            }
        }
    }

    static final class c extends C6545t<e, C9451b> {

        /* renamed from: d  reason: collision with root package name */
        private final String f72387d;

        /* renamed from: e  reason: collision with root package name */
        private final C10036b<Ib.a> f72388e;

        c(C10036b<Ib.a> bVar, String str) {
            super((C6521b[]) null, false, 13201);
            this.f72387d = str;
            this.f72388e = bVar;
        }

        /* access modifiers changed from: protected */
        /* renamed from: f */
        public void b(e eVar, C8972m<C9451b> mVar) {
            eVar.n0(new b(this.f72388e, mVar), this.f72387d);
        }
    }

    public g(Fb.f fVar, C10036b<Ib.a> bVar) {
        this(new C9618d(fVar.k()), fVar, bVar);
    }

    public C8971l<C9451b> a(Uri uri) {
        return this.f72382a.r(new c(this.f72383b, uri.toString()));
    }

    public g(f<a.d.c> fVar, Fb.f fVar2, C10036b<Ib.a> bVar) {
        this.f72382a = fVar;
        this.f72384c = (Fb.f) C6620s.l(fVar2);
        this.f72383b = bVar;
        if (bVar.get() == null) {
            Log.w("FDL", "FDL logging failed. Add a dependency for Firebase Analytics to your app to enable logging of Dynamic Link events.");
        }
    }
}
