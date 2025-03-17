package uh;

import M6.C6654b;
import M6.d;
import M6.k;
import Q6.g;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import th.f;
import xh.C10403g;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Luh/C;", "LM6/b;", "Lth/f;", "<init>", "()V", "LQ6/f;", "reader", "LM6/k;", "customScalarAdapters", "c", "(LQ6/f;LM6/k;)Lth/f;", "LQ6/g;", "writer", "value", "LXH/N;", "d", "(LQ6/g;LM6/k;Lth/f;)V", "apollo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: uh.C  reason: case insensitive filesystem */
public final class C10275C implements C6654b<f> {

    /* renamed from: a  reason: collision with root package name */
    public static final C10275C f77077a = new C10275C();

    private C10275C() {
    }

    /* renamed from: c */
    public f a(Q6.f fVar, k kVar) {
        C17542s.j(fVar, "reader");
        C17542s.j(kVar, "customScalarAdapters");
        throw new IllegalStateException("Input type used in output position");
    }

    /* renamed from: d */
    public void b(g gVar, k kVar, f fVar) {
        C17542s.j(gVar, "writer");
        C17542s.j(kVar, "customScalarAdapters");
        C17542s.j(fVar, "value");
        gVar.q1("checkoutId");
        C6654b<String> bVar = d.f38532a;
        bVar.b(gVar, kVar, fVar.e());
        gVar.q1("serviceAreaId");
        bVar.b(gVar, kVar, fVar.f());
        gVar.q1("supportedCollectDeliveryServices");
        C10403g gVar2 = C10403g.f77801a;
        d.a(gVar2).b(gVar, kVar, fVar.g());
        gVar.q1("supportedHomeDeliveryServices");
        d.a(gVar2).b(gVar, kVar, fVar.h());
    }
}
