package gt;

import Il.a;
import XH.t;
import am.h;
import com.ingka.ikea.instore.datalayer.storeevents.network.model.RegistrationRemote;
import jt.C11453a;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\rR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lgt/b;", "Lgt/a;", "Lam/h;", "timeProvider", "LIl/a;", "appConfigApi", "<init>", "(Lam/h;LIl/a;)V", "Ljt/a;", "registrationRequest", "Lcom/ingka/ikea/instore/datalayer/storeevents/network/model/RegistrationRemote;", "a", "(Ljt/a;)Lcom/ingka/ikea/instore/datalayer/storeevents/network/model/RegistrationRemote;", "Lam/h;", "b", "LIl/a;", "datalayer-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: gt.b  reason: case insensitive filesystem */
public final class C11354b implements C11353a {

    /* renamed from: a  reason: collision with root package name */
    private final h f97981a;

    /* renamed from: b  reason: collision with root package name */
    private final a f97982b;

    public C11354b(h hVar, a aVar) {
        C17542s.j(hVar, "timeProvider");
        C17542s.j(aVar, "appConfigApi");
        this.f97981a = hVar;
        this.f97982b = aVar;
    }

    public RegistrationRemote a(C11453a aVar) {
        C17542s.j(aVar, "registrationRequest");
        if (aVar instanceof C11453a.c) {
            return C11355c.b((C11453a.c) aVar, C11355c.c(this.f97981a.a()), this.f97982b.a());
        }
        if (aVar instanceof C11453a.C2232a) {
            return C11355c.a((C11453a.C2232a) aVar, this.f97982b.a(), C11355c.c(this.f97981a.a()));
        }
        if (aVar instanceof C11453a.b) {
            return C11355c.d((C11453a.b) aVar, this.f97982b.a(), C11355c.c(this.f97981a.a()));
        }
        throw new t();
    }
}
