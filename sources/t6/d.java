package T6;

import M6.A;
import M6.f;
import M6.g;
import M6.t;
import M6.w;
import QJ.M;
import TJ.C16532g;
import TJ.C16534i;
import W6.a;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ;\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00100\u000f\"\b\b\u0000\u0010\n*\u00020\t2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0013R\u0014\u0010\u0004\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0013R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"LT6/d;", "LT6/a;", "LW6/a;", "networkTransport", "subscriptionNetworkTransport", "LQJ/M;", "dispatcher", "<init>", "(LW6/a;LW6/a;LQJ/M;)V", "LM6/w$a;", "D", "LM6/f;", "request", "LT6/b;", "chain", "LTJ/g;", "LM6/g;", "a", "(LM6/f;LT6/b;)LTJ/g;", "LW6/a;", "b", "c", "LQJ/M;", "apollo-runtime"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class d implements a {

    /* renamed from: a  reason: collision with root package name */
    private final a f40108a;

    /* renamed from: b  reason: collision with root package name */
    private final a f40109b;

    /* renamed from: c  reason: collision with root package name */
    private final M f40110c;

    public d(a aVar, a aVar2, M m10) {
        C17542s.j(aVar, "networkTransport");
        C17542s.j(aVar2, "subscriptionNetworkTransport");
        C17542s.j(m10, "dispatcher");
        this.f40108a = aVar;
        this.f40109b = aVar2;
        this.f40110c = m10;
    }

    public <D extends w.a> C16532g<g<D>> a(f<D> fVar, b bVar) {
        C16532g<g<D>> gVar;
        C17542s.j(fVar, "request");
        C17542s.j(bVar, "chain");
        w<D> f10 = fVar.f();
        if (f10 instanceof A) {
            gVar = this.f40108a.a(fVar);
        } else if (f10 instanceof t) {
            gVar = this.f40108a.a(fVar);
        } else {
            throw new IllegalStateException("");
        }
        return C16534i.L(gVar, this.f40110c);
    }
}
