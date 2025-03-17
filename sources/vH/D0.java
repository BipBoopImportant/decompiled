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
import vh.A0;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, d2 = {"Lvh/D0;", "LM6/b;", "Lvh/A0;", "<init>", "()V", "LQ6/f;", "reader", "LM6/k;", "customScalarAdapters", "c", "(LQ6/f;LM6/k;)Lvh/A0;", "LQ6/g;", "writer", "value", "LXH/N;", "d", "(LQ6/g;LM6/k;Lvh/A0;)V", "", "", "b", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;", "RESPONSE_NAMES", "apollo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class D0 implements C6654b<A0> {

    /* renamed from: a  reason: collision with root package name */
    public static final D0 f77217a = new D0();

    /* renamed from: b  reason: collision with root package name */
    private static final List<String> f77218b = C16877v.q("id", "fromDateTime", "toDateTime", "price", "capabilities", "hasPriceDeviation");

    private D0() {
    }

    /* renamed from: c */
    public A0 a(f fVar, k kVar) {
        C17542s.j(fVar, "reader");
        C17542s.j(kVar, "customScalarAdapters");
        Boolean bool = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        A0.b bVar = null;
        List list = null;
        while (true) {
            int T22 = fVar.T2(f77218b);
            if (T22 == 0) {
                str = d.f38532a.a(fVar, kVar);
            } else if (T22 == 1) {
                str2 = d.f38532a.a(fVar, kVar);
            } else if (T22 == 2) {
                str3 = d.f38532a.a(fVar, kVar);
            } else if (T22 == 3) {
                bVar = (A0.b) d.b(d.d(C0.f77213a, false, 1, (Object) null)).a(fVar, kVar);
            } else if (T22 == 4) {
                list = d.a(d.d(B0.f77209a, false, 1, (Object) null)).a(fVar, kVar);
            } else if (T22 != 5) {
                C17542s.g(str);
                C17542s.g(str2);
                C17542s.g(str3);
                C17542s.g(list);
                C17542s.g(bool);
                return new A0(str, str2, str3, bVar, list, bool.booleanValue());
            } else {
                bool = d.f38537f.a(fVar, kVar);
            }
        }
    }

    /* renamed from: d */
    public void b(g gVar, k kVar, A0 a02) {
        C17542s.j(gVar, "writer");
        C17542s.j(kVar, "customScalarAdapters");
        C17542s.j(a02, "value");
        gVar.q1("id");
        C6654b<String> bVar = d.f38532a;
        bVar.b(gVar, kVar, a02.d());
        gVar.q1("fromDateTime");
        bVar.b(gVar, kVar, a02.b());
        gVar.q1("toDateTime");
        bVar.b(gVar, kVar, a02.f());
        gVar.q1("price");
        d.b(d.d(C0.f77213a, false, 1, (Object) null)).b(gVar, kVar, a02.e());
        gVar.q1("capabilities");
        d.a(d.d(B0.f77209a, false, 1, (Object) null)).b(gVar, kVar, a02.a());
        gVar.q1("hasPriceDeviation");
        d.f38537f.b(gVar, kVar, Boolean.valueOf(a02.c()));
    }
}
