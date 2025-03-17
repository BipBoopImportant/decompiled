package Ch;

import M6.C6654b;
import M6.d;
import M6.k;
import M6.y;
import Q6.f;
import Q6.g;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"LCh/b;", "LM6/b;", "LBh/b;", "<init>", "()V", "LQ6/f;", "reader", "LM6/k;", "customScalarAdapters", "c", "(LQ6/f;LM6/k;)LBh/b;", "LQ6/g;", "writer", "value", "LXH/N;", "d", "(LQ6/g;LM6/k;LBh/b;)V", "apollo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class b implements C6654b<Bh.b> {

    /* renamed from: a  reason: collision with root package name */
    public static final b f59005a = new b();

    private b() {
    }

    /* renamed from: c */
    public Bh.b a(f fVar, k kVar) {
        C17542s.j(fVar, "reader");
        C17542s.j(kVar, "customScalarAdapters");
        throw new IllegalStateException("Input type used in output position");
    }

    /* renamed from: d */
    public void b(g gVar, k kVar, Bh.b bVar) {
        C17542s.j(gVar, "writer");
        C17542s.j(kVar, "customScalarAdapters");
        C17542s.j(bVar, "value");
        gVar.q1("languageCode");
        d.f38532a.b(gVar, kVar, bVar.a());
        if (bVar.b() instanceof y.c) {
            gVar.q1("storeId");
            d.e(d.f38540i).b(gVar, kVar, (y.c) bVar.b());
        }
        if (bVar.c() instanceof y.c) {
            gVar.q1("zip");
            d.e(d.f38540i).b(gVar, kVar, (y.c) bVar.c());
        }
    }
}
