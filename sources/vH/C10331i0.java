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
import xh.C10404h;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, d2 = {"Lvh/i0;", "LM6/b;", "Lvh/f0$c;", "<init>", "()V", "LQ6/f;", "reader", "LM6/k;", "customScalarAdapters", "c", "(LQ6/f;LM6/k;)Lvh/f0$c;", "LQ6/g;", "writer", "value", "LXH/N;", "d", "(LQ6/g;LM6/k;Lvh/f0$c;)V", "", "", "b", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;", "RESPONSE_NAMES", "apollo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: vh.i0  reason: case insensitive filesystem */
public final class C10331i0 implements C6654b<C10325f0.c> {

    /* renamed from: a  reason: collision with root package name */
    public static final C10331i0 f77454a = new C10331i0();

    /* renamed from: b  reason: collision with root package name */
    private static final List<String> f77455b = C16877v.q("deliveryItems", "id", "rangeOfDays", "selectedTimeWindow", "serviceItemId", "type", "selectedPickUpPoint", "presentation");

    private C10331i0() {
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v5, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v3, resolved type: vh.f0$k} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v12, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v3, resolved type: vh.f0$j} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v15, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v3, resolved type: vh.f0$h} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public vh.C10325f0.c a(Q6.f r13, M6.k r14) {
        /*
            r12 = this;
            java.lang.String r0 = "reader"
            kotlin.jvm.internal.C17542s.j(r13, r0)
            java.lang.String r0 = "customScalarAdapters"
            kotlin.jvm.internal.C17542s.j(r14, r0)
            r0 = 0
            r1 = r0
            r2 = r1
            r3 = r2
            r5 = r3
            r6 = r5
            r7 = r6
            r8 = r7
            r9 = r8
        L_0x0013:
            java.util.List<java.lang.String> r4 = f77455b
            int r4 = r13.T2(r4)
            r10 = 1
            r11 = 0
            switch(r4) {
                case 0: goto L_0x008f;
                case 1: goto L_0x0086;
                case 2: goto L_0x007d;
                case 3: goto L_0x006f;
                case 4: goto L_0x0065;
                case 5: goto L_0x005e;
                case 6: goto L_0x004c;
                case 7: goto L_0x003e;
                default: goto L_0x001e;
            }
        L_0x001e:
            vh.f0$c r13 = new vh.f0$c
            kotlin.jvm.internal.C17542s.g(r2)
            kotlin.jvm.internal.C17542s.g(r3)
            kotlin.jvm.internal.C17542s.g(r1)
            boolean r4 = r1.booleanValue()
            kotlin.jvm.internal.C17542s.g(r5)
            kotlin.jvm.internal.C17542s.g(r6)
            kotlin.jvm.internal.C17542s.g(r7)
            kotlin.jvm.internal.C17542s.g(r9)
            r1 = r13
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9)
            return r13
        L_0x003e:
            vh.n0 r4 = vh.n0.f77484a
            M6.v r4 = M6.d.d(r4, r11, r10, r0)
            java.lang.Object r4 = r4.a(r13, r14)
            r9 = r4
            vh.f0$h r9 = (vh.C10325f0.h) r9
            goto L_0x0013
        L_0x004c:
            vh.q0 r4 = vh.q0.f77502a
            M6.v r4 = M6.d.d(r4, r11, r10, r0)
            M6.u r4 = M6.d.b(r4)
            java.lang.Object r4 = r4.a(r13, r14)
            r8 = r4
            vh.f0$j r8 = (vh.C10325f0.j) r8
            goto L_0x0013
        L_0x005e:
            xh.h r4 = xh.C10404h.f77802a
            wh.h r7 = r4.a(r13, r14)
            goto L_0x0013
        L_0x0065:
            M6.b<java.lang.String> r4 = M6.d.f38532a
            java.lang.Object r4 = r4.a(r13, r14)
            r6 = r4
            java.lang.String r6 = (java.lang.String) r6
            goto L_0x0013
        L_0x006f:
            vh.r0 r4 = vh.r0.f77506a
            M6.v r4 = M6.d.d(r4, r11, r10, r0)
            java.lang.Object r4 = r4.a(r13, r14)
            r5 = r4
            vh.f0$k r5 = (vh.C10325f0.k) r5
            goto L_0x0013
        L_0x007d:
            M6.b<java.lang.Boolean> r1 = M6.d.f38537f
            java.lang.Object r1 = r1.a(r13, r14)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            goto L_0x0013
        L_0x0086:
            M6.b<java.lang.String> r3 = M6.d.f38532a
            java.lang.Object r3 = r3.a(r13, r14)
            java.lang.String r3 = (java.lang.String) r3
            goto L_0x0013
        L_0x008f:
            vh.k0 r2 = vh.k0.f77472a
            M6.v r2 = M6.d.d(r2, r11, r10, r0)
            M6.s r2 = M6.d.a(r2)
            java.util.List r2 = r2.a(r13, r14)
            goto L_0x0013
        */
        throw new UnsupportedOperationException("Method not decompiled: vh.C10331i0.a(Q6.f, M6.k):vh.f0$c");
    }

    /* renamed from: d */
    public void b(g gVar, k kVar, C10325f0.c cVar) {
        C17542s.j(gVar, "writer");
        C17542s.j(kVar, "customScalarAdapters");
        C17542s.j(cVar, "value");
        gVar.q1("deliveryItems");
        d.a(d.d(k0.f77472a, false, 1, (Object) null)).b(gVar, kVar, cVar.a());
        gVar.q1("id");
        C6654b<String> bVar = d.f38532a;
        bVar.b(gVar, kVar, cVar.b());
        gVar.q1("rangeOfDays");
        d.f38537f.b(gVar, kVar, Boolean.valueOf(cVar.d()));
        gVar.q1("selectedTimeWindow");
        d.d(r0.f77506a, false, 1, (Object) null).b(gVar, kVar, cVar.f());
        gVar.q1("serviceItemId");
        bVar.b(gVar, kVar, cVar.g());
        gVar.q1("type");
        C10404h.f77802a.b(gVar, kVar, cVar.h());
        gVar.q1("selectedPickUpPoint");
        d.b(d.d(q0.f77502a, false, 1, (Object) null)).b(gVar, kVar, cVar.e());
        gVar.q1("presentation");
        d.d(n0.f77484a, false, 1, (Object) null).b(gVar, kVar, cVar.c());
    }
}
