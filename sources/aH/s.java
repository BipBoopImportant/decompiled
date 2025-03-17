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

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, d2 = {"LAh/s;", "LM6/b;", "LAh/d$n;", "<init>", "()V", "LQ6/f;", "reader", "LM6/k;", "customScalarAdapters", "c", "(LQ6/f;LM6/k;)LAh/d$n;", "LQ6/g;", "writer", "value", "LXH/N;", "d", "(LQ6/g;LM6/k;LAh/d$n;)V", "", "", "b", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;", "RESPONSE_NAMES", "apollo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class s implements C6654b<C9048d.n> {

    /* renamed from: a  reason: collision with root package name */
    public static final s f58846a = new s();

    /* renamed from: b  reason: collision with root package name */
    private static final List<String> f58847b = C16877v.q("inclTax", "exclTax", "tax", "isLowerPrice", "previousPrice", "validFrom", "validTo", "lowestPreviousPrice");

    private s() {
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v8, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v3, resolved type: Ah.d$h} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v16, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v3, resolved type: Ah.d$e} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public Ah.C9048d.n a(Q6.f r12, M6.k r13) {
        /*
            r11 = this;
            java.lang.String r0 = "reader"
            kotlin.jvm.internal.C17542s.j(r12, r0)
            java.lang.String r0 = "customScalarAdapters"
            kotlin.jvm.internal.C17542s.j(r13, r0)
            r0 = 0
            r1 = r0
            r2 = r1
            r5 = r2
            r7 = r5
            r8 = r7
            r9 = r8
            r10 = r9
        L_0x0012:
            java.util.List<java.lang.String> r3 = f58847b
            int r3 = r12.T2(r3)
            r4 = 1
            switch(r3) {
                case 0: goto L_0x0085;
                case 1: goto L_0x007c;
                case 2: goto L_0x0072;
                case 3: goto L_0x0069;
                case 4: goto L_0x0057;
                case 5: goto L_0x004d;
                case 6: goto L_0x0043;
                case 7: goto L_0x0031;
                default: goto L_0x001c;
            }
        L_0x001c:
            Ah.d$n r12 = new Ah.d$n
            kotlin.jvm.internal.C17542s.g(r0)
            double r3 = r0.doubleValue()
            kotlin.jvm.internal.C17542s.g(r1)
            boolean r6 = r1.booleanValue()
            r1 = r12
            r1.<init>(r2, r3, r5, r6, r7, r8, r9, r10)
            return r12
        L_0x0031:
            Ah.j r3 = Ah.j.f58828a
            M6.v r3 = M6.d.c(r3, r4)
            M6.u r3 = M6.d.b(r3)
            java.lang.Object r3 = r3.a(r12, r13)
            r10 = r3
            Ah.d$e r10 = (Ah.C9048d.e) r10
            goto L_0x0012
        L_0x0043:
            M6.u<java.lang.String> r3 = M6.d.f38540i
            java.lang.Object r3 = r3.a(r12, r13)
            r9 = r3
            java.lang.String r9 = (java.lang.String) r9
            goto L_0x0012
        L_0x004d:
            M6.u<java.lang.String> r3 = M6.d.f38540i
            java.lang.Object r3 = r3.a(r12, r13)
            r8 = r3
            java.lang.String r8 = (java.lang.String) r8
            goto L_0x0012
        L_0x0057:
            Ah.m r3 = Ah.m.f58834a
            M6.v r3 = M6.d.c(r3, r4)
            M6.u r3 = M6.d.b(r3)
            java.lang.Object r3 = r3.a(r12, r13)
            r7 = r3
            Ah.d$h r7 = (Ah.C9048d.h) r7
            goto L_0x0012
        L_0x0069:
            M6.b<java.lang.Boolean> r1 = M6.d.f38537f
            java.lang.Object r1 = r1.a(r12, r13)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            goto L_0x0012
        L_0x0072:
            M6.u<java.lang.Double> r3 = M6.d.f38541j
            java.lang.Object r3 = r3.a(r12, r13)
            r5 = r3
            java.lang.Double r5 = (java.lang.Double) r5
            goto L_0x0012
        L_0x007c:
            M6.b<java.lang.Double> r0 = M6.d.f38534c
            java.lang.Object r0 = r0.a(r12, r13)
            java.lang.Double r0 = (java.lang.Double) r0
            goto L_0x0012
        L_0x0085:
            M6.u<java.lang.Double> r2 = M6.d.f38541j
            java.lang.Object r2 = r2.a(r12, r13)
            java.lang.Double r2 = (java.lang.Double) r2
            goto L_0x0012
        */
        throw new UnsupportedOperationException("Method not decompiled: Ah.s.a(Q6.f, M6.k):Ah.d$n");
    }

    /* renamed from: d */
    public void b(g gVar, k kVar, C9048d.n nVar) {
        C17542s.j(gVar, "writer");
        C17542s.j(kVar, "customScalarAdapters");
        C17542s.j(nVar, "value");
        gVar.q1("inclTax");
        u<Double> uVar = d.f38541j;
        uVar.b(gVar, kVar, nVar.b());
        gVar.q1("exclTax");
        d.f38534c.b(gVar, kVar, Double.valueOf(nVar.a()));
        gVar.q1("tax");
        uVar.b(gVar, kVar, nVar.e());
        gVar.q1("isLowerPrice");
        d.f38537f.b(gVar, kVar, Boolean.valueOf(nVar.h()));
        gVar.q1("previousPrice");
        d.b(d.c(m.f58834a, true)).b(gVar, kVar, nVar.d());
        gVar.q1("validFrom");
        u<String> uVar2 = d.f38540i;
        uVar2.b(gVar, kVar, nVar.f());
        gVar.q1("validTo");
        uVar2.b(gVar, kVar, nVar.g());
        gVar.q1("lowestPreviousPrice");
        d.b(d.c(j.f58828a, true)).b(gVar, kVar, nVar.c());
    }
}
