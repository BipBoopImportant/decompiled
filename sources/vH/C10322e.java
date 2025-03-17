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
import vh.C10318c;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, d2 = {"Lvh/e;", "LM6/b;", "Lvh/c$a;", "<init>", "()V", "LQ6/f;", "reader", "LM6/k;", "customScalarAdapters", "c", "(LQ6/f;LM6/k;)Lvh/c$a;", "LQ6/g;", "writer", "value", "LXH/N;", "d", "(LQ6/g;LM6/k;Lvh/c$a;)V", "", "", "b", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;", "RESPONSE_NAMES", "apollo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: vh.e  reason: case insensitive filesystem */
public final class C10322e implements C6654b<C10318c.a> {

    /* renamed from: a  reason: collision with root package name */
    public static final C10322e f77388a = new C10322e();

    /* renamed from: b  reason: collision with root package name */
    private static final List<String> f77389b = C16877v.q("itemNo", "quantity", "totalPrice", "type");

    private C10322e() {
    }

    /* renamed from: c */
    public C10318c.a a(f fVar, k kVar) {
        C17542s.j(fVar, "reader");
        C17542s.j(kVar, "customScalarAdapters");
        String str = null;
        Integer num = null;
        C10318c.e eVar = null;
        String str2 = null;
        while (true) {
            int T22 = fVar.T2(f77389b);
            if (T22 == 0) {
                str = d.f38532a.a(fVar, kVar);
            } else if (T22 == 1) {
                num = d.f38533b.a(fVar, kVar);
            } else if (T22 == 2) {
                eVar = (C10318c.e) d.d(C10330i.f77452a, false, 1, (Object) null).a(fVar, kVar);
            } else if (T22 != 3) {
                C17542s.g(str);
                C17542s.g(num);
                int intValue = num.intValue();
                C17542s.g(eVar);
                C17542s.g(str2);
                return new C10318c.a(str, intValue, eVar, str2);
            } else {
                str2 = d.f38532a.a(fVar, kVar);
            }
        }
    }

    /* renamed from: d */
    public void b(g gVar, k kVar, C10318c.a aVar) {
        C17542s.j(gVar, "writer");
        C17542s.j(kVar, "customScalarAdapters");
        C17542s.j(aVar, "value");
        gVar.q1("itemNo");
        C6654b<String> bVar = d.f38532a;
        bVar.b(gVar, kVar, aVar.a());
        gVar.q1("quantity");
        d.f38533b.b(gVar, kVar, Integer.valueOf(aVar.b()));
        gVar.q1("totalPrice");
        d.d(C10330i.f77452a, false, 1, (Object) null).b(gVar, kVar, aVar.c());
        gVar.q1("type");
        bVar.b(gVar, kVar, aVar.d());
    }
}
