package vh;

import M6.C6654b;
import M6.d;
import M6.k;
import Q6.g;
import YH.C16877v;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import vh.C10343u;
import xh.C10403g;
import xh.C10404h;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, d2 = {"Lvh/w;", "LM6/b;", "Lvh/u$b;", "<init>", "()V", "LQ6/f;", "reader", "LM6/k;", "customScalarAdapters", "c", "(LQ6/f;LM6/k;)Lvh/u$b;", "LQ6/g;", "writer", "value", "LXH/N;", "d", "(LQ6/g;LM6/k;Lvh/u$b;)V", "", "", "b", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;", "RESPONSE_NAMES", "apollo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: vh.w  reason: case insensitive filesystem */
public final class C10345w implements C6654b<C10343u.b> {

    /* renamed from: a  reason: collision with root package name */
    public static final C10345w f77561a = new C10345w();

    /* renamed from: b  reason: collision with root package name */
    private static final List<String> f77562b = C16877v.q("id", "serviceItemId", "type", "availablePickUpPoints", "deliveryType", "earliestTimeWindow", "deliveryItems");

    private C10345w() {
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v11, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v3, resolved type: vh.u$a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v16, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v3, resolved type: vh.u$e} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v21, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v3, resolved type: java.util.List} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public vh.C10343u.b a(Q6.f r12, M6.k r13) {
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
            java.util.List<java.lang.String> r1 = f77562b
            int r1 = r12.T2(r1)
            r9 = 0
            r10 = 1
            switch(r1) {
                case 0: goto L_0x0082;
                case 1: goto L_0x0078;
                case 2: goto L_0x0071;
                case 3: goto L_0x005f;
                case 4: goto L_0x0058;
                case 5: goto L_0x0046;
                case 6: goto L_0x0030;
                default: goto L_0x001d;
            }
        L_0x001d:
            vh.u$b r12 = new vh.u$b
            kotlin.jvm.internal.C17542s.g(r2)
            kotlin.jvm.internal.C17542s.g(r3)
            kotlin.jvm.internal.C17542s.g(r4)
            kotlin.jvm.internal.C17542s.g(r6)
            r1 = r12
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)
            return r12
        L_0x0030:
            vh.y r1 = vh.C10347y.f77572a
            M6.v r1 = M6.d.d(r1, r9, r10, r0)
            M6.s r1 = M6.d.a(r1)
            M6.u r1 = M6.d.b(r1)
            java.lang.Object r1 = r1.a(r12, r13)
            r8 = r1
            java.util.List r8 = (java.util.List) r8
            goto L_0x0012
        L_0x0046:
            vh.A r1 = vh.C10310A.f77196a
            M6.v r1 = M6.d.c(r1, r10)
            M6.u r1 = M6.d.b(r1)
            java.lang.Object r1 = r1.a(r12, r13)
            r7 = r1
            vh.u$e r7 = (vh.C10343u.e) r7
            goto L_0x0012
        L_0x0058:
            xh.g r1 = xh.C10403g.f77801a
            wh.g r6 = r1.a(r12, r13)
            goto L_0x0012
        L_0x005f:
            vh.v r1 = vh.C10344v.f77557a
            M6.v r1 = M6.d.d(r1, r9, r10, r0)
            M6.u r1 = M6.d.b(r1)
            java.lang.Object r1 = r1.a(r12, r13)
            r5 = r1
            vh.u$a r5 = (vh.C10343u.a) r5
            goto L_0x0012
        L_0x0071:
            xh.h r1 = xh.C10404h.f77802a
            wh.h r4 = r1.a(r12, r13)
            goto L_0x0012
        L_0x0078:
            M6.b<java.lang.String> r1 = M6.d.f38532a
            java.lang.Object r1 = r1.a(r12, r13)
            r3 = r1
            java.lang.String r3 = (java.lang.String) r3
            goto L_0x0012
        L_0x0082:
            M6.b<java.lang.String> r1 = M6.d.f38532a
            java.lang.Object r1 = r1.a(r12, r13)
            r2 = r1
            java.lang.String r2 = (java.lang.String) r2
            goto L_0x0012
        */
        throw new UnsupportedOperationException("Method not decompiled: vh.C10345w.a(Q6.f, M6.k):vh.u$b");
    }

    /* renamed from: d */
    public void b(g gVar, k kVar, C10343u.b bVar) {
        C17542s.j(gVar, "writer");
        C17542s.j(kVar, "customScalarAdapters");
        C17542s.j(bVar, "value");
        gVar.q1("id");
        C6654b<String> bVar2 = d.f38532a;
        bVar2.b(gVar, kVar, bVar.e());
        gVar.q1("serviceItemId");
        bVar2.b(gVar, kVar, bVar.f());
        gVar.q1("type");
        C10404h.f77802a.b(gVar, kVar, bVar.g());
        gVar.q1("availablePickUpPoints");
        d.b(d.d(C10344v.f77557a, false, 1, (Object) null)).b(gVar, kVar, bVar.a());
        gVar.q1("deliveryType");
        C10403g.f77801a.b(gVar, kVar, bVar.c());
        gVar.q1("earliestTimeWindow");
        d.b(d.c(C10310A.f77196a, true)).b(gVar, kVar, bVar.d());
        gVar.q1("deliveryItems");
        d.b(d.a(d.d(C10347y.f77572a, false, 1, (Object) null))).b(gVar, kVar, bVar.b());
    }
}
