package xh;

import M6.C6654b;
import M6.d;
import M6.k;
import M6.y;
import Q6.f;
import Q6.g;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import wh.n;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lxh/n;", "LM6/b;", "Lwh/n;", "<init>", "()V", "LQ6/f;", "reader", "LM6/k;", "customScalarAdapters", "c", "(LQ6/f;LM6/k;)Lwh/n;", "LQ6/g;", "writer", "value", "LXH/N;", "d", "(LQ6/g;LM6/k;Lwh/n;)V", "apollo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: xh.n  reason: case insensitive filesystem */
public final class C10410n implements C6654b<n> {

    /* renamed from: a  reason: collision with root package name */
    public static final C10410n f77808a = new C10410n();

    private C10410n() {
    }

    /* renamed from: c */
    public n a(f fVar, k kVar) {
        C17542s.j(fVar, "reader");
        C17542s.j(kVar, "customScalarAdapters");
        throw new IllegalStateException("Input type used in output position");
    }

    /* renamed from: d */
    public void b(g gVar, k kVar, n nVar) {
        C17542s.j(gVar, "writer");
        C17542s.j(kVar, "customScalarAdapters");
        C17542s.j(nVar, "value");
        gVar.q1("deliveryId");
        C6654b<String> bVar = d.f38532a;
        bVar.b(gVar, kVar, nVar.a());
        gVar.q1("timeWindowId");
        bVar.b(gVar, kVar, nVar.d());
        if (nVar.b() instanceof y.c) {
            gVar.q1("pickUpPointId");
            d.e(d.f38540i).b(gVar, kVar, (y.c) nVar.b());
        }
        gVar.q1("timeWindowCapabilities");
        d.d(C10412p.f77810a, false, 1, (Object) null).b(gVar, kVar, nVar.c());
    }
}
