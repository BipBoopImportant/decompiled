package vh;

import M6.C6654b;
import M6.d;
import M6.k;
import M6.u;
import Q6.f;
import Q6.g;
import YH.C16877v;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import vh.C10343u;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, d2 = {"Lvh/C;", "LM6/b;", "Lvh/u$g;", "<init>", "()V", "LQ6/f;", "reader", "LM6/k;", "customScalarAdapters", "c", "(LQ6/f;LM6/k;)Lvh/u$g;", "LQ6/g;", "writer", "value", "LXH/N;", "d", "(LQ6/g;LM6/k;Lvh/u$g;)V", "", "", "b", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;", "RESPONSE_NAMES", "apollo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: vh.C  reason: case insensitive filesystem */
public final class C10312C implements C6654b<C10343u.g> {

    /* renamed from: a  reason: collision with root package name */
    public static final C10312C f77211a = new C10312C();

    /* renamed from: b  reason: collision with root package name */
    private static final List<String> f77212b = C16877v.q("collapsedRating", "deliveryDateDetails", "deliveryDescription", "deliveryDescriptionExpanded");

    private C10312C() {
    }

    /* renamed from: c */
    public C10343u.g a(f fVar, k kVar) {
        C17542s.j(fVar, "reader");
        C17542s.j(kVar, "customScalarAdapters");
        Integer num = null;
        C10343u.c cVar = null;
        String str = null;
        String str2 = null;
        while (true) {
            int T22 = fVar.T2(f77212b);
            if (T22 == 0) {
                num = d.f38542k.a(fVar, kVar);
            } else if (T22 == 1) {
                cVar = (C10343u.c) d.b(d.c(C10346x.f77568a, true)).a(fVar, kVar);
            } else if (T22 == 2) {
                str = d.f38540i.a(fVar, kVar);
            } else if (T22 != 3) {
                return new C10343u.g(num, cVar, str, str2);
            } else {
                str2 = d.f38540i.a(fVar, kVar);
            }
        }
    }

    /* renamed from: d */
    public void b(g gVar, k kVar, C10343u.g gVar2) {
        C17542s.j(gVar, "writer");
        C17542s.j(kVar, "customScalarAdapters");
        C17542s.j(gVar2, "value");
        gVar.q1("collapsedRating");
        d.f38542k.b(gVar, kVar, gVar2.a());
        gVar.q1("deliveryDateDetails");
        d.b(d.c(C10346x.f77568a, true)).b(gVar, kVar, gVar2.b());
        gVar.q1("deliveryDescription");
        u<String> uVar = d.f38540i;
        uVar.b(gVar, kVar, gVar2.c());
        gVar.q1("deliveryDescriptionExpanded");
        uVar.b(gVar, kVar, gVar2.d());
    }
}
