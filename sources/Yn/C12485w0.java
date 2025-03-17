package yn;

import An.o;
import An.u;
import Cn.x;
import U0.C4889m;
import U0.M0;
import XH.C16807N;
import XH.t;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kp.g;
import kp.i;
import nI.C17642l;
import nI.p;
import nI.q;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001ae\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u001e\u0010\u0005\u001a\u001a\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00062\u0018\u0010\n\u001a\u0014\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\bH\u0001¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"LAn/o;", "plpUiModel", "Lkotlin/Function3;", "", "LXH/N;", "onVisualMessageActionHeaderClicked", "Lkotlin/Function1;", "onStoryClicked", "Lkotlin/Function2;", "Lkp/i;", "onShoppableImageClicked", "e", "(LAn/o;LnI/q;LnI/l;LnI/p;LU0/m;I)V", "plp-implementation_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* renamed from: yn.w0  reason: case insensitive filesystem */
public final class C12485w0 {
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v10, resolved type: nI.l} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v8, resolved type: nI.l} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x0242  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void e(An.o r23, nI.q<? super java.lang.String, ? super java.lang.String, ? super java.lang.String, XH.C16807N> r24, nI.C17642l<? super java.lang.String, XH.C16807N> r25, nI.p<? super kp.i, ? super java.lang.String, XH.C16807N> r26, U0.C4889m r27, int r28) {
        /*
            r1 = r23
            r2 = r24
            r10 = r25
            r11 = r26
            r12 = r28
            java.lang.String r0 = "plpUiModel"
            kotlin.jvm.internal.C17542s.j(r1, r0)
            java.lang.String r0 = "onVisualMessageActionHeaderClicked"
            kotlin.jvm.internal.C17542s.j(r2, r0)
            java.lang.String r0 = "onStoryClicked"
            kotlin.jvm.internal.C17542s.j(r10, r0)
            java.lang.String r0 = "onShoppableImageClicked"
            kotlin.jvm.internal.C17542s.j(r11, r0)
            r0 = -1521246259(0xffffffffa5539fcd, float:-1.8355475E-16)
            r3 = r27
            U0.m r15 = r3.k(r0)
            r3 = r12 & 6
            r4 = 4
            if (r3 != 0) goto L_0x0037
            boolean r3 = r15.V(r1)
            if (r3 == 0) goto L_0x0034
            r3 = r4
            goto L_0x0035
        L_0x0034:
            r3 = 2
        L_0x0035:
            r3 = r3 | r12
            goto L_0x0038
        L_0x0037:
            r3 = r12
        L_0x0038:
            r5 = r12 & 48
            r6 = 32
            if (r5 != 0) goto L_0x0049
            boolean r5 = r15.F(r2)
            if (r5 == 0) goto L_0x0046
            r5 = r6
            goto L_0x0048
        L_0x0046:
            r5 = 16
        L_0x0048:
            r3 = r3 | r5
        L_0x0049:
            r5 = r12 & 384(0x180, float:5.38E-43)
            if (r5 != 0) goto L_0x0059
            boolean r5 = r15.F(r10)
            if (r5 == 0) goto L_0x0056
            r5 = 256(0x100, float:3.59E-43)
            goto L_0x0058
        L_0x0056:
            r5 = 128(0x80, float:1.794E-43)
        L_0x0058:
            r3 = r3 | r5
        L_0x0059:
            r5 = r12 & 3072(0xc00, float:4.305E-42)
            r7 = 2048(0x800, float:2.87E-42)
            if (r5 != 0) goto L_0x006a
            boolean r5 = r15.F(r11)
            if (r5 == 0) goto L_0x0067
            r5 = r7
            goto L_0x0069
        L_0x0067:
            r5 = 1024(0x400, float:1.435E-42)
        L_0x0069:
            r3 = r3 | r5
        L_0x006a:
            r5 = r3 & 1171(0x493, float:1.641E-42)
            r8 = 1170(0x492, float:1.64E-42)
            if (r5 != r8) goto L_0x007d
            boolean r5 = r15.l()
            if (r5 != 0) goto L_0x0077
            goto L_0x007d
        L_0x0077:
            r15.L()
            r3 = r15
            goto L_0x0245
        L_0x007d:
            boolean r5 = U0.C4895p.J()
            if (r5 == 0) goto L_0x0089
            r5 = -1
            java.lang.String r8 = "com.ingka.ikea.browseandsearch.plp.impl.composables.PlpDiscoverItem (PlpDiscoverItem.kt:31)"
            U0.C4895p.S(r0, r3, r5, r8)
        L_0x0089:
            boolean r0 = r1 instanceof An.r
            if (r0 == 0) goto L_0x00b1
            r0 = -993194933(0xffffffffc4cd0c4b, float:-1640.3842)
            r15.W(r0)
            r0 = r1
            An.r r0 = (An.r) r0
            java.lang.String r4 = r0.i()
            KJ.c r0 = r0.h()
            r8 = r3 & 896(0x380, float:1.256E-42)
            r9 = 8
            r6 = 0
            r3 = r4
            r4 = r0
            r5 = r25
            r7 = r15
            HC.K.g(r3, r4, r5, r6, r7, r8, r9)
            r15.P()
        L_0x00ae:
            r3 = r15
            goto L_0x023c
        L_0x00b1:
            boolean r0 = r1 instanceof An.u
            r5 = 1
            if (r0 == 0) goto L_0x0149
            r0 = -992957349(0xffffffffc4d0ac5b, float:-1669.3861)
            r15.W(r0)
            r0 = r1
            An.u r0 = (An.u) r0
            kp.m r0 = r0.g()
            r8 = 1353446339(0x50abf3c3, float:2.30790328E10)
            r15.W(r8)
            r8 = r3 & 112(0x70, float:1.57E-43)
            r9 = 0
            if (r8 != r6) goto L_0x00d0
            r6 = r5
            goto L_0x00d1
        L_0x00d0:
            r6 = r9
        L_0x00d1:
            r8 = r3 & 14
            if (r8 != r4) goto L_0x00d7
            r13 = r5
            goto L_0x00d8
        L_0x00d7:
            r13 = r9
        L_0x00d8:
            r6 = r6 | r13
            java.lang.Object r13 = r15.D()
            if (r6 != 0) goto L_0x00e7
            U0.m$a r6 = U0.C4889m.f14007a
            java.lang.Object r6 = r6.a()
            if (r13 != r6) goto L_0x00ef
        L_0x00e7:
            yn.s0 r13 = new yn.s0
            r13.<init>(r2, r1)
            r15.u(r13)
        L_0x00ef:
            r6 = r13
            nI.l r6 = (nI.C17642l) r6
            r15.P()
            r13 = 1353456058(0x50ac19ba, float:2.30989373E10)
            r15.W(r13)
            r3 = r3 & 7168(0x1c00, float:1.0045E-41)
            if (r3 != r7) goto L_0x0101
            r3 = r5
            goto L_0x0102
        L_0x0101:
            r3 = r9
        L_0x0102:
            if (r8 != r4) goto L_0x0105
            goto L_0x0106
        L_0x0105:
            r5 = r9
        L_0x0106:
            r3 = r3 | r5
            java.lang.Object r4 = r15.D()
            if (r3 != 0) goto L_0x0115
            U0.m$a r3 = U0.C4889m.f14007a
            java.lang.Object r3 = r3.a()
            if (r4 != r3) goto L_0x011d
        L_0x0115:
            yn.t0 r4 = new yn.t0
            r4.<init>(r11, r1)
            r15.u(r4)
        L_0x011d:
            r5 = r4
            nI.l r5 = (nI.C17642l) r5
            r15.P()
            androidx.compose.ui.d$a r16 = androidx.compose.ui.d.f18749a
            r3 = 24
            float r3 = (float) r3
            float r18 = c2.h.B(r3)
            r21 = 13
            r22 = 0
            r17 = 0
            r19 = 0
            r20 = 0
            androidx.compose.ui.d r7 = androidx.compose.foundation.layout.D.m(r16, r17, r18, r19, r20, r21, r22)
            r8 = 3072(0xc00, float:4.305E-42)
            r9 = 0
            r3 = r0
            r4 = r6
            r6 = r7
            r7 = r15
            HC.T.g(r3, r4, r5, r6, r7, r8, r9)
            r15.P()
            goto L_0x00ae
        L_0x0149:
            boolean r0 = r1 instanceof An.v
            if (r0 == 0) goto L_0x0192
            r0 = -992313262(0xffffffffc4da8052, float:-1748.01)
            r15.W(r0)
            r0 = r1
            An.v r0 = (An.v) r0
            java.lang.String r13 = r0.g()
            java.lang.String r14 = r0.h()
            r0 = 1353467376(0x50ac45f0, float:2.31221166E10)
            r15.W(r0)
            java.lang.Object r0 = r15.D()
            U0.m$a r3 = U0.C4889m.f14007a
            java.lang.Object r3 = r3.a()
            if (r0 != r3) goto L_0x0178
            yn.u0 r0 = new yn.u0
            r0.<init>()
            r15.u(r0)
        L_0x0178:
            r17 = r0
            nI.l r17 = (nI.C17642l) r17
            r15.P()
            r19 = 24576(0x6000, float:3.4438E-41)
            r20 = 12
            r0 = 0
            r16 = 0
            r3 = r15
            r15 = r0
            r18 = r3
            zn.C12538c.c(r13, r14, r15, r16, r17, r18, r19, r20)
            r3.P()
            goto L_0x023c
        L_0x0192:
            r3 = r15
            r0 = 1353476517(0x50ac69a5, float:2.31408374E10)
            r3.W(r0)
            r3.P()
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r6 = "Unsupported UI model: "
            r4.append(r6)
            r4.append(r1)
            java.lang.String r4 = r4.toString()
            r0.<init>(r4)
            qv.e r4 = qv.e.ERROR
            qv.d r6 = qv.d.f102012a
            java.util.List r6 = r6.a()
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            java.util.Iterator r6 = r6.iterator()
        L_0x01c5:
            boolean r8 = r6.hasNext()
            r9 = 0
            if (r8 == 0) goto L_0x01dd
            java.lang.Object r8 = r6.next()
            r13 = r8
            qv.b r13 = (qv.C11819b) r13
            boolean r9 = r13.b(r4, r9)
            if (r9 == 0) goto L_0x01c5
            r7.add(r8)
            goto L_0x01c5
        L_0x01dd:
            java.util.Iterator r6 = r7.iterator()
            r7 = 0
            r8 = r7
            r13 = r8
        L_0x01e4:
            boolean r14 = r6.hasNext()
            if (r14 == 0) goto L_0x023c
            java.lang.Object r14 = r6.next()
            qv.b r14 = (qv.C11819b) r14
            if (r8 != 0) goto L_0x01fd
            java.lang.String r8 = qv.C11818a.a(r7, r0)
            if (r8 != 0) goto L_0x01f9
            goto L_0x023c
        L_0x01f9:
            java.lang.String r8 = qv.C11820c.a(r8)
        L_0x01fd:
            if (r13 != 0) goto L_0x022a
            java.lang.Thread r13 = java.lang.Thread.currentThread()
            java.lang.String r13 = r13.getName()
            java.lang.String r15 = "main"
            boolean r13 = HJ.C15854t.b0(r13, r15, r5)
            if (r13 == 0) goto L_0x0212
            java.lang.String r13 = "m"
            goto L_0x0214
        L_0x0212:
            java.lang.String r13 = "b"
        L_0x0214:
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            r15.<init>()
            r15.append(r13)
            java.lang.String r13 = "|"
            r15.append(r13)
            java.lang.String r13 = "PlpDiscoverItem"
            r15.append(r13)
            java.lang.String r13 = r15.toString()
        L_0x022a:
            r19 = r13
            r13 = r14
            r14 = r4
            r15 = r19
            r16 = r9
            r17 = r0
            r18 = r8
            r13.a(r14, r15, r16, r17, r18)
            r13 = r19
            goto L_0x01e4
        L_0x023c:
            boolean r0 = U0.C4895p.J()
            if (r0 == 0) goto L_0x0245
            U0.C4895p.R()
        L_0x0245:
            U0.Y0 r6 = r3.n()
            if (r6 == 0) goto L_0x025e
            yn.v0 r7 = new yn.v0
            r0 = r7
            r1 = r23
            r2 = r24
            r3 = r25
            r4 = r26
            r5 = r28
            r0.<init>(r1, r2, r3, r4, r5)
            r6.a(r7)
        L_0x025e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: yn.C12485w0.e(An.o, nI.q, nI.l, nI.p, U0.m, int):void");
    }

    /* access modifiers changed from: private */
    public static final C16807N f(q qVar, o oVar, g gVar) {
        C17542s.j(gVar, "it");
        qVar.invoke(((u) oVar).g().b(), gVar.a(), gVar.c());
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N g(p pVar, o oVar, i iVar) {
        C17542s.j(iVar, "it");
        pVar.invoke(iVar, ((u) oVar).g().b());
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N h(x xVar) {
        C17542s.j(xVar, "it");
        if (xVar instanceof x.a) {
            return C16807N.f139792a;
        }
        throw new t();
    }

    /* access modifiers changed from: private */
    public static final C16807N i(o oVar, q qVar, C17642l lVar, p pVar, int i10, C4889m mVar, int i11) {
        e(oVar, qVar, lVar, pVar, mVar, M0.a(i10 | 1));
        return C16807N.f139792a;
    }
}
