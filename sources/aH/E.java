package Ah;

import M6.C6654b;
import M6.d;
import M6.k;
import M6.u;
import Q6.g;
import YH.C16877v;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, d2 = {"LAh/E;", "LM6/b;", "LAh/y;", "<init>", "()V", "LQ6/f;", "reader", "LM6/k;", "customScalarAdapters", "c", "(LQ6/f;LM6/k;)LAh/y;", "LQ6/g;", "writer", "value", "LXH/N;", "d", "(LQ6/g;LM6/k;LAh/y;)V", "", "", "b", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;", "RESPONSE_NAMES", "apollo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class E implements C6654b<y> {

    /* renamed from: a  reason: collision with root package name */
    public static final E f58758a = new E();

    /* renamed from: b  reason: collision with root package name */
    private static final List<String> f58759b = C16877v.q("name", "description", "type", "technicalDetails", "measurements", "category", "images", "displayUnit");

    private E() {
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v12, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v3, resolved type: Ah.y$f} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v24, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v3, resolved type: Ah.y$a} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public Ah.y a(Q6.f r13, M6.k r14) {
        /*
            r12 = this;
            java.lang.String r0 = "reader"
            kotlin.jvm.internal.C17542s.j(r13, r0)
            java.lang.String r0 = "customScalarAdapters"
            kotlin.jvm.internal.C17542s.j(r14, r0)
            r0 = 0
            r2 = r0
            r3 = r2
            r4 = r3
            r5 = r4
            r6 = r5
            r7 = r6
            r8 = r7
            r9 = r8
        L_0x0013:
            java.util.List<java.lang.String> r1 = f58759b
            int r1 = r13.T2(r1)
            r10 = 1
            r11 = 0
            switch(r1) {
                case 0: goto L_0x0091;
                case 1: goto L_0x0087;
                case 2: goto L_0x007d;
                case 3: goto L_0x006b;
                case 4: goto L_0x005c;
                case 5: goto L_0x0052;
                case 6: goto L_0x0043;
                case 7: goto L_0x0031;
                default: goto L_0x001e;
            }
        L_0x001e:
            Ah.y r13 = new Ah.y
            kotlin.jvm.internal.C17542s.g(r2)
            kotlin.jvm.internal.C17542s.g(r4)
            kotlin.jvm.internal.C17542s.g(r6)
            kotlin.jvm.internal.C17542s.g(r8)
            r1 = r13
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9)
            return r13
        L_0x0031:
            Ah.z r1 = Ah.z.f58884a
            M6.v r1 = M6.d.d(r1, r11, r10, r0)
            M6.u r1 = M6.d.b(r1)
            java.lang.Object r1 = r1.a(r13, r14)
            r9 = r1
            Ah.y$a r9 = (Ah.y.a) r9
            goto L_0x0013
        L_0x0043:
            Ah.A r1 = Ah.A.f58750a
            M6.v r1 = M6.d.d(r1, r11, r10, r0)
            M6.s r1 = M6.d.a(r1)
            java.util.List r8 = r1.a(r13, r14)
            goto L_0x0013
        L_0x0052:
            M6.u<java.lang.String> r1 = M6.d.f38540i
            java.lang.Object r1 = r1.a(r13, r14)
            r7 = r1
            java.lang.String r7 = (java.lang.String) r7
            goto L_0x0013
        L_0x005c:
            Ah.C r1 = Ah.C.f58754a
            M6.v r1 = M6.d.d(r1, r11, r10, r0)
            M6.s r1 = M6.d.a(r1)
            java.util.List r6 = r1.a(r13, r14)
            goto L_0x0013
        L_0x006b:
            Ah.F r1 = Ah.F.f58760a
            M6.v r1 = M6.d.d(r1, r11, r10, r0)
            M6.u r1 = M6.d.b(r1)
            java.lang.Object r1 = r1.a(r13, r14)
            r5 = r1
            Ah.y$f r5 = (Ah.y.f) r5
            goto L_0x0013
        L_0x007d:
            M6.b<java.lang.String> r1 = M6.d.f38532a
            java.lang.Object r1 = r1.a(r13, r14)
            r4 = r1
            java.lang.String r4 = (java.lang.String) r4
            goto L_0x0013
        L_0x0087:
            M6.u<java.lang.String> r1 = M6.d.f38540i
            java.lang.Object r1 = r1.a(r13, r14)
            r3 = r1
            java.lang.String r3 = (java.lang.String) r3
            goto L_0x0013
        L_0x0091:
            M6.b<java.lang.String> r1 = M6.d.f38532a
            java.lang.Object r1 = r1.a(r13, r14)
            r2 = r1
            java.lang.String r2 = (java.lang.String) r2
            goto L_0x0013
        */
        throw new UnsupportedOperationException("Method not decompiled: Ah.E.a(Q6.f, M6.k):Ah.y");
    }

    /* renamed from: d */
    public void b(g gVar, k kVar, y yVar) {
        C17542s.j(gVar, "writer");
        C17542s.j(kVar, "customScalarAdapters");
        C17542s.j(yVar, "value");
        gVar.q1("name");
        C6654b<String> bVar = d.f38532a;
        bVar.b(gVar, kVar, yVar.f());
        gVar.q1("description");
        u<String> uVar = d.f38540i;
        uVar.b(gVar, kVar, yVar.b());
        gVar.q1("type");
        bVar.b(gVar, kVar, yVar.h());
        gVar.q1("technicalDetails");
        d.b(d.d(F.f58760a, false, 1, (Object) null)).b(gVar, kVar, yVar.g());
        gVar.q1("measurements");
        d.a(d.d(C.f58754a, false, 1, (Object) null)).b(gVar, kVar, yVar.e());
        gVar.q1("category");
        uVar.b(gVar, kVar, yVar.a());
        gVar.q1("images");
        d.a(d.d(A.f58750a, false, 1, (Object) null)).b(gVar, kVar, yVar.d());
        gVar.q1("displayUnit");
        d.b(d.d(z.f58884a, false, 1, (Object) null)).b(gVar, kVar, yVar.c());
    }
}
