package G3;

import G3.C6479C;
import J3.C6569b;
import J3.j;
import q3.w;
import t3.C5950a;
import w3.C;

/* renamed from: G3.u  reason: case insensitive filesystem */
public final class C6500u extends C6481a {

    /* renamed from: h  reason: collision with root package name */
    private final C6498s f35988h;

    /* renamed from: i  reason: collision with root package name */
    private final long f35989i;

    /* renamed from: j  reason: collision with root package name */
    private w f35990j;

    /* renamed from: G3.u$b */
    public static final class b implements C6479C.a {

        /* renamed from: c  reason: collision with root package name */
        private final long f35991c;

        /* renamed from: d  reason: collision with root package name */
        private final C6498s f35992d;

        public b(long j10, C6498s sVar) {
            this.f35991c = j10;
            this.f35992d = sVar;
        }

        /* renamed from: a */
        public C6500u d(w wVar) {
            return new C6500u(wVar, this.f35991c, this.f35992d);
        }

        public C6479C.a c(j jVar) {
            return this;
        }

        public C6479C.a f(C3.w wVar) {
            return this;
        }
    }

    /* access modifiers changed from: protected */
    public void A() {
    }

    public C6478B a(C6479C.b bVar, C6569b bVar2, long j10) {
        w e10 = e();
        C5950a.e(e10.f28319b);
        C5950a.f(e10.f28319b.f28412b, "Externally loaded mediaItems require a MIME type.");
        w.h hVar = e10.f28319b;
        return new C6499t(hVar.f28411a, hVar.f28412b, this.f35988h);
    }

    public synchronized w e() {
        return this.f35990j;
    }

    public void j() {
    }

    public synchronized void l(w wVar) {
        this.f35990j = wVar;
    }

    public void o(C6478B b10) {
        ((C6499t) b10).n();
    }

    /* access modifiers changed from: protected */
    public void y(C c10) {
        z(new d0(this.f35989i, true, false, false, (Object) null, e()));
    }

    private C6500u(w wVar, long j10, C6498s sVar) {
        this.f35990j = wVar;
        this.f35989i = j10;
        this.f35988h = sVar;
    }
}
