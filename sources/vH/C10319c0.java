package vh;

import M6.C6654b;
import M6.d;
import M6.k;
import M6.u;
import Q6.g;
import YH.C16877v;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, d2 = {"Lvh/c0;", "LM6/b;", "Lvh/a0;", "<init>", "()V", "LQ6/f;", "reader", "LM6/k;", "customScalarAdapters", "c", "(LQ6/f;LM6/k;)Lvh/a0;", "LQ6/g;", "writer", "value", "LXH/N;", "d", "(LQ6/g;LM6/k;Lvh/a0;)V", "", "", "b", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;", "RESPONSE_NAMES", "apollo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: vh.c0  reason: case insensitive filesystem */
public final class C10319c0 implements C6654b<C10315a0> {

    /* renamed from: a  reason: collision with root package name */
    public static final C10319c0 f77382a = new C10319c0();

    /* renamed from: b  reason: collision with root package name */
    private static final List<String> f77383b = C16877v.q("inclTax", "exclTax", "tax", "taxList", "taxSummaryList", "discountSummary", "type");

    private C10319c0() {
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v13, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v3, resolved type: java.util.List} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v18, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v3, resolved type: java.util.List} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v22, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v4, resolved type: vh.a0$a} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public vh.C10315a0 a(Q6.f r11, M6.k r12) {
        /*
            r10 = this;
            java.lang.String r0 = "reader"
            kotlin.jvm.internal.C17542s.j(r11, r0)
            java.lang.String r0 = "customScalarAdapters"
            kotlin.jvm.internal.C17542s.j(r12, r0)
            r0 = 0
            r2 = r0
            r3 = r2
            r4 = r3
            r5 = r4
            r6 = r5
            r7 = r6
            r8 = r7
        L_0x0012:
            java.util.List<java.lang.String> r1 = f77383b
            int r1 = r11.T2(r1)
            r9 = 1
            switch(r1) {
                case 0: goto L_0x0083;
                case 1: goto L_0x0079;
                case 2: goto L_0x006f;
                case 3: goto L_0x0059;
                case 4: goto L_0x0043;
                case 5: goto L_0x0030;
                case 6: goto L_0x0026;
                default: goto L_0x001c;
            }
        L_0x001c:
            vh.a0 r11 = new vh.a0
            kotlin.jvm.internal.C17542s.g(r8)
            r1 = r11
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)
            return r11
        L_0x0026:
            M6.b<java.lang.String> r1 = M6.d.f38532a
            java.lang.Object r1 = r1.a(r11, r12)
            r8 = r1
            java.lang.String r8 = (java.lang.String) r8
            goto L_0x0012
        L_0x0030:
            vh.b0 r1 = vh.C10317b0.f77357a
            r7 = 0
            M6.v r1 = M6.d.d(r1, r7, r9, r0)
            M6.u r1 = M6.d.b(r1)
            java.lang.Object r1 = r1.a(r11, r12)
            r7 = r1
            vh.a0$a r7 = (vh.C10315a0.a) r7
            goto L_0x0012
        L_0x0043:
            vh.e0 r1 = vh.C10323e0.f77390a
            M6.v r1 = M6.d.c(r1, r9)
            M6.s r1 = M6.d.a(r1)
            M6.u r1 = M6.d.b(r1)
            java.lang.Object r1 = r1.a(r11, r12)
            r6 = r1
            java.util.List r6 = (java.util.List) r6
            goto L_0x0012
        L_0x0059:
            vh.d0 r1 = vh.C10321d0.f77386a
            M6.v r1 = M6.d.c(r1, r9)
            M6.s r1 = M6.d.a(r1)
            M6.u r1 = M6.d.b(r1)
            java.lang.Object r1 = r1.a(r11, r12)
            r5 = r1
            java.util.List r5 = (java.util.List) r5
            goto L_0x0012
        L_0x006f:
            M6.u<java.lang.Double> r1 = M6.d.f38541j
            java.lang.Object r1 = r1.a(r11, r12)
            r4 = r1
            java.lang.Double r4 = (java.lang.Double) r4
            goto L_0x0012
        L_0x0079:
            M6.u<java.lang.Double> r1 = M6.d.f38541j
            java.lang.Object r1 = r1.a(r11, r12)
            r3 = r1
            java.lang.Double r3 = (java.lang.Double) r3
            goto L_0x0012
        L_0x0083:
            M6.u<java.lang.Double> r1 = M6.d.f38541j
            java.lang.Object r1 = r1.a(r11, r12)
            r2 = r1
            java.lang.Double r2 = (java.lang.Double) r2
            goto L_0x0012
        */
        throw new UnsupportedOperationException("Method not decompiled: vh.C10319c0.a(Q6.f, M6.k):vh.a0");
    }

    /* renamed from: d */
    public void b(g gVar, k kVar, C10315a0 a0Var) {
        C17542s.j(gVar, "writer");
        C17542s.j(kVar, "customScalarAdapters");
        C17542s.j(a0Var, "value");
        gVar.q1("inclTax");
        u<Double> uVar = d.f38541j;
        uVar.b(gVar, kVar, a0Var.c());
        gVar.q1("exclTax");
        uVar.b(gVar, kVar, a0Var.b());
        gVar.q1("tax");
        uVar.b(gVar, kVar, a0Var.d());
        gVar.q1("taxList");
        d.b(d.a(d.c(C10321d0.f77386a, true))).b(gVar, kVar, a0Var.e());
        gVar.q1("taxSummaryList");
        d.b(d.a(d.c(C10323e0.f77390a, true))).b(gVar, kVar, a0Var.f());
        gVar.q1("discountSummary");
        d.b(d.d(C10317b0.f77357a, false, 1, (Object) null)).b(gVar, kVar, a0Var.a());
        gVar.q1("type");
        d.f38532a.b(gVar, kVar, a0Var.g());
    }
}
