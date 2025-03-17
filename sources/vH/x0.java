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

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, d2 = {"Lvh/x0;", "LM6/b;", "Lvh/w0;", "<init>", "()V", "LQ6/f;", "reader", "LM6/k;", "customScalarAdapters", "c", "(LQ6/f;LM6/k;)Lvh/w0;", "LQ6/g;", "writer", "value", "LXH/N;", "d", "(LQ6/g;LM6/k;Lvh/w0;)V", "", "", "b", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;", "RESPONSE_NAMES", "apollo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class x0 implements C6654b<w0> {

    /* renamed from: a  reason: collision with root package name */
    public static final x0 f77570a = new x0();

    /* renamed from: b  reason: collision with root package name */
    private static final List<String> f77571b = C16877v.q("taxAmount", "code", "taxPercentage", "type", "taxableAmount");

    private x0() {
    }

    /* renamed from: c */
    public w0 a(f fVar, k kVar) {
        C17542s.j(fVar, "reader");
        C17542s.j(kVar, "customScalarAdapters");
        Double d10 = null;
        Double d11 = null;
        String str = null;
        String str2 = null;
        Double d12 = null;
        while (true) {
            int T22 = fVar.T2(f77571b);
            if (T22 == 0) {
                d10 = d.f38534c.a(fVar, kVar);
            } else if (T22 == 1) {
                str = d.f38540i.a(fVar, kVar);
            } else if (T22 == 2) {
                d11 = d.f38534c.a(fVar, kVar);
            } else if (T22 == 3) {
                str2 = d.f38540i.a(fVar, kVar);
            } else if (T22 != 4) {
                C17542s.g(d10);
                double doubleValue = d10.doubleValue();
                C17542s.g(d11);
                return new w0(doubleValue, str, d11.doubleValue(), str2, d12);
            } else {
                d12 = d.f38541j.a(fVar, kVar);
            }
        }
    }

    /* renamed from: d */
    public void b(g gVar, k kVar, w0 w0Var) {
        C17542s.j(gVar, "writer");
        C17542s.j(kVar, "customScalarAdapters");
        C17542s.j(w0Var, "value");
        gVar.q1("taxAmount");
        C6654b<Double> bVar = d.f38534c;
        bVar.b(gVar, kVar, Double.valueOf(w0Var.b()));
        gVar.q1("code");
        u<String> uVar = d.f38540i;
        uVar.b(gVar, kVar, w0Var.a());
        gVar.q1("taxPercentage");
        bVar.b(gVar, kVar, Double.valueOf(w0Var.c()));
        gVar.q1("type");
        uVar.b(gVar, kVar, w0Var.e());
        gVar.q1("taxableAmount");
        d.f38541j.b(gVar, kVar, w0Var.d());
    }
}
