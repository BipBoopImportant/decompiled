package Zn;

import U0.C4889m;
import U0.M0;
import XH.C16807N;
import androidx.compose.ui.d;
import kotlin.Metadata;
import nI.C17631a;
import nI.C17642l;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aG\u0010\t\u001a\u00020\u00032\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0014\u0010\u0006\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0000\u0012\u0004\u0012\u00020\u00030\u00052\b\b\u0002\u0010\b\u001a\u00020\u0007H\u0001¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"", "orderId", "Lkotlin/Function0;", "LXH/N;", "onContinueClicked", "Lkotlin/Function1;", "onViewOrderClicked", "Landroidx/compose/ui/d;", "modifier", "c", "(Ljava/lang/String;LnI/a;LnI/l;Landroidx/compose/ui/d;LU0/m;II)V", "checkout-implementation_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class N {
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r25v1, resolved type: nI.a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v5, resolved type: androidx.compose.ui.d$a} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x008d  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0095  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x0209  */
    /* JADX WARNING: Removed duplicated region for block: B:92:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void c(java.lang.String r33, nI.C17631a<XH.C16807N> r34, nI.C17642l<? super java.lang.String, XH.C16807N> r35, androidx.compose.ui.d r36, U0.C4889m r37, int r38, int r39) {
        /*
            r1 = r33
            r15 = r34
            r0 = r35
            r14 = r38
            java.lang.String r2 = "onContinueClicked"
            kotlin.jvm.internal.C17542s.j(r15, r2)
            java.lang.String r2 = "onViewOrderClicked"
            kotlin.jvm.internal.C17542s.j(r0, r2)
            r2 = -1086772057(0xffffffffbf392ca7, float:-0.7233376)
            r3 = r37
            U0.m r13 = r3.k(r2)
            r12 = 1
            r3 = r39 & 1
            r4 = 2
            r11 = 4
            if (r3 == 0) goto L_0x0025
            r3 = r14 | 6
            goto L_0x0035
        L_0x0025:
            r3 = r14 & 6
            if (r3 != 0) goto L_0x0034
            boolean r3 = r13.V(r1)
            if (r3 == 0) goto L_0x0031
            r3 = r11
            goto L_0x0032
        L_0x0031:
            r3 = r4
        L_0x0032:
            r3 = r3 | r14
            goto L_0x0035
        L_0x0034:
            r3 = r14
        L_0x0035:
            r5 = r39 & 2
            if (r5 == 0) goto L_0x003c
            r3 = r3 | 48
            goto L_0x004c
        L_0x003c:
            r5 = r14 & 48
            if (r5 != 0) goto L_0x004c
            boolean r5 = r13.F(r15)
            if (r5 == 0) goto L_0x0049
            r5 = 32
            goto L_0x004b
        L_0x0049:
            r5 = 16
        L_0x004b:
            r3 = r3 | r5
        L_0x004c:
            r5 = r39 & 4
            if (r5 == 0) goto L_0x0053
            r3 = r3 | 384(0x180, float:5.38E-43)
            goto L_0x0063
        L_0x0053:
            r5 = r14 & 384(0x180, float:5.38E-43)
            if (r5 != 0) goto L_0x0063
            boolean r5 = r13.F(r0)
            if (r5 == 0) goto L_0x0060
            r5 = 256(0x100, float:3.59E-43)
            goto L_0x0062
        L_0x0060:
            r5 = 128(0x80, float:1.794E-43)
        L_0x0062:
            r3 = r3 | r5
        L_0x0063:
            r5 = r39 & 8
            if (r5 == 0) goto L_0x006d
            r3 = r3 | 3072(0xc00, float:4.305E-42)
        L_0x0069:
            r6 = r36
        L_0x006b:
            r9 = r3
            goto L_0x0080
        L_0x006d:
            r6 = r14 & 3072(0xc00, float:4.305E-42)
            if (r6 != 0) goto L_0x0069
            r6 = r36
            boolean r7 = r13.V(r6)
            if (r7 == 0) goto L_0x007c
            r7 = 2048(0x800, float:2.87E-42)
            goto L_0x007e
        L_0x007c:
            r7 = 1024(0x400, float:1.435E-42)
        L_0x007e:
            r3 = r3 | r7
            goto L_0x006b
        L_0x0080:
            r3 = r9 & 1171(0x493, float:1.641E-42)
            r7 = 1170(0x492, float:1.64E-42)
            if (r3 != r7) goto L_0x0095
            boolean r3 = r13.l()
            if (r3 != 0) goto L_0x008d
            goto L_0x0095
        L_0x008d:
            r13.L()
            r29 = r6
            r4 = r13
            goto L_0x0203
        L_0x0095:
            if (r5 == 0) goto L_0x009b
            androidx.compose.ui.d$a r3 = androidx.compose.ui.d.f18749a
            r8 = r3
            goto L_0x009c
        L_0x009b:
            r8 = r6
        L_0x009c:
            boolean r3 = U0.C4895p.J()
            if (r3 == 0) goto L_0x00a8
            r3 = -1
            java.lang.String r5 = "com.ingka.ikea.checkout.impl.confirmation.compose.OrderConfirmationCtaContent (OrderConfirmationCtaContent.kt:27)"
            U0.C4895p.S(r2, r9, r3, r5)
        L_0x00a8:
            r7 = 0
            r6 = 0
            androidx.compose.ui.d r2 = androidx.compose.foundation.layout.J.h(r8, r7, r12, r6)
            tK.u r16 = tK.C18029u.f147649a
            float r3 = r16.a()
            androidx.compose.ui.d r2 = androidx.compose.foundation.layout.D.k(r2, r3, r7, r4, r6)
            androidx.compose.foundation.layout.d r3 = androidx.compose.foundation.layout.C5073d.f18068a
            androidx.compose.foundation.layout.d$m r3 = r3.g()
            i1.c$a r4 = i1.C5437c.f24302a
            i1.c$b r4 = r4.k()
            r5 = 0
            E1.I r3 = androidx.compose.foundation.layout.C5080k.a(r3, r4, r13, r5)
            int r4 = U0.C4883j.a(r13, r5)
            U0.y r10 = r13.s()
            androidx.compose.ui.d r2 = androidx.compose.ui.c.e(r13, r2)
            G1.g$a r17 = G1.C4504g.f6515W
            nI.a r11 = r17.a()
            U0.f r19 = r13.m()
            if (r19 != 0) goto L_0x00e4
            U0.C4883j.c()
        L_0x00e4:
            r13.I()
            boolean r19 = r13.i()
            if (r19 == 0) goto L_0x00f1
            r13.p(r11)
            goto L_0x00f4
        L_0x00f1:
            r13.t()
        L_0x00f4:
            U0.m r11 = U0.F1.a(r13)
            nI.p r5 = r17.c()
            U0.F1.c(r11, r3, r5)
            nI.p r3 = r17.e()
            U0.F1.c(r11, r10, r3)
            nI.p r3 = r17.b()
            boolean r5 = r11.i()
            if (r5 != 0) goto L_0x011e
            java.lang.Object r5 = r11.D()
            java.lang.Integer r10 = java.lang.Integer.valueOf(r4)
            boolean r5 = kotlin.jvm.internal.C17542s.e(r5, r10)
            if (r5 != 0) goto L_0x012c
        L_0x011e:
            java.lang.Integer r5 = java.lang.Integer.valueOf(r4)
            r11.u(r5)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r11.w(r4, r3)
        L_0x012c:
            nI.p r3 = r17.d()
            U0.F1.c(r11, r2, r3)
            s0.h r2 = s0.C5862h.f28810a
            androidx.compose.ui.d$a r11 = androidx.compose.ui.d.f18749a
            androidx.compose.ui.d r3 = androidx.compose.foundation.layout.J.h(r11, r7, r12, r6)
            int r2 = rv.C11849b.f102370y2
            r5 = 0
            java.lang.String r2 = J1.j.b(r2, r13, r5)
            SC.N r10 = SC.N.Secondary
            int r4 = r9 << 24
            r17 = 1879048192(0x70000000, float:1.58456325E29)
            r4 = r4 & r17
            r4 = r4 | 3120(0xc30, float:4.372E-42)
            r17 = 500(0x1f4, float:7.0E-43)
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r24 = 0
            r25 = r4
            r4 = r19
            r5 = r10
            r10 = r6
            r6 = r20
            r7 = r21
            r29 = r8
            r8 = r22
            r30 = r9
            r9 = r23
            r10 = r24
            r31 = r11
            r11 = r34
            r12 = r13
            r32 = r13
            r13 = r25
            r14 = r17
            SC.L.b(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            if (r1 == 0) goto L_0x018d
            int r2 = r33.length()
            if (r2 != 0) goto L_0x0185
            goto L_0x018d
        L_0x0185:
            int r2 = Oo.b.f84686j9
        L_0x0187:
            r6 = r31
            r3 = 1
            r4 = 0
            r5 = 0
            goto L_0x0190
        L_0x018d:
            int r2 = rv.C11849b.f102185F2
            goto L_0x0187
        L_0x0190:
            androidx.compose.ui.d r7 = androidx.compose.foundation.layout.J.h(r6, r4, r3, r5)
            float r9 = r16.j()
            r12 = 13
            r13 = 0
            r8 = 0
            r10 = 0
            r11 = 0
            androidx.compose.ui.d r17 = androidx.compose.foundation.layout.D.m(r7, r8, r9, r10, r11, r12, r13)
            r4 = r32
            r5 = 0
            java.lang.String r16 = J1.j.b(r2, r4, r5)
            SC.N r19 = SC.N.Primary
            r2 = -370351164(0xffffffffe9ece3c4, float:-3.579776E25)
            r4.W(r2)
            r2 = r30
            r6 = r2 & 896(0x380, float:1.256E-42)
            r7 = 256(0x100, float:3.59E-43)
            if (r6 != r7) goto L_0x01bb
            r12 = r3
            goto L_0x01bc
        L_0x01bb:
            r12 = r5
        L_0x01bc:
            r2 = r2 & 14
            r6 = 4
            if (r2 != r6) goto L_0x01c2
            goto L_0x01c3
        L_0x01c2:
            r3 = r5
        L_0x01c3:
            r2 = r12 | r3
            java.lang.Object r3 = r4.D()
            if (r2 != 0) goto L_0x01d3
            U0.m$a r2 = U0.C4889m.f14007a
            java.lang.Object r2 = r2.a()
            if (r3 != r2) goto L_0x01db
        L_0x01d3:
            Zn.L r3 = new Zn.L
            r3.<init>(r0, r1)
            r4.u(r3)
        L_0x01db:
            r25 = r3
            nI.a r25 = (nI.C17631a) r25
            r4.P()
            r27 = 3072(0xc00, float:4.305E-42)
            r28 = 500(0x1f4, float:7.0E-43)
            r18 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r24 = 0
            r26 = r4
            SC.L.b(r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28)
            r4.x()
            boolean r2 = U0.C4895p.J()
            if (r2 == 0) goto L_0x0203
            U0.C4895p.R()
        L_0x0203:
            U0.Y0 r7 = r4.n()
            if (r7 == 0) goto L_0x021e
            Zn.M r8 = new Zn.M
            r0 = r8
            r1 = r33
            r2 = r34
            r3 = r35
            r4 = r29
            r5 = r38
            r6 = r39
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r7.a(r8)
        L_0x021e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: Zn.N.c(java.lang.String, nI.a, nI.l, androidx.compose.ui.d, U0.m, int, int):void");
    }

    /* access modifiers changed from: private */
    public static final C16807N d(C17642l lVar, String str) {
        lVar.invoke(str);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N e(String str, C17631a aVar, C17642l lVar, d dVar, int i10, int i11, C4889m mVar, int i12) {
        c(str, aVar, lVar, dVar, mVar, M0.a(i10 | 1), i11);
        return C16807N.f139792a;
    }
}
