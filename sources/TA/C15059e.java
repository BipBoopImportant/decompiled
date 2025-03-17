package tA;

import IC.C13023e;
import U0.C4889m;
import U0.M0;
import XH.C16807N;
import androidx.compose.ui.d;
import kotlin.Metadata;
import nI.C17631a;
import nI.C17642l;
import vA.C15124a;
import vA.C15125b;
import vA.C15126c;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a+\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0001¢\u0006\u0004\b\u0006\u0010\u0007\u001aM\u0010\u0013\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\b2\b\b\u0001\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00040\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\u00102\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\bH\u0001¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"LvA/c;", "uiState", "Lkotlin/Function1;", "LvA/a;", "LXH/N;", "onEvent", "g", "(LvA/c;LnI/l;LU0/m;I)V", "LIC/e;", "text", "", "icon", "", "selected", "Lkotlin/Function0;", "onClick", "Landroidx/compose/ui/d;", "modifier", "description", "e", "(LIC/e;IZLnI/a;Landroidx/compose/ui/d;LIC/e;LU0/m;II)V", "settings-implementation_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* renamed from: tA.e  reason: case insensitive filesystem */
public final class C15059e {
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00a9  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x00d2  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x00db  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x017c  */
    /* JADX WARNING: Removed duplicated region for block: B:93:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void e(IC.C13023e r24, int r25, boolean r26, nI.C17631a<XH.C16807N> r27, androidx.compose.ui.d r28, IC.C13023e r29, U0.C4889m r30, int r31, int r32) {
        /*
            r1 = r24
            r3 = r26
            r2 = r27
            r0 = r29
            r7 = r31
            java.lang.String r4 = "text"
            kotlin.jvm.internal.C17542s.j(r1, r4)
            java.lang.String r4 = "onClick"
            kotlin.jvm.internal.C17542s.j(r2, r4)
            r4 = 1365758148(0x5167d0c4, float:6.2227497E10)
            r5 = r30
            U0.m r5 = r5.k(r4)
            r6 = r32 & 1
            if (r6 == 0) goto L_0x0024
            r6 = r7 | 6
            goto L_0x003d
        L_0x0024:
            r6 = r7 & 6
            if (r6 != 0) goto L_0x003c
            r6 = r7 & 8
            if (r6 != 0) goto L_0x0031
            boolean r6 = r5.V(r1)
            goto L_0x0035
        L_0x0031:
            boolean r6 = r5.F(r1)
        L_0x0035:
            if (r6 == 0) goto L_0x0039
            r6 = 4
            goto L_0x003a
        L_0x0039:
            r6 = 2
        L_0x003a:
            r6 = r6 | r7
            goto L_0x003d
        L_0x003c:
            r6 = r7
        L_0x003d:
            r8 = r32 & 2
            if (r8 == 0) goto L_0x0046
            r6 = r6 | 48
            r15 = r25
            goto L_0x0058
        L_0x0046:
            r8 = r7 & 48
            r15 = r25
            if (r8 != 0) goto L_0x0058
            boolean r8 = r5.d(r15)
            if (r8 == 0) goto L_0x0055
            r8 = 32
            goto L_0x0057
        L_0x0055:
            r8 = 16
        L_0x0057:
            r6 = r6 | r8
        L_0x0058:
            r8 = r32 & 4
            if (r8 == 0) goto L_0x005f
            r6 = r6 | 384(0x180, float:5.38E-43)
            goto L_0x006f
        L_0x005f:
            r8 = r7 & 384(0x180, float:5.38E-43)
            if (r8 != 0) goto L_0x006f
            boolean r8 = r5.b(r3)
            if (r8 == 0) goto L_0x006c
            r8 = 256(0x100, float:3.59E-43)
            goto L_0x006e
        L_0x006c:
            r8 = 128(0x80, float:1.794E-43)
        L_0x006e:
            r6 = r6 | r8
        L_0x006f:
            r8 = r32 & 8
            if (r8 == 0) goto L_0x0076
            r6 = r6 | 3072(0xc00, float:4.305E-42)
            goto L_0x0086
        L_0x0076:
            r8 = r7 & 3072(0xc00, float:4.305E-42)
            if (r8 != 0) goto L_0x0086
            boolean r8 = r5.F(r2)
            if (r8 == 0) goto L_0x0083
            r8 = 2048(0x800, float:2.87E-42)
            goto L_0x0085
        L_0x0083:
            r8 = 1024(0x400, float:1.435E-42)
        L_0x0085:
            r6 = r6 | r8
        L_0x0086:
            r8 = r32 & 16
            if (r8 == 0) goto L_0x008f
            r6 = r6 | 24576(0x6000, float:3.4438E-41)
        L_0x008c:
            r9 = r28
            goto L_0x00a1
        L_0x008f:
            r9 = r7 & 24576(0x6000, float:3.4438E-41)
            if (r9 != 0) goto L_0x008c
            r9 = r28
            boolean r10 = r5.V(r9)
            if (r10 == 0) goto L_0x009e
            r10 = 16384(0x4000, float:2.2959E-41)
            goto L_0x00a0
        L_0x009e:
            r10 = 8192(0x2000, float:1.14794E-41)
        L_0x00a0:
            r6 = r6 | r10
        L_0x00a1:
            r10 = r32 & 32
            r11 = 196608(0x30000, float:2.75506E-40)
            if (r10 == 0) goto L_0x00a9
        L_0x00a7:
            r6 = r6 | r11
            goto L_0x00c2
        L_0x00a9:
            r11 = r11 & r7
            if (r11 != 0) goto L_0x00c2
            r11 = 262144(0x40000, float:3.67342E-40)
            r11 = r11 & r7
            if (r11 != 0) goto L_0x00b6
            boolean r11 = r5.V(r0)
            goto L_0x00ba
        L_0x00b6:
            boolean r11 = r5.F(r0)
        L_0x00ba:
            if (r11 == 0) goto L_0x00bf
            r11 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00a7
        L_0x00bf:
            r11 = 65536(0x10000, float:9.18355E-41)
            goto L_0x00a7
        L_0x00c2:
            r11 = 74899(0x12493, float:1.04956E-40)
            r11 = r11 & r6
            r12 = 74898(0x12492, float:1.04954E-40)
            if (r11 != r12) goto L_0x00db
            boolean r11 = r5.l()
            if (r11 != 0) goto L_0x00d2
            goto L_0x00db
        L_0x00d2:
            r5.L()
            r6 = r0
            r23 = r5
            r5 = r9
            goto L_0x0176
        L_0x00db:
            if (r8 == 0) goto L_0x00e1
            androidx.compose.ui.d$a r8 = androidx.compose.ui.d.f18749a
            r14 = r8
            goto L_0x00e2
        L_0x00e1:
            r14 = r9
        L_0x00e2:
            r13 = 0
            if (r10 == 0) goto L_0x00e6
            r0 = r13
        L_0x00e6:
            boolean r8 = U0.C4895p.J()
            if (r8 == 0) goto L_0x00f2
            r8 = -1
            java.lang.String r9 = "com.ingka.ikea.settings.impl.theme.compose.MenuListItem (ThemeScreen.kt:65)"
            U0.C4895p.S(r4, r6, r8, r9)
        L_0x00f2:
            int r4 = IC.C13023e.f110931a
            r8 = r6 & 14
            r8 = r8 | r4
            java.lang.String r17 = r1.a(r5, r8)
            r8 = 9262987(0x8d578b, float:1.298021E-38)
            r5.W(r8)
            if (r0 != 0) goto L_0x0106
            r21 = r13
            goto L_0x0111
        L_0x0106:
            int r8 = r6 >> 15
            r8 = r8 & 14
            r4 = r4 | r8
            java.lang.String r4 = r0.a(r5, r4)
            r21 = r4
        L_0x0111:
            r5.P()
            SC.c1$a r9 = new SC.c1$a
            r8 = r9
            r4 = 12
            r16 = 0
            r12 = 0
            r18 = 0
            r10 = r25
            r11 = r17
            r13 = r18
            r23 = r14
            r14 = r4
            r15 = r16
            r9.<init>(r10, r11, r12, r13, r14, r15)
            SC.b1$h r4 = new SC.b1$h
            r9 = r4
            r4.<init>(r3)
            SC.g1 r12 = SC.C13589g1.Large
            r4 = 0
            r10 = 1
            r15 = r23
            r11 = 0
            androidx.compose.ui.d r4 = androidx.compose.foundation.layout.J.h(r15, r4, r10, r11)
            r10 = r6
            r6 = r4
            int r4 = r10 >> 6
            r4 = r4 & 112(0x70, float:1.57E-43)
            r10 = 100663296(0x6000000, float:2.4074124E-35)
            r4 = r4 | r10
            int r10 = SC.C13573c1.a.f116164f
            int r10 = r10 << 12
            r4 = r4 | r10
            int r10 = SC.C13569b1.h.f116155c
            int r10 = r10 << 15
            r18 = r4 | r10
            r19 = 6
            r20 = 6848(0x1ac0, float:9.596E-42)
            r10 = 0
            r11 = 0
            r13 = 0
            r14 = 1
            r4 = 0
            r22 = r15
            r15 = r4
            r4 = r17
            r23 = r5
            r5 = r27
            r7 = r21
            r17 = r23
            SC.C13585f1.c(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            boolean r4 = U0.C4895p.J()
            if (r4 == 0) goto L_0x0173
            U0.C4895p.R()
        L_0x0173:
            r6 = r0
            r5 = r22
        L_0x0176:
            U0.Y0 r9 = r23.n()
            if (r9 == 0) goto L_0x0191
            tA.d r10 = new tA.d
            r0 = r10
            r1 = r24
            r2 = r25
            r3 = r26
            r4 = r27
            r7 = r31
            r8 = r32
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            r9.a(r10)
        L_0x0191:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: tA.C15059e.e(IC.e, int, boolean, nI.a, androidx.compose.ui.d, IC.e, U0.m, int, int):void");
    }

    /* access modifiers changed from: private */
    public static final C16807N f(C13023e eVar, int i10, boolean z10, C17631a aVar, d dVar, C13023e eVar2, int i11, int i12, C4889m mVar, int i13) {
        e(eVar, i10, z10, aVar, dVar, eVar2, mVar, M0.a(i11 | 1), i12);
        return C16807N.f139792a;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v5, resolved type: nI.a} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void g(vA.C15126c r20, nI.C17642l<? super vA.C15124a, XH.C16807N> r21, U0.C4889m r22, int r23) {
        /*
            r0 = r20
            r1 = r21
            r2 = r23
            java.lang.String r3 = "uiState"
            kotlin.jvm.internal.C17542s.j(r0, r3)
            java.lang.String r3 = "onEvent"
            kotlin.jvm.internal.C17542s.j(r1, r3)
            r3 = 1893389933(0x70dad66d, float:5.4181566E29)
            r4 = r22
            U0.m r15 = r4.k(r3)
            r4 = r2 & 6
            if (r4 != 0) goto L_0x0031
            r4 = r2 & 8
            if (r4 != 0) goto L_0x0026
            boolean r4 = r15.V(r0)
            goto L_0x002a
        L_0x0026:
            boolean r4 = r15.F(r0)
        L_0x002a:
            if (r4 == 0) goto L_0x002e
            r4 = 4
            goto L_0x002f
        L_0x002e:
            r4 = 2
        L_0x002f:
            r4 = r4 | r2
            goto L_0x0032
        L_0x0031:
            r4 = r2
        L_0x0032:
            r5 = r2 & 48
            r14 = 32
            if (r5 != 0) goto L_0x0043
            boolean r5 = r15.F(r1)
            if (r5 == 0) goto L_0x0040
            r5 = r14
            goto L_0x0042
        L_0x0040:
            r5 = 16
        L_0x0042:
            r4 = r4 | r5
        L_0x0043:
            r5 = r4 & 19
            r6 = 18
            if (r5 != r6) goto L_0x0056
            boolean r5 = r15.l()
            if (r5 != 0) goto L_0x0050
            goto L_0x0056
        L_0x0050:
            r15.L()
            r0 = r15
            goto L_0x01d1
        L_0x0056:
            boolean r5 = U0.C4895p.J()
            if (r5 == 0) goto L_0x0062
            r5 = -1
            java.lang.String r6 = "com.ingka.ikea.settings.impl.theme.compose.ThemeScreen (ThemeScreen.kt:33)"
            U0.C4895p.S(r3, r4, r5, r6)
        L_0x0062:
            androidx.compose.ui.d$a r3 = androidx.compose.ui.d.f18749a
            r5 = 0
            r6 = 0
            r13 = 1
            androidx.compose.ui.d r3 = androidx.compose.foundation.layout.J.f(r3, r5, r13, r6)
            androidx.compose.ui.d r3 = s0.C5852X.e(r3)
            androidx.compose.foundation.layout.d r5 = androidx.compose.foundation.layout.C5073d.f18068a
            androidx.compose.foundation.layout.d$m r5 = r5.g()
            i1.c$a r6 = i1.C5437c.f24302a
            i1.c$b r6 = r6.k()
            r12 = 0
            E1.I r5 = androidx.compose.foundation.layout.C5080k.a(r5, r6, r15, r12)
            int r6 = U0.C4883j.a(r15, r12)
            U0.y r7 = r15.s()
            androidx.compose.ui.d r3 = androidx.compose.ui.c.e(r15, r3)
            G1.g$a r8 = G1.C4504g.f6515W
            nI.a r9 = r8.a()
            U0.f r10 = r15.m()
            if (r10 != 0) goto L_0x009b
            U0.C4883j.c()
        L_0x009b:
            r15.I()
            boolean r10 = r15.i()
            if (r10 == 0) goto L_0x00a8
            r15.p(r9)
            goto L_0x00ab
        L_0x00a8:
            r15.t()
        L_0x00ab:
            U0.m r9 = U0.F1.a(r15)
            nI.p r10 = r8.c()
            U0.F1.c(r9, r5, r10)
            nI.p r5 = r8.e()
            U0.F1.c(r9, r7, r5)
            nI.p r5 = r8.b()
            boolean r7 = r9.i()
            if (r7 != 0) goto L_0x00d5
            java.lang.Object r7 = r9.D()
            java.lang.Integer r10 = java.lang.Integer.valueOf(r6)
            boolean r7 = kotlin.jvm.internal.C17542s.e(r7, r10)
            if (r7 != 0) goto L_0x00e3
        L_0x00d5:
            java.lang.Integer r7 = java.lang.Integer.valueOf(r6)
            r9.u(r7)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r9.w(r6, r5)
        L_0x00e3:
            nI.p r5 = r8.d()
            U0.F1.c(r9, r3, r5)
            s0.h r3 = s0.C5862h.f28810a
            IC.e r3 = r20.c()
            int r5 = IC.C13023e.f110931a
            java.lang.String r7 = r3.a(r15, r5)
            ol.v r3 = ol.v.BACK
            r5 = -1195392505(0xffffffffb8bfc207, float:-9.14373E-5)
            r15.W(r5)
            r11 = r4 & 112(0x70, float:1.57E-43)
            if (r11 != r14) goto L_0x0104
            r4 = r13
            goto L_0x0105
        L_0x0104:
            r4 = r12
        L_0x0105:
            java.lang.Object r5 = r15.D()
            if (r4 != 0) goto L_0x0113
            U0.m$a r4 = U0.C4889m.f14007a
            java.lang.Object r4 = r4.a()
            if (r5 != r4) goto L_0x011b
        L_0x0113:
            tA.a r5 = new tA.a
            r5.<init>(r1)
            r15.u(r5)
        L_0x011b:
            nI.a r5 = (nI.C17631a) r5
            r15.P()
            r16 = 6
            r17 = 500(0x1f4, float:7.0E-43)
            r6 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r18 = 0
            r19 = 0
            r4 = r3
            r3 = r11
            r11 = r18
            r18 = r12
            r12 = r19
            r19 = r13
            r13 = r15
            r14 = r16
            r0 = r15
            r15 = r17
            ol.p.c(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            r4 = -1195389934(0xffffffffb8bfcc12, float:-9.145601E-5)
            r0.W(r4)
            KJ.c r4 = r20.a()
            java.util.Iterator r13 = r4.iterator()
        L_0x014d:
            boolean r4 = r13.hasNext()
            if (r4 == 0) goto L_0x01c2
            java.lang.Object r4 = r13.next()
            vA.b r4 = (vA.C15125b) r4
            IC.e r5 = r4.n()
            IC.e r9 = r4.b()
            int r6 = r4.m()
            vA.b r7 = r20.d()
            if (r4 != r7) goto L_0x016e
            r7 = r19
            goto L_0x0170
        L_0x016e:
            r7 = r18
        L_0x0170:
            r8 = 979095117(0x3a5bce4d, float:8.384928E-4)
            r0.W(r8)
            r14 = 32
            if (r3 != r14) goto L_0x017d
            r8 = r19
            goto L_0x017f
        L_0x017d:
            r8 = r18
        L_0x017f:
            boolean r10 = r0.V(r4)
            r8 = r8 | r10
            java.lang.Object r10 = r0.D()
            if (r8 != 0) goto L_0x0192
            U0.m$a r8 = U0.C4889m.f14007a
            java.lang.Object r8 = r8.a()
            if (r10 != r8) goto L_0x019a
        L_0x0192:
            tA.b r10 = new tA.b
            r10.<init>(r1, r4)
            r0.u(r10)
        L_0x019a:
            r8 = r10
            nI.a r8 = (nI.C17631a) r8
            r0.P()
            int r4 = IC.C13023e.f110931a
            int r10 = r4 << 15
            r11 = r4 | r10
            r12 = 16
            r10 = 0
            r4 = r5
            r5 = r6
            r6 = r7
            r7 = r8
            r8 = r10
            r10 = r0
            e(r4, r5, r6, r7, r8, r9, r10, r11, r12)
            androidx.compose.ui.d$a r4 = androidx.compose.ui.d.f18749a
            androidx.compose.ui.d r4 = TC.e.i(r4)
            r9 = 0
            r10 = 6
            r5 = 0
            r6 = 0
            r8 = r0
            SC.C13643u0.c(r4, r5, r6, r8, r9, r10)
            goto L_0x014d
        L_0x01c2:
            r0.P()
            r0.x()
            boolean r3 = U0.C4895p.J()
            if (r3 == 0) goto L_0x01d1
            U0.C4895p.R()
        L_0x01d1:
            U0.Y0 r0 = r0.n()
            if (r0 == 0) goto L_0x01e1
            tA.c r3 = new tA.c
            r4 = r20
            r3.<init>(r4, r1, r2)
            r0.a(r3)
        L_0x01e1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: tA.C15059e.g(vA.c, nI.l, U0.m, int):void");
    }

    /* access modifiers changed from: private */
    public static final C16807N h(C17642l lVar) {
        lVar.invoke(C15124a.C3256a.f131402a);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N i(C17642l lVar, C15125b bVar) {
        lVar.invoke(new C15124a.b(bVar));
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N j(C15126c cVar, C17642l lVar, int i10, C4889m mVar, int i11) {
        g(cVar, lVar, mVar, M0.a(i10 | 1));
        return C16807N.f139792a;
    }
}
