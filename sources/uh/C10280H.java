package uh;

import M6.C6654b;
import M6.d;
import M6.k;
import Q6.f;
import YH.C16877v;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import th.g;
import vh.E0;
import vh.J0;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, d2 = {"Luh/H;", "LM6/b;", "Lth/g$f;", "<init>", "()V", "LQ6/f;", "reader", "LM6/k;", "customScalarAdapters", "c", "(LQ6/f;LM6/k;)Lth/g$f;", "LQ6/g;", "writer", "value", "LXH/N;", "d", "(LQ6/g;LM6/k;Lth/g$f;)V", "", "", "b", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;", "RESPONSE_NAMES", "apollo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: uh.H  reason: case insensitive filesystem */
public final class C10280H implements C6654b<g.f> {

    /* renamed from: a  reason: collision with root package name */
    public static final C10280H f77086a = new C10280H();

    /* renamed from: b  reason: collision with root package name */
    private static final List<String> f77087b = C16877v.e("__typename");

    private C10280H() {
    }

    /* renamed from: c */
    public g.f a(f fVar, k kVar) {
        C17542s.j(fVar, "reader");
        C17542s.j(kVar, "customScalarAdapters");
        String str = null;
        while (fVar.T2(f77087b) == 0) {
            str = d.f38532a.a(fVar, kVar);
        }
        fVar.D();
        E0 c10 = J0.f77274a.a(fVar, kVar);
        C17542s.g(str);
        return new g.f(str, c10);
    }

    /* renamed from: d */
    public void b(Q6.g gVar, k kVar, g.f fVar) {
        C17542s.j(gVar, "writer");
        C17542s.j(kVar, "customScalarAdapters");
        C17542s.j(fVar, "value");
        gVar.q1("__typename");
        d.f38532a.b(gVar, kVar, fVar.b());
        J0.f77274a.b(gVar, kVar, fVar.a());
    }
}
