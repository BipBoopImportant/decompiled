package Ve;

import L6.b;
import M6.A;
import M6.t;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J-\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\n\"\b\b\u0000\u0010\u0007*\u00020\u00062\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ-\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\n\"\b\b\u0000\u0010\u0007*\u00020\u00062\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0011¨\u0006\u0012"}, d2 = {"LVe/a;", "LVe/b;", "LL6/b;", "apolloClient", "<init>", "(LL6/b;)V", "", "D", "LM6/t;", "mutation", "LL6/a;", "a", "(LM6/t;)LL6/a;", "LM6/A;", "query", "b", "(LM6/A;)LL6/a;", "LL6/b;", "apollo_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class a implements b {

    /* renamed from: a  reason: collision with root package name */
    private final b f64518a;

    public a(b bVar) {
        C17542s.j(bVar, "apolloClient");
        this.f64518a = bVar;
    }

    public <D> L6.a<D> a(t<D> tVar) {
        C17542s.j(tVar, "mutation");
        return this.f64518a.l(tVar);
    }

    public <D> L6.a<D> b(A<D> a10) {
        C17542s.j(a10, "query");
        return this.f64518a.n(a10);
    }
}
