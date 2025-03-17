package Ah;

import Ch.c;
import M6.C6654b;
import M6.d;
import M6.k;
import Q6.g;
import YH.C16877v;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, d2 = {"LAh/h;", "LM6/b;", "LAh/d;", "<init>", "()V", "LQ6/f;", "reader", "LM6/k;", "customScalarAdapters", "c", "(LQ6/f;LM6/k;)LAh/d;", "LQ6/g;", "writer", "value", "LXH/N;", "d", "(LQ6/g;LM6/k;LAh/d;)V", "", "", "b", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;", "RESPONSE_NAMES", "apollo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class h implements C6654b<C9048d> {

    /* renamed from: a  reason: collision with root package name */
    public static final h f58824a = new h();

    /* renamed from: b  reason: collision with root package name */
    private static final List<String> f58825b = C16877v.q("itemNo", "type", "quantity", "isBuyableOnline", "isCommunicatedOnline", "isBreathTakingItem", "isNew", "isFamilyItem", "totalPackages", "updatedAt", "articles", "prices", "product");

    private h() {
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v30, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v3, resolved type: Ah.d$j} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public Ah.C9048d a(Q6.f r23, M6.k r24) {
        /*
            r22 = this;
            r0 = r23
            r1 = r24
            java.lang.String r2 = "reader"
            kotlin.jvm.internal.C17542s.j(r0, r2)
            java.lang.String r2 = "customScalarAdapters"
            kotlin.jvm.internal.C17542s.j(r1, r2)
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r14 = 0
            r15 = 0
            r16 = 0
        L_0x001c:
            java.util.List<java.lang.String> r13 = f58825b
            int r13 = r0.T2(r13)
            r2 = 1
            switch(r13) {
                case 0: goto L_0x0132;
                case 1: goto L_0x0127;
                case 2: goto L_0x011b;
                case 3: goto L_0x010d;
                case 4: goto L_0x00ff;
                case 5: goto L_0x00f1;
                case 6: goto L_0x00e3;
                case 7: goto L_0x00d5;
                case 8: goto L_0x00c7;
                case 9: goto L_0x00b9;
                case 10: goto L_0x00a6;
                case 11: goto L_0x0091;
                case 12: goto L_0x007e;
                default: goto L_0x0026;
            }
        L_0x0026:
            Ah.d r0 = new Ah.d
            kotlin.jvm.internal.C17542s.g(r4)
            kotlin.jvm.internal.C17542s.g(r5)
            kotlin.jvm.internal.C17542s.g(r3)
            int r1 = r3.intValue()
            kotlin.jvm.internal.C17542s.g(r6)
            boolean r2 = r6.booleanValue()
            kotlin.jvm.internal.C17542s.g(r7)
            boolean r13 = r7.booleanValue()
            kotlin.jvm.internal.C17542s.g(r8)
            boolean r17 = r8.booleanValue()
            kotlin.jvm.internal.C17542s.g(r9)
            boolean r18 = r9.booleanValue()
            kotlin.jvm.internal.C17542s.g(r10)
            boolean r19 = r10.booleanValue()
            kotlin.jvm.internal.C17542s.g(r11)
            int r20 = r11.intValue()
            kotlin.jvm.internal.C17542s.g(r12)
            int r21 = r12.intValue()
            kotlin.jvm.internal.C17542s.g(r14)
            kotlin.jvm.internal.C17542s.g(r15)
            r3 = r0
            r6 = r1
            r7 = r2
            r8 = r13
            r9 = r17
            r10 = r18
            r11 = r19
            r12 = r20
            r13 = r21
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            return r0
        L_0x007e:
            Ah.o r13 = Ah.o.f58838a
            M6.v r2 = M6.d.c(r13, r2)
            M6.u r2 = M6.d.b(r2)
            java.lang.Object r2 = r2.a(r0, r1)
            r16 = r2
            Ah.d$j r16 = (Ah.C9048d.j) r16
            goto L_0x001c
        L_0x0091:
            Ah.n r13 = Ah.n.f58836a
            r17 = r3
            r3 = 0
            r15 = 0
            M6.v r2 = M6.d.d(r13, r3, r2, r15)
            java.lang.Object r2 = r2.a(r0, r1)
            Ah.d$i r2 = (Ah.C9048d.i) r2
            r15 = r2
        L_0x00a2:
            r3 = r17
            goto L_0x001c
        L_0x00a6:
            r17 = r3
            r3 = 0
            r13 = 0
            Ah.e r14 = Ah.C9049e.f58818a
            M6.v r2 = M6.d.d(r14, r3, r2, r13)
            M6.s r2 = M6.d.a(r2)
            java.util.List r14 = r2.a(r0, r1)
            goto L_0x00a2
        L_0x00b9:
            r17 = r3
            r13 = 0
            M6.b<java.lang.Integer> r2 = M6.d.f38533b
            java.lang.Object r2 = r2.a(r0, r1)
            r12 = r2
            java.lang.Integer r12 = (java.lang.Integer) r12
            goto L_0x001c
        L_0x00c7:
            r17 = r3
            r13 = 0
            M6.b<java.lang.Integer> r2 = M6.d.f38533b
            java.lang.Object r2 = r2.a(r0, r1)
            r11 = r2
            java.lang.Integer r11 = (java.lang.Integer) r11
            goto L_0x001c
        L_0x00d5:
            r17 = r3
            r13 = 0
            M6.b<java.lang.Boolean> r2 = M6.d.f38537f
            java.lang.Object r2 = r2.a(r0, r1)
            r10 = r2
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            goto L_0x001c
        L_0x00e3:
            r17 = r3
            r13 = 0
            M6.b<java.lang.Boolean> r2 = M6.d.f38537f
            java.lang.Object r2 = r2.a(r0, r1)
            r9 = r2
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            goto L_0x001c
        L_0x00f1:
            r17 = r3
            r13 = 0
            M6.b<java.lang.Boolean> r2 = M6.d.f38537f
            java.lang.Object r2 = r2.a(r0, r1)
            r8 = r2
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            goto L_0x001c
        L_0x00ff:
            r17 = r3
            r13 = 0
            M6.b<java.lang.Boolean> r2 = M6.d.f38537f
            java.lang.Object r2 = r2.a(r0, r1)
            r7 = r2
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            goto L_0x001c
        L_0x010d:
            r17 = r3
            r13 = 0
            M6.b<java.lang.Boolean> r2 = M6.d.f38537f
            java.lang.Object r2 = r2.a(r0, r1)
            r6 = r2
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            goto L_0x001c
        L_0x011b:
            r13 = 0
            M6.b<java.lang.Integer> r2 = M6.d.f38533b
            java.lang.Object r2 = r2.a(r0, r1)
            r3 = r2
            java.lang.Integer r3 = (java.lang.Integer) r3
            goto L_0x001c
        L_0x0127:
            r17 = r3
            r13 = 0
            Ch.c r2 = Ch.c.f59006a
            Bh.c r5 = r2.a(r0, r1)
            goto L_0x001c
        L_0x0132:
            r17 = r3
            r13 = 0
            M6.b<java.lang.String> r2 = M6.d.f38532a
            java.lang.Object r2 = r2.a(r0, r1)
            r4 = r2
            java.lang.String r4 = (java.lang.String) r4
            goto L_0x001c
        */
        throw new UnsupportedOperationException("Method not decompiled: Ah.h.a(Q6.f, M6.k):Ah.d");
    }

    /* renamed from: d */
    public void b(g gVar, k kVar, C9048d dVar) {
        C17542s.j(gVar, "writer");
        C17542s.j(kVar, "customScalarAdapters");
        C17542s.j(dVar, "value");
        gVar.q1("itemNo");
        d.f38532a.b(gVar, kVar, dVar.b());
        gVar.q1("type");
        c.f59006a.b(gVar, kVar, dVar.g());
        gVar.q1("quantity");
        C6654b<Integer> bVar = d.f38533b;
        bVar.b(gVar, kVar, Integer.valueOf(dVar.e()));
        gVar.q1("isBuyableOnline");
        C6654b<Boolean> bVar2 = d.f38537f;
        bVar2.b(gVar, kVar, Boolean.valueOf(dVar.j()));
        gVar.q1("isCommunicatedOnline");
        bVar2.b(gVar, kVar, Boolean.valueOf(dVar.k()));
        gVar.q1("isBreathTakingItem");
        bVar2.b(gVar, kVar, Boolean.valueOf(dVar.i()));
        gVar.q1("isNew");
        bVar2.b(gVar, kVar, Boolean.valueOf(dVar.m()));
        gVar.q1("isFamilyItem");
        bVar2.b(gVar, kVar, Boolean.valueOf(dVar.l()));
        gVar.q1("totalPackages");
        bVar.b(gVar, kVar, Integer.valueOf(dVar.f()));
        gVar.q1("updatedAt");
        bVar.b(gVar, kVar, Integer.valueOf(dVar.h()));
        gVar.q1("articles");
        d.a(d.d(C9049e.f58818a, false, 1, (Object) null)).b(gVar, kVar, dVar.a());
        gVar.q1("prices");
        d.d(n.f58836a, false, 1, (Object) null).b(gVar, kVar, dVar.c());
        gVar.q1("product");
        d.b(d.c(o.f58838a, true)).b(gVar, kVar, dVar.d());
    }
}
