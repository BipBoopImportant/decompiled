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
import vh.C10315a0;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, d2 = {"Lvh/b0;", "LM6/b;", "Lvh/a0$a;", "<init>", "()V", "LQ6/f;", "reader", "LM6/k;", "customScalarAdapters", "c", "(LQ6/f;LM6/k;)Lvh/a0$a;", "LQ6/g;", "writer", "value", "LXH/N;", "d", "(LQ6/g;LM6/k;Lvh/a0$a;)V", "", "", "b", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;", "RESPONSE_NAMES", "apollo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: vh.b0  reason: case insensitive filesystem */
public final class C10317b0 implements C6654b<C10315a0.a> {

    /* renamed from: a  reason: collision with root package name */
    public static final C10317b0 f77357a = new C10317b0();

    /* renamed from: b  reason: collision with root package name */
    private static final List<String> f77358b = C16877v.q("all", "coupons", "discounts", "employee", "family", "familyPrice", "familyPromotions", "manual", "promotions", "voucher");

    private C10317b0() {
    }

    /* renamed from: c */
    public C10315a0.a a(f fVar, k kVar) {
        C17542s.j(fVar, "reader");
        C17542s.j(kVar, "customScalarAdapters");
        Double d10 = null;
        Double d11 = null;
        Double d12 = null;
        Double d13 = null;
        Double d14 = null;
        Double d15 = null;
        Double d16 = null;
        Double d17 = null;
        Double d18 = null;
        Double d19 = null;
        while (true) {
            switch (fVar.T2(f77358b)) {
                case 0:
                    d10 = d.f38534c.a(fVar, kVar);
                    break;
                case 1:
                    d11 = d.f38541j.a(fVar, kVar);
                    break;
                case 2:
                    d12 = d.f38541j.a(fVar, kVar);
                    break;
                case 3:
                    d13 = d.f38541j.a(fVar, kVar);
                    break;
                case 4:
                    d14 = d.f38541j.a(fVar, kVar);
                    break;
                case 5:
                    d15 = d.f38541j.a(fVar, kVar);
                    break;
                case 6:
                    d16 = d.f38541j.a(fVar, kVar);
                    break;
                case 7:
                    d17 = d.f38541j.a(fVar, kVar);
                    break;
                case 8:
                    d18 = d.f38541j.a(fVar, kVar);
                    break;
                case 9:
                    d19 = d.f38541j.a(fVar, kVar);
                    break;
                default:
                    C17542s.g(d10);
                    return new C10315a0.a(d10.doubleValue(), d11, d12, d13, d14, d15, d16, d17, d18, d19);
            }
        }
    }

    /* renamed from: d */
    public void b(g gVar, k kVar, C10315a0.a aVar) {
        C17542s.j(gVar, "writer");
        C17542s.j(kVar, "customScalarAdapters");
        C17542s.j(aVar, "value");
        gVar.q1("all");
        d.f38534c.b(gVar, kVar, Double.valueOf(aVar.a()));
        gVar.q1("coupons");
        u<Double> uVar = d.f38541j;
        uVar.b(gVar, kVar, aVar.b());
        gVar.q1("discounts");
        uVar.b(gVar, kVar, aVar.c());
        gVar.q1("employee");
        uVar.b(gVar, kVar, aVar.d());
        gVar.q1("family");
        uVar.b(gVar, kVar, aVar.e());
        gVar.q1("familyPrice");
        uVar.b(gVar, kVar, aVar.f());
        gVar.q1("familyPromotions");
        uVar.b(gVar, kVar, aVar.g());
        gVar.q1("manual");
        uVar.b(gVar, kVar, aVar.h());
        gVar.q1("promotions");
        uVar.b(gVar, kVar, aVar.i());
        gVar.q1("voucher");
        uVar.b(gVar, kVar, aVar.j());
    }
}
