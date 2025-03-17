package M6;

import Q6.f;
import Q6.g;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0003B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003¢\u0006\u0004\b\u0005\u0010\u0006J!\u0010\u000b\u001a\u0004\u0018\u00018\u00002\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000b\u0010\fJ)\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\b\u0010\u000f\u001a\u0004\u0018\u00018\u0000H\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0013¨\u0006\u0014"}, d2 = {"LM6/u;", "", "T", "LM6/b;", "wrappedAdapter", "<init>", "(LM6/b;)V", "LQ6/f;", "reader", "LM6/k;", "customScalarAdapters", "a", "(LQ6/f;LM6/k;)Ljava/lang/Object;", "LQ6/g;", "writer", "value", "LXH/N;", "b", "(LQ6/g;LM6/k;Ljava/lang/Object;)V", "LM6/b;", "apollo-api"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class u<T> implements C6654b<T> {

    /* renamed from: a  reason: collision with root package name */
    private final C6654b<T> f38612a;

    public u(C6654b<T> bVar) {
        C17542s.j(bVar, "wrappedAdapter");
        this.f38612a = bVar;
        if (bVar instanceof u) {
            throw new IllegalStateException("The adapter is already nullable");
        }
    }

    public T a(f fVar, k kVar) {
        C17542s.j(fVar, "reader");
        C17542s.j(kVar, "customScalarAdapters");
        if (fVar.O() != f.a.NULL) {
            return this.f38612a.a(fVar, kVar);
        }
        fVar.a0();
        return null;
    }

    public void b(g gVar, k kVar, T t10) {
        C17542s.j(gVar, "writer");
        C17542s.j(kVar, "customScalarAdapters");
        if (t10 == null) {
            gVar.e3();
        } else {
            this.f38612a.b(gVar, kVar, t10);
        }
    }
}
