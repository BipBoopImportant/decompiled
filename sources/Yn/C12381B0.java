package yn;

import An.o;
import E4.a;
import J1.j;
import Oo.b;
import SC.C13611m;
import SC.C13628q0;
import SC.L0;
import SC.R0;
import U0.C4889m;
import U0.C4895p;
import U0.M0;
import U0.Y0;
import XH.C16807N;
import androidx.compose.ui.d;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nI.C17631a;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a5\u0010\b\u001a\u00020\u00042\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u0006H\u0001¢\u0006\u0004\b\b\u0010\t\u001a'\u0010\n\u001a\u00020\u00042\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\b\b\u0002\u0010\u0007\u001a\u00020\u0006H\u0001¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"LE4/a;", "LAn/o;", "uiState", "Lkotlin/Function0;", "LXH/N;", "onBackClicked", "Landroidx/compose/ui/d;", "modifier", "e", "(LE4/a;LnI/a;Landroidx/compose/ui/d;LU0/m;II)V", "h", "(LE4/a;Landroidx/compose/ui/d;LU0/m;II)V", "plp-implementation_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* renamed from: yn.B0  reason: case insensitive filesystem */
public final class C12381B0 {
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v2, resolved type: nI.a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v5, resolved type: androidx.compose.ui.d$a} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x007b  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0082  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x0263  */
    /* JADX WARNING: Removed duplicated region for block: B:91:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void e(E4.a<An.o> r36, nI.C17631a<XH.C16807N> r37, androidx.compose.ui.d r38, U0.C4889m r39, int r40, int r41) {
        /*
            r1 = r36
            r2 = r37
            r4 = r40
            java.lang.String r0 = "uiState"
            kotlin.jvm.internal.C17542s.j(r1, r0)
            java.lang.String r0 = "onBackClicked"
            kotlin.jvm.internal.C17542s.j(r2, r0)
            r0 = 1380971057(0x524ff231, float:2.23280382E11)
            r3 = r39
            U0.m r3 = r3.k(r0)
            r5 = r41 & 1
            r15 = 4
            if (r5 == 0) goto L_0x0021
            r5 = r4 | 6
            goto L_0x003a
        L_0x0021:
            r5 = r4 & 6
            if (r5 != 0) goto L_0x0039
            r5 = r4 & 8
            if (r5 != 0) goto L_0x002e
            boolean r5 = r3.V(r1)
            goto L_0x0032
        L_0x002e:
            boolean r5 = r3.F(r1)
        L_0x0032:
            if (r5 == 0) goto L_0x0036
            r5 = r15
            goto L_0x0037
        L_0x0036:
            r5 = 2
        L_0x0037:
            r5 = r5 | r4
            goto L_0x003a
        L_0x0039:
            r5 = r4
        L_0x003a:
            r6 = r41 & 2
            if (r6 == 0) goto L_0x0041
            r5 = r5 | 48
            goto L_0x0051
        L_0x0041:
            r6 = r4 & 48
            if (r6 != 0) goto L_0x0051
            boolean r6 = r3.F(r2)
            if (r6 == 0) goto L_0x004e
            r6 = 32
            goto L_0x0050
        L_0x004e:
            r6 = 16
        L_0x0050:
            r5 = r5 | r6
        L_0x0051:
            r6 = r41 & 4
            if (r6 == 0) goto L_0x005b
            r5 = r5 | 384(0x180, float:5.38E-43)
        L_0x0057:
            r7 = r38
        L_0x0059:
            r14 = r5
            goto L_0x006e
        L_0x005b:
            r7 = r4 & 384(0x180, float:5.38E-43)
            if (r7 != 0) goto L_0x0057
            r7 = r38
            boolean r8 = r3.V(r7)
            if (r8 == 0) goto L_0x006a
            r8 = 256(0x100, float:3.59E-43)
            goto L_0x006c
        L_0x006a:
            r8 = 128(0x80, float:1.794E-43)
        L_0x006c:
            r5 = r5 | r8
            goto L_0x0059
        L_0x006e:
            r5 = r14 & 147(0x93, float:2.06E-43)
            r8 = 146(0x92, float:2.05E-43)
            if (r5 != r8) goto L_0x0082
            boolean r5 = r3.l()
            if (r5 != 0) goto L_0x007b
            goto L_0x0082
        L_0x007b:
            r3.L()
            r34 = r7
            goto L_0x025d
        L_0x0082:
            if (r6 == 0) goto L_0x0088
            androidx.compose.ui.d$a r5 = androidx.compose.ui.d.f18749a
            r13 = r5
            goto L_0x0089
        L_0x0088:
            r13 = r7
        L_0x0089:
            boolean r5 = U0.C4895p.J()
            if (r5 == 0) goto L_0x0095
            r5 = -1
            java.lang.String r6 = "com.ingka.ikea.browseandsearch.plp.impl.composables.Error (PlpError.kt:40)"
            U0.C4895p.S(r0, r14, r5, r6)
        L_0x0095:
            r0 = 0
            r5 = 0
            r12 = 1
            androidx.compose.ui.d r0 = androidx.compose.foundation.layout.J.f(r13, r0, r12, r5)
            i1.c$a r31 = i1.C5437c.f24302a
            i1.c r5 = r31.o()
            r10 = 0
            E1.I r5 = androidx.compose.foundation.layout.C5077h.h(r5, r10)
            int r6 = U0.C4883j.a(r3, r10)
            U0.y r7 = r3.s()
            androidx.compose.ui.d r0 = androidx.compose.ui.c.e(r3, r0)
            G1.g$a r8 = G1.C4504g.f6515W
            nI.a r9 = r8.a()
            U0.f r11 = r3.m()
            if (r11 != 0) goto L_0x00c2
            U0.C4883j.c()
        L_0x00c2:
            r3.I()
            boolean r11 = r3.i()
            if (r11 == 0) goto L_0x00cf
            r3.p(r9)
            goto L_0x00d2
        L_0x00cf:
            r3.t()
        L_0x00d2:
            U0.m r9 = U0.F1.a(r3)
            nI.p r11 = r8.c()
            U0.F1.c(r9, r5, r11)
            nI.p r5 = r8.e()
            U0.F1.c(r9, r7, r5)
            nI.p r5 = r8.b()
            boolean r7 = r9.i()
            if (r7 != 0) goto L_0x00fc
            java.lang.Object r7 = r9.D()
            java.lang.Integer r11 = java.lang.Integer.valueOf(r6)
            boolean r7 = kotlin.jvm.internal.C17542s.e(r7, r11)
            if (r7 != 0) goto L_0x010a
        L_0x00fc:
            java.lang.Integer r7 = java.lang.Integer.valueOf(r6)
            r9.u(r7)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r9.w(r6, r5)
        L_0x010a:
            nI.p r5 = r8.d()
            U0.F1.c(r9, r0, r5)
            androidx.compose.foundation.layout.j r0 = androidx.compose.foundation.layout.C5079j.f18125a
            s0.T$a r5 = s0.C5848T.f28733a
            r6 = 6
            s0.T r5 = s0.a0.e(r5, r3, r6)
            s0.E r5 = s0.C5850V.f(r5, r3, r10)
            float r5 = r5.d()
            int r7 = r14 << 3
            r7 = r7 & 896(0x380, float:1.256E-42)
            r7 = r7 | r6
            yn.C1.D(r0, r5, r2, r3, r7)
            androidx.compose.foundation.layout.d r5 = androidx.compose.foundation.layout.C5073d.f18068a
            r7 = 24
            float r7 = (float) r7
            float r7 = c2.h.B(r7)
            androidx.compose.foundation.layout.d$f r5 = r5.n(r7)
            androidx.compose.ui.d$a r11 = androidx.compose.ui.d.f18749a
            i1.c r7 = r31.e()
            androidx.compose.ui.d r0 = r0.a(r11, r7)
            i1.c$b r7 = r31.k()
            E1.I r5 = androidx.compose.foundation.layout.C5080k.a(r5, r7, r3, r6)
            int r6 = U0.C4883j.a(r3, r10)
            U0.y r7 = r3.s()
            androidx.compose.ui.d r0 = androidx.compose.ui.c.e(r3, r0)
            nI.a r9 = r8.a()
            U0.f r16 = r3.m()
            if (r16 != 0) goto L_0x0162
            U0.C4883j.c()
        L_0x0162:
            r3.I()
            boolean r16 = r3.i()
            if (r16 == 0) goto L_0x016f
            r3.p(r9)
            goto L_0x0172
        L_0x016f:
            r3.t()
        L_0x0172:
            U0.m r9 = U0.F1.a(r3)
            nI.p r12 = r8.c()
            U0.F1.c(r9, r5, r12)
            nI.p r5 = r8.e()
            U0.F1.c(r9, r7, r5)
            nI.p r5 = r8.b()
            boolean r7 = r9.i()
            if (r7 != 0) goto L_0x019c
            java.lang.Object r7 = r9.D()
            java.lang.Integer r12 = java.lang.Integer.valueOf(r6)
            boolean r7 = kotlin.jvm.internal.C17542s.e(r7, r12)
            if (r7 != 0) goto L_0x01aa
        L_0x019c:
            java.lang.Integer r7 = java.lang.Integer.valueOf(r6)
            r9.u(r7)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r9.w(r6, r5)
        L_0x01aa:
            nI.p r5 = r8.d()
            U0.F1.c(r9, r0, r5)
            s0.h r0 = s0.C5862h.f28810a
            int r5 = Oo.b.f84812v3
            java.lang.String r5 = J1.j.b(r5, r3, r10)
            TC.b$b$b r6 = TC.C13679b.C2857b.C2858b.f116684a
            androidx.compose.ui.d r7 = TC.e.i(r11)
            r29 = 0
            r30 = 262136(0x3fff8, float:3.67331E-40)
            r8 = 0
            r16 = 0
            r12 = r10
            r32 = r11
            r10 = r16
            r16 = 0
            r33 = 1
            r12 = r16
            r34 = r13
            r13 = r16
            r35 = r14
            r14 = r16
            r16 = 0
            r15 = r16
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r22 = 0
            r23 = 0
            r24 = 0
            r25 = 0
            r26 = 0
            r28 = 48
            r27 = r3
            SC.C13607l.j(r5, r6, r7, r8, r10, r12, r13, r14, r15, r17, r18, r19, r20, r22, r23, r24, r25, r26, r27, r28, r29, r30)
            int r5 = uK.C18146a.f148569o
            int r6 = Oo.b.f84823w3
            r7 = 0
            java.lang.String r6 = J1.j.b(r6, r3, r7)
            i1.c$b r8 = r31.g()
            r9 = r32
            androidx.compose.ui.d r0 = r0.b(r9, r8)
            r8 = 807650919(0x3023c667, float:5.9581E-10)
            r3.W(r8)
            r8 = r35 & 14
            r9 = 4
            if (r8 == r9) goto L_0x0223
            r8 = r35 & 8
            if (r8 == 0) goto L_0x0221
            boolean r8 = r3.F(r1)
            if (r8 == 0) goto L_0x0221
            goto L_0x0223
        L_0x0221:
            r12 = r7
            goto L_0x0225
        L_0x0223:
            r12 = r33
        L_0x0225:
            java.lang.Object r7 = r3.D()
            if (r12 != 0) goto L_0x0233
            U0.m$a r8 = U0.C4889m.f14007a
            java.lang.Object r8 = r8.a()
            if (r7 != r8) goto L_0x023b
        L_0x0233:
            yn.x0 r7 = new yn.x0
            r7.<init>(r1)
            r3.u(r7)
        L_0x023b:
            r13 = r7
            nI.a r13 = (nI.C17631a) r13
            r3.P()
            r15 = 0
            r16 = 248(0xf8, float:3.48E-43)
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r7 = r0
            r14 = r3
            SC.F0.b(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            r3.x()
            r3.x()
            boolean r0 = U0.C4895p.J()
            if (r0 == 0) goto L_0x025d
            U0.C4895p.R()
        L_0x025d:
            U0.Y0 r6 = r3.n()
            if (r6 == 0) goto L_0x0276
            yn.y0 r7 = new yn.y0
            r0 = r7
            r1 = r36
            r2 = r37
            r3 = r34
            r4 = r40
            r5 = r41
            r0.<init>(r1, r2, r3, r4, r5)
            r6.a(r7)
        L_0x0276:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: yn.C12381B0.e(E4.a, nI.a, androidx.compose.ui.d, U0.m, int, int):void");
    }

    /* access modifiers changed from: private */
    public static final C16807N f(a aVar) {
        aVar.l();
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N g(a aVar, C17631a aVar2, d dVar, int i10, int i11, C4889m mVar, int i12) {
        e(aVar, aVar2, dVar, mVar, M0.a(i10 | 1), i11);
        return C16807N.f139792a;
    }

    public static final void h(a<o> aVar, d dVar, C4889m mVar, int i10, int i11) {
        int i12;
        C17542s.j(aVar, "uiState");
        C4889m k10 = mVar.k(-1118472969);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 6) == 0) {
            i12 = ((i10 & 8) == 0 ? k10.V(aVar) : k10.F(aVar) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        int i13 = i11 & 2;
        if (i13 != 0) {
            i12 |= 48;
        } else if ((i10 & 48) == 0) {
            i12 |= k10.V(dVar) ? 32 : 16;
        }
        if ((i12 & 19) != 18 || !k10.l()) {
            if (i13 != 0) {
                dVar = d.f18749a;
            }
            if (C4895p.J()) {
                C4895p.S(-1118472969, i12, -1, "com.ingka.ikea.browseandsearch.plp.impl.composables.PaginationError (PlpError.kt:71)");
            }
            boolean z10 = false;
            String b10 = j.b(b.f84812v3, k10, 0);
            String b11 = j.b(b.f84498S0, k10, 0);
            k10.W(-172331189);
            if ((i12 & 14) == 4 || ((i12 & 8) != 0 && k10.F(aVar))) {
                z10 = true;
            }
            Object D10 = k10.D();
            if (z10 || D10 == C4889m.f14007a.a()) {
                D10 = new C12494z0(aVar);
                k10.u(D10);
            }
            k10.P();
            R0.f(b10, new SC.M0(new L0(b11, (C17631a) D10), (L0) null, 2, (DefaultConstructorMarker) null), C13611m.WARNING, (C13628q0) null, dVar, (String) null, k10, (SC.M0.f115836c << 3) | 3456 | ((i12 << 9) & 57344), 32);
            if (C4895p.J()) {
                C4895p.R();
            }
        } else {
            k10.L();
        }
        Y0 n10 = k10.n();
        if (n10 != null) {
            n10.a(new C12379A0(aVar, dVar, i10, i11));
        }
    }

    /* access modifiers changed from: private */
    public static final C16807N i(a aVar) {
        aVar.l();
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N j(a aVar, d dVar, int i10, int i11, C4889m mVar, int i12) {
        h(aVar, dVar, mVar, M0.a(i10 | 1), i11);
        return C16807N.f139792a;
    }
}
