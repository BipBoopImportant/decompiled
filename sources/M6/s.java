package M6;

import Q6.f;
import Q6.g;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000*\u0004\b\u0000\u0010\u00012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\u0002B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002¢\u0006\u0004\b\u0005\u0010\u0006J%\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000b\u0010\fJ-\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"LM6/s;", "T", "LM6/b;", "", "wrappedAdapter", "<init>", "(LM6/b;)V", "LQ6/f;", "reader", "LM6/k;", "customScalarAdapters", "c", "(LQ6/f;LM6/k;)Ljava/util/List;", "LQ6/g;", "writer", "value", "LXH/N;", "d", "(LQ6/g;LM6/k;Ljava/util/List;)V", "a", "LM6/b;", "apollo-api"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class s<T> implements C6654b<List<T>> {

    /* renamed from: a  reason: collision with root package name */
    private final C6654b<T> f38611a;

    public s(C6654b<T> bVar) {
        C17542s.j(bVar, "wrappedAdapter");
        this.f38611a = bVar;
    }

    /* renamed from: c */
    public List<T> a(f fVar, k kVar) {
        C17542s.j(fVar, "reader");
        C17542s.j(kVar, "customScalarAdapters");
        fVar.G();
        ArrayList arrayList = new ArrayList();
        while (fVar.hasNext()) {
            arrayList.add(this.f38611a.a(fVar, kVar));
        }
        fVar.E();
        return arrayList;
    }

    /* renamed from: d */
    public void b(g gVar, k kVar, List<? extends T> list) {
        C17542s.j(gVar, "writer");
        C17542s.j(kVar, "customScalarAdapters");
        C17542s.j(list, "value");
        gVar.G();
        for (Object b10 : list) {
            this.f38611a.b(gVar, kVar, b10);
        }
        gVar.E();
    }
}
