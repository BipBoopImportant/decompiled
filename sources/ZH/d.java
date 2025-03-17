package zh;

import M6.C6654b;
import M6.k;
import Q6.f;
import Q6.g;
import YH.C16877v;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import yh.C10478b;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, d2 = {"Lzh/d;", "LM6/b;", "Lyh/b$b;", "<init>", "()V", "LQ6/f;", "reader", "LM6/k;", "customScalarAdapters", "c", "(LQ6/f;LM6/k;)Lyh/b$b;", "LQ6/g;", "writer", "value", "LXH/N;", "d", "(LQ6/g;LM6/k;Lyh/b$b;)V", "", "", "b", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;", "RESPONSE_NAMES", "apollo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class d implements C6654b<C10478b.C1445b> {

    /* renamed from: a  reason: collision with root package name */
    public static final d f78391a = new d();

    /* renamed from: b  reason: collision with root package name */
    private static final List<String> f78392b = C16877v.q("listId", "name", "updated");

    private d() {
    }

    /* renamed from: c */
    public C10478b.C1445b a(f fVar, k kVar) {
        C17542s.j(fVar, "reader");
        C17542s.j(kVar, "customScalarAdapters");
        String str = null;
        String str2 = null;
        String str3 = null;
        while (true) {
            int T22 = fVar.T2(f78392b);
            if (T22 == 0) {
                str = M6.d.f38532a.a(fVar, kVar);
            } else if (T22 == 1) {
                str2 = M6.d.f38532a.a(fVar, kVar);
            } else if (T22 != 2) {
                C17542s.g(str);
                C17542s.g(str2);
                C17542s.g(str3);
                return new C10478b.C1445b(str, str2, str3);
            } else {
                str3 = M6.d.f38532a.a(fVar, kVar);
            }
        }
    }

    /* renamed from: d */
    public void b(g gVar, k kVar, C10478b.C1445b bVar) {
        C17542s.j(gVar, "writer");
        C17542s.j(kVar, "customScalarAdapters");
        C17542s.j(bVar, "value");
        gVar.q1("listId");
        C6654b<String> bVar2 = M6.d.f38532a;
        bVar2.b(gVar, kVar, bVar.a());
        gVar.q1("name");
        bVar2.b(gVar, kVar, bVar.b());
        gVar.q1("updated");
        bVar2.b(gVar, kVar, bVar.c());
    }
}
