package Ah;

import Ah.C9048d;
import M6.C6654b;
import M6.d;
import M6.k;
import M6.u;
import Q6.g;
import YH.C16877v;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, d2 = {"LAh/r;", "LM6/b;", "LAh/d$m;", "<init>", "()V", "LQ6/f;", "reader", "LM6/k;", "customScalarAdapters", "c", "(LQ6/f;LM6/k;)LAh/d$m;", "LQ6/g;", "writer", "value", "LXH/N;", "d", "(LQ6/g;LM6/k;LAh/d$m;)V", "", "", "b", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;", "RESPONSE_NAMES", "apollo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class r implements C6654b<C9048d.m> {

    /* renamed from: a  reason: collision with root package name */
    public static final r f58844a = new r();

    /* renamed from: b  reason: collision with root package name */
    private static final List<String> f58845b = C16877v.q("inclTax", "exclTax", "tax", "validFrom", "validTo", "lowestPreviousPrice");

    private r() {
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v14, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v3, resolved type: Ah.d$d} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public Ah.C9048d.m a(Q6.f r10, M6.k r11) {
        /*
            r9 = this;
            java.lang.String r0 = "reader"
            kotlin.jvm.internal.C17542s.j(r10, r0)
            java.lang.String r0 = "customScalarAdapters"
            kotlin.jvm.internal.C17542s.j(r11, r0)
            r0 = 0
            r2 = r0
            r5 = r2
            r6 = r5
            r7 = r6
            r8 = r7
        L_0x0010:
            java.util.List<java.lang.String> r1 = f58845b
            int r1 = r10.T2(r1)
            if (r1 == 0) goto L_0x006e
            r3 = 1
            if (r1 == r3) goto L_0x0065
            r4 = 2
            if (r1 == r4) goto L_0x005b
            r4 = 3
            if (r1 == r4) goto L_0x0051
            r4 = 4
            if (r1 == r4) goto L_0x0047
            r4 = 5
            if (r1 == r4) goto L_0x0035
            Ah.d$m r10 = new Ah.d$m
            kotlin.jvm.internal.C17542s.g(r0)
            double r3 = r0.doubleValue()
            r1 = r10
            r1.<init>(r2, r3, r5, r6, r7, r8)
            return r10
        L_0x0035:
            Ah.i r1 = Ah.i.f58826a
            M6.v r1 = M6.d.c(r1, r3)
            M6.u r1 = M6.d.b(r1)
            java.lang.Object r1 = r1.a(r10, r11)
            r8 = r1
            Ah.d$d r8 = (Ah.C9048d.C0962d) r8
            goto L_0x0010
        L_0x0047:
            M6.u<java.lang.String> r1 = M6.d.f38540i
            java.lang.Object r1 = r1.a(r10, r11)
            r7 = r1
            java.lang.String r7 = (java.lang.String) r7
            goto L_0x0010
        L_0x0051:
            M6.u<java.lang.String> r1 = M6.d.f38540i
            java.lang.Object r1 = r1.a(r10, r11)
            r6 = r1
            java.lang.String r6 = (java.lang.String) r6
            goto L_0x0010
        L_0x005b:
            M6.u<java.lang.Double> r1 = M6.d.f38541j
            java.lang.Object r1 = r1.a(r10, r11)
            r5 = r1
            java.lang.Double r5 = (java.lang.Double) r5
            goto L_0x0010
        L_0x0065:
            M6.b<java.lang.Double> r0 = M6.d.f38534c
            java.lang.Object r0 = r0.a(r10, r11)
            java.lang.Double r0 = (java.lang.Double) r0
            goto L_0x0010
        L_0x006e:
            M6.u<java.lang.Double> r1 = M6.d.f38541j
            java.lang.Object r1 = r1.a(r10, r11)
            r2 = r1
            java.lang.Double r2 = (java.lang.Double) r2
            goto L_0x0010
        */
        throw new UnsupportedOperationException("Method not decompiled: Ah.r.a(Q6.f, M6.k):Ah.d$m");
    }

    /* renamed from: d */
    public void b(g gVar, k kVar, C9048d.m mVar) {
        C17542s.j(gVar, "writer");
        C17542s.j(kVar, "customScalarAdapters");
        C17542s.j(mVar, "value");
        gVar.q1("inclTax");
        u<Double> uVar = d.f38541j;
        uVar.b(gVar, kVar, mVar.b());
        gVar.q1("exclTax");
        d.f38534c.b(gVar, kVar, Double.valueOf(mVar.a()));
        gVar.q1("tax");
        uVar.b(gVar, kVar, mVar.d());
        gVar.q1("validFrom");
        u<String> uVar2 = d.f38540i;
        uVar2.b(gVar, kVar, mVar.e());
        gVar.q1("validTo");
        uVar2.b(gVar, kVar, mVar.f());
        gVar.q1("lowestPreviousPrice");
        d.b(d.c(i.f58826a, true)).b(gVar, kVar, mVar.c());
    }
}
