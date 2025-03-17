package Ah;

import Ah.C9048d;
import M6.C6654b;
import M6.d;
import Q6.f;
import Q6.g;
import YH.C16877v;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, d2 = {"LAh/k;", "LM6/b;", "LAh/d$f;", "<init>", "()V", "LQ6/f;", "reader", "LM6/k;", "customScalarAdapters", "c", "(LQ6/f;LM6/k;)LAh/d$f;", "LQ6/g;", "writer", "value", "LXH/N;", "d", "(LQ6/g;LM6/k;LAh/d$f;)V", "", "", "b", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;", "RESPONSE_NAMES", "apollo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class k implements C6654b<C9048d.f> {

    /* renamed from: a  reason: collision with root package name */
    public static final k f58830a = new k();

    /* renamed from: b  reason: collision with root package name */
    private static final List<String> f58831b = C16877v.q("fees", "regular", "family");

    private k() {
    }

    /* renamed from: c */
    public C9048d.f a(f fVar, M6.k kVar) {
        C17542s.j(fVar, "reader");
        C17542s.j(kVar, "customScalarAdapters");
        C9048d.c cVar = null;
        C9048d.l lVar = null;
        C9048d.b bVar = null;
        while (true) {
            int T22 = fVar.T2(f58831b);
            if (T22 == 0) {
                cVar = (C9048d.c) d.b(d.d(g.f58822a, false, 1, (Object) null)).a(fVar, kVar);
            } else if (T22 == 1) {
                lVar = (C9048d.l) d.b(d.d(q.f58842a, false, 1, (Object) null)).a(fVar, kVar);
            } else if (T22 != 2) {
                return new C9048d.f(cVar, lVar, bVar);
            } else {
                bVar = (C9048d.b) d.b(d.d(C9050f.f58820a, false, 1, (Object) null)).a(fVar, kVar);
            }
        }
    }

    /* renamed from: d */
    public void b(g gVar, M6.k kVar, C9048d.f fVar) {
        C17542s.j(gVar, "writer");
        C17542s.j(kVar, "customScalarAdapters");
        C17542s.j(fVar, "value");
        gVar.q1("fees");
        d.b(d.d(g.f58822a, false, 1, (Object) null)).b(gVar, kVar, fVar.b());
        gVar.q1("regular");
        d.b(d.d(q.f58842a, false, 1, (Object) null)).b(gVar, kVar, fVar.c());
        gVar.q1("family");
        d.b(d.d(C9050f.f58820a, false, 1, (Object) null)).b(gVar, kVar, fVar.a());
    }
}
