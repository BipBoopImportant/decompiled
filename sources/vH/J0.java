package vh;

import M6.C6654b;
import M6.d;
import M6.k;
import Q6.f;
import Q6.g;
import YH.C16877v;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, d2 = {"Lvh/J0;", "LM6/b;", "Lvh/E0;", "<init>", "()V", "LQ6/f;", "reader", "LM6/k;", "customScalarAdapters", "c", "(LQ6/f;LM6/k;)Lvh/E0;", "LQ6/g;", "writer", "value", "LXH/N;", "d", "(LQ6/g;LM6/k;Lvh/E0;)V", "", "", "b", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;", "RESPONSE_NAMES", "apollo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class J0 implements C6654b<E0> {

    /* renamed from: a  reason: collision with root package name */
    public static final J0 f77274a = new J0();

    /* renamed from: b  reason: collision with root package name */
    private static final List<String> f77275b = C16877v.q("primary", "secondary", "contact", "terms");

    private J0() {
    }

    /* renamed from: c */
    public E0 a(f fVar, k kVar) {
        C17542s.j(fVar, "reader");
        C17542s.j(kVar, "customScalarAdapters");
        List list = null;
        List list2 = null;
        List list3 = null;
        List list4 = null;
        while (true) {
            int T22 = fVar.T2(f77275b);
            if (T22 == 0) {
                list = d.a(d.c(G0.f77262a, true)).a(fVar, kVar);
            } else if (T22 == 1) {
                list2 = d.a(d.c(H0.f77266a, true)).a(fVar, kVar);
            } else if (T22 == 2) {
                list3 = d.a(d.c(F0.f77258a, true)).a(fVar, kVar);
            } else if (T22 != 3) {
                C17542s.g(list);
                C17542s.g(list2);
                C17542s.g(list3);
                C17542s.g(list4);
                return new E0(list, list2, list3, list4);
            } else {
                list4 = d.a(d.c(I0.f77270a, true)).a(fVar, kVar);
            }
        }
    }

    /* renamed from: d */
    public void b(g gVar, k kVar, E0 e02) {
        C17542s.j(gVar, "writer");
        C17542s.j(kVar, "customScalarAdapters");
        C17542s.j(e02, "value");
        gVar.q1("primary");
        d.a(d.c(G0.f77262a, true)).b(gVar, kVar, e02.b());
        gVar.q1("secondary");
        d.a(d.c(H0.f77266a, true)).b(gVar, kVar, e02.c());
        gVar.q1("contact");
        d.a(d.c(F0.f77258a, true)).b(gVar, kVar, e02.a());
        gVar.q1("terms");
        d.a(d.c(I0.f77270a, true)).b(gVar, kVar, e02.d());
    }
}
