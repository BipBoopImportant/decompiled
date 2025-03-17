package vh;

import M6.C6654b;
import M6.d;
import M6.k;
import Q6.g;
import YH.C16877v;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import xh.C10401e;
import xh.C10402f;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, d2 = {"Lvh/p0;", "LM6/b;", "Lvh/f0;", "<init>", "()V", "LQ6/f;", "reader", "LM6/k;", "customScalarAdapters", "c", "(LQ6/f;LM6/k;)Lvh/f0;", "LQ6/g;", "writer", "value", "LXH/N;", "d", "(LQ6/g;LM6/k;Lvh/f0;)V", "", "", "b", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;", "RESPONSE_NAMES", "apollo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class p0 implements C6654b<C10325f0> {

    /* renamed from: a  reason: collision with root package name */
    public static final p0 f77498a = new p0();

    /* renamed from: b  reason: collision with root package name */
    private static final List<String> f77499b = C16877v.q("solution", "fulfillmentMethodType", "id", "solutionPrice", "splittedItems", "deliveries");

    private p0() {
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v8, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v3, resolved type: vh.f0$l} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public vh.C10325f0 a(Q6.f r12, M6.k r13) {
        /*
            r11 = this;
            java.lang.String r0 = "reader"
            kotlin.jvm.internal.C17542s.j(r12, r0)
            java.lang.String r0 = "customScalarAdapters"
            kotlin.jvm.internal.C17542s.j(r13, r0)
            r0 = 0
            r2 = r0
            r3 = r2
            r4 = r3
            r5 = r4
            r6 = r5
            r7 = r6
        L_0x0011:
            java.util.List<java.lang.String> r1 = f77499b
            int r1 = r12.T2(r1)
            if (r1 == 0) goto L_0x007f
            r8 = 1
            if (r1 == r8) goto L_0x0078
            r9 = 2
            if (r1 == r9) goto L_0x006e
            r9 = 3
            if (r1 == r9) goto L_0x0060
            r9 = 4
            r10 = 0
            if (r1 == r9) goto L_0x0051
            r9 = 5
            if (r1 == r9) goto L_0x0042
            vh.f0 r12 = new vh.f0
            kotlin.jvm.internal.C17542s.g(r2)
            kotlin.jvm.internal.C17542s.g(r3)
            kotlin.jvm.internal.C17542s.g(r4)
            kotlin.jvm.internal.C17542s.g(r5)
            kotlin.jvm.internal.C17542s.g(r6)
            kotlin.jvm.internal.C17542s.g(r7)
            r1 = r12
            r1.<init>(r2, r3, r4, r5, r6, r7)
            return r12
        L_0x0042:
            vh.i0 r1 = vh.C10331i0.f77454a
            M6.v r1 = M6.d.d(r1, r10, r8, r0)
            M6.s r1 = M6.d.a(r1)
            java.util.List r7 = r1.a(r12, r13)
            goto L_0x0011
        L_0x0051:
            vh.t0 r1 = vh.t0.f77514a
            M6.v r1 = M6.d.d(r1, r10, r8, r0)
            M6.s r1 = M6.d.a(r1)
            java.util.List r6 = r1.a(r12, r13)
            goto L_0x0011
        L_0x0060:
            vh.s0 r1 = vh.s0.f77510a
            M6.v r1 = M6.d.c(r1, r8)
            java.lang.Object r1 = r1.a(r12, r13)
            r5 = r1
            vh.f0$l r5 = (vh.C10325f0.l) r5
            goto L_0x0011
        L_0x006e:
            M6.b<java.lang.String> r1 = M6.d.f38532a
            java.lang.Object r1 = r1.a(r12, r13)
            r4 = r1
            java.lang.String r4 = (java.lang.String) r4
            goto L_0x0011
        L_0x0078:
            xh.f r1 = xh.C10402f.f77800a
            wh.f r3 = r1.a(r12, r13)
            goto L_0x0011
        L_0x007f:
            xh.e r1 = xh.C10401e.f77799a
            wh.e r2 = r1.a(r12, r13)
            goto L_0x0011
        */
        throw new UnsupportedOperationException("Method not decompiled: vh.p0.a(Q6.f, M6.k):vh.f0");
    }

    /* renamed from: d */
    public void b(g gVar, k kVar, C10325f0 f0Var) {
        C17542s.j(gVar, "writer");
        C17542s.j(kVar, "customScalarAdapters");
        C17542s.j(f0Var, "value");
        gVar.q1("solution");
        C10401e.f77799a.b(gVar, kVar, f0Var.d());
        gVar.q1("fulfillmentMethodType");
        C10402f.f77800a.b(gVar, kVar, f0Var.b());
        gVar.q1("id");
        d.f38532a.b(gVar, kVar, f0Var.c());
        gVar.q1("solutionPrice");
        d.c(s0.f77510a, true).b(gVar, kVar, f0Var.e());
        gVar.q1("splittedItems");
        d.a(d.d(t0.f77514a, false, 1, (Object) null)).b(gVar, kVar, f0Var.f());
        gVar.q1("deliveries");
        d.a(d.d(C10331i0.f77454a, false, 1, (Object) null)).b(gVar, kVar, f0Var.a());
    }
}
