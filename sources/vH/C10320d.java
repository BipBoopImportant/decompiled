package vh;

import M6.C6654b;
import M6.d;
import M6.k;
import Q6.g;
import YH.C16877v;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, d2 = {"Lvh/d;", "LM6/b;", "Lvh/c;", "<init>", "()V", "LQ6/f;", "reader", "LM6/k;", "customScalarAdapters", "c", "(LQ6/f;LM6/k;)Lvh/c;", "LQ6/g;", "writer", "value", "LXH/N;", "d", "(LQ6/g;LM6/k;Lvh/c;)V", "", "", "b", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;", "RESPONSE_NAMES", "apollo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: vh.d  reason: case insensitive filesystem */
public final class C10320d implements C6654b<C10318c> {

    /* renamed from: a  reason: collision with root package name */
    public static final C10320d f77384a = new C10320d();

    /* renamed from: b  reason: collision with root package name */
    private static final List<String> f77385b = C16877v.q("serviceArea", "checkoutId", "orderNumber", "orderTotal", "totalPrice", "shippingPrice", "items");

    private C10320d() {
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v5, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v3, resolved type: vh.c$c} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v12, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v3, resolved type: vh.c$b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v15, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v3, resolved type: vh.c$f} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v19, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v3, resolved type: vh.c$d} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public vh.C10318c a(Q6.f r12, M6.k r13) {
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
            r8 = r7
        L_0x0012:
            java.util.List<java.lang.String> r1 = f77385b
            int r1 = r12.T2(r1)
            r9 = 0
            r10 = 1
            switch(r1) {
                case 0: goto L_0x0084;
                case 1: goto L_0x007a;
                case 2: goto L_0x0070;
                case 3: goto L_0x0062;
                case 4: goto L_0x0054;
                case 5: goto L_0x0042;
                case 6: goto L_0x0033;
                default: goto L_0x001d;
            }
        L_0x001d:
            vh.c r12 = new vh.c
            kotlin.jvm.internal.C17542s.g(r2)
            kotlin.jvm.internal.C17542s.g(r3)
            kotlin.jvm.internal.C17542s.g(r5)
            kotlin.jvm.internal.C17542s.g(r6)
            kotlin.jvm.internal.C17542s.g(r8)
            r1 = r12
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)
            return r12
        L_0x0033:
            vh.e r1 = vh.C10322e.f77388a
            M6.v r1 = M6.d.d(r1, r9, r10, r0)
            M6.s r1 = M6.d.a(r1)
            java.util.List r8 = r1.a(r12, r13)
            goto L_0x0012
        L_0x0042:
            vh.h r1 = vh.C10328h.f77448a
            M6.v r1 = M6.d.c(r1, r10)
            M6.u r1 = M6.d.b(r1)
            java.lang.Object r1 = r1.a(r12, r13)
            r7 = r1
            vh.c$d r7 = (vh.C10318c.d) r7
            goto L_0x0012
        L_0x0054:
            vh.j r1 = vh.C10332j.f77456a
            M6.v r1 = M6.d.c(r1, r10)
            java.lang.Object r1 = r1.a(r12, r13)
            r6 = r1
            vh.c$f r6 = (vh.C10318c.f) r6
            goto L_0x0012
        L_0x0062:
            vh.f r1 = vh.C10324f.f77392a
            M6.v r1 = M6.d.c(r1, r10)
            java.lang.Object r1 = r1.a(r12, r13)
            r5 = r1
            vh.c$b r5 = (vh.C10318c.b) r5
            goto L_0x0012
        L_0x0070:
            M6.u<java.lang.String> r1 = M6.d.f38540i
            java.lang.Object r1 = r1.a(r12, r13)
            r4 = r1
            java.lang.String r4 = (java.lang.String) r4
            goto L_0x0012
        L_0x007a:
            M6.b<java.lang.String> r1 = M6.d.f38532a
            java.lang.Object r1 = r1.a(r12, r13)
            r3 = r1
            java.lang.String r3 = (java.lang.String) r3
            goto L_0x0012
        L_0x0084:
            vh.g r1 = vh.C10326g.f77444a
            M6.v r1 = M6.d.d(r1, r9, r10, r0)
            java.lang.Object r1 = r1.a(r12, r13)
            r2 = r1
            vh.c$c r2 = (vh.C10318c.C1431c) r2
            goto L_0x0012
        */
        throw new UnsupportedOperationException("Method not decompiled: vh.C10320d.a(Q6.f, M6.k):vh.c");
    }

    /* renamed from: d */
    public void b(g gVar, k kVar, C10318c cVar) {
        C17542s.j(gVar, "writer");
        C17542s.j(kVar, "customScalarAdapters");
        C17542s.j(cVar, "value");
        gVar.q1("serviceArea");
        d.d(C10326g.f77444a, false, 1, (Object) null).b(gVar, kVar, cVar.e());
        gVar.q1("checkoutId");
        d.f38532a.b(gVar, kVar, cVar.a());
        gVar.q1("orderNumber");
        d.f38540i.b(gVar, kVar, cVar.c());
        gVar.q1("orderTotal");
        d.c(C10324f.f77392a, true).b(gVar, kVar, cVar.d());
        gVar.q1("totalPrice");
        d.c(C10332j.f77456a, true).b(gVar, kVar, cVar.g());
        gVar.q1("shippingPrice");
        d.b(d.c(C10328h.f77448a, true)).b(gVar, kVar, cVar.f());
        gVar.q1("items");
        d.a(d.d(C10322e.f77388a, false, 1, (Object) null)).b(gVar, kVar, cVar.b());
    }
}
