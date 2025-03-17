package vh;

import M6.C6654b;
import M6.d;
import M6.k;
import Q6.g;
import YH.C16877v;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import vh.C10325f0;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, d2 = {"Lvh/r0;", "LM6/b;", "Lvh/f0$k;", "<init>", "()V", "LQ6/f;", "reader", "LM6/k;", "customScalarAdapters", "c", "(LQ6/f;LM6/k;)Lvh/f0$k;", "LQ6/g;", "writer", "value", "LXH/N;", "d", "(LQ6/g;LM6/k;Lvh/f0$k;)V", "", "", "b", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;", "RESPONSE_NAMES", "apollo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class r0 implements C6654b<C10325f0.k> {

    /* renamed from: a  reason: collision with root package name */
    public static final r0 f77506a = new r0();

    /* renamed from: b  reason: collision with root package name */
    private static final List<String> f77507b = C16877v.q("fromDateTime", "id", "price", "toDateTime", "timeZone", "capability");

    private r0() {
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v9, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v3, resolved type: vh.f0$i} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v19, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v3, resolved type: java.util.List} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public vh.C10325f0.k a(Q6.f r12, M6.k r13) {
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
            java.util.List<java.lang.String> r1 = f77507b
            int r1 = r12.T2(r1)
            if (r1 == 0) goto L_0x0082
            r8 = 1
            if (r1 == r8) goto L_0x0078
            r9 = 2
            r10 = 0
            if (r1 == r9) goto L_0x0066
            r9 = 3
            if (r1 == r9) goto L_0x005c
            r9 = 4
            if (r1 == r9) goto L_0x0052
            r9 = 5
            if (r1 == r9) goto L_0x003c
            vh.f0$k r12 = new vh.f0$k
            kotlin.jvm.internal.C17542s.g(r2)
            kotlin.jvm.internal.C17542s.g(r3)
            kotlin.jvm.internal.C17542s.g(r5)
            kotlin.jvm.internal.C17542s.g(r6)
            r1 = r12
            r1.<init>(r2, r3, r4, r5, r6, r7)
            return r12
        L_0x003c:
            vh.h0 r1 = vh.C10329h0.f77450a
            M6.v r1 = M6.d.d(r1, r10, r8, r0)
            M6.s r1 = M6.d.a(r1)
            M6.u r1 = M6.d.b(r1)
            java.lang.Object r1 = r1.a(r12, r13)
            r7 = r1
            java.util.List r7 = (java.util.List) r7
            goto L_0x0011
        L_0x0052:
            M6.b<java.lang.String> r1 = M6.d.f38532a
            java.lang.Object r1 = r1.a(r12, r13)
            r6 = r1
            java.lang.String r6 = (java.lang.String) r6
            goto L_0x0011
        L_0x005c:
            M6.b<java.lang.String> r1 = M6.d.f38532a
            java.lang.Object r1 = r1.a(r12, r13)
            r5 = r1
            java.lang.String r5 = (java.lang.String) r5
            goto L_0x0011
        L_0x0066:
            vh.o0 r1 = vh.o0.f77488a
            M6.v r1 = M6.d.d(r1, r10, r8, r0)
            M6.u r1 = M6.d.b(r1)
            java.lang.Object r1 = r1.a(r12, r13)
            r4 = r1
            vh.f0$i r4 = (vh.C10325f0.i) r4
            goto L_0x0011
        L_0x0078:
            M6.b<java.lang.String> r1 = M6.d.f38532a
            java.lang.Object r1 = r1.a(r12, r13)
            r3 = r1
            java.lang.String r3 = (java.lang.String) r3
            goto L_0x0011
        L_0x0082:
            M6.b<java.lang.String> r1 = M6.d.f38532a
            java.lang.Object r1 = r1.a(r12, r13)
            r2 = r1
            java.lang.String r2 = (java.lang.String) r2
            goto L_0x0011
        */
        throw new UnsupportedOperationException("Method not decompiled: vh.r0.a(Q6.f, M6.k):vh.f0$k");
    }

    /* renamed from: d */
    public void b(g gVar, k kVar, C10325f0.k kVar2) {
        C17542s.j(gVar, "writer");
        C17542s.j(kVar, "customScalarAdapters");
        C17542s.j(kVar2, "value");
        gVar.q1("fromDateTime");
        C6654b<String> bVar = d.f38532a;
        bVar.b(gVar, kVar, kVar2.b());
        gVar.q1("id");
        bVar.b(gVar, kVar, kVar2.c());
        gVar.q1("price");
        d.b(d.d(o0.f77488a, false, 1, (Object) null)).b(gVar, kVar, kVar2.d());
        gVar.q1("toDateTime");
        bVar.b(gVar, kVar, kVar2.f());
        gVar.q1("timeZone");
        bVar.b(gVar, kVar, kVar2.e());
        gVar.q1("capability");
        d.b(d.a(d.d(C10329h0.f77450a, false, 1, (Object) null))).b(gVar, kVar, kVar2.a());
    }
}
