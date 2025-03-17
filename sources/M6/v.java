package M6;

import Q6.b;
import Q6.f;
import Q6.g;
import Q6.h;
import Q6.i;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u001d\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\f\u001a\u00028\u00002\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ'\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0014R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0015¨\u0006\u0016"}, d2 = {"LM6/v;", "T", "LM6/b;", "wrappedAdapter", "", "buffered", "<init>", "(LM6/b;Z)V", "LQ6/f;", "reader", "LM6/k;", "customScalarAdapters", "a", "(LQ6/f;LM6/k;)Ljava/lang/Object;", "LQ6/g;", "writer", "value", "LXH/N;", "b", "(LQ6/g;LM6/k;Ljava/lang/Object;)V", "LM6/b;", "Z", "apollo-api"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class v<T> implements C6654b<T> {

    /* renamed from: a  reason: collision with root package name */
    private final C6654b<T> f38613a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f38614b;

    public v(C6654b<T> bVar, boolean z10) {
        C17542s.j(bVar, "wrappedAdapter");
        this.f38613a = bVar;
        this.f38614b = z10;
    }

    public T a(f fVar, k kVar) {
        C17542s.j(fVar, "reader");
        C17542s.j(kVar, "customScalarAdapters");
        if (this.f38614b) {
            fVar = h.f39611j.a(fVar);
        }
        fVar.C();
        T a10 = this.f38613a.a(fVar, kVar);
        fVar.K();
        return a10;
    }

    public void b(g gVar, k kVar, T t10) {
        C17542s.j(gVar, "writer");
        C17542s.j(kVar, "customScalarAdapters");
        if (!this.f38614b || (gVar instanceof i)) {
            gVar.C();
            this.f38613a.b(gVar, kVar, t10);
            gVar.K();
            return;
        }
        i iVar = new i();
        iVar.C();
        this.f38613a.b(iVar, kVar, t10);
        iVar.K();
        Object e10 = iVar.e();
        C17542s.g(e10);
        b.a(gVar, e10);
    }
}
