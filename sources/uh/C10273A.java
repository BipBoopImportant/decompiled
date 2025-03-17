package uh;

import M6.C6654b;
import M6.d;
import M6.k;
import Q6.g;
import YH.C16877v;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import th.f;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, d2 = {"Luh/A;", "LM6/b;", "Lth/f$c;", "<init>", "()V", "LQ6/f;", "reader", "LM6/k;", "customScalarAdapters", "c", "(LQ6/f;LM6/k;)Lth/f$c;", "LQ6/g;", "writer", "value", "LXH/N;", "d", "(LQ6/g;LM6/k;Lth/f$c;)V", "", "", "b", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;", "RESPONSE_NAMES", "apollo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: uh.A  reason: case insensitive filesystem */
public final class C10273A implements C6654b<f.c> {

    /* renamed from: a  reason: collision with root package name */
    public static final C10273A f77073a = new C10273A();

    /* renamed from: b  reason: collision with root package name */
    private static final List<String> f77074b = C16877v.q("collectDeliveryServices", "homeDeliveryServices");

    private C10273A() {
    }

    /* renamed from: c */
    public f.c a(Q6.f fVar, k kVar) {
        C17542s.j(fVar, "reader");
        C17542s.j(kVar, "customScalarAdapters");
        List list = null;
        List list2 = null;
        while (true) {
            int T22 = fVar.T2(f77074b);
            if (T22 == 0) {
                list = d.a(d.c(z.f77134a, true)).a(fVar, kVar);
            } else if (T22 != 1) {
                C17542s.g(list);
                C17542s.g(list2);
                return new f.c(list, list2);
            } else {
                list2 = d.a(d.c(C10274B.f77075a, true)).a(fVar, kVar);
            }
        }
    }

    /* renamed from: d */
    public void b(g gVar, k kVar, f.c cVar) {
        C17542s.j(gVar, "writer");
        C17542s.j(kVar, "customScalarAdapters");
        C17542s.j(cVar, "value");
        gVar.q1("collectDeliveryServices");
        d.a(d.c(z.f77134a, true)).b(gVar, kVar, cVar.a());
        gVar.q1("homeDeliveryServices");
        d.a(d.c(C10274B.f77075a, true)).b(gVar, kVar, cVar.b());
    }
}
