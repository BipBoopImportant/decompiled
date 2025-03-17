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
import th.C10257b;
import vh.C10318c;
import vh.C10320d;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, d2 = {"Luh/g;", "LM6/b;", "Lth/b$a;", "<init>", "()V", "LQ6/f;", "reader", "LM6/k;", "customScalarAdapters", "c", "(LQ6/f;LM6/k;)Lth/b$a;", "LQ6/g;", "writer", "value", "LXH/N;", "d", "(LQ6/g;LM6/k;Lth/b$a;)V", "", "", "b", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;", "RESPONSE_NAMES", "apollo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: uh.g  reason: case insensitive filesystem */
public final class C10288g implements C6654b<C10257b.a> {

    /* renamed from: a  reason: collision with root package name */
    public static final C10288g f77100a = new C10288g();

    /* renamed from: b  reason: collision with root package name */
    private static final List<String> f77101b = C16877v.e("__typename");

    private C10288g() {
    }

    /* renamed from: c */
    public C10257b.a a(f fVar, k kVar) {
        C17542s.j(fVar, "reader");
        C17542s.j(kVar, "customScalarAdapters");
        String str = null;
        while (fVar.T2(f77101b) == 0) {
            str = d.f38532a.a(fVar, kVar);
        }
        fVar.D();
        C10318c c10 = C10320d.f77384a.a(fVar, kVar);
        C17542s.g(str);
        return new C10257b.a(str, c10);
    }

    /* renamed from: d */
    public void b(g gVar, k kVar, C10257b.a aVar) {
        C17542s.j(gVar, "writer");
        C17542s.j(kVar, "customScalarAdapters");
        C17542s.j(aVar, "value");
        gVar.q1("__typename");
        d.f38532a.b(gVar, kVar, aVar.b());
        C10320d.f77384a.b(gVar, kVar, aVar.a());
    }
}
