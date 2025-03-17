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
import vh.C10325f0;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, d2 = {"Lvh/q0;", "LM6/b;", "Lvh/f0$j;", "<init>", "()V", "LQ6/f;", "reader", "LM6/k;", "customScalarAdapters", "c", "(LQ6/f;LM6/k;)Lvh/f0$j;", "LQ6/g;", "writer", "value", "LXH/N;", "d", "(LQ6/g;LM6/k;Lvh/f0$j;)V", "", "", "b", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;", "RESPONSE_NAMES", "apollo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class q0 implements C6654b<C10325f0.j> {

    /* renamed from: a  reason: collision with root package name */
    public static final q0 f77502a = new q0();

    /* renamed from: b  reason: collision with root package name */
    private static final List<String> f77503b = C16877v.q(PlaceTypes.ADDRESS, "distance", "latitude", "longitude", "name", "ocPUPId", "identifier", "openingHours");

    private q0() {
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v5, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v3, resolved type: vh.f0$a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v18, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v3, resolved type: vh.f0$g} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public vh.C10325f0.j a(Q6.f r12, M6.k r13) {
        /*
            r11 = this;
            java.lang.String r0 = "reader"
            kotlin.jvm.internal.C17542s.j(r12, r0)
            java.lang.String r0 = "customScalarAdapters"
            kotlin.jvm.internal.C17542s.j(r13, r0)
            r0 = 0
            r2 = r0
            r5 = r2
            r6 = r5
            r7 = r6
            r8 = r7
            r9 = r8
            r10 = r9
        L_0x0012:
            java.util.List<java.lang.String> r1 = f77503b
            int r1 = r12.T2(r1)
            r3 = 1
            switch(r1) {
                case 0: goto L_0x0082;
                case 1: goto L_0x0079;
                case 2: goto L_0x006f;
                case 3: goto L_0x0065;
                case 4: goto L_0x005b;
                case 5: goto L_0x0051;
                case 6: goto L_0x0047;
                case 7: goto L_0x0039;
                default: goto L_0x001c;
            }
        L_0x001c:
            vh.f0$j r12 = new vh.f0$j
            kotlin.jvm.internal.C17542s.g(r2)
            kotlin.jvm.internal.C17542s.g(r0)
            double r3 = r0.doubleValue()
            kotlin.jvm.internal.C17542s.g(r7)
            kotlin.jvm.internal.C17542s.g(r8)
            kotlin.jvm.internal.C17542s.g(r9)
            kotlin.jvm.internal.C17542s.g(r10)
            r1 = r12
            r1.<init>(r2, r3, r5, r6, r7, r8, r9, r10)
            return r12
        L_0x0039:
            vh.m0 r1 = vh.m0.f77480a
            M6.v r1 = M6.d.c(r1, r3)
            java.lang.Object r1 = r1.a(r12, r13)
            r10 = r1
            vh.f0$g r10 = (vh.C10325f0.g) r10
            goto L_0x0012
        L_0x0047:
            M6.b<java.lang.String> r1 = M6.d.f38532a
            java.lang.Object r1 = r1.a(r12, r13)
            r9 = r1
            java.lang.String r9 = (java.lang.String) r9
            goto L_0x0012
        L_0x0051:
            M6.b<java.lang.String> r1 = M6.d.f38532a
            java.lang.Object r1 = r1.a(r12, r13)
            r8 = r1
            java.lang.String r8 = (java.lang.String) r8
            goto L_0x0012
        L_0x005b:
            M6.b<java.lang.String> r1 = M6.d.f38532a
            java.lang.Object r1 = r1.a(r12, r13)
            r7 = r1
            java.lang.String r7 = (java.lang.String) r7
            goto L_0x0012
        L_0x0065:
            M6.u<java.lang.Double> r1 = M6.d.f38541j
            java.lang.Object r1 = r1.a(r12, r13)
            r6 = r1
            java.lang.Double r6 = (java.lang.Double) r6
            goto L_0x0012
        L_0x006f:
            M6.u<java.lang.Double> r1 = M6.d.f38541j
            java.lang.Object r1 = r1.a(r12, r13)
            r5 = r1
            java.lang.Double r5 = (java.lang.Double) r5
            goto L_0x0012
        L_0x0079:
            M6.b<java.lang.Double> r0 = M6.d.f38534c
            java.lang.Object r0 = r0.a(r12, r13)
            java.lang.Double r0 = (java.lang.Double) r0
            goto L_0x0012
        L_0x0082:
            vh.g0 r1 = vh.C10327g0.f77446a
            M6.v r1 = M6.d.c(r1, r3)
            java.lang.Object r1 = r1.a(r12, r13)
            r2 = r1
            vh.f0$a r2 = (vh.C10325f0.a) r2
            goto L_0x0012
        */
        throw new UnsupportedOperationException("Method not decompiled: vh.q0.a(Q6.f, M6.k):vh.f0$j");
    }

    /* renamed from: d */
    public void b(g gVar, k kVar, C10325f0.j jVar) {
        C17542s.j(gVar, "writer");
        C17542s.j(kVar, "customScalarAdapters");
        C17542s.j(jVar, "value");
        gVar.q1(PlaceTypes.ADDRESS);
        d.c(C10327g0.f77446a, true).b(gVar, kVar, jVar.a());
        gVar.q1("distance");
        d.f38534c.b(gVar, kVar, Double.valueOf(jVar.b()));
        gVar.q1("latitude");
        u<Double> uVar = d.f38541j;
        uVar.b(gVar, kVar, jVar.d());
        gVar.q1("longitude");
        uVar.b(gVar, kVar, jVar.e());
        gVar.q1("name");
        C6654b<String> bVar = d.f38532a;
        bVar.b(gVar, kVar, jVar.f());
        gVar.q1("ocPUPId");
        bVar.b(gVar, kVar, jVar.g());
        gVar.q1("identifier");
        bVar.b(gVar, kVar, jVar.c());
        gVar.q1("openingHours");
        d.c(m0.f77480a, true).b(gVar, kVar, jVar.h());
    }
}
