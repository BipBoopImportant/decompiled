package di;

import U0.C4889m;
import U0.C4895p;
import U0.M0;
import XH.C16807N;
import c1.C5264a;
import c1.c;
import ei.C9664e;
import gi.C9749d;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import lm.C11550a;
import nI.C17631a;
import nI.p;
import nI.q;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a_\u0010\f\u001a\u00020\u00062\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u001e\u0010\t\u001a\u001a\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00060\b2\u0006\u0010\u000b\u001a\u00020\nH\u0001¢\u0006\u0004\b\f\u0010\r\u001a!\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005*\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000fH\u0001¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Llm/a$c;", "fulfilmentOption", "", "itemNo", "itemType", "Lkotlin/Function0;", "LXH/N;", "openPostalCodePicker", "Lkotlin/Function3;", "subscribeForBackInStock", "", "isHomeDeliveryBackInStockEnabled", "c", "(Llm/a$c;Ljava/lang/String;Ljava/lang/String;LnI/a;LnI/q;ZLU0/m;I)V", "Lgi/d$b;", "Lei/e$a;", "actions", "f", "(Lgi/d$b;Lei/e$a;LU0/m;I)LnI/p;", "productinformationpage-implementation_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class l {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class a implements p<C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C9749d.b f72505a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ C9664e.a f72506b;

        a(C9749d.b bVar, C9664e.a aVar) {
            this.f72505a = bVar;
            this.f72506b = aVar;
        }

        public final void a(C4889m mVar, int i10) {
            if ((i10 & 3) != 2 || !mVar.l()) {
                if (C4895p.J()) {
                    C4895p.S(-449292328, i10, -1, "com.ingka.ikea.app.productinformationpage.v2.compose.availability.getExpandedView.<anonymous> (HomeDeliveryExpanded.kt:72)");
                }
                if (this.f72505a.h()) {
                    l.c(this.f72505a.l(), this.f72505a.n(), this.f72505a.o(), this.f72506b.b(), this.f72506b.e(), this.f72505a.p(), mVar, 0);
                }
                if (C4895p.J()) {
                    C4895p.R();
                    return;
                }
                return;
            }
            mVar.L();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((C4889m) obj, ((Number) obj2).intValue());
            return C16807N.f139792a;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v5, resolved type: nI.a} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void c(lm.C11550a.c r30, java.lang.String r31, java.lang.String r32, nI.C17631a<XH.C16807N> r33, nI.q<? super lm.C11550a.c, ? super java.lang.String, ? super java.lang.String, XH.C16807N> r34, boolean r35, U0.C4889m r36, int r37) {
        /*
            r1 = r30
            r2 = r31
            r3 = r32
            r0 = r33
            r15 = r34
            r14 = r35
            r13 = r37
            java.lang.String r4 = "itemNo"
            kotlin.jvm.internal.C17542s.j(r2, r4)
            java.lang.String r4 = "itemType"
            kotlin.jvm.internal.C17542s.j(r3, r4)
            java.lang.String r4 = "openPostalCodePicker"
            kotlin.jvm.internal.C17542s.j(r0, r4)
            java.lang.String r4 = "subscribeForBackInStock"
            kotlin.jvm.internal.C17542s.j(r15, r4)
            r4 = 1520251055(0x5a9d30af, float:2.21225498E16)
            r5 = r36
            U0.m r12 = r5.k(r4)
            r5 = r13 & 6
            if (r5 != 0) goto L_0x003a
            boolean r5 = r12.F(r1)
            if (r5 == 0) goto L_0x0037
            r5 = 4
            goto L_0x0038
        L_0x0037:
            r5 = 2
        L_0x0038:
            r5 = r5 | r13
            goto L_0x003b
        L_0x003a:
            r5 = r13
        L_0x003b:
            r6 = r13 & 48
            if (r6 != 0) goto L_0x004b
            boolean r6 = r12.V(r2)
            if (r6 == 0) goto L_0x0048
            r6 = 32
            goto L_0x004a
        L_0x0048:
            r6 = 16
        L_0x004a:
            r5 = r5 | r6
        L_0x004b:
            r6 = r13 & 384(0x180, float:5.38E-43)
            if (r6 != 0) goto L_0x005b
            boolean r6 = r12.V(r3)
            if (r6 == 0) goto L_0x0058
            r6 = 256(0x100, float:3.59E-43)
            goto L_0x005a
        L_0x0058:
            r6 = 128(0x80, float:1.794E-43)
        L_0x005a:
            r5 = r5 | r6
        L_0x005b:
            r6 = r13 & 3072(0xc00, float:4.305E-42)
            if (r6 != 0) goto L_0x006b
            boolean r6 = r12.F(r0)
            if (r6 == 0) goto L_0x0068
            r6 = 2048(0x800, float:2.87E-42)
            goto L_0x006a
        L_0x0068:
            r6 = 1024(0x400, float:1.435E-42)
        L_0x006a:
            r5 = r5 | r6
        L_0x006b:
            r6 = r13 & 24576(0x6000, float:3.4438E-41)
            if (r6 != 0) goto L_0x007b
            boolean r6 = r12.F(r15)
            if (r6 == 0) goto L_0x0078
            r6 = 16384(0x4000, float:2.2959E-41)
            goto L_0x007a
        L_0x0078:
            r6 = 8192(0x2000, float:1.14794E-41)
        L_0x007a:
            r5 = r5 | r6
        L_0x007b:
            r6 = 196608(0x30000, float:2.75506E-40)
            r6 = r6 & r13
            if (r6 != 0) goto L_0x008c
            boolean r6 = r12.b(r14)
            if (r6 == 0) goto L_0x0089
            r6 = 131072(0x20000, float:1.83671E-40)
            goto L_0x008b
        L_0x0089:
            r6 = 65536(0x10000, float:9.18355E-41)
        L_0x008b:
            r5 = r5 | r6
        L_0x008c:
            r8 = r5
            r5 = 74899(0x12493, float:1.04956E-40)
            r5 = r5 & r8
            r6 = 74898(0x12492, float:1.04954E-40)
            if (r5 != r6) goto L_0x00a3
            boolean r5 = r12.l()
            if (r5 != 0) goto L_0x009d
            goto L_0x00a3
        L_0x009d:
            r12.L()
            r4 = r12
            goto L_0x023b
        L_0x00a3:
            boolean r5 = U0.C4895p.J()
            if (r5 == 0) goto L_0x00af
            r5 = -1
            java.lang.String r6 = "com.ingka.ikea.app.productinformationpage.v2.compose.availability.HomeDeliveryExpanded (HomeDeliveryExpanded.kt:34)"
            U0.C4895p.S(r4, r8, r5, r6)
        L_0x00af:
            androidx.compose.ui.d$a r7 = androidx.compose.ui.d.f18749a
            r6 = 0
            r5 = 1
            r4 = 0
            androidx.compose.ui.d r16 = androidx.compose.foundation.layout.J.h(r7, r6, r5, r4)
            androidx.compose.ui.d r17 = TC.e.i(r16)
            tK.u r24 = tK.C18029u.f147649a
            float r21 = r24.g()
            r22 = 7
            r23 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            androidx.compose.ui.d r9 = androidx.compose.foundation.layout.D.m(r17, r18, r19, r20, r21, r22, r23)
            androidx.compose.foundation.layout.d r16 = androidx.compose.foundation.layout.C5073d.f18068a
            androidx.compose.foundation.layout.d$m r10 = r16.g()
            i1.c$a r16 = i1.C5437c.f24302a
            i1.c$b r11 = r16.k()
            r4 = 0
            E1.I r10 = androidx.compose.foundation.layout.C5080k.a(r10, r11, r12, r4)
            int r11 = U0.C4883j.a(r12, r4)
            U0.y r4 = r12.s()
            androidx.compose.ui.d r9 = androidx.compose.ui.c.e(r12, r9)
            G1.g$a r20 = G1.C4504g.f6515W
            nI.a r5 = r20.a()
            U0.f r22 = r12.m()
            if (r22 != 0) goto L_0x00fc
            U0.C4883j.c()
        L_0x00fc:
            r12.I()
            boolean r22 = r12.i()
            if (r22 == 0) goto L_0x0109
            r12.p(r5)
            goto L_0x010c
        L_0x0109:
            r12.t()
        L_0x010c:
            U0.m r5 = U0.F1.a(r12)
            nI.p r6 = r20.c()
            U0.F1.c(r5, r10, r6)
            nI.p r6 = r20.e()
            U0.F1.c(r5, r4, r6)
            nI.p r4 = r20.b()
            boolean r6 = r5.i()
            if (r6 != 0) goto L_0x0136
            java.lang.Object r6 = r5.D()
            java.lang.Integer r10 = java.lang.Integer.valueOf(r11)
            boolean r6 = kotlin.jvm.internal.C17542s.e(r6, r10)
            if (r6 != 0) goto L_0x0144
        L_0x0136:
            java.lang.Integer r6 = java.lang.Integer.valueOf(r11)
            r5.u(r6)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r11)
            r5.w(r6, r4)
        L_0x0144:
            nI.p r4 = r20.d()
            U0.F1.c(r5, r9, r4)
            s0.h r4 = s0.C5862h.f28810a
            r4 = 0
            r5 = 1
            r6 = 0
            androidx.compose.ui.d r9 = androidx.compose.foundation.layout.J.h(r7, r6, r5, r4)
            int r10 = Oo.b.f84667i1
            r11 = 0
            java.lang.String r10 = J1.j.b(r10, r12, r11)
            SC.N r16 = SC.N.Secondary
            SC.M r19 = SC.M.Small
            int r20 = r8 << 18
            r21 = 1879048192(0x70000000, float:1.58456325E29)
            r4 = r20 & r21
            r4 = r4 | 27696(0x6c30, float:3.881E-41)
            r20 = 484(0x1e4, float:6.78E-43)
            r21 = 0
            r23 = 0
            r25 = 0
            r26 = 0
            r27 = 0
            r22 = r4
            r11 = 0
            r4 = r10
            r10 = r5
            r5 = r9
            r9 = r6
            r6 = r21
            r28 = r7
            r7 = r16
            r29 = r8
            r8 = r19
            r9 = r23
            r10 = r25
            r11 = r26
            r36 = r12
            r12 = r27
            r13 = r33
            r14 = r36
            r15 = r22
            r16 = r20
            SC.L.b(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            r4 = -512706345(0xffffffffe170b8d7, float:-2.775336E20)
            r15 = r36
            r15.W(r4)
            if (r35 == 0) goto L_0x01a5
            if (r1 != 0) goto L_0x01a8
        L_0x01a5:
            r4 = r15
            goto L_0x022c
        L_0x01a8:
            r4 = r28
            r5 = 0
            r6 = 1
            r7 = 0
            androidx.compose.ui.d r8 = androidx.compose.foundation.layout.J.h(r4, r5, r6, r7)
            float r10 = r24.j()
            r13 = 13
            r14 = 0
            r9 = 0
            r11 = 0
            r12 = 0
            androidx.compose.ui.d r4 = androidx.compose.foundation.layout.D.m(r8, r9, r10, r11, r12, r13, r14)
            int r5 = Oo.b.f84388H0
            r7 = 0
            java.lang.String r5 = J1.j.b(r5, r15, r7)
            SC.N r8 = SC.N.Primary
            r9 = -1503200998(0xffffffffa666f91a, float:-8.0134875E-16)
            r15.W(r9)
            r9 = 57344(0xe000, float:8.0356E-41)
            r10 = r29
            r9 = r9 & r10
            r11 = 16384(0x4000, float:2.2959E-41)
            if (r9 != r11) goto L_0x01da
            r9 = r6
            goto L_0x01db
        L_0x01da:
            r9 = r7
        L_0x01db:
            boolean r11 = r15.F(r1)
            r9 = r9 | r11
            r11 = r10 & 112(0x70, float:1.57E-43)
            r12 = 32
            if (r11 != r12) goto L_0x01e8
            r11 = r6
            goto L_0x01e9
        L_0x01e8:
            r11 = r7
        L_0x01e9:
            r9 = r9 | r11
            r10 = r10 & 896(0x380, float:1.256E-42)
            r11 = 256(0x100, float:3.59E-43)
            if (r10 != r11) goto L_0x01f1
            goto L_0x01f2
        L_0x01f1:
            r6 = r7
        L_0x01f2:
            r6 = r6 | r9
            java.lang.Object r7 = r15.D()
            if (r6 != 0) goto L_0x0205
            U0.m$a r6 = U0.C4889m.f14007a
            java.lang.Object r6 = r6.a()
            if (r7 != r6) goto L_0x0202
            goto L_0x0205
        L_0x0202:
            r14 = r34
            goto L_0x020f
        L_0x0205:
            di.j r7 = new di.j
            r14 = r34
            r7.<init>(r14, r1, r2, r3)
            r15.u(r7)
        L_0x020f:
            r16 = r7
            nI.a r16 = (nI.C17631a) r16
            r15.P()
            r17 = 27648(0x6c00, float:3.8743E-41)
            r18 = 484(0x1e4, float:6.78E-43)
            r7 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r6 = r4
            r9 = r19
            r14 = r16
            r4 = r15
            r16 = r17
            r17 = r18
            SC.L.b(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
        L_0x022c:
            r4.P()
            r4.x()
            boolean r5 = U0.C4895p.J()
            if (r5 == 0) goto L_0x023b
            U0.C4895p.R()
        L_0x023b:
            U0.Y0 r8 = r4.n()
            if (r8 == 0) goto L_0x0258
            di.k r9 = new di.k
            r0 = r9
            r1 = r30
            r2 = r31
            r3 = r32
            r4 = r33
            r5 = r34
            r6 = r35
            r7 = r37
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            r8.a(r9)
        L_0x0258:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: di.l.c(lm.a$c, java.lang.String, java.lang.String, nI.a, nI.q, boolean, U0.m, int):void");
    }

    /* access modifiers changed from: private */
    public static final C16807N d(q qVar, C11550a.c cVar, String str, String str2) {
        qVar.invoke(cVar, str, str2);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N e(C11550a.c cVar, String str, String str2, C17631a aVar, q qVar, boolean z10, int i10, C4889m mVar, int i11) {
        c(cVar, str, str2, aVar, qVar, z10, mVar, M0.a(i10 | 1));
        return C16807N.f139792a;
    }

    public static final p<C4889m, Integer, C16807N> f(C9749d.b bVar, C9664e.a aVar, C4889m mVar, int i10) {
        C17542s.j(bVar, "<this>");
        C17542s.j(aVar, "actions");
        mVar.W(777689301);
        if (C4895p.J()) {
            C4895p.S(777689301, i10, -1, "com.ingka.ikea.app.productinformationpage.v2.compose.availability.getExpandedView (HomeDeliveryExpanded.kt:71)");
        }
        C5264a e10 = c.e(-449292328, true, new a(bVar, aVar), mVar, 54);
        if (C4895p.J()) {
            C4895p.R();
        }
        mVar.P();
        return e10;
    }
}
