package uh;

import M6.C6654b;
import M6.d;
import M6.k;
import Q6.f;
import Q6.g;
import YH.C16877v;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import th.C10256a;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, d2 = {"Luh/c;", "LM6/b;", "Lth/a$d;", "<init>", "()V", "LQ6/f;", "reader", "LM6/k;", "customScalarAdapters", "c", "(LQ6/f;LM6/k;)Lth/a$d;", "LQ6/g;", "writer", "value", "LXH/N;", "d", "(LQ6/g;LM6/k;Lth/a$d;)V", "", "", "b", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;", "RESPONSE_NAMES", "apollo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: uh.c  reason: case insensitive filesystem */
public final class C10284c implements C6654b<C10256a.d> {

    /* renamed from: a  reason: collision with root package name */
    public static final C10284c f77093a = new C10284c();

    /* renamed from: b  reason: collision with root package name */
    private static final List<String> f77094b = C16877v.q("checkout", "collectDeliveryServices", "homeDeliveryServices");

    private C10284c() {
    }

    /* renamed from: c */
    public C10256a.d a(f fVar, k kVar) {
        C17542s.j(fVar, "reader");
        C17542s.j(kVar, "customScalarAdapters");
        C10256a.C1414a aVar = null;
        List list = null;
        List list2 = null;
        while (true) {
            int T22 = fVar.T2(f77094b);
            if (T22 == 0) {
                aVar = (C10256a.C1414a) d.c(C10282a.f77089a, true).a(fVar, kVar);
            } else if (T22 == 1) {
                list = d.a(d.c(C10283b.f77091a, true)).a(fVar, kVar);
            } else if (T22 != 2) {
                C17542s.g(aVar);
                C17542s.g(list);
                C17542s.g(list2);
                return new C10256a.d(aVar, list, list2);
            } else {
                list2 = d.a(d.c(C10286e.f77097a, true)).a(fVar, kVar);
            }
        }
    }

    /* renamed from: d */
    public void b(g gVar, k kVar, C10256a.d dVar) {
        C17542s.j(gVar, "writer");
        C17542s.j(kVar, "customScalarAdapters");
        C17542s.j(dVar, "value");
        gVar.q1("checkout");
        d.c(C10282a.f77089a, true).b(gVar, kVar, dVar.a());
        gVar.q1("collectDeliveryServices");
        d.a(d.c(C10283b.f77091a, true)).b(gVar, kVar, dVar.b());
        gVar.q1("homeDeliveryServices");
        d.a(d.c(C10286e.f77097a, true)).b(gVar, kVar, dVar.c());
    }
}
