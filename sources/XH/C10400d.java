package xh;

import M6.C6654b;
import M6.k;
import Q6.f;
import Q6.g;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import wh.C10373d;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lxh/d;", "LM6/b;", "Lwh/d;", "<init>", "()V", "LQ6/f;", "reader", "LM6/k;", "customScalarAdapters", "c", "(LQ6/f;LM6/k;)Lwh/d;", "LQ6/g;", "writer", "value", "LXH/N;", "d", "(LQ6/g;LM6/k;Lwh/d;)V", "apollo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: xh.d  reason: case insensitive filesystem */
public final class C10400d implements C6654b<C10373d> {

    /* renamed from: a  reason: collision with root package name */
    public static final C10400d f77798a = new C10400d();

    private C10400d() {
    }

    /* renamed from: c */
    public C10373d a(f fVar, k kVar) {
        C17542s.j(fVar, "reader");
        C17542s.j(kVar, "customScalarAdapters");
        String C12 = fVar.C1();
        C17542s.g(C12);
        return C10373d.Companion.a(C12);
    }

    /* renamed from: d */
    public void b(g gVar, k kVar, C10373d dVar) {
        C17542s.j(gVar, "writer");
        C17542s.j(kVar, "customScalarAdapters");
        C17542s.j(dVar, "value");
        gVar.T1(dVar.b());
    }
}
