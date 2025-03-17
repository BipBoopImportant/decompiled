package vh;

import M6.C6654b;
import M6.d;
import M6.k;
import M6.u;
import Q6.g;
import YH.C16877v;
import com.google.android.libraries.places.api.model.PlaceTypes;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import xh.C10409m;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, d2 = {"Lvh/V;", "LM6/b;", "Lvh/Q;", "<init>", "()V", "LQ6/f;", "reader", "LM6/k;", "customScalarAdapters", "c", "(LQ6/f;LM6/k;)Lvh/Q;", "LQ6/g;", "writer", "value", "LXH/N;", "d", "(LQ6/g;LM6/k;Lvh/Q;)V", "", "", "b", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;", "RESPONSE_NAMES", "apollo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class V implements C6654b<Q> {

    /* renamed from: a  reason: collision with root package name */
    public static final V f77319a = new V();

    /* renamed from: b  reason: collision with root package name */
    private static final List<String> f77320b = C16877v.q("ocPUPId", "identifier", "price", "selectable", PlaceTypes.ADDRESS, "openingHours", "earliestTimeWindow", "distance", "name", "latitude", "longitude");

    private V() {
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v10, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v3, resolved type: vh.Q$d} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v14, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v3, resolved type: vh.Q$a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v17, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v3, resolved type: vh.Q$c} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v21, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v3, resolved type: vh.Q$b} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public vh.Q a(Q6.f r17, M6.k r18) {
        /*
            r16 = this;
            r0 = r17
            r1 = r18
            java.lang.String r2 = "reader"
            kotlin.jvm.internal.C17542s.j(r0, r2)
            java.lang.String r2 = "customScalarAdapters"
            kotlin.jvm.internal.C17542s.j(r1, r2)
            r2 = 0
            r4 = r2
            r5 = r4
            r6 = r5
            r7 = r6
            r8 = r7
            r9 = r8
            r10 = r9
            r13 = r10
            r14 = r13
            r15 = r14
        L_0x0019:
            java.util.List<java.lang.String> r3 = f77320b
            int r3 = r0.T2(r3)
            r11 = 1
            switch(r3) {
                case 0: goto L_0x00be;
                case 1: goto L_0x00b3;
                case 2: goto L_0x00a0;
                case 3: goto L_0x0098;
                case 4: goto L_0x008a;
                case 5: goto L_0x007c;
                case 6: goto L_0x006a;
                case 7: goto L_0x0061;
                case 8: goto L_0x0057;
                case 9: goto L_0x004d;
                case 10: goto L_0x0043;
                default: goto L_0x0023;
            }
        L_0x0023:
            vh.Q r0 = new vh.Q
            kotlin.jvm.internal.C17542s.g(r4)
            kotlin.jvm.internal.C17542s.g(r5)
            kotlin.jvm.internal.C17542s.g(r7)
            kotlin.jvm.internal.C17542s.g(r8)
            kotlin.jvm.internal.C17542s.g(r9)
            kotlin.jvm.internal.C17542s.g(r2)
            double r11 = r2.doubleValue()
            kotlin.jvm.internal.C17542s.g(r13)
            r3 = r0
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r13, r14, r15)
            return r0
        L_0x0043:
            M6.u<java.lang.Double> r3 = M6.d.f38541j
            java.lang.Object r3 = r3.a(r0, r1)
            r15 = r3
            java.lang.Double r15 = (java.lang.Double) r15
            goto L_0x0019
        L_0x004d:
            M6.u<java.lang.Double> r3 = M6.d.f38541j
            java.lang.Object r3 = r3.a(r0, r1)
            r14 = r3
            java.lang.Double r14 = (java.lang.Double) r14
            goto L_0x0019
        L_0x0057:
            M6.b<java.lang.String> r3 = M6.d.f38532a
            java.lang.Object r3 = r3.a(r0, r1)
            r13 = r3
            java.lang.String r13 = (java.lang.String) r13
            goto L_0x0019
        L_0x0061:
            M6.b<java.lang.Double> r2 = M6.d.f38534c
            java.lang.Object r2 = r2.a(r0, r1)
            java.lang.Double r2 = (java.lang.Double) r2
            goto L_0x0019
        L_0x006a:
            vh.T r3 = vh.T.f77315a
            M6.v r3 = M6.d.c(r3, r11)
            M6.u r3 = M6.d.b(r3)
            java.lang.Object r3 = r3.a(r0, r1)
            r10 = r3
            vh.Q$b r10 = (vh.Q.b) r10
            goto L_0x0019
        L_0x007c:
            vh.U r3 = vh.U.f77317a
            M6.v r3 = M6.d.c(r3, r11)
            java.lang.Object r3 = r3.a(r0, r1)
            r9 = r3
            vh.Q$c r9 = (vh.Q.c) r9
            goto L_0x0019
        L_0x008a:
            vh.S r3 = vh.S.f77313a
            M6.v r3 = M6.d.c(r3, r11)
            java.lang.Object r3 = r3.a(r0, r1)
            r8 = r3
            vh.Q$a r8 = (vh.Q.a) r8
            goto L_0x0019
        L_0x0098:
            xh.m r3 = xh.C10409m.f77807a
            wh.m r7 = r3.a(r0, r1)
            goto L_0x0019
        L_0x00a0:
            vh.W r3 = vh.W.f77321a
            M6.v r3 = M6.d.c(r3, r11)
            M6.u r3 = M6.d.b(r3)
            java.lang.Object r3 = r3.a(r0, r1)
            r6 = r3
            vh.Q$d r6 = (vh.Q.d) r6
            goto L_0x0019
        L_0x00b3:
            M6.b<java.lang.String> r3 = M6.d.f38532a
            java.lang.Object r3 = r3.a(r0, r1)
            r5 = r3
            java.lang.String r5 = (java.lang.String) r5
            goto L_0x0019
        L_0x00be:
            M6.b<java.lang.String> r3 = M6.d.f38532a
            java.lang.Object r3 = r3.a(r0, r1)
            r4 = r3
            java.lang.String r4 = (java.lang.String) r4
            goto L_0x0019
        */
        throw new UnsupportedOperationException("Method not decompiled: vh.V.a(Q6.f, M6.k):vh.Q");
    }

    /* renamed from: d */
    public void b(g gVar, k kVar, Q q10) {
        C17542s.j(gVar, "writer");
        C17542s.j(kVar, "customScalarAdapters");
        C17542s.j(q10, "value");
        gVar.q1("ocPUPId");
        C6654b<String> bVar = d.f38532a;
        bVar.b(gVar, kVar, q10.h());
        gVar.q1("identifier");
        bVar.b(gVar, kVar, q10.d());
        gVar.q1("price");
        d.b(d.c(W.f77321a, true)).b(gVar, kVar, q10.j());
        gVar.q1("selectable");
        C10409m.f77807a.b(gVar, kVar, q10.k());
        gVar.q1(PlaceTypes.ADDRESS);
        d.c(S.f77313a, true).b(gVar, kVar, q10.a());
        gVar.q1("openingHours");
        d.c(U.f77317a, true).b(gVar, kVar, q10.i());
        gVar.q1("earliestTimeWindow");
        d.b(d.c(T.f77315a, true)).b(gVar, kVar, q10.c());
        gVar.q1("distance");
        d.f38534c.b(gVar, kVar, Double.valueOf(q10.b()));
        gVar.q1("name");
        bVar.b(gVar, kVar, q10.g());
        gVar.q1("latitude");
        u<Double> uVar = d.f38541j;
        uVar.b(gVar, kVar, q10.e());
        gVar.q1("longitude");
        uVar.b(gVar, kVar, q10.f());
    }
}
