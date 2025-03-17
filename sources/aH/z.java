package Ah;

import Ah.y;
import Bh.d;
import M6.C6654b;
import M6.k;
import Q6.f;
import Q6.g;
import YH.C16877v;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, d2 = {"LAh/z;", "LM6/b;", "LAh/y$a;", "<init>", "()V", "LQ6/f;", "reader", "LM6/k;", "customScalarAdapters", "c", "(LQ6/f;LM6/k;)LAh/y$a;", "LQ6/g;", "writer", "value", "LXH/N;", "d", "(LQ6/g;LM6/k;LAh/y$a;)V", "", "", "b", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;", "RESPONSE_NAMES", "apollo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class z implements C6654b<y.a> {

    /* renamed from: a  reason: collision with root package name */
    public static final z f58884a = new z();

    /* renamed from: b  reason: collision with root package name */
    private static final List<String> f58885b = C16877v.q("imperial", "metric", "type");

    private z() {
    }

    /* renamed from: c */
    public y.a a(f fVar, k kVar) {
        C17542s.j(fVar, "reader");
        C17542s.j(kVar, "customScalarAdapters");
        y.c cVar = null;
        y.e eVar = null;
        d dVar = null;
        while (true) {
            int T22 = fVar.T2(f58885b);
            if (T22 == 0) {
                cVar = (y.c) M6.d.b(M6.d.d(B.f58752a, false, 1, (Object) null)).a(fVar, kVar);
            } else if (T22 == 1) {
                eVar = (y.e) M6.d.b(M6.d.d(D.f58756a, false, 1, (Object) null)).a(fVar, kVar);
            } else if (T22 != 2) {
                C17542s.g(dVar);
                return new y.a(cVar, eVar, dVar);
            } else {
                dVar = Ch.d.f59007a.a(fVar, kVar);
            }
        }
    }

    /* renamed from: d */
    public void b(g gVar, k kVar, y.a aVar) {
        C17542s.j(gVar, "writer");
        C17542s.j(kVar, "customScalarAdapters");
        C17542s.j(aVar, "value");
        gVar.q1("imperial");
        M6.d.b(M6.d.d(B.f58752a, false, 1, (Object) null)).b(gVar, kVar, aVar.a());
        gVar.q1("metric");
        M6.d.b(M6.d.d(D.f58756a, false, 1, (Object) null)).b(gVar, kVar, aVar.b());
        gVar.q1("type");
        Ch.d.f59007a.b(gVar, kVar, aVar.c());
    }
}
