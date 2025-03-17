package eD;

import QL.C16361d;
import QL.f;
import QL.x;
import androidx.lifecycle.K;
import com.ingka.ikea.useraccount.impl.network.RemoteRedirectUrl;
import ip.k;
import kD.l;
import kD.n;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0007\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B!\u0012\u0018\u0010\u0007\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00040\u0003¢\u0006\u0004\b\b\u0010\tJ+\u0010\u000f\u001a\u00020\u000e2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00020\n2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J%\u0010\u0013\u001a\u00020\u000e2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00020\n2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R)\u0010\u0007\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00040\u00038\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"LeD/w;", "LQL/f;", "Lcom/ingka/ikea/useraccount/impl/network/RemoteRedirectUrl;", "Landroidx/lifecycle/K;", "Lip/k;", "", "LkD/l;", "result", "<init>", "(Landroidx/lifecycle/K;)V", "LQL/d;", "call", "LQL/x;", "response", "LXH/N;", "b", "(LQL/d;LQL/x;)V", "", "t", "a", "(LQL/d;Ljava/lang/Throwable;)V", "Landroidx/lifecycle/K;", "getResult", "()Landroidx/lifecycle/K;", "useraccount-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class w implements f<RemoteRedirectUrl> {

    /* renamed from: a  reason: collision with root package name */
    private final K<k<String, l>> f126609a;

    public w(K<k<String, l>> k10) {
        C17542s.j(k10, "result");
        this.f126609a = k10;
    }

    public void a(C16361d<RemoteRedirectUrl> dVar, Throwable th2) {
        C17542s.j(dVar, "call");
        C17542s.j(th2, "t");
        this.f126609a.postValue(k.a.b(k.f98528e, (String) null, new n("No message", th2), (Object) null, 5, (Object) null));
    }

    public void b(C16361d<RemoteRedirectUrl> dVar, x<RemoteRedirectUrl> xVar) {
        k kVar;
        String a10;
        C17542s.j(dVar, "call");
        C17542s.j(xVar, "response");
        K<k<String, l>> k10 = this.f126609a;
        if (xVar.e()) {
            RemoteRedirectUrl a11 = xVar.a();
            if (a11 == null || (a10 = a11.a()) == null || (kVar = k.f98528e.g(a10)) == null) {
                kVar = k.a.b(k.f98528e, (String) null, new n("No message", (Throwable) null), (Object) null, 5, (Object) null);
            }
        } else {
            kVar = k.a.b(k.f98528e, (String) null, new n("No message", (Throwable) null), (Object) null, 5, (Object) null);
        }
        k10.postValue(kVar);
    }
}
